package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOM implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ 1Y9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public FOM(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3, 1Y9 r4, String str, String str2) {
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = r3;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1704033153);
        this.A03.A1C(this.A00, this.A01, this.A05, this.A02.getModuleName(), "tags", (String) null, this.A04, (String) null);
        AnonymousClass0fD.A0C(-501867707, A052);
    }
}
