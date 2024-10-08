package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ftp  reason: case insensitive filesystem */
public final class C51419Ftp implements Runnable {
    public final /* synthetic */ C309636Za A00;
    public final /* synthetic */ boolean A01;

    public C51419Ftp(C309636Za r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        Context context;
        int i;
        String str;
        C309636Za r0 = this.A00;
        C309636Za.A00(r0);
        Fragment fragment = (Fragment) r0.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            if (this.A01) {
                i = 2131961019;
                str = null;
            } else {
                i = 2131961938;
                str = "failed_download_video";
            }
            C59689JTv.A0F(context, str, i);
        }
    }
}
