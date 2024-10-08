package X;

import java.util.function.BiConsumer;

public final class TOY implements BiConsumer {
    public final int A00;
    public final Object A01;

    public TOY(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((0sL) this.A01).invoke(obj, obj2);
    }
}
