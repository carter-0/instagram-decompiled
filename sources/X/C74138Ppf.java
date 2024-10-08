package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Ppf  reason: case insensitive filesystem */
public final class C74138Ppf extends 0Yg implements 0sP {
    public static final C74138Ppf A00 = new C74138Ppf();

    public C74138Ppf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = C66581MXm.A0j(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.cancelPhotoboothSession();
        }
        return C60340gF.A00;
    }
}
