package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Mb  reason: invalid class name and case insensitive filesystem */
public final class C377499Mb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377499Mb(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A06 = z;
        this.A03 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass3Y5 r2 = (AnonymousClass3Y5) this.A04;
                Context A002 = C243803a8.A00(r2);
                boolean z = this.A06;
                return new C70802Vt(A002, new C52837GdT(r2, (C243673Zt) this.A01, (C243673Zt) this.A03, (C338047hK) this.A05, (C300835xz) this.A02, z));
            case 1:
                AnonymousClass416 B58 = ((AnonymousClass311) this.A02).B58();
                return new AnonymousClass417((Activity) this.A03, (Context) this.A01, (UserSession) this.A05, B58, (0Pl) this.A04, this.A06);
            case 2:
                String moduleName = ((AnonymousClass334) this.A05).A04.getModuleName();
                return new AnonymousClass41M((Context) this.A01, (UserSession) this.A04, ((AnonymousClass311) this.A02).BQ2(), (0Pl) this.A03, moduleName, this.A06);
            case 3:
                AnonymousClass334 r22 = (AnonymousClass334) this.A05;
                AnonymousClass4DU r8 = r22.A04;
                AnonymousClass07Z r4 = r22.A00;
                AnonymousClass311 r1 = (AnonymousClass311) this.A02;
                C243033Xd BRM = r1.BRM();
                boolean z2 = this.A06;
                AnonymousClass335 r10 = r22.A05;
                C232722uK r12 = ((AnonymousClass2xS) this.A03).A0G;
                AnonymousClass339 r11 = r22.A06;
                AnonymousClass3WV BRO = r1.BRO();
                return new C243073Xh((Context) this.A01, r4, r22.A01, (UserSession) this.A04, BRO, r8, BRM, r10, r11, r12, r1.BqC(), z2);
            default:
                boolean z3 = ((C231502rm) this.A03).A0N;
                return new AnonymousClass3z4((Activity) this.A02, (Context) this.A01, (UserSession) this.A04, ((AnonymousClass334) this.A05).A04, this.A06, z3);
        }
    }
}
