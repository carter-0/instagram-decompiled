package X;

import android.animation.ValueAnimator;
import java.util.List;

public final class SFX {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final /* synthetic */ C10779Rxz A05;

    public static final void A00(SFX sfx, float f, float f2, float f3, float f4) {
        SFX sfx2 = sfx;
        float f5 = sfx.A02;
        float f6 = sfx.A03;
        float f7 = f5 + f3;
        float f8 = f6 + f4;
        sfx2.A02 = f7;
        sfx2.A03 = f8;
        float f9 = sfx2.A00;
        float f10 = sfx2.A01;
        float f11 = f9 + f;
        float f12 = f10 + f2;
        sfx2.A00 = f11;
        sfx2.A01 = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.addUpdateListener(new SUo(sfx2, sfx2.A05, f9, f11, f10, f12, f5, f7, f6, f8));
        sfx2.A04.add(ofFloat);
    }

    public SFX(C10779Rxz rxz) {
        this.A05 = rxz;
    }
}
