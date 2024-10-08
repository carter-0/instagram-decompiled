package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Ghl  reason: case insensitive filesystem */
public final class C53053Ghl extends 2Z7 {
    public final Application A00;
    public final FoaUserSession A01;
    public final I49 A02;
    public final HMQ A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final 2YL create(Class cls) {
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        HMQ hmq = this.A03;
        boolean z = this.A06;
        return new C52970GgN(application, foaUserSession, this.A02, hmq, this.A04, this.A05, z, this.A07);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53053Ghl(Application application, FoaUserSession foaUserSession, I49 i49, HMQ hmq, String str, String str2, boolean z, boolean z2) {
        super(application);
        AnonymousClass7TG.A1Q(foaUserSession, hmq);
        0qQ.A0B(i49, 7);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = hmq;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = i49;
        this.A07 = z2;
    }
}
