package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

public final class QC0 extends AnonymousClass4DI {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.QC0, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        A00(this, AnonymousClass05K.A15, AnonymousClass05K.A01, new 0eP[0]);
        AnonymousClass0eM r1 = this.A00;
        View findViewById = view.findViewById(((C15048ULb) QD9.A00(r1).A04).A03);
        View findViewById2 = view.findViewById(((C15048ULb) QD9.A00(r1).A04).A01);
        C11497SbK.A01(view.findViewById(((C15048ULb) QD9.A00(r1).A04).A00), 23, this);
        Dba.A16(this, Pxh.A0O(this.A01).A07, new C58751Iwy(27, findViewById2, this, findViewById), 7);
    }

    public static final void A00(QC0 qc0, Integer num, Integer num2, 0eP... r6) {
        Pxh.A0O(qc0.A01).A0E(new L7Y(num, num2, AnonymousClass05K.A0Y, (0eP[]) Arrays.copyOf(r6, 0)));
    }

    public QC0() {
        C13348TVv tVv = new C13348TVv(this, 18);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13348TVv.A00(tVv, r7, 19);
        0Yh A0z = DbS.A0z(C60104Jfk.class);
        this.A01 = new C227862kA(new C13348TVv(A002, 20), new TTP(45, A002, this), new TTP(44, (Object) null, A002), A0z);
        AnonymousClass0eM A003 = C13348TVv.A00(new C13348TVv(this, 17), r7, 21);
        0Yh A0z2 = DbS.A0z(QD9.class);
        this.A00 = new C227862kA(new C13348TVv(A003, 22), new TTP(47, A003, this), new TTP(46, (Object) null, A003), A0z2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-219418731);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((C15048ULb) QD9.A00(this.A00).A04).A02, viewGroup, false);
        AnonymousClass0fD.A09(-677757837, A02);
        return inflate;
    }
}
