package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.8oi  reason: invalid class name and case insensitive filesystem */
public final class C366338oi implements AnonymousClass8DS {
    public final AnonymousClass8DV A00;
    public final String A01;

    public final boolean Es7() {
        return false;
    }

    public final boolean EsW() {
        return false;
    }

    public final int B0t() {
        return 0;
    }

    public final String B0u() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Drawable B0v() {
        return this.A00;
    }

    public final /* synthetic */ String Brf() {
        return null;
    }

    public C366338oi(Context context) {
        String string = context.getString(2131952977);
        0qQ.A07(string);
        this.A01 = string;
        Drawable drawable = context.getDrawable(R.drawable.effect_no_selection);
        if (drawable != null) {
            this.A00 = new AnonymousClass8DV(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
