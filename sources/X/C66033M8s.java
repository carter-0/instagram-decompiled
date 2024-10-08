package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;

/* renamed from: X.M8s  reason: case insensitive filesystem */
public final class C66033M8s implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Matrix A01;
    public final /* synthetic */ C61868KPh A02;

    public C66033M8s(Bitmap bitmap, Matrix matrix, C61868KPh kPh) {
        this.A02 = kPh;
        this.A00 = bitmap;
        this.A01 = matrix;
    }

    public final void run() {
        C61868KPh kPh = this.A02;
        Context requireContext = kPh.requireContext();
        UserSession A0A = kPh.A0A();
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            float f = kPh.A01;
            ClipInfo clipInfo = kPh.A07;
            0qQ.A0A(clipInfo);
            int i = clipInfo.A09;
            AnonymousClass3Q2 r0 = kPh.A08;
            if (r0 == null) {
                0qQ.A0F("pendingMedia");
                throw AnonymousClass00P.createAndThrow();
            }
            LT1.A02(requireContext, bitmap, A0A, new C65236Lpg(new C64911LkB(kPh, 1), new C65233Lpd(r0)), (File) null, f, i);
            bitmap.recycle();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
