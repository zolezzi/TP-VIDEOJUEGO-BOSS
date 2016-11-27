package quantumPeaceMaker

import com.uqbar.vainilla.appearances.Sprite
import com.uqbar.vainilla.appearances.Animation
import com.uqbar.vainilla.sound.SoundBuilder

object Resources {

  val spriteSize = 200
  val scale = 0.8

  def spriteHeight = (200 * scale).toInt
  def spriteWidth = (200 * scale).toInt
  
  //val spriteExplosion = Sprite.fromImage("explosion.png").center()
  
  val enemySprite = Sprite.fromImage("enemy.png").center()
  
  val laserShotSprite = Sprite.fromImage("LaserShot.png").center()
  
  val quantumShip = Sprite.fromImage("QuantumShip.png").center()
  
  val planetSprite = Sprite.fromImage("planet.png").center()
  
  val laserSound = new SoundBuilder().buildSound(this.getClass.getClassLoader.getResourceAsStream("laser.wav"))
  
  
}