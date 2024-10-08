package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Ozt  reason: case insensitive filesystem */
public final class C72284Ozt implements AnonymousClass8DS {
    public final AnonymousClass8DV A00;
    public final Context A01;

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
        return AnonymousClass7TE.A16(this.A01, 2131975572);
    }

    public final /* bridge */ /* synthetic */ Drawable B0v() {
        return this.A00;
    }

    public final /* synthetic */ String Brf() {
        return null;
    }

    public C72284Ozt(Context context) {
        this.A01 = context;
        Drawable drawable = context.getDrawable(R.drawable.effect_no_selection);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.A00 = new AnonymousClass8DV(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
    }
}
