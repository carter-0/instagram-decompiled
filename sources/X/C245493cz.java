package X;

/* renamed from: X.3cz  reason: invalid class name and case insensitive filesystem */
public final class C245493cz {
    public static final 2Tk A00(Object obj) {
        if (obj == null) {
            throw new RuntimeException("layout data must not be null.");
        } else if (obj instanceof 2Tk) {
            return (2Tk) obj;
        } else {
            throw new RuntimeException(002.A0g("RenderTreeNode layout data for Litho should be LithoLayoutData but was <cls>", obj.getClass().getName(), "</cls>"));
        }
    }

    public final C70672Tq A01(Object obj) {
        Object obj2 = A00(obj).A05;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof C70672Tq) {
            return (C70672Tq) obj2;
        }
        throw new RuntimeException(002.A0g("Layout data was not InterStagePropsContainer but was <cls>", obj2.getClass().getName(), "</cls>"));
    }
}
