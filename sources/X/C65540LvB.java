package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.upload.ImageUploadUtil;

/* renamed from: X.LvB  reason: case insensitive filesystem */
public final class C65540LvB implements MU6 {
    public final boolean A00;

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r5) {
        if (!C63539Kyo.A00.contains(lp8.A06)) {
            return C62012KVl.A00;
        }
        AnonymousClass3Q2 r2 = lp8.A0D;
        UserSession userSession = lp8.A0C;
        if (!C64016LJd.A01(r2) || !C64016LJd.A00(userSession, r2)) {
            r2.A0b(AnonymousClass3QD.UPLOADED);
            return C62013KVm.A00;
        } else if (!this.A00) {
            return ImageUploadUtil.A00(lp8);
        } else {
            ImageUploadUtil imageUploadUtil = ImageUploadUtil.A00;
            lp8.A07 = new C62014KVn(r2);
            return ImageUploadUtil.A02(lp8, imageUploadUtil, r5);
        }
    }

    public final String getName() {
        return "UploadCoverImage";
    }

    public C65540LvB(boolean z) {
        this.A00 = z;
    }

    public C65540LvB() {
        this(false);
    }
}
