package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MG5 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG5(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    public static C60763Jqu A00(TrialMetricsData trialMetricsData, ClipsTrialBottomSheetViewModel clipsTrialBottomSheetViewModel) {
        String str = clipsTrialBottomSheetViewModel.A07;
        return LSk.A00(clipsTrialBottomSheetViewModel.A00, Boolean.valueOf(clipsTrialBottomSheetViewModel.A0D), (Boolean) null, Integer.valueOf(trialMetricsData.A02), Integer.valueOf(trialMetricsData.A01), Integer.valueOf(trialMetricsData.A00), Integer.valueOf(trialMetricsData.A03), AppStateModule.APP_STATE_ACTIVE, str, (List) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MG5, X.4D7] */
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
        return new MG5(obj2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MG5, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        r4 = (X.C239803Ii) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if ((r4 instanceof X.C239793Ih) == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        r6 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02;
        r7 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f3, code lost:
        r0 = r5.A00.emit(new X.C61250Jzi(r4), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (r7 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        r7 = new com.instagram.trials.model.TrialMetricsData(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        X.LSk.A02(A00(r7, r6), r6.A03, com.facebook.common.dextricks.DexOptimization.OPT_KEY_CLIENT, "trial_result", "page_load_success", r6.A06);
        r4 = (X.C44048CTr) ((X.C239793Ih) r4).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if ((r4 instanceof X.CTO) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r9 = r6.A0B;
        r8 = X.DbS.A0Q(new java.lang.Object[0], 2131955991);
        r2 = 2131955989;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (X.JTU.A1U(r6.A01.A00) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r2 = 2131955990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        r9.Epw(new X.C62115KaN(r8, X.JTP.A0Q(r2), r7, ((X.CTO) r4).A00));
        r4 = r6.A02;
        r0.A00 = 2;
        r4 = X.JTR.A0r(r4.A01);
        r4.E5S(X.AnonymousClass000.A00(4129), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ea, code lost:
        if (r4.ABn(r0) != r1) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ec, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0614, code lost:
        r0 = r6.collect(X.MCk.A00(r4, r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f0, code lost:
        r3 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f6, code lost:
        if (r3.A0E != false) goto L_0x0a52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f8, code lost:
        r0.A00 = 3;
        r0 = com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0757, code lost:
        r0 = X.19E.A00(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x075b, code lost:
        if (r0 == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x075d, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0103, code lost:
        if ((r4 instanceof X.CTP) == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0105, code lost:
        r3 = r6.A0B;
        r0 = X.JTU.A1U(r6.A01.A00);
        r1 = r6.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (r0 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
        r0 = 2131955995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0116, code lost:
        if (r1 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        r0 = 2131955993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r3.Epw(new X.C62114KaM(X.JTP.A0Q(r0), ((X.CTP) r4).A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        r0 = 2131955994;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0130, code lost:
        if (r1 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0979, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0132, code lost:
        r0 = 2131955992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09b5, code lost:
        r4 = (X.C239803Ii) r4;
        r3 = r4 instanceof X.C239793Ih;
        r5 = X.AnonymousClass000.A00(4128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09bf, code lost:
        if (r3 == false) goto L_0x0a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09c1, code lost:
        r2 = X.AnonymousClass7TE.A1a(((X.C239793Ih) r4).A00);
        r3 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09cd, code lost:
        if (r2 == false) goto L_0x09dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09cf, code lost:
        r4 = r3.A09;
        r3 = X.C62113KaL.A00;
        r0.A00 = 2;
        r2 = r4.ELH(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09da, code lost:
        if (r2 != r1) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09dd, code lost:
        r4 = X.JTT.A0J();
        r0.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x09ef, code lost:
        if (r3.A09.ELH(new X.C62111KaJ(r4, r5), r0) == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09f1, code lost:
        r2 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x09f7, code lost:
        r4 = ((com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02).A09;
        r3 = X.C62112KaK.A00;
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a03, code lost:
        if ((r4 instanceof X.C297815sO) == false) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a05, code lost:
        r4 = X.JTT.A0J();
        r0.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a1b, code lost:
        if (((com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02).A09.ELH(new X.C62111KaJ(r4, r5), r0) != r1) goto L_0x0a21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0138, code lost:
        if ((r4 instanceof X.C62110KaI) == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a1d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a21, code lost:
        r4 = ((com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02).A09;
        r3 = X.C62112KaK.A00;
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a2a, code lost:
        r0.A00 = r2;
        r0 = r4.ELH(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a30, code lost:
        if (r0 != r1) goto L_0x0a52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a32, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a37, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
        r5 = X.JTT.A0J();
        r0.A00 = 4;
        r0 = r6.A09.ELH(new X.C62111KaJ(r5, "trial_query_insight_failure"), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0152, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        if ((r4 instanceof X.C297815sO) == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0157, code lost:
        r4 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02;
        X.LSk.A02(X.LSk.A00(r4.A00, java.lang.Boolean.valueOf(r4.A0D), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, com.facebook.react.modules.appstate.AppStateModule.APP_STATE_ACTIVE, r4.A07, (java.util.List) null), r4.A03, com.facebook.common.dextricks.DexOptimization.OPT_KEY_CLIENT, "trial_result", "page_load_fail", r4.A06);
        r5 = X.JTT.A0J();
        r0.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0193, code lost:
        if (r4.A09.ELH(new X.C62111KaJ(r5, "trial_query_insight_failure"), r0) != r1) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0195, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0199, code lost:
        r4 = ((com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0.A02).A09;
        r3 = X.C62112KaK.A00;
        r0.A00 = 6;
        r0 = r4.ELH(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ae, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0216, code lost:
        if (r4 != r1) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0218, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r4 = r18
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0910;
                case 1: goto L_0x0910;
                case 2: goto L_0x0a38;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x08f0;
                case 6: goto L_0x08d0;
                case 7: goto L_0x08ab;
                case 8: goto L_0x088b;
                case 9: goto L_0x084c;
                case 10: goto L_0x082c;
                case 11: goto L_0x080c;
                case 12: goto L_0x07f0;
                case 13: goto L_0x07c5;
                case 14: goto L_0x0761;
                case 15: goto L_0x073b;
                case 16: goto L_0x071e;
                case 17: goto L_0x06e5;
                case 18: goto L_0x06ad;
                case 19: goto L_0x068f;
                case 20: goto L_0x0673;
                case 21: goto L_0x0655;
                case 22: goto L_0x061e;
                case 23: goto L_0x05f1;
                case 24: goto L_0x05bc;
                case 25: goto L_0x059c;
                case 26: goto L_0x056c;
                case 27: goto L_0x0542;
                case 28: goto L_0x0518;
                case 29: goto L_0x04e0;
                case 30: goto L_0x04ba;
                case 31: goto L_0x0485;
                case 32: goto L_0x0460;
                case 33: goto L_0x0430;
                case 34: goto L_0x0400;
                case 35: goto L_0x03d5;
                case 36: goto L_0x03a3;
                case 37: goto L_0x0383;
                case 38: goto L_0x0347;
                case 39: goto L_0x0316;
                case 40: goto L_0x02e5;
                case 41: goto L_0x02bd;
                case 42: goto L_0x0289;
                case 43: goto L_0x0972;
                case 44: goto L_0x0030;
                case 45: goto L_0x024d;
                case 46: goto L_0x021d;
                case 47: goto L_0x01f6;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01af;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            java.lang.Object r2 = A01(r4, r0)
            X.U90 r2 = (X.U90) r2
            X.3ju r4 = r2.A0D
            com.instagram.user.model.Product r3 = X.U90.A01(r2)
            X.KZd r2 = new X.KZd
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.ELH(r2, r0)
            goto L_0x0a30
        L_0x0030:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            switch(r2) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0073;
                case 2: goto L_0x00ed;
                case 3: goto L_0x0038;
                case 4: goto L_0x0038;
                case 5: goto L_0x0196;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0979
        L_0x003a:
            java.lang.Object r6 = A01(r4, r0)
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r6 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r6
            X.LSk r4 = r6.A03
            java.lang.String r5 = r6.A06
            java.lang.String r15 = r6.A07
            X.Dbv r7 = r6.A00
            boolean r2 = r6.A0D
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r9 = 0
            java.lang.String r14 = "active"
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            X.Jqu r7 = X.LSk.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "client"
            java.lang.String r10 = "trial_result"
            java.lang.String r11 = "page_load_init"
            r12 = r5
            r8 = r4
            X.LSk.A02(r7, r8, r9, r10, r11, r12)
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r4 = r6.A05
            java.lang.String r2 = r6.A08
            r0.A00 = r3
            java.lang.Object r4 = r4.A01(r5, r2, r0)
            if (r4 != r1) goto L_0x0076
            return r1
        L_0x0073:
            X.0eS.A00(r4)
        L_0x0076:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r6 = r4 instanceof X.C239793Ih
            java.lang.String r2 = "trial_query_insight_failure"
            r5 = 0
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r6 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r6
            com.instagram.trials.model.TrialMetricsData r7 = r6.A04
            if (r7 != 0) goto L_0x008c
            com.instagram.trials.model.TrialMetricsData r7 = new com.instagram.trials.model.TrialMetricsData
            r7.<init>(r5, r5, r5, r5)
        L_0x008c:
            X.LSk r9 = r6.A03
            java.lang.String r13 = r6.A06
            X.Jqu r8 = A00(r7, r6)
            java.lang.String r10 = "client"
            java.lang.String r11 = "trial_result"
            java.lang.String r12 = "page_load_success"
            X.LSk.A02(r8, r9, r10, r11, r12, r13)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r4 = r4.A00
            X.CTr r4 = (X.C44048CTr) r4
            boolean r8 = r4 instanceof X.CTO
            if (r8 == 0) goto L_0x0101
            X.05G r9 = r6.A0B
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 2131955991(0x7f131117, float:1.9548525E38)
            X.GKO r8 = X.DbS.A0Q(r5, r2)
            X.L2c r2 = r6.A01
            com.instagram.common.session.UserSession r2 = r2.A00
            boolean r5 = X.JTU.A1U(r2)
            r2 = 2131955989(0x7f131115, float:1.9548521E38)
            if (r5 == 0) goto L_0x00c2
            r2 = 2131955990(0x7f131116, float:1.9548523E38)
        L_0x00c2:
            X.GKO r5 = X.JTP.A0Q(r2)
            X.CTO r4 = (X.CTO) r4
            java.lang.String r4 = r4.A00
            X.KaN r2 = new X.KaN
            r2.<init>(r8, r5, r7, r4)
            r9.Epw(r2)
            com.instagram.trials.impl.TrialsPreferencesImpl r4 = r6.A02
            r2 = 2
            r0.A00 = r2
            X.0eM r2 = r4.A01
            X.4Dd r4 = X.JTR.A0r(r2)
            r2 = 4129(0x1021, float:5.786E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.E5S(r2, r3)
            java.lang.Object r2 = r4.ABn(r0)
            if (r2 != r1) goto L_0x00f0
            return r1
        L_0x00ed:
            X.0eS.A00(r4)
        L_0x00f0:
            java.lang.Object r3 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r3 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r3
            boolean r2 = r3.A0E
            if (r2 != 0) goto L_0x0a52
            r2 = 3
            r0.A00 = r2
            java.lang.Object r0 = com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel.A00(r3, r0)
            goto L_0x0a30
        L_0x0101:
            boolean r3 = r4 instanceof X.CTP
            if (r3 == 0) goto L_0x0136
            X.05G r3 = r6.A0B
            X.L2c r0 = r6.A01
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.JTU.A1U(r0)
            boolean r1 = r6.A0F
            if (r0 == 0) goto L_0x012d
            r0 = 2131955995(0x7f13111b, float:1.9548533E38)
            if (r1 == 0) goto L_0x011b
            r0 = 2131955993(0x7f131119, float:1.954853E38)
        L_0x011b:
            X.GKO r2 = X.JTP.A0Q(r0)
            X.CTP r4 = (X.CTP) r4
            java.lang.String r1 = r4.A00
            X.KaM r0 = new X.KaM
            r0.<init>(r2, r1)
            r3.Epw(r0)
            goto L_0x0a52
        L_0x012d:
            r0 = 2131955994(0x7f13111a, float:1.9548531E38)
            if (r1 == 0) goto L_0x011b
            r0 = 2131955992(0x7f131118, float:1.9548527E38)
            goto L_0x011b
        L_0x0136:
            boolean r3 = r4 instanceof X.C62110KaI
            if (r3 == 0) goto L_0x014e
            X.GKO r5 = X.JTT.A0J()
            r3 = 4
            r0.A00 = r3
            X.3ju r4 = r6.A09
            X.KaJ r3 = new X.KaJ
            r3.<init>(r5, r2)
            java.lang.Object r0 = r4.ELH(r3, r0)
            goto L_0x075b
        L_0x014e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0153:
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 == 0) goto L_0x01aa
            java.lang.Object r4 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r4 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r4
            X.LSk r6 = r4.A03
            java.lang.String r5 = r4.A06
            java.lang.String r15 = r4.A07
            X.Dbv r7 = r4.A00
            boolean r3 = r4.A0D
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r9 = 0
            java.lang.String r14 = "active"
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r16 = r9
            X.Jqu r7 = X.LSk.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "client"
            java.lang.String r10 = "trial_result"
            java.lang.String r11 = "page_load_fail"
            r12 = r5
            r8 = r6
            X.LSk.A02(r7, r8, r9, r10, r11, r12)
            X.GKO r5 = X.JTT.A0J()
            r3 = 5
            r0.A00 = r3
            X.3ju r4 = r4.A09
            X.KaJ r3 = new X.KaJ
            r3.<init>(r5, r2)
            java.lang.Object r2 = r4.ELH(r3, r0)
            if (r2 != r1) goto L_0x0199
            return r1
        L_0x0196:
            X.0eS.A00(r4)
        L_0x0199:
            java.lang.Object r2 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r2 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r2
            X.3ju r4 = r2.A09
            X.KaK r3 = X.C62112KaK.A00
            r2 = 6
            r0.A00 = r2
            java.lang.Object r0 = r4.ELH(r3, r0)
            goto L_0x0a30
        L_0x01aa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01af:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x01bd
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01bd:
            java.lang.Object r5 = A01(r4, r0)
            X.DkI r5 = (X.C46729DkI) r5
            com.instagram.user.userlist.data.LikesListRepository r4 = r5.A02
            X.JwH r2 = r5.A00
            java.lang.Object r3 = r2.A01
            X.Knp r3 = (X.C62875Knp) r3
            com.instagram.common.session.UserSession r2 = r5.A01
            X.PJa r2 = X.O34.A00(r2, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.A04(r2, r0)
            goto L_0x0a30
        L_0x01d9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x01e7
            if (r2 == r5) goto L_0x0219
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e7:
            java.lang.Object r3 = A01(r4, r0)
            com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher r3 = (com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher) r3
            com.instagram.common.session.UserSession r2 = r3.A00
            r0.A00 = r5
            java.lang.Object r4 = com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher.A00(r2, r3, r0)
            goto L_0x0216
        L_0x01f6:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0204
            if (r3 == r2) goto L_0x0219
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0204:
            java.lang.Object r5 = A01(r4, r0)
            r0.A00 = r2
            r4 = 0
            r3 = 13
            X.MGD r2 = new X.MGD
            r2.<init>(r5, r4, r3)
            java.lang.Object r4 = X.19E.A00(r0, r2)
        L_0x0216:
            if (r4 != r1) goto L_0x021c
            return r1
        L_0x0219:
            X.0eS.A00(r4)
        L_0x021c:
            return r4
        L_0x021d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x022b
            if (r2 == r5) goto L_0x0245
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x022b:
            X.0eS.A00(r4)
            X.0Ud r4 = X.AnonymousClass3OC.A00()
            if (r4 == 0) goto L_0x0a52
            java.lang.Object r3 = r0.A02
            r2 = 43
            X.MCk r2 = X.MCk.A00(r3, r2)
            r0.A00 = r5
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0248
            return r1
        L_0x0245:
            X.0eS.A00(r4)
        L_0x0248:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x024d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x025e
            if (r2 == r5) goto L_0x0271
            if (r2 == r6) goto L_0x0271
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x025e:
            java.lang.Object r3 = A01(r4, r0)
            X.Mzn r3 = (X.C68082Mzn) r3
            float r2 = androidx.recyclerview.widget.RecyclerView.A1E
            long r2 = r3.A04
            r0.A00 = r5
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0274
            return r1
        L_0x0271:
            X.0eS.A00(r4)
        L_0x0274:
            java.lang.Object r3 = r0.A02
            X.Mzn r3 = (X.C68082Mzn) r3
            r2 = 0
            r3.scrollBy(r5, r2)
            float r2 = androidx.recyclerview.widget.RecyclerView.A1E
            long r2 = r3.A03
            r0.A00 = r6
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0274
            return r1
        L_0x0289:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0297
            if (r2 == r5) goto L_0x02b5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0297:
            java.lang.Object r4 = A01(r4, r0)
            X.VYp r4 = (X.C17511VYp) r4
            X.0eM r2 = r4.A02
            java.lang.Object r2 = r2.getValue()
            X.U91 r2 = (X.U91) r2
            X.0Ud r3 = r2.A0G
            X.Wr6 r2 = new X.Wr6
            r2.<init>(r4, r5)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x02b8
            return r1
        L_0x02b5:
            X.0eS.A00(r4)
        L_0x02b8:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x02bd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x02cb
            if (r2 == r8) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02cb:
            java.lang.Object r7 = A01(r4, r0)
            X.VtD r7 = (X.C18514VtD) r7
            X.07Z r6 = r7.A05
            X.07U r5 = X.07U.A04
            r4 = 0
            r3 = 32
            X.MGx r2 = new X.MGx
            r2.<init>(r7, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r5, r6, r0, r2)
            goto L_0x0a30
        L_0x02e5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x02f3
            if (r2 == r6) goto L_0x030e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02f3:
            java.lang.Object r5 = A01(r4, r0)
            X.VtD r5 = (X.C18514VtD) r5
            X.U91 r2 = X.C18514VtD.A00(r5)
            X.0pa r4 = r2.A0F
            r3 = 7
            X.MBl r2 = new X.MBl
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0311
            return r1
        L_0x030e:
            X.0eS.A00(r4)
        L_0x0311:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0316:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0324
            if (r2 == r6) goto L_0x033f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0324:
            java.lang.Object r5 = A01(r4, r0)
            X.VtD r5 = (X.C18514VtD) r5
            X.U91 r2 = X.C18514VtD.A00(r5)
            X.0Ud r4 = r2.A0G
            r3 = 0
            X.Wr6 r2 = new X.Wr6
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0342
            return r1
        L_0x033f:
            X.0eS.A00(r4)
        L_0x0342:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0347:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0355
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0355:
            java.lang.Object r3 = A01(r4, r0)
            X.VtD r3 = (X.C18514VtD) r3
            X.07Z r2 = r3.A05
            X.07V r2 = r2.getLifecycle()
            X.Wvh r5 = new X.Wvh
            r5.<init>(r3, r6)
            r0.A00 = r6
            X.VX9 r2 = X.C64072LLq.A00(r2)
            X.0eM r2 = r2.A01
            java.lang.Object r2 = r2.getValue()
            X.LZZ r2 = (X.LZZ) r2
            X.0r6 r4 = r2.A01
            r3 = 27
            X.PeH r2 = new X.PeH
            r2.<init>(r5, r3)
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x075b
        L_0x0383:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0391
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0391:
            java.lang.Object r2 = A01(r4, r0)
            X.U91 r2 = (X.U91) r2
            X.0V2 r3 = r2.A0D
            X.LyB r2 = X.C65696LyB.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x03a3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x03b4
            if (r2 == r5) goto L_0x03c7
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03b4:
            java.lang.Object r2 = A01(r4, r0)
            X.U91 r2 = (X.U91) r2
            X.0V2 r3 = r2.A0D
            X.LyB r2 = X.C65696LyB.A00
            r0.A00 = r5
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x03ca
            return r1
        L_0x03c7:
            X.0eS.A00(r4)
        L_0x03ca:
            java.lang.Object r2 = r0.A02
            X.U91 r2 = (X.U91) r2
            X.L8S r5 = r2.A05
            r0.A00 = r6
            java.lang.String r4 = "composer"
            goto L_0x03f3
        L_0x03d5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x03e3
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03e3:
            java.lang.Object r2 = A01(r4, r0)
            X.U91 r2 = (X.U91) r2
            X.L8S r5 = r2.A05
            r0.A00 = r3
            r2 = 3107(0xc23, float:4.354E-42)
            java.lang.String r4 = X.C273654mx.A00(r2)
        L_0x03f3:
            X.0V2 r3 = r5.A00
            X.Jzi r2 = new X.Jzi
            r2.<init>(r4)
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x075b
        L_0x0400:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x040e
            if (r2 == r6) goto L_0x0428
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x040e:
            java.lang.Object r5 = A01(r4, r0)
            X.U91 r5 = (X.U91) r5
            X.Vj6 r2 = r5.A06
            X.0Ud r4 = r2.A01
            r3 = 22
            X.WrE r2 = new X.WrE
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x042b
            return r1
        L_0x0428:
            X.0eS.A00(r4)
        L_0x042b:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0430:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x043e
            if (r2 == r6) goto L_0x0458
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x043e:
            java.lang.Object r5 = A01(r4, r0)
            X.U91 r5 = (X.U91) r5
            X.L5D r2 = r5.A07
            X.0Ud r4 = r2.A01
            r3 = 21
            X.WrE r2 = new X.WrE
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x045b
            return r1
        L_0x0458:
            X.0eS.A00(r4)
        L_0x045b:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0460:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x046e
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x046e:
            java.lang.Object r3 = A01(r4, r0)
            X.U91 r3 = (X.U91) r3
            X.VX8 r2 = r3.A04
            X.0Ud r6 = r2.A02
            r2 = 20
            X.WrE r4 = new X.WrE
            r4.<init>(r3, r2)
            r0.A00 = r5
            r2 = 41
            goto L_0x0614
        L_0x0485:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0493
            if (r2 == r5) goto L_0x04b2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0493:
            java.lang.Object r4 = A01(r4, r0)
            X.L79 r4 = (X.L79) r4
            X.0eM r2 = r4.A02
            java.lang.Object r2 = r2.getValue()
            X.JhM r2 = (X.C60203JhM) r2
            X.0Ud r3 = r2.A07
            r2 = 40
            X.MCk r2 = X.MCk.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x04b5
            return r1
        L_0x04b2:
            X.0eS.A00(r4)
        L_0x04b5:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x04ba:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x04c8
            if (r2 == r7) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04c8:
            java.lang.Object r6 = A01(r4, r0)
            X.LMs r6 = (X.C64098LMs) r6
            X.07Z r5 = r6.A01
            r4 = 0
            r3 = 29
            X.MG5 r2 = new X.MG5
            r2.<init>(r6, r4, r3)
            r0.A00 = r7
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r5, r0, r2)
            goto L_0x0a30
        L_0x04e0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x04ee
            if (r2 == r6) goto L_0x0510
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04ee:
            java.lang.Object r5 = A01(r4, r0)
            X.LMs r5 = (X.C64098LMs) r5
            X.C64098LMs.A00(r5)
            X.0eM r2 = r5.A04
            java.lang.Object r2 = r2.getValue()
            X.JhM r2 = (X.C60203JhM) r2
            X.0Ud r4 = r2.A07
            r3 = 6
            X.MBl r2 = new X.MBl
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0513
            return r1
        L_0x0510:
            X.0eS.A00(r4)
        L_0x0513:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0518:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0526
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0526:
            java.lang.Object r5 = A01(r4, r0)
            X.JhM r5 = (X.C60203JhM) r5
            X.KWc r2 = r5.A05
            X.0Ud r4 = r2.A07
            r3 = 5
            X.MID r2 = new X.MID
            r2.<init>(r5, r3)
            X.0pz r2 = X.JTO.A1I(r2, r4)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0a30
        L_0x0542:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0550
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0550:
            java.lang.Object r5 = A01(r4, r0)
            X.JhM r5 = (X.C60203JhM) r5
            X.L8S r2 = r5.A03
            X.0Ud r4 = r2.A03
            r3 = 4
            X.MID r2 = new X.MID
            r2.<init>(r5, r3)
            X.0pz r2 = X.JTO.A1I(r2, r4)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0a30
        L_0x056c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x057a
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x057a:
            java.lang.Object r5 = A01(r4, r0)
            X.JhM r5 = (X.C60203JhM) r5
            X.VX8 r2 = r5.A02
            X.0Ud r3 = r2.A02
            r2 = 68
            X.MC9 r4 = X.MC9.A00(r3, r2)
            r3 = 3
            X.MID r2 = new X.MID
            r2.<init>(r5, r3)
            X.0pz r2 = X.JTO.A1I(r2, r4)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0a30
        L_0x059c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x05aa
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05aa:
            java.lang.Object r2 = A01(r4, r0)
            X.6SY r2 = (X.AnonymousClass6SY) r2
            X.0V2 r3 = r2.A04
            X.Ly7 r2 = X.C65692Ly7.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x05bc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x05ca
            if (r2 == r6) goto L_0x05e9
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05ca:
            java.lang.Object r5 = A01(r4, r0)
            X.OHd r5 = (X.C70708OHd) r5
            X.0eM r2 = r5.A06
            java.lang.Object r2 = r2.getValue()
            X.Mty r2 = (X.C67745Mty) r2
            X.0Ud r4 = r2.A06
            r3 = 6
            X.Pe1 r2 = new X.Pe1
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x05ec
            return r1
        L_0x05e9:
            X.0eS.A00(r4)
        L_0x05ec:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x05f1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x05ff
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05ff:
            java.lang.Object r3 = A01(r4, r0)
            X.Mty r3 = (X.C67745Mty) r3
            X.VX8 r2 = r3.A02
            X.0Ud r6 = r2.A02
            r2 = 28
            X.PeH r4 = new X.PeH
            r4.<init>(r3, r2)
            r0.A00 = r5
            r2 = 35
        L_0x0614:
            X.MCk r2 = X.MCk.A00(r4, r2)
            java.lang.Object r0 = r6.collect(r2, r0)
            goto L_0x075b
        L_0x061e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x062c
            if (r2 == r8) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x062c:
            java.lang.Object r7 = A01(r4, r0)
            com.instagram.stickersearch.api.AvatarStickerSearchRepository r7 = (com.instagram.stickersearch.api.AvatarStickerSearchRepository) r7
            X.05G r6 = r7.A07
            X.L2Y r2 = r7.A05
            com.instagram.common.session.UserSession r5 = r2.A00
            X.0Tu r4 = X.0Tu.A05
            r2 = 36606938271782400(0x820dd100011600, double:3.2137133951595615E-306)
            long r2 = X.182.A01(r4, r5, r2)
            X.0r6 r3 = X.AnonymousClass11F.A00(r6, r2)
            r2 = 34
            X.MCk r2 = X.MCk.A00(r7, r2)
            r0.A00 = r8
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x0a30
        L_0x0655:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0663
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0663:
            java.lang.Object r2 = A01(r4, r0)
            X.Jii r2 = (X.C60286Jii) r2
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r2 = r2.A01
            r0.A00 = r3
            java.lang.Object r0 = r2.A05(r0)
            goto L_0x0a30
        L_0x0673:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0681
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0681:
            java.lang.Object r2 = A01(r4, r0)
            com.instagram.spotlight.fetch.SpotlightFetchRepository r2 = (com.instagram.spotlight.fetch.SpotlightFetchRepository) r2
            r0.A00 = r3
            java.lang.Object r0 = com.instagram.spotlight.fetch.SpotlightFetchRepository.A00(r2, r0)
            goto L_0x0a30
        L_0x068f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x069d
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x069d:
            java.lang.Object r2 = A01(r4, r0)
            X.Jgc r2 = (X.C60157Jgc) r2
            com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository r2 = r2.A01
            r0.A00 = r3
            java.lang.Object r0 = r2.A00(r0)
            goto L_0x0a30
        L_0x06ad:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r13 = 1
            if (r2 == 0) goto L_0x06bb
            if (r2 == r13) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06bb:
            java.lang.Object r6 = A01(r4, r0)
            X.LN7 r6 = (X.LN7) r6
            X.LQV r5 = r6.A06
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r8 = 0
            X.MLq r9 = X.C66281MLq.A00
            X.MOj r12 = X.C66352MOj.A00
            X.MLr r10 = X.C66282MLr.A00
            X.MLs r11 = X.C66283MLs.A00
            X.JuT r4 = X.LN7.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A00 = r13
            r3 = 21
            X.JaL r2 = new X.JaL
            r2.<init>((X.AnonymousClass4D7) r8, (java.lang.Object) r5, (java.lang.Object) r4, (int) r3)
            java.lang.Object r0 = X.19E.A00(r0, r2)
            java.lang.Object r0 = X.JTP.A0l(r0)
            goto L_0x0a30
        L_0x06e5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x06fd
            if (r2 != r3) goto L_0x0719
            X.0eS.A00(r4)
        L_0x06f1:
            java.lang.Object r0 = r0.A02
            X.LN7 r0 = (X.LN7) r0
            X.05G r0 = r0.A00
            X.JTR.A1V(r0)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x06fd:
            java.lang.Object r5 = A01(r4, r0)
            X.LN7 r5 = (X.LN7) r5
            X.05G r2 = r5.A00
            X.AnonymousClass7TF.A1O(r2, r3)
            r0.A00 = r3
            r4 = 0
            r3 = 18
            X.MG5 r2 = new X.MG5
            r2.<init>(r5, r4, r3)
            java.lang.Object r2 = X.19E.A00(r0, r2)
            if (r2 != r1) goto L_0x06f1
            return r1
        L_0x0719:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x071e:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x072c
            if (r3 == r2) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x072c:
            java.lang.Object r4 = A01(r4, r0)
            r0.A00 = r2
            r3 = 0
            r2 = 14
            X.MG5 r6 = new X.MG5
            r6.<init>(r4, r3, r2)
            goto L_0x0757
        L_0x073b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0749
            if (r3 == r2) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0749:
            java.lang.Object r5 = A01(r4, r0)
            r0.A00 = r2
            r4 = 0
            r3 = 0
            r2 = 3
            X.MGB r6 = new X.MGB
            r6.<init>(r5, r3, r2, r4)
        L_0x0757:
            java.lang.Object r0 = X.19E.A00(r0, r6)
        L_0x075b:
            if (r0 == r1) goto L_0x0a54
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0a30
        L_0x0761:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x076f
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x076f:
            java.lang.Object r7 = A01(r4, r0)
            X.LN7 r7 = (X.LN7) r7
            X.0Ud r4 = r7.A08
            java.lang.Object r2 = r4.getValue()
            X.Jv4 r2 = (X.Jv4) r2
            java.lang.Integer r5 = r2.A02
            java.lang.Object r2 = r4.getValue()
            X.Jv4 r2 = (X.Jv4) r2
            X.Kng r4 = r2.A00
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            if (r5 == r8) goto L_0x0a52
            boolean r2 = r4 instanceof X.C62086KZq
            if (r2 == 0) goto L_0x0a52
            X.LQV r6 = r7.A06
            X.KZq r4 = (X.C62086KZq) r4
            java.lang.String r9 = r4.A00
            r2 = 43
            X.To1 r10 = new X.To1
            r10.<init>(r7, r2)
            r2 = 22
            X.Wyw r13 = new X.Wyw
            r13.<init>(r7, r2)
            r2 = 44
            X.To1 r11 = new X.To1
            r11.<init>(r7, r2)
            r14 = 0
            X.MLs r12 = X.C66283MLs.A00
            X.JuT r5 = X.LN7.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A00 = r3
            r4 = 0
            r3 = 21
            X.JaL r2 = new X.JaL
            r2.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r6, (java.lang.Object) r5, (int) r3)
            java.lang.Object r0 = X.19E.A00(r0, r2)
            java.lang.Object r0 = X.JTP.A0l(r0)
            goto L_0x0a30
        L_0x07c5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x07d3
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07d3:
            java.lang.Object r2 = A01(r4, r0)
            X.LQd r2 = (X.C64141LQd) r2
            X.0V2 r4 = r2.A06
            android.content.Context r3 = r2.A00
            r2 = 2131974982(0x7f135b46, float:1.9587043E38)
            java.lang.CharSequence r2 = r3.getText(r2)
            java.lang.String r2 = r2.toString()
            r0.A00 = r5
            java.lang.Object r0 = r4.emit(r2, r0)
            goto L_0x0a30
        L_0x07f0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x07fe
            if (r2 == r3) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07fe:
            java.lang.Object r2 = A01(r4, r0)
            X.4Co r2 = (X.C262204Co) r2
            r0.A00 = r3
            java.lang.Object r0 = r2.CfH(r0)
            goto L_0x0a30
        L_0x080c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x081a
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x081a:
            java.lang.Object r2 = A01(r4, r0)
            X.U8r r2 = (X.C14781U8r) r2
            X.0V2 r3 = r2.A04
            X.UrG r2 = X.C16253UrG.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x082c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x083a
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x083a:
            java.lang.Object r2 = A01(r4, r0)
            X.U8g r2 = (X.C14770U8g) r2
            X.0V2 r3 = r2.A06
            X.KZm r2 = X.C62082KZm.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x084c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x085a
            if (r2 == r6) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x085a:
            java.lang.Object r5 = A01(r4, r0)
            X.U8q r5 = (X.C14780U8q) r5
            X.0V2 r4 = r5.A08
            java.lang.String r3 = r5.A06
            if (r3 != 0) goto L_0x087a
            X.0eM r2 = r5.A07
            java.lang.Object r2 = r2.getValue()
            X.17i r2 = (X.17i) r2
            java.lang.String r3 = r5.A05
            com.instagram.user.model.User r2 = r2.A02(r3)
            if (r2 == 0) goto L_0x0887
            java.lang.String r3 = r2.getUsername()
        L_0x087a:
            X.UrC r2 = new X.UrC
            r2.<init>(r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.emit(r2, r0)
            goto L_0x0a30
        L_0x0887:
            X.0qQ.A0A(r3)
            goto L_0x087a
        L_0x088b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0899
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0899:
            java.lang.Object r2 = A01(r4, r0)
            X.U8q r2 = (X.C14780U8q) r2
            X.0V2 r3 = r2.A08
            X.UrE r2 = X.C16251UrE.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x08ab:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x08b9
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08b9:
            java.lang.Object r2 = A01(r4, r0)
            X.U8q r2 = (X.C14780U8q) r2
            X.0V2 r4 = r2.A08
            int r3 = r2.A00
            X.UrB r2 = new X.UrB
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.emit(r2, r0)
            goto L_0x0a30
        L_0x08d0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x08de
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08de:
            java.lang.Object r2 = A01(r4, r0)
            X.U8e r2 = (X.C14768U8e) r2
            X.0V2 r3 = r2.A09
            X.UrA r2 = X.C16247UrA.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0a30
        L_0x08f0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x08fe
            if (r2 == r5) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08fe:
            java.lang.Object r2 = A01(r4, r0)
            X.U90 r2 = (X.U90) r2
            X.3ju r3 = r2.A0D
            X.KZf r2 = X.C62075KZf.A00
            r0.A00 = r5
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0a30
        L_0x0910:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0921
            if (r2 == r3) goto L_0x0959
            if (r2 == r8) goto L_0x0979
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0921:
            java.lang.Object r2 = A01(r4, r0)
            X.U90 r2 = (X.U90) r2
            X.ViR r9 = r2.A06
            com.instagram.user.model.Product r7 = X.U90.A01(r2)
            r0.A00 = r3
            X.3Pl r6 = X.JTQ.A0m(r0)
            X.05G r2 = r9.A02
            X.AnonymousClass7TF.A1O(r2, r3)
            X.6xT r2 = r9.A01
            X.6xZ r5 = r2.A07
            com.instagram.user.model.User r2 = r7.A0B
            r4 = 0
            if (r2 == 0) goto L_0x0957
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r2)
        L_0x0945:
            X.0qQ.A0A(r3)
            X.Wc9 r2 = new X.Wc9
            r2.<init>(r9, r7, r6)
            r5.A0D(r2, r7, r3, r4)
            java.lang.Object r4 = r6.A00()
            if (r4 != r1) goto L_0x095c
            return r1
        L_0x0957:
            r3 = r4
            goto L_0x0945
        L_0x0959:
            X.0eS.A00(r4)
        L_0x095c:
            boolean r2 = X.AnonymousClass7TE.A1a(r4)
            if (r2 != 0) goto L_0x0a52
            java.lang.Object r2 = r0.A02
            X.U90 r2 = (X.U90) r2
            X.3ju r3 = r2.A0D
            X.KZg r2 = X.C62076KZg.A00
            r0.A00 = r8
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0a30
        L_0x0972:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x097e;
                case 1: goto L_0x09b2;
                case 2: goto L_0x09f4;
                case 3: goto L_0x09f4;
                case 4: goto L_0x0979;
                case 5: goto L_0x0a1e;
                default: goto L_0x0979;
            }
        L_0x0979:
            X.0eS.A00(r4)
            goto L_0x0a52
        L_0x097e:
            java.lang.Object r4 = A01(r4, r0)
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r4 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r4
            X.05G r3 = r4.A0B
            X.KaO r2 = X.C62116KaO.A00
            r3.Epw(r2)
            com.instagram.trials.model.TrialMetricsData r3 = r4.A04
            if (r3 != 0) goto L_0x0995
            r2 = 0
            com.instagram.trials.model.TrialMetricsData r3 = new com.instagram.trials.model.TrialMetricsData
            r3.<init>(r2, r2, r2, r2)
        L_0x0995:
            X.LSk r6 = r4.A03
            java.lang.String r10 = r4.A06
            X.Jqu r5 = A00(r3, r4)
            java.lang.String r7 = "user"
            java.lang.String r8 = "trial_result"
            java.lang.String r9 = "tap_share"
            X.LSk.A02(r5, r6, r7, r8, r9, r10)
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r3 = r4.A05
            r2 = 1
            r0.A00 = r2
            java.lang.Object r4 = r3.A02(r10, r8, r0)
            if (r4 != r1) goto L_0x09b5
            return r1
        L_0x09b2:
            X.0eS.A00(r4)
        L_0x09b5:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r3 = r4 instanceof X.C239793Ih
            r2 = 4128(0x1020, float:5.785E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            if (r3 == 0) goto L_0x0a01
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r2 = r4.A00
            boolean r2 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r3 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r3 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r3
            if (r2 == 0) goto L_0x09dd
            X.3ju r4 = r3.A09
            X.KaL r3 = X.C62113KaL.A00
            r2 = 2
            r0.A00 = r2
            java.lang.Object r2 = r4.ELH(r3, r0)
        L_0x09da:
            if (r2 != r1) goto L_0x09f7
            return r1
        L_0x09dd:
            X.GKO r4 = X.JTT.A0J()
            r2 = 3
            r0.A00 = r2
            X.3ju r3 = r3.A09
            X.KaJ r2 = new X.KaJ
            r2.<init>(r4, r5)
            java.lang.Object r2 = r3.ELH(r2, r0)
            if (r2 == r1) goto L_0x0a54
            X.0gF r2 = X.C60340gF.A00
            goto L_0x09da
        L_0x09f4:
            X.0eS.A00(r4)
        L_0x09f7:
            java.lang.Object r2 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r2 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r2
            X.3ju r4 = r2.A09
            X.KaK r3 = X.C62112KaK.A00
            r2 = 4
            goto L_0x0a2a
        L_0x0a01:
            boolean r2 = r4 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0a33
            java.lang.Object r3 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r3 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r3
            X.GKO r4 = X.JTT.A0J()
            r2 = 5
            r0.A00 = r2
            X.3ju r3 = r3.A09
            X.KaJ r2 = new X.KaJ
            r2.<init>(r4, r5)
            java.lang.Object r2 = r3.ELH(r2, r0)
            if (r2 != r1) goto L_0x0a21
            return r1
        L_0x0a1e:
            X.0eS.A00(r4)
        L_0x0a21:
            java.lang.Object r2 = r0.A02
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r2 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r2
            X.3ju r4 = r2.A09
            X.KaK r3 = X.C62112KaK.A00
            r2 = 6
        L_0x0a2a:
            r0.A00 = r2
            java.lang.Object r0 = r4.ELH(r3, r0)
        L_0x0a30:
            if (r0 != r1) goto L_0x0a52
            return r1
        L_0x0a33:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a38:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0a55
            if (r2 != r5) goto L_0x0a6a
            X.0eS.A00(r4)
        L_0x0a44:
            boolean r1 = X.AnonymousClass7TE.A1a(r4)
            if (r1 == 0) goto L_0x0a52
            java.lang.Object r1 = r0.A02
            X.U90 r1 = (X.U90) r1
            r0 = 0
            r1.A06(r0)
        L_0x0a52:
            X.0gF r1 = X.C60340gF.A00
        L_0x0a54:
            return r1
        L_0x0a55:
            java.lang.Object r2 = A01(r4, r0)
            X.U90 r2 = (X.U90) r2
            X.ViR r4 = r2.A06
            int r3 = r2.A01
            java.lang.String r2 = r2.A09
            r0.A00 = r5
            java.lang.Object r4 = r4.A00(r2, r0, r3)
            if (r4 != r1) goto L_0x0a44
            return r1
        L_0x0a6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A01(Object obj, MG5 mg5) {
        0eS.A00(obj);
        return mg5.A02;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MG5) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
