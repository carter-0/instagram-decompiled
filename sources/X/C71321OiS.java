package X;

import android.view.View;

/* renamed from: X.OiS  reason: case insensitive filesystem */
public final class C71321OiS implements View.OnClickListener {
    public final /* synthetic */ C70797OLs A00;
    public final /* synthetic */ String A01;

    public C71321OiS(C70797OLs oLs, String str) {
        this.A00 = oLs;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(838542482);
        C329137Hs r0 = this.A00.A05;
        String str = this.A01;
        C329067Hl r4 = r0.A00;
        AnonymousClass7IS r1 = r4.A1c;
        C254783t2 r3 = r4.A1z;
        0qQ.A0B(r3, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "direct_edit_message_cancel");
        if (A0e.isSampled()) {
            C66581MXm.A1H(A0e, AnonymousClass6W3.A07(r3));
            DbS.A1J(A0e, "cancel");
            A0e.AAJ("message_type", 2FW.A1g.toString());
            A0e.AAJ("message_id", str);
            C66583MXo.A16(A0e, r3);
            A0e.Cgf();
        }
        r4.A15();
        AnonymousClass0fD.A0C(-1087883518, A05);
    }
}
