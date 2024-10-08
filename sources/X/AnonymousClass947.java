package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.947  reason: invalid class name */
public final class AnonymousClass947 extends C272124k8 {
    public final /* synthetic */ AnonymousClass4A0 A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass947(UserSession userSession, AnonymousClass4A0 r2, C62320sa r3, boolean z, boolean z2) {
        super(userSession);
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(1705568151);
        AnonymousClass945 r12 = (AnonymousClass945) obj;
        int A033 = AnonymousClass0fD.A03(2007799883);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        0qQ.A0B(r12, 1);
        HashMap hashMap = r12.A00;
        if (hashMap != null) {
            if (!hashMap.isEmpty()) {
                HashMap hashMap2 = r12.A00;
                if (hashMap2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(hashMap2.size()));
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        Object key = entry.getKey();
                        C294035lk r14 = (C294035lk) entry.getValue();
                        String str = (String) entry.getKey();
                        0qQ.A0B(r14, 0);
                        0qQ.A0B(str, 1);
                        long j = r14.A01;
                        boolean z = r14.A08;
                        long j2 = r14.A00;
                        String str2 = r14.A03;
                        long j3 = j;
                        String str3 = str;
                        linkedHashMap.put(key, new C251053mU(str3, r14.A02, str2, j3, j2, z, r14.A09));
                    }
                    HashMap hashMap3 = r12.A00;
                    if (hashMap3 != null) {
                        hashMap3.size();
                        linkedHashMap.size();
                        AnonymousClass4A0.A03(this.A00, linkedHashMap, this.A02, this.A03);
                    }
                }
            } else if (this.A03) {
                for (Object add : r12.A01) {
                    ((AnonymousClass9V9) userSession2.A01(AnonymousClass9V9.class, new AnonymousClass9V8(userSession2))).A00.add(add);
                }
            }
            AnonymousClass0fD.A0A(-1984785255, A033);
            AnonymousClass0fD.A0A(726325626, A032);
            return;
        }
        0qQ.A0F("userIdToPresenceState");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(702630684);
        this.A00.A03 = null;
        AnonymousClass0fD.A0A(-994781322, A032);
    }

    public final void A05(C268654dm r5, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(1571717165);
        0qQ.A0B(r5, 1);
        Throwable A012 = r5.A01();
        0KC.A0F("ApiFetchPresenceDataProvider", "failed to fetch presence", A012);
        if (A012 instanceof 1bD) {
            0wb.A06("ApiFetchPresenceDataProvider", AnonymousClass000.A00(2188), A012);
        }
        C62320sa r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
        }
        AnonymousClass0fD.A0A(1315619851, A032);
    }
}
