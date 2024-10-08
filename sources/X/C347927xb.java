package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.7xb  reason: invalid class name and case insensitive filesystem */
public final class C347927xb {
    public final 1VY A00;
    public final Context A01;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1VG, java.lang.Object] */
    public C347927xb(Context context) {
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A01 = applicationContext;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C347937xc.A00);
        1VY AKv = new Object().AKv(1VU.A00(applicationContext, new C347977xg(C347967xf.A00, arrayList), "GalleryMediaMetadata", false, false));
        this.A00 = AKv;
        AKv.Er1(true);
    }
}
