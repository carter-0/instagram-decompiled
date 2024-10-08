package X;

import android.view.View;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.2fp  reason: invalid class name and case insensitive filesystem */
public final class C226182fp implements View.OnClickListener {
    public final /* synthetic */ ProxyFrameLayout A00;

    public C226182fp(ProxyFrameLayout proxyFrameLayout) {
        this.A00 = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1898585963);
        0qQ.A0B(view, 0);
        ProxyFrameLayout proxyFrameLayout = this.A00;
        for (View.OnClickListener onClick : proxyFrameLayout.A02) {
            onClick.onClick(view);
        }
        View.OnClickListener onClickListener = proxyFrameLayout.A00;
        if (onClickListener != null && proxyFrameLayout.A01) {
            onClickListener.onClick(view);
        }
        AnonymousClass0fD.A0C(-1147576667, A05);
    }
}
