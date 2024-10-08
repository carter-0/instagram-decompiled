package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.Lnx  reason: case insensitive filesystem */
public final class C65135Lnx implements AnonymousClass36P {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ C3499582p A02;
    public final /* synthetic */ PendingRecipient A03;
    public final /* synthetic */ Boolean A04;

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        intent.putExtra("isFromQcc", true);
        intent.putExtra("captureType", AnonymousClass36W.FOLLOWERS_SHARE);
        intent.putExtra("previousCreationSession", JWE.A01(this.A02));
        intent.putExtra(AnonymousClass000.A00(3408), true);
        intent.putExtra("cameraEntryPoint", this.A01);
        intent.putExtra("targetGroupProfile", this.A03);
        intent.putExtra(AnonymousClass000.A00(35), this.A04);
        0kR.A07(this.A00, intent, i);
    }

    public C65135Lnx(Activity activity, 28D r2, C3499582p r3, PendingRecipient pendingRecipient, Boolean bool) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = pendingRecipient;
        this.A04 = bool;
        this.A00 = activity;
    }
}
