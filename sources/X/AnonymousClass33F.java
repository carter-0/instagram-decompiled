package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.33F  reason: invalid class name */
public final class AnonymousClass33F extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass310 A03;
    public final /* synthetic */ AnonymousClass334 A04;
    public final /* synthetic */ AnonymousClass2xS A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33F(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass310 r5, AnonymousClass334 r6, AnonymousClass2xS r7, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = r6;
        this.A07 = z;
        this.A03 = r5;
        this.A06 = str;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass334 r3 = this.A04;
        AnonymousClass4DU r10 = r3.A04;
        AnonymousClass07Z r6 = r3.A00;
        boolean z = this.A07;
        AnonymousClass310 r9 = this.A03;
        C243033Xd BRM = r9.BRM();
        C242813Wa BQE = r9.BQE();
        C242903Wq BR5 = r9.BR5();
        AnonymousClass339 r15 = r3.A06;
        String str = this.A06;
        return new C54482HFk(context, fragmentActivity, r6, r3.A01, userSession, r9, r10, BQE, BRM, r3.A05, BR5, r15, this.A05.A0G, r9.BqC(), str, z);
    }
}
