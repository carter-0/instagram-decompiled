package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

public final class UZX extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String A0G = 002.A0R(UZX.class.getName(), ".BACK_STACK");
    public static final String __redex_internal_original_name = "PromoteCampaignControlsFragment";
    public VRP A00;
    public SpinnerImageView A01;
    public String A02;
    public String A03;
    public String A04;
    public final X6L A05;
    public final X6L A06;
    public final List A07 = new ArrayList();
    public final AnonymousClass0eM A08 = C20694WxQ.A00(this, 42);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = C20694WxQ.A00(this, 45);
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final X6L A0E;
    public final 1wn A0F;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131970278);
    }

    public final String getModuleName() {
        return "promotion_campaign_controls";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        U8N u8n = (U8N) this.A0D.getValue();
        AnonymousClass9F1 r3 = AnonymousClass9F1.A00;
        CallerContext A012 = CallerContext.A01("PromoteCampaignControlsViewModel");
        0qQ.A0A(A012);
        ((AnonymousClass9F7) AnonymousClass9F3.A00(u8n.A01).A02.getValue()).AUs(new AnonymousClass9JK(A012, "ig_android_promote_ads_manager_ig_to_fb_campaign_controls", "ads_manager", C16678UzE.ADS_MANAGER.toString(), "campaign_controls"), r3, new WO2(u8n, 6));
        RecyclerView A0I = DbT.A0I(view, R.id.campaign_controls_recycler_view);
        Dba.A17(A0I, this.A0B);
        DbY.A16(this, A0I);
        this.A01 = DbX.A0k(view);
        A00();
        DbX.A0R(this.A0C).A01(this.A0F, WQ1.class);
    }

    public static final void A01(UZX uzx, String str, String str2) {
        C18662VwK vwK = (C18662VwK) uzx.A09.getValue();
        String str3 = uzx.A04;
        if (str3 == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        if (str2 == null) {
            str2 = "";
        }
        vwK.A07("campaign_controls", str, str3, str2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public UZX() {
        C20694WxQ wxQ = new C20694WxQ(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20694WxQ(new C20694WxQ(this, 46), 47));
        this.A0D = new C227862kA(new C20694WxQ(A002, 48), wxQ, new C41566AwY(20, (Object) null, A002), new 0Yh(U8N.class));
        this.A09 = C20694WxQ.A00(this, 43);
        this.A0A = AnonymousClass1YB.A00(new C20694WxQ(this, 44));
        this.A0F = new C19221WQb(this, 13);
        this.A06 = new WO4(this, 4);
        this.A05 = new WO4(this, 2);
        this.A0E = new WO4(this, 3);
        this.A0C = C227642jf.A02(this);
    }

    private final void A00() {
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C18676VwZ.A01(requireActivity, this.A0E, A0l, str);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1685505989);
        UZX.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id");
        if (string != null) {
            this.A04 = string;
            String string2 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (string2 != null) {
                this.A03 = string2;
                if (requireArguments.getString("page_id") != null) {
                    this.A02 = requireArguments.getString("boosted_id");
                    AnonymousClass0fD.A09(-512891228, A022);
                    return;
                }
                throw new IllegalStateException("pageId cannot be null");
            }
            throw new IllegalStateException("entryPoint cannot be null");
        }
        throw new IllegalStateException("mediaId cannot be null");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(11849089);
        0qQ.A0B(layoutInflater, 0);
        C18662VwK vwK = (C18662VwK) this.A09.getValue();
        String str = this.A04;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A03("campaign_controls", str);
        View inflate = layoutInflater.inflate(R.layout.promotion_campaign_controls_view, viewGroup, false);
        AnonymousClass0fD.A09(-630471027, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1392589226);
        super.onDestroy();
        DbX.A0R(this.A0C).A02(this.A0F, WQ1.class);
        AnonymousClass0fD.A09(-213705183, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-626468886);
        super.onResume();
        List list = this.A07;
        if (AnonymousClass7TE.A1b(list)) {
            list.clear();
            UAF.A00(this, list);
            A00();
        }
        AnonymousClass0fD.A09(-1951277629, A022);
    }
}
