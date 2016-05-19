# Cordova System Bar Dimmer Plugin


## Overview
This is a very simple little plugin built for Cordova Android to 'dim' the system bars.
The system bars cover both the on screen navigation bar (bottom) and the status bar (top).

When I say 'dim' (a term used by Android) I mean to say that the on screen details become dots instead of the usual larger icons


## Install plugin
Installing the plugin can be done by using the below cordova cli command from a terminal
```
cordova plugin add cordova-plugin-systembardimmer
```


## How to use
To use the plugin (after installing) simply call one of the following:

To dim the system bars:
```
systembardimmer.dim(function(e){
  // Successfully Dimmed
}, function(e){
  // Failed to Dim
});
```

To reset back to normal:
```
systembardimmer.reset(function(e){
  // Successfully Reset
}, function(e){
  // Failed to Reset
});
```
