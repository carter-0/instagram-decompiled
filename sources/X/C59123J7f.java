package X;

import android.content.Context;

/* renamed from: X.J7f  reason: case insensitive filesystem */
public final class C59123J7f extends 0Yg implements 0sL {
    public final /* synthetic */ C246873fN A00;
    public final /* synthetic */ C246613et A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59123J7f(C246873fN r2, C246613et r3, 0sP r4, boolean z, boolean z2) {
        super(2);
        this.A02 = r4;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C256063vA r3;
        0qQ.A0B(obj2, 1);
        C246663ey r1 = (C246663ey) this.A02.invoke(obj2);
        C247233fz r32 = r1.A02;
        if (!(r32 instanceof C256063vA) || (r3 = (C256063vA) r32) == null) {
            throw AnonymousClass7TE.A0z("Should have a native controller");
        }
        Context context = r1.A00;
        if (context != null) {
            C247803gw.A00(context, this.A00, r3, this.A03, this.A04, C51971G9r.A1b(this.A01.A0A.A0C), true);
            return C51965G9l.A0f(new C58179Inj(r3, 9));
        }
        throw AnonymousClass7TE.A0z(AnonymousClass000.A00(1226));
    }
}
