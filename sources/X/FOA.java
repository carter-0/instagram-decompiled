package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOA implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ 1Y9 A03;
    public final /* synthetic */ String A04;

    public FOA(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3, 1Y9 r4, String str) {
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1807110480);
        this.A03.A1C(this.A00, this.A01, this.A04, this.A02.getModuleName(), "tags", (String) null, (String) null, (String) null);
        AnonymousClass0fD.A0C(-41096846, A05);
    }
}
