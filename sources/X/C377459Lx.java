package X;

import android.view.MotionEvent;

/* renamed from: X.9Lx  reason: invalid class name and case insensitive filesystem */
public final class C377459Lx extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = obj4;
        Object obj6 = obj3;
        Object obj7 = obj2;
        if (this.A00 != 0) {
            A4B a4b = (A4B) obj;
            AnonymousClass3W1 r6 = (AnonymousClass3W1) obj7;
            MotionEvent motionEvent = (MotionEvent) obj6;
            C62320sa r8 = (C62320sa) obj5;
            0qQ.A0B(a4b, 0);
            0qQ.A0B(r6, 1);
            0qQ.A0B(r8, 3);
            C258403yx r1 = (C258403yx) this.A01;
            r1.A01(C41625Axd.A00);
            02m r2 = r1.A00;
            if (r2 != null) {
                r2.markerPoint(1056313521, "on_use_case_handling");
            }
            1Xj r5 = (1Xj) this.A02;
            0qQ.A0B(r5, 0);
            a4b.A00.Ctq(motionEvent, (C254073rt) null, r5, r6, 2EG.A3E, r8);
        } else {
            C258373yu r10 = (C258373yu) obj;
            AnonymousClass3W1 r62 = (AnonymousClass3W1) obj7;
            C254073rt r3 = (C254073rt) obj6;
            MotionEvent motionEvent2 = (MotionEvent) obj5;
            0qQ.A0B(r10, 0);
            0qQ.A0B(r62, 1);
            0qQ.A0B(r3, 2);
            C258403yx r12 = (C258403yx) this.A01;
            r12.A01(C41625Axd.A00);
            02m r22 = r12.A00;
            if (r22 != null) {
                r22.markerPoint(1056313521, "on_use_case_handling");
            }
            1Xj r13 = (1Xj) this.A02;
            if (r13.A0A == null) {
                r10.Czn(motionEvent2, r3, r13, r62);
            }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377459Lx(C258403yx r2, 1Xj r3, int i) {
        super(4);
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }
}
