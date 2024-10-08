package X;

import android.content.Context;
import androidx.paging.PagingDataAdapter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GhE  reason: case insensitive filesystem */
public final class C53023GhE extends 2YL {
    public Dc2 A00;
    public boolean A01;
    public boolean A02;
    public final C55840HoN A03;
    public final C55560Hjg A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07 = 106.A01((Object) null);
    public final UserSession A08;

    public C53023GhE(UserSession userSession, C55840HoN hoN, C55560Hjg hjg) {
        0qQ.A0B(userSession, 1);
        this.A08 = userSession;
        this.A03 = hoN;
        this.A04 = hjg;
        1HR r0 = new 1HR(0);
        this.A05 = r0;
        this.A06 = 0u9.A04(r0);
        C58099ImL.A01(this, C318116oQ.A00(this), 28);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.List, X.Wv8] */
    public static final void A00(Context context, C267324bN r16, UserSession userSession, 1Xj r18, AnonymousClass4DU r19, C243373Ym r20, C52967GgK ggK, C53023GhE ghE, Map map) {
        Integer num;
        String str;
        1Xj r0;
        C243373Ym r3 = C243373Ym.SAVED;
        C53023GhE ghE2 = ghE;
        C55560Hjg hjg = ghE2.A04;
        C267324bN r5 = r16;
        ArrayList A0q = AnonymousClass7TF.A0q(r5, 0);
        05G r2 = hjg.A00;
        Collection collection = (Collection) r2.getValue();
        C243373Ym r8 = r20;
        if (r8 == r3) {
            A0q.addAll(collection);
            num = AnonymousClass05K.A00;
        } else {
            A0q.addAll(collection);
            num = AnonymousClass05K.A01;
        }
        A0q.add(new C61083JwL(r5, num));
        r2.Epw(A0q);
        1Xj r9 = r18;
        r9.EjB(r8);
        AnonymousClass7TE.A1Z(new MGO(ghE2, r8, r9, context, r19, userSession, (AnonymousClass4D7) null, 11), C318116oQ.A00(ghE2));
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (!0qQ.A0K(A1J.getKey(), "saved")) {
                int size = ((PagingDataAdapter) A1J.getValue()).A01().size();
                for (int i = 0; i < size; i++) {
                    String id = r9.getId();
                    C267324bN r02 = (C267324bN) 00k.A0O(((PagingDataAdapter) A1J.getValue()).A01(), i);
                    if (r02 == null || (r0 = r02.A02) == null) {
                        str = null;
                    } else {
                        str = r0.getId();
                    }
                    if (0qQ.A0K(id, str)) {
                        Iterator A1G = AnonymousClass7TE.A1G(ggK.A01);
                        while (A1G.hasNext()) {
                            C53152GjO gjO = (C53152GjO) AnonymousClass7TF.A0a(A1G);
                            if (C51969G9p.A1Z(r9, C51969G9p.A0u(gjO.A00))) {
                                if (r8 == r3) {
                                    gjO.A00();
                                } else {
                                    gjO.A01();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
