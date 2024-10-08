package X;

import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9BJ  reason: invalid class name */
public final class AnonymousClass9BJ extends 1P0 {
    public final String A00;
    public final /* synthetic */ AnonymousClass9BF A01;

    public AnonymousClass9BJ(AnonymousClass9BF r2, String str) {
        0qQ.A0B(str, 2);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1162763251);
        AnonymousClass9BF r1 = this.A01;
        if (r1.A06.get() == 0) {
            AnonymousClass9BF.A00(r1);
        }
        AnonymousClass0fD.A0A(1871898114, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1571572908);
        synchronized (this) {
            this.A01.A06.decrementAndGet();
        }
        AnonymousClass0fD.A0A(834927482, A03);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-267097235);
        ConcurrentHashMap concurrentHashMap = this.A01.A05;
        String str = this.A00;
        if (!concurrentHashMap.containsKey(str)) {
            ? obj = new Object();
            obj.A02 = str;
            obj.A04 = new ArrayList();
            obj.A03 = new ArrayList();
            obj.A00 = AnonymousClass9BP.UNKNOWN;
            concurrentHashMap.put(str, obj);
        }
        AnonymousClass0fD.A0A(340660648, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass9BP r0;
        int i;
        int A03 = AnonymousClass0fD.A03(-1482977424);
        AnonymousClass9BO r13 = (AnonymousClass9BO) obj;
        int A032 = AnonymousClass0fD.A03(253111727);
        0qQ.A0B(r13, 0);
        AnonymousClass9BF r6 = this.A01;
        ConcurrentHashMap concurrentHashMap = r6.A05;
        String str = this.A00;
        AccountFamily accountFamily = (AccountFamily) concurrentHashMap.get(str);
        if (accountFamily == null) {
            i = -1130629014;
        } else {
            UserSession userSession = r6.A03;
            User user = r13.A00;
            ArrayList arrayList = new ArrayList(r13.A02.size());
            for (AnonymousClass9GU r02 : r13.A02) {
                arrayList.add(r02.A01);
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            ArrayList arrayList2 = new ArrayList(r13.A01.size());
            for (AnonymousClass9GU r03 : r13.A01) {
                arrayList2.add(r03.A01);
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList2);
            if (userSession instanceof UserSession) {
                1E4.A00(userSession);
            }
            accountFamily.A01 = user;
            accountFamily.A04.clear();
            accountFamily.A03.clear();
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                accountFamily.A04.add(it.next());
            }
            Iterator it2 = copyOf2.iterator();
            while (it2.hasNext()) {
                accountFamily.A03.add(it2.next());
            }
            if (!accountFamily.A04.isEmpty()) {
                r0 = AnonymousClass9BP.CHILD_ACCOUNT;
            } else if (!accountFamily.A03.isEmpty()) {
                r0 = AnonymousClass9BP.MAIN_ACCOUNT;
            } else {
                r0 = AnonymousClass9BP.UNLINKED_ACCOUNT;
            }
            accountFamily.A00 = r0;
            AtomicInteger atomicInteger = r6.A06;
            if (atomicInteger.get() == 0) {
                AnonymousClass9BF.A00(r6);
            }
            if (atomicInteger.get() <= 0) {
                Collection values = concurrentHashMap.values();
                0qQ.A07(values);
                if (!values.isEmpty()) {
                    Iterator it3 = values.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((AccountFamily) it3.next()).A00 == AnonymousClass9BP.UNKNOWN) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                AnonymousClass3EO r04 = r6.A02;
                if (r04 != null) {
                    r04.A03();
                }
            }
            1xC.A01.A00(new C298125sv(str));
            i = -497014974;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-347701936, A03);
    }
}
