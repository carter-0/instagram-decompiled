package X;

import java.util.LinkedList;

/* renamed from: X.4iE  reason: invalid class name */
public abstract class AnonymousClass4iE extends C65171bF {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.T9W, java.lang.Object] */
    public final void A08(Object obj, String str) {
        AnonymousClass4iD r1 = (AnonymousClass4iD) this;
        ? obj2 = new Object();
        obj2.A00 = -1;
        obj2.A03 = obj;
        if (str != null) {
            obj2.A02 = str;
            LinkedList linkedList = r1.A00;
            if (linkedList == null) {
                linkedList = new LinkedList();
                r1.A00 = linkedList;
            }
            if (linkedList.size() < 1000) {
                linkedList.addFirst(obj2);
                return;
            }
            return;
        }
        throw new NullPointerException("Cannot pass null fieldName");
    }
}
