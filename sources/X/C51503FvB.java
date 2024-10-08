package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.FvB  reason: case insensitive filesystem */
public final /* synthetic */ class C51503FvB implements Runnable {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ AnonymousClass2Ep A01;
    public final /* synthetic */ C282355Ct A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C51503FvB(ImageUrl imageUrl, AnonymousClass2Ep r2, C282355Ct r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = imageUrl;
        this.A01 = r2;
    }

    public final void run() {
        C282355Ct r7 = this.A02;
        String str = this.A03;
        ImageUrl imageUrl = this.A00;
        AnonymousClass2Ep r4 = this.A01;
        C310336ap A0a = DbS.A0a();
        Context context = r7.A01;
        A0a.A0D = DbW.A0h(context, str, 2131960351);
        A0a.A09 = imageUrl;
        A0a.A0B(C310356ar.CIRCULAR);
        A0a.A0D(context.getString(2131960350));
        FdJ.A00(A0a, r7, r4, 7);
        A0a.A0L = true;
        DbY.A1N(A0a);
    }
}
