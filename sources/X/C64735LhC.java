package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LhC  reason: case insensitive filesystem */
public final class C64735LhC implements 1DN {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ AnonymousClass3W1 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C64735LhC(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, AnonymousClass3W1 r5, String str, String str2, boolean z) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = z;
    }

    public final void DWm(Map map) {
        0qQ.A0B(map, 0);
        C346927vz r0 = (C346927vz) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 0) {
                LTW ltw = LTW.A00;
                LTW.A05(this.A00, this.A01, this.A02, this.A03, this.A04, ltw, this.A05, this.A06, this.A07);
            } else if (ordinal == 1 || ordinal == 2) {
                C59689JTv.A01(this.A00, AnonymousClass000.A00(3908), 2131972530, 1);
            }
        }
    }
}
