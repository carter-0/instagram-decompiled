package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6e2  reason: invalid class name and case insensitive filesystem */
public final class C312226e2 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C312156dv A01;
    public final /* synthetic */ C312186dy A02;
    public final /* synthetic */ UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C312226e2(Context context, C312156dv r5, C312186dy r6, UserSession userSession) {
        super(581, 3, false, false);
        this.A02 = r6;
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = r5;
    }

    public final void run() {
        C312186dy r5 = this.A02;
        if (r5.A07 == null) {
            Class<C312176dx> cls = C312176dx.class;
            Context context = this.A00;
            UserSession userSession = this.A03;
            C312156dv r1 = this.A01;
            synchronized (cls) {
                if (r5.A07 == null) {
                    C312246e4 r4 = new C312246e4(context, r5.A02, r1, userSession);
                    if (r5.A07 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("setDelegate() was already called delegate=");
                        sb.append(r5.A07);
                        0kD.A07(C312186dy.__redex_internal_original_name, sb.toString(), (Throwable) null);
                    } else {
                        synchronized (r5.A04) {
                            r5.A03 = r4.A03;
                            GalleryPickerServiceDataSource galleryPickerServiceDataSource = r5.A01;
                            if (galleryPickerServiceDataSource != null) {
                                r4.A00 = galleryPickerServiceDataSource;
                            }
                            List list = r5.A05;
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw new NullPointerException("getCapabilities");
                            }
                            list.clear();
                            r4.A8U(r5.A02);
                            r5.A07 = r4;
                        }
                        List<C365828nk> list2 = r5.A06;
                        for (C365828nk r0 : list2) {
                            r0.A00.CKj();
                        }
                        list2.clear();
                    }
                }
            }
        }
    }
}
