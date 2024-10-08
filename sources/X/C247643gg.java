package X;

import com.instagram.api.schemas.AdMetadataType;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.3gg  reason: invalid class name and case insensitive filesystem */
public final class C247643gg {
    public static final C247643gg A00 = new Object();

    public static final User A00(UserSession userSession, 1Xj r6) {
        0qQ.A0B(userSession, 1);
        User A2A = r6.A2A(userSession);
        User A29 = r6.A29();
        String str = null;
        IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r6);
        if (A002 != null) {
            str = A002.BEr();
        }
        if (A29 == null || !00p.A0j(str, A29.getId(), false)) {
            return A2A;
        }
        return A29;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r3.length() <= 13) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r7, com.instagram.common.session.UserSession r8, X.1Xj r9, boolean r10) {
        /*
            r6 = 1
            r5 = 2
            X.0qQ.A0B(r9, r5)
            com.instagram.user.model.User r0 = A00(r8, r9)
            r4 = 0
            if (r0 == 0) goto L_0x003c
            java.lang.String r3 = r0.getUsername()
            if (r10 == 0) goto L_0x001b
            int r1 = r3.length()
            r0 = 13
            r2 = 1
            if (r1 > r0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r9.A1H()
            if (r0 == 0) goto L_0x004f
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
        L_0x0026:
            int r1 = X.AnonymousClass3ZO.A00(r0)
            if (r1 != r6) goto L_0x003d
            r1 = 2131957219(0x7f1315e3, float:1.9551016E38)
            if (r2 == 0) goto L_0x0034
            r1 = 2131957220(0x7f1315e4, float:1.9551018E38)
        L_0x0034:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r4 = r7.getString(r1, r0)
        L_0x003c:
            return r4
        L_0x003d:
            if (r1 != r5) goto L_0x0048
            r1 = 2131957222(0x7f1315e6, float:1.9551022E38)
            if (r2 == 0) goto L_0x0034
            r1 = 2131957223(0x7f1315e7, float:1.9551024E38)
            goto L_0x0034
        L_0x0048:
            r0 = 3
            if (r1 != r0) goto L_0x003c
            r1 = 2131957217(0x7f1315e1, float:1.9551012E38)
            goto L_0x0034
        L_0x004f:
            r0 = r4
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247643gg.A01(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.common.session.UserSession r1, X.1Xj r2) {
        /*
            r0 = 1
            X.0qQ.A0B(r1, r0)
            if (r2 == 0) goto L_0x0019
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r1, r2)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.BEr()
            if (r0 == 0) goto L_0x0019
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247643gg.A05(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A07(UserSession userSession, 1Xj r6) {
        C247643gg r1 = A00;
        if (!r1.A04(userSession, r6) || !r1.A03(userSession, r6) || ((int) 182.A01(0Tu.A05, userSession, 36605645486560538L)) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, 1Xj r6) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A002;
        IGCTMessagingAdsInfoDictIntf A003 = C231122qu.A00(userSession, r6);
        if (A003 != null) {
            onFeedMessagesIntf = A003.BTY();
        } else {
            onFeedMessagesIntf = null;
        }
        if (AnonymousClass3ZO.A00(onFeedMessagesIntf) != 2 || r6.A5n() || (A002 = C231122qu.A00(userSession, r6)) == null || A002.BqY() == null || ((int) 182.A01(0Tu.A05, userSession, 36605645486626075L)) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A0B(UserSession userSession, 1Xj r10) {
        SocialProofInfo BxZ;
        Integer BX2;
        IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r10);
        if (A002 == null || (BxZ = A002.BxZ()) == null || (BX2 = BxZ.BX2()) == null) {
            return false;
        }
        int intValue = BX2.intValue();
        if (r10.A5n() || r10.A5e() || AnonymousClass3ZO.A00(A002.BTY()) != 3 || !r10.CcK()) {
            return false;
        }
        0Tu r7 = 0Tu.A05;
        long A01 = 182.A01(r7, userSession, 36605645486757149L);
        long A012 = 182.A01(r7, userSession, 36605645486822686L);
        long j = (long) intValue;
        if (j < A01 || j > A012 || ((int) 182.A01(r7, userSession, 36605645486691612L)) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(1Xj r3) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A1H;
        if (r3 == null || (A1H = r3.A1H()) == null) {
            onFeedMessagesIntf = null;
        } else {
            onFeedMessagesIntf = A1H.BTY();
        }
        int A002 = AnonymousClass3ZO.A00(onFeedMessagesIntf);
        if (Integer.valueOf(A002) == null || 1 != A002) {
            return false;
        }
        return true;
    }

    public static final String A02(1Xj r4) {
        Object obj;
        AdMetadataType adMetadataType;
        0sn AZ9 = r4.A0C.AZ9();
        if (AZ9 == null) {
            AZ9 = 0sn.A00;
        }
        boolean z = false;
        if (AZ9.isEmpty()) {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator it = AZ9.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C250103ku r0 = (C250103ku) obj;
            if (r0 != null) {
                adMetadataType = r0.CAK();
            } else {
                adMetadataType = null;
            }
            if (adMetadataType == AdMetadataType.DESTINATION_NAME) {
                break;
            }
        }
        C250103ku r2 = (C250103ku) obj;
        if (r2 != null) {
            return r2.getValue();
        }
        return null;
    }

    public static final boolean A08(UserSession userSession, 1Xj r4) {
        C247643gg r1 = A00;
        if (!r1.A04(userSession, r4) || !r1.A03(userSession, r4) || ((int) 182.A01(0Tu.A05, userSession, 36605645486560538L)) != 2) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession, 1Xj r4) {
        C247643gg r1 = A00;
        if (!r1.A04(userSession, r4) || !r1.A03(userSession, r4) || ((int) 182.A01(0Tu.A05, userSession, 36605645486560538L)) != 3) {
            return false;
        }
        return true;
    }

    private final boolean A03(UserSession userSession, 1Xj r5) {
        if (!r5.A5n()) {
            IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r5);
            String str = null;
            if (A002 != null) {
                OnFeedMessagesIntf BTY = A002.BTY();
                if (BTY != null) {
                    str = BTY.BCi();
                }
                String BqY = A002.BqY();
                if (str == null || BqY == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A04(UserSession userSession, 1Xj r5) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r5);
        if (A002 != null) {
            onFeedMessagesIntf = A002.BTY();
        } else {
            onFeedMessagesIntf = null;
        }
        int A003 = AnonymousClass3ZO.A00(onFeedMessagesIntf);
        if (A003 == 1 || A003 == 3) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, 1Xj r4) {
        if (!A05(userSession, r4) || ((int) 182.A01(0Tu.A05, userSession, 36604361291469867L)) == 0) {
            return false;
        }
        return true;
    }
}
