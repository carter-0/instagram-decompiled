package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.87F  reason: invalid class name */
public final class AnonymousClass87F implements C252213ok {
    public float A00;
    public View A01;
    public boolean A02;
    public final AnonymousClass8Z5 A03;
    public final AnonymousClass3E6 A04;

    public AnonymousClass87F(Context context, AnonymousClass3E6 r3, AnonymousClass8Z3 r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        this.A04 = r3;
        this.A03 = new AnonymousClass8Z5(context, r3, r4);
    }

    public final void A02(View view) {
        this.A02 = false;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final void A03(View view) {
        0qQ.A0B(view, 0);
        this.A01 = view;
        this.A00 = view.getY();
        this.A03.A02 = view;
    }

    public final void A00() {
        this.A04.A9Y(this);
    }

    public final void A01() {
        this.A04.EEH(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3 != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0016
            if (r3 != 0) goto L_0x0018
            android.view.View r0 = r2.A01
            if (r0 == 0) goto L_0x000e
            X.0nA.A0R(r0)
            return
        L_0x000e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0016:
            if (r3 == 0) goto L_0x001b
        L_0x0018:
            r0 = 1
            r2.A02 = r0
        L_0x001b:
            X.8Z5 r0 = r2.A03
            r0.DMr(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87F.DMr(int, boolean):void");
    }
}
