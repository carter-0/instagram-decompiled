package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;

/* renamed from: X.7Zi  reason: invalid class name and case insensitive filesystem */
public final class C333537Zi implements C333547Zj {
    public boolean A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final Context A02;
    public final UserSession A03;
    public final C282375Cv A04;
    public final boolean A05;
    public final C333557Zk A06;

    public C333537Zi(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = new C333557Zk(userSession);
        C282375Cv A002 = C282375Cv.A00(userSession);
        0qQ.A07(A002);
        this.A04 = A002;
        this.A05 = 182.A06(0Tu.A06, userSession, 36325742469002428L);
    }

    public static final String A03(C333537Zi r4, boolean z) {
        int i = 4;
        if (z) {
            i = 15;
        }
        C282375Cv r2 = r4.A04;
        String createTraceIdForType = TraceLogger.createTraceIdForType(i);
        if (createTraceIdForType != null) {
            r2.A04((List) null, i, createTraceIdForType);
        }
        return createTraceIdForType;
    }

    public static final void A09(C333537Zi r12, Integer num, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        boolean z3;
        List singletonList;
        String str4 = str;
        if (str != null) {
            int i3 = 4;
            int i4 = 4;
            boolean z4 = z2;
            if (z2) {
                i4 = 15;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf((long) i2));
            int i5 = i;
            if (i5 != 8) {
                if (i5 != 9) {
                    i3 = i5;
                    z3 = false;
                }
                z3 = true;
            } else {
                i3 = 2;
                z3 = true;
            }
            arrayList.add(Long.valueOf((long) i3));
            C282375Cv.A03(str, arrayList, i4, 53, 0);
            if (z3) {
                if (num == null) {
                    singletonList = null;
                } else {
                    singletonList = Collections.singletonList(Long.valueOf((long) num.intValue()));
                    0qQ.A07(singletonList);
                }
                C282375Cv.A03(str, singletonList, i4, 1003, 0);
            }
            C282375Cv.A03(str, 0sr.A1P(new Long[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}), i4, 7032, 0);
            A0A(r12, str4, str2, str3, i4, z, z4);
        }
    }

