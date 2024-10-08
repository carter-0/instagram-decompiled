package X;

import java.util.List;

/* renamed from: X.IxP  reason: case insensitive filesystem */
public final class C58778IxP extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53399GnW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58778IxP(C53399GnW gnW, String str, 0sP r4, 0sP r5, int i, boolean z) {
        super(1);
        this.A05 = z;
        this.A01 = gnW;
        this.A03 = r4;
        this.A02 = str;
        this.A00 = i;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C305006Gb A0L = C51968G9o.A0L(obj);
        A0L.Cf4((Object) null, AnonymousClass5PI.A03(new C59350JGc(this.A02, this.A04, this.A00), -1628983248));
        boolean z = this.A05;
        C53399GnW gnW = this.A01;
        C61046Jvk jvk = (C61046Jvk) gnW.A04;
        0sP r3 = this.A03;
        if (jvk.A01) {
            A0L.Cf4((Object) null, C55393Hgz.A00);
            A0L.Cf4((Object) null, C55393Hgz.A01);
            C51967G9n.A11(A0L, new C59360JGm(6, jvk, r3, z), (Object) null, 162258395);
            C51967G9n.A11(A0L, new C59360JGm(7, jvk, r3, z), (Object) null, -1989224740);
            C51967G9n.A11(A0L, new C59360JGm(8, jvk, r3, z), (Object) null, 154259421);
        }
        C61082JwK jwK = (C61082JwK) gnW.A02;
        if (jwK.A01) {
            HZ8.A00(A0L, new C53530Gq0((List) jwK.A00), (C54617HLa) gnW.A03, 2131956989);
        }
        return C60340gF.A00;
    }
}
