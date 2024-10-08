package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6rJ  reason: invalid class name and case insensitive filesystem */
public final class C319836rJ {
    public static final Class[] A05;
    public final AnonymousClass08X A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final void A01(String str, Object obj) {
        2Fk r1;
        0qQ.A0B(str, 0);
        if (obj != null) {
            Class[] clsArr = A05;
            int i = 0;
            do {
                Class cls = clsArr[i];
                0qQ.A0A(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            } while (i < 29);
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof AnonymousClass2Fj) || (r1 = (2Fk) obj2) == null) {
            this.A03.put(str, obj);
        } else {
            r1.A0B(obj);
        }
        05G r0 = (05G) this.A01.get(str);
        if (r0 != null) {
            r0.Epw(obj);
        }
    }

    static {
        Class[] clsArr = new Class[29];
        System.arraycopy(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class}, 0, clsArr, 0, 27);
        System.arraycopy(new Class[]{Size.class, SizeF.class}, 0, clsArr, 27, 2);
        A05 = clsArr;
    }

    public final Object A00(String str) {
        try {
            return this.A03.get(str);
        } catch (ClassCastException unused) {
            this.A03.remove(str);
            C7423QCo qCo = (C7423QCo) this.A02.remove(str);
            if (qCo != null) {
                qCo.A00 = null;
            }
            this.A01.remove(str);
            return null;
        }
    }

    public C319836rJ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C11758Sfu(this);
        linkedHashMap.putAll(map);
    }

    public C319836rJ() {
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A00 = new C11758Sfu(this);
    }
}
