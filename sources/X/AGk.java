package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class AGk {
    public static final Set A00;
    public static final ConcurrentMap A01 = new ConcurrentHashMap();
    public static final Logger A02 = Logger.getLogger(AGk.class.getName());

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add(AnonymousClass98Q.class);
        A1F.add(AnonymousClass97H.class);
        A1F.add(C41775B0e.class);
        A1F.add(B1C.class);
        A1F.add(C41772B0b.class);
        A1F.add(AnonymousClass98U.class);
        A1F.add(AnonymousClass9DT.class);
        A1F.add(C41773B0c.class);
        A1F.add(C41774B0d.class);
        A00 = Collections.unmodifiableSet(A1F);
    }

    public static Object A00(C3741498i r5, Class cls) {
        String str = r5.typeUrl_;
        AnonymousClass97R r52 = r5.value_;
        C3738697g A002 = AnonymousClass98M.A00(AnonymousClass98M.A02, str);
        C3738597f r1 = (C3738597f) A002;
        Class cls2 = r1.A02;
        if (cls2.equals(cls)) {
            return AnonymousClass979.A01.A00(C3739497o.A01.A00(C375049Ca.A00, C3739997t.A00(r1.A00, AnonymousClass98D.RAW, r52, (Integer) null, r1.A03)), cls2);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Primitive type ");
        A1A.append(cls.getName());
        A1A.append(" not supported by key manager of type ");
        A1A.append(A002.getClass());
        throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(cls2, ", which only supports: ", A1A));
    }
}
