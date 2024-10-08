package X;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.I0d  reason: case insensitive filesystem */
public final class C56532I0d {
    public final int A00;
    public final List A01;

    public final int A00() {
        String format = String.format("%06x", Arrays.copyOf(AnonymousClass7TF.A1b(this.A00), 1));
        0qQ.A07(format);
        return Color.parseColor(002.A0D(format, '#'));
    }

    public C56532I0d(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public C56532I0d() {
        this(0sn.A00, -1);
    }
}
