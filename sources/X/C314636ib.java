package X;

import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.6ib  reason: invalid class name and case insensitive filesystem */
public final class C314636ib implements C252213ok {
    public boolean A00;
    public TextView A01;
    public final ViewStub A02;

    public C314636ib(ViewStub viewStub, AnonymousClass3E6 r3) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(r3, 2);
        this.A02 = viewStub;
        r3.A9Y(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass17L r5, boolean r6) {
        /*
            r4 = this;
            r2 = 0
            r0 = 1
            r4.A00 = r0
            android.widget.TextView r1 = r4.A01
            if (r1 != 0) goto L_0x0019
            android.view.ViewStub r0 = r4.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.A01 = r1
            if (r1 == 0) goto L_0x001c
        L_0x0019:
            r1.setBackgroundColor(r2)
        L_0x001c:
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L_0x0033
            r0 = 0
            if (r6 == 0) goto L_0x004c
            android.content.res.Resources r1 = r3.getResources()
            if (r1 == 0) goto L_0x0030
            r0 = 2131971029(0x7f134bd5, float:1.9579026E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0030:
            r3.setText(r0)
        L_0x0033:
            boolean r0 = X.C61670oa.A0H()
            if (r0 == 0) goto L_0x004b
            android.widget.TextView r2 = r4.A01
            if (r2 == 0) goto L_0x004b
            android.content.Context r1 = r2.getContext()
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
        L_0x004b:
            return
        L_0x004c:
            android.content.res.Resources r2 = r3.getResources()
            if (r2 == 0) goto L_0x0030
            r1 = 2131971044(0x7f134be4, float:1.9579056E38)
            java.lang.String r0 = r5.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314636ib.A00(X.17L, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 <= 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r5, boolean r6) {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L_0x0029
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x000b
            r0 = 0
            if (r5 > 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r3.setVisibility(r0)
            if (r6 == 0) goto L_0x0029
            android.content.Context r0 = r3.getContext()
            X.0qQ.A07(r0)
            int r2 = X.0nA.A08(r0)
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.LYw r0 = new X.LYw
            r0.<init>(r3, r2, r5)
            r1.addOnGlobalLayoutListener(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314636ib.DMr(int, boolean):void");
    }
}
