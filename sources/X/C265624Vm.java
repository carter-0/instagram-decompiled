package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4Vm  reason: invalid class name and case insensitive filesystem */
public final class C265624Vm implements C265614Vl {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C265624Vm A03;
    public AnonymousClass5J4 A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public final void EBh(Context context, 02R r10, Executor executor) {
        Activity activity;
        Object obj;
        C265674Vs r2;
        0qQ.A0B(context, 0);
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            r10.accept(new C265674Vs(0sn.A00));
            return;
        }
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            AnonymousClass5J4 r4 = this.A00;
            if (r4 == null) {
                r10.accept(new C265674Vs(0sn.A00));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                boolean z = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (0qQ.A0K(((AnonymousClass5JC) it.next()).A01, activity)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                AnonymousClass5JC r3 = new AnonymousClass5JC(activity, r10, executor);
                copyOnWriteArrayList.add(r3);
                if (!z) {
                    AnonymousClass5J3 r42 = (AnonymousClass5J3) r4;
                    IBinder A002 = AnonymousClass4Vn.A00(activity);
                    if (A002 != null) {
                        r42.A02(activity, A002);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ALy(activity, r42));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (activity.equals(((AnonymousClass5JC) obj).A01)) {
                            break;
                        }
                    }
                    AnonymousClass5JC r1 = (AnonymousClass5JC) obj;
                    if (!(r1 == null || (r2 = r1.A00) == null)) {
                        r3.A00 = r2;
                        r3.A03.execute(new AnonymousClass5JD(r2, r3));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void FIw(02R r8) {
        0qQ.A0B(r8, 0);
        synchronized (A02) {
            AnonymousClass5J4 r5 = this.A00;
            if (r5 != null) {
                ArrayList arrayList = new ArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass5JC r1 = (AnonymousClass5JC) it.next();
                    if (r1.A02 == r8) {
                        arrayList.add(r1);
                    }
                }
                copyOnWriteArrayList.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((AnonymousClass5JC) it2.next()).A01;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (0qQ.A0K(((AnonymousClass5JC) it3.next()).A01, activity)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    r5.E0S(activity);
                }
            }
        }
    }

    public C265624Vm(AnonymousClass5J4 r3) {
        this.A00 = r3;
        AnonymousClass5J4 r1 = this.A00;
        if (r1 != null) {
            r1.EVl(new AnonymousClass5J7(this));
        }
    }
}
