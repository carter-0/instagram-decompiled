package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ocl  reason: case insensitive filesystem */
public final class C71107Ocl {
    public static final C71107Ocl A00 = new Object();

    public static final AnonymousClass9JG A00(AnonymousClass7FU r3) {
        AnonymousClass9JG r0 = null;
        if (r3 instanceof C328687Ft) {
            Iterator it = ((C328687Ft) r3).A04.iterator();
            while (it.hasNext()) {
                List<AnonymousClass9JN> list = C68821NYf.A00(it).A0b;
                if (list != null) {
                    for (AnonymousClass9JN r02 : list) {
                        r0 = (AnonymousClass9JG) r02.A01;
                    }
                }
            }
        }
        return r0;
    }

    public final void A03(Activity activity, PointF pointF, View view, UserSession userSession, AnonymousClass7FU r42, C332837Wo r43, AnonymousClass7UB r44, AnonymousClass7YG r45, C74329Pt5 pt5, AnonymousClass7ST r47, AnonymousClass7X2 r48, C254743sy r49, C273414mX r50, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        AnonymousClass7ST r2 = r47;
        C332837Wo r9 = r43;
        C51969G9p.A1O(r2, 8, r9);
        C72512P8v p8v = C72512P8v.A00;
        AnonymousClass7FU r7 = r42;
        MessageIdentifier BSG = r7.BSG();
        long micros = TimeUnit.MILLISECONDS.toMicros(r7.BSP());
        UserSession userSession2 = userSession;
        C254743sy r23 = r49;
        C72526P9j p9j = C72526P9j.A00;
        AnonymousClass7UB r12 = r44;
        C273414mX r24 = r50;
        AnonymousClass7X2 r20 = r48;
        C74329Pt5 pt52 = pt5;
        AnonymousClass7YG r14 = r45;
        List list3 = list2;
        List list4 = list;
        String str4 = str3;
        View view2 = view;
        String str5 = str2;
        PointF pointF2 = pointF;
        String str6 = str;
        Activity activity2 = activity;
        C332257Ug r17 = (C332257Ug) r12;
        AnonymousClass7ST r18 = r2;
        AnonymousClass7SN r19 = (AnonymousClass7SN) r12;
        A02(activity2, pointF2, view2, userSession2, r7, (C332897Ww) null, r9, C72503P8m.A00, p8v, r12, P9U.A00, r14, pt52, p9j, r17, r18, r19, r20, r7.Aqm(), BSG, r23, r24, str6, str5, str4, list4, r7.Atz(), list3, C73784Pjj.A00, micros, z, AnonymousClass9HV.A00(userSession2).A00(C66647MaG.A08(r23), 42), !z2);
    }

