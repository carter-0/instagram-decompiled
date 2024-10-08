package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;

/* renamed from: X.5Mv  reason: invalid class name and case insensitive filesystem */
public final class C284525Mv implements TextureView.SurfaceTextureListener, SurfaceHolder.Callback, AnonymousClass4QO, AnonymousClass5Mw, AnonymousClass5Mx, C284535My, C284545Mz, AnonymousClass4PB, AnonymousClass4QJ, AnonymousClass4PC {
    public final /* synthetic */ C284515Mu A00;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C284525Mv(C284515Mu r1) {
        this.A00 = r1;
    }

    public final void DS5(Metadata metadata, long j) {
        C284515Mu r4 = this.A00;
        C284515Mu r0 = C284515Mu.$redex_init_class;
        AnonymousClass4RQ r3 = new AnonymousClass4RQ(r4.A0B);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].E37(r3);
            i++;
        }
        r4.A0B = new AnonymousClass4RP(r3);
        AnonymousClass4RP A05 = C284515Mu.A05(r4);
        if (!A05.equals(r4.A0A)) {
            r4.A0A = A05;
            r4.A0h.A02(new C12543Swt(this), 14);
        }
        AnonymousClass5N4 r2 = r4.A0h;
        r2.A02(new C12544Swu(metadata), 28);
        r2.A01();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C284515Mu r1 = this.A00;
        C284515Mu r0 = C284515Mu.$redex_init_class;
        Surface surface = new Surface(surfaceTexture);
        C284515Mu.A0H(r1, surface);
        r1.A08 = surface;
        C284515Mu.A0E(r1, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C284515Mu r1 = this.A00;
        C284515Mu.A0H(r1, (Object) null);
        C284515Mu.A0E(r1, 0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C284515Mu.A0E(this.A00, i, i2);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C284515Mu.A0E(this.A00, i2, i3);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C284515Mu.A0E(this.A00, 0, 0);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C284515Mu r0 = C284515Mu.$redex_init_class;
    }
}
