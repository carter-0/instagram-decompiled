package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.55U  reason: invalid class name */
public final class AnonymousClass55U {
    public static final AnonymousClass55V A09 = new Object();
    public static final AnonymousClass55U A0A = AnonymousClass55V.A01(AnonymousClass55S.A0L, "test failure", (String) null, (Throwable) null);
    public final int A00;
    public final AnonymousClass55S A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Throwable A08;

    public AnonymousClass55U(AnonymousClass55S r3, String str, String str2, String str3, String str4, Throwable th, int i) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(str, 2);
        this.A01 = r3;
        this.A04 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A08 = th;
        this.A05 = str3;
        this.A06 = str4;
        if (str.length() > 400) {
            str = str.substring(0, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
            0qQ.A07(str);
        }
        this.A03 = str;
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorType: ");
        sb.append(r3);
        sb.append(", Reason: ");
        sb.append(str4);
        sb.append(", ErrorMessage: ");
        sb.append(str);
        this.A02 = sb.toString();
    }
}
