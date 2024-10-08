package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class T7S implements AnonymousClass0lh {
    public int A00;
    public SSW A01;
    public AnonymousClass0wW A02;
    public Application A03;
    public final BroadcastReceiver A04 = new Q63(this, 13);
    public final C13569Tcp A05 = new C12217SpH(this);
    public final 1wn A06 = new T72(this, 5);
    public final C13967TmU A07;
    public final C12218SpL A08;
    public final 1wn A09;

    public static void A00(T7S t7s) {
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget;
        SSW ssw = t7s.A01;
        if (ssw != null) {
            C11436SUu sUu = ssw.A07;
            sUu.A00.remove(t7s.A05);
            1xC r3 = 1xC.A01;
            r3.A03(t7s.A06, C62250sA.class);
            t7s.A03.unregisterReceiver(t7s.A04);
            SSW ssw2 = t7s.A01;
            ssw2.A0L = true;
            if (ssw2.A0H.booleanValue()) {
                0I1.A03("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            } else {
                ssw2.A0H = true;
                SSW.A01(ssw2);
                ssw2.A05.getApplicationContext().unregisterComponentCallbacks(ssw2.A07);
                ReactCxxErrorHandler.setHandleErrorFunc((Object) null, (Method) null);
                ssw2.A0J = null;
                Set<C13774Tgp> set = ssw2.A0F;
                synchronized (set) {
                    synchronized (ssw2.A0B) {
                        if (ssw2.A0G != null) {
                            for (C13774Tgp tgp : set) {
                                if (((C7372Q9d) tgp).A02 == 2) {
                                    SSW.A03(ssw2.A0G, tgp);
                                }
                            }
                            ssw2.A0G.A05();
                            ssw2.A0G = null;
                        }
                    }
                }
                if (ssw2.A0L && (reactInstanceManagerInspectorTarget = ssw2.A02) != null) {
                    reactInstanceManagerInspectorTarget.close();
                    ssw2.A02 = null;
                }
                ssw2.A0K = false;
                ssw2.A00 = null;
                SH1 sh1 = SH1.A02;
                synchronized (sh1) {
                    sh1.A00.clear();
                }
                ssw2.A0H = false;
                synchronized (ssw2.A0H) {
                    ssw2.A0H.notifyAll();
                }
                synchronized (ssw2.A0E) {
                }
            }
            t7s.A01 = null;
            C12218SpL spL = t7s.A08;
            spL.A00.remove(t7s.A07);
            r3.A03(t7s.A09, C70612Sy.class);
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.RzV, java.lang.Object] */
    public final SSW A01() {
        SSW ssw;
        0Da r8;
        Application application = this.A03;
        synchronized (this) {
            ssw = this.A01;
            if (ssw == null) {
                C13967TmU tmU = this.A07;
                T8A t8a = (T8A) tmU;
                synchronized (t8a) {
                    try {
                        Pxh.A1S(t8a.A08);
                        int i = t8a.A00;
                        if (i != 0) {
                            02m.A0p.markerPoint(i, "BRIDGE_STARTUP_WILL_START");
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                ? obj = new Object();
                AnonymousClass0wW r1 = this.A02;
                A1C.add(new IgReactPackage(r1));
                Integer num = AnonymousClass05K.A01;
                IgReactExceptionManager A002 = SAV.A00(r1);
                synchronized (C9845RiH.class) {
                    try {
                        r8 = C10067Rm4.A00;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                0Sd.A01(application, "context must be specified");
                QZB qzb = new QZB(JTO.A0s(JTO.A0s(application.getFilesDir(), "optimized-bundle"), "bundle.bytecode").getPath());
                File AXT = AnonymousClass1BA.A00(application).AXT((1LJ) null, 969927237);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Executor executor = 0Dc.A07;
                A1C2.add(new 0Db(002.A0R("Ig4aBundle.js.hbc", ".sha256"), "bytecode.sha256"));
                A1C2.add(new 0iK(r8, 002.A0R("Ig4aBundle.js.hbc", ".spk.xz")));
                0Sd.A00(AXT);
                for (int i2 = 0; i2 < A1C2.size(); i2++) {
                    0Db r12 = (0Db) A1C2.get(i2);
                    r12.A00 = JTO.A0s(AXT, r12.A01);
                }
                QZC qzc = new QZC(new 0Dc(application, AXT, "CommonFBRNBundle", A1C2, executor), qzb);
                application.getPackageName();
                SKU.A01();
                ssw = new SSW(application, obj, qzc, A002, num, A1C);
                ssw.A06.toString();
                if (C18773W0w.A02()) {
                    ssw.A05();
                } else {
                    C18773W0w.A01(new C13002THk(ssw, this));
                }
                this.A01 = ssw;
                C11436SUu sUu = ssw.A07;
                C13569Tcp tcp = this.A05;
                CopyOnWriteArrayList copyOnWriteArrayList = sUu.A00;
                if (!copyOnWriteArrayList.contains(tcp)) {
                    copyOnWriteArrayList.add(tcp);
                }
                1xC.A01.A02(this.A06, C62250sA.class);
                0DH.A00(this.A04, application, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
                this.A08.A00.add(tmU);
            }
        }
        return ssw;
    }

    public T7S(Application application, AnonymousClass0wW r6) {
        T72 t72 = new T72(this, 4);
        this.A09 = t72;
        this.A03 = application;
        this.A02 = r6;
        this.A07 = 1WM.getInstance().getPerformanceLogger(this.A02);
        C12218SpL spL = C12218SpL.A01;
        if (spL == null) {
            spL = new C12218SpL();
            C12218SpL.A01 = spL;
        }
        this.A08 = spL;
        1xC.A01.A02(t72, C70612Sy.class);
        ReactMarker.addListener(spL);
    }

    public final void A02() {
        if (C18773W0w.A02()) {
            A00(this);
        } else {
            C18773W0w.A01(new C12934TDx(this));
        }
    }

    public final void onSessionWillEnd() {
        A02();
    }
}
