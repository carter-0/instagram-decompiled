package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Pby  reason: case insensitive filesystem */
public final class C73401Pby implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PB5 A01;
    public final /* synthetic */ C72574PBf A02;
    public final /* synthetic */ GifUrlImpl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C73401Pby(Context context, PB5 pb5, C72574PBf pBf, GifUrlImpl gifUrlImpl, String str, String str2) {
        this.A05 = str;
        this.A03 = gifUrlImpl;
        this.A00 = context;
        this.A04 = str2;
        this.A01 = pb5;
        this.A02 = pBf;
    }

    public final void run() {
        String str = this.A05;
        GifUrlImpl gifUrlImpl = this.A03;
        GifUrlImpl gifUrlImpl2 = new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue());
        this.A02.A04.setImageDrawable(C70049NwR.A00(this.A00, this.A01.A00, gifUrlImpl2, (Integer) null, this.A04));
    }
}
