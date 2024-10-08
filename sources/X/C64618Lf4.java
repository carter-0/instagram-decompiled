package X;

import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;

/* renamed from: X.Lf4  reason: case insensitive filesystem */
public final class C64618Lf4 implements AnonymousClass1MK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C61079JwH A01;
    public final /* synthetic */ K6R A02;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C64618Lf4(C61079JwH jwH, K6R k6r, int i) {
        this.A02 = k6r;
        this.A01 = jwH;
        this.A00 = i;
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        Bitmap A07 = JTQ.A07(r7);
        if (A07 != null) {
            K6R k6r = this.A02;
            AnonymousClass0eM r0 = k6r.A0B;
            Bitmap A002 = 0fO.A00(A07, DbX.A07(r0), DbX.A07(r0), false);
            0qQ.A07(A002);
            SfxSeekBarView sfxSeekBarView = k6r.A08;
            if (sfxSeekBarView == null) {
                0qQ.A0F("sfxSeekBarView");
                throw AnonymousClass00P.createAndThrow();
            }
            C61079JwH jwH = this.A01;
            sfxSeekBarView.A01(A002, jwH.A02, this.A00, ((C381809cM) jwH.A00).A01);
        }
    }
}
