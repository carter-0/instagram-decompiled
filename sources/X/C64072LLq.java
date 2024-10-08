package X;

import java.util.Map;

/* renamed from: X.LLq  reason: case insensitive filesystem */
public abstract class C64072LLq {
    public static final Map A00 = AnonymousClass7TE.A1H();

    public static final VX9 A00(AnonymousClass07V r2) {
        0qQ.A0B(r2, 0);
        VX9 vx9 = (VX9) C51968G9o.A10(A00, r2.hashCode());
        if (vx9 != null) {
            return vx9;
        }
        throw AnonymousClass7TE.A0z("StoriesUIComponentServiceLocator is not initialized for this lifecycle");
    }
}
