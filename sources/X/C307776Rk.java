package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import com.instagram.common.bloks.BloksContextBindManager$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6Rk  reason: invalid class name and case insensitive filesystem */
public final class C307776Rk {
    public WeakReference A00;
    public final WeakReference A01;
    public final List A02 = new ArrayList();
    public final Application.ActivityLifecycleCallbacks A03;
    public volatile boolean A04;

    public final void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A02;
        synchronized (list) {
            this.A04 = true;
        }
        Context context = (Context) this.A01.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A03);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable run : runnableArr) {
            run.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public final void A01(Runnable runnable) {
        if (runnable != null) {
            List list = this.A02;
            synchronized (list) {
                if (!this.A04) {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C307776Rk(Context context) {
        BloksContextBindManager$1 bloksContextBindManager$1 = new BloksContextBindManager$1(this);
        this.A03 = bloksContextBindManager$1;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A01 = new WeakReference(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(bloksContextBindManager$1);
    }
}
