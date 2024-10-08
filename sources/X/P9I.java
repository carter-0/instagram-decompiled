package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.LruCache;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ListIterator;

public final class P9I implements AnonymousClass7Wt {
    public static final long A04 = AnonymousClass30K.A03(AnonymousClass30J.SECONDS, 10);
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass7SM A03;

    public final void CpK(String str, String str2) {
        MsysThreadId msysThreadId;
        String valueOf;
        DirectShareTarget directShareTarget;
        Object obj;
        String str3;
        UserSession userSession = this.A01;
        OJc oJc = new OJc(userSession);
        AnonymousClass0eK r2 = this.A02;
        String C6C = C66582MXn.A0d(r2).C6C();
        C270634h3 r3 = new C270634h3(ClipsViewerSource.BLEND, userSession);
        String str4 = str;
        r3.A0g = str4;
        r3.A1I = null;
        r3.A1E = C6C;
        AnonymousClass4DH r11 = this.A00;
        r3.A0n = r11.requireContext().getString(2131953832);
        C333517Zg A0V = C66580MXl.A0V(r2);
        AnonymousClass7S7 C6l = A0V.C6l();
        C254743sy B8S = C6l.B8S();
        0qQ.A07(B8S);
        DirectThreadKey directThreadKey = null;
        if (C66647MaG.A04(B8S) != null) {
            directThreadKey = C66647MaG.A03(B8S);
            valueOf = directThreadKey.A00;
            msysThreadId = null;
        } else if (B8S instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) B8S;
            valueOf = String.valueOf(msysThreadId.A02);
        } else {
            throw C66582MXn.A0k(B8S, "Expected DirectThreadKey or MsysThreadKey, instead found: ", AnonymousClass7TE.A1A());
        }
        Context context = r11.getContext();
        if (context != null) {
            directShareTarget = C6l.C6Z(context);
        } else {
            directShareTarget = null;
        }
        ClipsReplyBarData clipsReplyBarData = null;
        if (directShareTarget != null) {
            String BsP = A0V.BSN().BsP((MessageIdentifier) null);
            ListIterator A18 = C51968G9o.A18(C6l.BRZ());
            while (true) {
                if (!A18.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = A18.previous();
                if (0qQ.A0K(DbS.A0q(obj), BsP)) {
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                str3 = AnonymousClass50n.A08(user);
            } else {
                str3 = null;
            }
            boolean A1X = C66580MXl.A1X(userSession, BsP);
            MsysThreadId msysThreadId2 = msysThreadId;
            DirectThreadKey directThreadKey2 = directThreadKey;
            DirectShareTarget directShareTarget2 = directShareTarget;
            clipsReplyBarData = new ClipsReplyBarData(directShareTarget2, directThreadKey2, msysThreadId2, (String) null, (String) null, (String) null, "clips_blend_reply_direct", C6l.C6f(), valueOf, str3, str4, directShareTarget.A01, C6l.AdN(), C6l.CVE(), C6l.CUO(), A1X, false, AnonymousClass7TF.A1V(C6l.BN3()), false, false, false, true, true);
        }
        r3.A0I = clipsReplyBarData;
        r3.A1c = false;
        oJc.A00(r11.requireActivity(), r3.A00(), (OMU) null);
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.07Z, X.4DH] */
    public final void CpS(RectF rectF, ImageUrl imageUrl, OMU omu, MessageIdentifier messageIdentifier, AnonymousClass3OA r39, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, boolean z) {
        MsysThreadId msysThreadId;
        String valueOf;
        DirectThreadKey directThreadKey;
        ClipsViewerSource clipsViewerSource;
        String str6 = str;
        0qQ.A0B(rectF, 6);
        UserSession userSession = this.A01;
        0Tu r3 = 0Tu.A05;
        182.A06(r3, userSession, 36329564988915899L);
        182.A06(r3, userSession, 36329564988981436L);
        if (str == null) {
            if (str2 != null) {
                str6 = C70282O0m.A00(str2);
            } else {
                throw AnonymousClass7TE.A0w("Must pass either mediaId or mediaCode");
            }
        }
        this.A03.CLU();
        C333517Zg r10 = (C333517Zg) this.A02.get();
        C254743sy B8S = r10.C6l().B8S();
        0qQ.A07(B8S);
        if (C66647MaG.A04(B8S) != null) {
            directThreadKey = C66647MaG.A03(B8S);
            valueOf = directThreadKey.A00;
            msysThreadId = null;
        } else if (B8S instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) B8S;
            valueOf = String.valueOf(msysThreadId.A02);
            directThreadKey = null;
        } else {
            throw C66582MXn.A0k(B8S, "Expected DirectThreadKey or MsysThreadKey, instead found: ", AnonymousClass7TE.A1A());
        }
        boolean z2 = z;
        OMU omu2 = omu;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        AnonymousClass3OA r4 = r39;
        Boolean bool3 = bool2;
        String str7 = str3;
        String str8 = str4;
        if (!0qQ.A0K(bool, true) || valueOf == null || !GAW.A00(userSession).booleanValue()) {
            if (0qQ.A0K(bool3, true)) {
                clipsViewerSource = ClipsViewerSource.DIRECT_AD_FEED_OF_ADS;
            } else {
                clipsViewerSource = ClipsViewerSource.DIRECT;
            }
            C270634h3 r1 = new C270634h3(clipsViewerSource, userSession);
            r1.A02(userSession, r4, false);
            r1.A1C = str6;
            if (str4 != null) {
                r1.A1G = str8;
            }
            0qQ.A0A(r10);
            A00(r1, this, omu2, r10, directThreadKey, messageIdentifier2, msysThreadId, str6, str7, valueOf, (String) null, z2, false);
            return;
        }
        C73585PgK pgK = new C73585PgK(this, omu2, r10, directThreadKey, messageIdentifier2, msysThreadId, r4, bool3, str6, str8, str7, valueOf, z2);
        if (omu != null) {
            omu2.A01();
        }
        C56508Hze hze = (C56508Hze) userSession.A01(C56508Hze.class, new C58710IwJ(userSession, 19));
        LruCache lruCache = hze.A00;
        Object obj = lruCache.get(valueOf);
        if (obj == null) {
            obj = new C62031KWh(hze.A01, valueOf);
            lruCache.put(valueOf, obj);
        }
        AnonymousClass7TE.A1Z(new C73560PfS(obj, omu2, pgK, this, messageIdentifier2, r10, directThreadKey, msysThreadId, str6, valueOf, str5, str7, (AnonymousClass4D7) null, 1, z2), AnonymousClass07a.A00(this.A00));
    }

