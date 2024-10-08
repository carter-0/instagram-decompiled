package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.OyU  reason: case insensitive filesystem */
public abstract class C72204OyU implements AnonymousClass0lh {
    public Integer A00;
    public boolean A01;
    public final C269794fh A02;
    public final 1a8 A03;
    public final UserSession A04;
    public final C66594MYg A05;
    public final 2Dm A06;
    public final OEE A07;
    public final Integer A08;
    public final EnumSet A09;
    public final Map A0A = AnonymousClass7TE.A1H();
    public final Map A0B = AnonymousClass7TE.A1H();
    public final Map A0C = AnonymousClass7TE.A1H();
    public final Set A0D = DbS.A0y();
    public final 1Ng A0E;
    public final 1wn A0F;
    public final 1wn A0G;
    public final 1wn A0H;
    public final C70476O8b A0I;

    public final 1aU A0A(C254743sy r6, C254743sy r7) {
        C254793t3 r0;
        0qQ.A0B(r6, 0);
        C254793t3 A082 = C66647MaG.A08(r6);
        if (r7 == null || (r0 = C66647MaG.A08(r7)) == null) {
            N4P n4p = (N4P) O0I.A00(this.A04, r6);
            if (n4p != null) {
                r0 = n4p.A0K;
            } else {
                r0 = null;
            }
        }
        if (A082 == null) {
            return 1aF.A01(new C61066Jw4(true, false, (List) 0sn.A00, 7));
        }
        if (r0 == null) {
            return A01(A082);
        }
        1aU A012 = 1aU.A01(new C71990OuO(this, r6), A01(A082), A01(r0));
        0qQ.A0A(A012);
        return A012;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.0r1, java.lang.Object] */
    public final void A0B(C254743sy r17, Integer num) {
        String A11;
        C242373Tu r0;
        String str;
        String str2;
        C61066Jw4 jw4;
        C61066Jw4 jw42;
        List list;
        C71039Oa5 oa5;
        C254743sy r4 = r17;
        0qQ.A0B(r4, 0);
        C254793t3 A082 = C66647MaG.A08(r4);
        if (A082 != null) {
            UserSession userSession = this.A04;
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 36326936468797527L)) {
                A11 = null;
                if (!(this.A01 || (jw42 = (C61066Jw4) this.A0B.get(A082)) == null || (list = (List) jw42.A00) == null || (oa5 = (C71039Oa5) 00k.A0L(list)) == null)) {
                    A11 = Long.valueOf(oa5.A01()).toString();
                }
            } else {
                A11 = DbT.A11(A082, this.A0A);
            }
            AnonymousClass1aS r1 = (AnonymousClass1aS) this.A0C.get(A082);
            if (r1 != null && (jw4 = (C61066Jw4) r1.A0X()) != null && !jw4.A02) {
                Object A0X = r1.A0X();
                if (A0X != null) {
                    r1.accept(A0X);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            } else if (!182.A06(r3, userSession, 36318058772371258L) || !this.A0D.contains(A082)) {
                String A0j = AnonymousClass7TG.A0j();
                C254763t0 A022 = C300965yF.A02(A082);
                Integer num2 = num;
                if (A022 != null) {
                    2Dr r02 = this.A06;
                    String str3 = A022.A00;
                    0qQ.A0B(str3, 0);
                    r02.A0N(str3);
                    ? obj = new Object();
                    C331057Pi r12 = C331077Pk.A02;
                    AnonymousClass3U9 A0b = C66582MXn.A0b(userSession, str3);
                    if (A0b != null) {
                        r0 = A0b.AiM();
                    } else {
                        r0 = null;
                    }
                    boolean A032 = r12.A03(userSession, r0);
                    this.A0D.add(A082);
                    OEE oee = this.A07;
                    if (this.A08 == AnonymousClass05K.A00) {
                        str = "photos_and_videos";
                    } else {
                        str = "media_shares";
                    }
                    UserSession userSession2 = oee.A01;
                    1NY A0b2 = AnonymousClass7TG.A0b(userSession2);
                    A0b2.A0K("direct_v2/threads/%s/media/", new Object[]{str3});
                    if (num == null || (str2 = num2.toString()) == null) {
                        str2 = oee.A02;
                    }
                    A0b2.A9m("limit", str2);
                    A0b2.A9m("media_type", str);
                    A0b2.A9m("eb_device_id", AnonymousClass65B.A03.A02(userSession2));
                    A0b2.A9m("igd_request_log_tracking_id", A0j);
                    A0b2.A0Q(NH7.class, C70884OQb.class);
                    if (A11 != null) {
                        A0b2.A9m("max_timestamp", A11);
                    }
                    this.A03.A02(C69818Nsf.A00(A0b2.A0M()).A0P(oee.A00).A0L(new C72042OvH(this, A022, A082, obj, A032)), new PSW(3, A022, A082, this, obj));
                }
                if (C66647MaG.A01(r4) == C254923tH.ACT) {
                    A05(this, A082, num2, A11);
                }
            }
        }
    }

    private final AnonymousClass1aS A01(C254793t3 r7) {
        Map map = this.A0C;
        Object obj = map.get(r7);
        if (obj == null) {
            obj = 1aF.A01(new C61066Jw4(true, false, (List) 0sn.A00, 7));
            if (C300965yF.A02(r7) != null) {
                PU9.A00(C72169Oxe.A00(this.A02, this, r7, 20), this.A03, r7, this, 18);
            }
            map.put(r7, obj);
        }
        return (AnonymousClass1aS) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.3t3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.3t3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.3t3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.3t3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C254793t3 A02(X.2Kb r4, X.C72204OyU r5) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r4.A00
            X.3t0 r4 = X.AnonymousClass3t7.A00(r0)
            r3 = 0
            if (r4 == 0) goto L_0x0029
            java.util.Map r0 = r5.A0C
            java.util.Iterator r2 = X.DbV.A16(r0)
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3t3 r0 = (X.C254793t3) r0
            X.3t0 r0 = X.C300965yF.A02(r0)
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x0027:
            X.3t3 r3 = (X.C254793t3) r3
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72204OyU.A02(X.2Kb, X.OyU):X.3t3");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.1Xx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (X.C3263776n.A01(r8, r1, r0, r4) == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        if (r6.A04(r0) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        if (r12 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r3 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r15 != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[LOOP:1: B:48:0x010e->B:50:0x0114, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedList A03(X.C72204OyU r36, X.C254793t3 r37, java.util.List r38) {
        /*
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r2 = r36
            com.instagram.common.session.UserSession r8 = r2.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320519787782672(0x81095200022210, double:3.03258119256347E-306)
            boolean r15 = X.182.A06(r3, r8, r0)
            java.util.Iterator r14 = r38.iterator()
        L_0x0018:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0349
            X.3su r0 = X.C66580MXl.A0a(r14)
            boolean r1 = r0.A1S()
            if (r1 == 0) goto L_0x002b
            r4 = 0
            if (r15 == 0) goto L_0x002c
        L_0x002b:
            r4 = 1
        L_0x002c:
            boolean r1 = r0.A2P
            if (r1 != 0) goto L_0x0018
            java.util.EnumSet r3 = r2.A09
            X.2FW r1 = r0.A10
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0018
            boolean r1 = r0.A1T()
            if (r1 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0048
            java.lang.Integer r3 = r2.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r3 != r1) goto L_0x0018
        L_0x0048:
            X.2FW r4 = r0.A10
            X.0qQ.A07(r4)
            X.2FW r1 = X.2FW.A1A
            if (r4 != r1) goto L_0x012f
            X.1Xj r3 = r0.A0s
            if (r3 == 0) goto L_0x012f
        L_0x0055:
            X.3t0 r1 = r0.A0U()
            r4 = 0
            if (r1 == 0) goto L_0x0126
            X.2Dm r5 = r2.A06
            X.3t0 r1 = X.C300965yF.A01(r1)
            com.instagram.model.direct.DirectThreadKey r1 = X.C327647Bq.A00(r1)
            X.3U9 r12 = r5.B33(r1)
            if (r12 == 0) goto L_0x0127
            com.instagram.user.model.User r1 = r12.BZK()
            if (r1 == 0) goto L_0x0127
            boolean r11 = r1.CXO()
        L_0x0076:
            com.instagram.user.model.User r1 = r12.BZK()
            if (r1 == 0) goto L_0x012c
            boolean r9 = r1.isRestricted()
        L_0x0080:
            java.lang.String r20 = r0.A0g()
            java.lang.String r5 = r0.A1u
            X.0qQ.A07(r5)
            java.lang.String r23 = r0.A0f()
            long r29 = r0.C7c()
            boolean r7 = r0.A1S()
            X.7AG r1 = r0.A0Q
            if (r1 == 0) goto L_0x009b
            java.lang.String r4 = r1.A08
        L_0x009b:
            X.77w r6 = X.C3267177w.A00
            java.lang.String r1 = X.C3267177w.A01(r0)
            if (r1 != 0) goto L_0x0121
            r24 = 0
        L_0x00a5:
            if (r12 == 0) goto L_0x00b9
            int r1 = r12.BHS()
            if (r1 != 0) goto L_0x00b9
            if (r11 != 0) goto L_0x00b9
            if (r9 != 0) goto L_0x00b9
            boolean r1 = r6.A04(r0)
            r32 = 1
            if (r1 != 0) goto L_0x00bb
        L_0x00b9:
            r32 = 0
        L_0x00bb:
            java.lang.String r1 = r3.getId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Integer r1 = r0.A0d(r1)
            X.0qQ.A07(r1)
            int r28 = r1.intValue()
            boolean r1 = r0.A1c()
            r33 = r1 ^ 1
            r17 = 0
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r7)
            r31 = 0
            X.OIP r1 = new X.OIP
            r21 = r5
            r22 = r17
            r25 = r4
            r26 = r17
            r27 = r17
            r34 = r31
            r35 = r31
            r36 = r31
            r18 = r3
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36)
        L_0x00f5:
            X.Oa5 r3 = new X.Oa5
            r3.<init>((X.OIP) r1)
            X.2FW r0 = r0.A10
            X.0qQ.A07(r0)
            A09(r3, r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r3)
        L_0x0106:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x010e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.next()
            r10.addFirst(r0)
            X.0gF r0 = X.C60340gF.A00
            r3.add(r0)
            goto L_0x010e
        L_0x0121:
            java.lang.String r24 = X.C3267177w.A02(r0, r1)
            goto L_0x00a5
        L_0x0126:
            r12 = r4
        L_0x0127:
            r11 = 0
            if (r12 == 0) goto L_0x012c
            goto L_0x0076
        L_0x012c:
            r9 = 0
            goto L_0x0080
        L_0x012f:
            X.2FW r1 = X.2FW.A1D
            if (r4 != r1) goto L_0x013b
            X.1Xj r3 = r0.A0S()
            if (r3 == 0) goto L_0x013b
            goto L_0x0055
        L_0x013b:
            X.2FW r1 = X.2FW.A0W
            if (r4 != r1) goto L_0x0150
            X.77X r3 = r0.A0S
            if (r3 == 0) goto L_0x0150
            X.3OA r1 = r3.A02
            if (r1 == 0) goto L_0x014d
            X.1Xj r3 = r1.A0K
        L_0x0149:
            if (r3 == 0) goto L_0x0150
            goto L_0x0055
        L_0x014d:
            X.1Xj r3 = r3.A01
            goto L_0x0149
        L_0x0150:
            X.2FW r1 = X.2FW.A0t
            if (r4 != r1) goto L_0x0160
            X.9Iu r1 = r0.A06
            if (r1 == 0) goto L_0x0160
            java.lang.Object r3 = r1.A00
            X.1Xj r3 = (X.1Xj) r3
            if (r3 == 0) goto L_0x0160
            goto L_0x0055
        L_0x0160:
            X.2FW r1 = X.2FW.A1q
            if (r4 != r1) goto L_0x016a
            X.1Xj r3 = r0.A0s
            if (r3 == 0) goto L_0x016a
            goto L_0x0055
        L_0x016a:
            X.2FW r1 = X.2FW.A1v
            if (r4 == r1) goto L_0x02dc
            X.2FW r1 = X.2FW.A1p
            if (r4 == r1) goto L_0x02dc
            X.2FW r1 = X.2FW.A1r
            if (r4 == r1) goto L_0x02dc
            X.2FW r1 = X.2FW.A0y
            if (r4 != r1) goto L_0x0018
            java.lang.Integer r4 = r2.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r4 != r1) goto L_0x0294
            com.google.common.collect.ImmutableList r1 = r0.A0H()
            r7 = 0
            if (r1 == 0) goto L_0x0294
            java.lang.Object r1 = X.00k.A0O(r1, r7)
            X.3tC r1 = (X.C254873tC) r1
            if (r1 == 0) goto L_0x0294
            int r3 = r1.A02
            r1 = 9
            if (r3 != r1) goto L_0x0294
            com.google.common.collect.ImmutableList r3 = r0.A0H()
            if (r3 == 0) goto L_0x0018
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r3.iterator()
        L_0x01a3:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0106
            java.lang.Object r3 = r13.next()
            X.3tC r3 = (X.C254873tC) r3
            X.0qQ.A0A(r3)
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r3.A0X
            r11 = 0
            if (r9 == 0) goto L_0x01a3
            X.1Xx r6 = new X.1Xx
            r6.<init>()
            long r4 = r3.A0K
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r6.A5j = r4
            com.instagram.model.mediasize.ExtendedImageUrl r4 = new com.instagram.model.mediasize.ExtendedImageUrl
            r4.<init>(r9)
            java.util.List r20 = X.AnonymousClass7TE.A1I(r4)
            com.instagram.model.mediasize.ImageInfoImpl r4 = new com.instagram.model.mediasize.ImageInfoImpl
            r16 = r4
            r17 = r11
            r18 = r11
            r19 = r11
            r21 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            r6.EZf(r4)
            com.instagram.model.mediasize.GifUrlImpl r12 = r3.A0Z
            if (r12 == 0) goto L_0x01fe
            java.lang.Float r4 = r12.A02
            java.lang.Integer r18 = X.C66581MXm.A0p(r4)
            java.lang.String r5 = r12.A09
            java.lang.Float r4 = r12.A03
            java.lang.Integer r20 = X.C66581MXm.A0p(r4)
            com.instagram.model.mediasize.VideoVersion r16 = new com.instagram.model.mediasize.VideoVersion
            r22 = r11
            r23 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r16)
        L_0x01fe:
            r6.EqT(r11)
            int r4 = r9.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A4n = r4
            int r4 = r9.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A4o = r4
            com.instagram.model.mediasize.GifUrlImpl r4 = r3.A0Z
            if (r4 == 0) goto L_0x0291
            X.1iA r4 = X.1iA.A0a
        L_0x021b:
            int r4 = r4.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A4m = r4
            java.lang.String r20 = r0.A0g()
            java.lang.String r12 = r0.A1u
            X.0qQ.A07(r12)
            java.lang.String r11 = r9.A0A
            com.instagram.model.mediasize.ExtendedImageUrl r5 = new com.instagram.model.mediasize.ExtendedImageUrl
            r5.<init>(r9)
            java.lang.String r23 = r0.A0f()
            long r29 = r0.C7c()
            java.util.concurrent.atomic.AtomicBoolean r4 = X.1Xj.A0i
            X.1Xj r18 = X.1Xv.A02(r6)
            boolean r4 = r0.A1S()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r4)
            r24 = 0
            long r3 = r3.A0K
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Integer r3 = r0.A0d(r3)
            X.0qQ.A07(r3)
            int r28 = r3.intValue()
            boolean r3 = r0.A1c()
            r33 = r3 ^ 1
            r31 = 1
            X.OIP r3 = new X.OIP
            r21 = r12
            r22 = r11
            r25 = r24
            r26 = r24
            r27 = r24
            r32 = r7
            r34 = r7
            r35 = r7
            r36 = r7
            r17 = r5
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36)
            X.Oa5 r4 = new X.Oa5
            r4.<init>((X.OIP) r3)
            X.2FW r3 = r0.A10
            X.0qQ.A07(r3)
            A09(r4, r3)
            r1.add(r4)
            goto L_0x01a3
        L_0x0291:
            X.1iA r4 = X.1iA.A0Q
            goto L_0x021b
        L_0x0294:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r4 != r1) goto L_0x0018
            java.lang.String r1 = r0.A0n()
            X.Nl3 r4 = X.C69421Nl3.A00(r1)
            java.lang.String r1 = r0.A0l()
            X.Nl2 r3 = X.C69420Nl2.A00(r1)
            X.Nl3 r1 = X.C69421Nl3.CLIP
            if (r4 == r1) goto L_0x02b0
            X.Nl3 r1 = X.C69421Nl3.FEED
            if (r4 != r1) goto L_0x0018
        L_0x02b0:
            X.Nl2 r1 = X.C69420Nl2.SHARE
            if (r3 != r1) goto L_0x0018
            X.3tC r4 = X.C3266377o.A01(r0)
            if (r4 == 0) goto L_0x0018
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r4.A0X
            r5 = r37
            if (r1 == 0) goto L_0x0335
            X.2Dm r3 = X.2L2.A00(r8)
            X.3t0 r1 = X.C300965yF.A01(r5)
            com.instagram.model.direct.DirectThreadKey r1 = X.C327647Bq.A00(r1)
            X.3U9 r1 = r3.B33(r1)
            if (r1 == 0) goto L_0x0333
            X.3Tu r1 = r1.AiM()
        L_0x02d6:
            boolean r1 = X.C3263776n.A01(r8, r1, r0, r4)
            if (r1 != 0) goto L_0x0335
        L_0x02dc:
            com.google.common.collect.ImmutableList r1 = r0.A0H()
            if (r1 == 0) goto L_0x0344
            r7 = 0
            java.lang.Object r1 = r1.get(r7)
            X.3tC r1 = (X.C254873tC) r1
            java.lang.String r20 = r0.A0g()
            java.lang.String r6 = r0.A1u
            X.0qQ.A07(r6)
            java.lang.String r5 = r1.A0u
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r1.A0X
            java.lang.String r23 = r0.A0f()
            long r29 = r0.C7c()
            X.1Xj r3 = r0.A0s
            boolean r1 = r0.A1S()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r1)
            r24 = 0
            boolean r1 = r0.A1c()
            r33 = r1 ^ 1
            X.OIP r1 = new X.OIP
            r21 = r6
            r22 = r5
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r7
            r31 = r7
            r32 = r7
            r34 = r7
            r35 = r7
            r36 = r7
            r17 = r4
            r18 = r3
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36)
            goto L_0x00f5
        L_0x0333:
            r1 = 0
            goto L_0x02d6
        L_0x0335:
            java.lang.String r0 = r0.A0f()
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            A06(r2, r5, r0)
            goto L_0x0018
        L_0x0344:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0349:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72204OyU.A03(X.OyU, X.3t3, java.util.List):java.util.LinkedList");
    }

    public static final void A06(C72204OyU oyU, C254793t3 r6, Collection collection) {
        C61066Jw4 jw4;
        AnonymousClass1aS r5 = (AnonymousClass1aS) oyU.A0C.get(r6);
        if (r5 != null && (jw4 = (C61066Jw4) r5.A0X()) != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : (List) jw4.A00) {
                C71039Oa5 oa5 = (C71039Oa5) next;
                if (!00k.A0u(collection, oa5.A05()) && !00k.A0u(collection, A00(oa5).A01)) {
                    A1C.add(next);
                }
            }
            r5.accept(new C61066Jw4(jw4.A02, jw4.A01, (List) A1C, 7));
        }
    }

    public static final void A07(C72204OyU oyU, C254793t3 r7, List list) {
        C61066Jw4 jw4;
        AnonymousClass1aS r3 = (AnonymousClass1aS) oyU.A0C.get(r7);
        if (r3 != null && (jw4 = (C61066Jw4) r3.A0X()) != null) {
            jw4.A00 = A04(oyU, (List) jw4.A00, list);
            if (!182.A06(0Tu.A05, oyU.A04, 36326936468797527L)) {
                boolean z = true;
                if (!jw4.A02) {
                    if (list.size() >= 6 && (!(list instanceof Collection) || !list.isEmpty())) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C71039Oa5) it.next()).A08()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                jw4.A02 = z;
                if (z || ((List) jw4.A00).isEmpty()) {
                    oyU.A0A.remove(r7);
                } else {
                    oyU.A0A.put(r7, String.valueOf(((C71039Oa5) 00k.A0K((List) jw4.A00)).A01()));
                }
            }
            oyU.A0B.put(r7, jw4);
            r3.accept(jw4);
        }
    }

    public static final void A08(C72204OyU oyU, C254793t3 r3, List list, boolean z, boolean z2) {
        oyU.A0D.remove(r3);
        Object A0X = oyU.A01(r3).A0X();
        if (A0X != null) {
            C61066Jw4 jw4 = (C61066Jw4) A0X;
            if (z) {
                if (AnonymousClass7TE.A1b(list)) {
                    jw4.A00 = A04(oyU, (List) jw4.A00, list);
                }
                jw4.A01 = false;
                jw4.A02 = z2;
            } else {
                jw4.A01 = true;
            }
            oyU.A0B.put(r3, jw4);
            1aT r0 = (1aT) oyU.A0C.get(r3);
            if (r0 != null) {
                r0.accept(jw4);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onSessionWillEnd() {
        this.A03.A01();
        this.A0C.clear();
        this.A0B.clear();
        1Ng r2 = this.A0E;
        r2.A02(this.A0H, 2Kd.class);
        r2.A02(this.A0G, AnonymousClass7MN.class);
        r2.A02(this.A0F, 2Kb.class);
    }

    public C72204OyU(1Ng r8, C269794fh r9, UserSession userSession, C66594MYg mYg, 2Dm r12, OEE oee, C70476O8b o8b, Integer num, EnumSet enumSet) {
        this.A08 = num;
        this.A09 = enumSet;
        this.A04 = userSession;
        this.A06 = r12;
        this.A07 = oee;
        this.A02 = r9;
        this.A0E = r8;
        this.A0I = o8b;
        this.A05 = mYg;
        1a8 A0P = C66581MXm.A0P();
        this.A03 = A0P;
        C71922Ot6 ot6 = new C71922Ot6(this);
        this.A0H = ot6;
        C71921Ot5 ot5 = new C71921Ot5(this);
        this.A0G = ot5;
        Md4 md4 = new Md4(this);
        this.A0F = md4;
        2Dr r0 = this.A06;
        A0P.A02(r0.A09.A0P((C269794fh) r0.A0L.getValue()).A0N(new C66798Mck(C66817Md3.A00)), new PSC(this));
        A0P.A02(MYb.A00(this.A05.A01).A0N(new C66798Mck(C74099Pp2.A00)), new PSD(this));
        r8.A01(ot6, 2Kd.class);
        r8.A01(ot5, AnonymousClass7MN.class);
        r8.A01(md4, 2Kb.class);
    }

    public static final N49 A00(C71039Oa5 oa5) {
        String str;
        String A042 = oa5.A04();
        1Xj A022 = oa5.A02();
        if (A022 != null) {
            str = A022.getId();
        } else {
            str = null;
        }
        return new N49(A042, str, 43);
    }

    public static final LinkedList A04(C72204OyU oyU, List list, List list2) {
        Object A002;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C71039Oa5 oa5 = (C71039Oa5) it.next();
            A1H.put(A00(oa5), oa5);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C71039Oa5 oa52 = (C71039Oa5) it2.next();
            if (oyU.A08 == AnonymousClass05K.A01 && !oa52.A08()) {
                Iterator A0s = AnonymousClass7TF.A0s(A1H);
                while (true) {
                    if (!A0s.hasNext()) {
                        break;
                    }
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    A002 = A1J.getKey();
                    if (00p.A0j(((C71039Oa5) A1J.getValue()).A04(), oa52.A04(), false)) {
                        break;
                    }
                }
                A1H.put(A002, oa52);
            }
            A002 = A00(oa52);
            if (A1H.containsKey(A002)) {
                C71039Oa5 oa53 = (C71039Oa5) A1H.get(A002);
                if (oa53 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (oa53.A02() != null && oa52.A00() == oa53.A00()) {
                }
            }
            A1H.put(A002, oa52);
        }
        TreeSet treeSet = new TreeSet(new C73428PcS((0sL) new JGK(oyU, 24), 7));
        treeSet.addAll(A1H.values());
        return new LinkedList(treeSet);
    }

    public static final void A05(C72204OyU oyU, C254793t3 r11, Integer num, String str) {
        long currentTimeMillis;
        int i;
        Long A10;
        MsysThreadId A042 = C300965yF.A04(r11);
        if (A042 != null) {
            1a8 r2 = oyU.A03;
            C70476O8b o8b = oyU.A0I;
            Integer num2 = oyU.A08;
            0qQ.A0B(num2, 1);
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                currentTimeMillis = System.currentTimeMillis();
            } else {
                currentTimeMillis = AnonymousClass7TE.A0P(A10.longValue());
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 20;
            }
            MYb mYb = o8b.A00.A01;
            int i2 = 2;
            if (num2.intValue() == 0) {
                i2 = 1;
            }
            PU9.A00(mYb.A09.A0M(new C72034Ov9(A042, i, i2, currentTimeMillis)).A0L(C72114OwZ.A00).A0L(C72115Owa.A00).A0L(new C72014Ouo(i)), r2, r11, oyU, 19);
        }
    }

    public static final void A09(C71039Oa5 oa5, 2FW r3) {
        if (oa5.A02() == null && oa5.A06() == null) {
            0f9 AEf = 0wj.A01.AEf("Trying to create item with no media id or target URL", 20134884);
            AEf.ABQ("message_type", r3.toString());
            AEf.report();
        }
    }
}
