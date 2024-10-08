package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MiL  reason: case insensitive filesystem */
public abstract class C67101MiL {
    public AnonymousClass7BY A00;
    public Map A01;
    public final UserSession A02;

    public final void A02(C254743sy r5) {
        String str;
        C254743sy A022;
        0qQ.A0B(r5, 0);
        AnonymousClass7BY A002 = AnonymousClass7BY.A00(this.A02);
        0qQ.A0B(A002, 0);
        this.A00 = A002;
        ImmutableList A012 = A002.A01();
        0qQ.A07(A012);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it);
            if (!(DbS.A0c(A0f) instanceof PIO) && (A022 = A0f.A02()) != null) {
                A1H.put(A01(A022), A0f);
            }
        }
        this.A01 = A1H;
        String A013 = A01(r5);
        Map map = this.A01;
        if (map != null) {
            if (map.containsKey(A013)) {
                Map map2 = this.A01;
                if (map2 != null) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) map2.get(A013);
                    if (directShareTarget != null) {
                        AnonymousClass7BY r0 = this.A00;
                        if (r0 != null) {
                            r0.A03(directShareTarget);
                            return;
                        }
                        str = "recentSearchesCoordinator";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        str = "recentResultMap";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(C254743sy r2, Integer num) {
        AnonymousClass7TF.A1H(r2, num);
        A04(r2, num, false);
    }

    public final void A04(C254743sy r7, Integer num, boolean z) {
        if (this instanceof C67100MiK) {
            C67100MiK miK = (C67100MiK) this;
            0qQ.A0B(num, 2);
            if (C66647MaG.A0F(r7)) {
                C70266Nzw.A00(miK.A00, miK.A01, new C72650PEd(miK, r7, z), r7, num);
                return;
            }
            throw DbT.A0m();
        }
        C68966Nbt nbt = (C68966Nbt) this;
        0qQ.A0B(num, 2);
        C70266Nzw.A00(nbt.A00, nbt.A02, new C72649PEc(4, nbt, r7), C66647MaG.A06(r7), num);
    }

    public C67101MiL(UserSession userSession) {
        this.A02 = userSession;
    }

    public static final String A01(C254743sy r2) {
        if (C66647MaG.A0F(r2)) {
            String A09 = C66647MaG.A09(r2);
            if (A09 == null) {
                return "";
            }
            return A09;
        } else if (C66647MaG.A07(r2) != null) {
            return String.valueOf(C66647MaG.A00(r2));
        } else {
            throw C66582MXn.A0k(r2, "Unsupported threadKey type: ", AnonymousClass7TE.A1A());
        }
    }
}
