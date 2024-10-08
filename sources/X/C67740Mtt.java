package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtt  reason: case insensitive filesystem */
public final class C67740Mtt extends 2YL {
    public final C269794fh A00;
    public final UserSession A01;
    public final 2Dm A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public C67740Mtt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = 2L2.A00(userSession);
        02z A10 = DbS.A10(new JV5(false, (List) null, (List) null, 7, (DefaultConstructorMarker) null, 11));
        this.A04 = A10;
        this.A05 = 10b.A03(A10);
        this.A00 = C66582MXn.A0O(userSession, AnonymousClass436.A00);
    }

    public final void A00() {
        Object value;
        JV5 jv5;
        boolean z;
        ArrayList A0r;
        05G r2 = this.A04;
        do {
            value = r2.getValue();
            jv5 = (JV5) value;
            z = !jv5.A01;
            List<C68208N5x> list = (List) jv5.A00;
            A0r = AnonymousClass7TG.A0r(list);
            for (C68208N5x n5x : list) {
                String str = n5x.A01;
                String str2 = n5x.A02;
                String str3 = n5x.A03;
                2EM r7 = n5x.A00;
                boolean z2 = n5x.A05;
                boolean z3 = n5x.A06;
                boolean z4 = n5x.A04;
                C51974G9v.A1O(str, str2, str3, r7);
                A0r.add(new C68208N5x(r7, str, str2, str3, z2, z3, z4, z));
            }
        } while (!r2.AIY(value, JV5.A00(A0r, 00k.A0T(OS6.A00, (Collection) jv5.A03), z)));
    }

    public final void maybeShowNuxBanner() {
        Object value;
        JV5 jv5;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A01);
        if (!AnonymousClass7TG.A1a(A002, A002.A0M, AnonymousClass4kA.A0c, 29)) {
            05G r5 = this.A04;
            do {
                value = r5.getValue();
                jv5 = (JV5) value;
            } while (!r5.AIY(value, JV5.A00((List) jv5.A00, 00k.A0T(OS5.A00, (Collection) jv5.A03), jv5.A01)));
        }
    }
}
