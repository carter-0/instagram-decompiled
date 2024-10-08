package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.List;

/* renamed from: X.Gzh  reason: case insensitive filesystem */
public final class C54112Gzh extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TrendingAudioCreatorViewerInsightsFragment";
    public IgdsBottomButtonLayout A00;
    public final AnonymousClass4DU A01 = C227942kP.A01("ig_lumen_recipe_sheet", true, false);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "ig_lumen_recipe_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        boolean z;
        String str;
        C243373Ym r3;
        C46275DTe dTe;
        Long A10;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("media_position");
        } else {
            i = -1;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("media_id")) != null) {
            AnonymousClass0eM r6 = this.A02;
            1Xj A022 = DbX.A0d(r6).A02(string);
            if (A022 != null) {
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    z = bundle4.getBoolean("is_audio_trending");
                } else {
                    z = false;
                }
                Bundle bundle5 = this.mArguments;
                ImageUrl imageUrl = null;
                if (bundle5 != null) {
                    str = bundle5.getString("audio_metadata_text");
                } else {
                    str = null;
                }
                Context context = view.getContext();
                view.requireViewById(R.id.trending_badge).setVisibility(DbW.A01(z ? 1 : 0));
                DbU.A0G(view, R.id.metadata).setText(str);
                DbT.A18(context, DbU.A0G(view, R.id.subtitle), 2131975526);
                Bundle bundle6 = this.mArguments;
                if (bundle6 != null) {
                    imageUrl = (ImageUrl) bundle6.getParcelable("audio_image_url");
                }
                IgImageView A0b = DbX.A0b(view, R.id.image);
                if (imageUrl != null) {
                    A0b.setUrl(imageUrl, this);
                    A0b.setVisibility(0);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_buttons);
                this.A00 = igdsBottomButtonLayout;
                if (igdsBottomButtonLayout == null) {
                    0qQ.A0F("bottomButtons");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (A022.CbC()) {
                    r3 = C243373Ym.NOT_SAVED;
                } else {
                    r3 = C243373Ym.SAVED;
                }
                C243373Ym r2 = C243373Ym.NOT_SAVED;
                Context requireContext = requireContext();
                int i2 = 2131971374;
                if (r3 == r2) {
                    i2 = 2131971377;
                }
                igdsBottomButtonLayout.setPrimaryAction(requireContext.getString(i2), new C56760IBj(i, 11, A022, this));
                List Asj = A022.A0C.Asj();
                if (Asj != null && (dTe = (C46275DTe) 00k.A0J(Asj)) != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, DbT.A0X(r6), 1), "ig_lumen_recipe_sheet_overflow_impression");
                    String A2n = A022.A2n();
                    if (A2n != null && (A10 = AnonymousClass7TE.A10(A2n)) != null && A0e.isSampled()) {
                        List A0m = G9w.A0m(A0e, new 0bb(), dTe, A10);
                        DbS.A1O(A0e, "ig_lumen_recipe_sheet");
                        DbS.A1G(A0e, "recipe_sheet");
                        C51972G9s.A14(A0e, A022);
                        A0e.AAe("recommendation_info", A0m);
                        DbX.A1L(A0e);
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(186273852);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_trending_audio_creator_viewer_insight_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1348090818, A022);
        return inflate;
    }
}
