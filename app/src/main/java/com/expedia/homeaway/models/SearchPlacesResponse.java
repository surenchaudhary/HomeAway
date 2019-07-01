package com.expedia.homeaway.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Surendra Singh on 6/30/2019.
 */
public class SearchPlacesResponse implements Parcelable {

    /**
     * meta : {"code":200,"requestId":"5ad514b7db04f515c2b59594"}
     * response : {"venues":[{"id":"52d456c811d24128cdd7bc8b","name":"Storyville Coffee Company","contact":{"phone":"2067805777","formattedPhone":"(206) 780-5777","twitter":"storyville"},"location":{"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":43,"usersCount":1432,"checkinsCount":2443},"url":"https://www.facebook.com/StoryvilleCoffee","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"556e5ca0bd6a82902e297f0f"}],"hasPerk":false},{"id":"57e95a82498e0a3995a43e90","name":"Anchorhead Coffee Co","contact":{},"location":{"address":"1600 7th Ave Ste 105","crossStreet":"Olive Way","lat":47.61340942776967,"lng":-122.33469499761385,"labeledLatLngs":[{"label":"display","lat":47.61340942776967,"lng":-122.33469499761385}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1600 7th Ave Ste 105 (Olive Way)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":30,"usersCount":779,"checkinsCount":2132},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":2,"summary":"2 people are here","groups":[{"type":"others","name":"Other people here","count":2,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"49d3e558f964a520225c1fe3","name":"Cherry Street Coffee House","contact":{"phone":"2066219372","formattedPhone":"(206) 621-9372","twitter":"cherrystreet"},"location":{"address":"103 Cherry St","crossStreet":"at 1st Ave","lat":47.6027673689831,"lng":-122.33415096584942,"labeledLatLngs":[{"label":"display","lat":47.6027673689831,"lng":-122.33415096584942}],"postalCode":"98104","cc":"US","neighborhood":"Seattle Central Business District","city":"Seattle","state":"WA","country":"United States","formattedAddress":["103 Cherry St (at 1st Ave)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":38,"usersCount":1953,"checkinsCount":5412},"url":"http://cherryst.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/49d3e558f964a520225c1fe3/menu","mobileUrl":"https://foursquare.com/v/49d3e558f964a520225c1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"52251f9511d2b2f238901956","name":"Storyville Coffee Company","contact":{"phone":"2067805777","formattedPhone":"(206) 780-5777","twitter":"storyville"},"location":{"address":"94 Pike St #34","crossStreet":"1st Ave (Pike Place Market)","lat":47.608968412285684,"lng":-122.34069716145795,"labeledLatLngs":[{"label":"display","lat":47.608968412285684,"lng":-122.34069716145795}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["94 Pike St #34 (1st Ave (Pike Place Market))","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":121,"usersCount":3512,"checkinsCount":5789},"url":"https://www.facebook.com/StoryvilleCoffee","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/storyville-coffee-company/52251f9511d2b2f238901956/menu","mobileUrl":"https://foursquare.com/v/52251f9511d2b2f238901956/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":2,"summary":"2 people are here","groups":[{"type":"others","name":"Other people here","count":2,"items":[]}]},"referralId":"v-1523913911","venueChains":[{"id":"556e5ca0bd6a82902e297f0f"}],"hasPerk":false},{"id":"545803de498e7e758ac5605e","name":"Elm Coffee Roasters","contact":{},"location":{"address":"240 2nd Avenue Ext S Ste 103","lat":47.600152370806754,"lng":-122.33094380272051,"labeledLatLngs":[{"label":"display","lat":47.600152370806754,"lng":-122.33094380272051}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["240 2nd Avenue Ext S Ste 103","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":68,"usersCount":1484,"checkinsCount":4063},"url":"http://elmcoffeeroasters.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"55fc6351498e081c6ae9a9c1","name":"Slate Coffee","contact":{"twitter":"slatecoffee"},"location":{"address":"602 2nd Ave","crossStreet":"James St","lat":47.60226958101576,"lng":-122.33254930945151,"labeledLatLngs":[{"label":"display","lat":47.60226958101576,"lng":-122.33254930945151}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["602 2nd Ave (James St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":23,"usersCount":556,"checkinsCount":1296},"url":"http://slatecoffee.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"569d5c6c498e4ff52aa8b724","name":"Olympia Coffee Roasters","contact":{},"location":{"address":"2021 7th Ave","lat":47.615100389907994,"lng":-122.3383441043283,"labeledLatLngs":[{"label":"display","lat":47.615100389907994,"lng":-122.3383441043283}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2021 7th Ave","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":4,"usersCount":150,"checkinsCount":1120},"url":"http://amazon.cafebonappetit.com/cafe/olympia-coffee-roasters/","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a609aa8f964a520ebc01fe3","name":"Pegasus Coffee","contact":{"phone":"2066823113","formattedPhone":"(206) 682-3113"},"location":{"address":"711 3rd Ave","crossStreet":"at Cherry St","lat":47.603689,"lng":-122.332502,"labeledLatLngs":[{"label":"display","lat":47.603689,"lng":-122.332502}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["711 3rd Ave (at Cherry St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":15,"usersCount":485,"checkinsCount":2910},"url":"http://pegasuscoffeehouse.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a53845cf964a5205eb21fe3","name":"Tully's Coffee","contact":{"phone":"2063820533","formattedPhone":"(206) 382-0533"},"location":{"address":"821 2nd Ave Ste 402","crossStreet":"btw Marion & Columbia","lat":47.604219783711095,"lng":-122.3346137579619,"labeledLatLngs":[{"label":"display","lat":47.604219783711095,"lng":-122.3346137579619}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["821 2nd Ave Ste 402 (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":7,"usersCount":495,"checkinsCount":2991},"url":"http://tullyscoffeeshops.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"1088","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"5569f401a7c8896abe7c73c8"}],"hasPerk":false},{"id":"4a848900f964a520e3fc1fe3","name":"Cherry Street Coffee House","contact":{"phone":"2064429372","formattedPhone":"(206) 442-9372","twitter":"cherrystreet"},"location":{"address":"808 3rd Ave","crossStreet":"btw Marion & Columbia","lat":47.60451120781553,"lng":-122.3330104220454,"labeledLatLngs":[{"label":"display","lat":47.60451120781553,"lng":-122.3330104220454}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["808 3rd Ave (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":13,"usersCount":673,"checkinsCount":2296},"url":"http://www.cherrybaba.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/4a848900f964a520e3fc1fe3/menu","mobileUrl":"https://foursquare.com/v/4a848900f964a520e3fc1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"475ebc58f964a520d94c1fe3","name":"Kaladi Brothers Coffee","contact":{"phone":"2063881700","formattedPhone":"(206) 388-1700","twitter":"kbcseattle"},"location":{"address":"517 E Pike St","crossStreet":"at Belmont Ave.","lat":47.61415161351147,"lng":-122.32456505977603,"labeledLatLngs":[{"label":"display","lat":47.61415161351147,"lng":-122.32456505977603}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["517 E Pike St (at Belmont Ave.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":38,"usersCount":1667,"checkinsCount":5090},"url":"http://www.kaladi.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/kaladi-brothers-coffee/475ebc58f964a520d94c1fe3/menu","mobileUrl":"https://foursquare.com/v/475ebc58f964a520d94c1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4aa1a711f964a520684120e3","name":"Cherry Street Coffee House","contact":{"phone":"2064417176","formattedPhone":"(206) 441-7176","twitter":"cherrystreet"},"location":{"address":"2121 1st Ave","crossStreet":"Btw Blanchard & Lenora St.","lat":47.61224159203839,"lng":-122.34474021390412,"labeledLatLngs":[{"label":"display","lat":47.61224159203839,"lng":-122.34474021390412}],"postalCode":"98121","cc":"US","neighborhood":"Belltown","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2121 1st Ave (Btw Blanchard & Lenora St.)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":30,"usersCount":1649,"checkinsCount":4794},"url":"http://cherryst.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/4aa1a711f964a520684120e3/menu","mobileUrl":"https://foursquare.com/v/4aa1a711f964a520684120e3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4412e177f964a520db301fe3","name":"Panama Hotel Tea & Coffee","contact":{"phone":"2065154000","formattedPhone":"(206) 515-4000"},"location":{"address":"607 S Main St","crossStreet":"btwn 6th & Maynard Ave. S","lat":47.59997006448296,"lng":-122.32614684210247,"labeledLatLngs":[{"label":"display","lat":47.59997006448296,"lng":-122.32614684210247}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["607 S Main St (btwn 6th & Maynard Ave. S)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":15,"usersCount":846,"checkinsCount":1514},"url":"http://www.panamahotel.net/teahouse.htm","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/panama-hotel-tea--coffee/4412e177f964a520db301fe3/menu","mobileUrl":"https://foursquare.com/v/4412e177f964a520db301fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4b5daa3ff964a520cc6529e3","name":"Pegasus Coffee","contact":{"phone":"2062923013","formattedPhone":"(206) 292-3013"},"location":{"address":"1218 3rd Ave","crossStreet":"at Seneca St","lat":47.60755521415362,"lng":-122.33584527606352,"labeledLatLngs":[{"label":"display","lat":47.60755521415362,"lng":-122.33584527606352}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1218 3rd Ave (at Seneca St)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":6,"usersCount":278,"checkinsCount":1546},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a26f5c5f964a520f47e1fe3","name":"Bedlam Coffee","contact":{"phone":"2069102300","formattedPhone":"(206) 910-2300","twitter":"bedlamcoffee","facebook":"117036506160","facebookUsername":"BedlamCoffee","facebookName":"Bedlam Coffee"},"location":{"address":"2231 2nd Ave","crossStreet":"Bell St","lat":47.613948460584,"lng":-122.34548328955584,"labeledLatLngs":[{"label":"display","lat":47.613948460584,"lng":-122.34548328955584}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2231 2nd Ave (Bell St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":85,"usersCount":2538,"checkinsCount":8680},"url":"http://bedlamcoffee.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/bedlam-coffee/4a26f5c5f964a520f47e1fe3/menu","mobileUrl":"https://foursquare.com/v/4a26f5c5f964a520f47e1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"venuePage":{"id":"89452925"},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a63a829f964a52087c51fe3","name":"Cupcake Royale and Vérité Coffee","contact":{"phone":"2067019579","formattedPhone":"(206) 701-9579","twitter":"cupcakeroyale","facebook":"145697968787117","facebookUsername":"CupcakeRoyaleCapitolHill","facebookName":"Cupcake Royale"},"location":{"address":"1111 E Pike St","crossStreet":"btwn 11th & 12th Ave","lat":47.614013174009195,"lng":-122.31760626759302,"labeledLatLngs":[{"label":"display","lat":47.614013174009195,"lng":-122.31760626759302}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1111 E Pike St (btwn 11th & 12th Ave)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1bc941735","name":"Cupcake Shop","pluralName":"Cupcake Shops","shortName":"Cupcakes","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cupcakes_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":91,"usersCount":4472,"checkinsCount":9623},"url":"http://cupcakeroyale.com/","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cupcake-royale-and-v%C3%A9rit%C3%A9-coffee/4a63a829f964a52087c51fe3/menu","mobileUrl":"https://foursquare.com/v/4a63a829f964a52087c51fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[{"id":"5568eddda7c8a9cf8ec3b92e"}],"hasPerk":false},{"id":"4a7b455ef964a52089ea1fe3","name":"Stumptown Coffee Roasters","contact":{"phone":"2063231544","formattedPhone":"(206) 323-1544","twitter":"stumptowncoffee"},"location":{"address":"1115 12th Ave","crossStreet":"at Spring St","lat":47.61203641962361,"lng":-122.31700301170349,"labeledLatLngs":[{"label":"display","lat":47.61203641962361,"lng":-122.31700301170349}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1115 12th Ave (at Spring St)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":78,"usersCount":3448,"checkinsCount":11631},"url":"http://t.co/HP1jMKlOZf","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"556f4246bd6a007c77387d91"}],"hasPerk":false},{"id":"5802b14d38fa7d4a74864fe9","name":"Urban Coffee House","contact":{},"location":{"address":"1900 4th Ave","lat":47.612412527281144,"lng":-122.3386644359043,"labeledLatLngs":[{"label":"display","lat":47.612412527281144,"lng":-122.3386644359043}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1900 4th Ave","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":0,"usersCount":86,"checkinsCount":207},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"509a9305e4b05e3770ebe234","name":"Rococo Coffee Roasting","contact":{"phone":"4258039081","formattedPhone":"(425) 803-9081"},"location":{"address":"207 Boren Ave N","crossStreet":"John And Boren N","lat":47.62023771347799,"lng":-122.33598581355247,"labeledLatLngs":[{"label":"display","lat":47.62023771347799,"lng":-122.33598581355247}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["207 Boren Ave N (John And Boren N)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":17,"usersCount":226,"checkinsCount":2216},"url":"http://rocococoffee.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"49de6c3df964a5204e601fe3","name":"Cherry Street Coffee House","contact":{"phone":"2064415489","formattedPhone":"(206) 441-5489","twitter":"cherrystreet"},"location":{"address":"2719 1st Ave","crossStreet":"at Clay St","lat":47.61626578219188,"lng":-122.35156979634606,"labeledLatLngs":[{"label":"display","lat":47.61626578219188,"lng":-122.35156979634606}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2719 1st Ave (at Clay St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":47,"usersCount":1403,"checkinsCount":6402},"hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/49de6c3df964a5204e601fe3/menu","mobileUrl":"https://foursquare.com/v/49de6c3df964a5204e601fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false}],"geocode":{"what":"","where":"seattle wa","feature":{"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}},"parents":[]}}
     */

