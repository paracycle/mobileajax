------------------------------------
    Asynchronous I/O for Java ME
------------------------------------

1. Introduction

   This library provides the equivalent of XmlHttpRequest for Java ME with
   some additional functionality useful for invoking RESTful web
   services.

   It is layered on top of the com.sun.me.web.path library.
   
   For more information please see:
     https://meapplicationdevelopers.dev.java.net/mobileajax.html

2. Details

   Features include -

   2.1 Asynchronous versions of HTTP Get and Post
   2.2 HTTP Basic Authentication
   2.3 Multipart MIME (sender only)
   2.4 Progress listeners

3. Required APIs

   JSR 30 - Connected Limited Device Configuration (CLDC) 1.0
   JSR 37 - Mobile Information Device Profile (MIDP) 1.0

4. Tools

   The project can be built easily using the following tools -

   1. Java SE version 6.0 or higher
   2. NetBeans IDE 5.5.1 or higher
   3. NetBeans Mobility Pack 5.5.1 for CLDC or higher

5. Setup

   1. Launch NetBeans.

   2. Open the project in NetBeans.

   3. Resolve dependencies, if necessary. If the project name is in red,
      resolution is needed. Right-click on the project name and select
      Resolve Reference Problems (towards the bottom of the menu).

      Resolve the location of the path project. Click Resolve,
      navigate to the path project directory and select it. This
      should fix the reference problem.

   4. Right-click on the project and select Build All Project
      Configurations.
