package X;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.WritableMapBuffer;

/* renamed from: X.WIm  reason: case insensitive filesystem */
public final class C19060WIm implements X9J {
    public final int A00;
    public final int A01;
    public final C16515UwK A02;
    public final /* synthetic */ WritableMapBuffer A03;

    public C19060WIm(WritableMapBuffer writableMapBuffer, int i) {
        C16515UwK uwK;
        this.A03 = writableMapBuffer;
        this.A00 = i;
        WritableMapBuffer writableMapBuffer2 = WritableMapBuffer.$redex_init_class;
        SparseArray sparseArray = writableMapBuffer.A00;
        this.A01 = sparseArray.keyAt(i);
        Object valueAt = sparseArray.valueAt(i);
        0qQ.A07(valueAt);
        int i2 = this.A01;
        if (valueAt instanceof Boolean) {
            uwK = C16515UwK.BOOL;
        } else if (valueAt instanceof Integer) {
            uwK = C16515UwK.INT;
        } else if (valueAt instanceof Long) {
            uwK = C16515UwK.A05;
        } else if (valueAt instanceof Double) {
            uwK = C16515UwK.DOUBLE;
        } else if (valueAt instanceof String) {
            uwK = C16515UwK.STRING;
        } else if (valueAt instanceof XCN) {
            uwK = C16515UwK.MAP;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Key ");
            sb.append(i2);
            Pxg.A1R(sb, " has value of unknown type: ", valueAt);
            throw new IllegalStateException(sb.toString());
        }
        this.A02 = uwK;
    }

    public static Object A00(C19060WIm wIm) {
        WritableMapBuffer writableMapBuffer = wIm.A03;
        WritableMapBuffer writableMapBuffer2 = WritableMapBuffer.$redex_init_class;
        return writableMapBuffer.A00.valueAt(wIm.A00);
    }

    public final boolean Agz() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof Boolean) {
            return AnonymousClass7TE.A1a(A002);
        } else {
            throw C13992Tns.A0C(Boolean.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final double Ayk() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof Double) {
            return JTO.A00(A002);
        } else {
            throw C13992Tns.A0C(Double.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final int BI6() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof Integer) {
            return AnonymousClass7TE.A0M(A002);
        } else {
            throw C13992Tns.A0C(Integer.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final int BJq() {
        return this.A01;
    }

    public final long BOX() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof Long) {
            return AnonymousClass7TE.A0R(A002);
        } else {
            throw C13992Tns.A0C(Long.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final XCN BOx() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof XCN) {
            return (XCN) A002;
        } else {
            throw C13992Tns.A0C(XCN.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final String C1u() {
        int i = this.A01;
        Object A002 = A00(this);
        if (A002 == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (A002 instanceof String) {
            return (String) A002;
        } else {
            throw C13992Tns.A0C(String.class, A002, C13990Tnq.A0d(), i);
        }
    }

    public final C16515UwK CAF() {
        return this.A02;
    }
}
