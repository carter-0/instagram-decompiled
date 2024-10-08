package X;

/* renamed from: X.3di  reason: invalid class name and case insensitive filesystem */
public abstract class C245933di {
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05b6, code lost:
        r1 = X.00k.A0d(r9, 3);
        r3 = new java.util.ArrayList(X.0Yv.A1E(r1, 10));
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05cb, code lost:
        if (r1.hasNext() == false) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05cd, code lost:
        r3.add(((com.instagram.user.model.User) r1.next()).Bh3());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05db, code lost:
        r1 = X.00k.A0d(r9, 3);
        r2 = new java.util.ArrayList(X.0Yv.A1E(r1, 10));
        r10 = r1.iterator();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05f1, code lost:
        if (r10.hasNext() == false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05f3, code lost:
        r1 = r10.next();
        r7 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05f9, code lost:
        if (r9 < 0) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05fb, code lost:
        r1 = (com.instagram.user.model.User) r1;
        r34 = r4.A00.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0603, code lost:
        if (r34 != null) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0605, code lost:
        r34 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0607, code lost:
        r0 = r4.A05;
        r32 = r1;
        r2.add(java.lang.Boolean.valueOf(r6.add(X.C52301GMr.A00(r5.BxW(), r32, X.AnonymousClass05K.A01, r34, r30.getModuleName(), r5.BxP(), r3, r0, r39, false))));
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0630, code lost:
        r39 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (((X.1Av) r6.A06.A07.getValue()).A01.getInt("content_note_rec_nux_shown_count", 0) < r6.A02) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0828, code lost:
        if (r13.BxW() == r0) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f1, code lost:
        if (r2 == r10) goto L_0x01f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C246653ex A00(android.util.Size r32, X.C267324bN r33, X.AnonymousClass0iw r34, com.instagram.common.session.UserSession r35, X.C245893de r36, java.lang.Integer r37, java.util.List r38, int r39, int r40, boolean r41, boolean r42, boolean r43) {
        /*
            r8 = 0
            r1 = r35
            X.0qQ.A0B(r1, r8)
            r15 = 1
            r30 = r34
            java.lang.String r0 = r30.getModuleName()
            java.lang.String r11 = "clips_blend"
            boolean r0 = X.00p.A0i(r0, r11, r8)
            if (r0 == 0) goto L_0x004e
            X.0Tu r0 = X.0Tu.A05
            r2 = 2342172642922152168(0x2081119c000340e8, double:4.073754447805393E-152)
            boolean r0 = X.182.A06(r0, r1, r2)
            r0 = r0 ^ 1
        L_0x0022:
            r25 = 0
            r4 = r36
            r27 = r39
            r28 = r43
            if (r0 == 0) goto L_0x04c0
            if (r38 == 0) goto L_0x0050
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r38.iterator()
        L_0x0037:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.54u r2 = (X.C2809354u) r2
            boolean r2 = X.C52338GOh.A01(r2)
            if (r2 == 0) goto L_0x0037
            r0.add(r3)
            goto L_0x0037
        L_0x004e:
            r0 = 1
            goto L_0x0022
        L_0x0050:
            r0 = 0
        L_0x0051:
            java.lang.String r5 = r30.getModuleName()
            boolean r2 = X.C245953dk.A00(r1, r4)
            if (r2 == 0) goto L_0x0278
            if (r41 == 0) goto L_0x025f
            if (r0 == 0) goto L_0x0065
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x025f
        L_0x0065:
            if (r39 == 0) goto L_0x025f
            r9 = 16
            X.MMC r2 = new X.MMC
            r2.<init>(r1, r9)
            java.lang.Class<X.5CT> r7 = X.AnonymousClass5CT.class
            java.lang.Object r2 = r1.A01(r7, r2)
            X.5CT r2 = (X.AnonymousClass5CT) r2
            X.1Xj r13 = r4.A00
            java.lang.String r3 = r13.getId()
            if (r3 == 0) goto L_0x0086
            java.util.HashSet r2 = r2.A01
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x00a0
        L_0x0086:
            X.3gF r6 = X.C247323g9.A00(r1)
            X.3gC r2 = r6.A06
            X.0eM r2 = r2.A07
            java.lang.Object r2 = r2.getValue()
            X.1Av r2 = (X.1Av) r2
            X.0xa r3 = r2.A01
            java.lang.String r2 = "content_note_rec_nux_shown_count"
            int r2 = r3.getInt(r2, r8)
            int r3 = r6.A02
            if (r2 >= r3) goto L_0x025f
        L_0x00a0:
            X.MMC r2 = new X.MMC
            r2.<init>(r1, r9)
            java.lang.Object r2 = r1.A01(r7, r2)
            X.5CT r2 = (X.AnonymousClass5CT) r2
            java.lang.String r3 = r13.getId()
            if (r3 == 0) goto L_0x00b9
            java.util.HashSet r2 = r2.A01
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x011a
        L_0x00b9:
            X.3gF r2 = X.C247323g9.A00(r1)
            X.3gC r2 = r2.A06
            X.0eM r12 = r2.A07
            java.lang.Object r3 = r12.getValue()
            X.1Av r3 = (X.1Av) r3
            X.0xa r3 = r3.A01
            java.lang.String r6 = "content_note_rec_nux_shown"
            boolean r3 = r3.getBoolean(r6, r8)
            if (r3 != 0) goto L_0x00ee
            java.lang.Object r5 = r12.getValue()
            X.1Av r5 = (X.1Av) r5
            X.0eM r2 = r2.A06
            r2.getValue()
            long r2 = java.lang.System.currentTimeMillis()
            X.0xa r5 = r5.A01
            X.0xY r10 = r5.AR4()
            java.lang.String r5 = "content_note_rec_nux_last_shown_timestamp"
            r10.E5c(r5, r2)
            r10.apply()
        L_0x00ee:
            java.lang.Object r2 = r12.getValue()
            X.1Av r2 = (X.1Av) r2
            X.0xa r2 = r2.A01
            java.lang.String r5 = "content_note_rec_nux_shown_count"
            int r3 = r2.getInt(r5, r8)
            int r3 = r3 + 1
            X.0xY r2 = r2.AR4()
            r2.E5Z(r5, r3)
            r2.apply()
            java.lang.Object r2 = r12.getValue()
            X.1Av r2 = (X.1Av) r2
            X.0xa r2 = r2.A01
            X.0xY r2 = r2.AR4()
            r2.E5T(r6, r15)
            r2.apply()
        L_0x011a:
            X.MMC r2 = new X.MMC
            r2.<init>(r1, r9)
            java.lang.Object r5 = r1.A01(r7, r2)
            X.5CT r5 = (X.AnonymousClass5CT) r5
            java.lang.String r6 = r13.getId()
            if (r6 == 0) goto L_0x0138
            java.util.HashSet r3 = r5.A01
            int r2 = r3.size()
            int r5 = r5.A00
            if (r2 >= r5) goto L_0x0138
            r3.add(r6)
        L_0x0138:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
        L_0x013a:
            if (r0 == 0) goto L_0x025b
            int r3 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0144:
            if (r38 == 0) goto L_0x0257
            int r3 = r38.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x014e:
            boolean r3 = X.0qQ.A0K(r5, r3)
            java.lang.String r16 = ""
            if (r3 != 0) goto L_0x018a
            X.0wj r6 = X.0wj.A01
            r5 = 817892647(0x30c00d27, float:1.3973577E-9)
            java.lang.String r3 = "Filtered size does not match original size"
            X.0f9 r6 = r6.AEf(r3, r5)
            r5 = -1
            if (r38 == 0) goto L_0x0254
            int r7 = r38.size()
        L_0x0168:
            java.lang.String r3 = "original_size"
            r6.ABO(r3, r7)
            if (r0 == 0) goto L_0x0173
            int r5 = r0.size()
        L_0x0173:
            java.lang.String r3 = "filtered_size"
            r6.ABO(r3, r5)
            X.1Xj r3 = r4.A00
            java.lang.String r5 = r3.getId()
            if (r5 != 0) goto L_0x0182
            r5 = r16
        L_0x0182:
            java.lang.String r3 = "media_id"
            r6.ABQ(r3, r5)
            r6.report()
        L_0x018a:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r3 = 0
            if (r2 == r10) goto L_0x0190
            r3 = 1
        L_0x0190:
            boolean r3 = X.C245953dk.A01(r1, r4, r3)
            if (r3 == 0) goto L_0x04c0
            if (r0 == 0) goto L_0x019e
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x01a2
        L_0x019e:
            if (r2 == r10) goto L_0x04c0
            X.0sn r0 = X.0sn.A00
        L_0x01a2:
            if (r43 != 0) goto L_0x0250
            boolean r3 = r4.A06
            r6 = 1069547520(0x3fc00000, float:1.5)
            if (r3 == 0) goto L_0x023e
            if (r32 == 0) goto L_0x0250
            int r3 = r32.getWidth()
            float r5 = (float) r3
            int r3 = r32.getHeight()
            float r3 = (float) r3
            float r5 = r5 / r3
        L_0x01b7:
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x024c
            r11 = r10
        L_0x01bc:
            X.0qQ.A0B(r11, r8)
            int r3 = r11.intValue()
            r5 = 1
            if (r3 == r8) goto L_0x01c7
            r5 = 2
        L_0x01c7:
            r6 = r5
            int r3 = r0.size()
            if (r3 > r5) goto L_0x01d2
            int r5 = r0.size()
        L_0x01d2:
            int r3 = r0.size()
            r19 = r37
            if (r3 > r5) goto L_0x02cf
            if (r5 >= r6) goto L_0x01f3
            com.instagram.user.model.User r3 = X.AnonymousClass0eD.A00(r1)
            if (r3 == 0) goto L_0x01f0
            java.lang.String r6 = r3.getId()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0223
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0223
        L_0x01f0:
            r12 = 1
            if (r2 != r10) goto L_0x01f4
        L_0x01f3:
            r12 = 0
        L_0x01f4:
            X.01N r6 = X.0jo.A1H()
            r3 = 10
            int r3 = X.0Yv.A1E(r0, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r9 = r0.iterator()
        L_0x0207:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x027c
            java.lang.Object r3 = r9.next()
            X.54u r3 = (X.C2809354u) r3
            com.instagram.user.model.User r3 = r3.CCd()
            if (r3 == 0) goto L_0x0221
            com.instagram.common.typedurl.ImageUrl r3 = r3.Bh3()
        L_0x021d:
            r7.add(r3)
            goto L_0x0207
        L_0x0221:
            r3 = 0
            goto L_0x021d
        L_0x0223:
            java.util.Iterator r7 = r0.iterator()
        L_0x0227:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x01f0
            java.lang.Object r3 = r7.next()
            X.54u r3 = (X.C2809354u) r3
            java.lang.String r3 = r3.getUserId()
            boolean r3 = X.0qQ.A0K(r3, r6)
            if (r3 == 0) goto L_0x0227
            goto L_0x01f3
        L_0x023e:
            X.1Xj r5 = r4.A00
            boolean r3 = r5.A5G()
            if (r3 != 0) goto L_0x024c
            float r5 = r5.A0l()
            goto L_0x01b7
        L_0x024c:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x01bc
        L_0x0250:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x01bc
        L_0x0254:
            r7 = -1
            goto L_0x0168
        L_0x0257:
            r3 = r25
            goto L_0x014e
        L_0x025b:
            r5 = r25
            goto L_0x0144
        L_0x025f:
            java.lang.String r2 = "clips_viewer_clips_media_notes_stack"
            boolean r2 = X.0qQ.A0K(r5, r2)
            if (r2 == 0) goto L_0x0278
            X.0Tu r5 = X.0Tu.A05
            r2 = 36328263614545064(0x81105d000d3ca8, double:3.0374784197898944E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x0278
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            goto L_0x013a
        L_0x0278:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x013a
        L_0x027c:
            r6.addAll(r7)
            if (r12 == 0) goto L_0x028e
            com.instagram.user.model.User r3 = X.AnonymousClass0eD.A00(r1)
            if (r3 == 0) goto L_0x028e
            com.instagram.common.typedurl.ImageUrl r3 = r3.Bh3()
            r6.add(r3)
        L_0x028e:
            X.01N r26 = X.0jo.A1I(r6)
            java.util.List r3 = r0.subList(r8, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r3.iterator()
            r35 = 0
        L_0x02a1:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x042c
            java.lang.Object r3 = r6.next()
            int r5 = r35 + 1
            if (r35 < 0) goto L_0x0839
            X.54u r3 = (X.C2809354u) r3
            r37 = 32512(0x7f00, float:4.5559E-41)
            r29 = r3
            r31 = r1
            r32 = r4
            r33 = r19
            r34 = r26
            r36 = r27
            r38 = r28
            r39 = r8
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r3 = X.C52338GOh.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r3 == 0) goto L_0x02cc
            r0.add(r3)
        L_0x02cc:
            r35 = r5
            goto L_0x02a1
        L_0x02cf:
            X.1Xj r7 = r4.A00
            java.lang.String r23 = r7.getId()
            r2 = 0
            r6 = 10
            if (r11 != r10) goto L_0x035d
            if (r23 == 0) goto L_0x035d
            X.1Xy r3 = r7.A0C
            java.lang.String r24 = r3.BIl()
            X.1Xy r3 = r7.A0C
            java.lang.String r25 = r3.getLoggingInfoToken()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r14 = r0.iterator()
            r35 = 0
        L_0x02f3:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x034a
            java.lang.Object r7 = r14.next()
            int r13 = r35 + 1
            if (r35 < 0) goto L_0x0839
            X.54u r7 = (X.C2809354u) r7
            int r9 = X.0Yv.A1E(r0, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
            java.util.Iterator r12 = r0.iterator()
        L_0x0310:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x032c
            java.lang.Object r9 = r12.next()
            X.54u r9 = (X.C2809354u) r9
            com.instagram.user.model.User r9 = r9.CCd()
            if (r9 == 0) goto L_0x032a
            com.instagram.common.typedurl.ImageUrl r9 = r9.Bh3()
        L_0x0326:
            r5.add(r9)
            goto L_0x0310
        L_0x032a:
            r9 = 0
            goto L_0x0326
        L_0x032c:
            r37 = 32512(0x7f00, float:4.5559E-41)
            r29 = r7
            r31 = r1
            r32 = r4
            r33 = r19
            r34 = r5
            r36 = r27
            r38 = r28
            r39 = r8
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r5 = X.C52338GOh.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r5 == 0) goto L_0x0347
            r3.add(r5)
        L_0x0347:
            r35 = r13
            goto L_0x02f3
        L_0x034a:
            X.JwI r21 = X.C54895HXd.A00(r0)
            X.JwI r22 = X.C54895HXd.A00(r0)
            X.Gmw r1 = new X.Gmw
            r26 = r3
            r20 = r1
            r20.<init>((X.C61080JwI) r21, (X.C61080JwI) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.util.List) r26, (int) r27, (boolean) r28)
            goto L_0x0426
        L_0x035d:
            X.01N r5 = X.0jo.A1H()
            int r3 = r0.size()
            java.util.List r3 = r0.subList(r15, r3)
            r5.addAll(r3)
            java.lang.Object r3 = X.00k.A0J(r0)
            if (r3 == 0) goto L_0x0375
            r5.add(r3)
        L_0x0375:
            X.01N r5 = X.0jo.A1I(r5)
            int r6 = X.0Yv.A1E(r5, r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            java.util.Iterator r9 = r5.iterator()
        L_0x0386:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x03a2
            java.lang.Object r6 = r9.next()
            X.54u r6 = (X.C2809354u) r6
            com.instagram.user.model.User r6 = r6.CCd()
            if (r6 == 0) goto L_0x03a0
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
        L_0x039c:
            r3.add(r6)
            goto L_0x0386
        L_0x03a0:
            r6 = 0
            goto L_0x039c
        L_0x03a2:
            java.lang.Object r6 = X.00k.A0J(r0)
            X.54u r6 = (X.C2809354u) r6
            if (r6 == 0) goto L_0x03c2
            r37 = 32512(0x7f00, float:4.5559E-41)
            r29 = r6
            r31 = r1
            r32 = r4
            r33 = r19
            r34 = r3
            r35 = r8
            r36 = r27
            r38 = r28
            r39 = r8
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = X.C52338GOh.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x03c2:
            X.JwI r22 = X.C54895HXd.A00(r0)
            if (r23 != 0) goto L_0x03ca
            r23 = r16
        L_0x03ca:
            X.1Xy r0 = r7.A0C
            java.lang.String r24 = r0.BIl()
            X.1Xy r0 = r7.A0C
            java.lang.String r25 = r0.getLoggingInfoToken()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r5.iterator()
            r35 = 0
        L_0x03e1:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x040f
            java.lang.Object r6 = r9.next()
            int r7 = r35 + 1
            if (r35 < 0) goto L_0x0839
            X.54u r6 = (X.C2809354u) r6
            r37 = 26368(0x6700, float:3.695E-41)
            r29 = r6
            r31 = r1
            r32 = r4
            r33 = r19
            r34 = r3
            r36 = r27
            r38 = r28
            r39 = r15
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r6 = X.C52338GOh.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r6 == 0) goto L_0x040c
            r0.add(r6)
        L_0x040c:
            r35 = r7
            goto L_0x03e1
        L_0x040f:
            int r1 = r5.size()
            int r1 = r1 + -1
            java.util.List r1 = r5.subList(r8, r1)
            X.JwI r21 = X.C54895HXd.A00(r1)
            X.Gmw r1 = new X.Gmw
            r26 = r0
            r20 = r1
            r20.<init>((X.C61080JwI) r21, (X.C61080JwI) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.util.List) r26, (int) r27, (boolean) r28)
        L_0x0426:
            X.Gpp r3 = new X.Gpp
            r3.<init>(r1, r2)
            goto L_0x0490
        L_0x042c:
            if (r12 == 0) goto L_0x048b
            java.lang.String r22 = r30.getModuleName()
            X.01N r3 = X.0jo.A1H()
            X.1Xj r5 = r4.A00
            java.lang.String r21 = r5.getId()
            com.instagram.user.model.User r18 = X.AnonymousClass0eD.A00(r1)
            if (r21 == 0) goto L_0x0487
            if (r18 == 0) goto L_0x0487
            r3.addAll(r0)
            com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent r7 = new com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent
            r0 = r40
            r7.<init>(r0)
            X.1Xy r0 = r5.A0C
            java.lang.String r23 = r0.BIl()
            X.1Xy r0 = r5.A0C
            java.lang.String r24 = r0.getLoggingInfoToken()
            X.3jK r0 = X.C249223jK.A00
            boolean r29 = r0.A09(r1)
            boolean r30 = r0.A08(r1)
            X.0Tu r0 = X.0Tu.A05
            r5 = 36326713131284420(0x810ef4000c37c4, double:3.036497887932568E-306)
            boolean r31 = X.182.A06(r0, r1, r5)
            r5 = 36326713131153346(0x810ef4000a37c2, double:3.0364978878496764E-306)
            boolean r32 = X.182.A06(r0, r1, r5)
            boolean r33 = X.C249223jK.A05(r1)
            r17 = r7
            r20 = r2
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r0 = X.C54897HXf.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r3.add(r0)
        L_0x0487:
            X.01N r0 = X.0jo.A1I(r3)
        L_0x048b:
            X.4Jf r3 = new X.4Jf
            r3.<init>(r0)
        L_0x0490:
            X.1Xj r1 = r4.A00
            java.lang.String r34 = r1.getId()
            if (r34 != 0) goto L_0x049a
            r34 = r16
        L_0x049a:
            X.1Xy r0 = r1.A0C
            java.lang.String r35 = r0.BIl()
            X.1Xy r0 = r1.A0C
            java.lang.String r36 = r0.getLoggingInfoToken()
            java.lang.Integer r33 = X.AnonymousClass05K.A0N
            X.3ex r25 = new X.3ex
            r29 = r25
            r30 = r3
            r31 = r11
            r32 = r10
            r37 = r27
            r38 = r15
            r39 = r28
            r40 = r8
            r41 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            return r25
        L_0x04c0:
            if (r43 == 0) goto L_0x0886
            r5 = r33
            if (r33 == 0) goto L_0x0673
            X.4bO r0 = r5.A0G
            boolean r0 = r0.CcK()
            if (r0 != r15) goto L_0x0673
            X.0Tu r0 = X.0Tu.A05
            r2 = 36328053160491940(0x81102c00033ba4, double:3.037345327799268E-306)
            boolean r0 = X.182.A06(r0, r1, r2)
            if (r0 == 0) goto L_0x0895
            java.lang.String r1 = r30.getModuleName()
            java.lang.String r0 = "clips_viewer"
            boolean r0 = X.00p.A0k(r1, r0, r8)
            if (r0 == 0) goto L_0x0895
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L_0x0895
            X.3OA r0 = r5.A06()
            X.1Xj r0 = r0.A0K
            boolean r0 = r0.A5o()
            if (r0 != 0) goto L_0x0895
            X.3OA r0 = r5.A06()
            X.1Xj r0 = r0.A0K
            boolean r0 = r0.A5n()
            if (r0 != 0) goto L_0x0895
            X.3OA r0 = r5.A06()
            X.1Xj r0 = r0.A0K
            boolean r0 = r0.A5e()
            if (r0 != 0) goto L_0x0895
            X.1iA r1 = r5.A0J
            X.1iA r0 = X.1iA.A0B
            if (r1 == r0) goto L_0x0895
            com.instagram.api.schemas.AdFormatType r0 = com.instagram.api.schemas.AdFormatType.H_SCROLL
            com.instagram.api.schemas.AdFormatType r1 = r5.A0E
            if (r0 == r1) goto L_0x0895
            com.instagram.api.schemas.AdFormatType r0 = com.instagram.api.schemas.AdFormatType.GRID
            if (r0 == r1) goto L_0x0895
            java.util.List r1 = r4.A04
            if (r1 == 0) goto L_0x0895
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0895
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = X.00k.A0J(r1)
            if (r0 == 0) goto L_0x0566
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
        L_0x053d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0546:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0569
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r0 = r0.BxW()
            X.0qQ.A0B(r0, r8)
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 != r0) goto L_0x0546
            r5.add(r2)
            goto L_0x0546
        L_0x0566:
            X.0sn r0 = X.0sn.A00
            goto L_0x053d
        L_0x0569:
            java.util.Iterator r14 = r5.iterator()
            r39 = 0
        L_0x056f:
            boolean r0 = r14.hasNext()
            java.lang.String r13 = ""
            r7 = 3
            if (r0 == 0) goto L_0x0634
            java.lang.Object r5 = r14.next()
            int r12 = r39 + 1
            if (r39 < 0) goto L_0x0839
            X.3yf r5 = (X.C258223yf) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r1 = r5.BxQ()
            r2 = 10
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
            r10 = 0
        L_0x059b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x05b6
            java.lang.Object r0 = r11.next()
            int r1 = r10 + 1
            if (r10 < 0) goto L_0x0839
            boolean r0 = r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            r10 = r1
            goto L_0x059b
        L_0x05b6:
            java.util.List r1 = X.00k.A0d(r9, r7)
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x05c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05db
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r3.add(r0)
            goto L_0x05c7
        L_0x05db:
            java.util.List r1 = X.00k.A0d(r9, r7)
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
            r9 = 0
        L_0x05ed:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0630
            java.lang.Object r1 = r10.next()
            int r7 = r9 + 1
            if (r9 < 0) goto L_0x0839
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.1Xj r0 = r4.A00
            java.lang.String r34 = r0.getId()
            if (r34 != 0) goto L_0x0607
            r34 = r13
        L_0x0607:
            X.0sa r0 = r4.A05
            java.lang.String r35 = r30.getModuleName()
            com.instagram.api.schemas.SocialContextType r31 = r5.BxW()
            java.util.List r36 = r5.BxP()
            java.lang.Integer r33 = X.AnonymousClass05K.A01
            r32 = r1
            r37 = r3
            r38 = r0
            r40 = r8
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r0 = X.C52301GMr.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r0 = r6.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.add(r0)
            r9 = r7
            goto L_0x05ed
        L_0x0630:
            r39 = r12
            goto L_0x056f
        L_0x0634:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0895
            java.util.List r0 = X.00k.A0d(r6, r7)
            X.4Jf r2 = new X.4Jf
            r2.<init>(r0)
            X.1Xj r1 = r4.A00
            java.lang.String r33 = r1.getId()
            if (r33 != 0) goto L_0x064d
            r33 = r13
        L_0x064d:
            X.1Xy r0 = r1.A0C
            java.lang.String r34 = r0.BIl()
            X.1Xy r0 = r1.A0C
            java.lang.String r35 = r0.getLoggingInfoToken()
            java.lang.Integer r30 = X.AnonymousClass05K.A0C
            java.lang.Integer r31 = X.AnonymousClass05K.A01
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            X.3ex r25 = new X.3ex
            r28 = r25
            r29 = r2
            r36 = r27
            r37 = r15
            r38 = r15
            r39 = r8
            r40 = r15
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r25
        L_0x0673:
            java.lang.String r0 = r30.getModuleName()
            boolean r0 = X.00p.A0i(r0, r11, r8)
            if (r0 == 0) goto L_0x068c
            X.0Tu r0 = X.0Tu.A05
            r2 = 2342172642922021094(0x2081119c000140e6, double:4.0737544476942535E-152)
            boolean r0 = X.182.A06(r0, r1, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0895
        L_0x068c:
            if (r42 != 0) goto L_0x0895
            boolean r0 = X.C52114GFi.A02(r1)
            if (r0 == 0) goto L_0x0895
            java.util.List r2 = r4.A04
            if (r2 == 0) goto L_0x0895
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0895
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Object r0 = X.00k.A0J(r2)
            if (r0 == 0) goto L_0x0835
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
        L_0x06b0:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
            r39 = 0
        L_0x06b8:
            boolean r0 = r17.hasNext()
            java.lang.String r16 = ""
            if (r0 == 0) goto L_0x0841
            java.lang.Object r13 = r17.next()
            X.3yf r13 = (X.C258223yf) r13
            com.instagram.api.schemas.SocialContextType r0 = r13.BxW()
            boolean r0 = X.C52114GFi.A01(r0, r1)
            if (r0 == 0) goto L_0x06b8
            com.instagram.api.schemas.SocialContextType r2 = r13.BxW()
            X.0qQ.A0B(r2, r8)
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            r11 = 3
            if (r2 != r0) goto L_0x06dd
            r11 = 1
        L_0x06dd:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r3 = r13.BxQ()
            r9 = 10
            int r2 = X.0Yv.A1E(r3, r9)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r2)
            java.util.Iterator r20 = r3.iterator()
            r7 = 0
        L_0x06f6:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x073a
            java.lang.Object r6 = r20.next()
            int r19 = r7 + 1
            if (r7 < 0) goto L_0x0839
            X.0Tu r5 = X.0Tu.A05
            r2 = 2342165843989178859(0x20810b6d000729eb, double:4.0679895293813266E-152)
            boolean r2 = X.182.A06(r5, r1, r2)
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x072f
            java.util.List r2 = r13.BxP()
            if (r2 == 0) goto L_0x0732
            java.lang.Object r2 = X.00k.A0O(r2, r7)
            X.3yd r2 = (X.C258203yd) r2
            if (r2 == 0) goto L_0x0732
            java.lang.Boolean r3 = r2.CUi()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0732
        L_0x072f:
            r10.add(r6)
        L_0x0732:
            X.0gF r2 = X.C60340gF.A00
            r12.add(r2)
            r7 = r19
            goto L_0x06f6
        L_0x073a:
            java.util.List r3 = X.00k.A0d(r10, r11)
            int r2 = X.0Yv.A1E(r3, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x074b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x075f
            java.lang.Object r2 = r3.next()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            com.instagram.common.typedurl.ImageUrl r2 = r2.Bh3()
            r7.add(r2)
            goto L_0x074b
        L_0x075f:
            java.util.List r2 = X.00k.A0d(r10, r11)
            int r3 = X.0Yv.A1E(r2, r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            java.util.Iterator r12 = r2.iterator()
            r9 = 0
        L_0x0771:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x06b8
            java.lang.Object r5 = r12.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0839
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            com.instagram.api.schemas.SocialContextType r3 = r13.BxW()
            java.util.List r2 = r13.BxP()
            if (r2 == 0) goto L_0x0832
            java.lang.Object r10 = X.00k.A0O(r2, r9)
            X.3yd r10 = (X.C258203yd) r10
        L_0x0791:
            X.0qQ.A0B(r5, r8)
            r2 = 2
            X.0qQ.A0B(r3, r2)
            boolean r2 = X.C52114GFi.A01(r3, r1)
            if (r2 == 0) goto L_0x07ae
            if (r3 != r0) goto L_0x07b5
            if (r10 == 0) goto L_0x07ae
            java.lang.String r2 = r10.AYN()
            if (r2 == 0) goto L_0x07ae
            boolean r2 = X.00l.A0W(r2)
            if (r2 == 0) goto L_0x07b5
        L_0x07ae:
            X.0gF r2 = X.C60340gF.A00
            r6.add(r2)
            r9 = r11
            goto L_0x0771
        L_0x07b5:
            X.0Tu r9 = X.0Tu.A05
            r2 = 2342165843989178859(0x20810b6d000729eb, double:4.0679895293813266E-152)
            boolean r2 = X.182.A06(r9, r1, r2)
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x07e9
            if (r10 == 0) goto L_0x07d5
            java.lang.Boolean r3 = r10.CUi()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x07d5
            goto L_0x07ae
        L_0x07d5:
            boolean r2 = r5.A29()
            if (r2 != 0) goto L_0x07e9
            X.4Cl r2 = r5.A03
            com.instagram.user.model.FriendshipStatus r2 = r2.B8F()
            if (r2 == 0) goto L_0x07e9
            java.lang.Boolean r2 = r2.B6y()
            if (r2 != 0) goto L_0x07ae
        L_0x07e9:
            X.1Xj r2 = r4.A00
            java.lang.String r34 = r2.getId()
            if (r34 != 0) goto L_0x07f3
            r34 = r16
        L_0x07f3:
            X.0sa r3 = r4.A05
            java.lang.String r35 = r30.getModuleName()
            com.instagram.api.schemas.SocialContextType r31 = r13.BxW()
            java.util.List r36 = r13.BxP()
            boolean r40 = X.C52114GFi.A03(r1)
            com.instagram.api.schemas.SocialContextType r2 = r13.BxW()
            if (r2 != r0) goto L_0x082f
            boolean r2 = X.C52114GFi.A03(r1)
            if (r2 == 0) goto L_0x082f
            java.lang.Integer r33 = X.AnonymousClass05K.A00
        L_0x0813:
            r32 = r5
            r37 = r7
            r38 = r3
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r2 = X.C52301GMr.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r14.add(r2)
            if (r18 != 0) goto L_0x082a
            com.instagram.api.schemas.SocialContextType r2 = r13.BxW()
            r18 = 0
            if (r2 != r0) goto L_0x082c
        L_0x082a:
            r18 = 1
        L_0x082c:
            int r39 = r39 + 1
            goto L_0x07ae
        L_0x082f:
            java.lang.Integer r33 = X.AnonymousClass05K.A01
            goto L_0x0813
        L_0x0832:
            r10 = 0
            goto L_0x0791
        L_0x0835:
            X.0sn r0 = X.0sn.A00
            goto L_0x06b0
        L_0x0839:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0841:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0895
            r0 = 3
            java.util.List r0 = X.00k.A0d(r14, r0)
            X.4Jf r2 = new X.4Jf
            r2.<init>(r0)
            X.1Xj r1 = r4.A00
            java.lang.String r33 = r1.getId()
            if (r33 != 0) goto L_0x085b
            r33 = r16
        L_0x085b:
            X.1Xy r0 = r1.A0C
            java.lang.String r34 = r0.BIl()
            X.1Xy r0 = r1.A0C
            java.lang.String r35 = r0.getLoggingInfoToken()
            java.lang.Integer r30 = X.AnonymousClass05K.A0C
            java.lang.Integer r31 = X.AnonymousClass05K.A01
            if (r18 == 0) goto L_0x0883
            r32 = r31
        L_0x086f:
            X.3ex r25 = new X.3ex
            r28 = r25
            r29 = r2
            r36 = r27
            r37 = r15
            r38 = r15
            r39 = r8
            r40 = r8
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r25
        L_0x0883:
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            goto L_0x086f
        L_0x0886:
            X.3dm r9 = X.C245973dm.A00
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            r10 = r30
            r11 = r1
            r12 = r4
            r14 = r27
            r15 = r8
            X.3ex r25 = r9.A00(r10, r11, r12, r13, r14, r15)
        L_0x0895:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245933di.A00(android.util.Size, X.4bN, X.0iw, com.instagram.common.session.UserSession, X.3de, java.lang.Integer, java.util.List, int, int, boolean, boolean, boolean):X.3ex");
    }
}
