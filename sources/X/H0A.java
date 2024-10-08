package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import com.instagram.save.api.SaveApiUtil;
import java.util.List;

public final class H0A extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PopularReelsCreatorViewerInsightsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass4DU A01 = C227942kP.A01("clips_viewer_insight_sheet", true, false);

    public final String getModuleName() {
        return "clips_viewer_insight_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        1Xj A02;
        List Asj;
        C46275DTe dTe;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("media_position");
        } else {
            i = -1;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("media_id")) != null && (A02 = DbX.A0d(this.A00).A02(string)) != null && (Asj = A02.A0C.Asj()) != null && (dTe = (C46275DTe) 00k.A0J(Asj)) != null) {
            PopularReelWithFollowersInsightMetadata Bdh = dTe.Bdh();
            Context context = view.getContext();
            DbT.A18(context, DbU.A0G(view, R.id.title), 2131969579);
            ViewGroup A0I = DbX.A0I(view, R.id.text_row_container);
            if (Bdh != null) {
                Context context2 = A0I.getContext();
                Resources resources = context2.getResources();
                if (Bdh.getPlayCount() > 0) {
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0I.addView(inflate);
                    DbU.A0F(inflate, R.id.icon).setImageResource(R.drawable.instagram_eye_pano_outline_24);
                    TextView A0G = DbU.A0G(inflate, R.id.text);
                    Integer valueOf = Integer.valueOf(Bdh.getPlayCount());
                    0qQ.A0A(resources);
                    DbX.A13(context2, A0G, C253673rC.A03(resources, valueOf), 2131957150);
                }
                if (Bdh.getLikeCount() > 0) {
                    View inflate2 = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0I.addView(inflate2);
                    DbU.A0F(inflate2, R.id.icon).setImageResource(R.drawable.instagram_heart_pano_outline_24);
                    TextView A0G2 = DbU.A0G(inflate2, R.id.text);
                    Integer valueOf2 = Integer.valueOf(Bdh.getLikeCount());
                    0qQ.A0A(resources);
                    DbX.A13(context2, A0G2, C253673rC.A03(resources, valueOf2), 2131957148);
                }
                if (Bdh.getReshareCount() > 0) {
                    View inflate3 = LayoutInflater.from(context2).inflate(R.layout.layout_popular_reels_creator_viewer_insight_text_row, (ViewGroup) null);
                    A0I.addView(inflate3);
                    DbU.A0F(inflate3, R.id.icon).setImageResource(R.drawable.instagram_direct_pano_outline_24);
                    TextView A0G3 = DbU.A0G(inflate3, R.id.text);
                    Integer valueOf3 = Integer.valueOf(Bdh.getReshareCount());
                    0qQ.A0A(resources);
                    DbX.A13(context2, A0G3, C253673rC.A03(resources, valueOf3), 2131957152);
                }
            }
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.subtitle);
            if (A0I.getChildCount() > 0) {
                DbT.A18(context, A0R, 2131969577);
            } else {
                DbT.A18(context, A0R, 2131969578);
                A0R.setGravity(17);
            }
            ((ViewStub) AnonymousClass7TF.A0F(view, R.id.divider)).inflate();
            C3021461u r5 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.action_buttons);
            if (Bdh != null && Bdh.BQJ() != null) {
                r5.setPrimaryAction(context.getString(2131969575), new ID0(35, (Object) context, (Object) Bdh, (Object) this));
                if (!A02.CbC()) {
                    r5.setSecondaryAction(context.getString(2131969576), new C56760IBj(i, 6, A02, this));
                }
            } else if (!A02.CbC()) {
                r5.setPrimaryAction(context.getString(2131969576), new C56760IBj(i, 7, A02, this));
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public static final void A00(1Xj r7, H0A h0a, int i) {
        Context context = h0a.getContext();
        if (context != null) {
            C243373Ym r6 = C243373Ym.SAVED;
            SaveApiUtil.A05(h0a.requireActivity(), context, AnonymousClass7TE.A0l(h0a.A00), r7, h0a.A01, r6, i);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1747897457);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_popular_reels_creator_viewer_insight_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1241899428, A02);
        return inflate;
    }
}
