package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E1t  reason: case insensitive filesystem */
public final class C47425E1t extends AnonymousClass4DH {
    public static final FV2 A06 = new Object();
    public static final String __redex_internal_original_name = "RecommendToFacebookOptimizedUpsellFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public IgdsHeadline A02;
    public FBQ A03;
    public C62320sa A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbZ.A0U(requireView(), R.id.headline);
        View A0G = AnonymousClass7TF.A0G(requireView(), R.id.custom_button_container);
        A0G.setVisibility(0);
        TextView A0R = AnonymousClass7TG.A0R(A0G, R.id.bb_primary_action);
        View A0F = AnonymousClass7TF.A0F(A0G, R.id.bb_primary_action_container);
        View A0F2 = AnonymousClass7TF.A0F(A0G, R.id.bb_secondary_action);
        TextView A0R2 = AnonymousClass7TG.A0R(A0G, R.id.footer_above_action);
        A0F2.setVisibility(8);
        TextView A0G2 = DbU.A0G(A0G, R.id.bb_secondary_action_grey);
        A0G2.setVisibility(0);
        FP5.A01(A0F, 59, this);
        Context requireContext = requireContext();
        FBQ fbq = this.A03;
        String str = "params";
        String str2 = str;
        if (fbq != null) {
            boolean A012 = fbq.A01();
            int i = 2131955668;
            if (A012) {
                i = 2131955670;
            }
            A0R.setText(AnonymousClass7TE.A16(requireContext, i));
            FP5.A01(A0G2, 60, this);
            Context requireContext2 = requireContext();
            FBQ fbq2 = this.A03;
            if (fbq2 != null) {
                boolean A013 = fbq2.A01();
                int i2 = 2131955671;
                if (A013) {
                    i2 = 2131955669;
                }
                A0G2.setText(AnonymousClass7TE.A16(requireContext2, i2));
                Resources A052 = DbV.A05(this);
                0qQ.A07(A052);
                String A0m = DbU.A0m(this, 2131971831);
                SpannableStringBuilder A0B = Dbb.A0B(A052, A0m, 2131971879);
                AnonymousClass7AV.A05(A0B, new C46679Dj8(this, 4), A0m);
                A0R2.setText(A0B);
                IgdsHeadline igdsHeadline = this.A02;
                str = "headlineView";
                if (igdsHeadline != null) {
                    igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_reels_distribution_refresh);
                    IgdsHeadline igdsHeadline2 = this.A02;
                    if (igdsHeadline2 != null) {
                        igdsHeadline2.setHeadline(2131955676);
                        0eP A0x = AnonymousClass7TF.A0x(getString(2131955672), R.drawable.instagram_facebook_circle_pano_outline_24);
                        0eE r0 = AnonymousClass0t1.A01;
                        AnonymousClass0eM r5 = this.A05;
                        List<0eP> A1P = 0sr.A1P(new 0eP[]{A0x, AnonymousClass7TF.A0x(DbV.A0z(this, DbX.A0l(r0, r5).getUsername(), 2131955673), R.drawable.instagram_user_circle_pano_outline_24), AnonymousClass7TF.A0x(getString(2131955674), R.drawable.instagram_circle_play_pano_outline_24)});
                        IgdsHeadline igdsHeadline3 = this.A02;
                        if (igdsHeadline3 != null) {
                            FGX fgx = new FGX(requireContext(), (Boolean) true, 4);
                            for (0eP r02 : A1P) {
                                fgx.A05((CharSequence) null, (CharSequence) r02.A00, AnonymousClass7TE.A0M(r02.A01));
                            }
                            List<IgdsBulletCell> A042 = fgx.A04();
                            ArrayList A0r = AnonymousClass7TG.A0r(A042);
                            for (IgdsBulletCell igdsBulletCell : A042) {
                                igdsBulletCell.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
                                A0r.add(igdsBulletCell);
                            }
                            igdsHeadline3.setBulletList(A0r);
                            UserSession A0l = AnonymousClass7TE.A0l(r5);
                            FBQ fbq3 = this.A03;
                            if (fbq3 == null) {
                                0qQ.A0F(str2);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C49887FBn A014 = C49797F7i.A01(A0l, fbq3.A00);
                            if (A014 != null) {
                                A014.A00();
                            }
                            C62320sa r03 = this.A04;
                            if (r03 != null) {
                                r03.invoke();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "recommend_to_facebook_optimization_upsell";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1629672347);
        C47425E1t.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        FBQ fbq = new FBQ(AnonymousClass818.valueOf(C320236s2.A01(requireArguments, "ARG_UPSELL_ENTRY_POINT")), AnonymousClass819.valueOf(C320236s2.A01(requireArguments, "ARG_UPSELL_VARIANT")), C59793JYm.valueOf(C320236s2.A01(requireArguments, "ARG_MEDIA_SOURCE_TYPE")), requireArguments.getString("ARG_WATERFALL_ID"), requireArguments.getString("ARG_MODULE_NAME"), requireArguments.getString("ARG_DESIGN_VARIANT"), (String) null, requireArguments.getInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY"));
        this.A03 = fbq;
        String str = fbq.A04;
        if (str != null) {
            C48093EVl.A01.get(str);
        }
        AnonymousClass0fD.A09(2005912866, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(503791938);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(153723613, A022);
        return inflate;
    }
}
