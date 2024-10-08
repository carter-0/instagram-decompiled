package X;

import com.google.protobuf.UnsafeUtil;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public final class R5e extends C10899Rzz {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List A00(Object obj, int i, long j) {
        AbstractList r32;
        List list = (List) SK5.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof C13979TnV) {
                C13979TnV tnV = R32.A01;
                list = new R32(DbS.A0v(i));
            } else if (!(list instanceof C13493TbK) || !(list instanceof C13982TnY)) {
                list = DbS.A0v(i);
            } else {
                list = ((C13982TnY) list).Cop(i);
            }
            UnsafeUtil.A06(obj, j, list);
        } else {
            if (Pxh.A1W(A00, list)) {
                r32 = Pxi.A0k(list, i);
            } else if (list instanceof C13256TRw) {
                C13979TnV tnV2 = R32.A01;
                r32 = new R32(Pxi.A0k(list, i));
            } else if ((list instanceof C13493TbK) && (list instanceof C13982TnY)) {
                C13982TnY tnY = (C13982TnY) list;
                if (!((C13255TRv) tnY).A00) {
                    C13982TnY Cop = tnY.Cop(list.size() + i);
                    UnsafeUtil.A06(obj, j, Cop);
                    return Cop;
                }
            }
            r32.addAll(list);
            UnsafeUtil.A06(obj, j, r32);
            return r32;
        }
        return list;
    }
}
