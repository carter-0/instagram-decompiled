package X;

import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.WOm  reason: case insensitive filesystem */
public final class C19180WOm implements X6S {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ IgReactBoostPostModule A02;

    public C19180WOm(Callback callback, Callback callback2, IgReactBoostPostModule igReactBoostPostModule) {
        this.A02 = igReactBoostPostModule;
        this.A01 = callback;
        this.A00 = callback2;
    }

    public final void Dv1() {
        this.A00.invoke(new Object[0]);
    }

    public final void E4Q(String str) {
        this.A01.invoke(str);
    }
}
