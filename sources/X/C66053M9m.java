package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.M9m  reason: case insensitive filesystem */
public final class C66053M9m implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C64844Lj6 A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ CountDownLatch A04;

    public C66053M9m(Activity activity, Bitmap bitmap, C64844Lj6 lj6, File file, CountDownLatch countDownLatch) {
        this.A02 = lj6;
        this.A03 = file;
        this.A01 = bitmap;
        this.A00 = activity;
        this.A04 = countDownLatch;
    }

    public final void run() {
        C64844Lj6 lj6 = this.A02;
        lj6.A04 = JTQ.A0Z();
        File file = this.A03;
        Bitmap bitmap = this.A01;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Uri fromFile = Uri.fromFile(file);
        0qQ.A07(fromFile);
        lj6.A03 = C253833rU.A00(fromFile, width, height);
        String str = lj6.A04;
        0qQ.A0B(str, 0);
        AnonymousClass3Q2 A012 = AnonymousClass9T3.A01(str);
        A012.A33 = file.getPath();
        A012.A0H = bitmap.getWidth();
        A012.A0G = bitmap.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        A012.A0S = width2;
        A012.A0R = height2;
        A012.A0e(ShareType.UNKNOWN);
        1ua A002 = 1ua.A00(this.A00, lj6.A08);
        A002.A0E(A012);
        A002.A0I(A012, true, true);
        A002.A0J(new C65547LvM(0, this, A012));
    }
}
