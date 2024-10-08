package X;

import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

public final class WKY implements C263874Nr {
    public WeakReference A00;
    public final AnonymousClass4OR A01;
    public final C263974Ob A02;
    public final Integer A03 = AnonymousClass05K.A08;

    public WKY(C255653uU r5, WeakReference weakReference) {
        String str;
        0qQ.A0B(r5, 1);
        this.A00 = weakReference;
        0bb r2 = new 0bb();
        r2.A05("media_id", Long.valueOf(V6M.A00(r5.A0G)));
        r2.A01(AnonymousClass4OQ.ORGANIC, C66579MXk.A00(405));
        r2.A06(C66579MXk.A00(288), MediaStreamTrack.VIDEO_TRACK_KIND);
        r2.A06("player_format", "inline");
        r2.A06(AnonymousClass000.A00(5120), r5.A0A);
        r2.A06("player_suborigin", r5.A0B);
        this.A01 = r2;
        0bb r22 = new 0bb();
        C255623uR r0 = r5.A07;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                str = "dash";
                r22.A06(C66579MXk.A00(1191), str);
                this.A02 = r22;
            } else if (ordinal == 2) {
                str = "progressive";
                r22.A06(C66579MXk.A00(1191), str);
                this.A02 = r22;
            }
        }
        str = null;
        r22.A06(C66579MXk.A00(1191), str);
        this.A02 = r22;
    }

    public final /* synthetic */ C263974Ob BH9(String str) {
        return null;
    }

    public final AnonymousClass4MB BO6() {
        return null;
    }

    public final Integer BSo() {
        return this.A03;
    }

    public final AnonymousClass4OR BnS() {
        return this.A01;
    }

    public final /* synthetic */ C60340gF EZp(C263974Ob r2, String str) {
        return null;
    }
}
