package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Jf  reason: invalid class name and case insensitive filesystem */
public final class C353818Jf {
    public float A00 = 0.8f;
    public int A01;
    public int A02 = -1;
    public GradientDrawable.Orientation A03 = GradientDrawable.Orientation.TL_BR;
    public TextColors A04 = TextColors.A03;
    public Integer A05;
    public String A06;
    public final List A07 = new ArrayList();

    public final void A02(int... iArr) {
        0qQ.A0B(iArr, 0);
        for (int valueOf : iArr) {
            this.A07.add(Integer.valueOf(valueOf));
        }
    }

    public static TextColorScheme A00(Context context, C353818Jf r1, int i) {
        r1.A01 = context.getColor(i);
        return new TextColorScheme(r1);
    }

    public static void A01(Context context, C353818Jf r1, int i, int i2) {
        r1.A02(i2, context.getColor(i));
    }
}
