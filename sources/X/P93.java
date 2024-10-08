package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

public final class P93 implements C74403PuJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PB5 A01;
    public final /* synthetic */ C72574PBf A02;
    public final /* synthetic */ GifUrlImpl A03;
    public final /* synthetic */ String A04;

    public final void D55(String str, boolean z) {
        0qQ.A0B(str, 0);
        C72574PBf pBf = this.A02;
        pBf.A01 = null;
        PB5 pb5 = this.A01;
        GifUrlImpl gifUrlImpl = this.A03;
        PB5.A00(this.A00, pb5, pBf, gifUrlImpl, str, this.A04);
    }

    public P93(Context context, PB5 pb5, C72574PBf pBf, GifUrlImpl gifUrlImpl, String str) {
        this.A02 = pBf;
        this.A01 = pb5;
        this.A03 = gifUrlImpl;
        this.A00 = context;
        this.A04 = str;
    }

    public final void onError(String str) {
        0f9 AEf = 0wj.A01.AEf("Error while fetching gif/sticker from Instamadillo media store", 817892914);
        AEf.ABQ("error_message", str);
        AEf.report();
    }
}
