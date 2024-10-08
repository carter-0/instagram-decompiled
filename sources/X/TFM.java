package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

public final class TFM implements Runnable {
    public final /* synthetic */ InstantExperiencesJSBridgeCall A00;
    public final /* synthetic */ SIB A01;

    public TFM(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, SIB sib) {
        this.A01 = sib;
        this.A00 = instantExperiencesJSBridgeCall;
    }

    public final void run() {
        SIB.A00(this.A00, this.A01);
    }
}
