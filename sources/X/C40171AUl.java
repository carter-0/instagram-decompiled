package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.AUl  reason: case insensitive filesystem */
public final class C40171AUl implements C340347l7, XBR {
    public Integer A00;
    public final /* synthetic */ AnonymousClass8GJ A01;

    public C40171AUl(AnonymousClass8GJ r1) {
        this.A01 = r1;
    }

    public final void D0y(C391719tX r4) {
        Integer num = this.A00;
        AnonymousClass8GJ r0 = this.A01;
        C394339xv.A00(r0.A07, (C279284yO) r0.A09.A08.A00, r4, num);
    }

    public final void D11() {
        this.A01.A0C.A06();
    }

    public final void D15(Bitmap bitmap, String str) {
        AnonymousClass8GJ.A00(bitmap, this, this.A01, this.A00);
    }

    public final void D16() {
        int A02 = C344017rB.A02(17);
        AnonymousClass8GJ r4 = this.A01;
        UserSession userSession = r4.A07;
        C360908fL.A02(userSession, (C279284yO) r4.A09.A08.A00, AnonymousClass7TF.A0g(userSession), (String) null, A02);
        Integer num = null;
        try {
            C340297l2 r0 = r4.A0B.A06;
            if (r0 != null) {
                num = Integer.valueOf(r0.A07());
            }
        } catch (C352928Fp unused) {
        }
        this.A00 = num;
    }

    public final void DZF() {
        C340297l2 r0 = this.A01.A0B.A06;
        if (r0 != null) {
            r0.A0I(this);
        }
    }
}
