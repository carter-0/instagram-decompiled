package X;

import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;

public final class PUW implements Runnable {
    public final /* synthetic */ InstagramConsentFlowHostActivity A00;

    public PUW(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity) {
        this.A00 = instagramConsentFlowHostActivity;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity, android.app.Activity] */
    public final void run() {
        ? r1 = this.A00;
        PUW.super.finish();
        r1.overridePendingTransition(0, 0);
    }
}
