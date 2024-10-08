package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.OjW  reason: case insensitive filesystem */
public final class C71373OjW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    public C71373OjW(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj2;
        this.A03 = obj;
        this.A04 = obj6;
        this.A05 = obj5;
        this.A02 = obj3;
        this.A07 = z;
    }

    public final void onClick(View view) {
        int A052;
        String str;
        int i;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(2021932218);
            View view2 = view;
            if (!this.A07) {
                C296905qq r1 = (C296905qq) this.A04;
                ((OJ1) this.A02).A00(view2, (C296995qz) this.A03, r1, (1Xj) this.A05);
                i = 1071166815;
            } else {
                UserSession userSession = (UserSession) this.A06;
                AnonymousClass0iw r3 = (AnonymousClass0iw) this.A01;
                OJ1 oj1 = (OJ1) this.A02;
                1Xj r11 = (1Xj) this.A05;
                C296905qq r10 = (C296905qq) this.A04;
                C296995qz r9 = (C296995qz) this.A03;
                C51974G9v.A1K(view2, userSession, oj1);
                Context context = view2.getContext();
                if (ORX.A01(userSession)) {
                    ORX.A00(context, userSession, new PS0(view2, r9, r10, oj1, r11));
                } else {
                    Integer num = AnonymousClass05K.A0Y;
                    if (C70349O3b.A00(userSession, num)) {
                        1Av A002 = 1Au.A00(userSession);
                        int i2 = A002.A01.getInt("zero_rating_explore_video_nux_count", 0);
                        C49256Erz.A00(context, new C50108FOy((Object) oj1, (Object) r9, (Object) r10, (Object) r11, (Object) A002, (Object) view2, i2, 1), AnonymousClass1Qz.A00(userSession).C82(), r3, (ImageUrl) null, (Boolean) null, num);
                    } else {
                        oj1.A00(view2, r9, r10, r11);
                    }
                }
                i = 597109913;
            }
        } else {
            A052 = AnonymousClass0fD.A05(-1578887660);
            UserSession userSession2 = (UserSession) this.A06;
            2Er r4 = (2Er) this.A04;
            AnonymousClass0iw r32 = (AnonymousClass0iw) this.A02;
            OPL.A01((View) this.A03, (C314466iJ) this.A05);
            C48732EjH.A00().A01((FragmentActivity) this.A01, userSession2, "direct_inbox_outcome_upsell");
            C48805EkT.A00(r32, userSession2, "thread_ctd_upsell_launch_boost_flow", r4.C6C());
            String C6C = r4.C6C();
            if (this.A07) {
                str = "thread_ctd_upsell_single_create_messaging_ads_banner_create_ad_click";
            } else {
                str = "thread_ctd_upsell_second_banner_create_ad_click";
            }
            C48805EkT.A00(r32, userSession2, str, C6C);
            i = -1726854477;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
