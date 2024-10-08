package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4NZ  reason: invalid class name */
public final class AnonymousClass4NZ {
    public static C263704Na A00;
    public static C263714Nb A01;
    public static String A02;
    public static WeakReference A03;
    public static boolean A04;
    public static final AnonymousClass4NZ A05 = new Object();
    public static final Map A06 = new LinkedHashMap();
    public static final Map A07 = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4NZ, java.lang.Object] */
    static {
        C263704Na r1 = new C263704Na(false, false, false, false, false);
        r1.A00 = true;
        A00 = r1;
    }

    public static final String A00(View view, String str) {
        int i;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        if (A04) {
            return 002.A0G(str, '_', i);
        }
        return str;
    }

    public static final void A01(View view, String str, long j) {
        Boolean bool;
        String str2 = str;
        if (str != null) {
            AnonymousClass5M7 r7 = (AnonymousClass5M7) A07.get(A00(view, str2));
            if (r7 != null) {
                C17723Vcs vcs = r7.A03;
                AnonymousClass4OK r6 = vcs.A01;
                if (r6 == null) {
                    r6 = new AnonymousClass4OK(str2);
                    vcs.A01 = r6;
                }
                long A002 = AnonymousClass5M7.A00();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = j;
                C21068XDg xDg = new C21068XDg(j2, j2, currentTimeMillis);
                if (vcs.A00 >= 50 && r7.A04) {
                    xDg.A04 = currentTimeMillis * 100;
                }
                r6.A03(xDg);
                if (!vcs.A0B) {
                    C257433xO r0 = (C257433xO) r7.A00.get();
                    if (r0 != null) {
                        bool = Boolean.valueOf(r0.Ce9());
                    } else {
                        bool = null;
                    }
                    vcs.A02 = bool;
                    vcs.A0B = true;
                    r7.A02 = false;
                    vcs.A03 = Long.valueOf(A002);
                    AnonymousClass5M7.A02(r7, AnonymousClass000.A00(4206), vcs.A00, j2, A002);
                }
            }
        }
    }

    public static final boolean A03() {
        C263704Na r1 = A00;
        if (r1.A04 || r1.A05) {
            return true;
        }
        return false;
    }

    public final void A04(String str, String str2) {
        List<Object> list;
        int length;
        if (A04) {
            Set keySet = A07.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object next : keySet) {
                String str3 = (String) next;
                if (00p.A0k(str3, str, false) && str3.length() > (length = str.length()) && str3.charAt(length) == '_') {
                    arrayList.add(next);
                }
            }
            list = 00k.A0a(arrayList);
        } else {
            list = Collections.singletonList(str);
            0qQ.A07(list);
        }
        for (Object obj : list) {
            AnonymousClass5M7 r0 = (AnonymousClass5M7) A07.get(obj);
            if (r0 != null) {
                r0.A03.A05 = str2;
            }
        }
    }

    public final void A05(String str, String str2) {
        if (A04) {
            str = str2;
        }
        Map map = A07;
        AnonymousClass5M7 r1 = (AnonymousClass5M7) map.get(str);
        if (r1 == null) {
            return;
        }
        if (r1.A01) {
            map.remove(str);
        } else {
            r1.A02 = true;
        }
    }

    public static final void A02(String str, View view) {
        AnonymousClass5M7 r4 = (AnonymousClass5M7) A07.get(A00(view, str));
        if (r4 != null) {
            long A012 = AnonymousClass5M7.A01(r4, str);
            long A002 = AnonymousClass5M7.A00();
            C17723Vcs vcs = r4.A03;
            List list = vcs.A07;
            Long valueOf = Long.valueOf(A002);
            list.add(valueOf);
            AnonymousClass5M7.A02(r4, "paused", vcs.A00, A012, A002);
            vcs.A09.put(valueOf, Long.valueOf(A012));
        }
    }
}
