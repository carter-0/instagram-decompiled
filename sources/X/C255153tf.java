package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* renamed from: X.3tf  reason: invalid class name and case insensitive filesystem */
public final class C255153tf implements PrivilegedAction {
    public final /* synthetic */ C255143te A00;
    public final /* synthetic */ Class A01;

    public C255153tf(C255143te r1, Class cls) {
        this.A00 = r1;
        this.A01 = cls;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        ArrayList arrayList = new ArrayList(r5);
        for (Field field : this.A01.getDeclaredFields()) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        AccessibleObject[] accessibleObjectArr = (AccessibleObject[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(accessibleObjectArr, true);
        return accessibleObjectArr;
    }
}