    public static final void A02(Activity activity, PointF pointF, View view, UserSession userSession, AnonymousClass7FU r87, C332897Ww r88, C332837Wo r89, AnonymousClass7TK r90, AnonymousClass7SO r91, AnonymousClass7UB r92, AnonymousClass7TL r93, AnonymousClass7YG r94, C74329Pt5 pt5, AnonymousClass7YH r96, C332257Ug r97, AnonymousClass7ST r98, AnonymousClass7SN r99, AnonymousClass7X2 r100, 2FW r101, MessageIdentifier messageIdentifier, C254743sy r103, C273414mX r104, String str, String str2, String str3, List list, List list2, List list3, C62320sa r111, long j, boolean z, boolean z2, boolean z3) {
        List list4 = list2;
        List list5 = list;
        AnonymousClass7FU r13 = r87;
        AnonymousClass7SO r23 = r91;
        AnonymousClass7UB r26 = r92;
        AnonymousClass7TL r27 = r93;
        AnonymousClass7YG r30 = r94;
        C74329Pt5 pt52 = pt5;
        Activity activity2 = activity;
        C332897Ww r17 = r88;
        View view2 = view;
        C332837Wo r18 = r89;
        UserSession userSession2 = userSession;
        AnonymousClass7TK r19 = r90;
        PointF pointF2 = pointF;
        AnonymousClass7YH r32 = r96;
        C332257Ug r37 = r97;
        AnonymousClass7ST r39 = r98;
        AnonymousClass7SN r42 = r99;
        AnonymousClass7X2 r45 = r100;
        2FW r54 = r101;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        C254743sy r56 = r103;
        C273414mX r57 = r104;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        A01(activity2, pointF2, view2, (AiStudioLoggingData) null, userSession2, (OBX) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, (C70694OGp) null, r13, (AnonymousClass7XS) null, (C333157Xw) null, (C333177Xy) null, r17, r18, r19, (AnonymousClass7XC) null, (C332867Wr) null, (AnonymousClass7Ws) null, r23, (AnonymousClass7X4) null, (C333027Xj) null, r26, r27, (C333077Xo) null, (AnonymousClass7XF) null, r30, pt52, r32, (AnonymousClass7YI) null, (AnonymousClass7YJ) null, (AnonymousClass7YL) null, (AnonymousClass7XK) null, r37, (AnonymousClass7XG) null, r39, (AnonymousClass7XB) null, (AnonymousClass7XN) null, r42, (AnonymousClass7XO) null, (AnonymousClass7XP) null, r45, (N2I) null, (OFD) null, (C70562OBk) null, (OG4) null, (C328837Gl) null, (C328837Gl) null, (OG5) null, (C254703su) null, r54, messageIdentifier2, r56, r57, (Boolean) null, (Long) null, str4, str5, (String) null, (String) null, (String) null, str6, (String) null, (List) null, list5, list4, list3, r111, 0, 0, j, false, z, z2, true, false, true, z3, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d2, code lost:
        if (r185 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.app.Activity r103, android.graphics.PointF r104, android.view.View r105, com.instagram.aistudio.logging.AiStudioLoggingData r106, com.instagram.common.session.UserSession r107, X.OBX r108, X.C70694OGp r109, X.C70694OGp r110, X.C70694OGp r111, X.C70694OGp r112, X.C70694OGp r113, X.C70694OGp r114, X.C70694OGp r115, X.AnonymousClass7FU r116, X.AnonymousClass7XS r117, X.C333157Xw r118, X.C333177Xy r119, X.C332897Ww r120, X.C332837Wo r121, X.AnonymousClass7TK r122, X.AnonymousClass7XC r123, X.C332867Wr r124, X.AnonymousClass7Ws r125, X.AnonymousClass7SO r126, X.AnonymousClass7X4 r127, X.C333027Xj r128, X.AnonymousClass7UB r129, X.AnonymousClass7TL r130, X.C333077Xo r131, X.AnonymousClass7XF r132, X.AnonymousClass7YG r133, X.C74329Pt5 r134, X.AnonymousClass7YH r135, X.AnonymousClass7YI r136, X.AnonymousClass7YJ r137, X.AnonymousClass7YL r138, X.AnonymousClass7XK r139, X.C332257Ug r140, X.AnonymousClass7XG r141, X.AnonymousClass7ST r142, X.AnonymousClass7XB r143, X.AnonymousClass7XN r144, X.AnonymousClass7SN r145, X.AnonymousClass7XO r146, X.AnonymousClass7XP r147, X.AnonymousClass7X2 r148, X.N2I r149, X.OFD r150, X.C70562OBk r151, X.OG4 r152, X.C328837Gl r153, X.C328837Gl r154, X.OG5 r155, X.C254703su r156, X.2FW r157, com.instagram.model.direct.messageid.MessageIdentifier r158, X.C254743sy r159, X.C273414mX r160, java.lang.Boolean r161, java.lang.Long r162, java.lang.String r163, java.lang.String r164, java.lang.String r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, java.util.List r170, java.util.List r171, java.util.List r172, java.util.List r173, X.C62320sa r174, int r175, int r176, long r177, boolean r179, boolean r180, boolean r181, boolean r182, boolean r183, boolean r184, boolean r185, boolean r186, boolean r187, boolean r188) {
        /*
            r91 = r171
            boolean r0 = r91.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            r2 = 0
            r102 = r180
            if (r0 != 0) goto L_0x0012
            if (r180 == 0) goto L_0x015e
            if (r182 == 0) goto L_0x015e
        L_0x0012:
            r5 = r116
            boolean r0 = r5.CU2()
            boolean r100 = X.AnonymousClass7TF.A1S(r0, r3)
            boolean r0 = r5 instanceof X.C328687Ft
            r81 = 0
            if (r0 == 0) goto L_0x0170
            r0 = r5
            X.7Ft r0 = (X.C328687Ft) r0
            java.util.List r4 = r0.A04
            java.lang.Object r0 = X.00k.A0O(r4, r2)
            X.NYf r0 = (X.C68821NYf) r0
            if (r0 == 0) goto L_0x0170
            X.7Fr r1 = r0.A02
            com.instagram.model.mediasize.GifUrlImpl r0 = r1.A0N
            if (r0 == 0) goto L_0x0162
            java.lang.Integer r82 = X.C51968G9o.A0t(r4)
        L_0x0039:
            r80 = r161
            r4 = r160
            r65 = r159
            r79 = r158
            r78 = r157
            r64 = r156
            r62 = r155
            r61 = r154
            r60 = r153
            r59 = r152
            r58 = r151
            r57 = r150
            r56 = r149
            r55 = r148
            r54 = r147
            r53 = r146
            r10 = r145
            r51 = r144
            r50 = r143
            r49 = r141
            r33 = r124
            r70 = r183
            r35 = r127
            r39 = r131
            r84 = r163
            r75 = r104
            r85 = r164
            r7 = r105
            r77 = r106
            r87 = r166
            r6 = r107
            r88 = r167
            r17 = r108
            r89 = r168
            r18 = r109
            r90 = r169
            r19 = r110
            r67 = r170
            r21 = r112
            r110 = r188
            r69 = r175
            r109 = r187
            r36 = r128
            r68 = r174
            r24 = r115
            r93 = r173
            r23 = r114
            r34 = r125
            r106 = r181
            r99 = r179
            r29 = r120
            r96 = r177
            r27 = r118
            r95 = r176
            r26 = r117
            r92 = r172
            r22 = r113
            r32 = r123
            r28 = r119
            r40 = r132
            r8 = r103
            r83 = r162
            r41 = r133
            r42 = r134
            r44 = r136
            r45 = r137
            r46 = r138
            r47 = r139
            if (r182 == 0) goto L_0x0174
            X.0Tu r9 = X.0Tu.A05
            r0 = 36316491108323741(0x8105a80000119d, double:3.030033439451452E-306)
            boolean r0 = X.182.A06(r9, r6, r0)
            if (r0 == 0) goto L_0x00d4
            r107 = 1
            if (r185 == 0) goto L_0x00d6
        L_0x00d4:
            r107 = 0
        L_0x00d6:
            boolean r0 = X.AnonymousClass7TE.A1b(r91)
            if (r0 == 0) goto L_0x015f
            if (r107 != 0) goto L_0x015f
            r126.ABG()
            r72 = 1
        L_0x00e3:
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            if (r105 == 0) goto L_0x00ec
            r7.getGlobalVisibleRect(r0)
        L_0x00ec:
            X.LBc r73 = com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel.A0a
            r105 = r184 ^ 1
            r108 = r186
            r86 = r165
            r74 = r8
            r76 = r0
            r94 = r69
            r98 = r3
            r101 = r2
            r103 = r2
            r104 = r70
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r9 = r73.A00(r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110)
            r0 = 36
            X.0qQ.A0B(r10, r0)
            r0 = 38
            r11 = r140
            X.0qQ.A0B(r11, r0)
            boolean r0 = r9.A0X
            if (r0 == 0) goto L_0x012d
            X.1Av r0 = X.1Au.A00(r6)
            X.0qQ.A0B(r0, r2)
            java.lang.String r12 = "should_show_long_press_nux_count"
            X.0xa r3 = r0.A01
            int r1 = r3.getInt(r12, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x012d
            int r0 = r1 + 1
            X.AnonymousClass7TG.A1M(r3, r12, r0)
        L_0x012d:
            r1 = r122
            r1.ARf(r2)
            r37 = r129
            r37.E27()
            boolean r71 = r10.CW1()
            X.PA9 r0 = new X.PA9
            r20 = r111
            r38 = r130
            r30 = r121
            r43 = r135
            r25 = r5
            r31 = r1
            r48 = r11
            r52 = r10
            r63 = r9
            r66 = r4
            r15 = r7
            r16 = r6
            r13 = r0
            r14 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            r1 = r142
            r1.Eun(r0, r9)
        L_0x015e:
            return
        L_0x015f:
            r72 = 0
            goto L_0x00e3
        L_0x0162:
            X.777 r0 = r1.A0F
            if (r0 == 0) goto L_0x0170
            java.lang.Integer r0 = X.C51968G9o.A0t(r4)
            r82 = r81
            r81 = r0
            goto L_0x0039
        L_0x0170:
            r82 = r81
            goto L_0x0039
        L_0x0174:
            r10.CLU()
            X.LBc r71 = com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel.A0a
            r0 = 0
            r72 = r8
            r73 = r75
            r74 = r0
            r75 = r77
            r76 = r78
            r77 = r79
            r78 = r80
            r79 = r81
            r80 = r82
            r81 = r83
            r82 = r84
            r83 = r85
            r84 = r0
            r85 = r87
            r86 = r88
            r87 = r89
            r88 = r90
            r89 = r91
            r90 = r92
            r91 = r93
            r92 = r69
            r93 = r95
            r94 = r96
            r96 = r2
            r97 = r99
            r98 = r100
            r99 = r2
            r100 = r102
            r101 = r2
            r102 = r70
            r103 = r2
            r104 = r106
            r105 = r2
            r106 = r2
            r107 = r109
            r108 = r110
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r11 = r71.A00(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108)
            X.OMT r10 = new X.OMT
            r10.<init>(r6)
            java.util.List r9 = r11.A0L
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r9.iterator()
        L_0x01d5:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r12 = r13.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r12 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r12
            X.NkG r1 = r12.A01
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x01d5
            r15.add(r12)
            goto L_0x01d5
        L_0x01eb:
            java.util.ArrayList r14 = X.AnonymousClass7TG.A0r(r15)
            java.util.Iterator r12 = r15.iterator()
        L_0x01f3:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0205
            java.lang.Object r1 = r12.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r1 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r1
            java.lang.String r1 = r1.A04
            r14.add(r1)
            goto L_0x01f3
        L_0x0205:
            java.util.Iterator r16 = r9.iterator()
        L_0x0209:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x02b2
            java.lang.Object r13 = r16.next()
            r1 = r13
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r1 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r1
            X.NkG r12 = r1.A01
            X.NkG r1 = X.C69376NkG.A08
            if (r12 != r1) goto L_0x0209
        L_0x021c:
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r13 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r13
            X.8ab r12 = X.DbS.A0X(r8)
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r14 = r14.toArray(r1)
            java.lang.CharSequence[] r14 = (java.lang.CharSequence[]) r14
            X.OfP r1 = new X.OfP
            r71 = r1
            r73 = r7
            r74 = r6
            r75 = r10
            r76 = r17
            r77 = r18
            r78 = r19
            r79 = r21
            r80 = r22
            r81 = r23
            r82 = r24
            r83 = r5
            r84 = r26
            r85 = r27
            r86 = r28
            r87 = r29
            r88 = r32
            r89 = r33
            r90 = r34
            r91 = r35
            r92 = r36
            r93 = r39
            r94 = r40
            r95 = r41
            r96 = r42
            r97 = r44
            r98 = r45
            r99 = r46
            r100 = r47
            r101 = r49
            r102 = r50
            r103 = r51
            r104 = r53
            r105 = r54
            r106 = r55
            r107 = r56
            r108 = r57
            r109 = r58
            r110 = r59
            r111 = r60
            r112 = r61
            r113 = r62
            r114 = r11
            r115 = r64
            r116 = r65
            r117 = r15
            r118 = r67
            r119 = r68
            r120 = r69
            r121 = r70
            r71.<init>(r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121)
            r12.A0e(r1, r14)
            r12.A0r(r3)
            r12.A0s(r3)
            if (r13 == 0) goto L_0x02e6
            r1 = 2132018053(0x7f140385, float:1.9674402E38)
            com.instagram.common.ui.base.IgTextView r3 = new com.instagram.common.ui.base.IgTextView
            r3.<init>(r8, r0, r1)
            java.lang.String r0 = r13.A04
            r3.setText(r0)
            r0 = 2131100269(0x7f06026d, float:1.7812915E38)
            X.DbT.A17(r8, r3, r0)
            goto L_0x02b5
        L_0x02b2:
            r13 = 0
            goto L_0x021c
        L_0x02b5:
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ NotFoundException -> 0x02d6 }
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            float r0 = r1.getDimension(r0)     // Catch:{ NotFoundException -> 0x02d6 }
            r3.setTextSize(r2, r0)     // Catch:{ NotFoundException -> 0x02d6 }
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ NotFoundException -> 0x02d6 }
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r1 = X.DbS.A03(r1, r0)     // Catch:{ NotFoundException -> 0x02d6 }
            float r0 = X.JTR.A02(r8)     // Catch:{ NotFoundException -> 0x02d6 }
            int r0 = (int) r0     // Catch:{ NotFoundException -> 0x02d6 }
            r3.setPadding(r1, r1, r1, r0)     // Catch:{ NotFoundException -> 0x02d6 }
            goto L_0x02e3
        L_0x02d6:
            r0 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = r0.getMessage()
            X.DbT.A1Q(r2, r0, r1)
        L_0x02e3:
            r12.A0k(r3)
        L_0x02e6:
            if (r160 == 0) goto L_0x02ec
            r0 = 5
            X.C71250OgH.A00(r12, r4, r0)
        L_0x02ec:
            X.DbT.A1V(r12)
            java.lang.String r1 = "dialog"
            r0 = r65
            r10.A01(r11, r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71107Ocl.A01(android.app.Activity, android.graphics.PointF, android.view.View, com.instagram.aistudio.logging.AiStudioLoggingData, com.instagram.common.session.UserSession, X.OBX, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.7FU, X.7XS, X.7Xw, X.7Xy, X.7Ww, X.7Wo, X.7TK, X.7XC, X.7Wr, X.7Ws, X.7SO, X.7X4, X.7Xj, X.7UB, X.7TL, X.7Xo, X.7XF, X.7YG, X.Pt5, X.7YH, X.7YI, X.7YJ, X.7YL, X.7XK, X.7Ug, X.7XG, X.7ST, X.7XB, X.7XN, X.7SN, X.7XO, X.7XP, X.7X2, X.N2I, X.OFD, X.OBk, X.OG4, X.7Gl, X.7Gl, X.OG5, X.3su, X.2FW, com.instagram.model.direct.messageid.MessageIdentifier, X.3sy, X.4mX, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, X.0sa, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    /* JADX WARNING: type inference failed for: r0v92, types: [java.lang.Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0248, code lost:
        r19.Eur(r23, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x024f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03cc, code lost:
        r18.Dry(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x061a, code lost:
        r20.CJS((android.graphics.RectF) null, r1, r2, (com.instagram.ui.widget.gradientspinner.GradientSpinner) null, (java.lang.Integer) null, r26, r27, r85, (java.lang.String) null, (java.lang.String) null, r4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0637, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.app.Activity r37, android.view.View r38, com.instagram.common.session.UserSession r39, X.OBX r40, X.C70694OGp r41, X.C70694OGp r42, X.C70694OGp r43, X.C70694OGp r44, X.C70694OGp r45, X.C70694OGp r46, X.C70694OGp r47, X.AnonymousClass7FU r48, X.AnonymousClass7XS r49, X.C333157Xw r50, X.C333177Xy r51, X.C332897Ww r52, X.AnonymousClass7XC r53, X.C332867Wr r54, X.AnonymousClass7Ws r55, X.AnonymousClass7X4 r56, X.C333027Xj r57, X.C333077Xo r58, X.AnonymousClass7XF r59, X.AnonymousClass7YG r60, X.C74329Pt5 r61, X.AnonymousClass7YI r62, X.AnonymousClass7YJ r63, X.AnonymousClass7YL r64, X.AnonymousClass7XK r65, X.AnonymousClass7XG r66, X.AnonymousClass7XB r67, X.AnonymousClass7XN r68, X.AnonymousClass7XO r69, X.AnonymousClass7XP r70, X.AnonymousClass7X2 r71, X.N2I r72, X.OFD r73, X.C70562OBk r74, X.OG4 r75, X.C328837Gl r76, X.C328837Gl r77, X.OG5 r78, X.C254703su r79, X.2FW r80, com.instagram.model.direct.messageid.MessageIdentifier r81, X.C254743sy r82, java.lang.Integer r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.util.List r87, X.C62320sa r88, int r89, long r90, boolean r92, boolean r93) {
        /*
            r36 = this;
            r2 = r81
            r22 = r87
            r7 = 0
            r10 = 1
            r25 = r37
            r0 = r25
            X.AnonymousClass7TF.A1F(r0, r10, r2)
            r0 = 10
            r3 = r83
            X.0qQ.A0B(r3, r0)
            java.lang.String r5 = r2.A01
            java.lang.String r9 = r2.A00()
            r0 = 0
            r23 = r48
            java.util.List r17 = r23.Atz()
            java.lang.String r1 = r23.Bze()
            java.lang.String r4 = ""
            r26 = r4
            if (r1 != 0) goto L_0x002c
            r1 = r4
        L_0x002c:
            int r16 = r3.intValue()
            r3 = 1
            r20 = r55
            r12 = r54
            r13 = r53
            r14 = r52
            r21 = r38
            r24 = r39
            r27 = r90
            r8 = r79
            r6 = r80
            r15 = r82
            r11 = r71
            r18 = r69
            r19 = r68
            switch(r16) {
                case 0: goto L_0x06ea;
                case 1: goto L_0x0244;
                case 2: goto L_0x0250;
                case 3: goto L_0x005d;
                case 4: goto L_0x06db;
                case 5: goto L_0x0260;
                case 6: goto L_0x03a3;
                case 7: goto L_0x03a3;
                case 8: goto L_0x06be;
                case 9: goto L_0x06be;
                case 10: goto L_0x0053;
                case 11: goto L_0x00e8;
                case 12: goto L_0x00e0;
                case 13: goto L_0x00f0;
                case 14: goto L_0x0107;
                case 15: goto L_0x0121;
                case 16: goto L_0x012b;
                case 17: goto L_0x0138;
                case 18: goto L_0x0660;
                case 19: goto L_0x0268;
                case 20: goto L_0x028e;
                case 21: goto L_0x0329;
                case 22: goto L_0x0362;
                case 23: goto L_0x0670;
                case 24: goto L_0x06ea;
                case 25: goto L_0x038b;
                case 26: goto L_0x0396;
                case 27: goto L_0x060b;
                case 28: goto L_0x0140;
                case 29: goto L_0x03b4;
                case 30: goto L_0x03ba;
                case 31: goto L_0x03c3;
                case 32: goto L_0x03c8;
                case 33: goto L_0x03c8;
                case 34: goto L_0x03c3;
                case 35: goto L_0x0472;
                case 36: goto L_0x04e5;
                case 37: goto L_0x06ea;
                case 38: goto L_0x03d2;
                case 39: goto L_0x03de;
                case 40: goto L_0x051b;
                case 41: goto L_0x06ea;
                case 42: goto L_0x06ea;
                case 43: goto L_0x06ea;
                case 44: goto L_0x0515;
                case 45: goto L_0x056a;
                case 46: goto L_0x05ae;
                case 47: goto L_0x05fe;
                case 48: goto L_0x055b;
                case 49: goto L_0x06ea;
                case 50: goto L_0x0146;
                case 51: goto L_0x020d;
                case 52: goto L_0x0638;
                case 53: goto L_0x063e;
                case 54: goto L_0x0067;
                case 55: goto L_0x067e;
                case 56: goto L_0x06ea;
                case 57: goto L_0x0644;
                case 58: goto L_0x05c2;
                case 59: goto L_0x06ea;
                default: goto L_0x004e;
            }
        L_0x004e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0053:
            r1 = r63
            if (r63 == 0) goto L_0x06ea
            java.lang.String r0 = "message_menu"
            r1.EK6(r2, r0)
            return
        L_0x005d:
            r1 = r60
            if (r60 == 0) goto L_0x06ea
            r0 = r93
            r1.EGD(r2, r0)
            return
        L_0x0067:
            r2 = r78
            if (r78 == 0) goto L_0x06ea
            X.OT9 r1 = r2.A03
            com.instagram.common.session.UserSession r7 = r2.A02
            java.lang.String r0 = "DirectReportDailyPromptInteractor.reportDailyPrompt"
            X.3su r4 = X.OT9.A00(r1, r5, r0, r10)
            if (r4 == 0) goto L_0x06ea
            X.3tC r0 = X.C3266377o.A00(r4)
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x06ea
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = r1.getScheme()
            java.lang.String r5 = "instagram"
            if (r0 == 0) goto L_0x06ea
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x06ea
            java.lang.String r0 = "collection_id"
            java.lang.String r11 = r1.getQueryParameter(r0)
            if (r11 == 0) goto L_0x06ea
            X.0eK r0 = r2.A04
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            java.lang.String r14 = r0.C6C()
            X.3tC r0 = X.C3266377o.A00(r4)
            java.lang.String r1 = r0.A0u
            r0 = 0
            if (r1 == 0) goto L_0x00c2
            android.net.Uri r3 = X.DbT.A09(r1)
            java.lang.String r1 = r3.getScheme()
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00c2
            java.lang.String r0 = "collection_type"
            java.lang.String r0 = r3.getQueryParameter(r0)
        L_0x00c2:
            com.instagram.direct.prompts.DirectPromptTypes r8 = X.AnonymousClass79B.A01(r0)
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.DAILY_PROMPT
            if (r8 == r0) goto L_0x00ce
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r8 != r0) goto L_0x06ea
        L_0x00ce:
            android.app.Activity r5 = r2.A00
            java.lang.String r12 = r4.A0g()
            java.lang.String r13 = r4.A1u
            X.0iw r6 = r2.A01
            X.UzD r10 = X.C16677UzD.IGD_PROMPT
            X.TpH r9 = X.C14068TpH.IGD_PROMPT_V2_GRID_VIEW
            X.C71128OdR.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00e0:
            r0 = r50
            if (r50 == 0) goto L_0x06ea
            r0.AKo(r2)
            return
        L_0x00e8:
            r0 = r62
            if (r62 == 0) goto L_0x06ea
            r0.EJu(r2)
            return
        L_0x00f0:
            r3 = r70
            if (r70 == 0) goto L_0x06ea
            if (r17 == 0) goto L_0x00fc
            java.lang.Object r0 = X.00k.A0J(r17)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00fc:
            java.lang.String r7 = "action_menu"
            r4 = r6
            r5 = r2
            r6 = r0
            r8 = r27
            r3.DRs(r4, r5, r6, r7, r8)
            return
        L_0x0107:
            r8 = r56
            if (r56 == 0) goto L_0x06ea
            if (r17 == 0) goto L_0x0113
            java.lang.Object r0 = X.00k.A0J(r17)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0113:
            r13 = 0
            java.lang.String r11 = "action_menu"
            r9 = r6
            r10 = r2
            r12 = r0
            r14 = r27
            r16 = r7
            r8.DRe(r9, r10, r11, r12, r13, r14, r16)
            return
        L_0x0121:
            r3 = r66
            if (r66 == 0) goto L_0x06ea
            r0 = r27
            r3.E0y(r2, r0)
            return
        L_0x012b:
            r1 = r58
            if (r58 == 0) goto L_0x06ea
            X.28D r3 = X.28D.A2Q
            r2 = r0
            r4 = r0
            r6 = r0
            r1.De1(r2, r3, r4, r5, r6)
            return
        L_0x0138:
            r0 = r59
            if (r59 == 0) goto L_0x06ea
            r0.EFg(r2)
            return
        L_0x0140:
            if (r68 == 0) goto L_0x06ea
            X.Njm r3 = X.C69347Njm.LONG_PRESS_REIMAGINE
            goto L_0x0248
        L_0x0146:
            if (r79 == 0) goto L_0x06ea
            X.7AG r1 = r8.A0Q
            if (r1 == 0) goto L_0x0203
            java.lang.String r2 = r1.A08
            X.77w r6 = X.C3267177w.A00
            java.lang.String r1 = X.C3267177w.A01(r8)
            if (r1 == 0) goto L_0x06ea
            java.lang.String r9 = X.C3267177w.A02(r8, r1)
        L_0x015a:
            if (r9 == 0) goto L_0x06ea
            r1 = r25
            java.lang.String r10 = X.C3267177w.A00(r1, r8)
            if (r10 == 0) goto L_0x06ea
            X.1Xj r1 = r8.A0s
            r5 = 0
            if (r1 == 0) goto L_0x01d4
            int r4 = r1.A0y()
            int r1 = r1.A0x()
            if (r4 <= 0) goto L_0x017a
            if (r1 <= 0) goto L_0x017a
            android.util.Size r5 = new android.util.Size
            r5.<init>(r4, r1)
        L_0x017a:
            boolean r4 = r6.A03(r8)
            if (r3 == 0) goto L_0x01d1
            X.Nky r14 = X.C69416Nky.A0H
        L_0x0182:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r89)
            boolean r12 = X.AnonymousClass48O.A06(r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r16 = 0
            if (r5 == 0) goto L_0x01cf
            int r0 = r5.getWidth()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r0 = r5.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01a2:
            X.HtR r5 = new X.HtR
            r8 = r0
            r11 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            if (r82 == 0) goto L_0x06ea
            if (r87 != 0) goto L_0x01af
            X.0sn r22 = X.0sn.A00
        L_0x01af:
            X.OVN r13 = new X.OVN
            r23 = r92
            r18 = r13
            r19 = r25
            r20 = r24
            r21 = r15
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.Object r0 = r88.invoke()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            r19 = 184(0xb8, float:2.58E-43)
            r15 = r5
            r18 = r0
            X.OVN.A00(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x01cf:
            r7 = r0
            goto L_0x01a2
        L_0x01d1:
            X.Nky r14 = X.C69416Nky.A0I
            goto L_0x0182
        L_0x01d4:
            java.lang.Object r4 = r8.A1T
            boolean r1 = r4 instanceof java.util.List
            if (r1 == 0) goto L_0x0201
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0201
            java.lang.Object r4 = X.00k.A0J(r4)
        L_0x01e2:
            boolean r1 = r4 instanceof X.C254873tC
            if (r1 == 0) goto L_0x017a
            X.3tC r4 = (X.C254873tC) r4
            if (r4 == 0) goto L_0x017a
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r4.A0X
            if (r1 == 0) goto L_0x017a
            int r4 = r1.getWidth()
            if (r4 <= 0) goto L_0x017a
            int r1 = r1.getHeight()
            if (r1 <= 0) goto L_0x017a
            android.util.Size r5 = new android.util.Size
            r5.<init>(r4, r1)
            goto L_0x017a
        L_0x0201:
            r4 = r5
            goto L_0x01e2
        L_0x0203:
            r2 = r0
            r3 = 0
            X.77w r6 = X.C3267177w.A00
            java.lang.String r9 = X.C3267177w.A01(r8)
            goto L_0x015a
        L_0x020d:
            r2 = r40
            if (r40 == 0) goto L_0x06ea
            X.0eK r0 = r2.A01
            java.lang.Object r0 = X.C66580MXl.A0s(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S9 r0 = r0.AvL()
            X.7LQ r0 = r0.BSO(r5)
            if (r0 == 0) goto L_0x06ea
            X.3su r0 = r0.A0e
            if (r0 == 0) goto L_0x06ea
            X.7AG r0 = r0.A0Q
            if (r0 == 0) goto L_0x06ea
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x06ea
            X.7SM r0 = r2.A00
            X.9H7 r2 = r0.A00
            X.7Hl r0 = X.AnonymousClass9H7.A06(r2)
            r0.A1Q(r1)
            X.7JY r1 = X.AnonymousClass7JY.IMAGINE
            X.7Hl r0 = X.AnonymousClass9H7.A06(r2)
            r0.A1N(r1)
            return
        L_0x0244:
            if (r68 == 0) goto L_0x06ea
            X.Njm r3 = X.C69347Njm.LONG_PRESS
        L_0x0248:
            r1 = r23
            r0 = r19
            r0.Eur(r1, r3, r2)
            return
        L_0x0250:
            r1 = r49
            if (r49 == 0) goto L_0x06ea
            java.lang.String r8 = "long_press"
            r4 = r84
            r3 = r0
            r5 = r0
            r6 = r0
            r7 = r0
            r1.EuG(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0260:
            if (r71 == 0) goto L_0x06ea
            r0 = r27
            r11.AAr(r2, r0)
            return
        L_0x0268:
            X.9JG r0 = A00(r23)
            r3 = r65
            if (r0 == 0) goto L_0x0286
            java.lang.String r0 = r0.A02
            com.instagram.direct.prompts.DirectPromptTypes r1 = X.AnonymousClass79B.A01(r0)
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.DAILY_PROMPT
            if (r1 != r0) goto L_0x0286
            if (r65 == 0) goto L_0x06ea
            X.9JG r1 = A00(r23)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r3.Erd(r1, r2, r0)
            return
        L_0x0286:
            if (r65 == 0) goto L_0x06ea
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r3.ErZ(r2, r0)
            return
        L_0x028e:
            r9 = r76
            if (r76 == 0) goto L_0x06ea
            if (r79 == 0) goto L_0x06ea
            X.3t0 r8 = r8.A0U()
            if (r8 == 0) goto L_0x06ea
            java.lang.String r6 = r8.A00
            if (r6 == 0) goto L_0x06ea
            X.2Dm r3 = r9.A02
            r4 = r3
            X.2Dr r4 = (X.2Dr) r4
            X.3U9 r0 = r4.A0N(r6)
            if (r0 == 0) goto L_0x06ea
            java.util.List r0 = r0.BcW()
            if (r0 == 0) goto L_0x0325
            int r1 = r0.size()
            r0 = 3
            if (r1 != r0) goto L_0x0325
            r0 = 0
            java.lang.String r1 = java.lang.String.valueOf(r6)
            X.0qQ.A0B(r1, r7)
            X.3U9 r1 = r4.A0N(r1)
            if (r1 == 0) goto L_0x06ea
            com.instagram.model.direct.DirectThreadKey r1 = r1.BJz()
            X.3su r5 = r3.BRz(r1, r5)
            android.content.Context r1 = r9.A00
            X.8ab r4 = X.DbS.A0Y(r1)
            r1 = 2131969467(0x7f1345bb, float:1.9575858E38)
            r4.A09(r1)
            r1 = 2131969465(0x7f1345b9, float:1.9575854E38)
            r4.A08(r1)
            r3 = 2131969466(0x7f1345ba, float:1.9575856E38)
            X.Of8 r1 = new X.Of8
            r11 = r1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r4.A0I(r1, r3)
            r2 = 4
            X.Of3 r1 = new X.Of3
            r1.<init>(r2, r9, r5, r8)
            r4.A0C(r1)
            X.AnonymousClass7TH.A0a(r4, r10)
            com.instagram.common.session.UserSession r1 = r9.A01
            X.Os8 r1 = X.C69841Nt5.A00(r1)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            if (r5 == 0) goto L_0x030a
            X.2FW r0 = r5.A10
        L_0x030a:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r3, r7)
            X.0qQ.A0B(r2, r10)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "direct_replace_pin_open"
            X.0Aj r1 = X.C66582MXn.A0H(r1, r0, r3)
            java.lang.String r0 = "media_type"
            r1.AAJ(r0, r2)
            r1.Cgf()
            return
        L_0x0325:
            X.C328837Gl.A00(r9, r8, r2)
            return
        L_0x0329:
            r3 = r77
            if (r77 == 0) goto L_0x06ea
            if (r79 == 0) goto L_0x06ea
            X.3t0 r1 = r8.A0U()
            if (r1 == 0) goto L_0x06ea
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x06ea
            X.1ET r4 = X.1ES.A01()
            com.instagram.common.session.UserSession r1 = r3.A01
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "direct_v2/threads/%s/unpin_message/"
            r3.A0K(r1, r2)
            java.lang.String r1 = "unpin_message_item_id"
            r3.A9m(r1, r5)
            java.lang.String r1 = "client_context"
            r3.A9m(r1, r9)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            X.1OC r0 = X.DbT.A0R(r0, r3, r2, r1, r7)
            r4.schedule(r0)
            return
        L_0x0362:
            r4 = r73
            if (r73 == 0) goto L_0x06ea
            android.app.Activity r0 = r4.A00
            X.8ab r3 = X.DbS.A0X(r0)
            r0 = 2131973640(0x7f135608, float:1.9584322E38)
            r3.A09(r0)
            r0 = 2131973639(0x7f135607, float:1.958432E38)
            r3.A08(r0)
            r1 = 13
            X.Of1 r0 = new X.Of1
            r0.<init>(r1, r2, r4)
            r3.A0F(r0)
            X.Ofx r0 = X.C71232Ofx.A00
            r3.A0C(r0)
            X.AnonymousClass7TH.A0a(r3, r10)
            return
        L_0x038b:
            if (r54 == 0) goto L_0x06ea
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r0.<init>(r6, r5, r9)
            r12.CHn(r0)
            return
        L_0x0396:
            if (r54 == 0) goto L_0x06ea
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r1.<init>(r6, r5, r9)
            X.Pjh r0 = X.C73782Pjh.A00
            r12.CHm(r1, r0)
            return
        L_0x03a3:
            r1 = r44
            if (r44 == 0) goto L_0x06ea
            X.4DH r1 = r1.A00
            android.content.Context r2 = r1.requireContext()
            r1 = 2131958605(0x7f131b4d, float:1.9553827E38)
            X.C59689JTv.A01(r2, r0, r1, r7)
            return
        L_0x03b4:
            if (r52 == 0) goto L_0x06ea
            r14.ASg(r2)
            return
        L_0x03ba:
            if (r52 == 0) goto L_0x06ea
            r14.ASg(r2)
            r14.AOV()
            return
        L_0x03c3:
            if (r69 == 0) goto L_0x06ea
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x03cc
        L_0x03c8:
            if (r69 == 0) goto L_0x06ea
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x03cc:
            r0 = r18
            r0.Dry(r2, r1)
            return
        L_0x03d2:
            r1 = r72
            if (r72 == 0) goto L_0x06ea
            r2 = r51
            if (r51 == 0) goto L_0x06ea
            r2.Euq(r1)
            throw r0
        L_0x03de:
            r8 = r75
            if (r75 == 0) goto L_0x06ea
            if (r82 == 0) goto L_0x06ea
            X.3t3 r3 = X.C66647MaG.A08(r15)
            if (r3 == 0) goto L_0x06ea
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = r8.A02
            X.0Ud r1 = r1.A0D
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r10 = r1.iterator()
        L_0x03f8:
            boolean r1 = r10.hasNext()
            r6 = 0
            if (r1 == 0) goto L_0x0470
            java.lang.Object r4 = r10.next()
            r1 = r4
            X.4lA r1 = (X.C272664lA) r1
            com.instagram.api.schemas.UserMonetizationProductType r2 = r1.A07
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r2 != r1) goto L_0x03f8
        L_0x040c:
            X.4lA r4 = (X.C272664lA) r4
            if (r4 == 0) goto L_0x0412
            com.instagram.api.schemas.MonetizationEligibilityDecision r6 = r4.A05
        L_0x0412:
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
            if (r6 == r1) goto L_0x0448
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE
            if (r6 == r1) goto L_0x0448
            com.instagram.common.session.UserSession r6 = r8.A03
            boolean r1 = X.C347037wA.A04(r6)
            if (r1 != 0) goto L_0x0448
            X.6Yo r4 = r8.A01
            if (r4 != 0) goto L_0x042e
            X.0eM r1 = r8.A04
            java.lang.Object r4 = r1.getValue()
            X.6Yo r4 = (X.C309516Yo) r4
        L_0x042e:
            X.F6R.A01()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r3 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r3.<init>()
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            java.lang.String r1 = "eligible_pending_opt_in"
            androidx.fragment.app.Fragment r1 = r3.A00(r2, r6, r1, r7)
            r4.A0B(r0, r1)
        L_0x0441:
            r4.A08()
            r4.A04()
            return
        L_0x0448:
            X.6Yo r4 = r8.A01
            if (r4 != 0) goto L_0x0454
            X.0eM r0 = r8.A04
            java.lang.Object r4 = r0.getValue()
            X.6Yo r4 = (X.C309516Yo) r4
        L_0x0454:
            X.E49 r2 = new X.E49
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "DirectPaidPartnershipSettingsFragment.ARGUMENT_THREAD_ID"
            X.OXL.A02(r1, r3, r0)
            java.lang.String r0 = "DirectPaidPartnershipSettingsFragment.ARGUMENT_MESSAGE_ID"
            r1.putString(r0, r5)
            java.lang.String r0 = "DirectPaidPartnershipSettingsFragment.ARGUMENT_CLIENT_CONTEXT"
            r1.putString(r0, r9)
            r4.A0B(r1, r2)
            goto L_0x0441
        L_0x0470:
            r4 = r6
            goto L_0x040c
        L_0x0472:
            r7 = r41
            if (r41 == 0) goto L_0x06ea
            X.7FR r2 = r23.BOV()
            if (r2 == 0) goto L_0x0480
            java.lang.Integer r6 = r2.A01
            if (r6 != 0) goto L_0x04e0
        L_0x0480:
            java.lang.Integer r6 = X.AnonymousClass05K.A0u
            if (r2 != 0) goto L_0x04e0
            r5 = r0
        L_0x0485:
            X.0sa r4 = r7.A05
            X.7Zg r2 = X.C66580MXl.A0W(r4)
            X.7SD r2 = X.C66581MXm.A0Z(r2)
            int r3 = r2.A08
            r2 = 29
            boolean r8 = X.AnonymousClass7TF.A1S(r3, r2)
            X.7Zg r2 = X.C66580MXl.A0W(r4)
            X.7S7 r3 = r2.C6l()
            boolean r2 = r3.CdK()
            if (r2 != 0) goto L_0x04de
            boolean r2 = r3.CYS()
            if (r2 != 0) goto L_0x04de
            r2 = 8
            X.Phe r4 = new X.Phe
            r4.<init>(r2, r7, r6)
        L_0x04b2:
            com.instagram.common.session.UserSession r11 = r7.A01
            X.4DH r12 = r7.A00
            android.content.Context r2 = r12.requireContext()
            android.content.Context r9 = X.DbT.A05(r2)
            if (r8 == 0) goto L_0x04db
            java.lang.Integer r14 = X.AnonymousClass05K.A01
        L_0x04c2:
            r3 = 39
            X.Phi r2 = new X.Phi
            r2.<init>(r1, r7, r3)
            X.4DU r10 = r7.A03
            r18 = 0
            r17 = r0
            r19 = r2
            r20 = r4
            r13 = r5
            r15 = r6
            r16 = r1
            X.C71044OaM.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x04db:
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            goto L_0x04c2
        L_0x04de:
            r4 = 0
            goto L_0x04b2
        L_0x04e0:
            com.instagram.model.mediasize.GifUrlImpl r5 = r2.A00
            java.lang.String r0 = r2.A03
            goto L_0x0485
        L_0x04e5:
            r6 = r42
            if (r42 == 0) goto L_0x06ea
            X.7FR r2 = r23.BOV()
            if (r2 == 0) goto L_0x04f3
            java.lang.Integer r5 = r2.A01
            if (r5 != 0) goto L_0x0510
        L_0x04f3:
            java.lang.Integer r5 = X.AnonymousClass05K.A0u
            if (r2 != 0) goto L_0x0510
            r4 = r0
        L_0x04f8:
            com.instagram.common.session.UserSession r8 = r6.A01
            r2 = 40
            X.Phi r3 = new X.Phi
            r3.<init>(r1, r6, r2)
            X.4DU r7 = r6.A03
            X.4DH r2 = r6.A00
            r14 = 0
            r13 = r0
            r15 = r3
            r9 = r2
            r10 = r4
            r11 = r5
            r12 = r1
            X.C71044OaM.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0510:
            com.instagram.model.mediasize.GifUrlImpl r4 = r2.A00
            java.lang.String r0 = r2.A03
            goto L_0x04f8
        L_0x0515:
            if (r61 == 0) goto L_0x06ea
            r61.EHp()
            return
        L_0x051b:
            r3 = r74
            if (r74 == 0) goto L_0x06ea
            if (r82 == 0) goto L_0x0527
            java.lang.String r1 = X.C66647MaG.A0C(r15)
            if (r1 != 0) goto L_0x0528
        L_0x0527:
            r1 = r4
        L_0x0528:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r7 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r7.<init>(r6, r5, r9)
            java.lang.String r0 = "thread_igid"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r7.A02
            if (r1 != 0) goto L_0x0538
            r1 = r4
        L_0x0538:
            java.lang.String r0 = "message_igid"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x0543
            r4 = r0
        L_0x0543:
            java.lang.String r0 = "otid"
            java.util.LinkedHashMap r1 = X.DbY.A0q(r0, r4, r2, r1)
            java.lang.String r0 = "com.bloks.www.ig.creator_ai.inspect.internal"
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            android.app.Activity r1 = r3.A00
            com.instagram.common.session.UserSession r0 = r3.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r0)
            r2.A0D(r1, r0)
            return
        L_0x055b:
            if (r86 == 0) goto L_0x06ea
            r1 = r57
            if (r57 == 0) goto L_0x06ea
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r0.<init>(r6, r5, r9)
            r1.Cpb(r0)
            return
        L_0x056a:
            r2 = r43
            if (r43 == 0) goto L_0x06ea
            X.4DH r0 = r2.A00
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r2.A01
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r3 = "_"
            int r2 = r1.length()
            int r0 = r2 + -1
            int r0 = X.00l.A07(r1, r3, r0)
            int r0 = r0 + 1
            if (r0 >= r2) goto L_0x0592
            java.lang.String r1 = X.C66580MXl.A0z(r1, r0)
        L_0x0592:
            java.lang.String r0 = "cutout_sticker_id"
            r7.A04(r0, r1)
            com.facebook.pando.PandoGraphQLRequest r4 = X.C71580OnH.A00(r7, r4, r10)
            X.1vn r3 = X.1vm.A01(r5)
            X.0qQ.A0A(r4)
            X.OnD r2 = X.C71576OnD.A00
            r1 = 4
            X.Omr r0 = new X.Omr
            r0.<init>(r1, r5, r6)
            r3.ATL(r0, r2, r4)
            return
        L_0x05ae:
            r0 = r45
            if (r45 == 0) goto L_0x06ea
            X.7SM r0 = r0.A02
            X.NjK r2 = X.C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER
            java.lang.String r1 = "stickers"
            X.9H7 r0 = r0.A00
            X.7Hl r0 = X.AnonymousClass9H7.A06(r0)
            r0.A1L(r2, r1, r4)
            return
        L_0x05c2:
            if (r82 == 0) goto L_0x06ea
            boolean r0 = r15 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x06ea
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r15)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.0B0.A00(r0)
            java.lang.String r0 = "magic_media_remix_template_direct_thread_key"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "magic_media_remix_template_position"
            r4.putInt(r0, r7)
            java.lang.String r1 = "magic_media_remix_template_layout_name"
            java.lang.String r0 = "POLAROID_2X"
            r4.putString(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = "magic_media_remix_template_bitmap_paths"
            r4.putStringArrayList(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r2 = "MAGIC_MEDIA_REMIX_TEMPLATE"
            r1 = r24
            r0 = r25
            X.6W8 r1 = X.DbS.A0b(r0, r4, r1, r3, r2)
            X.C66581MXm.A16(r0, r1)
            return
        L_0x05fe:
            if (r55 == 0) goto L_0x06ea
            if (r86 == 0) goto L_0x0604
            r4 = r86
        L_0x0604:
            X.2FW r1 = X.2FW.A0y
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r2
            java.lang.String r27 = "xma_long_press_action"
            goto L_0x061a
        L_0x060b:
            if (r55 == 0) goto L_0x06ea
            if (r86 == 0) goto L_0x0611
            r4 = r86
        L_0x0611:
            X.2FW r1 = X.2FW.A0y
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r2.<init>(r1, r5, r9)
            java.lang.String r27 = "xma_igd_genai_updates"
        L_0x061a:
            r28 = r85
            r24 = r0
            r25 = r0
            r29 = r0
            r30 = r0
            r31 = r4
            r32 = r0
            r33 = r0
            r34 = r0
            r35 = r0
            r21 = r0
            r22 = r1
            r23 = r2
            r20.CJS(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        L_0x0638:
            if (r71 == 0) goto L_0x06ea
            r11.FJF(r2)
            return
        L_0x063e:
            if (r53 == 0) goto L_0x06ea
            r13.Erc(r2)
            return
        L_0x0644:
            r0 = r47
            if (r47 == 0) goto L_0x06ea
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.4DH r0 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            r0 = 470(0x1d6, float:6.59E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 1109(0x455, float:1.554E-42)
            X.AnonymousClass6W8.A05(r2, r3, r4, r1, r0)
            return
        L_0x0660:
            r2 = r64
            if (r64 == 0) goto L_0x06ea
            X.7FR r0 = r23.BOV()
            java.lang.String r1 = r0.A03
            boolean r0 = r0.A0y
            r2.EKr(r1, r0)
            return
        L_0x0670:
            r3 = r67
            if (r67 == 0) goto L_0x06ea
            r4 = r21
            r5 = r8
            r6 = r2
            r7 = r27
            r3.Euo(r4, r5, r6, r7)
            return
        L_0x067e:
            X.7FR r0 = r23.BOV()
            if (r0 == 0) goto L_0x06ea
            java.lang.String r6 = r0.A07
            if (r6 == 0) goto L_0x06ea
            r0 = r46
            if (r46 == 0) goto L_0x06ea
            X.7SM r0 = r0.A02
            X.9H7 r0 = r0.A00
            X.7Hl r5 = X.AnonymousClass9H7.A06(r0)
            r5.A16()
            X.PSA r3 = new X.PSA
            r3.<init>(r5)
            X.NK0 r2 = new X.NK0
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "sticker_pack_id"
            r1.putString(r0, r6)
            r2.setArguments(r1)
            X.O6o r0 = new X.O6o
            r0.<init>(r3)
            r2.A00 = r0
            X.NjK r0 = X.C69319NjK.MESSAGE_LONG_PRESS_VIEW_STICKER_PACK
            X.PEj r0 = X.C329067Hl.A07(r0, r5, r4, r4)
            X.AnonymousClass7ON.A02(r2, r0)
            return
        L_0x06be:
            int r1 = r23.BIZ()
            boolean r0 = r23.CU2()
            if (r0 == r10) goto L_0x06c9
            r3 = 0
        L_0x06c9:
            if (r53 == 0) goto L_0x06ea
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r0.<init>(r6, r5, r9)
            if (r80 == 0) goto L_0x06d6
            r13.AWQ(r6, r0, r1, r3)
            return
        L_0x06d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x06db:
            if (r71 == 0) goto L_0x06ea
            r20 = r11
            r22 = r23
            r23 = r2
            r24 = r0
            r25 = r27
            r20.FJD(r21, r22, r23, r24, r25)
        L_0x06ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71107Ocl.A04(android.app.Activity, android.view.View, com.instagram.common.session.UserSession, X.OBX, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.OGp, X.7FU, X.7XS, X.7Xw, X.7Xy, X.7Ww, X.7XC, X.7Wr, X.7Ws, X.7X4, X.7Xj, X.7Xo, X.7XF, X.7YG, X.Pt5, X.7YI, X.7YJ, X.7YL, X.7XK, X.7XG, X.7XB, X.7XN, X.7XO, X.7XP, X.7X2, X.N2I, X.OFD, X.OBk, X.OG4, X.7Gl, X.7Gl, X.OG5, X.3su, X.2FW, com.instagram.model.direct.messageid.MessageIdentifier, X.3sy, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.0sa, int, long, boolean, boolean):void");
    }
}
