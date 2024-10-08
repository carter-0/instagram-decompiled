package X;

import java.io.Serializable;

/* renamed from: X.4iK  reason: invalid class name */
public final class AnonymousClass4iK extends AnonymousClass4iL implements Serializable {
    public static C268894eF A00(C268894eF r2, Class cls) {
        C268894eF A0B = r2.A0B(cls);
        if (A0B != null) {
            return A0B;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Strange ");
        sb.append(cls.getName());
        sb.append(" sub-type, ");
        sb.append(r2);
        sb.append(", can not find type parameters");
        throw new IllegalArgumentException(sb.toString());
    }
}
