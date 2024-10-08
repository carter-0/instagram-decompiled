package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.6sI  reason: invalid class name and case insensitive filesystem */
public final class C320386sI implements 1wn {
    public final /* synthetic */ C320296s9 A00;

    public C320386sI(C320296s9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1728250572);
        C320756st r9 = (C320756st) obj;
        int A032 = AnonymousClass0fD.A03(-707959638);
        0qQ.A0B(r9, 0);
        C320296s9 r6 = this.A00;
        C320516sV r0 = r6.A06;
        if (r0 == null) {
            0qQ.A0F("clipsGridAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator it = r0.A01().iterator();
        int i = 0;
        while (it.hasNext() && ((r2 = ((C320716sp) it.next()).A03.A02) == null || !r2.A6g(((UserSession) r6.A0T.getValue()).A06) || (i = i + 1) < 3)) {
        }
        r9.A00.invoke(Integer.valueOf(i));
        AnonymousClass0fD.A0A(-1686219688, A032);
        AnonymousClass0fD.A0A(1060006965, A03);
    }
}
