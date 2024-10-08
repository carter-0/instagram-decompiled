package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7aL  reason: invalid class name and case insensitive filesystem */
public final class C333907aL implements 0lm {
    public final C333917aM A00;
    public final 1ua A01;
    public final C262224Cq A02;
    public final Context A03;
    public final UserSession A04;
    public final C262224Cq A05;

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r6.A0L().size() != r5.size()) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass3Q2 A00(X.C53382GnE r16, X.C381519bt r17, X.AnonymousClass0iw r18, java.lang.Integer r19, long r20, boolean r22) {
        /*
            r15 = this;
            X.7aM r3 = r15.A00
            X.3Q2 r6 = r3.A00
            r14 = r6
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r7 = 1
            r2 = 3
            r9 = r19
            r10 = r17
            if (r9 != r0) goto L_0x0043
            if (r22 == 0) goto L_0x0043
            java.util.List r5 = r10.A05
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0043
            if (r6 == 0) goto L_0x0043
            int r0 = r5.size()
            if (r0 != r7) goto L_0x002e
            X.00k.A0I(r5)
            java.lang.String r1 = "isVideo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            boolean r0 = r6.A0u()
            if (r0 == 0) goto L_0x0043
            java.util.List r0 = r6.A0L()
            int r1 = r0.size()
            int r0 = r5.size()
            r8 = 1
            if (r1 == r0) goto L_0x00a8
        L_0x0043:
            r8 = 0
            java.util.List r5 = r10.A05
            int r0 = r5.size()
            if (r0 != r7) goto L_0x0057
            X.00k.A0I(r5)
            java.lang.String r1 = "isVideo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            int r1 = r5.size()
            java.lang.String r0 = java.lang.String.valueOf(r20)
            X.3Q2 r6 = new X.3Q2
            if (r1 <= r7) goto L_0x0092
            r6.<init>(r0)
            X.1iA r0 = X.1iA.A09
            r6.A0V(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r6.A0e(r0)
            int r0 = r5.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008e
            r1.next()
            java.lang.String r1 = "isVideo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x008e:
            r6.A0k(r4)
            goto L_0x009f
        L_0x0092:
            r6.<init>(r0)
            X.1iA r0 = X.1iA.A0X
            r6.A0V(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r6.A0e(r0)
        L_0x009f:
            java.lang.String r0 = X.AnonymousClass6SR.A02()
            X.0qQ.A0B(r0, r8)
            r6.A3x = r0
        L_0x00a8:
            java.lang.String r0 = r10.A02
            r6.A2Z = r0
            java.util.List r0 = r10.A04
            r6.A4U = r0
            r12 = 0
            r6.A3W = r12
            r6.A0u = r12
            r4 = 0
            r6.A5i = r4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r10.A00
            r6.A0w = r0
            r6.A0z = r12
            r6.A0W(r12)
            r6.A2T = r12
            com.instagram.common.session.UserSession r13 = r15.A04
            X.0Tu r11 = X.0Tu.A05
            r0 = 36323182667443173(0x810bbe00012be5, double:3.034265208383327E-306)
            boolean r0 = X.182.A06(r11, r13, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A1r = r0
            r6.A2l = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r16
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "p92_24h_posts"
            r1.add(r0)
        L_0x00e8:
            r6.A4B = r1
            java.util.List r0 = r10.A03
            X.0qQ.A0B(r0, r4)
            r6.A4A = r0
            java.lang.String r0 = r10.A01
            if (r0 != 0) goto L_0x00f6
            r0 = 0
        L_0x00f6:
            r6.A37 = r0
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0103
            X.00k.A0I(r5)
        L_0x0103:
            int r1 = r9.intValue()
            if (r1 == r2) goto L_0x0149
            r0 = 2
            if (r1 == r0) goto L_0x0116
            if (r1 == r4) goto L_0x0184
            if (r1 == r7) goto L_0x0184
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0116:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0184
            r0 = r18
            r3.A00(r0)
            boolean r0 = r6.A0u()
            if (r0 == 0) goto L_0x0177
            java.util.List r0 = r6.A0L()
            java.util.Iterator r9 = r0.iterator()
        L_0x0131:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r2 = r9.next()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            r2.A5g = r7
            X.1ua r1 = r3.A02
            boolean r0 = r2.A12()
            r1.A0I(r2, r0, r7)
            goto L_0x0131
        L_0x0149:
            boolean r0 = r6.A0u()
            if (r0 == 0) goto L_0x016d
            java.util.List r0 = r6.A0L()
            java.util.Iterator r3 = r0.iterator()
        L_0x0157:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r2 = r3.next()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            X.1ua r1 = r15.A01
            boolean r0 = r2.A12()
            r1.A0I(r2, r0, r7)
            goto L_0x0157
        L_0x016d:
            X.1ua r1 = r15.A01
            boolean r0 = r6.A12()
            r1.A0I(r6, r0, r7)
            goto L_0x0184
        L_0x0177:
            r6.A5g = r7
            X.1ua r1 = r3.A02
            boolean r0 = r6.A12()
            r1.A0I(r6, r0, r7)
        L_0x0182:
            r3.A00 = r6
        L_0x0184:
            if (r14 == 0) goto L_0x01b1
            if (r8 == 0) goto L_0x01b1
            int r0 = r5.size()
            if (r0 != r7) goto L_0x0199
            X.00k.A0I(r5)
            java.lang.String r1 = "getAltText"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0199:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x01b1
            r5.get(r4)
            java.util.List r0 = r14.A0L()
            r0.get(r4)
            java.lang.String r1 = "getAltText"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333907aL.A00(X.GnE, X.9bt, X.0iw, java.lang.Integer, long, boolean):X.3Q2");
    }

    public static final AnonymousClass3Q2 A01(C53382GnE gnE, C333907aL r23, AnonymousClass0iw r24, Integer num, String str, String str2, String str3, List list, boolean z) {
        long nanoTime;
        List list2;
        String str4;
        String str5;
        String str6;
        String str7;
        C333907aL r11 = r23;
        AnonymousClass3Q2 r3 = r11.A00.A01;
        if (r3 == null || (str7 = r3.A35) == null) {
            nanoTime = System.nanoTime();
        } else {
            nanoTime = Long.parseLong(str7);
        }
        if (r3 == null) {
            r3 = new AnonymousClass3Q2(String.valueOf(nanoTime));
            r3.A0V(1iA.A0R);
        }
        Integer num2 = AnonymousClass05K.A0C;
        C53382GnE gnE2 = gnE;
        AnonymousClass0iw r14 = r24;
        Integer num3 = num;
        List list3 = list;
        if (num3 == num2) {
            List singletonList = Collections.singletonList(r11.A00(gnE2, (C381519bt) 00k.A0I(list3), r14, num3, nanoTime + 1, true));
            0qQ.A07(singletonList);
            list2 = singletonList;
        } else {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list3, 10));
            int i = 0;
            for (Object next : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C381519bt r6 = (C381519bt) next;
                long j = nanoTime + 1 + ((long) (i * 100));
                boolean z2 = false;
                if (i == 0) {
                    z2 = true;
                }
                arrayList.add(r11.A00(gnE2, r6, r14, num3, j, z2));
                i = i2;
            }
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        while (true) {
            str4 = str;
            str5 = str3;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3Q2 r5 = (AnonymousClass3Q2) it.next();
            r5.A3Q = r3.A35;
            r11.A02(gnE2, r5);
            for (AnonymousClass3Q2 r1 : r5.A0L()) {
                r1.A3Q = r3.A35;
            }
            r5.A3X = str4;
            r5.A13.A03 = str5;
            r5.A2R = str2;
            1Xj A022 = 1E7.A00(r11.A04).A02(str4);
            if (A022 != null) {
                str6 = A022.A0C.getLoggingInfoToken();
            } else {
                str6 = null;
            }
            r5.A3i = str6;
            r5.A5y = z;
        }
        r3.A3X = str4;
        String A023 = AnonymousClass6SR.A02();
        0qQ.A0B(A023, 0);
        r3.A3x = A023;
        r3.A4m = list2;
        r11.A02(gnE2, r3);
        r3.A0e(ShareType.FOLLOWERS_SHARE);
        r3.A13.A03 = str5;
        boolean z3 = false;
        if (num3 == num2) {
            z3 = true;
        }
        r3.A5g = z3;
        return r3;
    }

    private final void A02(C53382GnE gnE, AnonymousClass3Q2 r6) {
        Integer num;
        r6.A0J = ((C54653HMk) gnE.A02).A00;
        if (gnE.A01 == AnonymousClass05K.A01) {
            r6.A0U(AnonymousClass3QO.REPLY_CONTROL);
        }
        r6.A5c = gnE.A06;
        if (gnE.A05) {
            num = Integer.valueOf((int) 182.A01(0Tu.A05, this.A04, 36610125137516521L));
        } else {
            num = null;
        }
        r6.A27 = num;
        r6.A1s = Boolean.valueOf(gnE.A04);
        r6.A2S = gnE.A03;
    }

    public C333907aL(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
        AnonymousClass12T r4 = AnonymousClass12T.A00;
        this.A05 = 19E.A02(r4.CO6(319, 3).A00(1));
        this.A02 = 19E.A02(r4.CO6(319, 3));
        1ud r1 = 1ua.A0G;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        1ua A012 = r1.A01(applicationContext, userSession);
        this.A01 = A012;
        0qQ.A0B(A012, 1);
        this.A00 = (C333917aM) userSession.A01(C333917aM.class, new MMP(A012, 45));
    }
}
