package com.facebook.react.modules.core;

import X.002;
import X.0I1;
import X.0Sd;
import X.0qQ;
import X.AnonymousClass00P;
import X.C13904TjR;
import X.C18773W0w;
import X.Pxe;
import X.QZK;
import X.SNf;
import X.TCL;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Set;

@ReactModule(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public void notifyTaskFinished(double d) {
        Set set;
        Integer valueOf;
        boolean contains;
        int i = (int) d;
        SNf A00 = SNf.A00(Pxe.A0T(this));
        synchronized (A00) {
            set = A00.A02;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            synchronized (A00) {
                boolean remove = set.remove(valueOf);
                A00.A01.remove(valueOf);
                SparseArray sparseArray = A00.A00;
                Runnable runnable = (Runnable) sparseArray.get(i);
                if (runnable != null) {
                    C18773W0w.A00().removeCallbacks(runnable);
                    sparseArray.remove(i);
                }
                if (remove) {
                    C18773W0w.A01(new TCL(A00));
                }
            }
            return;
        }
        0I1.A02(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", new Object[]{valueOf});
    }

    public void notifyTaskRetry(double d, C13904TjR tjR) {
        Integer valueOf;
        boolean contains;
        0qQ.A0B(tjR, 1);
        int i = (int) d;
        SNf A00 = SNf.A00(Pxe.A0T(this));
        synchronized (A00) {
            Set set = A00.A02;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            synchronized (A00) {
                A00.A01.get(valueOf);
                0Sd.A03(false, 002.A0c("Tried to retrieve non-existent task config with id ", ".", i));
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0I1.A02(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", new Object[]{valueOf});
        tjR.resolve(false);
    }

    public HeadlessJsTaskSupportModule(QZK qzk) {
        super(qzk);
    }
}
