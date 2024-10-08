package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Ek4  reason: case insensitive filesystem */
public abstract class C48781Ek4 {
    public static final C49686F1w A00(View view) {
        0qQ.A0B(view, 0);
        Object tag = view.getTag(R.id.view_bouncer);
        if (tag != null) {
            return (C49686F1w) tag;
        }
        C49686F1w f1w = new C49686F1w(view);
        view.setTag(R.id.view_bouncer, f1w);
        return f1w;
    }
}
