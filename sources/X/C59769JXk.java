package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.JXk  reason: case insensitive filesystem */
public final class C59769JXk implements C66505MUj {
    public final /* synthetic */ C59767JXi A00;

    public C59769JXk(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final int BwF() {
        View Ao7 = this.A00.A0U.A00.A1U.A00().Ao7();
        if (Ao7 == null) {
            return 0;
        }
        RectF rectF = 0nA.A01;
        RectF A0Y = AnonymousClass7TE.A0Y();
        0nA.A0L(A0Y, Ao7);
        return (int) ((((float) 0nA.A08(AnonymousClass7TE.A0S(Ao7))) - A0Y.bottom) + (A0Y.height() / 2.0f));
    }

    public final boolean D8E() {
        C66567MWv mWv;
        C59767JXi jXi = this.A00;
        if (!jXi.A0H || (mWv = jXi.A0B) == null) {
            return false;
        }
        jXi.A0U.A00.A1d(C59767JXi.A00(jXi, C59767JXi.A01(jXi, mWv)), false);
        return true;
    }

    public final boolean DuB() {
        C66567MWv mWv;
        C59767JXi jXi = this.A00;
        if (jXi.A0H && (mWv = jXi.A0B) != null) {
            jXi.A05 = C59767JXi.A00(jXi, C59767JXi.A01(jXi, mWv));
            AnonymousClass8Q2 r1 = jXi.A0X;
            if (jXi.A0H) {
                C59767JXi.A0A(jXi, true);
                jXi.A0A = r1;
                C59767JXi.A0C(jXi, true, true);
            }
        }
        try {
            27p.A01(jXi.A0Q);
            jXi.A0D.A03(jXi.A05);
            return true;
        } catch (Exception e) {
            0kD.A07(C59767JXi.__redex_internal_original_name, "invalid logging call, assign to @haydenchristensen", e);
            return true;
        }
    }
}
