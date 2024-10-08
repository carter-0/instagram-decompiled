package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lnf  reason: case insensitive filesystem */
public final class C65117Lnf implements C66476MTe {
    public final /* synthetic */ C293505kq A00;
    public final /* synthetic */ K66 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C65117Lnf(C293505kq r1, K66 k66, String str, String str2, boolean z) {
        this.A01 = k66;
        this.A04 = z;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void DWa() {
        C59689JTv.A0B(this.A01.getActivity(), "pending_media_prepare_failed_share_button_clicked");
    }

    public final void DWb() {
        K66 k66 = this.A01;
        boolean z = this.A04;
        C293505kq r5 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        AnonymousClass0eM r4 = k66.A0T;
        1Av A002 = 1Au.A00(AnonymousClass7TE.A0l(r4));
        if (AnonymousClass7TG.A1a(A002, A002.A0F, 1Av.A8a, 131)) {
            K66.A0H(k66);
        }
        AnonymousClass3Q2 A022 = C61829KNs.A02(k66);
        Long l = null;
        if (A022 == null) {
            0kD.A07(K66.__redex_internal_original_name, "pending media is null in onPendingMediaPreparedToShare", (Throwable) null);
            return;
        }
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        FragmentActivity requireActivity = k66.requireActivity();
        C279584ys r0 = r5.A08;
        if (r0 != null) {
            l = Long.valueOf(r0.A00);
        }
        C63103KrW.A00(requireActivity, A0l, A022, str, String.valueOf(l), new MJI(r5, k66, str, str2, 2, z), z);
    }
}
