package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IXh  reason: case insensitive filesystem */
public final class C57324IXh implements X71 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ C331157Pu A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C57324IXh(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, C331157Pu r5, String str, boolean z) {
        this.A04 = r5;
        this.A06 = z;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A05 = str;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void FLW(AnonymousClass4DU r11, String str, int i) {
        if (this.A06) {
            C331157Pu r2 = this.A04;
            FragmentActivity fragmentActivity = this.A00;
            Integer valueOf = Integer.valueOf(i);
            UserSession userSession = this.A01;
            String str2 = this.A05;
            r2.A0K(C55149Hcx.A00(fragmentActivity, new FOD(userSession, this.A02, fragmentActivity, this.A03, str2, 5), valueOf), true);
        }
    }

    public final void FLy(String str) {
        this.A04.A0M(str);
    }
}
