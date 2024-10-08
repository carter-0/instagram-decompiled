package X;

import android.text.Layout;

/* renamed from: X.5iN  reason: invalid class name and case insensitive filesystem */
public abstract class C292085iN {
    public static final Layout.Alignment A00;
    public static final Layout.Alignment A01;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (0qQ.A0K(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (0qQ.A0K(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        A00 = alignment;
        A01 = alignment2;
    }
}
