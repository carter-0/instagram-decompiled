package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Ghj  reason: case insensitive filesystem */
public final class C53051Ghj extends 2Z7 {
    public final Application A00;
    public final FoaUserSession A01;
    public final I44 A02;
    public final I25 A03;
    public final C56150Htc A04;
    public final AnonymousClass0r6 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53051Ghj(Application application, FoaUserSession foaUserSession, I44 i44, I25 i25, C56150Htc htc, AnonymousClass0r6 r7) {
        super(application);
        C51974G9v.A0d(3, htc, i44, i25, r7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A04 = htc;
        this.A02 = i44;
        this.A03 = i25;
        this.A05 = r7;
    }

    public final 2YL create(Class cls) {
        return new C52972GgP(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }
}
