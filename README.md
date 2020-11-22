# Cursor-HomeWork #4
Homework: OOP in Java
Problem 1.       Geometry
Define a class structure that models a shape hierarchy.
·         Shape – base class for any kind of shape, holds a list of vertices
o   PlaneShape – base class for all plane (2D) shapes, holds a list of 2D vertices (holding x and y), implements PerimeterMeasurable and AreaMeasurable interfaces
§  Triangle – holds 3 vertices
§  Rectangle – holds 1 vertex, width, height
§  Circle – holds 1 vertex and radius
o   SpaceShape – base class for all three-dimensional shapes, holds a list of 3D vertices (holding x, y and z), implements AreaMeasurable and VolumeMeasurable interfaces
§  Square Pyramid – holds 1 vertex (base center), base width, pyramid height
§  Cuboid – holds 1 vertex, width, height, depth
§  Sphere – holds 1 vertex and radius
 
A vertex is a point in 2D/3D space. The distance between two 2D vertices is calculated using the formula:
 
Define the following interfaces:
·         PerimeterMeasurable – holds double getPerimeter()
·         AreaMeasurable – holds double getArea()
·         VolumeMeasurable – holds double getVolume()
Design the class hierarchy using proper inheritance and code reusability through abstraction. Each shape should implement its respective interfaces with proper formulas.
Override toString() to return information about each shape (shape type, each vertex's coordinates, perimeter/area/volume). Create objects of different classes and add them to a single array. Iterate through the array and print information about each shape.
