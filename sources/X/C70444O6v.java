package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.O6v  reason: case insensitive filesystem */
public final class C70444O6v {
    public final IgdsBanner A00;

    public C70444O6v(Context context, G76 g76) {
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_user_follow_pano_outline_24);
        igdsBanner.setBody(2131954235);
        igdsBanner.setAction(2131954236);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = g76;
        this.A00 = igdsBanner;
    }
}
