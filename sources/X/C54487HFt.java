package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFt  reason: case insensitive filesystem */
public final class C54487HFt extends AnonymousClass7AK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C229332nD A03;
    public final /* synthetic */ C47156DrX A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54487HFt(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C229332nD r5, C47156DrX drX, int i) {
        super(Integer.valueOf(i));
        this.A03 = r5;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = drX;
        this.A01 = r3;
    }

    public final void onClick(View view) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        String str = this.A04.A02;
        AnonymousClass0iw r1 = this.A01;
        0qQ.A0B(str, 2);
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, "middle_state_profile_preview_card", r1.getModuleName());
        A012.A0i = true;
        Fragment A023 = A022.A02(userSession, A012.A04());
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0D(A023);
        A0Q.A03();
    }
}
