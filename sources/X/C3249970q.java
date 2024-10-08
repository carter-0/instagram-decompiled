package X;

import android.content.Context;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.70q  reason: invalid class name and case insensitive filesystem */
public final class C3249970q {
    public static final C3249970q A00 = new Object();

    public static final List A00(Context context, AiStudioProfileBannerModel aiStudioProfileBannerModel, C3248770e r6) {
        List<AiStudioProfileBannerPersonaModel> list = aiStudioProfileBannerModel.A00;
        if (list.isEmpty()) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AiStudioProfileBannerPersonaModel r1 : list) {
            arrayList.add(new AnonymousClass73Q(context, r1, r6));
        }
        return arrayList;
    }

    public static final boolean A02(UserSession userSession, User user) {
        boolean z;
        Boolean CXZ;
        Boolean CSC = user.A03.CSC();
        if (CSC != null) {
            z = CSC.booleanValue();
        } else {
            z = false;
        }
        if (!z || (CXZ = user.A03.CXZ()) == null || !CXZ.booleanValue() || user.A04() <= 0) {
            return false;
        }
        if ((!0qQ.A0K(userSession.A06, AnonymousClass3ZA.A00(user)) || !182.A06(0Tu.A05, userSession, 36322821891828187L)) && !182.A06(0Tu.A05, userSession, 36322821891762650L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean B0z;
        C3250070r.A00();
        if (!182.A06(0Tu.A05, userSession, 36324750330638679L) || (B0z = user.A03.B0z()) == null || !B0z.booleanValue() || A03(userSession, user)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, User user) {
        C3250070r.A00();
        if (!182.A06(0Tu.A05, userSession, 36324750330442068L) || user.A03.Bvu() == null) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, User user) {
        if (!user.A1i() || !C319886rO.A05(userSession) || user.A03.C5J() == null || !182.A06(0Tu.A05, userSession, 36327795463633617L)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v117, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r8v16, types: [X.LvQ] */
    /* JADX WARNING: type inference failed for: r24v4, types: [X.JVV] */
    /* JADX WARNING: type inference failed for: r24v5, types: [X.LvQ] */
    /* JADX WARNING: type inference failed for: r24v6, types: [X.JVV] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0327, code lost:
        r1.remove(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x052e A[LOOP:16: B:226:0x0528->B:228:0x052e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05cc A[LOOP:18: B:253:0x05c6->B:255:0x05cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0632 A[LOOP:20: B:268:0x062c->B:270:0x0632, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A05(android.content.Context r35, com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r36, X.AnonymousClass0iw r37, com.instagram.common.session.UserSession r38, X.C3248770e r39, com.instagram.user.model.User r40, boolean r41) {
        /*
            r34 = this;
            r7 = 1
            r2 = r38
            X.0qQ.A0B(r2, r7)
            r1 = r40
            X.4Cl r0 = r1.A03
            java.util.List r22 = r0.AZn()
            r6 = r35
            r23 = r36
            r26 = r37
            r3 = r39
            java.util.ArrayList r0 = new java.util.ArrayList
            if (r22 == 0) goto L_0x0442
            r0.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r4 = A03(r2, r1)
            if (r4 == 0) goto L_0x00f3
            X.4Cl r4 = r1.A03
            X.5uE r4 = r4.Bvu()
            if (r4 == 0) goto L_0x006c
            X.73T r5 = new X.73T
            r5.<init>(r4, r3)
            r4 = r21
            r4.add(r5)
        L_0x006c:
            boolean r4 = A04(r2, r1)
            if (r4 == 0) goto L_0x009a
            boolean r33 = X.2R8.A04(r2, r1)
            X.4Cl r4 = r1.A03
            java.lang.String r32 = r4.C5J()
            if (r32 == 0) goto L_0x043a
            java.lang.Integer r4 = r1.A04
            if (r4 != 0) goto L_0x0088
            X.4Cl r4 = r1.A03
            java.lang.Integer r4 = r4.C5X()
        L_0x0088:
            X.FgT r5 = new X.FgT
            r27 = r5
            r28 = r6
            r29 = r2
            r30 = r3
            r31 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r7.add(r5)
        L_0x009a:
            boolean r4 = A02(r2, r1)
            if (r4 == 0) goto L_0x00a8
            X.FgU r4 = new X.FgU
            r4.<init>(r6, r2, r3, r1)
            r10.add(r4)
        L_0x00a8:
            X.4Cl r4 = r1.A03
            X.3Sk r4 = r4.BcS()
            if (r4 == 0) goto L_0x0105
            java.util.List r4 = r4.BcT()
            if (r4 == 0) goto L_0x0105
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0105
            X.4Cl r4 = r1.A03
            X.3Sk r4 = r4.BcS()
            if (r4 == 0) goto L_0x0105
            java.util.List r4 = r4.BcT()
            if (r4 == 0) goto L_0x0105
            java.util.Iterator r15 = r4.iterator()
        L_0x00ce:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x0105
            java.lang.Object r4 = r15.next()
            X.47o r4 = (X.C2609247o) r4
            X.DcG r5 = new X.DcG
            r27 = r5
            r28 = r6
            r29 = r4
            r30 = r26
            r31 = r2
            r32 = r3
            r33 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r4 = r20
            r4.add(r5)
            goto L_0x00ce
        L_0x00f3:
            if (r41 != 0) goto L_0x006c
            boolean r4 = A01(r2, r1)
            if (r4 == 0) goto L_0x006c
            X.FgS r4 = new X.FgS
            r4.<init>(r6, r3)
            r0.add(r4)
            goto L_0x006c
        L_0x0105:
            X.4Cl r4 = r1.A03
            X.3qe r4 = r4.AYk()
            if (r4 == 0) goto L_0x015c
            java.util.List r4 = r4.B8h()
            if (r4 == 0) goto L_0x015c
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.util.Iterator r16 = r4.iterator()
        L_0x011c:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x0137
            java.lang.Object r5 = r16.next()
            r4 = r5
            X.DUz r4 = (X.C46322DUz) r4
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r15 = r4.B8g()
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r4 = com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus.SHOWN
            if (r15 != r4) goto L_0x011c
            r4 = r17
            r4.add(r5)
            goto L_0x011c
        L_0x0137:
            java.util.Iterator r15 = r17.iterator()
        L_0x013b:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x015c
            java.lang.Object r5 = r15.next()
            X.DUz r5 = (X.C46322DUz) r5
            X.DHU r4 = new X.DHU
            r27 = r4
            r28 = r6
            r29 = r5
            r30 = r2
            r31 = r3
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32)
            r14.add(r4)
            goto L_0x013b
        L_0x015c:
            r5 = 29
            X.9LD r4 = new X.9LD
            r4.<init>(r2, r5)
            X.0eM r18 = X.AnonymousClass1YB.A00(r4)
            X.4Cl r4 = r1.A03
            java.util.List r4 = r4.CC1()
            if (r4 != 0) goto L_0x0171
            X.0sn r4 = X.0sn.A00
        L_0x0171:
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.util.Iterator r16 = r4.iterator()
        L_0x017a:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x01a6
            java.lang.Object r5 = r16.next()
            r4 = r5
            com.instagram.user.model.UpcomingEvent r4 = (com.instagram.user.model.UpcomingEvent) r4
            r15 = r4
            r4 = 0
            X.0qQ.A0B(r15, r4)
            boolean r4 = X.C18810W3l.A0B(r15)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x01a0
            java.lang.Object r4 = r18.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x017a
        L_0x01a0:
            r4 = r17
            r4.add(r5)
            goto L_0x017a
        L_0x01a6:
            java.util.Iterator r15 = r17.iterator()
        L_0x01aa:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x01cb
            java.lang.Object r5 = r15.next()
            com.instagram.user.model.UpcomingEvent r5 = (com.instagram.user.model.UpcomingEvent) r5
            X.WZS r4 = new X.WZS
            r27 = r4
            r28 = r6
            r29 = r2
            r30 = r3
            r31 = r5
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32)
            r13.add(r4)
            goto L_0x01aa
        L_0x01cb:
            X.DU0 r31 = r1.A0F()
            if (r31 == 0) goto L_0x01e5
            X.FgV r5 = new X.FgV
            r27 = r5
            r28 = r6
            r29 = r2
            r30 = r3
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32)
            r4 = r19
            r4.add(r5)
        L_0x01e5:
            boolean r4 = r1.A1U()
            if (r4 == 0) goto L_0x0225
            X.0Tu r17 = X.0Tu.A05
            r15 = 36317212663681896(0x810650000d1368, double:3.0304897539654195E-306)
            r4 = r15
            r15 = r17
            boolean r4 = X.182.A06(r15, r2, r4)
            if (r4 != 0) goto L_0x0225
            boolean r4 = X.AnonymousClass30D.A0A(r2)
            if (r4 != 0) goto L_0x0207
            boolean r4 = X.AnonymousClass30D.A0H(r2, r1)
            if (r4 == 0) goto L_0x0225
        L_0x0207:
            X.JVM r28 = r3.BUt()
            X.2xy r29 = r3.BUx()
            if (r28 == 0) goto L_0x0225
            if (r29 == 0) goto L_0x0429
            X.JVV r4 = new X.JVV
            r24 = r4
            r25 = r6
            r27 = r2
            r30 = r3
            r31 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x0222:
            r12.add(r4)
        L_0x0225:
            boolean r4 = X.C3250170s.A02(r2, r1)
            if (r4 == 0) goto L_0x0249
            X.4Cl r4 = r1.A03
            X.3rB r4 = r4.BMx()
            if (r4 == 0) goto L_0x0425
            X.4EU r26 = r4.BMz()
        L_0x0237:
            X.73R r4 = new X.73R
            r24 = r4
            r25 = r6
            r27 = r2
            r28 = r3
            r29 = r1
            r24.<init>(r25, r26, r27, r28, r29)
            r9.add(r4)
        L_0x0249:
            boolean r2 = X.C3250170s.A01(r2, r1)
            if (r2 == 0) goto L_0x0263
            X.4Cl r2 = r1.A03
            X.3rB r2 = r2.BMx()
            if (r2 == 0) goto L_0x0422
            X.5Bm r4 = r2.BMy()
        L_0x025b:
            X.73S r2 = new X.73S
            r2.<init>(r6, r4, r3, r1)
            r8.add(r2)
        L_0x0263:
            if (r36 == 0) goto L_0x026e
            r1 = r23
            java.util.List r1 = A00(r6, r1, r3)
            r11.addAll(r1)
        L_0x026e:
            java.util.Iterator r6 = r22.iterator()
        L_0x0272:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x06f6
            java.lang.Object r4 = r6.next()
            X.DSn r4 = (X.C46258DSn) r4
            com.instagram.api.schemas.ProfileBannerType r1 = r4.AfI()
            int r1 = r1.ordinal()
            switch(r1) {
                case 2: goto L_0x03d0;
                case 3: goto L_0x02da;
                case 4: goto L_0x03a7;
                case 5: goto L_0x037e;
                case 6: goto L_0x02b2;
                case 7: goto L_0x0289;
                case 8: goto L_0x032c;
                case 9: goto L_0x0355;
                case 10: goto L_0x0301;
                case 11: goto L_0x03f9;
                case 12: goto L_0x028a;
                default: goto L_0x0289;
            }
        L_0x0289:
            goto L_0x0272
        L_0x028a:
            java.util.Iterator r5 = r13.iterator()
        L_0x028e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x028e
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r13.remove(r3)
            goto L_0x0272
        L_0x02b2:
            java.util.Iterator r5 = r14.iterator()
        L_0x02b6:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x02b6
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r14.remove(r3)
            goto L_0x0272
        L_0x02da:
            java.util.Iterator r5 = r20.iterator()
        L_0x02de:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x02de
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r1 = r20
            goto L_0x0327
        L_0x0301:
            java.util.Iterator r5 = r21.iterator()
        L_0x0305:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0305
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r1 = r21
        L_0x0327:
            r1.remove(r3)
            goto L_0x0272
        L_0x032c:
            java.util.Iterator r5 = r12.iterator()
        L_0x0330:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0330
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r12.remove(r3)
            goto L_0x0272
        L_0x0355:
            java.util.Iterator r5 = r10.iterator()
        L_0x0359:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0359
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r10.remove(r3)
            goto L_0x0272
        L_0x037e:
            java.util.Iterator r5 = r9.iterator()
        L_0x0382:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0382
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r9.remove(r3)
            goto L_0x0272
        L_0x03a7:
            java.util.Iterator r5 = r8.iterator()
        L_0x03ab:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x03ab
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r8.remove(r3)
            goto L_0x0272
        L_0x03d0:
            java.util.Iterator r5 = r11.iterator()
        L_0x03d4:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x03d4
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r11.remove(r3)
            goto L_0x0272
        L_0x03f9:
            java.util.Iterator r5 = r7.iterator()
        L_0x03fd:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.73N r1 = (X.AnonymousClass73N) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r4.AfC()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x03fd
            if (r3 == 0) goto L_0x0272
            r0.add(r3)
            r7.remove(r3)
            goto L_0x0272
        L_0x0422:
            r4 = 0
            goto L_0x025b
        L_0x0425:
            r26 = 0
            goto L_0x0237
        L_0x0429:
            X.LvQ r4 = new X.LvQ
            r24 = r4
            r25 = r6
            r27 = r2
            r29 = r3
            r30 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)
            goto L_0x0222
        L_0x043a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0442:
            r0.<init>()
            boolean r4 = A03(r2, r1)
            if (r4 == 0) goto L_0x0573
            X.C3250070r.A00()
            X.0Tu r8 = X.0Tu.A05
            r4 = 2342167759544201557(0x20810d2b00013155, double:4.069613757548602E-152)
            boolean r4 = X.182.A06(r8, r2, r4)
            if (r4 == 0) goto L_0x0573
            X.4Cl r4 = r1.A03
            X.5uE r5 = r4.Bvu()
            if (r5 == 0) goto L_0x046b
            X.73T r4 = new X.73T
            r4.<init>(r5, r3)
        L_0x0468:
            r0.add(r4)
        L_0x046b:
            boolean r4 = A04(r2, r1)
            if (r4 == 0) goto L_0x0494
            boolean r14 = X.2R8.A04(r2, r1)
            X.4Cl r4 = r1.A03
            java.lang.String r13 = r4.C5J()
            if (r13 == 0) goto L_0x071e
            java.lang.Integer r5 = r1.A04
            if (r5 != 0) goto L_0x0487
            X.4Cl r4 = r1.A03
            java.lang.Integer r5 = r4.C5X()
        L_0x0487:
            X.FgT r4 = new X.FgT
            r8 = r4
            r9 = r6
            r10 = r2
            r11 = r3
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.add(r4)
        L_0x0494:
            boolean r4 = r1.A1U()
            if (r4 == 0) goto L_0x04d1
            X.0Tu r8 = X.0Tu.A05
            r4 = 36317212663681896(0x810650000d1368, double:3.0304897539654195E-306)
            boolean r4 = X.182.A06(r8, r2, r4)
            if (r4 != 0) goto L_0x04d1
            boolean r4 = X.AnonymousClass30D.A0A(r2)
            if (r4 != 0) goto L_0x04b3
            boolean r4 = X.AnonymousClass30D.A0H(r2, r1)
            if (r4 == 0) goto L_0x04d1
        L_0x04b3:
            X.JVM r28 = r3.BUt()
            X.2xy r29 = r3.BUx()
            if (r28 == 0) goto L_0x04d1
            if (r29 == 0) goto L_0x0563
            X.JVV r4 = new X.JVV
            r24 = r4
            r25 = r6
            r27 = r2
            r30 = r3
            r31 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x04ce:
            r0.add(r4)
        L_0x04d1:
            if (r36 == 0) goto L_0x04dc
            r4 = r23
            java.util.List r4 = A00(r6, r4, r3)
            r0.addAll(r4)
        L_0x04dc:
            boolean r4 = A03(r2, r1)
            if (r4 == 0) goto L_0x0545
            X.C3250070r.A00()
            X.0Tu r8 = X.0Tu.A05
            r4 = 2342167759544201557(0x20810d2b00013155, double:4.069613757548602E-152)
            boolean r4 = X.182.A06(r8, r2, r4)
            if (r4 != 0) goto L_0x0545
            X.4Cl r4 = r1.A03
            X.5uE r5 = r4.Bvu()
            if (r5 == 0) goto L_0x0502
            X.73T r4 = new X.73T
            r4.<init>(r5, r3)
        L_0x04ff:
            r0.add(r4)
        L_0x0502:
            X.4Cl r4 = r1.A03
            X.3Sk r4 = r4.BcS()
            if (r4 == 0) goto L_0x0592
            java.util.List r4 = r4.BcT()
            if (r4 == 0) goto L_0x0592
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0592
            X.4Cl r4 = r1.A03
            X.3Sk r4 = r4.BcS()
            if (r4 == 0) goto L_0x0592
            java.util.List r4 = r4.BcT()
            if (r4 == 0) goto L_0x0592
            java.util.Iterator r8 = r4.iterator()
        L_0x0528:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0592
            java.lang.Object r5 = r8.next()
            X.47o r5 = (X.C2609247o) r5
            X.DcG r4 = new X.DcG
            r9 = r4
            r10 = r6
            r11 = r5
            r12 = r26
            r13 = r2
            r14 = r3
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.add(r4)
            goto L_0x0528
        L_0x0545:
            if (r41 != 0) goto L_0x0502
            boolean r4 = A01(r2, r1)
            if (r4 == 0) goto L_0x0502
            X.C3250070r.A00()
            X.0Tu r8 = X.0Tu.A05
            r4 = 36324750330769753(0x810d2b00053159, double:3.0352566049835294E-306)
            boolean r4 = X.182.A06(r8, r2, r4)
            if (r4 != 0) goto L_0x0502
            X.FgS r4 = new X.FgS
            r4.<init>(r6, r3)
            goto L_0x04ff
        L_0x0563:
            X.LvQ r4 = new X.LvQ
            r8 = r4
            r9 = r6
            r10 = r26
            r11 = r2
            r12 = r28
            r13 = r3
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x04ce
        L_0x0573:
            if (r41 != 0) goto L_0x046b
            boolean r4 = A01(r2, r1)
            if (r4 == 0) goto L_0x046b
            X.C3250070r.A00()
            X.0Tu r8 = X.0Tu.A05
            r4 = 36324750330769753(0x810d2b00053159, double:3.0352566049835294E-306)
            boolean r4 = X.182.A06(r8, r2, r4)
            if (r4 == 0) goto L_0x046b
            X.FgS r4 = new X.FgS
            r4.<init>(r6, r3)
            goto L_0x0468
        L_0x0592:
            X.4Cl r4 = r1.A03
            X.3qe r4 = r4.AYk()
            if (r4 == 0) goto L_0x05e1
            java.util.List r4 = r4.B8h()
            if (r4 == 0) goto L_0x05e1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r4.iterator()
        L_0x05a9:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x05c2
            java.lang.Object r8 = r9.next()
            r4 = r8
            X.DUz r4 = (X.C46322DUz) r4
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r5 = r4.B8g()
            com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus r4 = com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus.SHOWN
            if (r5 != r4) goto L_0x05a9
            r10.add(r8)
            goto L_0x05a9
        L_0x05c2:
            java.util.Iterator r8 = r10.iterator()
        L_0x05c6:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x05e1
            java.lang.Object r5 = r8.next()
            X.DUz r5 = (X.C46322DUz) r5
            X.DHU r4 = new X.DHU
            r9 = r4
            r10 = r6
            r11 = r5
            r12 = r2
            r13 = r3
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r0.add(r4)
            goto L_0x05c6
        L_0x05e1:
            r5 = 29
            X.9LD r4 = new X.9LD
            r4.<init>(r2, r5)
            X.0eM r11 = X.AnonymousClass1YB.A00(r4)
            X.4Cl r4 = r1.A03
            java.util.List r4 = r4.CC1()
            if (r4 != 0) goto L_0x05f6
            X.0sn r4 = X.0sn.A00
        L_0x05f6:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r4.iterator()
        L_0x05ff:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0628
            java.lang.Object r8 = r9.next()
            r5 = r8
            com.instagram.user.model.UpcomingEvent r5 = (com.instagram.user.model.UpcomingEvent) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            boolean r4 = X.C18810W3l.A0B(r5)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0624
            java.lang.Object r4 = r11.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x05ff
        L_0x0624:
            r10.add(r8)
            goto L_0x05ff
        L_0x0628:
            java.util.Iterator r8 = r10.iterator()
        L_0x062c:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0647
            java.lang.Object r5 = r8.next()
            com.instagram.user.model.UpcomingEvent r5 = (com.instagram.user.model.UpcomingEvent) r5
            X.WZS r4 = new X.WZS
            r9 = r4
            r10 = r6
            r11 = r2
            r12 = r3
            r13 = r5
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r0.add(r4)
            goto L_0x062c
        L_0x0647:
            X.DU0 r12 = r1.A0F()
            if (r12 == 0) goto L_0x065a
            X.FgV r4 = new X.FgV
            r8 = r4
            r9 = r6
            r10 = r2
            r11 = r3
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r4)
        L_0x065a:
            boolean r4 = X.C3250170s.A02(r2, r1)
            r5 = 0
            if (r4 == 0) goto L_0x067a
            X.4Cl r4 = r1.A03
            X.3rB r4 = r4.BMx()
            if (r4 == 0) goto L_0x06e5
            X.4EU r10 = r4.BMz()
        L_0x066d:
            X.73R r4 = new X.73R
            r8 = r4
            r9 = r6
            r11 = r2
            r12 = r3
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r4)
        L_0x067a:
            boolean r4 = X.C3250170s.A01(r2, r1)
            if (r4 == 0) goto L_0x0694
            X.4Cl r4 = r1.A03
            X.3rB r4 = r4.BMx()
            if (r4 == 0) goto L_0x068c
            X.5Bm r5 = r4.BMy()
        L_0x068c:
            X.73S r4 = new X.73S
            r4.<init>(r6, r5, r3, r1)
            r0.add(r4)
        L_0x0694:
            int r4 = r0.size()
            if (r4 <= r7) goto L_0x06a2
            X.Fw7 r4 = new X.Fw7
            r4.<init>()
            X.01V.A1D(r0, r4)
        L_0x06a2:
            int r4 = r1.A04()
            r8 = 0
            if (r4 != r7) goto L_0x06e7
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r4 = r1.A0C()
            r7 = 0
            if (r4 == 0) goto L_0x06e3
            com.instagram.api.schemas.IgUserRelatedAccountTypeEnum r5 = r4.AXx()
        L_0x06b4:
            com.instagram.api.schemas.IgUserRelatedAccountTypeEnum r4 = com.instagram.api.schemas.IgUserRelatedAccountTypeEnum.FACEBOOK_PAGE
            if (r5 != r4) goto L_0x06e7
            com.instagram.api.schemas.UserBannerInlineOtherProfileDict r4 = r1.A0C()
            if (r4 == 0) goto L_0x06e1
            java.lang.String r5 = r4.AXs()
        L_0x06c2:
            X.4Cl r4 = r1.A03
            X.3rB r4 = r4.BMx()
            if (r4 == 0) goto L_0x06d4
            X.5Bm r4 = r4.BMy()
            if (r4 == 0) goto L_0x06d4
            java.lang.String r7 = r4.getId()
        L_0x06d4:
            boolean r4 = X.00p.A0j(r5, r7, r8)
            if (r4 == 0) goto L_0x06e7
            boolean r4 = X.C3250170s.A01(r2, r1)
            if (r4 == 0) goto L_0x06e7
            return r0
        L_0x06e1:
            r5 = r7
            goto L_0x06c2
        L_0x06e3:
            r5 = r7
            goto L_0x06b4
        L_0x06e5:
            r10 = r5
            goto L_0x066d
        L_0x06e7:
            boolean r4 = A02(r2, r1)
            if (r4 == 0) goto L_0x071d
            X.FgU r4 = new X.FgU
            r4.<init>(r6, r2, r3, r1)
            r0.add(r4)
            return r0
        L_0x06f6:
            r0.addAll(r7)
            r1 = r21
            r0.addAll(r1)
            r1 = r20
            r0.addAll(r1)
            r0.addAll(r14)
            r0.addAll(r13)
            r1 = r19
            r0.addAll(r1)
            r0.addAll(r12)
            r0.addAll(r10)
            r0.addAll(r9)
            r0.addAll(r8)
            r0.addAll(r11)
        L_0x071d:
            return r0
        L_0x071e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3249970q.A05(android.content.Context, com.instagram.aistudio.profile.model.AiStudioProfileBannerModel, X.0iw, com.instagram.common.session.UserSession, X.70e, com.instagram.user.model.User, boolean):java.util.ArrayList");
    }
}
