package org.webrtc;

import X.AnonymousClass7TE;

public class TurnCustomizer {
    public long nativeTurnCustomizer;

    public static native void nativeFreeTurnCustomizer(long j);

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer == 0) {
            throw AnonymousClass7TE.A0z("TurnCustomizer has been disposed.");
        }
    }

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
