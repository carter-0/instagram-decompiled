package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GXr  reason: case insensitive filesystem */
public final class C52566GXr implements C228232l0 {
    public boolean A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass4DU A05;
    public final 1L5 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4LS, java.lang.Object] */
    public final Map AUH(String str) {
        Map AUH;
        String str2 = str;
        LinkedHashMap A0t = C51972G9s.A0t(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.A09 || (!this.A07 && !this.A08)) {
            if (this.A00) {
                G9t.A1Q(str, A0t, this.A04);
            }
            A0t.putAll(C51971G9r.A0w(str, this.A02));
            AUH = ((C228232l0) this.A01.getValue()).AUH(str);
        } else {
            G9t.A1P(str, A0t, this.A03);
            if (this.A08) {
                AUH = C51971G9r.A0w(str, this.A02);
            }
            this.A06.EGc(new Object(), this.A05.getModuleName(), str2, 00k.A0a(A0t.keySet()), 0Yt.A0B(A0t), (double) C51966G9m.A07(currentTimeMillis));
            return A0t;
        }
        A0t.putAll(AUH);
        this.A06.EGc(new Object(), this.A05.getModuleName(), str2, 00k.A0a(A0t.keySet()), 0Yt.A0B(A0t), (double) C51966G9m.A07(currentTimeMillis));
        return A0t;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        0qQ.A0B(r4, 0);
        DbZ.A0t(1, obj, obj2, r3);
        this.A00 = true;
        switch (r4.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 27:
            case 28:
                return;
            case 16:
                ((C228232l0) this.A04.getValue()).DUE(r3, r4, obj, obj2);
                return;
            default:
                throw C51973G9u.A0g(r4, AnonymousClass000.A00(2541), AnonymousClass7TE.A1A());
        }
    }

    public C52566GXr(AnonymousClass4DU r2, 1L5 r3, C62320sa r4, C62320sa r5, C62320sa r6, C62320sa r7, boolean z, boolean z2, boolean z3) {
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = C51970G9q.A0p(r4, 36);
        this.A02 = C51970G9q.A0p(r6, 34);
        this.A03 = C51970G9q.A0p(r7, 35);
        this.A01 = C51970G9q.A0p(r5, 33);
    }
}
