package X;

import android.view.TextureView;

/* renamed from: X.9qn  reason: invalid class name and case insensitive filesystem */
public final class C390139qn extends AnonymousClass4M2 {
    public final /* synthetic */ AnonymousClass8PZ A00;

    public C390139qn(AnonymousClass8PZ r1) {
        this.A00 = r1;
    }

    public final void D5H(AnonymousClass4MN r3) {
        AnonymousClass8PZ r0 = this.A00;
        AnonymousClass4MM r1 = r0.A08;
        if (r1 != null) {
            r1.seekTo(r0.A01);
        }
    }

    public final void DZ2(AnonymousClass4MN r4, long j) {
        AnonymousClass8PZ r2 = this.A00;
        if (r2.A09) {
            TextureView textureView = r2.A05;
            if (textureView != null) {
                textureView.setAlpha(1.0f);
            }
            r2.A0C.postOnAnimation(r2.A0N);
        }
    }
}