    public P9I(AnonymousClass4DH r1, UserSession userSession, AnonymousClass7SM r3, AnonymousClass0eK r4) {
        AnonymousClass7TG.A1P(r1, r4);
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r4;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r2.A0P() == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (X.C331077Pk.A02.A03(r15, r8.AiM()) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03f7 A[EDGE_INSN: B:246:0x03f7->B:200:0x03f7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C270634h3 r46, X.P9I r47, X.OMU r48, X.C333517Zg r49, com.instagram.model.direct.DirectThreadKey r50, com.instagram.model.direct.messageid.MessageIdentifier r51, com.instagram.model.direct.threadkey.impl.MsysThreadId r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57, boolean r58) {
        /*
            r0 = r46
            r1 = r54
            if (r54 == 0) goto L_0x000c
            r0.A1H = r1
            X.5OB r1 = X.AnonymousClass5OB.DIRECT_RESHARE_COMMENT
            r0.A09 = r1
        L_0x000c:
            r8 = r47
            com.instagram.common.session.UserSession r15 = r8.A01
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323938581622396(0x810c6e00002e7c, double:3.0347432515540894E-306)
            boolean r2 = X.182.A06(r3, r15, r1)
            r6 = 1
            r1 = 0
            if (r2 == 0) goto L_0x0023
            r0.A1g = r6
            r0.A1c = r1
        L_0x0023:
            X.7ZY r5 = r49.BSN()
            boolean r4 = r5 instanceof X.AnonymousClass7ZX
            r22 = r51
            if (r4 == 0) goto L_0x0450
            r3 = r5
            X.7ZX r3 = (X.AnonymousClass7ZX) r3
            if (r3 == 0) goto L_0x0450
            r2 = r22
            java.lang.String r2 = r2.A01
            X.7LQ r3 = r3.BSO(r2)
            if (r3 == 0) goto L_0x0048
            X.3su r2 = r3.A0e
            if (r2 == 0) goto L_0x0048
            X.3tI r2 = r2.A0P()
            r42 = 1
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            r42 = 0
        L_0x004a:
            r21 = r50
            if (r50 == 0) goto L_0x044c
            X.2Dm r2 = X.1bJ.A00(r15)
            java.util.HashSet r7 = r2.Bk6()
            r2 = r21
            boolean r44 = r7.contains(r2)
        L_0x005c:
            X.4DH r2 = r8.A00
            r47 = r2
            android.content.Context r7 = r47.getContext()
            if (r7 == 0) goto L_0x0445
            X.7S7 r2 = r49.C6l()
            com.instagram.model.direct.DirectShareTarget r20 = r2.C6Z(r7)
            if (r20 == 0) goto L_0x0447
            X.2Dm r7 = X.1bJ.A00(r15)
            r2 = r20
            X.3U9 r8 = r7.BYf(r2)
            boolean r2 = r8.Axj()
            if (r2 != 0) goto L_0x008e
            X.7Pi r7 = X.C331077Pk.A02
            X.3Tu r2 = r8.AiM()
            boolean r2 = r7.A03(r15, r2)
            r45 = 0
            if (r2 == 0) goto L_0x0090
        L_0x008e:
            r45 = 1
        L_0x0090:
            X.3t2 r2 = X.DbS.A0c(r20)
            boolean r9 = X.C69965Nv5.A00(r15, r2)
        L_0x0098:
            r2 = r22
            java.lang.String r2 = r2.A01
            java.lang.String r19 = r22.A00()
            X.7S7 r18 = r49.C6l()
            boolean r37 = r18.CdK()
            boolean r38 = r18.CYS()
            boolean r39 = r18.CV8()
            r25 = r52
            boolean r40 = X.AnonymousClass7TF.A1V(r25)
            X.7SD r7 = r18.C6Q()
            boolean r8 = r7.A16
            boolean r46 = r18.COb()
            com.instagram.clips.intf.ClipsViewerDirectData r7 = new com.instagram.clips.intf.ClipsViewerDirectData
            r31 = r55
            r36 = r57
            r32 = r7
            r33 = r2
            r34 = r19
            r35 = r31
            r41 = r8
            r43 = r1
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r0.A0G = r7
            java.lang.String r8 = "null cannot be cast to non-null type com.instagram.direct.messagethread.DirectMessageStoreImpl"
            if (r4 == 0) goto L_0x00e7
            X.0qQ.A0C(r5, r8)
            r7 = r5
            X.7ZX r7 = (X.AnonymousClass7ZX) r7
            X.7YU r7 = r7.A0l
            if (r7 == 0) goto L_0x00e7
            r7.A02 = r1
        L_0x00e7:
            java.lang.String r17 = "Required value was null."
            r26 = r53
            if (r4 == 0) goto L_0x0409
            boolean r7 = X.C328447Ev.A01(r15)
            if (r7 != 0) goto L_0x010b
            boolean r7 = X.C328447Ev.A00(r15)
            if (r7 != 0) goto L_0x010b
            if (r3 == 0) goto L_0x0409
            com.instagram.user.model.User r7 = r3.A0K
            if (r7 == 0) goto L_0x0409
            boolean r7 = r7.A1X()
            if (r7 != r6) goto L_0x0409
            boolean r7 = X.AnonymousClass9B8.A09(r15)
            if (r7 == 0) goto L_0x0409
        L_0x010b:
            r0.A1c = r1
            X.0qQ.A0C(r5, r8)
            r7 = r5
            X.7ZX r7 = (X.AnonymousClass7ZX) r7
            X.7YU r13 = r7.A0l
            boolean r7 = X.C328447Ev.A00(r15)
            if (r7 == 0) goto L_0x0124
            if (r13 == 0) goto L_0x0124
            boolean r7 = X.AnonymousClass9B8.A09(r15)
            r13.A08(r2, r7)
        L_0x0124:
            X.GMD r11 = X.GNS.A00(r15)
            X.0qQ.A07(r11)
            if (r13 == 0) goto L_0x0402
            java.util.List r8 = r13.A06
            boolean r7 = r8.contains(r2)
            if (r7 == 0) goto L_0x0270
            int r7 = r8.indexOf(r2)
            if (r7 < 0) goto L_0x03f7
            java.lang.String r7 = X.AnonymousClass7TE.A19(r8, r7)
            int r9 = r13.A03(r7)
        L_0x0143:
            r32 = 0
        L_0x0145:
            com.google.common.collect.ImmutableList r8 = r13.A04()
        L_0x0149:
            r11.A00 = r9
            if (r13 == 0) goto L_0x014f
            r13.A01 = r9
        L_0x014f:
            if (r9 < 0) goto L_0x022d
            int r7 = r8.size()
            if (r9 >= r7) goto L_0x022d
            java.lang.Object r7 = r8.get(r9)
            X.4bN r7 = (X.C267324bN) r7
            X.1Xj r7 = r7.A02
            if (r7 == 0) goto L_0x0229
            java.lang.String r10 = r7.getId()
        L_0x0165:
            r7 = r26
            boolean r7 = X.0qQ.A0K(r10, r7)
            if (r7 == 0) goto L_0x022d
            java.lang.Object r7 = r8.get(r9)
            X.4bN r7 = (X.C267324bN) r7
            X.1Xj r7 = r7.A02
            if (r7 == 0) goto L_0x022d
            com.instagram.model.mediasize.ImageInfo r7 = r7.A1p()
            if (r7 == 0) goto L_0x022d
            if (r13 == 0) goto L_0x0225
            boolean r3 = X.AnonymousClass9B8.A09(r15)
            com.google.common.collect.ImmutableList r3 = r13.A05(r3)
            int r9 = r13.A01
        L_0x0189:
            r0.A04 = r9
            r11.A05(r3)
        L_0x018e:
            r3 = r22
            java.lang.String r7 = r5.BsP(r3)
            X.OJc r3 = new X.OJc
            r3.<init>(r15)
            if (r20 == 0) goto L_0x0214
            if (r19 == 0) goto L_0x0214
            r44 = r58
            if (r4 == 0) goto L_0x01a7
            boolean r4 = X.C328447Ev.A04(r15)
            if (r4 != 0) goto L_0x01af
        L_0x01a7:
            if (r58 != 0) goto L_0x01af
            boolean r4 = X.C328447Ev.A03(r15)
            if (r4 == 0) goto L_0x0214
        L_0x01af:
            java.util.List r4 = r18.BRZ()
            java.util.ListIterator r6 = X.C51968G9o.A18(r4)
        L_0x01b7:
            boolean r4 = r6.hasPrevious()
            if (r4 == 0) goto L_0x0222
            java.lang.Object r5 = r6.previous()
            java.lang.String r4 = X.DbS.A0q(r5)
            boolean r4 = X.0qQ.A0K(r4, r7)
            if (r4 == 0) goto L_0x01b7
        L_0x01cb:
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x01d3
            java.lang.String r32 = X.AnonymousClass50n.A08(r5)
        L_0x01d3:
            boolean r38 = X.C66580MXl.A1X(r15, r7)
            java.lang.String r30 = r18.C6f()
            boolean r36 = r18.CVE()
            boolean r37 = r18.CUO()
            X.3t0 r4 = r18.BN3()
            boolean r40 = X.AnonymousClass7TF.A1V(r4)
            r4 = r20
            int r5 = r4.A01
            int r35 = r18.AdN()
            boolean r43 = X.C328447Ev.A03(r15)
            java.lang.String r29 = "clips_reply_direct"
            com.instagram.clips.model.ClipsReplyBarData r4 = new com.instagram.clips.model.ClipsReplyBarData
            r33 = r56
            r22 = r4
            r23 = r20
            r24 = r21
            r27 = r2
            r28 = r19
            r34 = r5
            r39 = r1
            r41 = r1
            r45 = r44
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r0.A0I = r4
        L_0x0214:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r0.A00()
            androidx.fragment.app.FragmentActivity r0 = r47.requireActivity()
            r2 = r48
            r3.A00(r0, r1, r2)
            return
        L_0x0222:
            r5 = r32
            goto L_0x01cb
        L_0x0225:
            X.0sn r3 = X.0sn.A00
            goto L_0x0189
        L_0x0229:
            r10 = r32
            goto L_0x0165
        L_0x022d:
            if (r42 != 0) goto L_0x018e
            boolean r7 = X.AnonymousClass9B8.A09(r15)
            if (r7 != 0) goto L_0x025c
            if (r3 == 0) goto L_0x018e
            com.instagram.user.model.User r10 = r3.A0K
            long r7 = r3.C7Z()
            X.9IL r9 = new X.9IL
            r9.<init>(r7, r10, r6)
            if (r19 == 0) goto L_0x0453
            java.util.ArrayList r7 = r3.A04()
            X.9JD r6 = new X.9JD
            r3 = r19
            r6.<init>((X.AnonymousClass9IL) r9, (java.lang.String) r2, (java.lang.String) r3, (java.util.List) r7)
            r0.A04 = r1
            r11.A00 = r1
            java.util.List r3 = X.AnonymousClass7TE.A1I(r6)
            r11.A05(r3)
            goto L_0x018e
        L_0x025c:
            boolean r3 = X.AnonymousClass9B8.A09(r15)
            if (r3 == 0) goto L_0x018e
            if (r13 == 0) goto L_0x026d
            com.google.common.collect.ImmutableList r3 = r13.A05(r6)
        L_0x0268:
            r11.A05(r3)
            goto L_0x018e
        L_0x026d:
            X.0sn r3 = X.0sn.A00
            goto L_0x0268
        L_0x0270:
            if (r9 != 0) goto L_0x03fa
            boolean r7 = X.AnonymousClass9B8.A09(r15)
            if (r7 == 0) goto L_0x03fa
            java.util.List r8 = X.AnonymousClass7YU.A00(r13)
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x035a
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x035a
        L_0x0286:
            r7 = 1
        L_0x0287:
            r14 = 0
            if (r7 != 0) goto L_0x0335
            java.util.Map r8 = r13.A09
            boolean r7 = r8.isEmpty()
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x02b4
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x0335
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r8)
        L_0x029e:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x0335
            java.lang.Object r8 = X.C51971G9r.A0p(r9)
            java.util.List r8 = (java.util.List) r8
            X.4bN r7 = X.C295375o3.A00()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x029e
        L_0x02b4:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.List r7 = X.AnonymousClass7YU.A00(r13)
            java.util.Iterator r16 = r7.iterator()
        L_0x02c0:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x0377
            java.lang.Object r7 = r16.next()
            X.59G r7 = (X.AnonymousClass59G) r7
            java.lang.Object r10 = r7.A00
            X.3su r10 = (X.C254703su) r10
            X.2FW r7 = r10.A10
            r8 = r7
            X.2FW r7 = X.2FW.A1s
            java.lang.String r9 = "id"
            if (r8 != r7) goto L_0x02fd
            java.lang.String r7 = r10.A1q
            java.util.List r7 = X.C253053q8.A07(r7)
            java.lang.Object r7 = X.00k.A0J(r7)
            X.3uc r7 = (X.C255723uc) r7
            if (r7 == 0) goto L_0x02c0
            java.lang.String r7 = r7.A02
            android.net.Uri r7 = X.0cp.A03(r7)
            java.lang.String r8 = r7.getQueryParameter(r9)
            if (r8 == 0) goto L_0x02c0
            java.util.concurrent.atomic.AtomicBoolean r7 = X.1Xj.A0i
            java.lang.String r7 = X.1Xv.A06(r8)
            r12.add(r7)
            goto L_0x02c0
        L_0x02fd:
            java.lang.Object r8 = r10.A1T
            boolean r7 = r8 instanceof java.util.List
            if (r7 == 0) goto L_0x02c0
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x02c0
            java.util.Iterator r10 = r8.iterator()
        L_0x030b:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x02c0
            java.lang.Object r8 = r10.next()
            boolean r7 = r8 instanceof X.C254873tC
            if (r7 == 0) goto L_0x030b
            X.3tC r8 = (X.C254873tC) r8
            if (r8 == 0) goto L_0x030b
            java.lang.String r7 = r8.A0u
            if (r7 == 0) goto L_0x030b
            android.net.Uri r7 = X.0cp.A03(r7)
            java.lang.String r8 = r7.getQueryParameter(r9)
            if (r8 == 0) goto L_0x030b
            java.util.concurrent.atomic.AtomicBoolean r7 = X.1Xj.A0i
            java.lang.String r7 = X.1Xv.A06(r8)
            r12.add(r7)
            goto L_0x030b
        L_0x0335:
            java.util.List r8 = X.AnonymousClass7YU.A00(r13)
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0344
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0344
            goto L_0x037d
        L_0x0344:
            java.util.Iterator r8 = r8.iterator()
        L_0x0348:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x037d
            java.lang.Object r7 = r8.next()
            X.59G r7 = (X.AnonymousClass59G) r7
            java.lang.Object r7 = r7.A02
            if (r7 != 0) goto L_0x0348
            goto L_0x02b4
        L_0x035a:
            java.util.Iterator r8 = r8.iterator()
        L_0x035e:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0286
            java.lang.Object r7 = r8.next()
            X.59G r7 = (X.AnonymousClass59G) r7
            java.lang.Object r7 = r7.A00
            X.3su r7 = (X.C254703su) r7
            boolean r7 = X.AnonymousClass7YU.A02(r7)
            if (r7 == 0) goto L_0x035e
            r7 = 0
            goto L_0x0287
        L_0x0377:
            java.lang.String r7 = ","
            java.lang.String r14 = X.DbT.A0z(r7, r12, r14)
        L_0x037d:
            r0.A0s = r14
            r0.A1V = r6
            r13.A02 = r6
            r7 = r26
            X.0qQ.A0B(r7, r1)
            java.util.List r7 = X.AnonymousClass7YU.A00(r13)
            java.util.Iterator r14 = r7.iterator()
            r9 = 0
        L_0x0391:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x03f7
            java.lang.Object r7 = r14.next()
            X.59G r7 = (X.AnonymousClass59G) r7
            java.lang.Object r10 = r7.A00
            X.3su r10 = (X.C254703su) r10
            java.lang.String r7 = r10.A0g()
            boolean r12 = X.0qQ.A0K(r7, r2)
            r7 = 12
            java.lang.String r8 = X.AnonymousClass000.A00(r7)
            boolean r7 = X.AnonymousClass7YU.A02(r10)
            if (r12 == 0) goto L_0x03e7
            if (r7 == 0) goto L_0x0143
            java.lang.Object r7 = r10.A1T
            X.0qQ.A0C(r7, r8)
            java.util.Iterator r12 = X.C51966G9m.A1H(r7)
            r10 = 0
        L_0x03c1:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x0143
            java.lang.Object r8 = r12.next()
            boolean r7 = r8 instanceof X.C254873tC
            if (r7 == 0) goto L_0x03e4
            X.3tC r8 = (X.C254873tC) r8
            if (r8 == 0) goto L_0x03e4
            java.lang.String r8 = r8.A0u
            if (r8 == 0) goto L_0x03e4
            r7 = r26
            boolean r7 = X.00l.A0d(r8, r7, r1)
            if (r7 != r6) goto L_0x03e4
            if (r10 <= 0) goto L_0x0143
            int r9 = r9 + r10
            goto L_0x0143
        L_0x03e4:
            int r10 = r10 + 1
            goto L_0x03c1
        L_0x03e7:
            if (r7 == 0) goto L_0x03f4
            java.lang.Object r7 = r10.A1T
            X.0qQ.A0C(r7, r8)
            int r7 = X.DbS.A05(r7)
            int r9 = r9 + r7
            goto L_0x0391
        L_0x03f4:
            int r9 = r9 + 1
            goto L_0x0391
        L_0x03f7:
            r9 = -1
            goto L_0x0143
        L_0x03fa:
            r32 = 0
            int r9 = r13.A03(r2)
            goto L_0x0145
        L_0x0402:
            r32 = 0
            r9 = 0
            X.0sn r8 = X.0sn.A00
            goto L_0x0149
        L_0x0409:
            r32 = 0
            if (r4 == 0) goto L_0x018e
            boolean r7 = X.C328447Ev.A03(r15)
            if (r7 == 0) goto L_0x018e
            r0.A1c = r1
            if (r42 != 0) goto L_0x018e
            X.GMD r9 = X.GNS.A00(r15)
            X.0qQ.A07(r9)
            if (r3 == 0) goto L_0x018e
            com.instagram.user.model.User r11 = r3.A0K
            long r7 = r3.C7Z()
            X.9IL r10 = new X.9IL
            r10.<init>(r7, r11, r6)
            if (r19 == 0) goto L_0x0458
            java.util.ArrayList r7 = r3.A04()
            X.9JD r6 = new X.9JD
            r3 = r19
            r6.<init>((X.AnonymousClass9IL) r10, (java.lang.String) r2, (java.lang.String) r3, (java.util.List) r7)
            r0.A04 = r1
            r9.A00 = r1
            java.util.List r3 = X.AnonymousClass7TE.A1I(r6)
            r9.A04(r3)
            goto L_0x018e
        L_0x0445:
            r20 = 0
        L_0x0447:
            r45 = 0
            r9 = 0
            goto L_0x0098
        L_0x044c:
            r44 = 0
            goto L_0x005c
        L_0x0450:
            r3 = 0
            goto L_0x0048
        L_0x0453:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0458:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9I.A00(X.4h3, X.P9I, X.OMU, X.7Zg, com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.messageid.MessageIdentifier, com.instagram.model.direct.threadkey.impl.MsysThreadId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
