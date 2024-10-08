package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Td  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C331967Td extends 016 {
    public C331967Td(Object obj) {
        super(AnonymousClass7TI.class, obj, "messageRecyclerView", "getMessageRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
    }

    public final Object get() {
        RecyclerView recyclerView = ((AnonymousClass7TI) this.receiver).A04;
        if (recyclerView != null) {
            return recyclerView;
        }
        0qQ.A0F("messageRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
