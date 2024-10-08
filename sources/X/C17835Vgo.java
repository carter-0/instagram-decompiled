package X;

import android.text.StaticLayout;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Vgo  reason: case insensitive filesystem */
public final class C17835Vgo {
    public final int A00;
    public final StaticLayout A01;
    public final List A02;

    public final String toString() {
        String format = String.format(Locale.US, "ChunkedPhrase[chunks=%s]", C66581MXm.A1b(this.A02, 1));
        0qQ.A07(format);
        return format;
    }

    public C17835Vgo(StaticLayout staticLayout, List list, int i) {
        this.A02 = list;
        this.A01 = staticLayout;
        this.A00 = i;
    }
}
