package X;

import java.util.List;

/* renamed from: X.GZl  reason: case insensitive filesystem */
public final class C52612GZl implements C305196Gx {
    public final /* synthetic */ GZF A00;

    public final void Evv(AnonymousClass6H1 r4, int i, int i2) {
        GZF gzf = this.A00;
        gzf.A07(i, ((float) i2) / ((float) gzf.A05()));
    }

    public C52612GZl(GZF gzf) {
        this.A00 = gzf;
    }

    public final float AEw(int i) {
        Object obj;
        GZF gzf = this.A00;
        C284945Oz r6 = gzf.A0C;
        List list = C51970G9q.A0Q(r6).A0F;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((C52640GaE) ((JLG) obj)).A03 == i) {
                break;
            }
            i2++;
        }
        JLG jlg = (JLG) obj;
        if (jlg == null) {
            return (((float) (i - gzf.A03())) * ((float) (((GZQ) r6.getValue()).A05 + ((GZQ) r6.getValue()).A06))) - (gzf.A0N.A04.B6X() * ((float) gzf.A05()));
        }
        return (float) ((C52640GaE) jlg).A01;
    }

    public final int B6I() {
        return this.A00.A02;
    }

    public final int B6J() {
        return this.A00.A03;
    }

    public final int BLP() {
        return ((C52640GaE) ((JLG) 00k.A0K(C51970G9q.A0Q(this.A00.A0C).A0F))).A03;
    }

    public final Object EKU(AnonymousClass4D7 r3, 0sL r4) {
        Object A01 = GZF.A01(C54609HKs.A01, this.A00, r3, r4);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public final int getItemCount() {
        return this.A00.A04();
    }
}
