package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class MH9 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    public static 19B A01(Object obj, C262224Cq r3, int i) {
        MH9 mh9 = new MH9(obj, (AnonymousClass4D7) null, i);
        19B r0 = 19B.A00;
        1Eo.A05(r0, mh9, r3);
        return r0;
    }

    public static MGX A02(Object obj, MH9 mh9, int i) {
        MGX mgx = new MGX(obj, (AnonymousClass4D7) null, i);
        mh9.A00 = 1;
        return mgx;
    }

    public static void A03(Object obj, C262094Cc r3, C262224Cq r4, int i) {
        1Eo.A05(r3, new MH9(obj, (AnonymousClass4D7) null, i), r4);
    }

    public static void A04(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MH9(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH9(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MH9, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case Seq.NULL_REFNUM:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            case 46:
                i = 46;
                break;
            case 47:
                i = 47;
                break;
            case 48:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new MH9(obj2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MH9, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0295, code lost:
        r1.E5S(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029c, code lost:
        if (r1.ABn(r5) == r2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029e, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06d1, code lost:
        r5.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06d3, code lost:
        r0 = r0.emit(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x079d, code lost:
        r0 = X.AnonymousClass11O.A00(r5, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07a1, code lost:
        if (r0 != r2) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07a3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07a4, code lost:
        X.0eS.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r5 = r27
            r1 = r28
            int r0 = r5.A01
            X.1Hj r2 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x0779;
                case 1: goto L_0x074b;
                case 2: goto L_0x071d;
                case 3: goto L_0x06fb;
                case 4: goto L_0x06d9;
                case 5: goto L_0x06bb;
                case 6: goto L_0x069d;
                case 7: goto L_0x067f;
                case 8: goto L_0x0640;
                case 9: goto L_0x04ff;
                case 10: goto L_0x0495;
                case 11: goto L_0x0477;
                case 12: goto L_0x0459;
                case 13: goto L_0x043b;
                case 14: goto L_0x0417;
                case 15: goto L_0x03f9;
                case 16: goto L_0x03db;
                case 17: goto L_0x03bd;
                case 18: goto L_0x039f;
                case 19: goto L_0x0381;
                case 20: goto L_0x0363;
                case 21: goto L_0x0345;
                case 22: goto L_0x0327;
                case 23: goto L_0x0307;
                case 24: goto L_0x02e5;
                case 25: goto L_0x02c3;
                case 26: goto L_0x02a2;
                case 27: goto L_0x0271;
                case 28: goto L_0x0244;
                case 29: goto L_0x0217;
                case 30: goto L_0x01ff;
                case 31: goto L_0x01e7;
                case 32: goto L_0x01cf;
                case 33: goto L_0x01cf;
                case 34: goto L_0x01b7;
                case 35: goto L_0x000b;
                case 36: goto L_0x000b;
                case 37: goto L_0x000b;
                case 38: goto L_0x000b;
                case 39: goto L_0x019f;
                case 40: goto L_0x019f;
                case 41: goto L_0x0123;
                case 42: goto L_0x00fd;
                case 43: goto L_0x00e5;
                case 44: goto L_0x00c9;
                case 45: goto L_0x00ab;
                case 46: goto L_0x008a;
                case 47: goto L_0x0069;
                case 48: goto L_0x0048;
                case 49: goto L_0x0023;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            java.lang.Object r0 = A00(r1, r5)
            X.KOf r0 = (X.C61841KOf) r0
            X.0V2 r0 = r0.A0G
            X.KOr r1 = X.C61852KOr.A00
            goto L_0x06d1
        L_0x0023:
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r7) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            java.lang.Object r6 = A00(r1, r5)
            X.Jh6 r6 = (X.C60187Jh6) r6
            com.instagram.share.facebook.upsell.data.CLNoticeRepository r0 = r6.A03
            X.0Ud r4 = r0.A06
            r3 = 0
            r1 = 3
            X.MGY r0 = new X.MGY
            r0.<init>(r6, r3, r1)
            r5.A00 = r7
            java.lang.Object r0 = X.AnonymousClass11O.A00(r5, r0, r4)
            goto L_0x07a1
        L_0x0048:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0054:
            java.lang.Object r3 = A00(r1, r5)
            X.Jgj r3 = (X.C60164Jgj) r3
            X.7wl r0 = r3.A00
            X.0Ud r6 = r0.A02
            r1 = 0
            r0 = 2
            X.MGY r7 = new X.MGY
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x0069:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0075:
            java.lang.Object r3 = A00(r1, r5)
            X.Jik r3 = (X.C60288Jik) r3
            X.8jd r0 = r3.A01
            X.0Ud r6 = r0.A07
            r1 = 0
            r0 = 2
            X.MG1 r7 = new X.MG1
            r7.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r1, (int) r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x008a:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0096
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0096:
            java.lang.Object r3 = A00(r1, r5)
            X.KOn r3 = (X.C61848KOn) r3
            X.89T r0 = r3.A04
            X.0Ud r6 = r0.A09
            r1 = 0
            r0 = 0
            X.MGY r7 = new X.MGY
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x00ab:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x00b7
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b7:
            java.lang.Object r1 = A00(r1, r5)
            X.KOn r1 = (X.C61848KOn) r1
            X.89T r0 = r1.A04
            X.0Ud r6 = r0.A08
            r0 = 49
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x00c9:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x00d5
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d5:
            java.lang.Object r1 = A00(r1, r5)
            X.KOn r1 = (X.C61848KOn) r1
            X.05G r6 = r1.A05
            r0 = 48
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x00e5:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x00f1
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f1:
            java.lang.Object r0 = A00(r1, r5)
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r0
            X.0V2 r0 = r0.A05
            X.KOy r1 = X.C61859KOy.A00
            goto L_0x06d1
        L_0x00fd:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0109
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0109:
            java.lang.Object r0 = A00(r1, r5)
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = (com.instagram.trials.impl.TrialsPreferencesImpl) r0
            r5.A00 = r3
            X.0eM r0 = r0.A01
            X.4Dd r1 = X.JTR.A0r(r0)
            java.lang.String r0 = "trial_auto_graduate_default_on_dialog_shown"
            goto L_0x0295
        L_0x0123:
            int r0 = r5.A00
            r6 = 2
            r4 = 3
            r9 = 1
            if (r0 == 0) goto L_0x013d
            if (r0 == r9) goto L_0x0174
            if (r0 != r6) goto L_0x07a4
            X.0eS.A00(r1)
        L_0x0131:
            java.lang.Object r0 = r5.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r0
            X.0V2 r0 = r0.A05
            X.KP0 r1 = X.KP0.A00
            r5.A00 = r4
            goto L_0x06d3
        L_0x013d:
            java.lang.Object r8 = A00(r1, r5)
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r8 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r8
            com.instagram.common.session.UserSession r7 = r8.A00
            boolean r0 = X.LTP.A03(r7)
            if (r0 != 0) goto L_0x07a7
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342168244875834105(0x20810d9c000632f9, double:4.0700252776034755E-152)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x07a7
            X.0eM r0 = r8.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = (com.instagram.trials.impl.TrialsPreferencesImpl) r0
            r5.A00 = r9
            X.3Fv r3 = com.instagram.trials.impl.TrialsPreferencesImpl.A00(r0)
            java.lang.String r1 = "trials_creation_new_badge_impression_count"
            r0 = 0
            X.0r6 r0 = r3.BI4(r1, r0)
            java.lang.Object r1 = X.AnonymousClass10c.A02(r5, r0)
            if (r1 != r2) goto L_0x0177
            return r2
        L_0x0174:
            X.0eS.A00(r1)
        L_0x0177:
            int r1 = X.AnonymousClass7TE.A0M(r1)
            if (r1 >= r4) goto L_0x07a7
            java.lang.Object r0 = r5.A02
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = (com.instagram.trials.impl.TrialsPreferencesImpl) r0
            int r3 = r1 + 1
            r5.A00 = r6
            X.0eM r0 = r0.A01
            X.4Dd r1 = X.JTR.A0r(r0)
            java.lang.String r0 = "trials_creation_new_badge_impression_count"
            r1.E5Y(r0, r3)
            java.lang.Object r0 = r1.ABn(r5)
            if (r0 != r2) goto L_0x0131
            return r2
        L_0x019f:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x01ab
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ab:
            java.lang.Object r0 = A00(r1, r5)
            X.KOf r0 = (X.C61841KOf) r0
            X.0V2 r0 = r0.A0G
            X.KOs r1 = X.C61853KOs.A00
            goto L_0x06d1
        L_0x01b7:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x01c3
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01c3:
            java.lang.Object r0 = A00(r1, r5)
            X.KOf r0 = (X.C61841KOf) r0
            X.0V2 r0 = r0.A0G
            X.KOq r1 = X.C61851KOq.A00
            goto L_0x06d1
        L_0x01cf:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x01db
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01db:
            java.lang.Object r0 = A00(r1, r5)
            X.KOc r0 = (X.C61838KOc) r0
            X.0V2 r0 = r0.A05
            X.KO1 r1 = X.KO1.A00
            goto L_0x06d1
        L_0x01e7:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x01f3
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01f3:
            java.lang.Object r0 = A00(r1, r5)
            X.KOc r0 = (X.C61838KOc) r0
            X.0V2 r0 = r0.A05
            X.KO0 r1 = X.KO0.A00
            goto L_0x06d1
        L_0x01ff:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x020b
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x020b:
            java.lang.Object r0 = A00(r1, r5)
            X.KOQ r0 = (X.KOQ) r0
            X.0V2 r0 = r0.A04
            X.KNz r1 = X.C61835KNz.A00
            goto L_0x06d1
        L_0x0217:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0223
            if (r0 == r4) goto L_0x023c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0223:
            java.lang.Object r3 = A00(r1, r5)
            X.KNs r3 = (X.C61829KNs) r3
            X.KO2 r0 = r3.A0N
            X.0Ud r1 = r0.A05
            r0 = 44
            X.MCi r0 = X.MCi.A00(r3, r0)
            r5.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r5)
            if (r0 != r2) goto L_0x023f
            return r2
        L_0x023c:
            X.0eS.A00(r1)
        L_0x023f:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0244:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0250
            if (r0 == r4) goto L_0x0269
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0250:
            java.lang.Object r3 = A00(r1, r5)
            X.KNs r3 = (X.C61829KNs) r3
            X.JgD r0 = r3.A04
            X.0Ud r1 = r0.A02
            r0 = 43
            X.MCi r0 = X.MCi.A00(r3, r0)
            r5.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r5)
            if (r0 != r2) goto L_0x026c
            return r2
        L_0x0269:
            X.0eS.A00(r1)
        L_0x026c:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0271:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x027d
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x027d:
            java.lang.Object r0 = A00(r1, r5)
            X.K4F r0 = (X.K4F) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = (com.instagram.trials.impl.TrialsPreferencesImpl) r0
            r5.A00 = r3
            X.0eM r0 = r0.A01
            X.4Dd r1 = X.JTR.A0r(r0)
            java.lang.String r0 = "trial_creation_nux_shown"
        L_0x0295:
            r1.E5S(r0, r3)
            java.lang.Object r0 = r1.ABn(r5)
            if (r0 == r2) goto L_0x07a9
            X.0gF r0 = X.C60340gF.A00
            goto L_0x07a1
        L_0x02a2:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x02ae
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02ae:
            java.lang.Object r3 = A00(r1, r5)
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r6 = r0.A06
            r1 = 0
            r0 = 0
            X.MFz r7 = new X.MFz
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x02c3:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x02cf
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02cf:
            java.lang.Object r3 = A00(r1, r5)
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r6 = r0.A04
            r1 = 0
            r0 = 49
            X.MG0 r7 = new X.MG0
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x02e5:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x02f1
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02f1:
            java.lang.Object r3 = A00(r1, r5)
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r6 = r0.A05
            r1 = 0
            r0 = 48
            X.MG0 r7 = new X.MG0
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x0307:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0313
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0313:
            java.lang.Object r1 = A00(r1, r5)
            X.Loq r1 = (X.C65187Loq) r1
            X.KOn r0 = r1.A02
            X.0Ud r6 = r0.A07
            r0 = 2
            X.MID r7 = new X.MID
            r7.<init>(r1, r0)
            r5.A00 = r3
            goto L_0x079d
        L_0x0327:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0333
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0333:
            java.lang.Object r1 = A00(r1, r5)
            X.LpU r1 = (X.C65224LpU) r1
            X.KOn r0 = r1.A05
            X.0Ud r6 = r0.A06
            r0 = 45
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0345:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0351
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0351:
            java.lang.Object r1 = A00(r1, r5)
            X.LpU r1 = (X.C65224LpU) r1
            X.KOn r0 = r1.A05
            X.0Ud r6 = r0.A08
            r0 = 44
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0363:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x036f
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x036f:
            java.lang.Object r1 = A00(r1, r5)
            X.Lp3 r1 = (X.C65199Lp3) r1
            X.KOn r0 = r1.A04
            X.0Ud r6 = r0.A06
            r0 = 42
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0381:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x038d
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x038d:
            java.lang.Object r1 = A00(r1, r5)
            X.Lp3 r1 = (X.C65199Lp3) r1
            X.KOn r0 = r1.A04
            X.0Ud r6 = r0.A08
            r0 = 41
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x039f:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x03ab
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03ab:
            java.lang.Object r1 = A00(r1, r5)
            X.LpH r1 = (X.C65211LpH) r1
            X.KOn r0 = r1.A05
            X.0Ud r6 = r0.A06
            r0 = 39
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x03bd:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x03c9
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03c9:
            java.lang.Object r1 = A00(r1, r5)
            X.LpH r1 = (X.C65211LpH) r1
            X.KOn r0 = r1.A05
            X.0Ud r6 = r0.A08
            r0 = 38
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x03db:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x03e7
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03e7:
            java.lang.Object r1 = A00(r1, r5)
            X.Lp2 r1 = (X.C65198Lp2) r1
            X.KOn r0 = r1.A04
            X.0Ud r6 = r0.A06
            r0 = 36
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x03f9:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0405
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0405:
            java.lang.Object r1 = A00(r1, r5)
            X.Lp2 r1 = (X.C65198Lp2) r1
            X.KOn r0 = r1.A04
            X.0Ud r6 = r0.A08
            r0 = 35
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0417:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0423
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0423:
            java.lang.Object r3 = A00(r1, r5)
            X.LpL r3 = (X.C65215LpL) r3
            X.KOU r0 = r3.A04
            X.0r6 r1 = r0.A02
            r0 = 27
            X.MCi r0 = X.MCi.A00(r3, r0)
            r5.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r5)
            goto L_0x07a1
        L_0x043b:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0447
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0447:
            java.lang.Object r1 = A00(r1, r5)
            X.LpL r1 = (X.C65215LpL) r1
            X.KOi r0 = r1.A05
            X.0Ud r6 = r0.A0A
            r0 = 33
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0459:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0465
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0465:
            java.lang.Object r1 = A00(r1, r5)
            X.KNu r1 = (X.C61831KNu) r1
            X.KOn r0 = r1.A02
            X.0Ud r6 = r0.A06
            r0 = 30
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0477:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x0483
            if (r3 == r0) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0483:
            java.lang.Object r1 = A00(r1, r5)
            X.KNu r1 = (X.C61831KNu) r1
            X.KOn r0 = r1.A02
            X.0Ud r6 = r0.A08
            r0 = 29
            X.MGX r7 = A02(r1, r5, r0)
            goto L_0x079d
        L_0x0495:
            int r3 = r5.A00
            r0 = 1
            if (r3 == 0) goto L_0x04a0
            if (r3 != r0) goto L_0x04fa
            X.0eS.A00(r1)
        L_0x049f:
            return r1
        L_0x04a0:
            java.lang.Object r3 = A00(r1, r5)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r5.A00 = r0
            X.1IW r4 = X.JTS.A0s(r5)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "user_id"
            r6.A04(r0, r1)
            java.lang.String r1 = "clips_creation_composer"
            java.lang.String r0 = "personalizedHashtagSurface"
            r6.A04(r0, r1)
            java.lang.String r1 = "recently_used"
            java.lang.String r0 = "personalizedHashtagType"
            X.1vR r7 = X.DbU.A0J(r6, r0, r1)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.9ev> r11 = X.C383039ev.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGHashtagSuggestionsQuery"
            r12 = 0
            java.lang.String r16 = "xdt_users__info"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r3 = X.1vm.A01(r3)
            r1 = 18
            X.KAf r0 = new X.KAf
            r0.<init>(r4, r1)
            r3.A06(r6, r0)
            java.lang.Object r1 = r4.A0E()
            if (r1 != r2) goto L_0x049f
            return r2
        L_0x04fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04ff:
            int r0 = r5.A00
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L_0x050e
            if (r0 == r9) goto L_0x053b
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x050e:
            java.lang.Object r0 = A00(r1, r5)
            X.KNj r0 = (X.C61820KNj) r0
            X.L0y r0 = r0.A00
            r5.A00 = r9
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r3 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "clips/clips_info_for_creation/"
            r3.A0A(r0)
            java.lang.String r1 = "m_pk"
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<X.K1L> r1 = X.K1L.class
            java.lang.Class<X.LHl> r0 = X.C63993LHl.class
            X.1OC r1 = X.DbU.A0S(r3, r1, r0)
            r0 = 147916580(0x8d10724, float:1.2580409E-33)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r2) goto L_0x053e
            return r2
        L_0x053b:
            X.0eS.A00(r1)
        L_0x053e:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r6 = r5.A02
            X.JiX r6 = (X.C60276JiX) r6
            boolean r0 = r1 instanceof X.C239793Ih
            r7 = 0
            if (r0 == 0) goto L_0x05b6
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r10 = r1.A00
            X.K1L r10 = (X.K1L) r10
            X.05G r0 = r6.A06
            r26 = r0
        L_0x0553:
            java.lang.Object r11 = r26.getValue()
            r1 = 0
            r0 = 15
            X.JwC r8 = new X.JwC
            r8.<init>((java.lang.Integer) r1, (java.lang.Integer) r1, (java.lang.Integer) r1, (int) r0)
            X.L7h r0 = r10.A00
            if (r0 == 0) goto L_0x05b4
            java.util.List r0 = r0.A02
        L_0x0565:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x05bf
            java.util.Iterator r17 = r0.iterator()
        L_0x056f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x05bf
            java.lang.Object r13 = r17.next()
            com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal r13 = (com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal) r13
            long r0 = r13.A00
            java.lang.String r12 = r13.A01
            java.lang.String r15 = ""
            if (r12 != 0) goto L_0x0584
            r12 = r15
        L_0x0584:
            X.GKw r14 = new X.GKw
            r14.<init>(r12)
            java.lang.String r12 = r13.A02
            if (r12 == 0) goto L_0x058e
            r15 = r12
        L_0x058e:
            X.GKw r13 = new X.GKw
            r13.<init>(r15)
            X.0Ud r12 = r6.A07
            long r15 = X.JTT.A0A(r12)
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r23 = X.AnonymousClass7TF.A1Q(r12)
            X.JvG r12 = new X.JvG
            r24 = r9
            r25 = r7
            r19 = r14
            r20 = r13
            r21 = r0
            r18 = r12
            r18.<init>(r19, r20, r21, r23, r24, r25)
            r3.add(r12)
            goto L_0x056f
        L_0x05b4:
            r0 = 0
            goto L_0x0565
        L_0x05b6:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x05f5
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x05bf:
            X.JvG r12 = X.C60276JiX.A0B
            r3.add(r12)
            X.0Ud r0 = r6.A07
            long r15 = X.JTT.A0A(r0)
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r12.A00 = r0
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0626
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0626
        L_0x05de:
            r12.A00 = r9
            X.05G r1 = r6.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r1.Epw(r0)
        L_0x05e9:
            r0 = r26
            boolean r0 = X.JV5.A02(r8, r11, r3, r0, r7)
            if (r0 == 0) goto L_0x0553
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x05f5:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x07a7
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x063b
            X.05G r9 = r6.A06
        L_0x05ff:
            java.lang.Object r8 = r9.getValue()
            r3 = 0
            r0 = 15
            X.JwC r1 = new X.JwC
            r1.<init>((java.lang.Integer) r3, (java.lang.Integer) r3, (java.lang.Integer) r3, (int) r0)
            X.0sn r0 = X.0sn.A00
            boolean r0 = X.JV5.A02(r1, r8, r0, r9, r7)
            if (r0 == 0) goto L_0x05ff
            java.lang.String r1 = "ContentFundingDealsSelectorViewModel"
            java.lang.String r0 = "Failed to update Share-to-Facebook Settings"
            X.0wb.A03(r1, r0)
            X.3ju r1 = r6.A01
            X.KNi r0 = X.C61819KNi.A00
            r5.A00 = r4
            java.lang.Object r0 = r1.ELH(r0, r5)
            goto L_0x07a1
        L_0x0626:
            java.util.Iterator r1 = r3.iterator()
        L_0x062a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05de
            java.lang.Object r0 = r1.next()
            X.JvG r0 = (X.C61016JvG) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x062a
            goto L_0x05e9
        L_0x063b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0640:
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x064c
            if (r0 == r6) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x064c:
            java.lang.Object r7 = A00(r1, r5)
            X.KNk r7 = (X.C61821KNk) r7
            X.L0x r0 = r7.A01
            java.lang.String r4 = r7.A06
            java.lang.Integer r3 = r7.A05
            com.instagram.incentiveplatform.api.IncentivePlatformApi r0 = r0.A00
            if (r4 != 0) goto L_0x067c
            com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint r1 = com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint.A0m
        L_0x065e:
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r0 = X.DbU.A0M(r0)
            X.1OC r1 = X.C63009Kpz.A00(r0, r1, r3, r4)
            r0 = 193824558(0xb8d872e, float:5.451462E-32)
            X.032 r1 = r1.A03(r0)
            r0 = 0
            X.MCi r0 = X.MCi.A00(r7, r0)
            r5.A00 = r6
            java.lang.Object r0 = r1.collect(r0, r5)
            goto L_0x07a1
        L_0x067c:
            com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint r1 = com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint.A0n
            goto L_0x065e
        L_0x067f:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x068b
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x068b:
            X.0eS.A00(r1)
            com.instagram.share.facebook.api.ReelsXARApiUtil r3 = com.instagram.share.facebook.api.ReelsXARApiUtil.A00
            java.lang.Object r1 = r5.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            r5.A00 = r4
            java.lang.Object r0 = r3.A02(r1, r5, r0)
            goto L_0x07a1
        L_0x069d:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x06a9
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06a9:
            java.lang.Object r0 = A00(r1, r5)
            X.JgF r0 = (X.C60134JgF) r0
            X.3ju r1 = r0.A01
            X.KNf r0 = X.C61816KNf.A00
            r5.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r5)
            goto L_0x07a1
        L_0x06bb:
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x06c7
            if (r0 == r3) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c7:
            java.lang.Object r1 = A00(r1, r5)
            X.JiG r1 = (X.C60259JiG) r1
            X.0V2 r0 = r1.A05
            java.util.Map r1 = r1.A03
        L_0x06d1:
            r5.A00 = r3
        L_0x06d3:
            java.lang.Object r0 = r0.emit(r1, r5)
            goto L_0x07a1
        L_0x06d9:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x06e5
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06e5:
            java.lang.Object r3 = A00(r1, r5)
            X.JjG r3 = (X.C60313JjG) r3
            X.7wl r0 = r3.A04
            X.0Ud r6 = r0.A02
            r1 = 0
            r0 = 47
            X.MG0 r7 = new X.MG0
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x06fb:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0707
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0707:
            java.lang.Object r3 = A00(r1, r5)
            X.JjG r3 = (X.C60313JjG) r3
            X.8jd r0 = r3.A03
            X.0Ud r6 = r0.A07
            r1 = 0
            r0 = 46
            X.MG0 r7 = new X.MG0
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
            goto L_0x079d
        L_0x071d:
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x0729
            if (r0 == r6) goto L_0x0743
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0729:
            java.lang.Object r4 = A00(r1, r5)
            X.KNr r4 = (X.C61828KNr) r4
            X.KO3 r0 = r4.A03
            X.0Ud r3 = r0.A06
            r1 = 51
            X.MCe r0 = new X.MCe
            r0.<init>(r4, r1)
            r5.A00 = r6
            java.lang.Object r0 = r3.collect(r0, r5)
            if (r0 != r2) goto L_0x0746
            return r2
        L_0x0743:
            X.0eS.A00(r1)
        L_0x0746:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x074b:
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x0757
            if (r0 == r6) goto L_0x0771
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0757:
            java.lang.Object r4 = A00(r1, r5)
            X.KNr r4 = (X.C61828KNr) r4
            X.Jj3 r0 = r4.A02
            X.0Ud r3 = r0.A08
            r1 = 50
            X.MCe r0 = new X.MCe
            r0.<init>(r4, r1)
            r5.A00 = r6
            java.lang.Object r0 = r3.collect(r0, r5)
            if (r0 != r2) goto L_0x0774
            return r2
        L_0x0771:
            X.0eS.A00(r1)
        L_0x0774:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0779:
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0785
            if (r0 == r4) goto L_0x07a4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0785:
            java.lang.Object r3 = A00(r1, r5)
            X.K66 r3 = (X.K66) r3
            X.KNs r0 = X.K66.A06(r3)
            X.KOn r0 = r0.A0i
            X.0Ud r6 = r0.A06
            r1 = 0
            r0 = 45
            X.MG0 r7 = new X.MG0
            r7.<init>(r3, r1, r0)
            r5.A00 = r4
        L_0x079d:
            java.lang.Object r0 = X.AnonymousClass11O.A00(r5, r7, r6)
        L_0x07a1:
            if (r0 != r2) goto L_0x07a7
            return r2
        L_0x07a4:
            X.0eS.A00(r1)
        L_0x07a7:
            X.0gF r2 = X.C60340gF.A00
        L_0x07a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MH9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MH9 mh9) {
        0eS.A00(obj);
        return mh9.A02;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MH9) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
