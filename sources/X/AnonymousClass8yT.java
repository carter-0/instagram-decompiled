package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8yT  reason: invalid class name */
public final class AnonymousClass8yT extends XplatEffectManagerCompletionCallback {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C371478yM A01;
    public final /* synthetic */ ARRequestAsset A02;
    public final /* synthetic */ AREngineMaskEffectAdapter A03;
    public final /* synthetic */ C314366i5 A04;
    public final /* synthetic */ C352728Ep A05;
    public final /* synthetic */ ListenableFuture A06;

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.8yW] */
    public final void A00(XplatModelPaths xplatModelPaths, C352728Ep r17, File file, List list, List list2) {
        Object obj;
        File file2 = file;
        0qQ.A0B(file2, 0);
        C352728Ep r5 = r17;
        if (!r5.A02) {
            C314366i5 r0 = this.A04;
            r0.A00 = null;
            r0.A01 = null;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (!(next == null || (obj = list2.get(i)) == null)) {
                hashMap.put(next, obj);
            }
            i = i2;
        }
        AREngineMaskEffectAdapter aREngineMaskEffectAdapter = this.A03;
        ARRequestAsset aRRequestAsset = this.A02;
        ? obj2 = new Object();
        obj2.A00 = hashMap;
        String str = r5.A01;
        String str2 = r5.A00;
        C371458yK aREngineEffect = aREngineMaskEffectAdapter.toAREngineEffect(file2, xplatModelPaths, obj2, aRRequestAsset, str, str2);
        C313096fr r2 = this.A04.A02;
        if (!r5.A02) {
            C368758tH A002 = C313096fr.A00(r2, r5.A03);
            if (A002 != null) {
                C313096fr.A02(A002.onEvent(3, str2, false));
            } else {
                C312156dv r3 = r2.A00;
                if (r3 != null) {
                    r3.markPoint(r3.getInstanceIdWithString(16321564, str2), 1, str2);
                }
            }
        }
        C371548ya.A00(this.A00, new C371538yZ(this.A01, aREngineEffect));
    }

    public AnonymousClass8yT(Handler handler, C371478yM r2, ARRequestAsset aRRequestAsset, AREngineMaskEffectAdapter aREngineMaskEffectAdapter, C314366i5 r5, C352728Ep r6, ListenableFuture listenableFuture) {
        this.A06 = listenableFuture;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = handler;
        this.A03 = aREngineMaskEffectAdapter;
        this.A02 = aRRequestAsset;
    }

    public final void onFail(String str) {
        C371548ya.A00(this.A00, new C41191App(this.A01, this.A04, this.A05, str));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void onSuccess(String str, XplatModelPaths xplatModelPaths, List list, List list2) {
        List list3 = list2;
        List list4 = list;
        0qQ.A0B(str, 0);
        XplatModelPaths xplatModelPaths2 = xplatModelPaths;
        0qQ.A0B(xplatModelPaths, 1);
        File file = new File(str);
        if (!file.exists()) {
            onFail("[ARD][%s] Effect file not found after successful xplat fetch completion.");
            return;
        }
        try {
            ListenableFuture listenableFuture = this.A06;
            if (!listenableFuture.isDone() || !((Boolean) listenableFuture.get()).booleanValue()) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C314366i5 r7 = this.A04;
                ScheduledExecutorService scheduledExecutorService = r7.A08;
                C255183ti.A04(new AnonymousClass934(this.A00, this.A01, this, r7, xplatModelPaths2, this.A05, file, list4, list3), C255183ti.A02(listenableFuture, scheduledExecutorService, timeUnit, 20), scheduledExecutorService);
                return;
            }
            if (list == null) {
                list4 = 0sn.A00;
            }
            if (list2 == null) {
                list3 = 0sn.A00;
            }
            A00(xplatModelPaths, this.A05, file, list4, list3);
        } catch (InterruptedException | ExecutionException e) {
            C314366i5 r4 = this.A04;
            C371478yM r3 = this.A01;
            C352728Ep r2 = this.A05;
            ? obj = new Object();
            obj.A00 = AnonymousClass05K.A05;
            obj.A02 = e;
            C314366i5.A02(r3, obj.A00(), r4, r2);
        }
    }
}
