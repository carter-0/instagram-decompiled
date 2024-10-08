package X;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.6r4  reason: invalid class name and case insensitive filesystem */
public final class C319706r4 implements AnonymousClass0hF {
    public final C319686r2 A00;
    public final Object A01;

    public final void Dms(07T r4, AnonymousClass07Z r5) {
        C319686r2 r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A00;
        C319686r2.A00(r4, r5, obj, (List) map.get(r4));
        C319686r2.A00(r4, r5, obj, (List) map.get(07T.ON_ANY));
    }

    public C319706r4(Object obj) {
        this.A01 = obj;
        C319676r0 r2 = C319676r0.A02;
        Class<?> cls = obj.getClass();
        C319686r2 r0 = (C319686r2) r2.A00.get(cls);
        this.A00 = r0 == null ? C319676r0.A00(r2, cls, (Method[]) null) : r0;
    }
}
