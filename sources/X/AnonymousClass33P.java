package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.33P  reason: invalid class name */
public final class AnonymousClass33P extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass310 A02;
    public final /* synthetic */ AnonymousClass334 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33P(Context context, UserSession userSession, AnonymousClass310 r4, AnonymousClass334 r5, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A03 = r5;
        this.A05 = z;
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        AnonymousClass334 r0 = this.A03;
        AnonymousClass07Z r2 = r0.A00;
        boolean z = this.A05;
        return new C262314Df(context, r2, this.A01, r0.A02, this.A02.BRO(), r0.A04, this.A04, z);
    }
}
