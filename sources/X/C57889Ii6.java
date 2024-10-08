package X;

import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.Ii6  reason: case insensitive filesystem */
public final class C57889Ii6 implements Runnable {
    public C263364Lg A00;
    public View A01;
    public final /* synthetic */ C246283eK A02;

    public C57889Ii6(View view, C263364Lg r2, C246283eK r3) {
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = view;
    }

    public final void run() {
        HashMap hashMap;
        C246283eK r2 = this.A02;
        C52326GNt gNt = (C52326GNt) this.A00;
        0MB r5 = gNt.A00;
        boolean z = gNt.A04;
        C252933pw r0 = gNt.A01;
        C247733gp r3 = r0.A01;
        1sy r4 = r0.A03;
        boolean z2 = gNt.A03;
        SearchContext searchContext = gNt.A02;
        AnonymousClass34A r6 = r0.A04;
        AnonymousClass3W1 r02 = r0.A02;
        if (r02 == null || (hashMap = r02.A1e) == null) {
            hashMap = null;
        } else {
            hashMap.put("tap_area", "text_area");
        }
        0MB.A08(r3, r4, r5, r6, searchContext, hashMap, z, z2);
        r2.A0F = true;
    }
}
