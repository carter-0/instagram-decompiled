package X;

import android.content.Intent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;

public final class Q8v extends WebChromeClient {
    public final int A00;
    public final Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.R8Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.R8R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.R8Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.R8Q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onShowFileChooser(android.webkit.WebView r9, android.webkit.ValueCallback r10, android.webkit.WebChromeClient.FileChooserParams r11) {
        /*
            r8 = this;
            r4 = r8
            int r0 = r8.A00
            switch(r0) {
                case 3: goto L_0x0040;
                case 4: goto L_0x000b;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r0 = super.onShowFileChooser(r9, r10, r11)
            return r0
        L_0x000b:
            r3 = 1
            int r7 = X.DbW.A02(r3, r10, r11)
            java.lang.String[] r2 = r11.getAcceptTypes()
            if (r2 == 0) goto L_0x003b
            int r1 = r2.length
            r0 = 0
            if (r1 != r3) goto L_0x0036
            r6 = r2[r0]
            X.0qQ.A0A(r6)
            java.lang.Object r5 = r8.A01
            X.R8R r5 = (X.R8R) r5
            r5.A01 = r10
            android.app.Activity r3 = r5.getRootActivity()
            X.0qQ.A0A(r3)
            boolean r0 = X.C2604245p.A03(r3)
            if (r0 == 0) goto L_0x006b
            A00(r8, r6)
            goto L_0x0069
        L_0x0036:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0040:
            r2 = 1
            X.AnonymousClass7TF.A1B(r10, r2, r11)
            java.lang.String[] r1 = r11.getAcceptTypes()
            if (r1 == 0) goto L_0x007f
            int r0 = r1.length
            r7 = 0
            if (r0 != r2) goto L_0x0074
            r6 = r1[r7]
            X.0qQ.A0A(r6)
            java.lang.Object r5 = r8.A01
            X.R8Q r5 = (X.R8Q) r5
            r5.A01 = r10
            android.app.Activity r3 = r5.getRootActivity()
            X.0qQ.A0A(r3)
            boolean r0 = X.C2604245p.A03(r3)
            if (r0 == 0) goto L_0x006b
            A00(r8, r6)
        L_0x0069:
            r0 = 1
            return r0
        L_0x006b:
            X.T7J r2 = new X.T7J
            r2.<init>(r3, r4, r5, r6, r7)
            X.C2604245p.A01(r3, r2)
            goto L_0x0069
        L_0x0074:
            r0 = 26
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q8v.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }

    public Q8v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Q8v q8v, String str) {
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setTypeAndNormalize(str).setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        0qQ.A07(putExtra);
        Fragment fragment = (Fragment) q8v.A01;
        0kR.A06(fragment, Intent.createChooser(putExtra, fragment.requireContext().getString(2131962901)), 101);
    }

    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        switch (this.A00) {
            case 0:
                0qQ.A0B(webView, 0);
                super.onProgressChanged(webView, i);
                progressBar = ((QCD) this.A01).A01;
                if (progressBar == null) {
                    0qQ.A0F("progressBar");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            case 1:
                super.onProgressChanged(webView, i);
                progressBar = ((QCO) this.A01).A00.A01;
                break;
            default:
                super.onProgressChanged(webView, i);
                return;
        }
        progressBar.setProgress(i);
    }
}
