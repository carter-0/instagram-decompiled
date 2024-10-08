package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.73R  reason: invalid class name */
public final class AnonymousClass73R implements AnonymousClass73N {
    public String A00;
    public String A01;
    public String A02;
    public final Context A03;
    public final AnonymousClass4EU A04;
    public final UserSession A05;
    public final User A06;
    public final C3249070h A07;

    public final void DJi() {
    }

    public final String AZm() {
        return this.A00;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return true;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_facebook_profile_banner";
    }

    public final boolean Bvq() {
        return true;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A07.DE8(z);
    }

    public final void DdK() {
        this.A07.DdY();
    }

    public final String getId() {
        return this.A01;
    }

    public final String getSubtitle() {
        return "Facebook";
    }

    public final String getTitle() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r7.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass73R(android.content.Context r6, X.AnonymousClass4EU r7, com.instagram.common.session.UserSession r8, X.C3249070h r9, com.instagram.user.model.User r10) {
        /*
            r5 = this;
            r5.<init>()
            r5.A03 = r6
            r5.A05 = r8
            r5.A04 = r7
            r5.A06 = r10
            r5.A07 = r9
            if (r7 == 0) goto L_0x0015
            java.lang.String r0 = r7.getId()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r0 = "facebook_profile"
        L_0x0017:
            r5.A01 = r0
            com.instagram.api.schemas.ProfileBannerType r0 = com.instagram.api.schemas.ProfileBannerType.FACEBOOK_PROFILE
            java.lang.String r0 = r0.A00
            r5.A00 = r0
            android.content.Context r1 = r5.A03
            r0 = 2131970023(0x7f1347e7, float:1.9576985E38)
            java.lang.String r4 = r1.getString(r0)
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r3 = r5.A05
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320120357134374(0x8108f500162026, double:3.0323285910131083E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0049
            X.4EU r0 = r5.A04
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x0049
            r4 = r0
        L_0x0049:
            r5.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73R.<init>(android.content.Context, X.4EU, com.instagram.common.session.UserSession, X.70h, com.instagram.user.model.User):void");
    }

    public final int BEF() {
        return R.drawable.instagram_facebook_circle_pano_outline_24;
    }
}
