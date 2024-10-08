package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.8kL  reason: invalid class name and case insensitive filesystem */
public final class C363788kL extends 2Cl implements C340347l7 {
    public Integer A00;
    public final /* synthetic */ AnonymousClass8GJ A01;

    public final int getRunnableId() {
        return 543;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        Integer num = this.A00;
        AnonymousClass8GJ r0 = this.A01;
        C394339xv.A00(r0.A07, (C279284yO) r0.A09.A08.A00, exc, num);
    }

    public C363788kL(AnonymousClass8GJ r1) {
        this.A01 = r1;
    }

    public final void DZF() {
        C340297l2 r0 = this.A01.A0B.A06;
        if (r0 != null) {
            r0.A0I(this);
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        int A02 = C344017rB.A02(17);
        AnonymousClass8GJ r4 = this.A01;
        UserSession userSession = r4.A07;
        C360908fL.A02(userSession, (C279284yO) r4.A09.A08.A00, 27p.A01(userSession).A04.A0L, (String) null, A02);
        return r4.A0B.A0M();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AnonymousClass8GJ.A00(bitmap, this, this.A01, this.A00);
        } else {
            onFail(new IllegalStateException("Camera preview SurfaceTexture Unavailable!"));
        }
    }

    public final void onFinish() {
        C363788kL.super.onFinish();
        this.A01.A0C.A06();
    }
}
