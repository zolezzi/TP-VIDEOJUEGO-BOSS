package quantumPeaceMaker

import com.uqbar.vainilla.DesktopGameLauncher
import ar.pablitar.vainilla.commons.math.RectangularBounds

object QuantumPeaceMakerGame extends App{
  val width = 800
  val height = 600
  
  new DesktopGameLauncher(new QuantumPeaceMaker()).launch()
  
  def bounds = RectangularBounds((0.0, 0.0), (width.toDouble, height.toDouble))
  
}