package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

public final class Q6I extends ContextWrapper {
    public static final TA2 A0A = new TA2();
    public QHM A00;
    public final int A01 = 4;
    public final C10168Rnj A02;
    public final SOI A03;
    public final ST0 A04;
    public final C13882Tj5 A05;
    public final List A06;
    public final Map A07;
    public final C10166Rnh A08;
    public final C9216RTt A09;

    public Q6I(Context context, C10166Rnh rnh, C10168Rnj rnj, SOI soi, ST0 st0, C9216RTt rTt, C13882Tj5 tj5, List list, Map map) {
        super(context.getApplicationContext());
        this.A04 = st0;
        this.A09 = rTt;
        this.A08 = rnh;
        this.A06 = list;
        this.A07 = map;
        this.A03 = soi;
        this.A02 = rnj;
        this.A05 = new C12000SkJ(tj5);
    }
}
