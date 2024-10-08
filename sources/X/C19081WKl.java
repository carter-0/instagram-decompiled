package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WKl  reason: case insensitive filesystem */
public final class C19081WKl implements C263544Mk {
    public SurfaceControl A00;
    public UUH A01;
    public Surface A02;
    public SurfaceControl A03;
    public SurfaceView A04;
    public C20884X2o A05;
    public final AnonymousClass4ND A06;
    public final XBj A07;

    public final View AMc(Context context, C263624Ms r12, C263624Ms r13) {
        Surface surface;
        XBj xBj = this.A07;
        AnonymousClass4ND r7 = this.A06;
        this.A04 = null;
        this.A00 = null;
        SurfaceControl surfaceControl = this.A03;
        if (surfaceControl == null || !surfaceControl.isValid() || (surface = this.A02) == null || !surface.isValid()) {
            this.A02 = null;
            this.A03 = null;
        }
        SurfaceControl surfaceControl2 = this.A00;
        if (surfaceControl2 == null && (surfaceControl2 = this.A03) == null) {
            surfaceControl2 = new SurfaceControl.Builder().setName(Integer.toHexString(hashCode())).setBufferSize(0, 0).build();
            0qQ.A07(surfaceControl2);
        }
        SurfaceView surfaceView = this.A04;
        UU6 uu6 = surfaceView;
        if (surfaceView == null) {
            UU6 uu62 = new UU6(context);
            this.A05 = uu62;
            uu6 = uu62;
        }
        if (this.A04 == null) {
            this.A04 = uu6;
            UUH uuh = new UUH(surfaceControl2, uu6, r12, r7, this.A05, xBj);
            uuh.A00 = this.A02;
            uu6.getHolder().addCallback(uuh);
            this.A01 = uuh;
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = surfaceControl2;
        return uu6;
    }

    public static final /* synthetic */ Surface A00(C19081WKl wKl) {
        SurfaceControl build = new SurfaceControl.Builder().setName(Integer.toHexString(wKl.hashCode())).setBufferSize(0, 0).build();
        0qQ.A07(build);
        UUH uuh = wKl.A01;
        if (uuh != null) {
            uuh.A03(build);
        }
        wKl.A00 = build;
        return new Surface(build);
    }

    public final void ACD(AnonymousClass4OL r5) {
        Surface surface;
        SurfaceControl A012;
        C18034VkE vkE = r5.A03;
        if (vkE != null && (surface = vkE.A00) != null && surface.isValid() && (A012 = vkE.A01()) != null && A012.isValid()) {
            this.A02 = surface;
            this.A03 = A012;
        }
    }

    public final Surface B9s() {
        UUH uuh = this.A01;
        if (uuh != null) {
            return uuh.A00;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.6KA] */
    public final AnonymousClass6KA BdH() {
        0qQ.A0B(this.A06, 1);
        return new Object();
    }

    public final void D8W(ViewGroup viewGroup) {
        UUH uuh;
        if (this.A06.A02 && (uuh = this.A01) != null) {
            uuh.A02();
        }
        this.A01 = null;
        this.A00 = null;
    }

    public final void Dd6() {
        if (this.A06.A03) {
            UUH uuh = this.A01;
            if (uuh != null) {
                uuh.A02();
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void DyH(int i, int i2, float f) {
        UUH uuh = this.A01;
        if (uuh != null) {
            UUH.A00(uuh, Double.valueOf(((double) i) / ((double) i2)), uuh.A02.A01);
        }
    }

    public C19081WKl(AnonymousClass4ND r1, XBj xBj) {
        this.A06 = r1;
        this.A07 = xBj;
    }
}
