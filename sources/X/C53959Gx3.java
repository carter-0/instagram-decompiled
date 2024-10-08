package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gx3  reason: case insensitive filesystem */
public final class C53959Gx3 extends C243963aQ {
    public final UserSession A00;
    public final C274114nj A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass3W1 A03;
    public final int A04;
    public final int A05;
    public final 2WX A06;
    public final 1Xj A07;
    public final 0Pl A08;
    public final List A09;
    public final boolean A0A;

    public C53959Gx3(2WX r2, UserSession userSession, C274114nj r4, 1Xj r5, AnonymousClass4DU r6, AnonymousClass3W1 r7, 0Pl r8, List list, int i, int i2, boolean z) {
        0qQ.A0B(r5, 3);
        0qQ.A0B(r4, 11);
        this.A06 = r2;
        this.A00 = userSession;
        this.A07 = r5;
        this.A05 = i;
        this.A04 = i2;
        this.A09 = list;
        this.A0A = z;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r4;
        this.A08 = r8;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.2WK] */
    public final C244523bK A0X(C244463bE r24) {
        C244463bE r1 = r24;
        0qQ.A0B(r1, 0);
        C274134nl r6 = new C274134nl(this.A00, this.A01, this.A08);
        1Xj r8 = this.A07;
        AnonymousClass3W1 r10 = this.A03;
        List list = this.A09;
        int i = this.A05;
        int i2 = this.A04;
        int i3 = i;
        int i4 = i2;
        C274154nn A002 = r6.A00(C51967G9n.A09(r1), r8, this.A02, r10, (Float) null, (Integer) null, list, r8.A3M(), r8.A3L(), r8.A3N(), i3, i4, false, false, this.A0A, false);
        C275664qi BH3 = DbZ.A0T(list, C51970G9q.A0A(list)).A0C.BH3();
        return C51965G9l.A0W(this.A06, new Object(), C51969G9p.A0f(r1, C51971G9r.A0d(new IJ0(this), 4), C58393IrC.A00, new C58769IxG(46, r1, this, A002, BH3)));
    }
}
