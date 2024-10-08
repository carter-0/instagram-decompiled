package com.facebook.browser.lite.webview;

import X.002;
import X.0fc;
import X.AnonymousClass7TF;
import X.C10729Rx8;
import X.C13701TfK;
import X.C249113j9;
import X.C7903QcV;
import X.Q8o;
import X.Q8q;
import X.Q98;
import X.QLA;
import android.app.Activity;
import android.content.Context;
import android.view.autofill.AutofillManager;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;

public final class SystemWebView extends QLA {
    public AutofillManager.AutofillCallback A00;
    public HeliumWebViewExtensions A01;
    public Q8q A02;
    public Q98 A03;
    public final C7903QcV A04;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Rvy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.QcV, android.webkit.WebView] */
    public SystemWebView(Context context) {
        HeliumWebViewExtensions heliumWebViewExtensions;
        this.A01 = -1;
        this.A08 = -1;
        this.A07 = -1;
        this.A04 = -1;
        this.A05 = -1;
        this.A06 = -1;
        this.A00 = -1;
        this.A09 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A0P = true;
        this.A0X = false;
        this.A0U = false;
        this.A0S = false;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0Y = false;
        this.A0J = false;
        this.A0K = false;
        this.A0B = null;
        this.A0G = new C10729Rx8();
        ? obj = new Object();
        obj.A02 = true;
        obj.A03 = false;
        obj.A00 = context;
        obj.A01 = this;
        this.A0H = obj;
        if (context instanceof Activity) {
            A0C(((Activity) context).getIntent());
        }
        this.A03 = null;
        this.A02 = null;
        0fc.A01(32, 002.A1D("Initialized SystemWebView: using Helium ", AnonymousClass7TF.A1V(C249113j9.A01)), -80749814);
        ? qcV = new C7903QcV(context, this);
        this.A04 = qcV;
        C13701TfK tfK = C249113j9.A01;
        if (tfK != null) {
            heliumWebViewExtensions = tfK.B38(qcV);
        } else {
            heliumWebViewExtensions = null;
        }
        this.A01 = heliumWebViewExtensions;
        0fc.A00(32, -47691645);
        Class cls = AutofillManager.class;
        if (context.getSystemService(cls) != null) {
            this.A00 = new Q8o(this);
            ((AutofillManager) context.getSystemService(cls)).registerCallback(this.A00);
        }
    }
}
