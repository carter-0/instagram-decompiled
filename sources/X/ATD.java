package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ATD implements C343837qt, B30 {
    public int A00 = 0;
    public final Map A01 = AnonymousClass7TE.A1E();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final Context A03;
    public final C343657qa A04;
    public final C3496981j A05 = new C3496981j();

    public final void A01(C343697qe r5, C343717qg r6) {
        this.A02.put(r5, r5);
        Map map = this.A01;
        synchronized (map) {
            Map map2 = (Map) map.get(r6);
            if (map2 == null) {
                map2 = AnonymousClass7TE.A1E();
                map.put(r6, map2);
            }
            map2.put(0, r5);
        }
    }

    public final C343697qe Ape(C343717qg r6) {
        C343697qe r0;
        synchronized (this) {
            A00();
            r0 = null;
            Map map = this.A01;
            synchronized (map) {
                try {
                    Map map2 = (Map) map.get(r6);
                    if (map2 != null) {
                        r0 = (C343697qe) map2.get(0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (r0 == null) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Requested component is null for index: ");
                A1A.append(0);
                th = AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r6, " and componentClass: ", A1A));
                throw th;
            }
        }
        return r0;
    }

    public final synchronized void EIx() {
        C344037rD r3;
        A00();
        ACk("LiteCameraController must be initialized before invoking resume()");
        if (this.A00 == 1) {
            C343937r3 r1 = C344037rD.A00;
            if (CQO(r1)) {
                r3 = (C344037rD) Apf(r1);
                if (r3 != null) {
                    r3.ChM(AnonymousClass7TE.A0Q(this), "connect_controllers_started", "ComponentManager", (Map) null);
                }
            } else {
                r3 = null;
            }
            this.A00 = 2;
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A0t = AnonymousClass7TF.A0t(concurrentHashMap);
            while (A0t.hasNext()) {
                ((C343697qe) A0t.next()).E3N();
            }
            Iterator A0t2 = AnonymousClass7TF.A0t(concurrentHashMap);
            while (A0t2.hasNext()) {
                ((C343697qe) A0t2.next()).connect();
            }
            if (r3 != null) {
                r3.ChM(AnonymousClass7TE.A0Q(this), "connect_controllers_finished", "ComponentManager", (Map) null);
            }
        }
    }

    public final synchronized void destroy() {
        if (this.A00 != 0) {
            pause();
            Iterator A0t = AnonymousClass7TF.A0t(this.A02);
            while (A0t.hasNext()) {
                ((C343697qe) A0t.next()).release();
            }
            this.A00 = 0;
        }
    }

    public final synchronized void pause() {
        ACk("LiteCameraController must be initialized before invoking pause()");
        if (this.A00 == 2) {
            this.A00 = 1;
            Iterator A0t = AnonymousClass7TF.A0t(this.A02);
            while (A0t.hasNext()) {
                ((C343697qe) A0t.next()).disconnect();
            }
        }
    }

    public final void A00() {
        C344037rD r6;
        if (this.A00 == 0) {
            C343937r3 r1 = C344037rD.A00;
            if (CQO(r1)) {
                r6 = (C344037rD) Apf(r1);
                if (r6 != null) {
                    r6.ChM(AnonymousClass7TE.A0Q(this), "init_controllers_started", "ComponentManager", (Map) null);
                }
            } else {
                r6 = null;
            }
            this.A00 = 1;
            List list = this.A05.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C343907r0 r12 = (C343907r0) ((C343917r1) list.get(i));
                if (!r12.A01) {
                    r12.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A0t = AnonymousClass7TF.A0t(concurrentHashMap);
            while (A0t.hasNext()) {
                ((C343707qf) A0t.next()).CMP();
            }
            Iterator A0t2 = AnonymousClass7TF.A0t(concurrentHashMap);
            while (A0t2.hasNext()) {
                ((C343707qf) A0t2.next()).CMk();
            }
            if (r6 != null) {
                r6.ChM(AnonymousClass7TE.A0Q(this), "init_controllers_finished", "ComponentManager", (Map) null);
            }
        }
    }

    public final void A02(C343917r1 r3) {
        C3496981j r1 = this.A05;
        if (!r1.A00.contains(r3)) {
            r1.A01(r3);
            C343907r0 r32 = (C343907r0) r3;
            if (!r32.A01) {
                r32.A01 = true;
            }
        }
    }

    public final void ACk(String str) {
        if (this.A00 == 0) {
            throw AnonymousClass7TE.A0z(str);
        }
    }

    public final C343917r1 Apf(C343937r3 r6) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C343917r1 r1 = (C343917r1) list.get(i);
            if (r1.BJv() == r6) {
                return r1;
            }
        }
        throw AnonymousClass7TE.A0w(AnonymousClass7TG.A0m(r6, "Requested core component is null for key ", AnonymousClass7TE.A1A()));
    }

    public final Object Apt(C342927pO r2) {
        throw AnonymousClass7TE.A0z("ConnectConfigurationKey not supported!");
    }

    public final Object Apu(C343667qb r2) {
        return this.A04.A00.get(r2);
    }

    public final boolean CQN(C343717qg r3) {
        boolean containsKey;
        Map map = this.A01;
        synchronized (map) {
            containsKey = map.containsKey(r3);
        }
        return containsKey;
    }

    public final boolean CQO(C343937r3 r6) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C343917r1) list.get(i)).BJv() == r6) {
                return true;
            }
        }
        return false;
    }

    public final void ESb(C342927pO r2, Object obj) {
        throw AnonymousClass7TE.A0z("ConnectConfigurationKey not supported!");
    }

    public final Context getContext() {
        return this.A03;
    }

    public ATD(Context context, C343657qa r3) {
        this.A03 = context.getApplicationContext();
        this.A04 = r3;
    }
}
