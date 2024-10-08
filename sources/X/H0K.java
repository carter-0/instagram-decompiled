package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.save.api.SaveApiUtil;
import java.util.ArrayList;
import java.util.List;

public final class H0K extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorViewerInsightsRecipeSheetFragment";
    public RecyclerView A00;
    public C53077GiA A01;
    public final AnonymousClass4DU A02 = C227942kP.A01("ig_lumen_recipe_sheet", true, false);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "ig_lumen_recipe_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        List Bk8;
        C46307DUk dUk;
        String str;
        Long A0n;
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
            AnonymousClass0eM r2 = this.A03;
            1Xj A022 = DbX.A0d(r2).A02(string);
            if (A022 != null && (Bk8 = A022.A0C.Bk8()) != null && (dUk = (C46307DUk) 00k.A0O(Bk8, 0)) != null) {
                RecyclerView A0I = DbT.A0I(view, R.id.recipe_sheet_insights_recycler_view);
                this.A00 = A0I;
                if (A0I != null) {
                    DbU.A15(requireContext(), A0I, 1, false);
                    C53077GiA giA = this.A01;
                    if (giA == null) {
                        str = "insightsAdapter";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    A0I.setAdapter(giA);
                }
                C53077GiA giA2 = this.A01;
                str = "insightsAdapter";
                if (giA2 != null) {
                    List BwR = dUk.BwR();
                    0qQ.A0B(BwR, 0);
                    ArrayList arrayList = giA2.A04;
                    arrayList.clear();
                    arrayList.addAll(BwR);
                    giA2.notifyItemRangeChanged(0, BwR.size());
                    C53077GiA giA3 = this.A01;
                    if (giA3 != null) {
                        giA3.A00 = A022;
                        C3021461u r11 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.recipe_sheet_cta_layout);
                        List AhK = dUk.AhK();
                        CreatorViewerBottomCTA creatorViewerBottomCTA = (CreatorViewerBottomCTA) 00k.A0O(AhK, 0);
                        if (creatorViewerBottomCTA != null) {
                            r11.setPrimaryAction(A00(creatorViewerBottomCTA, A022), new ICY(i, 1, creatorViewerBottomCTA, dUk, A022, r11, this));
                        }
                        CreatorViewerBottomCTA creatorViewerBottomCTA2 = (CreatorViewerBottomCTA) 00k.A0O(AhK, 1);
                        if (creatorViewerBottomCTA2 != null) {
                            r11.setSecondaryAction(A00(creatorViewerBottomCTA2, A022), new ICY(i, 2, creatorViewerBottomCTA2, dUk, A022, r11, this));
                        }
                        0lg A0X = DbT.A0X(r2);
                        List<CreatorViewerSignalModel> BwR2 = dUk.BwR();
                        AnonymousClass7TF.A1C(A0X, 1, BwR2);
                        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, A0X), "ig_lumen_recipe_sheet_overflow_impression");
                        String A2n = A022.A2n();
                        if (A2n != null && (A0n = 00y.A0n(10, A2n)) != null && A0e.isSampled()) {
                            ArrayList A0p = AnonymousClass7TF.A0p(BwR2);
                            for (CreatorViewerSignalModel A0v : BwR2) {
                                C51974G9v.A0v(new 0bb(), A0v, A0p);
                            }
                            G9w.A1B(A0e, A0n, BwR2);
                            DbS.A1O(A0e, "ig_lumen_recipe_sheet");
                            DbS.A1G(A0e, "recipe_sheet");
                            C51972G9s.A14(A0e, A022);
                            A0e.AAe("recommendation_info", A0p);
                            DbX.A1L(A0e);
                            return;
                        }
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    private final String A00(CreatorViewerBottomCTA creatorViewerBottomCTA, 1Xj r6) {
        C243373Ym r3;
        if (r6.CbC()) {
            r3 = C243373Ym.NOT_SAVED;
        } else {
            r3 = C243373Ym.SAVED;
        }
        C243373Ym r2 = C243373Ym.NOT_SAVED;
        Context requireContext = requireContext();
        int i = 2131971374;
        if (r3 == r2) {
            i = 2131971377;
        }
        String A0p = C51967G9n.A0p(requireContext, i);
        if (creatorViewerBottomCTA.AhL() != CreatorViewerBottomCTAType.SAVE_CLIP) {
            return creatorViewerBottomCTA.getText();
        }
        return A0p;
    }

    public static final void A01(CreatorViewerBottomCTAType creatorViewerBottomCTAType, C46307DUk dUk, 1Xj r25, IgdsBottomButtonLayout igdsBottomButtonLayout, H0K h0k, int i, boolean z) {
        CreatorViewerBottomCTAType creatorViewerBottomCTAType2;
        List<CreatorViewerSignalModel> list;
        0lg r0;
        Long A0n;
        C243373Ym r5;
        int ordinal = creatorViewerBottomCTAType.ordinal();
        1Xj r9 = r25;
        H0K h0k2 = h0k;
        if (ordinal == 1) {
            28D r8 = 28D.A5J;
            FragmentActivity requireActivity = h0k2.requireActivity();
            AnonymousClass0eM r6 = h0k2.A03;
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            C267324bN A022 = C295375o3.A02(r9);
            C56044Hrt A04 = I7J.A04(r8, A022, AnonymousClass7TE.A0l(r6));
            r6.getValue();
            C56044Hrt A0C = C250563lf.A0C(r8);
            if (A04 == null) {
                A04 = A0C;
            }
            A04.A0V = A022.A0C();
            A04.A0W = A022.A0Q;
            A04.A0m = true;
            I3M.A00(requireActivity, A04.A00(), h0k2, r8, A0l);
            r0 = DbT.A0X(r6);
            list = dUk.BwR();
            creatorViewerBottomCTAType2 = CreatorViewerBottomCTAType.CREATE_CLIP;
        } else if (ordinal == 2) {
            if (r9.CbC()) {
                r5 = C243373Ym.NOT_SAVED;
            } else {
                r5 = C243373Ym.SAVED;
            }
            C243373Ym r4 = C243373Ym.SAVED;
            Context requireContext = h0k2.requireContext();
            int i2 = 2131971374;
            if (r5 == r4) {
                i2 = 2131971377;
            }
            String A0p = C51967G9n.A0p(requireContext, i2);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = igdsBottomButtonLayout;
            if (z) {
                igdsBottomButtonLayout2.setPrimaryActionText(A0p);
            } else {
                igdsBottomButtonLayout2.setSecondaryActionText(A0p);
            }
            AnonymousClass4DU r10 = h0k2.A02;
            FragmentActivity requireActivity2 = h0k2.requireActivity();
            AnonymousClass0eM r02 = h0k2.A03;
            int i3 = i;
            SaveApiUtil.A05(requireActivity2, h0k2.requireContext(), AnonymousClass7TE.A0l(r02), r9, r10, r5, i3);
            if (r5 == r4) {
                I56.A00(h0k2.requireActivity(), AnonymousClass7TE.A0l(r02), r9, r10, new AnonymousClass3W1(), (C249763kK) null, (String) null, "single_tap", i3, false);
                r0 = DbT.A0X(r02);
                list = dUk.BwR();
                creatorViewerBottomCTAType2 = CreatorViewerBottomCTAType.SAVE_CLIP;
            } else {
                return;
            }
        } else if (ordinal != 0) {
            throw AnonymousClass7TE.A1K();
        } else {
            return;
        }
        AnonymousClass7TF.A1C(r0, 1, list);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(h0k2, r0), "ig_lumen_recipe_sheet_overflow_button_tap");
        String A2n = r9.A2n();
        if (A2n != null && (A0n = 00y.A0n(10, A2n)) != null && A0e.isSampled()) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(list);
            for (CreatorViewerSignalModel A0v : list) {
                C51974G9v.A0v(new 0bb(), A0v, A0p2);
            }
            G9w.A1B(A0e, A0n, list);
            C51969G9p.A1A(A0e, h0k2);
            DbS.A1G(A0e, "recipe_sheet");
            C51972G9s.A14(A0e, r9);
            A0e.AAe("recommendation_info", A0p2);
            A0e.AAJ("button_text_enum", creatorViewerBottomCTAType2.toString());
            DbX.A1L(A0e);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1668971050);
        H0K.super.onCreate(bundle);
        this.A01 = new C53077GiA(this, AnonymousClass7TE.A0l(this.A03), this);
        AnonymousClass0fD.A09(-1750575941, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1032138264);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_creator_viewer_insights_recipe_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-819847387, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-422338544);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(747811578, A022);
    }
}
