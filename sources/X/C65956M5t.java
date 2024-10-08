package X;

import com.instagram.arlink.fragment.NametagController;

/* renamed from: X.M5t  reason: case insensitive filesystem */
public final /* synthetic */ class C65956M5t implements Runnable {
    public final /* synthetic */ NametagController A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C65956M5t(NametagController nametagController, String str) {
        this.A00 = nametagController;
        this.A01 = str;
    }

    public final void run() {
        NametagController nametagController = this.A00;
        String str = this.A01;
        AnonymousClass4DH r3 = nametagController.A0B;
        C290815g0 r1 = new C290815g0(new C66089MAw(nametagController.A06, nametagController.mRootView), 448);
        r1.A00 = new C61672KGw(nametagController, str);
        r3.schedule(r1);
    }
}
