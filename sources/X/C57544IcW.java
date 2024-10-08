package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.IcW  reason: case insensitive filesystem */
public final class C57544IcW implements C59561JOh {
    public final C21255XRa A00;
    public final C56060Hs9 A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        float f;
        float AKp;
        C54718HPx hhp;
        C54717HPw hPw;
        Integer num;
        String str;
        boolean A1U = AnonymousClass7TF.A1U(0, context, jNh);
        Integer num2 = this.A03;
        Integer num3 = AnonymousClass05K.A00;
        boolean A1W = AnonymousClass7TF.A1W(num2, num3);
        Integer num4 = this.A02;
        int A002 = C56361HxE.A00(num4);
        if (A002 <= 60) {
            f = 2.0f;
        } else {
            f = 6.0f;
            if (A002 <= 100) {
                f = 4.0f;
            }
        }
        boolean z = this.A04;
        int A003 = C56361HxE.A00(num4);
        if (z) {
            A003 += (int) f;
        }
        if (A1W) {
            AKp = ((float) A003) / 2.0f;
        } else {
            Integer num5 = AnonymousClass05K.A1F;
            if (C56611I4l.A02(jNh).AVl(num5)) {
                switch (num4.intValue()) {
                    case 0:
                    case 1:
                        num5 = AnonymousClass05K.A0F;
                        break;
                    case 2:
                    case 3:
                        num5 = AnonymousClass05K.A0E;
                        break;
                    case 4:
                    case 5:
                        num5 = AnonymousClass05K.A0D;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        num5 = AnonymousClass05K.A0G;
                        break;
                    default:
                        throw AnonymousClass7TE.A1K();
                }
            }
            AKp = (float) C56611I4l.A02(jNh).AKp(num5);
        }
        if (num2 == num3) {
            hhp = HHQ.A00;
        } else {
            hhp = new HHP(AKp);
        }
        int A012 = C56611I4l.A01(C21255XRa.A0R, jNh);
        if (z) {
            hPw = new HHN(A012, f);
        } else {
            hPw = HHO.A00;
        }
        C21255XRa xRa = this.A00;
        if (xRa != null) {
            num = Integer.valueOf(C56611I4l.A01(xRa, jNh));
        } else {
            num = null;
        }
        if (num2 == num3) {
            str = "Actor";
        } else {
            str = "Non Actor";
        }
        String A0R = 002.A0R("CdsProfilePhotoVariant - ", str);
        int i = ((int) (((f + 0.5f) * AnonymousClass7TF.A0E(context).density) + 0.5f)) - 1;
        int i2 = (int) ((AnonymousClass7TF.A0E(context).density * 0.5f) + 0.5f);
        if (!z) {
            i = i2;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        int intValue = num2.intValue();
        if (intValue == 0) {
            gradientDrawable.setShape(A1U ? 1 : 0);
        } else if (intValue == A1U) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((float) ((int) ((AKp * AnonymousClass7TF.A0E(context).density) + 0.5f)));
        } else {
            throw AnonymousClass7TE.A1K();
        }
        gradientDrawable.setStroke(i, C56611I4l.A01(C21255XRa.A1H, jNh));
        return new C56137HtP(gradientDrawable, this.A01, hPw, hhp, num, A0R, A003);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57544IcW) {
                C57544IcW icW = (C57544IcW) obj;
                if (!(this.A03 == icW.A03 && this.A00 == icW.A00 && this.A02 == icW.A02 && this.A04 == icW.A04 && 0qQ.A0K(this.A01, icW.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "ACTOR";
        } else {
            str = "NON_ACTOR";
        }
        int A0F = (C51968G9o.A0F(str, intValue) + AnonymousClass7TG.A0C(this.A00)) * 31;
        Integer num = this.A02;
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TG.A0B(num, C56361HxE.A01(num), A0F)) + AnonymousClass7TE.A0L(this.A01);
    }

    public C57544IcW(C21255XRa xRa, C56060Hs9 hs9, Integer num, Integer num2, boolean z) {
        AnonymousClass7TG.A1P(num, num2);
        this.A03 = num;
        this.A00 = xRa;
        this.A02 = num2;
        this.A04 = z;
        this.A01 = hs9;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsProfilePhotoVariant(photoStyle=");
        if (1 - this.A03.intValue() != 0) {
            str = "ACTOR";
        } else {
            str = "NON_ACTOR";
        }
        A1A.append(str);
        A1A.append(", backgroundColor=");
        A1A.append(this.A00);
        A1A.append(Pxd.A00(327));
        A1A.append(C56361HxE.A01(this.A02));
        A1A.append(", hasBorder=");
        A1A.append(this.A04);
        A1A.append(", badgeAddOn=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
