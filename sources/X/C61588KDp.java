package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDp  reason: case insensitive filesystem */
public final class C61588KDp extends C228042kh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C61588KDp(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        switch (this.A00) {
            case 0:
                AnonymousClass8XN r2 = new AnonymousClass8XN((AnonymousClass07i) this.A02, (C355618Qr) this.A03);
                r2.A03 = AnonymousClass8XO.PHOTO_AND_VIDEO;
                r2.A0B = true;
                AnonymousClass8XW r22 = new AnonymousClass8XW((Context) this.A01, (2Cn) null, (AnonymousClass8XX) null, new AnonymousClass8XU(r2));
                C65839M1f m1f = new C65839M1f(r22);
                if (r22.A05) {
                    m1f.run();
                } else {
                    r22.A03 = m1f;
                }
                return new C60117Jfy(r22, AnonymousClass0Zq.A00(new MHD(r22, (AnonymousClass4D7) null)));
            case 1:
                return new C60306Jj5((C59725JVj) this.A02, (UserSession) this.A03, (C352328Cx) this.A01);
            default:
                return new C53012Gh3((Context) this.A01, (AnonymousClass07i) this.A02, (UserSession) this.A03);
        }
    }
}
