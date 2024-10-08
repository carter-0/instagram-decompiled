package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Map;

/* renamed from: X.SVw  reason: case insensitive filesystem */
public final class C11458SVw implements Handler.Callback {
    public static final C9214RTr A0A = new C9214RTr();
    public final Handler A00;
    public final C10168Rnj A01;
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final Bundle A04 = AnonymousClass7TE.A0a();
    public final 0yf A05 = Pxe.A0N(0);
    public final 0yf A06 = Pxe.A0N(0);
    public final C10368Rr5 A07;
    public final C9214RTr A08;
    public volatile Sk4 A09;

    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Q5L A01(FragmentManager fragmentManager, C11458SVw sVw) {
        Map map = sVw.A02;
        Q5L q5l = (Q5L) map.get(fragmentManager);
        if (q5l != null) {
            return q5l;
        }
        Q5L q5l2 = (Q5L) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (q5l2 != null) {
            return q5l2;
        }
        Q5L q5l3 = new Q5L();
        map.put(fragmentManager, q5l3);
        fragmentManager.beginTransaction().add(q5l3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        Pxe.A1N(sVw.A00, fragmentManager, 1);
        return q5l3;
    }

    public static QCF A02(0hq r3, C11458SVw sVw) {
        Map map = sVw.A03;
        QCF qcf = (QCF) map.get(r3);
        if (qcf != null) {
            return qcf;
        }
        QCF A0R = r3.A0R("com.bumptech.glide.manager");
        if (A0R != null) {
            return A0R;
        }
        QCF qcf2 = new QCF();
        map.put(r3, qcf2);
        0s1 r0 = new 0s1(r3);
        r0.A0B(qcf2, "com.bumptech.glide.manager");
        r0.A01();
        Pxe.A1N(sVw.A00, r3, 2);
        return qcf2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.app.Activity} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.TfI] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.TZq] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r0.isFinishing() == false) goto L_0x003f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Sk4 A03(android.content.Context r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b9
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x008a
            boolean r0 = r7 instanceof android.app.Application
            if (r0 != 0) goto L_0x008a
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentActivity
            if (r0 != 0) goto L_0x0083
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0069
            android.app.Activity r7 = (android.app.Activity) r7
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x0064
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentActivity
            if (r0 != 0) goto L_0x0083
            boolean r0 = r7.isDestroyed()
            if (r0 != 0) goto L_0x005d
            android.app.FragmentManager r1 = r7.getFragmentManager()
            android.app.Activity r0 = A00(r7)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isFinishing()
            r4 = 0
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r4 = 1
        L_0x0040:
            X.Q5L r3 = A01(r1, r6)
            X.Sk4 r5 = r3.A00
            if (r5 != 0) goto L_0x005c
            X.SUv r2 = X.SUv.A00(r7)
            X.Sk0 r1 = r3.A02
            X.TZq r0 = r3.A03
            X.Sk4 r5 = new X.Sk4
            r5.<init>(r7, r2, r1, r0)
            if (r4 == 0) goto L_0x005a
            r5.onStart()
        L_0x005a:
            r3.A00 = r5
        L_0x005c:
            return r5
        L_0x005d:
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0064:
            android.content.Context r0 = r7.getApplicationContext()
            goto L_0x007e
        L_0x0069:
            boolean r0 = r7 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x008a
            r1 = r7
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r0 = r1.getBaseContext()
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 == 0) goto L_0x008a
            android.content.Context r0 = r1.getBaseContext()
        L_0x007e:
            X.Sk4 r5 = r6.A03(r0)
            return r5
        L_0x0083:
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            X.Sk4 r5 = r6.A04(r7)
            return r5
        L_0x008a:
            r5 = r6
            X.Sk4 r0 = r6.A09
            if (r0 != 0) goto L_0x00b6
            monitor-enter(r5)
            X.Sk4 r0 = r6.A09     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00b1
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ all -> 0x00b3 }
            X.SUv r4 = X.SUv.A00(r0)     // Catch:{ all -> 0x00b3 }
            X.Sjz r3 = new X.Sjz     // Catch:{ all -> 0x00b3 }
            r3.<init>()     // Catch:{ all -> 0x00b3 }
            X.Sk5 r2 = new X.Sk5     // Catch:{ all -> 0x00b3 }
            r2.<init>()     // Catch:{ all -> 0x00b3 }
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ all -> 0x00b3 }
            X.Sk4 r0 = new X.Sk4     // Catch:{ all -> 0x00b3 }
            r0.<init>(r1, r4, r3, r2)     // Catch:{ all -> 0x00b3 }
            r6.A09 = r0     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b6
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            throw r0
        L_0x00b6:
            X.Sk4 r5 = r6.A09
            return r5
        L_0x00b9:
            java.lang.String r0 = "You cannot start a load on a null Context"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11458SVw.A03(android.content.Context):X.Sk4");
    }

    public final boolean handleMessage(Message message) {
        Map map;
        FragmentManager fragmentManager;
        C11985Sk0 sk0;
        String str;
        Message message2;
        String str2;
        boolean z = false;
        boolean z2 = true;
        boolean A1S = AnonymousClass7TF.A1S(message.arg1, 1);
        int i = message.what;
        Object obj = null;
        if (i == 1) {
            fragmentManager = (FragmentManager) message.obj;
            map = this.A02;
            Q5L q5l = (Q5L) map.get(fragmentManager);
            Q5L q5l2 = (Q5L) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (q5l2 != q5l) {
                if (q5l2 == null || q5l2.A00 == null) {
                    str = "RMRetriever";
                    if (A1S || fragmentManager.isDestroyed()) {
                        if (Log.isLoggable(str, 5)) {
                            if (fragmentManager.isDestroyed()) {
                                str2 = "Parent was destroyed before our Fragment could be added";
                            } else {
                                str2 = "Tried adding Fragment twice and failed twice, giving up!";
                            }
                            Log.w(str, str2);
                        }
                        sk0 = q5l.A02;
                        sk0.A00();
                    } else {
                        FragmentTransaction add = fragmentManager.beginTransaction().add(q5l, "com.bumptech.glide.manager");
                        if (q5l2 != null) {
                            add.remove(q5l2);
                        }
                        add.commitAllowingStateLoss();
                        message2 = this.A00.obtainMessage(1, 1, 0, fragmentManager);
                        message2.sendToTarget();
                        Log.isLoggable(str, 3);
                        fragmentManager = null;
                    }
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("We've added two fragments with requests! Old: ");
                    A1A.append(q5l2);
                    throw C66582MXn.A0k(q5l, " New: ", A1A);
                }
            }
            obj = map.remove(fragmentManager);
            z = true;
        } else if (i != 2) {
            fragmentManager = null;
            z2 = false;
        } else {
            fragmentManager = (0hq) message.obj;
            map = this.A03;
            QCF qcf = (QCF) map.get(fragmentManager);
            QCF qcf2 = (QCF) fragmentManager.A0R("com.bumptech.glide.manager");
            if (qcf2 != qcf) {
                if (qcf2 == null || qcf2.A00 == null) {
                    str = "RMRetriever";
                    if (A1S || fragmentManager.A0G) {
                        if (fragmentManager.A0G) {
                            if (Log.isLoggable(str, 5)) {
                                Log.w(str, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                            }
                        } else if (Log.isLoggable(str, 6)) {
                            Log.e(str, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                        }
                        sk0 = qcf.A02;
                        sk0.A00();
                    } else {
                        0s1 r0 = new 0s1(fragmentManager);
                        r0.A0B(qcf, "com.bumptech.glide.manager");
                        if (qcf2 != null) {
                            r0.A03(qcf2);
                        }
                        r0.A06();
                        message2 = this.A00.obtainMessage(2, 1, 0, fragmentManager);
                        message2.sendToTarget();
                        Log.isLoggable(str, 3);
                        fragmentManager = null;
                    }
                } else {
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append("We've added two fragments with requests! Old: ");
                    A1A2.append(qcf2);
                    throw C66582MXn.A0k(qcf, " New: ", A1A2);
                }
            }
            obj = map.remove(fragmentManager);
            z = true;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && obj == null) {
            Log.w("RMRetriever", AnonymousClass7TG.A0m(fragmentManager, "Failed to remove expected request manager fragment, manager: ", AnonymousClass7TE.A1A()));
        }
        return z2;
    }

    public C11458SVw(C10168Rnj rnj) {
        C9214RTr rTr = A0A;
        this.A08 = rTr;
        this.A01 = rnj;
        this.A00 = new Handler(Looper.getMainLooper(), this);
        this.A07 = new C10368Rr5(rTr);
        if (SO9.A04) {
            rnj.A00.containsKey(C9202RTf.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.isFinishing() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Sk4 A04(androidx.fragment.app.FragmentActivity r11) {
        /*
            r10 = this;
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x0094
            boolean r0 = r11.isDestroyed()
            if (r0 != 0) goto L_0x008d
            X.0hq r2 = r11.getSupportFragmentManager()
            android.app.Activity r0 = A00(r11)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isFinishing()
            r9 = 0
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r9 = 1
        L_0x0022:
            X.Rnj r0 = r10.A01
            java.lang.Class<X.RTe> r1 = X.C9201RTe.class
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0070
            android.content.Context r8 = r11.getApplicationContext()
            X.SUv r7 = X.SUv.A00(r8)
            X.Rr5 r6 = r10.A07
            X.07V r5 = r11.getLifecycle()
            X.0hq r3 = r11.getSupportFragmentManager()
            X.C11424STg.A04()
            X.C11424STg.A04()
            java.util.Map r2 = r6.A00
            java.lang.Object r4 = r2.get(r5)
            X.Sk4 r4 = (X.Sk4) r4
            if (r4 != 0) goto L_0x006f
            X.Sk1 r1 = new X.Sk1
            r1.<init>(r5)
            X.Sk6 r0 = new X.Sk6
            r0.<init>(r3, r6)
            X.Sk4 r4 = new X.Sk4
            r4.<init>(r8, r7, r1, r0)
            r2.put(r5, r4)
            X.Sk3 r0 = new X.Sk3
            r0.<init>(r5, r6)
            r1.A8t(r0)
            if (r9 == 0) goto L_0x006f
            r4.onStart()
        L_0x006f:
            return r4
        L_0x0070:
            X.QCF r3 = A02(r2, r10)
            X.Sk4 r4 = r3.A00
            if (r4 != 0) goto L_0x006f
            X.SUv r2 = X.SUv.A00(r11)
            X.Sk0 r1 = r3.A02
            X.TZq r0 = r3.A03
            X.Sk4 r4 = new X.Sk4
            r4.<init>(r11, r2, r1, r0)
            if (r9 == 0) goto L_0x008a
            r4.onStart()
        L_0x008a:
            r3.A00 = r4
            return r4
        L_0x008d:
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0094:
            android.content.Context r0 = r11.getApplicationContext()
            X.Sk4 r4 = r10.A03(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11458SVw.A04(androidx.fragment.app.FragmentActivity):X.Sk4");
    }
}
