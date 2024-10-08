package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.meta.foa.session.FoaUserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.Ky8  reason: case insensitive filesystem */
public abstract class C63498Ky8 {
    public static final Object A00(Context context, Bitmap bitmap, FoaUserSession foaUserSession, LOt lOt, AnonymousClass4D7 r16) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r4 = new 1IW(1, 1Ey.A02(r16));
        r4.A0I();
        C12075SmU A0e = JTR.A0e(C56316HwT.A00(foaUserSession));
        AnonymousClass7TG.A1Q(bitmap, lOt);
        File A04 = 0mb.A04(context);
        1MF.A0L(Bitmap.CompressFormat.JPEG, bitmap, A04, lOt.A00);
        0qQ.A0A(A04);
        C11420SSw sSw = new C11420SSw(A04, 0mf.A00(A04.getPath()), AnonymousClass7TF.A0c());
        int width = bitmap.getWidth();
        File file = sSw.A01;
        if (file != null) {
            String path = file.getPath();
            0qQ.A0B(path, 2);
            C11224SFy A00 = C63392KwD.A00(C56316HwT.A00(foaUserSession), C51972G9s.A0n(), lOt.A01.A01, path, width, true);
            0rm A11 = C51965G9l.A11();
            A11.A00 = A0e.Ewf(A00, sSw, new C64384Lb1(A0e, A11, r4, 1));
            r4.CO0(new J6T(38, (Object) A11, (Object) A0e));
            return r4.A0E();
        }
        throw AnonymousClass7TE.A0y();
    }
}
