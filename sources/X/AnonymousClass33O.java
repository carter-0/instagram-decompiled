package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.33O  reason: invalid class name */
public final class AnonymousClass33O extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass310 A02;
    public final /* synthetic */ AnonymousClass334 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33O(Context context, UserSession userSession, AnonymousClass310 r4, AnonymousClass334 r5, String str, String str2, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r5;
        this.A06 = z;
        this.A02 = r4;
        this.A05 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass334 r0 = this.A03;
        AnonymousClass4DU r5 = r0.A04;
        AnonymousClass07Z r2 = r0.A00;
        boolean z = this.A06;
        AnonymousClass310 r02 = this.A02;
        return new C262334Dh(context, r2, userSession, r02.BRO(), r5, r02.BQE(), this.A05, this.A04, z);
    }
}
