package X;

import java.io.IOException;

public final class RCR extends IOException {
    public RCR() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
