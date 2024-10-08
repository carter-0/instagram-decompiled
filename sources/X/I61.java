package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public abstract class I61 {
    public static Drawable A03(C70832Wc r1, HNN hnn) {
        0qQ.A0B(r1, 0);
        return A04(r1, hnn, (HNN) null, (Integer) null);
    }

    public static final int A00(C70832Wc r1, HNO hno) {
        AnonymousClass7TG.A1N(r1, hno);
        C59535JNh A01 = I3I.A01(r1);
        return I41.A00(A01).EIY(hno, A01.CRB());
    }

    public static final int A01(C70832Wc r0, Integer num) {
        return I41.A00(I3I.A00(r0)).EIZ(num);
    }

    public static long A02(C70832Wc r0, Integer num) {
        return Double.doubleToRawLongBits((double) A01(r0, num));
    }

    public static final Drawable A04(C70832Wc r4, HNN hnn, HNN hnn2, Integer num) {
        boolean A1Z = AnonymousClass7TG.A1Z(r4, hnn);
        Object A06 = r4.Aqq().A06(C56129HtH.class);
        if (A06 != null) {
            C59584JPe jPe = ((C56129HtH) A06).A01;
            boolean z = true;
            if (C51969G9p.A0M(r4).getConfiguration().getLayoutDirection() != A1Z) {
                z = false;
            }
            if (hnn2 != null && z) {
                hnn = hnn2;
            }
            int BEJ = jPe.BEJ(hnn);
            Drawable drawable = C243803a8.A00(r4).getDrawable(BEJ);
            if (drawable == null) {
                throw DbW.A0b("Unable to find the drawable for icon ", BEJ);
            } else if (num == null) {
                return drawable;
            } else {
                Drawable mutate = drawable.mutate();
                C51969G9p.A12(PorterDuff.Mode.SRC_IN, mutate, num.intValue());
                return mutate;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }
}
