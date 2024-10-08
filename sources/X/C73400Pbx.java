package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Pbx  reason: case insensitive filesystem */
public final class C73400Pbx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C72554PAl A02;
    public final /* synthetic */ PBW A03;
    public final /* synthetic */ GifUrlImpl A04;
    public final /* synthetic */ String A05;

    public C73400Pbx(Context context, C72554PAl pAl, PBW pbw, GifUrlImpl gifUrlImpl, String str, int i) {
        this.A02 = pAl;
        this.A03 = pbw;
        this.A04 = gifUrlImpl;
        this.A01 = context;
        this.A05 = str;
        this.A00 = i;
    }

    public final void run() {
        C72554PAl pAl = this.A02;
        PBW pbw = this.A03;
        GifUrlImpl gifUrlImpl = this.A04;
        pbw.A03.setImageDrawable(C70049NwR.A00(this.A01, pAl.A00, gifUrlImpl, Integer.valueOf(this.A00), this.A05));
    }
}
