$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/itemtocart.feature");
formatter.feature({
  "line": 2,
  "name": "I want to use this template for handling an items in cart",
  "description": "",
  "id": "i-want-to-use-this-template-for-handling-an-items-in-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "ToLogin to Flipkart and add an item to cart",
  "description": "",
  "id": "i-want-to-use-this-template-for-handling-an-items-in-cart;tologin-to-flipkart-and-add-an-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I want to Login to Flipkart",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I want to add item to my cart",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the item in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddItemtoCartDef.login_to_Flipkart()"
});
formatter.result({
  "duration": 2737079043,
  "status": "passed"
});
formatter.match({
  "location": "AddItemtoCartDef.add_item_to_cart()"
});
formatter.result({
  "duration": 865223,
  "status": "passed"
});
formatter.match({
  "location": "AddItemtoCartDef.AddItemtoCartDef_validateItemInCart()"
});
formatter.result({
  "duration": 267155,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify whther item removed from cart",
  "description": "",
  "id": "i-want-to-use-this-template-for-handling-an-items-in-cart;verify-whther-item-removed-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Removed item from cart",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "RemoveItemFromCart.login()"
});
formatter.result({
  "duration": 1266799529,
  "status": "passed"
});
formatter.match({
  "location": "RemoveItemFromCart.RemoveItemFromCart_removeItemFromCart()"
});
formatter.result({
  "duration": 179762,
  "status": "passed"
});
formatter.match({
  "location": "RemoveItemFromCart.RemoveItemFromCart_closebrowser()"
});
formatter.result({
  "duration": 152705,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify the Pay on Delivery option",
  "description": "",
  "id": "i-want-to-use-this-template-for-handling-an-items-in-cart;verify-the-pay-on-delivery-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Open flipcart",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Select an item",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Add that item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Place it for order",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "The selected payment method is Pay on Delivery",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close browser in this secnario",
  "keyword": "And "
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_login()"
});
formatter.result({
  "duration": 1233625307,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_selectAnItem()"
});
formatter.result({
  "duration": 460913,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_addItemToCart()"
});
formatter.result({
  "duration": 232323,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_placeItForOrder()"
});
formatter.result({
  "duration": 254093,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_selectDeliverAddress()"
});
formatter.result({
  "duration": 386271,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_payOnDelivery()"
});
formatter.result({
  "duration": 315051,
  "status": "passed"
});
formatter.match({
  "location": "payOnDelivery.payOnDelivery_closeBrowser()"
});
formatter.result({
  "duration": 171676,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify the price of an item",
  "description": "",
  "id": "i-want-to-use-this-template-for-handling-an-items-in-cart;verify-the-price-of-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Login to flipkart",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Search for an item",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Check the price",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "PriceOfAnItem.PriceOfAnItem_login()"
});
formatter.result({
  "duration": 1057497486,
  "status": "passed"
});
formatter.match({
  "location": "PriceOfAnItem.PriceOfAnItem_ItemSearch()"
});
formatter.result({
  "duration": 605220,
  "status": "passed"
});
formatter.match({
  "location": "PriceOfAnItem.PriceOfAnItem_PriceCheck()"
});
formatter.result({
  "duration": 2143774,
  "status": "passed"
});
formatter.match({
  "location": "PriceOfAnItem.PriceOfAnItem_CloseBrowser()"
});
formatter.result({
  "duration": 146484,
  "status": "passed"
});
});