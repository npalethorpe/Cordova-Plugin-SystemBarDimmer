/*global cordova, module*/

module.exports = {
    dim: function (successCallback, errorCallback) {
    	cordova.exec(successCallback, errorCallback, "SystemBarDimmer", "Dim", []);
    },
    reset: function (successCallback, errorCallback) {
    	cordova.exec(successCallback, errorCallback, "SystemBarDimmer", "Reset", []);
    }
};