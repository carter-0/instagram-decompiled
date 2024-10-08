package X;

import android.content.DialogInterface;

/* renamed from: X.W5o  reason: case insensitive filesystem */
public final class C18845W5o implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C18845W5o(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        boolean z;
        boolean z2;
        WYZ wyz;
        Long l;
        String A0p;
        String str;
        if (this.A00 != 0) {
            C14783U8t A012 = ((C15311UaI) this.A01).A01();
            z = this.A03;
            z2 = this.A02;
            wyz = A012.A09;
            l = A012.A0B;
            A0p = C13989Tnp.A0p(A012.A08);
            str = A012.A0C;
        } else {
            C16060Unn A022 = ((UaM) this.A01).A02();
            z = this.A03;
            z2 = this.A02;
            wyz = A022.A04;
            l = A022.A06;
            A0p = C13989Tnp.A0p(A022.A03);
            str = A022.A07;
        }
        0qQ.A0B(str, 2);
        1Ln A002 = WYZ.A00(wyz, l, "lead_gen_manage_lead_forms_and_cta", WYZ.A01("impression", z, z2), "impression", str);
        A002.A0Q("lead_form_id", DbZ.A0d(A0p));
        A002.Cgf();
    }
}
