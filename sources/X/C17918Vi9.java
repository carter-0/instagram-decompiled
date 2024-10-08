package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Vi9  reason: case insensitive filesystem */
public final class C17918Vi9 {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C17918Vi9(C15295Ua1 ua1, UserSession userSession, String str, String str2, String str3, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A04 = str3;
        this.A03 = str2;
        if (ua1 != null) {
            arrayList.add(new WeakReference(ua1));
        }
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = userSession;
        this.A05 = str;
    }

    public final void A00() {
        C18734VzD vzD = C18734VzD.A04;
        boolean z = this.A07;
        LruCache lruCache = vzD.A01;
        String str = this.A04;
        if (z) {
            lruCache.remove(str);
        } else if (lruCache.get(str) != null) {
            C18734VzD.A00(vzD, this);
            return;
        }
        synchronized (vzD.A02) {
            ConcurrentMap concurrentMap = vzD.A03;
            C17918Vi9 vi9 = (C17918Vi9) concurrentMap.get(str);
            if (vi9 == null) {
                concurrentMap.put(str, this);
                C239133Fc r5 = new C239133Fc(C317386nB.class, "IGCanvasDocumentQuery", 0mp.A06("{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}", new Object[]{"0", str, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "102", "3", Integer.valueOf(this.A00), "2", Integer.valueOf(this.A01), "4", this.A05}), true);
                C239123Fb A012 = C46479Dfi.A01(this.A02);
                A012.A09(r5);
                A012.A08 = "canvas_policy";
                1OC A072 = A012.A07(AnonymousClass05K.A00);
                A072.A00 = new H51(0, (Object) this, (Object) vzD);
                0nY.A00().ATE(new C15879Uk3(A072));
            } else {
                vi9.A06.addAll(this.A06);
            }
        }
    }
}
