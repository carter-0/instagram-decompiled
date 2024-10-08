package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fbm  reason: case insensitive filesystem */
public final class C50439Fbm implements G73 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ 28D A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass6ST A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public final void DoN(1Xj r10) {
        0qQ.A0B(r10, 0);
        Activity activity = this.A00;
        Context context = this.A01;
        UserSession userSession = this.A04;
        Fragment fragment = this.A02;
        String str = this.A07;
        String str2 = this.A08;
        User user = this.A06;
        I5a.A00(activity, context, fragment, this.A03, userSession, r10, user, str, str2);
        if (this.A09) {
            this.A05.dismiss();
        }
    }

    public C50439Fbm(Activity activity, Context context, Fragment fragment, 28D r4, UserSession userSession, AnonymousClass6ST r6, User user, String str, String str2, boolean z) {
        this.A00 = activity;
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = fragment;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = user;
        this.A03 = r4;
        this.A09 = z;
        this.A05 = r6;
    }

    public final void onFail(String str) {
        if (this.A09) {
            this.A05.dismiss();
        }
        C59689JTv.A0B(this.A01, AnonymousClass000.A00(4782));
    }
}
