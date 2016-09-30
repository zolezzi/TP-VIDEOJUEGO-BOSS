package quantumPeaceMaker

import ar.pablitar.vainilla.commons.math.Vector2D
import com.uqbar.vainilla.appearances.Circle
import java.awt.Color
import com.uqbar.vainilla.DeltaState
import com.uqbar.vainilla.appearances.Rectangle
import ar.pablitar.vainilla.commons.math.Semiplane
import com.uqbar.vainilla.events.constants.Key
//import java.awt.Rectangle

class Enemy extends QuantumPeaceMakerComponent {
    
  val ancho = 50
  val alto = 50
  
  
  //val diameter = 40
  //val radius = diameter.toDouble / 2
  val initialSpeed: Vector2D = (0.0, 300.0)

  val x1 = this.position.x1.toInt
  val y1 = this.position.x2.toInt
 // var rec = new Rectangle(x1,y1,ancho,alto)

   // val enemySprite = Resources.enemySprite
 //   this.setAppearance(enemySprite)
  this.setAppearance(new Rectangle(Color.BLUE, 50, 50))
  
  val accelerationMagnitude = 800
  override var speed: Vector2D = initialSpeed
  
  reset()

  override def update(state: DeltaState) = {
    this.position += this.speed * state.getDelta

  }


  
    if (this.isBelowTheScreen) {
      this.destroy()
    }
  

    
  def randomPosition() = {
    //CatchTheBallGame.width.toDouble / 2
    QuantumPeaceMakerGame.randomizer.nextDouble * QuantumPeaceMakerGame.width
  }

  def isBelowTheScreen = {
    this.position.x2 >= QuantumPeaceMakerGame.height
  }

  def center = {
    this.position + (alto, ancho)
  }

  override def position_=(v: Vector2D) = super.position_=(boundWithWalls(v))

  def boundWithWalls(v: Vector2D) = {
    v
  }

  override def destroy() {
//    super.destroy()
//    Enemy.despawn(this);
  }

  def reset() = {
    this.position = (randomPosition(), -600.0)
    speed = initialSpeed
    this.setDestroyPending(false)
    this
  }

  
  
    def spawn() = {
     new Enemy()
    }

/*
  var collision = false

  this.speed = (Random.nextInt(800), 0)

  override val acceleration = Some(Vector2D(0, 1000))

  def laser = this.getScene.player.getLaserWeapon

  override def update(state: DeltaState) = {
    super.update(state)
    if (this.isCollisionBy(laser) && !colision) {
      this.hayColision() // hayColision
      this.getScene.sumScore
      laser.caught(this) // laser.eliminarNave(this)
    } else if (colisiono) {
      this.checkCollisionWithCollisionWalls()
    } else {
      this.checkIfBelowTheScreen()
    }
  }
  
  def sprite = Resources.spriteSemilla 
  
  this.setAppearance(sprite)
  val collisionMargin = 30


  def isCollisionBy(catcher: Catcher) = {
    CollisionDetector.INSTANCE
      .collidesCircleAgainstRect(
        this.position.x1 - radius, this.position.x2 - radius, this.radius,
        catcher.topLeft().x1 + collisionMargin, catcher.topLeft().x2 + 10, catcher.width - collisionMargin * 2, this.radius)
  }

  def hayColision() = {
    this.setZ(-2)
    this.catched = true
  }

  def checkCollisionWithCollisionWalls() = {
    catcher.sideWalls.foreach {
      this.checkCollisionWithWallAndRebound(_)
    }

    if (catcher.bottomWall.circuloPasoDetras(this.position, this.radius)) {
      this.destroy()
    }
  }

  def checkCollisionWithWallAndRebound(wall: Semiplane) = {
    if (wall.circuloPasoDetras(this.position, this.radius)) {
      this.speed = PhysicsUtils.rebound(this.speed, wall.normal, 0.3)
    }
  }

  def checkIfBelowTheScreen() = {
    if (this.position.x2 > 650)
      this.destroy()
  }*/

}