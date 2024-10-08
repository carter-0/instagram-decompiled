package X;

import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.ListIterator;

public final class R1N extends AnonymousClass5GC {
    public final /* synthetic */ Lists$TransformingSequentialList A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R1N(Lists$TransformingSequentialList lists$TransformingSequentialList, ListIterator listIterator) {
        super(listIterator);
        this.A00 = lists$TransformingSequentialList;
    }

    public final Object A00(Object obj) {
        return this.A00.function.apply(obj);
    }
}
