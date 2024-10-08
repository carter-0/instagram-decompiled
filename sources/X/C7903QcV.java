package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.secure.webkit.WebView;
import java.util.regex.Pattern;

/* renamed from: X.QcV  reason: case insensitive filesystem */
public final class C7903QcV extends WebView implements C13416TZw {
    public final /* synthetic */ SystemWebView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7903QcV(Context context, SystemWebView systemWebView) {
        super(context, (AttributeSet) null, 16842885);
        this.A00 = systemWebView;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.Q8n r1, X.C7903QcV r2) {
        /*
            r0 = 0
            X.C7903QcV.super.onProvideAutofillVirtualStructure(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7903QcV.A01(X.Q8n, X.QcV):void");
    }

    public static SystemWebView A00(Object obj) {
        return ((C7903QcV) ((C13416TZw) obj)).A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcV, android.webkit.WebView] */
    public final void autofill(SparseArray sparseArray) {
        C10376RrD rrD = this.A00.A0F;
        if (rrD != null) {
            C270254gR r0 = rrD.A00.A0b;
            RUK.A00(r0.A00, REJ.AUTOFILL, r0.A04);
        }
        C7903QcV.super.autofill(sparseArray);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r6, int r7) {
        /*
            r5 = this;
            com.facebook.browser.lite.webview.SystemWebView r3 = r5.A00
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x0026
            X.RrD r1 = r3.A0F
            if (r1 == 0) goto L_0x0021
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x0021
            X.QKv r0 = r1.A00
            X.STY r2 = r0.A07
            if (r2 == 0) goto L_0x0021
            X.QLA r1 = r1.A01
            java.util.Map r0 = r0.A0j
            java.lang.Object r0 = r0.get(r1)
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r0 = (com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy) r0
            r2.A0B(r0, r1)
        L_0x0021:
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0045
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x0069
            boolean r0 = r6 instanceof X.Q8n
            if (r0 != 0) goto L_0x0069
            X.RrD r1 = r3.A0F
            if (r1 == 0) goto L_0x0045
            X.QKv r0 = r1.A00
            X.STY r2 = r0.A07
            if (r2 == 0) goto L_0x0045
            X.QLA r1 = r1.A01
            java.util.Map r0 = r0.A0j
            java.lang.Object r0 = r0.get(r1)
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r0 = (com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy) r0
            r2.A0B(r0, r1)
        L_0x0045:
            X.RrD r0 = r3.A0F
            if (r0 == 0) goto L_0x0025
            X.QKv r1 = r0.A00
            X.4gR r0 = r1.A0b
            X.1yd r4 = r0.A04
            X.RzL r3 = r0.A00
            android.content.Intent r2 = r1.A01
            r1 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_USER_META_DISABLED"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x005f
            r1 = 1
        L_0x005f:
            boolean r0 = X.RUU.A00(r3, r4, r1)
            if (r0 == 0) goto L_0x0025
            X.C7903QcV.super.onProvideAutofillVirtualStructure(r6, r7)
            return
        L_0x0069:
            X.C7903QcV.super.onProvideAutofillVirtualStructure(r6, r7)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7903QcV.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QcV, android.webkit.WebView] */
    public final int computeHorizontalScrollRange() {
        return C7903QcV.super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QcV, android.webkit.WebView] */
    public final int computeVerticalScrollRange() {
        return C7903QcV.super.computeVerticalScrollRange();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcV, android.webkit.WebView] */
    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1506898220);
        C7903QcV.super.onAttachedToWindow();
        Pattern pattern = SCX.A01;
        AnonymousClass0fD.A0D(1476421381, A06);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcV, android.webkit.WebView] */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C7903QcV.super.onScrollChanged(i, i2, i3, i4);
        C10185Ro1 ro1 = this.A00.A0C;
        if (ro1 != null) {
            for (C13923TlR onScrollChanged : ro1.A00.A0o) {
                onScrollChanged.onScrollChanged(i, i2, i3, i4);
            }
        }
    }
}
