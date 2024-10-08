package X;

import android.util.SparseArray;

/* renamed from: X.Uxd  reason: case insensitive filesystem */
public enum C16583Uxd {
    A07(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(3),
    CODE(8),
    STRIKETHROUGH(16),
    SUBSCRIPT(32),
    SUPERSCRIPT(64),
    QUOTE(128),
    SEMIBOLD(C249703kE.FLAG_MOVED);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16583Uxd[] uxdArr;
        A02 = 0oU.A00(uxdArr);
        A01 = new SparseArray();
        for (C16583Uxd uxd : values()) {
            A01.put(uxd.A00, uxd);
        }
    }

    /* access modifiers changed from: public */
    C16583Uxd(int i) {
        this.A00 = i;
    }
}
