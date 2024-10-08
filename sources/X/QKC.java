package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.Collections;
import java.util.List;

public abstract class QKC extends QKM {
    public AutofillSharedJSBridgeProxy A00;
    public S5W A01;
    public C270254gR A02;
    public C7580QKv A03;
    public 1yd A04;
    public RequestAutofillJSBridgeCall A05;
    public String A06;
    public String A07;
    public List A08 = Collections.emptyList();
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final void A0H(RRP rrp) {
        C7580QKv qKv;
        C11021S5u s5u;
        if (A0I(false) && (qKv = this.A03) != null && (s5u = qKv.A09) != null) {
            rrp.A01("automatic_autofill_consent_toggle_status_on", String.valueOf(s5u.A00.A00.A00.A01));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (r1 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r7) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.String r1 = "DECLINED_AUTOFILL"
            X.S5W r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x0094
            X.RRP r2 = r0.A00(r1, r5)
            java.lang.String r0 = r6.A07
            r2.A0A = r0
            r4 = 1
            java.util.List r1 = r6.A08
            int r0 = r1.size()
            int r0 = java.lang.Math.min(r0, r4)
            java.util.List r0 = r1.subList(r5, r0)
            java.lang.String r0 = X.SUR.A01(r0)
            r2.A07 = r0
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            r2.A00 = r0
            java.lang.String r0 = r6.A06
            r2.A08 = r0
            boolean r0 = r6.A0A
            boolean r1 = r6.A09
            if (r0 == 0) goto L_0x003d
            r0 = 1
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r2.A0P = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r6.A05
            if (r1 == 0) goto L_0x0070
            X.4gR r0 = r6.A02
            if (r0 == 0) goto L_0x00a3
            X.RzL r0 = r0.A00
            X.QP6 r0 = r0.A06
            java.lang.String r0 = r0.A05
        L_0x004e:
            r2.A0G = r0
            java.lang.String r0 = "requestAutofillData"
            java.lang.Object r0 = X.Pxh.A0d(r1, r0)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
            if (r0 != 0) goto L_0x00a0
            r0 = 0
        L_0x005c:
            java.lang.String r0 = X.SUR.A02(r0)
            r2.A06 = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r6.A05
            if (r0 == 0) goto L_0x009e
            java.util.LinkedHashSet r0 = r0.A01()
        L_0x006a:
            java.lang.String r0 = X.SUR.A02(r0)
            r2.A0F = r0
        L_0x0070:
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_contact_entries"
            r2.A01(r0, r1)
            r6.A0H(r2)
            X.SHz r2 = r2.A00()
            X.QKv r0 = r6.A03
            if (r0 == 0) goto L_0x009c
            android.os.Bundle r1 = r0.A02()
        L_0x008f:
            X.4gR r0 = r6.A02
            X.SUR.A0A(r1, r0, r2)
        L_0x0094:
            X.QKv r0 = r6.A03
            if (r0 == 0) goto L_0x009b
            r0.A0C(r3)
        L_0x009b:
            return
        L_0x009c:
            r1 = r3
            goto L_0x008f
        L_0x009e:
            r0 = r3
            goto L_0x006a
        L_0x00a0:
            java.util.LinkedHashSet r0 = r0.A01
            goto L_0x005c
        L_0x00a3:
            r0 = r3
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKC.onCancel(android.content.DialogInterface):void");
    }

    public final boolean A0I(boolean z) {
        C11021S5u s5u;
        C7580QKv qKv = this.A03;
        if (qKv == null || (s5u = qKv.A09) == null || AnonymousClass7TE.A0q(s5u.A01).getBoolean("contact_autofill_eligible_for_automatic_autofill", false) || !s5u.A00.A04.A0A(z)) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(141682383);
        if (bundle != null) {
            A07();
        }
        super.onCreate(bundle);
        AnonymousClass0fD.A09(-858990404, A022);
    }
}
