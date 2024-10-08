package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7CX  reason: invalid class name */
public abstract class AnonymousClass7CX {
    public static final List A00;
    public static final List A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c3, code lost:
        if (r10 == null) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c5, code lost:
        r1 = r10.A03.AaX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cd, code lost:
        if (r1 == com.instagram.api.schemas.IGAIAgentType.A04) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cf, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0361, code lost:
        if (r16 >= (r10 + r13)) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x047e, code lost:
        if (r16 >= (r10 + r13)) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x057b, code lost:
        if (r0.intValue() != 2) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x058c, code lost:
        if (r1 == X.2FW.A0J) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x059a, code lost:
        if (r9.A1M() == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0608, code lost:
        if (r1 == 0) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        if (r9.A1u.equals(r6.A06) != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x074b, code lost:
        r0 = X.182.A06(r9, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0756, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        if (r9.A1N() != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        if (r2.A08 != 29) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fb, code lost:
        r0 = r2.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ac, code lost:
        if (r2 != r0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ae, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0756 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C327627Bo A00(com.instagram.common.session.UserSession r18, X.AnonymousClass9HC r19, X.AnonymousClass7LQ r20, X.C331617Rr r21) {
        /*
            r4 = 3
            r5 = r19
            X.0qQ.A0B(r5, r4)
            boolean r8 = r5.A1X
            if (r8 == 0) goto L_0x0757
            java.util.List r0 = A01
        L_0x000c:
            java.util.Iterator r15 = r0.iterator()
        L_0x0010:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x075b
            java.lang.Object r7 = r15.next()
            X.7Bo r7 = (X.C327627Bo) r7
            r2 = r20
            X.3su r9 = r2.A0e
            X.0qQ.A07(r9)
            X.1at r1 = X.C327657Br.A00()
            X.2FW r0 = r9.A10
            X.0qQ.A07(r0)
            X.7Bu r12 = r1.A01(r0)
            X.7Ca r0 = X.C327747Ca.$redex_init_class
            int r0 = r7.ordinal()
            r3 = 0
            r6 = r18
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0056;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00ff;
                case 5: goto L_0x0114;
                case 6: goto L_0x015a;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                case 9: goto L_0x0178;
                case 10: goto L_0x01af;
                case 11: goto L_0x0208;
                case 12: goto L_0x003c;
                case 13: goto L_0x0229;
                case 14: goto L_0x0234;
                case 15: goto L_0x003c;
                case 16: goto L_0x003c;
                case 17: goto L_0x023f;
                case 18: goto L_0x0245;
                case 19: goto L_0x003c;
                case 20: goto L_0x025b;
                case 21: goto L_0x02d2;
                case 22: goto L_0x03f5;
                case 23: goto L_0x04ad;
                case 24: goto L_0x0551;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x055c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x05cc;
                case 31: goto L_0x0395;
                case 32: goto L_0x05d2;
                case 33: goto L_0x0651;
                case 34: goto L_0x06c9;
                case 35: goto L_0x06ee;
                case 36: goto L_0x06f8;
                case 37: goto L_0x0750;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0010
        L_0x003d:
            X.7SD r2 = r2.A0G
            X.0qQ.A07(r2)
            boolean r1 = r12.CS1(r6, r9)
            X.0eM r0 = r5.A12
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0010
            goto L_0x00e3
        L_0x0056:
            X.7SD r3 = r2.A0G
            X.0qQ.A07(r3)
            boolean r13 = r12.CSF(r6, r9)
            X.0eM r0 = r5.A12
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            X.1Av r10 = X.1Au.A00(r6)
            X.0s0 r2 = r10.A0w
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 158(0x9e, float:2.21E-43)
            r0 = r1[r0]
            java.lang.Object r1 = r2.CDM(r10, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0083
            com.google.common.collect.ImmutableList r0 = X.C254853tA.A07
            java.lang.String r1 = "❤"
        L_0x0083:
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r0 = X.C331867Sr.A00(r6)
            X.JuF r11 = r0.A02(r1)
            X.7Cc r2 = new X.7Cc
            r2.<init>(r6)
            int r10 = r3.A08
            java.util.List r1 = r3.A0b
            boolean r0 = r9.A1S()
            boolean r2 = r2.A00(r1, r10, r0)
            if (r12 == 0) goto L_0x0010
            if (r13 == 0) goto L_0x0010
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r9.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9.A1N()
            if (r0 != 0) goto L_0x0010
            r0 = 29
            if (r10 != r0) goto L_0x00b8
            boolean r0 = r3.A0n
            if (r0 == 0) goto L_0x0010
        L_0x00b8:
            if (r11 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x0010
            X.0eM r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0754
        L_0x00ca:
            X.7SD r2 = r2.A0G
            X.0qQ.A07(r2)
            boolean r1 = r12.CS3(r6, r9)
            X.0eM r0 = r5.A12
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0010
            if (r8 == 0) goto L_0x0010
        L_0x00e3:
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r9.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9.A1N()
            if (r0 != 0) goto L_0x0010
            int r1 = r2.A08
            r0 = 29
            if (r1 != r0) goto L_0x0756
            boolean r0 = r2.A0n
            goto L_0x0754
        L_0x00ff:
            boolean r0 = r12.CRy(r6)
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r9.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9.A2P
            if (r0 != 0) goto L_0x0010
            return r7
        L_0x0114:
            r0 = 1
            X.0qQ.A0B(r12, r0)
            X.1Av r0 = X.1Au.A00(r6)
            X.0qQ.A0B(r0, r3)
            X.0xa r10 = r0.A01
            java.lang.String r0 = "direct_reply_nux_count"
            int r0 = r10.getInt(r0, r3)
            if (r0 > r4) goto L_0x0010
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "direct_reply_nux_seen_timestamp"
            r0 = 0
            long r0 = r10.getLong(r3, r0)
            long r13 = r13 - r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r10 = r3.toMillis(r0)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            boolean r0 = r12.AFk(r6, r9)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x0010
            X.7SD r2 = r2.A0G
            int r1 = r2.A08
            r0 = 29
            if (r1 != r0) goto L_0x0756
            int r1 = r2.A07
            r0 = 7
            if (r1 == r0) goto L_0x0010
            return r7
        L_0x015a:
            X.4kA r3 = X.AnonymousClass4k9.A00(r6)
            X.0s0 r2 = r3.A09
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 5
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 >= r4) goto L_0x0010
            X.5FV r2 = r9.A0G()
            X.5FV r0 = X.AnonymousClass5FV.GiftWrap
            goto L_0x01ac
        L_0x0178:
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r6)
            X.27E r0 = r0.A01
            X.27H r2 = r0.A00
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A1y
            if (r1 != r0) goto L_0x0010
            boolean r0 = r9.A1M()
            if (r0 == 0) goto L_0x0010
            r0 = r21
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0010
            X.0eM r0 = r5.A0n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0010
            X.5rf r0 = X.C297385rf.A00
        L_0x01ac:
            if (r2 != r0) goto L_0x0010
            return r7
        L_0x01af:
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r6)
            X.0qQ.A0B(r0, r4)
            X.27E r0 = r0.A01
            X.27H r2 = r0.A00
            X.2FW r1 = r9.A10
            X.0qQ.A07(r1)
            X.2FW r0 = X.2FW.A0O
            if (r1 == r0) goto L_0x01c7
            X.2FW r0 = X.2FW.A0J
            if (r1 != r0) goto L_0x0010
        L_0x01c7:
            X.0eM r0 = r5.A0n
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0010
            X.5rf r0 = X.C297385rf.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0010
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "direct_avatar_sticker_nux_count"
            int r0 = r1.getInt(r0, r3)
            long r1 = (long) r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            X.0eM r0 = r5.A13
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0754
        L_0x0208:
            X.2FW r0 = r9.A10
            int r0 = r0.ordinal()
            switch(r0) {
                case 20: goto L_0x0213;
                case 21: goto L_0x0213;
                case 37: goto L_0x0213;
                case 38: goto L_0x0213;
                case 46: goto L_0x0213;
                case 49: goto L_0x0213;
                default: goto L_0x0211;
            }
        L_0x0211:
            goto L_0x0010
        L_0x0213:
            java.lang.Integer r0 = r9.A0c()
            if (r0 == 0) goto L_0x0010
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "direct_collab_collection_nux_impression_count"
            int r1 = r1.getInt(r0, r3)
            r0 = 5
            if (r1 >= r0) goto L_0x0010
            return r7
        L_0x0229:
            X.7SD r0 = r2.A0G
            X.0qQ.A07(r0)
            boolean r0 = A06(r6, r0, r9, r12)
            goto L_0x0754
        L_0x0234:
            X.7SD r0 = r2.A0G
            X.0qQ.A07(r0)
            boolean r0 = A03(r6, r0, r9)
            goto L_0x0754
        L_0x023f:
            boolean r0 = A07(r6, r9)
            goto L_0x0754
        L_0x0245:
            com.instagram.user.model.User r10 = r2.A0K
            X.7AG r0 = r9.A0Q
            if (r0 == 0) goto L_0x0010
            X.AnonymousClass9B9.A00()
            X.9BB r0 = X.AnonymousClass9BA.A00(r6)
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0010
            goto L_0x02c3
        L_0x025b:
            X.7SD r12 = r2.A0G
            X.0qQ.A07(r12)
            com.instagram.user.model.User r10 = r2.A0K
            X.7Sp r2 = new X.7Sp
            r2.<init>(r6)
            java.lang.String r11 = r9.A0g()
            if (r11 == 0) goto L_0x0010
            X.7AG r0 = r9.A0Q
            if (r0 == 0) goto L_0x0010
            boolean r0 = r12.A0o
            if (r0 != 0) goto L_0x0010
            X.AnonymousClass9B9.A00()
            X.9BB r0 = X.AnonymousClass9BA.A00(r6)
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0010
            X.3t3 r0 = r12.A0P
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r1, r3)
            X.0xa r2 = r2.A00
            java.lang.String r0 = "thread_id_"
            java.lang.String r1 = X.002.A0R(r0, r1)
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C331227Qb.A02(r6)
            if (r0 != 0) goto L_0x0010
            X.1Av r2 = X.1Au.A00(r6)
            java.lang.String r3 = "try_it_impression_count"
            r0 = 0
            X.0xa r2 = r2.A01
            long r11 = r2.getLong(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600873780776987(0x82084d002c101b, double:3.209878186627993E-306)
            long r1 = X.182.A01(r2, r6, r0)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
        L_0x02c3:
            if (r10 == 0) goto L_0x02d0
            X.4Cl r0 = r10.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
        L_0x02cb:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            if (r1 == r0) goto L_0x0010
            return r7
        L_0x02d0:
            r1 = 0
            goto L_0x02cb
        L_0x02d2:
            X.7SD r11 = r2.A0G
            X.0qQ.A07(r11)
            X.7Sp r2 = new X.7Sp
            r2.<init>(r6)
            java.lang.String r10 = r9.A0g()
            if (r10 == 0) goto L_0x0010
            X.AnonymousClass9B9.A00()
            X.9BB r0 = X.AnonymousClass9BA.A00(r6)
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0010
            X.7AG r0 = r9.A0Q
            if (r0 == 0) goto L_0x0010
            X.1iA r1 = r9.A0W()
            X.1iA r0 = X.1iA.A0X
            if (r1 == r0) goto L_0x0303
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x0010
        L_0x0303:
            X.3tI r0 = r9.A0P()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = r0.A0U
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r11.A0o
            if (r0 != 0) goto L_0x0010
            X.3t3 r0 = r11.A0P
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r1, r3)
            X.0xa r2 = r2.A00
            java.lang.String r0 = "thread_id_text_"
            java.lang.String r1 = X.002.A0R(r0, r1)
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0010
            long r16 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "try_meta_ai_impression_time_ms"
            r2 = 0
            X.0xa r0 = r0.A01
            long r13 = r0.getLong(r1, r2)
            boolean r12 = X.C331227Qb.A02(r6)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36608518820009686(0x820f41000516d6, double:3.214712940222854E-306)
            long r10 = X.182.A01(r9, r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0363
            long r10 = r10 + r13
            int r1 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0364
        L_0x0363:
            r0 = 0
        L_0x0364:
            if (r12 == 0) goto L_0x036a
            if (r0 == 0) goto L_0x036a
            goto L_0x0010
        L_0x036a:
            boolean r0 = X.AnonymousClass9B8.A07(r6)
            if (r0 == 0) goto L_0x0010
            r0 = 36327043843045510(0x810f4100013886, double:3.036707031381951E-306)
            boolean r0 = X.182.A06(r9, r6, r0)
            if (r0 == 0) goto L_0x0010
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "try_meta_ai_impression_count"
            X.0xa r0 = r0.A01
            long r10 = r0.getLong(r1, r2)
            r0 = 36608518819878612(0x820f41000316d4, double:3.214712940139962E-306)
            long r1 = X.182.A01(r9, r6, r0)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            return r7
        L_0x0395:
            X.7SD r10 = r2.A0G
            X.0qQ.A07(r10)
            java.lang.String r2 = r9.A0g()
            if (r2 == 0) goto L_0x0010
            boolean r0 = r10.A0o
            if (r0 != 0) goto L_0x0010
            boolean r0 = X.C327757Cb.A00(r9)
            if (r0 == 0) goto L_0x0010
            X.3tI r0 = r9.A0P()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = r0.A0U
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            X.7Sp r1 = new X.7Sp
            r1.<init>(r6)
            X.3t3 r0 = r10.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r1.A02(r0, r2)
            if (r0 == 0) goto L_0x0010
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "imagine_me_impression_count"
            X.0xa r0 = r0.A01
            int r0 = r0.getInt(r1, r3)
            if (r0 >= r4) goto L_0x0010
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "has_imagine_me_mustache_clicked"
            X.0qQ.A0B(r1, r3)
            X.0xa r0 = r0.A01
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L_0x0010
            X.0Tu r9 = X.0Tu.A05
            r0 = 36325836957365512(0x810e2800033508, double:3.0359437920181815E-306)
            goto L_0x074b
        L_0x03f5:
            X.7SD r10 = r2.A0G
            X.0qQ.A07(r10)
            X.7Sp r3 = new X.7Sp
            r3.<init>(r6)
            java.lang.String r2 = r9.A0g()
            if (r2 == 0) goto L_0x0010
            X.AnonymousClass9B9.A00()
            X.9BB r0 = X.AnonymousClass9BA.A00(r6)
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0010
            X.7AG r0 = r9.A0Q
            if (r0 == 0) goto L_0x0010
            X.1iA r1 = r9.A0W()
            X.1iA r0 = X.1iA.A0Q
            if (r1 == r0) goto L_0x042a
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x0010
            java.lang.String r0 = r9.A1q
            if (r0 != 0) goto L_0x0010
        L_0x042a:
            java.lang.String r0 = r9.A0g()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r10.A0o
            if (r0 != 0) goto L_0x0010
            X.3tI r0 = r9.A0P()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = r0.A0U
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            X.3t3 r0 = r10.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r3.A02(r0, r2)
            if (r0 == 0) goto L_0x0010
            long r16 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "try_imagine_impression_time_ms"
            r2 = 0
            X.0xa r0 = r0.A01
            long r13 = r0.getLong(r1, r2)
            boolean r12 = X.C331227Qb.A02(r6)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36608518819944149(0x820f41000416d5, double:3.214712940181408E-306)
            long r10 = X.182.A01(r9, r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0480
            long r10 = r10 + r13
            int r1 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0481
        L_0x0480:
            r0 = 0
        L_0x0481:
            if (r12 == 0) goto L_0x0487
            if (r0 == 0) goto L_0x0487
            goto L_0x0010
        L_0x0487:
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "try_imagine_impression_count"
            X.0xa r0 = r0.A01
            long r10 = r0.getLong(r1, r2)
            r0 = 36608518819813075(0x820f41000216d3, double:3.2147129400985164E-306)
            long r1 = X.182.A01(r9, r6, r0)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            boolean r0 = X.AnonymousClass9B8.A07(r6)
            if (r0 == 0) goto L_0x0010
            r0 = 36327043842979973(0x810f4100003885, double:3.036707031340505E-306)
            goto L_0x074b
        L_0x04ad:
            X.7SD r10 = r2.A0G
            X.0qQ.A07(r10)
            X.7Sp r3 = new X.7Sp
            r3.<init>(r6)
            java.lang.String r2 = r9.A0g()
            if (r2 == 0) goto L_0x0010
            boolean r0 = r10.A0o
            if (r0 != 0) goto L_0x04d0
            X.AnonymousClass9B9.A00()
            X.9BB r0 = X.AnonymousClass9BA.A00(r6)
            java.lang.Integer r1 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0010
        L_0x04d0:
            int r1 = r10.A08
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 == r0) goto L_0x0010
            X.7AG r0 = r9.A0Q
            if (r0 == 0) goto L_0x0010
            X.1iA r1 = r9.A0W()
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x0010
            X.3t3 r0 = r10.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r3.A02(r0, r2)
            if (r0 == 0) goto L_0x0010
            long r13 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "imagine_animate_impression_time_ms"
            r2 = 0
            X.0xa r0 = r0.A01
            long r9 = r0.getLong(r1, r2)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x050e
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 + r0
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x050e
            goto L_0x0010
        L_0x050e:
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "try_imagine_impression_time_ms"
            X.0xa r0 = r0.A01
            long r11 = r0.getLong(r1, r2)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0530
            X.0Tu r9 = X.0Tu.A05
            r0 = 36608518820140759(0x820f41000716d7, double:3.214712940305745E-306)
            long r9 = X.182.A01(r9, r6, r0)
            long r9 = r9 + r11
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0530
            goto L_0x0010
        L_0x0530:
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "imagine_animate_impression_count"
            X.0xa r0 = r0.A01
            long r9 = r0.getLong(r1, r2)
            r1 = 3
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            boolean r0 = X.AnonymousClass9B8.A07(r6)
            if (r0 == 0) goto L_0x0010
            X.0Tu r9 = X.0Tu.A05
            r0 = 36319398805183739(0x81084d003d1cfb, double:3.03187227865407E-306)
            goto L_0x074b
        L_0x0551:
            X.7SD r0 = r2.A0G
            X.0qQ.A07(r0)
            boolean r0 = A05(r6, r0, r9)
            goto L_0x0754
        L_0x055c:
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r6)
            r1 = 2
            X.0qQ.A0B(r2, r1)
            com.google.common.collect.ImmutableList r0 = r9.A0H()
            if (r0 == 0) goto L_0x057d
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x057d
            java.lang.Integer r0 = r0.A0f
            if (r0 == 0) goto L_0x057d
            int r0 = r0.intValue()
            r11 = 1
            if (r0 == r1) goto L_0x057e
        L_0x057d:
            r11 = 0
        L_0x057e:
            X.27E r2 = r2.A01
            X.2FW r1 = r9.A10
            X.0qQ.A07(r1)
            X.2FW r0 = X.2FW.A0O
            if (r1 == r0) goto L_0x058e
            X.2FW r0 = X.2FW.A0J
            r10 = 0
            if (r1 != r0) goto L_0x058f
        L_0x058e:
            r10 = 1
        L_0x058f:
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A1y
            if (r1 != r0) goto L_0x059c
            boolean r1 = r9.A1M()
            r0 = 1
            if (r1 != 0) goto L_0x059d
        L_0x059c:
            r0 = 0
        L_0x059d:
            if (r10 != 0) goto L_0x05a1
            if (r0 == 0) goto L_0x0010
        L_0x05a1:
            if (r11 == 0) goto L_0x0010
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "direct_avatar_update_nux_count"
            int r0 = r1.getInt(r0, r3)
            if (r0 >= r4) goto L_0x0010
            boolean r0 = r2 instanceof X.C293135kC
            if (r0 == 0) goto L_0x0010
            X.5kC r2 = (X.C293135kC) r2
            X.5kB r0 = r2.A00
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0010
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325351625864082(0x810db700003392, double:3.035636866422404E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            goto L_0x0754
        L_0x05cc:
            boolean r0 = A02(r6, r2)
            goto L_0x0754
        L_0x05d2:
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x0010
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = r9.A1j(r0)
            if (r0 != 0) goto L_0x0010
            X.BB8 r0 = r9.A0L()
            r1 = 0
            if (r0 == 0) goto L_0x05f5
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x064f
            java.util.Map r0 = X.C48097EVp.A01
            java.lang.Object r1 = r0.get(r1)
        L_0x05f5:
            X.EVp r0 = X.C48097EVp.MEMU
            if (r1 != r0) goto L_0x0010
            X.BB8 r0 = r9.A0L()
            if (r0 == 0) goto L_0x060a
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x060a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x060b
        L_0x060a:
            r0 = 1
        L_0x060b:
            r2 = 985868034(0x3ac32702, float:0.0014888945)
            if (r0 == 0) goto L_0x061d
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "mifu_mustache_text_null_prompt"
        L_0x0614:
            X.0f9 r0 = r1.AEf(r0, r2)
            r0.report()
            goto L_0x0010
        L_0x061d:
            X.BB8 r0 = r9.A0L()
            if (r0 == 0) goto L_0x064a
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x064a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x064a
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "memu_in_feed_imagine_yourself_impression_count_key"
            X.0xa r0 = r0.A01
            int r0 = r0.getInt(r1, r3)
            long r2 = (long) r0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36609824489871293(0x821071000217bd, double:3.215538651100845E-306)
            long r9 = X.182.A01(r9, r6, r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            return r7
        L_0x064a:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "mifu_mustache_text_null_mimicry_caption"
            goto L_0x0614
        L_0x064f:
            r1 = 0
            goto L_0x05f5
        L_0x0651:
            X.7SD r11 = r2.A0G
            X.0qQ.A07(r11)
            X.7Sp r10 = new X.7Sp
            r10.<init>(r6)
            java.lang.String r2 = r9.A0g()
            if (r2 == 0) goto L_0x0010
            boolean r0 = r11.A0o
            if (r0 != 0) goto L_0x0010
            X.7AG r1 = r9.A0Q
            r0 = 0
            if (r1 == 0) goto L_0x06c7
            java.lang.String r12 = r1.A06
        L_0x066c:
            java.lang.String r1 = "imagine_create"
            boolean r1 = r1.equalsIgnoreCase(r12)
            if (r1 != 0) goto L_0x0684
            java.lang.String r12 = "image"
            X.9JH r1 = r9.A0F()
            if (r1 == 0) goto L_0x067e
            java.lang.String r0 = r1.A03
        L_0x067e:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0010
        L_0x0684:
            X.3tI r0 = r9.A0P()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = r0.A0U
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            X.3t3 r0 = r11.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r10.A02(r0, r2)
            if (r0 == 0) goto L_0x0010
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "imagine_create_impression_count"
            X.0xa r0 = r0.A01
            int r0 = r0.getInt(r1, r3)
            if (r0 >= r4) goto L_0x0010
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r1 = "has_imagine_create_mustache_clicked"
            X.0qQ.A0B(r1, r3)
            X.0xa r0 = r0.A01
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L_0x0010
            boolean r0 = X.C327357Al.A00(r6)
            goto L_0x0754
        L_0x06c7:
            r12 = r0
            goto L_0x066c
        L_0x06c9:
            X.7SD r1 = r2.A0G
            X.0qQ.A07(r1)
            boolean r0 = r1.A1A
            if (r0 == 0) goto L_0x0010
            boolean r0 = r1.A14
            if (r0 != 0) goto L_0x0010
            boolean r0 = r1.A15
            if (r0 != 0) goto L_0x0010
            X.77w r0 = X.C3267177w.A00
            boolean r0 = r0.A04(r9)
            if (r0 == 0) goto L_0x0010
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327159807097032(0x810f5c000038c8, double:3.036780367515083E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            goto L_0x0754
        L_0x06ee:
            X.7SD r0 = r2.A0G
            X.0qQ.A07(r0)
            boolean r0 = A04(r6, r0, r9)
            goto L_0x0754
        L_0x06f8:
            X.7SD r3 = r2.A0G
            X.0qQ.A07(r3)
            java.lang.String r2 = r9.A0g()
            if (r2 == 0) goto L_0x0010
            boolean r0 = X.C327757Cb.A00(r9)
            if (r0 == 0) goto L_0x0010
            X.7Sp r1 = new X.7Sp
            r1.<init>(r6)
            X.3t3 r0 = r3.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r1.A02(r0, r2)
            if (r0 == 0) goto L_0x0010
            X.1Av r2 = X.1Au.A00(r6)
            java.lang.String r3 = "retake_photo_for_imagine_me_mustache_impression_last_seen_ms"
            r0 = 0
            X.0xa r2 = r2.A01
            long r13 = r2.getLong(r3, r0)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0744
            long r11 = java.lang.System.currentTimeMillis()
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36607311935247910(0x820e2800151626, double:3.213949701439772E-306)
            long r0 = X.182.A01(r2, r6, r0)
            long r9 = r9 * r0
            long r13 = r13 + r9
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
        L_0x0744:
            X.0Tu r9 = X.0Tu.A05
            r0 = 2342168846171649297(0x20810e28000c3511, double:4.070535125448266E-152)
        L_0x074b:
            boolean r0 = X.182.A06(r9, r6, r0)
            goto L_0x0754
        L_0x0750:
            boolean r0 = A01(r6, r5, r2)
        L_0x0754:
            if (r0 == 0) goto L_0x0010
        L_0x0756:
            return r7
        L_0x0757:
            java.util.List r0 = A00
            goto L_0x000c
        L_0x075b:
            X.7Bo r7 = X.C327627Bo.NUX_TYPE_NONE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CX.A00(com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7Rr):X.7Bo");
    }

    public static final boolean A01(UserSession userSession, AnonymousClass9HC r7, AnonymousClass7LQ r8) {
        String str;
        if (System.currentTimeMillis() - AnonymousClass4k9.A00(userSession).A00.getLong("preference_direct_tap_and_hold_to_reply_meta_ai_message_last_time_seen", 0) > TimeUnit.DAYS.toMillis(1) && AnonymousClass4k9.A00(userSession).A00.getInt("preference_direct_tap_and_hold_to_reply_meta_ai_message_nux_count", 0) < ((int) 182.A01(0Tu.A05, userSession, 36600873784381472L)) && ((Boolean) r7.A16.getValue()).booleanValue() && !r8.A0G.A0o) {
            C254703su r1 = r8.A0e;
            if (r1.A0Q == null || !r8.A0W || (str = r1.A1q) == null || !str.contains("?")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, AnonymousClass7LQ r5) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36327039548012673L) || !182.A06(r2, userSession, 36327039548143747L) || AnonymousClass4k9.A00(userSession).A00.getInt("preference_direct_regenerate_ai_message_nux_count", 0) >= ((int) 182.A01(r2, userSession, 36608514524911313L)) || !r5.A06()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r9.A1F != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.instagram.common.session.UserSession r8, X.AnonymousClass7SD r9, X.C254703su r10) {
        /*
            r3 = 0
            java.lang.String r0 = r9.A0T
            java.lang.String r7 = r8.A06
            boolean r6 = X.0qQ.A0K(r0, r7)
            X.3t3 r0 = r9.A0P
            r5 = 0
            if (r0 == 0) goto L_0x0061
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L_0x0061
            boolean r0 = r9.A12
            if (r0 == 0) goto L_0x0025
            boolean r0 = r9.A0l
            if (r0 != 0) goto L_0x0025
            boolean r0 = r9.A1F
            r2 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            int r1 = r9.A08
            r0 = 29
            if (r1 != r0) goto L_0x0061
            if (r6 == 0) goto L_0x0061
            java.lang.String r0 = r10.BsI()
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0061
            if (r2 == 0) goto L_0x0061
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_xposting_creation_upsell_mustache_nux"
            java.lang.String r0 = X.002.A0R(r0, r4)
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0061
            boolean r0 = X.AnonymousClass7K4.A03(r8, r3)
            if (r0 == 0) goto L_0x0061
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323144012802973(0x810bb500022b9d, double:3.0342407630332145E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0061
            r5 = 1
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CX.A04(com.instagram.common.session.UserSession, X.7SD, X.3su):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r9.A1F != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.common.session.UserSession r8, X.AnonymousClass7SD r9, X.C254703su r10) {
        /*
            r3 = 0
            java.lang.String r0 = r9.A0T
            java.lang.String r7 = r8.A06
            boolean r6 = X.0qQ.A0K(r0, r7)
            X.3t3 r0 = r9.A0P
            r5 = 0
            if (r0 == 0) goto L_0x0054
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L_0x0054
            boolean r0 = r9.A1E
            if (r0 == 0) goto L_0x0025
            boolean r0 = r9.A0l
            if (r0 == 0) goto L_0x0025
            boolean r0 = r9.A1F
            r2 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            int r1 = r9.A08
            r0 = 29
            if (r1 != r0) goto L_0x0054
            if (r6 == 0) goto L_0x0054
            java.lang.String r0 = r10.BsI()
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0054
            if (r2 == 0) goto L_0x0054
            boolean r0 = X.AnonymousClass7K4.A03(r8, r3)
            if (r0 == 0) goto L_0x0054
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_xposting_upsell_mustache_nux"
            java.lang.String r0 = X.002.A0R(r0, r4)
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0054
            r5 = 1
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CX.A05(com.instagram.common.session.UserSession, X.7SD, X.3su):boolean");
    }

    public static final boolean A06(UserSession userSession, AnonymousClass7SD r11, C254703su r12, C327687Bu r13) {
        C254793t3 r0;
        String A07;
        C327687Bu r6 = r13;
        0qQ.A0B(r13, 3);
        UserSession userSession2 = userSession;
        String str = userSession.A06;
        C254703su r5 = r12;
        if (r12.A1u.equals(str) && 0qQ.A0K(str, r11.A0T)) {
            boolean z = r11.A0n;
            if (!(!AnonymousClass7FO.A00(userSession2, r5, r6, Integer.valueOf(r11.A01), r11.A0b, r11.A08, z) || (r0 = r11.A0P) == null || (A07 = C300965yF.A07(r0)) == null)) {
                0xa r62 = AnonymousClass4k9.A00(userSession2).A00;
                long j = r62.getLong(002.A0R("direct_share_message_nux_first_timestamp_", A07), 0);
                if (r62.getInt("direct_share_message_nux_count", 0) >= 3 || j == 0 || System.currentTimeMillis() <= j + 86400000) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0.intValue() != 1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(com.instagram.common.session.UserSession r6, X.C254703su r7) {
        /*
            r3 = 0
            r2 = 1
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            r5 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r0 = r0.A0j
            if (r0 == 0) goto L_0x001c
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r2) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            X.0wX r0 = r6.A03
            android.content.Context r0 = r0.A06()
            boolean r0 = X.0oI.A0A(r0)
            if (r0 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320163305431114(0x8108ff0001204a, double:3.0323557516889056E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0053
            X.4kA r0 = X.AnonymousClass4k9.A00(r6)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "direct_threads_upsell_nux_count"
            int r0 = r1.getInt(r0, r3)
            long r3 = (long) r0
            r0 = 36601638282203388(0x8208ff000210fc, double:3.210361660408449E-306)
            long r1 = X.182.A01(r2, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            return r5
        L_0x0053:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CX.A07(com.instagram.common.session.UserSession, X.3su):boolean");
    }

    public static final boolean A08(List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ((AnonymousClass7LQ) it.next()).A0C = C327627Bo.NUX_TYPE_NONE;
            z = true;
        }
        return z;
    }

    static {
        C327627Bo[] r2 = new C327627Bo[31];
        C327627Bo r12 = C327627Bo.NUX_TYPE_LONG_PRESS_REPLY_TO_AI;
        C327627Bo r13 = C327627Bo.NUX_TYPE_MEMU_IN_FEED_IMAGINE_YOURSELF;
        C327627Bo r14 = C327627Bo.NUX_TYPE_AI_AGENT_REGENERATE;
        C327627Bo r15 = C327627Bo.NUX_TYPE_TRY_META_AI_TEXT;
        C327627Bo r16 = C327627Bo.NUX_TYPE_TRY_IMAGINE;
        C327627Bo r17 = C327627Bo.NUX_TYPE_GEN_AI_IMAGINE_CREATE;
        C327627Bo r18 = C327627Bo.NUX_TYPE_TRY_IT_IMAGINE_ME;
        C327627Bo r19 = C327627Bo.NUX_TYPE_IMAGINE_ANIMATE;
        C327627Bo r20 = C327627Bo.NUX_TYPE_TRY_AI_ASSISTANT;
        C327627Bo r21 = C327627Bo.NUX_TYPE_GET_AI_AGENT;
        C327627Bo r22 = C327627Bo.NUX_TYPE_AVATAR_UPDATE;
        C327627Bo r23 = C327627Bo.NUX_TYPE_AVATAR_QR;
        C327627Bo r24 = C327627Bo.NUX_TYPE_AVATAR_STICKER;
        C327627Bo r25 = C327627Bo.NUX_TYPE_GIFT_MESSAGE;
        C327627Bo r26 = C327627Bo.NUX_TYPE_CHANNEL_MEMBER_REPLY;
        C327627Bo r27 = C327627Bo.NUX_TYPE_SHARE_MESSAGE;
        C327627Bo r28 = C327627Bo.NUX_TYPE_GET_BARCELONA;
        C327627Bo r29 = C327627Bo.NUX_TYPE_DOUBLE_TAP_TO_REACT_WITH_AVATAR;
        C327627Bo r30 = C327627Bo.NUX_TYPE_DOUBLE_TAP_TO_LIKE;
        C327627Bo r31 = C327627Bo.NUX_TYPE_LONG_PRESS_TO_REACT;
        C327627Bo r32 = C327627Bo.NUX_TYPE_COLLAB_COLLECTION;
        C327627Bo r33 = C327627Bo.NUX_TYPE_TAP_TO_FORWARD;
        C327627Bo r34 = C327627Bo.NUX_TYPE_REPLY;
        C327627Bo r35 = C327627Bo.NUX_TYPE_BRANDED_CONTENT_UPSELL;
        C327627Bo r36 = C327627Bo.NUX_TYPE_CHANNEL_XPOSTING_UPSELL;
        C327627Bo r11 = C327627Bo.NUX_TYPE_CHANNEL_MESSAGE_XPOSTED_HINT;
        C327627Bo r10 = C327627Bo.NUX_TYPE_CUSTOMER_DETAILS;
        System.arraycopy(new C327627Bo[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r11, r10}, 0, r2, 0, 27);
        C327627Bo r5 = C327627Bo.NUX_TYPE_ADD_REACTIONS;
        C327627Bo r9 = C327627Bo.NUX_TYPE_EDIT_WITH_AI;
        C327627Bo r8 = C327627Bo.NUX_TYPE_RETAKE_PHOTO_FOR_IMAGINE_ME;
        C327627Bo r4 = C327627Bo.NUX_TYPE_CHANNEL_XPOSTING_CREATION_UPSELL;
        System.arraycopy(new C327627Bo[]{r5, r9, r8, r4}, 0, r2, 27, 4);
        A00 = 0sr.A1P(r2);
        C327627Bo[] r210 = new C327627Bo[31];
        System.arraycopy(new C327627Bo[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r8, r9, r22, r23, r24, r25, r26, r27, r28, r29, r31, r30, r32, r33, r34, r35, r36}, 0, r210, 0, 27);
        System.arraycopy(new C327627Bo[]{r11, r10, r5, r4}, 0, r210, 27, 4);
        A01 = 0sr.A1P(r210);
    }

    public static final boolean A03(UserSession userSession, AnonymousClass7SD r6, C254703su r7) {
        String str;
        C254763t0 r0;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        C254793t3 r2 = r6.A0P;
        if (!(r2 instanceof C254763t0) || (r0 = (C254763t0) r2) == null || (str = r0.A00) == null) {
            str = "";
        }
        0xa r1 = A002.A00;
        if (!r1.getBoolean(002.A0R("broadcast_channel_replies_nudge_has_displayed_", str), false) || r1.getInt("direct_channel_member_reply_nux_count", 0) >= 3 || r6.A1A || r6.A07 == 8 || !r6.A0n || !AnonymousClass9HV.A00(userSession).A00(r2, 46) || !AnonymousClass7FM.A01(userSession, r7)) {
            return false;
        }
        return true;
    }
}
