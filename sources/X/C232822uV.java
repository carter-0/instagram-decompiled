package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.2uV  reason: invalid class name and case insensitive filesystem */
public final class C232822uV {
    public static final C232822uV A04;
    public static final C232822uV A05;
    public static final C232822uV A06;
    public static final C232822uV A07;
    public static final C232822uV A08;
    public static final C232822uV A09;
    public static final C232822uV A0A = new C232822uV(C232812uU.SLIDE_IN, 0, 0, false);
    public static final C232822uV A0B;
    public static final C232822uV A0C;
    public final int A00;
    public final int A01;
    public final C232812uU A02;
    public final boolean A03;

    static {
        C232812uU r6 = C232812uU.SLIDE_OUT;
        A08 = new C232822uV(r6, 5000, -1, false);
        A07 = new C232822uV(r6, 5000, 5000, false);
        A0C = new C232822uV(r6, 0, -1, false);
        A0B = new C232822uV(r6, 0, 3000, false);
        A09 = new C232822uV(r6, 5000, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, false);
        A05 = new C232822uV(r6, -1, -1, false);
        A06 = new C232822uV(r6, 3000, -1, false);
        A04 = new C232822uV(r6, 0, -1, false);
    }

    public C232822uV(C232812uU r1, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = z;
    }
}
