package X;

import java.util.List;

/* renamed from: X.IzH  reason: case insensitive filesystem */
public final class C58892IzH extends 0Yg implements 0sP {
    public static final C58892IzH A00 = new C58892IzH();

    public C58892IzH() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6Gj r2;
        List list = (List) obj;
        C286015Tp r0 = I4L.A05;
        Object obj2 = list.get(1);
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (AnonymousClass7TE.A1a(obj2)) {
            r2 = AnonymousClass6Gj.Vertical;
        } else {
            r2 = AnonymousClass6Gj.Horizontal;
        }
        return new I4L(r2, C51970G9q.A04(AnonymousClass7TE.A13(list), "null cannot be cast to non-null type kotlin.Float"));
    }
}
