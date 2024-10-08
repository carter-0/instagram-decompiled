package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.PXK  reason: case insensitive filesystem */
public final class C73126PXK implements Runnable {
    public final /* synthetic */ PMJ A00;

    public C73126PXK(PMJ pmj) {
        this.A00 = pmj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    public final void run() {
        PMJ pmj = this.A00;
        ? r6 = pmj.A0C;
        0qQ.A07(r6);
        OK5 ok5 = pmj.A01;
        View view = pmj.A05;
        Context context = view.getContext();
        C315476jx r0 = new C315476jx((CharSequence) AnonymousClass7TE.A16(context, 2131956813));
        C66580MXl.A1R(view);
        AnonymousClass5Gt r2 = new AnonymousClass5Gt(context, (ViewGroup) view, r0);
        r2.A03(r6);
        r2.A0F = false;
        r2.A04 = new NdO(ok5, 7);
        r2.A01();
        AnonymousClass5Gv A002 = r2.A00();
        pmj.A00 = A002;
        A002.A07(pmj.A0B);
    }
}
