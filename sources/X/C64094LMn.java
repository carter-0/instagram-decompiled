package X;

import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;

/* renamed from: X.LMn  reason: case insensitive filesystem */
public final class C64094LMn {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final String A03;
    public final /* synthetic */ SfxSeekBarView A04;

    public C64094LMn(Bitmap bitmap, SfxSeekBarView sfxSeekBarView, String str, int i, int i2) {
        this.A04 = sfxSeekBarView;
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bitmap;
    }

    public static final float A00(C64094LMn lMn) {
        int i = lMn.A01;
        SfxSeekBarView sfxSeekBarView = lMn.A04;
        float f = sfxSeekBarView.A00;
        float f2 = (float) sfxSeekBarView.A01;
        Float valueOf = Float.valueOf((((((float) (lMn.A00 + i)) * f) / f2) + ((((float) i) * f) / f2)) * 0.5f);
        float f3 = sfxSeekBarView.A03;
        return AnonymousClass7TE.A04(C229632nm.A09(valueOf, new C52395GQu(f3, (sfxSeekBarView.A0A.right - f3) - 3.0f)));
    }
}
