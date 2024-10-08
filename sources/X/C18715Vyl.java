package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vyl  reason: case insensitive filesystem */
public final class C18715Vyl {
    public static final Map A00 = new HashMap();
    public static final Map A01 = new HashMap();

    public static Object A00(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(002.A0R(name, "$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            0I1.A04("ViewManagerPropertyUpdater", AnonymousClass7TG.A0m(cls, "Could not find generated setter for ", new StringBuilder()));
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(002.A0R("Unable to instantiate methods getter for ", name), e);
        }
    }
}
