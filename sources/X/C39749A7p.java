package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.A7p  reason: case insensitive filesystem */
public final class C39749A7p {
    public final ARU A00 = new ARU(this);
    public final A8M A01 = new A8M(this);
    public final A3E A02 = new A3E();
    public final AH4 A03;
    public final C18417VrM A04;
    public final VM0 A05;
    public final A9C A06;
    public final ARR A07;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.82L, java.lang.Object] */
    public C39749A7p(Context context, ViewGroup viewGroup, C312426eP r15, C18417VrM vrM, VM0 vm0, A9C a9c, Integer num, String str, int i) {
        C18417VrM vrM2 = vrM;
        AnonymousClass7TF.A1E(viewGroup, 2, vrM2);
        A9C a9c2 = a9c;
        this.A06 = a9c2;
        this.A05 = vm0;
        this.A04 = vrM2;
        ARR arr = new ARR(this);
        this.A07 = arr;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C39630A2u.A02, context);
        A1E.put(C39630A2u.A08, str);
        A1E.put(C39630A2u.A0B, viewGroup);
        A1E.put(C39630A2u.A03, arr);
        C392559v0 r1 = C39630A2u.A0A;
        Integer valueOf = Integer.valueOf(AnonymousClass7TF.A1W(num, AnonymousClass05K.A00) ? 1 : 0);
        boolean A1U = AnonymousClass7TF.A1U(0, r1, valueOf);
        A1E.put(r1, valueOf);
        C392559v0 r12 = C39630A2u.A00;
        Integer valueOf2 = Integer.valueOf(i);
        0qQ.A0B(r12, 0);
        0qQ.A0B(valueOf2, A1U ? 1 : 0);
        A1E.put(r12, valueOf2);
        C392559v0 r13 = C39630A2u.A09;
        ? obj = new Object();
        Context context2 = a9c2.A03;
        UserSession userSession = a9c2.A06;
        C361848gv A002 = C368558sq.A00(context2, obj, (GPUTimerImpl) null, (AnonymousClass82I) null, a9c2.A04, userSession, 0);
        0qQ.A0B(r13, 0);
        0qQ.A0B(A002, A1U);
        A1E.put(r13, A002);
        C392559v0 r0 = C39630A2u.A05;
        0qQ.A0B(r0, 0);
        A1E.put(r0, r15);
        C392559v0 r14 = C39630A2u.A01;
        List A003 = C392539uy.A00(userSession);
        0qQ.A0B(r14, 0);
        A1E.put(r14, A003);
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A1E2.putAll(A1E);
        this.A03 = new AH4(A1E2);
    }
}
