package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.EwA  reason: case insensitive filesystem */
public final class C49469EwA {
    public final IgdsBanner A00;
    public final G76 A01;

    public C49469EwA(Context context, G76 g76) {
        this.A01 = g76;
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_link_pano_outline_24);
        DbT.A16(context, igdsBanner, 2Yu.A0C(context));
        igdsBanner.setAction((CharSequence) context.getString(2131964492));
        DbT.A1U(igdsBanner, context.getString(2131964493), false);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = g76;
        this.A00 = igdsBanner;
    }
}
