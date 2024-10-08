package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.UfB  reason: case insensitive filesystem */
public final class C15583UfB extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ InstagramMainActivity A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;

    public C15583UfB(UserSession userSession, 1Xj r2, InstagramMainActivity instagramMainActivity, AnonymousClass3Q2 r4) {
        this.A02 = instagramMainActivity;
        this.A01 = r2;
        this.A00 = userSession;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1962560499);
        UX3 ux3 = (UX3) obj;
        int A033 = AnonymousClass0fD.A03(1762476422);
        0qQ.A0B(ux3, 0);
        if (ux3.A00) {
            InstagramMainActivity instagramMainActivity = this.A02;
            if (instagramMainActivity.A0Q) {
                instagramMainActivity.A0Q = false;
                InstagramMainActivity.A0Q(this.A01, instagramMainActivity, true);
            }
            InstagramMainActivity.A0O(this.A01, this.A02);
        } else {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A05, userSession, 36312771666642175L)) {
                InstagramMainActivity.A0M(userSession, this.A02, this.A03);
            }
            InstagramMainActivity.A0O(this.A01, this.A02);
        }
        AnonymousClass0fD.A0A(-2133852560, A033);
        AnonymousClass0fD.A0A(5847380, A032);
    }
}
