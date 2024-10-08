package X;

import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class QP7 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public QP7(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension) {
        this(iABAdsBwIntegrationExtension.A01, iABAdsBwIntegrationExtension.A02, iABAdsBwIntegrationExtension.A03, iABAdsBwIntegrationExtension.A07, iABAdsBwIntegrationExtension.A05, iABAdsBwIntegrationExtension.A06, iABAdsBwIntegrationExtension.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011e, code lost:
        r1 = r2.A07;
        r0 = r3.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0126, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0047;
                case 2: goto L_0x008b;
                case 3: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x012a
            r1 = 0
            boolean r0 = r3 instanceof X.QP7
            if (r0 == 0) goto L_0x0128
            X.QP7 r3 = (X.QP7) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0128
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0128
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L_0x0128
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            goto L_0x0118
        L_0x0047:
            if (r2 == r3) goto L_0x012a
            r1 = 1
            boolean r0 = r3 instanceof X.QP7
            if (r0 == 0) goto L_0x0128
            X.QP7 r3 = (X.QP7) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0128
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
            goto L_0x00ca
        L_0x008b:
            if (r2 == r3) goto L_0x012a
            r1 = 2
            boolean r0 = r3 instanceof X.QP7
            if (r0 == 0) goto L_0x0128
            X.QP7 r3 = (X.QP7) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0128
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0128
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x00ca:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x0122
        L_0x00d5:
            if (r2 == r3) goto L_0x012a
            r1 = 3
            boolean r0 = r3 instanceof X.QP7
            if (r0 == 0) goto L_0x0128
            X.QP7 r3 = (X.QP7) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0128
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
        L_0x0118:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
        L_0x0122:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x012a
        L_0x0128:
            r0 = 0
            return r0
        L_0x012a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                Integer num = (Integer) this.A01;
                int A0D = C51971G9r.A0D(num, RVS.A00(num)) * 31;
                Integer num2 = (Integer) this.A03;
                i2 = (((((((AnonymousClass7TG.A0B(num2, RVT.A00(num2), A0D) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
                i = C41845B3m.A00(this.A07);
                break;
            case 1:
                i2 = (AnonymousClass7TF.A08(this.A06, ((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31;
                i = AnonymousClass7TE.A0L(this.A03);
                break;
            case 2:
                i = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A06))))));
                i2 = AnonymousClass7TG.A0C(this.A03);
                break;
            case 3:
                int A0K = AnonymousClass7TE.A0K(this.A01);
                return C41845B3m.A01(this.A07, AnonymousClass7TF.A08(this.A06, (((((AnonymousClass7TF.A08(this.A04, A0K) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31));
            default:
                return super.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                sb = AnonymousClass7TE.A1A();
                sb.append("BwIAdsInfo(bwIType=");
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = RVS.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(", partnerType=");
                Integer num2 = (Integer) this.A03;
                if (num2 != null) {
                    str2 = RVT.A00(num2);
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                sb.append(", initialUrl=");
                sb.append(this.A06);
                sb.append(", oauthIntegrationId=");
                sb.append(this.A02);
                sb.append(", apiKey=");
                sb.append(this.A04);
                sb.append(", bauProductUrl=");
                sb.append(this.A05);
                sb.append(", pageName=");
                sb.append(this.A07);
                break;
            case 2:
                sb = AnonymousClass7TE.A1A();
                sb.append("PromotionInformationData(screenTitle=");
                sb.append(this.A06);
                sb.append(", displayTitle=");
                sb.append(this.A05);
                sb.append(", displayBody=");
                sb.append(this.A04);
                sb.append(", thumbnailUrl=");
                sb.append(this.A07);
                sb.append(", mediaProductType=");
                sb.append(this.A01);
                sb.append(", primaryButtonAction=");
                sb.append(this.A02);
                sb.append(", secondaryButtonAction=");
                sb.append(this.A03);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0p(sb);
    }

    public QP7(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, String str, String str2, String str3, String str4, List list) {
        AnonymousClass7TG.A1O(list, str);
        C51972G9s.A1E(str3, str4);
        this.A01 = list;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = achievementButtonInfo;
        this.A03 = achievementButtonInfo2;
        this.A06 = str3;
        this.A07 = str4;
    }

    public QP7(Long l, String str, String str2, String str3, String str4, List list, List list2) {
        0qQ.A0B(str3, 5);
        this.A01 = list;
        this.A04 = str;
        this.A02 = l;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = list2;
    }

    public QP7(ImageUrl imageUrl, User user, Long l, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A01 = user;
        this.A02 = imageUrl;
        this.A07 = str2;
        this.A03 = l;
        this.A04 = str3;
        this.A05 = str4;
    }

    public QP7(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(num, num2);
        this.A01 = num;
        this.A03 = num2;
        this.A06 = str;
        this.A02 = l;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = str4;
    }

    public QP7(InstagramMediaProductType instagramMediaProductType, PromoteButtonAction promoteButtonAction, PromoteButtonAction promoteButtonAction2, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = str4;
        this.A01 = instagramMediaProductType;
        this.A02 = promoteButtonAction;
        this.A03 = promoteButtonAction2;
    }
}
