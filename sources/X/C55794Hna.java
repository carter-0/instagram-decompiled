package X;

import java.util.List;

/* renamed from: X.Hna  reason: case insensitive filesystem */
public final class C55794Hna {
    public int A00;
    public int A01;
    public final List A02;
    public final List[] A03;
    public final /* synthetic */ GR8 A04;

    public C55794Hna(GR8 gr8, List list) {
        this.A04 = gr8;
        this.A02 = list;
        this.A03 = new List[list.size()];
        if (!AnonymousClass7TE.A1b(list)) {
            throw AnonymousClass7TE.A0w("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
