package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.EBc  reason: case insensitive filesystem */
public final class C47642EBc extends 1P0 {
    public String A00;
    public final /* synthetic */ FAK A01;

    public C47642EBc(FAK fak, String str) {
        this.A01 = fak;
        this.A00 = str;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(835742633);
        C49952FGh.A07(this.A01.A00, r3);
        AnonymousClass0fD.A0A(-1344117874, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1086274570);
        int A032 = AnonymousClass0fD.A03(243197169);
        FAK fak = this.A01;
        Fragment fragment = fak.A00;
        C309516Yo A0J = DbY.A0J(fragment.requireActivity(), fak.A02);
        C47448E2u e2u = new C47448E2u();
        String str = this.A00;
        Bundle A002 = FBN.A00(((DwW) obj).A00);
        Dbc.A0L(A002, (String) null, (String) null, str, false);
        C48975EnD.A00(A002, EVZ.ARGUMENT_EDIT_PROFILE_FLOW);
        A002.putBoolean("HAS_SMS_CONSENT", false);
        A0J.A0B(A002, e2u);
        A0J.A0F(fragment, 0);
        A0J.A04();
        AnonymousClass0fD.A0A(1624612814, A032);
        AnonymousClass0fD.A0A(-1172949484, A03);
    }
}
