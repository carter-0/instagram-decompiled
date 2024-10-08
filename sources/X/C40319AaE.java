package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.AaE  reason: case insensitive filesystem */
public final class C40319AaE implements AnonymousClass8DS {
    public final Drawable A00;
    public final String A01;
    public final C62320sa A02;

    public final boolean Es7() {
        return false;
    }

    public final boolean EsW() {
        return true;
    }

    public final int B0t() {
        return 0;
    }

    public final String B0u() {
        return this.A01;
    }

    public final Drawable B0v() {
        return this.A00;
    }

    public final String Brf() {
        return (String) this.A02.invoke();
    }

    public C40319AaE(Context context, C62320sa r4) {
        this.A02 = r4;
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
        0qQ.A0A(drawable);
        Drawable mutate = drawable.mutate();
        mutate.setTint(-1);
        this.A00 = mutate;
        this.A01 = AnonymousClass7TE.A16(context, 2131955950);
    }
}
