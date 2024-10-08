package X;

import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.user.model.User;

/* renamed from: X.IZe  reason: case insensitive filesystem */
public final class C57373IZe implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57373IZe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Cyc() {
        Integer num;
        switch (this.A00) {
            case 0:
                AnonymousClass37E r1 = AnonymousClass37D.A00;
                C72367P3g p3g = (C72367P3g) this.A02;
                AnonymousClass37D A012 = r1.A01(p3g.A00);
                if (A012 != null) {
                    num = ((AnonymousClass37F) A012).A0K;
                } else {
                    num = null;
                }
                if (num == AnonymousClass05K.A0u) {
                    p3g.DUW((OIR) this.A01);
                    return;
                }
                return;
            case 1:
                C273414mX r0 = ((SUL) this.A02).A0G;
                if (r0 != null) {
                    r0.Cyc();
                    return;
                }
                return;
            case 2:
                if (((0r1) this.A01).A00) {
                    C54155H0z.A02((C54155H0z) this.A02);
                    return;
                }
                return;
            case 3:
                C52029GCb gCb = (C52029GCb) this.A02;
                gCb.A0I.Cyc();
                if (((User) this.A01).A02 == 17M.A06) {
                    gCb.A07.onBackPressed();
                    return;
                }
                return;
            case 4:
                GCU gcu = (GCU) this.A02;
                gcu.EI8();
                gcu.Cmm((C267324bN) this.A01);
                return;
            default:
                C227232is r02 = ((C56042Hrp) this.A02).A05;
                if (r02 != null) {
                    r02.DAt();
                }
                2eQ.A06((View) this.A01, 1000);
                return;
        }
    }

    public final void Cyf() {
        String str;
        switch (this.A00) {
            case 1:
                SUL sul = (SUL) this.A02;
                C273414mX r0 = sul.A0G;
                if (r0 != null) {
                    r0.Cyf();
                }
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) this.A01;
                if (browserLiteFragment.A02 == 0) {
                    browserLiteFragment.AI4(10, browserLiteFragment.A0l);
                }
                S6e s6e = sul.A0K;
                if (s6e != null) {
                    int i = browserLiteFragment.A02;
                    if (i == 1) {
                        str = "tap";
                    } else if (i == 2) {
                        str = "back_tap";
                    } else {
                        return;
                    }
                    s6e.A02("secondary_cta", "dismiss", str);
                    return;
                }
                return;
            case 3:
                ((C52029GCb) this.A02).A0I.Cyf();
                return;
            default:
                return;
        }
    }
}
