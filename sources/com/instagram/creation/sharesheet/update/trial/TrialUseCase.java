package com.instagram.creation.sharesheet.update.trial;

import X.02z;
import X.05D;
import X.05G;
import X.0Tu;
import X.0V1;
import X.0V2;
import X.0eO;
import X.0eP;
import X.0fS;
import X.10D;
import X.182;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0iw;
import X.AnonymousClass12T;
import X.AnonymousClass19S;
import X.AnonymousClass3QO;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass9J6;
import X.C262204Co;
import X.C262224Cq;
import X.C272024jy;
import X.C51970G9q;
import X.C59721JVf;
import X.C59732JVq;
import X.C61000Juw;
import X.C61046Jvk;
import X.C61062Jw0;
import X.C61066Jw4;
import X.C61075JwD;
import X.C61077JwF;
import X.C61079JwH;
import X.C61080JwI;
import X.C61100JxB;
import X.C61770pa;
import X.C66165MGc;
import X.C66296MMf;
import X.DbS;
import X.DbW;
import X.Dba;
import X.JTR;
import X.Jv3;
import X.KO2;
import X.LK1;
import X.LSR;
import X.LSk;
import X.LTP;
import X.MH9;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class TrialUseCase extends LSR {
    public final UserSession A00;
    public final KO2 A01;
    public final LSk A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A03, C66296MMf.A00(this, 30));
    public final C262224Cq A04;
    public final 0V2 A05;
    public final 05G A06;
    public final 05G A07;
    public final C61770pa A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDk, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (X.AnonymousClass7TE.A1a(r1) != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r2 = r11.A05;
        r1 = new X.C61857KOw();
        r4.A02 = r11;
        r4.A01 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (r2.emit(r1, r4) != r3) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        r0 = X.DbS.A0h(r11.A00, X.AnonymousClass0t1.A01).BCS();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r0 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        r1 = r0.booleanValue();
        r5 = 2131955985;
        r0 = 2131955983;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r5 = 2131955986;
        r0 = 2131955984;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r2 = r11.A05;
        r1 = new X.C61858KOx(r5, r0);
        r4.A02 = null;
        r4.A01 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (X.AnonymousClass7TE.A1a(r1) != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
        r4.A02 = r11;
        r4.A03 = r10;
        r4.A01 = 5;
        r1 = X.AnonymousClass10c.A02(r4, com.instagram.trials.impl.TrialsPreferencesImpl.A00((com.instagram.trials.impl.TrialsPreferencesImpl) X.AnonymousClass7TE.A14(r11.A03)).BI4("trial_settings_auto_show_count", 0));
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        if (r1 != r3) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        r2 = X.AnonymousClass7TE.A0M(r1);
        r4.A02 = r11;
        r4.A03 = r10;
        r4.A00 = r2;
        r4.A01 = 6;
        r1 = ((com.instagram.trials.impl.TrialsPreferencesImpl) X.AnonymousClass7TE.A14(r11.A03)).A01(r4);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011c, code lost:
        if (r1 != r3) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        if (r2 >= 3) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        if (X.0qQ.A0K(r11.A06().A0N, r1) != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        r2 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013c, code lost:
        if (r10 == com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r1 = new X.C61855KOu(r5);
        r4.A02 = null;
        r4.A03 = null;
        r4.A01 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        if (r2.emit(r1, r4) != r3) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.api.schemas.MediaTrialGraduationStrategy r10, com.instagram.creation.sharesheet.update.trial.TrialUseCase r11, X.AnonymousClass4D7 r12) {
        /*
            r8 = 1
            boolean r0 = X.C66132MDk.A01(r8, r12)
            if (r0 == 0) goto L_0x0026
            r4 = r12
            X.MDk r4 = (X.C66132MDk) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A01
            r7 = 3
            r6 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x005c;
                case 2: goto L_0x007c;
                case 3: goto L_0x0152;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00fa;
                case 6: goto L_0x011f;
                case 7: goto L_0x0152;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0026:
            X.MDk r4 = new X.MDk
            r4.<init>(r11, r12, r8)
            goto L_0x0015
        L_0x002c:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r9 = r11.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325235662598912(0x810d9c000d3300, double:3.035563530786564E-306)
            boolean r2 = X.182.A06(r2, r9, r0)
            X.0eM r0 = r11.A03
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r1 = (com.instagram.trials.impl.TrialsPreferencesImpl) r1
            r4.A02 = r11
            if (r2 != 0) goto L_0x00b0
            r4.A01 = r8
            X.3Fv r2 = com.instagram.trials.impl.TrialsPreferencesImpl.A00(r1)
            java.lang.String r1 = "trial_auto_graduate_default_on_dialog_shown"
            r0 = 0
            X.0r6 r0 = r2.Agv(r1, r0)
            java.lang.Object r1 = X.AnonymousClass10c.A02(r4, r0)
            if (r1 != r3) goto L_0x0063
            return r3
        L_0x005c:
            java.lang.Object r11 = r4.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r11 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r11
            X.0eS.A00(r1)
        L_0x0063:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 != 0) goto L_0x0155
            X.0V2 r2 = r11.A05
            X.KOw r1 = new X.KOw
            r1.<init>()
            r4.A02 = r11
            r0 = 2
            r4.A01 = r0
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L_0x0083
            return r3
        L_0x007c:
            java.lang.Object r11 = r4.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r11 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r11
            X.0eS.A00(r1)
        L_0x0083:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r11.A00
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            java.lang.Boolean r0 = r0.BCS()
            if (r0 == 0) goto L_0x009d
            boolean r1 = r0.booleanValue()
            r5 = 2131955985(0x7f131111, float:1.9548513E38)
            r0 = 2131955983(0x7f13110f, float:1.9548509E38)
            if (r1 != 0) goto L_0x00a3
        L_0x009d:
            r5 = 2131955986(0x7f131112, float:1.9548515E38)
            r0 = 2131955984(0x7f131110, float:1.954851E38)
        L_0x00a3:
            X.0V2 r2 = r11.A05
            X.KOx r1 = new X.KOx
            r1.<init>(r5, r0)
            r4.A02 = r6
            r4.A01 = r7
            goto L_0x014b
        L_0x00b0:
            r4.A03 = r10
            r0 = 4
            r4.A01 = r0
            X.3Fv r1 = com.instagram.trials.impl.TrialsPreferencesImpl.A00(r1)
            r0 = 384(0x180, float:5.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0r6 r0 = r1.AJX(r0)
            java.lang.Object r1 = X.AnonymousClass10c.A02(r4, r0)
            if (r1 != r3) goto L_0x00d3
            return r3
        L_0x00ca:
            java.lang.Object r10 = r4.A03
            java.lang.Object r11 = r4.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r11 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r11
            X.0eS.A00(r1)
        L_0x00d3:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 != 0) goto L_0x0155
            X.0eM r0 = r11.A03
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r1 = (com.instagram.trials.impl.TrialsPreferencesImpl) r1
            r4.A02 = r11
            r4.A03 = r10
            r0 = 5
            r4.A01 = r0
            X.3Fv r2 = com.instagram.trials.impl.TrialsPreferencesImpl.A00(r1)
            java.lang.String r1 = "trial_settings_auto_show_count"
            r0 = 0
            X.0r6 r0 = r2.BI4(r1, r0)
            java.lang.Object r1 = X.AnonymousClass10c.A02(r4, r0)
            if (r1 != r3) goto L_0x0103
            return r3
        L_0x00fa:
            java.lang.Object r10 = r4.A03
            java.lang.Object r11 = r4.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r11 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r11
            X.0eS.A00(r1)
        L_0x0103:
            int r2 = X.AnonymousClass7TE.A0M(r1)
            X.0eM r0 = r11.A03
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r1 = (com.instagram.trials.impl.TrialsPreferencesImpl) r1
            r4.A02 = r11
            r4.A03 = r10
            r4.A00 = r2
            r0 = 6
            r4.A01 = r0
            java.lang.Object r1 = r1.A01(r4)
            if (r1 != r3) goto L_0x012a
            return r3
        L_0x011f:
            int r2 = r4.A00
            java.lang.Object r10 = r4.A03
            java.lang.Object r11 = r4.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r11 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r11
            X.0eS.A00(r1)
        L_0x012a:
            if (r2 >= r7) goto L_0x0155
            X.JwD r0 = r11.A06()
            java.lang.String r0 = r0.A0N
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0155
            X.0V2 r2 = r11.A05
            com.instagram.api.schemas.MediaTrialGraduationStrategy r0 = com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE
            if (r10 == r0) goto L_0x013f
            r5 = 0
        L_0x013f:
            X.KOu r1 = new X.KOu
            r1.<init>(r5)
            r4.A02 = r6
            r4.A03 = r6
            r0 = 7
            r4.A01 = r0
        L_0x014b:
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L_0x0155
            return r3
        L_0x0152:
            X.0eS.A00(r1)
        L_0x0155:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase.A00(com.instagram.api.schemas.MediaTrialGraduationStrategy, com.instagram.creation.sharesheet.update.trial.TrialUseCase, X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrialUseCase(AnonymousClass0iw r7, UserSession userSession, KO2 ko2, boolean z, boolean z2) {
        super(ko2);
        AnonymousClass19S A17 = JTR.A17(AnonymousClass12T.A00, 1375895555);
        DbW.A1O(userSession, 2, A17);
        this.A01 = ko2;
        this.A00 = userSession;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = A17;
        02z A10 = DbS.A10(new C59732JVq(7, 4, false, false));
        this.A07 = A10;
        this.A09 = A10;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A05 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
        this.A02 = LK1.A01(r7, userSession, A06().A0N);
        this.A06 = C51970G9q.A10(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (X.C61075JwD.A0M(r6) == X.AnonymousClass3QO.DEFAULT) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r0.A00 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (X.AnonymousClass7TE.A1b(r0) != true) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (A06().A0k == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(boolean r19) {
        /*
            r18 = this;
            r6 = r18
            com.instagram.common.session.UserSession r2 = r6.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342168244875571958(0x20810d9c000232f6, double:4.070025277381197E-152)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0096
            X.JwD r0 = r6.A06()
            X.JwI r0 = r0.A01
            r12 = 0
            if (r0 != 0) goto L_0x0145
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x002a
            r1 = 1653980217(0x6295bc39, float:1.3810639E21)
            java.lang.String r0 = "TrialUseCase.checkForConflictWithOverrideWithOtherRows"
            X.0fS.A01(r0, r1)
        L_0x002a:
            X.3QO r0 = X.C61075JwD.A0M(r6)     // Catch:{ all -> 0x0166 }
            r7 = 1
            if (r0 == 0) goto L_0x003a
            X.3QO r1 = X.C61075JwD.A0M(r6)     // Catch:{ all -> 0x0166 }
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT     // Catch:{ all -> 0x0166 }
            r10 = 1
            if (r1 != r0) goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x0166 }
            X.JxB r0 = r0.A08     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0048
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x0166 }
            r9 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r9 = 0
        L_0x0049:
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x0166 }
            java.util.List r0 = r0.A0V     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0058
            boolean r0 = X.AnonymousClass7TE.A1b(r0)     // Catch:{ all -> 0x0166 }
            r11 = 1
            if (r0 == r7) goto L_0x0059
        L_0x0058:
            r11 = 0
        L_0x0059:
            boolean r1 = r6.A0B     // Catch:{ all -> 0x0166 }
            boolean r0 = r6.A0A     // Catch:{ all -> 0x0166 }
            boolean r0 = X.C63215KtM.A00(r2, r1, r0)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x006c
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.A0k     // Catch:{ all -> 0x0166 }
            r8 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            if (r10 != 0) goto L_0x0075
            if (r9 != 0) goto L_0x0075
            if (r11 != 0) goto L_0x0075
            if (r8 == 0) goto L_0x0129
        L_0x0075:
            r16 = 2131955997(0x7f13111d, float:1.9548537E38)
            r17 = 2131956004(0x7f131124, float:1.9548551E38)
            r0 = 2131956005(0x7f131125, float:1.9548553E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0166 }
            X.MJH r5 = new X.MJH     // Catch:{ all -> 0x0166 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0166 }
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0166 }
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x0166 }
            r15 = r5
            r12.<init>((java.lang.Integer) r13, (java.lang.Integer) r14, (X.C62320sa) r15, (int) r16, (int) r17)     // Catch:{ all -> 0x0166 }
            goto L_0x0129
        L_0x0096:
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x00a6
            r1 = -1930893183(0xffffffff8ce8e881, float:-3.5885193E-31)
            java.lang.String r0 = "TrialUseCase.checkForConflictWithOtherRows"
            X.0fS.A01(r0, r1)
        L_0x00a6:
            X.3QO r1 = X.C61075JwD.A0M(r6)     // Catch:{ all -> 0x015b }
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB     // Catch:{ all -> 0x015b }
            r12 = 0
            if (r1 != r0) goto L_0x00bb
            r1 = 2131955996(0x7f13111c, float:1.9548535E38)
            r0 = 2131956002(0x7f131122, float:1.9548547E38)
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x015b }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00bb:
            X.3QO r1 = X.C61075JwD.A0M(r6)     // Catch:{ all -> 0x015b }
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS     // Catch:{ all -> 0x015b }
            if (r1 != r0) goto L_0x00cf
            r1 = 2131955996(0x7f13111c, float:1.9548535E38)
            r0 = 2131955999(0x7f13111f, float:1.9548541E38)
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x015b }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00cf:
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x015b }
            java.util.List r0 = r0.A0V     // Catch:{ all -> 0x015b }
            r1 = 1
            if (r0 == 0) goto L_0x00ea
            boolean r0 = X.AnonymousClass7TE.A1b(r0)     // Catch:{ all -> 0x015b }
            if (r0 != r1) goto L_0x00ea
            r1 = 2131955996(0x7f13111c, float:1.9548535E38)
            r0 = 2131956000(0x7f131120, float:1.9548543E38)
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x015b }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00ea:
            boolean r1 = r6.A0B     // Catch:{ all -> 0x015b }
            boolean r0 = r6.A0A     // Catch:{ all -> 0x015b }
            boolean r0 = X.C63215KtM.A00(r2, r1, r0)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0108
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x015b }
            boolean r0 = r0.A0k     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0108
            r1 = 2131955996(0x7f13111c, float:1.9548535E38)
            r0 = 2131956001(0x7f131121, float:1.9548545E38)
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x015b }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x0108:
            X.JwD r0 = r6.A06()     // Catch:{ all -> 0x015b }
            X.JxB r0 = r0.A08     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x011f
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x011f
            r1 = 2131955996(0x7f13111c, float:1.9548535E38)
            r0 = 2131956003(0x7f131123, float:1.954855E38)
            X.GAX r12 = new X.GAX     // Catch:{ all -> 0x015b }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x015b }
        L_0x011f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0135
            r0 = 34570146(0x20f7fa2, float:1.054261E-37)
            goto L_0x0132
        L_0x0129:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0135
            r0 = -1665491418(0xffffffff9cba9e26, float:-1.2349328E-21)
        L_0x0132:
            X.0fS.A00(r0)
        L_0x0135:
            if (r12 == 0) goto L_0x0145
            X.4Cq r3 = r6.A04
            r2 = 0
            r1 = 40
            X.MGc r0 = new X.MGc
            r0.<init>(r6, r12, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x0145:
            X.LSk r3 = r6.A02
            r4 = r19
            if (r19 == 0) goto L_0x0158
            java.lang.String r2 = "opt_in_trial"
        L_0x014d:
            java.lang.String r1 = "user"
            java.lang.String r0 = "share_sheet"
            X.LSk.A03(r3, r1, r0, r2)
            r6.A0C(r4)
            return
        L_0x0158:
            java.lang.String r2 = "opt_out_trial"
            goto L_0x014d
        L_0x015b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0173
            r0 = -1358772207(0xffffffffaf02c811, float:-1.1894509E-10)
            goto L_0x0170
        L_0x0166:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0173
            r0 = -104401306(0xfffffffff9c6f666, float:-1.2913404E35)
        L_0x0170:
            X.0fS.A00(r0)
        L_0x0173:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase.A0A(boolean):void");
    }

    public final void A0B(boolean z) {
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy;
        if (Systrace.A0E(1)) {
            0fS.A01("TrialUseCase.setAutoGraduationEnabled", -44755192);
        }
        try {
            C61080JwI jwI = null;
            Dba.A1S(this, this.A04, 22, z);
            if (((C59732JVq) this.A07.getValue()).A01) {
                if (z) {
                    mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.SS_PERFORMANCE;
                } else {
                    mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.MANUAL;
                }
                jwI = new C61080JwI(mediaTrialGraduationStrategy);
            }
            A09(C61075JwD.A00((AnonymousClass9J6) null, jwI, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1073741825, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1424524979);
            }
        }
    }

    public final void A0C(boolean z) {
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy;
        C61080JwI jwI;
        Object value;
        C59732JVq jVq;
        Object value2;
        C59732JVq jVq2;
        if (Systrace.A0E(1)) {
            0fS.A01("TrialUseCase.setEnabled", -956417850);
        }
        try {
            05G r7 = this.A07;
            if (((C59732JVq) r7.getValue()).A00) {
                mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.SS_PERFORMANCE;
            } else {
                mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.MANUAL;
            }
            if (z) {
                jwI = new C61080JwI(mediaTrialGraduationStrategy);
            } else {
                jwI = null;
            }
            A09(C61075JwD.A00((AnonymousClass9J6) null, jwI, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1073741825, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            UserSession userSession = this.A00;
            if (LTP.A03(userSession) || !182.A06(0Tu.A05, userSession, 2342168244875834105L)) {
                do {
                    value = r7.getValue();
                    jVq = (C59732JVq) value;
                } while (!r7.AIY(value, new C59732JVq(z, jVq.A02, jVq.A00, 4)));
            } else {
                do {
                    value2 = r7.getValue();
                    jVq2 = (C59732JVq) value2;
                } while (!r7.AIY(value2, new C59732JVq(z, jVq2.A02, jVq2.A00, 4)));
                MH9.A04(this, this.A04, 43);
            }
            if (z) {
                AnonymousClass7TE.A1Z(new C66165MGc(this, mediaTrialGraduationStrategy, (AnonymousClass4D7) null, 38), this.A04);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1732808992);
            }
        }
    }
}
