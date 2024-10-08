package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

public final class IHO implements 2YM {
    public final Application A00;
    public final FoaUserSession A01;
    public final C56564I1s A02;
    public final C56092Hsf A03;
    public final C54639HLw A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        C54639HLw hLw = this.A04;
        String str = this.A05;
        return new C53036GhS(application, foaUserSession, this.A02, this.A03, hLw, str, this.A07, this.A06);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public IHO(Application application, FoaUserSession foaUserSession, C56564I1s i1s, C56092Hsf hsf, C54639HLw hLw, String str, boolean z, boolean z2) {
        C51972G9s.A1D(hLw, str);
        0qQ.A0B(i1s, 7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A04 = hLw;
        this.A05 = str;
        this.A03 = hsf;
        this.A02 = i1s;
        this.A07 = z;
        this.A06 = z2;
    }
}
