package X;

import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.WpM  reason: case insensitive filesystem */
public final class C20325WpM implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C20325WpM(AnonymousClass4DH r1, IgReactBoostPostModule igReactBoostPostModule, String str, String str2) {
        this.A01 = igReactBoostPostModule;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void run() {
        AnonymousClass4DH r6 = this.A00;
        if (r6 != null && r6.isAdded()) {
            1Yh A002 = C18138VmE.A00();
            1Yg A003 = VA4.A00();
            String str = this.A03;
            String str2 = this.A02;
            IgReactBoostPostModule igReactBoostPostModule = this.A01;
            A002.A06(r6, A003.A00(igReactBoostPostModule.getCurrentActivity(), igReactBoostPostModule.mUserSession, str, str2), r6);
        }
    }
}