    @SerializedName("meta")
    private MetaBean meta;
    @SerializedName("response")
    private ResponseBean response;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class MetaBean implements Parcelable {
        /**
         * code : 200
         * requestId : 5ad514b7db04f515c2b59594
         */

        @SerializedName("code")
        private int code;
        @SerializedName("requestId")
        private String requestId;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.code);
            dest.writeString(this.requestId);
        }

        public MetaBean() {
        }

        protected MetaBean(Parcel in) {
            this.code = in.readInt();
            this.requestId = in.readString();
        }

        public static final Creator<MetaBean> CREATOR = new Creator<MetaBean>() {
            @Override
            public MetaBean createFromParcel(Parcel source) {
                return new MetaBean(source);
            }

            @Override
            public MetaBean[] newArray(int size) {
                return new MetaBean[size];
            }
        };
    }

    public static class ResponseBean implements Parcelable {

        /**
         * venues : [{"id":"52d456c811d24128cdd7bc8b","name":"Storyville Coffee Company","contact":{"phone":"2067805777","formattedPhone":"(206) 780-5777","twitter":"storyville"},"location":{"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":43,"usersCount":1432,"checkinsCount":2443},"url":"https://www.facebook.com/StoryvilleCoffee","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"556e5ca0bd6a82902e297f0f"}],"hasPerk":false},{"id":"57e95a82498e0a3995a43e90","name":"Anchorhead Coffee Co","contact":{},"location":{"address":"1600 7th Ave Ste 105","crossStreet":"Olive Way","lat":47.61340942776967,"lng":-122.33469499761385,"labeledLatLngs":[{"label":"display","lat":47.61340942776967,"lng":-122.33469499761385}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1600 7th Ave Ste 105 (Olive Way)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":30,"usersCount":779,"checkinsCount":2132},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":2,"summary":"2 people are here","groups":[{"type":"others","name":"Other people here","count":2,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"49d3e558f964a520225c1fe3","name":"Cherry Street Coffee House","contact":{"phone":"2066219372","formattedPhone":"(206) 621-9372","twitter":"cherrystreet"},"location":{"address":"103 Cherry St","crossStreet":"at 1st Ave","lat":47.6027673689831,"lng":-122.33415096584942,"labeledLatLngs":[{"label":"display","lat":47.6027673689831,"lng":-122.33415096584942}],"postalCode":"98104","cc":"US","neighborhood":"Seattle Central Business District","city":"Seattle","state":"WA","country":"United States","formattedAddress":["103 Cherry St (at 1st Ave)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":38,"usersCount":1953,"checkinsCount":5412},"url":"http://cherryst.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/49d3e558f964a520225c1fe3/menu","mobileUrl":"https://foursquare.com/v/49d3e558f964a520225c1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"52251f9511d2b2f238901956","name":"Storyville Coffee Company","contact":{"phone":"2067805777","formattedPhone":"(206) 780-5777","twitter":"storyville"},"location":{"address":"94 Pike St #34","crossStreet":"1st Ave (Pike Place Market)","lat":47.608968412285684,"lng":-122.34069716145795,"labeledLatLngs":[{"label":"display","lat":47.608968412285684,"lng":-122.34069716145795}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["94 Pike St #34 (1st Ave (Pike Place Market))","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":121,"usersCount":3512,"checkinsCount":5789},"url":"https://www.facebook.com/StoryvilleCoffee","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/storyville-coffee-company/52251f9511d2b2f238901956/menu","mobileUrl":"https://foursquare.com/v/52251f9511d2b2f238901956/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":2,"summary":"2 people are here","groups":[{"type":"others","name":"Other people here","count":2,"items":[]}]},"referralId":"v-1523913911","venueChains":[{"id":"556e5ca0bd6a82902e297f0f"}],"hasPerk":false},{"id":"545803de498e7e758ac5605e","name":"Elm Coffee Roasters","contact":{},"location":{"address":"240 2nd Avenue Ext S Ste 103","lat":47.600152370806754,"lng":-122.33094380272051,"labeledLatLngs":[{"label":"display","lat":47.600152370806754,"lng":-122.33094380272051}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["240 2nd Avenue Ext S Ste 103","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":68,"usersCount":1484,"checkinsCount":4063},"url":"http://elmcoffeeroasters.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"55fc6351498e081c6ae9a9c1","name":"Slate Coffee","contact":{"twitter":"slatecoffee"},"location":{"address":"602 2nd Ave","crossStreet":"James St","lat":47.60226958101576,"lng":-122.33254930945151,"labeledLatLngs":[{"label":"display","lat":47.60226958101576,"lng":-122.33254930945151}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["602 2nd Ave (James St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":23,"usersCount":556,"checkinsCount":1296},"url":"http://slatecoffee.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"569d5c6c498e4ff52aa8b724","name":"Olympia Coffee Roasters","contact":{},"location":{"address":"2021 7th Ave","lat":47.615100389907994,"lng":-122.3383441043283,"labeledLatLngs":[{"label":"display","lat":47.615100389907994,"lng":-122.3383441043283}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2021 7th Ave","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":4,"usersCount":150,"checkinsCount":1120},"url":"http://amazon.cafebonappetit.com/cafe/olympia-coffee-roasters/","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a609aa8f964a520ebc01fe3","name":"Pegasus Coffee","contact":{"phone":"2066823113","formattedPhone":"(206) 682-3113"},"location":{"address":"711 3rd Ave","crossStreet":"at Cherry St","lat":47.603689,"lng":-122.332502,"labeledLatLngs":[{"label":"display","lat":47.603689,"lng":-122.332502}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["711 3rd Ave (at Cherry St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":15,"usersCount":485,"checkinsCount":2910},"url":"http://pegasuscoffeehouse.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a53845cf964a5205eb21fe3","name":"Tully's Coffee","contact":{"phone":"2063820533","formattedPhone":"(206) 382-0533"},"location":{"address":"821 2nd Ave Ste 402","crossStreet":"btw Marion & Columbia","lat":47.604219783711095,"lng":-122.3346137579619,"labeledLatLngs":[{"label":"display","lat":47.604219783711095,"lng":-122.3346137579619}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["821 2nd Ave Ste 402 (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":7,"usersCount":495,"checkinsCount":2991},"url":"http://tullyscoffeeshops.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"1088","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"5569f401a7c8896abe7c73c8"}],"hasPerk":false},{"id":"4a848900f964a520e3fc1fe3","name":"Cherry Street Coffee House","contact":{"phone":"2064429372","formattedPhone":"(206) 442-9372","twitter":"cherrystreet"},"location":{"address":"808 3rd Ave","crossStreet":"btw Marion & Columbia","lat":47.60451120781553,"lng":-122.3330104220454,"labeledLatLngs":[{"label":"display","lat":47.60451120781553,"lng":-122.3330104220454}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["808 3rd Ave (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":13,"usersCount":673,"checkinsCount":2296},"url":"http://www.cherrybaba.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/4a848900f964a520e3fc1fe3/menu","mobileUrl":"https://foursquare.com/v/4a848900f964a520e3fc1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"475ebc58f964a520d94c1fe3","name":"Kaladi Brothers Coffee","contact":{"phone":"2063881700","formattedPhone":"(206) 388-1700","twitter":"kbcseattle"},"location":{"address":"517 E Pike St","crossStreet":"at Belmont Ave.","lat":47.61415161351147,"lng":-122.32456505977603,"labeledLatLngs":[{"label":"display","lat":47.61415161351147,"lng":-122.32456505977603}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["517 E Pike St (at Belmont Ave.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":38,"usersCount":1667,"checkinsCount":5090},"url":"http://www.kaladi.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/kaladi-brothers-coffee/475ebc58f964a520d94c1fe3/menu","mobileUrl":"https://foursquare.com/v/475ebc58f964a520d94c1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4aa1a711f964a520684120e3","name":"Cherry Street Coffee House","contact":{"phone":"2064417176","formattedPhone":"(206) 441-7176","twitter":"cherrystreet"},"location":{"address":"2121 1st Ave","crossStreet":"Btw Blanchard & Lenora St.","lat":47.61224159203839,"lng":-122.34474021390412,"labeledLatLngs":[{"label":"display","lat":47.61224159203839,"lng":-122.34474021390412}],"postalCode":"98121","cc":"US","neighborhood":"Belltown","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2121 1st Ave (Btw Blanchard & Lenora St.)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":30,"usersCount":1649,"checkinsCount":4794},"url":"http://cherryst.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/4aa1a711f964a520684120e3/menu","mobileUrl":"https://foursquare.com/v/4aa1a711f964a520684120e3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4412e177f964a520db301fe3","name":"Panama Hotel Tea & Coffee","contact":{"phone":"2065154000","formattedPhone":"(206) 515-4000"},"location":{"address":"607 S Main St","crossStreet":"btwn 6th & Maynard Ave. S","lat":47.59997006448296,"lng":-122.32614684210247,"labeledLatLngs":[{"label":"display","lat":47.59997006448296,"lng":-122.32614684210247}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["607 S Main St (btwn 6th & Maynard Ave. S)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":15,"usersCount":846,"checkinsCount":1514},"url":"http://www.panamahotel.net/teahouse.htm","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/panama-hotel-tea--coffee/4412e177f964a520db301fe3/menu","mobileUrl":"https://foursquare.com/v/4412e177f964a520db301fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4b5daa3ff964a520cc6529e3","name":"Pegasus Coffee","contact":{"phone":"2062923013","formattedPhone":"(206) 292-3013"},"location":{"address":"1218 3rd Ave","crossStreet":"at Seneca St","lat":47.60755521415362,"lng":-122.33584527606352,"labeledLatLngs":[{"label":"display","lat":47.60755521415362,"lng":-122.33584527606352}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1218 3rd Ave (at Seneca St)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":6,"usersCount":278,"checkinsCount":1546},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a26f5c5f964a520f47e1fe3","name":"Bedlam Coffee","contact":{"phone":"2069102300","formattedPhone":"(206) 910-2300","twitter":"bedlamcoffee","facebook":"117036506160","facebookUsername":"BedlamCoffee","facebookName":"Bedlam Coffee"},"location":{"address":"2231 2nd Ave","crossStreet":"Bell St","lat":47.613948460584,"lng":-122.34548328955584,"labeledLatLngs":[{"label":"display","lat":47.613948460584,"lng":-122.34548328955584}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2231 2nd Ave (Bell St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":85,"usersCount":2538,"checkinsCount":8680},"url":"http://bedlamcoffee.com","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/bedlam-coffee/4a26f5c5f964a520f47e1fe3/menu","mobileUrl":"https://foursquare.com/v/4a26f5c5f964a520f47e1fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"venuePage":{"id":"89452925"},"storeId":"","hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"4a63a829f964a52087c51fe3","name":"Cupcake Royale and Vérité Coffee","contact":{"phone":"2067019579","formattedPhone":"(206) 701-9579","twitter":"cupcakeroyale","facebook":"145697968787117","facebookUsername":"CupcakeRoyaleCapitolHill","facebookName":"Cupcake Royale"},"location":{"address":"1111 E Pike St","crossStreet":"btwn 11th & 12th Ave","lat":47.614013174009195,"lng":-122.31760626759302,"labeledLatLngs":[{"label":"display","lat":47.614013174009195,"lng":-122.31760626759302}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1111 E Pike St (btwn 11th & 12th Ave)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1bc941735","name":"Cupcake Shop","pluralName":"Cupcake Shops","shortName":"Cupcakes","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cupcakes_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":91,"usersCount":4472,"checkinsCount":9623},"url":"http://cupcakeroyale.com/","hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cupcake-royale-and-v%C3%A9rit%C3%A9-coffee/4a63a829f964a52087c51fe3/menu","mobileUrl":"https://foursquare.com/v/4a63a829f964a52087c51fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"storeId":"","hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[{"id":"5568eddda7c8a9cf8ec3b92e"}],"hasPerk":false},{"id":"4a7b455ef964a52089ea1fe3","name":"Stumptown Coffee Roasters","contact":{"phone":"2063231544","formattedPhone":"(206) 323-1544","twitter":"stumptowncoffee"},"location":{"address":"1115 12th Ave","crossStreet":"at Spring St","lat":47.61203641962361,"lng":-122.31700301170349,"labeledLatLngs":[{"label":"display","lat":47.61203641962361,"lng":-122.31700301170349}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1115 12th Ave (at Spring St)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":true,"stats":{"tipCount":78,"usersCount":3448,"checkinsCount":11631},"url":"http://t.co/HP1jMKlOZf","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[{"id":"556f4246bd6a007c77387d91"}],"hasPerk":false},{"id":"5802b14d38fa7d4a74864fe9","name":"Urban Coffee House","contact":{},"location":{"address":"1900 4th Ave","lat":47.612412527281144,"lng":-122.3386644359043,"labeledLatLngs":[{"label":"display","lat":47.612412527281144,"lng":-122.3386644359043}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1900 4th Ave","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":0,"usersCount":86,"checkinsCount":207},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"509a9305e4b05e3770ebe234","name":"Rococo Coffee Roasting","contact":{"phone":"4258039081","formattedPhone":"(425) 803-9081"},"location":{"address":"207 Boren Ave N","crossStreet":"John And Boren N","lat":47.62023771347799,"lng":-122.33598581355247,"labeledLatLngs":[{"label":"display","lat":47.62023771347799,"lng":-122.33598581355247}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["207 Boren Ave N (John And Boren N)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":17,"usersCount":226,"checkinsCount":2216},"url":"http://rocococoffee.com","allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":1,"summary":"One other person is here","groups":[{"type":"others","name":"Other people here","count":1,"items":[]}]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false},{"id":"49de6c3df964a5204e601fe3","name":"Cherry Street Coffee House","contact":{"phone":"2064415489","formattedPhone":"(206) 441-5489","twitter":"cherrystreet"},"location":{"address":"2719 1st Ave","crossStreet":"at Clay St","lat":47.61626578219188,"lng":-122.35156979634606,"labeledLatLngs":[{"label":"display","lat":47.61626578219188,"lng":-122.35156979634606}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2719 1st Ave (at Clay St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"verified":false,"stats":{"tipCount":47,"usersCount":1403,"checkinsCount":6402},"hasMenu":true,"menu":{"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/49de6c3df964a5204e601fe3/menu","mobileUrl":"https://foursquare.com/v/49de6c3df964a5204e601fe3/device_menu"},"allowMenuUrlEdit":true,"beenHere":{"lastCheckinExpiredAt":0},"specials":{"count":0,"items":[]},"hereNow":{"count":0,"summary":"Nobody here","groups":[]},"referralId":"v-1523913911","venueChains":[],"hasPerk":false}]
         * geocode : {"what":"","where":"seattle wa","feature":{"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}},"parents":[]}
         */

        @SerializedName("geocode")
        private GeocodeBean geocode;
        @SerializedName("venues")
        private List<VenuesBean> venues;

        public GeocodeBean getGeocode() {
            return geocode;
        }

        public void setGeocode(GeocodeBean geocode) {
            this.geocode = geocode;
        }

        public List<VenuesBean> getVenues() {
            return venues;
        }

        public void setVenues(List<VenuesBean> venues) {
            this.venues = venues;
        }

        public static class GeocodeBean implements Parcelable {
            /**
             * what :
             * where : seattle wa
             * feature : {"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}}
             * parents : []
             */

            @SerializedName("what")
            private String what;
            @SerializedName("where")
            private String where;
            @SerializedName("feature")
            private FeatureBean feature;
            @SerializedName("parents")
            private List<Object> parents;

            public String getWhat() {
                return what;
            }

            public void setWhat(String what) {
                this.what = what;
            }

            public String getWhere() {
                return where;
            }

            public void setWhere(String where) {
                this.where = where;
            }

            public FeatureBean getFeature() {
                return feature;
            }

            public void setFeature(FeatureBean feature) {
                this.feature = feature;
            }

            public List<?> getParents() {
                return parents;
            }

            public void setParents(List<Object> parents) {
                this.parents = parents;
            }

            public static class FeatureBean implements Parcelable {
                /**
                 * cc : US
                 * name : Seattle
                 * displayName : Seattle, WA, United States
                 * matchedName : Seattle, WA, United States
                 * highlightedName : <b>Seattle</b>, <b>WA</b>, United States
                 * woeType : 7
                 * slug : seattle-washington
                 * id : geonameid:5809844
                 * longId : 72057594043737780
                 * geometry : {"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}
                 */

                @SerializedName("cc")
                private String cc;
                @SerializedName("name")
                private String name;
                @SerializedName("displayName")
                private String displayName;
                @SerializedName("matchedName")
                private String matchedName;
                @SerializedName("highlightedName")
                private String highlightedName;
                @SerializedName("woeType")
                private int woeType;
                @SerializedName("slug")
                private String slug;
                @SerializedName("id")
                private String id;
                @SerializedName("longId")
                private String longId;
                @SerializedName("geometry")
                private GeometryBean geometry;

                public String getCc() {
                    return cc;
                }

                public void setCc(String cc) {
                    this.cc = cc;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public String getMatchedName() {
                    return matchedName;
                }

                public void setMatchedName(String matchedName) {
                    this.matchedName = matchedName;
                }

                public String getHighlightedName() {
                    return highlightedName;
                }

                public void setHighlightedName(String highlightedName) {
                    this.highlightedName = highlightedName;
                }

                public int getWoeType() {
                    return woeType;
                }

                public void setWoeType(int woeType) {
                    this.woeType = woeType;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLongId() {
                    return longId;
                }

                public void setLongId(String longId) {
                    this.longId = longId;
                }

                public GeometryBean getGeometry() {
                    return geometry;
                }

                public void setGeometry(GeometryBean geometry) {
                    this.geometry = geometry;
                }

                public static class GeometryBean implements Parcelable {
                    /**
                     * center : {"lat":47.60621,"lng":-122.33207}
                     * bounds : {"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}
                     */

                    @SerializedName("center")
                    private CenterBean center;
                    @SerializedName("bounds")
                    private BoundsBean bounds;

                    public CenterBean getCenter() {
                        return center;
                    }

                    public void setCenter(CenterBean center) {
                        this.center = center;
                    }

                    public BoundsBean getBounds() {
                        return bounds;
                    }

                    public void setBounds(BoundsBean bounds) {
                        this.bounds = bounds;
                    }

                    public static class CenterBean implements Parcelable {
                        /**
                         * lat : 47.60621
                         * lng : -122.33207
                         */

                        @SerializedName("lat")
                        private double lat;
                        @SerializedName("lng")
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }

                        @Override
                        public int describeContents() {
                            return 0;
                        }

                        @Override
                        public void writeToParcel(Parcel dest, int flags) {
                            dest.writeDouble(this.lat);
                            dest.writeDouble(this.lng);
                        }

                        public CenterBean() {
                        }

                        protected CenterBean(Parcel in) {
                            this.lat = in.readDouble();
                            this.lng = in.readDouble();
                        }

                        public static final Creator<CenterBean> CREATOR = new Creator<CenterBean>() {
                            @Override
                            public CenterBean createFromParcel(Parcel source) {
                                return new CenterBean(source);
                            }

                            @Override
                            public CenterBean[] newArray(int size) {
                                return new CenterBean[size];
                            }
                        };
                    }

                    public static class BoundsBean implements Parcelable {
                        /**
                         * ne : {"lat":47.734145,"lng":-122.224433}
                         * sw : {"lat":47.481719999999996,"lng":-122.459696}
                         */

                        @SerializedName("ne")
                        private NeBean ne;
                        @SerializedName("sw")
                        private SwBean sw;

                        public NeBean getNe() {
                            return ne;
                        }

                        public void setNe(NeBean ne) {
                            this.ne = ne;
                        }

                        public SwBean getSw() {
                            return sw;
                        }

                        public void setSw(SwBean sw) {
                            this.sw = sw;
                        }

                        public static class NeBean implements Parcelable {
                            /**
                             * lat : 47.734145
                             * lng : -122.224433
                             */

                            @SerializedName("lat")
                            private double lat;
                            @SerializedName("lng")
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }

                            @Override
                            public int describeContents() {
                                return 0;
                            }

                            @Override
                            public void writeToParcel(Parcel dest, int flags) {
                                dest.writeDouble(this.lat);
                                dest.writeDouble(this.lng);
                            }

                            public NeBean() {
                            }

                            protected NeBean(Parcel in) {
                                this.lat = in.readDouble();
                                this.lng = in.readDouble();
                            }

                            public static final Creator<NeBean> CREATOR = new Creator<NeBean>() {
                                @Override
                                public NeBean createFromParcel(Parcel source) {
                                    return new NeBean(source);
                                }

                                @Override
                                public NeBean[] newArray(int size) {
                                    return new NeBean[size];
                                }
                            };
                        }

                        public static class SwBean implements Parcelable {
                            /**
                             * lat : 47.481719999999996
                             * lng : -122.459696
                             */

                            @SerializedName("lat")
                            private double lat;
                            @SerializedName("lng")
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }

                            @Override
                            public int describeContents() {
                                return 0;
                            }

                            @Override
                            public void writeToParcel(Parcel dest, int flags) {
                                dest.writeDouble(this.lat);
                                dest.writeDouble(this.lng);
                            }

                            public SwBean() {
                            }

                            protected SwBean(Parcel in) {
                                this.lat = in.readDouble();
                                this.lng = in.readDouble();
                            }

                            public static final Creator<SwBean> CREATOR = new Creator<SwBean>() {
                                @Override
                                public SwBean createFromParcel(Parcel source) {
                                    return new SwBean(source);
                                }

                                @Override
                                public SwBean[] newArray(int size) {
                                    return new SwBean[size];
                                }
                            };
                        }

                        @Override
                        public int describeContents() {
                            return 0;
                        }

                        @Override
                        public void writeToParcel(Parcel dest, int flags) {
                            dest.writeParcelable(this.ne, flags);
                            dest.writeParcelable(this.sw, flags);
                        }

                        public BoundsBean() {
                        }

                        protected BoundsBean(Parcel in) {
                            this.ne = in.readParcelable(NeBean.class.getClassLoader());
                            this.sw = in.readParcelable(SwBean.class.getClassLoader());
                        }

                        public static final Creator<BoundsBean> CREATOR = new Creator<BoundsBean>() {
                            @Override
                            public BoundsBean createFromParcel(Parcel source) {
                                return new BoundsBean(source);
                            }

                            @Override
                            public BoundsBean[] newArray(int size) {
                                return new BoundsBean[size];
                            }
                        };
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeParcelable(this.center, flags);
                        dest.writeParcelable(this.bounds, flags);
                    }

                    public GeometryBean() {
                    }

                    protected GeometryBean(Parcel in) {
                        this.center = in.readParcelable(CenterBean.class.getClassLoader());
                        this.bounds = in.readParcelable(BoundsBean.class.getClassLoader());
                    }

                    public static final Creator<GeometryBean> CREATOR = new Creator<GeometryBean>() {
                        @Override
                        public GeometryBean createFromParcel(Parcel source) {
                            return new GeometryBean(source);
                        }

                        @Override
                        public GeometryBean[] newArray(int size) {
                            return new GeometryBean[size];
                        }
                    };
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.cc);
                    dest.writeString(this.name);
                    dest.writeString(this.displayName);
                    dest.writeString(this.matchedName);
                    dest.writeString(this.highlightedName);
                    dest.writeInt(this.woeType);
                    dest.writeString(this.slug);
                    dest.writeString(this.id);
                    dest.writeString(this.longId);
                    dest.writeParcelable(this.geometry, flags);
                }

                public FeatureBean() {
                }

                protected FeatureBean(Parcel in) {
                    this.cc = in.readString();
                    this.name = in.readString();
                    this.displayName = in.readString();
                    this.matchedName = in.readString();
                    this.highlightedName = in.readString();
                    this.woeType = in.readInt();
                    this.slug = in.readString();
                    this.id = in.readString();
                    this.longId = in.readString();
                    this.geometry = in.readParcelable(GeometryBean.class.getClassLoader());
                }

                public static final Creator<FeatureBean> CREATOR = new Creator<FeatureBean>() {
                    @Override
                    public FeatureBean createFromParcel(Parcel source) {
                        return new FeatureBean(source);
                    }

                    @Override
                    public FeatureBean[] newArray(int size) {
                        return new FeatureBean[size];
                    }
                };
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.what);
                dest.writeString(this.where);
                dest.writeParcelable(this.feature, flags);
                dest.writeList(this.parents);
            }

            public GeocodeBean() {
            }

            protected GeocodeBean(Parcel in) {
                this.what = in.readString();
                this.where = in.readString();
                this.feature = in.readParcelable(FeatureBean.class.getClassLoader());
                this.parents = new ArrayList<Object>();
                in.readList(this.parents, Object.class.getClassLoader());
            }

            public static final Creator<GeocodeBean> CREATOR = new Creator<GeocodeBean>() {
                @Override
                public GeocodeBean createFromParcel(Parcel source) {
                    return new GeocodeBean(source);
                }

                @Override
                public GeocodeBean[] newArray(int size) {
                    return new GeocodeBean[size];
                }
            };
        }

        public static class VenuesBean implements Parcelable {
            /**
             * id : 52d456c811d24128cdd7bc8b
             * name : Storyville Coffee Company
             * contact : {"phone":"2067805777","formattedPhone":"(206) 780-5777","twitter":"storyville"}
             * location : {"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]}
             * categories : [{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}]
             * verified : true
             * stats : {"tipCount":43,"usersCount":1432,"checkinsCount":2443}
             * url : https://www.facebook.com/StoryvilleCoffee
             * allowMenuUrlEdit : true
             * beenHere : {"lastCheckinExpiredAt":0}
             * specials : {"count":0,"items":[]}
             * storeId :
             * hereNow : {"count":0,"summary":"Nobody here","groups":[]}
             * referralId : v-1523913911
             * venueChains : [{"id":"556e5ca0bd6a82902e297f0f"}]
             * hasPerk : false
             * hasMenu : true
             * menu : {"type":"Menu","label":"Menu","anchor":"View Menu","url":"https://foursquare.com/v/cherry-street-coffee-house/49d3e558f964a520225c1fe3/menu","mobileUrl":"https://foursquare.com/v/49d3e558f964a520225c1fe3/device_menu"}
             * venuePage : {"id":"89452925"}
             */

            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;
            @SerializedName("contact")
            private ContactBean contact;
            @SerializedName("location")
            private LocationBean location;
            @SerializedName("verified")
            private boolean verified;
            @SerializedName("stats")
            private StatsBean stats;
            @SerializedName("url")
            private String url;
            @SerializedName("allowMenuUrlEdit")
            private boolean allowMenuUrlEdit;
            @SerializedName("beenHere")
            private BeenHereBean beenHere;
            @SerializedName("specials")
            private SpecialsBean specials;
            @SerializedName("storeId")
            private String storeId;
            @SerializedName("hereNow")
            private HereNowBean hereNow;
            @SerializedName("referralId")
            private String referralId;
            @SerializedName("hasPerk")
            private boolean hasPerk;
            @SerializedName("hasMenu")
            private boolean hasMenu;
            @SerializedName("menu")
            private MenuBean menu;
            @SerializedName("venuePage")
            private VenuePageBean venuePage;
            @SerializedName("categories")
            private List<CategoriesBean> categories;
            @SerializedName("venueChains")
            private List<VenueChainsBean> venueChains;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public ContactBean getContact() {
                return contact;
            }

            public void setContact(ContactBean contact) {
                this.contact = contact;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public StatsBean getStats() {
                return stats;
            }

            public void setStats(StatsBean stats) {
                this.stats = stats;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isAllowMenuUrlEdit() {
                return allowMenuUrlEdit;
            }

            public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit) {
                this.allowMenuUrlEdit = allowMenuUrlEdit;
            }

            public BeenHereBean getBeenHere() {
                return beenHere;
            }

            public void setBeenHere(BeenHereBean beenHere) {
                this.beenHere = beenHere;
            }

            public SpecialsBean getSpecials() {
                return specials;
            }

            public void setSpecials(SpecialsBean specials) {
                this.specials = specials;
            }

            public String getStoreId() {
                return storeId;
            }

            public void setStoreId(String storeId) {
                this.storeId = storeId;
            }

            public HereNowBean getHereNow() {
                return hereNow;
            }

            public void setHereNow(HereNowBean hereNow) {
                this.hereNow = hereNow;
            }

            public String getReferralId() {
                return referralId;
            }

            public void setReferralId(String referralId) {
                this.referralId = referralId;
            }

            public boolean isHasPerk() {
                return hasPerk;
            }

            public void setHasPerk(boolean hasPerk) {
                this.hasPerk = hasPerk;
            }

            public boolean isHasMenu() {
                return hasMenu;
            }

            public void setHasMenu(boolean hasMenu) {
                this.hasMenu = hasMenu;
            }

            public MenuBean getMenu() {
                return menu;
            }

            public void setMenu(MenuBean menu) {
                this.menu = menu;
            }

            public VenuePageBean getVenuePage() {
                return venuePage;
            }

            public void setVenuePage(VenuePageBean venuePage) {
                this.venuePage = venuePage;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public List<VenueChainsBean> getVenueChains() {
                return venueChains;
            }

            public void setVenueChains(List<VenueChainsBean> venueChains) {
                this.venueChains = venueChains;
            }

            public static class ContactBean implements Parcelable {
                /**
                 * phone : 2067805777
                 * formattedPhone : (206) 780-5777
                 * twitter : storyville
                 */

                @SerializedName("phone")
                private String phone;
                @SerializedName("formattedPhone")
                private String formattedPhone;
                @SerializedName("twitter")
                private String twitter;

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getFormattedPhone() {
                    return formattedPhone;
                }

                public void setFormattedPhone(String formattedPhone) {
                    this.formattedPhone = formattedPhone;
                }

                public String getTwitter() {
                    return twitter;
                }

                public void setTwitter(String twitter) {
                    this.twitter = twitter;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.phone);
                    dest.writeString(this.formattedPhone);
                    dest.writeString(this.twitter);
                }

                public ContactBean() {
                }

                protected ContactBean(Parcel in) {
                    this.phone = in.readString();
                    this.formattedPhone = in.readString();
                    this.twitter = in.readString();
                }

                public static final Creator<ContactBean> CREATOR = new Creator<ContactBean>() {
                    @Override
                    public ContactBean createFromParcel(Parcel source) {
                        return new ContactBean(source);
                    }

                    @Override
                    public ContactBean[] newArray(int size) {
                        return new ContactBean[size];
                    }
                };
            }

            public static class LocationBean implements Parcelable {
                /**
                 * address : 1001 1st Ave
                 * crossStreet : at Madison St
                 * lat : 47.60475923205166
                 * lng : -122.33636210125788
                 * labeledLatLngs : [{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}]
                 * postalCode : 98104
                 * cc : US
                 * city : Seattle
                 * state : WA
                 * country : United States
                 * formattedAddress : ["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]
                 */

                @SerializedName("address")
                private String address;
                @SerializedName("crossStreet")
                private String crossStreet;
                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;
                @SerializedName("postalCode")
                private String postalCode;
                @SerializedName("cc")
                private String cc;
                @SerializedName("city")
                private String city;
                @SerializedName("state")
                private String state;
                @SerializedName("country")
                private String country;
                @SerializedName("labeledLatLngs")
                private List<LabeledLatLngsBean> labeledLatLngs;
                @SerializedName("formattedAddress")
                private List<String> formattedAddress;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getCrossStreet() {
                    return crossStreet;
                }

                public void setCrossStreet(String crossStreet) {
                    this.crossStreet = crossStreet;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public String getPostalCode() {
                    return postalCode;
                }

                public void setPostalCode(String postalCode) {
                    this.postalCode = postalCode;
                }

                public String getCc() {
                    return cc;
                }

                public void setCc(String cc) {
                    this.cc = cc;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public List<LabeledLatLngsBean> getLabeledLatLngs() {
                    return labeledLatLngs;
                }

                public void setLabeledLatLngs(List<LabeledLatLngsBean> labeledLatLngs) {
                    this.labeledLatLngs = labeledLatLngs;
                }

                public List<String> getFormattedAddress() {
                    return formattedAddress;
                }

                public void setFormattedAddress(List<String> formattedAddress) {
                    this.formattedAddress = formattedAddress;
                }

                public static class LabeledLatLngsBean implements Parcelable {
                    /**
                     * label : display
                     * lat : 47.60475923205166
                     * lng : -122.33636210125788
                     */

                    @SerializedName("label")
                    private String label;
                    @SerializedName("lat")
                    private double lat;
                    @SerializedName("lng")
                    private double lng;

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeString(this.label);
                        dest.writeDouble(this.lat);
                        dest.writeDouble(this.lng);
                    }

                    public LabeledLatLngsBean() {
                    }

                    protected LabeledLatLngsBean(Parcel in) {
                        this.label = in.readString();
                        this.lat = in.readDouble();
                        this.lng = in.readDouble();
                    }

                    public static final Creator<LabeledLatLngsBean> CREATOR = new Creator<LabeledLatLngsBean>() {
                        @Override
                        public LabeledLatLngsBean createFromParcel(Parcel source) {
                            return new LabeledLatLngsBean(source);
                        }

                        @Override
                        public LabeledLatLngsBean[] newArray(int size) {
                            return new LabeledLatLngsBean[size];
                        }
                    };
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.address);
                    dest.writeString(this.crossStreet);
                    dest.writeDouble(this.lat);
                    dest.writeDouble(this.lng);
                    dest.writeString(this.postalCode);
                    dest.writeString(this.cc);
                    dest.writeString(this.city);
                    dest.writeString(this.state);
                    dest.writeString(this.country);
                    dest.writeList(this.labeledLatLngs);
                    dest.writeStringList(this.formattedAddress);
                }

                public LocationBean() {
                }

                protected LocationBean(Parcel in) {
                    this.address = in.readString();
                    this.crossStreet = in.readString();
                    this.lat = in.readDouble();
                    this.lng = in.readDouble();
                    this.postalCode = in.readString();
                    this.cc = in.readString();
                    this.city = in.readString();
                    this.state = in.readString();
                    this.country = in.readString();
                    this.labeledLatLngs = new ArrayList<LabeledLatLngsBean>();
                    in.readList(this.labeledLatLngs, LabeledLatLngsBean.class.getClassLoader());
                    this.formattedAddress = in.createStringArrayList();
                }

                public static final Creator<LocationBean> CREATOR = new Creator<LocationBean>() {
                    @Override
                    public LocationBean createFromParcel(Parcel source) {
                        return new LocationBean(source);
                    }

                    @Override
                    public LocationBean[] newArray(int size) {
                        return new LocationBean[size];
                    }
                };
            }

            public static class StatsBean implements Parcelable {
                /**
                 * tipCount : 43
                 * usersCount : 1432
                 * checkinsCount : 2443
                 */

                @SerializedName("tipCount")
                private int tipCount;
                @SerializedName("usersCount")
                private int usersCount;
                @SerializedName("checkinsCount")
                private int checkinsCount;

                public int getTipCount() {
                    return tipCount;
                }

                public void setTipCount(int tipCount) {
                    this.tipCount = tipCount;
                }

                public int getUsersCount() {
                    return usersCount;
                }

                public void setUsersCount(int usersCount) {
                    this.usersCount = usersCount;
                }

                public int getCheckinsCount() {
                    return checkinsCount;
                }

                public void setCheckinsCount(int checkinsCount) {
                    this.checkinsCount = checkinsCount;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.tipCount);
                    dest.writeInt(this.usersCount);
                    dest.writeInt(this.checkinsCount);
                }

                public StatsBean() {
                }

                protected StatsBean(Parcel in) {
                    this.tipCount = in.readInt();
                    this.usersCount = in.readInt();
                    this.checkinsCount = in.readInt();
                }

                public static final Creator<StatsBean> CREATOR = new Creator<StatsBean>() {
                    @Override
                    public StatsBean createFromParcel(Parcel source) {
                        return new StatsBean(source);
                    }

                    @Override
                    public StatsBean[] newArray(int size) {
                        return new StatsBean[size];
                    }
                };
            }

            public static class BeenHereBean implements Parcelable {
                /**
                 * lastCheckinExpiredAt : 0
                 */

                @SerializedName("lastCheckinExpiredAt")
                private int lastCheckinExpiredAt;

                public int getLastCheckinExpiredAt() {
                    return lastCheckinExpiredAt;
                }

                public void setLastCheckinExpiredAt(int lastCheckinExpiredAt) {
                    this.lastCheckinExpiredAt = lastCheckinExpiredAt;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.lastCheckinExpiredAt);
                }

                public BeenHereBean() {
                }

                protected BeenHereBean(Parcel in) {
                    this.lastCheckinExpiredAt = in.readInt();
                }

                public static final Creator<BeenHereBean> CREATOR = new Creator<BeenHereBean>() {
                    @Override
                    public BeenHereBean createFromParcel(Parcel source) {
                        return new BeenHereBean(source);
                    }

                    @Override
                    public BeenHereBean[] newArray(int size) {
                        return new BeenHereBean[size];
                    }
                };
            }

            public static class SpecialsBean implements Parcelable {
                /**
                 * count : 0
                 * items : []
                 */

                @SerializedName("count")
                private int count;
                @SerializedName("items")
                private List<?> items;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public List<?> getItems() {
                    return items;
                }

                public void setItems(List<?> items) {
                    this.items = items;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.count);
                    dest.writeList(this.items);
                }

                public SpecialsBean() {
                }

                protected SpecialsBean(Parcel in) {
                    this.count = in.readInt();
                    this.items = new ArrayList<Object>();
                    in.readList(this.items, Object.class.getClassLoader());
                }

                public static final Creator<SpecialsBean> CREATOR = new Creator<SpecialsBean>() {
                    @Override
                    public SpecialsBean createFromParcel(Parcel source) {
                        return new SpecialsBean(source);
                    }

                    @Override
                    public SpecialsBean[] newArray(int size) {
                        return new SpecialsBean[size];
                    }
                };
            }

            public static class HereNowBean implements Parcelable {
                /**
                 * count : 0
                 * summary : Nobody here
                 * groups : []
                 */

                @SerializedName("count")
                private int count;
                @SerializedName("summary")
                private String summary;
                @SerializedName("groups")
                private List<?> groups;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public List<?> getGroups() {
                    return groups;
                }

                public void setGroups(List<?> groups) {
                    this.groups = groups;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.count);
                    dest.writeString(this.summary);
                    dest.writeList(this.groups);
                }

                public HereNowBean() {
                }

                protected HereNowBean(Parcel in) {
                    this.count = in.readInt();
                    this.summary = in.readString();
                    this.groups = new ArrayList<Object>();
                    in.readList(this.groups, Object.class.getClassLoader());
                }

                public static final Creator<HereNowBean> CREATOR = new Creator<HereNowBean>() {
                    @Override
                    public HereNowBean createFromParcel(Parcel source) {
                        return new HereNowBean(source);
                    }

                    @Override
                    public HereNowBean[] newArray(int size) {
                        return new HereNowBean[size];
                    }
                };
            }

            public static class MenuBean implements Parcelable {
                /**
                 * type : Menu
                 * label : Menu
                 * anchor : View Menu
                 * url : https://foursquare.com/v/cherry-street-coffee-house/49d3e558f964a520225c1fe3/menu
                 * mobileUrl : https://foursquare.com/v/49d3e558f964a520225c1fe3/device_menu
                 */

                @SerializedName("type")
                private String type;
                @SerializedName("label")
                private String label;
                @SerializedName("anchor")
                private String anchor;
                @SerializedName("url")
                private String url;
                @SerializedName("mobileUrl")
                private String mobileUrl;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public String getAnchor() {
                    return anchor;
                }

                public void setAnchor(String anchor) {
                    this.anchor = anchor;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getMobileUrl() {
                    return mobileUrl;
                }

                public void setMobileUrl(String mobileUrl) {
                    this.mobileUrl = mobileUrl;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.type);
                    dest.writeString(this.label);
                    dest.writeString(this.anchor);
                    dest.writeString(this.url);
                    dest.writeString(this.mobileUrl);
                }

                public MenuBean() {
                }

                protected MenuBean(Parcel in) {
                    this.type = in.readString();
                    this.label = in.readString();
                    this.anchor = in.readString();
                    this.url = in.readString();
                    this.mobileUrl = in.readString();
                }

                public static final Creator<MenuBean> CREATOR = new Creator<MenuBean>() {
                    @Override
                    public MenuBean createFromParcel(Parcel source) {
                        return new MenuBean(source);
                    }

                    @Override
                    public MenuBean[] newArray(int size) {
                        return new MenuBean[size];
                    }
                };
            }

            public static class VenuePageBean implements Parcelable {
                /**
                 * id : 89452925
                 */

                @SerializedName("id")
                private String id;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.id);
                }

                public VenuePageBean() {
                }

                protected VenuePageBean(Parcel in) {
                    this.id = in.readString();
                }

                public static final Creator<VenuePageBean> CREATOR = new Creator<VenuePageBean>() {
                    @Override
                    public VenuePageBean createFromParcel(Parcel source) {
                        return new VenuePageBean(source);
                    }

                    @Override
                    public VenuePageBean[] newArray(int size) {
                        return new VenuePageBean[size];
                    }
                };
            }

            public static class CategoriesBean implements Parcelable {
                /**
                 * id : 4bf58dd8d48988d1e0931735
                 * name : Coffee Shop
                 * pluralName : Coffee Shops
                 * shortName : Coffee Shop
                 * icon : {"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"}
                 * primary : true
                 */

                @SerializedName("id")
                private String id;
                @SerializedName("name")
                private String name;
                @SerializedName("pluralName")
                private String pluralName;
                @SerializedName("shortName")
                private String shortName;
                @SerializedName("icon")
                private IconBean icon;
                @SerializedName("primary")
                private boolean primary;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPluralName() {
                    return pluralName;
                }

                public void setPluralName(String pluralName) {
                    this.pluralName = pluralName;
                }

                public String getShortName() {
                    return shortName;
                }

                public void setShortName(String shortName) {
                    this.shortName = shortName;
                }

                public IconBean getIcon() {
                    return icon;
                }

                public void setIcon(IconBean icon) {
                    this.icon = icon;
                }

                public boolean isPrimary() {
                    return primary;
                }

                public void setPrimary(boolean primary) {
                    this.primary = primary;
                }

                public static class IconBean implements Parcelable {
                    /**
                     * prefix : https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_
                     * suffix : .png
                     */

                    @SerializedName("prefix")
                    private String prefix;
                    @SerializedName("suffix")
                    private String suffix;

                    public String getPrefix() {
                        return prefix;
                    }

                    public void setPrefix(String prefix) {
                        this.prefix = prefix;
                    }

                    public String getSuffix() {
                        return suffix;
                    }

                    public void setSuffix(String suffix) {
                        this.suffix = suffix;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeString(this.prefix);
                        dest.writeString(this.suffix);
                    }

                    public IconBean() {
                    }

                    protected IconBean(Parcel in) {
                        this.prefix = in.readString();
                        this.suffix = in.readString();
                    }

                    public static final Creator<IconBean> CREATOR = new Creator<IconBean>() {
                        @Override
                        public IconBean createFromParcel(Parcel source) {
                            return new IconBean(source);
                        }

                        @Override
                        public IconBean[] newArray(int size) {
                            return new IconBean[size];
                        }
                    };
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.id);
                    dest.writeString(this.name);
                    dest.writeString(this.pluralName);
                    dest.writeString(this.shortName);
                    dest.writeParcelable(this.icon, flags);
                    dest.writeByte(this.primary ? (byte) 1 : (byte) 0);
                }

                public CategoriesBean() {
                }

                protected CategoriesBean(Parcel in) {
                    this.id = in.readString();
                    this.name = in.readString();
                    this.pluralName = in.readString();
                    this.shortName = in.readString();
                    this.icon = in.readParcelable(IconBean.class.getClassLoader());
                    this.primary = in.readByte() != 0;
                }

                public static final Creator<CategoriesBean> CREATOR = new Creator<CategoriesBean>() {
                    @Override
                    public CategoriesBean createFromParcel(Parcel source) {
                        return new CategoriesBean(source);
                    }

                    @Override
                    public CategoriesBean[] newArray(int size) {
                        return new CategoriesBean[size];
                    }
                };
            }

            public static class VenueChainsBean implements Parcelable {
                /**
                 * id : 556e5ca0bd6a82902e297f0f
                 */

                @SerializedName("id")
                private String id;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.id);
                }

                public VenueChainsBean() {
                }

                protected VenueChainsBean(Parcel in) {
                    this.id = in.readString();
                }

                public static final Creator<VenueChainsBean> CREATOR = new Creator<VenueChainsBean>() {
                    @Override
                    public VenueChainsBean createFromParcel(Parcel source) {
                        return new VenueChainsBean(source);
                    }

                    @Override
                    public VenueChainsBean[] newArray(int size) {
                        return new VenueChainsBean[size];
                    }
                };
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.id);
                dest.writeString(this.name);
                dest.writeParcelable(this.contact, flags);
                dest.writeParcelable(this.location, flags);
                dest.writeByte(this.verified ? (byte) 1 : (byte) 0);
                dest.writeParcelable(this.stats, flags);
                dest.writeString(this.url);
                dest.writeByte(this.allowMenuUrlEdit ? (byte) 1 : (byte) 0);
                dest.writeParcelable(this.beenHere, flags);
                dest.writeParcelable(this.specials, flags);
                dest.writeString(this.storeId);
                dest.writeParcelable(this.hereNow, flags);
                dest.writeString(this.referralId);
                dest.writeByte(this.hasPerk ? (byte) 1 : (byte) 0);
                dest.writeByte(this.hasMenu ? (byte) 1 : (byte) 0);
                dest.writeParcelable(this.menu, flags);
                dest.writeParcelable(this.venuePage, flags);
                dest.writeList(this.categories);
                dest.writeList(this.venueChains);
            }

            public VenuesBean() {
            }

            protected VenuesBean(Parcel in) {
                this.id = in.readString();
                this.name = in.readString();
                this.contact = in.readParcelable(ContactBean.class.getClassLoader());
                this.location = in.readParcelable(LocationBean.class.getClassLoader());
                this.verified = in.readByte() != 0;
                this.stats = in.readParcelable(StatsBean.class.getClassLoader());
                this.url = in.readString();
                this.allowMenuUrlEdit = in.readByte() != 0;
                this.beenHere = in.readParcelable(BeenHereBean.class.getClassLoader());
                this.specials = in.readParcelable(SpecialsBean.class.getClassLoader());
                this.storeId = in.readString();
                this.hereNow = in.readParcelable(HereNowBean.class.getClassLoader());
                this.referralId = in.readString();
                this.hasPerk = in.readByte() != 0;
                this.hasMenu = in.readByte() != 0;
                this.menu = in.readParcelable(MenuBean.class.getClassLoader());
                this.venuePage = in.readParcelable(VenuePageBean.class.getClassLoader());
                this.categories = new ArrayList<CategoriesBean>();
                in.readList(this.categories, CategoriesBean.class.getClassLoader());
                this.venueChains = new ArrayList<VenueChainsBean>();
                in.readList(this.venueChains, VenueChainsBean.class.getClassLoader());
            }

            public static final Creator<VenuesBean> CREATOR = new Creator<VenuesBean>() {
                @Override
                public VenuesBean createFromParcel(Parcel source) {
                    return new VenuesBean(source);
                }

                @Override
                public VenuesBean[] newArray(int size) {
                    return new VenuesBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.geocode, flags);
            dest.writeList(this.venues);
        }

        public ResponseBean() {
        }

        protected ResponseBean(Parcel in) {
            this.geocode = in.readParcelable(GeocodeBean.class.getClassLoader());
            this.venues = new ArrayList<VenuesBean>();
            in.readList(this.venues, VenuesBean.class.getClassLoader());
        }

        public static final Creator<ResponseBean> CREATOR = new Creator<ResponseBean>() {
            @Override
            public ResponseBean createFromParcel(Parcel source) {
                return new ResponseBean(source);
            }

            @Override
            public ResponseBean[] newArray(int size) {
                return new ResponseBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.meta, flags);
        dest.writeParcelable(this.response, flags);
    }

    public SearchPlacesResponse() {
    }

    protected SearchPlacesResponse(Parcel in) {
        this.meta = in.readParcelable(MetaBean.class.getClassLoader());
        this.response = in.readParcelable(ResponseBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<SearchPlacesResponse> CREATOR = new Parcelable.Creator<SearchPlacesResponse>() {
        @Override
        public SearchPlacesResponse createFromParcel(Parcel source) {
            return new SearchPlacesResponse(source);
        }

        @Override
        public SearchPlacesResponse[] newArray(int size) {
            return new SearchPlacesResponse[size];
        }
    };
}
