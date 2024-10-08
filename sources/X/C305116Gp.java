package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.6Gp  reason: invalid class name and case insensitive filesystem */
public final class C305116Gp extends 0Yg implements 0sP {
    public static final C305116Gp A00 = new C305116Gp();

    public C305116Gp() {
        super(1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Gt, X.6Gs, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C286015Tp r0 = LazyListState.A0O;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        ? obj2 = new Object();
        obj2.A00 = -1;
        return new LazyListState(obj2, intValue, intValue2);
    }
}
