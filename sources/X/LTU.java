package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;

public abstract class LTU {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.4n7] */
    public static final C2609947v A00(Context context, UserSession userSession, AnonymousClass797 r9, DirectThreadKey directThreadKey, C63822L8d l8d, Integer num, String str) {
        0qQ.A0B(r9, 3);
        1ua A0n = JTO.A0n(context, userSession);
        boolean A00 = r9.A00();
        AnonymousClass3Q2 r3 = new AnonymousClass3Q2(JTQ.A0Z());
        1iA r4 = 1iA.A07;
        r3.A0V(r4);
        r3.A0e(ShareType.DIRECT_SHARE);
        String str2 = l8d.A01;
        int i = l8d.A00;
        ? obj = new Object();
        obj.A01 = str2;
        obj.A00 = i;
        r3.A1L = obj;
        r3.A6C = !A00;
        r3.A5D = A00;
        r3.A3p = str;
        r3.A2G = num;
        r3.A0V = C17154VKg.A00;
        if (A00 || 182.A06(0Tu.A05, userSession, 36325733878084777L)) {
            r3.A53 = true;
        } else {
            r3.A4x = true;
        }
        JTT.A1P(r4, r3, A0n, A0n.A04);
        if (A00) {
            A0n.A0B(r3);
        } else {
            28K.A00(userSession).A0B(DbT.A05(context));
            C64008LIv.A00(userSession, directThreadKey, r3, A0n);
        }
        return new C2609947v(r3, 00k.A0a(l8d.A03), l8d.A00, 10);
    }

    public static final C300925yB A01(Context context, UserSession userSession, AnonymousClass797 r17, DirectThreadKey directThreadKey, ClipInfo clipInfo, ShareType shareType, 1ua r21, Integer num, String str, String str2, String str3) {
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        DirectThreadKey directThreadKey2 = directThreadKey;
        ClipInfo clipInfo2 = clipInfo;
        AnonymousClass797 r1 = r17;
        C51974G9v.A1P(userSession2, directThreadKey2, r1, clipInfo2);
        1ua r3 = r21;
        String str4 = str;
        AnonymousClass7TF.A1E(str4, 5, r3);
        boolean A00 = r1.A00();
        AnonymousClass3Q2 A07 = A07(userSession2, clipInfo2, (AnonymousClass3Q2) null, shareType, num, str4, (String) null, str2, A00);
        if (A0B(str3) && 182.A06(0Tu.A05, userSession2, 36330840594072366L)) {
            A07.A0i = 28D.A5D;
        }
        r3.A0F(A07);
        if (A00) {
            r3.A0B(A07);
        } else {
            28K.A00(userSession2).A0B(DbT.A05(context));
            C64008LIv.A00(userSession2, directThreadKey2, A07, r3);
        }
        return C63326Kv9.A00(A07);
    }

    public static final C300925yB A02(Context context, UserSession userSession, AnonymousClass797 r14, DirectThreadKey directThreadKey, AnonymousClass3Q2 r16, ShareType shareType, 1ua r18, C352218Cl r19, Integer num, String str, String str2) {
        AnonymousClass3Q2 r4;
        0qQ.A0B(context, 0);
        C352218Cl r8 = r19;
        C51974G9v.A1P(userSession, directThreadKey, r14, r8);
        1ua r3 = r18;
        0qQ.A0B(r3, 6);
        AnonymousClass3Q2 A0M = JTQ.A0M(userSession, AnonymousClass7IC.A00(userSession).BbT(r8.A0h));
        if (A0M == null) {
            r4 = A08(r16, shareType, r8, num, (String) null, str, r14.A00());
        } else {
            r4 = A0M;
        }
        r4.A5h = false;
        if (A0B(str2) && 182.A06(0Tu.A05, userSession, 36330840594072366L)) {
            r4.A0i = 28D.A5D;
        }
        if (A0M != null) {
            PendingMediaStore A00 = 28K.A00(userSession);
            String str3 = A0M.A35;
            if (str3 != null) {
                A00.A07.remove(str3);
            }
        }
        A0A(userSession, directThreadKey, r4, r8);
        r3.A0E(r4);
        if (r14.A00()) {
            r3.A0B(r4);
        } else {
            C64008LIv.A00(userSession, directThreadKey, r4, r3);
        }
        return C63326Kv9.A00(r4);
    }

    public static final C300925yB A03(UserSession userSession, DirectThreadKey directThreadKey, AnonymousClass3Q2 r4, 1ua r5) {
        AnonymousClass7TF.A1C(userSession, 1, r5);
        r4.A0e(ShareType.DIRECT_SHARE);
        r4.A6C = true;
        r4.A53 = true;
        r5.A0E(r4);
        C64008LIv.A00(userSession, directThreadKey, r4, r5);
        return C63326Kv9.A00(r4);
    }

    public static final AnonymousClass3Q2 A05(Context context, UserSession userSession, DirectThreadKey directThreadKey, String str, int i, int i2, boolean z) {
        AnonymousClass7TF.A1C(userSession, 1, str);
        AnonymousClass3Q2 A09 = A09(JTQ.A0Z(), str, i, i2);
        A09.A6C = true;
        if (182.A06(0Tu.A05, userSession, 36325733878084777L)) {
            A09.A53 = true;
        } else {
            A09.A4x = true;
        }
        A09.A57 = z;
        A09.A2G = null;
        1ua A0n = JTO.A0n(context, userSession);
        A0n.A0C(A09);
        C64008LIv.A00(userSession, directThreadKey, A09, A0n);
        return A09;
    }

    public static final AnonymousClass3Q2 A06(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        0qQ.A0B(context, 0);
        AnonymousClass3Q2 A09 = A09(JTQ.A0Z(), str, i, i2);
        A09.A6C = false;
        A09.A4x = false;
        A09.A53 = true;
        A09.A5D = true;
        A09.A57 = z;
        A09.A2G = null;
        1ua A0n = JTO.A0n(context, userSession);
        A0n.A0C(A09);
        A0n.A0B(A09);
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r0.A5D != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C300925yB A04(com.instagram.common.session.UserSession r22, com.instagram.model.direct.DirectThreadKey r23, com.instagram.pendingmedia.model.constants.ShareType r24, X.1ua r25, java.lang.Integer r26, java.util.List r27, boolean r28) {
        /*
            r8 = r28
            r3 = 1
            r10 = r23
            r9 = r25
            X.AnonymousClass7TF.A1D(r10, r3, r9)
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r7 = new X.3Q2
            r7.<init>(r0)
            X.1iA r0 = X.1iA.A09
            r7.A0V(r0)
            r15 = r24
            r7.A1k = r15
            r7.A5u = r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325733878084777(0x810e10000234a9, double:3.035878604265978E-306)
            r11 = r22
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x00e9
            r7.A53 = r3
        L_0x002f:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            X.7IF r12 = X.AnonymousClass7IC.A00(r11)
            com.instagram.pendingmedia.store.PendingMediaStore r6 = X.28K.A00(r11)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r27.iterator()
        L_0x0043:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r4 = r16.next()
            X.L4P r4 = (X.L4P) r4
            boolean r3 = r4 instanceof X.KR0
            if (r3 == 0) goto L_0x00e6
            r0 = r4
            X.KR0 r0 = (X.KR0) r0
            X.8Cl r0 = r0.A00
            java.lang.String r0 = r0.A0h
            java.lang.String r0 = r12.BbT(r0)
        L_0x005e:
            X.3Q2 r0 = r6.A03(r0)
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = r0.A35
            r5.add(r1)
        L_0x0069:
            if (r8 != 0) goto L_0x0070
            boolean r1 = r0.A5D
            r8 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r8 = 1
        L_0x0071:
            if (r3 == 0) goto L_0x0084
            com.instagram.common.gallery.metadata.MediaUploadMetadata r3 = r0.A13
            r1 = r4
            X.KR0 r1 = (X.KR0) r1
            X.8Cl r2 = r1.A00
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r2.A01()
            r3.A00(r1)
            A0A(r11, r10, r0, r2)
        L_0x0084:
            boolean r1 = r4 instanceof X.KR1
            if (r1 == 0) goto L_0x0093
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r0.A13
            X.KR1 r4 = (X.KR1) r4
            com.instagram.pendingmedia.model.ClipInfo r1 = r4.A00
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A0B
            r2.A00(r1)
        L_0x0093:
            r13.add(r0)
            goto L_0x0043
        L_0x0097:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00c9
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x009d:
            r24 = 0
            X.797 r0 = X.AnonymousClass796.A03(r11, r10, r0)
            boolean r25 = r0.A00()
            java.lang.String r14 = r7.A35
            X.3Q2 r2 = r4.A00
            boolean r0 = r4 instanceof X.KR1
            r21 = r26
            if (r0 == 0) goto L_0x00cc
            r0 = r4
            X.KR1 r0 = (X.KR1) r0
            com.instagram.pendingmedia.model.ClipInfo r1 = r0.A00
            java.lang.String r0 = r0.A01
            r22 = r0
            r23 = r14
            r19 = r2
            r20 = r15
            r18 = r1
            r17 = r11
            X.3Q2 r0 = A07(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0069
        L_0x00c9:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x009d
        L_0x00cc:
            if (r3 == 0) goto L_0x00ed
            r0 = r4
            X.KR0 r0 = (X.KR0) r0
            X.8Cl r0 = r0.A00
            r17 = r2
            r18 = r15
            r19 = r0
            r20 = r21
            r21 = r14
            r22 = r24
            r23 = r25
            X.3Q2 r0 = A08(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0069
        L_0x00e6:
            r0 = 0
            goto L_0x005e
        L_0x00e9:
            r7.A4x = r3
            goto L_0x002f
        L_0x00ed:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f2:
            r7.A0k(r13)
            r7.A5D = r8
            r9.A0H(r7, r13)
            X.C64008LIv.A00(r11, r10, r7, r9)
            java.util.Iterator r2 = r5.iterator()
        L_0x0101:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r1 = r2.next()
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r11)
            if (r1 == 0) goto L_0x0101
            java.util.Set r0 = r0.A07
            r0.remove(r1)
            goto L_0x0101
        L_0x0117:
            X.5yB r0 = X.C63326Kv9.A00(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTU.A04(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, com.instagram.pendingmedia.model.constants.ShareType, X.1ua, java.lang.Integer, java.util.List, boolean):X.5yB");
    }

    public static final AnonymousClass3Q2 A07(UserSession userSession, ClipInfo clipInfo, AnonymousClass3Q2 r6, ShareType shareType, Integer num, String str, String str2, String str3, boolean z) {
        AnonymousClass3Q2 r2;
        if (r6 == null) {
            r2 = AnonymousClass9T3.A02(JTQ.A0Z());
        } else {
            r2 = r6;
        }
        r2.A3O = str2;
        r2.A33 = str;
        r2.A0e(shareType);
        if (r6 == null) {
            r2.A02 = ((float) clipInfo.A09) / ((float) clipInfo.A06);
        }
        int i = clipInfo.A09;
        int i2 = clipInfo.A06;
        r2.A0S = i;
        r2.A0R = i2;
        r2.A6C = !z;
        r2.A5D = z;
        r2.A3p = str3;
        r2.A2G = num;
        MediaUploadMetadata mediaUploadMetadata = clipInfo.A0B;
        0qQ.A0B(mediaUploadMetadata, 0);
        r2.A13 = mediaUploadMetadata;
        Q0X.A04(clipInfo, r2);
        if (z || 182.A06(0Tu.A05, userSession, 36325733878084777L)) {
            r2.A53 = true;
        } else {
            r2.A4x = true;
        }
        r2.A0V = C17154VKg.A00;
        r2.A5F = clipInfo.A0I;
        return r2;
    }

    public static final AnonymousClass3Q2 A08(AnonymousClass3Q2 r2, ShareType shareType, C352218Cl r4, Integer num, String str, String str2, boolean z) {
        if (r2 == null) {
            r2 = AnonymousClass9T3.A01(JTQ.A0Z());
        }
        r2.A3O = str;
        r2.A0e(shareType);
        r2.A33 = r4.A06();
        r2.A3L = r4.A07();
        int i = r4.A09;
        r2.A0H = i;
        int i2 = r4.A06;
        r2.A0G = i2;
        r2.A0S = i;
        r2.A0R = i2;
        if (i2 != 0) {
            r2.A02 = ((float) i) / ((float) i2);
        }
        r2.A6C = !z;
        r2.A5D = z;
        r2.A3p = str2;
        r2.A2G = num;
        r2.A53 = true;
        r2.A13 = r4.A01();
        return r2;
    }

    public static AnonymousClass3Q2 A09(String str, String str2, int i, int i2) {
        AnonymousClass3Q2 r2 = new AnonymousClass3Q2(str);
        r2.A0V(1iA.A06);
        r2.A0e(ShareType.DIRECT_SHARE);
        r2.A33 = str2;
        r2.A0H = i;
        r2.A0G = i2;
        r2.A0S = i;
        r2.A0R = i2;
        if (i2 != 0) {
            r2.A02 = (((float) i) * 1.0f) / ((float) i2);
        }
        return r2;
    }

    public static final boolean A0B(String str) {
        String str2;
        int i;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -530380944:
                i = 830;
                break;
            case 375221496:
                i = 829;
                break;
            case 387110936:
                str2 = "external_share_send_attribution_video";
                break;
            case 761551839:
                if (str.equals("share_extension")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
        str2 = C66579MXk.A00(i);
        if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public static final void A0A(UserSession userSession, DirectThreadKey directThreadKey, AnonymousClass3Q2 r5, C352218Cl r6) {
        AnonymousClass3U9 A03 = 2Dr.A03(2L2.A00(userSession), directThreadKey);
        if (A03 != null && A03.C6a() == 29 && 182.A06(0Tu.A05, userSession, 36329444729700481L)) {
            02m r2 = 02m.A0p;
            r2.markerStart(868880300);
            String A07 = r6.A07();
            if (A07 != null) {
                r5.A3L = A07;
                r5.A44 = C379839Vn.A00(A07);
            }
            VFE.A00(userSession, r5);
            r2.markerEnd(868880300, 2);
        }
    }
}
