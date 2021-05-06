# validate_utility library for Abilists \[ [www.abilists.com](http://www.abilists.com)\]
--------------------------------------------------
[![Build Status](https://travis-ci.org/abilists/validate_utility.svg?branch=master)](https://travis-ci.org/abilists/validate_utility)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/abilists/validate_utility)

validate_utility is to validate parameter in Server Side. It is very sample so you can easily use it to your particular web project.

#### About
validate_utility has a few special features:

* Just 1 line coding in Java
* Handy integration with view
* Validate Array, Bit, Byte, Integer, Phone, Date, Character
#### Runtime Requirements

- *P1:* Java8 or newer
- *P2:* Junit test

#### How to Install
Build as blow
```
$ gradle install
```
Add the following code into build.gradle in your new project.
```
compile 'io.utility:validate:0.0.6'
```
#### Get started
Add the following code into the Model class.
```
@ByteString(charset = "UTF-8", min = 1, max = 4900, message = "parameter.error.size.max4900.message") 
private String ucContents;
```

#### License

validate_utility is distributed under the MIT License.

#### Thank you!

I really appreciate all kind of feedback and contributions. 
