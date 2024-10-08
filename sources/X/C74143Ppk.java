package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Ppk  reason: case insensitive filesystem */
public final class C74143Ppk extends 0Yg implements 0sP {
    public static final C74143Ppk A00 = new C74143Ppk();

    public C74143Ppk() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = C66581MXm.A0j(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.startPhotoboothSession();
        }
        return C60340gF.A00;
    }
}
