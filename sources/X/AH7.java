package X;

import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class AH7 {
    public static AH7 A08;
    public C41803B1i A00;
    public C340027ka A01;
    public C13847TiP A02;
    public C340037kb A03;
    public WeakReference A04;
    public WeakReference A05;
    public WeakReference A06;
    public List A07 = AnonymousClass7TE.A1C();

    public static C12049Slb A00(Intent intent, AH7 ah7) {
        boolean booleanExtra = intent.getBooleanExtra(Pxd.A00(394), false);
        return new C12049Slb(ah7.A00, ah7.A01, (HashSet) intent.getSerializableExtra(Pxd.A00(386)), intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FROM_OPEN_THREAD", false), booleanExtra);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.AH7, java.lang.Object] */
    public static AH7 A01() {
        AH7 ah7 = A08;
        if (ah7 != null) {
            return ah7;
        }
        ? obj = new Object();
        obj.A07 = AnonymousClass7TE.A1C();
        A08 = obj;
        return obj;
    }

    public final ArrayList A02(Class cls) {
        WeakReference weakReference;
        ArrayList A1C = AnonymousClass7TE.A1C();
        WeakReference weakReference2 = this.A04;
        if (!(weakReference2 == null || (weakReference = this.A05) == null)) {
            Object obj = weakReference2.get();
            Object obj2 = weakReference.get();
            if (!(obj == null || obj2 == null)) {
                for (Object next : this.A07) {
                    if (cls.isInstance(next)) {
                        A1C.add(next);
                    }
                }
            }
        }
        return A1C;
    }

    public final void A03(Intent intent) {
        Uri data = intent.getData();
        if (intent.getBooleanExtra(Pxd.A00(393), false) && data != null) {
            this.A07.add(new C7578QKt(data.toString(), intent.getBooleanExtra(Pxd.A00(402), false), intent.getBooleanExtra(Pxd.A00(412), false), intent.getBooleanExtra(Pxd.A00(392), false), intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SIM_HASH_LOGGING_FROM_IFRAMES", false)));
        }
    }
}
