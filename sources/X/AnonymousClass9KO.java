package X;

import android.content.Context;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.9KO  reason: invalid class name */
public final class AnonymousClass9KO extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KO(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9KO, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        AnonymousClass4D7 r5 = r9;
        if (this.A01 != 0) {
            obj3 = this.A03;
            obj2 = this.A05;
            obj5 = this.A04;
            obj4 = this.A02;
            i = 1;
        } else {
            obj2 = this.A05;
            obj3 = this.A03;
            obj4 = this.A02;
            obj5 = this.A04;
            i = 0;
        }
        ? r0 = new AnonymousClass9KO(obj2, obj3, obj4, obj5, r5, i);
        r0.A00 = obj;
        return r0;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KO) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        Runnable aqU;
        int i = this.A01;
        0eS.A00(obj);
        if (i != 0) {
            C391869to r6 = (C391869to) this.A00;
            C3511187q r9 = (C3511187q) this.A03;
            C3510387i r7 = (C3510387i) this.A05;
            Context context = r7.A0F;
            0qQ.A0B(context, 0);
            0qQ.A0B(r6, 1);
            boolean z = r6 instanceof C385119iQ;
            if (z) {
                C390159qp r2 = r9.A00;
                if (r2 == null) {
                    r2 = new C390159qp(context, r9.A05, new A4Y(r9));
                    r9.A00 = r2;
                }
                C14044Tol tol = r2.A00;
                if (tol != null) {
                    tol.A0D("manual", true);
                }
            } else if (r6 instanceof C385129iR) {
                A7X a7x = r9.A01;
                if (a7x == null) {
                    a7x = new A7X(context, r9.A05, new A4Z(r9));
                    r9.A01 = a7x;
                }
                STU stu = a7x.A00;
                if (stu != null) {
                    stu.A05();
                }
            } else {
                throw new RuntimeException();
            }
            if (z) {
                roundedCornerFrameLayout = r7.A0U;
                aqU = new C41231AqT((AnonymousClass4DH) this.A02, r6, r7, (C3511387s) this.A04, r9);
            } else if (r6 instanceof C385129iR) {
                roundedCornerFrameLayout = r7.A0U;
                aqU = new C41232AqU((AnonymousClass4DH) this.A02, r6, r7, (C3511387s) this.A04, r9);
            } else {
                throw new RuntimeException();
            }
            roundedCornerFrameLayout.postDelayed(aqU, 100);
            return C60340gF.A00;
        }
        C262224Cq r5 = (C262224Cq) this.A00;
        Object obj2 = this.A05;
        MHP mhp = new MHP(obj2, this.A03, this.A02, (AnonymousClass4D7) null, 9);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, mhp, r5);
        return 1Eo.A03(num, r4, new MH2(obj2, this.A04, (AnonymousClass4D7) null, 8), r5);
    }
}
