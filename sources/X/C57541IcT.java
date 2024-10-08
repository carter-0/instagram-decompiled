package X;

import android.content.Context;

/* renamed from: X.IcT  reason: case insensitive filesystem */
public final class C57541IcT implements C59561JOh {
    public final Integer A00;

    public C57541IcT(Integer num) {
        0qQ.A0B(num, 1);
        this.A00 = num;
    }

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        C21255XRa xRa;
        C59535JNh jNh2 = jNh;
        boolean A1U = AnonymousClass7TF.A1U(0, context, jNh2);
        C21255XRa xRa2 = C21255XRa.A1r;
        Integer num = AnonymousClass05K.A1I;
        int AKp = C56611I4l.A02(jNh2).AKp(AnonymousClass05K.A0H);
        int A002 = (int) C56611I4l.A00(jNh2, AnonymousClass05K.A0j);
        int A003 = (int) C56611I4l.A00(jNh2, AnonymousClass05K.A0Y);
        C57552Ice ice = new C57552Ice(xRa2, num);
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            xRa = C21255XRa.A0E;
        } else if (intValue == A1U) {
            xRa = C21255XRa.A0G;
        } else if (intValue == 2) {
            xRa = C21255XRa.A0C;
        } else if (intValue == 3) {
            xRa = C21255XRa.A0D;
        } else if (intValue == 4) {
            xRa = C21255XRa.A0F;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A01 = C56611I4l.A01(xRa, jNh2);
        Integer valueOf = Integer.valueOf(A002);
        return new C56138HtQ(ice, valueOf, valueOf, Integer.valueOf(A01), A003, A003, AKp);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C57541IcT) && this.A00 == ((C57541IcT) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, Ky7.A00(num));
    }

    public final String toString() {
        return G9w.A0k("CdsTextBadgeVariant(backgroundColor=", Ky7.A00(this.A00));
    }
}
