package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.9Lf  reason: invalid class name and case insensitive filesystem */
public final class C377279Lf extends 0Yg implements 0sI {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377279Lf(Object obj, int i) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        Object obj6 = obj5;
        Object obj7 = obj4;
        Object obj8 = obj3;
        Object obj9 = obj2;
        Object obj10 = obj;
        switch (this.A00) {
            case 0:
                1Xj r9 = (1Xj) obj10;
                C296995qz r6 = (C296995qz) obj9;
                ((Number) obj8).intValue();
                View view = (View) obj7;
                MotionEvent motionEvent = (MotionEvent) obj6;
                0qQ.A0B(r9, 0);
                0qQ.A0B(r6, 1);
                0qQ.A0B(view, 3);
                0qQ.A0B(motionEvent, 4);
                C232692uG r2 = ((AnonymousClass32L) this.A01).A0L;
                if (r2 != null) {
                    z = r2.Dsa(motionEvent, view, r9, (r6.A01 * 3) + r6.A00);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                C258373yu r92 = (C258373yu) obj10;
                AnonymousClass3W1 r62 = (AnonymousClass3W1) obj9;
                2EG r7 = (2EG) obj8;
                C254073rt r3 = (C254073rt) obj7;
                0qQ.A0B(r92, 0);
                0qQ.A0B(r62, 1);
                0qQ.A0B(r7, 2);
                0qQ.A0B(r3, 3);
                r92.Czo((MotionEvent) obj6, r3, (1Xj) this.A01, r62, r7);
                break;
            default:
                A4B a4b = (A4B) obj10;
                AnonymousClass3W1 r63 = (AnonymousClass3W1) obj9;
                2EG r72 = (2EG) obj8;
                C62320sa r8 = (C62320sa) obj6;
                0qQ.A0B(a4b, 0);
                0qQ.A0B(r63, 1);
                0qQ.A0B(r72, 2);
                0qQ.A0B(r8, 4);
                1Xj r5 = (1Xj) this.A01;
                0qQ.A0B(r5, 0);
                a4b.A00.Ctq((MotionEvent) obj7, (C254073rt) null, r5, r63, r72, r8);
                break;
        }
        return C60340gF.A00;
    }
}
