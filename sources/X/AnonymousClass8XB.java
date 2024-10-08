package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8XB  reason: invalid class name */
public final class AnonymousClass8XB implements C3502283u {
    public final /* synthetic */ AnonymousClass8XA A00;

    public AnonymousClass8XB(AnonymousClass8XA r1) {
        this.A00 = r1;
    }

    public final void DHa(float f, float f2) {
        C338837ic r0;
        AnonymousClass8XA r4 = this.A00;
        AnonymousClass85O r7 = r4.A0W;
        float f3 = f;
        boolean z = false;
        if (((double) f3) > 0.5d) {
            z = true;
        }
        r7.A07.Epw(Boolean.valueOf(z));
        AnonymousClass80D r3 = r4.A0O;
        float f4 = f2;
        if (r3.A3h && f2 < 0.0f) {
            float f5 = 0.5f * f2;
            double abs = (double) Math.abs(f5);
            ViewGroup viewGroup = r4.A0A;
            float A04 = (float) AnonymousClass37Q.A04(abs, 0.0d, (double) viewGroup.getHeight(), 1.0d, 0.75d);
            viewGroup.setTranslationY(-f5);
            if (r3.A3h) {
                viewGroup.setScaleX(A04);
                viewGroup.setScaleY(A04);
            }
            View requireViewById = r4.A09.requireViewById(R.id.pre_capture_controls_container);
            0qQ.A07(requireViewById);
            requireViewById.setTranslationY(0.0f);
            r4.A0R.Cxf(1.0f - Math.abs(f5 / ((float) viewGroup.getHeight())), -16777216);
        }
        C342897pL r02 = r4.A0U;
        if (r02 != null) {
            r02.DHa(f3, f4);
        }
        if (f == 1.0f && (r0 = r3.A0m) != null) {
            r0.A00.A05();
        }
    }
}
