package androidx.sharetarget;

import X.AnonymousClass5AD;
import X.AnonymousClass7TE;
import X.C51970G9q;
import X.C69674Npw;
import X.JTO;
import X.Pxe;
import X.Pz2;
import X.Pz7;
import X.Pz9;
import X.PzA;
import X.PzB;
import X.PzC;
import X.PzD;
import X.PzE;
import X.PzF;
import X.TNH;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ShortcutInfoCompatSaverImpl extends C69674Npw {
    public static final Object A07 = Pxe.A0p();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = Pxe.A0N(0);
    public final Map A04 = Pxe.A0N(0);
    public final ExecutorService A05;
    public final ExecutorService A06;

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    public final List A02() {
        return (List) this.A05.submit(new TNH(this, 0)).get();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.5AD] */
    public final void A03(AnonymousClass5AD r5) {
        Pz9 pz9 = new Pz9(this, new ArrayList(this.A04.values()));
        ? obj = new Object();
        this.A06.submit(new Pz2(obj, this, pz9));
        obj.addListener(new Pz7(r5, this, obj), this.A05);
    }

    public final void A04(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((PzC) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File A0s = JTO.A0s(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = JTO.A0s(A0s, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = JTO.A0s(A0s, "targets.xml");
        executorService.submit(new PzF(this, A0s));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.5AD] */
    public final /* bridge */ /* synthetic */ Object A00(List list) {
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0m.add(new PzB((PzA) it.next()).A00());
        }
        ? obj = new Object();
        this.A05.submit(new PzD(obj, this, A0m));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5AD] */
    public final /* bridge */ /* synthetic */ Object A01(List list) {
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        ? obj = new Object();
        this.A05.submit(new PzE(obj, this, A1D));
        return obj;
    }
}
