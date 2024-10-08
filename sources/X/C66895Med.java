package X;

import android.view.View;

/* renamed from: X.Med  reason: case insensitive filesystem */
public final class C66895Med implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7I3 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C66895Med(AnonymousClass7I3 r1, String str, C62320sa r3, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-536688125);
        AnonymousClass7I3 r0 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A03;
        String str = this.A01;
        1Ln A0J = 1Ln.A0J(r0.A01);
        XSV A002 = AnonymousClass7I3.A00(z2, z);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(24);
            C66580MXl.A1L(A0J, "write_with_ai_icon");
            A0J.A0X(0);
            C66584MXp.A0o(A002, A0J, str, z2);
            A0J.Cgf();
        }
        this.A02.invoke();
        AnonymousClass0fD.A0C(-1881968513, A05);
    }
}
