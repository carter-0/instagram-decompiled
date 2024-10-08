package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.PcB  reason: case insensitive filesystem */
public final class C73414PcB implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C250973mM A04;
    public final /* synthetic */ C316026kz A05;
    public final /* synthetic */ C315036jF A06;
    public final /* synthetic */ C315006jC A07;

    public C73414PcB(Context context, View view, ViewGroup viewGroup, C255773uh r4, C250973mM r5, C316026kz r6, C315036jF r7, C315006jC r8) {
        this.A07 = r8;
        this.A00 = context;
        this.A02 = viewGroup;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = view;
        this.A05 = r6;
    }

    public final void run() {
        C315006jC r6 = this.A07;
        AnonymousClass6Z3 r0 = r6.A01;
        if (r0 != null) {
            r0.DkX();
        }
        Context context = this.A00;
        ViewGroup viewGroup = this.A02;
        C315036jF r5 = this.A06;
        UserSession userSession = r6.A04;
        C255773uh r3 = this.A03;
        AnonymousClass5Gt r2 = new AnonymousClass5Gt(context, viewGroup, r5.C8I(context, userSession, r3, this.A04));
        r2.A06(r5.C8G());
        r2.A0F = false;
        r2.A04 = new NdO(this, 6);
        C316026kz r02 = this.A05;
        View C8E = r5.C8E(r3, r02);
        AnonymousClass9UE C8F = r5.C8F(userSession, r3, r02);
        if (C8E != null) {
            r2.A03(C8E);
        } else if (C8F != null) {
            r2.A03 = C8F;
        } else {
            return;
        }
        AnonymousClass5Gv A002 = r2.A00();
        r6.A00 = A002;
        A002.A06();
    }
}
