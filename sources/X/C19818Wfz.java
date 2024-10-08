package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfz  reason: case insensitive filesystem */
public final class C19818Wfz implements XAF {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ V43 A02;
    public final /* synthetic */ 1WW A03;

    public C19818Wfz(FragmentActivity fragmentActivity, UserSession userSession, V43 v43, 1WW r4) {
        this.A03 = r4;
        this.A02 = v43;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        V43 v43 = this.A02;
        new R8F().A0B(v43.A03.getChildFragmentManager(), "ProfileWizardPlugin_LoaderDialogFragmentName");
        C15310UaH uaH = v43.A03;
        1OC A06 = C318486p2.A06(this.A01);
        C15621Ufn.A00(A06, this, 37);
        uaH.schedule(A06);
        return null;
    }
}
