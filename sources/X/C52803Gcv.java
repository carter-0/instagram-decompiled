package X;

import android.os.CountDownTimer;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Gcv  reason: case insensitive filesystem */
public final class C52803Gcv extends CountDownTimer {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C234272xa A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52803Gcv(1Xj r5, C234272xa r6) {
        super(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 100);
        this.A01 = r6;
        this.A00 = r5;
    }

    public final void onFinish() {
        C234272xa r3 = this.A01;
        AnonymousClass2xY r0 = r3.A04;
        1Xj r2 = this.A00;
        AnonymousClass3W1 r1 = r3.A02;
        C52761GcE gcE = r0.A00.A02;
        if (gcE != null) {
            gcE.A06(r2, r1);
        }
        AnonymousClass3W1 r12 = r3.A02;
        if (r12 != null) {
            r12.A0m(false, false);
        }
        r3.A00 = null;
        r3.A01 = null;
        r3.A02 = null;
        r3.A03 = null;
    }

    public final void onTick(long j) {
        C234272xa r1 = this.A01;
        AnonymousClass3TN r5 = r1.A03;
        if (r5 == null) {
            return;
        }
        if (j > 2000) {
            r5.EiM(((int) j) + IgNetworkConsentStorage.MAX_ENTRIES, false);
            return;
        }
        AnonymousClass3W1 r12 = r1.A02;
        if (r12 != null) {
            r12.A0m(true, false);
        }
        r5.setVideoIconState(AnonymousClass3TO.HIDDEN);
    }
}
