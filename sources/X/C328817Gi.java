package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Gi  reason: invalid class name and case insensitive filesystem */
public final class C328817Gi extends 04T implements AnonymousClass3E6, AnonymousClass03Q {
    public Integer A00;
    public int A01;
    public boolean A02;
    public final View A03;
    public final WeakReference A04;
    public final HashSet A05 = new HashSet();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328817Gi(View view) {
        super(1);
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A04 = new WeakReference(view);
        04a.A01(view, this);
        AnonymousClass03j.A00(view, this);
    }

    public final 04k A02(04k r5, List list) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(list, 1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((((04a) next).A00.A06() & 8) != 0) {
                if (next != null) {
                    int A002 = A00(r5);
                    Iterator it2 = this.A05.iterator();
                    0qQ.A07(it2);
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        0qQ.A07(next2);
                        ((C252213ok) next2).DMr(A002, false);
                    }
                    this.A01 = A002;
                }
            }
        }
        return r5;
    }

    public final void A03(04a r2) {
        this.A02 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.04a r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Integer r1 = r4.A00
            if (r1 != 0) goto L_0x0043
            java.lang.ref.WeakReference r0 = r4.A04
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0069
            X.04k r2 = X.C586203k.A00(r0)
            if (r2 == 0) goto L_0x0069
            r0 = 8
            X.04h r1 = r2.A00
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0067
            int r2 = A00(r2)
        L_0x0026:
            r0 = 2
            X.02M r0 = r1.A05(r0)
            int r1 = r0.A00
            android.view.View r0 = r4.A03
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.0lz.A02(r0)
            if (r0 != 0) goto L_0x003d
            int r2 = r2 + r1
        L_0x003d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x0069
        L_0x0043:
            int r0 = r4.A01
            int r2 = r1.intValue()
            if (r2 == r0) goto L_0x0069
            java.util.HashSet r0 = r4.A05
            java.util.Iterator r1 = r0.iterator()
            X.0qQ.A07(r1)
        L_0x0054:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()
            X.0qQ.A07(r0)
            X.3ok r0 = (X.C252213ok) r0
            r0.DMr(r2, r3)
            goto L_0x0054
        L_0x0067:
            r2 = 0
            goto L_0x0026
        L_0x0069:
            r4.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328817Gi.A04(X.04a):void");
    }

    public final 04k Cvn(View view, 04k r6) {
        0qQ.A0B(r6, 1);
        int A002 = A00(r6);
        this.A00 = Integer.valueOf(A002);
        if (!this.A02) {
            Iterator it = this.A05.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                ((C252213ok) next).DMr(A002, false);
            }
            this.A01 = A002;
        }
        return r6;
    }

    public final void Dh2() {
    }

    public final void DmJ(Activity activity) {
    }

    public final void EzL(Activity activity) {
    }

    public final void onStop() {
    }

    public static final int A00(04k r2) {
        04h r22 = r2.A00;
        int i = r22.A05(8).A00 - r22.A05(2).A00;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final void A9Y(C252213ok r2) {
        if (r2 != null) {
            this.A05.add(r2);
        }
    }

    public final void EEH(C252213ok r2) {
        if (r2 != null) {
            this.A05.remove(r2);
        }
    }

    public final boolean isStarted() {
        return false;
    }

    public final void onDestroy() {
        View view = (View) this.A04.get();
        if (view != null) {
            04a.A01(view, (04T) null);
            AnonymousClass03j.A00(view, (AnonymousClass03Q) null);
        }
    }

    public final void EkY(boolean z) {
    }
}
