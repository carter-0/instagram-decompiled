package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class U3s extends ViewOutlineProvider {
    public final int A00;
    public final Object A01;

    public U3s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void getOutline(View view, Outline outline) {
        float f;
        int i;
        int i2;
        int i3;
        Outline outline2 = outline;
        switch (this.A00) {
            case 0:
                UWU uwu = ((Chip) this.A01).A04;
                if (uwu != null) {
                    uwu.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            case 1:
                i3 = 0;
                AnonymousClass7TF.A1H(view, outline);
                i2 = view.getWidth();
                i = view.getHeight();
                f = 0nA.A04(AnonymousClass7TE.A0S((View) this.A01), 12);
                break;
            case 2:
                i2 = view.getWidth();
                i = view.getHeight();
                f = (float) ((C18740VzL) this.A01).A00.A00;
                break;
            case 3:
                i2 = view.getWidth();
                C19140WMw wMw = (C19140WMw) this.A01;
                float f2 = wMw.A09;
                if (f2 <= 0.0f) {
                    i = view.getHeight();
                } else {
                    i = (int) (((float) view.getWidth()) * f2);
                }
                f = wMw.A03;
                break;
            case 4:
                i3 = 0;
                AnonymousClass7TF.A1H(view, outline);
                i2 = view.getWidth();
                i = view.getHeight();
                f = (float) JTR.A05(((AZG) this.A01).A08);
                break;
            default:
                super.getOutline(view, outline);
                return;
        }
        i3 = 0;
        outline2.setRoundRect(i3, i3, i2, i, f);
    }
}
