package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ody  reason: case insensitive filesystem */
public final class C71144Ody {
    public final 0wc A00;
    public final UserSession A01;
    public final Oy3 A02;
    public final AnonymousClass0iw A03;
    public final AnonymousClass6W2 A04 = new AnonymousClass6W2(C73824PkN.A00);
    public final Set A05 = DbS.A0y();

    public static final void A01(C54671HOc hOc, C71144Ody ody, AnonymousClass4A5 r30, Boolean bool, Long l, String str, String str2, String str3) {
        A00(hOc, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, r30, (Boolean) null, (Boolean) null, (Boolean) null, bool, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, l, str, str2, (String) null, str3, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public static final void A02(C54671HOc hOc, C71144Ody ody, String str, String str2) {
        A00(hOc, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, (AnonymousClass4A5) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public static final void A03(C69486NmU nmU, C69455Nlz nlz, C71144Ody ody, AnonymousClass4A5 r34, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        Integer num4 = num3;
        C71144Ody ody2 = ody;
        C69455Nlz nlz2 = nlz;
        String str6 = str3;
        C69486NmU nmU2 = nmU;
        AnonymousClass4A5 r5 = r34;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        Boolean bool7 = bool3;
        Boolean bool8 = bool4;
        Integer num5 = num;
        Integer num6 = num2;
        A00((C54671HOc) null, (C69486NmU) null, nmU2, nlz2, ody2, r5, bool5, bool6, bool7, (Boolean) null, (Boolean) null, bool8, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, num5, (Integer) null, num6, num4, (Integer) null, (Integer) null, (Integer) null, (Long) null, str, str2, (String) null, str6, str4, str5, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public static final void A05(C71144Ody ody, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Long l, String str, String str2, String str3) {
        A00((C54671HOc) null, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, (AnonymousClass4A5) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, bool, (Boolean) null, bool2, bool3, num, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, l, str, str2, (String) null, str3, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public static final void A06(C71144Ody ody, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5) {
        A00((C54671HOc) null, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, (AnonymousClass4A5) null, (Boolean) null, (Boolean) null, (Boolean) null, bool, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, num, num2, num3, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, num4, l, str, str2, (String) null, str3, str4, str5, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public final void A08(long j, String str, boolean z) {
        boolean z2;
        String str2 = str;
        0qQ.A0B(str, 0);
        Set set = this.A05;
        if (set.contains(str)) {
            z2 = true;
        } else {
            set.add(str);
            z2 = false;
        }
        boolean equals = str.equals(this.A01.A06);
        A05(this, Boolean.valueOf(equals), Boolean.valueOf(z), Boolean.valueOf(z2), (Integer) null, Long.valueOf(j), "LOCATION_POG", "IMPRESSION", str2);
    }

    public final void A0B(C3018760k r20, N4t n4t, long j, boolean z) {
        boolean z2;
        C319736r8 r0;
        GT1 gt1;
        String str;
        C3018760k r6 = r20;
        0qQ.A0B(r6, 2);
        N4t n4t2 = n4t;
        String str2 = n4t2.A0A;
        AnonymousClass4AB r2 = n4t2.A05;
        if (r2 != null && str2 != null) {
            Set set = this.A05;
            if (set.contains(str2)) {
                z2 = true;
            } else {
                set.add(str2);
                z2 = false;
            }
            if (z) {
                r0 = C319736r8.FRIEND_MAP_FLOATY_GRID;
            } else {
                r0 = C319736r8.FRIEND_MAP;
            }
            r6.A0J(r0, r2);
            C319496qh r7 = r6.A01;
            long j2 = j;
            if (r7 != null) {
                String str3 = r6.A07.A00;
                0Aj A0e = AnonymousClass7TE.A0e(r6.A05, C273654mx.A00(2814));
                if (A0e.isSampled()) {
                    C51965G9l.A1K(A0e, C3018760k.A02());
                    A0e.AAJ("target_user_id", r7.A09);
                    A0e.AAe("content", r7.A0B);
                    A0e.A7p("sub_impression", Boolean.valueOf(z2));
                    A0e.A7p("in_floaty_grid", Boolean.valueOf(z));
                    A0e.AAJ("direct_session_id", str3);
                    A0e.AAJ("note_id", r7.A07);
                    A0e.A8D("dwell_time_ms", Double.valueOf((double) j2));
                    NoteAudience noteAudience = r7.A04;
                    if (noteAudience != null) {
                        gt1 = C3018660j.A00(noteAudience);
                    } else {
                        gt1 = null;
                    }
                    A0e.A8M(gt1, C273654mx.A00(3409));
                    if (r6.A04) {
                        str = AnonymousClass000.A00(288);
                    } else {
                        str = "direct_inbox";
                    }
                    A0e.AAJ("container_module", str);
                    DbX.A1L(A0e);
                }
            }
            A05(this, (Boolean) null, Boolean.valueOf(z), Boolean.valueOf(z2), (Integer) null, Long.valueOf(j2), "MAP_NOTE", "IMPRESSION", str2);
        }
    }

    public final void A0D(String str) {
        A05(this, Boolean.valueOf(str.equals(this.A01.A06)), (Boolean) null, (Boolean) null, (Integer) null, (Long) null, "LOCATION_POG", "TAP", str);
    }

    public static final void A04(C71144Ody ody, AnonymousClass4A5 r34, String str) {
        A00((C54671HOc) null, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, r34, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str, "TAP", (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public static final void A07(C71144Ody ody, String str) {
        A00((C54671HOc) null, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, (AnonymousClass4A5) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, str, "TAP", (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
    }

    public final void A09(C54671HOc hOc) {
        A02(hOc, this, "NUX_WINDOW", "IMPRESSION");
    }

    public final void A0A(C54671HOc hOc) {
        A02(hOc, this, "NUX_SKIP", "TAP");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        if (r3 != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x001a A[EDGE_INSN: B:112:0x001a->B:11:0x001a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.Integer r48, java.lang.String r49, java.util.List r50, boolean r51) {
        /*
            r47 = this;
            r5 = r48
            if (r51 == 0) goto L_0x00cc
            java.lang.String r36 = "MAP_POG"
        L_0x0006:
            r7 = r50
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L_0x008b
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x008b
            r13 = 0
        L_0x0013:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00ae
            r12 = 0
        L_0x001a:
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = X.N4t.A01(r1)
            X.C51971G9r.A1O(r0, r1, r6, r4)
            goto L_0x0026
        L_0x0038:
            int r11 = r4.size()
            r15 = r47
            if (r48 != 0) goto L_0x0044
            X.Oy3 r0 = r15.A02
            java.lang.Integer r5 = r0.A01
        L_0x0044:
            if (r3 == 0) goto L_0x0073
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0073
            r10 = 0
        L_0x004d:
            if (r51 == 0) goto L_0x006e
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0051:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x0059:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.N4t r0 = (X.N4t) r0
            X.4AB r0 = r0.A05
            if (r0 != 0) goto L_0x0059
            r3.add(r1)
            goto L_0x0059
        L_0x006e:
            X.Oy3 r0 = r15.A02
            java.lang.Integer r6 = r0.A00
            goto L_0x0051
        L_0x0073:
            java.util.Iterator r1 = r7.iterator()
            r10 = 0
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            X.N4t r0 = X.C66580MXl.A0f(r1)
            X.4AB r0 = r0.A05
            if (r0 != 0) goto L_0x0078
            int r10 = r10 + 1
            if (r10 >= 0) goto L_0x0078
            goto L_0x00a2
        L_0x008b:
            java.util.Iterator r1 = r7.iterator()
            r13 = 0
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00aa
            X.N4t r0 = X.C66580MXl.A0f(r1)
            X.4AB r0 = r0.A05
            if (r0 == 0) goto L_0x0090
            int r13 = r13 + 1
            if (r13 >= 0) goto L_0x0090
        L_0x00a2:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00aa:
            if (r3 == 0) goto L_0x00ae
            goto L_0x0013
        L_0x00ae:
            java.util.Iterator r2 = r7.iterator()
            r12 = 0
        L_0x00b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            X.N4t r1 = X.C66580MXl.A0f(r2)
            X.4AB r0 = r1.A05
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00b3
            int r12 = r12 + 1
            if (r12 >= 0) goto L_0x00b3
            goto L_0x00a2
        L_0x00cc:
            java.lang.String r36 = "MAP_VIEW"
            goto L_0x0006
        L_0x00d0:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x00d8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = X.N4t.A01(r0)
            X.C66582MXn.A1N(r0, r4)
            goto L_0x00d8
        L_0x00ea:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x00f2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.N4t r0 = (X.N4t) r0
            X.4AB r0 = r0.A05
            if (r0 == 0) goto L_0x00f2
            r8.add(r1)
            goto L_0x00f2
        L_0x0107:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x010f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = X.N4t.A01(r0)
            X.C66582MXn.A1N(r0, r3)
            goto L_0x010f
        L_0x0121:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x0129:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.N4t r1 = (X.N4t) r1
            X.4AB r0 = r1.A05
            if (r0 == 0) goto L_0x0129
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0129
            r9.add(r2)
            goto L_0x0129
        L_0x0144:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x014c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = X.N4t.A01(r0)
            X.C66582MXn.A1N(r0, r2)
            goto L_0x014c
        L_0x015e:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r7.iterator()
        L_0x0166:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.N4t r0 = (X.N4t) r0
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0166
            r8.add(r1)
            goto L_0x0166
        L_0x017b:
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r7 = r8.iterator()
        L_0x0183:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = X.N4t.A01(r0)
            X.C66582MXn.A1N(r0, r1)
            goto L_0x0183
        L_0x0195:
            java.lang.Integer r26 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r11)
            r11 = 0
            java.lang.Integer r34 = java.lang.Integer.valueOf(r10)
            java.lang.String r37 = "DATA_LOAD"
            r38 = r49
            r12 = r11
            r13 = r11
            r14 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r6
            r28 = r5
            r30 = r11
            r31 = r11
            r32 = r11
            r33 = r11
            r35 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r42 = r11
            r43 = r4
            r44 = r3
            r45 = r2
            r46 = r1
            A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71144Ody.A0C(java.lang.Integer, java.lang.String, java.util.List, boolean):void");
    }

    public C71144Ody(AnonymousClass0iw r3, UserSession userSession) {
        this.A01 = userSession;
        this.A03 = r3;
        this.A00 = AnonymousClass0kN.A02(userSession);
        0qQ.A0B(userSession, 0);
        this.A02 = (Oy3) userSession.A01(Oy3.class, C73825PkO.A00);
    }

    public final void A0E(String str, boolean z, boolean z2) {
        A03((C69486NmU) null, (C69455Nlz) null, this, (AnonymousClass4A5) null, (Boolean) null, Boolean.valueOf(z), Boolean.valueOf(z2), (Boolean) null, (Integer) null, (Integer) null, (Integer) null, "QUICK_EMOJI", "IMPRESSION", (String) null, (String) null, str);
    }

    public final void A0F(List list, boolean z) {
        A03((C69486NmU) null, (C69455Nlz) null, this, (AnonymousClass4A5) null, Boolean.valueOf(z), (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, C51968G9o.A0t(list), (Integer) null, "CLUSTER", "TAP", (String) null, (String) null, (String) null);
    }

    public static final void A00(C54671HOc hOc, C69486NmU nmU, C69486NmU nmU2, C69455Nlz nlz, C71144Ody ody, AnonymousClass4A5 r12, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4) {
        String str8;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        String str9;
        Long l8;
        Long l9;
        Double d;
        Long l10;
        String moduleName;
        0Aj A0e = AnonymousClass7TE.A0e(ody.A00, "ig_friend_map_entity_action");
        if (A0e.isSampled()) {
            String str10 = "";
            String str11 = str3;
            if (str3 != null) {
                str8 = str10;
            } else {
                Oy3 oy3 = ody.A02;
                if (DbV.A12(oy3.A02).length() == 0) {
                    0wb.A01(0kg.A0A, "FriendMapSessionManager", "Session id is not initiated");
                    oy3.A02 = AnonymousClass7TF.A0b();
                }
                str8 = oy3.A02;
            }
            A0e.AAJ("friend_map_session_id", str8);
            AnonymousClass0iw r1 = ody.A03;
            if (!(r1 == null || (moduleName = r1.getModuleName()) == null)) {
                str10 = moduleName;
            }
            A0e.AAJ("container_module", str10);
            A0e.AAJ("entity", str);
            DbS.A1J(A0e, str2);
            A0e.AAJ("direct_session_id", str11);
            A0e.AAJ("entity_id", str4);
            A0e.AAJ("bottom_sheet_state", str5);
            C69479NmN nmN = null;
            if (num6 != null) {
                l2 = C51969G9p.A0r(num6);
            } else {
                l2 = null;
            }
            A0e.A9F("cluster_size", l2);
            if (num7 != null) {
                l3 = C51969G9p.A0r(num7);
            } else {
                l3 = null;
            }
            A0e.A9F("position", l3);
            if (num5 != null) {
                l4 = C51969G9p.A0r(num5);
            } else {
                l4 = null;
            }
            A0e.A9F("users_count", l4);
            if (num3 != null) {
                l5 = C51969G9p.A0r(num3);
            } else {
                l5 = null;
            }
            A0e.A9F("shots_count", l5);
            if (num2 != null) {
                l6 = C51969G9p.A0r(num2);
            } else {
                l6 = null;
            }
            A0e.A9F("notes_count", l6);
            A0e.A7p("opens_floaty_grid", bool);
            if (num4 != null) {
                l7 = C51969G9p.A0r(num4);
            } else {
                l7 = null;
            }
            A0e.A9F("unseen_updates_count", l7);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    str9 = intValue != 2 ? intValue != 1 ? "UNKNOWN" : "PUSH_NOTIFICATION" : "ACTIVITY_FEED";
                } else {
                    str9 = "INBOX_MAP_POG";
                }
            } else {
                str9 = null;
            }
            DbS.A1N(A0e, str9);
            A0e.AAJ("quick_emoji_selected", str6);
            A0e.A7p("default_emoji", bool2);
            A0e.A7p("new_emoji_selected", bool3);
            if (num8 != null) {
                l8 = C51969G9p.A0r(num8);
            } else {
                l8 = null;
            }
            A0e.A9F("card_index", l8);
            if (num9 != null) {
                l9 = C51969G9p.A0r(num9);
            } else {
                l9 = null;
            }
            A0e.A9F("max_card_index", l9);
            if (l != null) {
                d = Double.valueOf((double) l.longValue());
            } else {
                d = null;
            }
            A0e.A8D("dwell_time_ms", d);
            A0e.A7p("is_focus_mode", bool4);
            if (num10 != null) {
                l10 = C51969G9p.A0r(num10);
            } else {
                l10 = null;
            }
            A0e.A9F("last_active_locations_count", l10);
            A0e.A7p("is_self_pog", bool5);
            A0e.A8M(hOc, "nux_page");
            if (r12 != null) {
                int ordinal = r12.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        nmN = C69479NmN.BESTIES;
                    } else if (ordinal == 4) {
                        nmN = C69479NmN.ALLOWLIST;
                    } else if (ordinal == 5) {
                        nmN = C69479NmN.BLOCKLIST;
                    } else if (ordinal == 2) {
                        nmN = C69479NmN.MUTUAL_FOLLOWS;
                    }
                }
                nmN = C69479NmN.ONLY_OWNER;
            }
            A0e.A8M(nmN, "audience_type");
            A0e.A7p("is_precise", bool6);
            A0e.A8M(nlz, "permission_type");
            A0e.A8M(nmU, "permission_source");
            A0e.A8M(nmU2, "audience_select_entry_point");
            A0e.AAJ("location_name", str7);
            A0e.A7p("in_floaty_grid", bool7);
            A0e.A7p("sub_impression", bool8);
            A0e.AAe("locations_user_ids", list);
            A0e.AAe("notes_user_ids", list2);
            A0e.AAe("shots_user_ids", list3);
            A0e.AAe("updates_user_ids", list4);
            DbX.A1L(A0e);
        }
    }
}
