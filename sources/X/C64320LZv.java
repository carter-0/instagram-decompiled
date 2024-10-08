package X;

/* renamed from: X.LZv  reason: case insensitive filesystem */
public final class C64320LZv implements AnonymousClass2gO, C61910qF {
    public final int A00;
    public final Object A01;

    public C64320LZv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean equals(Object obj) {
        Object functionDelegate;
        boolean z = obj instanceof AnonymousClass2gO;
        if (14 - this.A00 != 0) {
            if (!z || !(obj instanceof C61910qF)) {
                return false;
            }
            functionDelegate = this.A01;
        } else if (!z || !(obj instanceof C61910qF)) {
            return false;
        } else {
            functionDelegate = getFunctionDelegate();
        }
        return AnonymousClass7TG.A1Y(obj, functionDelegate);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        if (14 - this.A00 != 0) {
            return (AnonymousClass0eL) this.A01;
        }
        return new 03J(1, this.A01, K67.class, "maybeDisplayTaggedItemsView", "maybeDisplayTaggedItemsView(Ljava/util/List;)V", 0);
    }

    public final int hashCode() {
        Object functionDelegate;
        if (14 - this.A00 != 0) {
            functionDelegate = this.A01;
        } else {
            functionDelegate = getFunctionDelegate();
        }
        return functionDelegate.hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        if (14 - this.A00 != 0) {
            C51965G9l.A1W(this.A01, obj);
            return;
        }
        ((K67) this.A01).A08(JTQ.A0i(obj));
    }
}
