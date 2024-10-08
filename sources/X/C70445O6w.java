package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.O6w  reason: case insensitive filesystem */
public final class C70445O6w {
    public final IgdsBanner A00;

    public C70445O6w(Context context, G76 g76) {
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_reply_pano_outline_24);
        igdsBanner.setBody(2131963767);
        igdsBanner.setAction(2131963776);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = g76;
        this.A00 = igdsBanner;
    }
}
