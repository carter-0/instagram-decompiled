package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FbN  reason: case insensitive filesystem */
public final class C50414FbN implements C74484Pve {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final /* synthetic */ void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onSuccessInBackground(AnonymousClass2Ep r1) {
    }

    public C50414FbN(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass6ST r4, String str, String str2) {
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = r2;
        this.A05 = str2;
    }

    public final void onFailure() {
        this.A03.dismiss();
        C310336ap A0X = DbV.A0X();
        DbS.A19(this.A00, A0X, 2131963032);
        Dbb.A1Q(A0X);
    }

    public final void onSuccess(AnonymousClass2Ep r5) {
        this.A03.dismiss();
        FragmentActivity fragmentActivity = this.A00;
        1pE A012 = 1pE.A01(fragmentActivity, this.A01, this.A02, this.A04);
        DbZ.A1Z(A012, this.A05);
        A012.A0v = true;
        C50399Fb7.A00(A012, fragmentActivity, 0);
    }
}
