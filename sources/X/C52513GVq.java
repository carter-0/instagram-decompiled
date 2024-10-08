package X;

import android.app.Activity;
import android.content.Context;
import android.util.LruCache;

/* renamed from: X.GVq  reason: case insensitive filesystem */
public final class C52513GVq implements JPC {
    public final /* synthetic */ C52511GVo A00;
    public final /* synthetic */ String A01;

    public C52513GVq(C52511GVo gVo, String str) {
        this.A00 = gVo;
        this.A01 = str;
    }

    public final void DYj(Throwable th) {
        LruCache lruCache;
        C52511GVo gVo = this.A00;
        gVo.A03.Dp0(gVo.A01);
        Context context = gVo.A02;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((activity.isFinishing() || activity.isDestroyed()) && (lruCache = ((C7271Q1v) gVo.A00(this.A01).A04).A00) != null) {
                lruCache.evictAll();
            }
        }
    }

    public final void DYk() {
        LruCache lruCache;
        C52511GVo gVo = this.A00;
        gVo.A03.Dp0(gVo.A01);
        Context context = gVo.A02;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((activity.isFinishing() || activity.isDestroyed()) && (lruCache = ((C7271Q1v) gVo.A00(this.A01).A04).A00) != null) {
                lruCache.evictAll();
            }
        }
    }
}
