package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Ghk  reason: case insensitive filesystem */
public final class C53052Ghk extends 2Z7 {
    public final Application A00;
    public final FoaUserSession A01;
    public final I25 A02;
    public final C56150Htc A03;
    public final 0sP A04;
    public final AnonymousClass0r6 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53052Ghk(Application application, FoaUserSession foaUserSession, I25 i25, C56150Htc htc, 0sP r6, AnonymousClass0r6 r7) {
        super(application);
        C51973G9u.A0r(3, htc, i25, r7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = htc;
        this.A02 = i25;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final 2YL create(Class cls) {
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        C56150Htc htc = this.A03;
        return new C52965GgI(application, foaUserSession, this.A02, htc, this.A04, this.A05);
    }
}
