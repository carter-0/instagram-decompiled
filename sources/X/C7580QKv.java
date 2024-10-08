package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.meta.vault.service.base.DefaultVaultService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import org.json.JSONException;

@Deprecated(message = "New logging should go through the {@link AutofillLoggerDeprecated} and instead use the {@link AutofillLogger}")
/* renamed from: X.QKv  reason: case insensitive filesystem */
public final class C7580QKv extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public int A00 = 1;
    public int A01 = 0;
    public long A02;
    public 0SM A03 = null;
    public AnonymousClass2gO A04 = null;
    public AutofillSharedJSBridgeProxy A05 = null;
    public C10377RrE A06;
    public STY A07;
    public S55 A08;
    public C11021S5u A09;
    public S0G A0A;
    public SJQ A0B;
    public AutofillData A0C;
    public AutofillSettings A0D;
    public RequestAutofillJSBridgeCall A0E;
    public RequestAutofillJSBridgeCall A0F = null;
    public Dc2 A0G;
    public DefaultVaultService A0H;
    public Long A0I = null;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public List A0O;
    public TreeSet A0P = null;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X = false;
    public boolean A0Y = false;
    public final C11252SHm A0Z;
    public final S5W A0a;
    public final C270254gR A0b;
    public final S0F A0c;
    public final UserSession A0d;
    public final String A0e;
    public final Map A0f;
    public final Map A0g;
    public final Map A0h;
    public final Map A0i;
    public final Map A0j = AnonymousClass7TE.A1E();

    public static void A01(C7580QKv qKv, QLA qla) {
        C7580QKv qKv2 = qKv;
        C270254gR r1 = qKv.A0b;
        C11288SJh sJh = r1.A02;
        boolean z = false;
        Integer A002 = sJh.A00((Long) null, 772803659, 0);
        QLA qla2 = qla;
        String A022 = C11429STt.A02(qla.A07(0));
        String A023 = C11429STt.A02(qla.A05());
        if (!TextUtils.isEmpty(A022) && !TextUtils.isEmpty(A023)) {
            Set set = (Set) r1.A00.A0I.A00;
            if (!set.contains(A022) && !set.contains(A023)) {
                qKv2.A0X = false;
                Intent intent = qKv2.A01;
                if (intent != null) {
                    z = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false);
                }
                Map map = qKv2.A0i;
                Boolean bool = (Boolean) map.get(A023);
                if (bool != null) {
                    if (z) {
                        Toast.makeText(qKv2.A00, 002.A1D("Autofill Opt Out: ", bool.booleanValue()), 0).show();
                    }
                    if (!bool.booleanValue()) {
                        qKv2.A0E(qla);
                    }
                } else {
                    SRY A003 = SRY.A00();
                    AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = new AutofillController$InstagramAutofillOptOutCallbackHandler(qKv2.A00, qKv2, qla2, map, z);
                    BrowserLiteCallback browserLiteCallback = A003.A06;
                    if (browserLiteCallback != null) {
                        try {
                            browserLiteCallback.Cx9(autofillController$InstagramAutofillOptOutCallbackHandler, A023);
                        } catch (RemoteException e) {
                            0KC.A0J("BrowserLiteCallbacker", "Error in onAutofillOptOutCall", e);
                        }
                    }
                }
                sJh.A01(A002, (Long) null, 772803659);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.RRP, java.lang.Object] */
    public final void A06() {
        this.A0R = false;
        BrowserLiteCallback browserLiteCallback = SRY.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.EWJ();
            } catch (RemoteException e) {
                0KC.A0J("BrowserLiteCallbacker", "Error in setHasShownFbPayDisclosure", e);
            }
        }
        C270254gR r3 = this.A0b;
        String str = r3.A00.A0P.A02;
        AnonymousClass7TG.A1N("FBPAY_DISCLOSURE_SHOWN", str);
        ? obj = new Object();
        obj.A0I = "FBPAY_DISCLOSURE_SHOWN";
        obj.A0B = str;
        SUR.A0B(r3, this, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
    public final void A08(Bundle bundle, AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, AutofillData autofillData, Integer num) {
        ? browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(this.A00, AnonymousClass7TE.A0a(), bundle, "_AutofillExtensions", "requestAutoFill", "");
        this.A0E = browserLiteJSBridgeCall;
        AutofillController$5 autofillController$5 = new AutofillController$5(autofillSharedJSBridgeProxy, this, autofillData, browserLiteJSBridgeCall, num);
        SRY A002 = SRY.A00();
        SRY.A02(new QJx(A002, (BrowserLiteJSBridgeCall) browserLiteJSBridgeCall, (BrowserLiteJSBridgeCallback) autofillController$5), A002, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        if (r5.A00.A04.A0A(false) == false) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.0SM r15, X.RRP r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            r14 = this;
            r8 = r15
            X.4gR r7 = r14.A0b
            X.RzL r4 = r7.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r1 = 3
            X.JwM r0 = new X.JwM
            r11 = r18
            r0.<init>((java.lang.Integer) r5, (java.lang.Integer) r11, (java.lang.Integer) r5, (int) r1)
            boolean r0 = X.S8I.A01(r4, r0)
            r10 = r17
            if (r0 == 0) goto L_0x002d
            boolean r0 = r15 instanceof X.QKJ
            if (r0 == 0) goto L_0x002d
            X.SJh r3 = r7.A02
            r2 = 772805755(0x2e10147b, float:3.276E-11)
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            r3.A03(r10, r1, r0, r2)
            r0 = 0
            r3.A01(r10, r0, r2)
        L_0x002c:
            return
        L_0x002d:
            boolean r0 = r14.A0Q
            r9 = r16
            r12 = r19
            if (r0 == 0) goto L_0x0092
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x0092
            X.JV5 r0 = r4.A0J
            java.lang.Object r3 = r0.A00
            X.RF6 r0 = X.RF6.OPT_IN
            if (r3 != r0) goto L_0x0092
            X.STY r0 = r14.A07
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x0092
            boolean r0 = r15 instanceof X.QKG
            if (r0 != 0) goto L_0x0092
            boolean r0 = r15 instanceof X.QKK
            if (r0 != 0) goto L_0x0092
            boolean r0 = r15 instanceof X.QKE
            if (r0 != 0) goto L_0x0092
            r13 = 0
            boolean r0 = r15 instanceof X.QC2
            if (r0 != 0) goto L_0x006d
            X.SJh r3 = r7.A02
            r2 = 772805755(0x2e10147b, float:3.276E-11)
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            r3.A03(r10, r1, r0, r2)
            r3.A01(r10, r13, r2)
            return
        L_0x006d:
            X.SHm r5 = r14.A0Z
            if (r5 == 0) goto L_0x002c
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            X.QC2 r8 = (X.QC2) r8
            android.content.Context r4 = r14.A00
            if (r0 == 0) goto L_0x0149
            X.SJh r2 = r7.A02
            r0 = r5
            r1 = r4
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r0.A01(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0092:
            boolean r0 = r15 instanceof X.QC2
            if (r0 == 0) goto L_0x00a0
            r3 = r8
            X.QC2 r3 = (X.QC2) r3
            X.SlH r0 = new X.SlH
            r0.<init>(r14, r10)
            r3.A00 = r0
        L_0x00a0:
            X.0SM r0 = r14.A03
            if (r0 == 0) goto L_0x00b7
            android.app.Dialog r0 = r0.A01
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x00b7
            X.0SM r3 = r14.A03
            boolean r0 = r3.mRemoving
            if (r0 != 0) goto L_0x00b7
            r3.A07()
        L_0x00b7:
            r14.A03 = r15
            android.content.Context r3 = r14.A00
            if (r3 == 0) goto L_0x00d3
            java.lang.String r0 = "input_method"
            java.lang.Object r6 = r3.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r6 = (android.view.inputmethod.InputMethodManager) r6
            android.view.View r0 = r14.A02
            if (r6 == 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00d3
            android.os.IBinder r3 = r0.getWindowToken()
            r0 = 0
            r6.hideSoftInputFromWindow(r3, r0)
        L_0x00d3:
            X.7ka r0 = r14.A03
            if (r0 == 0) goto L_0x002c
            X.0SM r3 = r14.A03
            boolean r0 = r3 instanceof X.QKJ
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r3 instanceof X.QKE
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r3 instanceof X.QKC
            if (r0 == 0) goto L_0x00f4
        L_0x00e5:
            X.JwM r3 = new X.JwM
            r3.<init>((java.lang.Integer) r5, (java.lang.Integer) r11, (java.lang.Integer) r5, (int) r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.JVf r0 = new X.JVf
            r0.<init>((X.C61084JwM) r3, (java.lang.Integer) r1)
            X.RUI.A00(r4, r0)
        L_0x00f4:
            X.S5u r5 = r14.A09
            X.0SM r0 = r14.A03
            boolean r0 = r0 instanceof X.QKC
            if (r0 == 0) goto L_0x010b
            if (r5 == 0) goto L_0x010b
            boolean r0 = r5.A02()
            if (r0 == 0) goto L_0x010b
            r14.A0D(r9)
            r5.A00(r9)
            return
        L_0x010b:
            X.7ka r0 = r14.A03
            X.0hq r1 = r0.getParentFragmentManager()
            X.0SM r0 = r14.A03
            r0.A0B(r1, r12)
            if (r16 == 0) goto L_0x002c
            X.0SM r0 = r14.A03
            boolean r0 = r0 instanceof X.QKC
            if (r0 == 0) goto L_0x0145
            if (r5 == 0) goto L_0x0145
            java.lang.String r4 = "shown_automatic_autofill_consent"
            r3 = 0
            com.instagram.common.session.UserSession r0 = r5.A01
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "contact_autofill_eligible_for_automatic_autofill"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x013d
            X.4gR r0 = r5.A00
            X.1yd r0 = r0.A04
            boolean r1 = r0.A0A(r3)
            r0 = 1
            if (r1 != 0) goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.A01(r4, r0)
        L_0x0145:
            X.SUR.A0B(r7, r14, r9)
            return
        L_0x0149:
            X.SJh r6 = r7.A02
            X.TKm r3 = new X.TKm
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.SB5.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7580QKv.A09(X.0SM, X.RRP, java.lang.Integer, java.lang.Integer, java.lang.String):void");
    }

    public C7580QKv(C270254gR r5, S0G s0g, SJQ sjq, UserSession userSession, DefaultVaultService defaultVaultService, Map map) {
        S0F s0f = new S0F(0wj.A01);
        this.A0b = r5;
        this.A0A = s0g;
        this.A0B = sjq;
        this.A0i = new ConcurrentHashMap(map);
        this.A0f = AnonymousClass7TE.A1E();
        this.A0g = AnonymousClass7TE.A1E();
        this.A0h = AnonymousClass7TE.A1E();
        this.A0Z = new C11252SHm(C51965G9l.A0v(this));
        this.A0e = AnonymousClass7TF.A0c();
        this.A0a = new S5W(r5, C51965G9l.A0v(this));
        this.A0H = defaultVaultService;
        this.A0c = s0f;
        this.A0d = userSession;
    }

    public static AnonymousClass3M8 A00(C7580QKv qKv) {
        FragmentActivity activity;
        C340027ka r0 = qKv.A03;
        if (r0 == null || (activity = r0.getActivity()) == null || ((BrowserLiteFragment) r0).A0C == null) {
            return null;
        }
        ViewStub viewStub = new ViewStub(activity);
        viewStub.setLayoutResource(R.layout.layout_autofill_snack_bar);
        ((BrowserLiteFragment) qKv.A03).A0C.addView(viewStub);
        return new AnonymousClass3M8(viewStub, false);
    }

    public final Bundle A02() {
        Intent intent = this.A01;
        if (intent != null) {
            return intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        }
        return null;
    }

    public final AnonymousClass07Z A03() {
        C340037kb r1 = this.A04;
        if (r1 instanceof AnonymousClass07Z) {
            return (AnonymousClass07Z) r1;
        }
        SUR.A0A(A02(), this.A0b, this.A0a.A00("NULL_LIFE_CYCLE_OWNER", false).A00());
        return null;
    }

    public final void A07(Context context, RRP rrp, Integer num, Integer num2, String str, List list) {
        C11252SHm sHm = this.A0Z;
        if (sHm != null) {
            Context context2 = context;
            RRP rrp2 = rrp;
            Integer num3 = num;
            Integer num4 = num2;
            String str2 = str;
            List list2 = list;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C270254gR r0 = this.A0b;
                sHm.A01(context2, r0.A02, r0, (QC2) null, rrp2, num3, num4, str2, list2);
                return;
            }
            C270254gR r6 = this.A0b;
            SB5.A00(new C13080TKm(context2, sHm, r6.A02, r6, (QC2) null, rrp2, num3, num4, str2, list2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e0, code lost:
        if (r5 != false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r24, com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r25, java.lang.Integer r26, java.util.List r27) {
        /*
            r23 = this;
            r10 = r23
            r11 = r27
            r10.A0O = r11
            X.4gR r12 = r10.A0b
            X.SJh r8 = r12.A02
            r7 = 772805755(0x2e10147b, float:3.276E-11)
            java.lang.String r1 = "prompt_type"
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r9 = r26
            r8.A03(r9, r1, r0, r7)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A02
            long r5 = r5 - r0
            r3 = 0
            java.lang.String r4 = "NO_PROMPTED_AUTOFILL"
            java.lang.String r14 = "prompt_name"
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            r8.A03(r9, r14, r4, r7)
            r8.A01(r9, r3, r7)
            return
        L_0x0031:
            X.RzL r13 = r12.A00
            X.Jvc r6 = r13.A0P
            java.lang.String r2 = r6.A03
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = ""
        L_0x003b:
            java.util.Map r1 = r10.A0f
            boolean r0 = r10.A0X
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            r17 = r12
            r18 = r3
            r20 = r2
            r21 = r1
            r22 = r0
            java.lang.Integer r0 = X.RUG.A00(r17, r18, r19, r20, r21, r22)
            int r0 = r0.intValue()
            r5 = 1
            if (r0 == r5) goto L_0x0066
            X.S5W r3 = r10.A0a
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            X.QP6 r0 = r13.A06
            java.lang.String r1 = r0.A05
            android.os.Bundle r0 = r10.A02()
            r3.A02(r0, r2, r1)
            return
        L_0x0066:
            android.content.Context r0 = r10.A00
            r16 = r0
            r4 = 0
            java.lang.String r15 = "PROMPTED_AUTOFILL"
            int r0 = r11.size()
            int r0 = java.lang.Math.min(r5, r0)
            java.util.List r0 = r11.subList(r4, r0)
            java.util.Set r3 = X.S8J.A01(r0)
            r17 = r25
            java.util.LinkedHashSet r2 = r17.A01()
            java.lang.String r1 = "requestAutofillData"
            r0 = r17
            java.lang.Object r0 = X.Pxh.A0d(r0, r1)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
            if (r0 != 0) goto L_0x0153
            r0 = 0
        L_0x0091:
            java.lang.String r0 = X.SUR.A02(r0)
            r10.A0L = r0
            java.lang.String r0 = X.SUR.A02(r2)
            r10.A0N = r0
            int r0 = r11.size()
            int r0 = java.lang.Math.min(r5, r0)
            java.util.List r0 = r11.subList(r4, r0)
            java.lang.String r0 = X.SUR.A01(r0)
            r10.A0M = r0
            X.S5W r0 = r10.A0a
            X.RRP r0 = r0.A00(r15, r4)
            X.QP6 r1 = r13.A06
            java.lang.String r1 = r1.A05
            r0.A0G = r1
            java.lang.String r1 = r10.A0L
            r0.A06 = r1
            java.lang.String r1 = r10.A0N
            r0.A0F = r1
            java.lang.String r1 = r10.A0M
            r0.A07 = r1
            X.QP6 r1 = r13.A05
            java.lang.String r1 = r1.A06
            r0.A0A = r1
            int r1 = r11.size()
            r0.A00 = r1
            java.lang.String r1 = r6.A03
            r0.A08 = r1
            boolean r1 = r10.A0S
            boolean r5 = r10.A0H()
            if (r1 == 0) goto L_0x00e2
            r1 = 1
            if (r5 == 0) goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            r0.A0P = r1
            java.lang.Long r1 = r10.A0I
            r0.A04 = r1
            int r1 = r11.size()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "num_contact_entries"
            r0.A01(r1, r5)
            if (r2 == 0) goto L_0x011a
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x011a
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>(r2)
            r5.retainAll(r3)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x011a
            java.lang.String r1 = ", "
            java.lang.String r3 = X.C2612548w.A00(r1, r5)
            java.lang.String r1 = "fields_rendered_in_bottomsheet"
            r0.A01(r1, r3)
            r10.A0P = r5
        L_0x011a:
            r3 = r24
            r10.A05 = r3
            r1 = r17
            r10.A0F = r1
            if (r16 == 0) goto L_0x016a
            boolean r1 = r10.A0S
            if (r1 == 0) goto L_0x016a
            X.Ro4 r5 = r12.A03
            X.TPH r1 = new X.TPH
            r1.<init>((java.lang.Object) r10, (int) r4)
            boolean r1 = X.RUL.A00(r5, r1)
            if (r1 == 0) goto L_0x016a
            if (r2 == 0) goto L_0x0157
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r11.iterator()
        L_0x013f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = r3.next()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r1
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = X.C11368SPm.A00(r1, r2)
            r4.add(r1)
            goto L_0x013f
        L_0x0153:
            java.util.LinkedHashSet r0 = r0.A01
            goto L_0x0091
        L_0x0157:
            r4 = r11
        L_0x0158:
            java.lang.String r1 = "UsageBloksBottomSheetWithMerging"
            r8.A03(r9, r14, r1, r7)
            java.lang.String r20 = "BLOKS_CONTACT_USAGE"
            r21 = r4
            r17 = r0
            r18 = r9
            r15 = r10
            r15.A07(r16, r17, r18, r19, r20, r21)
            return
        L_0x016a:
            X.TKU r1 = new X.TKU
            r2 = r3
            r3 = r10
            r4 = r0
            r5 = r17
            r6 = r9
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.SB5.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7580QKv.A0A(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy, com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, java.lang.Integer, java.util.List):void");
    }

    public final void A0B(AutofillData autofillData) {
        QLA C8U;
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        C340037kb r0 = this.A04;
        if (r0 != null && (C8U = r0.C8U()) != null && autofillData != null && (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) this.A0j.get(C8U)) != null) {
            try {
                autofillSharedJSBridgeProxy.A0D(autofillSharedJSBridgeProxy.A0B(SUR.A09(autofillData)));
            } catch (JSONException unused) {
                throw AnonymousClass7TE.A0z("Illegal JSON for autofill save");
            }
        }
    }

    public final void A0C(AutofillData autofillData) {
        String str;
        Map map = this.A0f;
        C10860RzL rzL = this.A0b.A00;
        0qQ.A0B(rzL, 0);
        boolean z = true;
        JTP.A1R(C11429STt.A02(rzL.A0P.A03), map, AnonymousClass7TF.A1V(autofillData));
        C340037kb r0 = this.A04;
        if (r0 != null) {
            this.A0g.put(((BrowserLiteFragment) r0).A0l, autofillData);
        }
        if (autofillData == null) {
            z = false;
        }
        this.A0X = z;
        String str2 = null;
        if (autofillData != null) {
            str = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, autofillData.A00);
        } else {
            str = null;
        }
        this.A0K = str;
        if (autofillData != null) {
            str2 = DbT.A11("ent_id", autofillData.A00);
        }
        this.A0J = str2;
    }

    public final void A0D(RRP rrp) {
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall;
        C11021S5u s5u = this.A09;
        if (s5u != null) {
            List list = (List) s5u.A00.A00.A0B.A00;
            if (!list.isEmpty()) {
                Map A012 = S8L.A01((C61073JwB) AnonymousClass7TE.A13(list));
                if (!A012.isEmpty()) {
                    AutofillData autofillData = new AutofillData(A012);
                    WeakReference weakReference = s5u.A02;
                    C7580QKv A0Q2 = Pxe.A0Q(weakReference);
                    if (!(A0Q2 == null || A0Q2.A05 == null || (requestAutofillJSBridgeCall = A0Q2.A0F) == null)) {
                        A0Q2.A05.A0C(BusinessExtensionJSBridgeCall.A01((String) Pxh.A0d(requestAutofillJSBridgeCall, "callbackID"), autofillData.A01()), A0Q2.A0F);
                    }
                    C7580QKv A0Q3 = Pxe.A0Q(weakReference);
                    if (A0Q3 != null) {
                        A0Q3.A0C(autofillData);
                    }
                }
            }
            Context context = this.A00;
            AnonymousClass3M8 A002 = A00(this);
            if (context != null && A002 != null) {
                C310336ap r2 = new C310336ap();
                r2.A04();
                r2.A0D = context.getString(2131953406);
                r2.A06();
                r2.A0D(context.getString(2131953402));
                r2.A0A(new IVR(0, rrp, this));
                r2.A01();
                Dc2 A003 = r2.A00();
                A002.A06(80);
                A002.A0A(A003);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.1zE.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013b, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.QLA r15) {
        /*
            r14 = this;
            android.content.Intent r0 = r14.A01
            if (r0 == 0) goto L_0x01ac
            X.4gR r5 = r14.A0b
            X.RzL r0 = r5.A00
            X.JTb r6 = r0.A09
            boolean r7 = r6.A00
            android.content.Context r0 = r14.A00
            r3 = 1
            if (r0 == 0) goto L_0x00fe
            X.1yd r0 = r5.A04
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329788327084361(0x8111c000004149, double:3.0384426541392704E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            if (r0 == 0) goto L_0x00fe
            if (r7 != 0) goto L_0x01ac
            r6.A00 = r3
            android.content.Context r11 = r14.A00
            X.SJh r0 = r5.A02
            com.facebook.quicklog.QuickPerformanceLogger r8 = r0.A01
            X.S0F r0 = r14.A0c
            X.0fA r6 = r0.A00
            r13 = 2
            X.0qQ.A0B(r6, r13)
            X.0qQ.A0B(r11, r3)
            java.lang.String r4 = X.C9115RPn.A00
            int r0 = r4.length()
            if (r0 != 0) goto L_0x01a9
            java.lang.String r1 = "empty_content_read_from_file"
            java.lang.String r4 = ""
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            int r7 = r0.hashCode()
            r2 = 646459195(0x26882f3b, float:9.449698E-16)
            r8.markerStart(r2, r7)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.lang.String r10 = "file_name"
            java.lang.String r9 = "80a627fe78ffc546051fe99aeb5223c9874f0787.js"
            r8.markerAnnotate(r2, r7, r10, r9)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.lang.String r0 = "js_name"
            java.lang.String r5 = "autofill_contact_enhanced"
            r8.markerAnnotate(r2, r7, r0, r5)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.io.FileInputStream r11 = r11.openFileInput(r9)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            X.0qQ.A0A(r11)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            r12.<init>(r11, r0)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.lang.String r11 = X.1r9.A00(r12)     // Catch:{ all -> 0x009b }
            r12.close()     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            int r0 = r11.length()     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            if (r0 != 0) goto L_0x0096
            r8.markerPoint(r2, r7, r1)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            r0 = 3
            r8.markerEnd(r2, r7, r0)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            r0 = 646456808(0x268825e8, float:9.44717E-16)
            X.0f9 r1 = r6.AEf(r1, r0)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            java.lang.String r0 = "script_name"
            r1.ABQ(r0, r5)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            r1.ABQ(r10, r9)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            r1.report()     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            goto L_0x01a0
        L_0x0096:
            r8.markerEnd(r2, r7, r13)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            goto L_0x01a0
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.1zE.A00(r12, r1)     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
            throw r0     // Catch:{ FileNotFoundException -> 0x00c6, Exception -> 0x00a2 }
        L_0x00a2:
            r5 = move-exception
            java.lang.String r1 = "unknown error "
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L_0x00ad
            r0 = r4
        L_0x00ad:
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r0, r3)
            r8.markerPoint(r2, r7, r0)
            r0 = 3
            r8.markerEnd(r2, r7, r0)
            java.lang.String r3 = "autofill_contact_enhanced"
            java.lang.String r2 = "80a627fe78ffc546051fe99aeb5223c9874f0787.js"
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            goto L_0x00e4
        L_0x00c6:
            r5 = move-exception
            java.lang.String r1 = "file_not_found_exception "
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L_0x00d0
            r0 = r4
        L_0x00d0:
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r0, r3)
            r8.markerPoint(r2, r7, r0)
            r0 = 3
            r8.markerEnd(r2, r7, r0)
            java.lang.String r3 = "autofill_contact_enhanced"
            java.lang.String r2 = "80a627fe78ffc546051fe99aeb5223c9874f0787.js"
            java.lang.String r1 = "file_not_found_exception"
        L_0x00e4:
            r0 = 646456808(0x268825e8, float:9.44717E-16)
            X.0f9 r1 = r6.AEf(r1, r0)
            r1.ERJ(r5)
            java.lang.String r0 = "script_name"
            r1.ABQ(r0, r3)
            java.lang.String r0 = "file_name"
            r1.ABQ(r0, r2)
            r1.report()
            goto L_0x01a1
        L_0x00fe:
            if (r7 == 0) goto L_0x0112
            X.1yd r0 = r5.A04
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322860551907966(0x810b73006c2a7e, double:3.0340615012218066E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            if (r0 == 0) goto L_0x0112
            return
        L_0x0112:
            r6.A00 = r3
            X.1yd r0 = r5.A04
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322860545354284(0x810b7300082a2c, double:3.034061497077232E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0127:
            com.instagram.common.session.UserSession r0 = r14.A0d
            X.0xa r2 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r1 = "internal_autofill_js_od_override"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            if (r2 == 0) goto L_0x013d
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r0 = 1
            if (r1 == 0) goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            boolean r0 = X.C66581MXm.A1a(r0)
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = "beta"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x017e
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x014e:
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x0161;
                case 1: goto L_0x0164;
                case 2: goto L_0x0167;
                case 3: goto L_0x016a;
                case 4: goto L_0x016d;
                case 5: goto L_0x017b;
                default: goto L_0x0155;
            }
        L_0x0155:
            java.lang.String r1 = "//connect.facebook.net/en_US/iab.autofill.test.enhanced.js"
        L_0x0157:
            java.lang.String r0 = "(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id)) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'instagram-autofill-sdk'));"
            java.lang.String r4 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            X.0qQ.A07(r4)
            goto L_0x01a9
        L_0x0161:
            java.lang.String r1 = "//connect.facebook.net/en_US/iab.autofill.payment.enhanced.v2.js"
            goto L_0x0157
        L_0x0164:
            java.lang.String r1 = "//connect.facebook.net/en_US/iab.autofill.enhanced.js"
            goto L_0x0157
        L_0x0167:
            java.lang.String r1 = "//connect.facebook.net/en_US/contact.iab.autofill.qrt.js"
            goto L_0x0157
        L_0x016a:
            java.lang.String r1 = "//connect.facebook.net/en_US/iab.autofill.beta.enhanced.js"
            goto L_0x0157
        L_0x016d:
            java.lang.Object[] r1 = X.C66581MXm.A1b(r2, r3)
            java.lang.String r0 = "//connect.%s.od.facebook.net/en_US/iab.autofill.enhanced.js"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r1)
            goto L_0x0157
        L_0x017b:
            java.lang.String r1 = "//connect.facebook.net/en_US/iab.autofill.test.nonce.enhanced.js"
            goto L_0x0157
        L_0x017e:
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            goto L_0x014e
        L_0x0181:
            r0 = 36322860551907966(0x810b73006c2a7e, double:3.0340615012218066E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            if (r0 == 0) goto L_0x018f
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            goto L_0x0127
        L_0x018f:
            r0 = 36322860551711355(0x810b7300692a7b, double:3.034061501097469E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            if (r0 == 0) goto L_0x019d
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            goto L_0x0127
        L_0x019d:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0127
        L_0x01a0:
            r4 = r11
        L_0x01a1:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x01a9
            X.C9115RPn.A00 = r4
        L_0x01a9:
            r15.A0F(r4)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7580QKv.A0E(X.QLA):void");
    }

    public final void A0F(QLA qla) {
        Context context = this.A00;
        if (context != null) {
            C59689JTv.A03(context, context.getString(2131972527), (String) null, 5000);
            if (A0I()) {
                AnonymousClass7TF.A0D().postDelayed(new TFW(this, qla), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final void A0G(QLA qla) {
        Context context = this.A00;
        if (context != null) {
            C59689JTv.A03(context, context.getString(2131972576), (String) null, 5000);
            if (A0I()) {
                AnonymousClass7TF.A0D().postDelayed(new TFW(this, qla), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final boolean A0H() {
        1Av A002 = 1Au.A00(this.A0d);
        return AnonymousClass7TG.A1a(A002, A002.A0M, 1Av.A8a, 165);
    }

    public final boolean A0I() {
        if (this.A07 != null) {
            C10860RzL rzL = this.A0b.A00;
            if (!rzL.A0P.A04 || !rzL.A0H.A00.equals(AnonymousClass05K.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        if (!this.A0R || AnonymousClass7TE.A0q(this.A0d).getBoolean("browser_autofill_fbpay_disclosure_shown", true)) {
            return false;
        }
        return true;
    }

    public final boolean A0K(String str) {
        Boolean bool;
        if (str == null) {
            return true;
        }
        Map map = this.A0i;
        0qQ.A0B(map, 1);
        String A022 = C11429STt.A02(str);
        if (A022 == null || (bool = (Boolean) map.get(A022)) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean A0L(boolean z) {
        0Tu r2;
        UserSession userSession = this.A0d;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        return 182.A06(r2, userSession, 36310430914379879L);
    }

    public final void destroy() {
        this.A0j.clear();
        super.destroy();
    }

    public final C10996S4q A04(boolean z, boolean z2) {
        boolean A0H2 = A0H();
        C10860RzL rzL = this.A0b.A00;
        0qQ.A0B(rzL, 0);
        JV5 jv5 = rzL.A0J;
        Object obj = jv5.A03;
        RF6 rf6 = RF6.OPT_IN;
        return new C10996S4q(A0H2, AnonymousClass7TF.A1W(obj, rf6), AnonymousClass7TF.A1W(jv5.A00, rf6), z2, z);
    }

    public final void A05() {
        if (A02() != null && this.A00 != null) {
            Bundle A022 = A02();
            AnonymousClass6W8.A06(this.A00, A022, ModalActivity.class, "browser_settings");
            if (this.A04 != null) {
                S5W s5w = this.A0a;
                String str = this.A0b.A00.A0P.A03;
                Bundle A023 = A02();
                RRP A002 = s5w.A00("CLICK_BROWSER_SETTING_FROM_TOAST", false);
                A002.A08 = str;
                SRY.A00().A07(A023, A002.A00().A01());
            }
        }
    }
}
