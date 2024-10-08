package X;

import java.util.function.Consumer;

public final class GAD implements 2IR {
    public final /* synthetic */ 1aD A00;
    public final /* synthetic */ Consumer A01;

    public final void onFailure(Throwable th) {
    }

    public GAD(1aD r1, Consumer consumer) {
        this.A00 = r1;
        this.A01 = consumer;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj != null) {
            this.A01.accept(obj);
        }
    }
}
