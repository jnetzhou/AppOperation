var exec = require('cordova/exec');

exports.appExit = function(success, error) {
    exec(success, error, "AppOperation", "appExit", []);
};
