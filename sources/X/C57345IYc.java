package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IYc  reason: case insensitive filesystem */
public final class C57345IYc implements C228232l0 {
    public final C296295pp A00;
    public final C296325ps A01;

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C267324bN r5 = (C267324bN) obj;
        AnonymousClass7TG.A1T(r4, r5, obj2);
        if (r4 == C233162v9.SHARE_BUTTON_CLICK) {
            this.A00.A00(C51974G9v.A0R(r5), r4, r5, obj2);
        } else {
            throw C51973G9u.A0g(r4, C273654mx.A00(63), AnonymousClass7TE.A1A());
        }
    }

    public C57345IYc(C296325ps r1, C296295pp r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final Map AUH(String str) {
        LinkedHashMap A0t = C51972G9s.A0t(str);
        A0t.putAll(this.A01.ATx(C233162v9.SHARE_BUTTON_CLICK, str));
        return A0t;
    }
}
