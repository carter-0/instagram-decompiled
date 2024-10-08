package X;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.3xR  reason: invalid class name and case insensitive filesystem */
public final class C257463xR implements C257473xS {
    public static final Random A02 = new Random();
    public int A00;
    public String A01;

    public final void A00(String str, String str2, boolean z) {
        C21340XXh xXh;
        if (2QF.A0X != null) {
            2QF A002 = 2QF.A00();
            synchronized (A002) {
                AnonymousClass0eK r2 = A002.A0I;
                if (r2 != null && A002.A02 == null) {
                    0ff.A01("MemoryManager.getMemoryInstanceEventFactory", 1469400571);
                    A002.A02 = (C21340XXh) r2.get();
                    0ff.A00(239582583);
                }
                xXh = A002.A02;
            }
            if (xXh != null) {
                0wc A003 = new AnonymousClass0kM(C61170le.A00).A00();
                String str3 = this.A01;
                Boolean valueOf = Boolean.valueOf(z);
                0Aj A004 = A003.A00(A003.A00, "android_memory_instance");
                if (A004.isSampled()) {
                    if (str == null) {
                        str = "";
                    }
                    A004.AAJ(C273654mx.A00(615), str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    A004.AAJ("surface_type", str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    A004.AAJ("asl_session_id", str3);
                    A004.AAJ("endpoint", "");
                    A004.A7p("is_leak", valueOf);
                    A004.Cgf();
                }
            }
        }
    }

    public final boolean isEnabled() {
        return 2QF.A00().A07().A02();
    }

    public final void onLeaksDetected(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj != null) {
                if (A02.nextInt(this.A00) == 0) {
                    A00(obj.getClass().getName(), (String) null, true);
                }
            }
        }
    }
}
