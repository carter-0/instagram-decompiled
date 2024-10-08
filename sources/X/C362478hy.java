package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8hy  reason: invalid class name and case insensitive filesystem */
public final class C362478hy implements AnonymousClass1MK {
    public static final Map A05 = Collections.synchronizedMap(new HashMap());
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final C62780vc A03 = new C62780vc(0nY.A00(), Runtime.getRuntime().availableProcessors() * 2);
    public final UserSession A04;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C362478hy(UserSession userSession, int i, int i2) {
        this.A04 = userSession;
        this.A01 = i;
        this.A00 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A02 = options;
        options.inJustDecodeBounds = true;
    }

    public static void A00(C362478hy r3, C365798nh r4, WeakReference weakReference, int i) {
        String A012 = r4.A01();
        A012.getClass();
        1OO A0J = 1NK.A00().A0J(C253833rU.A01(new File(A012)), (String) null);
        A0J.A0I = false;
        A0J.A08 = new A54(r4, weakReference);
        A0J.A02(r3);
        A0J.A01 = i;
        A0J.A01();
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        Bitmap bitmap;
        int i;
        Object C3s = r5.C3s();
        C3s.getClass();
        A54 a54 = (A54) C3s;
        C41777B0g b0g = (C41777B0g) a54.A01.get();
        C365798nh r0 = a54.A00;
        if (b0g != null && (bitmap = r6.A01) != null) {
            C40308AZx aZx = (C40308AZx) b0g;
            C352218Cl r02 = r0.A02;
            if (r02 != null) {
                i = r02.A07;
            } else {
                i = 0;
            }
            C362048hG r2 = aZx.A00;
            C362048hG.A07(bitmap, r2, i);
            AnonymousClass8XA r1 = r2.A0w;
            List unmodifiableList = Collections.unmodifiableList(aZx.A01);
            0qQ.A07(unmodifiableList);
            r1.A0J(r2, unmodifiableList);
        }
    }
}
