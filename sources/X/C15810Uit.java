package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Uit  reason: case insensitive filesystem */
public final class C15810Uit extends AnonymousClass4AA {
    public final List A00;

    public C15810Uit() {
        this((List) null, (DefaultConstructorMarker) null, 1);
    }

    public /* synthetic */ C15810Uit(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = AnonymousClass7TE.A1I(new HES((C53504Gpa) null));
    }

    public final HES A00() {
        Object obj;
        HES hes;
        Iterator it = this.A00.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(obj instanceof HES));
        if ((obj instanceof HES) && (hes = (HES) obj) != null) {
            return hes;
        }
        throw new IllegalArgumentException("Expected product grid component");
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C15810Uit uit = (C15810Uit) obj;
        0qQ.A0B(uit, 0);
        return 0qQ.A0K(this.A00, uit.A00);
    }

    public C15810Uit(boolean z) {
        C53504Gpa gpa;
        if (z) {
            gpa = new C53504Gpa((Integer) null, (Integer) null, (Integer) null, false, false);
        } else {
            gpa = null;
        }
        this.A00 = AnonymousClass7TE.A1I(new HES(gpa));
    }
}
