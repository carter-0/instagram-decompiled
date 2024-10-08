package X;

import java.util.List;

/* renamed from: X.5cu  reason: invalid class name and case insensitive filesystem */
public abstract class C289035cu {
    public static final void A00(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(002.A0n("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }

    public static final void A01(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(002.A0n("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(002.A0c("fromIndex (", ") is less than 0.", i));
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException(002.A0X("toIndex (", ") is more than than the list size (", ')', i2, size));
        }
    }
}
