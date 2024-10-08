package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

/* renamed from: X.FNq  reason: case insensitive filesystem */
public final class C50075FNq implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C50075FNq(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1344148922);
        new AiAgentThreadLauncher(this.A02).A08(this.A00, this.A01, this.A03, (String) null, (String) null, (String) null, true);
        AnonymousClass0fD.A0C(2109087220, A05);
    }
}
