package X;

import androidx.fragment.app.Fragment;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;

/* renamed from: X.Pbe  reason: case insensitive filesystem */
public final class C73381Pbe implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C74223PrB A01;
    public final /* synthetic */ GoogleAuthController A02;
    public final /* synthetic */ OJS A03;
    public final /* synthetic */ boolean A04;

    public C73381Pbe(Fragment fragment, C74223PrB prB, GoogleAuthController googleAuthController, OJS ojs, boolean z) {
        this.A03 = ojs;
        this.A01 = prB;
        this.A00 = fragment;
        this.A02 = googleAuthController;
        this.A04 = z;
    }

    public final void run() {
        this.A03.A00(this.A00, this.A02, (Exception) ((N4v) this.A01).A01);
    }
}
