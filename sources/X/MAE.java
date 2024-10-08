package X;

import com.facebook.cvat.ctsmartcreation.common.CTRangeD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class MAE implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C66372MPd A04;
    public final /* synthetic */ C60107Jfn A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0sL A07;

    public MAE(C66372MPd mPd, C60107Jfn jfn, 0sP r3, 0sL r4, float f, int i, int i2, int i3) {
        this.A04 = mPd;
        this.A06 = r3;
        this.A01 = i;
        this.A05 = jfn;
        this.A07 = r4;
        this.A00 = f;
        this.A03 = i2;
        this.A02 = i3;
    }

    public final void run() {
        int i;
        0sP r5;
        ZLv zLv = this.A04;
        if (zLv != null) {
            0sL r10 = this.A07;
            i = this.A01;
            r5 = this.A06;
            float f = this.A00;
            int i2 = this.A03;
            int i3 = this.A02;
            List<CTRangeD> A002 = zLv.A00();
            ArrayList A0r = AnonymousClass7TG.A0r(A002);
            for (CTRangeD cTRangeD : A002) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Integer valueOf = Integer.valueOf((int) timeUnit.convert(AnonymousClass1GB.A02(cTRangeD.start * 1000.0d), timeUnit));
                Integer valueOf2 = Integer.valueOf((int) timeUnit.convert(AnonymousClass1GB.A02(cTRangeD.end * 1000.0d), timeUnit));
                AnonymousClass7TF.A1I(Integer.valueOf(C229632nm.A03((int) ((float) Math.ceil((double) (valueOf.floatValue() / f))), i2, i3)), Integer.valueOf(C229632nm.A03((int) ((float) Math.ceil((double) (valueOf2.floatValue() / f))), i2, i3)), A0r);
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                0eP r0 = (0eP) next;
                Number number = (Number) r0.A01;
                int intValue = number.intValue();
                Number number2 = (Number) r0.A00;
                if (intValue - number2.intValue() > 100 && !(number2.intValue() == i2 && number.intValue() == i3)) {
                    A1C.add(next);
                }
            }
            if (DbT.A1b(A1C)) {
                r10.invoke(Integer.valueOf(i), A1C);
                this.A05.A00 = null;
            }
        } else {
            r5 = this.A06;
            i = this.A01;
        }
        C51967G9n.A0w(i, r5);
        this.A05.A00 = null;
    }
}
