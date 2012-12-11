Pong Clone
==========

Create a basic clone of the classic Pong game using the Slick library - http://slick.cokeandcode.com/
Part of the implementation is given.

You must implement @PongGame#update@ and CPUPlayer#update methods. You may change the rest of the code if you want.

Get it running
--------------

Make sure the game runs without throwing exceptions before making any changes.

### Step 1 - Import the project into Eclipse

If you use another IDE or don't import the existing Eclipse project, you need to set up native library locations yourself.

### Step 2 - Native libs

Copy native libraries specific to your platform into nativelib directory. In case of 64-bit Windows, please use *32-bit Java* to launch the game. Alternatively, you can get the latest LWJGL which has 64-bit windows libraries. You may have to recompile Slick.

### Step 3 - Run the game

It should run without any exceptions now. Esc to quit.

Requirements & Assignment
-------------------------

Your assignment is for the code to pass the following requirements

* Player must be able to move the left paddle with keyboard up & down arrows
* CPU-controlled player moves the right paddle
** CPU player must be able to bounce the ball back at least twice if the speed of the ball doesn't change
* The ball must change direction when it collides with either of the paddles or with the upper or lower edges of the "court"
** The collisions do not need to be pixel-perfect -- the collision may register either slightly before we can see the colliding objects overlap or after we see them overlap
** It's good enough if the ball always moves in 45 degree angles (no need for sin or cos, just mirror the initial velocity vector), but if you want you can do something more clever
* If the ball exits the "court" by getting past one of the paddles, the game is over and you must declare a winner
* The game should speed up the movement of the ball at some point so that either the CPU player or the human player will likely fail to catch it eventually
* Pressing 'r' must successfully restart the game without corrupting its state
* Pressing 'Escape' immediately quits the game

You can get creative if you want, as long as these requirements are filled.
