package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Etr  reason: case insensitive filesystem */
public final class C49336Etr {
    public final IgdsBanner A00;

    public C49336Etr(Context context, G76 g76, String str) {
        boolean A1Y = DbW.A1Y(str);
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_cake_pano_outline_24);
        DbT.A1U(igdsBanner, DbW.A0h(context, str, 2131963766), false);
        igdsBanner.setAction(2131963765);
        igdsBanner.setDismissible(A1Y);
        igdsBanner.A00 = g76;
        this.A00 = igdsBanner;
    }
}
