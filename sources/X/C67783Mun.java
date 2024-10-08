package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.FaceEffectLinearLayoutManager;

/* renamed from: X.Mun  reason: case insensitive filesystem */
public final class C67783Mun extends AnonymousClass52S {
    public final /* synthetic */ FaceEffectLinearLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67783Mun(Context context, FaceEffectLinearLayoutManager faceEffectLinearLayoutManager) {
        super(context);
        0qQ.A0B(context, 2);
        this.A00 = faceEffectLinearLayoutManager;
    }

    public final void A05(View view, AnonymousClass52U r6, AnonymousClass3AW r7) {
        boolean A1b = C51973G9u.A1b(view, r7, r6);
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A00;
        C228432lf r0 = faceEffectLinearLayoutManager.A01;
        if (r0 == null) {
            super.A05(view, r6, r7);
            return;
        }
        int[] A09 = r0.A09(view, faceEffectLinearLayoutManager);
        C66583MXo.A10(this, r6, A09, A1b ? 1 : 0, A09[0]);
    }

    public final float A07(DisplayMetrics displayMetrics) {
        0qQ.A0B(displayMetrics, 0);
        return this.A00.A00 / ((float) displayMetrics.densityDpi);
    }
}
