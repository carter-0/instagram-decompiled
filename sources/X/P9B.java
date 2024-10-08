package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

public final class P9B implements C74328Pt4 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PB5 A01;
    public final /* synthetic */ C72574PBf A02;
    public final /* synthetic */ GifUrlImpl A03;
    public final /* synthetic */ String A04;

    public P9B(Context context, PB5 pb5, C72574PBf pBf, GifUrlImpl gifUrlImpl, String str) {
        this.A02 = pBf;
        this.A01 = pb5;
        this.A03 = gifUrlImpl;
        this.A00 = context;
        this.A04 = str;
    }

    public final void D53(Object obj) {
        0qQ.A0B(obj, 0);
        C72574PBf pBf = this.A02;
        pBf.A01 = null;
        PB5.A00(this.A00, this.A01, pBf, this.A03, (String) obj, this.A04);
    }
}
