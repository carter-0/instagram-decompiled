package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.33G  reason: invalid class name */
public final class AnonymousClass33G extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass310 A03;
    public final /* synthetic */ AnonymousClass334 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33G(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass310 r5, AnonymousClass334 r6, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = r6;
        this.A06 = z;
        this.A03 = r5;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass334 r0 = this.A04;
        AnonymousClass4DU r6 = r0.A04;
        AnonymousClass07Z r3 = r0.A00;
        boolean z = this.A06;
        AnonymousClass310 r02 = this.A03;
        return new C242913Wr(context, fragmentActivity, r3, userSession, r02.BRO(), r6, r02.BQE(), r02.BR5(), this.A05, z);
    }
}
