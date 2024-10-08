package X;

import java.io.IOException;

public final class RCX extends IOException {
    public RCX() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
