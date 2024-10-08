package X;

public final class MP9 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, MP9 mp9) {
        0qQ.A0B(obj, 0);
        return mp9.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MP9(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.BBO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.BBO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: X.BBO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.BBO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: X.KOg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: X.KOS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: X.KOS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: X.KOK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: X.KOG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: X.KOX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: X.KOL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: X.KOL} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x037f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x043f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x057c, code lost:
        r2.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x06c1, code lost:
        r1 = (X.C46836DmC) r0.getValue();
        X.JTQ.A1K(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x06d0, code lost:
        if (r14.equals(r1.A00) != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x06d2, code lost:
        r1.A00 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x06f0, code lost:
        r1.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0726, code lost:
        if (r0 != false) goto L_0x0728;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x07a0, code lost:
        if (r3 != null) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x08a7, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x08f6, code lost:
        return new X.C61072JwA(r6, (java.util.List) r4, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020d, code lost:
        r0 = "pendingMedia";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r53) {
        /*
            r52 = this;
            r3 = r52
            r14 = r53
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0077;
                case 2: goto L_0x0103;
                case 3: goto L_0x011b;
                case 4: goto L_0x0135;
                case 5: goto L_0x0159;
                case 6: goto L_0x0189;
                case 7: goto L_0x01e7;
                case 8: goto L_0x01fb;
                case 9: goto L_0x086b;
                case 10: goto L_0x0211;
                case 11: goto L_0x0880;
                case 12: goto L_0x0243;
                case 13: goto L_0x0243;
                case 14: goto L_0x0252;
                case 15: goto L_0x0288;
                case 16: goto L_0x029d;
                case 17: goto L_0x02d4;
                case 18: goto L_0x02e5;
                case 19: goto L_0x02fb;
                case 20: goto L_0x0316;
                case 21: goto L_0x088d;
                case 22: goto L_0x032d;
                case 23: goto L_0x032d;
                case 24: goto L_0x0334;
                case 25: goto L_0x0409;
                case 26: goto L_0x0451;
                case 27: goto L_0x04b6;
                case 28: goto L_0x04c7;
                case 29: goto L_0x04f8;
                case 30: goto L_0x0581;
                case 31: goto L_0x05a7;
                case 32: goto L_0x0619;
                case 33: goto L_0x08a8;
                case 34: goto L_0x08d7;
                case 35: goto L_0x08d7;
                case 36: goto L_0x0626;
                case 37: goto L_0x0619;
                case 38: goto L_0x064b;
                case 39: goto L_0x066a;
                case 40: goto L_0x0009;
                case 41: goto L_0x0009;
                case 42: goto L_0x067b;
                case 43: goto L_0x08f7;
                case 44: goto L_0x0695;
                case 45: goto L_0x06b0;
                case 46: goto L_0x06b9;
                case 47: goto L_0x06d5;
                case 48: goto L_0x06f5;
                case 49: goto L_0x0864;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = A00(r14, r3)
            X.C51965G9l.A1W(r0, r14)
        L_0x0010:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0013:
            boolean r43 = X.AnonymousClass7TE.A1a(r14)
            java.lang.Object r0 = r3.A01
            X.KNp r0 = (X.C61826KNp) r0
            X.KNs r0 = r0.A0D
            X.JwD r14 = r0.A01
            if (r14 == 0) goto L_0x0010
            X.KOL r1 = r0.A0Z
            r2 = 0
            r36 = 0
            r34 = -1
            r35 = 261887(0x3feff, float:3.66982E-40)
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r37 = r36
            r38 = r36
            r39 = r36
            r40 = r36
            r41 = r36
            r42 = r36
            r44 = r36
            r45 = r36
            r46 = r36
            r47 = r36
            r48 = r36
            X.JwD r0 = X.C61075JwD.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L_0x0311
        L_0x0077:
            boolean r4 = X.AnonymousClass7TE.A1a(r14)
            java.lang.Object r0 = r3.A01
            X.KNp r0 = (X.C61826KNp) r0
            X.KNs r3 = r0.A0D
            X.AnonymousClass2BF.A00()
            com.instagram.common.session.UserSession r2 = r3.A07
            r39 = 0
            r5 = 0
            X.JXr r0 = new X.JXr
            r0.<init>(r2)
            X.JXt r1 = new X.JXt
            r1.<init>(r2)
            X.KzV r0 = new X.KzV
            r0.<init>(r2)
            X.0xa r0 = r1.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "media_level_settings_on"
            r1.E5T(r0, r4)
            r1.apply()
            X.JwD r0 = r3.A01
            if (r0 == 0) goto L_0x0010
            X.KOL r1 = r3.A0Z
            r37 = -1
            r38 = 261631(0x3fdff, float:3.66623E-40)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r0
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r5
            r36 = r5
            r40 = r39
            r41 = r39
            r42 = r39
            r43 = r39
            r44 = r39
            r45 = r39
            r46 = r39
            r47 = r4
            r48 = r39
            r49 = r39
            r50 = r39
            r51 = r39
            X.JwD r0 = X.C61075JwD.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            goto L_0x0311
        L_0x0103:
            com.instagram.model.venue.Venue r14 = (com.instagram.model.venue.Venue) r14
            java.lang.Object r0 = r3.A01
            X.KEh r0 = (X.C61606KEh) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.3St r0 = new X.3St
            r0.<init>(r14, r1)
            r2.A00(r0)
            goto L_0x0010
        L_0x011b:
            X.3QO r14 = (X.AnonymousClass3QO) r14
            java.lang.Object r0 = A00(r14, r3)
            X.KNr r0 = (X.C61828KNr) r0
            X.KOX r1 = r0.A05
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x012b
            X.3QO r14 = X.AnonymousClass3QO.FAN_CLUB
        L_0x012b:
            X.JwD r0 = r1.A06()
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r0, r14, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -513, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0311
        L_0x0135:
            X.JwK r14 = (X.C61082JwK) r14
            java.lang.Object r1 = A00(r14, r3)
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r1 = (com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController) r1
            java.lang.Object r0 = r14.A00
            X.Kno r0 = (X.C62874Kno) r0
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController.A00(r1, r0)
            boolean r2 = r14.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x0010
            X.Jcv r1 = r1.A00
            java.lang.String r0 = "thumb"
            if (r1 == 0) goto L_0x037f
            r1.A09 = r2
            r1.invalidateSelf()
            goto L_0x0010
        L_0x0159:
            X.Juv r14 = (X.C60999Juv) r14
            android.graphics.Bitmap[] r7 = r14.A01()
            java.lang.Object r6 = r3.A01
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r6 = (com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController) r6
            int r5 = r7.length
            r4 = 0
            r1 = 0
        L_0x0166:
            if (r4 >= r5) goto L_0x0010
            r3 = r7[r4]
            int r2 = r1 + 1
            if (r3 == 0) goto L_0x0181
            android.widget.LinearLayout r0 = r6.filmStripFramesContainer
            if (r0 == 0) goto L_0x0185
            android.view.View r1 = r0.getChildAt(r1)
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0181
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0181
            r1.setImageBitmap(r3)
        L_0x0181:
            int r4 = r4 + 1
            r1 = r2
            goto L_0x0166
        L_0x0185:
            java.lang.String r0 = "filmStripFramesContainer"
            goto L_0x037f
        L_0x0189:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r3 = r3.A01
            X.KNd r3 = (X.C61814KNd) r3
            X.3Q2 r0 = r3.A03
            java.lang.String r4 = "pendingMedia"
            r6 = 0
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = r0.A33
            boolean r0 = r14.equals(r0)
            r2 = 0
            if (r0 != 0) goto L_0x01c8
            X.0eM r0 = r3.A0C
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.3Q2 r0 = r3.A03
            if (r0 == 0) goto L_0x01b1
            java.lang.String r13 = r0.A3t
            X.Ji7 r0 = r3.A04
            if (r0 != 0) goto L_0x01b6
            java.lang.String r4 = "videoScrubbingViewModel"
        L_0x01b1:
            X.0qQ.A0F(r4)
            goto L_0x043b
        L_0x01b6:
            X.2Fk r0 = r0.A06
            java.lang.Object r12 = r0.A02()
            java.lang.Integer r12 = (java.lang.Integer) r12
            X.29R r5 = r1.A09
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r5.A0S(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x01c8:
            X.3Q2 r0 = r3.A03
            if (r0 == 0) goto L_0x01b1
            r0.A33 = r14
            r3.A02(r14)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0010
            r3.A08 = r2
            X.0eM r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            X.Jhl r0 = (X.C60228Jhl) r0
            r0.A00(r6)
            X.C61814KNd.A00(r3)
            goto L_0x0010
        L_0x01e7:
            java.lang.Number r14 = (java.lang.Number) r14
            java.lang.Object r0 = r3.A01
            X.KNd r0 = (X.C61814KNd) r0
            X.3Q2 r0 = r0.A03
            if (r0 == 0) goto L_0x020d
            com.instagram.pendingmedia.model.ClipInfo r1 = r0.A1N
            int r0 = r14.intValue()
            r1.A03 = r0
            goto L_0x0010
        L_0x01fb:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r0 = r3.A01
            X.KNd r0 = (X.C61814KNd) r0
            X.3Q2 r1 = r0.A03
            if (r1 == 0) goto L_0x020d
            boolean r0 = r14.booleanValue()
            r1.A5M = r0
            goto L_0x0010
        L_0x020d:
            java.lang.String r0 = "pendingMedia"
            goto L_0x037f
        L_0x0211:
            boolean r6 = X.AnonymousClass7TE.A1a(r14)
            java.lang.Object r0 = r3.A01
            X.LpA r0 = (X.C65204LpA) r0
            X.KOG r1 = r0.A06
            X.JiA r2 = r0.A03
            X.2Fj r0 = r2.A01
            java.lang.Object r0 = r0.A02()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = X.AnonymousClass7TG.A1X(r0)
            X.2Fj r0 = r2.A02
            java.util.List r2 = X.JTS.A0q(r0)
            r0 = 2
            X.JwD r4 = r1.A06()
            X.Jw4 r3 = new X.Jw4
            r3.<init>((boolean) r6, (boolean) r5, (java.util.List) r2, (int) r0)
            r2 = 0
            r0 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, r3, (X.C59721JVf) null, (X.C61046Jvk) null, r2, (X.C61079JwH) null, r2, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r4, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, r0, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0311
        L_0x0243:
            boolean r1 = X.AnonymousClass7TE.A1a(r14)
            java.lang.Object r0 = r3.A01
            X.LpR r0 = (X.C65221LpR) r0
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = r0.A05
            r0.A0B(r1)
            goto L_0x0010
        L_0x0252:
            X.K1L r14 = (X.K1L) r14
            java.lang.Object r1 = A00(r14, r3)
            X.KNs r1 = (X.C61829KNs) r1
            r1.A00 = r14
            X.KOi r0 = r1.A0V
            r0.A00 = r14
            X.KOZ r0 = r1.A0O
            r0.A00 = r14
            X.05G r3 = r0.A04
            java.lang.Object r1 = r3.getValue()
            X.KO4 r1 = (X.KO4) r1
            r2 = 0
            X.L7h r0 = r14.A00
            if (r0 == 0) goto L_0x027c
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x027c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x027c
            r2 = 1
        L_0x027c:
            java.lang.String r1 = r1.A00
            X.KO4 r0 = new X.KO4
            r0.<init>(r2, r1)
            r3.Epw(r0)
            goto L_0x0010
        L_0x0288:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r3.A01
            X.KNs r0 = (X.C61829KNs) r0
            X.KOK r1 = r0.A0X
            X.JwD r3 = r1.A06()
            r2 = 0
            r0 = -65537(0xfffffffffffeffff, float:NaN)
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r3, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, r2, r2, (java.lang.String) null, (java.lang.String) null, r14, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, r0, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0311
        L_0x029d:
            X.3QO r14 = (X.AnonymousClass3QO) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r0 = r3.A01
            X.KNs r0 = (X.C61829KNs) r0
            X.KOl r2 = r0.A0E
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x02b1
            r2.A02 = r1
            r2.A03 = r1
        L_0x02b1:
            r0 = 1
            r2.A01 = r0
            X.JwD r1 = r2.A06()
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x02be
            X.3QO r14 = X.AnonymousClass3QO.FAN_CLUB
        L_0x02be:
            X.3Q2 r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            r0.A1F = r14
            X.C61846KOl.A01(r2, r14, r0)
            X.3QO r0 = r1.A0C
            if (r0 == r14) goto L_0x0010
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r1, r14, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -513, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r2.A09(r0)
            goto L_0x0010
        L_0x02d4:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r3.A01
            X.KNs r0 = (X.C61829KNs) r0
            X.KOS r1 = r0.A0U
            X.JwD r0 = r1.A06()
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r0, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r14, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -9, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0311
        L_0x02e5:
            java.util.List r4 = X.JTQ.A0i(r14)
            java.lang.Object r0 = r3.A01
            X.KNs r0 = (X.C61829KNs) r0
            X.KOS r1 = r0.A0U
            X.JwD r3 = r1.A06()
            r2 = 0
            r0 = -17
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r3, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r2, r4, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, r0, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            goto L_0x0311
        L_0x02fb:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r3.A01
            X.KNs r0 = (X.C61829KNs) r0
            X.KOg r1 = r0.A0T
            X.JwD r11 = r1.A06()
            r12 = 0
            r16 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r13 = r12
            r15 = r12
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r11, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r12, r13, r14, (java.lang.String) null, (java.util.List) null, (java.util.List) null, r15, (java.util.List) null, (java.util.List) null, (X.0eP) null, r16, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
        L_0x0311:
            r1.A09(r0)
            goto L_0x0010
        L_0x0316:
            X.7zG r14 = (X.C348917zG) r14
            if (r14 == 0) goto L_0x0010
            java.lang.Object r0 = r3.A01
            X.KO2 r0 = (X.KO2) r0
            X.05G r2 = r0.A04
            X.5kq r0 = r14.A01
            X.JwD r1 = X.C64003LIj.A00(r0)
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r1)
            goto L_0x057c
        L_0x032d:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            goto L_0x0010
        L_0x0334:
            X.KhE r14 = (X.C62522KhE) r14
            if (r14 == 0) goto L_0x0010
            int r1 = r14.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x03c8
            r0 = 5
            if (r1 == r0) goto L_0x03a7
            r0 = 6
            if (r1 != r0) goto L_0x0010
            java.lang.Object r6 = r3.A01
            X.K6A r6 = (X.K6A) r6
            X.K6A.A03(r6)
            X.0r1 r1 = new X.0r1
            r1.<init>()
            X.KPh r7 = X.K6A.A00(r6)
            X.LOy r5 = r6.A0B
            r0 = 0
            if (r5 == 0) goto L_0x0373
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            r0 = 28
            X.MMY r3 = X.MMY.A00(r6, r1, r0)
            X.MKh r2 = X.C66246MKh.A00
            r0 = 29
            X.MMY r1 = X.MMY.A00(r6, r1, r0)
            X.Lmf r0 = r5.A02
            if (r0 == 0) goto L_0x0384
            r0 = 0
        L_0x036f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0373:
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0010
            X.LFb r0 = r6.A0F
            if (r0 != 0) goto L_0x039d
            java.lang.String r0 = "videoPreviewController"
        L_0x037f:
            X.0qQ.A0F(r0)
            goto L_0x043b
        L_0x0384:
            X.LoJ r0 = new X.LoJ
            r0.<init>(r5, r1, r3, r2)
            X.Lmf r1 = new X.Lmf
            r1.<init>(r7, r0)
            r5.A02 = r1
            X.Jhn r0 = r5.A07
            r0.A00 = r4
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r5.A06
            r0.A03 = r1
            r0.A02()
            r0 = 1
            goto L_0x036f
        L_0x039d:
            X.9Pn r0 = r0.A03
            r0.A04()
            r0.A01()
            goto L_0x0010
        L_0x03a7:
            java.lang.Object r7 = r3.A01
            X.K6A r7 = (X.K6A) r7
            X.K6A.A03(r7)
            X.0r1 r1 = new X.0r1
            r1.<init>()
            X.KPj r6 = X.K6A.A02(r7)
            X.LOy r5 = r7.A0B
            if (r5 == 0) goto L_0x0913
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r0 = 44
            X.MMf r3 = X.C66296MMf.A00(r1, r0)
            X.MKj r2 = X.C66248MKj.A00
            r0 = 32
            goto L_0x03e8
        L_0x03c8:
            java.lang.Object r7 = r3.A01
            X.K6A r7 = (X.K6A) r7
            X.K6A.A03(r7)
            X.0r1 r1 = new X.0r1
            r1.<init>()
            X.KPi r6 = X.K6A.A01(r7)
            X.LOy r5 = r7.A0B
            if (r5 == 0) goto L_0x0918
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            r0 = 30
            X.MMY r3 = X.MMY.A00(r7, r1, r0)
            X.MKi r2 = X.C66247MKi.A00
            r0 = 31
        L_0x03e8:
            X.MMY r1 = X.MMY.A00(r7, r1, r0)
            X.Lmf r0 = r5.A02
            if (r0 != 0) goto L_0x0010
            X.LoJ r0 = new X.LoJ
            r0.<init>(r5, r1, r3, r2)
            X.Lmf r1 = new X.Lmf
            r1.<init>(r6, r0)
            r5.A02 = r1
            X.Jhn r0 = r5.A07
            r0.A00 = r4
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r5.A06
            r0.A03 = r1
            r0.A02()
            goto L_0x0010
        L_0x0409:
            X.6Gb r14 = (X.C305006Gb) r14
            java.lang.Object r2 = A00(r14, r3)
            X.QP7 r2 = (X.QP7) r2
            r0 = 3
            X.JJR r1 = new X.JJR
            r1.<init>(r2, r0)
            r0 = -1383649447(0xffffffffad872f59, float:-1.536875E-11)
            r7 = 1
            X.5PJ r0 = X.AnonymousClass5PI.A04(r1, r0, r7)
            r6 = 0
            r14.Cf4(r6, r0)
            java.lang.Object r0 = r2.A01
            java.util.Iterator r5 = X.C51966G9m.A1H(r0)
            r4 = 0
        L_0x042a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r3 = r5.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x0440
            X.0sr.A1T()
        L_0x043b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0440:
            r1 = -134615986(0xfffffffff7f9ec4e, float:-1.0138084E34)
            X.JGe r0 = new X.JGe
            r0.<init>(r4, r7, r3)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r1, r7)
            r14.Cf4(r6, r0)
            r4 = r2
            goto L_0x042a
        L_0x0451:
            X.6Gb r14 = (X.C305006Gb) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.0sK r0 = X.C55390Hgw.A00
            r6 = 0
            r14.Cf4(r6, r0)
            java.lang.Object r5 = r3.A01
            X.H0Z r5 = (X.H0Z) r5
            X.0eM r0 = r5.A02
            java.util.List r0 = X.JTO.A15(r0)
            if (r0 == 0) goto L_0x0489
            java.util.Iterator r4 = r0.iterator()
        L_0x046d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0489
            java.lang.Object r3 = r4.next()
            r2 = -1622135876(0xffffffff9f502bbc, float:-4.408189E-20)
            r1 = 35
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r3, r5)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)
            r14.Cf4(r6, r0)
            goto L_0x046d
        L_0x0489:
            X.0sK r0 = X.C55390Hgw.A01
            r14.Cf4(r6, r0)
            X.0eM r0 = r5.A00
            java.util.List r0 = X.JTO.A15(r0)
            if (r0 == 0) goto L_0x0010
            java.util.Iterator r4 = r0.iterator()
        L_0x049a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r3 = r4.next()
            r2 = 1368981989(0x519901e5, float:8.2145223E10)
            r1 = 36
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r3, r5)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)
            r14.Cf4(r6, r0)
            goto L_0x049a
        L_0x04b6:
            X.5RU r14 = (X.AnonymousClass5RU) r14
            java.lang.Object r0 = A00(r14, r3)
            X.GQw r0 = (X.C52397GQw) r0
            float r0 = X.C52397GQw.A00(r0)
            r14.EpH(r0)
            goto L_0x0010
        L_0x04c7:
            X.6Gb r14 = (X.C305006Gb) r14
            java.lang.Object r5 = A00(r14, r3)
            X.H0Y r5 = (X.H0Y) r5
            X.0eM r0 = r5.A00
            java.util.List r0 = X.JTO.A15(r0)
            if (r0 == 0) goto L_0x0010
            java.util.Iterator r4 = r0.iterator()
        L_0x04db:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r3 = r4.next()
            r2 = -479576464(0xffffffffe36a3e70, float:-4.3210372E21)
            r1 = 40
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r3, r5)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r2)
            r0 = 0
            r14.Cf4(r0, r1)
            goto L_0x04db
        L_0x04f8:
            X.HNK r14 = (X.HNK) r14
            java.lang.Object r2 = A00(r14, r3)
            X.H22 r2 = (X.H22) r2
            X.0eM r0 = r2.A01
            java.lang.Object r6 = r0.getValue()
            X.GPq r6 = (X.C52369GPq) r6
            int r1 = r14.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x056b
            r0 = 2
            if (r1 == r0) goto L_0x0568
            r0 = 5
            if (r1 == r0) goto L_0x0565
            r4 = 0
        L_0x0516:
            X.HOt r5 = X.C54688HOt.A0M
            r3 = 0
            java.lang.String r9 = r6.A00
            r7 = r3
            r8 = r3
            X.C52369GPq.A00(r3, r4, r5, r6, r7, r8, r9)
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.H2c r0 = (X.C54182H2c) r0
            com.instagram.creator.agent.settings.audience.AudienceUseCase r2 = r0.A00
            r0 = 2
            if (r1 == r0) goto L_0x0554
            r0 = 3
            if (r1 == r0) goto L_0x0543
            r0 = 5
            if (r1 != r0) goto L_0x0010
            X.05G r1 = r2.A09
            X.HNK r0 = X.HNK.SELECTED_USERS_ONLY
            r1.Epw(r0)
            X.05G r1 = r2.A04
            X.IQf r0 = X.C57142IQf.A00
        L_0x053e:
            r1.Epw(r0)
            goto L_0x0010
        L_0x0543:
            X.05G r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.JZA r0 = (X.JZA) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0573
            X.05G r1 = r2.A09
            X.HNK r0 = X.HNK.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW
            goto L_0x053e
        L_0x0554:
            X.05G r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.JZA r0 = (X.JZA) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x056e
            X.05G r1 = r2.A09
            X.HNK r0 = X.HNK.ANYBODY_CREATOR_DOES_NOT_FOLLOW
            goto L_0x053e
        L_0x0565:
            X.HOP r4 = X.HOP.SELECTED_USERS_ONLY
            goto L_0x0516
        L_0x0568:
            X.HOP r4 = X.HOP.ANYONE_YOU_DONT_FOLLOW
            goto L_0x0516
        L_0x056b:
            X.HOP r4 = X.HOP.FOLLOWERS_YOU_DONT_FOLLOW_BACK
            goto L_0x0516
        L_0x056e:
            X.05G r2 = r2.A04
            X.HNK r1 = X.HNK.ANYBODY_CREATOR_DOES_NOT_FOLLOW
            goto L_0x0577
        L_0x0573:
            X.05G r2 = r2.A04
            X.HNK r1 = X.HNK.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW
        L_0x0577:
            X.Gq4 r0 = new X.Gq4
            r0.<init>(r1)
        L_0x057c:
            r2.Epw(r0)
            goto L_0x0010
        L_0x0581:
            java.lang.String r1 = X.C41847B3o.A1E(r14)
            java.lang.Object r0 = r3.A01
            X.H0X r0 = (X.H0X) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.GhJ r2 = (X.C53028GhJ) r2
            java.lang.String r1 = X.DbV.A12(r1)
            java.lang.String r0 = r2.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r2.A04 = r0
            X.C53028GhJ.A00(r2)
            r2.A01 = r1
            goto L_0x0010
        L_0x05a7:
            X.Jvb r14 = (X.C61037Jvb) r14
            java.lang.Object r4 = A00(r14, r3)
            X.H0V r4 = (X.H0V) r4
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A03
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            X.H0X r2 = new X.H0X
            r2.<init>()
            java.lang.String r1 = r14.A01
            r0 = 2947(0xb83, float:4.13E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r14.A02
            r0 = 2948(0xb84, float:4.131E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r14.A00
            r0 = 2949(0xb85, float:4.132E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r7 = X.AnonymousClass7TE.A1L(r0, r1)
            X.HLC r1 = X.HLC.POP_FRAGMENT
            r0 = 20
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0eP r8 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eM r0 = r4.A02
            java.lang.Object r1 = r0.getValue()
            r0 = 742(0x2e6, float:1.04E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0eP r9 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = "settings"
            r0 = 42
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0eP r10 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r5, r6, r7, r8, r9, r10}
            X.DbT.A1N(r2, r0)
            r3.A0D(r2)
            r3.A05()
            goto L_0x0010
        L_0x0619:
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r0 = A00(r14, r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0kR.A04(r14, r0)
            goto L_0x0010
        L_0x0626:
            X.HNK r14 = (X.HNK) r14
            java.lang.Object r5 = r3.A01
            X.H0G r5 = (X.H0G) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0eM r0 = r5.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            X.GhL r0 = (X.C53030GhL) r0
            java.lang.String r2 = r0.A02
            r1 = 6
            X.Imz r0 = new X.Imz
            r0.<init>(r5, r1)
            X.HZI.A00(r4, r3, r14, r2, r0)
            goto L_0x0010
        L_0x064b:
            java.lang.String r5 = X.C41847B3o.A1E(r14)
            java.lang.Object r0 = r3.A01
            X.H0O r0 = (X.H0O) r0
            X.0eM r0 = r0.A02
            X.2YL r4 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 29
            X.MGl r0 = new X.MGl
            r0.<init>((java.lang.Object) r4, (java.lang.String) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x0010
        L_0x066a:
            java.lang.String r0 = X.C41847B3o.A1E(r14)
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r0)
            r1.invoke(r0)
            goto L_0x0010
        L_0x067b:
            X.4ch r14 = (X.C268064ch) r14
            java.lang.Object r3 = A00(r14, r3)
            X.5Oz r3 = (X.C284945Oz) r3
            long r1 = r14.Bwh()
            r0 = 32
            long r1 = r1 >> r0
            int r0 = (int) r1
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.Epw(r0)
            goto L_0x0010
        L_0x0695:
            boolean r0 = X.AnonymousClass7TE.A1a(r14)
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            if (r0 == 0) goto L_0x06a6
            java.lang.String r0 = "Original label removed"
            X.C59689JTv.A09(r2, r0)
            goto L_0x0010
        L_0x06a6:
            java.lang.String r1 = "originality_remove_label_fail"
            r0 = 2131963032(0x7f132c98, float:1.9562806E38)
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x0010
        L_0x06b0:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r3.A01
            X.E2G r0 = (X.E2G) r0
            X.0eM r0 = r0.A00
            goto L_0x06c1
        L_0x06b9:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r3.A01
            X.E2m r0 = (X.C47440E2m) r0
            X.0eM r0 = r0.A01
        L_0x06c1:
            java.lang.Object r1 = r0.getValue()
            X.DmC r1 = (X.C46836DmC) r1
            X.JTQ.A1K(r14)
            java.util.List r0 = r1.A00
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0010
            r1.A00 = r14
            goto L_0x06f0
        L_0x06d5:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r3.A01
            X.E2L r0 = (X.E2L) r0
            X.0eM r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.DmD r1 = (X.C46837DmD) r1
            X.JTQ.A1K(r14)
            java.util.List r0 = r1.A00
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0010
            r1.A00 = r14
        L_0x06f0:
            r1.notifyDataSetChanged()
            goto L_0x0010
        L_0x06f5:
            X.JyF r14 = (X.C61163JyF) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r1 = r3.A01
            X.E2s r1 = (X.C47446E2s) r1
            java.lang.String r5 = r14.A01
            X.0eM r0 = r1.A01
            java.lang.Object r4 = r0.getValue()
            X.7I3 r4 = (X.AnonymousClass7I3) r4
            X.Nml r6 = X.C47446E2s.A00(r1)
            X.Drq r3 = r1.A00
            if (r3 == 0) goto L_0x079f
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x079f
            boolean r0 = r3.A06
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Boolean r7 = X.DbT.A0l(r0)
        L_0x071f:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0728
            boolean r0 = r3.A06
            r3 = 1
            if (r0 == 0) goto L_0x0729
        L_0x0728:
            r3 = 0
        L_0x0729:
            r9 = 3
            X.0qQ.A0B(r5, r9)
            X.0wc r0 = r4.A01
            X.1Ln r4 = X.1Ln.A0J(r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x076e
            r0 = 5
            r4.A0Z(r0)
            r4.A0X(r2)
            r0 = 324(0x144, float:4.54E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0O(r0, r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0 = 326(0x146, float:4.57E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0O(r0, r3)
            java.lang.String r0 = "entry_point"
            r4.A0M(r6, r0)
            java.lang.String r3 = "character"
            r0 = 3297(0xce1, float:4.62E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0R(r0, r3)
            java.lang.String r0 = "agent_id"
            r4.A0R(r0, r5)
            r4.Cgf()
        L_0x076e:
            X.0eM r0 = r1.A03
            java.lang.Object r7 = r0.getValue()
            X.DlS r7 = (X.C46793DlS) r7
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            X.0Ud r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.Drq r0 = (X.C47175Drq) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x07a4
            X.8ab r2 = X.DbS.A0X(r6)
            r0 = 2131952573(0x7f1303bd, float:1.9541593E38)
            r2.A09(r0)
            r0 = 2131952572(0x7f1303bc, float:1.954159E38)
            r2.A08(r0)
            r1 = 2131952566(0x7f1303b6, float:1.9541578E38)
            r0 = 0
            X.Dba.A0t(r0, r2, r1)
            goto L_0x0010
        L_0x079f:
            r7 = 0
            if (r3 == 0) goto L_0x0728
            goto L_0x071f
        L_0x07a4:
            X.Ezd r0 = r7.A01
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            r10 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0010
            java.util.Iterator r4 = r0.iterator()
        L_0x07bb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x07d1
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.BBO r0 = (X.BBO) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x07bb
            r10 = r3
        L_0x07d1:
            X.BBO r10 = (X.BBO) r10
            if (r10 == 0) goto L_0x0010
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r8 = r7.A03
            java.lang.String r7 = r10.A04
            java.lang.String r3 = r10.A05
            com.instagram.common.typedurl.ImageUrl r11 = r10.A02
            java.lang.String r5 = r10.A07
            boolean r4 = r10.A08
            X.C51973G9u.A0r(r9, r7, r3, r11)
            if (r5 != 0) goto L_0x07ea
            r0 = 0
            r8.A09(r0, r3, r7)
        L_0x07ea:
            r12 = r7
            r13 = r3
            r14 = r4
            r15 = r4
            r16 = r2
            X.5gg r7 = com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A00(r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x0862
            X.3t0 r4 = new X.3t0
            r4.<init>(r5)
        L_0x07fb:
            X.3t2 r4 = (X.C254783t2) r4
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            X.Mi7 r5 = X.C67089Mi7.A00(r0, r5)
            java.util.List r7 = r7.A00
            java.lang.Object r7 = r7.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7
            com.instagram.model.direct.DirectShareTarget r8 = new com.instagram.model.direct.DirectShareTarget
            r8.<init>((X.C254783t2) r4, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7)
            java.lang.Integer r9 = X.AnonymousClass05K.A0B
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r13 = 38
            r14 = -1
            java.lang.String r10 = ""
            r11 = 0
            X.N8k r7 = new X.N8k
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            r8 = 1
            java.lang.String r13 = "UNKNOWN"
            r12 = r7
            r15 = r8
            r10 = r1
            r11 = r0
            r9 = r5
            r9.A06(r10, r11, r12, r13, r14, r15)
            r7 = 1275(0x4fb, float:1.787E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            X.1pE r6 = X.1pE.A01(r6, r1, r0, r7)
            r6.A00 = r1
            r6.A0B = r4
            r6.A0j = r3
            r0 = 1012(0x3f4, float:1.418E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0H = r0
            r6.A0v = r8
            r0 = 928483(0xe2ae3, float:1.301082E-39)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0F = r0
            r6.A06()
            r5.A0A(r4, r2)
            goto L_0x0010
        L_0x0862:
            r4 = r7
            goto L_0x07fb
        L_0x0864:
            java.lang.String r0 = "getId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x086b:
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            java.lang.Object r0 = A00(r14, r3)
            X.LOL r0 = (X.LOL) r0
            java.util.LinkedHashMap r1 = r0.A06
            java.lang.String r0 = r14.getUsername()
            boolean r0 = r1.containsKey(r0)
            r0 = r0 ^ 1
            goto L_0x08a3
        L_0x0880:
            java.lang.Object r0 = r3.A01
            X.LpF r0 = (X.C65209LpF) r0
            X.Jg0 r0 = r0.A02
            X.2Fj r0 = r0.A01
            r0.A0B(r14)
            r3 = 0
            return r3
        L_0x088d:
            com.instagram.model.people.PeopleTag r14 = (com.instagram.model.people.PeopleTag) r14
            java.lang.Object r0 = A00(r14, r3)
            X.JwD r0 = (X.C61075JwD) r0
            java.util.List r1 = r0.A0V
            if (r1 != 0) goto L_0x089b
            X.0sn r1 = X.0sn.A00
        L_0x089b:
            com.instagram.user.model.User r0 = r14.A07()
            boolean r0 = X.JTQ.A1T(r0, r1)
        L_0x08a3:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x08a8:
            X.JwA r14 = (X.C61072JwA) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            int r0 = r14.A01
            int r6 = r0 + -1
            java.lang.Object r0 = r14.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r3.A01
            X.GlE r5 = (X.C53266GlE) r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x08c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08ef
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.GlE r0 = (X.C53266GlE) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r5.A00
            X.DbY.A1T(r1, r0, r2, r4)
            goto L_0x08c2
        L_0x08d7:
            X.JwA r14 = (X.C61072JwA) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            int r0 = r14.A01
            int r6 = r0 + 1
            java.lang.Object r0 = r3.A01
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.Object r0 = r14.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = X.00k.A0S(r0, r1)
        L_0x08ef:
            r0 = 8
            X.JwA r3 = new X.JwA
            r3.<init>((int) r6, (java.util.List) r4, (int) r0)
            return r3
        L_0x08f7:
            java.lang.Object r0 = r3.A01
            X.5b4 r0 = (X.AnonymousClass5b4) r0
            X.5b5 r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            float r0 = X.AnonymousClass7TE.A04(r0)
            int r0 = X.AnonymousClass1GB.A01(r0)
            long r1 = (long) r0
            r0 = 32
            long r1 = r1 << r0
            X.5d8 r3 = new X.5d8
            r3.<init>(r1)
            return r3
        L_0x0913:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0918:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP9.invoke(java.lang.Object):java.lang.Object");
    }
}
