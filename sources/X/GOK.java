package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;

public final class GOK extends C251343mx {
    public final long A00;
    public final C376459Ib A01;
    public final 2WX A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4GS A05;
    public final C52976GgT A06;
    public final NotesPogThoughtBubbleUiState A07;
    public final GOL A08;
    public final C59492JLq A09;
    public final AnonymousClass33B A0A;
    public final C59553JNz A0B;
    public final AnonymousClass4DU A0C;
    public final 0sP A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public /* synthetic */ GOK(C376459Ib r5, 2WX r6, AnonymousClass0iw r7, UserSession userSession, AnonymousClass4GS r9, C52976GgT ggT, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C59492JLq jLq, AnonymousClass33B r13, C59553JNz jNz, AnonymousClass4DU r15, 0sP r16, int i, long j, boolean z, boolean z2, boolean z3) {
        GOL gol = null;
        r7 = (i & 16) != 0 ? null : r7;
        r6 = (i & 32) != 0 ? null : r6;
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            C226442gp r0 = C226442gp.A00;
            0qQ.A07(r0);
            gol = new GOL(r0);
        }
        C51974G9v.A1M(notesPogThoughtBubbleUiState, userSession, r15);
        0sP r2 = r16;
        C51973G9u.A0t(7, r2, jNz, jLq);
        0qQ.A0B(r5, 14);
        C51969G9p.A1S(r13, 16, gol);
        this.A06 = ggT;
        this.A07 = notesPogThoughtBubbleUiState;
        this.A04 = userSession;
        this.A0C = r15;
        this.A03 = r7;
        this.A02 = r6;
        this.A0D = r2;
        this.A0B = jNz;
        this.A09 = jLq;
        this.A00 = j;
        this.A0G = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A01 = r5;
        this.A05 = r9;
        this.A0A = r13;
        this.A08 = gol;
    }

    public static final void A00(View view, C70832Wc r9, UserSession userSession, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, GOK gok, String str) {
        String str2;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        GOK gok2 = gok;
        if (notesPogThoughtBubbleUiState.A08 != AnonymousClass05K.A00) {
            AnonymousClass33B r3 = gok.A0A;
            AnonymousClass4GS r2 = gok.A05;
            Integer num = null;
            if (r2 != null) {
                str2 = r2.All();
                num = r2.Als();
            } else {
                str2 = null;
            }
            r3.Div(notesPogThoughtBubbleUiState, num, str2);
            return;
        }
        UserSession userSession2 = userSession;
        View view2 = view;
        C70832Wc r4 = r9;
        String str3 = str;
        if (AnonymousClass7TE.A0q(userSession).getBoolean(AnonymousClass000.A00(3223), false) || !182.A06(DbS.A0J(userSession, 0), userSession, 36320652933931735L)) {
            A04(view2, r9, userSession, notesPogThoughtBubbleUiState, gok, str);
            return;
        }
        gok.A0A.D5w(notesPogThoughtBubbleUiState, new C73917Pls(userSession2, r4, view2, notesPogThoughtBubbleUiState2, gok2, str3, 1));
        String str4 = notesPogThoughtBubbleUiState.A0C;
        AnonymousClass7TF.A1B(str4, 1, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_consumption_nux_bottom_sheet_impression_client");
        if (A0e.isSampled()) {
            C51965G9l.A1J(A0e, str);
            DbS.A1O(A0e, str4);
            A0e.Cgf();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.view.View r31, X.C70832Wc r32, com.instagram.common.session.UserSession r33, com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r34, X.GOK r35, java.lang.String r36) {
        /*
            r1 = r34
            java.lang.String r3 = r1.A0H
            if (r3 == 0) goto L_0x0072
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x0072
            r2 = r35
            X.4GS r5 = r2.A05
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r29 = X.GMU.A02(r5, r1)
            java.lang.String r6 = r1.A0J
            r11 = r33
            boolean r0 = X.2R8.A05(r11, r6)
            r25 = 0
            r27 = r31
            if (r0 == 0) goto L_0x0076
            android.content.Context r4 = X.C243803a8.A00(r32)
            X.4Yx r0 = X.GMU.A01(r1)
            java.lang.String r18 = X.C51968G9o.A11(r4, r0)
            com.instagram.common.typedurl.ImageUrl r12 = r1.A03
            java.lang.String r10 = r1.A0E
            java.lang.Integer r14 = r1.A07
            java.lang.String r8 = r1.A0C
            java.util.List r7 = r1.A0K
            java.lang.String r4 = r1.A0D
            java.lang.String r0 = r1.A0I
            int r9 = r1.A01
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            if (r5 == 0) goto L_0x0073
            java.lang.String r25 = r5.All()
            java.lang.Integer r16 = r5.Als()
        L_0x004c:
            com.instagram.common.typedurl.ImageUrl r13 = r1.A04
            r20 = r36
            r24 = r0
            r26 = r7
            r21 = r10
            r22 = r8
            r23 = r4
            r19 = r3
            r17 = r6
            X.E1H r6 = X.C48783Ek6.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.33B r4 = r2.A0A
            java.lang.Integer r3 = r1.A0A
            X.4DU r0 = r2.A0C
            r5 = r27
            r7 = r29
            r8 = r1
            r9 = r0
            r10 = r3
            r4.Diu(r5, r6, r7, r8, r9, r10)
        L_0x0072:
            return
        L_0x0073:
            r16 = r25
            goto L_0x004c
        L_0x0076:
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r4 = r1.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 == r0) goto L_0x009f
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.GPJ r8 = X.GPJ.A00
            java.lang.String r7 = r1.A0C
            java.lang.String r6 = r1.A0D
            java.lang.String r0 = r1.A0I
            r10 = 0
            if (r5 == 0) goto L_0x00d1
            java.lang.String r15 = r5.All()
            java.lang.Integer r10 = r5.Als()
        L_0x0097:
            r9 = r11
            r11 = r7
            r12 = r6
            r13 = r0
            r14 = r3
            r8.A06(r9, r10, r11, r12, r13, r14, r15)
        L_0x009f:
            X.33B r7 = r2.A0A
            X.4DU r6 = r2.A0C
            boolean r5 = r1.A0Q
            android.content.Context r2 = X.C243803a8.A00(r32)
            X.4Yx r0 = X.GMU.A01(r1)
            java.lang.String r34 = X.C51968G9o.A11(r2, r0)
            java.lang.Integer r3 = r1.A07
            boolean r2 = r1.A0P
            java.lang.Long r0 = r1.A0B
            if (r0 == 0) goto L_0x00bb
            r25 = r0
        L_0x00bb:
            com.instagram.api.schemas.NoteCustomTheme r0 = r1.A02
            r26 = r7
            r28 = r0
            r30 = r6
            r31 = r4
            r32 = r3
            r33 = r25
            r35 = r5
            r36 = r2
            r26.DVf(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        L_0x00d1:
            r15 = r10
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GOK.A04(android.view.View, X.2Wc, com.instagram.common.session.UserSession, com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState, X.GOK, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Hpd, java.lang.Object] */
    public static final boolean A05(Context context, C243673Zt r14, 2Wa r15, GOK gok) {
        boolean z;
        String str;
        User A11;
        GOK gok2 = gok;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = gok2.A07;
        UserSession userSession = gok2.A04;
        boolean A1Z = AnonymousClass7TG.A1Z(notesPogThoughtBubbleUiState, userSession);
        Integer A032 = GMU.A03(notesPogThoughtBubbleUiState);
        if (A032 == AnonymousClass05K.A0C || A032 == AnonymousClass05K.A0N) {
            z = false;
            if (!0qQ.A0K(notesPogThoughtBubbleUiState.A0J, DbX.A0r(AnonymousClass0eD.A00(userSession))) && 182.A06(0Tu.A05, userSession, 36320652934718177L)) {
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        AnonymousClass2VL.A00();
        View view = (View) r14.A00;
        if (view == null) {
            return false;
        }
        AnonymousClass2S0.A01.A04();
        String str2 = notesPogThoughtBubbleUiState.A0F;
        0qQ.A0B(str2, A1Z ? 1 : 0);
        01N A1H = 0jo.A1H();
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36320652935963372L)) {
            A1H.add(C54692HOx.ADD_NOTE);
        }
        A1H.addAll(0sr.A1P(new C54692HOx[]{C54692HOx.VIEW_PROFILE, C54692HOx.MUTE}));
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U == null || (A11 = C51966G9m.A11(A0U)) == null) {
            str = null;
        } else {
            str = A11.getId();
        }
        if (C51966G9m.A1W(userSession, str) && 182.A06(r4, userSession, 36320652932883151L)) {
            A1H.add(C54692HOx.DELETE_NOTE);
        }
        A1H.add(C54692HOx.REPORT);
        01N A1I = 0jo.A1I(A1H);
        ? obj = new Object();
        if (C54899HXh.A00(context, view, userSession, A1I, new GNG(47, obj, r15), new C58727Iwa(gok2, 17))) {
            obj.A00(view);
            r15.A00();
            return true;
        }
        DbT.A1Q(0wj.A01, "Failed to show drop-down menu for longpress", 817892647);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.MMv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.Ixj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v3, resolved type: X.Ixj} */
    /* JADX WARNING: type inference failed for: r10v6, types: [X.9jo, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0147, code lost:
        if (X.182.A06(X.0Tu.A05, r95, 36326713130891198L) == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02f2, code lost:
        if (X.0qQ.A0K(r15, r1) != false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x030b, code lost:
        if (X.C51969G9p.A1V(r61) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0528, code lost:
        if (r3.A0Y == false) goto L_0x052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00d9, code lost:
        if (X.182.A06(X.0Tu.A05, r95, 36326713130694587L) == false) goto L_0x00db;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0503  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r99) {
        /*
            r98 = this;
            r21 = 0
            r2 = r99
            r0 = r21
            X.0qQ.A0B(r2, r0)
            X.GMQ r41 = X.GMP.A00(r2)
            r4 = r98
            boolean r0 = r4.A0E
            r16 = r0
            r9 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            if (r16 == 0) goto L_0x0021
            r0 = 0
        L_0x0021:
            X.2V5 r46 = X.C51968G9o.A0Z(r2, r0)
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r3 = r4.A07
            java.lang.String r0 = r3.A0F
            r97 = r0
            java.lang.String r0 = r3.A0H
            r96 = r0
            r1 = r97
            java.lang.String r23 = X.002.A0R(r1, r0)
            X.2V5 r45 = X.C247343gB.A00(r2, r13)
            X.2V5 r44 = X.C247343gB.A00(r2, r13)
            X.2V5 r71 = X.C247343gB.A00(r2, r13)
            X.2V5 r72 = X.C247343gB.A00(r2, r13)
            long r0 = r4.A00
            r19 = r0
            r43 = 3
            X.I83 r8 = new X.I83
            r1 = r43
            r0 = r46
            r8.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r4)
            r24 = 4
            X.I83 r7 = new X.I83
            r1 = r24
            r0 = r45
            r7.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r4)
            r42 = 5
            X.I83 r6 = new X.I83
            r1 = r42
            r0 = r44
            r6.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r4)
            boolean r1 = r4.A0G
            com.instagram.common.session.UserSession r0 = r4.A04
            r95 = r0
            r25 = r8
            r26 = r7
            r27 = r6
            r28 = r0
            r29 = r19
            r31 = r1
            X.JwM r1 = X.GMR.A03(r25, r26, r27, r28, r29, r31)
            java.lang.Object r0 = r1.A00
            r40 = r0
            r0 = r40
            android.animation.Animator r0 = (android.animation.Animator) r0
            r40 = r0
            java.lang.Object r0 = r1.A01
            r39 = r0
            r0 = r39
            android.animation.Animator r0 = (android.animation.Animator) r0
            r39 = r0
            java.lang.Object r0 = r1.A02
            r38 = r0
            r0 = r38
            android.animation.Animator r0 = (android.animation.Animator) r0
            r38 = r0
            int r6 = r3.A00
            X.GMT r37 = new X.GMT
            r1 = r37
            r0 = r96
            r1.<init>(r0, r6)
            X.2V1 r0 = r2.A05
            r94 = r0
            android.content.Context r36 = X.C51965G9l.A0B(r94)
            boolean r0 = X.C247163fs.A00(r36)
            r22 = 1
            if (r0 != 0) goto L_0x00db
            r1 = r95
            r0 = r21
            X.0qQ.A0B(r1, r0)
            java.lang.Boolean r0 = X.GOC.A00(r95)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00db
            X.0Tu r7 = X.0Tu.A05
            r0 = 36326713130694587(0x810ef4000337bb, double:3.0364978875595554E-306)
            r6 = r95
            boolean r0 = X.182.A06(r7, r6, r0)
            r25 = 1
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            r25 = 0
        L_0x00dd:
            X.0rm r6 = X.C51965G9l.A11()
            r14 = 0
            if (r25 == 0) goto L_0x0106
            X.GOL r0 = r4.A08
            X.GPG r0 = r0.A00
            X.3Ja r7 = r0.A00
            java.lang.String r1 = "content_notes_iconic_pop_in"
            X.9DH r0 = X.C226442gp.A00(r7, r1)
            boolean r8 = r0.A02()
            if (r8 != 0) goto L_0x04b0
            X.9jo r10 = new X.9jo
            r1 = r21
            r10.<init>(r0, r1)
            r8 = 670942303(0x27fdc45f, float:7.0434512E-15)
            r7 = 2
            r1 = r22
            X.1ES.A05(r10, r8, r7, r1, r1)
        L_0x0106:
            r15 = 0
        L_0x0107:
            X.2V5 r84 = X.C247343gB.A00(r2, r5)
            X.2V5 r83 = X.C247343gB.A00(r2, r5)
            X.2V5 r49 = X.C247343gB.A00(r2, r5)
            X.2V5 r50 = X.C247343gB.A00(r2, r5)
            X.2V5 r51 = X.C247343gB.A00(r2, r5)
            X.2V5 r52 = X.C247343gB.A00(r2, r5)
            X.2V5 r53 = X.C247343gB.A00(r2, r5)
            X.2V5 r54 = X.C247343gB.A00(r2, r5)
            r1 = r95
            r0 = r21
            X.0qQ.A0B(r1, r0)
            java.lang.Boolean r0 = X.GOC.A00(r95)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0149
            X.0Tu r1 = X.0Tu.A05
            r7 = 36326713130891198(0x810ef4000637be, double:3.036497887683893E-306)
            r0 = r95
            boolean r0 = X.182.A06(r1, r0, r7)
            r64 = 1
            if (r0 != 0) goto L_0x014b
        L_0x0149:
            r64 = 0
        L_0x014b:
            java.lang.Object[] r1 = new java.lang.Object[]{r23}
            X.GON r0 = new X.GON
            r78 = r0
            r79 = r40
            r80 = r39
            r81 = r38
            r82 = r2
            r85 = r50
            r86 = r49
            r87 = r51
            r88 = r52
            r89 = r53
            r90 = r54
            r91 = r4
            r92 = r6
            r93 = r64
            r78.<init>(r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
            X.C243773a4.A00(r2, r0, r1)
            float r0 = X.C51970G9q.A01(r16)
            X.2V5 r18 = X.C51968G9o.A0Z(r2, r0)
            if (r16 != 0) goto L_0x017f
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x017f:
            X.2V5 r26 = X.C51968G9o.A0Z(r2, r9)
            r1 = 7
            X.I83 r8 = new X.I83
            r0 = r18
            r8.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r4)
            java.lang.Object r7 = r6.A00
            android.media.SoundPool r7 = (android.media.SoundPool) r7
            android.animation.AnimatorSet r17 = new android.animation.AnimatorSet
            r17.<init>()
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            X.1wD r0 = X.1w8.A00()
            int r12 = r0.A01
            r31 = 2
            r0 = r31
            float[] r0 = new float[r0]
            r0 = {0, 1066192077} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r0)
            X.C51969G9p.A10(r6)
            r10 = 250(0xfa, double:1.235E-321)
            r6.setDuration(r10)
            r27 = 70
            long r0 = r19 + r27
            r6.setStartDelay(r0)
            r6.addUpdateListener(r8)
            if (r25 == 0) goto L_0x01d3
            if (r12 <= 0) goto L_0x01d3
            if (r7 == 0) goto L_0x01d3
            X.I7d r9 = new X.I7d
            r1 = r95
            r9.<init>(r7, r1, r15, r12)
            r6.addListener(r9)
        L_0x01d3:
            r0 = r31
            float[] r0 = new float[r0]
            r0 = {1066192077, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            X.C51969G9p.A10(r0)
            r0.setDuration(r10)
            r0.addUpdateListener(r8)
            android.animation.Animator[] r1 = new android.animation.Animator[]{r6, r0}
            r0 = r17
            r0.playSequentially(r1)
            r1 = 6
            X.I83 r7 = new X.I83
            r0 = r26
            r7.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r4)
            android.animation.AnimatorSet r35 = new android.animation.AnimatorSet
            r35.<init>()
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r0 = r31
            float[] r0 = new float[r0]
            r0 = {0, 1066192077} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r0)
            X.C51969G9p.A10(r6)
            r8 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r8)
            r0 = r19
            r6.setStartDelay(r0)
            r6.addUpdateListener(r7)
            r0 = r31
            float[] r0 = new float[r0]
            r0 = {1066192077, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            X.C51969G9p.A10(r0)
            r0.setDuration(r8)
            r0.addUpdateListener(r7)
            android.animation.Animator[] r1 = new android.animation.Animator[]{r6, r0}
            r0 = r35
            r0.playSequentially(r1)
            X.GOM r1 = new X.GOM
            r0 = r23
            r1.<init>(r4, r0)
            r0 = r17
            r0.addListener(r1)
            X.JLq r15 = r4.A09
            r0 = r96
            boolean r34 = X.GMU.A05(r3, r15, r0)
            X.GOV r0 = X.GOV.A00
            X.2Wa r33 = X.C243643Zq.A00(r2, r0)
            X.GOZ r0 = X.GOZ.A00
            X.2Wa r32 = X.C243643Zq.A00(r2, r0)
            X.GOY r0 = X.GOY.A00
            X.2Wa r30 = X.C243643Zq.A00(r2, r0)
            X.GOX r0 = X.GOX.A00
            X.2Wa r61 = X.C243643Zq.A00(r2, r0)
            X.2V5 r29 = X.C247343gB.A00(r2, r13)
            X.2V5 r28 = X.C247343gB.A00(r2, r5)
            X.2V5 r47 = X.C247343gB.A00(r2, r13)
            X.GOW r0 = X.GOW.A00
            X.2Wa r89 = X.C243643Zq.A00(r2, r0)
            java.lang.String r5 = "move_up_transition_key"
            X.3Zd r0 = X.2Vi.A04
            X.4Ey r1 = X.C51970G9q.A0b(r0, r5)
            r6 = 10
            r0 = r36
            X.4F6 r0 = X.AnonymousClass4F6.A00(r0, r6)
            r1.A04(r0)
            r0 = 200(0xc8, float:2.8E-43)
            X.C51966G9m.A1M(r1, r0)
            X.AnonymousClass4F7.A00(r2, r1)
            X.3XV r11 = X.2WX.A02
            boolean r27 = X.C51969G9p.A1V(r89)
            if (r27 == 0) goto L_0x04ad
            X.3Zd r1 = X.C243533Zd.LOCAL
            r0 = r94
            X.2WX r0 = X.C51971G9r.A0V(r0, r14, r1, r5)
        L_0x02a8:
            X.2WX r25 = r11.A00(r0)
            r1 = r97
            r0 = r95
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r0}
            X.GOP r0 = new X.GOP
            r55 = r0
            r56 = r41
            r57 = r2
            r58 = r33
            r59 = r32
            r60 = r30
            r62 = r4
            r63 = r97
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63)
            java.lang.Object r20 = X.AnonymousClass3Zw.A00(r2, r0, r1)
            r0 = r20
            X.2Vt r0 = (X.C70802Vt) r0
            r20 = r0
            java.lang.Object[] r7 = new java.lang.Object[]{r32}
            r6 = 48
            X.GNG r5 = new X.GNG
            r1 = r32
            r0 = r29
            r5.<init>(r6, r1, r0)
            X.C243773a4.A00(r2, r5, r7)
            java.lang.Integer r0 = r3.A0A
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r0 == r9) goto L_0x02f4
            r0 = r37
            boolean r0 = X.0qQ.A0K(r15, r0)
            r5 = 0
            if (r0 == 0) goto L_0x02f5
        L_0x02f4:
            r5 = 1
        L_0x02f5:
            android.os.Handler r19 = X.AnonymousClass7TF.A0D()
            X.GOe r0 = X.C52336GOe.A00
            X.2Wa r13 = X.C243643Zq.A00(r2, r0)
            X.GMY r65 = X.GMY.A00
            boolean r1 = r4.A0F
            if (r5 != 0) goto L_0x030d
            boolean r0 = X.C51969G9p.A1V(r61)
            r81 = 0
            if (r0 == 0) goto L_0x030f
        L_0x030d:
            r81 = 1
        L_0x030f:
            X.9Ib r0 = r4.A01
            r63 = r0
            boolean r0 = r3.A0U
            r48 = r0
            X.GPI r78 = X.GPI.A00
            r66 = r40
            r67 = r39
            r68 = r38
            r69 = r63
            r70 = r46
            r73 = r45
            r74 = r44
            r75 = r95
            r76 = r37
            r77 = r23
            r79 = r16
            r80 = r1
            r82 = r0
            X.2WX r1 = r65.A00(r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
            X.2WX r0 = r4.A02
            X.2WX r1 = r1.A00(r0)
            android.content.Context r0 = X.C243803a8.A00(r2)
            android.content.res.Resources r6 = X.AnonymousClass7TF.A0A(r0)
            r8 = 2131956660(0x7f1313b4, float:1.9549882E38)
            com.instagram.user.model.User r0 = r3.A06
            java.lang.String r7 = r0.getUsername()
            X.4Yx r5 = X.GMU.A01(r3)
            r0 = r22
            X.0qQ.A0B(r5, r0)
            java.lang.CharSequence r0 = r5.A00(r6)
            java.lang.String r5 = X.DbV.A0w(r6, r7, r0, r8)
            X.0qQ.A07(r5)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            r0 = r21
            X.9JS r0 = X.C51965G9l.A0d(r10, r5, r0)
            if (r1 != r11) goto L_0x036d
            r1 = 0
        L_0x036d:
            X.2WX r8 = X.C51965G9l.A0X(r1, r0)
            java.lang.Integer r0 = X.GMU.A03(r3)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            if (r0 != r12) goto L_0x0423
            r5 = 20
            X.PmT r1 = new X.PmT
            r0 = r97
            r1.<init>(r4, r2, r0, r5)
            X.2WX r0 = X.C51972G9s.A0V(r14, r1)
        L_0x0386:
            X.2WX r5 = r8.A00(r0)
            r0 = 20
            X.Iwa r1 = new X.Iwa
            r1.<init>(r4, r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            X.3at r0 = new X.3at
            r0.<init>(r7, r1, r14)
            X.2WX r0 = X.C51965G9l.A0X(r14, r0)
            X.2WX r6 = r5.A00(r0)
            r0 = 0
            if (r34 == 0) goto L_0x03b6
            r0 = 0
            X.2WX r5 = X.C52112GFg.A01(r11, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            r0 = r24
            X.9JS r0 = X.C51965G9l.A0d(r9, r1, r0)
            X.2WX r0 = X.C51965G9l.A0X(r5, r0)
        L_0x03b6:
            X.2WX r8 = r6.A00(r0)
            java.lang.Integer r11 = r3.A08
            if (r11 != r10) goto L_0x0421
            X.0Tu r1 = X.0Tu.A05
            r5 = 36320652937863934(0x810971005f22fe, double:3.0326653972110126E-306)
            r0 = r95
            boolean r0 = X.182.A06(r1, r0, r5)
            if (r0 == 0) goto L_0x0421
            r6 = 17
            X.J6W r5 = new X.J6W
            r1 = r19
            r5.<init>(r6, r1, r13, r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.3at r0 = new X.3at
            r0.<init>(r1, r5, r14)
            X.2WX r6 = X.C51965G9l.A0X(r14, r0)
            r5 = 21
            X.Iwa r1 = new X.Iwa
            r0 = r19
            r1.<init>(r0, r5)
            X.2WX r0 = X.C51971G9r.A0Z(r6, r10, r1, r14)
        L_0x03ee:
            X.2WX r5 = r8.A00(r0)
            boolean r0 = X.GMU.A04(r3, r15)
            if (r0 == 0) goto L_0x0503
            long r0 = X.C51969G9p.A0C()
            java.lang.Integer r7 = X.AnonymousClass05K.A15
            r6 = r21
            X.2WX r0 = X.AnonymousClass9JR.A00(r14, r7, r6, r0)
            X.2WX r6 = r5.A00(r0)
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r94)
            X.4DU r4 = r4.A0C
            java.util.List r3 = r3.A0L
            r0 = 27
            X.JwI r1 = new X.JwI
            r1.<init>((java.util.List) r3, (int) r0)
            X.Gry r0 = new X.Gry
            r0.<init>(r1, r4)
            X.2Tl r0 = X.C51967G9n.A0N(r0, r5, r2, r6)
            return r0
        L_0x0421:
            r0 = 0
            goto L_0x03ee
        L_0x0423:
            android.content.Context r0 = X.C243803a8.A00(r2)
            boolean r0 = X.2eO.A00(r0)
            if (r0 == 0) goto L_0x0453
            r37 = 28
            X.IxG r5 = new X.IxG
            r36 = r5
            r39 = r4
            r40 = r2
            r38 = r61
            r36.<init>(r37, r38, r39, r40, r41)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            r0 = r24
            X.2WX r6 = X.C51971G9r.A0Y(r14, r1, r5, r0)
            r5 = 21
            X.PmT r1 = new X.PmT
            r0 = r97
            r1.<init>(r4, r2, r0, r5)
            X.2WX r0 = X.C51972G9s.A0V(r6, r1)
            goto L_0x0386
        L_0x0453:
            java.lang.Integer r1 = X.GMU.A03(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x049c
            java.lang.Integer r0 = X.GMU.A03(r3)
            if (r0 == r9) goto L_0x049c
            X.0sP r7 = r4.A0D
            X.JNz r6 = r4.A0B
            boolean r62 = X.C51969G9p.A1V(r61)
            r1 = r22
            r0 = r20
            X.0qQ.A0B(r0, r1)
            r0 = r43
            X.0qQ.A0B(r15, r0)
            r0 = r24
            X.0qQ.A0B(r7, r0)
            r0 = r42
            X.0qQ.A0B(r6, r0)
            X.Ixj r5 = new X.Ixj
            r55 = r5
            r56 = r43
            r57 = r20
            r58 = r7
            r59 = r15
            r60 = r6
            r61 = r41
            r55.<init>(r56, r57, r58, r59, r60, r61, r62)
        L_0x0492:
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            r0 = r24
            X.2WX r0 = X.C51971G9r.A0Y(r14, r1, r5, r0)
            goto L_0x0386
        L_0x049c:
            r1 = r21
            r0 = r20
            X.0qQ.A0B(r0, r1)
            r6 = 12
            X.MMv r5 = new X.MMv
            r1 = r41
            r5.<init>(r6, r1, r0)
            goto L_0x0492
        L_0x04ad:
            r0 = 0
            goto L_0x02a8
        L_0x04b0:
            r8 = 8
            android.media.SoundPool$Builder r0 = new android.media.SoundPool$Builder
            r0.<init>()
            android.media.SoundPool$Builder r8 = r0.setMaxStreams(r8)
            android.media.AudioAttributes$Builder r10 = new android.media.AudioAttributes$Builder
            r10.<init>()
            r0 = r21
            android.media.AudioAttributes$Builder r10 = r10.setContentType(r0)
            r0 = r42
            android.media.AudioAttributes$Builder r0 = r10.setUsage(r0)
            android.media.AudioAttributes r0 = r0.build()
            android.media.SoundPool$Builder r0 = r8.setAudioAttributes(r0)
            android.media.SoundPool r0 = r0.build()
            X.0qQ.A0A(r0)
            r6.A00 = r0
            X.9DH r0 = X.C226442gp.A00(r7, r1)     // Catch:{ NotFoundException -> 0x0106 }
            java.lang.Object r0 = r0.A00()     // Catch:{ NotFoundException -> 0x0106 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ NotFoundException -> 0x0106 }
            if (r0 == 0) goto L_0x0501
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ NotFoundException -> 0x0106 }
        L_0x04ed:
            java.lang.Object r7 = r6.A00     // Catch:{ NotFoundException -> 0x0106 }
            android.media.SoundPool r7 = (android.media.SoundPool) r7     // Catch:{ NotFoundException -> 0x0106 }
            if (r0 == 0) goto L_0x04ff
            java.lang.String r1 = r0.getPath()     // Catch:{ NotFoundException -> 0x0106 }
        L_0x04f7:
            r0 = r22
            int r15 = r7.load(r1, r0)     // Catch:{ NotFoundException -> 0x0106 }
            goto L_0x0107
        L_0x04ff:
            r1 = r14
            goto L_0x04f7
        L_0x0501:
            r0 = 0
            goto L_0x04ed
        L_0x0503:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            r0 = r24
            X.2WX r0 = X.C51971G9r.A0Y(r14, r7, r1, r0)
            X.2WX r5 = r5.A00(r0)
            r0 = r24
            X.2WX r0 = X.C51971G9r.A0Y(r14, r10, r1, r0)
            X.2WX r6 = r5.A00(r0)
            X.GOA r5 = X.GOA.A00
            boolean r13 = r3.A0X
            if (r13 == 0) goto L_0x052a
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x052a
            boolean r0 = r3.A0Y
            r1 = 1
            if (r0 != 0) goto L_0x052b
        L_0x052a:
            r1 = 0
        L_0x052b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.3ar r0 = new X.3ar
            r0.<init>(r5, r1)
            r1 = r31
            X.2WX r0 = X.C51971G9r.A0Y(r14, r12, r0, r1)
            X.2WX r7 = r6.A00(r0)
            if (r13 == 0) goto L_0x06d7
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x06d7
            boolean r0 = r3.A0S
            if (r0 == 0) goto L_0x06d7
            long r5 = X.C51970G9q.A0H()
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r0 = r21
            X.2WX r0 = X.AnonymousClass9JR.A00(r14, r1, r0, r5)
        L_0x0554:
            X.2WX r8 = r7.A00(r0)
            java.lang.Integer r9 = r3.A09
            if (r9 == r12) goto L_0x06d4
            boolean r0 = X.C51969G9p.A1V(r30)
            if (r0 != 0) goto L_0x06d4
            android.os.Handler r7 = X.AnonymousClass7TF.A0D()
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            r86 = 27
            X.IxG r0 = new X.IxG
            r85 = r0
            r87 = r7
            r88 = r4
            r90 = r6
            r85.<init>(r86, r87, r88, r89, r90)
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            X.3at r1 = new X.3at
            r1.<init>(r5, r0, r14)
            X.2WX r5 = X.C51965G9l.A0X(r14, r1)
            r1 = 20
            X.MMv r0 = new X.MMv
            r0.<init>(r1, r6, r7)
            X.3at r1 = new X.3at
            r1.<init>(r10, r0, r14)
            X.2WX r0 = X.C51965G9l.A0X(r5, r1)
        L_0x0594:
            X.2WX r1 = r8.A00(r0)
            r0 = r25
            X.2WX r85 = r1.A00(r0)
            X.3Zh r87 = X.C243573Zh.CENTER
            X.3Zi r88 = X.C243583Zi.FLEX_END
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r94)
            if (r9 == r12) goto L_0x05c0
            boolean r0 = X.C51969G9p.A1V(r30)
            if (r0 != 0) goto L_0x05c0
            if (r27 == 0) goto L_0x05c0
            X.4GS r0 = r4.A05
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r6 = X.GMU.A02(r0, r3)
            X.Gsb r1 = new X.Gsb
            r0 = r95
            r1.<init>(r0, r6, r9)
            r5.A00(r1)
        L_0x05c0:
            boolean r7 = r3.A0T
            if (r7 == 0) goto L_0x06ca
            r0 = 1119879168(0x42c00000, float:96.0)
        L_0x05c6:
            com.instagram.common.typedurl.ImageUrl r1 = r3.A03
            X.GNY r6 = new X.GNY
            r6.<init>((com.instagram.common.typedurl.ImageUrl) r1, (float) r0)
            X.0iw r0 = r4.A03
            if (r0 != 0) goto L_0x05d3
            X.4DU r0 = r4.A0C
        L_0x05d3:
            r75 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.GMe r1 = new X.GMe
            r65 = r1
            r66 = r35
            r67 = r63
            r68 = r6
            r69 = r26
            r70 = r84
            r71 = r83
            r72 = r0
            r73 = r95
            r74 = r23
            r76 = r21
            r77 = r21
            r78 = r16
            r79 = r64
            r80 = r48
            r65.<init>(r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            r5.A00(r1)
            r1 = r97
            r0 = r22
            X.0qQ.A0B(r1, r0)
            r1 = r96
            r0 = r31
            X.0qQ.A0B(r1, r0)
            X.4JK r6 = X.AnonymousClass4JJ.A00(r95)
            r1 = r97
            r0 = r96
            boolean r62 = r6.A05(r1, r0)
            X.4GS r6 = r4.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r11 != r0) goto L_0x06bf
            X.IPr r0 = X.C57128IPr.A00
        L_0x061d:
            X.JLo r0 = (X.C59490JLo) r0
            boolean r11 = r3.A0M
            boolean r10 = r3.A0S
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r35 = X.GMU.A02(r6, r3)
            boolean r8 = r3.A0V
            boolean r7 = r3.A0O
            boolean r6 = r3.A0Y
            boolean r1 = r3.A0W
            X.GOT r58 = new X.GOT
            r34 = r58
            r36 = r0
            r37 = r9
            r38 = r11
            r39 = r10
            r40 = r13
            r41 = r48
            r42 = r8
            r43 = r7
            r44 = r6
            r45 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r61 = X.C51969G9p.A1V(r32)
            if (r61 == 0) goto L_0x06ba
            r47 = r29
        L_0x0652:
            X.GgT r6 = r4.A06
            boolean r65 = X.AnonymousClass7TF.A1V(r6)
            com.instagram.api.schemas.NoteCustomTheme r4 = r3.A02
            r1 = 18
            X.MJ0 r3 = new X.MJ0
            r0 = r30
            r3.<init>(r0, r1)
            X.GOU r0 = new X.GOU
            r44 = r0
            r45 = r17
            r46 = r63
            r48 = r18
            r55 = r20
            r56 = r4
            r57 = r95
            r59 = r23
            r60 = r3
            r63 = r16
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r5.A00(r0)
            r0 = r33
            java.lang.Object r3 = r0.A03
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            if (r0 <= 0) goto L_0x06ad
            int r12 = r3.intValue()
            X.Iwa r4 = new X.Iwa
            r0 = r29
            r4.<init>(r0, r1)
            r3 = 19
            X.Iwa r1 = new X.Iwa
            r0 = r32
            r1.<init>(r0, r3)
            X.Gtt r0 = new X.Gtt
            r7 = r0
            r8 = r6
            r9 = r96
            r10 = r4
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A00(r0)
        L_0x06ad:
            r83 = r5
            r84 = r2
            r86 = r14
            r89 = r22
            X.2Tl r0 = X.C243563Zg.A06(r83, r84, r85, r86, r87, r88, r89)
            return r0
        L_0x06ba:
            if (r62 == 0) goto L_0x0652
            r47 = r28
            goto L_0x0652
        L_0x06bf:
            X.4Yx r1 = X.GMU.A01(r3)
            X.GPL r0 = new X.GPL
            r0.<init>(r1, r11, r7)
            goto L_0x061d
        L_0x06ca:
            boolean r1 = r3.A0Z
            r0 = 1111490560(0x42400000, float:48.0)
            if (r1 == 0) goto L_0x05c6
            r0 = 1107296256(0x42000000, float:32.0)
            goto L_0x05c6
        L_0x06d4:
            r0 = r14
            goto L_0x0594
        L_0x06d7:
            r0 = r14
            goto L_0x0554
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GOK.A0X(X.3Y5):X.3mp");
    }
}
