package X;

import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.systrace.Systrace;
import com.instagram.react.delegate.IgReactDelegate;

public final /* synthetic */ class TG4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C13774Tgp A01;

    public /* synthetic */ TG4(C13774Tgp tgp, int i) {
        this.A00 = i;
        this.A01 = tgp;
    }

    public final void run() {
        int i = this.A00;
        C13774Tgp tgp = this.A01;
        Systrace.A06(8192, "pre_rootView.onAttachedToReactInstance", i);
        C7372Q9d q9d = (C7372Q9d) tgp;
        q9d.A08 = new C11245SHf(q9d);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            q9d.A07 = new C18801W2o(q9d);
        }
        C13429TaG taG = q9d.A06;
        if (taG != null) {
            IgReactDelegate igReactDelegate = ((Sp3) taG).A00;
            Q6H A04 = igReactDelegate.A06.A01().A04();
            if (igReactDelegate.A0B) {
                if (A04 != null) {
                    igReactDelegate.A0B = false;
                } else {
                    return;
                }
            } else if (A04 == null) {
                return;
            }
            ((IgReactDelegate.RCTViewEventEmitter) A04.A02(IgReactDelegate.RCTViewEventEmitter.class)).emit("viewDidAppear", Integer.valueOf(q9d.A01));
        }
    }
}
