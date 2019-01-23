Graham Scan
===========
Find the [convex hull](https://en.wikipedia.org/wiki/Convex_hull) of points in 2D space using the [Graham Scan](https://en.wikipedia.org/wiki/Graham_scan) algorithm.\
All auxiliary data structures and algorithms are also explicitly implemented. 

* A fully commented description of the algorithm can be found in `src\GrahamScan.java`.
* Input points should be in the form of `.txt` files placed in `input\`. Two sample files are provided.
* The output convex hull for each input can be found in `input\results\{input_filename}_convexhull.txt`.
* Import and compile using IntelliJ IDEA. Run `main.java` to process inputs (outputs also displayed in console).


* * *
#### Sample input
The first line should be an integer indicating how many points from this file should be processed.\
Each subsequent line should contain an x,y coordinate in the form `[x,y]`.
````
30
[-100,100]
[-125,125]
[-150,125]
[-175,100]
[-200,50]
[-200,-50]
[-175,-100]
[-150,-125]
[-125,-125]
[-100,-100]
[75,150]
[25,200]
[-25,200]
[-75,125]
[-25,50]
[25,-50]
[75,-125]
[25,-200]
[-25,-200]
[-75,-150]
[200,125]
[150,125]
[100,125]
[100,50]
[100,0]
[150,0]
[100,-50]
[100,-125]
[150,-125]
[200,-125]
````
* * *
#### Sample output
The first line contains an integer indicating how many points exist on the convex hull.\
Each subsequent line contains an x,y coordinate of a point on the convex hull in counter-clockwise order.
````
12
[-25,-200]
[25,-200]
[200,-125]
[200,125]
[25,200]
[-25,200]
[-150,125]
[-175,100]
[-200,50]
[-200,-50]
[-175,-100]
[-150,-125]
````
