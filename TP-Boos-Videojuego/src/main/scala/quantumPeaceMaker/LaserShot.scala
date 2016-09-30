package quantumPeaceMaker

import com.uqbar.vainilla.GameComponent
import com.uqbar.vainilla.DeltaState
import ar.pablitar.vainilla.commons.components.SpeedyComponent
import com.uqbar.vainilla.appearances.Circle
import java.awt.Color
import java.awt.Rectangle

class LaserShot(scene: QuantumPeaceMakerScene, x: Double, y: Double, xSpeed:Double) extends SpeedyComponent[QuantumPeaceMakerScene]{

  val ancho = 10
  val alto = 20

  //val pelotitas = new Circle(Color.YELLOW, 20)
  //val laserShot = new Rectangle(Color.BLACK, 10, 20)
  val laserShotSprite = Resources.laserShotSprite
  
  this.setAppearance(laserShotSprite)
  this.setScene(scene)
  this.setX(x)
  this.setY(y)
  
  var impacts = 0
  def maxImpacts = 1
 
  val x1 = this.position.x1.toInt
  val y1 = this.position.x2.toInt
 // var rec = new Rectangle(x1,y1,ancho,alto)
  
  //asigna la velocidad de el disparo
  this.speed = (xSpeed, -400.0)
  
  override def update(state: DeltaState) = {
    super.update(state)
    if (Collision.isCollisionE(this, ControllerTheCollision.enemigos)){
      print("Hay collision")
      getScene.removeComponent(this)
    }
    applySpeed(state)
    if (isOutsideOfTheScreen){
      this.destroy
      //ControllerTheCollision.removeLaser(this)

    }
  }  
  
  def isOutsideOfTheScreen: Boolean = {
    (this.position.x2 < -650)
  }
 
}