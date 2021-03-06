package quantumPeaceMaker


import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.GameComponent
import ar.pablitar.vainilla.commons.math.Vector2D

trait RichGameComponent[T <: GameScene] extends GameComponent[T] {

  def isOutsideOfTheScreen: Boolean = {
    this.isAtLeftOfTheScreen || this.isAtRightOfTheScreen ||
      this.isOverTheScreen || this.isBelowTheScreen
  }

  def leftBorder = this.getX - this.getAppearance().getWidth() / 2
  def rightBorder = this.getX + this.getAppearance().getWidth() / 2
  def topBorder = this.getY - this.getAppearance().getHeight() / 2
  def bottomBorder = this.getY + this.getAppearance().getHeight() / 2

  def isBelowTheScreen: Boolean = {
    this.topBorder >= this.getGame().getDisplayHeight()
  }

  def isOverTheScreen: Boolean = {
    this.bottomBorder <= 0
  }

  def isAtRightOfTheScreen: Boolean = {
    this.leftBorder >= this.getGame().getDisplayWidth()
  }

  def isAtLeftOfTheScreen: Boolean = {
    this.rightBorder <= 0
  }
  
  def initializeFrom(component:GameComponent[T]) = {
   // this.setScene(component.getScene)
    this.setX(component.getX)
    this.setY(component.getY)
  }

  def getWidth = this.getAppearance.getWidth
  def getHeight = this.getAppearance.getHeight
  
   def position_=(position: Vector2D) = {
    this.setX(position.x1)
    this.setY(position.x2)
  }

  def position: Vector2D = (getX, getY)

}