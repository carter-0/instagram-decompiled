package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Q8  reason: invalid class name */
public final class AnonymousClass7Q8 extends C252233om implements 27S {
    public final Handler A00 = new AnonymousClass7Q9(this);
    public final AnonymousClass7Q7 A01;
    public final Context A02;
    public final 1Ng A03;
    public final UserSession A04;

    public AnonymousClass7Q8(Context context, UserSession userSession, AnonymousClass7Q7 r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A02 = context;
        this.A04 = userSession;
        this.A01 = r4;
        this.A03 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A00() {
        this.A03.A01(this, C2370836g.class);
    }

    public final void A01() {
        this.A00.removeMessages(0);
        this.A03.A02(this, C2370836g.class);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370836g r3 = (C2370836g) obj;
        0qQ.A0B(r3, 0);
        return this.A01.AJe(r3.A00.getId());
    }

    public final void onDestroyView() {
        A01();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(1838399662);
        C2370836g r7 = (C2370836g) obj;
        int A033 = AnonymousClass0fD.A03(-1837664534);
        0qQ.A0B(r7, 0);
        boolean z = r7.A03;
        Handler handler = this.A00;
        if (!z) {
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, 300);
        } else {
            handler.removeMessages(0);
            handler.sendEmptyMessage(0);
        }
        AnonymousClass0fD.A0A(788815342, A033);
        AnonymousClass0fD.A0A(-1127789397, A032);
    }

    public final void D6z(View view) {
        A00();
    }
}
