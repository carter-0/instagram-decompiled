package X;

import java.util.concurrent.Executor;

/* renamed from: X.Sdn  reason: case insensitive filesystem */
public final class C11645Sdn implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public C11645Sdn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj5;
        this.A03 = obj2;
        this.A07 = str;
        this.A04 = obj4;
        this.A02 = obj;
        this.A05 = obj6;
        this.A06 = obj3;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Executor executor;
        Runnable tkg;
        SUj sUj = (SUj) obj;
        if (this.A00 != 0) {
            if (SUj.A0V(sUj)) {
                Pxe.A1P(this, this.A04);
                executor = ((C11246SHg) this.A01).A01;
                tkg = new C12986TGt(this, sUj);
            } else if (SUj.A0S(sUj)) {
                Pxe.A1P(this, this.A04);
                Throwable th = sUj.A02;
                C13617Tdj tdj = (C13617Tdj) this.A05;
                executor = (Executor) this.A03;
                tkg = new TKG(tdj, (C11246SHg) this.A01, (Object) null, (String) null, th);
            } else {
                return;
            }
            executor.execute(tkg);
            return;
        }
        Throwable th2 = sUj.A02;
        if (th2 instanceof C13223TQo) {
            int i = ((C13223TQo) th2).A00;
            if (i == 7 || i == 9 || i == 13) {
                Pxe.A1P(this, this.A03);
                SSY ssy = (SSY) this.A01;
                ssy.A03.A01();
                String str = this.A07;
                1MD r0 = (1MD) this.A02;
                Object obj2 = this.A05;
                SSY.A01(r0, (AnonymousClass2gB) this.A06, (C10440RsH) this.A04, ssy, obj2, str);
                return;
            } else if (i == 104) {
                return;
            }
        }
        ((2Fk) this.A06).A0A(sUj);
    }
}
