package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.507  reason: invalid class name */
public final class AnonymousClass507 {
    public static final AtomicBoolean A07 = new AtomicBoolean(false);
    public 0lg A00;
    public 0xa A01;
    public boolean A02;
    public final V3N A03;
    public final C271464it A04;
    public final Map A05 = new HashMap();
    public volatile 1R0 A06;

    public final synchronized void A01(1R6 r10) {
        String str;
        synchronized (this) {
            HashSet hashSet = new HashSet();
            List<C17978VjG> list = r10.A00;
            for (C17978VjG vjG : list) {
                String str2 = vjG.A01;
                hashSet.add(str2);
                C17823Vgc A002 = A00(str2);
                if (vjG.A00 < 60) {
                    vjG = new C17978VjG(str2, vjG.A02, 60);
                }
                C18472VsO vsO = A002.A01;
                if (vsO == null || !vsO.A01.equals(vjG)) {
                    A002.A00();
                    A002.A01 = new C18472VsO(A002, vjG);
                }
            }
            for (Map.Entry entry : this.A05.entrySet()) {
                C17823Vgc vgc = (C17823Vgc) entry.getValue();
                if (!hashSet.contains(entry.getKey())) {
                    vgc.A00();
                }
            }
            if (!list.isEmpty()) {
                try {
                    str = C281955Af.A00(r10).toString();
                } catch (JSONException unused) {
                    str = null;
                }
                "zero_carrier_signal".getClass();
                0xI A012 = 0xI.A01("zero_carrier_signal", (String) null);
                A012.A0C("event_type", "config_update");
                A012.A0C("config", str);
                A012.A0C("url", (String) null);
                A012.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, (String) null);
                A012.A0C(RealtimeConstants.SEND_SUCCESS, (String) null);
                A012.A0C("state_changed", (String) null);
                C60510iO.A00(this.A00).EFq(A012);
                A012.A03();
            }
        }
    }

    private C17823Vgc A00(String str) {
        Map map = this.A05;
        C17823Vgc vgc = (C17823Vgc) map.get(str);
        if (vgc == null) {
            vgc = new C17823Vgc(this);
            map.put(str, vgc);
            0xa r2 = this.A01;
            if (r2 != null) {
                long j = r2.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE) {
                    synchronized (this) {
                        V3N v3n = this.A03;
                        long j2 = j - v3n.A00;
                        if (j2 <= v3n.A01.now()) {
                            A00(str).A00 = j2;
                        }
                    }
                }
            }
        }
        return vgc;
    }

    public final void A02(C17978VjG vjG, long j) {
        if (!this.A02) {
            this.A02 = true;
            0xa r9 = this.A01;
            if (r9 != null) {
                0xY AR4 = r9.AR4();
                AR4.E5c(vjG.A01, j);
                AR4.apply();
                if (A07.compareAndSet(false, true)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    for (String str : r9.getAll().keySet()) {
                        long j2 = currentTimeMillis - r9.getLong(str, 0);
                        if (j2 < 0 || j2 > 2592000000L) {
                            arrayList.add(str);
                        }
                    }
                    0xY AR42 = r9.AR4();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AR42.ED3((String) it.next());
                    }
                    AR42.apply();
                }
            }
            1OC A002 = SC6.A00(vjG.A02);
            A002.A00 = new C15618Ufk(vjG, this);
            1ES.A03(A002);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.V3N, java.lang.Object] */
    public AnonymousClass507(AnonymousClass0JR r6, 0lg r7, C271464it r8, AnonymousClass1Qz r9) {
        0tX r0;
        this.A06 = r9;
        this.A04 = r8;
        ? obj = new Object();
        obj.A01 = r6;
        obj.A00 = System.currentTimeMillis() - r6.now();
        this.A03 = obj;
        this.A02 = false;
        this.A00 = r7;
        if (182.A06(0Tu.A05, r7, 36312492493833351L)) {
            r0 = 0xn.A01("PrefCarrierSignalTimestamps");
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }
}
