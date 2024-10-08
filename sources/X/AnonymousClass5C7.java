package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.5C7  reason: invalid class name */
public final class AnonymousClass5C7 implements C228232l0 {
    public final AnonymousClass5C1 A00;
    public final AnonymousClass5C3 A01;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass5C2 r3 = (AnonymousClass5C2) this.A01;
        1Kv r2 = r3.A02;
        List ELB = r2.ELB(r3.A03);
        r2.EEd(ELB);
        AnonymousClass5C6 r1 = r3.A00;
        linkedHashMap.putAll(r1.A00(str, ELB));
        List ELB2 = r2.ELB(r3.A04);
        r2.EEd(ELB2);
        linkedHashMap.putAll(r1.A01(str, ELB2));
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r11, C233162v9 r12, Object obj, Object obj2) {
        C230472pg r0;
        C230472pg r5;
        1Xj r13 = (1Xj) obj;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        0qQ.A0B(obj2, 2);
        int ordinal = r12.ordinal();
        if (ordinal == 5) {
            AnonymousClass5C1 r1 = this.A00;
            if (r13.CcK()) {
                r0 = C230472pg.SPONSORED;
            } else {
                r0 = C230472pg.ORGANIC;
            }
            r1.A00(r0, r13, obj2);
        } else if (ordinal == 13) {
            AnonymousClass5C1 r14 = this.A00;
            if (r13.CcK()) {
                r5 = C230472pg.SPONSORED;
            } else {
                r5 = C230472pg.ORGANIC;
            }
            1Kv r2 = r14.A02;
            String obj3 = UUID.randomUUID().toString();
            0qQ.A07(obj3);
            C233162v9 r7 = C233162v9.UNLIKE_CLICK;
            r2.DUD(new AnonymousClass9IV(new AnonymousClass9J4(new AnonymousClass9JO(2), r5, AnonymousClass4EC.COLLECTED_TO_MEMORY, r7, r14.A03, obj3), (C253513qu) r14.A01.AUU(r13, obj2)));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong signal type in LikeUnlikeRealtimeSignalProviderImpl: ");
            sb.append(r12);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public AnonymousClass5C7(AnonymousClass5C3 r1, AnonymousClass5C1 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
