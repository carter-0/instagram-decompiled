package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.93Q  reason: invalid class name */
public final class AnonymousClass93Q {
    public static final AnonymousClass93Q A00 = new Object();

    public final 1OC A07(Context context, AnonymousClass9JG r36, C270694h9 r37, UserSession userSession, C290515fR r39, C54575HJk hJk, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C62320sa r51, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        1NY A002;
        String str10;
        Map map;
        boolean z6;
        String str11;
        String str12;
        boolean z7 = false;
        String str13 = str8;
        if (str8 != null) {
            z7 = true;
        }
        UserSession userSession2 = userSession;
        boolean A05 = A05(userSession2);
        String str14 = str5;
        boolean A06 = A06(userSession2, str14);
        if (A05) {
            A002 = new 1NY(userSession2, -2);
            A002.A0O((15p) null, C43827CEt.class, C45656D0g.class, false);
        } else {
            A002 = AnonymousClass93V.A00(userSession2);
        }
        if (z7) {
            str10 = "discover/interest_grid/clips/";
        } else if (A06) {
            str10 = "clips/ads_discover_sync_flow/";
        } else if (A05) {
            str10 = "mixed_media/discover/";
        } else {
            str10 = "clips/discover/";
        }
        String str15 = null;
        String str16 = str2;
        boolean z8 = z4;
        1NY r17 = A002;
        UserSession userSession3 = userSession2;
        String str17 = str14;
        String str18 = str16;
        A03(r17, userSession3, AnonymousClass05K.A01, num, str17, str18, str10, (String) null, str7, str13, str9, z3, z8);
        0Tu r3 = 0Tu.A05;
        String str19 = str3;
        String str20 = str;
        boolean z9 = z;
        1NY r24 = A002;
        String str21 = str20;
        String str22 = str16;
        A04(r24, str21, str22, str19, str4, str6, 0sn.A00, z9, z2, 182.A06(r3, userSession2, 36323809732800033L));
        if (r39 != null) {
            map = r39.Bk0();
        } else {
            map = null;
        }
        C54575HJk hJk2 = hJk;
        boolean z10 = z5;
        A01(context, A002, userSession2, hJk2, str14, str20, str16, map, r51, z9, z8, z10, false, false);
        if (r39 != null) {
            z6 = r39.CJo();
        } else {
            z6 = false;
        }
        A02(A002, r37, userSession2, hJk2, str10, str14, str16, d, z9, z8, z10, false, z6);
        if (182.A06(r3, userSession2, 36324673021030618L)) {
            A002.A9m("device_status", C3728993c.A00.A01(userSession2).toString());
        }
        if (A06(userSession2, str14)) {
            AnonymousClass9JG r32 = r36;
            if (r36 != null) {
                str11 = r32.A00;
            } else {
                str11 = null;
            }
            A002.A0G("seed_ad_id", str11);
            if (r36 != null) {
                str12 = r32.A02;
            } else {
                str12 = null;
            }
            A002.A0G("seed_ad_token", str12);
            if (r36 != null) {
                str15 = r32.A01;
            }
            A002.A0G("post_trigger_eligibility_flags", str15);
        }
        return A002.A0M();
    }

