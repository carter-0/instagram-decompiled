package X;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.react.modules.base.IgReactQEModule;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class NMI extends 1P0 {
    public final int A00;
    public final Object A01;

    public NMI(OyN oyN, int i) {
        this.A00 = i;
        this.A01 = oyN;
    }

    public static void A00(1OC r1, Object obj, int i) {
        r1.A00 = new NMI(obj, i);
    }

    public final void onFail(C268654dm r11) {
        int i;
        int i2;
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        int i3;
        C69248NiA niA;
        switch (this.A00) {
            case 1:
                i2 = AnonymousClass7TG.A0D(r11, -433544744);
                NMI.super.onFail(r11);
                C67502Mow mow = (C67502Mow) this.A01;
                0ng nrd = new NRD(mow);
                JTO.A0E(mow.A09).postDelayed(nrd, ((long) ((AnonymousClass433) mow.A08.getValue()).A00()) * 2000);
                mow.A00 = nrd;
                i = -525870918;
                break;
            case 2:
                i2 = AnonymousClass0fD.A03(232749530);
                0KC.A0D("ArmadilloExpressReportMessagesLoader", "Failed to fetch messages from EB");
                ((0sP) this.A01).invoke(0sn.A00);
                i = 1713761016;
                break;
            case 3:
                i2 = AnonymousClass0fD.A03(-950074334);
                NMI.super.onFail(r11);
                ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment = (ImportMsgrIceBreakersFragment) this.A01;
                ImportMsgrIceBreakersFragment.A01(importMsgrIceBreakersFragment, C320156rr.ERROR);
                C70932OSf oSf = importMsgrIceBreakersFragment.A03;
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(TraceFieldType.ErrorCode, "FETCH_MSGR_QUESTIONS_REQUEST_FAILURE");
                C70932OSf.A00(oSf, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to load msgr icebreaker questions from server", A1E);
                i = -1745418895;
                break;
            case 4:
                i2 = AnonymousClass0fD.A03(2006909934);
                NMI.super.onFail(r11);
                ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment2 = (ImportMsgrIceBreakersFragment) this.A01;
                C310336ap A0a = DbS.A0a();
                A0a.A06();
                A0a.A05();
                A0a.A0H = "direct_faq_import_unable_to_import";
                DbS.A19(importMsgrIceBreakersFragment2.A00, A0a, 2131959268);
                A0a.A0D(importMsgrIceBreakersFragment2.A00.getString(2131972371));
                C72737PHr.A00(A0a, importMsgrIceBreakersFragment2, 3);
                A0a.A0L = true;
                DbY.A1N(A0a);
                C70932OSf oSf2 = importMsgrIceBreakersFragment2.A03;
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put(TraceFieldType.ErrorCode, "IMPORT_MSGR_QUESTIONS_REQUEST_FAILURE");
                C70932OSf.A00(oSf2, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to import selected msgr icebreakers to IG", A1E2);
                i = 1327942698;
                break;
            case 5:
                i2 = AnonymousClass0fD.A03(-67838003);
                0wb.A03("IceBreakerSettingManager", "Failed to fetch icebreakers from server");
                0nY.A00().ATE(new NRJ(this));
                i = 1932817721;
                break;
            case 6:
                i2 = AnonymousClass0fD.A03(1781673378);
                NMI.super.onFail(r11);
                OyN oyN = (OyN) this.A01;
                C74442Pux pux = oyN.A04;
                if (pux != null) {
                    oyN.A08 = !oyN.A08;
                    pux.CtL();
                }
                i = -2069080539;
                break;
            case 7:
                i2 = AnonymousClass0fD.A03(141178977);
                NMI.super.onFail(r11);
                OyN oyN2 = (OyN) this.A01;
                C74442Pux pux2 = oyN2.A03;
                if (pux2 != null) {
                    oyN2.A09 = !oyN2.A09;
                    pux2.CtL();
                }
                i = 233894915;
                break;
            case 8:
                i2 = AnonymousClass0fD.A03(857553201);
                NMI.super.onFail(r11);
                C74442Pux pux3 = ((OyN) this.A01).A02;
                if (pux3 != null) {
                    pux3.CtL();
                }
                i = 909843948;
                break;
            case 9:
                i2 = AnonymousClass7TG.A0D(r11, -123742100);
                NMI.super.onFail(r11);
                C66777McN mcN = (C66777McN) this.A01;
                mcN.A03 = true;
                mcN.A04.A00(new C67583MqH());
                i = 1417643181;
                break;
            case 10:
                i2 = AnonymousClass0fD.A03(1501884003);
                ((P1Z) this.A01).A02 = AnonymousClass05K.A0C;
                i = -1172818666;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i2 = AnonymousClass7TG.A0D(r11, -87181173);
                NMI.super.onFail(r11);
                NKI nki = (NKI) this.A01;
                NKI.A07(nki, C320156rr.ERROR);
                C59689JTv.A0E(nki.getContext(), "network_error");
                i = -2100211971;
                break;
            case 13:
                i2 = AnonymousClass7TG.A0D(r11, -1494045370);
                NMI.super.onFail(r11);
                C59689JTv.A0B(((Fragment) this.A01).getContext(), "network_error");
                i = -1976098810;
                break;
            case 14:
                i2 = AnonymousClass0fD.A03(-721903040);
                0qQ.A0B(r11, 0);
                NMI.super.onFail(r11);
                NJC njc = ((C71067Oam) this.A01).A02;
                if (njc != null) {
                    C59689JTv.A01(njc.requireContext(), "direct_poll_message_details_error", 2131960017, 0);
                    DbX.A14(njc.requireContext(), AnonymousClass37D.A00);
                }
                i = -1152411464;
                break;
            case 17:
                i2 = AnonymousClass7TG.A0D(r11, 623616420);
                NMI.super.onFail(r11);
                i = 964817887;
                break;
            case 19:
                i2 = AnonymousClass0fD.A03(1293366735);
                C70786OLg oLg = (C70786OLg) this.A01;
                oLg.A00 = AnonymousClass05K.A0C;
                oLg.A02.A00.A00();
                i = -266195346;
                break;
            case 20:
                i2 = AnonymousClass0fD.A03(-81358935);
                C70787OLh oLh = (C70787OLh) this.A01;
                oLh.A00 = AnonymousClass05K.A0C;
                C68477NJu.A02(oLh.A02.A00);
                i = 61622996;
                break;
            case 21:
                i2 = AnonymousClass7TG.A0D(r11, -920769859);
                AnonymousClass1XT r3 = (AnonymousClass1XT) r11.A00();
                AnonymousClass67Z r2 = (AnonymousClass67Z) this.A01;
                if (r3 != null) {
                    num = Integer.valueOf(r3.getStatusCode());
                } else {
                    num = null;
                }
                String valueOf = String.valueOf(num);
                if (r3 != null) {
                    str = r3.getErrorMessage();
                    str2 = r3.getErrorType();
                    str3 = r3.getErrorTitle();
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                C72176Oxl.A02(r2, new C47124Dr1(valueOf, str, str2, str3, (String) null, r11 instanceof C268674do));
                i = 1677316109;
                break;
            case 22:
                i2 = AnonymousClass7TG.A0D(r11, 1961215182);
                AnonymousClass1XT r32 = (AnonymousClass1XT) r11.A00();
                AnonymousClass67Z r22 = (AnonymousClass67Z) this.A01;
                if (r32 != null) {
                    num2 = Integer.valueOf(r32.getStatusCode());
                } else {
                    num2 = null;
                }
                String valueOf2 = String.valueOf(num2);
                if (r32 != null) {
                    str4 = r32.getErrorMessage();
                    str5 = r32.getErrorType();
                    str6 = r32.getErrorTitle();
                } else {
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                C72176Oxl.A02(r22, new C47124Dr1(valueOf2, str4, str5, str6, (String) null, r11 instanceof C268674do));
                i = 86270001;
                break;
            case 24:
                i2 = AnonymousClass0fD.A03(1300289480);
                C70718OHn oHn = ((O7I) this.A01).A00;
                oHn.A04 = false;
                oHn.A02 = true;
                oHn.A06.APp();
                i = -327924925;
                break;
            case 25:
                i2 = AnonymousClass0fD.A03(-1776408718);
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                if (!directVisualMessageViewerController.A0e.isFinishing()) {
                    directVisualMessageViewerController.A0T = false;
                    OCJ ocj = directVisualMessageViewerController.A0I;
                    if (ocj != null) {
                        DirectVisualMessageViewerController directVisualMessageViewerController2 = ocj.A00;
                        if (!directVisualMessageViewerController2.A0e.isFinishing()) {
                            DirectVisualMessageViewerController.A0O(directVisualMessageViewerController2, ocj.A01);
                        }
                    }
                    i = -1421581292;
                    break;
                } else {
                    i = 1713872757;
                    break;
                }
            case 27:
                i2 = AnonymousClass0fD.A03(1631083784);
                DbU.A0z(((PJ2) this.A01).A00, 2131973421);
                i = 1722567885;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i2 = AnonymousClass7TG.A0D(r11, -1116983798);
                NMI.super.onFail(r11);
                C72197OyI oyI = (C72197OyI) this.A01;
                Toast toast = oyI.A00;
                if (toast != null) {
                    toast.cancel();
                }
                oyI.A00 = null;
                C72197OyI.A00(oyI, (NHB) r11.A00());
                i = -1568507695;
                break;
            case 31:
                i2 = AnonymousClass7TG.A0D(r11, 1690259239);
                Throwable A012 = r11.A01();
                if (A012 != null) {
                    OLH olh = (OLH) this.A01;
                    Context context = olh.A00;
                    String A16 = AnonymousClass7TE.A16(context, 2131964983);
                    C310336ap A0a2 = DbS.A0a();
                    A0a2.A0D = A16;
                    A0a2.A06();
                    A0a2.A05();
                    A0a2.A0H = "auto_enroll_limited_interactions_retry";
                    DbW.A0q(context, A0a2, 2131972371);
                    A0a2.A0L = true;
                    C72737PHr.A00(A0a2, olh, 10);
                    Dbb.A1Q(A0a2);
                    0Aj A0e = AnonymousClass7TE.A0e(olh.A01.A00, "limits_feature_api_call");
                    if (A0e.isSampled()) {
                        if (!(A012 instanceof C69248NiA) || (niA = (C69248NiA) A012) == null) {
                            i3 = -1;
                        } else {
                            i3 = niA.A00;
                        }
                        A0e.A9F(TraceFieldType.ErrorCode, DbV.A0p(A0e, "surface_type", "mass_harassment_auto_enroll_qp", i3));
                        A0e.AAJ("error_info", A012.getMessage());
                        A0e.Cgf();
                    }
                }
                i = -94011660;
                break;
            case 33:
                i2 = AnonymousClass0fD.A03(2140483190);
                i = 2038753290;
                break;
            default:
                NMI.super.onFail(r11);
                return;
        }
        AnonymousClass0fD.A0A(i, i2);
    }

    public final void onFailInBackground(C268654dm r6) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass7TG.A0D(r6, 73807814);
                NMI.super.onFailInBackground(r6);
                AnonymousClass67Z r2 = (AnonymousClass67Z) this.A01;
                if (((AtomicReference) r2.A00).get() != 1af.A01) {
                    r2.A02(C257443xP.A00(r6.A00()));
                    r2.A00();
                }
                i2 = -1017971248;
                break;
            case 26:
                i = AnonymousClass7TG.A0D(r6, 887706813);
                1XP r0 = (1XP) r6.A00();
                if (r0 == null || (str = r0.getErrorMessage()) == null) {
                    str = "";
                }
                DbT.A1Q(0wj.A01, 002.A0R("Could not load pending threads: ", str), 20134884);
                i2 = -1677328336;
                break;
            case 28:
                i = AnonymousClass0fD.A03(64838108);
                ((C67383Mmz) this.A01).A02.A03();
                i2 = 887865945;
                break;
            default:
                NMI.super.onFailInBackground(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(1679063863);
                NMI.super.onFinish();
                i2 = -2137817201;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-2145548729);
                NMI.super.onFinish();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, C320156rr.GONE);
                i2 = -11418643;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-70717658);
                NMI.super.onFinish();
                ((OyN) this.A01).A01 = null;
                i2 = -444431482;
                break;
            case 7:
                i = AnonymousClass0fD.A03(2089163929);
                NMI.super.onFinish();
                i2 = 1051414131;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-1238915196);
                i2 = -755386286;
                break;
            case 13:
                i = AnonymousClass0fD.A03(-152919575);
                AnonymousClass6ST r0 = ((NJ3) this.A01).A0J;
                if (r0 != null) {
                    r0.hide();
                    i2 = -1401110636;
                    break;
                } else {
                    0qQ.A0F("progressDialog");
                    throw AnonymousClass00P.createAndThrow();
                }
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(429618296);
                NMI.super.onFinish();
                ((C72197OyI) this.A01).A03 = null;
                i2 = -1039116229;
                break;
            case 34:
                i = AnonymousClass0fD.A03(-1159105590);
                P4C p4c = (P4C) this.A01;
                C14625TzX tzX = ((ReelDashboardFragment) p4c.A01).mListAdapter;
                C14629Tzb tzb = (C14629Tzb) tzX.A0C.get(((C255773uh) p4c.A02).A0j);
                if (tzb != null) {
                    tzb.A0j.A07();
                }
                i2 = 1314255513;
                break;
            default:
                NMI.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(298494106);
                NMI.super.onStart();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, C320156rr.LOADING);
                i2 = 1739732791;
                break;
            case 4:
                i = AnonymousClass0fD.A03(2120953649);
                NMI.super.onStart();
                ImportMsgrIceBreakersFragment.A01((ImportMsgrIceBreakersFragment) this.A01, C320156rr.LOADING);
                i2 = 570882297;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(1891589771);
                NMI.super.onStart();
                NKI.A08((NKI) this.A01, true);
                i2 = 2109935077;
                break;
            default:
                NMI.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r1v64, types: [X.Npv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.Npu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v94, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0847, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x084e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b22, code lost:
        if (r1 == false) goto L_0x0b24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b3d, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b40, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0c27, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0c2a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0e99, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0e9c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x07e4  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0845 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r74) {
        /*
            r73 = this;
            r2 = r73
            r7 = r74
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0c57;
                case 2: goto L_0x0c2b;
                case 3: goto L_0x0b7b;
                case 4: goto L_0x0b41;
                case 5: goto L_0x0aef;
                case 6: goto L_0x0ab4;
                case 7: goto L_0x0a88;
                case 8: goto L_0x0a46;
                case 9: goto L_0x09e7;
                case 10: goto L_0x08cb;
                case 11: goto L_0x08a3;
                case 12: goto L_0x06e9;
                case 13: goto L_0x06bf;
                case 14: goto L_0x058e;
                case 15: goto L_0x0537;
                case 16: goto L_0x0515;
                case 17: goto L_0x0433;
                case 18: goto L_0x0413;
                case 19: goto L_0x03be;
                case 20: goto L_0x036a;
                case 21: goto L_0x0343;
                case 22: goto L_0x031c;
                case 23: goto L_0x0009;
                case 24: goto L_0x0211;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x01ec;
                case 28: goto L_0x0009;
                case 29: goto L_0x0120;
                case 30: goto L_0x00f9;
                case 31: goto L_0x00a7;
                case 32: goto L_0x003a;
                case 33: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.NMI.super.onSuccess(r7)
            return
        L_0x000d:
            r0 = 325668335(0x13694def, float:2.9447159E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1805269056(0xffffffff9465c7c0, float:-1.1600939E-26)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            X.6ap r2 = X.DbV.A0W()
            r1 = 2131975574(0x7f135d96, float:1.9588244E38)
            X.DbS.A19(r3, r2, r1)
            r2.A06()
            X.Dbb.A1Q(r2)
            r1 = -575806700(0xffffffffddade314, float:-1.56623507E18)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -67983329(0xfffffffffbf2a81f, float:-2.5198915E36)
            goto L_0x0e99
        L_0x003a:
            r0 = 1238978161(0x49d94e71, float:1780174.1)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.7ax r7 = (X.C334247ax) r7
            r0 = -1546366968(0xffffffffa3d45008, float:-2.301898E-17)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.util.List r6 = r7.getItems()
            java.util.Iterator r1 = r6.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            boolean r0 = r0.isVerified()
            if (r0 != 0) goto L_0x0052
            r1.remove()
            goto L_0x0052
        L_0x0066:
            java.lang.Object r4 = r2.A01
            X.NKX r4 = (X.NKX) r4
            java.util.List r2 = r4.A0H
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0087
            r1 = 0
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0087
            r2.clear()
            com.instagram.igds.components.button.IgdsButton r0 = r4.A03
            if (r0 == 0) goto L_0x0087
            r0.setEnabled(r1)
        L_0x0087:
            X.NL3 r1 = r4.A07
            java.util.List r0 = r1.A03
            r0.clear()
            r0.addAll(r6)
            java.util.List r0 = r1.A02
            r0.clear()
            r0.addAll(r2)
            X.NL3.A00(r1)
            r0 = 1755403362(0x68a15462, float:6.094861E24)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -737436331(0xffffffffd40b9d55, float:-2.39856019E12)
            goto L_0x0b3d
        L_0x00a7:
            r0 = -467886844(0xffffffffe41c9d04, float:-1.1556025E22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -388926307(0xffffffffe8d1749d, float:-7.913006E24)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r6 = r2.A01
            X.OLH r6 = (X.OLH) r6
            android.content.Context r5 = r6.A00
            r3 = 2131964984(0x7f133438, float:1.9566765E38)
            r1 = 48
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = X.DbY.A0c(r5, r1, r3)
            X.6ap r1 = X.DbS.A0a()
            r1.A0D = r2
            r1.A06()
            X.Dbb.A1Q(r1)
            X.OAR r1 = r6.A01
            X.0wc r2 = r1.A00
            java.lang.String r1 = "limits_feature_api_call"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x00ee
            java.lang.String r2 = "mass_harassment_auto_enroll_qp"
            java.lang.String r1 = "surface_type"
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x00ee:
            r1 = 389948260(0x173e2364, float:6.143698E-25)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 576866345(0x22624829, float:3.0666913E-18)
            goto L_0x0e99
        L_0x00f9:
            r0 = -430701343(0xffffffffe65404e1, float:-2.5030792E23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r7 = (X.AnonymousClass3JC) r7
            r1 = -27883827(0xfffffffffe5686cd, float:-7.128868E37)
            int r3 = X.AnonymousClass7TG.A0D(r7, r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r2 = r2.A01
            X.1aV r2 = (X.1aV) r2
            java.lang.Object r1 = r7.A01
            r2.accept(r1)
            r1 = -81654830(0xfffffffffb220bd2, float:-8.413918E35)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1171403669(0xffffffffba2dcc6b, float:-6.629887E-4)
            goto L_0x0e99
        L_0x0120:
            r0 = 191634854(0xb6c1da6, float:4.5474252E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.NHB r7 = (X.NHB) r7
            r0 = 204576709(0xc3197c5, float:1.3681255E-31)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r4 = r2.A01
            r6 = r4
            X.OyI r6 = (X.C72197OyI) r6
            android.widget.Toast r0 = r6.A00
            if (r0 == 0) goto L_0x013f
            r0.cancel()
        L_0x013f:
            r11 = 0
            r6.A00 = r11
            X.NHW r0 = r7.A00
            if (r0 == 0) goto L_0x0158
            X.OFe r0 = r7.A01
            if (r0 == 0) goto L_0x0158
            X.C72197OyI.A00(r6, r7)
        L_0x014d:
            r0 = -1841594585(0xffffffff923b7f27, float:-5.9163523E-28)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2143760162(0x7fc72f22, float:NaN)
            goto L_0x0b3d
        L_0x0158:
            monitor-enter(r4)
            X.1Av r10 = r6.A06     // Catch:{ IOException -> 0x01de }
            java.lang.String r9 = "interop_reachability_setting"
            java.lang.String r0 = ""
            X.0xa r8 = r10.A01     // Catch:{ IOException -> 0x01de }
            java.lang.String r0 = r8.getString(r9, r0)     // Catch:{ IOException -> 0x01de }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x01de }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x01de }
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r7 = X.OXN.parseFromJson(r0)     // Catch:{ IOException -> 0x01de }
            X.0s0 r2 = r10.A5x     // Catch:{ IOException -> 0x01de }
            X.0YZ[] r1 = X.1Av.A8a     // Catch:{ IOException -> 0x01de }
            r0 = 301(0x12d, float:4.22E-43)
            java.lang.String r2 = X.DbV.A13(r10, r2, r1, r0)     // Catch:{ IOException -> 0x01de }
            if (r2 == 0) goto L_0x017f
            X.DbX.A1U(r8, r9, r2)     // Catch:{ IOException -> 0x01de }
        L_0x017f:
            X.0xY r1 = r8.AR4()     // Catch:{ IOException -> 0x01de }
            java.lang.String r0 = "interop_reachability_setting_PENDING"
            r1.ED3(r0)     // Catch:{ IOException -> 0x01de }
            r1.apply()     // Catch:{ IOException -> 0x01de }
            if (r2 == 0) goto L_0x0196
            X.16F r0 = X.16P.A00(r2)     // Catch:{ IOException -> 0x01de }
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r10 = X.OXN.parseFromJson(r0)     // Catch:{ IOException -> 0x01de }
            goto L_0x01a9
        L_0x0196:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r10 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel     // Catch:{ IOException -> 0x01de }
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x01de }
        L_0x01a9:
            java.util.Set r0 = r6.A07     // Catch:{ all -> 0x01dc }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01dc }
        L_0x01af:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01dc }
            X.OAI r0 = (X.OAI) r0     // Catch:{ all -> 0x01dc }
            X.NMJ r0 = r0.A00     // Catch:{ all -> 0x01dc }
            X.NMJ.A00(r0)     // Catch:{ all -> 0x01dc }
            goto L_0x01af
        L_0x01c1:
            java.util.Set r0 = r6.A08     // Catch:{ IOException -> 0x01de }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x01de }
        L_0x01c7:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x01de }
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x01de }
            X.Puk r1 = (X.C74430Puk) r1     // Catch:{ IOException -> 0x01de }
            java.lang.String r0 = r6.A05     // Catch:{ IOException -> 0x01de }
            X.0qQ.A0A(r10)     // Catch:{ IOException -> 0x01de }
            r1.FLk(r10, r7, r0)     // Catch:{ IOException -> 0x01de }
            goto L_0x01c7
        L_0x01dc:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x01de }
        L_0x01de:
            r2 = move-exception
            java.lang.String r1 = "DirectMessagesInteropOptionsUpdateHelper"
            java.lang.String r0 = "Error while parsing DirectMessagesInteropOptionsViewModel"
            X.0wb.A06(r1, r0, r2)     // Catch:{ all -> 0x01e9 }
        L_0x01e6:
            monitor-exit(r4)
            goto L_0x014d
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01ec:
            r0 = 299365222(0x11d7f366, float:3.4071025E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -583021364(0xffffffffdd3fcccc, float:-8.6379035E17)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r2.A01
            X.PJ2 r1 = (X.PJ2) r1
            android.content.Context r2 = r1.A00
            r1 = 2131973422(0x7f13552e, float:1.958388E38)
            X.DbU.A0z(r2, r1)
            r1 = -1341345776(0xffffffffb00cb010, float:-5.1181903E-10)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 804173973(0x2feeb895, float:4.34231E-10)
            goto L_0x0e99
        L_0x0211:
            r0 = 1538845571(0x5bb8eb83, float:1.04100687E17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.NHH r7 = (X.NHH) r7
            r0 = 2115452986(0x7e17403a, float:5.026173E37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r12 = 0
            X.0qQ.A0B(r7, r12)
            java.lang.Object r8 = r2.A01
            X.O7I r8 = (X.O7I) r8
            java.util.List r0 = r7.A01
            boolean r6 = r7.A02
            java.lang.String r5 = r7.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x0233:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x026e
            java.lang.Object r10 = r7.next()
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            X.OHn r2 = r8.A00
            X.N4P r1 = r2.A00
            if (r1 == 0) goto L_0x0233
            java.lang.String r0 = r10.getId()
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0233
            java.util.Set r0 = r2.A07
            r11 = 0
            X.N9q r9 = new X.N9q
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.add(r9)
            goto L_0x0233
        L_0x026e:
            X.OHn r0 = r8.A00
            r0.A04 = r12
            r0.A03 = r6
            r0.A01 = r5
            X.NKQ r2 = r0.A06
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x0311
            X.N4P r1 = r2.A0A
            if (r1 == 0) goto L_0x0292
            X.OHn r0 = r2.A07
            if (r0 != 0) goto L_0x028a
            java.lang.String r7 = "pendingChannelMembersController"
            goto L_0x0847
        L_0x028a:
            java.util.Set r0 = r0.A07
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r1.A00 = r0
        L_0x0292:
            X.N4P r0 = r2.A0A
            if (r0 == 0) goto L_0x0311
            java.util.List r6 = r0.A00
            if (r6 == 0) goto L_0x0311
            X.0eM r0 = r2.A0L
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r0)
            X.0sn r0 = X.0sn.A00
            X.O7H r5 = new X.O7H
            r5.<init>(r2)
            boolean r17 = X.AnonymousClass7TF.A1U(r12, r13, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02bd
            X.C68303N9q.A00(r2, r1)
            goto L_0x02b3
        L_0x02bd:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x02c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A2B()
            if (r0 == 0) goto L_0x02c5
            r7.add(r1)
            goto L_0x02c5
        L_0x02dc:
            java.util.ArrayList r14 = X.00k.A0U(r7)
            boolean r0 = X.DbT.A1b(r14)
            if (r0 != 0) goto L_0x02ec
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x0311
        L_0x02ec:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x02f4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fe
            X.C68303N9q.A00(r2, r1)
            goto L_0x02f4
        L_0x02fe:
            r14.addAll(r2)
            r15 = 0
            r18 = r12
            X.1OC r1 = X.C320126ro.A04(r13, r14, r15, r17, r18)
            r0 = 16
            A00(r1, r5, r0)
            X.1ES.A03(r1)
        L_0x0311:
            r0 = -689216218(0xffffffffd6eb6526, float:-1.29409831E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1354931228(0x50c29c1c, float:2.61200855E10)
            goto L_0x0b3d
        L_0x031c:
            r0 = -589004903(0xffffffffdce47f99, float:-5.14532718E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -784087411(0xffffffffd143c68d, float:-5.255311E10)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            X.C66990MgO.A00(r2, r1)
            r2.A00()
            r1 = -1683617495(0xffffffff9ba60929, float:-2.7468316E-22)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1583982077(0xffffffffa1965a03, float:-1.0188221E-18)
            goto L_0x0e99
        L_0x0343:
            r0 = 462528145(0x1b919e91, float:2.409071E-22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1662270078(0x63143a7e, float:2.734333E21)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r2.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            X.C66990MgO.A00(r2, r1)
            r2.A00()
            r1 = 424227869(0x1949341d, float:1.0401981E-23)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -22444846(0xfffffffffea984d2, float:-1.1266459E38)
            goto L_0x0e99
        L_0x036a:
            r0 = -467317808(0xffffffffe4254bd0, float:-1.2196703E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.NHa r7 = (X.C68415NHa) r7
            r0 = 2061941035(0x7ae6b92b, float:5.9899197E35)
            int r6 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r2 = r2.A01
            X.OLh r2 = (X.C70787OLh) r2
            X.PE0 r0 = r7.A01
            r1 = 1
            if (r0 == 0) goto L_0x03bb
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x03bb
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0389:
            r2.A00 = r0
            X.O7U r5 = r2.A02
            com.instagram.common.session.UserSession r1 = r2.A01
            java.util.List r0 = r7.getItems()
            java.util.ArrayList r4 = X.O0E.A00(r1, r0)
            X.PE0 r0 = r7.A01
            if (r0 == 0) goto L_0x03b8
            java.lang.String r2 = r0.A00
        L_0x039d:
            java.lang.String r7 = "resharedContentResults"
            X.NJu r1 = r5.A00
            java.util.ArrayList r0 = r1.A03
            if (r0 == 0) goto L_0x0847
            r0.addAll(r4)
            r1.A02 = r2
            X.C68477NJu.A02(r1)
            r0 = -1929912205(0xffffffff8cf7e073, float:-3.819146E-31)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1670476874(0xffffffff9c6e8bb6, float:-7.8928166E-22)
            goto L_0x0b3d
        L_0x03b8:
            java.lang.String r2 = ""
            goto L_0x039d
        L_0x03bb:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0389
        L_0x03be:
            r0 = -1470791499(0xffffffffa85580b5, float:-1.1851784E-14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.NHa r7 = (X.C68415NHa) r7
            r0 = 1106360486(0x41f1b8a6, float:30.21516)
            int r6 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r2 = r2.A01
            X.OLg r2 = (X.C70786OLg) r2
            X.PDz r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0410
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x0410
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x03dd:
            r2.A00 = r0
            X.O7V r4 = r2.A02
            com.instagram.common.session.UserSession r1 = r2.A01
            java.util.List r0 = r7.getItems()
            java.util.ArrayList r3 = X.O0E.A00(r1, r0)
            X.PDz r0 = r7.A00
            if (r0 == 0) goto L_0x040e
            int r2 = r0.A00
        L_0x03f1:
            java.lang.String r7 = "messageResults"
            X.NJV r1 = r4.A00
            java.util.ArrayList r0 = r1.A08
            if (r0 == 0) goto L_0x0847
            r0.addAll(r3)
            r1.A00 = r2
            r1.A00()
            r0 = 1126327478(0x432264b6, float:162.3934)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -117809096(0xfffffffff8fa6038, float:-4.0625805E34)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x040e:
            r2 = -1
            goto L_0x03f1
        L_0x0410:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x03dd
        L_0x0413:
            r0 = 153716011(0x929852b, float:2.040525E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1087742475(0x40d5a20b, float:6.6760306)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r2.A01
            X.P3i r1 = (X.C72369P3i) r1
            X.C72369P3i.A00(r1)
            r1 = 1949176905(0x742e1449, float:5.5167913E31)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1807461115(0xffffffff94445505, float:-9.912238E-27)
            goto L_0x0e99
        L_0x0433:
            r0 = -1807520769(0xffffffff94436bff, float:-9.8662826E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CE9 r7 = (X.CE9) r7
            r1 = 1436034531(0x559825e3, float:2.09110612E13)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r8 = 0
            X.0qQ.A0B(r7, r8)
            java.lang.Object r6 = r2.A01
            X.Ma2 r6 = (X.C66633Ma2) r6
            X.Mi9 r2 = r6.A0u()
            java.lang.String r1 = "recommended_users_fetch_complete"
            r2.A0E(r1)
            X.PwH r1 = r7.A00
            if (r1 == 0) goto L_0x0511
            X.N5A r1 = (X.N5A) r1
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x04a3
            java.lang.Object r4 = X.00k.A0O(r1, r8)
            X.PwL r4 = (X.C74526PwL) r4
            if (r4 == 0) goto L_0x04a3
            X.N5E r4 = (X.N5E) r4
            X.Dre r1 = r4.A00
            if (r1 == 0) goto L_0x04a3
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x04a3
            java.lang.Object r1 = X.00k.A0O(r1, r8)
            X.PwS r1 = (X.C74533PwS) r1
            if (r1 == 0) goto L_0x04a3
            X.N5K r1 = (X.N5K) r1
            java.util.List r11 = r1.A00
            if (r11 == 0) goto L_0x04a3
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x04a3
            com.instagram.common.session.UserSession r3 = r6.A0p()
            X.0Tu r10 = X.0Tu.A05
            r1 = 36603699867292622(0x820adf000e13ce, double:3.2116654151202176E-306)
            int r3 = X.DbS.A04(r10, r3, r1)
            if (r3 != 0) goto L_0x04c6
            X.Mbh r3 = X.C66581MXm.A0U(r6)
            java.util.List r2 = r6.A0y
            X.0qQ.A0B(r2, r8)
            boolean r1 = r3.A0L
            r3.A0A(r2, r8, r1, r8)
        L_0x04a3:
            X.Mbh r2 = X.C66581MXm.A0U(r6)
            X.PwH r1 = r7.A00
            if (r1 == 0) goto L_0x0511
            X.N5A r1 = (X.N5A) r1
            java.util.List r1 = r1.A00
            r2.A09(r1)
            X.Mi9 r2 = r6.A0u()
            java.lang.String r1 = "recommended_users_loaded"
            r2.A0E(r1)
            r1 = -629866855(0xffffffffda74fe99, float:-1.72399569E16)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1109988861(0x422915fd, float:42.271473)
            goto L_0x0e99
        L_0x04c6:
            X.Mbh r9 = X.C66581MXm.A0U(r6)
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x04a3
            java.lang.String r4 = r4.A01
            java.lang.String r3 = "message_suggestions"
            if (r4 == 0) goto L_0x04a3
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x04a3
            com.instagram.common.session.UserSession r3 = r9.A0B
            int r10 = X.DbS.A04(r10, r3, r1)
            if (r10 == 0) goto L_0x04a3
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r11.iterator()
        L_0x04ec:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0507
            java.lang.Object r1 = r3.next()
            X.PwR r1 = (X.C74532PwR) r1
            X.Dt4 r1 = (X.C47217Dt4) r1
            com.instagram.user.model.User r2 = r1.A00
            if (r2 == 0) goto L_0x04ec
            com.instagram.model.direct.DirectShareTarget r1 = new com.instagram.model.direct.DirectShareTarget
            r1.<init>((com.instagram.user.model.User) r2)
            r4.add(r1)
            goto L_0x04ec
        L_0x0507:
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r4)
            boolean r1 = r9.A0L
            r9.A0A(r2, r10, r1, r8)
            goto L_0x04a3
        L_0x0511:
            java.lang.String r7 = "response"
            goto L_0x0847
        L_0x0515:
            r0 = -503396105(0xffffffffe1fec8f7, float:-5.8749425E20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1471828901(0x57ba53a5, float:4.09736827E14)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r2.A01
            X.O7H r1 = (X.O7H) r1
            X.NKQ r1 = r1.A00
            r1.APp()
            r1 = -629427065(0xffffffffda7bb487, float:-1.77121778E16)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1589675662(0x5ec0868e, float:6.9364659E18)
            goto L_0x0e99
        L_0x0537:
            r0 = 224636639(0xd63aedf, float:7.016027E-31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Gyy r7 = (X.C54074Gyy) r7
            r1 = 1029050077(0x3d560edd, float:0.05226027)
            int r9 = X.AnonymousClass7TG.A0D(r7, r1)
            java.util.List r1 = r7.A01
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0583
            java.lang.Object r8 = r2.A01
            X.NJY r8 = (X.NJY) r8
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel r6 = r8.A10
            java.util.List r1 = r7.A01
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x055f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r3 = r4.next()
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel r1 = new com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel
            r1.<init>(r3, r2)
            r5.add(r1)
            goto L_0x055f
        L_0x0576:
            r6.A01 = r5
            java.lang.String r1 = r7.A00
            r6.A00 = r1
            boolean r1 = r7.A03
            r6.A02 = r1
            X.NJY.A0F(r8)
        L_0x0583:
            r1 = -748770291(0xffffffffd35eac0d, float:-9.5636927E11)
            X.AnonymousClass0fD.A0A(r1, r9)
            r1 = 357125856(0x15494ee0, float:4.0653848E-26)
            goto L_0x0e99
        L_0x058e:
            r0 = 1118650488(0x42ad4078, float:86.625916)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHM r7 = (X.NHM) r7
            r1 = -1529182396(0xffffffffa4da8744, float:-9.477158E-17)
            int r5 = X.AnonymousClass7TG.A0D(r7, r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r6 = r2.A01
            X.Oam r6 = (X.C71067Oam) r6
            X.NJC r1 = r6.A02
            if (r1 == 0) goto L_0x06b4
            java.lang.String r3 = r7.A02
            java.lang.String r18 = ""
            if (r3 != 0) goto L_0x05b1
            r3 = r18
        L_0x05b1:
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x05b7
            r2 = r18
        L_0x05b7:
            X.N5b r1 = new X.N5b
            r1.<init>(r3, r2)
            r6.A03 = r1
            java.util.List r10 = r6.A0C
            r10.clear()
            java.util.List r1 = r7.A03
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r17 = r1.iterator()
        L_0x05cd:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0697
            java.lang.Object r13 = r17.next()
            X.OHQ r13 = (X.OHQ) r13
            long r3 = r13.A01
            java.lang.String r1 = r6.A0A
            r20 = r1
            java.lang.String r12 = r13.A02
            if (r12 != 0) goto L_0x05e5
            r12 = r18
        L_0x05e5:
            java.lang.String r9 = r13.A03
            if (r9 != 0) goto L_0x05eb
            r9 = r18
        L_0x05eb:
            boolean r1 = r13.A06
            r19 = r1
            boolean r1 = r6.A0F
            if (r1 == 0) goto L_0x0629
            java.util.List r1 = r13.A05
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x05fd:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x067d
            com.instagram.user.model.User r2 = X.DbT.A0k(r16)
            java.lang.String r15 = r2.getId()
            java.lang.String r14 = r2.getFullName()
            int r1 = r2.BIW()
            if (r1 != 0) goto L_0x0626
            java.lang.String r7 = r2.getUsername()
        L_0x0619:
            com.instagram.common.typedurl.ImageUrl r2 = r2.Bh3()
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r1 = new com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel
            r1.<init>(r2, r15, r14, r7)
            r8.add(r1)
            goto L_0x05fd
        L_0x0626:
            java.lang.String r7 = r6.A09
            goto L_0x0619
        L_0x0629:
            java.util.List r1 = r13.A04
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r1.iterator()
        L_0x0633:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0649
            java.lang.String r2 = X.AnonymousClass7TE.A18(r8)
            X.17i r1 = r6.A08
            com.instagram.user.model.User r1 = r1.A02(r2)
            if (r1 == 0) goto L_0x0633
            r7.add(r1)
            goto L_0x0633
        L_0x0649:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r16 = r7.iterator()
        L_0x0651:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x067d
            com.instagram.user.model.User r2 = X.DbT.A0k(r16)
            java.lang.String r15 = r2.getId()
            java.lang.String r14 = r2.getFullName()
            int r1 = r2.BIW()
            if (r1 != 0) goto L_0x067a
            java.lang.String r7 = r2.getUsername()
        L_0x066d:
            com.instagram.common.typedurl.ImageUrl r2 = r2.Bh3()
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r1 = new com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel
            r1.<init>(r2, r15, r14, r7)
            r8.add(r1)
            goto L_0x0651
        L_0x067a:
            java.lang.String r7 = r6.A09
            goto L_0x066d
        L_0x067d:
            int r2 = r13.A00
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r1 = new com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel
            r21 = r12
            r22 = r9
            r23 = r8
            r24 = r2
            r25 = r3
            r27 = r19
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r27)
            r11.add(r1)
            goto L_0x05cd
        L_0x0697:
            r10.addAll(r11)
            java.util.List r3 = r6.A0B
            r3.clear()
            boolean r1 = r6.A0E
            if (r1 == 0) goto L_0x06b1
            int r2 = r6.A00
            int r1 = r2 + 1
            r6.A00 = r1
            X.N5m r1 = new X.N5m
            r1.<init>(r2)
            r3.add(r1)
        L_0x06b1:
            X.C71067Oam.A01(r6)
        L_0x06b4:
            r1 = -1693768383(0xffffffff9b0b2541, float:-1.1509848E-22)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 860537917(0x334ac43d, float:4.7210268E-8)
            goto L_0x0e99
        L_0x06bf:
            r0 = 1841297902(0x6dbff9ee, float:7.426723E27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1863447158(0xffffffff90ee0d8a, float:-9.389531E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r2.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x06db
            r0 = -1
            r1.setResult(r0)
        L_0x06db:
            X.DbX.A1I(r2)
            r0 = -919034035(0xffffffffc938a74d, float:-756340.8)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -655041919(0xffffffffd8f4da81, float:-2.15375443E15)
            goto L_0x0b3d
        L_0x06e9:
            r0 = 521054041(0x1f0ea759, float:3.0208096E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.371 r7 = (X.AnonymousClass371) r7
            r1 = -213457965(0xfffffffff346e3d3, float:-1.5757684E31)
            int r17 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r3 = r2.A01
            X.NKI r3 = (X.NKI) r3
            X.2t9 r11 = r3.A03
            if (r11 == 0) goto L_0x0896
            java.lang.Object r1 = r7.FH3()
            X.BAm r1 = (X.C42012BAm) r1
            if (r1 == 0) goto L_0x0896
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x0896
            java.lang.Object r1 = r7.FH3()
            X.BAm r1 = (X.C42012BAm) r1
            java.util.List r1 = r1.A00
            java.util.ArrayList r15 = r3.A0O
            r15.clear()
            java.util.ArrayList r14 = r3.A0N
            r14.clear()
            java.util.Iterator r16 = r1.iterator()
        L_0x0727:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x088c
            java.lang.Object r2 = r16.next()
            X.N3D r2 = (X.N3D) r2
            long r6 = r2.A00
            java.lang.String r10 = java.lang.String.valueOf(r6)
            r22 = 0
            r24 = 0
            r32 = 0
            r37 = 0
            r41 = 0
            r44 = 0
            r51 = 0
            r56 = 0
            r9 = 1
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0q(r10, r9)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r63 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r61 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            java.lang.String r1 = r2.A05
            r18 = r1
            java.util.List r1 = r2.A07
            if (r1 == 0) goto L_0x076e
            java.lang.Object r1 = X.00k.A0J(r1)
            X.N3D r1 = (X.N3D) r1
            if (r1 != 0) goto L_0x076f
        L_0x076e:
            r1 = r2
        L_0x076f:
            boolean r4 = r3.A0F
            if (r4 == 0) goto L_0x087e
            X.0eM r4 = r3.A0Q
            X.0lg r8 = X.DbT.A0X(r4)
            X.0Tu r4 = X.0Tu.A05
            r6 = 36324222049726349(0x810cb000042f8d, double:3.034922517924464E-306)
            boolean r7 = X.182.A06(r4, r8, r6)
            r6 = 0
            X.9JL r4 = r2.A01
            if (r7 == 0) goto L_0x086a
            if (r4 == 0) goto L_0x079f
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x079f
            int r7 = r4.length()
            if (r7 == 0) goto L_0x079f
            X.9JL r7 = r1.A01
            if (r7 == 0) goto L_0x079b
            java.lang.String r6 = r7.A03
        L_0x079b:
            r51 = r4
            r32 = r6
        L_0x079f:
            java.lang.String r4 = r2.A03
            if (r4 == 0) goto L_0x07b1
            int r4 = r4.length()
            if (r4 == 0) goto L_0x07b1
            java.lang.String r44 = X.NKI.A03(r2, r3)
            java.lang.String r24 = X.NKI.A03(r1, r3)
        L_0x07b1:
            java.util.List r4 = r2.A08
            if (r4 == 0) goto L_0x07dc
            int r7 = r4.size()
            r6 = 2
            if (r7 < r6) goto L_0x07cc
            java.util.List r6 = r1.A08
            r13.clear()
            r13.addAll(r4)
            r12.clear()
            if (r6 == 0) goto L_0x07cc
            r12.addAll(r6)
        L_0x07cc:
            int r6 = r4.size()
            if (r6 != r9) goto L_0x07dc
            java.lang.String r56 = X.AnonymousClass7TE.A19(r4, r5)
            java.util.List r1 = r1.A08
            java.lang.String r37 = X.AnonymousClass7TE.A19(r1, r5)
        L_0x07dc:
            java.lang.String r1 = r2.A06
            boolean r4 = X.C296675qS.A03(r1)
            if (r4 != 0) goto L_0x07e6
            r41 = r1
        L_0x07e6:
            com.instagram.direct.model.DirectThreadThemeInfo r1 = new com.instagram.direct.model.DirectThreadThemeInfo
            r21 = r18
            r23 = r22
            r25 = r22
            r26 = r22
            r27 = r22
            r28 = r22
            r29 = r22
            r30 = r22
            r31 = r22
            r33 = r22
            r34 = r22
            r35 = r22
            r36 = r22
            r38 = r22
            r39 = r22
            r40 = r22
            r42 = r22
            r43 = r22
            r45 = r22
            r46 = r22
            r47 = r22
            r48 = r22
            r49 = r22
            r50 = r22
            r52 = r22
            r53 = r22
            r54 = r22
            r55 = r22
            r57 = r22
            r58 = r22
            r59 = r22
            r60 = r10
            r62 = r12
            r64 = r13
            r65 = r5
            r66 = r5
            r67 = r5
            r68 = r5
            r69 = r5
            r70 = r5
            r71 = r5
            r72 = r5
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            java.util.Map r4 = r3.A0C
            if (r4 != 0) goto L_0x084f
            java.lang.String r7 = "themesMap"
        L_0x0847:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x084f:
            r4.put(r10, r1)
            com.instagram.api.schemas.ThreadThemeType r4 = r2.A02
            com.instagram.api.schemas.ThreadThemeType r2 = com.instagram.api.schemas.ThreadThemeType.THEME
            if (r4 == r2) goto L_0x0865
            com.instagram.api.schemas.ThreadThemeType r2 = com.instagram.api.schemas.ThreadThemeType.THIRD_PARTY
            if (r4 == r2) goto L_0x0865
            com.instagram.api.schemas.ThreadThemeType r2 = com.instagram.api.schemas.ThreadThemeType.COLOR_GRADIENT
            if (r4 != r2) goto L_0x0727
            r14.add(r1)
            goto L_0x0727
        L_0x0865:
            r15.add(r1)
            goto L_0x0727
        L_0x086a:
            if (r4 == 0) goto L_0x079f
            java.lang.String r4 = r4.A05
            if (r4 == 0) goto L_0x079f
            int r7 = r4.length()
            if (r7 == 0) goto L_0x079f
            X.9JL r7 = r1.A01
            if (r7 == 0) goto L_0x079b
            java.lang.String r6 = r7.A05
            goto L_0x079b
        L_0x087e:
            java.lang.String r4 = r2.A04
            if (r4 == 0) goto L_0x079f
            int r6 = r4.length()
            if (r6 == 0) goto L_0x079f
            java.lang.String r6 = r1.A04
            goto L_0x079b
        L_0x088c:
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.NKI.A00(r3)
            r11.A05(r1)
            X.NKI.A08(r3, r5)
        L_0x0896:
            r2 = -1206245355(0xffffffffb81a2815, float:-3.675379E-5)
            r1 = r17
            X.AnonymousClass0fD.A0A(r2, r1)
            r1 = 414276309(0x18b15ad5, float:4.5845145E-24)
            goto L_0x0e99
        L_0x08a3:
            r0 = 1602207811(0x5f7fc043, float:1.8428803E19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1002610861(0xffffffffc43d5f53, float:-757.48944)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r2.A01
            X.P3E r1 = (X.P3E) r1
            X.OO0 r2 = r1.A0R
            boolean r1 = r2 instanceof X.C68746NVg
            if (r1 == 0) goto L_0x08c0
            java.lang.String r1 = ""
            r2.A04(r1)
        L_0x08c0:
            r1 = 968833314(0x39bf3922, float:3.6472926E-4)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1332739703(0x4f6ffe77, float:4.02643123E9)
            goto L_0x0e99
        L_0x08cb:
            r0 = -207751843(0xfffffffff39df55d, float:-2.5029516E31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.NHI r7 = (X.NHI) r7
            r0 = 1900730503(0x714ad887, float:1.0044438E30)
            int r6 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r3 = r2.A01
            X.NVZ r3 = (X.NVZ) r3
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x090c
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x08e5:
            r3.A02 = r0
            java.util.List r0 = r7.A01
            java.util.List r8 = X.C51966G9m.A1J(r0)
            X.8wd r2 = r7.A00
            java.util.ArrayList r5 = X.DbV.A15(r2)
            java.util.List r0 = r2.A1c
            java.util.Iterator r7 = X.JTQ.A0h(r0)
        L_0x08f9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x090f
            com.instagram.user.model.User r1 = X.DbT.A0k(r7)
            android.os.Parcelable$Creator r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            X.0qQ.A0A(r1)
            X.C66581MXm.A1M(r1, r5)
            goto L_0x08f9
        L_0x090c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x08e5
        L_0x090f:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r14 = r8.iterator()
        L_0x091b:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x09b8
            java.lang.Object r11 = r14.next()
            X.OGD r11 = (X.OGD) r11
            X.0qQ.A0A(r11)
            java.lang.String r7 = r11.A03
            boolean r7 = r0.containsKey(r7)
            if (r7 != 0) goto L_0x094d
            java.lang.String r10 = r11.A03
            java.util.List r7 = r2.A1c
            java.util.Iterator r9 = X.JTQ.A0h(r7)
        L_0x093a:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x094d
            com.instagram.user.model.User r8 = X.DbT.A0k(r9)
            boolean r7 = X.DbV.A1Z(r8, r10)
            if (r7 == 0) goto L_0x093a
            r0.put(r10, r8)
        L_0x094d:
            java.lang.String r7 = r11.A03
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x091b
            java.lang.String r7 = r11.A03
            java.lang.Object r7 = r0.get(r7)
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            if (r7 == 0) goto L_0x09b3
            java.lang.String r13 = r11.A01
            java.lang.String r10 = r11.A02
            java.lang.String r22 = X.AnonymousClass50n.A07(r7)
            X.0qQ.A07(r22)
            com.instagram.common.typedurl.ImageUrl r18 = r7.Bh3()
            long r7 = r11.A00
            java.lang.String r9 = r2.A1D
            X.0qQ.A07(r9)
            java.lang.Boolean r12 = r2.A0y
            if (r12 == 0) goto L_0x09b0
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x09b0
            java.lang.String r24 = "group"
        L_0x0981:
            java.util.List r12 = r11.A04
            com.google.common.collect.ImmutableList r12 = X.DbU.A0K(r12)
            java.lang.String r11 = r11.A02
            int r11 = X.DbX.A05(r11)
            com.google.common.collect.ImmutableList r16 = X.OXJ.A00(r12, r11)
            X.0qQ.A0A(r16)
            com.google.common.collect.ImmutableList r17 = X.DbU.A0K(r5)
            r27 = 0
            r29 = -1
            r19 = 0
            com.instagram.model.direct.DirectMessageSearchMessage r15 = new com.instagram.model.direct.DirectMessageSearchMessage
            r20 = r13
            r21 = r10
            r23 = r9
            r25 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29)
            r1.add(r15)
            goto L_0x091b
        L_0x09b0:
            java.lang.String r24 = "one_to_one"
            goto L_0x0981
        L_0x09b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09b8:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            int r1 = r3.A00
            int r0 = r5.size()
            int r1 = r1 + r0
            r3.A00 = r1
            X.O6T r0 = r3.A01
            if (r0 == 0) goto L_0x09d5
            X.NKh r2 = r0.A00
            android.os.Handler r1 = r2.A0K
            X.PYX r0 = new X.PYX
            r0.<init>(r5, r2)
            r1.post(r0)
        L_0x09d5:
            X.OJX r0 = r3.A02
            if (r0 == 0) goto L_0x09dc
            r0.A00(r5)
        L_0x09dc:
            r0 = -2095976765(0xffffffff8311eec3, float:-4.2885755E-37)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1796703180(0x6b1783cc, float:1.831702E26)
            goto L_0x0c27
        L_0x09e7:
            r0 = -1686277716(0xffffffff9b7d71ac, float:-2.0964399E-22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.MpR r7 = (X.C67532MpR) r7
            r0 = 1431709223(0x55562627, float:1.47162095E13)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            X.NMI.super.onSuccess(r7)
            java.lang.String r1 = r7.A00
            X.0qQ.A07(r1)
            java.lang.Object r4 = r2.A01
            X.McN r4 = (X.C66777McN) r4
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            java.util.Map r2 = r4.A07
            if (r0 != 0) goto L_0x0a3a
            r2.size()
            java.util.List r0 = r7.A01
            r0.size()
            r4.A01 = r1
            java.util.List r0 = r7.A01
            X.0qQ.A07(r0)
            X.C66777McN.A01(r4, r0)
            X.C66777McN.A00(r4)
        L_0x0a22:
            r2 = 1
            r4.A02 = r2
            X.1Ng r1 = r4.A04
            X.MqH r0 = new X.MqH
            r0.<init>(r2)
            r1.A00(r0)
            r0 = 1469723169(0x579a3221, float:3.39080185E14)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -274529339(0xffffffffefa303c5, float:-1.0090123E29)
            goto L_0x0b3d
        L_0x0a3a:
            int r1 = r2.size()
            int r0 = r7.A00
            if (r1 == r0) goto L_0x0a22
            r2.size()
            goto L_0x0a22
        L_0x0a46:
            r0 = 842708778(0x323ab72a, float:1.0868272E-8)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NGt r7 = (X.NGt) r7
            r1 = 1713076518(0x661b7926, float:1.835504E23)
            int r4 = X.AnonymousClass0fD.A03(r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r3 = r2.A01
            X.OyN r3 = (X.OyN) r3
            java.util.List r1 = r7.A00
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            boolean r1 = r3.A08
            r3.A07(r2, r1)
            X.Pux r1 = r3.A02
            if (r1 == 0) goto L_0x0a73
            r1.CtV()
        L_0x0a73:
            X.1Ng r2 = r3.A0A
            X.OsX r1 = new X.OsX
            r1.<init>()
            r2.A00(r1)
            r1 = -69847656(0xfffffffffbd63598, float:-2.224477E36)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 683130781(0x28b7bf9d, float:2.040018E-14)
            goto L_0x0e99
        L_0x0a88:
            r0 = -344764960(0xffffffffeb734de0, float:-2.9413673E26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            r1 = -906795464(0xffffffffc9f36638, float:-1993927.0)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.NMI.super.onSuccess(r4)
            java.lang.Object r1 = r2.A01
            X.OyN r1 = (X.OyN) r1
            X.Pux r1 = r1.A03
            if (r1 == 0) goto L_0x0aa9
            java.lang.String r0 = "toSchema"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0aa9:
            r1 = -438580328(0xffffffffe5dbcb98, float:-1.2974424E23)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1216694765(0x488549ed, float:272975.4)
            goto L_0x0e99
        L_0x0ab4:
            r0 = -1318275096(0xffffffffb16cb7e8, float:-3.4447059E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NGu r7 = (X.NGu) r7
            r1 = -616056885(0xffffffffdb47b7cb, float:-5.6215603E16)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r4 = r2.A01
            X.OyN r4 = (X.OyN) r4
            X.Pux r1 = r4.A04
            if (r1 == 0) goto L_0x0ae4
            boolean r1 = r7.A00
            r4.A08 = r1
            X.0nO r3 = X.0nY.A00()
            X.NRu r1 = new X.NRu
            r1.<init>(r2, r7)
            r3.ATE(r1)
            X.Pux r1 = r4.A04
            r1.CtV()
        L_0x0ae4:
            r1 = 1626371593(0x60f07609, float:1.3861637E20)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 930600470(0x3777d616, float:1.4772193E-5)
            goto L_0x0e99
        L_0x0aef:
            r0 = 1213561239(0x48557997, float:218598.36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.NHK r7 = (X.NHK) r7
            r0 = 1482756096(0x58611000, float:9.8983534E14)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r2 = r2.A01
            X.OyN r2 = (X.OyN) r2
            java.util.List r0 = r7.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            boolean r0 = r7.A02
            r2.A07(r1, r0)
            boolean r0 = r7.A03
            r2.A09 = r0
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0b24
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0b25
        L_0x0b24:
            r0 = 0
        L_0x0b25:
            r2.A06 = r0
            X.1Ng r1 = r2.A0A
            X.OsX r0 = new X.OsX
            r0.<init>()
            r1.A00(r0)
            r0 = 0
            r2.A00 = r0
            r0 = -2122968473(0xffffffff81761267, float:-4.5196267E-38)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1776542918(0xffffffff961c1b3a, float:-1.2610171E-25)
        L_0x0b3d:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0b41:
            r0 = -1561757871(0xffffffffa2e97751, float:-6.3281108E-18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NGt r7 = (X.NGt) r7
            r1 = -14812701(0xffffffffff1df9e3, float:-2.0998628E38)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r4 = r2.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r4 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r4
            X.OyN r3 = r4.A04
            java.util.List r1 = r7.A00
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            X.OyN r1 = r4.A04
            boolean r1 = r1.A08
            r3.A07(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r4.A01
            r1.onBackPressed()
            r1 = -790082339(0xffffffffd0e84cdd, float:-3.11788114E10)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1229063913(0x494206e9, float:794734.56)
            goto L_0x0e99
        L_0x0b7b:
            r0 = -2122185987(0xffffffff818202fd, float:-4.7758746E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.NGt r7 = (X.NGt) r7
            r0 = 1021551296(0x3ce3a2c0, float:0.027787566)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r9 = r2.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r9 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r9
            X.6rr r0 = X.C320156rr.GONE
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment.A01(r9, r0)
            java.util.List r0 = r7.A00
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x0ba5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0bc9
            java.lang.Object r3 = r6.next()
            X.OMj r3 = (X.C70814OMj) r3
            r2 = 0
            r0 = 1
            X.Npv r1 = new X.Npv
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            X.Npu r0 = new X.Npu
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r1
            r8.add(r0)
            goto L_0x0ba5
        L_0x0bc9:
            java.util.Set r0 = r9.A09
            r0.clear()
            r9.A05 = r8
            X.NL9 r0 = r9.A02
            r0.A00(r8)
            r9.A04()
            X.OSf r6 = r9.A03
            java.util.List r0 = r7.A00
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r8 = r0.size()
            java.util.List r0 = r7.A00
            java.util.Iterator r1 = X.JTQ.A0h(r0)
            r3 = 0
        L_0x0beb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c02
            java.lang.Object r0 = r1.next()
            X.OMj r0 = (X.C70814OMj) r0
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0beb
            int r3 = r3 + 1
            goto L_0x0beb
        L_0x0c02:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "msgr_icebreaker_num"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "msgr_icebreakers_responses_num"
            r2.put(r0, r1)
            java.lang.String r1 = "icebreaker_settings_import_screen_impression"
            r0 = 0
            X.C70932OSf.A00(r6, r1, r0, r2)
            r0 = -2002601294(0xffffffff88a2bab2, float:-9.793912E-34)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1937296778(0xffffffff8c873276, float:-2.0830413E-31)
        L_0x0c27:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0c2b:
            r0 = 734462457(0x2bc701f9, float:1.4140348E-12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.77b r7 = (X.C3265177b) r7
            r1 = -2037350977(0xffffffff86907dbf, float:-5.4351547E-35)
            int r3 = X.AnonymousClass7TG.A0D(r7, r1)
            java.util.List r1 = r7.A00
            r1.size()
            java.lang.Object r2 = r2.A01
            X.0sP r2 = (X.0sP) r2
            java.util.List r1 = r7.A00
            X.0qQ.A07(r1)
            r2.invoke(r1)
            r1 = -317184796(0xffffffffed1824e4, float:-2.942895E27)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1144452610(0xffffffffbbc909fe, float:-0.0061352244)
            goto L_0x0e99
        L_0x0c57:
            r0 = 2088190559(0x7c77425f, float:5.135374E36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r7 = (X.AnonymousClass3JC) r7
            r1 = -923401189(0xffffffffc8f6041b, float:-503840.84)
            int r14 = X.AnonymousClass7TG.A0D(r7, r1)
            X.NMI.super.onSuccess(r7)
            java.lang.Object r3 = r7.A01
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            if (r3 == 0) goto L_0x0e90
            java.lang.Object r9 = r2.A01
            X.Mow r9 = (X.C67502Mow) r9
            java.lang.Class<X.N1y> r2 = X.C68134N1y.class
            java.lang.String r1 = "get_ig_banyan_ranking_query"
            X.3FZ r8 = r3.A00(r2, r1)
            if (r8 == 0) goto L_0x0e90
            java.lang.Class<X.N1v> r2 = X.C68132N1v.class
            java.lang.String r1 = "entities"
            X.3FZ r3 = r8.A00(r2, r1)
            if (r3 == 0) goto L_0x0cb2
            java.lang.Class<X.N1u> r2 = X.C68131N1u.class
            java.lang.String r1 = "ig_users"
            com.google.common.collect.ImmutableList r1 = r3.A02(r1, r2)
            if (r1 == 0) goto L_0x0cb2
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            X.3kO r3 = X.C66580MXl.A0J(r1)
        L_0x0c9a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0cb6
            java.lang.Object r2 = r3.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r1 = "instagram_user_id"
            java.lang.String r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x0c9a
            r7.put(r1, r2)
            goto L_0x0c9a
        L_0x0cb2:
            X.0sm r7 = X.0Yt.A0E()
        L_0x0cb6:
            java.lang.Class<X.N1x> r13 = X.N1x.class
            java.lang.String r6 = "ranking_results"
            com.google.common.collect.ImmutableList r1 = r8.A02(r6, r13)
            X.3kO r16 = X.C66580MXl.A0J(r1)
        L_0x0cc2:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0e68
            java.lang.Object r10 = r16.next()
            X.3FZ r10 = (X.AnonymousClass3FZ) r10
            X.NkK r2 = X.C69380NkK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "view"
            java.lang.Enum r11 = r10.A04(r1, r2)
            X.NkK r11 = (X.C69380NkK) r11
            if (r11 == 0) goto L_0x0cc2
            X.Mp3 r3 = X.C67508Mp3.A00
            X.Mp4 r4 = X.C67509Mp4.A00
            X.NSq[] r1 = new X.C68684NSq[]{r3, r4}
            java.util.List r1 = X.0sr.A1P(r1)
            java.util.Iterator r12 = r1.iterator()
        L_0x0cea:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0e5d
            java.lang.Object r5 = r12.next()
            X.NoB r5 = (X.C69567NoB) r5
            boolean r1 = r5 instanceof X.C67508Mp3
            if (r1 == 0) goto L_0x0e54
            java.lang.String r2 = "CALL_RECIPIENTS"
        L_0x0cfc:
            java.lang.String r1 = r11.name()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0cea
            java.lang.Class<X.N1w> r2 = X.C68133N1w.class
            java.lang.String r1 = "items"
            com.google.common.collect.ImmutableList r2 = r10.A02(r1, r2)
            if (r2 == 0) goto L_0x0cc2
            boolean r1 = r5.equals(r4)
            if (r1 == 0) goto L_0x0da0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.3kO r15 = X.C66580MXl.A0J(r2)
        L_0x0d1e:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0d97
            java.lang.Object r10 = r15.next()
            X.3FZ r10 = (X.AnonymousClass3FZ) r10
            java.lang.String r3 = "igid"
            java.lang.String r12 = r10.A05(r3)
            X.XRH r2 = X.XRH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "entity_type"
            java.lang.Enum r2 = r10.A04(r1, r2)
            X.XRH r2 = (X.XRH) r2
            r1 = 0
            if (r2 == 0) goto L_0x0d94
            java.lang.String r20 = r2.name()
        L_0x0d41:
            if (r12 == 0) goto L_0x0d1e
            if (r20 == 0) goto L_0x0d1e
            boolean r2 = r7.containsKey(r12)
            if (r2 == 0) goto L_0x0d1e
            java.lang.String r2 = r10.A05(r3)
            java.lang.Object r11 = r7.get(r2)
            X.3FZ r11 = (X.AnonymousClass3FZ) r11
            java.lang.String r3 = "score"
            org.json.JSONObject r2 = r10.A00
            double r21 = r2.optDouble(r3)
            if (r11 == 0) goto L_0x0d92
            r10 = 61
            r3 = 8
            r2 = 3
            java.lang.String r2 = X.MYM.A00(r10, r3, r2)
            java.lang.String r10 = r11.A05(r2)
            java.lang.Class<X.N1t> r3 = X.C68130N1t.class
            java.lang.String r2 = "profile_picture"
            X.3FZ r2 = r11.A00(r3, r2)
            if (r2 == 0) goto L_0x0d7c
            java.lang.String r1 = "uri"
            java.lang.String r1 = r2.A05(r1)
        L_0x0d7c:
            r3 = 21
            X.N49 r2 = new X.N49
            r2.<init>(r10, r1, r3)
            X.MpA r1 = new X.MpA
            r17 = r1
            r18 = r2
            r19 = r12
            r17.<init>(r18, r19, r20, r21)
            r4.add(r1)
            goto L_0x0d1e
        L_0x0d92:
            r10 = r1
            goto L_0x0d7c
        L_0x0d94:
            r20 = r1
            goto L_0x0d41
        L_0x0d97:
            X.0nO r2 = r9.A04
            X.NRn r1 = new X.NRn
            r1.<init>(r9, r4)
            goto L_0x0e2e
        L_0x0da0:
            boolean r1 = r5.equals(r3)
            if (r1 == 0) goto L_0x0e58
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.3kO r15 = X.C66580MXl.A0J(r2)
        L_0x0dae:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0e27
            java.lang.Object r10 = r15.next()
            X.3FZ r10 = (X.AnonymousClass3FZ) r10
            java.lang.String r3 = "igid"
            java.lang.String r12 = r10.A05(r3)
            X.XRH r2 = X.XRH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "entity_type"
            java.lang.Enum r2 = r10.A04(r1, r2)
            X.XRH r2 = (X.XRH) r2
            r1 = 0
            if (r2 == 0) goto L_0x0e24
            java.lang.String r20 = r2.name()
        L_0x0dd1:
            if (r12 == 0) goto L_0x0dae
            if (r20 == 0) goto L_0x0dae
            boolean r2 = r7.containsKey(r12)
            if (r2 == 0) goto L_0x0dae
            java.lang.String r2 = r10.A05(r3)
            java.lang.Object r11 = r7.get(r2)
            X.3FZ r11 = (X.AnonymousClass3FZ) r11
            java.lang.String r3 = "score"
            org.json.JSONObject r2 = r10.A00
            double r21 = r2.optDouble(r3)
            if (r11 == 0) goto L_0x0e22
            r10 = 61
            r3 = 8
            r2 = 3
            java.lang.String r2 = X.MYM.A00(r10, r3, r2)
            java.lang.String r10 = r11.A05(r2)
            java.lang.Class<X.N1t> r3 = X.C68130N1t.class
            java.lang.String r2 = "profile_picture"
            X.3FZ r2 = r11.A00(r3, r2)
            if (r2 == 0) goto L_0x0e0c
            java.lang.String r1 = "uri"
            java.lang.String r1 = r2.A05(r1)
        L_0x0e0c:
            r3 = 21
            X.N49 r2 = new X.N49
            r2.<init>(r10, r1, r3)
            X.Mp8 r1 = new X.Mp8
            r17 = r1
            r18 = r2
            r19 = r12
            r17.<init>(r18, r19, r20, r21)
            r4.add(r1)
            goto L_0x0dae
        L_0x0e22:
            r10 = r1
            goto L_0x0e0c
        L_0x0e24:
            r20 = r1
            goto L_0x0dd1
        L_0x0e27:
            X.0nO r2 = r9.A04
            X.NRo r1 = new X.NRo
            r1.<init>(r9, r4)
        L_0x0e2e:
            r2.ATE(r1)
            java.util.ArrayList r3 = X.C67502Mow.A00(r9, r4)
            r2 = 100
            int r1 = r4.size()
            int r1 = java.lang.Math.min(r2, r1)
            java.util.List r3 = X.00k.A0d(r3, r1)
            java.util.HashMap r1 = r9.A07
            r1.put(r5, r3)
            X.2FF r2 = r9.A02
            X.Mp7 r1 = new X.Mp7
            r1.<init>(r5, r3)
            r2.accept(r1)
            goto L_0x0cc2
        L_0x0e54:
            java.lang.String r2 = "BFF"
            goto L_0x0cfc
        L_0x0e58:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0e5d:
            r0 = 3
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0e68:
            com.google.common.collect.ImmutableList r2 = r8.A02(r6, r13)
            X.0qQ.A07(r2)
            boolean r1 = r2 instanceof java.util.Collection
            r5 = 1
            if (r1 == 0) goto L_0x0e9d
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0e9d
        L_0x0e7a:
            X.1Av r2 = r9.A06
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            long r3 = r1.getTimeInMillis()
            X.0xY r2 = X.AnonymousClass7TE.A0p(r2)
            java.lang.String r1 = "copresence_model_expiration"
            r2.E5c(r1, r3)
            r2.apply()
        L_0x0e90:
            r1 = 1819600807(0x6c74e7a7, float:1.1842874E27)
            X.AnonymousClass0fD.A0A(r1, r14)
            r1 = -35635624(0xfffffffffde03e58, float:-3.7258847E37)
        L_0x0e99:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0e9d:
            java.util.Iterator r3 = r2.iterator()
        L_0x0ea1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0e7a
            java.lang.Object r2 = r3.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r1 = "error"
            java.lang.String r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x0ea1
            boolean r1 = r9.A01
            if (r1 != 0) goto L_0x0e90
            X.NRE r4 = new X.NRE
            r4.<init>(r9)
            X.0eM r1 = r9.A09
            android.os.Handler r3 = X.JTO.A0E(r1)
            r1 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r4, r1)
            r9.A00 = r4
            r9.A01 = r5
            goto L_0x0e90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMI.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0143, code lost:
        if (r6.equals(r1.A1D) != false) goto L_0x0145;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x016c;
                case 23: goto L_0x00a7;
                case 26: goto L_0x0047;
                case 28: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.NMI.super.onSuccessInBackground(r9)
            return
        L_0x000b:
            r0 = 9756523(0x94df6b, float:1.36718E-38)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.Mnv r9 = (X.C67440Mnv) r9
            r4 = r15
            monitor-enter(r4)
            r0 = 415163215(0x18bee34f, float:4.934337E-24)
            int r8 = X.AnonymousClass7TG.A0D(r9, r0)     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r15.A01     // Catch:{ all -> 0x0169 }
            X.Mmz r0 = (X.C67383Mmz) r0     // Catch:{ all -> 0x0169 }
            X.8jb r6 = r0.A02     // Catch:{ all -> 0x0169 }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0169 }
            r6.A07(r0)     // Catch:{ all -> 0x0169 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0169 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0169 }
            int r0 = r9.A00     // Catch:{ all -> 0x0169 }
            long r0 = (long) r0     // Catch:{ all -> 0x0169 }
            long r0 = r5.toMillis(r0)     // Catch:{ all -> 0x0169 }
            long r2 = r2 + r0
            r6.A05(r2)     // Catch:{ all -> 0x0169 }
            r0 = 1146653298(0x44588a72, float:866.1632)
            X.AnonymousClass0fD.A0A(r0, r8)     // Catch:{ all -> 0x0169 }
            monitor-exit(r4)
            r0 = 977648846(0x3a45bcce, float:7.5430877E-4)
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x0047:
            r0 = -223248260(0xfffffffff2b1807c, float:-7.0315744E30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.B72 r9 = (X.B72) r9
            r0 = -2141581401(0xffffffff805a0fa7, float:-8.27081E-39)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r12 = 0
            X.0qQ.A0B(r9, r12)
            java.lang.Object r0 = r15.A01
            X.OKX r0 = (X.OKX) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            X.2Dm r0 = X.2L2.A00(r6)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r7 = r0.A0C
            X.43I r8 = X.AnonymousClass43I.A00
            X.48q r11 = X.C2611948q.ALL
            boolean r0 = X.C272094k5.A0A(r6, r12)
            if (r0 == 0) goto L_0x00a4
            X.2Eo r10 = X.2Eo.A05
        L_0x0075:
            r7.A0O(r8, r9, r10, r11, r12)
            X.1Av r0 = X.1Au.A00(r6)
            long r1 = java.lang.System.currentTimeMillis()
            X.0xY r5 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "last_message_requests_prefetch_timestamp"
            r5.E5c(r0, r1)
            r5.apply()
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r6)
            r1 = 0
            X.2Kc r0 = new X.2Kc
            r0.<init>(r1, r12, r12, r12)
            r2.A00(r0)
            r0 = -252522956(0xfffffffff0f2ce34, float:-6.0115725E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -801607175(0xffffffffd03871f9, float:-1.23779082E10)
            goto L_0x01a1
        L_0x00a4:
            X.2Eo r10 = X.2Eo.A04
            goto L_0x0075
        L_0x00a7:
            r0 = -230656642(0xfffffffff240757e, float:-3.8120423E30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.CDm r9 = (X.C43794CDm) r9
            r0 = 759621142(0x2d46e616, float:1.1306086E-11)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r14 = 0
            X.0qQ.A0B(r9, r14)
            X.NMI.super.onSuccessInBackground(r9)
            X.PwK r4 = r9.A00
            if (r4 != 0) goto L_0x00ca
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ca:
            r0 = r4
            X.N5D r0 = (X.N5D) r0
            java.util.List r1 = r0.A01
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Dm r5 = X.1bJ.A00(r0)
            X.N5D r4 = (X.N5D) r4
            java.lang.String r0 = r4.A00
            r11 = 0
            com.instagram.model.direct.DirectThreadKey r9 = new com.instagram.model.direct.DirectThreadKey
            r9.<init>(r0, r11)
            X.2Dr r5 = (X.2Dr) r5
            r7 = 1
            X.0qQ.A0B(r1, r7)
            X.48S r4 = r5.A0P(r9)
            if (r4 != 0) goto L_0x0108
            X.0wj r4 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbT.A1Q(r4, r0, r1)
        L_0x00fb:
            r0 = 2017542439(0x78414127, float:1.5678668E34)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 2131810784(0x7f10d9e0, float:1.925401E38)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0108:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r1.iterator()
        L_0x0110:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r8.next()
            X.PwJ r0 = (X.C74524PwJ) r0
            X.N5C r0 = (X.N5C) r0
            X.PwI r1 = r0.A00
            if (r1 == 0) goto L_0x0110
            java.lang.String r0 = r0.A01
            X.N5B r1 = (X.N5B) r1
            java.lang.Integer r6 = r1.A00
            monitor-enter(r4)
            X.3su r1 = r4.A0J(r0)     // Catch:{ all -> 0x0169 }
            if (r1 != 0) goto L_0x013a
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x0169 }
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "message is missing from thread entry"
            X.DbT.A1Q(r6, r0, r1)     // Catch:{ all -> 0x0169 }
            goto L_0x014b
        L_0x013a:
            monitor-enter(r1)     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x0145
            java.lang.Integer r0 = r1.A1D     // Catch:{ all -> 0x0166 }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0149
        L_0x0145:
            r1.A1D = r6     // Catch:{ all -> 0x0166 }
            r1.A2C = r7     // Catch:{ all -> 0x0166 }
        L_0x0149:
            monitor-exit(r1)     // Catch:{ all -> 0x0169 }
            goto L_0x014c
        L_0x014b:
            r1 = 0
        L_0x014c:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0110
            r13.add(r1)
            goto L_0x0110
        L_0x0153:
            java.lang.Integer r10 = X.AnonymousClass05K.A0D
            X.2Kb r8 = new X.2Kb
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.1Ng r0 = r5.A06
            r0.A00(r8)
            X.2FF r0 = r5.A09
            r0.accept(r8)
            goto L_0x00fb
        L_0x0166:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x016c:
            r0 = -472199681(0xffffffffe3dacdff, float:-8.0724676E21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1218456638(0x48a02c3e, float:328033.94)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.NMI.super.onSuccessInBackground(r9)
            java.lang.Object r2 = r15.A01
            X.67Z r2 = (X.AnonymousClass67Z) r2
            X.67Y r0 = r2.A00
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r1 = r0.get()
            X.1af r0 = X.1af.A01
            if (r1 == r0) goto L_0x0198
            X.3xQ r0 = new X.3xQ
            r0.<init>(r9)
            r2.A02(r0)
            r2.A00()
        L_0x0198:
            r0 = 1263847456(0x4b54c820, float:1.3944864E7)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1215145176(0x486da4d8, float:243347.38)
        L_0x01a1:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMI.onSuccessInBackground(java.lang.Object):void");
    }

    public NMI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
