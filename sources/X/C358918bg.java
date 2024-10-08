package X;

import com.instagram.android.R;
import com.instagram.ui.text.TextColors;

/* renamed from: X.8bg  reason: invalid class name and case insensitive filesystem */
public final class C358918bg implements C358888bd {
    public final float[] A00 = new float[3];
    public final float[] A01 = new float[3];

    /* JADX WARNING: type inference failed for: r1v9, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    public final TextColors ALC(int i) {
        int A07;
        int i2 = -16777216;
        if (i == -16777216) {
            A07 = -4969017;
        } else {
            float[] fArr = this.A00;
            2eL.A09(i, fArr);
            float[] fArr2 = this.A01;
            fArr2[0] = fArr[0];
            fArr2[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr2[2] = 0.95f;
            i2 = 2eL.A07(fArr2);
            2eL.A09(i, fArr);
            fArr2[0] = fArr[0];
            float f = 0.0f;
            if (fArr[1] != 0.0f) {
                f = 1.0f;
            }
            fArr2[1] = f;
            fArr2[2] = 0.8f;
            A07 = 2eL.A07(fArr2);
        }
        ? obj = new Object();
        obj.A00 = A07;
        obj.A01 = R.dimen.memory_subtitle_text_size;
        obj.A02 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
        return new TextColors(obj, i2);
    }
}
