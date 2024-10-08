package X;

/* renamed from: X.RuD  reason: case insensitive filesystem */
public final class C10559RuD {
    public Object A00;
    public Object A01;
    public boolean A02;

    public static final String A00(C10559RuD ruD, String str, int i) {
        Object obj;
        if (i == 0) {
            obj = ruD.A00;
        } else if (i != 1) {
            obj = null;
        } else {
            try {
                obj = ruD.A01;
            } catch (Exception unused) {
                return null;
            }
        }
        if (obj == null) {
            return null;
        }
        Object invoke = obj.getClass().getDeclaredMethod(str, new Class[0]).invoke(obj, new Object[0]);
        if (invoke != null) {
            return invoke.toString();
        }
        throw AnonymousClass7TE.A0y();
    }
}
