package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

public final class P9C implements C74328Pt4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C72558PAp A03;
    public final /* synthetic */ C72569PBa A04;
    public final /* synthetic */ String A05;

    public P9C(Context context, ImageUrl imageUrl, C72558PAp pAp, C72569PBa pBa, String str, int i) {
        this.A04 = pBa;
        this.A02 = imageUrl;
        this.A01 = context;
        this.A05 = str;
        this.A03 = pAp;
        this.A00 = i;
    }

    public final void D53(Object obj) {
        0qQ.A0B(obj, 0);
        C72569PBa pBa = this.A04;
        pBa.A00 = null;
        ImageUrl imageUrl = this.A02;
        GifUrlImpl gifUrlImpl = new GifUrlImpl((String) obj, (float) imageUrl.getWidth(), (float) imageUrl.getHeight());
        pBa.A03.setImageDrawable(C70049NwR.A00(this.A01, this.A03.A01, gifUrlImpl, Integer.valueOf(this.A00), this.A05));
    }
}
