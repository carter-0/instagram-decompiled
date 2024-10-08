package com.instagram.inappbrowser.service;

import X.02m;
import X.0Aj;
import X.0Df;
import X.0KC;
import X.0Tu;
import X.0bY;
import X.0bb;
import X.0cp;
import X.0kJ;
import X.0kR;
import X.0nY;
import X.0qQ;
import X.0wb;
import X.0wc;
import X.11Z;
import X.17k;
import X.182;
import X.1E7;
import X.1OC;
import X.1Xj;
import X.1vm;
import X.23d;
import X.2IL;
import X.2IS;
import X.2IV;
import X.ASg;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0K0;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass1QI;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10804RyQ;
import X.C10847Rz7;
import X.C11242SHc;
import X.C12048Sla;
import X.C12192Soh;
import X.C12800T7n;
import X.C12927TDq;
import X.C231122qu;
import X.C239113Fa;
import X.C239123Fb;
import X.C249803kO;
import X.C255463uA;
import X.C305926Kc;
import X.C375149Cl;
import X.C41845B3m;
import X.C41848B3p;
import X.C42985Bpb;
import X.C42988Bpe;
import X.C42999Bpp;
import X.C43002Bps;
import X.C43754C7y;
import X.C45927DFh;
import X.C51965G9l;
import X.C51972G9s;
import X.C51973G9u;
import X.C66579MXk;
import X.C66580MXl;
import X.C66581MXm;
import X.C67662Mrs;
import X.C7572QKn;
import X.C7595QNl;
import X.C8764R8p;
import X.C9011RLf;
import X.C9744Rg2;
import X.C9836Rhy;
import X.C9837Rhz;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbZ;
import X.EDL;
import X.JTQ;
import X.JTR;
import X.OLY;
import X.OWB;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QKR;
import X.RAC;
import X.RU7;
import X.RUX;
import X.RWG;
import X.S8C;
import X.S8F;
import X.S8M;
import X.SAP;
import X.SDT;
import X.SH7;
import X.SRr;
import X.T9G;
import X.T9H;
import X.T9J;
import X.TPI;
import X.TPT;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;
import com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class BrowserLiteCallbackService extends Service {
    public static final 0bY A06 = DbW.A0G();
    public Handler A00 = null;
    public 2IL A01 = null;
    public final QKR A02 = QKR.A01;
    public final C12048Sla A03 = C12048Sla.A0A;
    public final C67662Mrs A04 = new C67662Mrs(this);
    public final AtomicBoolean A05 = JTQ.A0k();

    public final class BrowserLiteCallbackImpl extends Binder implements BrowserLiteCallback {
        public boolean A00;
        public OnShopsLiteCallback A01;
        public final UserSession A02;
        public final SH7 A03;

        public static 0Df A01(BaseBundle baseBundle, AnonymousClass0K0 r6) {
            Boolean valueOf = Boolean.valueOf(baseBundle.getBoolean("is_fm_splitscreen", false));
            0Df A022 = r6.A02();
            0Df.A00(A022, valueOf, "is_fm_splitscreen");
            0Df.A00(A022, Boolean.valueOf(baseBundle.getBoolean("is_wa_installed", false)), "is_wa_installed");
            0Df.A00(A022, Boolean.valueOf(baseBundle.getBoolean("is_watch_and_browse_v2", false)), "is_watch_and_browse_v2");
            0Df.A00(A022, baseBundle.getString("landing_page_domain", (String) null), "landing_page_domain");
            0Df.A00(A022, baseBundle.getString("offer_id", (String) null), "offer_id");
            0Df.A00(A022, Boolean.valueOf(baseBundle.getBoolean("should_show_browser_history_tooltip", false)), "should_show_browser_history_tooltip");
            0Df.A00(A022, Boolean.valueOf(baseBundle.getBoolean("should_show_search_tooltip", false)), "should_show_search_tooltip");
            0Df.A00(A022, baseBundle.getString("target_url", (String) null), "target_url");
            return A022;
        }

        public static boolean A07(BaseBundle baseBundle) {
            return baseBundle == null || baseBundle.getBoolean("Tracking.ENABLED", true);
        }

        public final void DJa(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3) {
            AnonymousClass0K0 r9 = null;
            0Df r6 = null;
            int A032 = AnonymousClass0fD.A03(96599960);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            AnonymousClass0K0 r7 = GraphQlCallInput.A02;
            0Df A033 = C41845B3m.A03(r7, str2, "iab_extension_type");
            0Df.A00(A033, str3, "tracking_token");
            String str4 = str;
            0Df.A00(A033, str4, "iab_session_id");
            2IV r2 = A042.A00;
            Pxf.A1E(A033, r2, "params");
            Pxf.A1E(C41845B3m.A03(r7, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id"), r2, "bloks_params");
            boolean z = false;
            Bundle bundle2 = bundle;
            if (bundle != null) {
                r9 = r7;
                r6 = A01(bundle2, r7);
                z = true;
            }
            if (z) {
                0Df A022 = r2.A02();
                if (r6 == null) {
                    r6 = r9.A02();
                }
                A022.A0E(r6, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGIABBloksFooterQuery", A042.getParamsCopy(), A043.getParamsCopy(), C43754C7y.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "iab_extension_footer_template_root", AnonymousClass7TE.A1C());
            1vm.A01(this.A02).ATL(new ASg(str4, 3), new C45927DFh(str4, (Object) iABBloksGraphQLCallback, 3), pandoGraphQLRequest);
            AnonymousClass0fD.A0A(-398122828, A032);
        }

        public final void DJc(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z) {
            AnonymousClass0K0 r0 = null;
            0Df r7 = null;
            int A032 = AnonymousClass0fD.A03(-748783043);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            boolean A1Z = C41848B3p.A1Z(A042, "url", str);
            Boolean valueOf = Boolean.valueOf(z);
            A042.A02("is_launch_url", valueOf);
            boolean A1V = AnonymousClass7TF.A1V(valueOf);
            A042.A04("ad_id", str3);
            A042.A04("ad_tracking_token", str4);
            String str5 = str2;
            A042.A04("iab_session_id", str5);
            boolean z2 = false;
            Bundle bundle2 = bundle;
            if (bundle != null) {
                r0 = GraphQlCallInput.A02;
                r7 = A01(bundle2, r0);
                z2 = true;
            }
            if (z2) {
                0Df A022 = A042.A00.A02();
                if (r7 == null) {
                    r7 = r0.A02();
                }
                A022.A0E(r7, "extra_params");
            }
            17k.A0E(A1Z);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(A1V), "IGIABExpandableFooterQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42985Bpb.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_iab_ig_expandable_sheet_content", AnonymousClass7TE.A1C());
            1vm.A01(this.A02).ATL(new ASg(str5, 2), new C45927DFh(str5, (Object) iABExpandableFooterCallback, 2), pandoGraphQLRequest);
            AnonymousClass0fD.A0A(2054145088, A032);
        }

        public final void DJd(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
            AnonymousClass0K0 r9 = null;
            0Df r8 = null;
            int A032 = AnonymousClass0fD.A03(-1903388117);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            AnonymousClass0K0 r3 = GraphQlCallInput.A02;
            0Df A033 = C41845B3m.A03(r3, str2, "ad_id");
            0Df.A00(A033, str3, "tracking_token");
            String str4 = str;
            0Df.A00(A033, str4, "iab_session_id");
            2IV r2 = A042.A00;
            Pxf.A1E(A033, r2, "params");
            boolean z = false;
            Bundle bundle2 = bundle;
            if (bundle != null) {
                r9 = r3;
                r8 = A01(bundle2, r3);
                z = true;
            }
            if (z) {
                0Df A022 = r2.A02();
                if (r8 == null) {
                    r8 = r9.A02();
                }
                A022.A0E(r8, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGIABExtensionPixelEventHandlerQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42988Bpe.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "iab_extension_pixel_event_handler", AnonymousClass7TE.A1C());
            1vm.A01(this.A02).ATL(new ASg(str4, 4), new C45927DFh(iABExtensionEventHandlerCallback, str4, 4), pandoGraphQLRequest);
            AnonymousClass0fD.A0A(-451182648, A032);
        }

        public /* synthetic */ BrowserLiteCallbackImpl() {
            this();
            int A032 = AnonymousClass0fD.A03(220814266);
            UserSession A0a = Pxe.A0a(BrowserLiteCallbackService.this);
            this.A02 = A0a;
            this.A03 = new SH7(A0a);
            AnonymousClass0fD.A0A(-371672025, A032);
            AnonymousClass0fD.A0A(1359642406, AnonymousClass0fD.A03(-936980901));
        }

        public static Bundle A00(Parcel parcel) {
            return (Bundle) S8M.A00(parcel, Bundle.CREATOR);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.I6B} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: X.GP6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: X.GP6} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x03b4  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0228  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0249  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void A04(android.os.Bundle r56, com.facebook.iabeventlogging.model.IABEvent r57, com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl r58) {
            /*
                r4 = r57
                r0 = 1155162834(0x44da62d2, float:1747.0881)
                int r20 = X.AnonymousClass0fD.A03(r0)
                com.facebook.iabeventlogging.model.IABEmptyEvent r0 = com.facebook.iabeventlogging.model.IABEvent.A04
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x001a
                r1 = -898510184(0xffffffffca71d298, float:-3962022.0)
            L_0x0014:
                r0 = r20
                X.AnonymousClass0fD.A0A(r1, r0)
                return
            L_0x001a:
                r4.toString()
                X.QKn r3 = new X.QKn
                r7 = r56
                r3.<init>(r7)
                java.lang.String r26 = X.SDT.A00(r3)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_USER_ID"
                java.lang.String r36 = r1.getString(r0)
                r9 = r58
                com.instagram.common.session.UserSession r2 = r9.A02
                r0 = r26
                X.1Xj r6 = X.DbV.A0U(r2, r0)
                java.lang.String r33 = r9.A03(r3)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_AD_ID"
                java.lang.String r24 = r1.getString(r0)
                X.0Tu r21 = X.0Tu.A05
                r0 = 36330475521852046(0x8112600000428e, double:3.0388772388774656E-306)
                r5 = r21
                boolean r0 = X.182.A06(r5, r2, r0)
                if (r0 != 0) goto L_0x005d
                if (r24 != 0) goto L_0x005d
                if (r6 == 0) goto L_0x005d
                java.lang.String r24 = X.C231122qu.A07(r2, r6)
            L_0x005d:
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_CLICK_ID"
                java.lang.String r41 = r1.getString(r0)
                java.lang.String r0 = r4.A03
                r32 = r0
                long r5 = r4.A01
                double r0 = (double) r5
                r57 = r0
                r25 = 1
                if (r56 == 0) goto L_0x007c
                java.lang.String r1 = "Tracking.ENABLED"
                r0 = r25
                boolean r0 = r7.getBoolean(r1, r0)
                if (r0 == 0) goto L_0x0245
            L_0x007c:
                X.SH7 r7 = r9.A03
                com.instagram.common.session.UserSession r6 = r7.A01
                r0 = 2342156158837524270(0x2081029e0001072e, double:4.059777342346595E-152)
                r5 = r21
                boolean r0 = X.182.A06(r5, r6, r0)
                if (r0 == 0) goto L_0x00a1
                X.2IP r0 = r7.A00
                if (r0 == 0) goto L_0x00a1
                boolean r1 = X.2IP.A00
                r0 = r25
                if (r1 != r0) goto L_0x00a1
                java.util.List r1 = X.SH7.A02
                X.RGn r0 = r4.A02
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0245
            L_0x00a1:
                r23 = 1
            L_0x00a3:
                X.T62 r22 = new X.T62
                r0 = r22
                r0.<init>(r3)
                r0 = 0
                X.0qQ.A0B(r2, r0)
                r0 = 36316843295707823(0x8105fa000112af, double:3.03025616417129E-306)
                r5 = r21
                boolean r44 = X.182.A06(r5, r2, r0)
                boolean r45 = X.C9837Rhz.A00(r2)
                r0 = -1413454569(0xffffffffabc06517, float:-1.3670479E-12)
                int r1 = X.AnonymousClass0fD.A03(r0)
                X.SSz r6 = X.Ri1.A00(r2)
                java.lang.String r5 = "browser_link_history_opt_in_key"
                X.0xa r0 = r6.A03
                boolean r0 = r0.contains(r5)
                if (r0 != 0) goto L_0x0228
                java.lang.Integer r14 = X.AnonymousClass05K.A00
                r0 = 1882117712(0x702ed650, float:2.1643792E29)
            L_0x00d7:
                X.AnonymousClass0fD.A0A(r0, r1)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_LINK_HISTORY_ITEM_ID"
                java.lang.String r37 = r1.getString(r0)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_REEL_VIEWER_SESSION_ID"
                java.lang.String r19 = r1.getString(r0)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_REEL_TRAY_SESSION_ID"
                java.lang.String r39 = r1.getString(r0)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_CALLSITE_SESSION_ID"
                java.lang.String r18 = r1.getString(r0)
                android.os.Bundle r1 = r3.A00
                java.lang.String r0 = "TrackingInfo.ARG_REEL_ID"
                java.lang.String r8 = r1.getString(r0)
                r1 = 4
                r0 = r32
                X.0qQ.A0B(r0, r1)
                r0 = 12
                X.0qQ.A0B(r14, r0)
                if (r23 == 0) goto L_0x0195
                r5 = 0
                r0 = r22
                X.QKn r11 = r0.A00
                java.lang.String r0 = r11.A00()
                X.T7n r10 = new X.T7n
                r10.<init>(r0, r5)
                X.RGn r1 = r4.A02
                X.RGn r0 = X.C8945RGn.IAB_LANDING_PAGE_INTERACTIVE
                if (r1 != r0) goto L_0x017e
                r0 = r4
                com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent r0 = (com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent) r0
                r15 = 0
                X.0qQ.A0B(r0, r15)
                r1 = r26
                X.1Xj r7 = X.DbV.A0U(r2, r1)
                if (r7 == 0) goto L_0x017e
                int r6 = r7.A0o()
                boolean r1 = r7.A4o()
                X.3W1 r13 = new X.3W1
                r13.<init>(r6, r1)
                java.lang.String r1 = r11.A00()
                X.2pc r6 = X.C254373sN.A02(r1)
                long r11 = r0.A02
                r16 = 0
                int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                boolean r11 = X.AnonymousClass7TF.A1R(r1)
                long r0 = r0.A03
                r16 = r0
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)
                java.lang.Long r11 = java.lang.Long.valueOf(r16)
                r0 = 15
                X.9Ib r1 = new X.9Ib
                r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r12, (java.lang.Object) r11)
                X.5yf r0 = new X.5yf
                r0.<init>(r1, r5, r5, r5)
                X.2pc r1 = X.C230432pc.FEED
                if (r6 != r1) goto L_0x01b5
                X.1L2 r5 = X.AnonymousClass1L1.A01
                r1 = r18
                X.1L1 r1 = r5.A01(r1)
                X.2kz r5 = X.C228202kx.A00(r2, r10, r1)
                X.2v9 r1 = X.C233162v9.IAB_NO_BOUNCE
                r5.DUE(r0, r1, r7, r13)
            L_0x017e:
                X.SGv r27 = X.SCL.A00
                r28 = r4
                r29 = r22
                r30 = r2
                r31 = r14
                r34 = r26
                r35 = r24
                r38 = r19
                r40 = r18
                r42 = r57
                r27.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45)
            L_0x0195:
                X.RGn r7 = r4.A02
                int r8 = r7.ordinal()
                switch(r8) {
                    case 0: goto L_0x0249;
                    case 1: goto L_0x039c;
                    case 2: goto L_0x039c;
                    case 3: goto L_0x039c;
                    case 4: goto L_0x039c;
                    case 5: goto L_0x039c;
                    case 6: goto L_0x039c;
                    case 7: goto L_0x039c;
                    case 8: goto L_0x039c;
                    case 9: goto L_0x019e;
                    case 10: goto L_0x039c;
                    case 11: goto L_0x039c;
                    case 12: goto L_0x039c;
                    case 13: goto L_0x039c;
                    case 14: goto L_0x039c;
                    case 15: goto L_0x039c;
                    case 16: goto L_0x039c;
                    case 17: goto L_0x039c;
                    case 18: goto L_0x039c;
                    case 19: goto L_0x039c;
                    case 20: goto L_0x039c;
                    case 21: goto L_0x039c;
                    case 22: goto L_0x039c;
                    case 23: goto L_0x039c;
                    case 24: goto L_0x039c;
                    case 25: goto L_0x039c;
                    case 26: goto L_0x039c;
                    default: goto L_0x019e;
                }
            L_0x019e:
                java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
                java.lang.String r0 = "Encountered unsupported IABEvent: "
                java.lang.String r0 = X.AnonymousClass7TG.A0m(r7, r0, r1)
                java.lang.UnsupportedOperationException r2 = X.AnonymousClass7TE.A1B(r0)
                r1 = 353641258(0x1514232a, float:2.99161E-26)
                r0 = r20
                X.AnonymousClass0fD.A0A(r1, r0)
                throw r2
            L_0x01b5:
                X.2pc r1 = X.C230432pc.CLIPS
                if (r6 != r1) goto L_0x01dc
                X.T8Q r8 = new X.T8Q
                r6 = r19
                r1 = r18
                r8.<init>(r6, r1)
                java.lang.String r1 = r10.A00
                X.GKY r6 = X.C52020GBr.A00(r2, r8, r1)
                X.5o3 r1 = X.C267324bN.A0d
                X.4bN r7 = r1.A04(r7)
                X.1se r1 = X.1sd.A00(r2)
                X.GDe r5 = X.C52057GDd.A01(r7, r2, r1, r5, r5)
                X.2v9 r1 = X.C233162v9.IAB_NO_BOUNCE
                r6.DUE(r0, r1, r7, r5)
                goto L_0x017e
            L_0x01dc:
                X.2pc r1 = X.C230432pc.STORIES
                if (r6 != r1) goto L_0x017e
                X.1Xy r1 = r7.A0C
                com.instagram.user.model.User r1 = r1.CCd()
                if (r1 == 0) goto L_0x017e
                if (r8 == 0) goto L_0x017e
                X.3uh r11 = new X.3uh
                r11.<init>((X.1Xj) r7, (com.instagram.user.model.User) r1, (java.lang.String) r8)
                X.1Nr r6 = new X.1Nr
                r6.<init>(r1)
                com.instagram.model.reels.Reel r7 = new com.instagram.model.reels.Reel
                r7.<init>(r6, r8, r15)
                r53 = -1
                X.0sl r52 = X.0sl.A00
                long r54 = java.lang.System.currentTimeMillis()
                java.lang.Boolean r49 = java.lang.Boolean.valueOf(r15)
                X.3mM r1 = new X.3mM
                r46 = r1
                r47 = r2
                r48 = r7
                r50 = r5
                r51 = r5
                r56 = r15
                r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r56)
                if (r18 != 0) goto L_0x0225
                java.lang.String r5 = ""
            L_0x021a:
                X.3Cd r6 = X.C309976aE.A00(r2, r10, r5)
                X.2v9 r5 = X.C233162v9.IAB_NO_BOUNCE
                r6.DUE(r0, r5, r11, r1)
                goto L_0x017e
            L_0x0225:
                r5 = r18
                goto L_0x021a
            L_0x0228:
                java.lang.Boolean r0 = r6.A05()
                if (r0 == 0) goto L_0x023e
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x023b
                java.lang.Integer r14 = X.AnonymousClass05K.A0C
            L_0x0236:
                r0 = 1478584837(0x58216a05, float:7.0990689E14)
                goto L_0x00d7
            L_0x023b:
                java.lang.Integer r14 = X.AnonymousClass05K.A0N
                goto L_0x0236
            L_0x023e:
                java.lang.Integer r14 = X.AnonymousClass05K.A01
                r0 = 690537949(0x2928c5dd, float:3.7475113E-14)
                goto L_0x00d7
            L_0x0245:
                r23 = 0
                goto L_0x00a3
            L_0x0249:
                r10 = r4
                com.facebook.iabeventlogging.model.IABWebviewEndEvent r10 = (com.facebook.iabeventlogging.model.IABWebviewEndEvent) r10
                android.os.Bundle r12 = X.AnonymousClass7TE.A0a()
                java.lang.String r1 = "logging_enabled"
                r0 = r23
                r12.putBoolean(r1, r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r13 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.Mrs r11 = r13.A04
                r6 = 4
                int r5 = r10.A02
                r1 = -1
                java.lang.String r0 = r3.A00()
                android.os.Message r0 = r11.obtainMessage(r6, r5, r1, r0)
                r0.setData(r12)
                r0.sendToTarget()
                android.content.Context r1 = r13.getApplicationContext()
                r19 = 0
                r0 = r25
                X.0qQ.A0B(r1, r0)
                r0 = 36317543378916665(0x81069d00371539, double:3.030698899611571E-306)
                r5 = r21
                boolean r0 = X.182.A06(r5, r2, r0)
                if (r0 == 0) goto L_0x039c
                java.lang.String r1 = r10.A0U
                X.2EG r0 = X.2EG.A0u
                java.lang.String r0 = r0.toString()
                boolean r0 = X.0qQ.A0K(r1, r0)
                if (r0 == 0) goto L_0x039c
                X.0Tu r5 = X.0Tu.A06
                r0 = 36317543381800261(0x81069d00631545, double:3.0306989014351685E-306)
                boolean r0 = X.182.A06(r5, r2, r0)
                if (r0 == 0) goto L_0x030e
                X.I6B r11 = X.C55273Hf2.A00(r2)
                monitor-enter(r11)
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04bd }
                long r5 = r10.A0D     // Catch:{ all -> 0x04bd }
                com.instagram.common.session.UserSession r12 = r11.A03     // Catch:{ all -> 0x04bd }
                boolean r10 = X.GP5.A01(r12)     // Catch:{ all -> 0x04bd }
                r14 = -1
                if (r10 == 0) goto L_0x02ce
                X.A9A r10 = X.C55069Hbe.A00(r12)     // Catch:{ all -> 0x04bd }
                int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                long r0 = X.G9t.A0k(r0)
                X.0eM r5 = r10.A06     // Catch:{ Exception -> 0x039b }
                java.lang.Object r6 = r5.getValue()     // Catch:{ Exception -> 0x039b }
                X.Th5 r6 = (X.C13790Th5) r6     // Catch:{ Exception -> 0x039b }
                java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x039b }
                r6.FOA(r0, r5)     // Catch:{ Exception -> 0x039b }
                goto L_0x039b
            L_0x02ce:
                java.util.ArrayList r12 = X.I6B.A00(r11)     // Catch:{ all -> 0x04bd }
                int r13 = r12.size()     // Catch:{ all -> 0x04bd }
                r10 = 20
                if (r13 != r10) goto L_0x02df
                r10 = r19
                r12.remove(r10)     // Catch:{ all -> 0x04bd }
            L_0x02df:
                int r10 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r10 == 0) goto L_0x02e4
                goto L_0x02ed
            L_0x02e4:
                r6 = 2
                X.QP4 r10 = new X.QP4     // Catch:{ all -> 0x04bd }
                r5 = r19
                r10.<init>(r0, r6, r5)     // Catch:{ all -> 0x04bd }
                goto L_0x02f5
            L_0x02ed:
                r6 = 2
                X.QP4 r10 = new X.QP4     // Catch:{ all -> 0x04bd }
                r5 = r25
                r10.<init>(r0, r6, r5)     // Catch:{ all -> 0x04bd }
            L_0x02f5:
                r12.add(r10)     // Catch:{ all -> 0x04bd }
                X.0xa r0 = r11.A04     // Catch:{ all -> 0x04bd }
                X.0xY r5 = r0.AR4()     // Catch:{ all -> 0x04bd }
                java.lang.String r1 = "KEY_SWIPE_HISTORY_V2"
                X.4da r0 = r11.A02     // Catch:{ all -> 0x04bd }
                java.lang.String r0 = r0.A0F(r12)     // Catch:{ all -> 0x04bd }
                r5.E5g(r1, r0)     // Catch:{ all -> 0x04bd }
                r5.apply()     // Catch:{ all -> 0x04bd }
                goto L_0x039b
            L_0x030e:
                X.GP6 r11 = X.C52346GOq.A00(r2)
                monitor-enter(r11)
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04bd }
                X.R1g r0 = new X.R1g     // Catch:{ all -> 0x04bd }
                r0.<init>()     // Catch:{ all -> 0x04bd }
                java.lang.reflect.Type r0 = r0.A00     // Catch:{ all -> 0x04bd }
                r15 = r0
                long r0 = r10.A0D     // Catch:{ all -> 0x04bd }
                com.instagram.common.session.UserSession r12 = r11.A03     // Catch:{ all -> 0x04bd }
                boolean r10 = X.GP5.A01(r12)     // Catch:{ all -> 0x04bd }
                r17 = -1
                if (r10 == 0) goto L_0x0343
                X.A9A r6 = X.C55069Hbe.A00(r12)     // Catch:{ all -> 0x04bd }
                int r5 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
                long r0 = X.G9t.A0k(r5)
                X.0eM r5 = r6.A06     // Catch:{ Exception -> 0x039b }
                java.lang.Object r6 = r5.getValue()     // Catch:{ Exception -> 0x039b }
                X.Th5 r6 = (X.C13790Th5) r6     // Catch:{ Exception -> 0x039b }
                java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x039b }
                r6.FOA(r0, r5)     // Catch:{ Exception -> 0x039b }
                goto L_0x039b
            L_0x0343:
                X.0xa r10 = r11.A04     // Catch:{ all -> 0x04bd }
                r22 = r10
                java.lang.String r13 = "KEY_SWIPE_HISTORY_V2"
                r12 = 0
                java.lang.String r14 = r10.getString(r13, r12)     // Catch:{ all -> 0x04bd }
                r16 = 20
                if (r14 == 0) goto L_0x036b
                com.google.gson.Gson r10 = r11.A02     // Catch:{ all -> 0x04bd }
                java.lang.Object r14 = r10.A09(r14, r15)     // Catch:{ all -> 0x04bd }
                X.0qQ.A07(r14)     // Catch:{ all -> 0x04bd }
                java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x04bd }
            L_0x035d:
                int r10 = r14.size()     // Catch:{ all -> 0x04bd }
                r15 = r16
                if (r10 != r15) goto L_0x0370
                r10 = r19
                r14.remove(r10)     // Catch:{ all -> 0x04bd }
                goto L_0x0370
            L_0x036b:
                java.util.ArrayList r14 = X.DbS.A0v(r16)     // Catch:{ all -> 0x04bd }
                goto L_0x035d
            L_0x0370:
                int r10 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
                if (r10 == 0) goto L_0x0375
                goto L_0x037f
            L_0x0375:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x04bd }
                X.GlJ r1 = new X.GlJ     // Catch:{ all -> 0x04bd }
                r1.<init>(r0, r12, r5)     // Catch:{ all -> 0x04bd }
                goto L_0x0388
            L_0x037f:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)     // Catch:{ all -> 0x04bd }
                X.GlJ r1 = new X.GlJ     // Catch:{ all -> 0x04bd }
                r1.<init>(r0, r12, r5)     // Catch:{ all -> 0x04bd }
            L_0x0388:
                r14.add(r1)     // Catch:{ all -> 0x04bd }
                X.0xY r1 = r22.AR4()     // Catch:{ all -> 0x04bd }
                com.google.gson.Gson r0 = r11.A02     // Catch:{ all -> 0x04bd }
                java.lang.String r0 = r0.A0B(r14)     // Catch:{ all -> 0x04bd }
                r1.E5g(r13, r0)     // Catch:{ all -> 0x04bd }
                r1.apply()     // Catch:{ all -> 0x04bd }
            L_0x039b:
                monitor-exit(r11)
            L_0x039c:
                r0 = 684200808(0x28c81368, float:2.2212877E-14)
                int r5 = X.AnonymousClass0fD.A03(r0)
                boolean r0 = X.C9837Rhz.A00(r2)
                if (r0 != 0) goto L_0x03b4
                r0 = 2011883848(0x77eae948, float:9.5291326E33)
            L_0x03ac:
                X.AnonymousClass0fD.A0A(r0, r5)
                r1 = -1653277753(0xffffffff9d74fbc7, float:-3.2423297E-21)
                goto L_0x0014
            L_0x03b4:
                X.RGn r0 = X.C8945RGn.IAB_LAUNCH
                if (r7 != r0) goto L_0x03d9
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r6 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r6.A05
                r0 = 0
                r1.set(r0)
                android.os.Handler r10 = new android.os.Handler
                r10.<init>()
                r6.A00 = r10
                X.TKP r6 = new X.TKP
                r11 = r6
                r12 = r4
                r13 = r9
                r14 = r3
                r15 = r24
                r16 = r23
                r11.<init>(r12, r13, r14, r15, r16)
                r0 = 3000(0xbb8, double:1.482E-320)
                r10.postDelayed(r6, r0)
            L_0x03d9:
                r0 = r25
                if (r8 == r0) goto L_0x04b9
                r0 = 4
                if (r8 == r0) goto L_0x04b5
                r0 = 3
                if (r8 == r0) goto L_0x04b1
                java.lang.String r10 = ""
            L_0x03e5:
                r0 = -105275558(0xfffffffff9b99f5a, float:-1.2047587E35)
                int r8 = X.AnonymousClass0fD.A03(r0)
                r0 = 36879793249648923(0x8305fa0009011b, double:3.3862679818611585E-306)
                r6 = r21
                java.lang.String r1 = X.182.A04(r6, r2, r0)
                boolean r0 = X.AnonymousClass5He.A00(r1)
                if (r0 == 0) goto L_0x03ff
                java.lang.String r1 = "launch"
            L_0x03ff:
                r0 = -2121907676(0xffffffff81864224, float:-4.9318733E-38)
                X.AnonymousClass0fD.A0A(r0, r8)
                boolean r0 = r10.equals(r1)
                if (r0 == 0) goto L_0x0432
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.A05
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0432
                X.RGn r0 = X.C8945RGn.IAB_LANDING_PAGE_INTERACTIVE
                r8 = 0
                if (r7 != r0) goto L_0x04ae
                r0 = r4
                com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent r0 = (com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent) r0
                java.lang.String r8 = r0.A05
                java.lang.String r1 = r9.A02(r0)
            L_0x0423:
                java.lang.String r6 = r3.A00()
                r0 = r24
                boolean r1 = A08(r9, r3, r0, r8, r1)
                r0 = r23
                A05(r4, r9, r6, r0, r1)
            L_0x0432:
                X.RGn r0 = X.C8945RGn.IAB_LANDING_PAGE_INTERACTIVE
                if (r7 != r0) goto L_0x0458
                com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent r4 = (com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent) r4
                r0 = -1088620721(0xffffffffbf1cf74f, float:-0.6131486)
                int r10 = X.AnonymousClass0fD.A03(r0)
                r0 = 36598318273924276(0x8205fa00180cb4, double:3.2082620738041385E-306)
                r3 = r21
                int r0 = X.Pxg.A05(r3, r2, r0)
                java.lang.Integer r1 = X.RUY.A00(r0)
                java.lang.Integer r0 = X.AnonymousClass05K.A0N
                if (r1 == r0) goto L_0x0481
                r0 = 1328728334(0x4f32c90e, float:2.99952077E9)
            L_0x0455:
                X.AnonymousClass0fD.A0A(r0, r10)
            L_0x0458:
                r0 = 36316843296101042(0x8105fa000712b2, double:3.0302561644199636E-306)
                r3 = r21
                boolean r0 = X.182.A06(r3, r2, r0)
                if (r0 == 0) goto L_0x047c
                X.RGn r0 = X.C8945RGn.IAB_WEBVIEW_END
                if (r7 != r0) goto L_0x047c
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r1 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.A05
                boolean r0 = r0.get()
                if (r0 == 0) goto L_0x047c
                android.content.Context r1 = r1.getApplicationContext()
                r0 = r32
                X.SAP.A00(r2, r1, r0)
            L_0x047c:
                r0 = 1964360899(0x7515c4c3, float:1.8985426E32)
                goto L_0x03ac
            L_0x0481:
                java.lang.String r8 = r9.A02(r4)
                if (r8 == 0) goto L_0x04aa
                boolean r0 = r8.isEmpty()
                if (r0 != 0) goto L_0x04aa
                X.SSz r6 = X.Ri1.A00(r2)
                long r3 = java.lang.System.currentTimeMillis()
                X.C11423SSz.A02(r6)
                java.util.Map r1 = r6.A01
                if (r1 == 0) goto L_0x04a3
                java.lang.Long r0 = java.lang.Long.valueOf(r3)
                r1.put(r0, r8)
            L_0x04a3:
                X.C11423SSz.A04(r6)
                r0 = -1985442780(0xffffffff89a88c24, float:-4.0576316E-33)
                goto L_0x0455
            L_0x04aa:
                r0 = 1082758248(0x40899468, float:4.299366)
                goto L_0x0455
            L_0x04ae:
                r1 = r8
                goto L_0x0423
            L_0x04b1:
                java.lang.String r10 = "interactive"
                goto L_0x03e5
            L_0x04b5:
                java.lang.String r10 = "fully_loaded"
                goto L_0x03e5
            L_0x04b9:
                java.lang.String r10 = "launch"
                goto L_0x03e5
            L_0x04bd:
                r2 = move-exception
                monitor-exit(r11)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.A04(android.os.Bundle, com.facebook.iabeventlogging.model.IABEvent, com.instagram.inappbrowser.service.BrowserLiteCallbackService$BrowserLiteCallbackImpl):void");
        }

        private String A02(IABLandingPageInteractiveEvent iABLandingPageInteractiveEvent) {
            int A032 = AnonymousClass0fD.A03(-618006564);
            String str = iABLandingPageInteractiveEvent.A06;
            if (str == null) {
                AnonymousClass0fD.A0A(987050199, A032);
                return null;
            }
            try {
                String host = new URI(str).getHost();
                AnonymousClass0fD.A0A(68008810, A032);
                return host;
            } catch (URISyntaxException e) {
                0KC.A0Q("IgBrowserLiteCallbackService", "Couldn't parse %s as URI", new Object[]{str, e});
                AnonymousClass0fD.A0A(106978769, A032);
                return null;
            }
        }

        private String A03(C7572QKn qKn) {
            int i;
            int A032 = AnonymousClass0fD.A03(388804878);
            String string = qKn.A00.getString("TrackingInfo.ARG_TRACKING_TOKEN");
            if (string != null) {
                i = -1130447203;
            } else {
                1Xj A022 = 1E7.A00(this.A02).A02(SDT.A00(qKn));
                if (A022 != null) {
                    string = A022.C9L();
                } else {
                    string = null;
                }
                i = -449139813;
            }
            AnonymousClass0fD.A0A(i, A032);
            return string;
        }

        public static void A05(IABEvent iABEvent, BrowserLiteCallbackImpl browserLiteCallbackImpl, String str, boolean z, boolean z2) {
            int A032 = AnonymousClass0fD.A03(-1087068544);
            BrowserLiteCallbackService browserLiteCallbackService = BrowserLiteCallbackService.this;
            browserLiteCallbackService.A05.set(true);
            int A033 = AnonymousClass0fD.A03(-927867038);
            UserSession userSession = browserLiteCallbackImpl.A02;
            String str2 = iABEvent.A03;
            C9836Rhy.A00(new C11242SHc(userSession, str2, str, z), new TPT(iABEvent, browserLiteCallbackImpl, str, z, z2), new TPI(4), true);
            AnonymousClass0fD.A0A(1309761585, A033);
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36316843296101042L)) {
                SAP.A01(userSession, browserLiteCallbackService.getApplicationContext(), str2);
            }
            AnonymousClass0fD.A0A(-1178443903, A032);
        }

        public static void A06(String str, Map map) {
            Object obj;
            if (map != null && (obj = map.get(str)) != null && (obj instanceof String)) {
                02m.A0p.markerAnnotate(19791876, str, (String) obj);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ac, code lost:
            if (r0.containsValue(r5) == true) goto L_0x02b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b3, code lost:
            if (r0 != false) goto L_0x02b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0111, code lost:
            if (r14 <= 1) goto L_0x0113;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0190, code lost:
            if (r4 > r16) goto L_0x0113;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x024a, code lost:
            if (r1 < 18) goto L_0x02b5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02bf  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x02c4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean A08(com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl r33, X.C7572QKn r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) {
            /*
                r0 = 2048440803(0x7a18b9e3, float:1.9824984E35)
                int r32 = X.AnonymousClass0fD.A03(r0)
                r0 = r34
                android.os.Bundle r1 = r0.A00
                java.lang.String r0 = "TrackingInfo.ARG_FORCE_DISABLE_LINK_HISTORY_OPT_IN_NUX"
                r10 = 0
                boolean r0 = r1.getBoolean(r0, r10)
                r31 = 0
                if (r0 == 0) goto L_0x001f
                r1 = -678720448(0xffffffffd78b8c40, float:-3.06868971E14)
            L_0x0019:
                r0 = r32
                X.AnonymousClass0fD.A0A(r1, r0)
                return r31
            L_0x001f:
                r0 = r33
                com.instagram.common.session.UserSession r8 = r0.A02
                X.SSz r7 = X.Ri1.A00(r8)
                r0 = -626009219(0xffffffffdaafdb7d, float:-2.47497254E16)
                int r3 = X.AnonymousClass0fD.A03(r0)
                X.0qQ.A0B(r8, r10)
                X.0Tu r6 = X.0Tu.A05
                r0 = 36316843297018550(0x8105fa001512b6, double:3.0302561650001993E-306)
                boolean r0 = X.182.A06(r6, r8, r0)
                if (r0 != 0) goto L_0x01c8
                r0 = 1460684644(0x57104764, float:1.58636295E14)
            L_0x0041:
                X.AnonymousClass0fD.A0A(r0, r3)
                r0 = 1356274595(0x50d71ba3, float:2.88713011E10)
                int r30 = X.AnonymousClass0fD.A03(r0)
                long r4 = java.lang.System.currentTimeMillis()
                X.0xa r1 = r7.A03
                java.lang.String r0 = "browser_link_history_optin_nux_count"
                int r29 = r1.getInt(r0, r10)
                java.lang.String r0 = "browser_link_history_optin_nux_last_seen"
                r2 = 0
                long r27 = r1.getLong(r0, r2)
                X.C11423SSz.A01(r7)
                java.util.List r12 = r7.A00
                if (r12 != 0) goto L_0x0068
                X.0sn r12 = X.0sn.A00
            L_0x0068:
                r0 = -1498818375(0xffffffffa6a9d8b9, float:-1.1785473E-15)
                int r16 = X.AnonymousClass0fD.A03(r0)
                android.os.Bundle r9 = X.AnonymousClass7TE.A0a()
                r0 = 36598318273924276(0x8205fa00180cb4, double:3.2082620738041385E-306)
                int r1 = X.Pxg.A05(r6, r8, r0)
                java.lang.String r26 = "nux_delivery_targeting_experiment_variant"
                r0 = r26
                r9.putInt(r0, r1)
                java.lang.String r15 = "nux_delivery_targeting_current_time"
                r9.putLong(r15, r4)
                java.lang.String r25 = "nux_delivery_targeting_preclick_surface"
                r1 = r36
                r0 = r25
                r9.putString(r0, r1)
                java.lang.String r24 = "nux_delivery_targeting_is_instagram"
                r11 = 1
                r0 = r24
                r9.putBoolean(r0, r11)
                java.lang.String r13 = "nux_delivery_targeting_landing_domain"
                r0 = r37
                r9.putString(r13, r0)
                r0 = 36598318273989813(0x8205fa00190cb5, double:3.2082620738455843E-306)
                long r0 = X.182.A01(r6, r8, r0)
                java.lang.String r23 = "nux_delivery_targeting_landing_domain_history_validity_period"
                r14 = r23
                r9.putLong(r14, r0)
                r0 = 36879793250763038(0x8305fa001a011e, double:3.3862679825657293E-306)
                java.lang.String r1 = X.182.A04(r6, r8, r0)
                java.lang.String r22 = "nux_delivery_targeting_top_domains"
                r0 = r22
                r9.putString(r0, r1)
                r1 = -1553366854(0xffffffffa36980ba, float:-1.2658214E-17)
                r0 = r16
                X.AnonymousClass0fD.A0A(r1, r0)
                r21 = 3
                r0 = 36598318273072302(0x8205fa000b0cae, double:3.208262073265347E-306)
                int r14 = X.DbS.A04(r6, r8, r0)
                if (r14 > 0) goto L_0x00dd
                r14 = 3
            L_0x00dd:
                r0 = 36598318273006765(0x8205fa000a0cad, double:3.208262073223901E-306)
                long r18 = X.182.A01(r6, r8, r0)
                int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x0197
                r0 = 86400000(0x5265c00, double:4.2687272E-316)
                long r18 = r18 * r0
            L_0x00ef:
                long r16 = r4 - r27
                r20 = 1
                int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                boolean r1 = X.AnonymousClass7TF.A1R(r0)
                r0 = r29
                boolean r0 = X.AnonymousClass7TF.A1T(r0, r14)
                if (r1 == 0) goto L_0x026b
                if (r0 == 0) goto L_0x026b
                r0 = 36598318273858739(0x8205fa00170cb3, double:3.2082620737626926E-306)
                long r0 = X.182.A01(r6, r8, r0)
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 <= 0) goto L_0x0162
                int r14 = (int) r0
                if (r14 > r11) goto L_0x0163
            L_0x0113:
                r0 = r26
                int r0 = r9.getInt(r0)
                java.lang.Integer r0 = X.RUY.A00(r0)
                int r1 = r0.intValue()
                if (r1 == r10) goto L_0x02b5
                if (r1 == r11) goto L_0x022c
                r0 = 2
                if (r1 == r0) goto L_0x01f9
                r0 = r21
                if (r1 == r0) goto L_0x024d
                r0 = 4
                if (r1 != r0) goto L_0x035f
                java.lang.String r7 = r9.getString(r13)
                if (r7 == 0) goto L_0x026b
                r0 = r22
                java.lang.String r1 = r9.getString(r0)
                if (r1 == 0) goto L_0x026b
                java.lang.String r0 = " , "
                java.util.List r0 = X.DbV.A18(r1, r0)
                if (r0 == 0) goto L_0x026b
                java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
                java.util.Iterator r4 = r0.iterator()
            L_0x014d:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x02af
                java.lang.Object r1 = r4.next()
                r0 = r1
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = X.00l.A0W(r0)
                X.DbV.A1U(r1, r5, r0)
                goto L_0x014d
            L_0x0162:
                r14 = 2
            L_0x0163:
                int r0 = r12.size()
                if (r0 == 0) goto L_0x0113
                int r1 = r0 % r14
                if (r1 != 0) goto L_0x0113
                int r0 = r0 - r14
                java.lang.Object r0 = X.00k.A0O(r12, r0)
                java.lang.Number r0 = (java.lang.Number) r0
                if (r0 == 0) goto L_0x0113
                long r0 = r0.longValue()
                long r4 = r4 - r0
                r0 = 36598318273793202(0x8205fa00160cb2, double:3.208262073721247E-306)
                long r0 = X.182.A01(r6, r8, r0)
                int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r12 <= 0) goto L_0x0193
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.DAYS
                long r16 = r12.toMillis(r0)
            L_0x018e:
                int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                if (r0 <= 0) goto L_0x026b
                goto L_0x0113
            L_0x0193:
                r16 = 1209600000(0x48190800, double:5.97621805E-315)
                goto L_0x018e
            L_0x0197:
                r18 = 1209600000(0x48190800, double:5.97621805E-315)
                goto L_0x00ef
            L_0x019c:
                X.C11423SSz.A01(r7)
                java.util.List r0 = r7.A00
                r1 = 1
                if (r0 == 0) goto L_0x01b1
                boolean r0 = X.AnonymousClass7TE.A1b(r0)
                if (r0 != r1) goto L_0x01b1
                java.util.List r0 = r7.A00
                if (r0 == 0) goto L_0x01b1
                r0.remove(r10)
            L_0x01b1:
                X.C11423SSz.A03(r7)
                X.0xa r0 = r7.A03
                X.0xY r2 = r0.AR4()
                java.util.List r0 = r7.A00
                int r1 = X.C51971G9r.A0H(r0)
                java.lang.String r0 = "browser_link_history_optin_nux_count"
                r2.E5Z(r0, r1)
                r2.apply()
            L_0x01c8:
                X.C11423SSz.A01(r7)
                java.util.List r0 = r7.A00
                if (r0 == 0) goto L_0x01f2
                java.lang.Object r2 = X.00k.A0J(r0)
                java.lang.Number r2 = (java.lang.Number) r2
            L_0x01d5:
                long r11 = java.lang.System.currentTimeMillis()
                if (r2 == 0) goto L_0x01f4
                r0 = 36598318273662129(0x8205fa00140cb1, double:3.2082620736383557E-306)
                long r4 = X.182.A01(r6, r8, r0)
                r0 = 86400000(0x5265c00, double:4.2687272E-316)
                long r4 = r4 * r0
                long r1 = r2.longValue()
                long r11 = r11 - r4
                int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x01f4
                goto L_0x019c
            L_0x01f2:
                r2 = 0
                goto L_0x01d5
            L_0x01f4:
                r0 = -1349278205(0xffffffffaf93a603, float:-2.6857103E-10)
                goto L_0x0041
            L_0x01f9:
                r0 = r25
                java.lang.String r7 = r9.getString(r0)
                r0 = r24
                boolean r0 = r9.getBoolean(r0)
                if (r0 == 0) goto L_0x021d
                java.lang.String r4 = "ad_tag"
                java.lang.String r1 = "row_cta"
                java.lang.String r0 = "row_tap_extension_bottom"
                java.lang.String[] r0 = new java.lang.String[]{r4, r1, r0}
            L_0x0213:
                java.util.List r0 = X.0sr.A1P(r0)
                boolean r0 = X.00k.A0u(r0, r7)
                goto L_0x02b3
            L_0x021d:
                java.lang.String r5 = "feed_ads"
                java.lang.String r4 = "feed_ads_cta"
                java.lang.String r1 = "multi_share_ads"
                java.lang.String r0 = "video_feed_ads"
                java.lang.String[] r0 = new java.lang.String[]{r5, r4, r1, r0}
                goto L_0x0213
            L_0x022c:
                long r0 = r9.getLong(r15, r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x02b5
                java.util.Calendar r4 = java.util.Calendar.getInstance()
                X.0qQ.A07(r4)
                r4.setTimeInMillis(r0)
                r0 = 11
                int r1 = r4.get(r0)
                r0 = 12
                if (r0 > r1) goto L_0x026b
                r0 = 18
                if (r1 >= r0) goto L_0x026b
                goto L_0x02b5
            L_0x024d:
                java.lang.String r5 = r9.getString(r13)
                long r18 = r9.getLong(r15, r2)
                r0 = r23
                long r0 = r9.getLong(r0, r2)
                if (r5 == 0) goto L_0x026b
                int r4 = r5.length()
                if (r4 == 0) goto L_0x026b
                int r4 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x026b
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x026e
            L_0x026b:
                r20 = 0
                goto L_0x02b5
            L_0x026e:
                X.C11423SSz.A02(r7)
                java.util.Map r4 = r7.A01
                if (r4 == 0) goto L_0x02a1
                java.util.Set r4 = r4.keySet()
                if (r4 == 0) goto L_0x02a1
                java.lang.Comparable r9 = X.00k.A06(r4)
                java.lang.Number r9 = (java.lang.Number) r9
                if (r9 == 0) goto L_0x02a1
                long r16 = r9.longValue()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS
                long r14 = r4.toMillis(r0)
                long r12 = r18 - r14
                int r4 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
                if (r4 >= 0) goto L_0x02a1
                X.C11423SSz.A02(r7)
                java.util.Map r4 = r7.A01
                if (r4 == 0) goto L_0x029d
                r4.remove(r9)
            L_0x029d:
                X.C11423SSz.A04(r7)
                goto L_0x026e
            L_0x02a1:
                X.C11423SSz.A02(r7)
                java.util.Map r0 = r7.A01
                if (r0 == 0) goto L_0x026b
                boolean r0 = r0.containsValue(r5)
                if (r0 != r11) goto L_0x026b
                goto L_0x02b5
            L_0x02af:
                boolean r0 = r5.contains(r7)
            L_0x02b3:
                if (r0 == 0) goto L_0x026b
            L_0x02b5:
                r1 = 1419876879(0x54a19a0f, float:5.5525953E12)
                r0 = r30
                X.AnonymousClass0fD.A0A(r1, r0)
                if (r20 != 0) goto L_0x02c4
                r1 = 1422369505(0x54c7a2e1, float:6.8594492E12)
                goto L_0x0019
            L_0x02c4:
                r31 = 1
                if (r35 == 0) goto L_0x035a
                r0 = 36316843296559797(0x8105fa000e12b5, double:3.030256164710082E-306)
                boolean r0 = X.182.A06(r6, r8, r0)
                if (r0 == 0) goto L_0x035a
                r0 = -1821361890(0xffffffff9370391e, float:-3.032042E-27)
                int r4 = X.AnonymousClass0fD.A03(r0)
                X.SSz r0 = X.Ri1.A00(r8)
                java.lang.String r7 = "browser_link_history_optin_nux_first_ad_skip_timestamp"
                X.0xa r5 = r0.A03
                boolean r0 = r5.contains(r7)
                if (r0 != 0) goto L_0x02f6
                X.0xY r9 = r5.AR4()
                long r0 = java.lang.System.currentTimeMillis()
                r9.E5c(r7, r0)
                r9.apply()
            L_0x02f6:
                X.0xY r1 = r5.AR4()
                java.lang.String r9 = "browser_link_history_optin_nux_ad_skip_count"
                int r0 = r5.getInt(r9, r10)
                int r0 = r0 + 1
                r1.E5Z(r9, r0)
                r1.apply()
                int r10 = r5.getInt(r9, r10)
                long r12 = java.lang.System.currentTimeMillis()
                long r0 = r5.getLong(r7, r2)
                long r12 = r12 - r0
                long r2 = (long) r10
                r0 = 36598318273334447(0x8205fa000f0caf, double:3.208262073431128E-306)
                long r10 = X.182.A01(r6, r8, r0)
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x0355
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
                r0 = 36598318273399984(0x8205fa00100cb0, double:3.208262073472574E-306)
                long r0 = X.182.A01(r6, r8, r0)
                long r1 = r2.toMillis(r0)
                int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0355
                X.0xY r0 = r5.AR4()
                r0.ED3(r7)
                X.0xY r0 = X.DbU.A0e(r0, r5)
                r0.ED3(r9)
                r0.apply()
                r1 = 0
                r0 = 1899616287(0x7139d81f, float:9.20256E29)
            L_0x034b:
                X.AnonymousClass0fD.A0A(r0, r4)
                r31 = r1 ^ 1
                r1 = 734050816(0x2bc0ba00, float:1.3694046E-12)
                goto L_0x0019
            L_0x0355:
                r1 = 1
                r0 = 351009276(0x14ebf9fc, float:2.3827537E-26)
                goto L_0x034b
            L_0x035a:
                r1 = 2041602353(0x79b06131, float:1.1447694E35)
                goto L_0x0019
            L_0x035f:
                X.Wub r0 = X.AnonymousClass7TE.A1K()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.A08(com.instagram.inappbrowser.service.BrowserLiteCallbackService$BrowserLiteCallbackImpl, X.QKn, java.lang.String, java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARNING: type inference failed for: r7v0, types: [X.QKn, X.SDT] */
        public final void AE8(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
            ? sdt;
            String str2;
            T9J t9j;
            Map unmodifiableMap;
            Map unmodifiableMap2;
            Map unmodifiableMap3;
            int A032 = AnonymousClass0fD.A03(-1712530432);
            if (bundle == null) {
                sdt = new SDT();
            }
            boolean A07 = A07(bundle);
            if (str.equals("INTEGRITY_LOGGER")) {
                UserSession userSession = this.A02;
                1Xj A022 = 1E7.A00(userSession).A02(SDT.A00(sdt));
                if (A022 != null) {
                    str2 = C231122qu.A07(userSession, A022);
                } else {
                    str2 = null;
                }
                C51972G9s.A1B(userSession, map);
                if (A07) {
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new C12800T7n(sdt.A00(), (String) null), userSession), "si_native_webview_redirect");
                    if (A0e.isSampled() && (t9j = (T9J) map.get("INTEGRITY_LOGGER")) != null) {
                        A0e.AAJ("original_url", t9j.A02);
                        List<T9H> unmodifiableList = Collections.unmodifiableList(t9j.A06);
                        ArrayList A15 = DbV.A15(unmodifiableList);
                        for (T9H t9h : unmodifiableList) {
                            0bb r7 = new 0bb();
                            r7.A06("domain", t9h.A03);
                            r7.A06("md5Domain", t9h.A01);
                            r7.A06("url", t9h.A04);
                            r7.A06("md5Path", t9h.A02);
                            Boolean bool = t9h.A00;
                            if (bool != null) {
                                r7.A03("httpRedirect", bool);
                            }
                            A15.add(r7);
                        }
                        A0e.AAe("redirect_chain", A15);
                        List unmodifiableList2 = Collections.unmodifiableList(t9j.A07);
                        ArrayList A152 = DbV.A15(unmodifiableList2);
                        Iterator it = unmodifiableList2.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass7TE.A11("getEvent");
                        }
                        A0e.AAe("safe_browsing", A152);
                        Set unmodifiableSet = Collections.unmodifiableSet(t9j.A0D);
                        0qQ.A07(unmodifiableSet);
                        A0e.AAe("request_domains", AnonymousClass7TE.A1D(unmodifiableSet));
                        A0e.A9H("resources_mime_type_count", Pxf.A0x(t9j.A0A));
                        Set unmodifiableSet2 = Collections.unmodifiableSet(t9j.A0C);
                        0qQ.A07(unmodifiableSet2);
                        A0e.AAe("images_url", AnonymousClass7TE.A1D(unmodifiableSet2));
                        A0e.A7p("is_page_loaded", t9j.A00);
                        A0e.AAJ("sim_hash", t9j.A03);
                        A0e.AAJ("sim_hash_text", t9j.A05);
                        A0e.AAJ("sim_hash_dom", t9j.A04);
                        A0e.A9F(AnonymousClass000.A00(344), t9j.A01);
                        A0e.AAJ("ad_id", str2);
                        A0e.A9H("html_tag_counts", Pxf.A0x(t9j.A0B));
                        Map A0x = Pxf.A0x(t9j.A08);
                        HashMap A1E = AnonymousClass7TE.A1E();
                        Iterator A0u = AnonymousClass7TF.A0u(A0x);
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            Object key = A1J.getKey();
                            0bb r2 = new 0bb();
                            r2.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf(((T9G) A1J.getValue()).A01));
                            r2.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf(((T9G) A1J.getValue()).A00));
                            A1E.put(key, r2);
                        }
                        A0e.A9H("images_sizes", A1E);
                        Map map2 = t9j.A09;
                        if (map2 == null) {
                            unmodifiableMap = null;
                        } else {
                            unmodifiableMap = Collections.unmodifiableMap(map2);
                        }
                        A0e.A9H("origin_to_sim_hash", unmodifiableMap);
                        if (map2 == null) {
                            unmodifiableMap2 = null;
                        } else {
                            unmodifiableMap2 = Collections.unmodifiableMap(map2);
                        }
                        A0e.A9H("origin_to_sim_hash_text", unmodifiableMap2);
                        if (map2 == null) {
                            unmodifiableMap3 = null;
                        } else {
                            unmodifiableMap3 = Collections.unmodifiableMap(map2);
                        }
                        A0e.A9H("origin_to_sim_hash_dom", unmodifiableMap3);
                        A0e.Cgf();
                    }
                }
            }
            AnonymousClass0fD.A0A(-843779496, A032);
        }

        public final void AUp(AutofillContactDataCallback autofillContactDataCallback) {
            ArrayList A022;
            int A032 = AnonymousClass0fD.A03(-2117300524);
            boolean A06 = 182.A06(0Tu.A06, this.A02, 36310430911299660L);
            BrowserLiteCallbackService.this.getApplicationContext();
            if (A06) {
                ArrayList A1D = AnonymousClass7TE.A1D(23d.A02());
                A022 = AnonymousClass7TE.A1C();
                if (!A1D.isEmpty()) {
                    A022.add(AnonymousClass7TE.A12(A1D));
                }
            } else {
                A022 = 23d.A02();
            }
            autofillContactDataCallback.Czu(A022);
            AnonymousClass0fD.A0A(2020763051, A032);
        }

        public final void AUq(AutofillScriptCallback autofillScriptCallback) {
            int A032 = AnonymousClass0fD.A03(14631190);
            String string = C375149Cl.A00(BrowserLiteCallbackService.this, this.A02).A00.getString("autofill_js", "");
            if (string != null) {
                autofillScriptCallback.Czq(string);
                AnonymousClass0fD.A0A(-670200692, A032);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }

        public final PrefetchCacheEntry Bei(String str) {
            AnonymousClass0fD.A0A(-2143678621, AnonymousClass0fD.A03(652565983));
            return null;
        }

        public final ArrayList Bej() {
            int A032 = AnonymousClass0fD.A03(-2116518670);
            ArrayList A1C = AnonymousClass7TE.A1C();
            AnonymousClass0fD.A0A(1634670910, A032);
            return A1C;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
            if (r1.equals("BWI_REFRESH_TOKEN") == false) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
            r0 = r3.A00;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
            if (r0 == null) goto L_0x0155;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
            r0.A00();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0155, code lost:
            X.0qQ.A0F("accountLinkingManager");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x015e, code lost:
            throw X.AnonymousClass00P.createAndThrow();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
            r0 = -421179501;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void CIO(java.lang.String r18) {
            /*
                r17 = this;
                r0 = 947519828(0x387a0154, float:5.960588E-5)
                int r2 = X.AnonymousClass0fD.A03(r0)
                r0 = r17
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.QKR r3 = r0.A02
                r6 = 1
                r5 = 0
                r1 = r18
                if (r3 != 0) goto L_0x0025
                java.lang.Object[] r3 = new java.lang.Object[]{r1}
                java.lang.String r1 = "IgBrowserLiteCallbackService"
                java.lang.String r0 = "Unable to handle BwI event %s with a null handler"
                X.0KC.A0O(r1, r0, r3)
                r0 = -1592426603(0xffffffffa1157f95, float:-5.0652017E-19)
            L_0x0021:
                X.AnonymousClass0fD.A0A(r0, r2)
                return
            L_0x0025:
                int r0 = r1.hashCode()
                switch(r0) {
                    case -2143630102: goto L_0x0131;
                    case -307507644: goto L_0x00ed;
                    case 653627361: goto L_0x0049;
                    case 999684574: goto L_0x0030;
                    default: goto L_0x002c;
                }
            L_0x002c:
                r0 = -421179501(0xffffffffe6e54f93, float:-5.414449E23)
                goto L_0x0021
            L_0x0030:
                java.lang.String r0 = "BWI_RETURN_TO_FEED"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x002c
                X.7ka r4 = r3.A04
                r1 = 3
                r0 = 0
                r4.AI4(r1, r0)
                java.lang.String r4 = "PAGE_CLOSED"
                java.lang.String r1 = ""
                java.lang.String r0 = "IAB_CLOSE_CHECKOUT_SUCCESS"
                X.SlZ.A00(r3, r4, r1, r0)
                goto L_0x002c
            L_0x0049:
                java.lang.String r0 = "BWI_START_LOGIN"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x002c
                X.SHI r0 = X.SHI.A04
                if (r0 == 0) goto L_0x0061
                X.Rtl r0 = r0.A02
                java.lang.String r0 = r0.A02
                if (r0 == 0) goto L_0x0061
                int r0 = r0.length()
                if (r0 != 0) goto L_0x013b
            L_0x0061:
                X.7ka r7 = r3.A04
                androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
                if (r0 == 0) goto L_0x00b8
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x00b8
                android.os.Bundle r0 = r0.getExtras()
            L_0x0073:
                java.lang.String r4 = "Required value was null."
                if (r0 == 0) goto L_0x0149
                com.instagram.common.session.UserSession r1 = X.DbS.A0U(r0)
                r0 = 333(0x14d, float:4.67E-43)
                java.lang.String r0 = X.AnonymousClass000.A00(r0)
                X.0qQ.A0C(r1, r0)
                X.0qQ.A0B(r1, r5)
                X.OJO r9 = X.C69714Nqa.A00(r1)
                androidx.fragment.app.FragmentActivity r10 = r7.getActivity()
                if (r10 == 0) goto L_0x0144
                X.SHI r0 = X.SHI.A04
                if (r0 == 0) goto L_0x00b5
                X.QP7 r0 = r0.A01
                java.lang.Object r0 = r0.A03
                java.lang.Number r0 = (java.lang.Number) r0
                if (r0 == 0) goto L_0x00b5
                int r1 = r0.intValue()
                r0 = 3
                if (r1 == r0) goto L_0x00b2
                if (r1 != r6) goto L_0x00b5
                java.lang.String r12 = "buy_with_prime"
            L_0x00a8:
                r14 = 0
                java.lang.String r8 = "entry_point"
                java.lang.String r7 = "ad_id"
                org.json.JSONObject r6 = X.DbS.A11()
                goto L_0x00ba
            L_0x00b2:
                java.lang.String r12 = "buy_with_shopee"
                goto L_0x00a8
            L_0x00b5:
                java.lang.String r12 = ""
                goto L_0x00a8
            L_0x00b8:
                r0 = 0
                goto L_0x0073
            L_0x00ba:
                java.lang.String r4 = "iab_session_id"
                android.os.Bundle r1 = r3.A03     // Catch:{ JSONException -> 0x00d4 }
                java.lang.String r0 = X.Pxi.A0d(r1, r7)     // Catch:{ JSONException -> 0x00d4 }
                X.Pxh.A1N(r0, r4, r6)     // Catch:{ JSONException -> 0x00d4 }
                java.lang.String r0 = X.Pxi.A0d(r1, r7)     // Catch:{ JSONException -> 0x00d4 }
                X.Pxh.A1N(r0, r7, r6)     // Catch:{ JSONException -> 0x00d4 }
                java.lang.String r0 = X.Pxi.A0d(r1, r8)     // Catch:{ JSONException -> 0x00d4 }
                r6.put(r8, r0)     // Catch:{ JSONException -> 0x00d4 }
                goto L_0x00dc
            L_0x00d4:
                r4 = move-exception
                java.lang.String r1 = "BwIEventHandler"
                java.lang.String r0 = "Parsing iabSessionId or adId or entryPoint into JSON object threw exception: "
                X.0KC.A0J(r1, r0, r4)
            L_0x00dc:
                java.lang.String r16 = r6.toString()
                X.QYL r11 = new X.QYL
                r11.<init>(r3, r5)
                java.lang.String r13 = "ig4a"
                r15 = r14
                r9.A00(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x002c
            L_0x00ed:
                java.lang.String r0 = "BWI_OPEN_EXTERNAL_LINK"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x002c
                X.SHI r0 = X.SHI.A04
                if (r0 == 0) goto L_0x002c
                java.lang.String r1 = X.SHI.A05
                if (r1 == 0) goto L_0x002c
                int r0 = r1.length()
                if (r0 == 0) goto L_0x002c
                X.S3I r0 = r3.A00
                if (r0 == 0) goto L_0x0155
                X.7ka r0 = r3.A04
                androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
                if (r4 == 0) goto L_0x014e
                android.content.Intent r3 = r3.A02
                android.util.LruCache r0 = X.0cp.A00
                android.net.Uri r1 = android.net.Uri.parse(r1)
                X.0qQ.A07(r1)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r3)
                android.content.Intent r1 = r0.setData(r1)
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r0 = r1.setFlags(r0)
                X.0qQ.A07(r0)
                X.0kR.A0B(r4, r0)
                goto L_0x002c
            L_0x0131:
                java.lang.String r0 = "BWI_REFRESH_TOKEN"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x013b
                goto L_0x002c
            L_0x013b:
                X.S3I r0 = r3.A00
                if (r0 == 0) goto L_0x0155
                r0.A00()
                goto L_0x002c
            L_0x0144:
                java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r4)
                throw r0
            L_0x0149:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
                throw r0
            L_0x014e:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
                throw r0
            L_0x0155:
                java.lang.String r0 = "accountLinkingManager"
                X.0qQ.A0F(r0)
                X.00P r0 = X.AnonymousClass00P.createAndThrow()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.CIO(java.lang.String):void");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
            r2.A08.A00();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
            X.0KC.A0E(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
            r1 = -397138552;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x016f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void CIP(java.lang.String r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = -749240708(0xffffffffd3577e7c, float:-9.2554002E11)
                int r0 = X.AnonymousClass0fD.A03(r0)
                r7 = r18
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r4 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.Sla r2 = r4.A03
                r3 = 1
                r5 = 0
                r6 = r19
                if (r2 != 0) goto L_0x0025
                java.lang.Object[] r3 = new java.lang.Object[]{r6}
                java.lang.String r2 = "IgBrowserLiteCallbackService"
                java.lang.String r1 = "Unable to handle bwp event %s with a null handler"
                X.0KC.A0O(r2, r1, r3)
                r1 = -1910561888(0xffffffff8e1f23a0, float:-1.9615416E-30)
            L_0x0021:
                X.AnonymousClass0fD.A0A(r1, r0)
                return
            L_0x0025:
                int r1 = r6.hashCode()
                switch(r1) {
                    case -1400193688: goto L_0x0030;
                    case -180702031: goto L_0x00da;
                    case 1125690077: goto L_0x00f6;
                    case 1720912631: goto L_0x01e1;
                    default: goto L_0x002c;
                }
            L_0x002c:
                r1 = -397138552(0xffffffffe8542588, float:-4.007336E24)
                goto L_0x0021
            L_0x0030:
                java.lang.String r1 = "BWP_START_LOGIN"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x002c
                com.instagram.common.session.UserSession r7 = r7.A02
                android.content.Context r11 = r4.getApplicationContext()
                X.0qQ.A0B(r7, r5)
                X.0qQ.A0B(r11, r3)
                X.SPF r6 = X.SPF.A06
                if (r6 != 0) goto L_0x004e
                java.lang.String r2 = "IGBwPUserEventHandler"
                java.lang.String r1 = "BwPContext is null!"
                goto L_0x01c9
            L_0x004e:
                X.Rtm r4 = r6.A03
                java.lang.String r1 = r4.A02
                if (r1 == 0) goto L_0x0081
                long r4 = r4.A00
                r8 = 0
                int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0081
                java.lang.System.currentTimeMillis()
                android.os.Bundle r4 = r2.A02
                java.lang.String r3 = "source"
                java.lang.String r1 = "REFRESH_ON_AUTHENTICATE"
                r4.putString(r3, r1)
                X.Rtm r1 = r6.A03
                java.lang.Integer r1 = r1.A01
                java.lang.String r3 = X.RUC.A00(r1)
                java.lang.String r1 = "token_source"
                r4.putString(r1, r3)
                boolean r1 = r2.A09
                if (r1 != 0) goto L_0x00ef
                X.S34 r1 = r2.A07
                r1.A00(r4)
                goto L_0x002c
            L_0x0081:
                java.lang.String r8 = "media_id"
                java.lang.String r9 = "entry_point"
                java.lang.String r10 = "ad_id"
                java.lang.String r5 = "iab_session_id"
                org.json.JSONObject r6 = X.DbS.A11()
                android.os.Bundle r4 = r2.A02     // Catch:{ JSONException -> 0x00b9 }
                java.lang.String r1 = "is_organic"
                java.lang.String r1 = X.Pxi.A0d(r4, r1)     // Catch:{ JSONException -> 0x00b9 }
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ JSONException -> 0x00b9 }
                if (r1 != 0) goto L_0x00a3
                java.lang.String r1 = X.Pxi.A0d(r4, r10)     // Catch:{ JSONException -> 0x00b9 }
                X.Pxh.A1N(r1, r10, r6)     // Catch:{ JSONException -> 0x00b9 }
            L_0x00a3:
                java.lang.String r1 = X.Pxi.A0d(r4, r5)     // Catch:{ JSONException -> 0x00b9 }
                r6.put(r5, r1)     // Catch:{ JSONException -> 0x00b9 }
                java.lang.String r1 = X.Pxi.A0d(r4, r9)     // Catch:{ JSONException -> 0x00b9 }
                r6.put(r9, r1)     // Catch:{ JSONException -> 0x00b9 }
                java.lang.String r1 = X.Pxi.A0d(r4, r8)     // Catch:{ JSONException -> 0x00b9 }
                r6.put(r8, r1)     // Catch:{ JSONException -> 0x00b9 }
                goto L_0x00c1
            L_0x00b9:
                r5 = move-exception
                java.lang.String r4 = "IGBwPUserEventHandler"
                java.lang.String r1 = "Parsing iabSessionId or adId into JSON object threw exception: "
                X.0KC.A0J(r4, r1, r5)
            L_0x00c1:
                X.OJO r10 = X.C69714Nqa.A00(r7)
                r15 = 0
                java.lang.String r17 = r6.toString()
                X.QYL r12 = new X.QYL
                r12.<init>(r2, r3)
                java.lang.String r13 = "buy_with_prime"
                java.lang.String r14 = "ig4a"
                r16 = r15
                r10.A00(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x002c
            L_0x00da:
                java.lang.String r1 = "BWP_REFRESH_TOKEN"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x002c
                boolean r1 = r2.A09
                if (r1 != 0) goto L_0x00ef
                X.S34 r3 = r2.A07
                android.os.Bundle r1 = r2.A02
                r3.A00(r1)
                goto L_0x002c
            L_0x00ef:
                X.S3I r1 = r2.A08
                r1.A00()
                goto L_0x002c
            L_0x00f6:
                java.lang.String r1 = "BWP_OPEN_EXTERNAL_LINK"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x002c
                r4 = r20
                if (r20 == 0) goto L_0x01bc
                X.0bY r1 = r2.A06
                android.net.Uri r9 = X.0cp.A00(r1, r4)
                if (r9 == 0) goto L_0x01bc
                X.SPF r8 = X.SPF.A06
                if (r8 == 0) goto L_0x0141
                java.lang.String r7 = X.SPF.A00(r4)
                if (r7 == 0) goto L_0x016f
                java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
                X.QP8 r4 = r8.A01
                java.lang.Object r4 = r4.A00
                int r6 = X.AnonymousClass7TE.A0M(r4)
                if (r6 == r3) goto L_0x016a
                r4 = 2
                if (r6 != r4) goto L_0x012d
                X.S3V r1 = r8.A04
                java.util.HashSet r1 = r1.A0A
            L_0x0129:
                java.util.HashSet r1 = X.C66580MXl.A12(r1)
            L_0x012d:
                java.util.Iterator r4 = r1.iterator()
            L_0x0131:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x016f
                java.lang.String r1 = X.AnonymousClass7TE.A18(r4)
                boolean r1 = X.00l.A0d(r7, r1, r5)
                if (r1 == 0) goto L_0x0131
            L_0x0141:
                android.os.Bundle r10 = r2.A02
                X.7kb r12 = r2.A05
                X.7ka r2 = r2.A04
                X.DbZ.A0t(r3, r10, r12, r2)
                android.content.Intent r3 = X.Pxe.A0F(r9)
                java.lang.String r1 = "com.amazon.mShop.android.shopping"
                r3.setPackage(r1)
                androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
                if (r2 == 0) goto L_0x01c1
                android.content.pm.PackageManager r1 = r2.getPackageManager()
                if (r1 == 0) goto L_0x01c1
                android.content.ComponentName r1 = r3.resolveActivity(r1)
                if (r1 == 0) goto L_0x01c1
                r2.startActivity(r3)
                goto L_0x002c
            L_0x016a:
                X.S3V r1 = r8.A04
                java.util.HashSet r1 = r1.A09
                goto L_0x0129
            L_0x016f:
                X.SPF r1 = X.SPF.A06
                if (r1 == 0) goto L_0x002c
                boolean r1 = r1.A02()
                if (r1 != r3) goto L_0x002c
                X.7ka r1 = r2.A04
                androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
                if (r6 == 0) goto L_0x002c
                android.content.Intent r1 = r2.A01
                X.0qQ.A0B(r1, r3)
                java.lang.String r5 = "EXTRA_ADS_CONTEXT"
                android.os.Parcelable r3 = r1.getParcelableExtra(r5)
                com.facebook.iabadscontext.IABAdsContext r3 = (com.facebook.iabadscontext.IABAdsContext) r3
                if (r3 != 0) goto L_0x019d
                android.content.Intent r4 = X.DbS.A09()
            L_0x0194:
                android.content.Context r1 = r6.getApplicationContext()
                X.0kR.A0B(r1, r4)
                goto L_0x002c
            L_0x019d:
                android.content.Intent r4 = new android.content.Intent
                r4.<init>(r1)
                android.content.Intent r2 = r4.setData(r9)
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r2 = r2.setFlags(r1)
                com.facebook.iabadscontext.IABAdsContext r1 = r3.A00()
                android.content.Intent r3 = r2.putExtra(r5, r1)
                java.lang.String r2 = "BrowserLiteIntent.EXTRA_UA"
                java.lang.String r1 = ""
                r3.putExtra(r2, r1)
                goto L_0x0194
            L_0x01bc:
                java.lang.String r2 = "IGBwPUserEventHandler"
                java.lang.String r1 = "Parsed uri is null"
                goto L_0x01c9
            L_0x01c1:
                X.SPF r11 = X.SPF.A06
                java.lang.String r2 = "BwPExtUtil"
                if (r11 != 0) goto L_0x01ce
                java.lang.String r1 = "BwPContext is null!"
            L_0x01c9:
                X.0KC.A0E(r2, r1)
                goto L_0x002c
            L_0x01ce:
                X.QLA r13 = r12.C8U()
                if (r13 == 0) goto L_0x01de
                X.TK5 r8 = new X.TK5
                r8.<init>(r9, r10, r11, r12, r13)
                X.SB5.A00(r8)
                goto L_0x002c
            L_0x01de:
                java.lang.String r1 = "Empty web-view stack, this should never happen"
                goto L_0x01c9
            L_0x01e1:
                java.lang.String r1 = "BWP_RETURN_TO_FEED"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x002c
                android.os.Bundle r4 = r2.A02
                X.7ka r2 = r2.A04
                X.0qQ.A0B(r4, r5)
                X.0qQ.A0B(r2, r3)
                r1 = 3
                r5 = 0
                r2.AI4(r1, r5)
                java.lang.String r1 = "ad_id"
                java.lang.Object r1 = r4.get(r1)
                if (r1 == 0) goto L_0x0252
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L_0x0252
                long r6 = java.lang.Long.parseLong(r1)
            L_0x020a:
                java.lang.String r1 = "iab_session_id"
                java.lang.Object r1 = r4.get(r1)
                java.lang.String r3 = ""
                if (r1 == 0) goto L_0x021a
                java.lang.String r9 = r1.toString()
                if (r9 != 0) goto L_0x021b
            L_0x021a:
                r9 = r3
            L_0x021b:
                java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
                java.lang.String r2 = "pageCloseReason"
                java.lang.String r1 = "IAB_CLOSE_CHECKOUT_SUCCESS"
                r10.put(r2, r1)
                X.SPF r1 = X.SPF.A06
                if (r1 == 0) goto L_0x0231
                boolean r1 = r1.A02
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            L_0x0231:
                java.lang.String r2 = java.lang.String.valueOf(r5)
                java.lang.String r1 = "is_organic"
                r10.put(r1, r2)
                java.lang.String r2 = "media_id"
                java.lang.String r1 = X.Pxi.A0d(r4, r2)
                if (r1 == 0) goto L_0x0244
                r3 = r1
            L_0x0244:
                r10.put(r2, r3)
                X.SRY r5 = X.SRY.A00()
                java.lang.String r8 = "PAGE_CLOSED"
                r5.A04(r6, r8, r9, r10)
                goto L_0x002c
            L_0x0252:
                r6 = 0
                goto L_0x020a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.CIP(java.lang.String, java.lang.String):void");
        }

        public final int CIl(String str) {
            int i;
            int A032 = AnonymousClass0fD.A03(-1751463733);
            if (str == null) {
                i = -699488041;
            } else {
                try {
                    Uri A012 = 0cp.A01(BrowserLiteCallbackService.A06, str);
                    if (A012 == null) {
                        i = -1003852109;
                    } else {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (A012.getHost() == null || parseUri.getScheme() == null || parseUri.getPackage() == null || !A012.getHost().equalsIgnoreCase("instagram.com") || !parseUri.getScheme().equalsIgnoreCase("https") || !parseUri.getPackage().equalsIgnoreCase("com.instagram.android")) {
                            i = -1151432773;
                        } else {
                            parseUri.addFlags(268435456);
                            parseUri.addCategory("android.intent.category.BROWSABLE");
                            parseUri.setComponent((ComponentName) null);
                            parseUri.setSelector((Intent) null);
                            0kR.A09(BrowserLiteCallbackService.this, parseUri);
                            AnonymousClass0fD.A0A(1341469555, A032);
                            return 1;
                        }
                    }
                } catch (URISyntaxException e) {
                    0KC.A0F("IgBrowserLiteCallbackService", "URISyntaxException on handleInvalidProtocol", e);
                    AnonymousClass0fD.A0A(-796324464, A032);
                    return 0;
                }
            }
            AnonymousClass0fD.A0A(i, A032);
            return 0;
        }

        public final boolean CIr(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int A032 = AnonymousClass0fD.A03(1636917829);
            Intent A0E = Pxe.A0E();
            A0E.setData(0cp.A03(str));
            A0E.setFlags(268435456);
            0kR.A00(BrowserLiteCallbackService.this.getApplicationContext(), A0E);
            AnonymousClass0fD.A0A(-566368639, A032);
            return true;
        }

        public final boolean CJ3(String str) {
            AnonymousClass0fD.A0A(891571372, AnonymousClass0fD.A03(-1208131281));
            return false;
        }

        public final boolean CJC(String str, String str2) {
            AnonymousClass0fD.A0A(-801746046, AnonymousClass0fD.A03(-1686733816));
            return false;
        }

        public final void CJD(Bundle bundle) {
            int i;
            int A032 = AnonymousClass0fD.A03(-51633031);
            OnShopsLiteCallback onShopsLiteCallback = this.A01;
            if (onShopsLiteCallback == null) {
                i = 1506189201;
            } else {
                onShopsLiteCallback.DS1(bundle);
                i = 381783705;
            }
            AnonymousClass0fD.A0A(i, A032);
        }

        public final void Cff(String str) {
            AnonymousClass0fD.A0A(1108537867, AnonymousClass0fD.A03(-897528866));
        }

        public final void ChE(String str) {
            AnonymousClass0fD.A0A(-1636469484, AnonymousClass0fD.A03(2118996129));
        }

        public final void ChJ(long j, String str, String str2, Map map) {
            int A032 = AnonymousClass0fD.A03(2006692305);
            RU7.A00(AnonymousClass0kN.A02(this.A02), str, str2, map, j);
            AnonymousClass0fD.A0A(-1394515182, A032);
        }

        public final void ChK(long j, String str, String str2, Map map) {
            int A032 = AnonymousClass0fD.A03(24928694);
            S8F.A01(AnonymousClass0kN.A02(this.A02), str, str2, map, j);
            AnonymousClass0fD.A0A(-1517752784, A032);
        }

        public final void CiT(Bundle bundle, String str, String str2, boolean z) {
            String str3;
            int A032 = AnonymousClass0fD.A03(-1490249977);
            boolean z2 = bundle.getBoolean("Tracking.ENABLED", true);
            String A033 = A03(new C7572QKn(bundle));
            UserSession userSession = this.A02;
            DbZ.A0t(0, str, str2, userSession);
            if (z2) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "iab_open_app_store_surface");
                if (z) {
                    str3 = "sheet";
                } else {
                    str3 = "app";
                }
                if (A0e.isSampled()) {
                    A0e.AAJ("iab_session_id", str2);
                    A0e.A8D("event_ts", Double.valueOf((double) System.currentTimeMillis()));
                    C51965G9l.A1L(A0e, A033);
                    A0e.AAJ("surface", str3);
                    A0e.AAJ("target_url", str);
                    A0e.AAJ("click_id", (String) null);
                    A0e.Cgf();
                }
            }
            AnonymousClass0fD.A0A(1390335288, A032);
        }

        public final void Cj2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
            long currentTimeMillis;
            TimeUnit timeUnit;
            TimeUnit timeUnit2;
            int A032 = AnonymousClass0fD.A03(106605151);
            Map map3 = map;
            if (map != null) {
                map3.put("navigation_chain", AnonymousClass1QI.A00.A02.A00);
            }
            if (C66581MXm.A1a(A07(bundle))) {
                boolean z5 = false;
                if (map2 != null) {
                    02m r3 = 02m.A0p;
                    if (str2 == null || str2.length() == 0) {
                        z5 = true;
                    }
                    r3.markerAnnotate(19791876, "has_deep_link", !z5);
                    z5 = map2.keySet().contains("is_nano_secs_mode");
                    A06("navigation_chain", map3);
                    A06("init_launch_view_mode_config", map3);
                    A06("iab_context", map3);
                    Iterator A0u = AnonymousClass7TF.A0u(map2);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        String str3 = (String) A1J.getKey();
                        long A0R = AnonymousClass7TE.A0R(A1J.getValue());
                        if (!0qQ.A0K(str3, "is_nano_secs_mode")) {
                            02m r5 = 02m.A0p;
                            if (z5) {
                                timeUnit2 = TimeUnit.NANOSECONDS;
                            } else {
                                timeUnit2 = TimeUnit.MILLISECONDS;
                            }
                            r5.markerPoint(19791876, 0, str3, (String) null, A0R, timeUnit2);
                        }
                    }
                }
                02m r1 = 02m.A0p;
                if (z5) {
                    currentTimeMillis = System.nanoTime();
                    timeUnit = TimeUnit.NANOSECONDS;
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                    timeUnit = TimeUnit.MILLISECONDS;
                }
                r1.markerEnd(19791876, 2, currentTimeMillis, timeUnit);
            }
            AnonymousClass0fD.A0A(1112252519, A032);
        }

        public final void CjG(Bundle bundle, String str, String str2, long j, boolean z) {
            String str3;
            int A032 = AnonymousClass0fD.A03(-2009044372);
            boolean z2 = bundle.getBoolean("Tracking.ENABLED", true);
            String A033 = A03(new C7572QKn(bundle));
            UserSession userSession = this.A02;
            AnonymousClass7TF.A1D(str, 0, userSession);
            if (z2) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "mai_play_store_events");
                if (z) {
                    str3 = "sheet";
                } else {
                    str3 = "app";
                }
                if (A0e.isSampled()) {
                    A0e.AAJ("mai_event_name", str);
                    A0e.A7p("is_preloading_enabled", (Boolean) null);
                    A0e.A9F("itunes_id", (Long) null);
                    C51965G9l.A1L(A0e, A033);
                    A0e.A8D("load_duration", (Double) null);
                    A0e.A7p("did_load_successfully", (Boolean) null);
                    A0e.A8D("time_spent", Double.valueOf((double) j));
                    A0e.A8D("tti", (Double) null);
                    A0e.A8D("background_time", (Double) null);
                    A0e.AAJ("error", (String) null);
                    A0e.AAJ(TraceFieldType.ErrorDomain, (String) null);
                    A0e.A9F(TraceFieldType.ErrorCode, (Long) null);
                    A0e.A9F("load_attempt_count", (Long) null);
                    A0e.A9H("load_params", (Map) null);
                    A0e.AAJ("mai_session_id", (String) null);
                    A0e.AAJ("presenting_surface", AnonymousClass000.A00(4872));
                    A0e.AAJ("store_type", str3);
                    A0e.Cgf();
                }
            }
            AnonymousClass0fD.A0A(1052987946, A032);
        }

        public final void Ckd(Bundle bundle, Map map) {
            C7572QKn qKn;
            C10804RyQ A002;
            Long l;
            int A032 = AnonymousClass0fD.A03(-1882277489);
            if (bundle != null) {
                qKn = new C7572QKn(bundle);
            }
            C12800T7n t7n = new C12800T7n(qKn.A00(), (String) null);
            boolean z = true;
            if (bundle != null && !bundle.getBoolean("Tracking.ENABLED", true)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            UserSession userSession = this.A02;
            boolean booleanValue = valueOf.booleanValue();
            Map map2 = map;
            AnonymousClass7TF.A1C(userSession, 1, map2);
            if (!(!booleanValue || bundle == null || map2.get("action") == null || !"BrowserLiteIntent.IAB_AUTOFILL_CROWDSOURCING_PREDICTIONS".equals(map2.get("action")) || (A002 = RUX.A00(bundle)) == null)) {
                0wc A003 = AnonymousClass0kN.A00(t7n, 0kJ.A05, userSession);
                String str = A002.A04;
                String str2 = A002.A00;
                String str3 = A002.A02;
                String str4 = A002.A06;
                String str5 = A002.A03;
                String str6 = A002.A05;
                String str7 = A002.A01;
                C249803kO A0J = C66580MXl.A0J(DbU.A0K(A002.A07));
                while (A0J.hasNext()) {
                    C10847Rz7 rz7 = (C10847Rz7) A0J.next();
                    0Aj A0e = AnonymousClass7TE.A0e(A003, "iab_autofill_crowdsourcing_predictions");
                    if (A0e.isSampled()) {
                        A0e.AAJ("autofill_iab_session_id", str);
                        A0e.AAJ("current_url", str3);
                        A0e.AAJ("origin_host", str4);
                        A0e.AAJ("autofill_form_id", str5);
                        A0e.AAJ("autofill_mobile_app_id", str6);
                        A0e.AAJ("detection_result", rz7.A02);
                        A0e.AAJ("autofill_type", str7);
                        A0e.AAJ("input_name", rz7.A06);
                        A0e.AAJ("input_id", rz7.A05);
                        A0e.AAJ("input_type", rz7.A07);
                        A0e.AAJ("input_autocomplete", rz7.A04);
                        A0e.AAJ("placeholder", rz7.A0A);
                        A0e.AAJ("label", rz7.A08);
                        A0e.A9F("text_length", DbS.A0j(rz7.A00));
                        A0e.A7p("is_digit", Boolean.valueOf(rz7.A0B));
                        A0e.A7p("is_valid_credit_card", Boolean.valueOf(rz7.A0D));
                        A0e.A7p("is_luhn_compliant", Boolean.valueOf(rz7.A0C));
                        if (str2 != null) {
                            l = C9744Rg2.A00(str2);
                        } else {
                            l = null;
                        }
                        A0e.A9F("ad_id", l);
                        A0e.Cgf();
                    }
                }
            }
            AnonymousClass0fD.A0A(-106716798, A032);
        }

        public final String Cn4(String str) {
            String str2;
            int A032 = AnonymousClass0fD.A03(-1873604304);
            if (str != null) {
                try {
                    Uri A033 = 0cp.A03(str);
                    if (A033 != null) {
                        String host = A033.getHost();
                        String path = A033.getPath();
                        if (host != null && path != null && host.endsWith(".instagram.com") && path.startsWith("/browser/closeWindow")) {
                            S8C.A00(BrowserLiteCallbackService.this.getApplicationContext(), "ACTION_CLOSE_BROWSER");
                        }
                    }
                } catch (SecurityException e) {
                    if (e.getMessage() != null) {
                        str2 = e.getMessage();
                    } else {
                        str2 = "SecurityException–the message is null";
                    }
                    0wb.A03("IAB Logging", str2);
                } catch (IllegalArgumentException unused) {
                }
            }
            AnonymousClass0fD.A0A(-553905829, A032);
            return null;
        }

        public final void Cx9(AutofillOptOutCallback autofillOptOutCallback, String str) {
            int i;
            int A032 = AnonymousClass0fD.A03(600523107);
            UserSession userSession = this.A02;
            if (182.A06(0Tu.A06, userSession, 36310430911103050L)) {
                autofillOptOutCallback.Czt(str, false);
                i = 851638773;
            } else {
                if (userSession != null && !this.A00) {
                    this.A00 = true;
                    2IS A042 = C41845B3m.A04();
                    17k.A0E(C41848B3p.A1Z(A042, "key", str));
                    C239113Fa r0 = new C239113Fa(A042, C7595QNl.class, "IabAutofillOptOutQuery", false);
                    C239123Fb r1 = new C239123Fb(userSession);
                    r1.A08(r0);
                    r1.A08 = AnonymousClass000.A00(65);
                    1OC A05 = r1.A05();
                    A05.A00 = new EDL(this, autofillOptOutCallback, str, 7);
                    0nY.A00().ATE(new RAC(A05, this));
                }
                i = -1970832312;
            }
            AnonymousClass0fD.A0A(i, A032);
        }

        public final void D6X(String str, Bundle bundle) {
            AnonymousClass0fD.A0A(1943583170, AnonymousClass0fD.A03(298492839));
        }

        public final void DDK(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
            AnonymousClass0fD.A0A(-1393129909, AnonymousClass0fD.A03(-1120837566));
        }

        public final void DFy() {
            AnonymousClass0fD.A0A(-983310826, AnonymousClass0fD.A03(1063276521));
        }

        public final void DJY(String str, List list) {
            AnonymousClass0fD.A0A(1147059999, AnonymousClass0fD.A03(824087382));
        }

        public final void DJb(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
            int A032 = AnonymousClass0fD.A03(1809167423);
            UserSession userSession = this.A02;
            boolean A06 = 182.A06(0Tu.A05, userSession, 36313579121150059L);
            if (zonePolicy != null) {
                zonePolicy.A00();
            }
            if (bundle != null) {
                bundle.getBoolean("Tracking.ENABLED", true);
            }
            if (zonePolicy == null || !A06) {
                A04(bundle, iABEvent, this);
            } else {
                C9011RLf EJX = Pxg.A0R().EJX(new C12192Soh(bundle, iABEvent, this), zonePolicy, "UNKNOWN");
                0qQ.A07(EJX);
                0qQ.A07(RWG.A00(EJX));
            }
            AnonymousClass0kN.A02(userSession);
            AnonymousClass0fD.A0A(944079702, A032);
        }

        public final void DJe(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list) {
            int A032 = AnonymousClass0fD.A03(169625898);
            UserSession userSession = this.A02;
            AnonymousClass0K0 r11 = null;
            0Df r8 = null;
            String str5 = str;
            String str6 = str2;
            AnonymousClass7TF.A1H(str5, str6);
            IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback2 = iABExtensionPreExitHandlerBloksCallback;
            AnonymousClass7TG.A1S(iABExtensionPreExitHandlerBloksCallback2, userSession);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            AnonymousClass0K0 r9 = GraphQlCallInput.A02;
            0Df A033 = C41845B3m.A03(r9, str3, "ad_id");
            0Df.A00(A033, str6, "iab_extension_type");
            0Df.A00(A033, str4, "tracking_token");
            0Df.A00(A033, str5, "iab_session_id");
            2IV r6 = A042.A00;
            Pxf.A1E(A033, r6, "params");
            Pxf.A1E(C41845B3m.A03(r9, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id"), r6, "bloks_params");
            boolean z = false;
            Bundle bundle2 = bundle;
            if (bundle != null) {
                r11 = r9;
                r8 = A01(bundle2, r9);
                z = true;
            }
            if (z) {
                0Df A022 = r6.A02();
                if (r8 == null) {
                    r8 = r11.A02();
                }
                A022.A0E(r8, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGIABExtensionPreExitBloksHandlerTemplateQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42999Bpp.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "iab_extension_pre_exit_bloks_handler_template", AnonymousClass7TE.A1C());
            1vm.A01(userSession).ATL(new ASg(str5, 0), new C45927DFh(str5, (Object) iABExtensionPreExitHandlerBloksCallback2, 0), pandoGraphQLRequest);
            AnonymousClass0fD.A0A(-116457528, A032);
        }

        public final void DJf(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
            int A032 = AnonymousClass0fD.A03(1493213961);
            UserSession userSession = this.A02;
            AnonymousClass0K0 r11 = null;
            0Df r8 = null;
            IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback2 = iABExtensionEventHandlerCallback;
            String str4 = str;
            C51973G9u.A0r(0, str4, iABExtensionEventHandlerCallback2, userSession);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            AnonymousClass0K0 r9 = GraphQlCallInput.A02;
            0Df A033 = C41845B3m.A03(r9, str2, "ad_id");
            0Df.A00(A033, str3, "tracking_token");
            0Df.A00(A033, str4, "iab_session_id");
            2IV r6 = A042.A00;
            Pxf.A1E(A033, r6, "params");
            boolean z = false;
            Bundle bundle2 = bundle;
            if (bundle != null) {
                r11 = r9;
                r8 = A01(bundle2, r9);
                z = true;
            }
            if (z) {
                0Df A022 = r6.A02();
                if (r8 == null) {
                    r8 = r11.A02();
                }
                A022.A0E(r8, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGIABExtensionPreExitHandlerQuery", A042.getParamsCopy(), A043.getParamsCopy(), C43002Bps.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "iab_extension_pre_exit_handler", AnonymousClass7TE.A1C());
            1vm.A01(userSession).ATL(new ASg(str4, 1), new C45927DFh(iABExtensionEventHandlerCallback2, str4, 1), pandoGraphQLRequest);
            AnonymousClass0fD.A0A(-1166143130, A032);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
            if ("hideAutoFillBar".equals(r1) != false) goto L_0x00e6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void DMa(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r9, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback r10) {
            /*
                r8 = this;
                r0 = 1682378903(0x64471097, float:1.468839E22)
                int r3 = X.AnonymousClass0fD.A03(r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r6 = r0.getApplicationContext()
                java.lang.String r1 = r9.A04
                java.lang.String r0 = "saveAutofillData"
                boolean r0 = r0.equals(r1)
                r4 = 0
                if (r0 == 0) goto L_0x0096
                android.os.Bundle r1 = r9.A02
                java.lang.String r0 = "saveAutofillDataData"
                android.os.Parcelable r0 = r1.getParcelable(r0)
                r0.getClass()
                com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData) r0
                com.google.common.collect.ImmutableMap r0 = r0.A00
                if (r0 == 0) goto L_0x00d3
                java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r5 = r0.iterator()
            L_0x0037:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x005f
                java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r5)
                java.lang.Object r0 = r2.getValue()
                java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0037
                java.lang.Object r1 = r2.getKey()
                java.lang.Object r0 = r2.getValue()
                java.util.AbstractList r0 = (java.util.AbstractList) r0
                java.lang.Object r0 = r0.get(r4)
                r7.put(r1, r0)
                goto L_0x0037
            L_0x005f:
                com.instagram.common.session.UserSession r5 = r8.A02
                X.0Tu r2 = X.0Tu.A06
                r0 = 36322860549941859(0x810b73004e2a63, double:3.0340614999784327E-306)
                boolean r0 = X.182.A06(r2, r5, r0)
                if (r0 == 0) goto L_0x008b
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
                r2.<init>((java.util.Map) r7)
                r1 = 0
                r0 = 2
                X.0qQ.A0B(r6, r0)
                com.instagram.common.session.UserSession r0 = X.23d.A03
                if (r0 == 0) goto L_0x0080
                X.SQF.A01(r6, r2, r1, r0, r4)
                goto L_0x00e6
            L_0x0080:
                java.lang.String r0 = "userSession"
                X.0qQ.A0F(r0)
                X.00P r0 = X.AnonymousClass00P.createAndThrow()
                throw r0
            L_0x008b:
                X.23d r1 = X.23d.A04
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
                r0.<init>((java.util.Map) r7)
                r1.A04(r0)
                goto L_0x00e6
            L_0x0096:
                java.lang.String r0 = "requestAutoFill"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00de
                android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
                com.instagram.common.session.UserSession r7 = r8.A02
                java.util.ArrayList r0 = X.23d.A02()
                java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r0)
                X.0Tu r2 = X.0Tu.A06
                r0 = 36310430911299660(0x810025001c004c, double:3.0262009464509685E-306)
                boolean r0 = X.182.A06(r2, r7, r0)
                java.lang.String r2 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
                if (r0 == 0) goto L_0x00da
                java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00cd
                java.lang.Object r0 = r5.get(r4)
                r1.add(r0)
            L_0x00cd:
                r6.putStringArrayList(r2, r1)
            L_0x00d0:
                r10.Czv(r6, r9, r4)
            L_0x00d3:
                r0 = -452306381(0xffffffffe50a5a33, float:-4.0834404E22)
                X.AnonymousClass0fD.A0A(r0, r3)
                return
            L_0x00da:
                r6.putStringArrayList(r2, r5)
                goto L_0x00d0
            L_0x00de:
                java.lang.String r0 = "hideAutoFillBar"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00d3
            L_0x00e6:
                android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
                goto L_0x00d0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.DMa(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback):void");
        }

        public final void DW2(int i, String str, Bundle bundle) {
            AnonymousClass0fD.A0A(-1088773530, AnonymousClass0fD.A03(-478963845));
        }

        public final void DW5(Bundle bundle, String str, int i, long j) {
            AnonymousClass0fD.A0A(2094223085, AnonymousClass0fD.A03(-544469479));
        }

        public final void DWC(Bundle bundle, String str, String str2) {
            AnonymousClass0fD.A0A(1651273422, AnonymousClass0fD.A03(696749261));
        }

        public final void DWP(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
            Handler handler;
            int A032 = AnonymousClass0fD.A03(-381825327);
            if (C9837Rhz.A00(this.A02) && (handler = BrowserLiteCallbackService.this.A00) != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            Pxe.A1N(BrowserLiteCallbackService.this.A04, Boolean.valueOf(z), 3);
            AnonymousClass0fD.A0A(-1392271649, A032);
        }

        public final void DbR(Map map) {
            int A032 = AnonymousClass0fD.A03(1745688191);
            Uri uri = (Uri) map.get("screenshot_uri");
            Map map2 = (Map) map.get("debug_info_map");
            if (uri == null || map2 == null) {
                11Z.A02(new C12927TDq(this));
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null) {
                    C255463uA[] r0 = BugReportAttachment.A05;
                    A1C.add(new BugReportAttachment(BugReportAttachmentMediaSource.BUG_REPORTER, BugReportAttachmentMediaType.SCREENSHOT, encodedPath, "IgBrowserLiteCallbackService", true));
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                Iterator A0u = AnonymousClass7TF.A0u(map2);
                while (A0u.hasNext()) {
                    JTR.A1U(A1E, AnonymousClass7TE.A1J(A0u));
                }
                OWB owb = new OWB();
                BugReportSource bugReportSource = BugReportSource.RAGE_SHAKE;
                0qQ.A0B(bugReportSource, 0);
                owb.A00 = bugReportSource;
                owb.A0K = AnonymousClass7TE.A1D(A1C);
                UserSession userSession = this.A02;
                owb.A0I = userSession.A06;
                owb.A0N = A1E;
                BugReport A012 = owb.A01();
                BrowserLiteCallbackService browserLiteCallbackService = BrowserLiteCallbackService.this;
                OLY oly = new OLY(browserLiteCallbackService.getApplicationContext());
                oly.A02 = "";
                BugReportComposerViewModel A002 = oly.A00();
                Intent A0A = C66580MXl.A0A(browserLiteCallbackService, BugReporterActivity.class);
                A0A.setFlags(268435456);
                A0A.putExtra(C66579MXk.A00(486), A012);
                A0A.putExtra(C66579MXk.A00(206), A002);
                A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                0kR.A0B(browserLiteCallbackService, A0A);
            }
            AnonymousClass0fD.A0A(120088671, A032);
        }

        public final void Dfd(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int A032 = AnonymousClass0fD.A03(884676845);
            new C7572QKn(bundle);
            boolean A07 = A07(bundle);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("moduleName", "in_app_browser_v2");
            A0a.putBoolean("logging_enabled", A07);
            A0a.putString("url", str);
            Message obtainMessage = BrowserLiteCallbackService.this.A04.obtainMessage(2);
            obtainMessage.setData(A0a);
            obtainMessage.sendToTarget();
            AnonymousClass0fD.A0A(1187674253, A032);
        }

        public final void DjK() {
            AnonymousClass0fD.A0A(-1273892345, AnonymousClass0fD.A03(563091827));
        }

        public final void Dvt(String str, Bundle bundle) {
            AnonymousClass0fD.A0A(1780130566, AnonymousClass0fD.A03(-959712689));
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
            if (r11.getBoolean("Tracking.ENABLED", true) != false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x048b, code lost:
            X.AnonymousClass6W8.A06(r1, r2, r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x04a2, code lost:
            r0.sendToTarget();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x04eb, code lost:
            r4.putBundle("tracking", r11);
            X.AnonymousClass6W8.A06(r3.getApplicationContext(), r4, com.instagram.modal.TransparentBackgroundModalActivity.class, "bottom_sheet");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x081d, code lost:
            r13.A0O(r28, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:258:0x082e, code lost:
            r13 = X.0xI.A01(r1, r0.getModuleName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x0859, code lost:
            X.DbU.A1R(r13, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x086c, code lost:
            X.0wb.A03(r1, "Error getting null IAB Session Id");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:273:0x089d, code lost:
            X.Pxf.A1D(r13, (double) java.lang.System.currentTimeMillis());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x08a5, code lost:
            r13.Cgf();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x02e2, code lost:
            if (X.00k.A0u(X.C10064Rm1.A01, r1) == false) goto L_0x02e4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void Dvy(android.os.Bundle r81, java.util.Map r82) {
            /*
                r80 = this;
                r0 = 1090651581(0x410205bd, float:8.126401)
                int r18 = X.AnonymousClass0fD.A03(r0)
                java.lang.String r0 = "action"
                r10 = r82
                java.lang.String r9 = X.DbT.A11(r0, r10)
                if (r9 != 0) goto L_0x0025
                java.lang.Class<com.instagram.inappbrowser.service.BrowserLiteCallbackService$BrowserLiteCallbackImpl> r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.class
                java.lang.String r1 = r0.getSimpleName()
                java.lang.String r0 = "#onUserAction() null action"
                X.0wb.A03(r1, r0)
                r1 = -1569880722(0xffffffffa26d856e, float:-3.2190126E-18)
            L_0x001f:
                r0 = r18
                X.AnonymousClass0fD.A0A(r1, r0)
                return
            L_0x0025:
                r11 = r81
                X.QKn r2 = new X.QKn
                if (r81 != 0) goto L_0x08c0
                r2.<init>()
            L_0x002e:
                java.lang.String r3 = r2.A00()
                r8 = 1
                r19 = 0
                X.T7n r22 = new X.T7n
                r1 = r19
                r0 = r22
                r0.<init>(r3, r1)
                if (r81 == 0) goto L_0x004a
                java.lang.String r0 = "Tracking.ENABLED"
                boolean r0 = r11.getBoolean(r0, r8)
                r20 = 0
                if (r0 == 0) goto L_0x004c
            L_0x004a:
                r20 = 1
            L_0x004c:
                java.lang.String r21 = ""
                if (r81 == 0) goto L_0x08b8
                java.lang.String r1 = "Tracking.ARG_SESSION_ID"
                r0 = r21
                java.lang.String r7 = r11.getString(r1, r0)
            L_0x0058:
                if (r81 == 0) goto L_0x08b4
                java.lang.String r1 = "TrackingInfo.ARG_AD_ID"
                r0 = r21
                java.lang.String r79 = r11.getString(r1, r0)
            L_0x0062:
                java.lang.String r6 = "url"
                java.lang.String r5 = X.DbT.A11(r6, r10)
                java.lang.String r78 = "click_id"
                r0 = r78
                java.lang.String r3 = X.DbU.A0r(r0, r10)
                java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_PAGE_TYPE"
                java.lang.Object r1 = r10.get(r0)
                java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_FOLLOWING_PAGE"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0095
                if (r3 == 0) goto L_0x0095
                if (r5 == 0) goto L_0x0095
                android.net.Uri r0 = X.0cp.A03(r5)
                android.net.Uri$Builder r1 = r0.buildUpon()
                java.lang.String r0 = "fbclid"
                android.net.Uri r0 = X.DbV.A08(r1, r0, r3)
                java.lang.String r5 = r0.toString()
            L_0x0095:
                r12 = r80
                com.instagram.common.session.UserSession r4 = r12.A02
                java.lang.String r77 = "destination"
                r0 = r77
                java.lang.String r76 = X.DbU.A0r(r0, r10)
                r0 = r78
                java.lang.String r75 = X.DbU.A0r(r0, r10)
                boolean r74 = X.C9837Rhz.A00(r4)
                java.lang.String r73 = r12.A03(r2)
                if (r81 == 0) goto L_0x08b0
                java.lang.String r1 = "Tracking.ARG_CLICK_SOURCE"
                r0 = r21
                java.lang.String r72 = r11.getString(r1, r0)
            L_0x00b9:
                java.lang.String r15 = X.DbU.A0r(r6, r10)
                java.lang.String r23 = "user_action"
                r0 = r23
                java.lang.String r71 = X.DbU.A0r(r0, r10)
                java.lang.String r70 = "origin_host"
                r0 = r70
                java.lang.String r69 = X.DbU.A0r(r0, r10)
                java.lang.String r24 = "current_url"
                r0 = r24
                java.lang.String r68 = X.DbT.A11(r0, r10)
                java.lang.String r3 = "iab_session_id"
                java.lang.String r67 = X.DbT.A11(r3, r10)
                java.lang.String r66 = "form_session_id"
                r0 = r66
                java.lang.String r65 = X.DbT.A11(r0, r10)
                java.lang.String r25 = "type"
                r0 = r25
                java.lang.String r64 = X.DbU.A0r(r0, r10)
                java.lang.String r63 = "all_fields"
                r0 = r63
                java.lang.String r62 = X.DbU.A0r(r0, r10)
                java.lang.String r61 = "new_fields"
                r0 = r61
                java.lang.String r60 = X.DbU.A0r(r0, r10)
                java.lang.String r59 = "edited_fields"
                r0 = r59
                java.lang.String r58 = X.DbU.A0r(r0, r10)
                java.lang.String r57 = "previous_fields"
                r0 = r57
                java.lang.String r56 = X.DbU.A0r(r0, r10)
                java.lang.String r55 = "requested_fields"
                r0 = r55
                java.lang.String r54 = X.DbU.A0r(r0, r10)
                java.lang.String r53 = "available_fields"
                r0 = r53
                java.lang.String r52 = X.DbU.A0r(r0, r10)
                java.lang.String r51 = "selected_field_tag"
                r0 = r51
                java.lang.String r50 = X.DbU.A0r(r0, r10)
                java.lang.String r49 = "payment_credential_ids"
                r0 = r49
                java.lang.String r48 = X.DbU.A0r(r0, r10)
                java.lang.String r47 = "index"
                r0 = r47
                java.lang.String r46 = X.DbU.A0r(r0, r10)
                java.lang.String r45 = "event_times"
                r0 = r45
                java.lang.String r44 = X.DbU.A0r(r0, r10)
                java.lang.String r43 = "time_spend"
                r0 = r43
                java.lang.String r42 = X.DbU.A0r(r0, r10)
                java.lang.String r41 = "form_completion_duration"
                r0 = r41
                java.lang.String r40 = X.DbU.A0r(r0, r10)
                java.lang.String r26 = "with_ads_disclosure"
                r0 = r26
                java.lang.String r39 = X.DbU.A0r(r0, r10)
                java.lang.String r38 = "enhanced_regex_new_fields_metadata"
                r0 = r38
                java.lang.Object r0 = r10.get(r0)
                if (r0 == 0) goto L_0x08ad
                com.google.gson.Gson r14 = new com.google.gson.Gson
                r14.<init>()
                r0 = r38
                java.lang.String r13 = X.DbT.A11(r0, r10)
                X.R1l r0 = new X.R1l
                r0.<init>(r12)
                java.lang.reflect.Type r1 = r0.A00
                java.lang.Object r14 = r14.A09(r13, r1)
                java.util.Map r14 = (java.util.Map) r14
            L_0x017f:
                java.lang.String r37 = "user_credentials_status"
                r0 = r37
                java.lang.String r36 = X.DbU.A0r(r0, r10)
                java.lang.String r35 = "is_payment_opt_in"
                r0 = r35
                java.lang.String r34 = X.DbU.A0r(r0, r10)
                java.lang.String r33 = "is_contact_opt_in"
                r0 = r33
                java.lang.String r32 = X.DbU.A0r(r0, r10)
                java.lang.String r31 = "IS_BLOKS_ACTION"
                r0 = r31
                java.lang.String r30 = X.DbU.A0r(r0, r10)
                java.lang.String r29 = "experiments"
                r0 = r29
                java.lang.Object r0 = r10.get(r0)
                if (r0 == 0) goto L_0x08aa
                com.google.gson.Gson r13 = new com.google.gson.Gson
                r13.<init>()
                r0 = r29
                java.lang.String r1 = X.DbT.A11(r0, r10)
                X.R1m r0 = new X.R1m
                r0.<init>(r12)
                java.lang.reflect.Type r0 = r0.A00
                java.lang.Object r1 = r13.A09(r1, r0)
                java.util.Map r1 = (java.util.Map) r1
            L_0x01c2:
                java.lang.String r28 = "has_helium"
                r0 = r28
                java.lang.String r27 = X.DbU.A0r(r0, r10)
                r0 = 3
                X.0qQ.A0B(r4, r0)
                if (r20 == 0) goto L_0x01e4
                X.0kJ r0 = X.0kJ.A05
                r13 = r0
                r0 = r22
                X.0wc r17 = X.AnonymousClass0kN.A00(r0, r13, r4)
                int r0 = r9.hashCode()
                java.lang.String r13 = "Error getting null IAB Session Id"
                r16 = 0
                switch(r0) {
                    case -1757774683: goto L_0x05e3;
                    case -1526215918: goto L_0x0622;
                    case -1401623561: goto L_0x0674;
                    case -1288637637: goto L_0x0680;
                    case 26614404: goto L_0x06da;
                    case 139450422: goto L_0x06f9;
                    case 355631317: goto L_0x0824;
                    case 1398948562: goto L_0x0837;
                    case 1796890997: goto L_0x085e;
                    default: goto L_0x01e4;
                }
            L_0x01e4:
                r14 = -1
                int r0 = r9.hashCode()
                switch(r0) {
                    case -2099859953: goto L_0x05d8;
                    case -1757774683: goto L_0x05cd;
                    case -1554255665: goto L_0x05c2;
                    case -1526215918: goto L_0x05b7;
                    case -1345844387: goto L_0x05ac;
                    case -1288637637: goto L_0x05a1;
                    case 26614404: goto L_0x0596;
                    case 139450422: goto L_0x058b;
                    case 1796890997: goto L_0x057f;
                    case 1803427515: goto L_0x0573;
                    default: goto L_0x01ec;
                }
            L_0x01ec:
                java.lang.String r13 = "bottom_sheet"
                java.lang.String r9 = "tracking"
                java.lang.String r1 = "initial_url"
                r0 = 4
                java.lang.String r0 = X.C66579MXk.A00(r0)
                switch(r14) {
                    case 0: goto L_0x04a7;
                    case 1: goto L_0x0490;
                    case 2: goto L_0x047b;
                    case 3: goto L_0x046a;
                    case 4: goto L_0x041a;
                    case 5: goto L_0x03e3;
                    case 6: goto L_0x03b1;
                    case 7: goto L_0x020c;
                    case 8: goto L_0x04f9;
                    case 9: goto L_0x0200;
                    default: goto L_0x01fb;
                }
            L_0x01fb:
                r1 = -1380477304(0xffffffffadb79688, float:-2.087154E-11)
                goto L_0x001f
            L_0x0200:
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r1 = r0.getApplicationContext()
                java.lang.String r0 = "ACTION_REFRESH_TOP_WEBVIEW"
                X.S8C.A00(r1, r0)
                goto L_0x01fb
            L_0x020c:
                if (r20 != 0) goto L_0x0213
                r1 = -1844709435(0xffffffff920bf7c5, float:-4.4166066E-28)
                goto L_0x001f
            L_0x0213:
                X.0kJ r1 = X.0kJ.A05
                r0 = r22
                X.0wc r3 = X.AnonymousClass0kN.A00(r0, r1, r4)
                r0 = r23
                java.lang.String r1 = X.DbT.A11(r0, r10)
                if (r1 == 0) goto L_0x01fb
                X.SH7 r0 = r12.A03
                X.2IP r0 = r0.A00
                if (r0 == 0) goto L_0x023a
                boolean r0 = X.2IP.A00
                if (r0 != r8) goto L_0x023a
                java.lang.String r0 = "FORM_COMPLETION"
                boolean r0 = r1.equalsIgnoreCase(r0)
                if (r0 == 0) goto L_0x023a
                r1 = 1038407916(0x3de4d8ec, float:0.11174187)
                goto L_0x001f
            L_0x023a:
                r0 = r31
                java.lang.String r0 = X.DbT.A11(r0, r10)
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                if (r0 == 0) goto L_0x032e
                java.lang.String r0 = "IS_BLOKS_LOG_EVENT"
                java.lang.Object r0 = r10.get(r0)
                java.lang.String r1 = "true"
                if (r0 == r1) goto L_0x01fb
                r0 = r31
                java.lang.Object r0 = r10.get(r0)
                if (r0 != r1) goto L_0x01fb
                r0 = r23
                java.lang.Object r1 = r10.get(r0)
                r0 = r25
                java.lang.Object r0 = r10.get(r0)
                if (r0 == 0) goto L_0x032a
                r0 = r25
                java.lang.Object r2 = r10.get(r0)
                if (r2 == 0) goto L_0x08c5
                java.lang.String r2 = (java.lang.String) r2
            L_0x0271:
                java.lang.String r0 = "NOT_NOW_CLICK"
                boolean r0 = X.0qQ.A0K(r1, r0)
                if (r0 == 0) goto L_0x02c5
                r3 = 0
                X.0qQ.A0B(r2, r3)
                java.lang.String r0 = "CONTACT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x028d
                java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x02a0
            L_0x028d:
                X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
                java.lang.String r0 = "browser_consecutive_decline_autofill"
                int r0 = r1.getInt(r0, r3)
                int r1 = r0 + 1
                X.1Av r0 = X.1Au.A00(r4)
                r0.A0U(r1)
            L_0x02a0:
                java.lang.String r0 = "PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x02b0
                java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x01fb
            L_0x02b0:
                X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
                java.lang.String r0 = "browser_autofill_payment_decline_count"
                int r0 = r1.getInt(r0, r3)
                int r1 = r0 + 1
            L_0x02bc:
                X.1Av r0 = X.1Au.A00(r4)
                r0.A0T(r1)
                goto L_0x01fb
            L_0x02c5:
                java.util.Set r0 = X.C10064Rm1.A00
                boolean r0 = X.00k.A0u(r0, r1)
                if (r0 == 0) goto L_0x01fb
                r0 = r26
                java.lang.String r0 = X.DbT.A11(r0, r10)
                if (r0 == 0) goto L_0x02e4
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                if (r0 != r8) goto L_0x02e4
                java.util.Set r0 = X.C10064Rm1.A01
                boolean r0 = X.00k.A0u(r0, r1)
                r3 = 1
                if (r0 != 0) goto L_0x02e5
            L_0x02e4:
                r3 = 0
            L_0x02e5:
                r1 = 0
                X.0qQ.A0B(r2, r1)
                java.lang.String r0 = "CONTACT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x02f9
                java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0309
            L_0x02f9:
                if (r3 == 0) goto L_0x0302
                X.1Av r0 = X.1Au.A00(r4)
                r0.A1G(r8)
            L_0x0302:
                X.1Av r0 = X.1Au.A00(r4)
                r0.A0U(r1)
            L_0x0309:
                java.lang.String r0 = "PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0319
                java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x01fb
            L_0x0319:
                if (r3 == 0) goto L_0x0322
                X.1Av r0 = X.1Au.A00(r4)
                r0.A1G(r8)
            L_0x0322:
                X.1Av r0 = X.1Au.A00(r4)
                r0.A1H(r8)
                goto L_0x02bc
            L_0x032a:
                java.lang.String r2 = "CONTACT_AUTOFILL"
                goto L_0x0271
            L_0x032e:
                r0 = r23
                java.lang.Object r6 = r10.get(r0)
                r0 = r25
                java.lang.Object r2 = r10.get(r0)
                java.lang.String r5 = "CONTACT_AUTOFILL"
                if (r2 != 0) goto L_0x033f
                r2 = r5
            L_0x033f:
                java.lang.String r0 = "NOT_NOW_CLICK"
                boolean r0 = X.0qQ.A0K(r6, r0)
                java.lang.String r1 = "PAYMENT_AUTOFILL"
                if (r0 == 0) goto L_0x0375
                java.util.Set r0 = X.SDK.A0D
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x035e
                r0 = 0
                X.R8m r7 = new X.R8m
                r7.<init>(r3, r4, r5, r0)
                java.lang.String r6 = "INCREASE"
                r0 = r19
                X.SRr.A01(r7, r4, r0, r5, r6)
            L_0x035e:
                java.util.Set r0 = X.SDK.A0E
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x01fb
                r0 = 0
                X.R8m r5 = new X.R8m
                r5.<init>(r3, r4, r1, r0)
                java.lang.String r2 = "INCREASE"
                r0 = r19
                X.SRr.A01(r5, r4, r0, r1, r2)
                goto L_0x01fb
            L_0x0375:
                java.util.Set r0 = X.C10064Rm1.A00
                boolean r0 = X.00k.A0u(r0, r6)
                if (r0 == 0) goto L_0x01fb
                r0 = r26
                java.lang.String r0 = X.DbT.A11(r0, r10)
                r3 = 0
                if (r0 == 0) goto L_0x0395
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                if (r0 != r8) goto L_0x0395
                java.util.Set r0 = X.C10064Rm1.A01
                boolean r0 = X.00k.A0u(r0, r6)
                if (r0 == 0) goto L_0x0395
                r3 = 1
            L_0x0395:
                java.util.Set r0 = X.SDK.A0D
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x03a2
                r0 = r19
                X.SRr.A04(r4, r0, r5, r3, r8)
            L_0x03a2:
                java.util.Set r0 = X.SDK.A0E
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x01fb
                r0 = r19
                X.SRr.A04(r4, r0, r1, r3, r8)
                goto L_0x01fb
            L_0x03b1:
                java.lang.Object r0 = r10.get(r6)
                if (r0 == 0) goto L_0x01fb
                X.0Tu r2 = X.0Tu.A05
                r0 = 36330342377865799(0x81124100004247, double:3.038793038084435E-306)
                boolean r0 = X.182.A06(r2, r4, r0)
                if (r0 == 0) goto L_0x03d8
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.2IL r1 = r0.A01
                if (r1 != 0) goto L_0x03d0
                X.2IL r1 = X.2IL.A01(r4)
                r0.A01 = r1
            L_0x03d0:
                if (r5 == 0) goto L_0x03d8
                r0 = r19
                java.lang.String r5 = r1.A02(r0, r5)
            L_0x03d8:
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.Mrs r1 = r0.A04
                r0 = 0
                android.os.Message r0 = r1.obtainMessage(r0, r5)
                goto L_0x04a2
            L_0x03e3:
                r3 = 0
                if (r7 == 0) goto L_0x01fb
                java.lang.String r0 = X.C46326Dbu.A00()
                X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r7)
                java.lang.String r1 = "false"
                java.lang.String r0 = "is_prefetch"
                java.util.HashMap r1 = X.Dbb.A0e(r0, r1, r2)
                java.lang.String r0 = "com.bloks.www.bloks.browser_history.main_screen"
                X.DiU r2 = X.C46649DiU.A04(r0, r1)
                r2.A05 = r7
                com.instagram.bloks.hosting.IgBloksScreenConfig r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig
                r1.<init>((X.0lg) r4)
                r1.A0R = r0
                r1.A0j = r3
                r0 = r21
                r1.A0U = r0
                java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
                android.os.Bundle r2 = X.C49891FBs.A00(r1, r2)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r1 = r0.getApplicationContext()
                java.lang.String r0 = "bloks"
                goto L_0x048b
            L_0x041a:
                android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
                android.os.Bundle r5 = r2.A00
                java.lang.String r3 = "TrackingInfo.USE_MEDIA_REPORTING_FLOW"
                boolean r3 = X.DbT.A1X(r5, r3)
                if (r3 == 0) goto L_0x0466
                java.lang.String r3 = "start_media_report"
            L_0x042b:
                r4.putString(r0, r3)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r3 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.res.Resources r0 = r3.getResources()
                java.lang.String r5 = X.Ri0.A00(r0, r2)
                r0 = 2715(0xa9b, float:3.805E-42)
                java.lang.String r0 = X.AnonymousClass000.A00(r0)
                r4.putString(r0, r5)
                java.lang.String r2 = X.SDT.A00(r2)
                java.lang.String r0 = "media_id"
                r4.putString(r0, r2)
                r0 = r24
                java.lang.String r0 = X.DbT.A11(r0, r10)
                r4.putString(r6, r0)
                java.lang.String r0 = X.DbT.A11(r6, r10)
                r4.putString(r1, r0)
                r0 = 14
                java.lang.String r0 = X.C66579MXk.A00(r0)
                r4.putBoolean(r0, r8)
                goto L_0x04eb
            L_0x0466:
                java.lang.String r3 = "start_website_report"
                goto L_0x042b
            L_0x046a:
                java.lang.String r0 = "https://www.facebook.com/privacy/policy/"
                android.content.Intent r1 = X.DbX.A09(r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r0 = r0.getApplicationContext()
                X.0kR.A0D(r0, r1)
                goto L_0x01fb
            L_0x047b:
                java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
                android.os.Bundle r0 = r2.A00
                android.os.Bundle r2 = X.Pxe.A0J(r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r1 = r0.getApplicationContext()
                java.lang.String r0 = "browser_settings"
            L_0x048b:
                X.AnonymousClass6W8.A06(r1, r2, r3, r0)
                goto L_0x01fb
            L_0x0490:
                java.lang.Object r0 = r10.get(r6)
                if (r0 == 0) goto L_0x01fb
                java.lang.Object r1 = r10.get(r6)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                X.Mrs r0 = r0.A04
                android.os.Message r0 = r0.obtainMessage(r8, r1)
            L_0x04a2:
                r0.sendToTarget()
                goto L_0x01fb
            L_0x04a7:
                android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
                java.lang.String r5 = "open_bwp_more_info_bottom_sheet"
                r4.putString(r0, r5)
                r4.putString(r3, r7)
                android.os.Bundle r3 = r2.A00
                java.lang.String r0 = "TrackingInfo.ARG_AD_ID"
                java.lang.String r3 = r3.getString(r0)
                java.lang.String r0 = "ad_id"
                r4.putString(r0, r3)
                java.lang.String r3 = "should_hide_report_website"
                java.lang.String r0 = X.DbT.A11(r3, r10)
                r4.putString(r3, r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r3 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.res.Resources r0 = r3.getResources()
                java.lang.String r2 = X.Ri0.A00(r0, r2)
                java.lang.String r0 = "report_bottom_sheet_title"
                r4.putString(r0, r2)
                r0 = r24
                java.lang.String r0 = X.DbT.A11(r0, r10)
                r4.putString(r6, r0)
                java.lang.String r0 = X.DbT.A11(r6, r10)
                r4.putString(r1, r0)
            L_0x04eb:
                r4.putBundle(r9, r11)
                java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r1 = com.instagram.modal.TransparentBackgroundModalActivity.class
                android.content.Context r0 = r3.getApplicationContext()
                X.AnonymousClass6W8.A06(r0, r4, r1, r13)
                goto L_0x01fb
            L_0x04f9:
                java.lang.String r8 = X.SDT.A00(r2)
                java.lang.String r9 = X.DbT.A11(r6, r10)
                java.lang.String r1 = r12.A03(r2)
                android.os.Bundle r3 = r2.A00
                java.lang.String r0 = "TrackingInfo.ARG_USER_ID"
                java.lang.String r5 = r3.getString(r0)
                if (r9 != 0) goto L_0x0518
                java.lang.String r1 = "IAB Share Open Logging"
                java.lang.String r0 = "Error getting null url"
                X.0wb.A03(r1, r0)
                goto L_0x01fb
            L_0x0518:
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r3 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r11 = r3.getApplicationContext()
                r0 = 0
                X.0qQ.A0B(r11, r0)
                X.RDo r10 = X.C8872RDo.A02
                android.os.Bundle r2 = r2.A00
                java.lang.String r0 = "TrackingInfo.ARG_HIDE_SYSTEM_BAR"
                boolean r0 = r2.getBoolean(r0)
                r6 = r0 ^ 1
                java.lang.Class<com.instagram.inappbrowser.actions.BrowserActionActivity> r0 = com.instagram.inappbrowser.actions.BrowserActionActivity.class
                android.content.Intent r2 = X.C66580MXl.A0A(r11, r0)
                android.os.Bundle r4 = X.DbY.A09(r4)
                java.lang.String r0 = "browser_action_extra_action_type"
                r4.putSerializable(r0, r10)
                java.lang.String r0 = "browser_action_extra_browser_url"
                r4.putString(r0, r9)
                java.lang.String r0 = "browser_action_extra_media_id"
                r4.putString(r0, r8)
                java.lang.String r0 = "browser_action_status_bar_visibility"
                r4.putBoolean(r0, r6)
                java.lang.String r0 = "browser_action_session_id"
                r4.putString(r0, r7)
                java.lang.String r0 = "browser_action_tracking_token"
                r4.putString(r0, r1)
                java.lang.String r1 = "browser_action_tracking_enabled"
                r0 = r20
                r4.putBoolean(r1, r0)
                java.lang.String r0 = "browser_url_author_id"
                r4.putString(r0, r5)
                r2.putExtras(r4)
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                r2.addFlags(r0)
                android.content.Context r0 = r3.getApplicationContext()
                X.0kR.A0B(r0, r2)
                goto L_0x01fb
            L_0x0573:
                java.lang.String r0 = "REFRESH"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 9
                goto L_0x01ec
            L_0x057f:
                java.lang.String r0 = "ACTION_SEND_IN_DIRECT"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 8
                goto L_0x01ec
            L_0x058b:
                java.lang.String r0 = "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 7
                goto L_0x01ec
            L_0x0596:
                java.lang.String r0 = "COPY_LINK"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 6
                goto L_0x01ec
            L_0x05a1:
                java.lang.String r0 = "ACTION_OPEN_LINK_HISTORY"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 5
                goto L_0x01ec
            L_0x05ac:
                java.lang.String r0 = "ACTION_REPORT"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 4
                goto L_0x01ec
            L_0x05b7:
                java.lang.String r0 = "ACTION_PRIVACY_POLICY"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 3
                goto L_0x01ec
            L_0x05c2:
                java.lang.String r0 = "OPEN_BROWSER_SETTINGS"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 2
                goto L_0x01ec
            L_0x05cd:
                java.lang.String r0 = "ACTION_SHARE_VIA"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 1
                goto L_0x01ec
            L_0x05d8:
                java.lang.String r0 = "bwp_more_options_menu_action"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01ec
                r14 = 0
                goto L_0x01ec
            L_0x05e3:
                java.lang.String r0 = "ACTION_SHARE_VIA"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r15 == 0) goto L_0x01e4
                if (r7 != 0) goto L_0x05f3
                java.lang.String r1 = "IAB Share Logging"
                goto L_0x086c
            L_0x05f3:
                r0 = r22
                X.0wc r1 = X.AnonymousClass0kN.A01(r0, r4)
                java.lang.String r0 = "iab_share"
                X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
                r0 = 185(0xb9, float:2.59E-43)
                X.1Ln r13 = X.C51965G9l.A0U(r1, r0)
                r13.A0R(r3, r7)
                java.lang.String r1 = "target_url"
                r0 = r76
                r13.A0R(r1, r0)
                java.lang.String r1 = "tracking_token"
                r0 = r73
                r13.A0R(r1, r0)
                java.lang.String r1 = "default_share_sheet"
                java.lang.String r0 = "sharing_type"
                r13.A0R(r0, r1)
                goto L_0x089d
            L_0x0622:
                java.lang.String r0 = "ACTION_PRIVACY_POLICY"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r7 == 0) goto L_0x01e4
                int r0 = r7.length()
                if (r0 == 0) goto L_0x01e4
                long r13 = java.lang.System.currentTimeMillis()
                double r0 = (double) r13
                r27 = r0
                java.lang.Integer r1 = X.AnonymousClass05K.A00
                java.lang.String r13 = "iab_unified"
                r0 = r17
                X.0Aj r13 = X.AnonymousClass7TE.A0e(r0, r13)
                boolean r0 = r13.isSampled()
                if (r0 == 0) goto L_0x01e4
                java.lang.String r14 = "IAB_MORE_MENU_PRIVACY_POLICY_LINK_CLICKED"
                java.lang.String r0 = "unified_event_name"
                r13.AAJ(r0, r14)
                r0 = r16
                X.0qQ.A0B(r1, r0)
                java.lang.String r1 = "user_interaction"
                java.lang.String r0 = "category"
                r13.AAJ(r0, r1)
                r13.AAJ(r3, r7)
                java.lang.Double r1 = java.lang.Double.valueOf(r27)
                java.lang.String r0 = "event_ts"
                r13.A8D(r0, r1)
                r0 = r73
                X.C51965G9l.A1L(r13, r0)
                r13.Cgf()
                goto L_0x01e4
            L_0x0674:
                java.lang.String r0 = "ACTION_GO_FORWARD"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                java.lang.String r1 = "browser_forward"
                goto L_0x082e
            L_0x0680:
                java.lang.String r0 = "ACTION_OPEN_LINK_HISTORY"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r7 == 0) goto L_0x01e4
                if (r74 == 0) goto L_0x01e4
                java.lang.String r1 = "iab_link_history_ux"
                r0 = r17
                X.0Aj r1 = X.AnonymousClass7TE.A0e(r0, r1)
                r0 = 177(0xb1, float:2.48E-43)
                X.1Ln r13 = X.C51965G9l.A0U(r1, r0)
                boolean r0 = X.DbT.A1Y(r13)
                if (r0 == 0) goto L_0x01e4
                java.lang.String r1 = "view_link_history_icon_clicked"
                java.lang.String r0 = "sub_event"
                r13.A0R(r0, r1)
                r13.A0R(r3, r7)
                long r14 = java.lang.System.currentTimeMillis()
                double r14 = (double) r14
                X.Pxf.A1D(r13, r14)
                java.lang.String r1 = "tracking_token"
                r0 = r73
                r13.A0R(r1, r0)
                java.lang.String r1 = "target_url"
                r0 = r76
                r13.A0R(r1, r0)
                java.lang.String r1 = "click_source_id"
                r0 = r75
                r13.A0R(r1, r0)
                java.lang.String r1 = "click_source"
                r0 = r72
                r13.A0R(r1, r0)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
                java.lang.String r28 = "is_prefetch"
                goto L_0x081d
            L_0x06da:
                java.lang.String r0 = "COPY_LINK"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r15 == 0) goto L_0x01e4
                java.lang.String r13 = "browser_copy_link"
                X.3sc r1 = new X.3sc
                r0 = r22
                r1.<init>(r0, r13)
                r1.A7N = r5
                r0 = r75
                r1.A5c = r0
                X.0xI r13 = r1.A00()
                goto L_0x0859
            L_0x06f9:
                java.lang.String r0 = "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                X.SH7 r16 = new X.SH7
                r0 = r16
                r0.<init>(r4)
                if (r71 == 0) goto L_0x01e4
                X.2IP r0 = r0.A00
                if (r0 == 0) goto L_0x071c
                boolean r0 = X.2IP.A00
                if (r0 != r8) goto L_0x071c
                java.lang.String r13 = "FORM_COMPLETION"
                r0 = r71
                boolean r0 = r0.equalsIgnoreCase(r13)
                if (r0 != 0) goto L_0x01e4
            L_0x071c:
                if (r30 == 0) goto L_0x0726
                boolean r0 = java.lang.Boolean.parseBoolean(r30)
                if (r0 != r8) goto L_0x0726
                goto L_0x01e4
            L_0x0726:
                X.1Ln r13 = X.1Ln.A06(r17)
                r0 = r71
                r13.A0k(r0)
                r15 = r69
                r0 = r16
                java.lang.String r0 = r0.A00(r15)
                r15 = r70
                r13.A0R(r15, r0)
                r15 = r68
                r0 = r16
                java.lang.String r15 = r0.A00(r15)
                r0 = r24
                r13.A0R(r0, r15)
                r0 = r67
                r13.A0R(r3, r0)
                r15 = r66
                r0 = r65
                r13.A0R(r15, r0)
                r15 = r25
                r0 = r64
                r13.A0R(r15, r0)
                r15 = r63
                r0 = r62
                r13.A0R(r15, r0)
                r15 = r61
                r0 = r60
                r13.A0R(r15, r0)
                r15 = r59
                r0 = r58
                r13.A0R(r15, r0)
                r15 = r57
                r0 = r56
                r13.A0R(r15, r0)
                r15 = r55
                r0 = r54
                r13.A0R(r15, r0)
                r15 = r53
                r0 = r52
                r13.A0R(r15, r0)
                r15 = r51
                r0 = r50
                r13.A0R(r15, r0)
                r15 = r49
                r0 = r48
                r13.A0R(r15, r0)
                if (r46 == 0) goto L_0x079f
                java.lang.Long r15 = X.C9744Rg2.A00(r46)
                r0 = r47
                r13.A0Q(r0, r15)
            L_0x079f:
                if (r44 == 0) goto L_0x07aa
                java.lang.Long r15 = X.C9744Rg2.A00(r44)
                r0 = r45
                r13.A0Q(r0, r15)
            L_0x07aa:
                if (r42 == 0) goto L_0x07b5
                java.lang.Long r15 = X.C9744Rg2.A00(r42)
                r0 = r43
                r13.A0Q(r0, r15)
            L_0x07b5:
                if (r40 == 0) goto L_0x07c0
                java.lang.Long r15 = X.C9744Rg2.A00(r40)
                r0 = r41
                r13.A0Q(r0, r15)
            L_0x07c0:
                if (r39 == 0) goto L_0x07cf
                boolean r0 = java.lang.Boolean.parseBoolean(r39)
                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
                r0 = r26
                r13.A0O(r0, r15)
            L_0x07cf:
                if (r14 == 0) goto L_0x07d8
                X.0Aj r15 = r13.A00
                r0 = r38
                r15.A9H(r0, r14)
            L_0x07d8:
                if (r36 == 0) goto L_0x07e1
                r14 = r37
                r0 = r36
                r13.A0R(r14, r0)
            L_0x07e1:
                if (r34 == 0) goto L_0x07f0
                boolean r0 = java.lang.Boolean.parseBoolean(r34)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
                r0 = r35
                r13.A0O(r0, r14)
            L_0x07f0:
                if (r32 == 0) goto L_0x07ff
                boolean r0 = java.lang.Boolean.parseBoolean(r32)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
                r0 = r33
                r13.A0O(r0, r14)
            L_0x07ff:
                if (r79 == 0) goto L_0x080a
                java.lang.Long r14 = X.C9744Rg2.A00(r79)
                java.lang.String r0 = "ad_id"
                r13.A0Q(r0, r14)
            L_0x080a:
                if (r1 == 0) goto L_0x0813
                X.0Aj r14 = r13.A00
                r0 = r29
                r14.A9H(r0, r1)
            L_0x0813:
                if (r27 == 0) goto L_0x08a5
                boolean r0 = java.lang.Boolean.parseBoolean(r27)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            L_0x081d:
                r0 = r28
                r13.A0O(r0, r1)
                goto L_0x08a5
            L_0x0824:
                java.lang.String r0 = "ACTION_GO_BACK"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                java.lang.String r1 = "browser_back"
            L_0x082e:
                java.lang.String r0 = r22.getModuleName()
                X.0xI r13 = X.0xI.A01(r1, r0)
                goto L_0x0859
            L_0x0837:
                java.lang.String r0 = "ACTION_OPEN_WITH"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r76 == 0) goto L_0x01e4
                java.lang.String r1 = "browser_open_link"
                r0 = r22
                X.0xI r13 = X.0xI.A00(r0, r1)
                r1 = r77
                r0 = r76
                r13.A0C(r1, r0)
                if (r75 == 0) goto L_0x0859
                r1 = r78
                r0 = r75
                r13.A0C(r1, r0)
            L_0x0859:
                X.DbU.A1R(r13, r4)
                goto L_0x01e4
            L_0x085e:
                java.lang.String r0 = "ACTION_SEND_IN_DIRECT"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x01e4
                if (r15 == 0) goto L_0x01e4
                if (r7 != 0) goto L_0x0871
                java.lang.String r1 = "IAB Share Open Logging"
            L_0x086c:
                X.0wb.A03(r1, r13)
                goto L_0x01e4
            L_0x0871:
                r0 = r22
                X.0wc r1 = X.AnonymousClass0kN.A01(r0, r4)
                java.lang.String r0 = "iab_share_open"
                X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
                r0 = 186(0xba, float:2.6E-43)
                X.1Ln r13 = X.C51965G9l.A0U(r1, r0)
                java.lang.String r0 = "target_url"
                r13.A0R(r0, r15)
                java.lang.String r1 = "send_in_direct"
                java.lang.String r0 = "share_sheet_type"
                r13.A0R(r0, r1)
                r13.A0R(r3, r7)
                java.lang.String r1 = "tracking_token"
                r0 = r73
                r13.A0R(r1, r0)
            L_0x089d:
                long r14 = java.lang.System.currentTimeMillis()
                double r0 = (double) r14
                X.Pxf.A1D(r13, r0)
            L_0x08a5:
                r13.Cgf()
                goto L_0x01e4
            L_0x08aa:
                r1 = 0
                goto L_0x01c2
            L_0x08ad:
                r14 = 0
                goto L_0x017f
            L_0x08b0:
                r72 = 0
                goto L_0x00b9
            L_0x08b4:
                r79 = 0
                goto L_0x0062
            L_0x08b8:
                java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"
                java.lang.String r7 = X.DbT.A11(r0, r10)
                goto L_0x0058
            L_0x08c0:
                r2.<init>(r11)
                goto L_0x002e
            L_0x08c5:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.Dvy(android.os.Bundle, java.util.Map):void");
        }

        public final void E1I(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
            int A032 = AnonymousClass0fD.A03(1496112265);
            this.A01 = onShopsLiteCallback;
            AnonymousClass0fD.A0A(648564367, A032);
        }

        public final void EGr(Bundle bundle, long[] jArr) {
            int A032 = AnonymousClass0fD.A03(-2098192223);
            boolean A1a = C66581MXm.A1a(A07(bundle));
            UserSession userSession = this.A02;
            AnonymousClass7TG.A1O(userSession, jArr);
            if (A1a) {
                for (long A012 : jArr) {
                    AnonymousClass4v0.A01(AnonymousClass4v0.A00(userSession), AnonymousClass05K.A01, A012);
                }
            }
            AnonymousClass0fD.A0A(1030580796, A032);
        }

        public final void EWJ() {
            int A032 = AnonymousClass0fD.A03(1069763163);
            UserSession userSession = this.A02;
            SRr.A01(new C8764R8p(userSession, 3), userSession, (Integer) null, "CONTACT_AUTOFILL", "FBPAY_DISCLOSURE_SHOWN");
            AnonymousClass0fD.A0A(1505049537, A032);
        }

        public final void EzO() {
            AnonymousClass0fD.A0A(539297683, AnonymousClass0fD.A03(-1697873440));
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(1416617752, AnonymousClass0fD.A03(1175971799));
            return this;
        }

        /* JADX WARNING: type inference failed for: r4v9, types: [com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r10v4, types: [com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r10v11, types: [java.lang.Object, com.facebook.browser.lite.ipc.IABExpandableFooterCallback$Stub$Proxy] */
        /* JADX WARNING: type inference failed for: r4v23, types: [java.lang.Object, com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy] */
        /* JADX WARNING: type inference failed for: r4v28, types: [com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r4v33, types: [com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r4v40, types: [com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0732, code lost:
            X.AnonymousClass0fD.A0A(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0760, code lost:
            X.AnonymousClass0fD.A0A(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0763, code lost:
            r2.writeNoException();
            r2.writeInt(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x07cb, code lost:
            r2.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x07ce, code lost:
            r7 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x07cf, code lost:
            X.AnonymousClass0fD.A0A(-399314222, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x07d5, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
            r2.writeNoException();
            r2.writeInt(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x018e, code lost:
            r2.writeNoException();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r31, android.os.Parcel r32, android.os.Parcel r33, int r34) {
            /*
                r30 = this;
                r0 = -818611076(0xffffffffcf34fc7c, float:-3.0364457E9)
                int r3 = X.AnonymousClass0fD.A03(r0)
                r6 = 1
                java.lang.String r4 = "com.facebook.browser.lite.ipc.BrowserLiteCallback"
                r8 = r30
                r5 = r31
                r0 = r32
                r2 = r33
                if (r5 < r6) goto L_0x0020
                r1 = 16777215(0xffffff, float:2.3509886E-38)
                if (r5 > r1) goto L_0x002d
                r0.enforceInterface(r4)
                r10 = 0
                switch(r31) {
                    case 1: goto L_0x0079;
                    case 2: goto L_0x0083;
                    case 3: goto L_0x0091;
                    case 4: goto L_0x00b7;
                    case 5: goto L_0x00d1;
                    case 6: goto L_0x00df;
                    case 7: goto L_0x00f5;
                    case 8: goto L_0x0111;
                    case 9: goto L_0x012a;
                    case 10: goto L_0x0142;
                    case 11: goto L_0x0193;
                    case 12: goto L_0x01a4;
                    case 13: goto L_0x01b9;
                    case 14: goto L_0x01ca;
                    case 15: goto L_0x01d7;
                    case 16: goto L_0x01fa;
                    case 17: goto L_0x0207;
                    case 18: goto L_0x0218;
                    case 19: goto L_0x0229;
                    case 20: goto L_0x0235;
                    case 21: goto L_0x0245;
                    case 22: goto L_0x027d;
                    case 23: goto L_0x0282;
                    case 24: goto L_0x0293;
                    case 25: goto L_0x029d;
                    case 26: goto L_0x02ad;
                    case 27: goto L_0x02e1;
                    case 28: goto L_0x0311;
                    case 29: goto L_0x0341;
                    case 30: goto L_0x034a;
                    case 31: goto L_0x0051;
                    case 32: goto L_0x0061;
                    case 33: goto L_0x0039;
                    case 34: goto L_0x0045;
                    case 35: goto L_0x034f;
                    case 36: goto L_0x0358;
                    case 37: goto L_0x0369;
                    case 38: goto L_0x037a;
                    case 39: goto L_0x0389;
                    case 40: goto L_0x039a;
                    case 41: goto L_0x03a7;
                    case 42: goto L_0x03ac;
                    case 43: goto L_0x03c2;
                    case 44: goto L_0x03d1;
                    case 45: goto L_0x03f1;
                    case 46: goto L_0x040e;
                    case 47: goto L_0x0413;
                    case 48: goto L_0x0422;
                    case 49: goto L_0x045a;
                    case 50: goto L_0x047c;
                    case 51: goto L_0x04a0;
                    case 52: goto L_0x04bd;
                    case 53: goto L_0x0505;
                    case 54: goto L_0x0522;
                    case 55: goto L_0x0549;
                    case 56: goto L_0x0566;
                    case 57: goto L_0x05ae;
                    case 58: goto L_0x05f1;
                    case 59: goto L_0x0603;
                    case 60: goto L_0x061c;
                    case 61: goto L_0x062d;
                    case 62: goto L_0x0640;
                    case 63: goto L_0x0674;
                    case 64: goto L_0x0685;
                    case 65: goto L_0x0696;
                    case 66: goto L_0x06cf;
                    case 67: goto L_0x006d;
                    case 68: goto L_0x06d8;
                    case 69: goto L_0x06e9;
                    case 70: goto L_0x06f7;
                    case 71: goto L_0x070b;
                    case 72: goto L_0x071f;
                    case 73: goto L_0x0737;
                    case 74: goto L_0x074c;
                    case 75: goto L_0x076a;
                    case 76: goto L_0x0788;
                    case 77: goto L_0x0794;
                    case 78: goto L_0x07ac;
                    case 79: goto L_0x07b4;
                    default: goto L_0x0020;
                }
            L_0x0020:
                r1 = r34
                boolean r6 = super.onTransact(r5, r0, r2, r1)
                r0 = -1944335588(0xffffffff8c1bcb1c, float:-1.2001887E-31)
            L_0x0029:
                X.AnonymousClass0fD.A0A(r0, r3)
                return r6
            L_0x002d:
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 != r1) goto L_0x0020
                r2.writeString(r4)
                r0 = -1800119072(0xffffffff94b45ce0, float:-1.8211988E-26)
                goto L_0x0029
            L_0x0039:
                r0 = -2060747393(0xffffffff852b7d7f, float:-8.063431E-36)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1424864757(0x54edb5f5, float:8.1676799E12)
                goto L_0x0732
            L_0x0045:
                r0 = 344094765(0x1482782d, float:1.3174046E-26)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -899047213(0xffffffffca69a0d3, float:-3827764.8)
                goto L_0x0732
            L_0x0051:
                r0 = -1825849807(0xffffffff932bbe31, float:-2.1677006E-27)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -76652560(0xfffffffffb6e5ff0, float:-1.2377125E36)
                X.AnonymousClass0fD.A0A(r0, r1)
                r4 = 0
                goto L_0x0763
            L_0x0061:
                r0 = 759588264(0x2d4665a8, float:1.1277569E-11)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1469028969(0x578f9a69, float:3.15786699E14)
                goto L_0x0732
            L_0x006d:
                r0 = 181188311(0xaccb6d7, float:1.9713262E-32)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1215627359(0xffffffffb78affa1, float:-1.6569918E-5)
                goto L_0x0732
            L_0x0079:
                r7 = 1
                java.lang.String r0 = r0.readString()
                int r0 = r8.CIl(r0)
                goto L_0x00af
            L_0x0083:
                r7 = 1
                java.lang.String r1 = r0.readString()
                java.lang.String r0 = r0.readString()
                boolean r0 = r8.CJC(r1, r0)
                goto L_0x00af
            L_0x0091:
                r7 = 1
                r0.readString()
                r0.readString()
                r0.readString()
                r0.readString()
                r0.readString()
                r0 = -319905470(0xffffffffeceea142, float:-2.3078869E27)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 49723364(0x2f6b7e4, float:3.6252E-37)
                X.AnonymousClass0fD.A0A(r0, r1)
                r0 = 0
            L_0x00af:
                r2.writeNoException()
                r2.writeInt(r0)
                goto L_0x07cf
            L_0x00b7:
                r7 = 1
                android.os.Parcelable$Creator r1 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
                java.lang.Object r5 = X.Pxj.A0i(r0, r1)
                com.facebook.iabeventlogging.model.IABEvent r5 = (com.facebook.iabeventlogging.model.IABEvent) r5
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.DJb(r4, r5, r0)
                goto L_0x018e
            L_0x00d1:
                r7 = 1
                java.lang.String r1 = r0.readString()
                android.os.Bundle r0 = A00(r0)
                r8.D6X(r1, r0)
                goto L_0x018e
            L_0x00df:
                r7 = 1
                java.lang.String r5 = r0.readString()
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.Dfd(r4, r0, r5)
                goto L_0x018e
            L_0x00f5:
                r7 = 1
                java.lang.String r5 = r0.readString()
                int r1 = r0.readInt()
                if (r1 != 0) goto L_0x0101
                r6 = 0
            L_0x0101:
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.DWP(r4, r0, r5, r6)
                goto L_0x018e
            L_0x0111:
                r7 = 1
                java.lang.String r10 = r0.readString()
                boolean r14 = X.Pxi.A1P(r0)
                java.lang.String r11 = r0.readString()
                long r12 = r0.readLong()
                android.os.Bundle r9 = A00(r0)
                r8.CjG(r9, r10, r11, r12, r14)
                goto L_0x018e
            L_0x012a:
                r7 = 1
                java.lang.String r5 = r0.readString()
                java.lang.String r4 = r0.readString()
                int r1 = r0.readInt()
                if (r1 != 0) goto L_0x013a
                r6 = 0
            L_0x013a:
                android.os.Bundle r0 = A00(r0)
                r8.CiT(r0, r5, r4, r6)
                goto L_0x018e
            L_0x0142:
                java.lang.String r11 = r0.readString()
                long r16 = r0.readLong()
                long r18 = r0.readLong()
                long r20 = r0.readLong()
                long r22 = r0.readLong()
                long r24 = r0.readLong()
                int r15 = r0.readInt()
                boolean r26 = X.C41848B3p.A1X(r0)
                boolean r27 = X.C41848B3p.A1X(r0)
                boolean r28 = X.C41848B3p.A1X(r0)
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r13 = r0.readHashMap(r1)
                boolean r29 = X.C41848B3p.A1X(r0)
                java.lang.String r12 = r0.readString()
                java.util.HashMap r14 = r0.readHashMap(r1)
                android.os.Bundle r9 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r10 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r10 = (com.facebook.privacy.zone.policy.ZonePolicy) r10
                r7 = 1
                r8.Cj2(r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            L_0x018e:
                r2.writeNoException()
                goto L_0x07cf
            L_0x0193:
                java.lang.String r4 = r0.readString()
                java.lang.String r1 = r0.readString()
                android.os.Bundle r0 = A00(r0)
                r8.DWC(r0, r4, r1)
                goto L_0x07cb
            L_0x01a4:
                java.lang.String r10 = r0.readString()
                android.os.Bundle r9 = A00(r0)
                int r11 = r0.readInt()
                long r12 = r0.readLong()
                r8.DW5(r9, r10, r11, r12)
                goto L_0x07cb
            L_0x01b9:
                java.lang.String r4 = r0.readString()
                android.os.Bundle r1 = A00(r0)
                int r0 = r0.readInt()
                r8.DW2(r0, r4, r1)
                goto L_0x07cb
            L_0x01ca:
                long[] r1 = r0.createLongArray()
                android.os.Bundle r0 = A00(r0)
                r8.EGr(r0, r1)
                goto L_0x07cb
            L_0x01d7:
                r0.readString()
                r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                r0.readHashMap(r1)
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = -1120837566(0xffffffffbd316042, float:-0.04330469)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1393129909(0xffffffffacf6864b, float:-7.00665E-12)
                goto L_0x0732
            L_0x01fa:
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r0 = r0.readHashMap(r1)
                r8.DbR(r0)
                goto L_0x07cb
            L_0x0207:
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r1 = r0.readHashMap(r1)
                android.os.Bundle r0 = A00(r0)
                r8.Dvy(r0, r1)
                goto L_0x07cb
            L_0x0218:
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r1 = r0.readHashMap(r1)
                android.os.Bundle r0 = A00(r0)
                r8.Ckd(r0, r1)
                goto L_0x07cb
            L_0x0229:
                java.util.ArrayList r0 = r8.Bej()
                r2.writeNoException()
                r2.writeStringList(r0)
                goto L_0x07ce
            L_0x0235:
                java.lang.String r0 = r0.readString()
                com.facebook.browser.lite.ipc.PrefetchCacheEntry r0 = r8.Bei(r0)
                r2.writeNoException()
                X.S8M.A01(r2, r0, r6)
                goto L_0x07ce
            L_0x0245:
                android.os.Parcelable$Creator r1 = com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall.CREATOR
                java.lang.Object r6 = X.Pxj.A0i(r0, r1)
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r6 = (com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall) r6
                android.os.IBinder r5 = r0.readStrongBinder()
                if (r5 != 0) goto L_0x0259
                r4 = 0
            L_0x0254:
                r8.DMa(r6, r4)
                goto L_0x07cb
            L_0x0259:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback"
                android.os.IInterface r4 = r5.queryLocalInterface(r0)
                if (r4 == 0) goto L_0x0268
                boolean r0 = r4 instanceof com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
                if (r0 == 0) goto L_0x0268
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback r4 = (com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback) r4
                goto L_0x0254
            L_0x0268:
                com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy r4 = new com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy
                r4.<init>()
                r0 = 1706335356(0x65b49c7c, float:1.0661407E23)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r4.A00 = r5
                r0 = 2128347639(0x7edc01f7, float:1.4622018E38)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x0254
            L_0x027d:
                r8.EzO()
                goto L_0x07cb
            L_0x0282:
                java.lang.String r4 = r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.ArrayList r0 = r0.readArrayList(r1)
                r8.DJY(r4, r0)
                goto L_0x07cb
            L_0x0293:
                java.lang.String r0 = r0.readString()
                boolean r4 = r8.CJ3(r0)
                goto L_0x0763
            L_0x029d:
                java.lang.String r0 = r0.readString()
                java.lang.String r0 = r8.Cn4(r0)
                r2.writeNoException()
                r2.writeString(r0)
                goto L_0x07ce
            L_0x02ad:
                java.lang.String r6 = r0.readString()
                android.os.IBinder r5 = r0.readStrongBinder()
                if (r5 != 0) goto L_0x02bd
                r4 = 0
            L_0x02b8:
                r8.Cx9(r4, r6)
                goto L_0x07cb
            L_0x02bd:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.AutofillOptOutCallback"
                android.os.IInterface r4 = r5.queryLocalInterface(r0)
                if (r4 == 0) goto L_0x02cc
                boolean r0 = r4 instanceof com.facebook.browser.lite.ipc.AutofillOptOutCallback
                if (r0 == 0) goto L_0x02cc
                com.facebook.browser.lite.ipc.AutofillOptOutCallback r4 = (com.facebook.browser.lite.ipc.AutofillOptOutCallback) r4
                goto L_0x02b8
            L_0x02cc:
                com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy r4 = new com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy
                r4.<init>()
                r0 = 720787706(0x2af658fa, float:4.3760118E-13)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r4.A00 = r5
                r0 = 464571067(0x1bb0cabb, float:2.924777E-22)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x02b8
            L_0x02e1:
                android.os.IBinder r5 = r0.readStrongBinder()
                if (r5 != 0) goto L_0x02ed
                r4 = 0
            L_0x02e8:
                r8.AUq(r4)
                goto L_0x07cb
            L_0x02ed:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.AutofillScriptCallback"
                android.os.IInterface r4 = r5.queryLocalInterface(r0)
                if (r4 == 0) goto L_0x02fc
                boolean r0 = r4 instanceof com.facebook.browser.lite.ipc.AutofillScriptCallback
                if (r0 == 0) goto L_0x02fc
                com.facebook.browser.lite.ipc.AutofillScriptCallback r4 = (com.facebook.browser.lite.ipc.AutofillScriptCallback) r4
                goto L_0x02e8
            L_0x02fc:
                com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy r4 = new com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy
                r4.<init>()
                r0 = -1557325651(0xffffffffa32d18ad, float:-9.383574E-18)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r4.A00 = r5
                r0 = 516694902(0x1ecc2376, float:2.1614006E-20)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x02e8
            L_0x0311:
                android.os.IBinder r5 = r0.readStrongBinder()
                if (r5 != 0) goto L_0x031d
                r4 = 0
            L_0x0318:
                r8.AUp(r4)
                goto L_0x07cb
            L_0x031d:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.AutofillContactDataCallback"
                android.os.IInterface r4 = r5.queryLocalInterface(r0)
                if (r4 == 0) goto L_0x032c
                boolean r0 = r4 instanceof com.facebook.browser.lite.ipc.AutofillContactDataCallback
                if (r0 == 0) goto L_0x032c
                com.facebook.browser.lite.ipc.AutofillContactDataCallback r4 = (com.facebook.browser.lite.ipc.AutofillContactDataCallback) r4
                goto L_0x0318
            L_0x032c:
                com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy r4 = new com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy
                r4.<init>()
                r0 = -846231890(0xffffffffcd8f86ae, float:-3.00996032E8)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r4.A00 = r5
                r0 = -1543772660(0xffffffffa3fbe60c, float:-2.7310903E-17)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x0318
            L_0x0341:
                java.lang.String r0 = r0.readString()
                r8.ChE(r0)
                goto L_0x07cb
            L_0x034a:
                r8.EWJ()
                goto L_0x07cb
            L_0x034f:
                java.lang.String r0 = r0.readString()
                r8.Cff(r0)
                goto L_0x07cb
            L_0x0358:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = 2139039858(0x7f7f2872, float:3.3916314E38)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -37096398(0xfffffffffdc9f432, float:-3.3555345E37)
                goto L_0x0732
            L_0x0369:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = 841277013(0x3224de55, float:9.596609E-9)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -121653057(0xfffffffff8bfb8bf, float:-3.1108619E34)
                goto L_0x0732
            L_0x037a:
                r0.readString()
                r0 = 409635166(0x186a895e, float:3.0313144E-24)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1179273335(0xffffffffb9b5b789, float:-3.4659755E-4)
                goto L_0x0732
            L_0x0389:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = 1947487564(0x74144d4c, float:4.699876E31)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1258691220(0x4b061a94, float:8788628.0)
                goto L_0x0732
            L_0x039a:
                android.os.Bundle r1 = A00(r0)
                java.lang.String r0 = r0.readString()
                r8.Dvt(r0, r1)
                goto L_0x07cb
            L_0x03a7:
                r8.DFy()
                goto L_0x07cb
            L_0x03ac:
                java.lang.String r5 = r0.readString()
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                boolean r4 = r8.CIr(r4, r0, r5)
                goto L_0x0763
            L_0x03c2:
                r0.readString()
                r0 = 1191894845(0x470adf3d, float:35551.24)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 27819589(0x1a87e45, float:6.189464E-38)
                goto L_0x0732
            L_0x03d1:
                r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                r0.readHashMap(r1)
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = 99181187(0x5e96283, float:2.1947402E-35)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1265326759(0xffffffffb494a559, float:-2.7687454E-7)
                goto L_0x0732
            L_0x03f1:
                java.lang.String r6 = r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r5 = r0.readHashMap(r1)
                android.os.Bundle r4 = A00(r0)
                android.os.Parcelable$Creator r1 = com.facebook.privacy.zone.policy.ZonePolicy.CREATOR
                java.lang.Object r0 = X.Pxj.A0i(r0, r1)
                com.facebook.privacy.zone.policy.ZonePolicy r0 = (com.facebook.privacy.zone.policy.ZonePolicy) r0
                r8.AE8(r4, r0, r6, r5)
                goto L_0x07cb
            L_0x040e:
                r8.DjK()
                goto L_0x07cb
            L_0x0413:
                r0.readString()
                r0 = -1843404699(0xffffffff921fe065, float:-5.044814E-28)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1755510600(0xffffffff975d08b8, float:-7.1419956E-25)
                goto L_0x0732
            L_0x0422:
                r0.readString()
                android.os.IBinder r1 = r0.readStrongBinder()
                if (r1 == 0) goto L_0x044e
                java.lang.String r0 = "com.facebook.browser.lite.ipc.IsUrlSavedCallback"
                r1.queryLocalInterface(r0)
                r7 = -690544592(0xffffffffd6d72030, float:-1.18266622E14)
                com.facebook.profilo.provider.constants.ExternalProvider r0 = com.facebook.profilo.provider.constants.ExternalProviders.A07
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r5 = 6
                r6 = 21
                r8 = 0
                int r10 = r4.A00(r5, r6, r7, r8, r10)
                r7 = 615095521(0x24a99ce1, float:7.355783E-17)
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r6 = 22
                r4.A00(r5, r6, r7, r8, r10)
            L_0x044e:
                r0 = -1386816484(0xffffffffad56dc1c, float:-1.2213366E-11)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1606403484(0x5fbfc59c, float:2.7637245E19)
                goto L_0x0732
            L_0x045a:
                r0.readString()
                r0.readString()
                r0.readString()
                r0.readString()
                r0.readInt()
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.MoreInfoCallback.Stub.A00(r0)
                r0 = -1212417697(0xffffffffb7bbf95f, float:-2.240826E-5)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 2111832146(0x7de00052, float:3.7218592E37)
                goto L_0x0732
            L_0x047c:
                r0.readString()
                r0.readString()
                r0.readString()
                r0.readString()
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.IABBloksGraphQLCallback.Stub.A00(r0)
                r0 = 1205641577(0x47dca169, float:112962.82)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1738423570(0xffffffff9861c2ee, float:-2.9178983E-24)
                goto L_0x0732
            L_0x04a0:
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.lang.String r13 = r0.readString()
                android.os.Bundle r9 = A00(r0)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.IABBloksGraphQLCallback r10 = com.facebook.browser.lite.ipc.IABBloksGraphQLCallback.Stub.A00(r0)
                r8.DJa(r9, r10, r11, r12, r13)
                goto L_0x07cb
            L_0x04bd:
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.lang.String r13 = r0.readString()
                java.lang.String r14 = r0.readString()
                boolean r15 = X.C41848B3p.A1X(r0)
                android.os.Bundle r9 = A00(r0)
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x04e1
                r10 = 0
            L_0x04dc:
                r8.DJc(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x07cb
            L_0x04e1:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.IABExpandableFooterCallback"
                android.os.IInterface r10 = r4.queryLocalInterface(r0)
                if (r10 == 0) goto L_0x04f0
                boolean r0 = r10 instanceof com.facebook.browser.lite.ipc.IABExpandableFooterCallback
                if (r0 == 0) goto L_0x04f0
                com.facebook.browser.lite.ipc.IABExpandableFooterCallback r10 = (com.facebook.browser.lite.ipc.IABExpandableFooterCallback) r10
                goto L_0x04dc
            L_0x04f0:
                com.facebook.browser.lite.ipc.IABExpandableFooterCallback$Stub$Proxy r10 = new com.facebook.browser.lite.ipc.IABExpandableFooterCallback$Stub$Proxy
                r10.<init>()
                r0 = 979870901(0x3a67a4b5, float:8.836494E-4)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r10.A00 = r4
                r0 = -1815032394(0xffffffff93d0cdb6, float:-5.270943E-27)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x04dc
            L_0x0505:
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.lang.String r13 = r0.readString()
                android.os.Bundle r9 = A00(r0)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback r10 = com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback.Stub.A00(r0)
                r8.DJd(r9, r10, r11, r12, r13)
                goto L_0x07cb
            L_0x0522:
                r0.readString()
                r0.readString()
                r0.createStringArrayList()
                r0.readString()
                r0.readString()
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.IABBloksGraphQLCallback.Stub.A00(r0)
                r0 = -1700785247(0xffffffff9aa013a1, float:-6.620616E-23)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1015980573(0x3c8ea21d, float:0.017411286)
                goto L_0x0732
            L_0x0549:
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.lang.String r13 = r0.readString()
                android.os.Bundle r9 = A00(r0)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback r10 = com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback.Stub.A00(r0)
                r8.DJf(r9, r10, r11, r12, r13)
                goto L_0x07cb
            L_0x0566:
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                java.util.ArrayList r15 = r0.createStringArrayList()
                java.lang.String r13 = r0.readString()
                java.lang.String r14 = r0.readString()
                android.os.Bundle r9 = A00(r0)
                android.os.IBinder r4 = r0.readStrongBinder()
                if (r4 != 0) goto L_0x058a
                r10 = 0
            L_0x0585:
                r8.DJe(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x07cb
            L_0x058a:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback"
                android.os.IInterface r10 = r4.queryLocalInterface(r0)
                if (r10 == 0) goto L_0x0599
                boolean r0 = r10 instanceof com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback
                if (r0 == 0) goto L_0x0599
                com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback r10 = (com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback) r10
                goto L_0x0585
            L_0x0599:
                com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback$Stub$Proxy r10 = new com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback$Stub$Proxy
                r10.<init>()
                r0 = 1293900710(0x4d1f5ba6, float:1.67098976E8)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r10.A00 = r4
                r0 = 2117773616(0x7e3aa930, float:6.202872E37)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x0585
            L_0x05ae:
                r0.readString()
                r0.readString()
                r0.readString()
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.IBinder r1 = r0.readStrongBinder()
                if (r1 == 0) goto L_0x05e5
                java.lang.String r0 = "com.facebook.browser.lite.ipc.IABExtensionStatesHandlerCallback"
                r1.queryLocalInterface(r0)
                r7 = -539093955(0xffffffffdfde143d, float:-3.2004965E19)
                com.facebook.profilo.provider.constants.ExternalProvider r0 = com.facebook.profilo.provider.constants.ExternalProviders.A07
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r5 = 6
                r6 = 21
                r8 = 0
                int r10 = r4.A00(r5, r6, r7, r8, r10)
                r7 = 2017802123(0x7845378b, float:1.6000141E34)
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r6 = 22
                r4.A00(r5, r6, r7, r8, r10)
            L_0x05e5:
                r0 = 946111903(0x3864859f, float:5.448388E-5)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1452341977(0x5690fad9, float:7.9703528E13)
                goto L_0x0732
            L_0x05f1:
                r0.readString()
                r0.readString()
                r0 = -1149940949(0xffffffffbb754b2b, float:-0.0037428837)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1326793971(0xffffffffb0eabb0d, float:-1.7078904E-9)
                goto L_0x0732
            L_0x0603:
                r0.readString()
                r0.readString()
                android.os.IBinder r0 = r0.readStrongBinder()
                com.facebook.browser.lite.ipc.MoreInfoCallback.Stub.A00(r0)
                r0 = 1034853812(0x3dae9db4, float:0.08526173)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 2044911922(0x79e2e132, float:1.4725332E35)
                goto L_0x0732
            L_0x061c:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = -1117100260(0xffffffffbd6a671c, float:-0.05722724)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -422307955(0xffffffffe6d4178d, float:-5.0078806E23)
                goto L_0x0732
            L_0x062d:
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                r0.readHashMap(r1)
                r0 = 698023710(0x299aff1e, float:6.8832296E-14)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1394730892(0x5321e78c, float:6.9537445E11)
                goto L_0x0732
            L_0x0640:
                android.os.Bundle r6 = A00(r0)
                android.os.IBinder r5 = r0.readStrongBinder()
                if (r5 != 0) goto L_0x0650
                r4 = 0
            L_0x064b:
                r8.E1I(r6, r4)
                goto L_0x07cb
            L_0x0650:
                java.lang.String r0 = "com.facebook.browser.lite.ipc.OnShopsLiteCallback"
                android.os.IInterface r4 = r5.queryLocalInterface(r0)
                if (r4 == 0) goto L_0x065f
                boolean r0 = r4 instanceof com.facebook.browser.lite.ipc.OnShopsLiteCallback
                if (r0 == 0) goto L_0x065f
                com.facebook.browser.lite.ipc.OnShopsLiteCallback r4 = (com.facebook.browser.lite.ipc.OnShopsLiteCallback) r4
                goto L_0x064b
            L_0x065f:
                com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy r4 = new com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy
                r4.<init>()
                r0 = -895528790(0xffffffffca9f50aa, float:-5220437.0)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r4.A00 = r5
                r0 = 1650200906(0x625c114a, float:1.0148824E21)
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x064b
            L_0x0674:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = -1726659738(0xffffffff99154366, float:-7.7167305E-24)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 970531915(0x39d9244b, float:4.1416506E-4)
                goto L_0x0732
            L_0x0685:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                r0 = -391554795(0xffffffffe8a95915, float:-6.3977857E24)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -83157578(0xfffffffffb0b1db6, float:-7.223319E35)
                goto L_0x0732
            L_0x0696:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                X.Pxj.A0i(r0, r1)
                android.os.IBinder r1 = r0.readStrongBinder()
                if (r1 == 0) goto L_0x06c4
                java.lang.String r0 = "com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback"
                r1.queryLocalInterface(r0)
                r7 = 649094977(0x26b06741, float:1.224044E-15)
                com.facebook.profilo.provider.constants.ExternalProvider r0 = com.facebook.profilo.provider.constants.ExternalProviders.A07
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r5 = 6
                r6 = 21
                r8 = 0
                int r10 = r4.A00(r5, r6, r7, r8, r10)
                r7 = 31780565(0x1e4eed5, float:8.409668E-38)
                com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r4 = r0.A07()
                r6 = 22
                r4.A00(r5, r6, r7, r8, r10)
            L_0x06c4:
                r0 = -1328961372(0xffffffffb0c9a8a4, float:-1.4672605E-9)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1009514798(0x3c2bf92e, float:0.010496421)
                goto L_0x0732
            L_0x06cf:
                android.os.Bundle r0 = A00(r0)
                r8.CJD(r0)
                goto L_0x07cb
            L_0x06d8:
                r0.readString()
                r0.readString()
                r0 = -803467261(0xffffffffd01c1003, float:-1.04731802E10)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1978581140(0x75eec094, float:6.053089E32)
                goto L_0x0732
            L_0x06e9:
                r0.readString()
                r0 = 727812043(0x2b6187cb, float:8.012451E-13)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -291732096(0xffffffffee9c8580, float:-2.4220527E28)
                goto L_0x0732
            L_0x06f7:
                r0.readString()
                r0.readString()
                r0.readInt()
                r0 = -712695208(0xffffffffd5852258, float:-1.8297819E13)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 160403363(0x98f8fa3, float:3.4561073E-33)
                goto L_0x0732
            L_0x070b:
                r0.readString()
                r0.readString()
                r0.readInt()
                r0 = -1617947190(0xffffffff9f9015ca, float:-6.102242E-20)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1390101569(0x52db4441, float:4.70871474E11)
                goto L_0x0732
            L_0x071f:
                r0.readString()
                r0.readString()
                r0.readLong()
                r0 = -1026249787(0xffffffffc2d4abc5, float:-106.33549)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = -1547289604(0xffffffffa3c63bfc, float:-2.1492607E-17)
            L_0x0732:
                X.AnonymousClass0fD.A0A(r0, r1)
                goto L_0x07cb
            L_0x0737:
                r0.readString()
                r0.readString()
                int r4 = r0.readInt()
                r0 = -774321207(0xffffffffd1d8cbc9, float:-1.16391485E11)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 1682756204(0x644cd26c, float:1.5113193E22)
                goto L_0x0760
            L_0x074c:
                r0.readString()
                r0.readString()
                boolean r4 = X.Pxi.A1P(r0)
                r0 = 1513703752(0x5a394948, float:1.30383611E16)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 772328719(0x2e08cd0f, float:3.110495E-11)
            L_0x0760:
                X.AnonymousClass0fD.A0A(r0, r1)
            L_0x0763:
                r2.writeNoException()
                r2.writeInt(r4)
                goto L_0x07ce
            L_0x076a:
                r0.readString()
                r0.readString()
                long r4 = r0.readLong()
                r0 = 557280527(0x21376d0f, float:6.214715E-19)
                int r1 = X.AnonymousClass0fD.A03(r0)
                r0 = 496264777(0x1d946649, float:3.9281034E-21)
                X.AnonymousClass0fD.A0A(r0, r1)
                r2.writeNoException()
                r2.writeLong(r4)
                goto L_0x07ce
            L_0x0788:
                java.lang.String r1 = r0.readString()
                java.lang.String r0 = r0.readString()
                r8.CIP(r1, r0)
                goto L_0x07cb
            L_0x0794:
                java.lang.String r11 = r0.readString()
                long r9 = r0.readLong()
                java.lang.String r12 = r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r13 = r0.readHashMap(r1)
                r8.ChK(r9, r11, r12, r13)
                goto L_0x07cb
            L_0x07ac:
                java.lang.String r0 = r0.readString()
                r8.CIO(r0)
                goto L_0x07cb
            L_0x07b4:
                java.lang.String r11 = r0.readString()
                long r9 = r0.readLong()
                java.lang.String r12 = r0.readString()
                java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
                java.util.HashMap r13 = r0.readHashMap(r1)
                r8.ChJ(r9, r11, r12, r13)
            L_0x07cb:
                r2.writeNoException()
            L_0x07ce:
                r7 = 1
            L_0x07cf:
                r0 = -399314222(0xffffffffe832f2d2, float:-3.380242E24)
                X.AnonymousClass0fD.A0A(r0, r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public BrowserLiteCallbackImpl() {
            int A032 = AnonymousClass0fD.A03(-48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            AnonymousClass0fD.A0A(-1722318555, A032);
        }
    }

    public final IBinder onBind(Intent intent) {
        return new BrowserLiteCallbackImpl();
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0fD.A04(150097003);
        super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A0B(1098470020, A042);
    }
}
