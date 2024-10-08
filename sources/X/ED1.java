package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.user.model.User;

public final class ED1 extends 1P0 {
    public final 1Xj A00;
    public final ERQ A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public ED1(1Xj r5, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A00 = r5;
        ERQ erq = new ERQ();
        this.A01 = erq;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("isDeleting", true);
        erq.setArguments(A0a);
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(2067066528);
        C59689JTv.A0F(this.A02, "delete_media_post_failed", 2131957571);
        AnonymousClass0fD.A0A(-960104064, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1963033277);
        this.A01.A08();
        AnonymousClass0fD.A0A(827693065, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1403345726);
        InstagramMainActivity instagramMainActivity = this.A02;
        Fragment A012 = InstagramMainActivity.A01(instagramMainActivity);
        if (A012 != null) {
            0hq childFragmentManager = A012.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            if (childFragmentManager.A0R("ProgressDialog") == null) {
                ERQ erq = this.A01;
                if (!erq.isAdded()) {
                    erq.A0B(childFragmentManager, "ProgressDialog");
                }
            }
        }
        InstagramMainActivity.A0P(this.A00, instagramMainActivity, EZC.valueOf("USER_SELECTED_POST_FRICTION_DIALOG").ordinal());
        AnonymousClass0fD.A0A(753660360, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1515121205);
        int A032 = AnonymousClass0fD.A03(1976363912);
        1Xj r2 = this.A00;
        DbX.A1Q(r2, 1);
        UserSession userSession = this.A02.A05;
        userSession.getClass();
        r2.AE7(userSession);
        User A2A = r2.A2A(userSession);
        A2A.getClass();
        A2A.A0d(userSession);
        AnonymousClass0fD.A0A(1999853456, A032);
        AnonymousClass0fD.A0A(-647738913, A03);
    }
}
