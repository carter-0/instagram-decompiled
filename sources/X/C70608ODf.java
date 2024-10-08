package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.ODf  reason: case insensitive filesystem */
public final class C70608ODf {
    public IgdsBanner A00;
    public final Context A01;
    public final G76 A02;

    public C70608ODf(Context context, G76 g76) {
        this.A01 = context;
        this.A02 = g76;
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_receipt_pano_outline_24);
        Context context2 = igdsBanner.getContext();
        DbT.A16(context2, igdsBanner, 2Yu.A0C(context2));
        igdsBanner.setAction((CharSequence) context2.getString(2131952991));
        igdsBanner.setDismissible(true);
        DbT.A1U(igdsBanner, context2.getString(2131952990), false);
        igdsBanner.A00 = g76;
        this.A00 = igdsBanner;
    }
}
