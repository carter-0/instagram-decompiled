package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class NST extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C376649Iu A02;
    public final /* synthetic */ C72969PRc A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NST(Bitmap bitmap, C376649Iu r5, C72969PRc pRc, int i, boolean z) {
        super(118, 2, false, false);
        this.A03 = pRc;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = z;
        this.A02 = r5;
    }

    public final void run() {
        C72969PRc pRc = this.A03;
        UserSession userSession = pRc.A00.A0D;
        11Z.A02(new C73351PbA(this, pRc.A01, C39908AIz.A03(this.A01, this.A02, userSession, 2RR.A01(), AnonymousClass45F.A04("direct_temp_photo", ".jpg"), this.A00, this.A04), pRc.A02));
    }
}
