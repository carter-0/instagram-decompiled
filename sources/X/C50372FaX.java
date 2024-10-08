package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FaX  reason: case insensitive filesystem */
public final class C50372FaX implements C51900G6u {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public final void D6w(String str) {
        0qQ.A0B(str, 0);
        FragmentActivity fragmentActivity = this.A00;
        SQH.A01(fragmentActivity.getSupportFragmentManager());
        1pE A012 = 1pE.A01(fragmentActivity, this.A01, this.A02, this.A03);
        DbZ.A1Z(A012, str);
        List A04 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        0qQ.A07(A04);
        A012.A0q = true;
        A012.A01 = (Fragment) 00k.A0K(A04);
        A012.A06();
    }

    public C50372FaX(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void D6v(Throwable th) {
        FragmentActivity fragmentActivity = this.A00;
        SQH.A01(fragmentActivity.getSupportFragmentManager());
        0wb.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
        C59689JTv.A03(fragmentActivity, fragmentActivity.getString(2131968258), "network_error", 0);
    }
}
