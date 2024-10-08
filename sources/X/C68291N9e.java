package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.N9e  reason: case insensitive filesystem */
public final class C68291N9e extends AnonymousClass0T0 implements C74270Pry {
    public final float A00;
    public final CameraAREffect A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68291N9e) {
                C68291N9e n9e = (C68291N9e) obj;
                if (!(0qQ.A0K(this.A01, n9e.A01) && this.A03 == n9e.A03 && this.A02 == n9e.A02 && Float.compare(this.A00, n9e.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TG.A0C(this.A01) * 31)) + Float.floatToIntBits(this.A00);
    }

    public C68291N9e(CameraAREffect cameraAREffect, float f, boolean z, boolean z2) {
        this.A01 = cameraAREffect;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallEffectGalleryViewModel(selectedEffect=");
        A1A.append(this.A01);
        A1A.append(", showGroupEffects=");
        A1A.append(this.A03);
        A1A.append(", showFooter=");
        A1A.append(this.A02);
        A1A.append(", bottomSheetHeight=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C68291N9e() {
        this((CameraAREffect) null, 0.0f, false, false);
    }
}
