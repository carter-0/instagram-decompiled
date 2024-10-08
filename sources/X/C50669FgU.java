package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FgU  reason: case insensitive filesystem */
public final class C50669FgU implements AnonymousClass73N {
    public int A00;
    public String A01 = ProfileBannerType.RELATED_ACCOUNTS.A00;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C3249670n A07;
    public final User A08;

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A01;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return null;
    }

    public final int BEF() {
        return this.A00;
    }

    public final String BGa() {
        return "impression_related_accounts_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A07.Dcy(this.A08);
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

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r0 != 1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C50669FgU(android.content.Context r6, com.instagram.common.session.UserSession r7, X.C3249670n r8, com.instagram.user.model.User r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A05 = r6
            r5.A06 = r7
            r5.A08 = r9
            r5.A07 = r8
            java.lang.String r0 = r9.getId()
            r5.A02 = r0
            com.instagram.api.schemas.ProfileBannerType r0 = com.instagram.api.schemas.ProfileBannerType.RELATED_ACCOUNTS
            java.lang.String r0 = r0.A00
            r5.A01 = r0
            int r0 = r9.A04()
            r4 = 1
            if (r0 != r4) goto L_0x00b7
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0C()
            if (r0 == 0) goto L_0x00b7
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0C()
            if (r0 == 0) goto L_0x0039
            com.instagram.api.schemas.IgUserRelatedAccountTypeEnum r0 = r0.AXx()
            if (r0 == 0) goto L_0x0039
            int r0 = r0.ordinal()
            r1 = 2131238293(0x7f081d95, float:1.809286E38)
            if (r0 == r4) goto L_0x003c
        L_0x0039:
            r1 = 2131237883(0x7f081bfb, float:1.809203E38)
        L_0x003c:
            r5.A00 = r1
            int r0 = r9.A04()
            if (r0 != r4) goto L_0x0099
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0C()
            if (r0 == 0) goto L_0x0099
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0C()
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = r0.AXw()
            if (r1 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r1 = ""
        L_0x0058:
            r5.A04 = r1
            int r0 = r9.A04()
            if (r0 != r4) goto L_0x006a
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r0 = r9.A0C()
            if (r0 == 0) goto L_0x006a
            r2 = 0
        L_0x0067:
            r5.A03 = r2
            return
        L_0x006a:
            android.content.Context r0 = r5.A05
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131820792(0x7f1100f8, float:1.9274309E38)
            int r1 = r9.A04()
            int r0 = r9.A04()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.DbY.A0e(r3, r0, r2, r1)
            X.4Cl r0 = r9.A03
            com.instagram.api.schemas.UserRelatedAccountsInfoDict r0 = r0.BSf()
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r0.AfF()
            if (r1 == 0) goto L_0x0067
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0067
            r2 = r1
            goto L_0x0067
        L_0x0099:
            com.instagram.common.session.UserSession r3 = r5.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36885771845501595(0x830b6a001e029b, double:3.3900488699522615E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "None"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
        L_0x00b4:
            java.lang.String r1 = "Other Profiles"
            goto L_0x0058
        L_0x00b7:
            r1 = 2131238956(0x7f08202c, float:1.8094205E38)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50669FgU.<init>(android.content.Context, com.instagram.common.session.UserSession, X.70n, com.instagram.user.model.User):void");
    }
}
