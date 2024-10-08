package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.WnP  reason: case insensitive filesystem */
public final class C20225WnP implements Runnable {
    public final /* synthetic */ C265804Wi A00;
    public final /* synthetic */ AnonymousClass32V A01;

    public C20225WnP(C265804Wi r1, AnonymousClass32V r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        float f;
        int i;
        AnonymousClass32V r4 = this.A01;
        AnonymousClass6Z3 r0 = r4.A01;
        if (r0 != null) {
            r0.DkX();
        }
        C265804Wi r6 = this.A00;
        float[] fArr = new float[2];
        C16145UpW A002 = r6.A00();
        AnonymousClass0eM r8 = A002.A0F;
        U1V u1v = (U1V) r8.getValue();
        Rect bounds = u1v.getBounds();
        float intrinsicWidth = (float) u1v.A0O.getIntrinsicWidth();
        boolean z = u1v.A09;
        float f2 = u1v.A03;
        float width = (float) bounds.width();
        if (z) {
            f = (f2 * (width - intrinsicWidth)) + (intrinsicWidth / 2.0f);
        } else {
            f = f2 * width;
        }
        fArr[0] = f;
        fArr[1] = (float) (JTP.A06(u1v) / 2);
        fArr[0] = fArr[0] + ((float) A002.A05);
        float intrinsicHeight = (fArr[1] + ((float) A002.getIntrinsicHeight())) - ((float) JTT.A09(r8));
        if (A002.A0B.A02().length() == 0) {
            i = A002.A04;
        } else {
            i = A002.A03;
        }
        fArr[1] = intrinsicHeight - ((float) i);
        fArr[0] = fArr[0] - ((float) (r6.A00().A0A / 2));
        fArr[1] = (fArr[1] - ((float) (r6.A00().getIntrinsicHeight() / 2))) + ((float) r4.A03);
        Context context = r4.A04;
        AnonymousClass5Gt r3 = new AnonymousClass5Gt((Activity) context, new C315476jx((CharSequence) AnonymousClass7TE.A16(context, 2131974004)));
        r3.A04(r6.A06, (int) fArr[0], (int) fArr[1], true);
        r3.A0F = true;
        r3.A04 = new NdO(r4, 4);
        AnonymousClass5Gv A003 = r3.A00();
        r4.A00 = A003;
        r4.A02 = true;
        A003.A06();
    }
}
