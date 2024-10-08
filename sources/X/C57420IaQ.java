package X;

import android.content.Context;

/* renamed from: X.IaQ  reason: case insensitive filesystem */
public final class C57420IaQ implements C311686d5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C314776ip A01;

    public C57420IaQ(Context context, C314776ip r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void DYA() {
        C314776ip r1 = this.A01;
        if (!r1.A01) {
            r1.A05.EHd();
        } else {
            r1.A01 = false;
        }
    }

    public final void DYB() {
        C314776ip r3 = this.A01;
        C255773uh Au5 = r3.A05.Au5();
        if (Au5 == null || !Au5.A1R()) {
            C275794rx r0 = r3.A00;
            if (r0 != null) {
                r0.A03(true);
            }
            r3.A00 = null;
        }
    }

    public final void onClick() {
        C255773uh Au5;
        C314776ip r3 = this.A01;
        C273384mU r1 = r3.A05;
        C255773uh Au52 = r1.Au5();
        if (Au52 != null && Au52.A1R() && (Au5 = r1.Au5()) != null) {
            Context context = this.A00;
            r3.A01 = true;
            r3.A01(Au5);
            r3.A00(context, Au5);
        }
    }
}
