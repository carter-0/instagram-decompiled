package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.io.Serializable;

public final class E3P extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChannelsEducationFragment";
    public C254793t3 A00;
    public String A01 = "thread_view";
    public RecyclerView A02;
    public AnonymousClass2t9 A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C41655Ay7(this, 5));
    public final String A06 = "channels_education";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131955023);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C254793t3 r1;
        String str;
        Serializable serializable;
        AnonymousClass3U9 r2;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str6;
        String C6C;
        String C6k;
        int AdN;
        C62320sa phd;
        int i9;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        Bundle bundle2 = this.mArguments;
        String str7 = null;
        if (bundle2 != null) {
            r1 = OXL.A00(bundle2, "channel_education_thread_id");
        } else {
            r1 = null;
        }
        this.A00 = r1;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (str = bundle3.getString("channel_education_entrypoint")) == null) {
            str = "thread_view";
        }
        this.A01 = str;
        RecyclerView A0K = DbX.A0K(view2);
        this.A02 = A0K;
        if (A0K != null) {
            DbU.A15(requireContext, A0K, 1, false);
            AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireContext);
            AnonymousClass0eM r11 = this.A04;
            A002.A01(new C15820Uj3(AnonymousClass7TE.A0l(r11), requireContext));
            A002.A01(new C47781EGs(requireContext));
            AnonymousClass2t9 A0U = DbU.A0U(A002, new EH4(AnonymousClass7TE.A0l(r11), requireContext));
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                serializable = bundle4.getSerializable("channel_education_type");
            } else {
                serializable = null;
            }
            0qQ.A0C(serializable, C66579MXk.A00(998));
            ViewModelListUpdate A0R = DbS.A0R();
            C254793t3 r4 = this.A00;
            String str8 = null;
            if (r4 != null) {
                r2 = ((2Dm) this.A05.getValue()).B33(C66647MaG.A03(C300965yF.A05(r4)));
            } else {
                r2 = null;
            }
            FY2 fy2 = new FY2(0sr.A1P(new N4H[]{new N4H((Integer) 2131955012, (int) R.drawable.instagram_group_pano_outline_24, 2131955013), new N4H((Integer) 2131955014, (int) R.drawable.instagram_heart_pano_outline_24, 2131955015), new N4H(2131955017, 2131955016, "https://help.instagram.com/495982749203769", R.drawable.instagram_shield_pano_outline_24, 2131955018, 0)}));
            String str9 = this.A01;
            if (r2 != null) {
                str2 = r2.C6C();
                str7 = r2.C6k();
                i = r2.AdN();
            } else {
                str2 = null;
                i = 0;
            }
            C19273WSg wSg = new C19273WSg(2131955020, 2131955021, 2131955019, C66579MXk.A00(1123), str9, str2, str7, new C41655Ay7(this, 1), R.drawable.instagram_illustrations_product_illustration_pi_plus_message_frequently, 2131955022, i);
            String str10 = this.A01;
            if (r2 != null) {
                str3 = r2.C6C();
                str4 = r2.C6k();
                i2 = r2.AdN();
            } else {
                str3 = null;
                str4 = null;
                i2 = 0;
            }
            C19273WSg wSg2 = new C19273WSg(2131955031, 2131955032, 2131955030, C273654mx.A00(428), str10, str3, str4, new C41655Ay7(this, 2), R.drawable.instagram_illustrations_product_illustration_pi_plus_send_content, 2131955033, i2);
            String str11 = this.A01;
            if (r2 != null) {
                str5 = r2.C6C();
                str8 = r2.C6k();
                i3 = r2.AdN();
            } else {
                str5 = null;
                i3 = 0;
            }
            A0R.A01(0sr.A1P(new C232262tL[]{fy2, wSg, wSg2, new C19273WSg(2131955009, 2131955010, 2131955008, AnonymousClass000.A00(1236), str11, str5, str8, new C41655Ay7(this, 3), R.drawable.instagram_illustrations_product_illustration_pi_plus_interact_with_members, 2131955011, i3)}));
            if (r2 != null) {
                C254703su BLN = ((2Dm) this.A05.getValue()).BLN(r2.BJz());
                if (BLN != null) {
                    if (AnonymousClass7FO.A01(AnonymousClass7TE.A0l(r11), BLN, Integer.valueOf(r2.AdN()), r2.BRZ(), r2.C6a(), r2.COP())) {
                        i4 = R.drawable.instagram_illustrations_product_illustration_pi_plus_share_your_channel;
                        i5 = 2131955028;
                        i6 = 2131955026;
                        i7 = 2131955027;
                        i8 = 2131955024;
                        str6 = this.A01;
                        C6C = r2.C6C();
                        C6k = r2.C6k();
                        AdN = r2.AdN();
                        phd = new C41655Ay7(this, 4);
                        i9 = 1808;
                        A0R.A00(new C19273WSg(i6, i7, i8, AnonymousClass000.A00(i9), str6, C6C, C6k, phd, i4, i5, AdN));
                    }
                }
                i4 = R.drawable.instagram_illustrations_product_illustration_pi_plus_share_your_channel;
                i5 = 2131955028;
                i6 = 2131955026;
                i7 = 2131955027;
                i8 = 2131955025;
                str6 = this.A01;
                C6C = r2.C6C();
                C6k = r2.C6k();
                AdN = r2.AdN();
                phd = new C73664Phd(31, this, r2);
                i9 = 1536;
                A0R.A00(new C19273WSg(i6, i7, i8, AnonymousClass000.A00(i9), str6, C6C, C6k, phd, i4, i5, AdN));
            }
            A0U.A05(A0R);
            this.A03 = A0U;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(A0U);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public static final void A00(C69251NiD niD, E3P e3p) {
        DbX.A0N(e3p.requireActivity(), e3p.A04).A0G((String) null, 1);
        if (niD != null) {
            AnonymousClass7TF.A0D().postDelayed(new C73181PYL(niD, e3p), 150);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1450529509);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.channel_education_container, viewGroup, false);
        AnonymousClass0fD.A09(-1625373562, A022);
        return inflate;
    }
}
