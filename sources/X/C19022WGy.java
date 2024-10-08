package X;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.WGy  reason: case insensitive filesystem */
public final class C19022WGy implements X5s {
    public final String A00;
    public final List A01;
    public final Pattern A02;
    public final String A03;

    public final String getName() {
        return this.A03;
    }

    public C19022WGy(String str, String str2, List list) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = list;
        char c = 65535;
        switch (str2.hashCode()) {
            case -567445985:
                if (str2.equals("contains")) {
                    c = 0;
                    break;
                }
                break;
            case 3365:
                if (str2.equals("in")) {
                    c = 1;
                    break;
                }
                break;
            case 109075:
                if (str2.equals("nin")) {
                    c = 2;
                    break;
                }
                break;
            case 108392519:
                if (str2.equals("regex")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (list == null || list.size() != 1) {
                    throw new C16687V1q("Mismatching number of values", str);
                }
                return;
            case 1:
            case 2:
                if (list == null || list.isEmpty()) {
                    throw new C16687V1q("Mismatching number of values", str);
                }
                return;
            case 3:
                if (list == null || list.size() != 1) {
                    throw new C16687V1q("Mismatching number of values", str);
                }
                try {
                    this.A02 = Pattern.compile(AnonymousClass7TE.A19(list, 0));
                    return;
                } catch (PatternSyntaxException unused) {
                    throw new C16687V1q("Regex syntax error", str);
                }
            default:
                throw new C16687V1q("Illegal string strategy", str);
        }
    }

    public final boolean CmQ(W2K w2k) {
        String obj = w2k.toString();
        String str = this.A00;
        switch (str.hashCode()) {
            case -567445985:
                if (str.equals("contains")) {
                    return obj.contains((CharSequence) this.A01.get(0));
                }
                return false;
            case 3365:
                if (str.equals("in")) {
                    return this.A01.contains(obj);
                }
                return false;
            case 109075:
                if (str.equals("nin")) {
                    return !this.A01.contains(obj);
                }
                return false;
            case 108392519:
                if (str.equals("regex")) {
                    return DbV.A1b(obj, this.A02);
                }
                return false;
            default:
                return false;
        }
    }
}
