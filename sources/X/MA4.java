package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class MA4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MSD A04;
    public final /* synthetic */ File A05;

    public MA4(Bitmap bitmap, UserSession userSession, MSD msd, File file, int i, int i2) {
        this.A03 = userSession;
        this.A02 = bitmap;
        this.A01 = i;
        this.A05 = file;
        this.A04 = msd;
        this.A00 = i2;
    }

    public final void run() {
        UserSession userSession = this.A03;
        Bitmap bitmap = this.A02;
        int i = this.A01;
        String A002 = C63221KtS.A00(bitmap, userSession, this.A05, i);
        bitmap.recycle();
        LT1.A01.post(new M9W(this.A04, A002, i, this.A00));
    }
}
