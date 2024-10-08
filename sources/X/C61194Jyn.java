package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Jyn  reason: case insensitive filesystem */
public final class C61194Jyn extends AnonymousClass0T0 implements MVO {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C61080JwI A06;
    public final N49 A07;
    public final C60997Jut A08;
    public final C62529KhL A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final int A0E;

    public final C61194Jyn A03(int i, int i2, int i3, int i4) {
        return A00((C61080JwI) null, (N49) null, (C60997Jut) null, this, (Integer) null, (String) null, i, i2, i3, i4, 32647, false);
    }

    public final C61194Jyn A04(boolean z) {
        Integer num;
        C62529KhL khL;
        boolean z2 = z;
        if (z || this.A0A == AnonymousClass05K.A15 || (khL = this.A09) == C62529KhL.MUSIC || khL == C62529KhL.VOICEOVER) {
            num = this.A0A;
        } else {
            num = AnonymousClass05K.A00;
        }
        return A00((C61080JwI) null, (N49) null, (C60997Jut) null, this, num, (String) null, 0, 0, 0, 0, 32383, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61194Jyn) {
                C61194Jyn jyn = (C61194Jyn) obj;
                if (!(0qQ.A0K(this.A0B, jyn.A0B) && this.A09 == jyn.A09 && 0qQ.A0K(this.A0C, jyn.A0C) && this.A05 == jyn.A05 && this.A02 == jyn.A02 && this.A04 == jyn.A04 && this.A03 == jyn.A03 && this.A0D == jyn.A0D && this.A0A == jyn.A0A && this.A0E == jyn.A0E && this.A01 == jyn.A01 && this.A00 == jyn.A00 && 0qQ.A0K(this.A07, jyn.A07) && 0qQ.A0K(this.A06, jyn.A06) && 0qQ.A0K(this.A08, jyn.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C61194Jyn A00(C61080JwI jwI, N49 n49, C60997Jut jut, C61194Jyn jyn, Integer num, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        String str2;
        int i6;
        boolean z2;
        int i7;
        C60997Jut jut2 = jut;
        C61080JwI jwI2 = jwI;
        N49 n492 = n49;
        Integer num2 = num;
        boolean z3 = z;
        int i8 = i4;
        int i9 = i3;
        int i10 = i2;
        int i11 = i;
        String str3 = str;
        C62529KhL khL = null;
        int i12 = i5;
        C61194Jyn jyn2 = jyn;
        if ((i5 & 1) != 0) {
            str2 = jyn2.A0B;
        } else {
            str2 = null;
        }
        if ((i5 & 2) != 0) {
            khL = jyn2.A09;
        }
        if ((i5 & 4) != 0) {
            str3 = jyn2.A0C;
        }
        if ((i5 & 8) != 0) {
            i11 = jyn2.A05;
        }
        if ((i5 & 16) != 0) {
            i10 = jyn2.A02;
        }
        if ((i5 & 32) != 0) {
            i9 = jyn2.A04;
        }
        if ((i5 & 64) != 0) {
            i8 = jyn2.A03;
        }
        if ((i12 & 128) != 0) {
            z3 = jyn2.A0D;
        }
        if ((i12 & 256) != 0) {
            num2 = jyn2.A0A;
        }
        if ((i12 & 512) != 0) {
            i6 = jyn2.A0E;
        } else {
            i6 = 0;
        }
        if ((i12 & 1024) != 0) {
            z2 = jyn2.A01;
        } else {
            z2 = false;
        }
        if ((i12 & C249703kE.FLAG_MOVED) != 0) {
            i7 = jyn2.A00;
        } else {
            i7 = 0;
        }
        if ((i12 & 4096) != 0) {
            n492 = jyn2.A07;
        }
        if ((i12 & 8192) != 0) {
            jwI2 = jyn2.A06;
        }
        if ((i12 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            jut2 = jyn2.A08;
        }
        AnonymousClass7TG.A1T(str2, khL, str3);
        0qQ.A0B(num2, 8);
        return new C61194Jyn(jwI2, n492, jut2, khL, num2, str2, str3, i11, i10, i9, i8, i6, i7, z3, z2);
    }

    public static List A02(C61194Jyn jyn) {
        return 0sr.A1P(new Integer[]{Integer.valueOf(jyn.A05), Integer.valueOf(jyn.A02)});
    }

    public final /* synthetic */ boolean Ayv() {
        return AnonymousClass7TF.A1W(this.A0A, AnonymousClass05K.A01);
    }

    public final boolean BrY() {
        return this.A0D;
    }

    public final C62529KhL CAX() {
        return this.A09;
    }

    public final Integer CFq() {
        return this.A0A;
    }

    public final String getTitle() {
        return this.A0C;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A09, AnonymousClass7TE.A0O(this.A0B));
        int A092 = AnonymousClass7TF.A09(this.A0D, (((((((AnonymousClass7TF.A08(this.A0C, A072) + this.A05) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31);
        Integer num = this.A0A;
        return ((((((AnonymousClass7TF.A09(this.A01, (AnonymousClass7TG.A0B(num, C63166KsZ.A00(num), A092) + this.A0E) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public C61194Jyn(C61080JwI jwI, N49 n49, C60997Jut jut, C62529KhL khL, Integer num, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(str, khL, str2);
        this.A0B = str;
        this.A09 = khL;
        this.A0C = str2;
        this.A05 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A0D = z;
        this.A0A = num;
        this.A0E = i5;
        this.A01 = z2;
        this.A00 = i6;
        this.A07 = n49;
        this.A06 = jwI;
        this.A08 = jut;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TimedElementModel(id=");
        A1A.append(this.A0B);
        A1A.append(", type=");
        A1A.append(this.A09);
        A1A.append(", title=");
        A1A.append(this.A0C);
        A1A.append(AnonymousClass000.A00(4293));
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI));
        A1A.append(this.A02);
        A1A.append(", originalStartTimeMs=");
        A1A.append(this.A04);
        A1A.append(", originalEndTimeMs=");
        A1A.append(this.A03);
        A1A.append(", selected=");
        A1A.append(this.A0D);
        A1A.append(", visualState=");
        Integer num = this.A0A;
        if (num != null) {
            str = C63166KsZ.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", z=");
        A1A.append(this.A0E);
        A1A.append(", hiddenRefactor=");
        A1A.append(this.A01);
        A1A.append(", textTracktitleViewExtraFrontPadding=");
        A1A.append(this.A00);
        A1A.append(", voiceMetadata=");
        A1A.append(this.A07);
        A1A.append(", drawableMetadata=");
        A1A.append(this.A06);
        A1A.append(", audioTrackMetadata=");
        return AnonymousClass7TG.A0n(this.A08, A1A);
    }
}
