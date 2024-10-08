package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Mc  reason: invalid class name and case insensitive filesystem */
public final class C377509Mc extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377509Mc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A06 = z;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            boolean z = this.A06;
            AnonymousClass4DU r3 = ((AnonymousClass334) this.A05).A04;
            AnonymousClass310 r0 = (AnonymousClass310) this.A02;
            return new AnonymousClass4EZ(context, (FragmentActivity) this.A03, r3, (UserSession) this.A04, r0.BRM(), r0.BqC(), z, this.A07);
        }
        Context context2 = (Context) this.A01;
        boolean z2 = this.A06;
        AnonymousClass311 r02 = (AnonymousClass311) this.A02;
        C234432xr Alw = r02.Alw();
        AnonymousClass3TA Aly = r02.Aly();
        return new AnonymousClass3TC(context2, (FragmentActivity) this.A04, (UserSession) this.A05, Alw, Aly, (AnonymousClass2xS) this.A03, r02.BqC(), z2, this.A07);
    }
}
