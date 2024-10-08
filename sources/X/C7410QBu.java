package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

/* renamed from: X.QBu  reason: case insensitive filesystem */
public final class C7410QBu extends C240393Ks {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    public C7410QBu() {
        C13350TVx tVx = new C13350TVx(this, 36);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13350TVx.A00(tVx, r7, 37);
        0Yh A0z = DbS.A0z(C60104Jfk.class);
        this.A01 = new C227862kA(new C13350TVx(A002, 38), new TTP(27, A002, this), new TTP(26, (Object) null, A002), A0z);
        AnonymousClass0eM A003 = C13350TVx.A00(new C13350TVx(this, 35), r7, 39);
        0Yh A0z2 = DbS.A0z(QD9.class);
        this.A00 = new C227862kA(new C13350TVx(A003, 40), new TTP(29, A003, this), new TTP(28, (Object) null, A003), A0z2);
    }

    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A00;
        Q5I q5i = new Q5I(requireContext, (C53290Glc) QD9.A00(r3).A01);
        Pxj.A1F(Pxh.A0O(this.A01), AnonymousClass05K.A15, AnonymousClass05K.A01, AnonymousClass05K.A0C, new 0eP[0]);
        q5i.A03.setText(((C15048ULb) QD9.A00(r3).A03).A01);
        q5i.A00.setText(((C15048ULb) QD9.A00(r3).A03).A00);
        TextView textView = q5i.A01;
        textView.setText(((C15048ULb) QD9.A00(r3).A03).A02);
        C11499SbM.A01(textView, 9, q5i, this);
        TextView textView2 = q5i.A02;
        textView2.setText(((C15048ULb) QD9.A00(r3).A03).A03);
        C11499SbM.A01(textView2, 10, q5i, this);
        return q5i;
    }
}
