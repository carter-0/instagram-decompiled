package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.systrace.Systrace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class SSW {
    public Activity A00;
    public C10553Ru7 A01;
    public ReactInstanceManagerInspectorTarget A02;
    public C13571Tcr A03;
    public List A04;
    public final Context A05;
    public final C10869RzV A06;
    public final C11436SUu A07;
    public final C10876Rzc A08;
    public final C13567Tcn A09;
    public final C13946Tlt A0A;
    public final Object A0B = Pxe.A0p();
    public final String A0C;
    public final Collection A0D = Pxf.A0v();
    public final List A0E;
    public final Set A0F = Collections.synchronizedSet(AnonymousClass7TE.A1F());
    public volatile Q6H A0G;
    public volatile Boolean A0H = false;
    public volatile Integer A0I;
    public volatile Thread A0J;
    public volatile boolean A0K = false;
    public volatile boolean A0L = false;

    public SSW(Context context, C10869RzV rzV, C10876Rzc rzc, C13567Tcn tcn, Integer num, List list) {
        Method method;
        0dV.A05(context);
        C11414SSm.A04(context);
        this.A05 = context;
        this.A00 = null;
        this.A03 = null;
        this.A06 = rzV;
        this.A08 = rzc;
        this.A0C = "RKJSModules/EntryPoints/Ig4aBundle";
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0E = A1C;
        0fc.A01(8192, "ReactInstanceManager.initDevSupportManager", 885313570);
        this.A0A = new SpS();
        0fc.A00(8192, 1902777683);
        this.A0I = num;
        this.A07 = new C11436SUu(context);
        this.A09 = tcn;
        synchronized (A1C) {
            A1C.add(new CoreModulesPackage(this, new C12222SpY(this)));
            A1C.addAll(list);
        }
        SBR sbr = SBR.A00;
        0qQ.A0B(sbr, 0);
        if (C11346SOf.A05 == null) {
            C11346SOf.A05 = new C11346SOf(sbr);
        }
        try {
            method = SSW.class.getMethod("handleCxxError", new Class[]{Exception.class});
        } catch (NoSuchMethodException e) {
            0I1.A05("ReactInstanceHolder", "Failed to set cxx error handler function", e);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    public static synchronized void A01(SSW ssw) {
        synchronized (ssw) {
            Q6H A042 = ssw.A04();
            if (A042 != null) {
                if (ssw.A0I == AnonymousClass05K.A0C) {
                    A042.A07();
                    ssw.A0I = AnonymousClass05K.A01;
                }
                if (ssw.A0I == AnonymousClass05K.A01) {
                    A042.A07 = AnonymousClass05K.A00;
                    Iterator it = A042.A0C.iterator();
                    while (it.hasNext()) {
                        try {
                            ((C13773Tgo) it.next()).onHostDestroy();
                        } catch (RuntimeException e) {
                            A042.A0C(e);
                        }
                    }
                    A042.A08 = null;
                }
            }
            ssw.A0I = AnonymousClass05K.A00;
        }
    }

    public static void A02(SSW ssw, C13774Tgp tgp) {
        C13948Tm8 fromBundle;
        C7372Q9d q9d = (C7372Q9d) tgp;
        if (q9d.A0I.compareAndSet(0, 1)) {
            0fc.A01(8192, "attachRootViewToInstance", -1723774482);
            X9N A032 = UIManagerHelper.A03(ssw.A0G, q9d.A02, true);
            if (A032 != null) {
                Bundle bundle = q9d.A04;
                if (q9d.A02 == 2) {
                    tgp.getJSModuleName();
                    if (bundle == null) {
                        new WritableNativeMap();
                    } else {
                        Arguments.fromBundle(bundle);
                    }
                    throw C66580MXl.A11();
                }
                if (bundle == null) {
                    fromBundle = Pxe.A0U();
                } else {
                    fromBundle = Arguments.fromBundle(bundle);
                }
                int addRootView = A032.addRootView(q9d, fromBundle);
                q9d.A01 = addRootView;
                tgp.EJY();
                Systrace.A04(8192, "pre_rootView.onAttachedToReactInstance", addRootView);
                C18773W0w.A01(new TG4(tgp, addRootView));
                0fc.A00(8192, 1856424066);
                return;
            }
            throw AnonymousClass7TE.A0z("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
        }
    }

    public static void A00(C10553Ru7 ru7, SSW ssw) {
        0Sd.A03(!ssw.A0L, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(RH1.A1X);
        Set<C13774Tgp> set = ssw.A0F;
        synchronized (set) {
            synchronized (ssw.A0B) {
                if (ssw.A0G != null) {
                    Q6H q6h = ssw.A0G;
                    if (ssw.A0I == AnonymousClass05K.A0C) {
                        q6h.A07();
                    }
                    for (C13774Tgp A032 : set) {
                        A03(q6h, A032);
                    }
                    C11436SUu sUu = ssw.A07;
                    sUu.A00.remove(q6h.A01());
                    q6h.A05();
                    ssw.A0G = null;
                }
            }
        }
        ssw.A0J = new Thread((ThreadGroup) null, new TG3(ru7, ssw), "create_react_context");
        ReactMarker.logMarker(RH1.A1Z);
        ssw.A0J.start();
    }

    public static void A03(Q6H q6h, C13774Tgp tgp) {
        C7372Q9d q9d = (C7372Q9d) tgp;
        AtomicInteger atomicInteger = q9d.A0I;
        if (atomicInteger.compareAndSet(1, 0)) {
            if (q9d.A02 != 2) {
                ((AppRegistry) q6h.A01().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(q9d.A01);
            } else if (q9d.A01 == -1) {
                ReactSoftExceptionLogger.logSoftException("ReactInstanceManager", AnonymousClass7TE.A15("detachRootViewFromInstance called with ReactRootView with invalid id"));
            } else if (UIManagerHelper.A03(q6h, 2, true) != null) {
                throw C66580MXl.A11();
            } else {
                0I1.A04("ReactNative", "Failed to stop surface, UIManager has already gone away");
            }
            atomicInteger.compareAndSet(1, 0);
            q9d.removeAllViews();
            q9d.setId(-1);
        }
    }

    public final Q6H A04() {
        Q6H q6h;
        synchronized (this.A0B) {
            q6h = this.A0G;
        }
        return q6h;
    }

    public final void A05() {
        if (!this.A0K) {
            this.A0K = true;
            C10553Ru7 ru7 = new C10553Ru7(this.A06, this, this.A08);
            if (this.A0J == null) {
                A00(ru7, this);
            } else {
                this.A01 = ru7;
            }
        }
    }

    public void handleCxxError(Exception exc) {
        this.A0A.handleException(exc);
        throw null;
    }
}
