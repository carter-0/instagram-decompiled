package X;

import android.content.Context;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.OsQ  reason: case insensitive filesystem */
public final class C71882OsQ implements C74383Pty {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C72554PAl A02;
    public final /* synthetic */ PBW A03;
    public final /* synthetic */ GifUrlImpl A04;
    public final /* synthetic */ String A05;

    public final /* synthetic */ void DCq(String str, int i, String str2) {
        0qQ.A0B(str, 1);
    }

    public final void Dog(String str, boolean z) {
        0qQ.A0B(str, 0);
        GifUrlImpl gifUrlImpl = this.A04;
        GifUrlImpl gifUrlImpl2 = new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue());
        PBW pbw = this.A03;
        pbw.A03.post(new C73400Pbx(this.A01, this.A02, pbw, gifUrlImpl2, this.A05, this.A00));
    }

    public C71882OsQ(Context context, C72554PAl pAl, PBW pbw, GifUrlImpl gifUrlImpl, String str, int i) {
        this.A04 = gifUrlImpl;
        this.A03 = pbw;
        this.A02 = pAl;
        this.A01 = context;
        this.A05 = str;
        this.A00 = i;
    }
}
