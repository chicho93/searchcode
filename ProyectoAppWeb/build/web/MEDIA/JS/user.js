var accessToken = '938334041.5963c84.5bfe53b553e54ccbbc54dac242077f04';
var limit = 20;
var setSize = "small";

var instagram = function() {
	return {
		init: function() {
			instagram.getUser();
		},
		getUser: function() {
                        var username=$('#user').val();
			var getUserURL = 'https://api.instagram.com/v1/users/search?q='+ username +'&access_token='+ accessToken +'';
			$.ajax({
				type: "GET",
				dataType: "jsonp",
				cache: false,
				url: getUserURL,
				success: function(data) {
					var getUserID = data.data[0].id;
					instagram.loadImages(getUserID);
				}	
			});
		},
		loadImages: function(userID) {
			var getImagesURL = 'https://api.instagram.com/v1/users/'+ userID +'/media/recent/?access_token='+ accessToken +'';
			$.ajax({
				type: "GET",
				dataType: "jsonp",
				cache: false,
				url: getImagesURL,
				success: function(data) {
					for(var i=0; i<limit; i+=1) {
						if(setSize == "small") {
							var size = data.data[i].images.thumbnail.url;
						} else if(setSize == "medium") {
							var size = data.data[i].images.low_resolution.url;
						} else {
							var size = data.data[i].images.standard_resolution.url;	
						}
                                                $("#instagram").append("<table");
						$("#instagram").append("<tr><td><li><a target='_blank' href='" + data.data[i].link +"'><img src='" + size +"'></img></a></li></td></tr>");
                                                $("#instagram").append("<tr><td> TAGS:" + data.data[i].tags + "</td></tr>");
                                                $("#instagram").append("<tr><td> USERNAME:" + data.data[i].user.username + "</td></tr>");
                                                $("#instagram").append("<tr><td> TEXTO:" + data.data[i].caption.text + "</td></tr>");
                                                $("#instagram").append("</table>");
                                                
					}
				}
			});
		}
	}
}();

$(document).ready(function() {
    instagram.init();
});