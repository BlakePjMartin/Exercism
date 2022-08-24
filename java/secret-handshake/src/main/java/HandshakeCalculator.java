import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> signals = new ArrayList<Signal>();
        int curPos = 1;

        int curVal = number;
        int quotient = curVal / 2;
        int remainder = curVal % 2;
        boolean flipOrder = false;

        while ( curPos <= 5 && (quotient != 0 || remainder != 0) ) {
            if ( remainder == 1 ) {
                switch (curPos) {
                    case 1:
                        signals.add(Signal.WINK);
                        break;
                    case 2:
                        signals.add(Signal.DOUBLE_BLINK);
                        break;
                    case 3:
                        signals.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 4:
                        signals.add(Signal.JUMP);
                        break;
                    case 5:
                        flipOrder = true;
                        break;
                    default:
                        break;
                }
            }
            curVal = quotient;
            quotient = curVal / 2;
            remainder = curVal % 2;
            curPos++;
        }

        if ( flipOrder ) {
            Collections.reverse(signals);
        }

        return signals;
    }

    public static void main(String[] args) {
        HandshakeCalculator hc = new HandshakeCalculator();
        hc.calculateHandshake(1);
    }

}
