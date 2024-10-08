package X;

import android.content.Context;

/* renamed from: X.IcV  reason: case insensitive filesystem */
public final class C57543IcV implements C59561JOh {
    public final C55667HlQ A00;
    public final C59581JPb A01;
    public final C59581JPb A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57543IcV) {
                C57543IcV icV = (C57543IcV) obj;
                if (!0qQ.A0K(this.A02, icV.A02) || !0qQ.A0K(this.A01, icV.A01) || !0qQ.A0K(this.A00, icV.A00) || this.A03 != icV.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0C = ((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = C56362HxF.A00(num);
        }
        return A0C + i;
    }

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        int A002;
        C59535JNh jNh2 = jNh;
        AnonymousClass7TG.A1N(context, jNh2);
        Integer num = this.A03;
        if (num == null) {
            num = AnonymousClass05K.A00;
        }
        C55667HlQ hlQ = this.A00;
        if (hlQ == null) {
            A002 = 0;
        } else {
            A002 = (int) C56611I4l.A00(jNh2, AnonymousClass05K.A0P);
        }
        C57552Ice ice = new C57552Ice(C21255XRa.A1r, AnonymousClass05K.A15);
        C21255XRa xRa = C21255XRa.A2B;
        Integer num2 = AnonymousClass05K.A00;
        C57552Ice ice2 = new C57552Ice(xRa, num2);
        C57552Ice ice3 = new C57552Ice(xRa, AnonymousClass05K.A0j);
        Integer num3 = AnonymousClass05K.A01;
        return new C56148Hta(hlQ, this.A02, this.A01, new C57550Icc(num2, num3, num3), ice, ice2, ice3, 5, 5, 5, 5, 5, 5, num, num3, A002);
    }

    public C57543IcV(C55667HlQ hlQ, C59581JPb jPb, C59581JPb jPb2, Integer num) {
        this.A02 = jPb;
        this.A01 = jPb2;
        this.A00 = hlQ;
        this.A03 = num;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsListCellVariant(headlineMaxLinesOverride=");
        A1A.append((Object) null);
        A1A.append(", headlineTextColorOverride=");
        A1A.append((Object) null);
        A1A.append(", bodyMaxLinesOverride=");
        A1A.append((Object) null);
        A1A.append(", bodyTextColorOverride=");
        A1A.append((Object) null);
        A1A.append(", metaMaxLinesOverride=");
        A1A.append((Object) null);
        A1A.append(", metaTextColorOverride=");
        A1A.append((Object) null);
        A1A.append(", startAddOn=");
        A1A.append(this.A02);
        A1A.append(", endAddOn=");
        A1A.append(this.A01);
        A1A.append(", badge=");
        A1A.append(this.A00);
        A1A.append(", startAddOnVerticalAlignmentOverride=");
        return C51975G9x.A0i(C56362HxF.A01(this.A03), A1A);
    }
}
