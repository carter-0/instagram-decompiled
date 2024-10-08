package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6IO  reason: invalid class name */
public final class AnonymousClass6IO extends AnonymousClass5RC {
    public final /* synthetic */ AnonymousClass6IJ A00;
    public final /* synthetic */ 0sL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IO(AnonymousClass6IJ r2, 0sL r3) {
        super("Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.");
        this.A00 = r2;
        this.A01 = r3;
    }

    public final C289145d6 Cnx(C268004cb r5, List list, long j) {
        C289145d6 gRq;
        AnonymousClass6IJ r3 = this.A00;
        AnonymousClass6IK r2 = r3.A08;
        r2.A02 = r5.getLayoutDirection();
        r2.A00 = r5.AwL();
        r2.A01 = r5.B77();
        if (r5.CWf() || r3.A09.A08 == null) {
            r3.A00 = 0;
            C289145d6 r1 = (C289145d6) this.A01.invoke(r2, new Constraints(j));
            gRq = new C52413GRq(r3, r1, r1, r3.A00);
        } else {
            r3.A01 = 0;
            C289145d6 r12 = (C289145d6) this.A01.invoke(r3.A07, new Constraints(j));
            gRq = new IGV(r3, r12, r12, r3.A01);
        }
        return gRq;
    }
}
