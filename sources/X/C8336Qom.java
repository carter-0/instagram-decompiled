package X;

import java.util.HashMap;

/* renamed from: X.Qom  reason: case insensitive filesystem */
public final class C8336Qom extends C11335SNp {
    public double A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("hitType", this.A01);
        A1E.put("clientId", this.A02);
        A1E.put("userId", this.A03);
        A1E.put("androidAdId", this.A04);
        A1E.put("AdTargetingEnabled", Boolean.valueOf(this.A06));
        A1E.put("sessionControl", this.A05);
        A1E.put("nonInteraction", Boolean.valueOf(this.A07));
        return C11335SNp.A01("sampleRate", Double.valueOf(this.A00), A1E);
    }
}
