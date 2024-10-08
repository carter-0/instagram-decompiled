package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: X.QBv  reason: case insensitive filesystem */
public final class C7411QBv extends C240393Ks {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    public C7411QBv() {
        C13350TVx tVx = new C13350TVx(this, 42);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13350TVx.A00(tVx, r7, 43);
        0Yh A0z = DbS.A0z(C60104Jfk.class);
        this.A01 = new C227862kA(new C13350TVx(A002, 44), new TTP(31, A002, this), new TTP(30, (Object) null, A002), A0z);
        AnonymousClass0eM A003 = C13350TVx.A00(new C13350TVx(this, 41), r7, 45);
        0Yh A0z2 = DbS.A0z(QD9.class);
        this.A00 = new C227862kA(new C13350TVx(A003, 46), new TTP(33, A003, this), new TTP(32, (Object) null, A003), A0z2);
    }

    public final Dialog A0F(Bundle bundle) {
        Context requireContext = requireContext();
        AnonymousClass0eM r4 = this.A00;
        Q5I q5i = new Q5I(requireContext, (C53290Glc) QD9.A00(r4).A01);
        Pxh.A0O(this.A01).A0E(new L7Y(AnonymousClass05K.A15, AnonymousClass05K.A01, AnonymousClass05K.A0N, (0eP[]) Arrays.copyOf(new 0eP[0], 0)));
        q5i.A03.setText(((UKQ) QD9.A00(r4).A05).A04);
        q5i.A00.setText(((UKQ) QD9.A00(r4).A05).A03);
        TextView textView = q5i.A01;
        textView.setText(((UKQ) QD9.A00(r4).A05).A05);
        AnonymousClass0fU.A00(new C11499SbM(q5i, this, 11), textView);
        TextView textView2 = q5i.A02;
        textView2.setText(((UKQ) QD9.A00(r4).A05).A01);
        textView2.setTextColor(((UKQ) QD9.A00(r4).A05).A02);
        AnonymousClass0fU.A00(new C11499SbM(q5i, this, 12), textView2);
        return q5i;
    }
}