    public static final void A0B(C333537Zi r9, String str, String str2, String str3, int i, boolean z, boolean z2) {
        A09(r9, (Integer) null, str, str2, str3, i, 1, 0, 0, 0, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A0C(com.instagram.model.direct.DirectThreadKey r35, X.C381779cJ r36, X.AnonymousClass3Q2 r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
            r34 = this;
            r9 = 0
            r10 = 1
            r5 = r35
            X.0qQ.A0B(r5, r10)
            r15 = r34
            com.instagram.common.session.UserSession r0 = r15.A03
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            r3 = r37
            java.lang.String r2 = r3.A35
            X.0qQ.A0B(r2, r9)
            java.util.Map r1 = r1.A06
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x002f
            r1 = 231(0xe7, float:3.24E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r3.A35
            java.lang.String r2 = X.002.A0R(r2, r1)
            java.lang.String r1 = "DirectSendMessageManager_pending_media_not_found"
            X.0wb.A04(r1, r2, r10)
        L_0x002f:
            X.ODs r2 = X.OQO.A00(r0, r5)
            r4 = r36
            boolean r1 = r4.A07
            r32 = r1
            r7 = 0
            if (r2 == 0) goto L_0x00b7
            boolean r1 = X.C70054NwW.A00(r2)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r1)
        L_0x0044:
            X.1iA r1 = r3.A1G
            X.1iA r6 = X.1iA.A0a
            if (r1 != r6) goto L_0x00b4
            java.lang.Integer r19 = X.AnonymousClass05K.A03
        L_0x004c:
            r16 = r0
            r17 = r5
            r20 = r32
            r21 = r9
            r22 = r9
            X.797 r1 = X.AnonymousClass796.A02(r16, r17, r18, r19, r20, r21, r22)
            boolean r13 = r1.A00()
            java.lang.String r21 = A03(r15, r13)
            java.lang.Class<X.1fu> r24 = X.AnonymousClass1fu.class
            X.ODs r23 = X.OQO.A00(r0, r5)
            X.0Tu r8 = X.0Tu.A05
            r1 = 36324033071034048(0x810c8400022ec0, double:3.0348030070384965E-306)
            boolean r1 = X.182.A06(r8, r0, r1)
            if (r1 != 0) goto L_0x00b1
            if (r13 == 0) goto L_0x00b1
            r1 = r7
        L_0x0078:
            r25 = r38
            r22 = r0
            r26 = r1
            r27 = r32
            X.MaY r14 = X.C66669Mac.A04(r22, r23, r24, r25, r26, r27)
            java.lang.String r2 = r14.A03
            X.1iA r1 = r3.A1G
            r23 = 8
            if (r1 != r6) goto L_0x008e
            r23 = 9
        L_0x008e:
            java.lang.String r8 = r4.A06
            r18 = r15
            r19 = r5
            r20 = r2
            r22 = r8
            r24 = r10
            r25 = r32
            r26 = r13
            A08(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Long r25 = X.OQO.A01(r0, r5)
            X.C63387Kw8.A00(r3)
            long r1 = X.C17154VKg.A00
            r3.A0V = r1
            java.lang.String r2 = r4.A02
            if (r2 == 0) goto L_0x00d1
            goto L_0x00ba
        L_0x00b1:
            java.lang.String r1 = r4.A00
            goto L_0x0078
        L_0x00b4:
            java.lang.Integer r19 = X.AnonymousClass05K.A04
            goto L_0x004c
        L_0x00b7:
            r18 = r7
            goto L_0x0044
        L_0x00ba:
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x00c5 }
            X.0c9 r1 = r1.A01(r0, r2)     // Catch:{ IOException -> 0x00c5 }
            X.3tI r12 = X.C254933tI.A00(r1)     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00d2
        L_0x00c5:
            r11 = move-exception
            java.lang.String r2 = "deserialize_replied_to_message"
            r1 = 2271(0x8df, float:3.182E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0wb.A06(r2, r1, r11)
        L_0x00d1:
            r12 = r7
        L_0x00d2:
            X.7UH r2 = X.AnonymousClass7UG.A00(r0)
            r11 = r39
            if (r39 == 0) goto L_0x00dd
            r2.A03(r11, r9)
        L_0x00dd:
            if (r39 == 0) goto L_0x00e7
            int r1 = r11.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x00e7:
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r18 = X.C328727Fx.A00(r0, r7)
            if (r18 == 0) goto L_0x00f0
            r18.onLogTransportMessageEnd()
        L_0x00f0:
            if (r18 == 0) goto L_0x00f5
            r18.onLogSendServiceStart()
        L_0x00f5:
            X.7Qt r7 = X.C331377Qt.A00(r3, r8)
            long r26 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r16
            X.1fu r1 = new X.1fu
            r22 = r1
            r23 = r14
            r24 = r5
            r22.<init>(r23, r24, r25, r26)
            java.lang.String r14 = r7.A03
            java.lang.String r9 = "Invalid DirectPendingVisualMedia object with null PendingMediaKey"
            X.17k.A07(r14, r9)
            r1.A01 = r7
            r1.A06 = r8
            java.lang.String r7 = r4.A03
            r1.A03 = r7
            java.lang.String r7 = r4.A05
            r1.A05 = r7
            java.lang.String r4 = r4.A04
            r1.A04 = r4
            r1.A00 = r12
            r4 = r41
            r1.A08 = r4
            r4 = r40
            r1.A02 = r4
            if (r39 == 0) goto L_0x0132
            r2.A05(r11, r10)
        L_0x0132:
            java.lang.String r22 = r1.A06()
            java.lang.String r4 = r5.A00
            X.1iA r2 = r3.A1G
            r24 = 8
            if (r2 != r6) goto L_0x0140
            r24 = 9
        L_0x0140:
            if (r8 == 0) goto L_0x01ab
            int r3 = r8.hashCode()
            r2 = -1212837439(0xffffffffb7b591c1, float:-2.1644753E-5)
            if (r3 == r2) goto L_0x019f
            r2 = 3415681(0x341e81, float:4.786389E-39)
            if (r3 == r2) goto L_0x0193
            r2 = 668488878(0x27d854ae, float:6.0043853E-15)
            if (r3 != r2) goto L_0x01ab
            java.lang.String r2 = "permanent"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x01ab
            r2 = 50204(0xc41c, float:7.0351E-41)
        L_0x0160:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r2)
        L_0x0164:
            r26 = 0
            r28 = r26
            r30 = r26
            r33 = r13
            r19 = r15
            r23 = r4
            r25 = r10
            A09(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r33)
            if (r18 == 0) goto L_0x017a
            r18.onLogDispatchSendMutationStart()
        L_0x017a:
            X.1Ou r0 = X.1Ou.A01(r0)
            r0.A0A(r1)
            java.lang.String r2 = r1.A06()
            X.MaY r0 = r1.A02
            boolean r0 = r0.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0193:
            java.lang.String r2 = "once"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x01ab
            r2 = 50202(0xc41a, float:7.0348E-41)
            goto L_0x0160
        L_0x019f:
            java.lang.String r2 = "replayable"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x01ab
            r2 = 50203(0xc41b, float:7.035E-41)
            goto L_0x0160
        L_0x01ab:
            r20 = 0
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A0C(com.instagram.model.direct.DirectThreadKey, X.9cJ, X.3Q2, java.lang.String, java.lang.String, java.lang.String, boolean):android.util.Pair");
    }

    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String A0D(N49 n49, C70766OKm oKm, C254933tI r30, OCA oca, C254743sy r32, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        C254743sy r3 = r32;
        0qQ.A0B(r3, 0);
        AnonymousClass7UH A002 = AnonymousClass7UG.A00(this.A03);
        String str7 = str5;
        String str8 = str7;
        String str9 = str;
        if (str5 == null) {
            str8 = str9;
        }
        A002.A05(str8, true);
        return A02(n49, oKm, r30, (SendMentionData$MentionData) null, oca, (C69343Nji) null, C66647MaG.A03(r3), num, num2, num3, l, str9, str2, str3, str4, str7, (String) null, str6, (List) null, (List) null, z, z2);
    }

    public final void A0E(ULw uLw, C254743sy r25, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        int i3;
        int i4;
        String str7 = str;
        0qQ.A0B(str7, 2);
        DirectThreadKey A032 = C66647MaG.A03(r25);
        String A033 = A03(this, false);
        DirectThreadKey A034 = C66647MaG.A03(A032);
        UserSession userSession = this.A03;
        AnonymousClass3U9 B33 = 1bJ.A00(userSession).B33(A034);
        boolean z = this.A00;
        UserSession userSession2 = userSession;
        C66665MaY A062 = C66669Mac.A06(userSession2, OQO.A00(userSession, A034), C66161kJ.class, str3, false, z);
        Long A012 = OQO.A01(userSession, A032);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        if (B33 != null) {
            i3 = B33.C6a();
            i4 = B33.AdN();
        } else {
            i3 = 0;
            i4 = 0;
        }
        0qQ.A0B(A034, 2);
        1bp r14 = new 1bp(A062, A034, A012, currentTimeMillis);
        r14.A05 = A034;
        r14.A00 = i;
        r14.A09 = str7;
        r14.A07 = str2;
        r14.A01 = i2;
        r14.A08 = str4;
        r14.A06 = l;
        r14.A0A = str5;
        r14.A03 = i3;
        r14.A02 = i4;
        r14.A0B = str6;
        r14.A04 = uLw;
        A0B(this, A033, r14.A06(), A032.A00, 7, r14.A02.A07, false);
        A08(this, A032, r14.A06(), A033, (String) null, 7, 1, r14.A02.A07, false);
        1Ou.A01(userSession).A0A(r14);
        C313756gx A002 = C313746gw.A00(userSession);
        String str8 = A032.A00;
        2FW r4 = 2FW.A0y;
        A002.A0H(r4, this.A01, str8, false);
        C3265677h.A0g(userSession, A032, r4, r14.A06(), r14.A02.A09);
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [X.OKl, java.lang.Object] */
    public final void A0G(C60957JuF juF, C70621ODs oDs, DirectThreadKey directThreadKey, 2FW r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        C70765OKl oKl;
        String str8;
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey2, 0);
        String str9 = str;
        0qQ.A0B(str9, 1);
        UserSession userSession = this.A03;
        AnonymousClass7UH A002 = AnonymousClass7UG.A00(userSession);
        String str10 = str7;
        if (str7 != null) {
            A002.A03(str10, false);
            IGFOAMessagingLocalSendSpeedLogger A003 = C328727Fx.A00(userSession, Integer.valueOf(str10.hashCode()));
            if (A003 != null) {
                A003.onLogTransportMessageEnd();
                A003.onLogSendServiceStart();
            }
        }
        String str11 = null;
        C60957JuF juF2 = juF;
        String str12 = str3;
        if (juF == null || str3 == null || !z) {
            oKl = null;
        } else {
            String str13 = juF2.A06;
            String str14 = juF2.A07;
            String str15 = juF2.A03;
            ? obj = new Object();
            obj.A00 = str13;
            obj.A01 = str14;
            obj.A02 = str15;
            oKl = obj;
        }
        boolean z5 = z2;
        C66665MaY A042 = C66669Mac.A04(userSession, oDs, AnonymousClass1g2.class, str6, str10, z5);
        if (z) {
            str8 = "created";
        } else {
            str8 = "deleted";
        }
        OW8 ow8 = new OW8(oKl, r27, str9, str2, str10, str8, str12, str4, str5);
        1OS r8 = new 1OS(A042);
        r8.A01 = directThreadKey2;
        r8.A02 = str9;
        r8.A05 = z5;
        r8.A04 = z3;
        r8.A03 = z4;
        r8.A00 = ow8;
        if (str7 != null) {
            A002.A05(str10, true);
        }
        String str16 = r8.A05;
        if (z3) {
            C282375Cv r1 = this.A04;
            String createTraceIdForType = TraceLogger.createTraceIdForType(13);
            if (createTraceIdForType != null) {
                r1.A04((List) null, 13, createTraceIdForType);
            }
            str11 = createTraceIdForType;
            if (createTraceIdForType != null) {
                A0A(this, createTraceIdForType, str16, directThreadKey2.A00, 13, z5, true);
            }
        }
        OYx oYx = O58.A01;
        OYx.A00(userSession, r8.A05.hashCode(), OYx.A01(userSession, r8), true);
        oYx.A02(userSession, r8, str11);
        1Ou.A01(userSession).A0A(r8);
        C3265677h.A0g(userSession, directThreadKey2, 2FW.A0m, str16, r8.A02.A09);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(com.instagram.model.direct.DirectShareTarget r19, X.AnonymousClass3Q2 r20, java.lang.String r21) {
        /*
            r18 = this;
            r2 = 2
            r10 = r18
            com.instagram.common.session.UserSession r5 = r10.A03
            X.2Dm r0 = X.1bJ.A00(r5)
            r8 = r19
            X.3U9 r12 = r0.BYf(r8)
            com.instagram.model.direct.DirectThreadKey r14 = X.AnonymousClass48N.A03(r12)
            java.lang.String r4 = r8.A0G
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0052
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x001f:
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x0143
            int r7 = r0.intValue()
            com.instagram.direct.prompts.DirectPromptTypes r1 = X.AnonymousClass79B.A00(r7)
            X.NyN r0 = X.C70169NyN.$redex_init_class
            int r1 = r1.ordinal()
            r3 = 0
            if (r1 == r3) goto L_0x013b
            r6 = r21
            if (r1 == r2) goto L_0x0078
            r0 = 6
            r11 = r20
            if (r1 == r0) goto L_0x005a
            if (r20 == 0) goto L_0x0054
            X.5yB r2 = X.C63326Kv9.A00(r11)
            X.C63387Kw8.A00(r11)
            long r0 = X.C17154VKg.A00
            r11.A0V = r0
            if (r4 != 0) goto L_0x0083
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0052:
            r0 = 0
            goto L_0x001f
        L_0x0054:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x005a:
            if (r20 == 0) goto L_0x0070
            X.1ud r1 = X.1ua.A0G
            android.content.Context r0 = r10.A02
            X.1ua r0 = r1.A01(r0, r5)
            X.5yB r2 = X.LTU.A03(r5, r14, r11, r0)
            X.C63387Kw8.A00(r11)
            long r0 = X.C17154VKg.A00
            r11.A0V = r0
            goto L_0x0083
        L_0x0070:
            if (r21 != 0) goto L_0x0082
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0078:
            if (r4 == 0) goto L_0x0135
            if (r21 != 0) goto L_0x0082
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0082:
            r2 = 0
        L_0x0083:
            r9 = 0
            int r1 = r12.C6a()
            r0 = 29
            if (r1 == r0) goto L_0x00ee
            int r1 = r12.C6a()
            r0 = 28
            if (r1 == r0) goto L_0x00ee
            int r1 = r12.C6a()
            r0 = 61
            if (r1 == r0) goto L_0x00ee
            java.lang.Class<X.1kO> r1 = X.C66171kO.class
            X.ODs r0 = X.OQO.A00(r5, r14)
            X.MaY r13 = X.C66669Mac.A02(r5, r0, r1)
            android.content.Context r0 = r10.A02
            r1 = 2131959071(0x7f131d1f, float:1.9554772E38)
            java.lang.String r1 = r0.getString(r1)
            X.0qQ.A07(r1)
            java.lang.Long r15 = X.OQO.A01(r5, r14)
            long r16 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r10
            java.lang.String r8 = r8.A0M
            r10 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r0 = r0.getString(r10)
            X.0qQ.A07(r0)
            X.1kO r12 = new X.1kO
            r12.<init>(r13, r14, r15, r16)
            r12.A03 = r4
            r12.A00 = r7
            r12.A01 = r2
            X.0qQ.A0B(r14, r3)
            r12.A02 = r14
            r12.A04 = r6
            java.lang.String r4 = ""
            r12.A02 = r4
            if (r2 == 0) goto L_0x0123
            java.lang.String r2 = r2.A06
            if (r2 != 0) goto L_0x0123
            java.lang.String r1 = "Invalid DirectPendingVisualMedia object with null PendingMediaKey"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.Class<X.1kT> r1 = X.AnonymousClass1kT.class
            X.ODs r0 = X.OQO.A00(r5, r14)
            X.MaY r13 = X.C66669Mac.A02(r5, r0, r1)
            int r9 = r12.C6a()
            int r8 = r12.AdN()
            java.lang.Long r15 = X.OQO.A01(r5, r14)
            long r16 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r0
            X.1kT r12 = new X.1kT
            r12.<init>(r13, r14, r15, r16)
            r12.A03 = r4
            r12.A00 = r7
            r12.A01 = r2
            X.0qQ.A0B(r14, r3)
            r12.A02 = r14
            r12.A04 = r6
            r12.A01 = r9
            r12.A00 = r8
            goto L_0x012d
        L_0x0123:
            r12.A03 = r1
            r12.A01 = r9
            r12.A04 = r8
            r12.A02 = r0
            r12.A00 = r3
        L_0x012d:
            X.1Ou r0 = X.1Ou.A01(r5)
            r0.A0A(r12)
            return
        L_0x0135:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x013b:
            java.lang.String r1 = "Share target has unknown prompt type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A0H(com.instagram.model.direct.DirectShareTarget, X.3Q2, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r0.A06 != true) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C254783t2 r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r15 = this;
            r0 = 0
            r1 = r16
            X.0qQ.A0B(r1, r0)
            r2 = 1
            r7 = r17
            X.0qQ.A0B(r7, r2)
            r0 = 2
            r6 = r18
            X.0qQ.A0B(r6, r0)
            X.3t1 r0 = X.AnonymousClass6W3.A01(r1)
            com.instagram.model.direct.DirectThreadKey r5 = X.AnonymousClass6W4.A01(r0)
            com.instagram.common.session.UserSession r9 = r15.A03
            X.2Dm r0 = X.1bJ.A00(r9)
            X.3su r1 = r0.BRz(r5, r7)
            if (r1 == 0) goto L_0x0073
            X.N4L r0 = r1.A0D
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.A06
            r4 = 1
            if (r0 == r2) goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            java.lang.Class<X.1lu> r11 = X.C66311lu.class
            boolean r14 = r1.A2P
            r12 = 0
            X.ODs r10 = r1.A0M()
            r13 = r12
            X.MaY r8 = X.C66669Mac.A04(r9, r10, r11, r12, r13, r14)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A0V()
            java.lang.String r0 = r0.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            boolean r2 = r1.A1S()
            r0 = 4
            X.0qQ.A0B(r3, r0)
            X.1mj r1 = new X.1mj
            r1.<init>(r8)
            r0 = -1
            r1.A00 = r0
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r1.A01 = r5
            r1.A04 = r7
            r1.A02 = r3
            r1.A03 = r6
            r0 = r19
            r1.A00 = r0
            r1.A06 = r2
            r1.A05 = r4
            X.1Ou r0 = X.1Ou.A01(r9)
            r0.A0A(r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A0J(X.3t2, java.lang.String, java.lang.String, int):void");
    }

    public final void A0L(C254743sy r6, String str, List list, List list2, boolean z) {
        C69442Nlm nlm;
        0qQ.A0B(r6, 0);
        0qQ.A0B(list, 2);
        0qQ.A0B(list2, 3);
        DirectThreadKey A032 = C66647MaG.A03(r6);
        UserSession userSession = this.A03;
        C66665MaY A022 = C66669Mac.A02(userSession, OQO.A00(userSession, A032), C66301lq.class);
        0qQ.A0B(A032, 2);
        1OS r1 = new 1OS(A022);
        r1.A00 = A032;
        r1.A02 = list;
        r1.A01 = list2;
        1Ou.A01(userSession).A0A(r1);
        AnonymousClass0kM r12 = new AnonymousClass0kM(userSession);
        r12.A01 = "direct_thread";
        0wc A002 = r12.A00();
        0Aj A003 = A002.A00(A002.A00, "direct_delete_message");
        if (A003.isSampled()) {
            A003.AAJ("action", "done");
            A003.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(A032)));
            if (z) {
                nlm = C69442Nlm.DIALOG;
            } else {
                nlm = C69442Nlm.BULK_SELECTION;
            }
            A003.A8M(nlm, C66579MXk.A00(356));
            A003.AAJ("open_thread_id", C67003Mgb.A01(A032));
            A003.A9F("occamadillo_thread_id", C67003Mgb.A00(A032));
            A003.AAJ("message_id", str);
            A003.AAe(AnonymousClass000.A00(3593), list);
            A003.Cgf();
        }
    }

    public final void AGJ(AnonymousClass0iw r10, C254703su r11, DirectThreadKey directThreadKey) {
        Pair A012;
        String str;
        0qQ.A0B(directThreadKey, 0);
        UserSession userSession = this.A03;
        2Dm A002 = 1bJ.A00(userSession);
        String str2 = r11.A1f;
        2FW r2 = r11.A10;
        if (str2 != null) {
            0qQ.A07(r2);
            C3265677h.A0m(userSession, C3265677h.A04(r2, r11.A1T, r11.A2F), r11.A0f());
            if (!r11.A2F) {
                2FW r22 = r11.A10;
                C70169NyN nyN = C70169NyN.$redex_init_class;
                int ordinal = r22.ordinal();
                if (ordinal == 4) {
                    C331377Qt r0 = r11.A0w;
                    if (r0 != null) {
                        str = r0.A03;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (ordinal == 3) {
                    C300925yB r02 = r11.A0v;
                    if (r02 != null) {
                        str = r02.A06;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (str != null) {
                    1ua.A0G.A01(this.A02, userSession).A07(r10, str, false);
                }
            }
            1Ou A013 = 1Ou.A01(userSession);
            synchronized (A013) {
                AnonymousClass5DE r1 = A013.A0A;
                synchronized (r1) {
                    A012 = r1.A01(str2);
                }
                if (A012 != null) {
                    1Ou.A05(A013, (1OS) A012.first, (C74248Prc) A012.second);
                } else {
                    A07(r11, this, directThreadKey, "DirectSendMessageManager_cancel_mutation_not_found");
                }
            }
        } else if (r2 == 2FW.A1A) {
            C300925yB r03 = r11.A0v;
            if (r03 != null) {
                String str3 = r03.A06;
                if (str3 != null) {
                    1ua.A0G.A01(this.A02, userSession).A07(r10, str3, false);
                    A002.EE5(directThreadKey, r11.A0g(), r11.A0f());
                    2FW r23 = r11.A10;
                    0qQ.A07(r23);
                    C3265677h.A0m(userSession, C3265677h.A04(r23, r11.A1T, r11.A2F), r11.A0f());
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            0qQ.A07(r2);
            C3265677h.A0m(userSession, C3265677h.A04(r2, r11.A1T, r11.A2F), r11.A0f());
            A07(r11, this, directThreadKey, "DirectSendMessageManager_cancel");
        }
    }

    public final synchronized boolean BJG() {
        return this.A00;
    }

    public final synchronized Integer CHQ() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r0 != null) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EJF(android.content.Context r10, X.AnonymousClass0iw r11, X.C254703su r12, com.instagram.model.direct.DirectThreadKey r13) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r6 = 4
            r5 = 3
            r2 = 57
            java.lang.Integer r1 = r12.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x007c
            com.instagram.common.session.UserSession r4 = r9.A03
            X.2Dm r3 = X.1bJ.A00(r4)
            long r7 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r12.A1A(r0)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r13)
            r1 = 0
            java.lang.Long r0 = X.OQO.A01(r4, r0)
            r12.A19(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A9g(r12, r1, r13, r0)
            java.lang.String r3 = r12.A1f
            X.2FW r7 = r12.A10
            X.0qQ.A07(r7)
            java.lang.Object r1 = r12.A1T
            boolean r0 = r12.A2F
            java.lang.String r1 = X.C3265677h.A04(r7, r1, r0)
            java.lang.String r0 = r12.A0f()
            if (r3 == 0) goto L_0x008e
            X.C3265677h.A0h(r4, r13, r1, r0)
            boolean r0 = r12.A2F
            if (r0 != 0) goto L_0x009c
            X.2FW r1 = r12.A10
            X.NyN r0 = X.C70169NyN.$redex_init_class
            int r0 = r1.ordinal()
            java.lang.String r1 = "Required value was null."
            if (r0 == r6) goto L_0x0087
            if (r0 == r5) goto L_0x007d
            if (r0 != r2) goto L_0x009c
            X.5yB r0 = r12.A0v
            if (r0 == 0) goto L_0x009c
        L_0x0063:
            java.lang.String r2 = r0.A06
        L_0x0065:
            if (r2 == 0) goto L_0x009c
            X.1ud r1 = X.1ua.A0G
            android.content.Context r0 = r9.A02
            X.1ua r0 = r1.A01(r0, r4)
            boolean r0 = r0.A0L(r11, r2)
            if (r0 != 0) goto L_0x00a6
            X.4gN r1 = X.C63565KzE.A02
            java.lang.String r0 = "DirectSendMessageManager_retry_media_not_found"
        L_0x0079:
            A06(r12, r9, r1, r13, r0)
        L_0x007c:
            return
        L_0x007d:
            X.5yB r0 = r12.A0v
            if (r0 != 0) goto L_0x0063
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0087:
            X.7Qt r0 = r12.A0w
            if (r0 == 0) goto L_0x0096
            java.lang.String r2 = r0.A03
            goto L_0x0065
        L_0x008e:
            X.C3265677h.A0h(r4, r13, r1, r0)
            X.4gN r1 = X.C270214gN.A0T
            java.lang.String r0 = "DirectSendMessageManager_retry"
            goto L_0x0079
        L_0x0096:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x009c:
            X.1Ou r1 = X.1Ou.A01(r4)
            X.PD1 r0 = new X.PD1
            r0.<init>(r12, r9, r13)
            goto L_0x00af
        L_0x00a6:
            X.1Ou r1 = X.1Ou.A01(r4)
            X.PD0 r0 = new X.PD0
            r0.<init>(r12, r9, r13)
        L_0x00af:
            X.PtE r0 = (X.C74338PtE) r0
            r1.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.EJF(android.content.Context, X.0iw, X.3su, com.instagram.model.direct.DirectThreadKey):void");
    }

    public final void ELJ(Context context, UserSession userSession, C317966o8 r15, C254933tI r16, C254743sy r17, String str, boolean z) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r15, 3);
        C254743sy r0 = r17;
        DirectThreadKey A032 = C66647MaG.A03(r0);
        UserSession userSession2 = this.A03;
        boolean z2 = this.A00;
        C70621ODs A002 = OQO.A00(userSession2, A032);
        0qQ.A0B(A032, 2);
        1bp r6 = new 1bp(C66669Mac.A06(userSession2, A002, C66071jB.class, str, z, z2), A032, OQO.A01(userSession2, r0), System.currentTimeMillis() * 1000);
        r6.A03 = A032;
        r6.A00 = userSession2;
        String str2 = r15.A0U;
        if (str2 == null) {
            str2 = "";
        }
        r6.A04 = str2;
        String str3 = r15.A0S;
        boolean z3 = false;
        0qQ.A0B(str3, 0);
        r6.A05 = str3;
        ImageUrl imageUrl = r15.A0H;
        0qQ.A0B(imageUrl, 0);
        r6.A01 = imageUrl;
        r6.A02 = r16;
        1Ou.A01(userSession2).A0A(r6);
        C313756gx A003 = C313746gw.A00(userSession2);
        String str4 = A032.A00;
        2FW r2 = 2FW.A0I;
        if (r16 != null) {
            z3 = true;
        }
        A003.A0H(r2, this.A01, str4, z3);
    }

    public final void ELL(Context context, UserSession userSession, C254933tI r29, DirectAnimatedMedia directAnimatedMedia, C254783t2 r31, String str, String str2, List list, boolean z) {
        Boolean bool;
        DirectAnimatedMedia directAnimatedMedia2 = directAnimatedMedia;
        0qQ.A0B(directAnimatedMedia2, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 6);
        DirectThreadKey A012 = AnonymousClass6W4.A01(AnonymousClass6W3.A01(r31));
        C70621ODs A002 = OQO.A00(userSession2, A012);
        if (A002 != null) {
            bool = Boolean.valueOf(C70054NwW.A00(A002));
        } else {
            bool = null;
        }
        boolean z2 = z;
        boolean z3 = z2;
        boolean A003 = AnonymousClass796.A02(userSession2, A012, bool, AnonymousClass05K.A06, z3, false, false).A00();
        String A032 = A03(this, A003);
        UserSession userSession3 = this.A03;
        AnonymousClass7UH A004 = AnonymousClass7UG.A00(userSession3);
        String str3 = str2;
        if (str2 != null) {
            A004.A03(str3, false);
            IGFOAMessagingLocalSendSpeedLogger A005 = C328727Fx.A00(userSession2, Integer.valueOf(str3.hashCode()));
            if (A005 != null) {
                A005.onLogTransportMessageEnd();
                A005.onLogSendServiceStart();
            }
        }
        C66665MaY A033 = C66669Mac.A03(userSession2, A002, 1fV.class, (String) null, str, str3, z3, this.A00);
        A08(this, A012, A033.A03, A032, (String) null, 3, 1, z2, A003);
        1bp r17 = new 1bp(A033, A012, OQO.A01(userSession2, A012), System.currentTimeMillis() * 1000);
        r17.A03 = directAnimatedMedia2;
        r17.A01 = r29;
        if (str2 != null) {
            A004.A05(str3, true);
        }
        A0B(this, A032, r17.A06(), A012.A00, 3, z2, A003);
        1Ou.A01(userSession3).A0A(r17);
        C313756gx A006 = C313746gw.A00(userSession3);
        String str4 = A012.A00;
        2FW r3 = 2FW.A0K;
        boolean z4 = false;
        if (r29 != null) {
            z4 = true;
        }
        A006.A0H(r3, this.A01, str4, z4);
        C3265677h.A0g(userSession3, A012, r3, r17.A06(), r17.A02.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r19.A05() != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ELQ(android.content.Context r36, com.instagram.common.session.UserSession r37, X.C317966o8 r38, X.C254933tI r39, X.C254743sy r40, java.lang.String r41, java.util.List r42, boolean r43) {
        /*
            r35 = this;
            r6 = 0
            r0 = r36
            X.0qQ.A0B(r0, r6)
            r15 = 1
            r4 = r37
            X.0qQ.A0B(r4, r15)
            r0 = 4
            r1 = r38
            X.0qQ.A0B(r1, r0)
            if (r40 == 0) goto L_0x00f1
            com.instagram.model.direct.DirectThreadKey r10 = X.C66647MaG.A03(r40)
            X.ODs r30 = X.OQO.A00(r4, r10)
            if (r30 == 0) goto L_0x0118
            boolean r2 = X.C70054NwW.A00(r30)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r2)
        L_0x0026:
            java.lang.Integer r26 = X.AnonymousClass05K.A09
            r19 = r39
            if (r39 == 0) goto L_0x0034
            boolean r2 = r19.A05()
            r28 = 1
            if (r2 == 0) goto L_0x0036
        L_0x0034:
            r28 = 0
        L_0x0036:
            r13 = 0
            r16 = r43
            r23 = r4
            r24 = r10
            r27 = r16
            r29 = r6
            X.797 r2 = X.AnonymousClass796.A02(r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r2.A00()
            r9 = r35
            java.lang.String r12 = A03(r9, r2)
            java.lang.Class<X.1jN> r31 = X.1jN.class
            java.lang.String r33 = X.HZX.A00()
            r32 = r41
            r29 = r4
            r34 = r16
            X.MaY r3 = X.C66669Mac.A04(r29, r30, r31, r32, r33, r34)
            java.lang.String r11 = r3.A03
            r14 = 14
            r17 = r2
            A08(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r7 = r9.A01
            X.7Zk r5 = r9.A06
            boolean r8 = r9.A00
            X.OHr r17 = new X.OHr
            r20 = r9
            r21 = r10
            r22 = r7
            r23 = r12
            r24 = r16
            r25 = r2
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            X.0qQ.A0B(r10, r15)
            com.instagram.common.session.UserSession r4 = r5.A01
            if (r30 == 0) goto L_0x0114
            boolean r2 = X.C70054NwW.A00(r30)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r2)
        L_0x0090:
            r20 = r4
            r23 = r26
            r25 = r6
            r26 = r6
            X.797 r6 = X.AnonymousClass796.A02(r20, r21, r22, r23, r24, r25, r26)
            X.7Zl r4 = r5.A02
            X.Pmv r2 = new X.Pmv
            r20 = r2
            r21 = r1
            r22 = r19
            r23 = r3
            r24 = r5
            r25 = r17
            r26 = r10
            r28 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            X.AxZ r5 = X.C41621AxZ.A00
            r3 = 2
            X.0qQ.A0B(r6, r3)
            X.0qQ.A0B(r5, r0)
            boolean r0 = r6.A00()
            if (r0 != 0) goto L_0x00cc
            java.util.List r0 = r1.A0k
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0108
        L_0x00cc:
            X.7Zm r7 = r4.A02
            com.google.common.collect.ImmutableList r0 = r1.A02()
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f2
            X.AcF r3 = new X.AcF
            r3.<init>(r13, r13, r15)
        L_0x00df:
            X.B1U r3 = (X.B1U) r3
            r8 = 9
            X.Ixb r0 = new X.Ixb
            r7 = r0
            r9 = r10
            r10 = r2
            r11 = r1
            r12 = r6
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3.BNe(r1, r5, r0)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.Integer r3 = r1.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x0102
            com.instagram.common.session.UserSession r0 = r7.A00
            X.Lq8 r3 = new X.Lq8
            r3.<init>(r0)
            goto L_0x00df
        L_0x0102:
            X.AcG r3 = new X.AcG
            r3.<init>(r13, r13, r15)
            goto L_0x00df
        L_0x0108:
            com.instagram.common.session.UserSession r0 = r4.A01
            boolean r0 = X.C64008LIv.A01(r0, r10)
            if (r0 != 0) goto L_0x00cc
            r2.invoke(r13)
            return
        L_0x0114:
            r22 = 0
            goto L_0x0090
        L_0x0118:
            r25 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.ELQ(android.content.Context, com.instagram.common.session.UserSession, X.6o8, X.3tI, X.3sy, java.lang.String, java.util.List, boolean):void");
    }

    public final void ELa(Context context, UserSession userSession, C317966o8 r17, C254933tI r18, C254743sy r19, String str, boolean z) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        C317966o8 r1 = r17;
        0qQ.A0B(r1, 3);
        C254743sy r0 = r19;
        DirectThreadKey A032 = C66647MaG.A03(r0);
        UserSession userSession2 = this.A03;
        boolean z2 = this.A00;
        C70621ODs A002 = OQO.A00(userSession2, A032);
        0qQ.A0B(A032, 2);
        1bp r8 = new 1bp(C66669Mac.A06(userSession2, A002, C66081jF.class, str, z, z2), A032, OQO.A01(userSession2, r0), System.currentTimeMillis() * 1000);
        r8.A02 = A032;
        r8.A00 = userSession2;
        String str2 = r1.A0S;
        0qQ.A0B(str2, 0);
        r8.A04 = str2;
        String url = r1.A0H.getUrl();
        0qQ.A07(url);
        r8.A03 = new ExtendedImageUrl(url, (int) r1.A01, (int) r1.A00);
        r8.A01 = r18;
        1Ou.A01(userSession2).A0A(r8);
        C313756gx A003 = C313746gw.A00(userSession2);
        String str3 = A032.A00;
        2FW r2 = 2FW.A0e;
        boolean z3 = false;
        if (r18 != null) {
            z3 = true;
        }
        A003.A0H(r2, this.A01, str3, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r0.A06 != true) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ELc(X.C254783t2 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r20 = this;
            r0 = 0
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r5 = 1
            X.3t1 r0 = X.AnonymousClass6W3.A01(r1)
            com.instagram.model.direct.DirectThreadKey r7 = X.AnonymousClass6W4.A01(r0)
            r13 = r20
            com.instagram.common.session.UserSession r4 = r13.A03
            X.2Dm r0 = X.1bJ.A00(r4)
            r11 = r22
            X.3su r6 = r0.BRz(r7, r11)
            r8 = 0
            if (r6 == 0) goto L_0x00ae
            java.lang.String r10 = r6.A0f()
            if (r10 == 0) goto L_0x00ae
            X.N4L r0 = r6.A0D
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.A06
            r9 = 1
            if (r0 == r5) goto L_0x0030
        L_0x002f:
            r9 = 0
        L_0x0030:
            java.lang.Class<X.1lu> r16 = X.C66311lu.class
            boolean r1 = r6.A2P
            X.ODs r15 = r6.A0M()
            boolean r0 = r6.A1S()
            r18 = r10
            if (r0 == 0) goto L_0x0042
            r18 = r8
        L_0x0042:
            r17 = r24
            r14 = r4
            r19 = r1
            X.MaY r12 = X.C66669Mac.A04(r14, r15, r16, r17, r18, r19)
            int r0 = r6.A01
            int r2 = r0 + 1
            boolean r1 = r6.A1S()
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.1lu r3 = new X.1lu
            r3.<init>(r12)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r3.A01 = r7
            r3.A04 = r11
            r3.A02 = r10
            r0 = r23
            r3.A03 = r0
            r3.A00 = r2
            r3.A06 = r1
            r3.A05 = r9
            X.OYx r2 = X.O58.A01
            boolean r1 = r6.A1S()
            java.lang.String r0 = r3.A05
            int r0 = r0.hashCode()
            X.OYx.A00(r4, r0, r1, r5)
            r2.A02(r4, r3, r8)
            boolean r0 = r6.A1S()
            if (r0 == 0) goto L_0x00a6
            X.5Cv r0 = r13.A04
            r2 = 13
            java.lang.String r14 = com.facebook.msys.mci.TraceLogger.createTraceIdForType(r2)
            if (r14 == 0) goto L_0x00a6
            r0.A04(r8, r2, r14)
            java.lang.String r15 = r3.A05
            java.lang.String r1 = r7.A00
            boolean r0 = r6.A2P
            r19 = r5
            r16 = r1
            r17 = r2
            r18 = r0
            A0A(r13, r14, r15, r16, r17, r18, r19)
        L_0x00a6:
            X.1Ou r0 = X.1Ou.A01(r4)
            r0.A0A(r3)
            return
        L_0x00ae:
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Failed to send edit message. Error: mutation creation failed"
            r2.AEf(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.ELc(X.3t2, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void ELk(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        1bp r6 = new 1bp(C66669Mac.A04(userSession, OQO.A00(userSession, BJy), AnonymousClass1mn.class, str3, (String) null, z), BJy, OQO.A01(userSession, BJy), System.currentTimeMillis() * 1000);
        r6.A01 = "";
        r6.A00 = str;
        r6.A01 = str2;
        1Ou.A01(userSession).A0A(r6);
    }

    public final void ELt(C60957JuF juF, C70621ODs oDs, 2FW r19, C254743sy r20, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C254743sy r1 = r20;
        0qQ.A0B(r1, 0);
        String str8 = str;
        0qQ.A0B(str8, 1);
        String str9 = str5;
        2FW r4 = r19;
        boolean z5 = z2;
        C70621ODs oDs2 = oDs;
        C60957JuF juF2 = juF;
        boolean z6 = z;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        A0G(juF2, oDs2, C66647MaG.A03(r1), r4, str8, str10, str11, str12, str9, str6, str7, z6, z5, z3, z4);
    }

    public final 1aU EM5(C53401GnY gnY, OCA oca, C254743sy r13, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(str2, 5);
        return 1aU.A06(new C40263AYc(gnY, this, oca, r13, str, str2, str3, list, z));
    }

    public final void EM6(Context context, UserSession userSession, C254743sy r20, C66569MWx mWx, String str, boolean z) {
        String displayArtist;
        C66569MWx mWx2 = mWx;
        0qQ.A0B(mWx2, 3);
        String str2 = str;
        0qQ.A0B(str2, 5);
        C254743sy r0 = r20;
        DirectThreadKey A032 = C66647MaG.A03(r0);
        UserSession userSession2 = this.A03;
        boolean z2 = this.A00;
        C70621ODs A002 = OQO.A00(userSession2, A032);
        0qQ.A0B(A032, 2);
        1bp r11 = new 1bp(C66669Mac.A06(userSession2, A002, AnonymousClass1nX.class, str2, z, z2), A032, OQO.A01(userSession2, r0), System.currentTimeMillis() * 1000);
        r11.A00 = A032;
        r11.A02 = mWx2.getAudioClusterId();
        String title = mWx2.getTitle();
        0qQ.A0B(title, 0);
        r11.A04 = title;
        String formattedClipsMediaCount = mWx2.getFormattedClipsMediaCount();
        if (formattedClipsMediaCount == null || formattedClipsMediaCount.length() == 0) {
            displayArtist = mWx2.getDisplayArtist();
        } else {
            String lowerCase = mWx2.getDisplayArtist().toLowerCase(AnonymousClass1Q2.A02());
            0qQ.A07(lowerCase);
            displayArtist = 002.A0T(lowerCase, mWx2.getFormattedClipsMediaCount(), 183);
        }
        0qQ.A0B(displayArtist, 0);
        r11.A03 = displayArtist;
        String C9F = mWx2.C9F();
        0qQ.A0B(C9F, 0);
        r11.A05 = C9F;
        String url = mWx2.As5().getUrl();
        0qQ.A07(url);
        r11.A01 = new ExtendedImageUrl(url, mWx2.As5().getWidth(), mWx2.As5().getHeight());
        1Ou.A01(userSession2).A0A(r11);
        C313756gx A003 = C313746gw.A00(userSession2);
        String str3 = A032.A00;
        2FW r2 = 2FW.A0j;
        A003.A0H(r2, this.A01, str3, false);
        C3265677h.A0g(userSession2, A032, r2, r11.A06(), r11.A02.A09);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Cw1, java.lang.Object] */
    public final void EMA(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, C254783t2 r17, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        boolean z;
        DirectAnimatedMedia directAnimatedMedia2 = directAnimatedMedia;
        0qQ.A0B(directAnimatedMedia2, 3);
        UserSession userSession = this.A03;
        C66665MaY A08 = C66669Mac.A08(userSession, AnonymousClass1kB.class);
        0qQ.A0B(A08, 1);
        1bp r8 = new 1bp(A08, directThreadKey, OQO.A01(userSession, directThreadKey), System.currentTimeMillis() * 1000);
        String str4 = directAnimatedMedia2.A05;
        Boolean bool = directAnimatedMedia2.A04;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = directAnimatedMedia2.A06;
        GifUrlImpl gifUrlImpl = directAnimatedMedia2.A02;
        0qQ.A0B(str4, 2);
        ? obj = new Object();
        obj.A00 = j;
        obj.A05 = str4;
        obj.A06 = z;
        obj.A07 = z2;
        obj.A03 = str;
        obj.A04 = str2;
        obj.A01 = extendedImageUrl;
        obj.A02 = gifUrlImpl;
        r8.A00 = obj;
        r8.A01 = str3;
        1Ou.A01(userSession).A0A(r8);
    }

    public final void EMB(C317966o8 r17, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        C317966o8 r4 = r17;
        0qQ.A0B(r4, 2);
        UserSession userSession = this.A03;
        DirectThreadKey directThreadKey2 = directThreadKey;
        1Ou.A01(userSession).A0A(new 1kF(r4, C66669Mac.A08(userSession, 1kF.class), directThreadKey2, extendedImageUrl, OQO.A01(userSession, directThreadKey2), str, str2, str3, System.currentTimeMillis() * 1000, j));
    }

    public final ListenableFuture EMH(AnonymousClass9JH r16, C53401GnY gnY, C254933tI r18, OCA oca, C254743sy r20, AnonymousClass3Q2 r21, C352218Cl r22, String str, String str2, String str3, String str4, List list, boolean z) {
        C254743sy r0 = r20;
        0qQ.A0B(r0, 0);
        DirectThreadKey A032 = C66647MaG.A03(r0);
        String str5 = A032.A00;
        2FW r1 = 2FW.A1A;
        boolean z2 = false;
        C254933tI r4 = r18;
        if (r18 != null) {
            z2 = true;
        }
        Boolean A002 = A00(this, r1, str5, z2);
        ListenableFuture Eyk = MoreExecutors.listeningDecorator((ExecutorService) new 0na(20641710, 3, false, false)).Eyk(new C41364Asl(r16, gnY, r4, this, oca, A032, r21, r22, A002, str, str3, str4, z));
        0qQ.A07(Eyk);
        return Eyk;
    }

    public final void EMK(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        1bp r6 = new 1bp(C66669Mac.A04(userSession, OQO.A00(userSession, BJy), C66381md.class, str3, (String) null, z), BJy, OQO.A01(userSession, BJy), System.currentTimeMillis() * 1000);
        r6.A01 = "";
        r6.A00 = str;
        r6.A01 = str2;
        1Ou.A01(userSession).A0A(r6);
    }

    public final void EMO(C254933tI r17, C254743sy r18, String str, String str2, String str3, String str4, String str5) {
        C254743sy r0 = r18;
        DirectThreadKey A032 = C66647MaG.A03(r0);
        UserSession userSession = this.A03;
        boolean z = this.A00;
        C70621ODs A002 = OQO.A00(userSession, A032);
        0qQ.A0B(A032, 6);
        1bp r10 = new 1bp(C66669Mac.A06(userSession, A002, AnonymousClass1er.class, (String) null, false, z), A032, OQO.A01(userSession, r0), System.currentTimeMillis() * 1000);
        r10.A02 = str;
        r10.A03 = str2;
        r10.A04 = str3;
        r10.A01 = A032;
        String str6 = str4;
        r10.A05 = str6;
        r10.A00 = r17;
        String A012 = C71052OaU.A01(userSession, r10, (2FW) null, str6, A032.A00, (String) null);
        OYx oYx = O58.A01;
        OYx.A00(userSession, r10.A05.hashCode(), OYx.A01(userSession, r10), true);
        oYx.A02(userSession, r10, A012);
        1Ou.A01(userSession).A0A(r10);
        C3265677h.A0g(userSession, A032, 2FW.A0y, r10.A06(), r10.A02.A09);
    }

    public final void EMR(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        1bp r6 = new 1bp(C66669Mac.A04(userSession, OQO.A00(userSession, BJy), C66371mZ.class, str3, (String) null, z), BJy, OQO.A01(userSession, BJy), System.currentTimeMillis() * 1000);
        r6.A01 = "";
        r6.A00 = str;
        r6.A01 = str2;
        1Ou.A01(userSession).A0A(r6);
    }

    public final void EMd(C254783t2 r13, String str, String str2, long j) {
        0qQ.A0B(r13, 0);
        DirectThreadKey A012 = AnonymousClass6W4.A01(AnonymousClass6W3.A01(r13));
        UserSession userSession = this.A03;
        if (OQO.A00(userSession, A012) == null) {
            1bp r6 = new 1bp(C66669Mac.A06(userSession, (C70621ODs) null, C66491nb.class, str2, false, this.A00), A012, OQO.A01(userSession, A012), System.currentTimeMillis() * 1000);
            r6.A01 = str;
            r6.A00 = j;
            1Ou.A01(userSession).A0A(r6);
        }
    }

    public final void EMl(C254933tI r14, DirectStoreSticker directStoreSticker, C254783t2 r16, String str) {
        0qQ.A0B(directStoreSticker, 1);
        UserSession userSession = this.A03;
        C66665MaY A062 = C66669Mac.A06(userSession, (C70621ODs) null, C66091jJ.class, str, false, this.A00);
        DirectThreadKey A012 = AnonymousClass6W4.A01(AnonymousClass6W3.A01(r16));
        1bp r7 = new 1bp(A062, A012, OQO.A01(userSession, A012), System.currentTimeMillis() * 1000);
        0qQ.A0B(A012, 0);
        r7.A02 = A012;
        r7.A00 = userSession;
        String str2 = directStoreSticker.A04;
        0qQ.A0B(str2, 0);
        r7.A04 = str2;
        r7.A03 = directStoreSticker;
        r7.A01 = r14;
        1Ou.A01(userSession).A0A(r7);
    }

    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String EMq(Context context, C70766OKm oKm, C254933tI r24, OCA oca, C254743sy r26, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C254743sy r2 = r26;
        0qQ.A0B(r2, 1);
        String str6 = str;
        0qQ.A0B(str6, 2);
        AnonymousClass7UG.A00(this.A03).A05(str6, true);
        return A0D((N49) null, (C70766OKm) null, r24, oca, C66647MaG.A03(r2), (Integer) null, (Integer) null, num, (Long) null, str6, str2, str3, (String) null, (String) null, (String) null, z, false);
    }

    public final 1aU EMs(N49 n49, C70766OKm oKm, C254933tI r23, OCA oca, DirectShareTarget directShareTarget, 2FW r26, C254783t2 r27, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        int hashCode;
        C254783t2 r4 = r27;
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A03;
        AnonymousClass7UH A002 = AnonymousClass7UG.A00(userSession);
        String str8 = str6;
        String str9 = str8;
        String str10 = str;
        if (str6 == null) {
            str9 = str10;
        }
        A002.A03(str9, false);
        if (str6 != null) {
            hashCode = str8.hashCode();
        } else {
            hashCode = str10.hashCode();
        }
        IGFOAMessagingLocalSendSpeedLogger A003 = C328727Fx.A00(userSession, Integer.valueOf(hashCode));
        if (A003 != null) {
            A003.onLogTransportMessageEnd();
            A003.onLogSendServiceStart();
        }
        2Dm A004 = 1bJ.A00(userSession);
        DirectThreadKey A012 = AnonymousClass6W4.A01(AnonymousClass6W3.A01(r4));
        if (A012.A00 == null && A012.A01 == null) {
            DirectShareTarget directShareTarget2 = directShareTarget;
            if (directShareTarget != null) {
                if (A003 != null) {
                    A003.onLogCreateLocalThreadStart();
                }
                A012 = A004.BYf(directShareTarget2).BJz();
                if (A003 != null) {
                    A003.onLogCreateLocalThreadEnd();
                    C254783t2 r0 = directShareTarget2.A09;
                    r0.getClass();
                    A003.annotateOpenThreadId(AnonymousClass4KK.A02(r0));
                }
            }
        }
        return 1aU.A06(new OxU(n49, oKm, r23, this, oca, A012, num3, num4, num5, l, str10, str2, str3, str4, str8, str7, z, z4));
    }

    public final 1aU EMt(C70766OKm oKm, C254933tI r31, OCA oca, DirectShareTarget directShareTarget, 2FW r34, C254783t2 r35, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        C254783t2 r10 = r35;
        0qQ.A0B(r10, 0);
        String str7 = str;
        0qQ.A0B(str7, 2);
        return EMs((N49) null, (C70766OKm) null, r31, (OCA) null, directShareTarget, r34, r10, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str7, str2, str3, (String) null, (String) null, (String) null, (String) null, list, z, false, z2, false);
    }

    public final ListenableFuture EMz(AnonymousClass9JH r17, C53401GnY gnY, C254933tI r19, OCA oca, C254743sy r21, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C254743sy r1 = r21;
        0qQ.A0B(r1, 0);
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 2);
        DirectThreadKey A032 = C66647MaG.A03(r1);
        String str6 = A032.A00;
        2FW r12 = 2FW.A1A;
        boolean z2 = false;
        C254933tI r5 = r19;
        if (r19 != null) {
            z2 = true;
        }
        AnonymousClass9JH r3 = r17;
        C53401GnY gnY2 = gnY;
        OCA oca2 = oca;
        String str7 = str2;
        String str8 = str4;
        String str9 = str5;
        ListenableFuture Eyk = MoreExecutors.listeningDecorator((ExecutorService) new 0na(311177733, 3, false, false)).Eyk(new C41365Asm(r3, gnY2, r5, this, oca2, A032, clipInfo2, A00(this, r12, str6, z2), str7, str8, str9, str, z));
        0qQ.A07(Eyk);
        return Eyk;
    }

    public final void EN1(AnonymousClass9JH r17, C53401GnY gnY, C254933tI r19, OCA oca, C254743sy r21, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 2);
        DirectThreadKey A032 = C66647MaG.A03(r21);
        String str6 = A032.A00;
        2FW r1 = 2FW.A1A;
        boolean z2 = false;
        C254933tI r5 = r19;
        if (r19 != null) {
            z2 = true;
        }
        boolean z3 = z;
        C53401GnY gnY2 = gnY;
        OCA oca2 = oca;
        String str7 = str2;
        String str8 = str4;
        String str9 = str5;
        A01(gnY2, r5, this, oca2, A032, str7, str8, str9, new C41575Awh((AnonymousClass9JH) null, gnY2, r5, this, oca2, A032, clipInfo2, A00(this, r1, str6, z2), str, str7, str8, str9, z3), z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7.A05() != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.ListenableFuture EN4(X.C254933tI r27, X.C254743sy r28, X.C63822L8d r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33, boolean r34) {
        /*
            r26 = this;
            r0 = 0
            r12 = r28
            X.0qQ.A0B(r12, r0)
            com.instagram.model.direct.DirectThreadKey r11 = X.C66647MaG.A03(r12)
            r10 = r26
            com.instagram.common.session.UserSession r1 = r10.A03
            X.ODs r18 = X.OQO.A00(r1, r11)
            if (r18 == 0) goto L_0x00b7
            boolean r2 = X.C70054NwW.A00(r18)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r2)
        L_0x001c:
            java.lang.Integer r22 = X.AnonymousClass05K.A1F
            r7 = r27
            if (r27 == 0) goto L_0x002a
            boolean r2 = r7.A05()
            r24 = 1
            if (r2 == 0) goto L_0x002c
        L_0x002a:
            r24 = 0
        L_0x002c:
            r16 = r34
            r19 = r1
            r20 = r11
            r23 = r16
            r25 = r0
            X.797 r6 = X.AnonymousClass796.A02(r19, r20, r21, r22, r23, r24, r25)
            boolean r2 = r6.A00()
            java.lang.String r14 = A03(r10, r2)
            java.lang.String r5 = r11.A00
            X.2FW r4 = X.2FW.A1k
            r3 = 0
            if (r27 == 0) goto L_0x004a
            r3 = 1
        L_0x004a:
            java.lang.Boolean r19 = A00(r10, r4, r5, r3)
            X.7UH r9 = X.AnonymousClass7UG.A00(r1)
            r13 = r29
            r15 = r32
            if (r32 == 0) goto L_0x0074
            r9.A03(r15, r0)
            int r3 = r15.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r4 = X.C328727Fx.A00(r1, r3)
            if (r4 == 0) goto L_0x0074
            r4.onLogTransportMessageEnd()
            r4.onLogSendServiceStart()
            int r3 = r13.A00
            r4.annotateMediaDurationMs(r3)
        L_0x0074:
            java.lang.Class<X.1fy> r20 = X.C65691fy.class
            r21 = 0
            boolean r3 = r10.A00
            r22 = r30
            r23 = r15
            r24 = r16
            r25 = r3
            r17 = r1
            X.MaY r8 = X.C66669Mac.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r1 = r8.A03
            r22 = 5
            r23 = 1
            r17 = r10
            r18 = r11
            r19 = r1
            r20 = r14
            r25 = r2
            A08(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 1615100382(0x604479de, float:5.6630364E19)
            r3 = 3
            X.0na r1 = new X.0na
            r1.<init>(r4, r3, r0, r0)
            X.3z9 r0 = com.google.common.util.concurrent.MoreExecutors.listeningDecorator((java.util.concurrent.ExecutorService) r1)
            X.Ask r5 = new X.Ask
            r17 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.Eyk(r5)
            X.0qQ.A07(r0)
            return r0
        L_0x00b7:
            r21 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.EN4(X.3tI, X.3sy, X.L8d, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r5.A05() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EN5(X.C254933tI r36, X.C254743sy r37, X.C63822L8d r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.List r42, boolean r43) {
        /*
            r35 = this;
            r2 = 0
            r12 = r37
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r12)
            r14 = r35
            com.instagram.common.session.UserSession r0 = r14.A03
            X.ODs r18 = X.OQO.A00(r0, r1)
            if (r18 == 0) goto L_0x0118
            boolean r3 = X.C70054NwW.A00(r18)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
        L_0x0019:
            java.lang.Integer r22 = X.AnonymousClass05K.A1F
            r5 = r36
            if (r36 == 0) goto L_0x0027
            boolean r3 = r5.A05()
            r24 = 1
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r24 = 0
        L_0x0029:
            r15 = 0
            r27 = r43
            r19 = r0
            r20 = r1
            r23 = r27
            r25 = r2
            X.797 r30 = X.AnonymousClass796.A02(r19, r20, r21, r22, r23, r24, r25)
            boolean r11 = r30.A00()
            java.lang.String r16 = A03(r14, r11)
            java.lang.String r4 = r1.A00
            X.2FW r7 = X.2FW.A1k
            r3 = 0
            if (r36 == 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            java.lang.Boolean r19 = A00(r14, r7, r4, r3)
            X.7UH r4 = X.AnonymousClass7UG.A00(r0)
            r10 = r38
            r3 = r41
            if (r41 == 0) goto L_0x0072
            r4.A03(r3, r2)
            int r2 = r3.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r6 = X.C328727Fx.A00(r0, r2)
            if (r6 == 0) goto L_0x0072
            r6.onLogTransportMessageEnd()
            r6.onLogSendServiceStart()
            int r2 = r10.A00
            r6.annotateMediaDurationMs(r2)
        L_0x0072:
            java.lang.Class<X.1fy> r20 = X.C65691fy.class
            boolean r2 = r14.A00
            r22 = r39
            r17 = r0
            r21 = r15
            r23 = r3
            r24 = r27
            r25 = r2
            X.MaY r6 = X.C66669Mac.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r2 = r6.A03
            r19 = 5
            r9 = 1
            r20 = r14
            r21 = r1
            r22 = r2
            r23 = r16
            r24 = r15
            r25 = r19
            r26 = r9
            r28 = r11
            A08(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            android.content.Context r8 = r14.A02
            int r2 = r2.hashCode()
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            r28 = r8
            r29 = r0
            r31 = r1
            r32 = r10
            r34 = r16
            X.47v r8 = X.LTU.A00(r28, r29, r30, r31, r32, r33, r34)
            java.lang.Long r23 = X.OQO.A01(r0, r12)
            long r24 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 * r12
            X.1fy r2 = new X.1fy
            r20 = r2
            r21 = r6
            r22 = r1
            r20.<init>(r21, r22, r23, r24)
            r2.A01 = r8
            r2.A00 = r5
            if (r41 == 0) goto L_0x00e7
            r4.A05(r3, r9)
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r3 = X.C328727Fx.A00(r0, r3)
            if (r3 == 0) goto L_0x00e7
            r3.onLogDispatchSendMutationStart()
        L_0x00e7:
            java.lang.String r17 = r2.A06()
            java.lang.String r3 = r1.A00
            java.lang.String r5 = r10.A01
            java.io.File r4 = new java.io.File
            r4.<init>(r5)
            long r25 = r4.length()
            r21 = 0
            r23 = r21
            r28 = r11
            r18 = r3
            r20 = r9
            A09(r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            X.1Ou r3 = X.1Ou.A01(r0)
            r3.A0A(r2)
            java.lang.String r3 = r2.A06()
            X.MaY r2 = r2.A02
            boolean r2 = r2.A09
            X.C3265677h.A0g(r0, r1, r7, r3, r2)
            return
        L_0x0118:
            r21 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.EN5(X.3tI, X.3sy, X.L8d, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    public final void EN8(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        1bp r6 = new 1bp(C66669Mac.A04(userSession, OQO.A00(userSession, BJy), C66361mV.class, str3, (String) null, z), BJy, OQO.A01(userSession, BJy), System.currentTimeMillis() * 1000);
        r6.A00 = "";
        r6.A01 = str;
        r6.A00 = str2;
        1Ou.A01(userSession).A0A(r6);
    }

    public final synchronized void EaQ(boolean z) {
        this.A00 = z;
    }

    public final synchronized void Er5(Integer num) {
        0qQ.A0B(num, 0);
        this.A01 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r0.A06 != true) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.ListenableFuture FJE(X.C69668Npq r14, X.C254743sy r15, java.lang.String r16) {
        /*
            r13 = this;
            r7 = r14
            r4 = 0
            r8 = r15
            X.0qQ.A0B(r15, r4)
            r2 = 1
            boolean r0 = r14 instanceof X.C68965Nbs
            if (r0 == 0) goto L_0x0061
            X.Nbs r7 = (X.C68965Nbs) r7
            X.3su r5 = r7.A00
            java.lang.String r9 = r5.A0g()
            if (r9 == 0) goto L_0x0050
            boolean r11 = r5.A1S()
            r6 = r13
            if (r11 == 0) goto L_0x004e
            X.5Cv r3 = r13.A04
            r1 = 13
            java.lang.String r10 = com.facebook.msys.mci.TraceLogger.createTraceIdForType(r1)
            if (r10 == 0) goto L_0x002a
            r0 = 0
            r3.A04(r0, r1, r10)
        L_0x002a:
            r3 = 1237370584(0x49c0c6d8, float:1579227.0)
            r1 = 3
            X.0na r0 = new X.0na
            r0.<init>(r3, r1, r4, r4)
            X.3z9 r1 = com.google.common.util.concurrent.MoreExecutors.listeningDecorator((java.util.concurrent.ExecutorService) r0)
            X.N4L r0 = r5.A0D
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.A06
            r12 = 1
            if (r0 == r2) goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            X.Pcb r4 = new X.Pcb
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.Eyk(r4)
        L_0x004a:
            X.0qQ.A0A(r0)
            return r0
        L_0x004e:
            r10 = 0
            goto L_0x002a
        L_0x0050:
            java.lang.String r1 = "DirectSendMessageManager_message_id_not_found"
            java.lang.String r0 = "Cannot unsend message without id"
            X.0wb.A04(r1, r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.1Ks r0 = new X.1Ks
            r0.<init>(r1)
            goto L_0x004a
        L_0x0061:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.FJE(X.Npq, X.3sy, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A00(X.C333537Zi r2, X.2FW r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            com.instagram.common.session.UserSession r0 = r2.A03
            X.6gx r0 = X.C313746gw.A00(r0)
            r0.A0H(r3, r1, r4, r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0018
            r0 = 1
            if (r5 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A00(X.7Zi, X.2FW, java.lang.String, boolean):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r18.A05() != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass9JH r55, X.C254933tI r56, X.C333537Zi r57, X.OCA r58, X.C69343Nji r59, com.instagram.model.direct.DirectThreadKey r60, com.instagram.pendingmedia.model.ClipInfo r61, java.lang.Boolean r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, boolean r67, boolean r68) {
        /*
            r6 = r57
            com.instagram.common.session.UserSession r0 = r6.A03
            r5 = r60
            X.ODs r37 = X.OQO.A00(r0, r5)
            X.7UH r10 = X.AnonymousClass7UG.A00(r0)
            r3 = 0
            r27 = 0
            r2 = r65
            if (r65 == 0) goto L_0x015e
            r10.A03(r2, r3)
            int r1 = r2.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r15 = X.C328727Fx.A00(r0, r1)
            if (r15 == 0) goto L_0x002c
            r15.onLogTransportMessageEnd()
            r15.onLogSendServiceStart()
        L_0x002c:
            if (r37 == 0) goto L_0x015a
            boolean r1 = X.C70054NwW.A00(r37)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r1)
        L_0x0036:
            java.lang.Integer r22 = X.AnonymousClass05K.A0Y
            r18 = r56
            if (r56 == 0) goto L_0x0044
            boolean r1 = r18.A05()
            r24 = 1
            if (r1 == 0) goto L_0x0046
        L_0x0044:
            r24 = 0
        L_0x0046:
            r43 = r67
            r19 = r0
            r20 = r5
            r23 = r43
            r25 = r3
            X.797 r46 = X.AnonymousClass796.A02(r19, r20, r21, r22, r23, r24, r25)
            boolean r14 = r46.A00()
            java.lang.String r32 = A03(r6, r14)
            com.instagram.pendingmedia.model.constants.ShareType r13 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            java.lang.Class<X.1fi> r39 = X.1fi.class
            boolean r1 = r6.A00
            r38 = r62
            r41 = r64
            r36 = r0
            r40 = r27
            r42 = r2
            r44 = r1
            X.MaY r11 = X.C66669Mac.A01(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            java.lang.String r1 = r11.A03
            r35 = 4
            r12 = 1
            r23 = r6
            r24 = r5
            r25 = r1
            r26 = r32
            r28 = r35
            r29 = r12
            r30 = r43
            r31 = r14
            A08(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            android.content.Context r7 = r6.A02
            X.1ud r4 = X.1ua.A0G
            X.1ua r50 = r4.A01(r7, r0)
            int r1 = r1.hashCode()
            java.lang.Integer r51 = java.lang.Integer.valueOf(r1)
            r24 = 0
            r1 = r61
            r52 = r63
            r44 = r7
            r45 = r0
            r47 = r5
            r48 = r1
            r49 = r13
            r53 = r32
            r54 = r27
            X.5yB r4 = X.LTU.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            java.lang.String r9 = r1.A0F
            if (r9 == 0) goto L_0x00e4
            X.Kp0 r7 = X.C59737JVv.A00(r7, r0, r9, r3)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r8 = r4.A00
            if (r7 == 0) goto L_0x0156
            java.lang.String r21 = r7.A01()
            java.lang.String r27 = r7.A02()
        L_0x00c6:
            java.lang.String r26 = X.C59737JVv.A03(r9)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r19 = r7
            r20 = r24
            r22 = r24
            r23 = r24
            r25 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r8.A00(r7)
        L_0x00e4:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r8 = r1.A0B
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r4.A00
            r8.A00(r7)
            java.lang.Long r26 = X.OQO.A01(r0, r5)
            long r28 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r28 = r28 * r7
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r3)
            X.1fi r3 = new X.1fi
            r30 = r68
            r17 = r55
            r20 = r58
            r21 = r59
            r27 = r66
            r19 = r11
            r22 = r4
            r23 = r5
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            if (r65 == 0) goto L_0x0117
            r10.A05(r2, r12)
        L_0x0117:
            java.lang.String r33 = r3.A06()
            java.lang.String r2 = r5.A00
            int r4 = r1.A06
            long r9 = (long) r4
            int r4 = r1.A09
            long r7 = (long) r4
            long r41 = r1.A00()
            r30 = r6
            r31 = r24
            r34 = r2
            r36 = r12
            r37 = r9
            r39 = r7
            r44 = r14
            A09(r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r44)
            if (r15 == 0) goto L_0x013d
            r15.onLogDispatchSendMutationStart()
        L_0x013d:
            X.1Ou r1 = X.1Ou.A01(r0)
            r1.A0A(r3)
            java.lang.String r4 = r3.A06()
            X.1iA r1 = X.1iA.A0Q
            java.lang.String r2 = X.C63226KtX.A00(r1, r13)
            X.MaY r1 = r3.A02
            boolean r1 = r1.A09
            X.C3265677h.A0i(r0, r5, r2, r4, r1)
            return
        L_0x0156:
            r21 = r27
            goto L_0x00c6
        L_0x015a:
            r21 = r27
            goto L_0x0036
        L_0x015e:
            r15 = r27
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A04(X.9JH, X.3tI, X.7Zi, X.OCA, X.Nji, com.instagram.model.direct.DirectThreadKey, com.instagram.pendingmedia.model.ClipInfo, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r19.A05() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass9JH r48, X.C254933tI r49, X.C333537Zi r50, X.OCA r51, com.instagram.model.direct.DirectThreadKey r52, X.AnonymousClass3Q2 r53, X.C352218Cl r54, java.lang.Boolean r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, boolean r59, boolean r60) {
        /*
            r1 = r57
            if (r57 != 0) goto L_0x0008
            java.lang.String r1 = X.HZX.A00()
        L_0x0008:
            r3 = r50
            com.instagram.common.session.UserSession r0 = r3.A03
            r2 = r52
            X.ODs r40 = X.OQO.A00(r0, r2)
            X.7UH r4 = X.AnonymousClass7UG.A00(r0)
            r9 = 0
            r4.A03(r1, r9)
            int r5 = r1.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r16 = X.C328727Fx.A00(r0, r5)
            if (r16 == 0) goto L_0x002e
            r16.onLogTransportMessageEnd()
            r16.onLogSendServiceStart()
        L_0x002e:
            com.instagram.pendingmedia.model.constants.ShareType r11 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r19 = r49
            if (r49 == 0) goto L_0x003c
            boolean r5 = r19.A05()
            r28 = 1
            if (r5 == 0) goto L_0x003e
        L_0x003c:
            r28 = 0
        L_0x003e:
            if (r40 == 0) goto L_0x011d
            boolean r5 = X.C70054NwW.A00(r40)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r5)
        L_0x0048:
            java.lang.Integer r26 = X.AnonymousClass05K.A0N
            r22 = 0
            r34 = r59
            r23 = r0
            r24 = r2
            r27 = r34
            r29 = r9
            X.797 r36 = X.AnonymousClass796.A02(r23, r24, r25, r26, r27, r28, r29)
            boolean r5 = r36.A00()
            java.lang.String r23 = A03(r3, r5)
            java.lang.Class<X.1fi> r42 = X.1fi.class
            boolean r6 = r3.A00
            r41 = r55
            r44 = r56
            r39 = r0
            r43 = r22
            r45 = r1
            r46 = r34
            r47 = r6
            X.MaY r8 = X.C66669Mac.A01(r39, r40, r41, r42, r43, r44, r45, r46, r47)
            java.lang.String r6 = r8.A03
            r18 = r6
            r26 = 2
            r7 = 1
            r27 = r3
            r28 = r2
            r29 = r6
            r30 = r23
            r31 = r22
            r32 = r26
            r33 = r7
            r35 = r5
            A08(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.String r6 = r2.A00
            r17 = r6
            r6 = r54
            int r10 = r6.A06
            long r14 = (long) r10
            int r10 = r6.A09
            long r12 = (long) r10
            java.io.File r10 = r6.A03()
            long r32 = r10.length()
            r21 = r3
            r24 = r1
            r25 = r17
            r27 = r7
            r28 = r14
            r30 = r12
            A09(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)
            android.content.Context r3 = r3.A02
            X.1ud r5 = X.1ua.A0G
            X.1ua r40 = r5.A01(r3, r0)
            int r5 = r18.hashCode()
            java.lang.Integer r42 = java.lang.Integer.valueOf(r5)
            r38 = r53
            r34 = r3
            r35 = r0
            r37 = r2
            r39 = r11
            r41 = r6
            r43 = r23
            X.5yB r23 = X.LTU.A02(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            java.lang.Long r27 = X.OQO.A01(r0, r2)
            long r29 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 * r5
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r9)
            X.1fi r5 = new X.1fi
            r21 = r51
            r28 = r58
            r31 = r60
            r18 = r48
            r25 = r22
            r17 = r5
            r20 = r8
            r24 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)
            r4.A05(r1, r7)
            if (r16 == 0) goto L_0x0104
            r16.onLogDispatchSendMutationStart()
        L_0x0104:
            X.1Ou r1 = X.1Ou.A01(r0)
            r1.A0A(r5)
            X.1iA r1 = X.1iA.A0Q
            java.lang.String r4 = X.C63226KtX.A00(r1, r11)
            java.lang.String r3 = r5.A06()
            X.MaY r1 = r5.A02
            boolean r1 = r1.A09
            X.C3265677h.A0i(r0, r2, r4, r3, r1)
            return
        L_0x011d:
            r25 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A05(X.9JH, X.3tI, X.7Zi, X.OCA, com.instagram.model.direct.DirectThreadKey, X.3Q2, X.8Cl, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static final void A06(C254703su r6, C333537Zi r7, C270214gN r8, DirectThreadKey directThreadKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to retry message: type=");
        sb.append(r6.A10);
        sb.append(AnonymousClass000.A00(1988));
        sb.append(r8);
        0wb.A04(str, sb.toString(), 1);
        UserSession userSession = r7.A03;
        0qQ.A0B(r8, 3);
        2Dr A002 = 1bJ.A00(userSession);
        synchronized (A002) {
            if (!2PP.A00(r6.A0r, r8)) {
                C270214gN r2 = r6.A0r;
                C270214gN r0 = C270214gN.A0P;
                if (r2 != null || r8 != r0) {
                    r6.A2C = true;
                    r6.A0r = r8;
                }
            }
            Integer num = AnonymousClass05K.A0Y;
            Integer num2 = AnonymousClass05K.A0C;
            if (r6.A1m(num)) {
                1Ng r02 = A002.A06;
                List singletonList = Collections.singletonList(r6);
                0qQ.A07(singletonList);
                r02.A00(new 2Kb(directThreadKey, num2, (List) null, (List) null, singletonList, false));
                2Dr.A0F(A002, A002.A0P(directThreadKey));
            }
        }
    }

    public static final void A07(C254703su r3, C333537Zi r4, DirectThreadKey directThreadKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to cancel message: type=");
        sb.append(r3.A10);
        0wb.A04(str, sb.toString(), 1);
        1bJ.A00(r4.A03).EE5(directThreadKey, r3.A0g(), r3.A0f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r2.A0M() != true) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C333537Zi r16, com.instagram.model.direct.DirectThreadKey r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, boolean r23, boolean r24) {
        /*
            r0 = r16
            com.instagram.common.session.UserSession r2 = r0.A03
            r5 = r24
            boolean r0 = X.OQP.A01(r2, r5)
            if (r0 == 0) goto L_0x0073
            r3 = r17
            java.lang.String r11 = r3.A00
            r7 = r18
            int r8 = r7.hashCode()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 1
            X.Nhw r4 = X.AnonymousClass7G0.A01(r2, r0, r8, r5, r1)
            if (r4 == 0) goto L_0x0073
            r4.onStartFlow()
            r9 = r19
            if (r19 == 0) goto L_0x002c
            r4.onLogFlowConnectId()
            r4.onLogArmadilloTlcControlOpenThread()
        L_0x002c:
            X.2Dm r0 = X.1bJ.A00(r2)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r2 = X.2Dr.A03(r0, r3)
            r6 = 4
            if (r24 == 0) goto L_0x003b
            r6 = 15
        L_0x003b:
            r10 = 3
            if (r2 == 0) goto L_0x0077
            X.ODs r0 = r2.B25()
            if (r0 == 0) goto L_0x0077
            boolean r12 = X.C70054NwW.A00(r0)
        L_0x0048:
            boolean r0 = r2.CUG()
            if (r0 != r1) goto L_0x007b
            java.lang.String r14 = "group"
        L_0x0050:
            if (r24 == 0) goto L_0x0074
            r0 = 301(0x12d, float:4.22E-43)
            java.lang.String r15 = X.C273654mx.A00(r0)
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            boolean r0 = r2.A0M()
            r17 = 1
            if (r0 == r1) goto L_0x0064
        L_0x0062:
            r17 = 0
        L_0x0064:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r22)
            r13 = r23
            r16 = r5
            r4.logTraceAnnotations(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0073:
            return
        L_0x0074:
            java.lang.String r15 = "ig_django"
            goto L_0x0058
        L_0x0077:
            r12 = 0
            if (r2 == 0) goto L_0x007b
            goto L_0x0048
        L_0x007b:
            java.lang.String r14 = "one_to_one"
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A08(X.7Zi, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public final void A0F(ImageUrl imageUrl, AnonymousClass3Q2 r19, String str, String str2, String str3, String str4, long j) {
        C70621ODs oDs;
        Integer num;
        PendingRecipient pendingRecipient = new PendingRecipient(imageUrl, str2, str3);
        DirectShareTarget directShareTarget = new DirectShareTarget(pendingRecipient);
        UserSession userSession = this.A03;
        2Dr A002 = 1bJ.A00(userSession);
        DirectThreadKey BJy = A002.BYf(directShareTarget).BJz();
        AnonymousClass3U9 A032 = 2Dr.A03(A002, BJy);
        Boolean bool = null;
        if (A032 != null) {
            oDs = A032.B25();
        } else {
            oDs = null;
        }
        AnonymousClass3Q2 r3 = r19;
        if (r3.A12()) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0N;
        }
        if (oDs != null) {
            bool = Boolean.valueOf(C70054NwW.A00(oDs));
        }
        r3.A5D = AnonymousClass796.A02(userSession, BJy, bool, num, false, false, false).A00();
        1Ou.A01(userSession).A0A(new 1k3(C66669Mac.A02(userSession, oDs, 1k3.class), C63326Kv9.A00(r3), BJy, new ExtendedImageUrl(pendingRecipient.A03), OQO.A01(userSession, BJy), pendingRecipient.A0C, str, str4, j, System.currentTimeMillis() * 1000));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006f, code lost:
        if (r6.length() == 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(com.instagram.model.direct.DirectThreadKey r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r23 = this;
            r5 = r26
            r6 = r25
            r8 = 0
            r0 = 6
            r4 = r28
            X.0qQ.A0B(r4, r0)
            r0 = 9
            r3 = r31
            X.0qQ.A0B(r3, r0)
            r0 = 10
            r2 = r32
            X.0qQ.A0B(r2, r0)
            r11 = r23
            java.lang.String r14 = A03(r11, r8)
            com.instagram.common.session.UserSession r1 = r11.A03
            java.lang.Class<X.1f3> r7 = X.AnonymousClass1f3.class
            r12 = r24
            X.ODs r0 = X.OQO.A00(r1, r12)
            r15 = 0
            X.MaY r0 = X.C66669Mac.A02(r1, r0, r7)
            java.lang.String r13 = r0.A03
            r16 = 7
            r17 = 1
            r19 = r8
            r18 = r8
            A08(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Long r20 = X.OQO.A01(r1, r12)
            long r21 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r9
            X.1d1 r7 = new X.1d1
            r17 = r7
            r18 = r0
            r19 = r12
            r17.<init>(r18, r19, r20, r21)
            r9 = r27
            r7.A04 = r9
            r7.A03 = r4
            r0 = r29
            r7.A02 = r0
            r7.A01 = r3
            r3 = r30
            r7.A00 = r3
            r7.A06 = r2
            r2 = r33
            r7.A05 = r2
            if (r25 == 0) goto L_0x0071
            int r3 = r6.length()
            r2 = 0
            if (r3 != 0) goto L_0x0072
        L_0x0071:
            r2 = 1
        L_0x0072:
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0077
            r6 = r3
        L_0x0077:
            if (r26 == 0) goto L_0x007f
            int r2 = r5.length()
            if (r2 != 0) goto L_0x0080
        L_0x007f:
            r5 = r3
        L_0x0080:
            int r2 = r4.length()
            if (r2 == 0) goto L_0x00db
            if (r29 == 0) goto L_0x00db
            int r2 = r0.length()
            if (r2 == 0) goto L_0x00db
            if (r27 == 0) goto L_0x00db
            int r2 = r9.length()
            if (r2 == 0) goto L_0x00db
            java.util.Locale r3 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r9}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "https://www.instagram.com/_n/business_order?merchant_id=%s&consumer_id=%s&order_id=%s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            X.0qQ.A07(r0)
        L_0x00aa:
            X.3tC r0 = X.C71152OeO.A0J(r6, r5, r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.A07 = r0
            java.lang.String r15 = r7.A06()
            java.lang.String r0 = r12.A00
            r13 = r11
            r17 = r16
            r18 = r8
            r19 = r8
            r16 = r0
            A0B(r13, r14, r15, r16, r17, r18, r19)
            X.1Ou r0 = X.1Ou.A01(r1)
            r0.A0A(r7)
            X.2FW r3 = X.2FW.A1I
            java.lang.String r2 = r7.A06()
            X.MaY r0 = r7.A02
            boolean r0 = r0.A09
            X.C3265677h.A0g(r1, r12, r3, r2, r0)
            return
        L_0x00db:
            r0 = 0
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333537Zi.A0I(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final 1aU AGK(C254743sy r3, String str) {
        throw new IllegalStateException("Stub");
    }

    public final 1aU EJG(C254743sy r3, String str) {
        throw new IllegalStateException("stub");
    }

    public final void ELg(C70766OKm oKm, C254933tI r25, OCA oca, C254743sy r27, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A02((N49) null, oKm, r25, (SendMentionData$MentionData) null, oca, (C69343Nji) null, C66647MaG.A03(r27), num, num2, (Integer) null, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, (String) null, (String) null, (String) null, str4, (List) null, list, z, false);
    }

    public final void ELq(Capabilities capabilities, C254743sy r21, String str, String str2, String str3, String str4, String str5) {
        String str6;
        boolean z;
        2FW r7;
        boolean z2;
        boolean z3;
        String str7 = str;
        C254743sy r6 = r21;
        String A002 = C273654mx.A00(903);
        String A003 = C66579MXk.A00(1058);
        if (r6 instanceof DirectThreadKey) {
            UserSession userSession = this.A03;
            DirectThreadKey directThreadKey = (DirectThreadKey) r6;
            C254703su BRz = 1bJ.A00(userSession).BRz(directThreadKey, str7);
            String str8 = str2;
            if (BRz == null && str2 != null) {
                BRz = 1bJ.A00(userSession).BRy(directThreadKey, str8);
            }
            C70621ODs oDs = null;
            if (capabilities.A00(C376179Gx.REACTIONS)) {
                ImmutableList immutableList = C254853tA.A07;
                str6 = "❤";
            } else {
                str6 = null;
            }
            if (str != null || (BRz != null && (str7 = BRz.A0g()) != null)) {
                if (BRz != null) {
                    r7 = BRz.A10;
                    z2 = BRz.A2P;
                    oDs = BRz.A0M();
                    z = BRz.A1S();
                    N4L n4l = BRz.A0D;
                    if (n4l != null) {
                        z3 = n4l.A06;
                    }
                    z3 = false;
                } else {
                    r7 = null;
                    z2 = false;
                    z = false;
                    z3 = false;
                }
                A0G((C60957JuF) null, oDs, directThreadKey, r7, str7, str8, str6, NetInfoModule.CONNECTION_TYPE_NONE, A002, A003, (String) null, true, z2, z, z3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ThreadKey must be of type DirectThreadKey");
    }

    public final void ELs(OCA oca, C254743sy r19, String str, boolean z) {
        long j;
        C254743sy r0 = r19;
        DirectThreadKey A032 = C66647MaG.A03(r0);
        UserSession userSession = this.A03;
        Long A012 = OQO.A01(userSession, r0);
        boolean z2 = this.A00;
        String str2 = str;
        C66665MaY A062 = C66669Mac.A06(userSession, OQO.A00(userSession, A032), AnonymousClass1cj.class, str2, z, z2);
        if (A012 != null) {
            j = A012.longValue();
        } else {
            j = 0;
        }
        1bp r11 = new 1bp(A062, A032, Long.valueOf(j), System.currentTimeMillis() * 1000);
        r11.A00 = oca;
        String str3 = A032.A00;
        2FW r12 = 2FW.A16;
        String A013 = C71052OaU.A01(userSession, r11, r12, "❤", str3, str2);
        OYx oYx = O58.A01;
        OYx.A00(userSession, r11.A05.hashCode(), OYx.A01(userSession, r11), true);
        oYx.A02(userSession, r11, A013);
        1Ou.A01(userSession).A0A(r11);
        C3265677h.A0g(userSession, A032, r12, r11.A06(), r11.A02.A09);
    }

    public final 1aU ELy(OCA oca, MessageIdentifier messageIdentifier, C254743sy r4, String str, List list, boolean z) {
        return 1aU.A06(new C40262AYb(this, oca, messageIdentifier, r4, str, list, z));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.A9t] */
    public final void EMC(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        0qQ.A0B(directShareTarget, 0);
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        C66665MaY A07 = C66669Mac.A07(userSession, C66141jr.class);
        0qQ.A0B(A07, 1);
        1bp r6 = new 1bp(A07, BJy, OQO.A01(userSession, BJy), System.currentTimeMillis() * 1000);
        ? obj = new Object();
        obj.A00 = j;
        obj.A05 = "";
        obj.A07 = str2;
        obj.A06 = str3;
        obj.A02 = extendedImageUrl;
        obj.A03 = user;
        obj.A04 = null;
        obj.A01 = null;
        r6.A00 = obj;
        1Ou.A01(userSession).A0A(r6);
    }

    public final void EMD(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        1jv r17;
        UserSession userSession = this.A03;
        DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
        Class<C65681fm> cls = C65681fm.class;
        C70621ODs A002 = OQO.A00(userSession, BJy);
        boolean z2 = z;
        long j2 = j;
        ImageUrl imageUrl2 = imageUrl;
        ExtendedImageUrl extendedImageUrl2 = extendedImageUrl;
        User user2 = user;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str6;
        String str14 = str7;
        UserSession userSession2 = userSession;
        if (str6 != null) {
            r17 = new 1jv(imageUrl2, C66669Mac.A04(userSession2, A002, cls, (String) null, (String) null, z2), BJy, extendedImageUrl2, user2, OQO.A01(userSession, BJy), str9, str10, str11, str13, str14, str12, j2, System.currentTimeMillis() * 1000);
        } else {
            ImageUrl imageUrl3 = imageUrl2;
            DirectThreadKey directThreadKey = BJy;
            ExtendedImageUrl extendedImageUrl3 = extendedImageUrl2;
            User user3 = user2;
            String str15 = str9;
            String str16 = str10;
            String str17 = str11;
            String str18 = str14;
            String str19 = str12;
            r17 = new 1jn(imageUrl3, C66669Mac.A04(userSession2, A002, cls, (String) null, (String) null, z2), directThreadKey, extendedImageUrl3, user3, OQO.A01(userSession, BJy), str15, str16, str17, str18, str19, str8, j2, System.currentTimeMillis() * 1000);
        }
        1Ou.A01(userSession).A0A((1OS) r17);
    }

    public final void EMj(C70766OKm oKm, C254933tI r30, OCA oca, C254743sy r32, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        DirectThreadKey A032 = C66647MaG.A03(r32);
        String str5 = A032.A00;
        2FW r1 = 2FW.A1g;
        boolean z2 = false;
        C254933tI r4 = r30;
        if (r30 != null) {
            z2 = true;
        }
        Boolean A002 = A00(this, r1, str5, z2);
        UserSession userSession = this.A03;
        OQO.A00(userSession, A032);
        C71052OaU.A00((N49) null, userSession, oKm, r4, (SendMentionData$MentionData) null, oca, (C69343Nji) null, A032, (Boolean) null, A002, num, num2, (Integer) null, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, (String) null, (String) null, (String) null, (String) null, str4, (List) null, list, z, true, false);
    }

    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String EMr(C254933tI r19, C254743sy r20, String str, String str2, String str3, boolean z) {
        String str4 = str;
        0qQ.A0B(str4, 1);
        return A0D((N49) null, (C70766OKm) null, r19, (OCA) null, r20, (Integer) null, (Integer) null, (Integer) null, (Long) null, str4, NetInfoModule.CONNECTION_TYPE_NONE, str3, (String) null, (String) null, (String) null, z, false);
    }

    public final void EMu(C70766OKm oKm, C254933tI r25, OCA oca, C254743sy r27, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        A02((N49) null, oKm, r25, (SendMentionData$MentionData) null, oca, (C69343Nji) null, C66647MaG.A03(r27), num, num2, (Integer) null, (Long) null, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, (String) null, str4, (String) null, str5, (List) null, list, z, false);
    }

    public final void EMv(C70766OKm oKm, C254933tI r25, SendMentionData$MentionData sendMentionData$MentionData, OCA oca, C254743sy r28, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        C70766OKm oKm2 = oKm;
        SendMentionData$MentionData sendMentionData$MentionData2 = sendMentionData$MentionData;
        OCA oca2 = oca;
        Integer num3 = num;
        Integer num4 = num2;
        Long l2 = l;
        String str5 = str;
        String str6 = str3;
        A02((N49) null, oKm2, r25, sendMentionData$MentionData2, oca2, (C69343Nji) null, C66647MaG.A03(r28), num3, num4, (Integer) null, l2, str5, NetInfoModule.CONNECTION_TYPE_NONE, str6, (String) null, (String) null, (String) null, str4, list, list2, z, false);
    }

    public final 1aU EN2(C254783t2 r3, ClipInfo clipInfo, Long l, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendVisualMessageRx not supported for Direct threads. ThreadTarget: ");
        sb.append(r3);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final 1aU EN3(C254783t2 r3, C352218Cl r4, Long l, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendVisualMessageRx not supported for Direct threads. ThreadTarget: ");
        sb.append(r3);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static final Object A01(C53401GnY gnY, C254933tI r18, C333537Zi r19, OCA oca, DirectThreadKey directThreadKey, String str, String str2, String str3, C62320sa r25, boolean z) {
        Object invoke = r25.invoke();
        C53401GnY gnY2 = gnY;
        if (gnY != null) {
            String str4 = gnY2.A04;
            String str5 = gnY2.A03;
            C333537Zi r3 = r19;
            r3.A02((N49) gnY2.A01, (C70766OKm) null, r18, (SendMentionData$MentionData) gnY2.A02, oca, C69343Nji.MEDIA, directThreadKey, (Integer) null, (Integer) null, (Integer) null, (Long) null, str4, NetInfoModule.CONNECTION_TYPE_NONE, str, (String) null, str5, str2, str3, (List) null, (List) gnY2.A00, z, false);
        }
        return invoke;
    }

    private final String A02(N49 n49, C70766OKm oKm, C254933tI r31, SendMentionData$MentionData sendMentionData$MentionData, OCA oca, C69343Nji nji, C254743sy r35, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, boolean z2) {
        DirectThreadKey A032 = C66647MaG.A03(r35);
        String str8 = A032.A00;
        2FW r1 = 2FW.A1g;
        boolean z3 = false;
        C254933tI r4 = r31;
        if (r31 != null) {
            z3 = true;
        }
        Boolean A002 = A00(this, r1, str8, z3);
        UserSession userSession = this.A03;
        OQO.A00(userSession, A032);
        boolean z4 = this.A00;
        return C71052OaU.A00(n49, userSession, oKm, r4, sendMentionData$MentionData, oca, nji, A032, (Boolean) null, A002, num, num2, num3, l, str, str2, str3, str4, str5, (String) null, str6, str7, list, list2, z, z4, z2);
    }

    public static final void A0A(C333537Zi r8, String str, String str2, String str3, int i, boolean z, boolean z2) {
        int length;
        String str4 = str;
        int i2 = i;
        if (AnonymousClass3f0.A04(str2)) {
            C282375Cv.A02(i, str, str2);
            List singletonList = Collections.singletonList(Long.valueOf(Long.parseLong(str2)));
            0qQ.A07(singletonList);
            C282375Cv.A03(str, singletonList, i, 1305, 0);
        }
        if (182.A06(0Tu.A05, r8.A03, 36320644342096566L) && str3 != null && (length = str3.length()) > 0 && AnonymousClass3f0.A04(str3)) {
            int i3 = length / 3;
            int i4 = i3 * 2;
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(131L);
            }
            if (z2) {
                arrayList.add(1252L);
            }
            String substring = str3.substring(0, i3);
            0qQ.A07(substring);
            arrayList.add(Long.valueOf(Long.parseLong(substring)));
            String substring2 = str3.substring(i3, i4);
            0qQ.A07(substring2);
            arrayList.add(Long.valueOf(Long.parseLong(substring2)));
            String substring3 = str3.substring(i4);
            0qQ.A07(substring3);
            arrayList.add(Long.valueOf(Long.parseLong(substring3)));
            TraceLogger.logCrucialCheckpoint((PrivacyContext) null, i2, (String) null, 2220, str4, 0, arrayList);
        }
        if (z2) {
            C282375Cv.A03(str4, (List) null, i, 1252, 0);
        }
    }

    public final void A0K(C254743sy r7, String str, String str2, String str3, String str4, String str5) {
        DirectThreadKey A032 = C66647MaG.A03(r7);
        UserSession userSession = this.A03;
        C66665MaY A022 = C66669Mac.A02(userSession, OQO.A00(userSession, A032), AnonymousClass1kZ.class);
        0qQ.A0B(A032, 2);
        1OS r3 = new 1OS(A022);
        r3.A00 = A032;
        r3.A02 = str;
        r3.A05 = str2;
        r3.A01 = str3;
        r3.A04 = str4;
        r3.A03 = str5;
        1Ou.A01(userSession).A0A(r3);
        C3265677h.A0g(userSession, A032, 2FW.A0m, r3.A05, r3.A02.A09);
    }

    public final void EKD(C254743sy r6, String str) {
        DirectThreadKey A032 = C66647MaG.A03(r6);
        UserSession userSession = this.A03;
        C66665MaY A022 = C66669Mac.A02(userSession, OQO.A00(userSession, A032), AnonymousClass1m4.class);
        0qQ.A0B(A032, 2);
        1OS r1 = new 1OS(A022);
        r1.A01 = A032;
        r1.A00 = userSession;
        r1.A02 = str;
        1Ou.A01(userSession).A0A(r1);
    }

    public final void EMJ(AnonymousClass9JH r15, C53401GnY gnY, C254933tI r17, OCA oca, C254743sy r19, AnonymousClass3Q2 r20, C352218Cl r21, String str, String str2, String str3, String str4, List list, boolean z) {
        DirectThreadKey A032 = C66647MaG.A03(r19);
        String str5 = A032.A00;
        2FW r1 = 2FW.A1A;
        boolean z2 = false;
        C254933tI r3 = r17;
        if (r17 != null) {
            z2 = true;
        }
        Boolean A002 = A00(this, r1, str5, z2);
        boolean z3 = z;
        C53401GnY gnY2 = gnY;
        OCA oca2 = oca;
        String str6 = str;
        String str7 = str3;
        String str8 = str4;
        A01(gnY2, r3, this, oca2, A032, str6, str7, str8, new C41574Awg(gnY2, r3, this, oca2, A032, r20, r21, A002, str6, str7, str8, z3), z3);
    }

    public final void FJB(C254743sy r6, String str) {
        DirectThreadKey A032 = C66647MaG.A03(r6);
        UserSession userSession = this.A03;
        C66665MaY A022 = C66669Mac.A02(userSession, OQO.A00(userSession, A032), C66331m8.class);
        0qQ.A0B(A032, 2);
        1OS r1 = new 1OS(A022);
        r1.A01 = A032;
        r1.A00 = userSession;
        r1.A02 = str;
        1Ou.A01(userSession).A0A(r1);
    }
}
