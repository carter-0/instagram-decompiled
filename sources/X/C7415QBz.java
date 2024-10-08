package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: X.QBz  reason: case insensitive filesystem */
public final class C7415QBz extends AnonymousClass4DI {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.QBz] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        A00(this, AnonymousClass05K.A15, AnonymousClass05K.A01, new 0eP[0]);
        try {
            AnonymousClass0eM r2 = this.A00;
            TextView textView = (TextView) AnonymousClass7TE.A0b(view2, ((QOm) QD9.A00(r2).A07).A00);
            C11497SbK.A01(textView, 21, this);
            TextView textView2 = (TextView) AnonymousClass7TE.A0b(view2, ((QOm) QD9.A00(r2).A07).A03);
            View A0b = AnonymousClass7TE.A0b(view2, ((QOm) QD9.A00(r2).A07).A05);
            TextView A0B = DbW.A0B(view2, ((QOm) QD9.A00(r2).A07).A04);
            C11497SbK.A01(A0B, 22, this);
            TextView A0B2 = DbW.A0B(view2, ((QOm) QD9.A00(r2).A07).A06);
            AnonymousClass0eM r22 = this.A01;
            Dba.A16(this, Pxh.A0O(r22).A05, new C58769IxG(9, A0B2, this, A0B, A0b), 6);
            Dba.A16(this, Pxh.A0O(r22).A07, new C58790Ixb(3, textView2, (ProgressBar) AnonymousClass7TE.A0b(view2, ((QOm) QD9.A00(r2).A07).A07), (TextView) AnonymousClass7TE.A0b(view2, ((QOm) QD9.A00(r2).A07).A02), textView, this), 6);
        } catch (Throwable th) {
            C51976G9y.A0T(this, th, this.A01);
        }
    }

    public static final void A00(C7415QBz qBz, Integer num, Integer num2, 0eP... r4) {
        Pxj.A1F(Pxh.A0O(qBz.A01), num, num2, AnonymousClass05K.A01, r4);
    }

    public C7415QBz() {
        C13348TVv tVv = new C13348TVv(this, 12);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13348TVv.A00(tVv, r7, 13);
        0Yh A0z = DbS.A0z(C60104Jfk.class);
        this.A01 = new C227862kA(new C13348TVv(A002, 14), new TTP(41, A002, this), new TTP(40, (Object) null, A002), A0z);
        AnonymousClass0eM A003 = C13348TVv.A00(new C13348TVv(this, 11), r7, 15);
        0Yh A0z2 = DbS.A0z(QD9.class);
        this.A00 = new C227862kA(new C13348TVv(A003, 16), new TTP(43, A003, this), new TTP(42, (Object) null, A003), A0z2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(496752354);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((QOm) QD9.A00(this.A00).A07).A01, viewGroup, false);
        AnonymousClass0fD.A09(1611802033, A02);
        return inflate;
    }
}
