package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.87f  reason: invalid class name and case insensitive filesystem */
public final class C3510087f implements C3509787c {
    public final /* synthetic */ AnonymousClass872 A00;

    public C3510087f(AnonymousClass872 r1) {
        this.A00 = r1;
    }

    public final void D8d(List list) {
        boolean z;
        Object obj;
        ArrayList arrayList = new ArrayList(list);
        AnonymousClass872 r9 = this.A00;
        AnonymousClass876 r5 = r9.A0H;
        r5.A06(arrayList);
        C3508086k r4 = r9.A0J;
        r4.A00().EBE();
        r4.A00().FK5();
        AnonymousClass80D r8 = r9.A02;
        String str = r8.A2d;
        if (str == null || r9.A00) {
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AnonymousClass87G) it.next()).getId());
            }
            Set A0k = 00k.A0k(arrayList2);
            Set set = r9.A03;
            boolean z2 = false;
            if (!0qQ.A0K(A0k, set)) {
                if (!set.isEmpty()) {
                    Set A0m = 00k.A0m(A0k, set);
                    if (A0m.size() == 1) {
                        obj = 00k.A0A(A0m);
                    } else {
                        obj = null;
                    }
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (0qQ.A0K(((AnonymousClass87G) it2.next()).getId(), obj)) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    int intValue = Integer.valueOf(i).intValue();
                    if (r5.A07(intValue)) {
                        r4.A00().EXs(false);
                        r5.A03(intValue);
                        r4.A00().EXs(true);
                        z2 = true;
                    }
                    set.clear();
                }
                set.addAll(A0k);
                if (z2) {
                    return;
                }
            }
            if (r8.A2d == null) {
                UserSession userSession = r9.A0C;
                0qQ.A06(userSession);
                String str2 = null;
                String string = 1Au.A00(userSession).A01.getString("quick_snap_last_selected_dial_id", (String) null);
                if (string != null) {
                    AnonymousClass87G A01 = r5.A01();
                    if (A01 != null) {
                        str2 = A01.getId();
                    }
                    if (!string.equals(str2)) {
                        List unmodifiableList = Collections.unmodifiableList(r5.A08);
                        0qQ.A07(unmodifiableList);
                        Iterator it3 = unmodifiableList.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                if (0qQ.A0K(((AnonymousClass87G) it3.next()).getId(), string)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        int intValue2 = Integer.valueOf(i2).intValue();
                        z = true;
                        if (intValue2 != -1) {
                            r4.A00().EXs(false);
                            r5.A03(intValue2);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            List unmodifiableList2 = Collections.unmodifiableList(r5.A08);
            0qQ.A07(unmodifiableList2);
            Iterator it4 = unmodifiableList2.iterator();
            int i3 = 0;
            while (true) {
                if (it4.hasNext()) {
                    if (0qQ.A0K(((AnonymousClass87G) it4.next()).getId(), str)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i3);
            z = true;
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            r4.A00().EXs(false);
            if (valueOf != null) {
                r5.A03(valueOf.intValue());
            }
            r9.A00 = r9.A01.A02;
        }
        r4.A00().EXs(z);
    }
}
