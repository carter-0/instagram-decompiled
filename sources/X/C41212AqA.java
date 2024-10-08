package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AqA  reason: case insensitive filesystem */
public final class C41212AqA implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C387759mj A03;

    public C41212AqA(Context context, ViewGroup viewGroup, UserSession userSession, C387759mj r4) {
        this.A00 = context;
        this.A01 = viewGroup;
        this.A03 = r4;
        this.A02 = userSession;
    }

    public final void run() {
        Context context = this.A00;
        0qQ.A0A(context);
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, this.A01, new C315476jx(2131963194));
        r1.A03(this.A03.A01);
        r1.A02();
        r1.A00().A07(this.A02);
    }
}
