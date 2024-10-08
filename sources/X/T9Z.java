package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.Serializable;

public final class T9Z implements Serializable {
    public final Class A00;
    public final Class A01;
    public final Object A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            T9Z t9z = (T9Z) obj;
            if (!(t9z.A02.equals(this.A02) && t9z.A01 == this.A01 && t9z.A00 == this.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        String name;
        Object obj = this.A02;
        Class cls = this.A01;
        String str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        if (cls == null) {
            name = str;
        } else {
            name = cls.getName();
        }
        Class cls2 = this.A00;
        if (cls2 != null) {
            str = cls2.getName();
        }
        return String.format("[ObjectId: key=%s, type=%s, scope=%s]", new Object[]{obj, name, str});
    }

    public T9Z(Class cls, Class cls2, Object obj) {
        this.A01 = cls;
        this.A00 = cls2;
        this.A02 = obj;
        int A012 = C41845B3m.A01(cls.getName(), obj.hashCode());
        this.A03 = cls2 != null ? A012 ^ cls2.getName().hashCode() : A012;
    }
}
