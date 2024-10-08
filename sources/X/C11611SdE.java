package X;

import android.view.View;

/* renamed from: X.SdE  reason: case insensitive filesystem */
public final class C11611SdE implements AnonymousClass03Q {
    public final int A00;
    public final Object A01;

    public C11611SdE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ 04k Cvn(View view, 04k r6) {
        switch (this.A00) {
            case 0:
                return (04k) ((0sL) this.A01).invoke(view, r6);
            case 1:
                0qQ.A0B(r6, 1);
                02M A05 = r6.A00.A05(135);
                0qQ.A07(A05);
                C7365Q8i q8i = (C7365Q8i) this.A01;
                QZL qzl = q8i.A01;
                qzl.A0D(new QZ6(A05, qzl, q8i));
                return 04k.A01;
            case 2:
                0qQ.A0B(r6, 1);
                r6.A00.A01();
                View view2 = ((C11380SQs) this.A01).A04;
                if (view2 != null) {
                    return 03v.A05(view2, r6);
                }
                break;
            default:
                QAL qal = (QAL) this.A01;
                V4O v4o = qal.A02;
                if (v4o != null) {
                    qal.A03.A0l.remove(v4o);
                }
                if (r6 != null) {
                    UWC uwc = new UWC(qal.A00, r6);
                    qal.A02 = uwc;
                    qal.A03.A0a(uwc);
                    break;
                }
                break;
        }
        return r6;
    }
}
