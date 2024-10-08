package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$6;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.meta.vault.service.base.DefaultVaultService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class STY {
    public int A00 = 0;
    public AnonymousClass2gO A01 = null;
    public AnonymousClass2gO A02 = null;
    public Q8n A03;
    public C7580QKv A04;
    public S0G A05;
    public SJQ A06;
    public QLA A07;
    public AnonymousClass0JP A08 = AnonymousClass0Gt.A00;
    public S33 A09;
    public 2Fg A0A;
    public UserSession A0B;
    public DefaultVaultService A0C;
    public Integer A0D;
    public Long A0E;
    public List A0F;
    public Map A0G;
    public Map A0H;
    public Map A0I;
    public Map A0J;
    public Set A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S;
    public final C270254gR A0T;
    public final S0F A0U;
    public final Map A0V;
    public final Map A0W;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(int r28, android.content.Intent r29) {
        /*
            r27 = this;
            r3 = 0
            r6 = 0
            r13 = r29
            if (r29 == 0) goto L_0x0078
            java.lang.String r1 = "qplInstanceKey"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x0078
            int r0 = r13.getIntExtra(r1, r3)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r12 = r27
            X.4gR r10 = r12.A0T
            X.SJh r9 = r10.A02
            X.0JR r19 = X.C11288SJh.A02
            long r0 = r19.now()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r8 = 772810340(0x2e102664, float:3.2775907E-11)
            java.lang.String r0 = "requestSecurityCodeValidationOnResult"
            r9.A02(r11, r1, r0, r8)
            r7 = 33
            if (r29 == 0) goto L_0x004b
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "timeInMsDemaskFragmentActivityCreated"
            if (r0 < r7) goto L_0x0071
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Object r1 = r13.getParcelableExtra(r1, r0)
            java.lang.Long r1 = (java.lang.Long) r1
        L_0x0043:
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "timeInMsDemaskCardFragmentActivityCreated"
            r9.A02(r11, r1, r0, r8)
        L_0x004b:
            java.lang.String r14 = "SUBMITTED_CVV_VERIFICATION"
            if (r29 == 0) goto L_0x0087
            java.lang.String r1 = "numberOfCVVFailures"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x007a
            int r2 = r13.getIntExtra(r1, r3)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "NumberOfCVVFailures"
            r9.A03(r11, r0, r1, r8)
        L_0x0065:
            if (r3 >= r2) goto L_0x007a
            X.RRP r0 = r12.A06(r14)
            X.SUR.A0C(r10, r12, r0)
            int r3 = r3 + 1
            goto L_0x0065
        L_0x0071:
            android.os.Parcelable r1 = r13.getParcelableExtra(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            goto L_0x0043
        L_0x0078:
            r11 = r6
            goto L_0x0017
        L_0x007a:
            java.lang.String r1 = "cvvFailures"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x0087
            java.lang.String r3 = r13.getStringExtra(r1)
            goto L_0x0088
        L_0x0087:
            r3 = r6
        L_0x0088:
            java.lang.String r2 = "FAILED_CVV_VERIFICATION_ERRORS"
            java.lang.String r4 = "CVVValidationResultEventName"
            if (r29 == 0) goto L_0x00cc
            java.lang.String r0 = "keyResultError"
            boolean r0 = r13.hasExtra(r0)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r5 = "FAILED_CVV_VERIFICATION"
            X.RRP r1 = r12.A06(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00a8
            r3.getClass()
            r1.A01(r2, r3)
        L_0x00a8:
            X.SUR.A0C(r10, r12, r1)
            r9.A03(r11, r4, r5, r8)
        L_0x00ae:
            long r0 = r19.now()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A01(r11, r0, r8)
            return
        L_0x00ba:
            java.lang.String r1 = "keyResultEventName"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r13.getStringExtra(r1)
            if (r0 == 0) goto L_0x00cd
            r9.A03(r11, r4, r0, r8)
            goto L_0x00cd
        L_0x00cc:
            r0 = r6
        L_0x00cd:
            r1 = -1
            r4 = r28
            if (r4 != r1) goto L_0x01b3
            if (r29 == 0) goto L_0x0176
            java.lang.String r1 = "keyResultCardDetails"
            android.os.Parcelable r6 = r13.getParcelableExtra(r1)
            com.fbpay.w3c.CardDetails r6 = (com.fbpay.w3c.CardDetails) r6
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "timeElapsedInMs"
            if (r5 < r7) goto L_0x01ad
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Object r1 = r13.getParcelableExtra(r2, r1)
        L_0x00e9:
            java.lang.Number r1 = (java.lang.Number) r1
            r24 = -999(0xfffffffffffffc19, double:NaN)
            if (r1 != 0) goto L_0x01a7
            r3 = -999(0xfffffffffffffc19, double:NaN)
        L_0x00f1:
            java.lang.String r1 = "additionalTimeElapsedInMs"
            if (r5 < r7) goto L_0x01a1
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r1 = r13.getParcelableExtra(r1, r2)
        L_0x00fb:
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0103
            long r24 = r1.longValue()
        L_0x0103:
            java.lang.String r2 = "timeInMsDemaskCardEnd"
            java.lang.String r1 = "timeInMsDemaskCardStart"
            if (r5 < r7) goto L_0x0195
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.Object r1 = r13.getParcelableExtra(r1, r5)
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r5 = r13.getParcelableExtra(r2, r5)
        L_0x0117:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r1 == 0) goto L_0x013b
            if (r5 == 0) goto L_0x013b
            long r15 = r1.longValue()
            r17 = -1
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x013b
            long r15 = r5.longValue()
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x013b
            java.lang.String r2 = "timeInMsConfirmAndDemaskCardStart"
            r9.A02(r11, r1, r2, r8)
            java.lang.String r1 = "timeInMsConfirmAndDemaskCardEnd"
            r9.A02(r11, r5, r1, r8)
        L_0x013b:
            r26 = 0
            X.RRP r1 = r12.A06(r14)
            X.SHz r5 = r1.A00()
            X.QKv r1 = r12.A04
            android.os.Bundle r2 = r1.A02()
            X.SUR.A0A(r2, r10, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0156
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
        L_0x0156:
            r21 = r0
            r22 = r3
            r20 = r12
            X.RRP r5 = r20.A07(r21, r22, r24, r26)
            if (r6 == 0) goto L_0x0173
            X.RzL r0 = r10.A00
            X.QP6 r2 = r0.A05
            X.QOp r0 = X.RUT.A00(r6)
            r2.A01 = r0
            java.lang.String r0 = r6.A08
            r5.A0E = r0
            int r0 = (int) r3
            r5.A01 = r0
        L_0x0173:
            X.SUR.A0B(r10, r1, r5)
        L_0x0176:
            long r0 = r19.now()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "fillContactAndPaymentDataStart"
            r9.A02(r11, r1, r0, r8)
            A03(r12, r6)
            long r0 = r19.now()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "fillContactAndPaymentDataEnd"
            r9.A02(r11, r1, r0, r8)
            goto L_0x00ae
        L_0x0195:
            android.os.Parcelable r1 = r13.getParcelableExtra(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            android.os.Parcelable r5 = r13.getParcelableExtra(r2)
            goto L_0x0117
        L_0x01a1:
            android.os.Parcelable r1 = r13.getParcelableExtra(r1)
            goto L_0x00fb
        L_0x01a7:
            long r3 = r1.longValue()
            goto L_0x00f1
        L_0x01ad:
            android.os.Parcelable r1 = r13.getParcelableExtra(r2)
            goto L_0x00e9
        L_0x01b3:
            if (r28 != 0) goto L_0x0176
            X.RzL r1 = r10.A00
            X.JwM r4 = r1.A0L
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r4.A00 = r1
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x01c5
            java.lang.String r0 = "CANCELED_CVV_VERIFICATION"
        L_0x01c5:
            X.RRP r1 = r12.A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01d5
            r3.getClass()
            r1.A01(r2, r3)
        L_0x01d5:
            X.SUR.A0C(r10, r12, r1)
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A0A(int, android.content.Intent):void");
    }

    public STY(C270254gR r5, C7580QKv qKv, S0G s0g, SJQ sjq, UserSession userSession, DefaultVaultService defaultVaultService) {
        S0F s0f = new S0F(0wj.A01);
        this.A04 = qKv;
        this.A0V = AnonymousClass7TE.A1E();
        this.A0W = AnonymousClass7TE.A1E();
        this.A0S = false;
        this.A0G = AnonymousClass7TE.A1E();
        this.A0N = false;
        this.A0E = null;
        this.A0K = AnonymousClass7TE.A1F();
        this.A0M = false;
        this.A0I = AnonymousClass7TE.A1E();
        this.A0J = AnonymousClass7TE.A1E();
        this.A0H = AnonymousClass7TE.A1E();
        this.A0F = AnonymousClass7TE.A1C();
        this.A0D = AnonymousClass05K.A0C;
        this.A0U = s0f;
        this.A0T = r5;
        this.A06 = sjq;
        this.A05 = s0g;
        this.A0C = defaultVaultService;
        this.A0B = userSession;
        r5.A00.A01 = new C61080JwI((Object) C56316HwT.A01(userSession), 1);
    }

    public static AnonymousClass07Z A00(STY sty) {
        C7580QKv qKv = sty.A04;
        C340037kb r1 = qKv.A04;
        if (r1 instanceof AnonymousClass07Z) {
            return (AnonymousClass07Z) r1;
        }
        SUR.A0A(qKv.A02(), sty.A0T, sty.A06("NULL_LIFE_CYCLE_OWNER").A00());
        return null;
    }

    public static void A01(STY sty) {
        Object obj;
        C270254gR r5 = sty.A0T;
        C10860RzL rzL = r5.A00;
        C61084JwM jwM = rzL.A0L;
        Object obj2 = jwM.A00;
        Integer num = AnonymousClass05K.A0N;
        if (obj2 == num && (obj = jwM.A02) != AnonymousClass05K.A0C && obj != num && C11392SRg.A04(rzL)) {
            if ("PERSISTENT".equals(Pxe.A0w(0Tu.A05, r5.A04.A00, 36885810498634400L))) {
                jwM.A02 = AnonymousClass05K.A01;
                C7580QKv qKv = sty.A04;
                S55 s55 = qKv.A08;
                if (s55 != null && qKv.A07 != null) {
                    s55.A01();
                    return;
                }
                return;
            }
        }
        S55 s552 = sty.A04.A08;
        if (s552 != null) {
            s552.A00();
        }
    }

    public static void A02(STY sty, SGp sGp) {
        AutofillData autofillData;
        SGp sGp2;
        Integer num;
        C10860RzL rzL = sty.A0T.A00;
        String str = rzL.A0P.A03;
        String A022 = C11429STt.A02(str);
        if (str != null && A022 != null) {
            if (sGp != null) {
                autofillData = sGp.A00;
                if (sGp.A01 == null) {
                    if (autofillData != null) {
                        num = AnonymousClass05K.A00;
                    }
                } else if (autofillData != null) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A01;
                }
                Integer num2 = AnonymousClass05K.A00;
                RUI.A00(rzL, new C59721JVf(new C61084JwM(num2, num, num2, 3), AnonymousClass05K.A0C));
            } else {
                autofillData = null;
            }
            boolean z = true;
            JTP.A1R(A022, sty.A0V, AnonymousClass7TF.A1V(sGp));
            Map map = sty.A0W;
            if (autofillData == null) {
                sGp2 = null;
            } else {
                sGp2 = new SGp(autofillData, (CardDetails) null);
            }
            map.put(str, sGp2);
            if (sGp == null) {
                z = false;
            }
            sty.A0S = z;
        }
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.STY r13, com.fbpay.w3c.CardDetails r14) {
        /*
            java.util.Map r1 = r13.A0W
            X.4gR r4 = r13.A0T
            X.RzL r3 = r4.A00
            X.Jvc r0 = r3.A0P
            java.lang.String r0 = r0.A03
            java.lang.Object r1 = r1.get(r0)
            X.SGp r1 = (X.SGp) r1
            X.QLA r0 = r13.A07
            if (r0 == 0) goto L_0x0097
            if (r1 == 0) goto L_0x01fc
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r5 = r1.A00
            if (r5 == 0) goto L_0x01fc
            X.QP6 r0 = r3.A06
            java.lang.Object r0 = r0.A03
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r2 = X.RUN.A00(r0)
            r1 = 1
            X.1yd r0 = r4.A04
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = X.S8K.A00(r0, r5, r2, r1)
            if (r0 != 0) goto L_0x015d
        L_0x002d:
            if (r14 != 0) goto L_0x015d
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
        L_0x0033:
            X.Q8n r1 = r13.A03
            java.util.Set r0 = X.SDK.A07
            java.util.Set r8 = X.SDK.A0A
            X.1yd r7 = r4.A04
            android.util.SparseArray r6 = X.SL8.A00(r1, r7, r2, r0, r8)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006c
            java.util.Set r0 = r2.keySet()
            java.lang.String r1 = r0.toString()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "autofill_tags"
            r5.put(r0, r1)
            android.content.Context r0 = r3.A0Q
            java.lang.String r1 = X.C11234SGu.A00(r0)
            java.lang.String r0 = "family_device_id"
            r5.put(r0, r1)
            java.lang.String r0 = "AUTOFILL_APPLY_INIT"
            X.RRP r0 = r13.A06(r0)
            r0.A0K = r5
            X.SUR.A0C(r4, r13, r0)
        L_0x006c:
            X.QLA r0 = r13.A07
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.autofill(r6)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0092
            X.QLA r0 = r13.A07
            if (r0 == 0) goto L_0x0092
            java.lang.String r1 = X.C11392SRg.A02(r3)
            java.lang.String r0 = "CONTACT_AUTOFILL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0098
            X.S0F r1 = r13.A0U
            java.lang.String r0 = "Contact autofill happening using Android Framework"
            r1.A00(r0)
        L_0x0092:
            java.util.Map r0 = r13.A0G
            r0.putAll(r2)
        L_0x0097:
            return
        L_0x0098:
            java.util.Set r12 = r2.keySet()
            X.QLA r9 = r13.A07
            X.QKv r6 = r13.A04
            X.Q8n r0 = r9.A04()
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            java.util.List r0 = r0.A0A
            java.util.Iterator r11 = X.JTQ.A0h(r0)
        L_0x00ae:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r10 = r11.next()
            X.Q8n r10 = (X.Q8n) r10
            android.view.autofill.AutofillValue r1 = r10.A04
            r0 = 0
            java.lang.String r3 = X.SB2.A00(r10, r7, r8, r0)
            if (r3 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.isText()
            if (r0 == 0) goto L_0x00d9
            java.lang.CharSequence r0 = r1.getTextValue()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d9
        L_0x00d5:
            r5.add(r3)
            goto L_0x00ae
        L_0x00d9:
            boolean r0 = r1.isList()
            if (r0 == 0) goto L_0x00ae
            int r1 = r1.getListValue()
            java.lang.CharSequence[] r0 = r10.A08
            if (r0 == 0) goto L_0x00d5
            int r0 = r0.length
            if (r1 < r0) goto L_0x00ae
            goto L_0x00d5
        L_0x00eb:
            X.Q8n r0 = r9.A04()
            java.util.LinkedHashMap r8 = X.SL8.A01(r0, r7, r8)
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "DETECTION_SOURCE"
            r0 = 3157(0xc55, float:4.424E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.put(r1, r0)
            java.util.Iterator r9 = r12.iterator()
        L_0x0106:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r3 = r9.next()
            boolean r0 = r5.contains(r3)
            if (r0 == 0) goto L_0x012d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0118:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x012a
            java.lang.String r1 = "FILLED"
        L_0x0120:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            r7.put(r3, r0)
            goto L_0x0106
        L_0x012a:
            java.lang.String r1 = "NOT_FILLED"
            goto L_0x0120
        L_0x012d:
            boolean r0 = r8.containsKey(r3)
            if (r0 == 0) goto L_0x0106
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0118
        L_0x0136:
            java.lang.String r5 = "AUTOFILL_APPLY_COMPLETED"
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            X.R1j r0 = new X.R1j
            r0.<init>(r13)
            java.lang.reflect.Type r0 = r0.A00
            java.lang.String r1 = r1.A0C(r7, r0)
            java.lang.String r0 = "autofill_applied_statuses"
            r3.put(r0, r1)
            X.RRP r0 = r13.A06(r5)
            r0.A02(r3)
            X.SUR.A0B(r4, r6, r0)
            goto L_0x0092
        L_0x015d:
            X.SGp r1 = new X.SGp
            r1.<init>(r0, r14)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r0 = r1.A01()
            r2.putAll(r0)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            com.fbpay.w3c.CardDetails r8 = r1.A01
            if (r8 == 0) goto L_0x01e1
            java.lang.String r1 = r8.A07
            if (r1 == 0) goto L_0x017e
            java.lang.String r0 = "cc-number"
            r6.put(r0, r1)
        L_0x017e:
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()
            java.lang.Integer r0 = r8.A03
            if (r0 == 0) goto L_0x01a5
            int r0 = r0.intValue()
            java.util.Locale r5 = java.util.Locale.US
            r1 = 1
            int r0 = r0 % 100
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "%02d"
            java.lang.String r1 = X.Pxe.A12(r5, r0, r1)
            java.lang.String r0 = "cc-exp-month"
            r6.put(r0, r1)
            r7.append(r1)
        L_0x01a5:
            java.lang.Integer r8 = r8.A04
            if (r8 == 0) goto L_0x01d1
            int r0 = r8.intValue()
            java.util.Locale r5 = java.util.Locale.US
            r1 = 1
            int r0 = r0 % 100
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "%02d"
            java.lang.String r5 = X.Pxe.A12(r5, r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "cc-exp-year"
            r6.put(r0, r1)
            r0 = 47
            r7.append(r0)
            r7.append(r5)
        L_0x01d1:
            int r1 = r7.length()
            r0 = 5
            if (r1 != r0) goto L_0x01e1
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "cc-exp"
            r6.put(r0, r1)
        L_0x01e1:
            r2.putAll(r6)
            if (r14 == 0) goto L_0x0033
            X.JwM r1 = r3.A0L
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A01 = r0
            java.lang.String r1 = r14.A07
            java.lang.String r0 = "cc-number"
            r2.put(r0, r1)
            java.lang.String r1 = r14.A09
            java.lang.String r0 = "cc-csc"
            r2.put(r0, r1)
            goto L_0x0033
        L_0x01fc:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A03(X.STY, com.fbpay.w3c.CardDetails):void");
    }

    public static void A04(STY sty, Boolean bool, List list) {
        String str;
        Fragment fragment;
        Bundle A0a;
        List list2 = list;
        STY sty2 = sty;
        C7580QKv qKv = sty.A04;
        Activity activity = (Activity) qKv.A00;
        if (sty.A0A != null && activity != null) {
            C270254gR r3 = sty.A0T;
            C11288SJh sJh = r3.A02;
            AnonymousClass0JR r11 = C11288SJh.A02;
            Integer A002 = sJh.A00(Long.valueOf(r11.now()), 772810340, 0);
            sJh.A02(A002, Long.valueOf(r11.now()), "requestSecurityCodeValidationForResult", 772810340);
            if (DbY.A1Z(0Tu.A05, r3.A04.A00, 36322860546468409L)) {
                if (list == null || list2.isEmpty() || list2.get(0) == null || ((CardDetails) list2.get(0)).A08 == null) {
                    fragment = null;
                } else {
                    if (bool.booleanValue()) {
                        A0a = AnonymousClass7TE.A0a();
                        fragment = new QKM();
                        A0a.putParcelableArrayList("cardDetailsList", (ArrayList) list2);
                    } else {
                        String str2 = ((CardDetails) list2.get(0)).A08;
                        0qQ.A0B(str2, 0);
                        A0a = AnonymousClass7TE.A0a();
                        fragment = new QKM();
                        A0a.putString("keyCredentialId", str2);
                    }
                    if (A002 != null) {
                        A0a.putInt("qplInstanceKey", A002.intValue());
                    }
                    fragment.setArguments(A0a);
                }
                fragment.getClass();
                fragment.A02 = C51965G9l.A0v(sty);
                Bundle A022 = qKv.A02();
                TPM tpm = new TPM(sty, 0);
                fragment.A01 = r3;
                fragment.A00 = A022;
                fragment.A03 = tpm;
                qKv.A09(fragment, (RRP) null, (Integer) null, AnonymousClass05K.A01, "CvvVerificationBottomsheetFragment");
            } else {
                Bundle A0a2 = AnonymousClass7TE.A0a();
                if (list == null || list2.isEmpty()) {
                    str = null;
                } else {
                    str = ((CardDetails) list2.get(0)).A08;
                }
                A0a2.putString("keyCredentialId", str);
                if (A002 != null) {
                    A0a2.putInt("qplInstanceKey", A002.intValue());
                }
                2Fg r0 = sty.A0A;
                Intent A003 = 2Fg.A00(activity, r0);
                if (A003 != null) {
                    A0a2.putStringArrayList("methodNames", r0.A0C);
                    A003.putExtras(A0a2);
                    AnonymousClass0b5.A00(activity, A003, 1001);
                } else {
                    throw AnonymousClass7TE.A0z("No payment activity is found. Did you check if payment is available?");
                }
            }
            SUR.A0B(r3, qKv, sty2.A06("PROMPTED_VERIFICATION"));
        }
    }

    public final RRP A06(String str) {
        return A07(str, -1, -1, false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.RRP, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02f1, code lost:
        if (r6.equals(r0) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f3, code lost:
        r16 = java.lang.String.valueOf(true);
        r11.put("use_ptt", r16);
        r11.put("use_ptt_for_bindcard", r16);
        r11.put(X.C273654mx.A00(96), java.lang.String.valueOf(r30));
        r15 = java.lang.String.valueOf(r32);
        r0 = "additional_time_elapsed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x032b, code lost:
        if (r0 == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032d, code lost:
        r11.put("use_ptt", java.lang.String.valueOf(true));
        r15 = java.lang.String.valueOf(r30);
        r0 = X.C273654mx.A00(96);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0341, code lost:
        r11.put(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x043d, code lost:
        r0 = X.RUQ.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0441, code lost:
        if (r0 == null) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0443, code lost:
        r11.put("suppress_strategy", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x044d, code lost:
        r4.A0K = r11;
        r4.A0J = X.Pxk.A0H(r24);
        r2 = r5.A0J;
        r0 = r2.A03;
        r1 = X.RF6.OPT_IN;
        r4.A0N = X.AnonymousClass7TF.A1W(r0, r1);
        r4.A0O = X.AnonymousClass7TF.A1W(r2.A00, r1);
        r4.A05 = r26.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x046f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x047b, code lost:
        r10 = r6.equals(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0486, code lost:
        if (r10 == false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0490, code lost:
        if (r21.equals("CONTACT_AUTOFILL") != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0498, code lost:
        switch(r7.A0D.intValue()) {
            case 0: goto L_0x04a7;
            case 1: goto L_0x04aa;
            default: goto L_0x049b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x049b, code lost:
        r1 = "UNDEFINED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x049d, code lost:
        r11.put(X.C66579MXk.A00(68), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04a7, code lost:
        r1 = "AUTOFILL_FRAMEWORK_PAGE_START";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04aa, code lost:
        r1 = "JS_FRAMEWORK";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04cc, code lost:
        if (r6.equals(r0) != false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04d4, code lost:
        if (r0 == false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04d6, code lost:
        if (r6 != "PROMPTED_AUTOFILL") goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04d8, code lost:
        r0 = (java.util.List) r24.A00;
        X.0qQ.A0B(r0, 0);
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04e9, code lost:
        if (r3.hasNext() == false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04eb, code lost:
        r2 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04fa, code lost:
        if (X.AnonymousClass7TF.A1Y(((com.fbpay.w3c.W3CCardDetail) r2).A01, true) == false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04fc, code lost:
        if (r2 == null) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0506, code lost:
        if (r23.A08(true) == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0508, code lost:
        r1 = java.lang.String.valueOf(X.AnonymousClass7TE.A0q(r27.A03.A00).getBoolean("is_passkey_content_visible", false));
        r0 = "HAS_PASSKEY_CONTENT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x051e, code lost:
        r11.put(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0521, code lost:
        r2 = r25.A06;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x052c, code lost:
        if (X.SPo.A03(r23, false) == false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x052e, code lost:
        if (r2 == null) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0530, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0531, code lost:
        r11.put("is_in_split_hybrid_prompt_flow", java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0540, code lost:
        if (r23.A00() == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0542, code lost:
        r1 = java.lang.String.valueOf(X.AnonymousClass7TE.A0q(r27.A03.A00).getBoolean("is_passkey_content_visible", false));
        r0 = "has_preselected_checkbox_for_passkey_creation";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e6, code lost:
        r0 = r6.equals(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.RRP A07(java.lang.String r29, long r30, long r32, boolean r34) {
        /*
            r28 = this;
            r7 = r28
            X.4gR r0 = r7.A0T
            r27 = r0
            X.RzL r5 = r0.A00
            java.lang.String r21 = X.C11392SRg.A02(r5)
            X.Jvc r0 = r5.A0P
            r26 = r0
            java.lang.String r0 = r0.A02
            r6 = r29
            X.AnonymousClass7TG.A1N(r6, r0)
            X.RRP r4 = new X.RRP
            r4.<init>()
            r4.A0I = r6
            r4.A0B = r0
            X.QP6 r0 = r5.A05
            java.lang.String r0 = r0.A05
            r4.A0A = r0
            r0 = r26
            java.lang.String r0 = r0.A03
            r4.A08 = r0
            r0 = r26
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r0 = X.RUN.A00(r0)
            r4.A0D = r0
            X.QP6 r0 = r5.A06
            r25 = r0
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r0 = X.RUN.A00(r0)
            r4.A06 = r0
            java.util.List r1 = r7.A0F
            r22 = 1
            r8 = 0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03ce
            r0 = 0
        L_0x0052:
            java.util.Set r2 = X.S8J.A01(r0)
            X.JwI r0 = r5.A0D
            r24 = r0
            java.lang.Object r10 = r0.A00
            java.util.List r10 = (java.util.List) r10
            r0 = r27
            X.1yd r0 = r0.A04
            r23 = r0
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36310430914379879(0x810025004b0067, double:3.0262009483989114E-306)
            boolean r0 = X.DbY.A1Z(r3, r9, r0)
            java.util.List r0 = X.C11413SSl.A03(r10, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0084
            java.util.Set r0 = X.SDK.A0B
            X.0qQ.A08(r0)
            java.util.LinkedHashSet r2 = X.094.A00(r0, r2)
        L_0x0084:
            java.lang.String r0 = X.RUN.A00(r2)
            r4.A07 = r0
            r0 = r21
            r4.A0H = r0
            r0 = r25
            java.lang.Object r0 = r0.A03
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r0 = X.RUN.A00(r0)
            r4.A0F = r0
            r0 = r23
            java.util.LinkedHashMap r0 = X.SPo.A00(r5, r0)
            r4.A0L = r0
            r0 = r24
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.LinkedHashSet r0 = X.C11413SSl.A02(r0)
            java.lang.String r0 = X.SUR.A02(r0)
            r4.A0E = r0
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r34)
            java.lang.String r0 = "is_bloks_screen"
            r11.put(r0, r1)
            java.lang.String r1 = "PAYMENT_AUTOFILL"
            r0 = r21
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f4
            r0 = r25
            java.lang.Object r1 = r0.A00
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = X.SDK.A04
            boolean r0 = X.Pxj.A1Y(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_name_on_payment_form"
            r11.put(r0, r1)
            r0 = r25
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = "postal-code"
            boolean r0 = r1.contains(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_zip_code_on_payment_form"
            r11.put(r0, r1)
        L_0x00f4:
            android.content.Context r0 = r5.A0Q
            java.lang.String r1 = X.C11234SGu.A00(r0)
            java.lang.String r0 = "family_device_id"
            r11.put(r0, r1)
            int r20 = r6.hashCode()
            java.lang.String r14 = "PROMPTED_AUTOFILL"
            java.lang.String r13 = "PROMPTED_ADD_NEW_CARD"
            java.lang.String r12 = "PROMPTED_SAVE"
            switch(r20) {
                case -1824420039: goto L_0x03bc;
                case -1745715671: goto L_0x03b7;
                case -1736385848: goto L_0x03b0;
                case -1099895954: goto L_0x03ab;
                case -144590650: goto L_0x03a4;
                default: goto L_0x010c;
            }
        L_0x010c:
            java.lang.String r19 = "ACCEPTED_ADD_NEW_CARD"
            java.lang.String r10 = "DECLINED_ADD_NEW_CARD"
            java.lang.String r18 = "ACCEPTED_SAVE"
            java.lang.String r17 = "DECLINED_SAVE"
            java.lang.String r9 = "SUCCEEDED_SAVE_PAYMENT_OPT_IN_DATA"
            java.lang.String r3 = "FAILED_SAVE_NEW_CARD"
            java.lang.String r2 = "SUCCEEDED_SAVE_NEW_CARD"
            java.lang.String r1 = "FAILED_SAVE_PAYMENT_OPT_IN_DATA"
            switch(r20) {
                case -1993895147: goto L_0x0377;
                case -1824420039: goto L_0x0372;
                case -1801318401: goto L_0x036d;
                case -1796214034: goto L_0x0366;
                case -1745715671: goto L_0x0361;
                case -1539874445: goto L_0x035c;
                case -1215959441: goto L_0x0357;
                case 1458592990: goto L_0x0352;
                case 1801540219: goto L_0x034d;
                case 2146756101: goto L_0x0346;
                default: goto L_0x011f;
            }
        L_0x011f:
            switch(r20) {
                case -1801318401: goto L_0x0327;
                case -1539874445: goto L_0x0322;
                case -1215959441: goto L_0x031d;
                case -1199051928: goto L_0x02eb;
                case 797729369: goto L_0x02e4;
                case 964705388: goto L_0x02e1;
                case 1801540219: goto L_0x02dc;
                case 1837359317: goto L_0x02d9;
                default: goto L_0x0122;
            }
        L_0x0122:
            switch(r20) {
                case -2017877686: goto L_0x0283;
                case -1993895147: goto L_0x027c;
                case -1824420039: goto L_0x0277;
                case -1801318401: goto L_0x0272;
                case -1796214034: goto L_0x026b;
                case -1745715671: goto L_0x0266;
                case -1539874445: goto L_0x0261;
                case -1238602589: goto L_0x025e;
                case -1215959441: goto L_0x0259;
                case -1199051928: goto L_0x0256;
                case -1099895954: goto L_0x0251;
                case -255182467: goto L_0x024e;
                case 520419524: goto L_0x024b;
                case 797729369: goto L_0x0248;
                case 964705388: goto L_0x0245;
                case 1458592990: goto L_0x0240;
                case 1801540219: goto L_0x023b;
                case 1837359317: goto L_0x0238;
                case 2146756101: goto L_0x0231;
                default: goto L_0x0125;
            }
        L_0x0125:
            switch(r20) {
                case -1801318401: goto L_0x0218;
                case -1539874445: goto L_0x0213;
                case -1215959441: goto L_0x020e;
                case 1801540219: goto L_0x0209;
                default: goto L_0x0128;
            }
        L_0x0128:
            switch(r20) {
                case -1993895147: goto L_0x01f4;
                case -1824420039: goto L_0x01ef;
                case -1801318401: goto L_0x01ea;
                case -1796214034: goto L_0x01e3;
                case -1745715671: goto L_0x01de;
                case -1539874445: goto L_0x01d9;
                case -1215959441: goto L_0x01d4;
                case -937628630: goto L_0x01cd;
                case -487236015: goto L_0x01ca;
                case -109054468: goto L_0x01c7;
                case 341338147: goto L_0x01c4;
                case 453085708: goto L_0x01c1;
                case 695898741: goto L_0x01be;
                case 1141248819: goto L_0x01bb;
                case 1458592990: goto L_0x01cf;
                case 1524472903: goto L_0x01b8;
                case 1543744343: goto L_0x01b5;
                case 1801540219: goto L_0x01b0;
                case 2146756101: goto L_0x01a9;
                default: goto L_0x012b;
            }
        L_0x012b:
            boolean r10 = r6.equals(r12)
            if (r10 != 0) goto L_0x0197
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L_0x0197
        L_0x0137:
            switch(r20) {
                case -1149808528: goto L_0x0180;
                case -642333381: goto L_0x0175;
                case -398818369: goto L_0x0172;
                case 1256485686: goto L_0x016f;
                case 1268169524: goto L_0x016c;
                default: goto L_0x013a;
            }
        L_0x013a:
            r0 = r24
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            X.QKv r0 = r7.A04
            boolean r0 = r0.A0L(r8)
            X.0qQ.A0B(r1, r8)
            java.lang.String r9 = "Required value was null."
            if (r0 != 0) goto L_0x0401
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x0155:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03d8
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x0155
            r3.add(r1)
            goto L_0x0155
        L_0x016c:
            java.lang.String r0 = "AUTOFILL_IAB_PAUSE"
            goto L_0x0177
        L_0x016f:
            java.lang.String r0 = "AUTOFILL_IAB_CLOSE"
            goto L_0x0177
        L_0x0172:
            java.lang.String r0 = "AUTOFILL_ALL_NAVIGATION"
            goto L_0x0177
        L_0x0175:
            java.lang.String r0 = "NO_PROMPTED_SAVE"
        L_0x0177:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013a
            java.util.Map r0 = r7.A0J
            goto L_0x0193
        L_0x0180:
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013a
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "FIX_CONTACT_DATA_FETCH"
            r11.put(r0, r1)
            java.util.Map r0 = r7.A0I
        L_0x0193:
            r11.putAll(r0)
            goto L_0x013a
        L_0x0197:
            X.QKv r0 = r7.A04
            boolean r0 = r0.A0H()
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "eligible_for_save_without_ads_consent"
            r11.put(r0, r1)
            goto L_0x0137
        L_0x01a9:
            r0 = r19
            boolean r0 = r6.equals(r0)
            goto L_0x01fa
        L_0x01b0:
            boolean r0 = r6.equals(r9)
            goto L_0x01fa
        L_0x01b5:
            java.lang.String r10 = "PROMPTED_PARTIAL_SAVE"
            goto L_0x01cf
        L_0x01b8:
            java.lang.String r10 = "PROMPTED_PARTIAL_ADD_NEW_CARD"
            goto L_0x01cf
        L_0x01bb:
            java.lang.String r10 = "ACCEPTED_PARTIAL_SAVE"
            goto L_0x01cf
        L_0x01be:
            java.lang.String r10 = "PROMPTED_CONFIRM_DETAILS_SAVE"
            goto L_0x01cf
        L_0x01c1:
            java.lang.String r10 = "DECLINED_PARTIAL_SAVE"
            goto L_0x01cf
        L_0x01c4:
            java.lang.String r10 = "ACCEPTED_PARTIAL_ADD_NEW_CARD"
            goto L_0x01cf
        L_0x01c7:
            java.lang.String r10 = "DECLINED_PARTIAL_ADD_NEW_CARD"
            goto L_0x01cf
        L_0x01ca:
            java.lang.String r10 = "ACCEPTED_CONFIRM_DETAILS_SAVE"
            goto L_0x01cf
        L_0x01cd:
            java.lang.String r10 = "DECLINED_CONFIRM_DETAILS_SAVE"
        L_0x01cf:
            boolean r0 = r6.equals(r10)
            goto L_0x01fa
        L_0x01d4:
            boolean r0 = r6.equals(r3)
            goto L_0x01fa
        L_0x01d9:
            boolean r0 = r6.equals(r2)
            goto L_0x01fa
        L_0x01de:
            boolean r0 = r6.equals(r13)
            goto L_0x01fa
        L_0x01e3:
            r0 = r17
            boolean r0 = r6.equals(r0)
            goto L_0x01fa
        L_0x01ea:
            boolean r0 = r6.equals(r1)
            goto L_0x01fa
        L_0x01ef:
            boolean r0 = r6.equals(r12)
            goto L_0x01fa
        L_0x01f4:
            r0 = r18
            boolean r0 = r6.equals(r0)
        L_0x01fa:
            if (r0 == 0) goto L_0x012b
            java.util.Map r1 = r7.A0H
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x012b
            r11.putAll(r1)
            goto L_0x012b
        L_0x0209:
            boolean r0 = r6.equals(r9)
            goto L_0x021c
        L_0x020e:
            boolean r0 = r6.equals(r3)
            goto L_0x021c
        L_0x0213:
            boolean r0 = r6.equals(r2)
            goto L_0x021c
        L_0x0218:
            boolean r0 = r6.equals(r1)
        L_0x021c:
            if (r0 == 0) goto L_0x0128
            X.JwI r0 = r5.A0G
            java.lang.Object r0 = r0.A00
            X.JTb r0 = (X.C59671JTb) r0
            boolean r0 = r0.A00
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_payment_save_retry"
            r11.put(r0, r15)
            goto L_0x0128
        L_0x0231:
            r0 = r19
            boolean r0 = r6.equals(r0)
            goto L_0x0289
        L_0x0238:
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
            goto L_0x0285
        L_0x023b:
            boolean r0 = r6.equals(r9)
            goto L_0x0289
        L_0x0240:
            boolean r0 = r6.equals(r10)
            goto L_0x0289
        L_0x0245:
            java.lang.String r0 = "SUCCEEDED_CARD_VERIFICATION"
            goto L_0x0285
        L_0x0248:
            java.lang.String r0 = "FAILED_CVV_VERIFICATION"
            goto L_0x0285
        L_0x024b:
            java.lang.String r0 = "CANCELED_CARD_VERIFICATION"
            goto L_0x0285
        L_0x024e:
            java.lang.String r0 = "CANCELED_CVV_VERIFICATION"
            goto L_0x0285
        L_0x0251:
            boolean r0 = r6.equals(r14)
            goto L_0x0289
        L_0x0256:
            java.lang.String r0 = "FAILED_CARD_VERIFICATION"
            goto L_0x0285
        L_0x0259:
            boolean r0 = r6.equals(r3)
            goto L_0x0289
        L_0x025e:
            java.lang.String r0 = "DECLINED_AUTOFILL"
            goto L_0x0285
        L_0x0261:
            boolean r0 = r6.equals(r2)
            goto L_0x0289
        L_0x0266:
            boolean r0 = r6.equals(r13)
            goto L_0x0289
        L_0x026b:
            r0 = r17
            boolean r0 = r6.equals(r0)
            goto L_0x0289
        L_0x0272:
            boolean r0 = r6.equals(r1)
            goto L_0x0289
        L_0x0277:
            boolean r0 = r6.equals(r12)
            goto L_0x0289
        L_0x027c:
            r0 = r18
            boolean r0 = r6.equals(r0)
            goto L_0x0289
        L_0x0283:
            java.lang.String r0 = "ACCEPTED_AUTOFILL"
        L_0x0285:
            boolean r0 = r6.equals(r0)
        L_0x0289:
            if (r0 == 0) goto L_0x0125
            X.QKv r0 = r7.A04
            int r0 = r0.A01
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "DECLINED_AUTOFILL_COUNT"
            r11.put(r0, r15)
            X.RFU r0 = X.RFU.CREDIT_CARD_NUMBER
            java.lang.String r15 = X.C11392SRg.A01(r0, r5)
            java.lang.String r0 = "cc_num_from_ml_regex_used"
            r11.put(r0, r15)
            X.RFU r0 = X.RFU.CREDIT_CARD_SECURITY_CODE
            java.lang.String r15 = X.C11392SRg.A01(r0, r5)
            java.lang.String r0 = "cc_csc_from_ml_regex_used"
            r11.put(r0, r15)
            X.RFU r0 = X.RFU.CREDIT_CARD_EXP_MONTH
            java.lang.String r15 = X.C11392SRg.A01(r0, r5)
            java.lang.String r0 = "cc_exp_month_from_ml_regex_used"
            r11.put(r0, r15)
            X.RFU r0 = X.RFU.CREDIT_CARD_EXP_YEAR
            java.lang.String r15 = X.C11392SRg.A01(r0, r5)
            java.lang.String r0 = "cc_exp_year_from_ml_regex_used"
            r11.put(r0, r15)
            X.RFU r0 = X.RFU.CREDIT_CARD_EXP
            java.lang.String r15 = X.C11392SRg.A01(r0, r5)
            java.lang.String r0 = "cc_exp_from_ml_regex_used"
            r11.put(r0, r15)
            java.lang.String r15 = "no bottomsheets"
            java.lang.String r0 = "lightweight_disclosure_enabled_for"
            r11.put(r0, r15)
            goto L_0x0125
        L_0x02d9:
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
            goto L_0x02e6
        L_0x02dc:
            boolean r0 = r6.equals(r9)
            goto L_0x032b
        L_0x02e1:
            java.lang.String r0 = "SUCCEEDED_CARD_VERIFICATION"
            goto L_0x02ed
        L_0x02e4:
            java.lang.String r0 = "FAILED_CVV_VERIFICATION"
        L_0x02e6:
            boolean r0 = r6.equals(r0)
            goto L_0x032b
        L_0x02eb:
            java.lang.String r0 = "FAILED_CARD_VERIFICATION"
        L_0x02ed:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0122
            java.lang.String r16 = java.lang.String.valueOf(r22)
            java.lang.String r0 = "use_ptt"
            r15 = r0
            r0 = r16
            r11.put(r15, r0)
            java.lang.String r0 = "use_ptt_for_bindcard"
            r15 = r0
            r0 = r16
            r11.put(r15, r0)
            java.lang.String r15 = java.lang.String.valueOf(r30)
            r0 = 96
            java.lang.String r0 = X.C273654mx.A00(r0)
            r11.put(r0, r15)
            java.lang.String r15 = java.lang.String.valueOf(r32)
            java.lang.String r0 = "additional_time_elapsed"
            goto L_0x0341
        L_0x031d:
            boolean r0 = r6.equals(r3)
            goto L_0x032b
        L_0x0322:
            boolean r0 = r6.equals(r2)
            goto L_0x032b
        L_0x0327:
            boolean r0 = r6.equals(r1)
        L_0x032b:
            if (r0 == 0) goto L_0x0122
            java.lang.String r15 = java.lang.String.valueOf(r22)
            java.lang.String r0 = "use_ptt"
            r11.put(r0, r15)
            java.lang.String r15 = java.lang.String.valueOf(r30)
            r0 = 96
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x0341:
            r11.put(r0, r15)
            goto L_0x0122
        L_0x0346:
            r0 = r19
            boolean r0 = r6.equals(r0)
            goto L_0x037d
        L_0x034d:
            boolean r0 = r6.equals(r9)
            goto L_0x037d
        L_0x0352:
            boolean r0 = r6.equals(r10)
            goto L_0x037d
        L_0x0357:
            boolean r0 = r6.equals(r3)
            goto L_0x037d
        L_0x035c:
            boolean r0 = r6.equals(r2)
            goto L_0x037d
        L_0x0361:
            boolean r0 = r6.equals(r13)
            goto L_0x037d
        L_0x0366:
            r0 = r17
            boolean r0 = r6.equals(r0)
            goto L_0x037d
        L_0x036d:
            boolean r0 = r6.equals(r1)
            goto L_0x037d
        L_0x0372:
            boolean r0 = r6.equals(r12)
            goto L_0x037d
        L_0x0377:
            r0 = r18
            boolean r0 = r6.equals(r0)
        L_0x037d:
            if (r0 == 0) goto L_0x011f
            r0 = r26
            boolean r0 = r0.A04
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "presented_end_of_session"
            r11.put(r0, r15)
            X.JwI r0 = r5.A0C
            java.lang.Object r0 = r0.A00
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x011f
            java.lang.String r15 = X.S8H.A01(r0)
            java.lang.String r0 = "displayed_prompt_type"
            r11.put(r0, r15)
            goto L_0x011f
        L_0x03a4:
            java.lang.String r0 = "FIRST_FORM_INTERACTION"
            boolean r0 = r6.equals(r0)
            goto L_0x03c0
        L_0x03ab:
            boolean r0 = r6.equals(r14)
            goto L_0x03c0
        L_0x03b0:
            java.lang.String r0 = "PAYMENT_AUTOFILL_DOMAIN_REQUEST"
            boolean r0 = r6.equals(r0)
            goto L_0x03c0
        L_0x03b7:
            boolean r0 = r6.equals(r13)
            goto L_0x03c0
        L_0x03bc:
            boolean r0 = r6.equals(r12)
        L_0x03c0:
            if (r0 == 0) goto L_0x010c
            java.lang.String r1 = X.Pxk.A0H(r24)
            java.lang.String r0 = "meta_pay_account_payment_method_status"
            r11.put(r0, r1)
            goto L_0x010c
        L_0x03ce:
            java.lang.Object r0 = r1.get(r8)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0052
        L_0x03d8:
            int r0 = X.JTT.A08(r3)
            java.util.LinkedHashMap r2 = X.DbS.A0x(r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x03e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0429
            java.lang.Object r0 = r3.next()
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x03fc
            java.lang.String r0 = "AVAILABLE"
            r2.put(r1, r0)
            goto L_0x03e4
        L_0x03fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0401:
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r9 = r1.iterator()
        L_0x0409:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0429
            java.lang.Object r3 = r9.next()
            com.fbpay.w3c.W3CCardDetail r3 = (com.fbpay.w3c.W3CCardDetail) r3
            com.fbpay.w3c.CardDetails r0 = r3.A00
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x0409
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0409
            java.lang.String r0 = X.C11413SSl.A00(r3)
            r2.put(r1, r0)
            goto L_0x0409
        L_0x0429:
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0559
            boolean r0 = r6.equals(r14)
            if (r0 != 0) goto L_0x0559
        L_0x0437:
            switch(r20) {
                case -2017877686: goto L_0x04c6;
                case -1466105477: goto L_0x04c3;
                case -1238602589: goto L_0x04c0;
                case -1099895954: goto L_0x04d0;
                case -581167145: goto L_0x04bd;
                case -255182467: goto L_0x04ba;
                case -144590650: goto L_0x04ad;
                case 797729369: goto L_0x04b7;
                case 1837359317: goto L_0x04b4;
                default: goto L_0x043a;
            }
        L_0x043a:
            switch(r20) {
                case -1824420039: goto L_0x0486;
                case -1796214034: goto L_0x0480;
                case -1745715671: goto L_0x047b;
                case -642333381: goto L_0x0479;
                case 453085708: goto L_0x0476;
                case 1524472903: goto L_0x0473;
                case 1543744343: goto L_0x0470;
                default: goto L_0x043d;
            }
        L_0x043d:
            java.util.LinkedHashMap r0 = X.RUQ.A00(r5)
            if (r0 == 0) goto L_0x044d
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "suppress_strategy"
            r11.put(r0, r1)
        L_0x044d:
            r4.A0K = r11
            java.lang.String r0 = X.Pxk.A0H(r24)
            r4.A0J = r0
            X.JV5 r2 = r5.A0J
            java.lang.Object r0 = r2.A03
            X.RF6 r1 = X.RF6.OPT_IN
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r1)
            r4.A0N = r0
            java.lang.Object r0 = r2.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r1)
            r4.A0O = r0
            r0 = r26
            java.lang.String r0 = r0.A01
            r4.A05 = r0
            return r4
        L_0x0470:
            java.lang.String r13 = "PROMPTED_PARTIAL_SAVE"
            goto L_0x047b
        L_0x0473:
            java.lang.String r13 = "PROMPTED_PARTIAL_ADD_NEW_CARD"
            goto L_0x047b
        L_0x0476:
            java.lang.String r13 = "DECLINED_PARTIAL_SAVE"
            goto L_0x047b
        L_0x0479:
            java.lang.String r13 = "NO_PROMPTED_SAVE"
        L_0x047b:
            boolean r10 = r6.equals(r13)
            goto L_0x0486
        L_0x0480:
            r0 = r17
            boolean r10 = r6.equals(r0)
        L_0x0486:
            if (r10 == 0) goto L_0x043d
            java.lang.String r1 = "CONTACT_AUTOFILL"
            r0 = r21
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043d
            java.lang.Integer r0 = r7.A0D
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x04a7;
                case 1: goto L_0x04aa;
                default: goto L_0x049b;
            }
        L_0x049b:
            java.lang.String r1 = "UNDEFINED"
        L_0x049d:
            r0 = 68
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r11.put(r0, r1)
            goto L_0x043d
        L_0x04a7:
            java.lang.String r1 = "AUTOFILL_FRAMEWORK_PAGE_START"
            goto L_0x049d
        L_0x04aa:
            java.lang.String r1 = "JS_FRAMEWORK"
            goto L_0x049d
        L_0x04ad:
            java.lang.String r0 = "FIRST_FORM_INTERACTION"
            boolean r0 = r6.equals(r0)
            goto L_0x04d4
        L_0x04b4:
            java.lang.String r0 = "SUCCEEDED_CVV_VERIFICATION"
            goto L_0x04c8
        L_0x04b7:
            java.lang.String r0 = "FAILED_CVV_VERIFICATION"
            goto L_0x04c8
        L_0x04ba:
            java.lang.String r0 = "CANCELED_CVV_VERIFICATION"
            goto L_0x04c8
        L_0x04bd:
            java.lang.String r0 = "PROMPTED_VERIFICATION"
            goto L_0x04c8
        L_0x04c0:
            java.lang.String r0 = "DECLINED_AUTOFILL"
            goto L_0x04c8
        L_0x04c3:
            java.lang.String r0 = "SUBMITTED_CVV_VERIFICATION"
            goto L_0x04c8
        L_0x04c6:
            java.lang.String r0 = "ACCEPTED_AUTOFILL"
        L_0x04c8:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0521
            goto L_0x043a
        L_0x04d0:
            boolean r0 = r6.equals(r14)
        L_0x04d4:
            if (r0 == 0) goto L_0x043a
            if (r6 != r14) goto L_0x0521
            r0 = r24
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r8)
            java.util.Iterator r3 = r0.iterator()
        L_0x04e5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x053c
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            java.lang.Boolean r1 = r0.A01
            r0 = r22
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x04e5
            if (r2 == 0) goto L_0x053c
            r1 = r23
            r0 = r22
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0521
            r0 = r27
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "is_passkey_content_visible"
            boolean r0 = r1.getBoolean(r0, r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "HAS_PASSKEY_CONTENT"
        L_0x051e:
            r11.put(r0, r1)
        L_0x0521:
            r0 = r25
            java.lang.String r2 = r0.A06
            r1 = 0
            r0 = r23
            boolean r0 = X.SPo.A03(r0, r8)
            if (r0 == 0) goto L_0x0531
            if (r2 == 0) goto L_0x0531
            r1 = 1
        L_0x0531:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "is_in_split_hybrid_prompt_flow"
            r11.put(r0, r1)
            goto L_0x043a
        L_0x053c:
            boolean r0 = r23.A00()
            if (r0 == 0) goto L_0x0521
            r0 = r27
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "is_passkey_content_visible"
            boolean r0 = r1.getBoolean(r0, r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_preselected_checkbox_for_passkey_creation"
            goto L_0x051e
        L_0x0559:
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            X.R1k r0 = new X.R1k
            r0.<init>(r7)
            java.lang.reflect.Type r0 = r0.A00
            java.lang.String r1 = r1.A0C(r2, r0)
            java.lang.String r0 = "saved_credentials_availability"
            r11.put(r0, r1)
            goto L_0x0437
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A07(java.lang.String, long, long, boolean):X.RRP");
    }

    public final void A08() {
        AutofillFrameworkControllerBase$6 autofillFrameworkControllerBase$6 = new AutofillFrameworkControllerBase$6(this);
        BrowserLiteCallback browserLiteCallback = SRY.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.AUp(autofillFrameworkControllerBase$6);
            } catch (RemoteException e) {
                0KC.A0J("BrowserLiteCallbacker", "Error in fetchAutofillContactData", e);
            }
        }
    }

    public final void A09() {
        QOt qOt;
        String str;
        C270254gR r4 = this.A0T;
        C10860RzL rzL = r4.A00;
        QP6 qp6 = rzL.A07;
        Set set = (Set) rzL.A06.A00;
        if (qp6 != null && !set.isEmpty() && (qOt = (QOt) qp6.A00) != null) {
            Map A002 = RUS.A00(qOt);
            HashMap A1E = AnonymousClass7TE.A1E();
            set.forEach(new C13168TOa(this, A002, A1E));
            A1E.put("family_device_id", C11234SGu.A00(rzL.A0Q));
            if (this.A0S) {
                str = "EDIT_FIELD_END";
            } else {
                str = "FILL_FIELD_END";
            }
            RRP A062 = A06(str);
            A062.A0K = A1E;
            SUR.A0C(r4, this, A062);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b7, code lost:
        if (X.S8I.A01(r10, new X.C61084JwM(r3, r3, r3, 3)) == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0488, code lost:
        if (r3.length() == 0) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0494, code lost:
        if (r2.length() == 0) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x049d, code lost:
        if (r19 != false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04f4, code lost:
        if (r3.length() == 0) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0500, code lost:
        if (r2.length() == 0) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0509, code lost:
        if (r18 != false) goto L_0x050b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0711 A[SYNTHETIC, Splitter:B:381:0x0711] */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r36, X.QLA r37) {
        /*
            r35 = this;
            r13 = r35
            r21 = r37
            r0 = r21
            r13.A07 = r0
            X.Q8n r0 = r21.A04()
            r13.A03 = r0
            X.4gR r12 = r13.A0T
            X.SJh r0 = r12.A02
            r34 = r0
            r5 = 772812934(0x2e103086, float:3.2784907E-11)
            r11 = 0
            r23 = 0
            r1 = r23
            java.lang.Integer r19 = r0.A00(r1, r5, r11)
            X.RzL r10 = r12.A00
            X.QP6 r9 = r10.A06
            java.lang.Object r0 = r9.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.HashSet r18 = X.C66580MXl.A12(r0)
            X.Q8n r4 = r13.A03
            r4.getClass()
            X.1yd r8 = r12.A04
            com.instagram.common.session.UserSession r0 = r8.A00
            r20 = r0
            X.0Tu r3 = X.0Tu.A06
            r0 = 36322860546206262(0x810b7300152a36, double:3.034061497616026E-306)
            r2 = r20
            boolean r0 = X.DbY.A1Z(r3, r2, r0)
            if (r0 != 0) goto L_0x0078
            java.util.Set r14 = X.SDK.A07
        L_0x0048:
            r7 = 1
            X.0qQ.A0B(r14, r7)
            r31 = 2
            r30 = 3
            java.util.LinkedHashMap r17 = X.AnonymousClass7TE.A1H()
            r3 = 0
            java.util.List r0 = r4.A0A
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r2 = X.DbV.A15(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0063:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.Q8n r0 = (X.Q8n) r0
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0063
            r2.add(r1)
            goto L_0x0063
        L_0x0078:
            java.util.Set r0 = X.SDK.A07
            java.util.HashSet r14 = X.C66580MXl.A12(r0)
            java.lang.String r0 = "street-address"
            r14.add(r0)
            goto L_0x0048
        L_0x0085:
            java.util.Iterator r16 = r2.iterator()
        L_0x0089:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r6 = r16.next()
            X.Q8n r6 = (X.Q8n) r6
            X.0qQ.A0A(r6)
            r0 = r18
            java.lang.String r4 = X.SB2.A00(r6, r8, r14, r0)
            if (r4 == 0) goto L_0x0089
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x00a7
            r9.A06 = r4
            r3 = r6
        L_0x00a7:
            int r0 = r6.A02
            if (r0 == 0) goto L_0x00ba
            X.0Tu r15 = X.0Tu.A05
            r0 = 36322860549352032(0x810b7300452a60, double:3.0340614996054237E-306)
            r2 = r20
            boolean r0 = X.DbY.A1Z(r15, r2, r0)
            if (r0 != 0) goto L_0x0089
        L_0x00ba:
            r0 = r17
            java.lang.Object r4 = X.JTS.A0h(r4, r0)
            java.util.List r4 = (java.util.List) r4
            android.view.autofill.AutofillValue r15 = r6.A04
            java.lang.CharSequence[] r6 = r6.A08
            r2 = 0
            if (r15 == 0) goto L_0x00d7
            boolean r0 = r15.isText()
            if (r0 == 0) goto L_0x00db
            java.lang.CharSequence r0 = r15.getTextValue()
        L_0x00d3:
            java.lang.String r2 = r0.toString()
        L_0x00d7:
            r4.add(r2)
            goto L_0x0089
        L_0x00db:
            boolean r0 = r15.isList()
            if (r0 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00d7
            int r1 = r15.getListValue()
            int r0 = r6.length
            if (r1 >= r0) goto L_0x00d7
            int r0 = r15.getListValue()
            r0 = r6[r0]
            goto L_0x00d3
        L_0x00f1:
            java.util.Map r4 = X.0Yt.A0B(r17)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r18)
            X.0qQ.A0B(r0, r11)
            r9.A02 = r0
            r2 = r19
            r1 = r23
            r0 = r34
            r0.A01(r2, r1, r5)
            r26 = 772805755(0x2e10147b, float:3.276E-11)
            r2 = r1
            r1 = r26
            java.lang.Integer r6 = r0.A00(r2, r1, r11)
            java.util.Set r0 = r4.keySet()
            X.0qQ.A0B(r0, r11)
            r9.A00 = r0
            java.util.LinkedHashSet r2 = X.DbS.A0y()
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r4)
        L_0x0122:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x015b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r14)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0122
            java.util.Iterator r5 = r0.iterator()
        L_0x0140:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r4 = r5.next()
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0140
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0140
            if (r4 == 0) goto L_0x0122
            r2.add(r1)
            goto L_0x0122
        L_0x015b:
            java.util.Set r29 = X.00k.A0k(r2)
            r0 = r29
            r9.A03 = r0
            java.lang.String r18 = X.C11392SRg.A02(r10)
            r13.A0N = r7
            X.Q8n r0 = r13.A03
            r13.A0D(r0)
            X.Q8n r0 = r13.A03
            r13.A0C(r0)
            X.QKv r5 = r13.A04
            android.content.Context r4 = r5.A00
            java.lang.String r14 = "prompt_type"
            r2 = r18
            r1 = r26
            r0 = r34
            r0.A03(r6, r14, r2, r1)
            java.lang.Object r0 = r9.A03
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r14 = "cc-number"
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x0196
            X.SJQ r1 = r13.A06
            X.S0G r0 = r13.A05
            r1.A02(r4, r12, r0)
        L_0x0196:
            java.lang.Object r0 = r9.A03
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x01a7
            X.SJQ r1 = r13.A06
            X.S0G r0 = r13.A05
            r1.A00(r4, r12, r0)
        L_0x01a7:
            boolean r0 = r8.A07(r7)
            java.lang.String r1 = "FIRST_FORM_INTERACTION"
            if (r0 == 0) goto L_0x02ec
            boolean r0 = X.C11392SRg.A03(r10)
            if (r0 == 0) goto L_0x02ec
            boolean r0 = X.SPo.A03(r8, r7)
            if (r0 != 0) goto L_0x01c3
            java.lang.Integer r2 = X.C11392SRg.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x02ec
        L_0x01c3:
            X.JwM r2 = r10.A0K
            java.lang.Object r0 = r2.A00
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "CONTACT_AUTOFILL"
            X.RRP r1 = r13.A06(r1)
            r1.A0H = r0
            X.SUR.A0B(r12, r5, r1)
            X.0JP r0 = r13.A08
            long r0 = r0.now()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
        L_0x01e0:
            if (r3 == 0) goto L_0x0282
            android.view.autofill.AutofillValue r0 = r3.A04
            if (r0 == 0) goto L_0x0282
            boolean r0 = r0.isText()
            if (r0 == 0) goto L_0x0282
            android.view.autofill.AutofillValue r0 = r3.A04
            java.lang.CharSequence r0 = r0.getTextValue()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0282
        L_0x01f8:
            X.Jvc r3 = r10.A0P
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0282
            boolean r0 = r8.A07(r7)
            r14 = 0
            if (r0 == 0) goto L_0x02d7
            java.lang.Integer r1 = X.C11392SRg.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0219
            boolean r1 = X.SPo.A03(r8, r11)
            if (r1 == 0) goto L_0x02d7
            boolean r1 = X.C11392SRg.A03(r10)
            if (r1 == 0) goto L_0x02d7
        L_0x0219:
            r1 = 1
        L_0x021a:
            java.lang.String r4 = r3.A03
            java.util.Map r3 = r13.A0V
            boolean r2 = r13.A0S
            r16 = r5
            if (r1 == 0) goto L_0x0226
            r16 = 0
        L_0x0226:
            r15 = r12
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r2
            java.lang.Integer r2 = X.RUG.A00(r15, r16, r17, r18, r19, r20)
            int r0 = r2.intValue()
            if (r0 == r7) goto L_0x0283
            A01(r13)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.JwM r3 = new X.JwM
            r0 = r30
            r3.<init>((java.lang.Integer) r6, (java.lang.Integer) r4, (java.lang.Integer) r6, (int) r0)
            boolean r0 = X.S8I.A01(r10, r3)
            if (r0 != 0) goto L_0x025c
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            X.JwM r3 = new X.JwM
            r0 = r30
            r3.<init>((java.lang.Integer) r6, (java.lang.Integer) r4, (java.lang.Integer) r6, (int) r0)
            boolean r0 = X.S8I.A01(r10, r3)
            if (r0 == 0) goto L_0x025d
        L_0x025c:
            r14 = 1
        L_0x025d:
            if (r1 != 0) goto L_0x0282
            boolean r0 = r13.A0Q
            if (r0 != 0) goto L_0x0282
            if (r14 != 0) goto L_0x0282
            if (r2 != r6) goto L_0x0270
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_DECLINED_AUTOFILL_ONCE"
            java.lang.String r0 = "DECLINED_AUTOFILL_ONCE"
            r2.put(r1, r0)
        L_0x0270:
            java.util.Map r1 = r13.A0I
            java.lang.String r0 = "NO_PROMPT_AUTOFILL_REASONS_FOR_INTERNAL_SETTINGS"
            r13.A05(r1, r0)
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            X.RRP r0 = r13.A06(r0)
            X.SUR.A0B(r12, r5, r0)
            r13.A0Q = r7
        L_0x0282:
            return
        L_0x0283:
            java.lang.String r2 = r9.A06
            boolean r0 = X.SPo.A03(r8, r11)
            if (r0 == 0) goto L_0x02a0
            if (r2 == 0) goto L_0x02a0
        L_0x028d:
            if (r1 == 0) goto L_0x071f
            com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$3 r2 = new com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$3
            r0 = r29
            r2.<init>(r13, r6, r0)
        L_0x0296:
            X.SRY r0 = X.SRY.A00()
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0282
            goto L_0x0711
        L_0x02a0:
            X.S5u r0 = r5.A09
            if (r0 == 0) goto L_0x02b9
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02b9
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.JwM r2 = new X.JwM
            r0 = r30
            r2.<init>((java.lang.Integer) r3, (java.lang.Integer) r3, (java.lang.Integer) r3, (int) r0)
            boolean r0 = X.S8I.A01(r10, r2)
            if (r0 != 0) goto L_0x028d
        L_0x02b9:
            java.util.Set r3 = X.SDK.A02
            java.util.Iterator r2 = r29.iterator()
        L_0x02bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x028d
            java.lang.Object r0 = r2.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x02bf
            com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$2 r2 = new com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$2
            r0 = r29
            r2.<init>(r13, r6, r0, r1)
            goto L_0x0296
        L_0x02d7:
            r1 = 0
            java.lang.Integer r2 = X.C11392SRg.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x02e8
            boolean r2 = X.SPo.A03(r8, r11)
            if (r2 != 0) goto L_0x02e8
            goto L_0x021a
        L_0x02e8:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x021a
        L_0x02ec:
            r3 = 1
            java.lang.String r0 = r21.A05()
            java.lang.String r2 = X.C11429STt.A02(r0)
            if (r2 == 0) goto L_0x0305
            java.util.Map r0 = r5.A0i
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0305
            boolean r3 = r0.booleanValue()
        L_0x0305:
            java.lang.String r28 = "prompt_name"
            java.lang.String r27 = "NO_PROMPTED_AUTOFILL"
            if (r3 != 0) goto L_0x0591
            X.Jvc r2 = r10.A0P
            java.lang.String r0 = r2.A03
            boolean r0 = r5.A0K(r0)
            if (r0 != 0) goto L_0x0591
            X.Q8n r0 = r13.A03
            if (r0 != 0) goto L_0x0404
            r4 = 0
        L_0x031b:
            X.JVf r0 = r10.A0I
            java.lang.Object r0 = r0.A01
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            r25 = r0 ^ 1
            X.JwI r0 = r10.A0D
            r33 = r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r17 = X.C11413SSl.A01(r0)
            X.JV5 r0 = r10.A0J
            r32 = r0
            java.lang.Object r3 = r0.A00
            boolean r16 = r13.A0I()
            int r15 = r17.size()
            boolean r0 = r29.isEmpty()
            if (r0 != 0) goto L_0x0351
            X.RF6 r0 = X.RF6.OPT_OUT
            if (r3 == r0) goto L_0x0351
            if (r25 == 0) goto L_0x0351
            if (r16 != 0) goto L_0x03f8
            if (r15 != 0) goto L_0x03f8
        L_0x0351:
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
        L_0x0353:
            if (r25 == 0) goto L_0x0362
            boolean r0 = r13.A0I()
            if (r0 == 0) goto L_0x0362
            java.lang.Object r0 = r9.A03
            java.util.Set r0 = (java.util.Set) r0
            r0.contains(r14)
        L_0x0362:
            java.lang.Object r15 = r2.A00
            java.util.Set r15 = (java.util.Set) r15
            java.lang.Object r2 = r9.A00
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r0 = X.SDK.A0B
            boolean r0 = X.Pxj.A1Y(r0, r2)
            if (r0 == 0) goto L_0x038c
            boolean r0 = r15.contains(r4)
            if (r0 != 0) goto L_0x038c
            r15.add(r4)
            java.lang.String r0 = "PAYMENT_AUTOFILL_DOMAIN_REQUEST"
            X.RRP r0 = r13.A06(r0)
            r0.A0D = r4
            long r2 = X.G9t.A0k(r25)
            r0.A03 = r2
            X.SUR.A0B(r12, r5, r0)
        L_0x038c:
            X.S5u r0 = r5.A09
            if (r0 == 0) goto L_0x03f5
            boolean r16 = r0.A01()
        L_0x0394:
            java.lang.String r2 = "CONTACT_AUTOFILL"
            r0 = r18
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0428
            java.lang.Long r0 = r13.A0E
            if (r0 != 0) goto L_0x0428
            boolean r0 = X.SPo.A03(r8, r11)
            if (r0 != 0) goto L_0x03aa
            if (r16 == 0) goto L_0x03b0
        L_0x03aa:
            boolean r0 = X.C11392SRg.A04(r10)
            if (r0 == 0) goto L_0x03e4
        L_0x03b0:
            X.0JP r0 = r13.A08
            long r2 = r0.now()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r13.A0E = r0
            r13.A0O = r7
            X.RRP r2 = r13.A06(r1)
            boolean r0 = X.SPo.A03(r8, r11)
            if (r0 == 0) goto L_0x03cc
            java.lang.String r0 = "PAYMENT_AUTOFILL"
            r2.A0H = r0
        L_0x03cc:
            if (r16 == 0) goto L_0x03e1
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.JwM r3 = new X.JwM
            r0 = r30
            r3.<init>((java.lang.Integer) r1, (java.lang.Integer) r1, (java.lang.Integer) r1, (int) r0)
            boolean r0 = X.S8I.A01(r10, r3)
            if (r0 == 0) goto L_0x03e1
            java.lang.String r0 = "PAYMENT_AUTOFILL"
            r2.A0H = r0
        L_0x03e1:
            X.SUR.A0B(r12, r5, r2)
        L_0x03e4:
            boolean r0 = r13.A0J()
            if (r0 == 0) goto L_0x0418
            java.lang.String r1 = "CONTACT_USAGE_ON_HYBRID_PROMPT_ENABLED"
            X.SRY r0 = X.SRY.A00()
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0418
            goto L_0x040c
        L_0x03f5:
            r16 = 0
            goto L_0x0394
        L_0x03f8:
            r0 = r29
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x0351
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            goto L_0x0353
        L_0x0404:
            java.lang.String r0 = r0.A06
            java.lang.String r4 = X.C11429STt.A02(r0)
            goto L_0x031b
        L_0x040c:
            r0.ChE(r1)     // Catch:{ RemoteException -> 0x0410 }
            goto L_0x0418
        L_0x0410:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in logAutofillExperimentExposure"
            X.0KC.A0J(r1, r0, r2)
        L_0x0418:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322860549286495(0x810b7300442a5f, double:3.034061499563978E-306)
            r2 = r20
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r3, r2, r0)
            X.0qQ.A0A(r0)
        L_0x0428:
            java.lang.String r1 = r9.A06
            boolean r0 = X.SPo.A03(r8, r7)
            if (r0 == 0) goto L_0x043b
            if (r1 == 0) goto L_0x043b
            java.util.Set r0 = X.SDK.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x043b
            return
        L_0x043b:
            if (r16 == 0) goto L_0x0444
            boolean r0 = X.C11392SRg.A03(r10)
            if (r0 == 0) goto L_0x0444
            return
        L_0x0444:
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
            r1 = r24
            r0 = r22
            if (r1 != r0) goto L_0x0576
            r13.A0J()
        L_0x044f:
            r0 = r33
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r11)
            java.util.LinkedHashSet r21 = X.DbS.A0y()
            java.util.Iterator r20 = r0.iterator()
        L_0x0460:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x05b7
            java.lang.Object r1 = r20.next()
            com.fbpay.w3c.W3CCardDetail r1 = (com.fbpay.w3c.W3CCardDetail) r1
            boolean r0 = X.C11413SSl.A04(r1)
            if (r0 == 0) goto L_0x047a
            java.lang.String r1 = "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN"
        L_0x0474:
            r0 = r21
            r0.add(r1)
            goto L_0x0460
        L_0x047a:
            X.0qQ.A0B(r1, r11)
            java.lang.String r3 = r1.A04
            java.lang.String r2 = r1.A03
            if (r3 == 0) goto L_0x048a
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x048b
        L_0x048a:
            r0 = 1
        L_0x048b:
            r16 = r0 ^ 1
            if (r2 == 0) goto L_0x0496
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0497
        L_0x0496:
            r0 = 1
        L_0x0497:
            r19 = r0 ^ 1
            if (r16 != 0) goto L_0x049f
            r18 = 0
            if (r19 == 0) goto L_0x04a1
        L_0x049f:
            r18 = 1
        L_0x04a1:
            java.lang.String r1 = "IAB_AUTOFILL_BINDING_UPDATER"
            if (r3 == 0) goto L_0x04ab
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x04b3
        L_0x04ab:
            if (r2 == 0) goto L_0x04ea
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x04ea
        L_0x04b3:
            r17 = 1
        L_0x04b5:
            if (r16 == 0) goto L_0x04c7
            if (r3 == 0) goto L_0x04e7
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x04c7
            java.util.Set r0 = X.C11413SSl.A00
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x04e7
        L_0x04c7:
            r16 = 1
        L_0x04c9:
            if (r19 == 0) goto L_0x04db
            if (r2 == 0) goto L_0x04e5
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x04db
            java.util.Set r0 = X.C11413SSl.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x04e5
        L_0x04db:
            r0 = 1
        L_0x04dc:
            if (r18 == 0) goto L_0x04ed
            if (r17 == 0) goto L_0x04ed
            if (r16 == 0) goto L_0x04ed
            if (r0 == 0) goto L_0x04ed
            goto L_0x0474
        L_0x04e5:
            r0 = 0
            goto L_0x04dc
        L_0x04e7:
            r16 = 0
            goto L_0x04c9
        L_0x04ea:
            r17 = 0
            goto L_0x04b5
        L_0x04ed:
            if (r3 == 0) goto L_0x04f6
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x04f7
        L_0x04f6:
            r0 = 1
        L_0x04f7:
            r19 = r0 ^ 1
            if (r2 == 0) goto L_0x0502
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0503
        L_0x0502:
            r0 = 1
        L_0x0503:
            r18 = r0 ^ 1
            if (r19 != 0) goto L_0x050b
            r17 = 0
            if (r18 == 0) goto L_0x050d
        L_0x050b:
            r17 = 1
        L_0x050d:
            if (r3 == 0) goto L_0x0517
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0521
        L_0x0517:
            if (r2 == 0) goto L_0x0566
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0566
        L_0x0521:
            r16 = 1
        L_0x0523:
            if (r19 == 0) goto L_0x0537
            if (r3 == 0) goto L_0x0564
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0537
            java.util.Set r0 = X.C11413SSl.A00
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0564
        L_0x0537:
            r1 = 1
        L_0x0538:
            if (r18 == 0) goto L_0x054c
            if (r2 == 0) goto L_0x0562
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x054c
            java.util.Set r0 = X.C11413SSl.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0562
        L_0x054c:
            r0 = 1
        L_0x054d:
            if (r17 == 0) goto L_0x0460
            if (r16 == 0) goto L_0x0460
            if (r1 == 0) goto L_0x0460
            if (r0 == 0) goto L_0x0460
            if (r3 == 0) goto L_0x0569
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0569
            r1 = r3
            goto L_0x0474
        L_0x0562:
            r0 = 0
            goto L_0x054d
        L_0x0564:
            r1 = 0
            goto L_0x0538
        L_0x0566:
            r16 = 0
            goto L_0x0523
        L_0x0569:
            if (r2 == 0) goto L_0x0460
            java.util.Set r0 = X.C11413SSl.A01
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0460
            r1 = r2
            goto L_0x0474
        L_0x0576:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x058c
            boolean r0 = r5.A0L(r7)
            if (r0 == 0) goto L_0x058c
            boolean r0 = r13.A0I()
            if (r0 != 0) goto L_0x058c
            r24 = r22
            goto L_0x044f
        L_0x058c:
            r8.A0D(r7)
            goto L_0x044f
        L_0x0591:
            java.lang.Object r0 = r9.A03
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x05aa
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x05aa
            java.lang.String r0 = "DOMAIN_OPTED_OUT"
            X.RRP r0 = r13.A06(r0)
            X.SUR.A0B(r12, r5, r0)
            r13.A0P = r7
        L_0x05aa:
            r3 = r28
            r2 = r27
            r1 = r26
            r0 = r34
            r0.A03(r6, r3, r2, r1)
            goto L_0x06f3
        L_0x05b7:
            java.lang.String r1 = "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN"
            r0 = r21
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x05d3
            com.instagram.common.session.UserSession r3 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310430914773097(0x81002500510069, double:3.026200948647584E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            X.0qQ.A0A(r0)
        L_0x05d3:
            r16 = 0
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x061b
            X.3M8 r1 = X.C7580QKv.A00(r5)
            X.4gR r0 = r5.A0b
            X.1yd r0 = r0.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x061b
            if (r1 == 0) goto L_0x061b
            java.lang.Integer r2 = r1.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 == r0) goto L_0x061b
            X.Dc2 r0 = r5.A0G
            if (r0 == 0) goto L_0x061b
            r1.A09(r0)
            X.S5W r2 = r5.A0a
            java.lang.String r0 = "AUTOMATIC_CONTACT_UPDATE_TOAST_DISMISS_BY_BOTTOMSHEET"
            X.RRP r1 = r2.A00(r0, r11)
            java.lang.ref.WeakReference r0 = r2.A00
            X.QKv r3 = X.Pxe.A0Q(r0)
            if (r3 == 0) goto L_0x061b
            X.SRY r2 = X.SRY.A00()
            X.SHz r0 = r1.A00()
            java.util.HashMap r1 = r0.A01()
            android.os.Bundle r0 = r3.A02()
            r2.A07(r0, r1)
        L_0x061b:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = r24
            if (r0 != r2) goto L_0x0624
            r8.A0E(r7)
        L_0x0624:
            int r1 = r24.intValue()
            if (r1 == r7) goto L_0x06f9
            if (r1 == r11) goto L_0x01f8
            r0 = r31
            if (r1 != r0) goto L_0x0282
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.JwM r1 = new X.JwM
            r0 = r30
            r1.<init>((java.lang.Integer) r2, (java.lang.Integer) r3, (java.lang.Integer) r2, (int) r0)
            boolean r0 = X.S8I.A01(r10, r1)
            if (r0 != 0) goto L_0x064e
            X.JwM r3 = new X.JwM
            r1 = r22
            r0 = r30
            r3.<init>((java.lang.Integer) r2, (java.lang.Integer) r1, (java.lang.Integer) r2, (int) r0)
            boolean r0 = X.S8I.A01(r10, r3)
            if (r0 == 0) goto L_0x0650
        L_0x064e:
            r16 = 1
        L_0x0650:
            boolean r0 = r15.contains(r4)
            if (r0 == 0) goto L_0x06e8
            boolean r0 = r13.A0Q
            if (r0 != 0) goto L_0x06e8
            if (r16 != 0) goto L_0x06e8
            r0 = r32
            java.lang.Object r3 = r0.A00
            boolean r0 = r13.A0I()
            if (r0 != 0) goto L_0x067f
            r0 = r33
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.C11413SSl.A01(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x067f
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_HAS_NO_CARDS"
            java.lang.String r0 = "USER_HAS_NO_CARDS"
            r2.put(r1, r0)
        L_0x067f:
            boolean r0 = r13.A0I()
            if (r0 != 0) goto L_0x069e
            r0 = r33
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.C11413SSl.A01(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x069e
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_HAS_ONLY_UNBOUND_CARDS"
            java.lang.String r0 = "USER_HAS_ONLY_UNBOUND_CARDS"
            r2.put(r1, r0)
        L_0x069e:
            X.RF6 r0 = X.RF6.OPT_OUT
            if (r3 != r0) goto L_0x06ab
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_OPTED_OUT"
            java.lang.String r0 = "USER_OPTED_OUT"
            r2.put(r1, r0)
        L_0x06ab:
            X.RF6 r0 = X.RF6.NOT_OPT_IN
            if (r3 != r0) goto L_0x06b8
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_NOT_OPT_IN"
            java.lang.String r0 = "USER_NOT_OPT_IN"
            r2.put(r1, r0)
        L_0x06b8:
            r0 = r29
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x06c9
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_UNDETECTED_CC_NUMBER"
            java.lang.String r0 = "UNDETECTED_CC_NUMBER"
            r2.put(r1, r0)
        L_0x06c9:
            if (r25 != 0) goto L_0x06d4
            java.util.Map r2 = r13.A0I
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_DOMAIN_BLOCKED_LISTED"
            java.lang.String r0 = "DOMAIN_BLOCKED_LISTED"
            r2.put(r1, r0)
        L_0x06d4:
            java.util.Map r1 = r13.A0I
            java.lang.String r0 = "NO_PROMPT_AUTOFILL_REASONS_FOR_INTERNAL_SETTINGS"
            r13.A05(r1, r0)
            r0 = r27
            X.RRP r0 = r13.A06(r0)
            r0.A0D = r4
            X.SUR.A0B(r12, r5, r0)
            r13.A0Q = r7
        L_0x06e8:
            r3 = r28
            r2 = r27
            r1 = r26
            r0 = r34
            r0.A03(r6, r3, r2, r1)
        L_0x06f3:
            r2 = r23
            r0.A01(r6, r2, r1)
            return
        L_0x06f9:
            if (r36 == 0) goto L_0x06e8
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            if (r0 != 0) goto L_0x06e8
            X.QLA r0 = r36.A05()
            if (r0 == 0) goto L_0x06e8
            r0 = r23
            X.0qQ.A0B(r0, r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0711:
            r0.AUp(r2)     // Catch:{ RemoteException -> 0x0715 }
            goto L_0x071e
        L_0x0715:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in fetchAutofillContactData"
            X.0KC.A0J(r1, r0, r2)
            return
        L_0x071e:
            return
        L_0x071f:
            boolean r2 = r13.A0I()
            r1 = r23
            r0 = r29
            r13.A0G(r6, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A0B(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy, X.QLA):void");
    }

    public final void A0C(Q8n q8n) {
        C270254gR r4 = this.A0T;
        0qQ.A0B(r4, 0);
        if (q8n != null) {
            C10860RzL rzL = r4.A00;
            0qQ.A0B(rzL, 1);
            String A022 = C11429STt.A02(q8n.A06);
            if (A022 != null && !((Set) rzL.A0I.A01).contains(A022)) {
                if (DbY.A1Z(0Tu.A05, r4.A04.A00, 36322860550597229L)) {
                    AnonymousClass7TE.A1Z(new C59677JTi(r4, q8n, (AnonymousClass4D7) null, 8), SDh.A00());
                    return;
                }
                S8G.A01(q8n, r4);
            }
        }
    }

    public final void A0D(Q8n q8n) {
        C270254gR r4 = this.A0T;
        C7580QKv qKv = this.A04;
        Context context = qKv.A00;
        C340027ka r0 = qKv.A03;
        boolean z = false;
        if (!(r0 == null || r0.getIntent() == null || !qKv.A03.getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_USER_META_DISABLED", false))) {
            z = true;
        }
        Bundle A022 = qKv.A02();
        0qQ.A0B(r4, 0);
        if (context != null) {
            Q8n q8n2 = q8n;
            if (q8n != null) {
                C10860RzL rzL = r4.A00;
                0qQ.A0B(rzL, 1);
                String A023 = C11429STt.A02(q8n.A06);
                if (A023 != null && !((Set) rzL.A0I.A01).contains(A023)) {
                    if (DbY.A1Z(0Tu.A05, r4.A04.A00, 36322860550597229L)) {
                        AnonymousClass7TE.A1Z(new C20590WvT(r4, context, q8n2, A022, (AnonymousClass4D7) null, 0, z), SDh.A00());
                        return;
                    }
                    S8G.A00(context, A022, q8n, r4, z);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.QcV, android.view.View] */
    public final void A0E(SGp sGp) {
        String str;
        Integer num;
        FragmentActivity activity;
        if (this.A03 != null && this.A07 != null) {
            SGp sGp2 = sGp;
            A02(this, sGp2);
            if (sGp != null) {
                C270254gR r8 = this.A0T;
                C10860RzL rzL = r8.A00;
                JV5 jv5 = rzL.A0J;
                boolean z = false;
                if (jv5.A00 == RF6.NOT_OPT_IN) {
                    str = "ACCEPTED_PREFETCH";
                } else {
                    str = "ACCEPTED_AUTOFILL";
                }
                AutofillData autofillData = sGp2.A00;
                if (autofillData == null) {
                    num = AnonymousClass05K.A01;
                } else if (sGp2.A01 != null) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A00;
                }
                String A002 = S8H.A00(num);
                RRP A062 = A06(str);
                A062.A0H = A002;
                C7580QKv qKv = this.A04;
                C11364SPc.A03(qKv, A062);
                C61084JwM jwM = rzL.A0L;
                if (jwM.A02 == AnonymousClass05K.A0C) {
                    A062.A01("is_payment_soft_keyboard", "true");
                }
                jv5.A01 = true;
                CardDetails cardDetails = sGp2.A01;
                if (cardDetails != null) {
                    String str2 = cardDetails.A08;
                    if (str2 != null) {
                        A062.A0E = str2;
                    }
                } else {
                    jwM.A00 = AnonymousClass05K.A0N;
                }
                A062.A01("contact_autofill_accepted", String.valueOf(AnonymousClass7TF.A1V(autofillData)));
                if (cardDetails != null) {
                    z = true;
                }
                A062.A01("payment_autofill_accepted", String.valueOf(z));
                SUR.A0B(r8, qKv, A062);
                if (cardDetails != null) {
                    C340027ka r0 = qKv.A03;
                    if (r0 != null && (activity = r0.getActivity()) != null) {
                        ImmutableList immutableList = cardDetails.A01;
                        if (!(immutableList == null || immutableList.size() == 0)) {
                            TPJ tpj = new TPJ(0, cardDetails, this);
                            HashMap A1E = AnonymousClass7TE.A1E();
                            A1E.put("iab_session_id", rzL.A0P.A02);
                            TPH tph = new TPH(this, 2);
                            TPH tph2 = new TPH(this, 3);
                            0sL mbm = new MBM(this, 0);
                            Context context = qKv.A00;
                            1yd r13 = r8.A04;
                            C11290SJq sJq = r8.A01;
                            Bundle A022 = qKv.A02();
                            String str3 = cardDetails.A08;
                            0qQ.A0B(r13, 1);
                            if (!(context == null || str3 == null)) {
                                Set A032 = ImmutableSet.A03(immutableList);
                                if (r13.A08(true)) {
                                    sJq.A06("PROMPTED_PASSKEY_VERIFICATION", A022);
                                    0qQ.A0B(A032, 2);
                                    C229382nI A003 = IGContextProvider.A00(context);
                                    if (A003 != null) {
                                        ((OMB) SecurityProviderEphemeral.A00.invoke()).A01(new TWV(context, A003, str3, A1E, A032, tph2, tph, tpj, mbm));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        DefaultVaultService defaultVaultService = this.A0C;
                        AnonymousClass07Z A004 = A00(this);
                        S33 s33 = this.A09;
                        Bundle A023 = qKv.A02();
                        S0E s0e = new S0E(this);
                        0qQ.A0B(defaultVaultService, 1);
                        C270254gR r15 = r8;
                        AnonymousClass7TE.A1Z(new C59700JUh(A023, A004, s33, r15, defaultVaultService, s0e, activity, cardDetails, (AnonymousClass4D7) null, 2), SDh.A00());
                    }
                } else if (this.A07 != null) {
                    ((SystemWebView) this.A07).A04.autofill(SL8.A00(this.A03, r8.A04, sGp2.A01(), SDK.A07, SDK.A0A));
                    A02(this, sGp2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c3, code lost:
        if (r1 != 4) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r3 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0151, code lost:
        if (r2 == false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C7607QOp r11, com.fbpay.w3c.CardDetails r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "PAGE_START"
            boolean r9 = r13.equals(r0)
            if (r9 == 0) goto L_0x000c
            java.lang.Long r0 = r10.A0E
            if (r0 == 0) goto L_0x0018
        L_0x000c:
            java.lang.String r0 = "ALL_NAVIGATION"
            boolean r8 = r13.equals(r0)
            if (r8 == 0) goto L_0x0019
            boolean r0 = r10.A0O
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r3 = 0
            if (r11 != 0) goto L_0x0227
            r0 = r3
        L_0x001d:
            java.lang.String r4 = r12.A07
            if (r4 != 0) goto L_0x01e7
            if (r0 != 0) goto L_0x01d6
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_NUMBER"
            java.lang.String r0 = "UNDETECTED_CC_NUMBER"
            r2.put(r1, r0)
        L_0x002c:
            if (r11 != 0) goto L_0x01d2
            r0 = r3
        L_0x002f:
            java.lang.String r1 = r12.A09
            if (r1 != 0) goto L_0x01bb
            if (r0 != 0) goto L_0x01aa
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_CSC"
            java.lang.String r0 = "UNDETECTED_CC_CSC"
            r2.put(r1, r0)
        L_0x003e:
            if (r11 != 0) goto L_0x01a2
            r1 = r3
            r0 = r3
        L_0x0042:
            r7 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0049
            r2 = 0
            if (r3 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            if (r0 != 0) goto L_0x004f
            if (r3 != 0) goto L_0x004f
            r7 = 0
        L_0x004f:
            java.lang.Integer r5 = r12.A03
            java.lang.Integer r6 = r12.A04
            if (r5 != 0) goto L_0x0153
            if (r1 != 0) goto L_0x0151
            if (r6 != 0) goto L_0x0151
            if (r0 != 0) goto L_0x0151
            if (r3 != 0) goto L_0x0151
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNDETECTED_CC_EXP"
            java.lang.String r0 = "UNDETECTED_CC_EXP"
        L_0x0063:
            r2.put(r1, r0)
        L_0x0066:
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x0073
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_DECLINED_SAVE_ONCE"
            java.lang.String r0 = "DECLINED_SAVE_ONCE"
            r2.put(r1, r0)
        L_0x0073:
            X.4gR r3 = r10.A0T
            X.RzL r5 = r3.A00
            X.JV5 r0 = r5.A0J
            java.lang.Object r1 = r0.A00
            X.RF6 r0 = X.RF6.OPT_OUT
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x00a5
            X.QKv r6 = r10.A04
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r6.A0D
            if (r0 == 0) goto L_0x0094
            int r0 = r0.A00
            if (r0 != r7) goto L_0x0094
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_USER_OPTED_OUT_FROM_BROWSER_SETTINGS"
            java.lang.String r0 = "USER_OPTED_OUT_FROM_BROWSER_SETTINGS"
            r2.put(r1, r0)
        L_0x0094:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r6.A0D
            if (r0 == 0) goto L_0x009c
            int r0 = r0.A00
            if (r0 >= r7) goto L_0x00a5
        L_0x009c:
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_USER_OPTED_OUT_FROM_DECLINES"
            java.lang.String r0 = "USER_OPTED_OUT_FROM_DECLINES"
            r2.put(r1, r0)
        L_0x00a5:
            X.JwI r1 = r5.A0D
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = X.C11413SSl.A01(r0)
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            X.QKv r2 = r10.A04
            boolean r0 = r2.A0L(r4)
            java.util.List r0 = X.C11413SSl.A03(r1, r0)
            com.fbpay.w3c.CardDetails r0 = X.C11368SPm.A01(r12, r0)
            if (r0 == 0) goto L_0x00cc
            java.util.Map r4 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_BOUND_CARD_EXIST"
            java.lang.String r0 = "BOUND_CARD_EXIST"
            r4.put(r1, r0)
        L_0x00cc:
            com.fbpay.w3c.CardDetails r0 = X.C11368SPm.A01(r12, r5)
            if (r0 == 0) goto L_0x00db
            java.util.Map r4 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_UNBOUND_CARD_EXIST"
            java.lang.String r0 = "UNBOUND_CARD_EXIST"
            r4.put(r1, r0)
        L_0x00db:
            java.util.Map r1 = r10.A0J
            java.lang.String r0 = "NO_PROMPT_SAVE_REASONS_FOR_INTERNAL_SETTINGS"
            r10.A05(r1, r0)
            X.Q8n r0 = r10.A03
            if (r0 != 0) goto L_0x014a
            r4 = 0
        L_0x00e7:
            if (r9 == 0) goto L_0x0102
            java.util.Map r0 = r10.A0J
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "NO_PROMPTED_SAVE"
        L_0x00f3:
            X.RRP r0 = r10.A06(r0)
            r0.A0D = r4
            X.SUR.A0B(r3, r2, r0)
            java.util.Map r0 = r10.A0J
            r0.clear()
            return
        L_0x0102:
            if (r8 == 0) goto L_0x0116
            java.util.Map r0 = r10.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0113
            java.util.Map r1 = r10.A0J
            java.lang.String r0 = "AUTOFILL_ALL_NAVIGATION_FORM_COMPLETE"
            r1.put(r0, r0)
        L_0x0113:
            java.lang.String r0 = "AUTOFILL_ALL_NAVIGATION"
            goto L_0x00f3
        L_0x0116:
            java.lang.String r0 = "IAB_CLOSE"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0130
            java.util.Map r0 = r10.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x012d
            java.util.Map r1 = r10.A0J
            java.lang.String r0 = "AUTOFILL_IAB_CLOSE_FORM_COMPLETE"
            r1.put(r0, r0)
        L_0x012d:
            java.lang.String r0 = "AUTOFILL_IAB_CLOSE"
            goto L_0x00f3
        L_0x0130:
            java.lang.String r0 = "IAB_PAUSE"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.util.Map r0 = r10.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0147
            java.util.Map r1 = r10.A0J
            java.lang.String r0 = "AUTOFILL_IAB_PAUSE_FORM_COMPLETE"
            r1.put(r0, r0)
        L_0x0147:
            java.lang.String r0 = "AUTOFILL_IAB_PAUSE"
            goto L_0x00f3
        L_0x014a:
            java.lang.String r0 = r0.A06
            java.lang.String r4 = X.C11429STt.A02(r0)
            goto L_0x00e7
        L_0x0151:
            if (r2 != 0) goto L_0x0157
        L_0x0153:
            if (r6 != 0) goto L_0x0165
            if (r7 == 0) goto L_0x0165
        L_0x0157:
            java.util.Map r3 = r10.A0J
            java.lang.String r2 = "NO_SAVE_PROMPT_REASON_FORM_INCOMPLETE_CC_EXP"
            java.lang.String r0 = "FORM_INCOMPLETE_CC_EXP"
        L_0x015d:
            r3.put(r2, r0)
            if (r5 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            goto L_0x0189
        L_0x0165:
            if (r5 == 0) goto L_0x0182
            int r2 = r5.intValue()
            r0 = 1
            if (r0 > r2) goto L_0x0182
            r0 = 13
            if (r2 >= r0) goto L_0x0182
            if (r6 == 0) goto L_0x0182
            int r2 = r6.intValue()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 < r0) goto L_0x0182
            boolean r0 = X.C11391SRf.A04(r12)
            if (r0 != 0) goto L_0x0066
        L_0x0182:
            java.util.Map r3 = r10.A0J
            java.lang.String r2 = "NO_SAVE_PROMPT_REASON_INVALID_CC_EXP"
            java.lang.String r0 = "INVALID_CC_EXP"
            goto L_0x015d
        L_0x0189:
            java.lang.String r3 = "MMM"
            java.util.Locale r2 = X.AnonymousClass1Q2.A02()     // Catch:{ NullPointerException | ParseException -> 0x0066 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ NullPointerException | ParseException -> 0x0066 }
            r0.<init>(r3, r2)     // Catch:{ NullPointerException | ParseException -> 0x0066 }
            java.util.Date r0 = r0.parse(r1)     // Catch:{ NullPointerException | ParseException -> 0x0066 }
            if (r0 == 0) goto L_0x0066
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_ANDROID_MISSING_SHORT_MONTH_HANDLING"
            java.lang.String r0 = "ANDROID_MISSING_SHORT_MONTH_HANDLING"
            goto L_0x0063
        L_0x01a2:
            java.lang.String r1 = r11.A04
            java.lang.String r0 = r11.A05
            java.lang.String r3 = r11.A03
            goto L_0x0042
        L_0x01aa:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01c7
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_FORM_INCOMPLETE_CC_CSC"
            java.lang.String r0 = "FORM_INCOMPLETE_CC_CSC"
            r2.put(r1, r0)
            goto L_0x003e
        L_0x01bb:
            int r1 = r1.length()
            r0 = 3
            if (r1 == r0) goto L_0x003e
            r0 = 4
            if (r1 != r0) goto L_0x01c7
            goto L_0x003e
        L_0x01c7:
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_CSC"
            java.lang.String r0 = "INVALID_CC_CSC"
            r2.put(r1, r0)
            goto L_0x003e
        L_0x01d2:
            java.lang.String r0 = r11.A02
            goto L_0x002f
        L_0x01d6:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01e7
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_FORM_INCOMPLETE_CC_NUMBER"
            java.lang.String r0 = "FORM_INCOMPLETE_CC_NUMBER"
            r2.put(r1, r0)
            goto L_0x002c
        L_0x01e7:
            boolean r0 = X.C11391SRf.A02(r12)
            if (r0 != 0) goto L_0x01f6
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_INVALID_CC_NUMBER"
            java.lang.String r0 = "INVALID_CC_NUMBER"
            r2.put(r1, r0)
        L_0x01f6:
            if (r4 == 0) goto L_0x002c
            java.lang.String r1 = " "
            java.lang.String r0 = ""
            java.lang.String r2 = r4.replaceAll(r1, r0)
            int r1 = r2.length()
            r0 = 15
            if (r1 != r0) goto L_0x002c
            r1 = 48
        L_0x020a:
            char r0 = (char) r1
            java.lang.String r0 = X.002.A0C(r2, r0)
            boolean r0 = X.C11098S9z.A01(r0)
            if (r0 == 0) goto L_0x0220
            java.util.Map r2 = r10.A0J
            java.lang.String r1 = "NO_SAVE_PROMPT_REASON_ANDROID_MISSING_LAST_DIGIT_CARD_NUMBER"
            java.lang.String r0 = "ANDROID_MISSING_LAST_DIGIT_CARD_NUMBER"
            r2.put(r1, r0)
            goto L_0x002c
        L_0x0220:
            int r1 = r1 + 1
            r0 = 57
            if (r1 > r0) goto L_0x002c
            goto L_0x020a
        L_0x0227:
            java.lang.String r0 = r11.A01
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A0F(X.QOp, com.fbpay.w3c.CardDetails, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r22 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r34 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4 = r7.A0T;
        r3 = r4.A02;
        r3.A03(r6, "prompt_type", "CONTACT_AND_PAYMENT_AUTOFILL", 772805755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = r7.A0T;
        r3 = r4.A02;
        r3.A03(r6, "prompt_type", "PAYMENT_AUTOFILL", 772805755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r7.A0T;
        r3 = r4.A02;
        r3.A03(r6, "prompt_type", "CONTACT_AUTOFILL", 772805755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r2 = r4.A00;
        r1 = (X.RF6) r2.A0J.A00;
        r14 = "PROMPTED_AUTOFILL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r22 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r34 == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r21 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r34 == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r21 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r1 != X.RF6.NOT_OPT_IN) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r14 = "PROMPTED_PREFETCH";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r12 = r7.A04;
        r18 = X.C11413SSl.A03((java.util.List) r2.A0D.A00, r12.A0L(false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r7.A0S != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r18.isEmpty() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r22 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if ("PAYMENT_AUTOFILL".equals(X.C11392SRg.A02(r2)) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r11 = r4.A04;
        r10 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (X.DbY.A1Z(X.0Tu.A06, r10, 36322860546468409L) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r11.A0D(false) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r11.A08(false) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        if (X.DbY.A1Z(X.0Tu.A05, r10, 36322860546599482L) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r0 = r2.A0P.A03;
        r1 = X.C11429STt.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        if (r0 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        if (r1 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        X.JTP.A1R(r1, r7.A0V, true);
        r7.A0S = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r1 = A06(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (r12.A0H() != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r1.A0P = r13;
        X.SUR.A0B(r4, r12, r1);
        r3.A03(r6, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
        r3.A01(r6, (java.lang.Long) null, 772805755);
        r4 = X.AnonymousClass05K.A00;
        r3 = X.AnonymousClass05K.A01;
        X.RUI.A00(r2, new X.C59721JVf(new X.C61084JwM(r4, r3, r4, 3), r3));
        A04(r7, true, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        r21 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0107, code lost:
        r0 = X.S8H.A00(r21);
        r10 = A06(r14);
        r10.A0H = r0;
        r9 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r10.A0P = X.AnonymousClass7TF.A1Q(r9.A0H() ? 1 : 0);
        r11 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        if (r34 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r11 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (X.RUL.A00(r4.A03, new X.TPH(r7, 4)) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3.A03(r6, "prompt_name", "UsageBloksBottomSheetWithMerging", 772805755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        if (r32 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r28 = "BLOKS_PAYMENT_USAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r29.isEmpty() != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0145, code lost:
        r28 = "BLOKS_HYBRID_PAYMENT_USAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        r9.A07(r11, r10, r6, r21, r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0156, code lost:
        r20 = X.AnonymousClass7TE.A1D(r33);
        r19 = r9.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r29.isEmpty() != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        if (r34 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        r9.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0163, code lost:
        r18 = r9.A0L(false);
        r17 = r4.A04.A0E(false);
        r12 = r7.A0B;
        r11 = X.0Tu.A05;
        r16 = X.182.A06(r11, r12, 36310430910382147L);
        r15 = r9.A0J();
        r0 = X.182.A01(r11, r12, 36591905888731187L);
        r12 = new X.QKM();
        r11 = X.AnonymousClass7TE.A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r32 == null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
        r11.putParcelableArrayList("contact_entries", X.AnonymousClass7TE.A1D(r29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r11.putStringArrayList("requested_fields", X.AnonymousClass7TE.A1D(r20));
        r11.putBoolean("is_consent_accepted", r19);
        r11.putBoolean("should_always_show_ads_disclosure", r16);
        r11.putBoolean("should_show_fbpay_disclosure", r15);
        r11.putLong("disable_autofill_dismiss_option", r0);
        r11.putBoolean("disable_unbound_cards_usage", r18);
        r11.putBoolean("bypass_w3cclient", r17);
        r11.putBoolean("has_payment_entries", r8);
        r12.setArguments(r11);
        r12.A01 = r7;
        r12.A02 = r7.A09;
        r12.A00 = r4;
        r3.A03(r6, "prompt_name", "AutofillPaymentBottomSheetDialogFragment", 772805755);
        r9.A09(r12, r10, r6, r21, "AutofillPaymentBottomSheetDialogFragment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        if (r9.A0J() == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f5, code lost:
        if (r22 == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f7, code lost:
        r9.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fa, code lost:
        r4 = X.AnonymousClass05K.A00;
        X.RUI.A00(r2, new X.C59721JVf(new X.C61084JwM(r4, r21, r4, 3), X.AnonymousClass05K.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r34 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0G(java.lang.Integer r31, java.util.List r32, java.util.Set r33, boolean r34) {
        /*
            r30 = this;
            r7 = r30
            monitor-enter(r7)
            r15 = 1
            r13 = 0
            r29 = r32
            r8 = r34
            if (r32 == 0) goto L_0x0013
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x0210 }
            r22 = 1
            if (r0 == 0) goto L_0x0019
        L_0x0013:
            r22 = 0
            if (r34 != 0) goto L_0x0019
        L_0x0017:
            monitor-exit(r7)
            return
        L_0x0019:
            r5 = 772805755(0x2e10147b, float:3.276E-11)
            r6 = r31
            if (r22 == 0) goto L_0x0030
            if (r34 != 0) goto L_0x0023
            goto L_0x003d
        L_0x0023:
            X.4gR r4 = r7.A0T     // Catch:{ all -> 0x0210 }
            X.SJh r3 = r4.A02     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "prompt_type"
            java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
            goto L_0x0049
        L_0x0030:
            X.4gR r4 = r7.A0T     // Catch:{ all -> 0x0210 }
            X.SJh r3 = r4.A02     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "prompt_type"
            java.lang.String r0 = "PAYMENT_AUTOFILL"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
            goto L_0x0049
        L_0x003d:
            X.4gR r4 = r7.A0T     // Catch:{ all -> 0x0210 }
            X.SJh r3 = r4.A02     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "prompt_type"
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
        L_0x0049:
            X.RzL r2 = r4.A00     // Catch:{ all -> 0x0210 }
            X.JV5 r0 = r2.A0J     // Catch:{ all -> 0x0210 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0210 }
            X.RF6 r1 = (X.RF6) r1     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "PROMPTED_AUTOFILL"
            if (r22 == 0) goto L_0x0058
            if (r34 == 0) goto L_0x0105
            goto L_0x005d
        L_0x0058:
            java.lang.Integer r21 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0210 }
            if (r34 == 0) goto L_0x0107
            goto L_0x005f
        L_0x005d:
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0210 }
        L_0x005f:
            X.RF6 r0 = X.RF6.NOT_OPT_IN     // Catch:{ all -> 0x0210 }
            if (r1 != r0) goto L_0x0065
            java.lang.String r14 = "PROMPTED_PREFETCH"
        L_0x0065:
            X.JwI r0 = r2.A0D     // Catch:{ all -> 0x0210 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0210 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0210 }
            X.QKv r12 = r7.A04     // Catch:{ all -> 0x0210 }
            boolean r0 = r12.A0L(r13)     // Catch:{ all -> 0x0210 }
            java.util.List r18 = X.C11413SSl.A03(r1, r0)     // Catch:{ all -> 0x0210 }
            boolean r0 = r7.A0S     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x0107
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x0107
            if (r22 == 0) goto L_0x008d
            java.lang.String r1 = "PAYMENT_AUTOFILL"
            java.lang.String r0 = X.C11392SRg.A02(r2)     // Catch:{ all -> 0x0210 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0107
        L_0x008d:
            X.1yd r11 = r4.A04     // Catch:{ all -> 0x0210 }
            com.instagram.common.session.UserSession r10 = r11.A00     // Catch:{ all -> 0x0210 }
            X.0Tu r9 = X.0Tu.A06     // Catch:{ all -> 0x0210 }
            r16 = 36322860546468409(0x810b7300192a39, double:3.034061497781809E-306)
            r0 = r16
            boolean r0 = X.DbY.A1Z(r9, r10, r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0107
            boolean r0 = r11.A0D(r13)     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x0107
            boolean r0 = r11.A08(r13)     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x0107
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x0210 }
            r0 = 36322860546599482(0x810b73001b2a3a, double:3.0340614978647E-306)
            boolean r0 = X.DbY.A1Z(r9, r10, r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0107
            X.Jvc r0 = r2.A0P     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = X.C11429STt.A02(r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00cc
            java.util.Map r0 = r7.A0V     // Catch:{ all -> 0x0210 }
            X.JTP.A1R(r1, r0, r15)     // Catch:{ all -> 0x0210 }
            r7.A0S = r15     // Catch:{ all -> 0x0210 }
        L_0x00cc:
            X.RRP r1 = r7.A06(r14)     // Catch:{ all -> 0x0210 }
            boolean r0 = r12.A0H()     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x00d7
            r13 = 1
        L_0x00d7:
            r1.A0P = r13     // Catch:{ all -> 0x0210 }
            X.SUR.A0B(r4, r12, r1)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
            r0 = 0
            r3.A01(r6, r0, r5)     // Catch:{ all -> 0x0210 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0210 }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0210 }
            r0 = 3
            X.JwM r1 = new X.JwM     // Catch:{ all -> 0x0210 }
            r1.<init>((java.lang.Integer) r4, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r0)     // Catch:{ all -> 0x0210 }
            X.JVf r0 = new X.JVf     // Catch:{ all -> 0x0210 }
            r0.<init>((X.C61084JwM) r1, (java.lang.Integer) r3)     // Catch:{ all -> 0x0210 }
            X.RUI.A00(r2, r0)     // Catch:{ all -> 0x0210 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x0210 }
            r0 = r18
            A04(r7, r1, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0017
        L_0x0105:
            java.lang.Integer r21 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0210 }
        L_0x0107:
            java.lang.String r0 = X.S8H.A00(r21)     // Catch:{ all -> 0x0210 }
            X.RRP r10 = r7.A06(r14)     // Catch:{ all -> 0x0210 }
            r10.A0H = r0     // Catch:{ all -> 0x0210 }
            X.QKv r9 = r7.A04     // Catch:{ all -> 0x0210 }
            boolean r0 = r9.A0H()     // Catch:{ all -> 0x0210 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r10.A0P = r0     // Catch:{ all -> 0x0210 }
            android.content.Context r11 = r9.A00     // Catch:{ all -> 0x0210 }
            if (r34 == 0) goto L_0x0156
            if (r11 == 0) goto L_0x0156
            X.Ro4 r12 = r4.A03     // Catch:{ all -> 0x0210 }
            r1 = 4
            X.TPH r0 = new X.TPH     // Catch:{ all -> 0x0210 }
            r0.<init>((X.STY) r7, (int) r1)     // Catch:{ all -> 0x0210 }
            boolean r0 = X.RUL.A00(r12, r0)     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "UsageBloksBottomSheetWithMerging"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
            if (r32 == 0) goto L_0x013c
            goto L_0x013f
        L_0x013c:
            java.lang.String r28 = "BLOKS_PAYMENT_USAGE"
            goto L_0x0147
        L_0x013f:
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x013c
            java.lang.String r28 = "BLOKS_HYBRID_PAYMENT_USAGE"
        L_0x0147:
            r23 = r9
            r24 = r11
            r25 = r10
            r26 = r6
            r27 = r21
            r23.A07(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0210 }
            goto L_0x01ef
        L_0x0156:
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1D(r33)     // Catch:{ all -> 0x0210 }
            boolean r19 = r9.A0H()     // Catch:{ all -> 0x0210 }
            if (r34 == 0) goto L_0x0163
            r9.A0J()     // Catch:{ all -> 0x0210 }
        L_0x0163:
            boolean r18 = r9.A0L(r13)     // Catch:{ all -> 0x0210 }
            X.1yd r0 = r4.A04     // Catch:{ all -> 0x0210 }
            boolean r17 = r0.A0E(r13)     // Catch:{ all -> 0x0210 }
            com.instagram.common.session.UserSession r12 = r7.A0B     // Catch:{ all -> 0x0210 }
            X.0Tu r11 = X.0Tu.A05     // Catch:{ all -> 0x0210 }
            r0 = 36310430910382147(0x810025000e0043, double:3.0262009458707296E-306)
            boolean r16 = X.182.A06(r11, r12, r0)     // Catch:{ all -> 0x0210 }
            boolean r15 = r9.A0J()     // Catch:{ all -> 0x0210 }
            r0 = 36591905888731187(0x82002500270033, double:3.2042068555874263E-306)
            long r0 = X.182.A01(r11, r12, r0)     // Catch:{ all -> 0x0210 }
            X.QKI r12 = new X.QKI     // Catch:{ all -> 0x0210 }
            r12.<init>()     // Catch:{ all -> 0x0210 }
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()     // Catch:{ all -> 0x0210 }
            if (r32 == 0) goto L_0x019b
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1D(r29)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "contact_entries"
            r11.putParcelableArrayList(r13, r14)     // Catch:{ all -> 0x0210 }
        L_0x019b:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1D(r20)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "requested_fields"
            r11.putStringArrayList(r13, r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "is_consent_accepted"
            r13 = r19
            r11.putBoolean(r14, r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "should_always_show_ads_disclosure"
            r13 = r16
            r11.putBoolean(r14, r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "should_show_fbpay_disclosure"
            r11.putBoolean(r14, r15)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "disable_autofill_dismiss_option"
            r11.putLong(r13, r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "disable_unbound_cards_usage"
            r0 = r18
            r11.putBoolean(r1, r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "bypass_w3cclient"
            r0 = r17
            r11.putBoolean(r1, r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "has_payment_entries"
            r11.putBoolean(r0, r8)     // Catch:{ all -> 0x0210 }
            r12.setArguments(r11)     // Catch:{ all -> 0x0210 }
            r12.A01 = r7     // Catch:{ all -> 0x0210 }
            X.S33 r0 = r7.A09     // Catch:{ all -> 0x0210 }
            r12.A02 = r0     // Catch:{ all -> 0x0210 }
            r12.A00 = r4     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "prompt_name"
            java.lang.String r0 = "AutofillPaymentBottomSheetDialogFragment"
            r3.A03(r6, r1, r0, r5)     // Catch:{ all -> 0x0210 }
            r11 = r9
            r13 = r10
            r14 = r6
            r15 = r21
            r16 = r0
            r11.A09(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0210 }
        L_0x01ef:
            boolean r0 = r9.A0J()     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x01fa
            if (r22 == 0) goto L_0x01fa
            r9.A06()     // Catch:{ all -> 0x0210 }
        L_0x01fa:
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0210 }
            r1 = 3
            X.JwM r3 = new X.JwM     // Catch:{ all -> 0x0210 }
            r0 = r21
            r3.<init>((java.lang.Integer) r4, (java.lang.Integer) r0, (java.lang.Integer) r4, (int) r1)     // Catch:{ all -> 0x0210 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0210 }
            X.JVf r0 = new X.JVf     // Catch:{ all -> 0x0210 }
            r0.<init>((X.C61084JwM) r3, (java.lang.Integer) r1)     // Catch:{ all -> 0x0210 }
            X.RUI.A00(r2, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0017
        L_0x0210:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A0G(java.lang.Integer, java.util.List, java.util.Set, boolean):void");
    }

    public final void A0H(String str, Integer num) {
        String str2;
        if (str.contains("SHOW_") && str.contains("_DIALOG")) {
            String A0R2 = 002.A0R("SUPPRESSED_", str.replace("SHOW_", "").replace("_DIALOG", ""));
            if (str.contains("OPT_IN")) {
                A0R2 = "SUPPRESSED_SAVE";
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            if (num.intValue() != 0) {
                str2 = "SuppressAndDeferToClose";
            } else {
                str2 = "SuppressIndefinitely";
            }
            A1E.put("suppress_strategy_type", str2);
            RRP A062 = A06(A0R2);
            A062.A02(A1E);
            SUR.A0A(this.A04.A02(), this.A0T, A062.A00());
        }
    }

    public final boolean A0I() {
        ArrayList arrayList;
        C270254gR r2 = this.A0T;
        boolean A082 = r2.A04.A08(true);
        List<W3CCardDetail> list = (List) r2.A00.A0D.A00;
        if (!A082) {
            return AnonymousClass7TE.A1b(C11413SSl.A03(list, this.A04.A0L(false)));
        }
        boolean A0L2 = this.A04.A0L(false);
        0qQ.A0B(list, 0);
        if (!A0L2) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (W3CCardDetail w3CCardDetail : list) {
                arrayList.add(w3CCardDetail.A00);
            }
        } else {
            ArrayList<W3CCardDetail> A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                W3CCardDetail w3CCardDetail2 = (W3CCardDetail) next;
                if (0qQ.A0K(C11413SSl.A00(w3CCardDetail2), MessageAvailabilityResponseId$Companion.AVAILABLE) || AnonymousClass7TF.A1Y(w3CCardDetail2.A01, true)) {
                    A1C.add(next);
                }
            }
            arrayList = AnonymousClass7TF.A0p(A1C);
            for (W3CCardDetail w3CCardDetail3 : A1C) {
                arrayList.add(w3CCardDetail3.A00);
            }
        }
        return AnonymousClass7TE.A1b(arrayList);
    }

    public final boolean A0J() {
        C10860RzL rzL = this.A0T.A00;
        if (C11392SRg.A02(rzL).equals("CONTACT_AND_PAYMENT_AUTOFILL") && !this.A0F.isEmpty()) {
            List list = (List) rzL.A0D.A00;
            0qQ.A0B(list, 0);
            if (!C11413SSl.A02(list).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0495, code lost:
        if (r27.equals("PROMPTED_ADD_NEW_CARD") != false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04bb, code lost:
        if (r5 == null) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04c1, code lost:
        if (r47.A00() == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04c3, code lost:
        r7.A01("has_preselected_checkbox_for_passkey_creation", java.lang.String.valueOf(X.AnonymousClass7TE.A0q(r2.A03.A00).getBoolean("is_passkey_content_visible", false)));
        r14 = r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (((java.util.List) r0.A03.A02).contains(X.REJ.AUTOFILL) != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        if (r4 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        r4 = r2.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0K(com.facebook.browser.lite.extensions.autofill.model.AutofillData r49, java.lang.String r50, boolean r51) {
        /*
            r48 = this;
            r3 = r48
            r26 = r49
            X.4gR r2 = r3.A0T
            X.1yd r0 = r2.A04
            r47 = r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r10 = X.0Tu.A05
            r4 = 36322860551252598(0x810b7300622a76, double:3.034061500807349E-306)
            boolean r0 = X.DbY.A1Z(r10, r9, r4)
            if (r0 == 0) goto L_0x0031
            X.RzL r0 = r2.A00
            X.0qQ.A0B(r0, r1)
            X.JwM r0 = r0.A03
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            X.REJ r0 = X.REJ.AUTOFILL
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            return r1
        L_0x0031:
            X.SJh r0 = r2.A02
            r36 = r0
            r15 = 772805755(0x2e10147b, float:3.276E-11)
            r25 = 0
            r4 = r0
            r0 = r25
            java.lang.Integer r24 = r4.A00(r0, r15, r1)
            if (r51 == 0) goto L_0x004b
            X.RzL r4 = r2.A00
            X.QP6 r0 = r4.A07
            if (r0 == 0) goto L_0x004b
            r4.A05 = r0
        L_0x004b:
            X.RzL r0 = r2.A00
            X.0qQ.A0B(r0, r1)
            X.QP6 r4 = r0.A05
            java.lang.Object r8 = r4.A01
            X.QOp r8 = (X.C7607QOp) r8
            if (r8 == 0) goto L_0x0030
            java.lang.String r4 = r8.A01
            if (r4 == 0) goto L_0x0079
            java.lang.String r17 = X.RUM.A00(r4)
            java.lang.String r7 = r8.A02
            java.lang.String r6 = r8.A04
            java.lang.String r5 = r8.A05
            java.lang.String r4 = r8.A03
            X.QOp r8 = new X.QOp
            r16 = r8
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0079:
            X.QP6 r4 = r0.A05
            r4.A01 = r8
            com.fbpay.w3c.CardDetails r6 = X.C11391SRf.A00(r8)
            X.SJq r7 = r2.A01
            java.lang.Long r5 = r3.A0E
            if (r5 != 0) goto L_0x0193
            r11 = 0
        L_0x0089:
            X.QKv r8 = r3.A04
            android.os.Bundle r5 = r8.A02()
            r23 = 1
            java.lang.String r13 = X.C11392SRg.A02(r0)
            java.lang.String r4 = "CONTACT_AUTOFILL"
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x0146
            X.QP6 r4 = r0.A06
            java.lang.Object r13 = r4.A00
            java.util.Set r13 = (java.util.Set) r13
            boolean r4 = r13.isEmpty()
            if (r4 != 0) goto L_0x0146
            java.util.Iterator r14 = r13.iterator()
        L_0x00ad:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0111
            java.lang.String r13 = X.AnonymousClass7TE.A18(r14)
            int r4 = r13.hashCode()
            switch(r4) {
                case -1856205482: goto L_0x0138;
                case -1502393158: goto L_0x00fc;
                case -1367813370: goto L_0x00e5;
                case -1367811280: goto L_0x00bf;
                case 659680675: goto L_0x00cc;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00ad
        L_0x00bf:
            java.lang.String r4 = "cc-exp"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00ad
            boolean r4 = X.C11391SRf.A04(r6)
            goto L_0x0144
        L_0x00cc:
            java.lang.String r4 = "cc-exp-month"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00ad
            java.lang.Integer r4 = r6.A03
            if (r4 == 0) goto L_0x0146
            int r13 = r4.intValue()
            r4 = r23
            if (r4 > r13) goto L_0x0146
            r4 = 13
            if (r13 >= r4) goto L_0x0146
            goto L_0x00ad
        L_0x00e5:
            java.lang.String r4 = "cc-csc"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = r6.A09
            if (r4 == 0) goto L_0x0146
            int r13 = r4.length()
            r4 = 3
            if (r13 == r4) goto L_0x00ad
            r4 = 4
            if (r13 != r4) goto L_0x0146
            goto L_0x00ad
        L_0x00fc:
            java.lang.String r4 = "cc-exp-year"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00ad
            java.lang.Integer r4 = r6.A04
            if (r4 == 0) goto L_0x0146
            int r13 = r4.intValue()
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r13 < r4) goto L_0x0146
            goto L_0x00ad
        L_0x0111:
            X.1yd r13 = r7.A01
            r4 = r23
            r13.A0C(r4)
            boolean r4 = X.SPo.A03(r13, r1)
            if (r4 == 0) goto L_0x0133
            java.lang.Integer r13 = X.AnonymousClass05K.A01
        L_0x0120:
            java.lang.Long r14 = java.lang.Long.valueOf(r11)
            r12 = 503(0x1f7, float:7.05E-43)
            X.GnK r11 = new X.GnK
            r4 = r25
            r11.<init>(r14, r4, r12)
            java.lang.String r4 = "FORM_COMPLETION"
            r7.A02(r5, r11, r13, r4)
            goto L_0x0146
        L_0x0133:
            java.lang.Integer r13 = X.C11392SRg.A00(r0)
            goto L_0x0120
        L_0x0138:
            java.lang.String r4 = "cc-number"
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x00ad
            boolean r4 = X.C11391SRf.A02(r6)
        L_0x0144:
            if (r4 != 0) goto L_0x00ad
        L_0x0146:
            boolean r12 = X.C11391SRf.A03(r6)
            X.JwI r4 = r0.A0D
            r28 = r4
            java.lang.Object r4 = r4.A00
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r11 = X.C11413SSl.A01(r4)
            r4 = r50
            boolean r4 = r8.A0K(r4)
            r7 = 1
            if (r4 != 0) goto L_0x016c
            boolean r4 = r3.A0M
            if (r4 != 0) goto L_0x016c
            boolean r4 = X.C11391SRf.A03(r6)
            if (r4 != 0) goto L_0x016d
            X.C11391SRf.A02(r6)
        L_0x016c:
            r7 = 0
        L_0x016d:
            java.lang.String r5 = "PAGE_START"
            if (r7 == 0) goto L_0x04ff
            if (r12 == 0) goto L_0x01a0
            com.fbpay.w3c.CardDetails r7 = X.C11368SPm.A01(r6, r11)
            boolean r4 = r8.A0L(r1)
            if (r4 == 0) goto L_0x01a0
            if (r7 == 0) goto L_0x01a0
            java.lang.String r7 = r7.A08
            if (r7 == 0) goto L_0x01a0
            java.lang.String r4 = r6.A07
            if (r4 == 0) goto L_0x01a0
            X.2IJ r0 = X.AnonymousClass2IK.A04
            X.S7C r2 = r0.A02()
            java.lang.String r0 = "IAB_AUTOFILL_SILENT_BINDING"
            r2.A02(r7, r4, r0)
            return r1
        L_0x0193:
            X.0JP r4 = r3.A08
            long r11 = r4.now()
            long r4 = r5.longValue()
            long r11 = r11 - r4
            goto L_0x0089
        L_0x01a0:
            X.JV5 r11 = r0.A0J
            java.lang.Object r7 = r11.A00
            X.RF6 r4 = X.RF6.OPT_OUT
            if (r7 == r4) goto L_0x04ff
            r4 = r28
            java.lang.Object r12 = r4.A00
            java.util.List r12 = (java.util.List) r12
            boolean r4 = r8.A0L(r1)
            java.util.List r12 = X.C11413SSl.A03(r12, r4)
            X.RF6 r4 = X.RF6.OPT_IN
            boolean r7 = X.AnonymousClass7TF.A1W(r7, r4)
            boolean r4 = r8.A0Q
            if (r4 == 0) goto L_0x0238
            if (r7 == 0) goto L_0x0235
            com.fbpay.w3c.CardDetails r4 = X.C11368SPm.A01(r6, r12)
            if (r4 != 0) goto L_0x0238
            X.RDs r12 = X.C8876RDs.SHOW_SAVE_DIALOG
        L_0x01ca:
            X.RDs r4 = X.C8876RDs.DO_NOTHING
            if (r12 == r4) goto L_0x04ff
            X.JwI r7 = r0.A0F
            X.0qQ.A0B(r7, r1)
            java.lang.Object r4 = r7.A00
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Integer r5 = X.Pxe.A0n()
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x01fd
            java.lang.Object r4 = r7.A00
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Number r4 = X.C51966G9m.A14(r5, r4)
            r5 = 17
            if (r4 == 0) goto L_0x01fd
            int r4 = r4.intValue()
            if (r4 != r5) goto L_0x01fd
        L_0x01f3:
            java.lang.String r2 = r12.name()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0H(r2, r0)
            return r1
        L_0x01fd:
            boolean r4 = X.Pxf.A1T(r10, r9)
            if (r4 != 0) goto L_0x020f
            r13 = 36322860550269544(0x810b7300532a68, double:3.034061500185662E-306)
            boolean r4 = X.DbY.A1Z(r10, r9, r13)
            if (r4 == 0) goto L_0x020f
            goto L_0x01f3
        L_0x020f:
            r4 = r47
            boolean r4 = X.RUR.A00(r0, r4)
            if (r4 != 0) goto L_0x01f3
            X.Jvc r4 = r0.A0P
            boolean r4 = r4.A04
            if (r4 != 0) goto L_0x023b
            r5 = r47
            r4 = r23
            boolean r4 = X.SPo.A02(r0, r5, r4)
            if (r4 == 0) goto L_0x023b
            X.JwI r0 = r0.A0H
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0.A00 = r2
            java.lang.String r0 = r12.name()
            r3.A0H(r0, r2)
            return r1
        L_0x0235:
            X.RDs r12 = X.C8876RDs.SHOW_OPT_IN_DIALOG
            goto L_0x01ca
        L_0x0238:
            X.RDs r12 = X.C8876RDs.DO_NOTHING
            goto L_0x01ca
        L_0x023b:
            java.lang.String r13 = "showSaveAutofillDialogStart"
            r7 = r36
            r5 = r24
            r4 = r25
            r7.A02(r5, r4, r13, r15)
            if (r49 != 0) goto L_0x04fb
            java.lang.String r13 = "SAVE_PAYMENT_AUTOFILL"
        L_0x024b:
            java.lang.String r7 = "prompt_type"
            r5 = r36
            r4 = r24
            r5.A03(r4, r7, r13, r15)
            java.lang.Object r5 = r11.A00
            X.RF6 r4 = X.RF6.NOT_OPT_IN
            java.lang.String r22 = "PROMPTED_SAVE"
            java.lang.String r21 = "PROMPTED_ADD_NEW_CARD"
            java.lang.String r16 = "PROMPTED_RE_OPT_IN"
            r27 = r21
            if (r5 != r4) goto L_0x0265
            r27 = r22
        L_0x0265:
            if (r49 != 0) goto L_0x04f7
            java.lang.String r5 = "PAYMENT_AUTOFILL"
        L_0x0269:
            r29 = -1
            r4 = r27
            X.RRP r7 = r3.A06(r4)
            r7.A0H = r5
            X.C11364SPc.A03(r8, r7)
            X.SGp r5 = new X.SGp
            r4 = r26
            r5.<init>(r4, r6)
            java.lang.String r4 = X.S8J.A00(r5)
            r7.A07 = r4
            X.SHz r14 = r7.A00()
            android.content.Context r4 = r8.A00
            r13 = r4
            if (r49 == 0) goto L_0x04f3
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
        L_0x028e:
            java.lang.String r19 = "prompt_name"
            if (r4 == 0) goto L_0x0389
            r5 = r16
            r4 = r27
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0389
            X.Ro4 r4 = r2.A03
            r17 = r4
            r4 = 5
            X.TPH r5 = new X.TPH
            r5.<init>((X.STY) r3, (int) r4)
            r4 = r17
            boolean r4 = X.RUL.A00(r4, r5)
            if (r4 == 0) goto L_0x0389
            java.lang.String r28 = "BLOKS_REQUEST_PROMPT_PAYMENT_SAVE"
            r27 = r3
            r31 = r29
            r33 = r23
            X.RRP r4 = r27.A07(r28, r29, r31, r33)
            X.SUR.A0B(r2, r8, r4)
            java.lang.String r9 = "SavePaymentBloksBottomSheet"
            r7 = r36
            r5 = r24
            r4 = r19
            r7.A03(r5, r4, r9, r15)
            com.instagram.common.session.UserSession r7 = r3.A0B
            X.S0G r4 = new X.S0G
            r4.<init>(r7)
            X.QK7 r5 = new X.QK7
            r5.<init>(r2, r4)
            if (r7 == 0) goto L_0x0385
            java.lang.String r4 = r7.A06
            java.lang.String r41 = X.Pxf.A0k(r4)
        L_0x02dd:
            android.os.Bundle r4 = r8.A02()
            X.RDs r7 = X.C8876RDs.SHOW_SAVE_DIALOG
            boolean r46 = X.AnonymousClass7TF.A1W(r12, r7)
            java.util.HashMap r43 = X.SUR.A06(r4, r14)
            boolean r7 = r8.A0H()
            r9 = r7 ^ 1
            boolean r7 = r8.A0J()
            X.S4q r34 = r8.A04(r9, r7)
            android.os.Bundle r7 = r8.A02()
            X.Hlv r12 = new X.Hlv
            r12.<init>(r7, r2, r3)
            X.SRY r16 = X.SRY.A00()
            X.QLA r7 = r3.A07
            X.Ho7 r32 = new X.Ho7
            r14 = r32
            r15 = r4
            r17 = r2
            r18 = r8
            r19 = r3
            r20 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r9 = X.C51972G9s.A0n()
            X.4gR r3 = r5.A00
            X.SJq r11 = r3.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r7 = "PAYMENT_SAVE"
            r11.A03(r4, r2, r7, r9)
            X.S7D r8 = new X.S7D
            r8.<init>(r3)
            r8.A01(r2, r2, r9)
            r8.A00()
            java.util.Set r7 = r5.A02()
            r8.A03(r7)
            java.lang.String r3 = r6.A07
            if (r3 != 0) goto L_0x033f
            java.lang.String r3 = ""
        L_0x033f:
            X.SQx r10 = X.C9915RjU.A00
            r2 = r26
            java.util.LinkedHashMap r44 = r10.A03(r2)
            X.TTf r2 = new X.TTf
            r27 = r2
            r28 = r13
            r29 = r4
            r30 = r12
            r31 = r5
            r33 = r8
            r35 = r11
            r37 = r26
            r38 = r6
            r39 = r24
            r40 = r3
            r42 = r9
            r45 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.1TZ r5 = X.1TZ.A00()
            X.Wlm r4 = new X.Wlm
            r4.<init>(r13, r2)
            r5.execute(r4)
        L_0x0372:
            X.QP6 r2 = new X.QP6
            r2.<init>()
            r0.A05 = r2
            r2 = r47
            boolean r1 = X.SPo.A02(r0, r2, r1)
            if (r1 == 0) goto L_0x0384
            X.RUJ.A00(r0)
        L_0x0384:
            return r23
        L_0x0385:
            java.lang.String r41 = ""
            goto L_0x02dd
        L_0x0389:
            boolean r18 = r8.A0H()
            r5 = r16
            r4 = r27
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x03c3
            boolean r4 = r8.A0H()
            if (r4 != 0) goto L_0x03c3
            X.0Tu r13 = X.0Tu.A06
            r16 = 36322860550400618(0x810b7300552a6a, double:3.034061500268554E-306)
            r4 = r16
            boolean r4 = X.DbY.A1Z(r13, r9, r4)
            if (r4 != 0) goto L_0x03b9
            r16 = 36322860550335081(0x810b7300542a69, double:3.034061500227108E-306)
            r4 = r16
            boolean r4 = X.DbY.A1Z(r13, r9, r4)
            if (r4 == 0) goto L_0x03c3
        L_0x03b9:
            r7.A0P = r1
            X.SHz r14 = r7.A00()
            r11.A01 = r1
            r18 = 1
        L_0x03c3:
            com.instagram.common.session.UserSession r9 = r3.A0B
            r16 = 36310430910382147(0x810025000e0043, double:3.0262009458707296E-306)
            r4 = r16
            boolean r13 = X.182.A06(r10, r9, r4)
            if (r49 == 0) goto L_0x03e7
            boolean r4 = r26.A03()
            if (r4 != 0) goto L_0x03e7
            r16 = 36310430913134685(0x8100250038005d, double:3.026200947611446E-306)
            r4 = r16
            boolean r4 = X.182.A06(r10, r9, r4)
            if (r4 != 0) goto L_0x03e7
            r26 = 0
        L_0x03e7:
            r16 = 36591905888731187(0x82002500270033, double:3.2042068555874263E-306)
            r4 = r16
            long r16 = X.182.A01(r10, r9, r4)
            com.instagram.common.session.UserSession r10 = r8.A0d
            X.0Tu r9 = X.0Tu.A06
            r4 = 36319252772297818(0x81082b00001c5a, double:3.0317799268689866E-306)
            boolean r11 = X.182.A06(r9, r10, r4)
            X.QKQ r9 = new X.QKQ
            r9.<init>()
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()
            com.facebook.base.activity.parcel.OpaqueParcelable r5 = X.0B0.A00(r26)
            java.lang.String r4 = "contact_info"
            r10.putParcelable(r4, r5)
            com.facebook.base.activity.parcel.OpaqueParcelable r5 = X.0B0.A00(r6)
            java.lang.String r4 = "payment_info"
            r10.putParcelable(r4, r5)
            java.lang.String r4 = "action"
            r10.putSerializable(r4, r12)
            java.lang.String r5 = "is_consent_accepted"
            r4 = r18
            r10.putBoolean(r5, r4)
            java.lang.String r5 = "should_always_show_ads_disclosure"
            r10.putBoolean(r5, r13)
            java.lang.String r6 = "disable_autofill_dismiss_option"
            r4 = r16
            r10.putLong(r6, r4)
            java.lang.String r4 = "autofill_show_unified_wallet_disclaimer_enabled"
            r10.putBoolean(r4, r11)
            r9.setArguments(r10)
            r9.A00 = r2
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r4 = r20
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x04e7
            r4 = r47
            boolean r4 = r4.A0C(r1)
            if (r4 == 0) goto L_0x04e7
            X.JwI r4 = r0.A0C
            java.lang.Object r5 = r4.A00
            X.JwI r5 = (X.C61080JwI) r5
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r5.A00 = r4
        L_0x045a:
            java.lang.Object r4 = r5.A00
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x046d
            java.lang.String r5 = X.S8H.A01(r4)
            java.lang.String r4 = "displayed_prompt_type"
            r7.A01(r4, r5)
            X.SHz r14 = r7.A00()
        L_0x046d:
            r9.A01 = r3
            java.lang.String r6 = "SaveAutofillPaymentBottomSheetDialogFragment"
            r5 = r36
            r4 = r24
            r3 = r19
            r5.A03(r4, r3, r6, r15)
            r10 = r25
            r11 = r4
            r12 = r20
            r13 = r6
            r8.A09(r9, r10, r11, r12, r13)
            r4 = r22
            r3 = r27
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0497
            r4 = r21
            r3 = r27
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x04de
        L_0x0497:
            r3 = r28
            java.lang.Object r3 = r3.A00
            java.util.List r3 = (java.util.List) r3
            X.0qQ.A0B(r3, r1)
            java.util.Iterator r6 = r3.iterator()
        L_0x04a4:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x04bd
            java.lang.Object r5 = r6.next()
            r3 = r5
            com.fbpay.w3c.W3CCardDetail r3 = (com.fbpay.w3c.W3CCardDetail) r3
            java.lang.Boolean r4 = r3.A01
            r3 = r23
            boolean r3 = X.AnonymousClass7TF.A1Y(r4, r3)
            if (r3 == 0) goto L_0x04a4
            if (r5 != 0) goto L_0x04de
        L_0x04bd:
            boolean r3 = r47.A00()
            if (r3 == 0) goto L_0x04de
            X.Ro4 r3 = r2.A03
            com.instagram.common.session.UserSession r3 = r3.A00
            X.0xa r4 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r3 = "is_passkey_content_visible"
            boolean r3 = r4.getBoolean(r3, r1)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "has_preselected_checkbox_for_passkey_creation"
            r7.A01(r3, r4)
            X.SHz r14 = r7.A00()
        L_0x04de:
            android.os.Bundle r3 = r8.A02()
            X.SUR.A0A(r3, r2, r14)
            goto L_0x0372
        L_0x04e7:
            X.JwI r4 = r0.A0C
            java.lang.Object r5 = r4.A00
            X.JwI r5 = (X.C61080JwI) r5
            r4 = r20
            r5.A00 = r4
            goto L_0x045a
        L_0x04f3:
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            goto L_0x028e
        L_0x04f7:
            java.lang.String r5 = "CONTACT_AND_PAYMENT_AUTOFILL"
            goto L_0x0269
        L_0x04fb:
            java.lang.String r13 = "SAVE_CONTACT_AND_PAYMENT_AUTOFILL"
            goto L_0x024b
        L_0x04ff:
            X.QP6 r0 = r0.A05
            java.lang.Object r0 = r0.A04
            X.QOp r0 = (X.C7607QOp) r0
            r3.A0F(r0, r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STY.A0K(com.facebook.browser.lite.extensions.autofill.model.AutofillData, java.lang.String, boolean):boolean");
    }

    private void A05(Map map, String str) {
        if (!map.isEmpty()) {
            HashMap A19 = Pxe.A19(map);
            A19.put("user_action", str);
            SRY.A01(this.A04.A02(), A19);
        }
    }
}
