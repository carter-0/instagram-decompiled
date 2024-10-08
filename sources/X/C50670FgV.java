package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FgV  reason: case insensitive filesystem */
public final class C50670FgV implements AnonymousClass73N {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C3249470l A07;
    public final DU0 A08;
    public final User A09;

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A01;
    }

    public final long B2g() {
        return this.A00;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_expiring_discount";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A07.DDg(this.A08, this.A09);
    }

    public final String getId() {
        return this.A02;
    }

    public final String getSubtitle() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r0.Aoi();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C50670FgV(android.content.Context r7, com.instagram.common.session.UserSession r8, X.C3249470l r9, X.DU0 r10, com.instagram.user.model.User r11) {
        /*
            r6 = this;
            r6.<init>()
            r6.A05 = r7
            r6.A06 = r8
            r6.A09 = r11
            r6.A08 = r10
            r6.A07 = r9
            com.instagram.user.model.ProductCollection r0 = r10.Axw()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.Aoi()
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r0 = ""
        L_0x001b:
            r6.A02 = r0
            com.instagram.api.schemas.ProfileBannerType r0 = com.instagram.api.schemas.ProfileBannerType.INVALID
            java.lang.String r0 = r0.A00
            r6.A01 = r0
            com.instagram.user.model.ProductCollection r0 = r10.Axw()
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.getTitle()
            if (r1 == 0) goto L_0x0038
            r0 = 2131961855(0x7f1327ff, float:1.9560419E38)
            java.lang.String r0 = X.DbW.A0h(r7, r1, r0)
            if (r0 != 0) goto L_0x003a
        L_0x0038:
            java.lang.String r0 = ""
        L_0x003a:
            r6.A04 = r0
            java.lang.Long r0 = r10.B1d()
            if (r0 == 0) goto L_0x00b9
            java.lang.Long r0 = r10.B1d()
            if (r0 == 0) goto L_0x00b9
            long r2 = r0.longValue()
            int r1 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00b9
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r1
            long r1 = r2.toMillis(r0)
            r5 = 2131964314(0x7f13319a, float:1.9565406E38)
            java.lang.String r0 = "MMM d"
            java.lang.String r4 = X.C14240TsN.A04(r0, r1)
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r7)
            if (r0 == 0) goto L_0x009b
            X.0eM r0 = X.C49318Et1.A01
        L_0x006d:
            java.lang.Object r3 = r0.getValue()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r3.format(r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = X.DbT.A12(r0, r1)
            java.lang.String r0 = X.DbV.A0u(r7, r4, r0, r5)
            X.0qQ.A07(r0)
        L_0x008e:
            r6.A03 = r0
            java.lang.Long r0 = r10.B1d()
            long r0 = X.DbY.A04(r0)
            r6.A00 = r0
            return
        L_0x009b:
            X.0eM r0 = X.C49318Et1.A00
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            java.util.Calendar r3 = (java.util.Calendar) r3
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r3.setTime(r0)
            r0 = 12
            int r0 = r3.get(r0)
            if (r0 != 0) goto L_0x00b6
            X.0eM r0 = X.C49318Et1.A02
            goto L_0x006d
        L_0x00b6:
            X.0eM r0 = X.C49318Et1.A03
            goto L_0x006d
        L_0x00b9:
            java.lang.String r0 = ""
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50670FgV.<init>(android.content.Context, com.instagram.common.session.UserSession, X.70l, X.DU0, com.instagram.user.model.User):void");
    }

    public final int BEF() {
        return R.drawable.instagram_shopping_bag_pano_filled_24;
    }
}
