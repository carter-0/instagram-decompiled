package com.facebook.react.common.mapbuffer;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C13992Tns;
import X.C20387WqT;
import X.DbW;
import X.JTO;
import X.SBP;
import X.XCN;
import android.util.SparseArray;
import java.util.Iterator;

public final class WritableMapBuffer implements XCN {
    public static final WritableMapBuffer $redex_init_class = null;
    public final SparseArray A00 = new SparseArray();

    private final int[] getKeys() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    private final Object[] getValues() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object valueAt = sparseArray.valueAt(i);
            0qQ.A07(valueAt);
            objArr[i] = valueAt;
        }
        return objArr;
    }

    public final boolean contains(int i) {
        return AnonymousClass7TF.A1V(this.A00.get(i));
    }

    public final boolean getBoolean(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (obj instanceof Boolean) {
            return AnonymousClass7TE.A1a(obj);
        } else {
            throw C13992Tns.A0C(Boolean.class, obj, C13990Tnq.A0d(), i);
        }
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final double getDouble(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (obj instanceof Double) {
            return JTO.A00(obj);
        } else {
            throw C13992Tns.A0C(Double.class, obj, C13990Tnq.A0d(), i);
        }
    }

    public final int getInt(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (obj instanceof Integer) {
            return AnonymousClass7TE.A0M(obj);
        } else {
            throw C13992Tns.A0C(Integer.class, obj, C13990Tnq.A0d(), i);
        }
    }

    public final XCN getMapBuffer(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (obj instanceof XCN) {
            return (XCN) obj;
        } else {
            throw C13992Tns.A0C(XCN.class, obj, C13990Tnq.A0d(), i);
        }
    }

    public final String getString(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            throw DbW.A0a("Key not found: ", i);
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            throw C13992Tns.A0C(String.class, obj, C13990Tnq.A0d(), i);
        }
    }

    public final Iterator iterator() {
        return new C20387WqT(this);
    }

    static {
        SBP.A00();
    }
}
