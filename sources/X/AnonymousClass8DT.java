package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8DT  reason: invalid class name */
public final class AnonymousClass8DT {
    public final Context A00;
    public final Drawable A01;
    public final AnonymousClass8DV A02;
    public final UserSession A03;
    public final AnonymousClass8DS A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass8DT(Context context, UserSession userSession, AnonymousClass8DS r7, String str, boolean z) {
        Bitmap bitmap;
        this.A03 = userSession;
        this.A00 = context;
        this.A04 = r7;
        this.A05 = str;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getDrawable(R.drawable.effects_explore);
        Resources resources = context.getResources();
        Bitmap bitmap2 = null;
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        AnonymousClass8DV r2 = new AnonymousClass8DV(resources, bitmap);
        this.A01 = r2;
        r2.A02(context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) / 2.0f);
        this.A06 = z;
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) context.getDrawable(R.drawable.instagram_gen_ai_pano_outline_24);
        this.A02 = new AnonymousClass8DV(context.getResources(), bitmapDrawable2 != null ? bitmapDrawable2.getBitmap() : bitmap2);
    }
}
