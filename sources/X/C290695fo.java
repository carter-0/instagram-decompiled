package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5fo  reason: invalid class name and case insensitive filesystem */
public final class C290695fo {
    public final C290665fh A00;
    public final 0xa A01;
    public final LinkedHashMap A02 = new LinkedHashMap();
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final AtomicBoolean A04 = new AtomicBoolean();
    public final UserSession A05;

    public C290695fo(C290665fh r4, UserSession userSession) {
        0qQ.A0B(r4, 1);
        this.A00 = r4;
        this.A05 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A1C, getClass());
    }

    public final void A00() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            Map all = this.A01.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : all.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    0qQ.A0B("shortcuts:", 1);
                    if (str.startsWith("shortcuts:")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) 00l.A0R(String.valueOf(entry2.getKey()), new String[]{"shortcuts:"}, 0).get(1);
                String str3 = (String) 00l.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(2);
                List A0R = 00l.A0R((String) 00l.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(0), new String[]{"36325201302335711L:"}, 0);
                List<String> A0R2 = 00l.A0R((String) 00l.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(1), new String[]{"36325201302335720L"}, 0);
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0R2, 10));
                for (String A002 : A0R2) {
                    arrayList2.add(15n.A00(A002));
                }
                this.A02.put(str2, new F2P(str2, str3, A0R, arrayList2));
                arrayList.add(C60340gF.A00);
            }
        } finally {
            readLock.unlock();
        }
    }
}
