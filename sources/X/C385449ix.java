package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9ix  reason: invalid class name and case insensitive filesystem */
public final class C385449ix extends 1P0 {
    public final List A00;
    public final /* synthetic */ C39728A6t A01;

    public C385449ix(C39728A6t a6t, List list) {
        this.A01 = a6t;
        this.A00 = list;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -1793713905);
        C39728A6t a6t = this.A01;
        C385469iz r0 = a6t.A02;
        if (r0 != null) {
            r0.onFail(r5);
        }
        UserSession userSession = a6t.A01;
        if (userSession != null) {
            C70934OSh.A00(userSession).markerEnd(246558735, 3);
        }
        AnonymousClass0fD.A0A(-2028821377, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-4102307);
        C385469iz r0 = this.A01.A02;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(670880878, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(887106930);
        C39728A6t a6t = this.A01;
        C385469iz r0 = a6t.A02;
        if (r0 != null) {
            r0.onStart();
        }
        UserSession userSession = a6t.A01;
        if (userSession != null) {
            C70934OSh.A00(userSession).markerStart(246558735);
        }
        AnonymousClass0fD.A0A(2139118032, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-259399594);
        AnonymousClass1XT r6 = (AnonymousClass1XT) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -1319575720);
        ((C336537em) r6).getItems();
        C39728A6t a6t = this.A01;
        C385469iz r0 = a6t.A02;
        if (r0 != null) {
            r0.A00(r6);
        }
        UserSession userSession = a6t.A01;
        if (userSession != null) {
            C70934OSh.A00(userSession).markerEnd(246558735, 2);
        }
        AnonymousClass0fD.A0A(700876778, A0D);
        AnonymousClass0fD.A0A(123540420, A03);
    }
}
