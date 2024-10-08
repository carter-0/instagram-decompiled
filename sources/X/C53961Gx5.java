package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gx5  reason: case insensitive filesystem */
public final class C53961Gx5 extends C243963aQ {
    public final UserSession A00;
    public final IUL A01;
    public final AnonymousClass4GD A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass3W1 A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final 2WX A08;
    public final AnonymousClass0iw A09;
    public final AnonymousClass3TA A0A;
    public final 1Xj A0B;
    public final 0Pl A0C;
    public final AnonymousClass2xS A0D;

    public C53961Gx5(2WX r2, AnonymousClass0iw r3, UserSession userSession, IUL iul, AnonymousClass3TA r6, AnonymousClass4GD r7, 1Xj r8, AnonymousClass4DU r9, AnonymousClass3W1 r10, 0Pl r11, AnonymousClass2xS r12, int i, int i2, boolean z) {
        0qQ.A0B(r8, 4);
        this.A08 = r2;
        this.A06 = i;
        this.A00 = userSession;
        this.A0B = r8;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = z;
        this.A09 = r3;
        this.A02 = r7;
        this.A07 = i2;
        this.A0D = r12;
        this.A0A = r6;
        this.A0C = r11;
        this.A01 = iul;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.2WK] */
    public final C244523bK A0X(C244463bE r24) {
        C244463bE r1 = r24;
        0qQ.A0B(r1, 0);
        C279094y4 r6 = new C279094y4(this.A00, this.A0A.AmC(), this.A0C);
        1Xj r8 = this.A0B;
        AnonymousClass3W1 r11 = this.A04;
        int i = this.A06;
        int i2 = this.A07;
        AnonymousClass2xS r5 = this.A0D;
        AnonymousClass3TO A022 = r5.A02(r8);
        C245853da A012 = r5.A01(r8);
        Context A092 = C51967G9n.A09(r1);
        AnonymousClass4DU r10 = this.A03;
        1Xj A1c = r8.A1c(i);
        if (A1c == null) {
            A1c = r8;
        }
        C279104y5 A002 = r6.A00(A092, r8, A1c, r10, r11, A012, A022, (Float) null, (Integer) null, C51966G9m.A1I(r8), r8.A3M(), r8.A3L(), r8.A3N(), i, i2, false);
        return C51965G9l.A0W(this.A08, new Object(), C51969G9p.A0f(r1, C51971G9r.A0d(IJP.A00, 4), C58399IrI.A00, new C74188PqU(24, (Object) A002, (Object) r1, (Object) this)));
    }
}
