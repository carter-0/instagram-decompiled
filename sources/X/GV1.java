package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class GV1 implements C228232l0 {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass4DU A03;
    public final 1L5 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4LS, java.lang.Object] */
    public final Map AUH(String str) {
        Map AUH;
        String str2 = str;
        0qQ.A0B(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (!this.A07 || (!this.A05 && !this.A06)) {
            A1H.putAll(C51971G9r.A0w(str, this.A01));
            AUH = ((C228232l0) this.A00.getValue()).AUH(str);
        } else {
            G9t.A1P(str, A1H, this.A02);
            if (this.A06) {
                AUH = C51971G9r.A0w(str, this.A01);
            }
            this.A04.EGc(new Object(), this.A03.getModuleName(), str2, 00k.A0a(A1H.keySet()), 0Yt.A0B(A1H), (double) C51966G9m.A07(currentTimeMillis));
            return A1H;
        }
        A1H.putAll(AUH);
        this.A04.EGc(new Object(), this.A03.getModuleName(), str2, 00k.A0a(A1H.keySet()), 0Yt.A0B(A1H), (double) C51966G9m.A07(currentTimeMillis));
        return A1H;
    }

    public GV1(AnonymousClass4DU r3, 1L5 r4, C62320sa r5, C62320sa r6, C62320sa r7, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = AnonymousClass0eN.A01(new C20607Wvo(r6, 3));
        this.A02 = AnonymousClass0eN.A01(new C20607Wvo(r7, 4));
        this.A00 = AnonymousClass0eN.A01(new C20607Wvo(r5, 2));
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r1, C233162v9 r2, Object obj, Object obj2) {
    }
}
