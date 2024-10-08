package X;

import android.view.View;

public final class IA9 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass2uE A00;

    public IA9(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Integer valueOf;
        int A05 = AnonymousClass0fD.A05(-635840718);
        AnonymousClass2uE r4 = this.A00;
        C49061Eof.A00(r4.A0T).A02(EWT.PIN_POST_FLOW, (Integer) null);
        C323176x4 r0 = r4.A0A;
        if (r0 == null || (valueOf = Integer.valueOf(r0.BXA())) == null || valueOf.intValue() < 3) {
            AnonymousClass2uE.A01(r4);
        } else {
            C358248ab A0Y = DbS.A0Y(r4.A0P);
            A0Y.A09(2131969470);
            A0Y.A08(2131969469);
            C56719I8z.A01(A0Y, r4, 25, 2131956481);
            A0Y.A0r(true);
            A0Y.A05();
            DbT.A1V(A0Y);
        }
        AnonymousClass0fD.A0C(2100985883, A05);
    }
}
