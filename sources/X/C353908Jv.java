package X;

import java.util.Iterator;

/* renamed from: X.8Jv  reason: invalid class name and case insensitive filesystem */
public final class C353908Jv implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass80R A00;

    public C353908Jv(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        long j;
        C362048hG r0;
        Object obj;
        AnonymousClass80R r1 = this.A00;
        String str = r1.A0o.A02.A01.A0G;
        AnonymousClass8WX r02 = r1.A1N;
        if (!(r02 == null || (r0 = r02.A00().A02) == null || str == null)) {
            Iterator it = ((Iterable) r0.A0o.A0J.A01.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C369988ve) obj).A07, str)) {
                    break;
                }
            }
            C369988ve r12 = (C369988ve) obj;
            if (r12 != null) {
                j = r12.A01;
                return Long.valueOf(j);
            }
        }
        j = 0;
        return Long.valueOf(j);
    }
}
