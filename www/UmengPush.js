var exec = require('cordova/exec');

exports.addTag  = function(tag,callBack,error) {
    cordova.exec(callBack, error, "UmengPush","addTag", [tag]);
},
exports.delTag  = function(tag,callBack,error) {
    cordova.exec(callBack, error, "UmengPush","delTag", [tag]);
},
exports.listTag  = function(callBack,error) {
    cordova.exec(callBack, error, "UmengPush","listTag", []);
},
exports.addAlias  = function(alias,type,callBack,error) {
    cordova.exec(callBack, error, "UmengPush","addAlias", [alias,type]);
},
exports.delAlias  = function(alias,type,callBack,error) {
    cordova.exec(callBack, error, "UmengPush","delAlias", [alias,type]);
},
exports.setAlias  = function(alias,type,callBack,error) {
    cordova.exec(callBack, error, "UmengPush","setAlias", [alias,type]);
}

