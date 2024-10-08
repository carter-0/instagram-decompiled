package com.instagram.fbpay.webview;

import X.0qQ;
import X.C11355SOr;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.secure.securewebview.SecureWebView;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FBPayIgWebView extends SecureWebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C11355SOr.A01(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FBPayIgWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        C11355SOr.A01(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "")
    public FBPayIgWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        0qQ.A0B(context, 1);
        C11355SOr.A01(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayIgWebView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        C11355SOr.A01(this);
    }
}
