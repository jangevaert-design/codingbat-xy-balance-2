public class XyBalance2 {
  public boolean xyBalance(String str) {
    int lastIndexOfX = str.lastIndexOf('x');
    int lastIndexOfY = str.lastIndexOf('y');

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x' && lastIndexOfX >= lastIndexOfY) {
        return false;
      }
    }
    return true;
  }
}
