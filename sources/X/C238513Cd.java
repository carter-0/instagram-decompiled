package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
public final class C238513Cd implements C228232l0 {
    public final AnonymousClass4DU A00;
    public final 1L5 A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4LS, java.lang.Object] */
    public final Map AUH(String str) {
        Map AUH;
        String str2 = str;
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.A0F || (!this.A0C && !this.A0E)) {
            linkedHashMap.putAll(((C228232l0) this.A0B.getValue()).AUH(str));
            linkedHashMap.putAll(((C228232l0) this.A06.getValue()).AUH(str));
            linkedHashMap.putAll(((AnonymousClass4LR) this.A08.getValue()).Bay(str));
            linkedHashMap.putAll(((C228232l0) this.A03.getValue()).AUH(str));
            linkedHashMap.putAll(((C228232l0) this.A05.getValue()).AUH(str));
            linkedHashMap.putAll(((C228232l0) this.A02.getValue()).AUH(str));
            if (this.A0D) {
                AUH = ((C228232l0) this.A04.getValue()).AUH(str);
            }
            this.A01.EGc(new Object(), this.A00.getModuleName(), str2, 00k.A0a(linkedHashMap.keySet()), 0Yt.A0B(linkedHashMap), (double) (System.currentTimeMillis() - currentTimeMillis));
            return linkedHashMap;
        }
        linkedHashMap.putAll(((C59656JRy) this.A0A.getValue()).AUR(str));
        if (this.A0E) {
            AUH = ((AnonymousClass4LR) this.A08.getValue()).Bay(str);
        }
        this.A01.EGc(new Object(), this.A00.getModuleName(), str2, 00k.A0a(linkedHashMap.keySet()), 0Yt.A0B(linkedHashMap), (double) (System.currentTimeMillis() - currentTimeMillis));
        return linkedHashMap;
        linkedHashMap.putAll(AUH);
        this.A01.EGc(new Object(), this.A00.getModuleName(), str2, 00k.A0a(linkedHashMap.keySet()), 0Yt.A0B(linkedHashMap), (double) (System.currentTimeMillis() - currentTimeMillis));
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        AnonymousClass0eM r0;
        0qQ.A0B(r4, 0);
        0qQ.A0B(obj, 1);
        0qQ.A0B(obj2, 2);
        0qQ.A0B(r3, 3);
        switch (r4.ordinal()) {
            case 2:
                r0 = this.A04;
                break;
            case 7:
                r0 = this.A06;
                break;
            case 16:
                r0 = this.A0B;
                break;
            case 24:
                r0 = this.A09;
                break;
            case 26:
                r0 = this.A02;
                break;
            case 27:
                r0 = this.A05;
                break;
            case 28:
                r0 = this.A03;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong signal type in RealtimeSignalProviderImpl for Stories: ");
                sb.append(r4);
                throw new IllegalArgumentException(sb.toString());
        }
        ((C228232l0) r0.getValue()).DUE(r3, r4, obj, obj2);
    }

    public C238513Cd(AnonymousClass4DU r3, 1L5 r4, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11, C62320sa r12, C62320sa r13, C62320sa r14, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0C = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A01 = r4;
        this.A00 = r3;
        this.A0D = z4;
        this.A0B = AnonymousClass0eN.A01(new AnonymousClass9LV(r5, 25));
        this.A06 = AnonymousClass0eN.A01(new AnonymousClass9LV(r6, 20));
        this.A04 = AnonymousClass0eN.A01(new AnonymousClass9LV(r7, 18));
        this.A09 = AnonymousClass0eN.A01(new AnonymousClass9LV(r8, 23));
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9LV(r9, 17));
        this.A05 = AnonymousClass0eN.A01(new AnonymousClass9LV(r10, 19));
        this.A02 = AnonymousClass0eN.A01(new AnonymousClass9LV(r11, 16));
        this.A08 = AnonymousClass0eN.A01(new AnonymousClass9LV(r12, 22));
        this.A07 = AnonymousClass0eN.A01(new AnonymousClass9LV(r13, 21));
        this.A0A = AnonymousClass0eN.A01(new AnonymousClass9LV(r14, 24));
    }
}
