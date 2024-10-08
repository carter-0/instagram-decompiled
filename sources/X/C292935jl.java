package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5jl  reason: invalid class name and case insensitive filesystem */
public final class C292935jl implements Runnable {
    public final /* synthetic */ C254353sL A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C229852oR A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C292935jl(C254353sL r1, AnonymousClass4DU r2, C229852oR r3, Integer num, String str, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = num;
        this.A04 = str;
        this.A05 = z;
    }

    public final void run() {
        C229852oR r0 = this.A02;
        UserSession userSession = r0.A03;
        AnonymousClass4DU r2 = this.A01;
        C297195rM.A00(r0.A00, this.A00, r2, userSession, this.A03, this.A04);
    }
}
