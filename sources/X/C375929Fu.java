package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.9Fu  reason: invalid class name and case insensitive filesystem */
public final class C375929Fu extends C272124k8 {
    public final /* synthetic */ AnonymousClass43G A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C375929Fu(UserSession userSession, AnonymousClass43G r2) {
        super(userSession);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(1823298152);
        int A032 = AnonymousClass0fD.A03(1798866416);
        2ED r3 = this.A00.A09;
        List singletonList = Collections.singletonList(C69932Ea.A00);
        0qQ.A07(singletonList);
        r3.A0U(new HashSet(singletonList), false, true);
        AnonymousClass0fD.A0A(-1442453988, A032);
        AnonymousClass0fD.A0A(326274030, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-127353723);
        C375909Fs r9 = (C375909Fs) obj;
        int A032 = AnonymousClass0fD.A03(-1884669997);
        0qQ.A0B(r9, 1);
        AnonymousClass43G r6 = this.A00;
        2Dr r1 = r6.A0B;
        boolean z = r9.A00;
        2Dr r12 = r1;
        synchronized (r12) {
            r12.A03 = Boolean.valueOf(z);
        }
        2ED r3 = r6.A09;
        List singletonList = Collections.singletonList(C69932Ea.A00);
        0qQ.A07(singletonList);
        r3.A0U(new HashSet(singletonList), r9.A00, false);
        r6.A06.A00(new C375939Fv(r9.A00));
        AnonymousClass0fD.A0A(267995655, A032);
        AnonymousClass0fD.A0A(584528408, A03);
    }
}
