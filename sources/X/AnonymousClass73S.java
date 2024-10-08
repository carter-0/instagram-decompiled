package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.73S  reason: invalid class name */
public final class AnonymousClass73S implements AnonymousClass73N {
    public String A00;
    public String A01;
    public String A02;
    public final Context A03;
    public final AnonymousClass5Bm A04;
    public final User A05;
    public final C3248970g A06;

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
        return "impression_facebook_page_banner";
    }

    public final boolean Bvq() {
        return true;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A06.DE7(this.A05, z);
    }

    public final void DdK() {
        this.A06.DdX();
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r4.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass73S(android.content.Context r3, X.AnonymousClass5Bm r4, X.C3248970g r5, com.instagram.user.model.User r6) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            r2.A04 = r4
            r2.A05 = r6
            r2.A06 = r5
            if (r4 == 0) goto L_0x0013
            java.lang.String r0 = r4.getId()
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = "facebook_page"
        L_0x0015:
            r2.A01 = r0
            com.instagram.api.schemas.ProfileBannerType r0 = com.instagram.api.schemas.ProfileBannerType.FACEBOOK_PAGE
            java.lang.String r0 = r0.A00
            r2.A00 = r0
            X.5Bm r0 = r2.A04
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x0033
        L_0x0027:
            android.content.Context r1 = r2.A03
            r0 = 2131970022(0x7f1347e6, float:1.9576983E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
        L_0x0033:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73S.<init>(android.content.Context, X.5Bm, X.70g, com.instagram.user.model.User):void");
    }

    public final int BEF() {
        return R.drawable.instagram_facebook_circle_pano_outline_24;
    }
}
