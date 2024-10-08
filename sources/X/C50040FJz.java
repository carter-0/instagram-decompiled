package X;

import android.content.DialogInterface;

/* renamed from: X.FJz  reason: case insensitive filesystem */
public final class C50040FJz implements DialogInterface.OnShowListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ P30 A01;
    public final /* synthetic */ C254793t3 A02;
    public final /* synthetic */ String A03;

    public C50040FJz(P30 p30, C254793t3 r2, String str, int i) {
        this.A01 = p30;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        String str;
        C313756gx A0R = DbZ.A0R(this.A01.A03);
        int i = this.A00;
        C254793t3 r0 = this.A02;
        if (r0 != null) {
            str = C300965yF.A07(r0);
        } else {
            str = null;
        }
        String str2 = this.A03;
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A0R);
            A0J.A0l("channel_translation_dialog_rendered");
            A0J.A0k("impression");
            A0J.A0p("channel_translation_education");
            A0J.A0i(DbZ.A0b(A0J, "thread_view", str, str2, i));
            Dba.A1C(A0J, A0R);
        }
    }
}
