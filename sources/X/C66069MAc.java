package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: X.MAc  reason: case insensitive filesystem */
public final class C66069MAc implements Callable {
    public final int A00;
    public final Object A01;

    public C66069MAc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object call() {
        switch (this.A00) {
            case 0:
                AnonymousClass1C7.A00().A01(new AnonymousClass1QX(((1Pq) this.A01).A00(), new AnonymousClass1QT().A00()));
                return new 1XQ();
            case 1:
                C61325K2m.A00((C61325K2m) this.A01);
                break;
            case 2:
                C61326K2n.A00((C61326K2n) this.A01);
                break;
            case 3:
                ((C353308Hc) this.A01).A01.A08(0);
                return AnonymousClass7TE.A0v();
            case 4:
                return this.A01;
            case 5:
                E26 e26 = (E26) this.A01;
                Bitmap bitmap = e26.A00;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    File A04 = 0mb.A04(e26.requireContext());
                    Bitmap bitmap2 = e26.A00;
                    if (bitmap2 != null) {
                        1MF.A0M(bitmap2, A04);
                        e26.A01 = Uri.fromFile(A04);
                        String A0Q = 002.A0Q("", System.currentTimeMillis());
                        C64134LPj.A01(AnonymousClass7TE.A0l(e26.A0N), A0Q, JTP.A0u(A04), width);
                        return A0Q;
                    }
                }
                0qQ.A0F("birthdaySelfieBitmap");
                throw AnonymousClass00P.createAndThrow();
            case 6:
                LT3 lt3 = (LT3) this.A01;
                Bitmap A002 = LT3.A00(lt3);
                if (A002 == null) {
                    return null;
                }
                C290815g0 A003 = MB7.A00(A002, lt3, 27);
                KH1.A01(A003, lt3, 20);
                1ES.A03(A003);
                return null;
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                Context context = clipsEditMetadataController.A0n;
                UserSession userSession = clipsEditMetadataController.A0s;
                String str = (String) ((C60128Jg9) clipsEditMetadataController.A1B.getValue()).A00.A02();
                if (JTQ.A1Z(str)) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    if (decodeFile != null) {
                        File A042 = 0mb.A04(context);
                        if (A042.exists()) {
                            1MF.A0M(decodeFile, A042);
                            String A0Z = JTQ.A0Z();
                            C64134LPj.A01(userSession, A0Z, JTP.A0t(A042), decodeFile.getWidth());
                            return A0Z;
                        }
                        throw new FileNotFoundException(Pxd.A00(71));
                    }
                    throw JTO.A0u(C66579MXk.A00(254));
                }
                throw new FileNotFoundException();
        }
        return C60340gF.A00;
    }
}
