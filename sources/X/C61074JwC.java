package X;

import android.graphics.Bitmap;
import com.instagram.appreciation.graphql.FetchAppreciationCreatorInsightsQueryResponseImpl;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwC  reason: case insensitive filesystem */
public final class C61074JwC extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final C13997Tnz A03(SpecialRequirementCategory specialRequirementCategory) {
        Object obj;
        int A022 = DbU.A02(specialRequirementCategory, 0);
        if (A022 == 4) {
            obj = this.A03;
        } else if (A022 == 3) {
            obj = this.A02;
        } else if (A022 == 2) {
            obj = this.A01;
        } else if (A022 != 1) {
            return null;
        } else {
            obj = this.A00;
        }
        return (C13997Tnz) obj;
    }

    public final C61069Jw7 A04(C16679UzF uzF) {
        Object obj;
        int A022 = DbU.A02(uzF, 0);
        if (A022 == 0) {
            obj = this.A00;
        } else if (A022 == 1) {
            obj = this.A03;
        } else if (A022 == 2) {
            obj = this.A02;
        } else if (A022 == 3) {
            obj = this.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return (C61069Jw7) obj;
    }

    public static /* synthetic */ C61074JwC A00(C61074JwC jwC, OpalProfileData opalProfileData) {
        C61064Jw2 jw2 = (C61064Jw2) jwC.A01;
        C61064Jw2 jw22 = (C61064Jw2) jwC.A00;
        AnonymousClass7TG.A1T(opalProfileData, jw2, jw22);
        return new C61074JwC(jw2, jw22, (C324576zY) jwC.A03, opalProfileData);
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C61074JwC) || ((C61074JwC) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b5, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b7, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ca, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cc, code lost:
        r3 = (X.C61074JwC) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d6, code lost:
        if (X.0qQ.A0K(r2.A03, r3.A03) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d8, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fa, code lost:
        if (X.0qQ.A0K(r2.A03, r3.A03) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01fc, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0222, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0224, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0247, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0249, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0256, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0258, code lost:
        r3 = (X.C61074JwC) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0262, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0264, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x026e, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0276, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x027a, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02a7, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02a9, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b1, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012c, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0152, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0154, code lost:
        r3 = (X.C61074JwC) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015e, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0160, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0168, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0052;
                case 2: goto L_0x007c;
                case 3: goto L_0x0081;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00e5;
                case 8: goto L_0x00f8;
                case 9: goto L_0x00fe;
                case 10: goto L_0x0130;
                case 11: goto L_0x001d;
                case 12: goto L_0x014a;
                case 13: goto L_0x0171;
                case 14: goto L_0x018d;
                case 15: goto L_0x01bd;
                case 16: goto L_0x01c2;
                case 17: goto L_0x01de;
                case 18: goto L_0x027f;
                case 19: goto L_0x0202;
                case 20: goto L_0x0229;
                case 21: goto L_0x024e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x02b5
            r0 = 22
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01f2
        L_0x001b:
            r0 = 0
            return r0
        L_0x001d:
            if (r2 == r3) goto L_0x02b5
            r0 = 11
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x02ad
        L_0x004d:
            if (r2 == r3) goto L_0x02b5
            r0 = 0
            goto L_0x014e
        L_0x0052:
            if (r2 == r3) goto L_0x02b5
            r0 = 1
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a0
            goto L_0x001b
        L_0x007c:
            if (r2 == r3) goto L_0x02b5
            r0 = 2
            goto L_0x014e
        L_0x0081:
            if (r2 == r3) goto L_0x02b5
            r0 = 3
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x00a0
            goto L_0x001b
        L_0x00a0:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x012c
        L_0x00a6:
            if (r2 == r3) goto L_0x02b5
            r0 = 4
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0164
        L_0x00c1:
            if (r2 == r3) goto L_0x02b5
            r0 = 5
            goto L_0x01c6
        L_0x00c6:
            if (r2 == r3) goto L_0x02b5
            r0 = 6
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x027a
            goto L_0x001b
        L_0x00e5:
            if (r2 == r3) goto L_0x02b5
            r0 = 7
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x021a
            goto L_0x001b
        L_0x00f8:
            if (r2 == r3) goto L_0x02b5
            r0 = 8
            goto L_0x0252
        L_0x00fe:
            if (r2 == r3) goto L_0x02b5
            r0 = 9
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x012c:
            if (r1 == r0) goto L_0x02b5
            goto L_0x001b
        L_0x0130:
            if (r2 == r3) goto L_0x02b5
            r0 = 10
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x016c
            goto L_0x001b
        L_0x014a:
            if (r2 == r3) goto L_0x02b5
            r0 = 12
        L_0x014e:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0164:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x016c
            goto L_0x001b
        L_0x016c:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x01b1
        L_0x0171:
            if (r2 == r3) goto L_0x02b5
            r0 = 13
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0243
        L_0x018d:
            if (r2 == r3) goto L_0x02b5
            r0 = 14
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x01b1:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x02ad
        L_0x01bd:
            if (r2 == r3) goto L_0x02b5
            r0 = 15
            goto L_0x01c6
        L_0x01c2:
            if (r2 == r3) goto L_0x02b5
            r0 = 16
        L_0x01c6:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0268
        L_0x01de:
            if (r2 == r3) goto L_0x02b5
            r0 = 17
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x01f2
            goto L_0x001b
        L_0x01f2:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x02a3
        L_0x0202:
            if (r2 == r3) goto L_0x02b5
            r0 = 19
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x021a
            goto L_0x001b
        L_0x021a:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x02a3
        L_0x0229:
            if (r2 == r3) goto L_0x02b5
            r0 = 20
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x0243:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0272
        L_0x024e:
            if (r2 == r3) goto L_0x02b5
            r0 = 21
        L_0x0252:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x0268:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0272:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x027a
            goto L_0x001b
        L_0x027a:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x02ad
        L_0x027f:
            if (r2 == r3) goto L_0x02b5
            r0 = 18
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x001b
            X.JwC r3 = (X.C61074JwC) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x02a3:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x02ad:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x02b5
            goto L_0x001b
        L_0x02b5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61074JwC.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0168, code lost:
        r2 = (r2 + r1.hashCode()) * 31;
        r3 = X.AnonymousClass7TG.A0C(r4.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x021c, code lost:
        r3 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0238, code lost:
        r2 = X.AnonymousClass7TE.A0L(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0299, code lost:
        r2 = X.AnonymousClass7TE.A0L(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return r3 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A04
            switch(r1) {
                case 0: goto L_0x029f;
                case 1: goto L_0x027d;
                case 2: goto L_0x025b;
                case 3: goto L_0x023e;
                case 4: goto L_0x0222;
                case 5: goto L_0x0208;
                case 6: goto L_0x01f3;
                case 7: goto L_0x01d6;
                case 8: goto L_0x01b9;
                case 9: goto L_0x0186;
                case 10: goto L_0x0148;
                case 11: goto L_0x0132;
                case 12: goto L_0x011c;
                case 13: goto L_0x00ff;
                case 14: goto L_0x00f0;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00b6;
                case 17: goto L_0x009d;
                case 18: goto L_0x0082;
                case 19: goto L_0x0069;
                case 20: goto L_0x0048;
                case 21: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0L(r1)
        L_0x0025:
            int r3 = r3 + r2
            return r3
        L_0x0027:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x0048:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x0069:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r3 = r1.hashCode()
            goto L_0x0025
        L_0x0082:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r3 = r1.hashCode()
            goto L_0x0025
        L_0x009d:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x0238
        L_0x00b6:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            int r3 = r1.hashCode()
            goto L_0x0025
        L_0x00d0:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x00f0:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x0168
        L_0x00ff:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x011c:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
            goto L_0x021c
        L_0x0132:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            goto L_0x021c
        L_0x0148:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x017d;
                case 2: goto L_0x0180;
                case 3: goto L_0x0183;
                default: goto L_0x0151;
            }
        L_0x0151:
            java.lang.String r1 = "HIDDEN"
        L_0x0153:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0177;
                case 2: goto L_0x017a;
                default: goto L_0x0160;
            }
        L_0x0160:
            java.lang.String r1 = "READY"
        L_0x0162:
            int r2 = X.C51971G9r.A0F(r1, r2, r3)
            java.lang.Object r1 = r4.A02
        L_0x0168:
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A03
            int r3 = X.AnonymousClass7TG.A0C(r1)
            goto L_0x0025
        L_0x0177:
            java.lang.String r1 = "ERROR"
            goto L_0x0162
        L_0x017a:
            java.lang.String r1 = "LOADING"
            goto L_0x0162
        L_0x017d:
            java.lang.String r1 = "COLLAPSED"
            goto L_0x0153
        L_0x0180:
            java.lang.String r1 = "EXPANDED"
            goto L_0x0153
        L_0x0183:
            java.lang.String r1 = "COLLAPSED_WITH_NUX"
            goto L_0x0153
        L_0x0186:
            java.lang.Object r1 = r4.A03
            r2 = 0
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r4.A00
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0025
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x01b6
            java.lang.String r1 = "USER_NOT_ELIGIBLE_FOR_MONETIZATION"
        L_0x01b0:
            int r2 = X.C51966G9m.A04(r1, r2)
            goto L_0x0025
        L_0x01b6:
            java.lang.String r1 = "BONUS_TAGGING_TOS"
            goto L_0x01b0
        L_0x01b9:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x0238
        L_0x01d6:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r3 = r1.hashCode()
            goto L_0x0025
        L_0x01f3:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x021c
        L_0x0208:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
        L_0x021c:
            int r3 = r1.hashCode()
            goto L_0x0025
        L_0x0222:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
        L_0x0238:
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x023e:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A03
            goto L_0x0299
        L_0x025b:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x027d:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A03
        L_0x0299:
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        L_0x029f:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61074JwC.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        switch (this.A04) {
            case 6:
                sb = AnonymousClass7TE.A1A();
                sb.append("LifecycleListener(lifecycleEvent=");
                sb.append(this.A01);
                sb.append(", threadScope=");
                sb.append(this.A03);
                sb.append(", lifecycleScope=");
                sb.append(this.A02);
                sb.append(", action=");
                obj = this.A00;
                break;
            case 17:
                sb = AnonymousClass7TE.A1A();
                sb.append("SectionUiState(id=");
                sb.append(this.A02);
                sb.append(", title=");
                sb.append(this.A03);
                sb.append(C273654mx.A00(198));
                sb.append(this.A00);
                sb.append(", footers=");
                obj = this.A01;
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0n(obj, sb);
    }

    public static final C61074JwC A01(AnonymousClass7L2 r1, Integer num, Integer num2, List list) {
        AnonymousClass7TG.A1T(num, num2, list);
        return new C61074JwC(r1, num, num2, list);
    }

    public final String A05(C16679UzF uzF) {
        C62865Knf knf;
        C62085KZp kZp;
        C61069Jw7 A042 = A04(uzF);
        if (A042 != null) {
            knf = (C62865Knf) A042.A01;
        } else {
            knf = null;
        }
        if (!(knf instanceof C62085KZp) || (kZp = (C62085KZp) knf) == null) {
            return null;
        }
        return kZp.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC(GSY gsy, 1Xj r2, C49723F3m f3m, JMH jmh, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(21, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = 21;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC(CropInfo cropInfo, FilterGroupModel filterGroupModel, 0eP r3, 0eP r4, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(8, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = 8;
    }

    public C61074JwC(C48080EUy eUy, C48074EUs eUs, EV8 ev8, C62320sa r5) {
        this.A04 = 6;
        this.A01 = eUy;
        this.A03 = ev8;
        this.A02 = eUs;
        this.A00 = r5;
    }

    public C61074JwC(C13997Tnz tnz, C13997Tnz tnz2, C13997Tnz tnz3, C13997Tnz tnz4) {
        this.A04 = 5;
        this.A03 = tnz;
        this.A02 = tnz2;
        this.A01 = tnz3;
        this.A00 = tnz4;
    }

    public C61074JwC(C61083JwL jwL, XRY xry, List list, List list2) {
        this.A04 = 17;
        0qQ.A0B(xry, 1);
        this.A02 = xry;
        this.A03 = jwL;
        this.A00 = list;
        this.A01 = list2;
    }

    public C61074JwC(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings lifetimeEstimatedEarnings, FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo pageInfo, List list, List list2) {
        this.A04 = 4;
        0qQ.A0B(list, 2);
        this.A01 = lifetimeEstimatedEarnings;
        this.A00 = list;
        this.A02 = list2;
        this.A03 = pageInfo;
    }

    public C61074JwC(C61076JwE jwE, C15050ULg uLg, C4P c4p, AnonymousClass62P r5) {
        this.A04 = 15;
        0qQ.A0B(r5, 1);
        this.A03 = r5;
        this.A02 = c4p;
        this.A01 = jwE;
        this.A00 = uLg;
    }

    public C61074JwC(Bitmap bitmap, L0M l0m, HN3 hn3, MQJ mqj) {
        this.A04 = 7;
        C51972G9s.A1D(l0m, mqj);
        this.A00 = hn3;
        this.A02 = bitmap;
        this.A03 = l0m;
        this.A01 = mqj;
    }

    public C61074JwC(C61069Jw7 jw7, C61069Jw7 jw72, C61069Jw7 jw73, C61069Jw7 jw74) {
        this.A04 = 18;
        this.A00 = jw7;
        this.A03 = jw72;
        this.A02 = jw73;
        this.A01 = jw74;
    }

    public C61074JwC(AnonymousClass7L2 r2, Integer num, Integer num2, List list) {
        this.A04 = 10;
        this.A00 = num;
        this.A01 = num2;
        this.A02 = list;
        this.A03 = r2;
    }

    public C61074JwC(C61064Jw2 jw2, C61064Jw2 jw22, C324576zY r4, OpalProfileData opalProfileData) {
        this.A04 = 14;
        this.A02 = opalProfileData;
        this.A01 = jw2;
        this.A00 = jw22;
        this.A03 = r4;
    }

    public C61074JwC(N4R n4r, N4R n4r2, C15050ULg uLg, List list) {
        this.A04 = 13;
        this.A03 = list;
        this.A01 = uLg;
        this.A02 = n4r;
        this.A00 = n4r2;
    }

    public C61074JwC(C61083JwL jwL, C61083JwL jwL2, C61083JwL jwL3, C64070LLo lLo) {
        this.A04 = 16;
        C51974G9v.A1P(jwL, jwL2, jwL3, lLo);
        this.A03 = jwL;
        this.A02 = jwL2;
        this.A01 = jwL3;
        this.A00 = lLo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC(C61069Jw7 jw7) {
        this(jw7, new C61069Jw7((C62865Knf) null, (Integer) null, 7), new C61069Jw7((C62865Knf) null, (Integer) null, 7), new C61069Jw7((C62865Knf) null, (Integer) null, 7));
        this.A04 = 18;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC(L0M l0m, HN3 hn3, MQJ mqj) {
        this((Bitmap) null, l0m, hn3, mqj);
        this.A04 = 7;
    }

    public C61074JwC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61074JwC(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, int r11) {
        /*
            r7 = this;
            r3 = r10
            r5 = r9
            r4 = r8
            r6 = 0
            r2 = 9
            r1 = r7
            r7.A04 = r2
            r0 = r11 & 2
            if (r0 == 0) goto L_0x000e
            r4 = r6
        L_0x000e:
            r0 = r11 & 4
            if (r0 == 0) goto L_0x0013
            r5 = r6
        L_0x0013:
            r0 = r11 & 8
            if (r0 == 0) goto L_0x0018
            r3 = r6
        L_0x0018:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61074JwC.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC() {
        this(new C61064Jw2((C62520KhB) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), new C61064Jw2((C62520KhB) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), (C324576zY) null, new OpalProfileData(C62520KhB.Uninitialized, "", "", "", "", (String) null, "", 0sn.A00, 0, false, false, false, false));
        this.A04 = 14;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.CwB, java.lang.Object] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61074JwC(int i) {
        this(20, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A04 = i;
        if (19 - i != 0) {
            this.A04 = 20;
            return;
        }
        this.A04 = 19;
        C61069Jw7 jw7 = new C61069Jw7((1Xj) null, (ProductTile) null, (User) null, (DefaultConstructorMarker) null, 7, 9);
        C61083JwL jwL = new C61083JwL((C61069Jw7) null, (List) 0sn.A00);
        ? obj = new Object();
        obj.A09 = null;
        obj.A0B = null;
        obj.A00 = null;
        obj.A05 = null;
        obj.A02 = null;
        obj.A01 = null;
        obj.A08 = null;
        obj.A07 = null;
        obj.A06 = null;
        obj.A04 = null;
        obj.A0A = null;
        obj.A03 = null;
        C61069Jw7 A002 = VHB.A00();
        this.A04 = 19;
        0qQ.A0B(A002, 4);
        this.A00 = jw7;
        this.A02 = jwL;
        this.A03 = obj;
        this.A01 = A002;
    }
}
