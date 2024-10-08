package X;

import com.google.common.collect.ImmutableMap;
import java.util.Set;

public final class TU4 extends 0Yg implements C62320sa {
    public static final TU4 A00 = new TU4();

    public TU4() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        AnonymousClass0eM r4 = STI.A0C;
        return Pxe.A0Z(A0Q, "ml-cc-csc", Pxh.A0z("password", Pxi.A0o(A0Q, "ml-cc-exp", Pxh.A0z("birthdate|dob|invaliddate", Pxi.A0o(A0Q, "ml-cc-exp-year", Pxh.A0z("cardmonthyear", Pxi.A0o(A0Q, "ml-cc-exp-month", Pxh.A0z("cardmonthyear", (Set) r4.getValue()), r4)), r4)), r4)));
    }
}
