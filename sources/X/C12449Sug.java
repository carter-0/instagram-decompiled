package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Sug  reason: case insensitive filesystem */
public final class C12449Sug implements C13782Tgx {
    public final int A00;
    public final C268894eF A01;

    public static void A00(int i) {
        if (i != 1) {
            throw AnonymousClass7TE.A0w(002.A0c("Can not deserialize Singleton container from ", " entries", i));
        }
    }

    public final Object AJt(Object obj) {
        if (obj == null) {
            return null;
        }
        switch (this.A00) {
            case 1:
                Set set = (Set) obj;
                A00(set.size());
                return Collections.singleton(set.iterator().next());
            case 2:
                List list = (List) obj;
                A00(list.size());
                return Collections.singletonList(AnonymousClass7TE.A13(list));
            case 3:
                Map map = (Map) obj;
                A00(map.size());
                Map.Entry A1J = AnonymousClass7TE.A1J(AnonymousClass7TF.A0u(map));
                return Collections.singletonMap(A1J.getKey(), A1J.getValue());
            case 4:
                return Collections.unmodifiableSet((Set) obj);
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return Collections.unmodifiableMap((Map) obj);
            case 7:
                return Collections.synchronizedSet((Set) obj);
            case 8:
                return Collections.synchronizedCollection((Collection) obj);
            case 9:
                return Collections.synchronizedList((List) obj);
            case 10:
                return Collections.synchronizedMap((Map) obj);
            default:
                return obj;
        }
    }

    public final C268894eF BHa(AnonymousClass4eE r2) {
        return this.A01;
    }

    public final C268894eF BZZ(AnonymousClass4eE r2) {
        return this.A01;
    }

    public C12449Sug(C268894eF r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
