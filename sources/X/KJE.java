package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class KJE extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C376649Iu A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MUR A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJE(Bitmap bitmap, C376649Iu r5, UserSession userSession, MUR mur, int i, boolean z) {
        super(118, 2, false, false);
        this.A03 = userSession;
        this.A01 = bitmap;
        this.A00 = i;
        this.A05 = z;
        this.A02 = r5;
        this.A04 = mur;
    }

    public final void run() {
        UserSession userSession = this.A03;
        this.A04.DX2(C39908AIz.A03(this.A01, this.A02, userSession, 2RR.A01(), AnonymousClass45F.A04("direct_temp_photo", ".jpg"), this.A00, this.A05));
    }
}
