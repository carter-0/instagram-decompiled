package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FbO  reason: case insensitive filesystem */
public final class C50415FbO implements C74484Pve {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final /* synthetic */ void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onSuccessInBackground(AnonymousClass2Ep r1) {
    }

    public C50415FbO(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass6ST r4, String str, String str2, String str3) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = r2;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = r4;
    }

    public final void onFailure() {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isDestroyed()) {
            this.A03.dismiss();
            C59689JTv.A0F(fragmentActivity, "general_error_try_again", 2131963032);
        }
    }

    public final void onSuccess(AnonymousClass2Ep r5) {
        FragmentActivity fragmentActivity = this.A00;
        1pE A012 = 1pE.A01(fragmentActivity, this.A01, this.A02, this.A04);
        DbZ.A1Z(A012, this.A06);
        A012.A0i = this.A05;
        DbV.A1R(A012);
        if (!fragmentActivity.isDestroyed()) {
            this.A03.dismiss();
        }
    }
}
