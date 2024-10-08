package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class LT6 {
    public final UserSession A00;
    public final C62462KgC A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((X.00k.A0O(r2, r1) instanceof X.KNx) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if ((X.00k.A0O(r2, r1) instanceof X.C61834KNy) == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A06(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r6, X.C61075JwD r7) {
        /*
            r5 = this;
            r0 = 1
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0q(r6, r0)
            java.util.List r0 = r5.A01(r6)
            if (r0 == 0) goto L_0x0052
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0013:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            X.KmH r1 = (X.C62779KmH) r1
            boolean r0 = r1 instanceof X.C61832KNv
            if (r0 == 0) goto L_0x0037
            r0 = r1
            X.KNv r0 = (X.C61832KNv) r0
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = r0.A00
            boolean r0 = r5.A07(r0, r6, r7)
        L_0x002c:
            if (r0 == 0) goto L_0x0031
        L_0x002e:
            r2.add(r1)
        L_0x0031:
            X.0gF r0 = X.C60340gF.A00
            r3.add(r0)
            goto L_0x0013
        L_0x0037:
            boolean r0 = r1 instanceof X.C61833KNw
            if (r0 == 0) goto L_0x0045
            r0 = r1
            X.KNw r0 = (X.C61833KNw) r0
            java.lang.Integer r0 = r0.A00
            boolean r0 = r5.A08(r6, r7, r0)
            goto L_0x002c
        L_0x0045:
            boolean r0 = r1 instanceof X.C61834KNy
            if (r0 != 0) goto L_0x002e
            boolean r0 = r1 instanceof X.KNx
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0052:
            r3 = 0
            r4 = 0
        L_0x0054:
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x009e
            java.lang.Object r0 = X.00k.A0O(r2, r4)
            boolean r0 = r0 instanceof X.KNx
            if (r0 == 0) goto L_0x0080
            if (r4 == 0) goto L_0x0076
            int r0 = r2.size()
            int r0 = r0 + -1
            if (r4 == r0) goto L_0x0076
            int r1 = r4 + -1
        L_0x006e:
            java.lang.Object r0 = X.00k.A0O(r2, r1)
            boolean r0 = r0 instanceof X.KNx
            if (r0 == 0) goto L_0x009b
        L_0x0076:
            r2.remove(r4)
            int r0 = r4 + -1
            int r4 = java.lang.Math.max(r3, r0)
            goto L_0x0054
        L_0x0080:
            java.lang.Object r0 = X.00k.A0O(r2, r4)
            boolean r0 = r0 instanceof X.C61834KNy
            if (r0 == 0) goto L_0x009b
            int r0 = r2.size()
            int r0 = r0 + -1
            if (r4 == r0) goto L_0x0076
            int r1 = r4 + 1
            java.lang.Object r0 = X.00k.A0O(r2, r1)
            boolean r0 = r0 instanceof X.C61834KNy
            if (r0 != 0) goto L_0x0076
            goto L_0x006e
        L_0x009b:
            int r4 = r4 + 1
            goto L_0x0054
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT6.A06(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType, X.JwD):java.util.ArrayList");
    }

    public final boolean A07(PublishScreenCategoryType publishScreenCategoryType, PublishScreenCategoryType publishScreenCategoryType2, C61075JwD jwD) {
        0qQ.A0B(publishScreenCategoryType, 0);
        List A012 = A01(publishScreenCategoryType);
        if (A012 == null) {
            return false;
        }
        ArrayList<C61833KNw> A1C = AnonymousClass7TE.A1C();
        for (Object next : A012) {
            if (next instanceof C61833KNw) {
                A1C.add(next);
            }
        }
        if ((A1C instanceof Collection) && A1C.isEmpty()) {
            return false;
        }
        for (C61833KNw kNw : A1C) {
            if (A08(publishScreenCategoryType2, jwD, kNw.A00)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x059a, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x059d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x05dc, code lost:
        return X.0sr.A1P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0593, code lost:
        r0 = X.AnonymousClass05K.A04;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x035b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A01(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r7) {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r3 = r6.A00
            X.KgC r0 = r6.A01
            r5 = 0
            r4 = 1
            int r0 = X.DbU.A02(r0, r4)
            if (r0 == r5) goto L_0x01f8
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            int r1 = r7.ordinal()
            if (r1 == r5) goto L_0x0155
            if (r1 == r4) goto L_0x0098
            r0 = 2
            if (r1 == r0) goto L_0x008b
            r0 = 3
            if (r1 == r0) goto L_0x00b6
            r0 = 4
            if (r1 != r0) goto L_0x0204
            java.lang.Integer r0 = X.AnonymousClass05K.A0Z
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0b
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0W
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0c
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0a
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
        L_0x0087:
            A04(r0, r2)
            return r2
        L_0x008b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0b
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            goto L_0x0087
        L_0x0098:
            r0 = 2131976888(0x7f1362b8, float:1.959091E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            A04(r0, r2)
            X.KNx r0 = X.KNx.A00
            r2.add(r0)
            r0 = 2131966741(0x7f133b15, float:1.9570329E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            goto L_0x0087
        L_0x00b6:
            boolean r0 = X.LTP.A01(r3)
            if (r0 == 0) goto L_0x0131
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0W
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            r0 = 2131952475(0x7f13035b, float:1.9541394E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0b
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            A04(r0, r2)
        L_0x00ee:
            r2.add(r1)
            r0 = 2131973680(0x7f135630, float:1.9584403E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131963502(0x7f132e6e, float:1.956376E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131953412(0x7f130704, float:1.9543294E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131952024(0x7f130198, float:1.954048E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            A04(r0, r2)
            return r2
        L_0x0131:
            boolean r0 = X.LTP.A02(r3)
            if (r0 == 0) goto L_0x0152
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0W
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
            goto L_0x00ee
        L_0x0152:
            X.0sn r2 = X.0sn.A00
            return r2
        L_0x0155:
            boolean r0 = X.LTP.A01(r3)
            if (r0 == 0) goto L_0x0179
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0c
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
        L_0x0170:
            r2.add(r1)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            A02(r0, r2)
            return r2
        L_0x0179:
            boolean r0 = X.LTP.A02(r3)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x01a2
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0c
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
            A02(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.ADS_AND_MONETIZATION
            A02(r0, r2)
            goto L_0x0170
        L_0x01a2:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Z
            A04(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.INTERNAL_TEST
            A02(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0c
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            A02(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.ADS_AND_MONETIZATION
            A02(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0W
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0b
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            A04(r0, r2)
            return r2
        L_0x01f8:
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x0206;
                case 1: goto L_0x0551;
                case 2: goto L_0x059e;
                case 3: goto L_0x03e0;
                case 4: goto L_0x0204;
                case 5: goto L_0x05c6;
                default: goto L_0x01ff;
            }
        L_0x01ff:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0204:
            r2 = 0
            return r2
        L_0x0206:
            boolean r0 = X.LTP.A05(r3)
            if (r0 == 0) goto L_0x0274
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            X.KNx r5 = X.KNx.A00
            r2.add(r5)
            boolean r0 = X.LTP.A03(r3)
            if (r0 == 0) goto L_0x022d
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            A04(r0, r2)
            r2.add(r5)
        L_0x022d:
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            A02(r0, r2)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330887838712643(0x8112c000004343, double:3.039137989720374E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0262
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.CROSSPOST
            X.KNv r1 = new X.KNv
            r1.<init>(r0)
        L_0x0246:
            r2.add(r1)
            r2.add(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
        L_0x024e:
            X.KNw r1 = new X.KNw
            r1.<init>(r0)
        L_0x0253:
            r2.add(r1)
            r2.add(r5)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
        L_0x025b:
            X.KNv r1 = new X.KNv
            r1.<init>(r0)
            goto L_0x059a
        L_0x0262:
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0d
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            X.KNw r1 = new X.KNw
            r1.<init>(r0)
            goto L_0x0246
        L_0x0274:
            boolean r0 = X.LTP.A06(r3)
            if (r0 == 0) goto L_0x02c7
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
            A02(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            boolean r0 = X.LTP.A03(r3)
            if (r0 == 0) goto L_0x02a5
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            A04(r0, r2)
            r2.add(r1)
        L_0x02a5:
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.ADS_AND_MONETIZATION
            A02(r0, r2)
            r2.add(r1)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            X.KNv r1 = new X.KNv
            r1.<init>(r0)
        L_0x02b4:
            r2.add(r1)
        L_0x02b7:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330887838712643(0x8112c000004343, double:3.039137989720374E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x035b
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.CROSSPOST
            goto L_0x025b
        L_0x02c7:
            boolean r0 = X.LTP.A07(r3)
            if (r0 == 0) goto L_0x030e
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            X.KNx r5 = X.KNx.A00
            r2.add(r5)
            r2.add(r5)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            A02(r0, r2)
            boolean r0 = X.LTP.A03(r3)
            if (r0 == 0) goto L_0x02f8
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            A04(r0, r2)
        L_0x02f8:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330887838712643(0x8112c000004343, double:3.039137989720374E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x034d
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.CROSSPOST
            X.KNv r1 = new X.KNv
            r1.<init>(r0)
            goto L_0x0253
        L_0x030e:
            boolean r0 = X.LTP.A08(r3)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x0369
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
            A02(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.ADS_AND_MONETIZATION
            A02(r0, r2)
            r2.add(r1)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.AUDIENCE_AND_DISTRIBUTION
            A02(r0, r2)
            boolean r0 = X.LTP.A03(r3)
            if (r0 == 0) goto L_0x02b7
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            X.KNw r1 = new X.KNw
            r1.<init>(r0)
            goto L_0x02b4
        L_0x034d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0d
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            goto L_0x024e
        L_0x035b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0d
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            goto L_0x0595
        L_0x0369:
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            A03(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0P
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0d
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0595
        L_0x03e0:
            boolean r0 = X.LTP.A05(r3)
            if (r0 != 0) goto L_0x048d
            boolean r0 = X.LTP.A07(r3)
            if (r0 != 0) goto L_0x048d
            boolean r0 = X.LTP.A06(r3)
            if (r0 != 0) goto L_0x04d4
            boolean r0 = X.LTP.A08(r3)
            if (r0 != 0) goto L_0x04d4
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 2131955762(0x7f131032, float:1.954806E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            A04(r0, r2)
            r0 = 2131963622(0x7f132ee6, float:1.9564003E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            A04(r0, r2)
            r0 = 2131955330(0x7f130e82, float:1.9547184E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            A04(r0, r2)
            r0 = 2131955893(0x7f1310b5, float:1.9548326E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Q
            A04(r0, r2)
            r0 = 2131955239(0x7f130e27, float:1.9547E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            A04(r0, r2)
            r0 = 2131955483(0x7f130f1b, float:1.9547495E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0S
            A04(r0, r2)
            X.2ib r0 = new X.2ib
            r0.<init>(r3)
            boolean r1 = r0.A00()
            r0 = 2131955345(0x7f130e91, float:1.9547215E38)
            if (r1 == 0) goto L_0x044f
            r0 = 2131955196(0x7f130dfc, float:1.9546913E38)
        L_0x044f:
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            A04(r0, r2)
            r0 = 2131955317(0x7f130e75, float:1.9547158E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            A04(r0, r2)
            r0 = 2131955161(0x7f130dd9, float:1.9546842E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0T
            A04(r0, r2)
            r0 = 2131955306(0x7f130e6a, float:1.9547136E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0L
            A04(r0, r2)
            r0 = 2131955387(0x7f130ebb, float:1.95473E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0K
            A04(r0, r2)
            r0 = 2131963402(0x7f132e0a, float:1.9563556E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            goto L_0x0590
        L_0x048d:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            r0 = 2131952475(0x7f13035b, float:1.9541394E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0S
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            A04(r0, r2)
            goto L_0x04f8
        L_0x04d4:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
        L_0x04f8:
            r2.add(r1)
            r0 = 2131973680(0x7f135630, float:1.9584403E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131976850(0x7f136292, float:1.9590832E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Q
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131963503(0x7f132e6f, float:1.9563761E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0K
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131952025(0x7f130199, float:1.9540481E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0T
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0L
            goto L_0x0595
        L_0x0551:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 2131976889(0x7f1362b9, float:1.9590911E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            A04(r0, r2)
            X.KNx r1 = X.KNx.A00
            r2.add(r1)
            r0 = 2131976874(0x7f1362aa, float:1.959088E38)
            A05(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            A04(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            A04(r0, r2)
            r2.add(r1)
            r0 = 2131966741(0x7f133b15, float:1.9570329E38)
            A05(r2, r0)
            boolean r0 = X.LTP.A03(r3)
            if (r0 != 0) goto L_0x0593
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
        L_0x0590:
            A04(r0, r2)
        L_0x0593:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
        L_0x0595:
            X.KNw r1 = new X.KNw
            r1.<init>(r0)
        L_0x059a:
            r2.add(r1)
            return r2
        L_0x059e:
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            X.KNw r5 = new X.KNw
            r5.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.KNw r4 = new X.KNw
            r4.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.KNw r3 = new X.KNw
            r3.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0S
            X.KNw r2 = new X.KNw
            r2.<init>(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0O
            X.KNw r0 = new X.KNw
            r0.<init>(r1)
            X.KNw[] r0 = new X.C61833KNw[]{r5, r4, r3, r2, r0}
            goto L_0x05d8
        L_0x05c6:
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            X.KNw r2 = new X.KNw
            r2.<init>(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            X.KNw r0 = new X.KNw
            r0.<init>(r1)
            X.KNw[] r0 = new X.C61833KNw[]{r2, r0}
        L_0x05d8:
            java.util.List r2 = X.0sr.A1P(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT6.A01(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType):java.util.List");
    }

    public static void A02(PublishScreenCategoryType publishScreenCategoryType, AbstractCollection abstractCollection) {
        abstractCollection.add(new C61832KNv(publishScreenCategoryType));
    }

    public static void A03(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new C61833KNw(num));
        abstractCollection.add(new C61833KNw(AnonymousClass05K.A06));
    }

    public static void A04(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new C61833KNw(num));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d1, code lost:
        r1 = X.182.A06(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0292, code lost:
        r0 = X.182.A06(r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02d8, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x036c, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018f, code lost:
        r0 = X.182.A06(r2, r3, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x036e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r8, X.C61075JwD r9, java.lang.Integer r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C61824KNn
            if (r0 == 0) goto L_0x01d9
            r4 = r7
            X.KNn r4 = (X.C61824KNn) r4
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r1 = 11
            int r6 = r10.intValue()
            r5 = 0
            r0 = 10
            if (r6 == r0) goto L_0x0038
            if (r6 == r1) goto L_0x0038
            r0 = 20
            if (r6 == r0) goto L_0x0038
            r0 = 17
            if (r6 == r0) goto L_0x0038
        L_0x0020:
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325751058216132(0x810e14000634c4, double:3.0358894690502255E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x036e
            switch(r6) {
                case 0: goto L_0x036e;
                case 1: goto L_0x036e;
                case 2: goto L_0x019b;
                case 3: goto L_0x036f;
                case 4: goto L_0x017e;
                case 5: goto L_0x0046;
                case 6: goto L_0x0058;
                case 7: goto L_0x01c6;
                case 8: goto L_0x007d;
                case 9: goto L_0x003f;
                case 10: goto L_0x0126;
                case 11: goto L_0x012d;
                case 12: goto L_0x01a7;
                case 13: goto L_0x008b;
                case 14: goto L_0x036e;
                case 15: goto L_0x01a1;
                case 16: goto L_0x0140;
                case 17: goto L_0x0134;
                case 18: goto L_0x00b7;
                case 19: goto L_0x0168;
                case 20: goto L_0x036e;
                case 21: goto L_0x00c2;
                case 22: goto L_0x0174;
                case 23: goto L_0x0118;
                case 24: goto L_0x00c2;
                case 25: goto L_0x00c5;
                case 26: goto L_0x036e;
                case 27: goto L_0x0346;
                case 28: goto L_0x01ad;
                case 29: goto L_0x0184;
                case 30: goto L_0x0195;
                case 31: goto L_0x01cc;
                case 32: goto L_0x00f3;
                case 33: goto L_0x0106;
                case 34: goto L_0x010a;
                case 35: goto L_0x036e;
                case 36: goto L_0x00d0;
                case 37: goto L_0x036e;
                case 38: goto L_0x036f;
                case 39: goto L_0x036f;
                case 40: goto L_0x036f;
                case 41: goto L_0x036f;
                case 42: goto L_0x036f;
                case 43: goto L_0x036f;
                case 44: goto L_0x016e;
                default: goto L_0x0033;
            }
        L_0x0033:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0038:
            boolean r0 = X.C64003LIj.A01(r9)
            if (r0 != 0) goto L_0x036f
            goto L_0x0020
        L_0x003f:
            r0 = 36315640704929216(0x8104e200020dc0, double:3.029495640920455E-306)
            goto L_0x01d1
        L_0x0046:
            java.lang.Integer r1 = X.JTR.A0w(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x036f
            boolean r1 = r4.A06
            boolean r0 = r4.A05
            boolean r0 = X.C63215KtM.A00(r3, r1, r0)
            goto L_0x01c2
        L_0x0058:
            boolean r1 = r4.A05
            boolean r0 = X.JU9.A00(r3)
            if (r0 == 0) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            goto L_0x036e
        L_0x0064:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325751058478278(0x810e14000a34c6, double:3.0358894692160077E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x036f
            boolean r0 = X.AnonymousClass2o2.A05(r3)
            if (r0 == 0) goto L_0x036f
            boolean r0 = X.AnonymousClass2o2.A00(r3)
            goto L_0x01c2
        L_0x007d:
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x036f
            X.8J0 r0 = r4.A00
            if (r0 != 0) goto L_0x036f
            boolean r0 = X.C347037wA.A04(r3)
            goto L_0x01c2
        L_0x008b:
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x00a6
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            boolean r0 = r0.A1q()
            if (r0 == 0) goto L_0x00a6
            X.0Tu r4 = X.0Tu.A06
            r0 = 36319884132753096(0x8108be00041ec8, double:3.032179201763189E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x036e
        L_0x00a6:
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            boolean r0 = r0.A1q()
            if (r0 == 0) goto L_0x036f
            r0 = 36319884132687559(0x8108be00031ec7, double:3.032179201721743E-306)
            goto L_0x018f
        L_0x00b7:
            boolean r1 = r4.A05
            boolean r0 = X.JU9.A00(r3)
            if (r0 == 0) goto L_0x036e
            if (r1 != 0) goto L_0x036e
            return r5
        L_0x00c2:
            boolean r0 = r4.A03
            goto L_0x0122
        L_0x00c5:
            boolean r0 = X.AnonymousClass2o2.A00(r3)
            if (r0 == 0) goto L_0x036f
            boolean r0 = X.AnonymousClass2o2.A05(r3)
            goto L_0x0122
        L_0x00d0:
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x036f
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x036f
            X.4Cl r0 = X.DbV.A0k(r3)
            java.lang.Boolean r0 = r0.C9v()
            if (r0 == 0) goto L_0x036f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x036f
            r0 = 36325235661746932(0x810d9c000032f4, double:3.0355635302477684E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x01c2
        L_0x00f3:
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x036f
            if (r9 == 0) goto L_0x036e
            X.Jvk r0 = r9.A04
            if (r0 == 0) goto L_0x036e
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x036e
            int r0 = r0.length()
            goto L_0x0122
        L_0x0106:
            boolean r1 = r4.A06
            goto L_0x01d5
        L_0x010a:
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            X.4kW r0 = r0.A03()
            boolean r1 = r0.A02(r3)
            goto L_0x01d5
        L_0x0118:
            boolean r0 = X.C319116q4.A08(r3, r0)
            if (r0 == 0) goto L_0x036f
            boolean r0 = X.C319116q4.A07(r3)
        L_0x0122:
            if (r0 != 0) goto L_0x036f
            goto L_0x036e
        L_0x0126:
            r0 = 36311779529196298(0x81015f0000030a, double:3.027053817839251E-306)
            goto L_0x01d1
        L_0x012d:
            r0 = 36314515423365786(0x8103dc00000a9a, double:3.0287840083285965E-306)
            goto L_0x01d1
        L_0x0134:
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r3)
            boolean r1 = r0.A05(r1)
            goto L_0x01d5
        L_0x0140:
            r0 = 25
            X.MMf r1 = X.C66296MMf.A00(r3, r0)
            java.lang.Class<X.L14> r0 = X.L14.class
            java.lang.Object r1 = r3.A01(r0, r1)
            X.L14 r1 = (X.L14) r1
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r1.A00
            X.4Cl r0 = X.DbS.A0h(r3, r0)
            java.lang.Boolean r0 = r0.CS9()
            if (r0 == 0) goto L_0x036f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x036f
            r0 = 36322821890124239(0x810b6a000029cf, double:3.034037051354099E-306)
            goto L_0x018f
        L_0x0168:
            X.3kF r0 = X.C249713kF.A00
            if (r0 == 0) goto L_0x036f
            goto L_0x036e
        L_0x016e:
            r0 = 36324101791035180(0x810c94000a2f2c, double:3.0348464658439256E-306)
            goto L_0x01d1
        L_0x0174:
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.MORE
            boolean r1 = r4.A06
            if (r8 == r0) goto L_0x01d5
            if (r1 != 0) goto L_0x036f
            goto L_0x036e
        L_0x017e:
            r0 = 36326996598470769(0x810f3600023871, double:3.036677153722646E-306)
            goto L_0x01d1
        L_0x0184:
            boolean r0 = X.JTR.A1Z(r3)
            if (r0 == 0) goto L_0x036f
            r0 = 36316478223421839(0x8105a50000118f, double:3.030025290987606E-306)
        L_0x018f:
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x036c
        L_0x0195:
            r0 = 36317358692570195(0x810672000d1453, double:3.030582103222391E-306)
            goto L_0x01d1
        L_0x019b:
            r0 = 36320382349681024(0x810932000f2180, double:3.032494276154569E-306)
            goto L_0x01d1
        L_0x01a1:
            r0 = 36316108856233932(0x81054f00000fcc, double:3.029791701690651E-306)
            goto L_0x01d1
        L_0x01a7:
            r0 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
            goto L_0x01d1
        L_0x01ad:
            boolean r0 = X.JTQ.A1Q(r2, r3)
            if (r0 != 0) goto L_0x036e
            boolean r0 = X.JTQ.A1R(r2, r3)
            if (r0 != 0) goto L_0x036e
            r0 = 36322920674503337(0x810b8100022aa9, double:3.0340995229932135E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x01c2:
            if (r0 == 0) goto L_0x036f
            goto L_0x036e
        L_0x01c6:
            r0 = 36323156897704867(0x810bb800022ba3, double:3.0342489114970556E-306)
            goto L_0x01d1
        L_0x01cc:
            r0 = 36324475452534894(0x810ceb0000306e, double:3.035082770880959E-306)
        L_0x01d1:
            boolean r1 = X.182.A06(r2, r3, r0)
        L_0x01d5:
            if (r1 == 0) goto L_0x036f
            goto L_0x036e
        L_0x01d9:
            r5 = r7
            X.KNo r5 = (X.C61825KNo) r5
            r0 = 0
            X.0qQ.A0B(r10, r0)
            boolean r4 = X.C64003LIj.A01(r9)
            if (r4 == 0) goto L_0x0208
            int r0 = r10.intValue()
            switch(r0) {
                case 11: goto L_0x0342;
                case 19: goto L_0x0342;
                case 25: goto L_0x0342;
                case 30: goto L_0x0342;
                case 31: goto L_0x0342;
                case 37: goto L_0x0342;
                case 38: goto L_0x0342;
                case 39: goto L_0x0342;
                case 40: goto L_0x0342;
                case 42: goto L_0x0342;
                case 43: goto L_0x0342;
                default: goto L_0x01ed;
            }
        L_0x01ed:
            com.instagram.common.session.UserSession r2 = r5.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328645866175991(0x8110b600063df7, double:3.0377201572604964E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x036e
            int r0 = r10.intValue()
            switch(r0) {
                case 0: goto L_0x036e;
                case 1: goto L_0x02d2;
                case 2: goto L_0x0342;
                case 3: goto L_0x02fb;
                case 4: goto L_0x0342;
                case 5: goto L_0x0342;
                case 6: goto L_0x02e8;
                case 7: goto L_0x0342;
                case 8: goto L_0x02dc;
                case 9: goto L_0x036e;
                case 10: goto L_0x0342;
                case 11: goto L_0x0287;
                case 12: goto L_0x028d;
                case 13: goto L_0x0342;
                case 14: goto L_0x032c;
                case 15: goto L_0x0342;
                case 16: goto L_0x036e;
                case 17: goto L_0x0342;
                case 18: goto L_0x0342;
                case 19: goto L_0x02a3;
                case 20: goto L_0x0342;
                case 21: goto L_0x0342;
                case 22: goto L_0x0342;
                case 23: goto L_0x02e1;
                case 24: goto L_0x0342;
                case 25: goto L_0x0298;
                case 26: goto L_0x036e;
                case 27: goto L_0x0342;
                case 28: goto L_0x0342;
                case 29: goto L_0x036e;
                case 30: goto L_0x031a;
                case 31: goto L_0x027b;
                case 32: goto L_0x0342;
                case 33: goto L_0x036e;
                case 34: goto L_0x036e;
                case 35: goto L_0x036e;
                case 36: goto L_0x0342;
                case 37: goto L_0x036e;
                case 38: goto L_0x0281;
                case 39: goto L_0x02bc;
                case 40: goto L_0x0315;
                case 41: goto L_0x036e;
                case 42: goto L_0x02c9;
                case 43: goto L_0x025b;
                case 44: goto L_0x0342;
                default: goto L_0x0203;
            }
        L_0x0203:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0208:
            java.lang.Integer r0 = X.AnonymousClass05K.A0b
            if (r10 != r0) goto L_0x01ed
            if (r9 == 0) goto L_0x0342
            boolean r0 = X.C64187LSu.A02(r9)
            if (r0 == 0) goto L_0x0250
            X.Jv3 r0 = r9.A0B
            if (r0 == 0) goto L_0x0342
            java.util.ArrayList r3 = r0.A01
            if (r3 == 0) goto L_0x0342
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r3)
        L_0x0220:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0250
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r2)
            com.instagram.model.shopping.ProductTag r0 = (com.instagram.model.shopping.ProductTag) r0
            com.instagram.api.schemas.ProductReviewStatus r1 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.A02
            com.instagram.api.schemas.ProductReviewStatus r0 = r0.BoK()
            if (r1 == r0) goto L_0x0220
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r3)
        L_0x023a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0342
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r2)
            com.instagram.model.shopping.ProductTag r0 = (com.instagram.model.shopping.ProductTag) r0
            com.instagram.api.schemas.ProductReviewStatus r1 = com.instagram.api.schemas.ProductReviewStatus.PENDING
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.A02
            com.instagram.api.schemas.ProductReviewStatus r0 = r0.BoK()
            if (r1 != r0) goto L_0x023a
        L_0x0250:
            X.3QO r1 = r9.A0C
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x0342
            boolean r0 = r9.A0j
            if (r0 != 0) goto L_0x0342
            goto L_0x01ed
        L_0x025b:
            if (r9 == 0) goto L_0x0273
            java.lang.String r1 = r9.A0J
        L_0x025f:
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0275
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0275
            goto L_0x0342
        L_0x0273:
            r1 = 0
            goto L_0x025f
        L_0x0275:
            boolean r0 = X.C61825KNo.A00(r2, r9)
            goto L_0x0329
        L_0x027b:
            r0 = 36324475452534894(0x810ceb0000306e, double:3.035082770880959E-306)
            goto L_0x0292
        L_0x0281:
            r0 = 36318230570342412(0x81073d0004180c, double:3.031133482236311E-306)
            goto L_0x0292
        L_0x0287:
            r0 = 36310675722666222(0x81005e000100ee, double:3.0263557661449586E-306)
            goto L_0x0292
        L_0x028d:
            r0 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
        L_0x0292:
            boolean r0 = X.182.A06(r3, r2, r0)
            goto L_0x0329
        L_0x0298:
            boolean r0 = X.AnonymousClass2o2.A00(r2)
            if (r0 == 0) goto L_0x0342
            boolean r0 = X.AnonymousClass2o2.A04(r2)
            goto L_0x02d8
        L_0x02a3:
            if (r9 == 0) goto L_0x0342
            X.1iA r4 = r9.A0D
            X.Jv3 r0 = r9.A0B
            if (r0 == 0) goto L_0x02af
            java.util.ArrayList r3 = r0.A01
            if (r3 != 0) goto L_0x02b3
        L_0x02af:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
        L_0x02b3:
            X.82q r1 = r5.A01
            java.lang.String r0 = "FeedRowEligibilityUseCase"
            boolean r0 = X.LRu.A01(r2, r1, r4, r0, r3)
            goto L_0x0329
        L_0x02bc:
            X.82q r0 = r5.A01
            boolean r0 = r0.COf()
            if (r0 == 0) goto L_0x0342
            boolean r0 = X.C56645I6a.A01(r2)
            goto L_0x0329
        L_0x02c9:
            com.instagram.user.model.User r0 = X.DbT.A0j(r2)
            boolean r0 = r0.A1M()
            goto L_0x0329
        L_0x02d2:
            if (r9 == 0) goto L_0x0342
            boolean r0 = X.C64187LSu.A05(r9)
        L_0x02d8:
            if (r0 != 0) goto L_0x0342
            goto L_0x036e
        L_0x02dc:
            boolean r0 = X.AnonymousClass430.A00(r2)
            goto L_0x0329
        L_0x02e1:
            X.6q4 r0 = X.C319116q4.A00
            boolean r0 = r0.A09(r2)
            goto L_0x0329
        L_0x02e8:
            boolean r0 = X.JU9.A01(r2)
            if (r0 != 0) goto L_0x036e
            boolean r0 = X.AnonymousClass2o2.A04(r2)
            if (r0 == 0) goto L_0x0342
            if (r4 != 0) goto L_0x0342
            boolean r0 = X.AnonymousClass2o2.A00(r2)
            goto L_0x0329
        L_0x02fb:
            boolean r0 = X.C46508DgB.A00(r2)
            if (r0 == 0) goto L_0x036e
            X.7wr r0 = X.C347457wq.A00(r2)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0342
            r0 = 36324101790445348(0x810c9400012f24, double:3.0348464654709134E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            goto L_0x0329
        L_0x0315:
            boolean r0 = X.1CI.A00(r2)
            goto L_0x0329
        L_0x031a:
            boolean r0 = X.JTR.A1Z(r2)
            if (r0 == 0) goto L_0x0342
            r0 = 36317358691783755(0x8106720001144b, double:3.030582102725043E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
        L_0x0329:
            if (r0 == 0) goto L_0x0342
            goto L_0x036e
        L_0x032c:
            if (r9 == 0) goto L_0x0344
            java.lang.String r1 = r9.A0J
        L_0x0330:
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x036e
            java.lang.Boolean r0 = X.AnonymousClass9HN.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x036e
        L_0x0342:
            r5 = 0
            return r5
        L_0x0344:
            r1 = 0
            goto L_0x0330
        L_0x0346:
            com.instagram.user.model.User r2 = X.DbT.A0j(r3)
            boolean r0 = X.2R8.A06(r2)
            if (r0 == 0) goto L_0x036f
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGUserThirdPartyDownloads r1 = r0.C5y()
            com.instagram.api.schemas.IGUserThirdPartyDownloads r0 = com.instagram.api.schemas.IGUserThirdPartyDownloads.A05
            if (r1 == r0) goto L_0x0364
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGUserThirdPartyDownloads r1 = r0.C5y()
            com.instagram.api.schemas.IGUserThirdPartyDownloads r0 = com.instagram.api.schemas.IGUserThirdPartyDownloads.A04
            if (r1 != r0) goto L_0x036f
        L_0x0364:
            java.lang.Boolean r0 = X.C63501KyC.A00(r3)
            boolean r0 = r0.booleanValue()
        L_0x036c:
            if (r0 == 0) goto L_0x036f
        L_0x036e:
            r5 = 1
        L_0x036f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT6.A08(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType, X.JwD, java.lang.Integer):boolean");
    }

    public LT6(UserSession userSession, C62462KgC kgC) {
        this.A00 = userSession;
        this.A01 = kgC;
    }

    public static void A05(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C61834KNy(Integer.valueOf(i)));
    }
}
