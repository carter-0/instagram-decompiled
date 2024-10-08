package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.74y  reason: invalid class name and case insensitive filesystem */
public final class C3259874y {
    public static final C3259874y A00 = new Object();

    public static final C328667Fr A00(Context context, UserSession userSession, AnonymousClass9HC r12, AnonymousClass7LQ r13, AnonymousClass7L2 r14) {
        UserSession userSession2 = userSession;
        AnonymousClass9HC r2 = r12;
        AnonymousClass7L2 r4 = r14;
        return new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A01(context, userSession, AnonymousClass7FD.A02(userSession2, r2, r13, r4, r13.A0e.A10, (Boolean) null, (Boolean) null, AnonymousClass0eN.A01(AnonymousClass7FC.A00), true), r12, r13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r4.A0F != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r4.A0D == false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass752 A04(android.content.Context r25, com.instagram.common.session.UserSession r26, X.AnonymousClass9HC r27, X.AnonymousClass7LQ r28, X.AnonymousClass7L2 r29, X.17i r30) {
        /*
            r0 = 0
            r9 = r25
            X.0qQ.A0B(r9, r0)
            r0 = 1
            r8 = r26
            X.0qQ.A0B(r8, r0)
            r0 = 2
            r1 = r30
            X.0qQ.A0B(r1, r0)
            r0 = 3
            r7 = r28
            X.0qQ.A0B(r7, r0)
            r0 = 4
            r1 = r29
            X.0qQ.A0B(r1, r0)
            r0 = 5
            r14 = r27
            X.0qQ.A0B(r14, r0)
            r6 = 0
            X.7Fr r13 = A00(r9, r8, r14, r7, r1)
            X.76d r3 = X.C3262776c.A00(r9, r8)
            X.3su r5 = r7.A0e
            X.0qQ.A07(r5)
            X.7SD r0 = r7.A0G
            boolean r2 = r0.A0x
            java.lang.Long r0 = r5.A1L
            X.77B r19 = r3.A05(r5, r0, r2)
            r3 = 0
            r0 = 6
            X.0qQ.A0B(r13, r0)
            X.2FW r2 = r5.A10
            X.2FW r0 = X.2FW.A1y
            if (r2 == r0) goto L_0x008f
            X.2FW r0 = X.2FW.A1x
            if (r2 == r0) goto L_0x008f
            X.0qQ.A07(r2)
            java.lang.Object r0 = r5.A1T
            boolean r24 = A09(r2, r0, r3)
        L_0x0054:
            X.74y r16 = A00
            X.2FW r2 = r5.A10
            X.74z r0 = X.C3259974z.$redex_init_class
            int r3 = r2.ordinal()
            r15 = 1
            r4 = 57
            r0 = 0
            if (r3 == r4) goto L_0x016a
            r4 = 22
            if (r3 == r4) goto L_0x0094
            r0 = 23
            if (r3 == r0) goto L_0x016a
            r0 = 49
            if (r3 == r0) goto L_0x016a
            r0 = 24
            if (r3 == r0) goto L_0x016a
            r0 = 21
            if (r3 == r0) goto L_0x016a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Expected either type of GENERIC_XMA, REEL_SHARE, XMA_REEL_SHARE, XMA_REEL_MENTION, XMA_CLIPS_SHARE but found: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            boolean r24 = X.C3266377o.A03(r8, r5)
            goto L_0x0054
        L_0x0094:
            java.lang.Object r4 = r5.A1T
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia"
            X.0qQ.A0C(r4, r2)
            X.7FN r4 = (X.AnonymousClass7FN) r4
            X.1Xj r3 = r4.A02
            X.0qQ.A07(r3)
            boolean r2 = r3.A5N()
            r30 = 0
            if (r2 == 0) goto L_0x00af
            boolean r2 = r4.A0F
            r10 = 1
            if (r2 == 0) goto L_0x00b0
        L_0x00af:
            r10 = 0
        L_0x00b0:
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r3.A1n(r9)
            if (r10 != 0) goto L_0x0186
            if (r2 == 0) goto L_0x0186
            boolean r28 = r3.CeS()
            X.7Q3 r1 = r4.A01
            r1.getClass()
            int r10 = r1.ordinal()
            r11 = 1
            r1 = 2
            if (r10 == r1) goto L_0x00ce
            r1 = 8
            if (r10 == r1) goto L_0x00ce
            r11 = 0
        L_0x00ce:
            com.instagram.user.model.User r12 = r3.A2A(r8)
            X.0qQ.A0A(r12)
            if (r11 == 0) goto L_0x00dc
            boolean r1 = r4.A0D
            r10 = 1
            if (r1 != 0) goto L_0x00dd
        L_0x00dc:
            r10 = 0
        L_0x00dd:
            if (r28 == 0) goto L_0x0182
            X.3WR r1 = r3.CEL()
            com.instagram.model.mediasize.VideoUrlImpl r1 = X.C255583uN.A00(r1)
            if (r1 == 0) goto L_0x017f
            java.lang.String r2 = r1.A06
        L_0x00eb:
            if (r10 == 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            java.lang.String r11 = r3.getId()
            java.lang.String r10 = "mediaId"
            java.lang.String r1 = ""
            java.lang.Object r10 = X.C66801Mcn.A00(r11, r1, r10)
            java.lang.String r10 = (java.lang.String) r10
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A03(r6, r3, r6)
            r29 = 1
            if (r1 == 0) goto L_0x010b
            boolean r1 = r1.A0t
            if (r1 == 0) goto L_0x010b
            r29 = 0
        L_0x010b:
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A03(r6, r3, r6)
            if (r1 == 0) goto L_0x011b
            java.lang.Boolean r6 = r1.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            boolean r30 = X.0qQ.A0K(r6, r1)
        L_0x011b:
            X.N2n r1 = new X.N2n
            r25 = r1
            r26 = r10
            r27 = r2
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x0126:
            X.1Nr r11 = new X.1Nr
            r11.<init>(r12)
            java.lang.String r10 = r4.A08
            java.lang.String r6 = "Required value was null."
            if (r10 != 0) goto L_0x0135
            java.lang.String r10 = r12.getId()
        L_0x0135:
            java.lang.String r2 = r3.getId()
            if (r2 == 0) goto L_0x0165
            com.instagram.model.reels.ReelType r12 = r4.A04
            r12.getClass()
            boolean r4 = r4.A0F
            boolean r2 = r3.A5N()
            if (r2 == 0) goto L_0x014e
            com.instagram.model.reels.ReelType r2 = com.instagram.model.reels.ReelType.A0P
            if (r12 == r2) goto L_0x014e
            if (r4 == 0) goto L_0x0165
        L_0x014e:
            X.7FN r4 = r5.A0Z
            if (r4 == 0) goto L_0x017b
            X.7Q3 r2 = r4.A01
            X.7Q3 r0 = X.AnonymousClass7Q3.EMOJI_REACTION
            if (r2 != r0) goto L_0x017b
            java.lang.String r4 = r4.A0A
        L_0x015a:
            java.lang.String r2 = r3.getId()
            if (r2 == 0) goto L_0x0192
            X.CHR r0 = new X.CHR
            r0.<init>(r11, r4, r2, r10)
        L_0x0165:
            X.756 r6 = new X.756
            r6.<init>(r1, r0)
        L_0x016a:
            r22 = r6
            r23 = r7
            r20 = r14
            r21 = r13
            r18 = r8
            r17 = r9
            X.752 r0 = r16.A03(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x017b:
            r4 = 0
            goto L_0x015a
        L_0x017d:
            r1 = r6
            goto L_0x0126
        L_0x017f:
            r2 = 0
            goto L_0x00eb
        L_0x0182:
            java.lang.String r2 = r2.A0A
            goto L_0x00eb
        L_0x0186:
            java.lang.CharSequence r2 = X.C328527Fd.A0C(r9, r8, r7)
            int r0 = r1.A00
            X.754 r6 = new X.754
            r6.<init>(r2, r0)
            goto L_0x016a
        L_0x0192:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3259874y.A04(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2, X.17i):X.752");
    }

    public static final AnonymousClass752 A05(Context context, UserSession userSession, AnonymousClass9HC r9, AnonymousClass7LQ r10, AnonymousClass7L2 r11, 17i r12) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r12, 2);
        0qQ.A0B(r10, 3);
        0qQ.A0B(r11, 4);
        0qQ.A0B(r9, 5);
        C328667Fr A002 = A00(context2, userSession, r9, r10, r11);
        0qQ.A0B(A002, 6);
        C254703su r0 = r10.A0e;
        0qQ.A07(r0);
        C3259874y r3 = A00;
        2FW r1 = r0.A10;
        0qQ.A07(r1);
        return r3.A03(context2, userSession2, (AnonymousClass77B) null, r9, A002, A01(userSession2, r10), r10, A09(r1, r0.A1T, false));
    }

    public static final AnonymousClass752 A06(Context context, UserSession userSession, AnonymousClass9HC r17, AnonymousClass7LQ r18, AnonymousClass7L2 r19, 17i r20, Map map) {
        CHQ chq;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        0qQ.A0B(r20, 2);
        AnonymousClass7LQ r13 = r18;
        0qQ.A0B(r13, 3);
        AnonymousClass7L2 r4 = r19;
        0qQ.A0B(r4, 4);
        AnonymousClass9HC r10 = r17;
        0qQ.A0B(r10, 5);
        Map map2 = map;
        0qQ.A0B(map2, 6);
        C3259874y r6 = A00;
        C254703su r0 = r13.A0e;
        0qQ.A07(r0);
        Object obj = r0.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectPostLiveReply");
        N4Q n4q = (N4Q) obj;
        C270194gL r1 = (C270194gL) n4q.A01;
        if (r1 == null || r1.A09(userSession2)) {
            chq = null;
        } else {
            String str = r1.A0X;
            str.getClass();
            map2.put(str, r1);
            chq = new CHQ(str, n4q.A00);
        }
        return r6.A03(context2, userSession2, (AnonymousClass77B) null, r10, A00(context, userSession2, r10, r13, r4), new AnonymousClass756((C68147N2n) null, chq), r13, false);
    }

    public final AnonymousClass752 A0A(Context context, C328667Fr r16, AnonymousClass755 r17, AnonymousClass75J r18) {
        return A07(context, (AnonymousClass77B) null, r16, r17, r18, (DirectThreadAnalyticsParams) null, (PrivacyMediaOverlayViewModel) null, (1Xj) null, Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size)), "H,0.62857143:1", false, false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.6YJ] */
    public static final AnonymousClass756 A01(UserSession userSession, AnonymousClass7LQ r11) {
        1Nr r4;
        CHR chr;
        C254703su r2 = r11.A0e;
        0qQ.A07(r2);
        2FW r1 = r2.A10;
        C3259974z r0 = C3259974z.$redex_init_class;
        if (r1.ordinal() != 28) {
            return null;
        }
        Object obj = r2.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia");
        AnonymousClass7FJ r8 = (AnonymousClass7FJ) obj;
        1Xj r9 = r8.A01;
        if (r9 != null) {
            User A2A = r9.A2A(userSession);
            AnonymousClass3I7 r02 = r8.A00;
            if (r02 == null) {
                0qQ.A0A(A2A);
                r4 = new 1Nr(A2A);
            } else {
                ? obj2 = new Object();
                obj2.A00 = r02;
                r4 = obj2;
            }
            1Ns r42 = (1Ns) r4;
            ReelType reelType = r8.A02;
            boolean z = true;
            if (!r8.A0A && !0qQ.A0K(r8.A03, true)) {
                z = false;
            }
            if (!r9.A5N() || reelType == ReelType.A0P || z) {
                String id = r9.getId();
                if (id != null) {
                    String str = r8.A07;
                    if (str == null) {
                        0qQ.A0A(A2A);
                        str = A2A.getId();
                    }
                    chr = new CHR(r42, (String) null, id, str);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                chr = null;
            }
            return new AnonymousClass756((C68147N2n) null, chr);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass75J A02(android.content.Context r5, X.C254703su r6) {
        /*
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r6.A16
            r1 = 0
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = r4.A0A
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0010
            r1 = 1
        L_0x0010:
            java.lang.String r3 = "Required value was null."
            r2 = 0
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x00bd
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x00bd
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            X.75I r2 = new X.75I
            r2.<init>(r0)
        L_0x0025:
            return r2
        L_0x0026:
            X.4ik r0 = r6.A0Q()
            if (r0 == 0) goto L_0x0058
            X.1Xj r0 = r0.A05
            if (r0 == 0) goto L_0x0058
            X.4ik r0 = r6.A0Q()
            if (r0 == 0) goto L_0x0025
            X.1Xj r1 = r0.A05
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x004c
            com.instagram.common.typedurl.ImageUrl r0 = r1.A1Q()
            if (r0 != 0) goto L_0x0052
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x004c:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r1.A1n(r5)
            if (r0 == 0) goto L_0x0025
        L_0x0052:
            X.75L r2 = new X.75L
            r2.<init>(r0)
            return r2
        L_0x0058:
            X.2FW r1 = r6.A10
            X.74z r0 = X.C3259974z.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 57
            if (r1 == r0) goto L_0x0082
            r0 = 22
            if (r1 == r0) goto L_0x0091
            r0 = 23
            if (r1 == r0) goto L_0x0082
            r0 = 46
            if (r1 == r0) goto L_0x0075
            r0 = 49
            if (r1 == r0) goto L_0x0082
            return r2
        L_0x0075:
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof X.AnonymousClass77X
            if (r0 == 0) goto L_0x0025
            X.77X r1 = (X.AnonymousClass77X) r1
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r1.A03
            goto L_0x00a2
        L_0x0082:
            X.2FW r0 = r6.A0z
            if (r0 == 0) goto L_0x0025
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 != r0) goto L_0x0025
            java.lang.String r1 = r6.A1q
            goto L_0x00a2
        L_0x0091:
            java.lang.Object r1 = r6.A1T
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia"
            X.0qQ.A0C(r1, r0)
            X.7FN r1 = (X.AnonymousClass7FN) r1
            boolean r0 = X.OXE.A02(r1)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r1.A0A
        L_0x00a2:
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = X.C336957fS.A02(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C336957fS.A00(r0, r1)
            X.75K r2 = new X.75K
            r2.<init>(r0, r1)
            return r2
        L_0x00b2:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.OFF r0 = r1.A00
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r0.A00
            goto L_0x00a2
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3259874y.A02(android.content.Context, X.3su):X.75J");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36322843366337054L) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r1 != 8) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r2 = new X.0eP(r7, java.lang.Integer.valueOf(r8.getResources().getDimensionPixelSize(com.instagram.android.R.dimen.album_preview_add_item_circle_size)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        r6 = (java.lang.String) r2.A00;
        r2 = (java.lang.Integer) r2.A01;
        r1 = r3.A10;
        r10 = r36;
        r11 = r37;
        r18 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (new org.json.JSONObject(r0).optString("__typename").hashCode() == 1959039784) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        X.0KC.A0G("PortraitXmaContentViewModelFactory", X.AnonymousClass000.A00(230), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        if (r1 == X.2FW.A1p) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013f, code lost:
        r7 = X.AnonymousClass751.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 2342159139545157624L) == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0150, code lost:
        r15 = X.AnonymousClass751.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0160, code lost:
        return A07(r8, (X.AnonymousClass77B) null, r10, r11, r12, (com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams) null, (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) null, r15, r2, r6, r18, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0161, code lost:
        if (r7 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        if (r7.length() == 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0169, code lost:
        r15 = X.1E7.A00(r4).A02(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r1 != X.2FW.A0y) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r3.A1S() == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r0 = r3.A1o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass752 A03(android.content.Context r32, com.instagram.common.session.UserSession r33, X.AnonymousClass77B r34, X.AnonymousClass9HC r35, X.C328667Fr r36, X.AnonymousClass755 r37, X.AnonymousClass7LQ r38, boolean r39) {
        /*
            r31 = this;
            r5 = r38
            X.3su r3 = r5.A0e
            X.0qQ.A07(r3)
            r8 = r32
            X.75J r12 = A02(r8, r3)
            X.2FW r1 = r3.A10
            X.74z r0 = X.C3259974z.$redex_init_class
            int r0 = r1.ordinal()
            java.lang.String r7 = "H,0.62857143:1"
            java.lang.String r6 = "H,0.555555:1"
            r9 = 0
            r4 = r33
            r2 = r35
            switch(r0) {
                case 22: goto L_0x005c;
                case 23: goto L_0x005c;
                case 28: goto L_0x00ac;
                case 29: goto L_0x00ac;
                case 30: goto L_0x005c;
                case 32: goto L_0x00d9;
                case 37: goto L_0x00d0;
                case 38: goto L_0x00d0;
                case 46: goto L_0x00a2;
                case 49: goto L_0x00a2;
                case 57: goto L_0x004a;
                default: goto L_0x0021;
            }
        L_0x0021:
            X.0eP r2 = new X.0eP
            r2.<init>(r9, r9)
        L_0x0026:
            java.lang.Object r6 = r2.A00
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.2FW r1 = r3.A10
            X.2FW r0 = X.2FW.A1p
            r10 = r36
            r11 = r37
            r18 = r39
            if (r1 == r0) goto L_0x013f
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x010c
            boolean r0 = r3.A1S()
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r3.A1o
            if (r0 == 0) goto L_0x010c
            goto L_0x00eb
        L_0x004a:
            X.2FW r0 = r3.A0z
            if (r0 == 0) goto L_0x0021
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322843366337054(0x810b6f00152a1e, double:3.034050632997561E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0021
            goto L_0x008d
        L_0x005c:
            java.lang.Object r1 = r3.A1T
            boolean r0 = r1 instanceof X.AnonymousClass7FN
            if (r0 == 0) goto L_0x0074
            X.7FN r1 = (X.AnonymousClass7FN) r1
            X.7Q3 r0 = r1.A01
            r0.getClass()
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0021
            r0 = 8
            if (r1 == r0) goto L_0x0021
        L_0x0074:
            X.2FW r1 = r3.A10
            X.2FW r0 = X.2FW.A1T
            if (r1 == r0) goto L_0x007e
            X.2FW r0 = X.2FW.A1y
            if (r1 != r0) goto L_0x008d
        L_0x007e:
            X.0eM r0 = r2.A17
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x008d
            r7 = r6
        L_0x008d:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0eP r2 = new X.0eP
            r2.<init>(r7, r0)
            goto L_0x0026
        L_0x00a2:
            r0 = 0
            if (r12 == 0) goto L_0x00a6
            r0 = 1
        L_0x00a6:
            X.0eP r2 = X.AnonymousClass750.A00(r8, r2, r0)
            goto L_0x0026
        L_0x00ac:
            X.0eM r0 = r2.A18
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0021
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165279(0x7f07005f, float:1.794477E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0eP r2 = new X.0eP
            r2.<init>(r6, r0)
            goto L_0x0026
        L_0x00d0:
            java.lang.String r0 = "H,0.640625:1"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r9)
            goto L_0x0026
        L_0x00d9:
            r0 = 0
            int r0 = X.AnonymousClass7PV.A00(r8, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "H,6.0:9.0"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            goto L_0x0026
        L_0x00eb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0100 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0100 }
            java.lang.String r0 = "__typename"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0100 }
            int r1 = r0.hashCode()     // Catch:{ JSONException -> 0x0100 }
            r0 = 1959039784(0x74c49328, float:1.245941E32)
            if (r1 == r0) goto L_0x013f
            goto L_0x010c
        L_0x0100:
            r7 = move-exception
            java.lang.String r1 = "PortraitXmaContentViewModelFactory"
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0G(r1, r0, r7)
        L_0x010c:
            boolean r0 = r3.A1c()
            if (r0 != 0) goto L_0x013c
            X.7SD r1 = r5.A0G
            X.0qQ.A07(r1)
            boolean r0 = r3.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r24 = X.C3263376i.A00(r1, r0)
        L_0x011d:
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r25 = A08(r8, r4, r3, r9)
            boolean r30 = r3.A1S()
            r20 = r34
            r19 = r8
            r21 = r10
            r22 = r11
            r23 = r12
            r26 = r9
            r27 = r2
            r28 = r6
            r29 = r18
            X.752 r0 = A07(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        L_0x013c:
            r24 = r9
            goto L_0x011d
        L_0x013f:
            java.lang.String r7 = X.AnonymousClass751.A01(r3)
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342159139545157624(0x2081055400060ff8, double:4.062304729573346E-152)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0161
            X.1Xj r15 = X.AnonymousClass751.A00(r3)
        L_0x0154:
            r19 = 0
            r13 = r9
            r14 = r9
            r16 = r2
            r17 = r6
            X.752 r0 = A07(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0161:
            if (r7 == 0) goto L_0x0172
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0172
            X.1E8 r0 = X.1E7.A00(r4)
            X.1Xj r15 = r0.A02(r7)
            goto L_0x0154
        L_0x0172:
            r15 = r9
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3259874y.A03(android.content.Context, com.instagram.common.session.UserSession, X.77B, X.9HC, X.7Fr, X.755, X.7LQ, boolean):X.752");
    }

    public static final AnonymousClass752 A07(Context context, AnonymousClass77B r10, C328667Fr r11, AnonymousClass755 r12, AnonymousClass75J r13, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, 1Xj r16, Integer num, String str, boolean z, boolean z2) {
        int dimensionPixelSize;
        String str2 = str;
        C328667Fr r2 = r11;
        0qQ.A0B(r11, 2);
        if (str == null) {
            str2 = "H,0.640625:1";
        }
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
        }
        return new AnonymousClass752(r10, r2, r12, r13, directThreadAnalyticsParams, privacyMediaOverlayViewModel, r16, str2, dimensionPixelSize, z, z2);
    }

    public static final PrivacyMediaOverlayViewModel A08(Context context, UserSession userSession, C254703su r6, C254933tI r7) {
        Object obj;
        String str;
        C254873tC r1;
        List list;
        Object obj2 = r6.A1T;
        if (!(obj2 instanceof List) || (list = (List) obj2) == null) {
            obj = null;
        } else {
            obj = 00k.A0J(list);
        }
        if (!(obj instanceof C254873tC) || (r1 = (C254873tC) obj) == null || (str = Long.valueOf(r1.A0K).toString()) == null) {
            if (r7 != null) {
                str = r7.A0S;
            } else {
                str = null;
            }
        }
        C3263676m r2 = new C3263676m(userSession, r6, str);
        if (!r2.A05()) {
            return null;
        }
        Resources resources = context.getResources();
        0qQ.A07(resources);
        return r2.A04(resources, true);
    }

    public static final boolean A09(2FW r3, Object obj, boolean z) {
        ReelType reelType;
        C3259974z r0 = C3259974z.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal != 22) {
            if (ordinal != 23) {
                if (ordinal == 28) {
                    0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia");
                    AnonymousClass7FJ r4 = (AnonymousClass7FJ) obj;
                    if (!r4.A0A) {
                        return false;
                    }
                    reelType = r4.A02;
                } else if (ordinal != 24) {
                    return false;
                }
            }
            return z;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
        AnonymousClass7FN r42 = (AnonymousClass7FN) obj;
        if (!r42.A0F) {
            return false;
        }
        reelType = r42.A04;
        reelType.getClass();
        if (reelType != ReelType.A0P) {
            return true;
        }
        return false;
    }
}
