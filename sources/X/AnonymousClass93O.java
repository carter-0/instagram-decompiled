package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.93O  reason: invalid class name */
public final class AnonymousClass93O extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C270734hD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public AnonymousClass93O(UserSession userSession, C270734hD r2, String str, 0sP r4) {
        this.A03 = r4;
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isValidResponseData(Object obj) {
        C298835u7 r2 = (C298835u7) obj;
        0qQ.A0B(r2, 0);
        return C270734hD.A05(r2);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(648494013);
        AnonymousClass93O.super.onFinish();
        C270734hD.A04(this.A00, this.A01);
        AnonymousClass0fD.A0A(673625293, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        1Xj r1;
        int A032 = AnonymousClass0fD.A03(2038781391);
        C298835u7 r7 = (C298835u7) obj;
        int A033 = AnonymousClass0fD.A03(-471674944);
        0qQ.A0B(r7, 0);
        Iterator it = r7.Ao4().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((C267324bN) obj2).A02 != null) {
                break;
            }
        }
        C267324bN r12 = (C267324bN) obj2;
        if (!(r12 == null || (r1 = r12.A02) == null)) {
            C255593uO.A00(this.A00).A01(new C256203vO(r1.CEL(), this.A02));
        }
        this.A03.invoke(r7);
        AnonymousClass0fD.A0A(305765398, A033);
        AnonymousClass0fD.A0A(-1777343174, A032);
    }
}