    public final boolean A09(UserSession userSession) {
        1Ga A002;
        0qQ.A0B(userSession, 0);
        if (1KU.A0B(userSession)) {
            A002 = 1GZ.A00(userSession);
        } else {
            A002 = 1P1.A00(userSession);
        }
        return A002.A03("clips_discover_prefetch", A00(userSession), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (X.AnonymousClass1B1.A00(r3).A00(X.1B2.A0a) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.A17.A00(r3, X.1Au.A00(r3)) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = 36609725705951138L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(com.instagram.common.session.UserSession r3) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328873499311763(0x8110eb00043e93, double:3.0378641133721636E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0034
            r0 = 36328873499442837(0x8110eb00063e95, double:3.0378641134550554E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002c
            X.1Av r0 = X.1Au.A00(r3)
            boolean r0 = X.A17.A00(r3, r0)
            if (r0 == 0) goto L_0x0034
        L_0x0022:
            r0 = 36609725705951138(0x82105a000717a2, double:3.215476179751968E-306)
        L_0x0027:
            long r0 = X.182.A01(r2, r3, r0)
            return r0
        L_0x002c:
            r0 = 36609725705951138(0x82105a000717a2, double:3.215476179751968E-306)
            X.182.A01(r2, r3, r0)
        L_0x0034:
            r0 = 36328250729315463(0x81105a00083c87, double:3.03747027111881E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004e
            boolean r0 = X.AnonymousClass1B0.A05
            X.1B0 r1 = X.AnonymousClass1B1.A00(r3)
            X.1B2 r0 = X.1B2.A0a
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0022
        L_0x004e:
            r0 = 36609725705623456(0x82105a000217a0, double:3.2154761795447404E-306)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93Q.A00(com.instagram.common.session.UserSession):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r40 != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r30, X.1Fa r31, com.instagram.common.session.UserSession r32, X.C54575HJk r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.Map r37, X.C62320sa r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            r19 = 1
            r20 = r41
            if (r41 != 0) goto L_0x000a
            r27 = 0
            if (r40 == 0) goto L_0x000c
        L_0x000a:
            r27 = 1
        L_0x000c:
            r11 = 0
            r3 = 0
            r10 = r32
            r15 = r34
            r24 = r36
            r7 = r39
            r21 = r10
            r22 = r15
            r23 = r11
            r25 = r7
            r26 = r19
            r28 = r3
            r29 = r3
            boolean r26 = X.AnonymousClass93X.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r39 == 0) goto L_0x015e
            java.lang.Integer r22 = X.AnonymousClass05K.A00
        L_0x002c:
            X.0qQ.A07(r22)
            r27 = r43
            if (r26 != 0) goto L_0x003d
            r25 = -1
            r23 = r15
            r26 = r3
            X.AnonymousClass93Y.A00(r21, r22, r23, r24, r25, r26, r27)
        L_0x003c:
            return
        L_0x003d:
            if (r42 == 0) goto L_0x015a
            java.lang.String r1 = "is_sync_flow_enabled_for_streaming"
        L_0x0041:
            java.lang.String r0 = "true"
            r2 = r31
            r2.A9m(r1, r0)
            r12 = r33
            if (r39 != 0) goto L_0x0152
            if (r40 != 0) goto L_0x0152
            if (r38 == 0) goto L_0x014f
            java.lang.Object r0 = r38.invoke()
            X.GBj r0 = (X.C52012GBj) r0
            if (r0 == 0) goto L_0x014f
            X.GBl r0 = r0.A04
            if (r0 == 0) goto L_0x014c
            int r6 = r0.A01
        L_0x005e:
            r8 = r35
            if (r33 != 0) goto L_0x00d7
            r5 = 0
        L_0x0063:
            java.lang.String r0 = "seed_item_id"
            r2.A0G(r0, r8)
            if (r5 == 0) goto L_0x0157
            int r0 = r5.A02
        L_0x006c:
            r23 = r15
            r25 = r0
            X.AnonymousClass93Y.A00(r21, r22, r23, r24, r25, r26, r27)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36313725150038226(0x810324000a08d2, double:3.0282842362940723E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x00b8
            X.2B1 r0 = X.2B0.A01
            X.0xa r1 = r0.A07(r10)
            java.lang.String r0 = "HAS_USER_EVER_SET_BREAKS"
            boolean r1 = r1.getBoolean(r0, r3)
            java.lang.String r0 = "has_user_set_breaks"
            r2.A0H(r0, r1)
            X.1Av r0 = X.1Au.A00(r10)
            long r0 = r0.A0A()
            java.lang.String r4 = "take_a_break_nudge_last_seen_time"
            r2.A0D(r4, r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r5 = X.AnonymousClass2SF.A00
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b3
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x00b3
            long r8 = r8 - r5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r8 / r0
        L_0x00b3:
            java.lang.String r4 = "session_time_spent"
            r2.A0D(r4, r0)
        L_0x00b8:
            if (r40 != 0) goto L_0x00c5
            if (r37 == 0) goto L_0x00c5
            java.lang.String r1 = X.AnonymousClass4LV.A00(r37)
            java.lang.String r0 = "ad_and_netego_request_information"
            r2.A9m(r0, r1)
        L_0x00c5:
            java.lang.String r0 = "is_prefetch"
            r2.A0H(r0, r7)
            r1 = r30
            if (r30 == 0) goto L_0x003c
            X.1Cn r0 = new X.1Cn
            r0.<init>(r1)
            X.1G2.A00(r1, r2, r10, r0, r3)
            return
        L_0x00d7:
            X.5o2 r0 = X.C295365o2.ORGANIC
            java.util.List r1 = r12.A0K(r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            java.lang.String r0 = r0.getId()
            r5.add(r0)
            goto L_0x00ec
        L_0x0100:
            X.0Tu r4 = X.0Tu.A06
            r0 = 36315133898787845(0x81046c00020c05, double:3.029175134675907E-306)
            boolean r9 = X.182.A06(r4, r10, r0)
            if (r9 == 0) goto L_0x013d
            r13 = r11
            r17 = r6
            r18 = r3
            r16 = r5
            r14 = r8
            X.GLA r5 = X.GL9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0119:
            X.0eM r6 = r5.A05
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0063
            boolean r0 = X.182.A06(r4, r10, r0)
            java.lang.String r1 = "paging_token"
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r5.A01()
        L_0x0133:
            r2.A9m(r1, r0)
            goto L_0x0063
        L_0x0138:
            java.lang.String r0 = r5.A00()
            goto L_0x0133
        L_0x013d:
            r13 = r11
            r14 = r8
            r16 = r5
            r17 = r6
            r18 = r19
            r19 = r20
            X.GLA r5 = X.GL9.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0119
        L_0x014c:
            r6 = -1
            goto L_0x005e
        L_0x014f:
            r6 = -1
            goto L_0x005e
        L_0x0152:
            if (r33 == 0) goto L_0x0157
            r12.A0e(r3)
        L_0x0157:
            r0 = 0
            goto L_0x006c
        L_0x015a:
            java.lang.String r1 = "is_sync_flow_enabled"
            goto L_0x0041
        L_0x015e:
            if (r40 == 0) goto L_0x0164
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
            goto L_0x002c
        L_0x0164:
            if (r41 == 0) goto L_0x016a
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            goto L_0x002c
        L_0x016a:
            java.lang.Integer r22 = X.AnonymousClass05K.A0N
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93Q.A01(android.content.Context, X.1Fa, com.instagram.common.session.UserSession, X.HJk, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.0sa, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r24 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.1Fa r14, X.C270694h9 r15, com.instagram.common.session.UserSession r16, X.C54575HJk r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, double r21, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r13 = this;
            r2 = r18
            java.util.Map r1 = r15.AUI(r2)
            r12 = r24
            if (r25 != 0) goto L_0x000d
            r10 = 0
            if (r24 == 0) goto L_0x000e
        L_0x000d:
            r10 = 1
        L_0x000e:
            r6 = 0
            r9 = 1
            r4 = r16
            r5 = r19
            r7 = r20
            r8 = r23
            r11 = r27
            boolean r0 = X.AnonymousClass93X.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r15.AUH(r2)
            java.util.LinkedHashMap r1 = X.0Yt.A04(r1, r0)
        L_0x0028:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0054
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r14.A9m(r1, r0)
            goto L_0x0038
        L_0x0054:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321795392939798(0x810a7b00002716, double:3.033387890401286E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a9
            if (r23 != 0) goto L_0x00ab
            if (r24 != 0) goto L_0x00a8
            if (r26 != 0) goto L_0x00a8
            r0 = r17
            if (r17 == 0) goto L_0x00a8
            X.GEP r2 = new X.GEP
            r2.<init>(r4, r0)
            java.lang.String r1 = r2.A00()
            X.93a r3 = X.AnonymousClass93Z.A01(r4)
            if (r3 == 0) goto L_0x009d
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x009d
            X.0XK r8 = new X.0XK
            r8.<init>()
            java.lang.String r0 = "view_state_json"
            r8.A00(r0, r1, r9)
            X.02m r3 = X.C3728893a.A00(r3)
            r4 = 976032351(0x3a2d125f, float:6.602164E-4)
            r5 = 0
            r6 = 7
            long r9 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r7 = "set_view_state_list"
            r12 = r5
            r3.markerPoint(r4, r5, r6, r7, r8, r9, r11, r12)
        L_0x009d:
            java.lang.String r0 = r2.A00()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "client_view_state_media_list"
            r14.A9m(r0, r1)
        L_0x00a8:
            return
        L_0x00a9:
            if (r23 == 0) goto L_0x00a8
        L_0x00ab:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            java.lang.String r2 = "client_p_impression"
            X.1Fc r1 = r14.A0W
            java.lang.String r0 = java.lang.String.valueOf(r21)
            r1.A05(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93Q.A02(X.1Fa, X.4h9, com.instagram.common.session.UserSession, X.HJk, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A03(1Fa r12, UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        String str8;
        String str9;
        String str10 = str3;
        r12.A0E = str10;
        r12.A08(AnonymousClass05K.A01);
        r12.A07(num);
        if (num == AnonymousClass05K.A0Y) {
            r12.A00 = 10000;
        }
        boolean z3 = false;
        String str11 = str2;
        if (str2 == null || str11.length() == 0) {
            str8 = "";
        } else {
            str8 = 002.A0R("?max_id=", str11);
        }
        if (A05(userSession)) {
            0Tu r2 = 0Tu.A05;
            boolean A06 = 182.A06(r2, userSession, 36319776758308479L);
            Boolean valueOf = Boolean.valueOf(182.A06(r2, userSession, 36319776758374016L));
            Boolean valueOf2 = Boolean.valueOf(182.A06(r2, userSession, 36319776758439553L));
            Boolean valueOf3 = Boolean.valueOf(182.A06(r2, userSession, 36319776758505090L));
            Boolean valueOf4 = Boolean.valueOf(182.A06(r2, userSession, 36319776758570627L));
            Boolean valueOf5 = Boolean.valueOf(182.A06(r2, userSession, 36319776758636164L));
            if (A06) {
                str9 = new JSONObject(0Yt.A06(new 0eP[]{new 0eP("carousel_with_photo_in_first_position", valueOf), new 0eP("carousel_with_video_in_first_position", valueOf2), new 0eP("carousel_with_music", valueOf3), new 0eP("photo_without_music", valueOf4), new 0eP("photo_with_music", valueOf5)})).toString();
            } else {
                str9 = null;
            }
            r12.A0G("mixed_media_types", str9);
            r12.A0H("use_mmd_service", 182.A06(r2, userSession, 36319776758767238L));
        }
        StringBuilder sb = new StringBuilder();
        String str12 = str4;
        if (str4 != null) {
            sb.append(str10);
            sb.append(str12);
        } else {
            sb.append(str10);
        }
        sb.append(str8);
        r12.A0A = sb.toString();
        String str13 = str;
        r12.A9m("container_module", str13);
        if (num2 != null) {
            r12.A0C("netego_subtype", num2.intValue());
        }
        r12.A0H("should_refetch_chaining_media", z);
        if (z2) {
            r12.A9m("reason", "pull_to_refresh");
        }
        String str14 = str5;
        if (str5 != null) {
            r12.A9m("viewer_session_id", str14);
        }
        r12.A0G("interest_id", str6);
        r12.A0G = str13;
        0Tu r22 = 0Tu.A05;
        if (182.A06(r22, userSession, 36319776758308479L) && !182.A06(r22, userSession, 36319776758701701L) && !A05(userSession)) {
            z3 = true;
        }
        r12.A0H("enable_mixed_media_chaining", z3);
        r12.A9m("prefetch_trigger_type", str7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[SYNTHETIC, Splitter:B:11:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.1Fa r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List r11, boolean r12, boolean r13, boolean r14) {
        /*
            java.lang.String r0 = "chaining_media_id"
            r5.A0G(r0, r6)
            if (r14 == 0) goto L_0x000e
            java.lang.String r1 = "include_bio_for_user"
            java.lang.String r0 = "1"
            r5.A0G(r1, r0)
        L_0x000e:
            java.lang.String r0 = "max_id"
            r5.A0G(r0, r7)
            java.lang.String r0 = "session_info"
            r5.A0G(r0, r8)
            java.lang.String r0 = "seen_reels"
            r5.A0G(r0, r9)
            java.lang.String r0 = "server_driven_cache_config"
            r5.A0G(r0, r10)
            if (r13 == 0) goto L_0x0031
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0026:
            r5.A09 = r0
        L_0x0028:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0079
            goto L_0x0036
        L_0x0031:
            if (r12 == 0) goto L_0x0028
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0026
        L_0x0036:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ IOException -> 0x006b }
            r4.<init>()     // Catch:{ IOException -> 0x006b }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x006b }
            X.17W r3 = r0.A0A(r4)     // Catch:{ IOException -> 0x006b }
            r3.A0b()     // Catch:{ IOException -> 0x006b }
            java.util.Iterator r2 = r11.iterator()     // Catch:{ IOException -> 0x006b }
        L_0x0048:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x006b }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x006b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x006b }
            r3.A0c()     // Catch:{ IOException -> 0x006b }
            java.lang.String r0 = "id"
            r3.A0R(r0, r1)     // Catch:{ IOException -> 0x006b }
            r3.A0Z()     // Catch:{ IOException -> 0x006b }
            goto L_0x0048
        L_0x0060:
            r3.A0Y()     // Catch:{ IOException -> 0x006b }
            r3.close()     // Catch:{ IOException -> 0x006b }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x006b }
            goto L_0x0074
        L_0x006b:
            r2 = move-exception
            java.lang.String r1 = "DiscoverApiUtil"
            java.lang.String r0 = "getDroppedMediaListJSON() Failed building JSON: "
            X.0KC.A0F(r1, r0, r2)
            r1 = 0
        L_0x0074:
            java.lang.String r0 = "dropped_media_ids"
            r5.A0G(r0, r1)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93Q.A04(X.1Fa, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }

    public static final boolean A05(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36319776758308479L) || 182.A06(r2, userSession, 36319776758701701L) || 182.A06(r2, userSession, 36328620095978972L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r4.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r4.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return X.1KU.A0A(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        return X.182.A06(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(com.instagram.common.session.UserSession r3, java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            switch(r0) {
                case -1782849828: goto L_0x006c;
                case -1605077561: goto L_0x005c;
                case -1173934446: goto L_0x004f;
                case -893240619: goto L_0x004c;
                case -464728503: goto L_0x0042;
                case -245756598: goto L_0x003f;
                case -39744821: goto L_0x002f;
                case 132014642: goto L_0x002c;
                case 1310132869: goto L_0x001c;
                case 1794301627: goto L_0x000c;
                case 1978956600: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
        L_0x0009:
            java.lang.String r0 = "clips_viewer_feed_sa_multi_ads_watch_and_browse"
            goto L_0x0051
        L_0x000c:
            java.lang.String r0 = "clips_viewer_feed_timeline_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321992962025354(0x810aa90009278a, double:3.033512833886539E-306)
            goto L_0x007b
        L_0x001c:
            java.lang.String r0 = "clips_viewer_feed_timeline_tall_video_watch_and_browse_with_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321992962156428(0x810aa9000b278c, double:3.0335128339694305E-306)
            goto L_0x007b
        L_0x002c:
            java.lang.String r0 = "clips_viewer_direct_ad_feed_of_ads"
            goto L_0x0044
        L_0x002f:
            java.lang.String r0 = "clips_viewer_feed_timeline_watch_and_browse_with_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321992962090891(0x810aa9000a278b, double:3.0335128339279846E-306)
            goto L_0x007b
        L_0x003f:
            java.lang.String r0 = "clips_viewer_feed_multi_ads_ad_chain"
            goto L_0x0051
        L_0x0042:
            java.lang.String r0 = "clips_viewer_explore_grid_ad_feed_of_ads"
        L_0x0044:
            boolean r1 = r4.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0008
            goto L_0x0007
        L_0x004c:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_ad_chain"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_watch_and_browse"
        L_0x0051:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            boolean r0 = X.1KU.A0A(r3)
            return r0
        L_0x005c:
            java.lang.String r0 = "clips_viewer_clips_multi_ads_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319239891328069(0x810828003c1c45, double:3.03177178089185E-306)
            goto L_0x007b
        L_0x006c:
            java.lang.String r0 = "clips_viewer_clips_pae_multi_ads_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319239891393606(0x810828003d1c46, double:3.031771780933296E-306)
        L_0x007b:
            boolean r0 = X.182.A06(r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93Q.A06(com.instagram.common.session.UserSession, java.lang.String):boolean");
    }

    public final 1GP A08(Context context, C270694h9 r36, UserSession userSession, C290515fR r38, C54575HJk hJk, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, C62320sa r54, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        1FZ A02;
        String str12;
        Integer num2;
        Map map;
        boolean z8;
        long longValue;
        boolean z9 = false;
        String str13 = str9;
        if (str9 != null) {
            z9 = true;
        }
        UserSession userSession2 = userSession;
        boolean A05 = A05(userSession2);
        if (A05) {
            A02 = AnonymousClass93V.A01(userSession2);
        } else {
            A02 = AnonymousClass93V.A02(userSession2, 1617547344);
        }
        if (z9) {
            str12 = "discover/interest_grid/clips/";
        } else {
            str12 = A05 ? "mixed_media/discover/stream/" : "clips/discover/stream/";
        }
        0Tu r0 = 0Tu.A05;
        boolean z10 = z4;
        if (182.A06(r0, userSession2, 36318509743741092L) || z4) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A0Y;
        }
        boolean z11 = z7;
        if (z7 && !182.A06(r0, userSession2, 36325918562268535L)) {
            num2 = AnonymousClass05K.A0N;
            if (l == null) {
                longValue = TimeUnit.MINUTES.toMillis(180);
            } else {
                longValue = l.longValue();
            }
            A02.A01 = longValue;
        }
        boolean z12 = z5;
        if (z5 && 182.A06(r0, userSession2, 36325918562268535L)) {
            A02.A0G("client_cache_media_list", str10);
        }
        String str14 = str5;
        String str15 = str2;
        1FZ r21 = A02;
        A03(r21, userSession2, num2, num, str14, str15, str12, str7, str8, str13, str11, z3, z10);
        String str16 = str;
        boolean z13 = z;
        String str17 = str16;
        String str18 = str15;
        A04(r21, str17, str18, str3, str4, str6, list, z13, z2, 182.A06(r0, userSession2, 36323809732800033L));
        if (r38 != null) {
            map = r38.Bk0();
        } else {
            map = null;
        }
        C54575HJk hJk2 = hJk;
        A01(context, A02, userSession2, hJk2, str14, str16, str15, map, r54, z13, z10, z12, true, z11);
        if (r38 != null) {
            z8 = r38.CJo();
        } else {
            z8 = false;
        }
        A02(A02, r36, userSession2, hJk2, str12, str14, str15, d, z13, z10, z12, z6, z8);
        if (182.A06(r0, userSession2, 36324673021030618L)) {
            A02.A9m("device_status", C3728993c.A00.A01(userSession2).toString());
        }
        return A02.A0M();
    }
}
