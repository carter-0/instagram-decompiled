package X;

import android.accounts.NetworkErrorException;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.EglBase14Impl;

public final class NMH extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public NMH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(1OC r1, Object obj, Object obj2, int i) {
        r1.A00 = new NMH(i, obj, obj2);
    }

    public final void onFail(C268654dm r9) {
        int i;
        int i2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1563264297);
                C67739Mts mts = (C67739Mts) this.A02;
                if (!mts.A0A) {
                    mts.A01 = null;
                    mts.A08.Epw(AnonymousClass7TE.A13(mts.A02));
                    mts.A00++;
                }
                i2 = 1960185172;
                break;
            case 2:
                i = AnonymousClass0fD.A03(956239626);
                i2 = 2009457393;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1707660222);
                C71020OYv.A00((C71020OYv) this.A02);
                i2 = 1607722145;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1558518905);
                0qQ.A0B(r9, 0);
                NMH.super.onFail(r9);
                NJC njc = (NJC) this.A02;
                Context context = njc.getContext();
                if (context != null) {
                    C59689JTv.A01(context, "direct_poll_message_voting_error", 2131960022, 0);
                    AnonymousClass7TH.A0R(njc.A00);
                    View view = njc.A01;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                O76 o76 = njc.A05;
                if (o76 == null) {
                    str2 = "logger";
                } else {
                    C254743sy r7 = (C254743sy) this.A01;
                    C71067Oam oam = njc.A04;
                    if (oam == null) {
                        str2 = "controller";
                    } else {
                        String str3 = oam.A0A;
                        Throwable A012 = r9.A01();
                        if (A012 == null || (str = A012.getMessage()) == null) {
                            str = "";
                        }
                        0Aj A0e = AnonymousClass7TE.A0e(o76.A00, "existing_poll_submit_error");
                        0bb r2 = new 0bb();
                        String A0B = C66647MaG.A0B(r7);
                        if (A0B != null) {
                            r2.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0B);
                            r2.A06("question_id", str3);
                            r2.A06("exception_message", str);
                            C66583MXo.A13(A0e, r2);
                            i2 = -1445876476;
                            break;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            case 5:
                i = AnonymousClass0fD.A03(-1097852771);
                i2 = 517428363;
                break;
            case 7:
                i = AnonymousClass7TG.A0D(r9, -1291712584);
                NMH.super.onFail(r9);
                ((C74402PuI) this.A01).DFF();
                i2 = -1928386844;
                break;
            case 8:
                i = AnonymousClass0fD.A03(301483091);
                Dialog dialog = (Dialog) ((0rm) this.A02).A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                i2 = 72569217;
                break;
            case 9:
                i = AnonymousClass7TG.A0D(r9, -1619976600);
                NMH.super.onFail(r9);
                ((C72369P3i) this.A02).A05.Euw();
                i2 = 1216141572;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-1738603982);
                C71013OYl.A00((C71013OYl) this.A02, (GroupLinkPreviewResponse$Success) this.A01);
                i2 = 592339391;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass7TG.A0D(r9, -818584367);
                NMH.super.onFail(r9);
                OVO ovo = ((OC1) this.A02).A01;
                DirectThreadKey directThreadKey = (DirectThreadKey) this.A01;
                String A0b = Dbb.A0b(r9);
                C310336ap A0a = DbS.A0a();
                DbS.A19(ovo.A02, A0a, 2131959573);
                A0a.A06();
                DbY.A1N(A0a);
                UserSession userSession = ovo.A04;
                AnonymousClass0iw r22 = ovo.A03;
                HashMap A1E = AnonymousClass7TE.A1E();
                if (A0b == null) {
                    A0b = "null";
                }
                A1E.put("error_message", A0b);
                OQ6.A01(r22, userSession, directThreadKey, "remove_reminder_error_impression", A1E);
                i2 = 2098450872;
                break;
            case 13:
                i = AnonymousClass0fD.A03(-1214892642);
                0qQ.A0B(r9, 0);
                NMH.super.onFail(r9);
                OVO ovo2 = ((OC1) this.A02).A01;
                C66709MbG mbG = (C66709MbG) this.A01;
                String A0b2 = Dbb.A0b(r9);
                0qQ.A0B(mbG, 0);
                C310336ap A0a2 = DbS.A0a();
                DbS.A19(ovo2.A02, A0a2, 2131959575);
                A0a2.A06();
                DbY.A1N(A0a2);
                UserSession userSession2 = ovo2.A04;
                AnonymousClass0iw r4 = ovo2.A03;
                DirectThreadKey directThreadKey2 = (DirectThreadKey) mbG.A03;
                0qQ.A0B(directThreadKey2, 2);
                HashMap A1E2 = AnonymousClass7TE.A1E();
                if (A0b2 == null) {
                    A0b2 = "null";
                }
                A1E2.put("error_message", A0b2);
                OQ6.A01(r4, userSession2, directThreadKey2, "set_reminder_error_impression", A1E2);
                i2 = -1283724125;
                break;
            case 16:
                i = AnonymousClass0fD.A03(-1870385708);
                ((AnonymousClass67Z) this.A02).A00();
                i2 = -305245634;
                break;
            case 17:
                i = AnonymousClass0fD.A03(-657045220);
                i2 = 847209380;
                break;
            case 19:
                i = AnonymousClass7TG.A0D(r9, 207420924);
                NMH.super.onFail(r9);
                NKT nkt = ((OAS) this.A01).A00;
                if (nkt.getContext() != null && nkt.isResumed()) {
                    C49952FGh.A01(nkt.getContext());
                }
                i2 = 599934419;
                break;
            case 21:
                i = AnonymousClass0fD.A03(-67112419);
                C59689JTv.A0B(((AnonymousClass32G) this.A01).getRootActivity(), "something_went_wrong");
                i2 = 255904203;
                break;
            default:
                NMH.super.onFail(r9);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFailInBackground(C268654dm r6) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 14:
                i = AnonymousClass0fD.A03(-1215562472);
                i2 = 1120274710;
                break;
            case 15:
                i = AnonymousClass7TG.A0D(r6, 1130009612);
                1XP r0 = (1XP) r6.A00();
                if (r0 == null || (str = r0.getErrorMessage()) == null) {
                    str = "";
                }
                02m r2 = (02m) this.A01;
                r2.markerAnnotate(574170495, "error_message", str);
                r2.markerEnd(574170495, 3);
                0wb.A03("HiddenWordsBadgeProvider", 002.A0R("Could not load pending threads: ", str));
                i2 = 399083639;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass7TG.A0D(r6, 1838612271);
                NMH.super.onFailInBackground(r6);
                1K2 r22 = (1K2) ((F2V) this.A02).A02.get(this.A01);
                if (r22 != null) {
                    r22.setException(new NetworkErrorException(""));
                }
                i2 = 265801342;
                break;
            default:
                NMH.super.onFailInBackground(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 6:
                i = AnonymousClass0fD.A03(-1399785235);
                ((C70613ODk) this.A02).A01 = false;
                i2 = -2054405531;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-1132543343);
                ((02m) this.A01).markerEnd(574174094, 2);
                i2 = 1080924325;
                break;
            case 20:
                i = AnonymousClass0fD.A03(182291674);
                C49960FGs.A02(((Fragment) this.A01).getActivity());
                i2 = 1992654091;
                break;
            case 21:
                i = AnonymousClass0fD.A03(1807047697);
                C49960FGs.A02(((Fragment) this.A01).getActivity());
                i2 = -887703044;
                break;
            default:
                NMH.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        if (15 - this.A00 != 0) {
            NMH.super.onStart();
            return;
        }
        int A03 = AnonymousClass0fD.A03(1466265845);
        02m r5 = (02m) this.A01;
        r5.markerStart(574174094);
        r5.markerStart(574170495);
        0eE r1 = AnonymousClass0t1.A01;
        C67028Mh1 mh1 = (C67028Mh1) this.A02;
        AnonymousClass16x AsZ = r1.A01(mh1.A01).A03.AsZ();
        if (AsZ != null) {
            Boolean CQk = AsZ.CQk();
            if (CQk != null) {
                boolean booleanValue = CQk.booleanValue();
                r5.markerAnnotate(574174094, "is_creator", booleanValue);
                r5.markerAnnotate(574170495, "is_creator", booleanValue);
            }
            CreatorSegmentation Ase = AsZ.Ase();
            if (Ase != null) {
                String obj = Ase.toString();
                r5.markerAnnotate(574174094, "creator_segmentation", obj);
                r5.markerAnnotate(574170495, "creator_segmentation", obj);
            }
        }
        MutedWordsFilterManager mutedWordsFilterManager = mh1.A03;
        r5.markerAnnotate(574170495, "is_hidden_words_available", mutedWordsFilterManager.A07());
        r5.markerAnnotate(574170495, "is_hidden_words_ready", mutedWordsFilterManager.A09());
        AnonymousClass0fD.A0A(1915542177, A03);
    }

    /* JADX WARNING: type inference failed for: r2v46, types: [java.lang.Object, X.OLT] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0628, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x062f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x06ac, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x06af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x029b, code lost:
        r14[0] = X.C14240TsN.A04(r15, r1);
        r14[1] = X.C14240TsN.A01(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02a7, code lost:
        r1 = r10.getString(r11, r14);
        X.0qQ.A07(r1);
        r7.A0D = X.DbW.A0h(r10, r1, 2131959576);
        X.DbW.A0q(r10, r7, 2131959572);
        r7.A0A(new X.C72729PHj(4, r9, r8));
        r7.A0L = true;
        r7.A06();
        X.DbY.A1N(r7);
        r3 = r8.A04;
        r2 = r8.A03;
        X.0qQ.A0B(r6, 2);
        X.OQ6.A00(r2, r3, r6, "set_reminder_success_toast_impression");
        X.AnonymousClass0fD.A0A(-1033686435, r5);
        r1 = 835946986;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x02e9, code lost:
        r14 = new java.lang.Object[]{X.C14240TsN.A01(r10, r1)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0567, code lost:
        X.AnonymousClass0fD.A0A(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x056a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            r14 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x060e;
                case 1: goto L_0x05cb;
                case 2: goto L_0x059f;
                case 3: goto L_0x0570;
                case 4: goto L_0x0508;
                case 5: goto L_0x04e0;
                case 6: goto L_0x0485;
                case 7: goto L_0x0416;
                case 8: goto L_0x03eb;
                case 9: goto L_0x03c0;
                case 10: goto L_0x0352;
                case 11: goto L_0x0009;
                case 12: goto L_0x02ff;
                case 13: goto L_0x023c;
                case 14: goto L_0x0009;
                case 15: goto L_0x0009;
                case 16: goto L_0x01db;
                case 17: goto L_0x01ae;
                case 18: goto L_0x0009;
                case 19: goto L_0x016b;
                case 20: goto L_0x00b7;
                case 21: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.NMH.super.onSuccess(r14)
            return
        L_0x000d:
            r0 = 924074111(0x3714407f, float:8.836504E-6)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHU r14 = (X.NHU) r14
            r2 = 1974470380(0x75b006ec, float:4.4628156E32)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Integer r2 = r14.A01()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r2 != r4) goto L_0x00aa
            java.lang.Object r5 = r1.A01
            X.NKX r5 = (X.NKX) r5
            com.google.gson.Gson r6 = new com.google.gson.Gson
            r6.<init>()
            X.OM1 r1 = r14.A00()
            java.lang.String r2 = r1.A0H
            java.lang.Class<com.google.gson.JsonObject> r1 = com.google.gson.JsonObject.class
            java.lang.Object r6 = r6.A08(r2, r1)
            com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6
            if (r6 == 0) goto L_0x00b5
            java.lang.String r2 = "tags"
            boolean r1 = r6.has(r2)
            if (r1 == 0) goto L_0x00b5
            com.google.gson.JsonArray r6 = r6.getAsJsonArray(r2)
            if (r6 == 0) goto L_0x00b5
            java.util.ArrayList r1 = r6.elements
            int r2 = r1.size()
            r1 = 1
            if (r2 < r1) goto L_0x00b5
            r1 = 0
            com.google.gson.JsonElement r1 = r6.get(r1)
            if (r1 == 0) goto L_0x00b5
            java.lang.String r2 = r1.getAsString()
        L_0x0060:
            X.Pvi r1 = r5.A08
            r1.DE3(r2)
            X.Oa2 r12 = r5.A06
            if (r12 == 0) goto L_0x0075
            X.OM1 r1 = r14.A00()
            java.lang.String r2 = r1.A00()
            r1 = 0
            r12.A04(r4, r2, r1)
        L_0x0075:
            X.7Pu r10 = r5.A02
            r10.A05()
            com.instagram.common.session.UserSession r1 = r5.A01
            X.7Pr r4 = X.DbS.A0W(r1)
            boolean r1 = r5.A0D
            X.DbS.A1S(r4, r1)
            float r1 = r5.A00
            r4.A03 = r1
            r13 = 0
            android.os.Bundle r9 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r1 = r5.A01
            X.DbU.A1D(r9, r1)
            com.instagram.user.model.User r11 = r5.A04
            java.lang.String r2 = r5.A0A
            java.lang.String r1 = "ReportingConstants.ARG_CONTENT_ID"
            r9.putString(r1, r2)
            boolean r2 = r5.A0C
            java.lang.String r1 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            r9.putBoolean(r1, r2)
            X.NKY r1 = X.O3H.A00(r9, r10, r11, r12, r13, r14)
            r10.A0E(r1, r4)
        L_0x00aa:
            r1 = -1335515050(0xffffffffb065a856, float:-8.3548934E-10)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1182057756(0x4674c51c, float:15665.277)
            goto L_0x06ac
        L_0x00b5:
            r2 = 0
            goto L_0x0060
        L_0x00b7:
            r0 = -679017136(0xffffffffd7870550, float:-2.96913774E14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHU r14 = (X.NHU) r14
            r2 = -676211660(0xffffffffd7b1d434, float:-3.91049927E14)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Integer r5 = r14.A01()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.Object r4 = r1.A01
            X.NKW r4 = (X.NKW) r4
            if (r5 != r2) goto L_0x0119
            X.Pvi r1 = r4.A07
            r12 = 0
            r1.DE3(r12)
            X.7Pu r10 = r4.A02
            r10.A05()
            com.instagram.common.session.UserSession r1 = r4.A01
            X.7Pr r5 = X.DbS.A0W(r1)
            boolean r1 = r4.A0E
            X.DbS.A1S(r5, r1)
            float r1 = r4.A00
            r5.A03 = r1
            android.os.Bundle r9 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r1 = r4.A01
            X.DbU.A1D(r9, r1)
            com.instagram.user.model.User r11 = r4.A03
            java.lang.String r2 = r4.A0A
            java.lang.String r1 = "ReportingConstants.ARG_CONTENT_ID"
            r9.putString(r1, r2)
            boolean r2 = r4.A0D
            java.lang.String r1 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            r9.putBoolean(r1, r2)
            r13 = r12
            X.NKY r1 = X.O3H.A00(r9, r10, r11, r12, r13, r14)
            r10.A0E(r1, r5)
        L_0x010e:
            r1 = -1527477938(0xffffffffa4f4894e, float:-1.06050735E-16)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1471865481(0xffffffffa8451d77, float:-1.0942086E-14)
            goto L_0x06ac
        L_0x0119:
            X.7Pu r6 = r4.A02
            X.Pvi r2 = r4.A07
            com.instagram.user.model.User r1 = r4.A03
            X.NKW r5 = new X.NKW
            r5.<init>(r6, r1, r2, r14)
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r1 = r4.A01
            X.DbU.A1D(r7, r1)
            java.lang.String r2 = r4.A0A
            java.lang.String r1 = "ReportingConstants.ARG_CONTENT_ID"
            r7.putString(r1, r2)
            boolean r2 = r4.A0D
            java.lang.String r1 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            r7.putBoolean(r1, r2)
            boolean r2 = r4.A0E
            java.lang.String r1 = "ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED"
            r7.putBoolean(r1, r2)
            float r2 = r4.A00
            java.lang.String r1 = "ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO"
            r7.putFloat(r1, r2)
            r5.setArguments(r7)
            com.instagram.common.session.UserSession r1 = r4.A01
            X.7Pr r2 = X.DbS.A0W(r1)
            X.OM1 r1 = r14.A00()
            X.OKa r1 = r1.A0G
            java.lang.String r1 = r1.A00
            r2.A0d = r1
            boolean r1 = r4.A0E
            X.DbS.A1S(r2, r1)
            float r1 = r4.A00
            r2.A03 = r1
            r2.A0T = r5
            r6.A0E(r5, r2)
            goto L_0x010e
        L_0x016b:
            r0 = -1881566204(0xffffffff8fd99404, float:-2.1454866E-29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1894402997(0xffffffff8f15b44b, float:-7.38099E-30)
            int r4 = X.AnonymousClass7TG.A0D(r14, r2)
            X.NMH.super.onSuccess(r14)
            java.lang.Object r2 = r1.A01
            X.OAS r2 = (X.OAS) r2
            java.lang.Object r3 = r1.A02
            X.OTt r3 = (X.C70972OTt) r3
            X.NKT r2 = r2.A00
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x01a3
            X.DbZ.A17(r2)
            com.instagram.common.session.UserSession r1 = r2.A00
            if (r1 != 0) goto L_0x0197
            java.lang.String r0 = "userSession"
            goto L_0x0628
        L_0x0197:
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            X.Oss r1 = new X.Oss
            r1.<init>(r3)
            r2.A00(r1)
        L_0x01a3:
            r1 = -1353194427(0xffffffffaf57e445, float:-1.9635234E-10)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1353682442(0xffffffffaf5071f6, float:-1.8957977E-10)
            goto L_0x06ac
        L_0x01ae:
            r0 = -1370475092(0xffffffffae5035ac, float:-4.7341395E-11)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 471583387(0x1c1bca9b, float:5.154706E-22)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r3 = r1.A01
            android.content.Context r3 = (android.content.Context) r3
            X.6ap r2 = X.DbS.A0a()
            r1 = 2131975602(0x7f135db2, float:1.95883E38)
            X.DbS.A19(r3, r2, r1)
            r2.A06()
            X.Dbb.A1Q(r2)
            r1 = 2128441214(0x7edd6f7e, float:1.4716914E38)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -262920923(0xfffffffff0542525, float:-2.626229E29)
            goto L_0x06ac
        L_0x01db:
            r0 = -423538869(0xffffffffe6c14f4b, float:-4.564397E23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHW r14 = (X.NHW) r14
            r2 = 516214694(0x1ec4cfa6, float:2.0838189E-20)
            int r2 = X.AnonymousClass0fD.A03(r2)
            java.lang.String r3 = r14.A06
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r4 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A01
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r5 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A02
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r6 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A0A
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r7 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A09
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r8 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A08
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r9 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A04
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r10 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A03
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r11 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A05
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r12 = X.C70330O2i.A00(r3)
            java.lang.String r3 = r14.A07
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r13 = X.C70330O2i.A00(r3)
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r3 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r1.A02
            X.C66581MXm.A1Q(r1, r3)
            r1 = -71958466(0xfffffffffbb6003e, float:-1.8900059E36)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -441415652(0xffffffffe5b0881c, float:-1.0420591E23)
            goto L_0x06ac
        L_0x023c:
            r0 = -495313077(0xffffffffe27a1f4b, float:-1.1534852E21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1159815262(0xffffffffbade9fa2, float:-0.001698483)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r13 = 0
            X.0qQ.A0B(r14, r13)
            X.NMH.super.onSuccess(r14)
            java.lang.Object r10 = r1.A02
            X.OC1 r10 = (X.OC1) r10
            com.instagram.common.session.UserSession r2 = r10.A00
            X.2Dm r8 = X.1bJ.A00(r2)
            java.lang.Object r9 = r1.A01
            X.MbG r9 = (X.C66709MbG) r9
            java.lang.Object r6 = r9.A03
            com.instagram.model.direct.DirectThreadKey r6 = (com.instagram.model.direct.DirectThreadKey) r6
            long r1 = r9.A01
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r4 = 10
            X.JwG r3 = new X.JwG
            r3.<init>((java.lang.Object) r7, (int) r4)
            r8.FLt(r3, r6)
            X.OVO r8 = r10.A01
            X.6ap r7 = X.DbS.A0a()
            android.content.Context r10 = r8.A02
            r12 = 2131959576(0x7f131f18, float:1.9555796E38)
            r3 = 1
            java.util.Calendar r4 = X.C14240TsN.A02
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            r4 = 2
            java.lang.Integer r11 = X.VB1.A00(r11, r1)
            int r14 = r11.intValue()
            java.lang.String r11 = "Unsupported relative time period"
            switch(r14) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x02fa;
                case 2: goto L_0x02e2;
                case 3: goto L_0x02e6;
                case 4: goto L_0x02f2;
                default: goto L_0x0294;
            }
        L_0x0294:
            r11 = 2131957421(0x7f1316ad, float:1.9551425E38)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r15 = "MMM d"
        L_0x029b:
            java.lang.String r15 = X.C14240TsN.A04(r15, r1)
            r14[r13] = r15
            java.lang.String r1 = X.C14240TsN.A01(r10, r1)
            r14[r3] = r1
        L_0x02a7:
            java.lang.String r1 = r10.getString(r11, r14)
            X.0qQ.A07(r1)
            java.lang.String r1 = X.DbW.A0h(r10, r1, r12)
            r7.A0D = r1
            r1 = 2131959572(0x7f131f14, float:1.9555788E38)
            X.DbW.A0q(r10, r7, r1)
            r2 = 4
            X.PHj r1 = new X.PHj
            r1.<init>(r2, r9, r8)
            r7.A0A(r1)
            r7.A0L = r3
            r7.A06()
            X.DbY.A1N(r7)
            com.instagram.common.session.UserSession r3 = r8.A04
            X.0iw r2 = r8.A03
            X.0qQ.A0B(r6, r4)
            java.lang.String r1 = "set_reminder_success_toast_impression"
            X.OQ6.A00(r2, r3, r6, r1)
            r1 = -1033686435(0xffffffffc263325d, float:-56.799183)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 835946986(0x31d389ea, float:6.1565872E-9)
            goto L_0x06ac
        L_0x02e2:
            r11 = 2131975440(0x7f135d10, float:1.9587972E38)
            goto L_0x02e9
        L_0x02e6:
            r11 = 2131975473(0x7f135d31, float:1.958804E38)
        L_0x02e9:
            java.lang.String r1 = X.C14240TsN.A01(r10, r1)
            java.lang.Object[] r14 = new java.lang.Object[]{r1}
            goto L_0x02a7
        L_0x02f2:
            r11 = 2131976826(0x7f13627a, float:1.9590783E38)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r15 = "EEEE"
            goto L_0x029b
        L_0x02fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x02ff:
            r0 = -1547792663(0xffffffffa3be8ee9, float:-2.0660366E-17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 1844654235(0x6df3309b, float:9.407952E27)
            int r5 = X.AnonymousClass7TG.A0D(r14, r2)
            X.NMH.super.onSuccess(r14)
            java.lang.Object r8 = r1.A02
            X.OC1 r8 = (X.OC1) r8
            com.instagram.common.session.UserSession r2 = r8.A00
            X.2Dm r7 = X.1bJ.A00(r2)
            java.lang.Object r6 = r1.A01
            com.instagram.model.direct.DirectThreadKey r6 = (com.instagram.model.direct.DirectThreadKey) r6
            r4 = 0
            r3 = 1
            r2 = 10
            X.JwG r1 = new X.JwG
            r1.<init>((java.lang.Long) r4, (kotlin.jvm.internal.DefaultConstructorMarker) r4, (int) r3, (int) r2)
            r7.FLt(r1, r6)
            X.OVO r4 = r8.A01
            r3 = 2131959574(0x7f131f16, float:1.9555792E38)
            X.6ap r2 = X.DbS.A0a()
            android.content.Context r1 = r4.A02
            X.DbS.A19(r1, r2, r3)
            r2.A06()
            X.DbY.A1N(r2)
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0iw r2 = r4.A03
            java.lang.String r1 = "remove_reminder_success_toast_impression"
            X.OQ6.A00(r2, r3, r6, r1)
            r1 = 11982531(0xb6d6c3, float:1.6791102E-38)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1996360268(0xffffffff8901f5b4, float:-1.564334E-33)
            goto L_0x06ac
        L_0x0352:
            r0 = -96762067(0xfffffffffa3b872d, float:-2.434253E35)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.NH0 r14 = (X.NH0) r14
            r0 = 1495477011(0x59232b13, float:2.87048636E15)
            int r5 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.String r6 = r14.A00
            if (r6 == 0) goto L_0x039b
            int r0 = r6.length()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r4 = r1.A02
            X.OYl r4 = (X.C71013OYl) r4
            X.0eM r0 = r4.A04
            X.AnonymousClass7TF.A1N(r0)
            com.instagram.common.session.UserSession r3 = r4.A03
            X.60k r1 = X.C3018660j.A01(r3)
            X.NmB r0 = X.C69467NmB.JOIN
            r1.A0A(r0, r6)
            androidx.fragment.app.FragmentActivity r2 = r4.A00
            X.0iw r1 = r4.A02
            java.lang.String r0 = "inbox_notes_tray"
            X.1pE r0 = X.1pE.A01(r2, r1, r3, r0)
            X.DbZ.A1Z(r0, r6)
            X.DbV.A1R(r0)
        L_0x0390:
            r0 = -958635190(0xffffffffc6dc634a, float:-28209.645)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1052284650(0xffffffffc1476916, float:-12.463156)
            goto L_0x0567
        L_0x039b:
            java.lang.Object r3 = r1.A02
            X.OYl r3 = (X.C71013OYl) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.60k r0 = X.C3018660j.A01(r0)
            X.Nlc r2 = X.C69432Nlc.REQUESTED
            X.0wc r1 = r0.A05
            java.lang.String r0 = "direct_notes_group_request_to_join_chat_button"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x03bb
            X.C51965G9l.A19(r2, r1)
            r1.Cgf()
        L_0x03bb:
            r0 = 1
            X.C71013OYl.A01(r3, r0)
            goto L_0x0390
        L_0x03c0:
            r0 = -2125951818(0xffffffff81488cb6, float:-3.6835154E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1114102279(0xffffffffbd9825f9, float:-0.07429118)
            int r3 = X.AnonymousClass7TG.A0D(r14, r2)
            X.NMH.super.onSuccess(r14)
            java.lang.Object r2 = r1.A02
            X.P3i r2 = (X.C72369P3i) r2
            X.PvR r2 = r2.A05
            java.lang.Object r1 = r1.A01
            java.lang.String r1 = X.DbS.A0q(r1)
            r2.DwM(r1)
            r1 = -2130326417(0xffffffff8105cc6f, float:-2.4574916E-38)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 39708743(0x25de847, float:1.6303176E-37)
            goto L_0x06ac
        L_0x03eb:
            r0 = -1591806852(0xffffffffa11ef47c, float:-5.3856055E-19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1744855251(0xffffffff97ff9f2d, float:-1.651917E-24)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A02
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r2 = r2.A00
            android.app.Dialog r2 = (android.app.Dialog) r2
            if (r2 == 0) goto L_0x0406
            r2.dismiss()
        L_0x0406:
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 1006960460(0x3c04ff4c, float:0.008117508)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1703064088(0x6582b218, float:7.714911E22)
            goto L_0x06ac
        L_0x0416:
            r0 = -1316580636(0xffffffffb18692e4, float:-3.916613E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHO r14 = (X.NHO) r14
            r2 = 326759713(0x1379f521, float:3.1549076E-27)
            int r7 = X.AnonymousClass7TG.A0D(r14, r2)
            X.NMH.super.onSuccess(r14)
            int r9 = r14.A01
            java.lang.String r8 = r14.A02
            java.util.List r2 = r14.A04
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)
            java.util.HashMap r2 = r14.A03
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r3)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r2)
            java.lang.Object r5 = r1.A01
            X.PuI r5 = (X.C74402PuI) r5
            java.lang.Object r2 = r1.A02
            X.OLT r2 = (X.OLT) r2
            java.util.List r1 = r2.A04
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r1)
            r4.addAll(r3)
            java.util.HashMap r1 = r2.A03
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r1)
            r3.putAll(r6)
            int r1 = r2.A00
            X.OLT r2 = new X.OLT
            r2.<init>()
            r2.A00 = r1
            r2.A01 = r9
            r2.A02 = r8
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r4)
            r2.A04 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r3)
            r2.A03 = r1
            r5.DU4(r2)
            r1 = 87444954(0x5364dda, float:8.571898E-36)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -1101573310(0xffffffffbe575342, float:-0.21027854)
            goto L_0x06ac
        L_0x0485:
            r0 = -1864474494(0xffffffff90de6082, float:-8.7712254E-29)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.CG2 r14 = (X.CG2) r14
            r0 = -183366678(0xfffffffff5120bea, float:-1.8513598E32)
            int r3 = X.AnonymousClass7TG.A0D(r14, r0)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.util.List r0 = r14.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x04a8
            X.MmR r2 = X.C67350MmR.MUTUAL_FOLLOWERS
            java.util.List r0 = r14.A02
            r4.put(r2, r0)
        L_0x04a8:
            java.util.List r0 = r14.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x04b7
            X.MmR r2 = X.C67350MmR.FOLLOWERS
            java.util.List r0 = r14.A01
            r4.put(r2, r0)
        L_0x04b7:
            java.util.List r0 = r14.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x04c6
            X.MmR r2 = X.C67350MmR.CREATORS
            java.util.List r0 = r14.A00
            r4.put(r2, r0)
        L_0x04c6:
            java.lang.Object r0 = r1.A02
            X.ODk r0 = (X.C70613ODk) r0
            r0.A00 = r4
            java.lang.Object r0 = r1.A01
            X.O7G r0 = (X.O7G) r0
            X.NKQ r0 = r0.A00
            r0.A02()
            r0 = -1433225597(0xffffffffaa92b683, float:-2.6061453E-13)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1217320114(0x488ed4b2, float:292517.56)
            goto L_0x0567
        L_0x04e0:
            r0 = 1430104233(0x553da8a9, float:1.30332555E13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1234336647(0xffffffffb66d8479, float:-3.5392861E-6)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.Mpc r2 = X.C67539MpY.A00(r2)
            java.lang.Object r1 = r1.A01
            X.N2b r1 = (X.C68137N2b) r1
            r2.A01(r1)
            r1 = 1799660973(0x6b44a5ad, float:2.3773184E26)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 815732043(0x309f154b, float:1.1574824E-9)
            goto L_0x06ac
        L_0x0508:
            r0 = 748760432(0x2ca12d70, float:4.58094E-12)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r0 = 899942519(0x35a40877, float:1.2221416E-6)
            int r6 = X.AnonymousClass7TG.A0D(r14, r0)
            X.NMH.super.onSuccess(r14)
            java.lang.Object r3 = r1.A02
            X.NJC r3 = (X.NJC) r3
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x0528
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A14(r2, r0)
        L_0x0528:
            X.O76 r2 = r3.A05
            if (r2 != 0) goto L_0x0530
            java.lang.String r0 = "logger"
            goto L_0x0628
        L_0x0530:
            java.lang.Object r5 = r1.A01
            X.3sy r5 = (X.C254743sy) r5
            X.Oam r0 = r3.A04
            if (r0 != 0) goto L_0x053c
            java.lang.String r0 = "controller"
            goto L_0x0628
        L_0x053c:
            java.lang.String r4 = r0.A0A
            X.0wc r1 = r2.A00
            java.lang.String r0 = "existing_poll_submit_success"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.N0k r2 = new X.N0k
            r2.<init>()
            java.lang.String r1 = X.C66647MaG.A0B(r5)
            if (r1 == 0) goto L_0x056b
            java.lang.String r0 = "thread_id"
            r2.A06(r0, r1)
            java.lang.String r0 = "question_id"
            r2.A06(r0, r4)
            X.C66583MXo.A13(r3, r2)
            r0 = 1344432243(0x50226873, float:1.08990167E10)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1728516755(0xffffffff98f8ed6d, float:-6.4346236E-24)
        L_0x0567:
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x056b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0570:
            r0 = -1336864342(0xffffffffb05111aa, float:-7.605886E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -475093044(0xffffffffe3aea7cc, float:-6.443649E21)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r3 = r1.A02
            X.OYv r3 = (X.C71020OYv) r3
            X.0eM r2 = r3.A0E
            java.lang.Object r2 = r2.getValue()
            X.Mpc r2 = (X.C67542Mpc) r2
            java.lang.Object r1 = r1.A01
            X.N2b r1 = (X.C68137N2b) r1
            r2.A01(r1)
            X.C71020OYv.A00(r3)
            r1 = 1857694676(0x6eba2bd4, float:2.8808598E28)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1920961981(0xffffffff8d807243, float:-7.916117E-31)
            goto L_0x06ac
        L_0x059f:
            r0 = 1857310(0x1c571e, float:2.602646E-39)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -519349877(0xffffffffe10b598b, float:-1.6065935E20)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A02
            X.OYv r2 = (X.C71020OYv) r2
            X.0eM r2 = r2.A0E
            java.lang.Object r2 = r2.getValue()
            X.Mpc r2 = (X.C67542Mpc) r2
            java.lang.Object r1 = r1.A01
            X.N2b r1 = (X.C68137N2b) r1
            r2.A00(r1)
            r1 = -808769581(0xffffffffcfcb27d3, float:-6.8167695E9)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1334307546(0x4f87eada, float:4.5606308E9)
            goto L_0x06ac
        L_0x05cb:
            r0 = 864744153(0x338af2d9, float:6.4702995E-8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -267973453(0xfffffffff0070cb3, float:-1.6718331E29)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A02
            X.NJh r2 = (X.C68469NJh) r2
            X.JZf r5 = r2.A00
            if (r5 == 0) goto L_0x0603
            java.lang.Object r4 = r1.A01
            X.JZe r2 = r5.A0G
            r3 = 0
            java.util.ArrayList r1 = r2.A05
            r1.remove(r4)
            r2.clear()
            X.C59810JZe.A00(r2, r1)
            X.JZe r2 = r5.A0G
            r1 = 1
            r2.A01 = r1
            r2.A02 = r3
            r1 = 0
            r2.A00 = r1
            java.util.ArrayList r1 = r2.A05
            r1.clear()
            r5.ACw()
        L_0x0603:
            r1 = -1244280363(0xffffffffb5d5c9d5, float:-1.5928478E-6)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 391792099(0x175a45e3, float:7.052781E-25)
            goto L_0x06ac
        L_0x060e:
            r0 = 1078429206(0x40478616, float:3.117559)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CEf r14 = (X.C43813CEf) r14
            r2 = 1009269781(0x3c283c15, float:0.010268231)
            int r7 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r14, r6)
            X.N2y r2 = r14.A01
            if (r2 != 0) goto L_0x0630
            java.lang.String r0 = "response"
        L_0x0628:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0630:
            java.util.List r2 = r2.A02
            java.util.Iterator r9 = r2.iterator()
        L_0x0636:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0669
            java.lang.Object r8 = r9.next()
            X.DUU r8 = (X.DUU) r8
            com.instagram.api.schemas.StoryPromptTappableDataIntf r2 = r8.Bhq()
            java.lang.String r4 = r2.getText()
            java.lang.Object r2 = r1.A02
            X.Mts r2 = (X.C67739Mts) r2
            java.util.List r5 = r2.A05
            java.lang.String r3 = "\n"
            java.lang.String r2 = " "
            java.lang.String r4 = X.00p.A0g(r4, r3, r2, r6)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r2 = r8.Bhq()
            java.lang.String r3 = r2.getId()
            X.OBU r2 = new X.OBU
            r2.<init>(r4, r3)
            r5.add(r2)
            goto L_0x0636
        L_0x0669:
            java.lang.Object r8 = r1.A02
            X.Mts r8 = (X.C67739Mts) r8
            java.lang.Object r1 = r1.A01
            X.0rk r1 = (X.0rk) r1
            int r2 = r1.A00
            java.util.List r9 = r8.A05
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x069f
            int r5 = r2 / 2
            int r1 = r9.size()
            int r5 = r5 - r1
            r4 = 0
        L_0x0683:
            if (r4 >= r5) goto L_0x069f
            java.util.List r1 = r8.A02
            int r1 = r1.size()
            if (r4 >= r1) goto L_0x069c
            java.util.List r1 = r8.A02
            java.lang.String r3 = X.AnonymousClass7TE.A19(r1, r4)
            r2 = 0
            X.OBU r1 = new X.OBU
            r1.<init>(r3, r2)
            r9.add(r1)
        L_0x069c:
            int r4 = r4 + 1
            goto L_0x0683
        L_0x069f:
            boolean r1 = r8.A0A
            if (r1 == 0) goto L_0x06b0
            r1 = 637728206(0x2602f5ce, float:4.543594E-16)
        L_0x06a6:
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = 613395456(0x248fac00, float:6.2307744E-17)
        L_0x06ac:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x06b0:
            boolean r1 = X.AnonymousClass7TE.A1b(r9)
            if (r1 == 0) goto L_0x06d5
            java.lang.Object r1 = r9.get(r6)
            X.OBU r1 = (X.OBU) r1
            r8.A01 = r1
            X.05G r2 = r8.A08
            java.lang.Object r1 = r9.get(r6)
            X.OBU r1 = (X.OBU) r1
            java.lang.String r1 = r1.A01
        L_0x06c8:
            r2.Epw(r1)
            int r1 = r8.A00
            int r1 = r1 + 1
            r8.A00 = r1
            r1 = -1275821021(0xffffffffb3f48423, float:-1.1386171E-7)
            goto L_0x06a6
        L_0x06d5:
            r1 = 0
            r8.A01 = r1
            X.05G r2 = r8.A08
            java.util.List r1 = r8.A02
            java.lang.Object r1 = r1.get(r6)
            goto L_0x06c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMH.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        Set set;
        Set set2;
        boolean z;
        Object obj2;
        1K2 r2;
        Object obj3 = obj;
        switch (this.A00) {
            case 11:
                i = AnonymousClass0fD.A03(-326815373);
                C3265177b r22 = (C3265177b) obj3;
                int A0D = AnonymousClass7TG.A0D(r22, 2085033616);
                r22.A00.size();
                List list = r22.A00;
                0qQ.A07(list);
                Map map = (Map) this.A01;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C254703su A0a = C66580MXl.A0a(it);
                    map.put(A0a.A0h(), A0a);
                }
                DbS.A1U(this.A02);
                AnonymousClass0fD.A0A(-256286728, A0D);
                i2 = -424225558;
                break;
            case 14:
                i = AnonymousClass0fD.A03(917922772);
                C370538wd r23 = (C370538wd) obj3;
                int A0D2 = AnonymousClass7TG.A0D(r23, -347420117);
                AnonymousClass3U9 FKy = 2L2.A00((UserSession) this.A02).FKy(r23, r23.A0o, r23, true);
                OCD ocd = (OCD) this.A01;
                OYS.A00(ocd.A00, ocd.A01, FKy);
                AnonymousClass0fD.A0A(1355455480, A0D2);
                i2 = -1011333128;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-1029592476);
                B72 b72 = (B72) obj3;
                int A03 = AnonymousClass0fD.A03(-1975754471);
                0qQ.A0B(b72, 0);
                02m r9 = (02m) this.A01;
                r9.markerEnd(574170495, 2);
                List list2 = b72.A05.A05;
                0qQ.A07(list2);
                C67028Mh1 mh1 = (C67028Mh1) this.A02;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list2) {
                    C370538wd r0 = (C370538wd) next;
                    0qQ.A0A(r0);
                    UserSession userSession = mh1.A01;
                    AnonymousClass3U9 A002 = AnonymousClass3UD.A00(userSession, r0);
                    List list3 = r0.A07;
                    0qQ.A07(list3);
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (!AnonymousClass7F3.A01((C254703su) obj2, userSession.A06)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    A002.A0C((C254703su) obj2);
                    if (A002.Cdv(userSession)) {
                        A1C.add(next);
                    }
                }
                String A0n = C51972G9s.A0n();
                r9.markerStart(574175148);
                0eE r02 = AnonymousClass0t1.A01;
                UserSession userSession2 = mh1.A01;
                AnonymousClass16x AsZ = r02.A01(userSession2).A03.AsZ();
                if (AsZ != null) {
                    Boolean CQk = AsZ.CQk();
                    if (CQk != null) {
                        r9.markerAnnotate(574175148, "is_creator", CQk.booleanValue());
                    }
                    CreatorSegmentation Ase = AsZ.Ase();
                    if (Ase != null) {
                        r9.markerAnnotate(574175148, "creator_segmentation", Ase.toString());
                    }
                }
                MutedWordsFilterManager mutedWordsFilterManager = mh1.A03;
                r9.markerAnnotate(574175148, "is_hidden_words_available", mutedWordsFilterManager.A07());
                boolean A09 = mutedWordsFilterManager.A09();
                r9.markerAnnotate(574175148, "is_hidden_words_ready", A09);
                if (A09) {
                    LinkedHashMap A032 = MutedWordsFilterManager.A03(mutedWordsFilterManager, A1C);
                    r9.markerEnd(574175148, 2);
                    synchronized (mh1.A04) {
                        try {
                            set = mh1.A05;
                            set.clear();
                            set2 = mh1.A06;
                            set2.clear();
                            Iterator A0s = AnonymousClass7TF.A0s(A032);
                            while (A0s.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                                C370538wd r11 = (C370538wd) A1J.getKey();
                                C376639It r1 = (C376639It) A1J.getValue();
                                String str = r11.A1D;
                                0qQ.A07(str);
                                set.add(str);
                                boolean z2 = r1.A00;
                                if (z2) {
                                    String str2 = r11.A1D;
                                    0qQ.A07(str2);
                                    set2.add(str2);
                                }
                                String str3 = r11.A1D;
                                0qQ.A07(str3);
                                String str4 = r1.A02;
                                Boolean bool = r11.A0y;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                C3265677h.A0q(userSession2, str3, A0n, str4, z2, z);
                            }
                        } catch (Throwable th) {
                            AnonymousClass0fD.A0A(1491802303, A03);
                            throw th;
                        }
                    }
                    mh1.A09.set(set.size() + C51967G9n.A04((Number) mh1.A00.A0X(), 0));
                    mh1.A0A.set(set2.size());
                    mh1.A08.set(true);
                }
                0Tu r6 = 0Tu.A05;
                if (182.A06(r6, userSession2, 36311925559722809L) || 182.A06(r6, userSession2, 36317161123943225L)) {
                    B72 b722 = b72;
                    2L2.A00(userSession2).A0C.A0O(AnonymousClass43I.A00, b722, 2Eo.A04, C2611948q.ALL, false);
                    1Av A003 = 1Au.A00(userSession2);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY A0p = AnonymousClass7TE.A0p(A003);
                    A0p.E5c("last_message_requests_prefetch_timestamp", currentTimeMillis);
                    A0p.apply();
                }
                AnonymousClass1Nd.A00(userSession2).A00(new 2Kc((2EM) null, false, false, false));
                AnonymousClass0fD.A0A(-1258460195, A03);
                i2 = 1747782862;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(-1841180434);
                AnonymousClass3JC r24 = (AnonymousClass3JC) obj3;
                int A0D3 = AnonymousClass7TG.A0D(r24, -928780422);
                NMH.super.onSuccessInBackground(r24);
                Object obj4 = r24.A01;
                if ((obj4 == null || !(obj4 instanceof C250673ls)) && (r2 = (1K2) ((F2V) this.A02).A02.get(this.A01)) != null) {
                    r2.setException(new NetworkErrorException(""));
                }
                1K2 r12 = (1K2) ((F2V) this.A02).A02.get(this.A01);
                if (r12 != null) {
                    0qQ.A0C(obj4, "null cannot be cast to non-null type com.facebook.graphql.modelutil.GraphQLModel");
                    r12.set(obj4);
                }
                AnonymousClass0fD.A0A(384392895, A0D3);
                i2 = -880235704;
                break;
            default:
                NMH.super.onSuccessInBackground(obj3);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
