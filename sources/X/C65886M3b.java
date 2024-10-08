package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import java.io.File;

/* renamed from: X.M3b  reason: case insensitive filesystem */
public final /* synthetic */ class C65886M3b implements Runnable {
    public final /* synthetic */ C65160LoP A00;

    public /* synthetic */ C65886M3b(C65160LoP loP) {
        this.A00 = loP;
    }

    public final void run() {
        C65160LoP loP = this.A00;
        ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView = loP.A03;
        Bitmap bitmap = constrainedMultiListenerTextureView.getBitmap();
        Matrix transform = constrainedMultiListenerTextureView.getTransform((Matrix) null);
        if (bitmap != null) {
            Context context = loP.A00;
            UserSession userSession = loP.A01;
            AnonymousClass3Q2 r1 = loP.A04;
            float f = r1.A02;
            int i = r1.A1N.A09;
            C65233Lpd lpd = new C65233Lpd(r1);
            AnonymousClass7TF.A1C(context, 0, transform);
            LT1.A02(context, bitmap, userSession, lpd, (File) null, f, i);
            loP.A02.AGc();
            bitmap.recycle();
        }
    }
}
