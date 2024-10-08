package X;

import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* renamed from: X.IDt  reason: case insensitive filesystem */
public final class C56822IDt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ C227802jw A01;

    public C56822IDt(Configuration configuration, C227802jw r2) {
        this.A01 = r2;
        this.A00 = configuration;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r3 = this;
            X.2jw r1 = r3.A01     // Catch:{ IllegalStateException -> 0x003a }
            X.1Xj r0 = r1.A06()     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.A5G()     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0044
            X.2kj r0 = r1.A0A()     // Catch:{ IllegalStateException -> 0x003a }
            X.2xS r0 = r0.A0F()     // Catch:{ IllegalStateException -> 0x003a }
            X.2uK r2 = r0.A0G     // Catch:{ IllegalStateException -> 0x003a }
            android.content.Context r0 = r1.getContext()     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0035
            boolean r0 = X.C255983v2.A00(r0)     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x002e
            X.4M7 r1 = X.AnonymousClass4M7.FIT     // Catch:{ IllegalStateException -> 0x003a }
            X.4M3 r0 = r2.A05     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0044
        L_0x002a:
            r0.EjF(r1)     // Catch:{ IllegalStateException -> 0x003a }
            goto L_0x0044
        L_0x002e:
            X.4M7 r1 = X.AnonymousClass4M7.FILL     // Catch:{ IllegalStateException -> 0x003a }
            X.4M3 r0 = r2.A05     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0044
            goto L_0x002a
        L_0x0035:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IllegalStateException -> 0x003a }
            throw r0     // Catch:{ IllegalStateException -> 0x003a }
        L_0x003a:
            X.0wj r2 = X.0wj.A01
            r1 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r0 = "Failed to get media"
            r2.AEf(r0, r1)
        L_0x0044:
            X.2jw r2 = r3.A01
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x004f
            X.C51970G9q.A12(r0)
        L_0x004f:
            X.2kj r0 = r2.A0A()
            X.2rI r1 = r0.A0J()
            android.content.res.Configuration r0 = r3.A00
            r1.notifyDataSetChangedSmart(r0)
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x0063
            X.C51971G9r.A0z(r0, r3)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56822IDt.onGlobalLayout():void");
    }
}
