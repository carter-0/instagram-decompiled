package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FOV implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C49884FBk A03;
    public final /* synthetic */ FBQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public FOV(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C49884FBk fBk, FBQ fbq, String str, String str2) {
        this.A03 = fBk;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = fbq;
        this.A05 = str;
        this.A06 = str2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(141481683);
        C49884FBk fBk = this.A03;
        C49884FBk.A00(this.A00, this.A01, this.A02, fBk, this.A04, this.A05, this.A06, 1);
        AnonymousClass0fD.A0C(1436755540, A052);
    }
}
