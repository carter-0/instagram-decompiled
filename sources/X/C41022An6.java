package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.An6  reason: case insensitive filesystem */
public final class C41022An6 implements Runnable {
    public final /* synthetic */ MagicMediaRemixEditController A00;
    public final /* synthetic */ String A01;

    public C41022An6(MagicMediaRemixEditController magicMediaRemixEditController, String str) {
        this.A00 = magicMediaRemixEditController;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.AYO] */
    public final void run() {
        List A1I = AnonymousClass7TE.A1I(C390879rz.MAGIC_MEDIA_REMIX);
        MagicMediaRemixEditController magicMediaRemixEditController = this.A00;
        JY0 jy0 = magicMediaRemixEditController.A0G;
        AnonymousClass9IE r1 = new AnonymousClass9IE(A1I, 25);
        AnonymousClass07a.A00(magicMediaRemixEditController.A06);
        List<C381559bx> A002 = jy0.A00(r1);
        String str = this.A01;
        for (C381559bx r12 : A002) {
            if (0qQ.A0K(r12.A02, str)) {
                List list = r12.A05;
                AnonymousClass80D r5 = magicMediaRemixEditController.A0D;
                int i = 0;
                for (Object next : 00k.A0d(list, r5.A02)) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    Medium medium = (Medium) next;
                    Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X);
                    if (new C227922kK(medium.A0X).A0M("Orientation", 1) == 6) {
                        Matrix A0U = AnonymousClass7TE.A0U();
                        A0U.postRotate(90.0f);
                        int width = decodeFile.getWidth();
                        int height = decodeFile.getHeight();
                        0fO.A03(decodeFile);
                        decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, width, height, A0U, true);
                        0qQ.A07(decodeFile);
                    } else {
                        0qQ.A0A(decodeFile);
                    }
                    C39757A7x a7x = magicMediaRemixEditController.A0F;
                    String A0R = 002.A0R(medium.A0X, r5.A2X);
                    0qQ.A0B(A0R, 0);
                    String str2 = (String) a7x.A04.get(A0R);
                    if (str2 != null) {
                        List list2 = magicMediaRemixEditController.A0H;
                        boolean A1S = AnonymousClass7TF.A1S(i, magicMediaRemixEditController.A00);
                        0qQ.A0B(decodeFile, 1);
                        ? obj = new Object();
                        obj.A00 = decodeFile;
                        obj.A02 = A1S;
                        obj.A01 = str2;
                        list2.add(obj);
                    }
                    i = i2;
                }
                11Z.A02(new C41021An5(magicMediaRemixEditController, magicMediaRemixEditController.A0H));
                return;
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(3));
    }
}
