package X;

import java.util.List;
import org.webrtc.CameraCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.5ZD  reason: invalid class name */
public final class AnonymousClass5ZD implements Comparable {
    public static final AnonymousClass5ZD A01;
    public static final AnonymousClass5ZD A02;
    public static final AnonymousClass5ZD A03;
    public static final AnonymousClass5ZD A04;
    public static final AnonymousClass5ZD A05;
    public static final AnonymousClass5ZD A06;
    public static final AnonymousClass5ZD A07;
    public static final AnonymousClass5ZD A08;
    public static final AnonymousClass5ZD A09;
    public static final AnonymousClass5ZD A0A;
    public static final AnonymousClass5ZD A0B;
    public static final AnonymousClass5ZD A0C;
    public static final AnonymousClass5ZD A0D;
    public static final AnonymousClass5ZD A0E;
    public static final AnonymousClass5ZD A0F;
    public static final AnonymousClass5ZD A0G;
    public static final AnonymousClass5ZD A0H;
    public static final AnonymousClass5ZD A0I;
    public static final List A0J;
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5ZD) && this.A00 == ((AnonymousClass5ZD) obj).A00);
    }

    static {
        AnonymousClass5ZD r1 = new AnonymousClass5ZD(100);
        A0B = r1;
        AnonymousClass5ZD r2 = new AnonymousClass5ZD(200);
        A0C = r2;
        AnonymousClass5ZD r3 = new AnonymousClass5ZD(300);
        A0D = r3;
        AnonymousClass5ZD r4 = new AnonymousClass5ZD(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        A0E = r4;
        AnonymousClass5ZD r5 = new AnonymousClass5ZD(CameraCapturer.OPEN_CAMERA_DELAY_MS);
        A0F = r5;
        AnonymousClass5ZD r6 = new AnonymousClass5ZD(600);
        A06 = r6;
        AnonymousClass5ZD r7 = new AnonymousClass5ZD(700);
        A0G = r7;
        AnonymousClass5ZD r8 = new AnonymousClass5ZD(800);
        A0H = r8;
        AnonymousClass5ZD r9 = new AnonymousClass5ZD(900);
        A0I = r9;
        A0A = r1;
        A08 = r2;
        A09 = r3;
        A04 = r4;
        A03 = r5;
        A05 = r6;
        A01 = r7;
        A02 = r8;
        A07 = r9;
        A0J = 0sr.A1P(new AnonymousClass5ZD[]{r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(this.A00, ((AnonymousClass5ZD) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("FontWeight(weight=", ')', this.A00);
    }

    public AnonymousClass5ZD(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw new IllegalArgumentException(002.A0O("Font weight can be in range [1, 1000]. Current value: ", i));
        }
    }
}
