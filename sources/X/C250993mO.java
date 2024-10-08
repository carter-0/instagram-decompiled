package X;

import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3mO  reason: invalid class name and case insensitive filesystem */
public final class C250993mO {
    public static final long A01 = TimeUnit.SECONDS.toMillis(390);
    public static final ThreadLocal A02 = new C251013mQ();
    public static final ThreadLocal A03 = new C251003mP();
    public final UserSession A00;

    public static int A00(long j) {
        Object obj = A02.get();
        obj.getClass();
        Calendar calendar = (Calendar) obj;
        calendar.setTimeInMillis(j);
        Object obj2 = A03.get();
        obj2.getClass();
        Calendar calendar2 = (Calendar) obj2;
        calendar2.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        if (i2 < i) {
            i2 += calendar.getActualMaximum(6);
        }
        return i2 - i;
    }

    public static C250993mO A01(UserSession userSession) {
        return (C250993mO) userSession.A01(C250993mO.class, new C251023mR(userSession));
    }

    public static List A03(C251033mS r3, List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C251053mU A022 = r3.A02((String) it.next());
            if (A022 != null) {
                arrayList.add(A022);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Map A04(C251033mS r4, Collection collection) {
        if (collection == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass17B r1 = (AnonymousClass17B) it.next();
            C251053mU A022 = r4.A02(r1.getId());
            if (A022 != null) {
                hashMap.put(A022, r1);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static final boolean A06(C251053mU r3, long j) {
        long j2 = j - r3.A01;
        if (r3.A05 || j2 <= A01) {
            return true;
        }
        return false;
    }

    public final String A09(Resources resources, Map map) {
        Map map2 = map;
        if (map == null || map2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map2.keySet());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.MINUTES.toMillis(10);
        long millis2 = TimeUnit.HOURS.toMillis(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C251053mU r10 = (C251053mU) it.next();
            if (A06(r10, System.currentTimeMillis())) {
                arrayList2.add(r10);
            } else {
                long j = r10.A01;
                long j2 = currentTimeMillis - j;
                if (j2 < millis) {
                    arrayList3.add(r10);
                } else if (j2 < millis2) {
                    arrayList4.add(r10);
                } else if (A00(j) == 0) {
                    arrayList5.add(r10);
                }
            }
        }
        Resources resources2 = resources;
        String A022 = A02(resources2, arrayList2, map2, 2131959408, 2131959409);
        if (A022 != null) {
            return A022;
        }
        String A023 = A02(resources2, arrayList3, map2, 2131959412, 2131959413);
        if (A023 != null) {
            return A023;
        }
        String A024 = A02(resources2, arrayList4, map2, 2131959410, 2131959411);
        if (A024 == null) {
            return A02(resources2, arrayList5, map2, 2131959414, 2131959415);
        }
        return A024;
    }

    public final boolean A0E(Collection collection) {
        if (!182.A06(0Tu.A05, this.A00, 36316001482444642L) || collection.isEmpty() || collection.size() > 1 || (((C251053mU) new ArrayList(collection).get(0)).A00 & 2251799813685248L) == 0) {
            return false;
        }
        return true;
    }

    public C250993mO(UserSession userSession) {
        this.A00 = userSession;
    }

    public static String A02(Resources resources, List list, Map map, int i, int i2) {
        String username;
        int size = list.size();
        if (size == 1) {
            AnonymousClass17B r1 = (AnonymousClass17B) map.get(list.get(0));
            if (r1 == null) {
                return null;
            }
            if (((AnonymousClass17E) r1).BIW() == 1) {
                username = ((AnonymousClass179) r1).getShortName();
            } else {
                username = ((AnonymousClass17C) r1).getUsername();
            }
            return resources.getString(i, new Object[]{username});
        } else if (size > 1) {
            return resources.getString(i2, new Object[]{Integer.valueOf(size)});
        } else {
            return null;
        }
    }

    public static final boolean A05(C251033mS r4, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        for (C251053mU r0 : A03(r4, arrayList)) {
            if ((r0.A00 & 2251799813685248L) != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A07(DirectShareTarget directShareTarget, C251033mS r8, int i) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(r8, A0B);
        }
        if (A032.isEmpty()) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis() - ((C251053mU) A032.get(0)).A01;
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis);
        if (currentTimeMillis <= A01 || minutes >= i) {
            return -1;
        }
        return minutes;
    }

    public final String A08(Resources resources, List list) {
        int i;
        int i2;
        if (list.isEmpty()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C251053mU r4 = (C251053mU) list.get(0);
        long j = r4.A01;
        if (j <= 0) {
            return null;
        }
        if (!A06(r4, currentTimeMillis)) {
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2);
            if (currentTimeMillis2 > A01) {
                long j2 = (long) minutes;
                if (j2 <= 59) {
                    i2 = R.plurals.direct_digest_is_active_x_mins_ago;
                } else if (j2 <= 480) {
                    minutes = (int) TimeUnit.MINUTES.toHours(j2);
                    i2 = R.plurals.direct_digest_is_active_x_hours_ago;
                } else if (j2 > 10080) {
                    return null;
                } else {
                    int A002 = A00(j);
                    if (A002 == 0) {
                        i = 2131959050;
                    } else if (A002 != 1) {
                        return null;
                    } else {
                        i = 2131959051;
                    }
                    return resources.getString(i);
                }
                return resources.getQuantityString(i2, minutes, new Object[]{Integer.valueOf(minutes)});
            }
        }
        i = 2131959060;
        return resources.getString(i);
    }

    public final boolean A0A(DirectShareTarget directShareTarget, C251033mS r4) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(r4, A0B);
        }
        return A0D(A032);
    }

    public final boolean A0B(DirectShareTarget directShareTarget, C251033mS r4) {
        List A032;
        ArrayList A0B = directShareTarget.A0B();
        if (A0B.isEmpty()) {
            A032 = Collections.emptyList();
        } else {
            A032 = A03(r4, A0B);
        }
        return A0E(A032);
    }

    public final boolean A0C(C251033mS r2, AnonymousClass17B r3) {
        return A0D(A03(r2, Collections.singletonList(r3.getId())));
    }

    public final boolean A0D(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C251053mU r5 = (C251053mU) it.next();
            if (r5.A01 > 0 && A06(r5, System.currentTimeMillis())) {
                return true;
            }
        }
        return false;
    }
}
