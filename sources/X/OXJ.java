package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.direct.HighlightRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public abstract class OXJ {
    public static final String A02(Integer num) {
        if (num == null) {
            return "unknown";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "one_to_one";
        }
        if (intValue == 2) {
            return "group";
        }
        if (intValue == 16) {
            return "secure_group";
        }
        if (intValue == 15) {
            return "secure_one_to_one";
        }
        return "unknown";
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static final ImmutableList A00(ImmutableList immutableList, int i) {
        if (immutableList.isEmpty()) {
            return immutableList;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = immutableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            HighlightRange highlightRange = (HighlightRange) immutableList.get(i2);
            int i3 = highlightRange.A02;
            int i4 = i - 1;
            int min = Math.min(highlightRange.A00, i4);
            if (i2 != 0) {
                HighlightRange highlightRange2 = (HighlightRange) A1C.get(A1C.size() - 1);
                int i5 = highlightRange2.A00;
                if (i5 == i4) {
                    break;
                } else if (i5 >= i3) {
                    int max = Math.max(i5, min);
                    int size2 = A1C.size() - 1;
                    int i6 = highlightRange2.A02;
                    int i7 = (max - i6) + 1;
                    ? obj = new Object();
                    obj.A02 = i6;
                    obj.A01 = i7;
                    obj.A00 = (i6 + i7) - 1;
                    A1C.set(size2, obj);
                }
            }
            int i8 = (min - i3) + 1;
            ? obj2 = new Object();
            obj2.A02 = i3;
            obj2.A01 = i8;
            obj2.A00 = (i3 + i8) - 1;
            A1C.add(obj2);
        }
        return ImmutableList.copyOf((Collection) A1C);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static final ImmutableList A01(String str) {
        List list;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (str != null) {
            if (str.length() != 0) {
                List A03 = new 11S("\\s+").A03(str);
                if (!A03.isEmpty()) {
                    ListIterator A18 = C51968G9o.A18(A03);
                    while (true) {
                        if (A18.hasPrevious()) {
                            if (((String) A18.previous()).length() != 0) {
                                list = 00k.A0d(A03, A18.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list = 0sn.A00;
                String[] A1b = DbU.A1b(list, 0);
                for (int i = 0; i < A1b.length; i += 4) {
                    if (Integer.parseInt(A1b[i]) == 5) {
                        int parseInt = Integer.parseInt(A1b[i + 2]);
                        int parseInt2 = Integer.parseInt(A1b[i + 3]);
                        ? obj = new Object();
                        obj.A02 = parseInt;
                        obj.A01 = parseInt2;
                        obj.A00 = (parseInt + parseInt2) - 1;
                        builder.add(obj);
                    }
                }
            }
        }
        return DbZ.A0K(builder);
    }
}
