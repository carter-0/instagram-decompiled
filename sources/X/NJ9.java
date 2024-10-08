package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public final class NJ9 extends AnonymousClass4DH implements AnonymousClass4DS, C317296n2 {
    public static final String __redex_internal_original_name = "DiscoverTrendingPromptsFragment";
    public long A00;
    public RecyclerView A01;
    public AnonymousClass2t9 A02;
    public 2el A03;
    public SpinnerImageView A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73660PhZ(this, 10));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73660PhZ(this, 11));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C73836PkZ.A00);
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73660PhZ(this, 12));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C73660PhZ(this, 16));
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C73660PhZ(this, 18));

    public final void DF1(BHW bhw, Reel reel, XC0 xc0, List list, int i) {
        0qQ.A0B(reel, 0);
        AnonymousClass32A r5 = (AnonymousClass32A) this.A08.getValue();
        r5.A05 = new C16165Upq((Activity) requireActivity(), xc0.Beu(), (C230222pE) null, AnonymousClass05K.A01);
        r5.A0C = DbS.A0t(this.A0A);
        r5.A03 = (ReelViewerConfig) AnonymousClass7TE.A14(this.A07);
        List list2 = list;
        r5.A06(reel, AnonymousClass3BQ.CONTEXT_SHEET_PROMPT, xc0, list2, list2, 0);
    }

    public final void Dac(BHW bhw, PromptStickerModel promptStickerModel, int i) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        0qQ.A0B(promptStickerModel, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C64135LPk.A00(activity, 28D.A0G, AnonymousClass7TE.A0l(this.A09), promptStickerModel);
            C70772OKs oKs = (C70772OKs) this.A06.getValue();
            long j = this.A00;
            Integer num = AnonymousClass05K.A0C;
            String str = promptStickerModel.A03;
            if (bhw != null) {
                storyTrendingPromptSubType = bhw.A00;
            } else {
                storyTrendingPromptSubType = null;
            }
            oKs.A00(storyTrendingPromptSubType, (C69406Nkk) this.A05.getValue(), num, str, promptStickerModel.A05(), "", i, j);
        }
    }

    public final void Dad(BHW bhw, PromptStickerModel promptStickerModel, int i) {
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        0qQ.A0B(promptStickerModel2, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A09);
            String A052 = promptStickerModel2.A05();
            String A0t = DbS.A0t(this.A0A);
            AnonymousClass0eM r3 = this.A0C;
            StoryTrendingPromptSubType storyTrendingPromptSubType = null;
            C64019LJg.A00(activity, 28D.A0G, this, A0l, (C255773uh) null, (C310016aI) null, (C317766nn) null, (C273384mU) null, promptStickerModel2, (C310416b1) null, A052, A0t, DbS.A0t(r3), 0sn.A00);
            C70772OKs oKs = (C70772OKs) this.A06.getValue();
            Integer num = AnonymousClass05K.A01;
            long j = this.A00;
            String str = promptStickerModel2.A03;
            BHW bhw2 = bhw;
            if (bhw != null) {
                storyTrendingPromptSubType = bhw2.A00;
            }
            oKs.A00(storyTrendingPromptSubType, (C69406Nkk) this.A05.getValue(), num, str, promptStickerModel2.A05(), DbS.A0t(r3), 0, j);
        }
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131960857);
        r5.Eu4(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_info_pano_outline_24;
        A0K.A0P = true;
        A0K.A02 = requireContext().getColor(2Yu.A07(getContext()));
        A0K.A05 = 2131964339;
        DbX.A19(new C71396Ojv(this, 1), A0K, r5);
    }

    public final String getModuleName() {
        return "discover_trending_prompts_fragment";
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v6, types: [X.JwI] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r3 = 0
            r7 = r19
            X.0qQ.A0B(r7, r3)
            r14 = r18
            r0 = r20
            super.onViewCreated(r7, r0)
            X.0eM r0 = r14.A06
            java.lang.Object r1 = r0.getValue()
            X.OKs r1 = (X.C70772OKs) r1
            X.0eM r0 = r14.A0C
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r4 = r14.A05
            java.lang.Object r6 = r4.getValue()
            java.lang.String r5 = X.DbS.A0k()
            if (r5 == 0) goto L_0x004d
            X.0eM r0 = r1.A02
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "igye_prompts_surface_appear"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.C51965G9l.A1K(r2, r5)
            java.lang.String r1 = ""
            java.lang.String r0 = "event_subtype"
            X.C66584MXp.A0w(r2, r0, r1, r8)
            if (r6 == 0) goto L_0x004a
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "entrypoint"
            r2.AAJ(r0, r1)
        L_0x004a:
            r2.Cgf()
        L_0x004d:
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r14.A04 = r0
            androidx.recyclerview.widget.RecyclerView r0 = X.DbX.A0K(r7)
            r14.A01 = r0
            X.0eM r0 = r14.A0B
            X.2YL r8 = X.DbS.A0H(r0)
            X.Nko r9 = X.C69409Nko.TRENDING_PROMPTS_SURFACE
            android.os.Bundle r1 = r14.requireArguments()
            r0 = 999(0x3e7, float:1.4E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x0080
            java.util.Map r0 = X.C69409Nko.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x007f
            r0 = r9
        L_0x007f:
            r9 = r0
        L_0x0080:
            android.os.Bundle r1 = r14.requireArguments()
            r0 = 3439(0xd6f, float:4.819E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r10 = r1.getString(r0)
            android.os.Bundle r1 = r14.requireArguments()
            java.lang.String r0 = "prompt_id"
            java.lang.String r5 = r1.getString(r0)
            r6 = 0
            if (r5 == 0) goto L_0x00df
            android.os.Bundle r1 = r14.requireArguments()
            java.lang.String r0 = "author_ids"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x00c4
            r0 = 1
            char[] r1 = new char[r0]
            r0 = 44
            r1[r3] = r0
            java.util.List r0 = X.00l.A0Q(r2, r1, r3)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c4
            X.JTS.A1V(r6, r1)
            goto L_0x00ba
        L_0x00c4:
            android.os.Bundle r1 = r14.requireArguments()
            java.lang.String r0 = "should_be_featured"
            boolean r2 = r1.getBoolean(r0)
            r1 = 1
            X.JwF r0 = new X.JwF
            r0.<init>((java.lang.String) r5, (boolean) r2, (java.util.List) r6, (int) r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 18
            X.JwI r6 = new X.JwI
            r6.<init>((java.util.List) r1, (int) r0)
        L_0x00df:
            java.lang.Object r7 = r4.getValue()
            X.6oS r0 = X.C318116oQ.A00(r8)
            r11 = 0
            r12 = 18
            X.MH7 r5 = new X.MH7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r5, r0)
            X.2ej r0 = X.C71682ef.A00()
            X.2el r5 = X.C71682ef.A01(r11, r0)
            r14.A03 = r5
            X.3DZ r4 = X.AnonymousClass3DZ.A00(r14)
            androidx.recyclerview.widget.RecyclerView r1 = r14.A01
            java.lang.String r6 = "recyclerView"
            if (r1 == 0) goto L_0x0169
            X.2eo[] r0 = new X.AnonymousClass2eo[r3]
            r5.A08(r1, r4, r0)
            androidx.recyclerview.widget.RecyclerView r5 = r14.A01
            if (r5 == 0) goto L_0x0169
            r4 = 2
            r1 = 1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager
            r0.<init>(r4, r1)
            r5.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r14.A01
            if (r1 == 0) goto L_0x0169
            X.MvT r0 = new X.MvT
            r0.<init>(r14, r4)
            r1.A11(r0)
            X.2tC r1 = X.DbV.A0S(r14)
            android.content.Context r13 = r14.requireContext()
            X.0eM r0 = r14.A09
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r0)
            X.NOc r12 = new X.NOc
            r16 = r14
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            r1.A01(r12)
            X.NNm r0 = new X.NNm
            r0.<init>()
            X.2t9 r1 = X.DbU.A0U(r1, r0)
            r14.A02 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r14.A01
            if (r0 == 0) goto L_0x0169
            r0.setAdapter(r1)
            X.07U r5 = X.07U.A05
            X.07Z r4 = r14.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r8 = 5
            X.MGh r3 = new X.MGh
            r6 = r14
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            X.1Eo.A05(r2, r3, r0)
            return
        L_0x0169:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ9.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void ChR(C68206N5v n5v) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        C70772OKs oKs = (C70772OKs) this.A06.getValue();
        long j = this.A00;
        int i = n5v.A00;
        String str = n5v.A01.A0M;
        BHW bhw = n5v.A02;
        if (bhw != null) {
            storyTrendingPromptSubType = bhw.A00;
        } else {
            storyTrendingPromptSubType = null;
        }
        String A0t = DbS.A0t(this.A0C);
        Object value = this.A05.getValue();
        0qQ.A0B(str, 2);
        String A0k = DbS.A0k();
        if (A0k != null) {
            0Aj A0e = AnonymousClass7TE.A0e((0wc) oKs.A02.getValue(), "igye_prompts_surface_component_impression");
            C51965G9l.A1K(A0e, A0k);
            A0e.A9F("component_position", DbV.A0p(A0e, "component_id", str, i));
            C66584MXp.A0w(A0e, "component_type", "story", A0t);
            A0e.A9F("num_media_loaded", Long.valueOf(j));
            A0e.AAJ("component_subtype", String.valueOf(storyTrendingPromptSubType));
            if (value != null) {
                A0e.AAJ("entrypoint", value.toString());
            }
            A0e.Cgf();
        }
    }

    public final void Dcu(View view, AnonymousClass30Y r3) {
        2el r0 = this.A03;
        if (r0 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A05(view, r3);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public NJ9() {
        C73660PhZ phZ = new C73660PhZ(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73660PhZ(new C73660PhZ(this, 13), 14));
        this.A0B = DbS.A0I(new C73660PhZ(A002, 15), phZ, new C73666Phf(29, (Object) null, A002), DbS.A0z(C60138JgJ.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1364266922);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_trending_prompts_fragment, false);
        AnonymousClass0fD.A09(410936131, A022);
        return A0D;
    }
}
