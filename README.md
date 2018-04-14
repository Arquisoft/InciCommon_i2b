 [![Build Status](https://travis-ci.org/Arquisoft/InciCommon_i2b.svg?branch=master)](https://travis-ci.org/Arquisoft/InciCommon_i2b)    [![codecov](https://codecov.io/gh/Arquisoft/InciCommon_i2b/branch/master/graph/badge.svg)](https://codecov.io/gh/Arquisoft/InciCommon_i2b) 
 [ ![Download](https://api.bintray.com/packages/arquisoft/incicommons-i2b/InciCommon_i2b/images/download.svg) ](https://bintray.com/arquisoft/incicommons-i2b/InciCommon_i2b/_latestVersion)

# InciCommon_i2b
This is a set of common classes (Entities,Tests...) from [Inci_I2b group](https://github.com/Arquisoft/Inci_i2b), as it is explained in [this wiki page](https://github.com/Arquisoft/InciManager_i2b/wiki/Fourth-meeting-(10-April-2018)) we think that duplicating code when dealing with systems that share the same entities, databases and many times configuration files isn't a right approach when talking about maintainability.

# Where it is our code?
After talking with [Labra](https://github.com/labra) about this feature we wanted to include in our project he recommended us to use [Bintray](https://bintray.com), a platform made for Software Distribution. After creating the [package](https://bintray.com/arquisoft/incicommons-i2b/InciCommon_i2b) and deploying our project with ``` mvn deploy ```, the pre-alpha version of our project was created and we where able to add it to JCenter.

# How did we do that?
The deployin proccess is quite straight forward, we just followed a very simple guide provided by bintray that you can find [here](https://blog.bintray.com/2015/09/17/publishing-your-maven-project-to-bintray/)
