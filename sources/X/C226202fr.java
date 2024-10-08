package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2fr  reason: invalid class name and case insensitive filesystem */
public final class C226202fr implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;
    public final /* synthetic */ 1QK A02;

    public C226202fr(UserSession userSession, InstagramMainActivity instagramMainActivity, 1QK r3) {
        this.A01 = instagramMainActivity;
        this.A02 = r3;
        this.A00 = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-286415190);
        String str = 1Rm.A00().A00;
        0qQ.A07(str);
        InstagramMainActivity instagramMainActivity = this.A01;
        1QK r2 = this.A02;
        if (!instagramMainActivity.CR0(r2) || instagramMainActivity.getSupportFragmentManager().A0M() > 0 || !str.equals(r2.A05)) {
            C71342cb.A00(this.A00).A0A(instagramMainActivity, r2.A06);
        }
        AnonymousClass0fD.A0C(-1680456170, A05);
    }
}
