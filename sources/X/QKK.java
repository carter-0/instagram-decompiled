package X;

import android.content.DialogInterface;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.List;

public abstract class QKK extends QKM {
    public int A00;
    public long A01;
    public DialogInterface.OnDismissListener A02;
    public AutofillSharedJSBridgeProxy A03;
    public C270254gR A04;
    public C7580QKv A05;
    public 1yd A06;
    public AutofillData A07;
    public AutofillData A08;
    public RequestAutofillJSBridgeCall A09;
    public String A0A;
    public List A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public final S5W A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r11) {
        /*
            r10 = this;
            int r1 = r10.A00
            r3 = 1
            if (r1 != r3) goto L_0x00ad
            X.QKv r0 = r10.A05
            if (r0 == 0) goto L_0x00a8
            boolean r1 = r10.A0D
            boolean r0 = r10.A0C
            if (r1 == 0) goto L_0x0012
            r9 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r9 = 0
        L_0x0013:
            r2 = 0
            if (r9 == 0) goto L_0x0023
            X.4gR r0 = r10.A04
            if (r0 == 0) goto L_0x0023
            X.1yd r0 = r0.A04
            boolean r0 = X.RUP.A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            r9 = 0
        L_0x0023:
            X.S5W r1 = r10.A0E
            java.lang.String r0 = "DECLINED_SAVE"
            X.RRP r4 = r1.A00(r0, r2)
            X.4gR r0 = r10.A04
            r3 = 0
            if (r0 == 0) goto L_0x00ab
            X.RzL r0 = r0.A00
            X.QP6 r0 = r0.A06
            java.lang.String r0 = r0.A05
        L_0x0036:
            X.SUR.A0E(r10, r4, r0)
            long r5 = r10.A01
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            long r1 = X.C51966G9m.A07(r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            long r1 = X.C51966G9m.A07(r5)
            int r0 = (int) r1
        L_0x004e:
            r4.A01 = r0
            java.lang.String r0 = r10.A0A
            r4.A08 = r0
            r0 = 0
            if (r9 == 0) goto L_0x0058
            r0 = 1
        L_0x0058:
            r4.A0P = r0
            X.1yd r0 = r10.A06
            if (r0 == 0) goto L_0x0061
            X.SUR.A0D(r10, r4)
        L_0x0061:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r10.A08
            com.facebook.browser.lite.extensions.autofill.model.AutofillData[] r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = X.SUR.A01(r0)
            r4.A07 = r0
            X.SHz r2 = r4.A00()
            X.QKv r0 = r10.A05
            android.os.Bundle r1 = r0.A02()
            X.4gR r0 = r10.A04
            X.SUR.A0A(r1, r0, r2)
            r10.A02 = r3
            X.QKv r1 = r10.A05
            X.7kb r0 = r1.A04
            if (r0 == 0) goto L_0x00a8
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x00a8
            X.7kb r0 = r1.A04
            X.QLA r1 = r0.C8U()
            X.Ro1 r0 = r1.A0C
            if (r0 == 0) goto L_0x00a8
            java.lang.String r2 = r1.A05()
            com.facebook.browser.lite.BrowserLiteFragment r1 = r0.A00
            r0 = 3
            r1.AI4(r0, r2)
        L_0x00a8:
            return
        L_0x00a9:
            r0 = 0
            goto L_0x004e
        L_0x00ab:
            r0 = r3
            goto L_0x0036
        L_0x00ad:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKK.onCancel(android.content.DialogInterface):void");
    }

    public QKK(S5W s5w) {
        this.A0E = s5w;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        QKK.super.onDismiss(dialogInterface);
        this.A01 = 0;
        DialogInterface.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-134069482);
        this.A01 = System.currentTimeMillis();
        super.onStart();
        AnonymousClass0fD.A09(494675307, A022);
    }
}
