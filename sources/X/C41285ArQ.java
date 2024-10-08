package X;

import android.text.Spannable;
import java.util.Comparator;

/* renamed from: X.ArQ  reason: case insensitive filesystem */
public final class C41285ArQ implements Comparator {
    public final /* synthetic */ Spannable A00;

    public C41285ArQ(Spannable spannable) {
        this.A00 = spannable;
    }

    public final int compare(Object obj, Object obj2) {
        Spannable spannable = this.A00;
        return 29b.A00(Integer.valueOf(spannable.getSpanStart(obj)), Integer.valueOf(spannable.getSpanStart(obj2)));
    }
}
