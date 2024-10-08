package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.7Ua  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332197Ua extends 016 {
    public C332197Ua(Object obj) {
        super(AnonymousClass7TI.class, obj, "nestedScrollingParent", "getNestedScrollingParent()Lcom/instagram/ui/widget/refresh/RefreshableNestedScrollingParent;");
    }

    public final Object get() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = ((AnonymousClass7TI) this.receiver).A0E;
        if (refreshableNestedScrollingParent != null) {
            return refreshableNestedScrollingParent;
        }
        0qQ.A0F("nestedScrollingParent");
        throw AnonymousClass00P.createAndThrow();
    }
}
