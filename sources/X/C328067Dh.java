package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7Dh  reason: invalid class name and case insensitive filesystem */
public final class C328067Dh extends C328077Di {
    public final Context A00;
    public final AnonymousClass7DX A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C328067Dh(android.view.View r13, X.AnonymousClass7DX r14, X.AnonymousClass7DS r15, X.AnonymousClass7DU r16, X.AnonymousClass7DW r17, X.C333107Xr r18, java.lang.Object r19, boolean r20, boolean r21, boolean r22) {
        /*
            r12 = this;
            r0 = 1
            r3 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 2
            r4 = r16
            X.0qQ.A0B(r4, r0)
            r0 = 3
            r5 = r17
            X.0qQ.A0B(r5, r0)
            r0 = 5
            r6 = r18
            X.0qQ.A0B(r6, r0)
            r0 = 7
            r1 = r13
            X.0qQ.A0B(r13, r0)
            r7 = 0
            r0 = r12
            r2 = r14
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328067Dh.<init>(android.view.View, X.7DX, X.7DS, X.7DU, X.7DW, X.7Xr, java.lang.Object, boolean, boolean, boolean):void");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass7FU r0 = (AnonymousClass7FU) this.A00;
        if (r0 != null && r0.ARU()) {
            super.onLongPress(motionEvent);
        }
    }

    public C328067Dh(View view, AnonymousClass7DX r14, AnonymousClass7DS r15, AnonymousClass7DU r16, AnonymousClass7DW r17, C333107Xr r18, C3266177m r19, Object obj, boolean z, boolean z2, boolean z3) {
        super(view, (AnonymousClass7XA) r18, new C328097Dk(view, r15, r16, r17, r19, obj, z3), z, z2);
        this.A01 = r14;
        Context context = view.getContext();
        0qQ.A07(context);
        this.A00 = context;
    }
}
