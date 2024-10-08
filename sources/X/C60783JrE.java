package X;

import com.instagram.common.typedurl.ImageUrl;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.JrE  reason: case insensitive filesystem */
public final class C60783JrE extends C62695Kkv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;

    public C60783JrE(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        0qQ.A0B(str, 6);
        C51974G9v.A1Q(str2, str3, str4, str5);
        0qQ.A0B(str6, 11);
        this.A03 = imageUrl;
        this.A08 = num;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A07 = str;
        this.A05 = str2;
        this.A0A = str3;
        this.A09 = str4;
        this.A04 = str5;
        this.A06 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60783JrE) {
                C60783JrE jrE = (C60783JrE) obj;
                if (!0qQ.A0K(this.A03, jrE.A03) || this.A08 != jrE.A08 || this.A01 != jrE.A01 || this.A02 != jrE.A02 || this.A00 != jrE.A00 || !0qQ.A0K(this.A07, jrE.A07) || !0qQ.A0K(this.A05, jrE.A05) || !0qQ.A0K(this.A0A, jrE.A0A) || !0qQ.A0K(this.A09, jrE.A09) || !0qQ.A0K(this.A04, jrE.A04) || !0qQ.A0K(this.A06, jrE.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0C = AnonymousClass7TG.A0C(this.A03) * 31;
        Integer num = this.A08;
        if (num != null) {
            i = C63976LGo.A00(num);
        }
        return C41845B3m.A01(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A07, (((((((A0C + i) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ExpressoStickerItem(stickerUri=");
        A1A.append(this.A03);
        A1A.append(", requestedSurface=");
        A1A.append(C63976LGo.A01(this.A08));
        A1A.append(", templateHeight=");
        A1A.append(this.A01);
        A1A.append(", templateWidth=");
        A1A.append(this.A02);
        A1A.append(", fps=");
        A1A.append(this.A00);
        A1A.append(", stickerPackType=");
        A1A.append(this.A07);
        A1A.append(", instructionKeyId=");
        A1A.append(this.A05);
        A1A.append(", stableId=");
        A1A.append(this.A0A);
        A1A.append(", mediaTemplateId=");
        A1A.append(this.A09);
        A1A.append(", accessibilityLabel=");
        A1A.append(this.A04);
        A1A.append(", mediaTemplateName=");
        return C51975G9x.A0i(this.A06, A1A);
    }

    public C60783JrE() {
        this((ImageUrl) null, (Integer) null, "", "", "", "", "", "", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 1);
    }
}
