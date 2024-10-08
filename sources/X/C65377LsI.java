package X;

import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.LsI  reason: case insensitive filesystem */
public final class C65377LsI implements MSQ {
    public final 0wc A00;

    public C65377LsI() {
        this((0wc) null, (DefaultConstructorMarker) null, 1);
    }

    public /* synthetic */ C65377LsI(0wc r3, DefaultConstructorMarker defaultConstructorMarker, int i) {
        0wc A002 = new AnonymousClass0kM(C61170le.A00).A00();
        0qQ.A0B(A002, 1);
        this.A00 = A002;
    }

    public final void AIG(C65380LsL lsL, C63718L4c l4c, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(String.valueOf(((IgSignalsFeature) it.next()).A00));
        }
        for (IgSignalsFeature igSignalsFeature : lsL.A05) {
            A1C.add(String.valueOf(igSignalsFeature.A00));
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_signals_android_commit");
        A0e.AAJ("product", l4c.A01);
        A0e.AAJ("product_identifier", l4c.A00);
        A0e.AAJ("model_state", DbT.A0z(";", A1C, (0sP) null));
        A0e.AAJ(AnonymousClass000.A00(3605), lsL.A04);
        A0e.A8D(Pxd.A00(90), Double.valueOf(lsL.A02));
        A0e.A8D("commit_time", Double.valueOf((double) System.currentTimeMillis()));
        A0e.Cgf();
    }
}
