Pieces:

Ghost - (Interactable : HIT),(GamePiece),(Moveable),(Random Motion): Leaves a ghost of its past self that when interacting
with last location damages the player.

Warrior - (Interactable : HIT),(GamePiece): Non-moveable piece that damages the player when interacted with.

Nuke - (Interactable : KILLED),(GamePiece),(RANGED): A ranged piece that intstantly kills the player if they are within 3 spaces if it.
We added another value in the interactions that is called NUKED to display our own custom text when they hit it, but it is functionally
 the same as killed

Treasure - (Interactable : POINT),(GamePiece),(Moveable),(Linear Motion): Gains the player a point and moves towards the edge of the
stage until it resets back at position 6

Door - (Interactable : ADVANCE),(GamePiece): Doorway that advances the player into the next stage.

Rock - (Non-Drawable): Plain old rock. It doesn't do anything