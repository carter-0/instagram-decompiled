package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4il  reason: invalid class name and case insensitive filesystem */
public abstract class C271384il {
    public static C271434iq A00(UserSession userSession, 1Xj r41) {
        float f;
        boolean z;
        AnonymousClass3WR A03;
        1Xj r0 = r41;
        if (r41 == null) {
            return null;
        }
        UserSession userSession2 = userSession;
        String A0F = C231122qu.A0F(userSession2, r0);
        Long AcN = r0.A0C.AcN();
        if (r0.getId() != null) {
            f = r0.A0l();
        } else {
            f = 1.0f;
        }
        Integer A2H = r0.A2H();
        CreativeConfigIntf AsO = r0.A0C.AsO();
        String A00 = C2606846q.A00(r0.A2L());
        long A17 = r0.A17();
        boolean A4Y = r0.A4Y();
        boolean A4p = r0.A4p();
        boolean A50 = r0.A50();
        Boolean BCI = r0.A0C.BCI();
        if (BCI != null) {
            z = BCI.booleanValue();
        } else {
            z = false;
        }
        String id = r0.getId();
        if (r0.getId() != null) {
            A03 = r0.CEL();
        } else {
            A03 = A03(r0.A0M);
        }
        ImageInfo A1p = r0.A1p();
        String BGe = r0.A0C.BGe();
        boolean A5D = r0.A5D();
        boolean A5N = r0.A5N();
        boolean A5p = r0.A5p();
        boolean CeS = r0.CeS();
        String str = r0.A0M;
        1iA BR7 = r0.BR7();
        Long CCL = r0.A0C.CCL();
        MusicOverlayStickerModel A032 = C271404in.A03((MusicProduct) null, r0, (Integer) null);
        String organicTrackingToken = r0.A0C.getOrganicTrackingToken();
        Long Bd8 = r0.A0C.Bd8();
        ArrayList A3F = r0.A3F();
        SimpleImageUrl A1R = r0.A1R();
        C271414io r6 = new C271414io(userSession2, r0);
        boolean CUz = r0.CUz();
        return new C271434iq(r6, A1R, new C271424ip(r0.getId(), r0.A2v(), CUz, r0.CcK(), r0.CYg()), AsO, A1p, BR7, A032, A03, A2H, AcN, CCL, Bd8, A0F, A00, id, BGe, str, organicTrackingToken, A3F, f, A17, A4Y, A4p, A50, z, A5D, A5N, A5p, CeS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r2.A1W() != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r0.A0O == false) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C68167N3h A01(android.content.Context r51, com.instagram.common.session.UserSession r52, X.C254703su r53, X.C271374ik r54, com.instagram.user.model.User r55) {
        /*
            r1 = r54
            X.4iq r0 = r1.A04
            r0.getClass()
            java.lang.Long r8 = r1.A08
            X.1iA r5 = r0.A07
            X.1iA r4 = X.1iA.A0Q
            r2 = 5
            java.lang.Long r27 = java.lang.Long.valueOf(r2)
            if (r5 != r4) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            java.lang.String r3 = "photo_without_playback_duration"
            java.lang.String r2 = "A photo is converted into visual message viewer item without having playback duration."
        L_0x001b:
            X.0wb.A03(r3, r2)
        L_0x001e:
            java.lang.String r4 = r0.A0H
            if (r4 != 0) goto L_0x002b
            X.1Xj r2 = r1.A05
            r2.getClass()
            java.lang.String r4 = r2.getId()
        L_0x002b:
            r2 = r53
            java.lang.String r30 = r2.A0g()
            java.lang.String r31 = r2.A0f()
            java.lang.String r32 = r2.A0h()
            java.lang.String r3 = r2.A1u
            r18 = r3
            boolean r15 = r2.A2P
            X.1Xj r14 = r1.A05
            r4.getClass()
            long r42 = r2.C7c()
            java.util.List r3 = r1.A0B
            if (r3 == 0) goto L_0x00dc
            java.util.List r39 = java.util.Collections.unmodifiableList(r3)
        L_0x0050:
            boolean r45 = r1.A00()
            r3 = r52
            boolean r3 = r2.A1e(r3)
            if (r3 != 0) goto L_0x0064
            boolean r3 = r2.A1W()
            r46 = 0
            if (r3 == 0) goto L_0x0066
        L_0x0064:
            r46 = 1
        L_0x0066:
            boolean r13 = r0.A0N
            java.lang.String r6 = r2.A0j()
            java.lang.String r3 = "once"
            boolean r48 = r3.equals(r6)
            boolean r49 = r2.A1V()
            boolean r3 = r0.A0V
            if (r3 == 0) goto L_0x0080
            boolean r3 = r0.A0O
            r50 = 1
            if (r3 != 0) goto L_0x0082
        L_0x0080:
            r50 = 0
        L_0x0082:
            java.lang.String r12 = r0.A0J
            X.4ik r3 = r2.A0e
            if (r3 == 0) goto L_0x00da
            java.lang.String r3 = r3.A0A
        L_0x008a:
            r6 = r51
            com.instagram.model.mediasize.ExtendedImageUrl r17 = r0.A00(r6)
            java.lang.Long r11 = r1.A06
            float r10 = r0.A01
            r21 = 0
            X.OGw r9 = r1.A01
            X.5Dg r8 = r1.A03
            int r7 = r1.A00
            java.lang.String r6 = r1.A09
            java.lang.Long r1 = r2.A1L
            boolean r51 = r2.A1S()
            r52 = 0
            boolean r2 = r2.A1c()
            r53 = r2 ^ 1
            X.N3h r16 = new X.N3h
            r26 = r55
            r22 = r21
            r23 = r21
            r33 = r18
            r34 = r4
            r35 = r12
            r36 = r3
            r37 = r21
            r38 = r6
            r40 = r10
            r41 = r7
            r44 = r15
            r47 = r13
            r24 = r14
            r25 = r5
            r28 = r11
            r29 = r1
            r18 = r9
            r19 = r8
            r20 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r16
        L_0x00da:
            r3 = 0
            goto L_0x008a
        L_0x00dc:
            java.util.List r39 = java.util.Collections.emptyList()
            goto L_0x0050
        L_0x00e2:
            X.1iA r2 = X.1iA.A0a
            if (r5 != r2) goto L_0x0102
            if (r8 != 0) goto L_0x0102
            X.1Xj r2 = r1.A05
            r2.getClass()
            double r6 = r2.A0k()
            long r3 = (long) r6
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r6 = 0
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            java.lang.String r3 = "video_without_playback_duration"
            java.lang.String r2 = "A video is converted into visual message viewer item without having playback duration."
            goto L_0x001b
        L_0x0102:
            r27 = r8
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271384il.A01(android.content.Context, com.instagram.common.session.UserSession, X.3su, X.4ik, com.instagram.user.model.User):X.N3h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        if (new java.io.File(r5).exists() == false) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C68167N3h A02(android.content.Context r47, com.instagram.common.session.UserSession r48, X.C254703su r49, com.instagram.user.model.User r50, java.lang.Long r51) {
        /*
            r0 = r49
            X.4ik r2 = r0.A0e
            r5 = r47
            r1 = r48
            r9 = r50
            if (r2 == 0) goto L_0x0011
            X.N3h r14 = A01(r5, r1, r0, r2, r9)
            return r14
        L_0x0011:
            X.1Xj r4 = r0.A0s
            if (r4 == 0) goto L_0x003e
            X.4iq r2 = A00(r1, r4)
            r2.getClass()
            X.4ik r3 = new X.4ik
            r3.<init>()
            r3.A04 = r2
            r3.A05 = r4
            java.lang.String r2 = "permanent"
            r3.A09 = r2
            X.1Xy r2 = r4.A0C
            java.lang.Long r2 = r2.Bd8()
            r3.A08 = r2
            X.1Xy r2 = r4.A0C
            java.lang.Long r2 = r2.CCL()
            r3.A07 = r2
            X.N3h r14 = A01(r5, r1, r0, r3, r9)
            return r14
        L_0x003e:
            X.7Qt r2 = r0.A0w
            r3 = 5
            java.lang.Long r25 = java.lang.Long.valueOf(r3)
            r27 = r51
            if (r2 != 0) goto L_0x00c6
            java.lang.String r28 = r0.A0g()
            java.lang.String r29 = r0.A0f()
            java.lang.String r30 = r0.A0h()
            java.lang.String r3 = r0.A1u
            boolean r2 = r0.A2P
            r15 = 0
            X.4ik r4 = r0.A0d
            if (r4 == 0) goto L_0x00c3
            X.1Xj r4 = r4.A05
            if (r4 == 0) goto L_0x00c3
            X.1iA r23 = r4.BR7()
        L_0x0067:
            long r40 = r0.C7c()
            X.0sn r37 = X.0sn.A00
            r39 = 0
            boolean r44 = r0.A1e(r1)
            java.lang.String r4 = r0.A0j()
            java.lang.String r1 = "once"
            boolean r46 = r1.equals(r4)
            boolean r47 = r0.A1V()
            X.4ik r1 = r0.A0e
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r1.A0A
        L_0x0087:
            r38 = 0
            boolean r49 = r0.A1S()
            boolean r0 = r0.A1c()
            r51 = r0 ^ 1
            java.lang.String r32 = ""
            X.N3h r14 = new X.N3h
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r26 = r15
            r31 = r3
            r33 = r15
            r34 = r1
            r35 = r15
            r36 = r15
            r42 = r2
            r43 = r39
            r45 = r39
            r48 = r39
            r50 = r39
            r24 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            return r14
        L_0x00c1:
            r1 = 0
            goto L_0x0087
        L_0x00c3:
            X.1iA r23 = X.1iA.A0Q
            goto L_0x0067
        L_0x00c6:
            com.instagram.pendingmedia.store.PendingMediaStore r4 = X.28K.A00(r1)
            java.lang.String r3 = r2.A03
            X.3Q2 r4 = r4.A03(r3)
            r16 = 0
            if (r4 != 0) goto L_0x017f
            r3 = r16
            boolean r7 = r0.A1S()
        L_0x00da:
            java.lang.String r5 = r2.A05
            java.lang.String r28 = r0.A0g()
            java.lang.String r29 = r0.A0f()
            java.lang.String r30 = r0.A0h()
            java.lang.String r13 = r0.A1u
            boolean r12 = r0.A2P
            java.lang.String r11 = r2.A03
            X.1iA r10 = r2.A01
            long r40 = r0.C7c()
            java.util.List r4 = r2.A07
            if (r4 != 0) goto L_0x00fc
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x00fc:
            r39 = 0
            boolean r44 = r0.A1e(r1)
            java.lang.String r6 = r0.A0j()
            java.lang.String r1 = "once"
            boolean r46 = r1.equals(r6)
            boolean r47 = r0.A1V()
            boolean r1 = r2.A01()
            if (r1 == 0) goto L_0x0125
            if (r5 == 0) goto L_0x0125
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r1 = r1.exists()
            r48 = 1
            if (r1 != 0) goto L_0x0127
        L_0x0125:
            r48 = 0
        L_0x0127:
            X.4ik r1 = r0.A0e
            if (r1 == 0) goto L_0x017d
            java.lang.String r6 = r1.A0A
        L_0x012d:
            boolean r1 = r2.A08
            if (r1 != 0) goto L_0x017a
            if (r3 == 0) goto L_0x017a
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.C253833rU.A01(r1)
        L_0x013c:
            float r8 = r2.A00
            java.lang.String r3 = r2.A03
            java.lang.String r1 = r2.A06
            boolean r0 = r0.A1c()
            r51 = r0 ^ 1
            X.N3h r14 = new X.N3h
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r10
            r24 = r9
            r26 = r16
            r31 = r13
            r32 = r11
            r33 = r5
            r34 = r6
            r35 = r3
            r36 = r1
            r37 = r4
            r38 = r8
            r42 = r12
            r43 = r39
            r45 = r39
            r49 = r7
            r50 = r39
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            return r14
        L_0x017a:
            r15 = r16
            goto L_0x013c
        L_0x017d:
            r6 = 0
            goto L_0x012d
        L_0x017f:
            java.lang.String r3 = r4.A33
            boolean r7 = r4.A5D
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271384il.A02(android.content.Context, com.instagram.common.session.UserSession, X.3su, com.instagram.user.model.User, java.lang.Long):X.N3h");
    }

    public static AnonymousClass3WR A03(String str) {
        C271394im r3 = new C271394im(AnonymousClass05K.A1F, UUID.randomUUID().toString());
        r3.A0B = str;
        boolean z = true;
        r3.A0G = true;
        r3.A02 = -1;
        if (str == null || str.isEmpty()) {
            z = false;
        }
        r3.A0I = z;
        return r3.A00();
    }

    public static ArrayList A04(Context context, UserSession userSession, AnonymousClass2Ep r7, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C254703su r2 = (C254703su) it.next();
            arrayList.add(A02(context, userSession, r2, AnonymousClass48N.A04(userSession, r2, r7), AnonymousClass48N.A06(r7)));
        }
        return arrayList;
    }
}
