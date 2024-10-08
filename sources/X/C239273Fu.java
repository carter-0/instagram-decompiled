package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Fu  reason: invalid class name and case insensitive filesystem */
public final class C239273Fu implements C239283Fv {
    public final AtomicInteger A00 = new AtomicInteger(-1);
    public final AnonymousClass0r6 A01;
    public final 05G A02;
    public final 0xa A03;

    public C239273Fu(0xa r4) {
        0qQ.A0B(r4, 1);
        this.A03 = r4;
        C239293Fw r2 = C239293Fw.A00;
        this.A02 = 106.A01(r2);
        this.A01 = new AnonymousClass05E(new AnonymousClass9KE(this, (AnonymousClass4D7) null, 7));
        r4.EBr(new C239313Fy(this));
    }

    public final AnonymousClass0r6 BOP(String str, long j) {
        0qQ.A0B(str, 0);
        return new C239323Fz(str, this.A01, j);
    }

    public final AnonymousClass0r6 C1k(String str, String str2) {
        0qQ.A0B(str, 0);
        return new MC3(str, str2, this.A01);
    }

    public static final AnonymousClass3G1 A00(C239273Fu r7) {
        Object value;
        AnonymousClass3G1 r1;
        05G r5 = r7.A02;
        do {
            value = r5.getValue();
            Map all = r7.A03.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : all.entrySet()) {
                if (entry.getKey() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            r1 = new AnonymousClass3G1(linkedHashMap, r7.A00.incrementAndGet());
        } while (!r5.AIY(value, r1));
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper.Data");
        return r1;
    }

    public final AnonymousClass0r6 AJX(String str) {
        return new C51619Fx8(this.A01);
    }

    public final C262294Dd AR3() {
        return new C262284Dc(this.A03.AR4());
    }

    public final AnonymousClass0r6 Aap() {
        return this.A01;
    }

    public final AnonymousClass0r6 Agv(String str, boolean z) {
        return new MC2(str, this.A01, z);
    }

    public final AnonymousClass0r6 BI4(String str, int i) {
        return new C66115MBy(str, this.A01);
    }
}
