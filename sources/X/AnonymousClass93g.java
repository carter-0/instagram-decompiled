package X;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.93g  reason: invalid class name */
public final class AnonymousClass93g extends 0Yg implements C62320sa {
    public static final AnonymousClass93g A00 = new AnonymousClass93g();

    public AnonymousClass93g() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        int i;
        String str;
        Integer A0l;
        File file = new File("/proc/meminfo");
        Charset charset = AnonymousClass15Q.A05;
        ArrayList arrayList = new ArrayList();
        C272134kB.A02(file, charset, new AnonymousClass9LR(arrayList, 29));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            if (00p.A0k(lowerCase, "memtotal", false)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null || (str = (String) new 11S("\\s+").A03(str2).get(1)) == null || (A0l = 00y.A0l(str)) == null) {
            i = -1;
        } else {
            i = A0l.intValue();
        }
        return Integer.valueOf(i);
    }
}
