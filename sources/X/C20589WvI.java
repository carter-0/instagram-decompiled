package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.WvI  reason: case insensitive filesystem */
public final class C20589WvI extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20589WvI(Object obj, Object obj2, AnonymousClass4D7 r4, int i, long j) {
        super(2, r4);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
        this.A03 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WvI, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        long j;
        Object obj3;
        int i;
        AnonymousClass4D7 r3 = r9;
        switch (this.A00) {
            case 0:
                obj3 = null;
                obj2 = this.A02;
                j = this.A01;
                i = 0;
                break;
            case 1:
                obj3 = this.A03;
                j = this.A01;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                j = this.A01;
                obj3 = this.A03;
                i = 2;
                break;
            default:
                obj2 = this.A02;
                j = this.A01;
                obj3 = this.A03;
                i = 3;
                break;
        }
        return new C20589WvI(obj2, obj3, r3, i, j);
    }

    public final Object invokeSuspend(Object obj) {
        C359618dD r4;
        Context context;
        HashMap A012;
        long j;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                0eS.A00(obj);
                throw new NullPointerException("looperHistory");
            case 1:
                0eS.A00(obj);
                C17538VZr vZr = (C17538VZr) this.A03;
                if (vZr.A02.nextClearBit(0) >= 2) {
                    C359638dF.A03(vZr.A00, (C359628dE) this.A02, C273654mx.A00(128), (String) null, C359608dC.A01(vZr.A04), this.A01);
                    break;
                } else {
                    throw DbU.A0i();
                }
            case 2:
                0eS.A00(obj);
                C17572VaQ vaQ = (C17572VaQ) this.A02;
                vaQ.A00 = this.A01;
                r4 = new C359618dD(((W2P) this.A03).A0Q);
                if (vaQ.A02.nextClearBit(0) >= 1) {
                    context = vaQ.A01;
                    A012 = C359608dC.A01(vaQ.A05);
                    j = vaQ.A00;
                    str = null;
                    str2 = "com.bloks.www.minishops.storefront.ig";
                    break;
                } else {
                    throw DbU.A0i();
                }
            default:
                0eS.A00(obj);
                C10787Ry8 ry8 = (C10787Ry8) this.A02;
                ry8.A00 = this.A01;
                r4 = new C359618dD(((S54) this.A03).A09);
                if (ry8.A02.nextClearBit(0) >= 1) {
                    context = ry8.A01;
                    A012 = C359608dC.A01(ry8.A05);
                    j = ry8.A00;
                    str = null;
                    str2 = C273654mx.A00(130);
                    break;
                } else {
                    throw DbU.A0i();
                }
        }
        C359638dF.A03(context, r4, str2, str, A012, j);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C20589WvI) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
