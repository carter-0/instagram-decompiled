package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.La1  reason: case insensitive filesystem */
public final class C64326La1 implements 2YM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C13830Ti1 A04;
    public final /* synthetic */ LA8 A05;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C64326La1(UserSession userSession, C13830Ti1 ti1, LA8 la8, float f, int i, int i2) {
        this.A04 = ti1;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = la8;
        this.A03 = userSession;
    }

    public final 2YL create(Class cls) {
        C13830Ti1 ti1 = this.A04;
        float f = this.A00;
        int i = this.A02;
        int i2 = this.A01;
        return new C60250Ji7(this.A03, ti1, this.A05, f, i, i2);
    }
}
