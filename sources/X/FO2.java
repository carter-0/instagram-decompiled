package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FO2 implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C48032ERv A03;

    public FO2(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C48032ERv eRv) {
        this.A03 = eRv;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-986877641);
        C48032ERv eRv = this.A03;
        if (eRv != null) {
            UserSession userSession = this.A02;
            2Cd r4 = new 2Cd(userSession);
            long A012 = r4.A01();
            r4.A03(this.A00, eRv.A00);
            2Ci.A06(userSession, (EWJ) null, "take_break", AnonymousClass3FV.A00(), A012, Dba.A01(userSession));
        }
        this.A01.onBackPressed();
        AnonymousClass0fD.A0C(-2007118833, A05);
    }
}
