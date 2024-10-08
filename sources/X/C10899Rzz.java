package X;

import com.google.protobuf.UnsafeUtil;
import java.util.List;

/* renamed from: X.Rzz  reason: case insensitive filesystem */
public abstract class C10899Rzz {
    public static final C10899Rzz A00 = new Object();
    public static final C10899Rzz A01 = new Object();

    public final List A01(Object obj, long j) {
        if (!(this instanceof R5d)) {
            return R5e.A00(obj, 10, j);
        }
        C13982TnY tnY = (C13982TnY) SK5.A00(obj, j);
        if (((C13255TRv) tnY).A00) {
            return tnY;
        }
        C13982TnY Cop = tnY.Cop(Pxg.A0A(tnY));
        UnsafeUtil.A06(obj, j, Cop);
        return Cop;
    }
}
