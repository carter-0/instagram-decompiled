package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.8DR  reason: invalid class name */
public final class AnonymousClass8DR implements AnonymousClass8DS {
    public final Context A00;
    public final UserSession A01;
    public final C357638Yz A02;

    public final boolean EsW() {
        return false;
    }

    public final int B0t() {
        return this.A00.getColor(R.color.design_dark_default_color_on_background);
    }

    public final String B0u() {
        String string = this.A00.getString(2131973883);
        0qQ.A07(string);
        return string;
    }

    public final /* bridge */ /* synthetic */ Drawable B0v() {
        BitmapDrawable bitmapDrawable;
        Context context = this.A00;
        int A002 = C347047wB.A00(this.A02.A06());
        if (A002 == -1) {
            A002 = R.drawable.camera_dial_empty_icon;
        }
        Map map = C347047wB.A00;
        Integer valueOf = Integer.valueOf(A002);
        Drawable drawable = (Drawable) map.get(valueOf);
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = context.getDrawable(A002);
        Bitmap bitmap = null;
        if (drawable2 instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable2;
        } else {
            bitmapDrawable = null;
        }
        Resources resources = context.getResources();
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        AnonymousClass8DV r2 = new AnonymousClass8DV(resources, bitmap);
        map.put(valueOf, r2);
        return r2;
    }

    public final /* synthetic */ String Brf() {
        return null;
    }

    public final boolean Es7() {
        boolean z = false;
        if (C347047wB.A00(this.A02.A06()) != -1) {
            z = true;
        }
        return !z;
    }

    public AnonymousClass8DR(Context context, UserSession userSession, C357638Yz r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = userSession;
    }
}
