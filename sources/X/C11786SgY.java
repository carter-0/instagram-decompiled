package X;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SgY  reason: case insensitive filesystem */
public final class C11786SgY implements C13913TlF, C13518Tbn, C13914TlG {
    public boolean A00;
    public final Q6Y A01;
    public final Path A02 = C51965G9l.A0C();
    public final S05 A03 = new S05();
    public final QGL A04;
    public final String A05;
    public final boolean A06;

    public final void Dwx() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public final void ESm(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            C13687Tf4 tf4 = (C13687Tf4) list.get(i);
            if (tf4 instanceof C11783SgV) {
                C11783SgV sgV = (C11783SgV) tf4;
                if (sgV.A03 == AnonymousClass05K.A00) {
                    this.A03.A00.add(sgV);
                    sgV.A04.add(this);
                }
            }
            if (tf4 instanceof C11782SgU) {
                if (arrayList == null) {
                    arrayList = AnonymousClass7TE.A1C();
                }
                arrayList.add(tf4);
            }
        }
        this.A04.A02 = arrayList;
    }

    public final void AAd(SIR sir, Object obj) {
        if (obj == C13881Tj4.A02) {
            this.A04.A0A(sir);
        }
    }

    public final Path Bar() {
        if (this.A00 && this.A04.A03 == null) {
            return this.A02;
        }
        Path path = this.A02;
        path.reset();
        if (!this.A06) {
            Path path2 = (Path) this.A04.A06();
            if (path2 == null) {
                return path;
            }
            path.set(path2);
            path.setFillType(Path.FillType.EVEN_ODD);
            this.A03.A00(path);
        }
        this.A00 = true;
        return path;
    }

    public final String getName() {
        return this.A05;
    }

    public C11786SgY(Q6Y q6y, C11812Sgy sgy, C11796Sgi sgi) {
        this.A05 = sgy.A01;
        this.A06 = sgy.A02;
        this.A01 = q6y;
        QGL qgl = new QGL(sgy.A00.A00);
        this.A04 = qgl;
        sgi.A0C(qgl);
        qgl.A09(this);
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
