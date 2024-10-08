package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4NI  reason: invalid class name */
public final class AnonymousClass4NI implements C263544Mk {
    public C291315gx A00;
    public AnonymousClass4OM A01;
    public final AnonymousClass4ND A02;
    public final AnonymousClass4NH A03;

    public final /* synthetic */ void Dd6() {
    }

    public final /* synthetic */ void DyH(int i, int i2, float f) {
    }

    public final void ACD(AnonymousClass4OL r2) {
        this.A00 = r2.A02;
    }

    public final View AMc(Context context, C263624Ms r6, C263624Ms r7) {
        AnonymousClass4NH r1 = this.A03;
        TextureView textureView = new TextureView(context);
        AnonymousClass4OM r2 = new AnonymousClass4OM(r6, r7, this.A02, r1);
        this.A01 = r2;
        textureView.setSurfaceTextureListener(r2);
        C291315gx r0 = this.A00;
        if (r0 != null) {
            textureView.setSurfaceTexture(r0);
            Surface surface = r0.A00;
            0qQ.A07(surface);
            r2.A00 = surface;
            r2.A02.E02(surface);
            this.A00 = null;
        }
        return textureView;
    }

    public final Surface B9s() {
        AnonymousClass4OM r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final /* synthetic */ AnonymousClass6KA BdH() {
        return AnonymousClass6KA.A00;
    }

    public AnonymousClass4NI(AnonymousClass4ND r1, AnonymousClass4NH r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public final void D8W(ViewGroup viewGroup) {
    }
}
