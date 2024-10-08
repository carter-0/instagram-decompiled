package X;

import java.util.List;

/* renamed from: X.5eq  reason: invalid class name and case insensitive filesystem */
public abstract class C290155eq {
    public static final String A00(CharSequence charSequence, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            sb.append((CharSequence) obj);
        }
        sb.append("");
        return sb.toString();
    }
}
