package X;

import java.util.Iterator;

/* renamed from: X.48w  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C2612548w {
    public static /* synthetic */ String A00(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
