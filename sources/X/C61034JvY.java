package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import java.io.File;

/* renamed from: X.JvY  reason: case insensitive filesystem */
public final class C61034JvY extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C61034JvY(C361278fx r2, VoiceOption voiceOption, String str, String str2, String str3, int i) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(voiceOption, 6);
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = r2;
        this.A01 = i;
        this.A03 = voiceOption;
    }

    public final String A00() {
        C361278fx r1 = (C361278fx) this.A02;
        if (r1 instanceof AnonymousClass8Y4) {
            return ((File) r1.A00()).getPath();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        C61034JvY jvY;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61034JvY)) {
                    return false;
                }
                jvY = (C61034JvY) obj;
                if (jvY.A00 != 0 || !0qQ.A0K(this.A04, jvY.A04) || !0qQ.A0K(this.A06, jvY.A06) || !0qQ.A0K(this.A05, jvY.A05) || !0qQ.A0K(this.A02, jvY.A02) || this.A01 != jvY.A01) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61034JvY)) {
                    return false;
                }
                C61034JvY jvY2 = (C61034JvY) obj;
                if (jvY2.A00 != 1 || !0qQ.A0K(this.A04, jvY2.A04) || !0qQ.A0K(this.A05, jvY2.A05) || !0qQ.A0K(this.A06, jvY2.A06) || !0qQ.A0K(this.A02, jvY2.A02) || this.A01 != jvY2.A01 || this.A03 != jvY2.A03) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61034JvY)) {
                    return false;
                }
                jvY = (C61034JvY) obj;
                if (jvY.A00 != 2 || !0qQ.A0K(this.A05, jvY.A05) || !0qQ.A0K(this.A02, jvY.A02) || this.A01 != jvY.A01 || !0qQ.A0K(this.A06, jvY.A06) || !0qQ.A0K(this.A04, jvY.A04)) {
                    return false;
                }
        }
        if (!0qQ.A0K(this.A03, jvY.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07;
        int A002;
        switch (this.A00) {
            case 0:
                A07 = (AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A04)))) + this.A01) * 31;
                break;
            case 1:
                A07 = (((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04)) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A01) * 31;
                A002 = C69907Nu9.A00((Integer) this.A03);
                break;
            default:
                A07 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A06, (((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A01) * 31));
                break;
        }
        A002 = this.A03.hashCode();
        return A07 + A002;
    }

    public C61034JvY(C300925yB r2, Integer num, String str, String str2, String str3, int i) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = r2;
        this.A01 = i;
        this.A03 = num;
    }

    public C61034JvY(ImageUrl imageUrl, Long l, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A02 = l;
        this.A01 = i;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = imageUrl;
    }
}
