package com.instagram.neko.playables.activity;

import X.0qQ;
import X.C11355SOr;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.secure.securewebview.SecureWebView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PlayableAdWebView extends SecureWebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    private final void A00() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        C11355SOr sOr = new C11355SOr();
        sOr.A03();
        this.A01 = sOr.A02();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayableAdWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableAdWebView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }
}
