package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Yx  reason: invalid class name and case insensitive filesystem */
public abstract class C266444Yx {
    public final List A00 = new ArrayList();

    public final CharSequence A00(Resources resources) {
        0qQ.A0B(resources, 0);
        CharSequence A01 = A01(resources);
        List<C55469HiD> list = this.A00;
        if (list.isEmpty()) {
            return A01;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01);
        for (C55469HiD hiD : list) {
            spannableStringBuilder.setSpan(hiD.A00, 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public abstract CharSequence A01(Resources resources);
}
