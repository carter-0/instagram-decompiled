package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Ppj  reason: case insensitive filesystem */
public final class C74142Ppj extends 0Yg implements 0sP {
    public static final C74142Ppj A00 = new C74142Ppj();

    public C74142Ppj() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = C66581MXm.A0j(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.sendSnapshotNotification();
        }
        return C60340gF.A00;
    }
}
