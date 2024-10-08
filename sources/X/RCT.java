package X;

import java.io.IOException;

public final class RCT extends IOException {
    public RCT() {
        super("Unexpectedly reached end of a file");
    }
}
