package X;

import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;

public final class PUX implements Runnable {
    public final /* synthetic */ InstagramConsentFlowHostActivity A00;

    public PUX(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity) {
        this.A00 = instagramConsentFlowHostActivity;
    }

    public final void run() {
        AnonymousClass7TF.A0D().postDelayed(new PUW(this.A00), 200);
    }
}
