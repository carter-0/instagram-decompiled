package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2gk  reason: invalid class name and case insensitive filesystem */
public final class C226402gk implements View.OnLongClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public C226402gk(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Twa, java.lang.Object] */
    public final boolean onLongClick(View view) {
        InstagramMainActivity instagramMainActivity = this.A01;
        instagramMainActivity.Eng(1QK.A0F);
        0hq supportFragmentManager = instagramMainActivity.getSupportFragmentManager();
        String A002 = C273654mx.A00(2191);
        supportFragmentManager.A19(A002, 1);
        FragmentActivity fragmentActivity = instagramMainActivity.A0f;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        UserSession userSession = this.A00;
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        C14398TvR.A00();
        r2.A0B((Bundle) null, new Object().A03(userSession));
        r2.A0A = A002;
        r2.A04();
        return true;
    }
}
