package X;

import android.view.View;
import com.instagram.android.R;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.9xq  reason: invalid class name and case insensitive filesystem */
public abstract class C394289xq {
    public static final void A00(View view) {
        Locale A02 = AnonymousClass1Q2.A02();
        AnonymousClass7TG.A0R(view, R.id.like_count).setText(NumberFormat.getInstance(A02).format(1));
        AnonymousClass7TG.A0R(view, R.id.comment_count).setText(NumberFormat.getInstance(A02).format(1));
    }
}
