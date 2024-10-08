package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Hc  reason: invalid class name and case insensitive filesystem */
public abstract class C353308Hc implements AnonymousClass8AM {
    public C353358Hh A00;
    public final AnonymousClass8AL A01;

    public void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C380619Yw) it.next()).A01(0.0f);
        }
        C353358Hh r1 = this.A00;
        if (r1 instanceof C353338Hf) {
            C353338Hf r12 = (C353338Hf) r1;
            r12.A03 = false;
            r12.A02 = false;
            return;
        }
        r1.A03 = false;
    }

    public final void A01(boolean z) {
        this.A01.A0A(this, z);
    }

    public final void ACy(int i) {
        this.A01.ACy(i);
    }

    public final void CL9(boolean z) {
        this.A01.A09(this, z);
    }

    public final boolean CbK() {
        return this.A01.CbK();
    }

    public final void EKg(int i, int i2) {
        this.A01.EKg(i, i2);
    }

    public final void Etn(boolean z, boolean z2) {
        Runnable aoy;
        if (this instanceof C387659mZ) {
            C387659mZ r3 = (C387659mZ) this;
            r3.A01.A0A(r3, true);
            C387629mW r1 = r3.A01;
            int i = r1.A00;
            r1.A03(i);
            aoy = new C41160ApK(r3, i, true);
        } else if (this instanceof C387669ma) {
            C387669ma r32 = (C387669ma) this;
            r32.A01.A0A(r32, true);
            C387589mS r12 = r32.A00;
            int i2 = r12.A00;
            r12.A03(i2);
            aoy = new C41138Aoy(r32, i2, true);
        } else {
            this.A01.A0A(this, true);
            return;
        }
        11Z.A03(aoy);
    }

    public C353308Hc(AnonymousClass8AL r1) {
        this.A01 = r1;
    }
}
