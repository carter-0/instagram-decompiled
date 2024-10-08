package X;

import java.util.Comparator;

/* renamed from: X.ArU  reason: case insensitive filesystem */
public final class C41289ArU implements Comparator {
    public static final C41289ArU A00 = new C41289ArU();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C248923io r3 = (C248923io) obj;
        C248923io r4 = (C248923io) obj2;
        AnonymousClass7TG.A1N(r3, r4);
        return r3.getZIndex() - r4.getZIndex();
    }
}
