package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.graphql.IGDirectDismissMessageSuggestionMutationResponseImpl;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MjI  reason: case insensitive filesystem */
public final class C67160MjI implements C294875nB {
    public final /* synthetic */ C66633Ma2 A00;

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final void D8N(DirectShareTarget directShareTarget) {
    }

    public final void D9P(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        0qQ.A0B(directShareTarget2, 0);
        C66633Ma2 ma2 = this.A00;
        17i A002 = 17h.A00(ma2.A0p());
        User user = (User) A002.A02.get(directShareTarget2.A0A());
        if (user != null) {
            UserSession A0p = ma2.A0p();
            String id = user.getId();
            0qQ.A0B(A0p, 0);
            1vn A01 = 1vm.A01(A0p);
            2IS A04 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, id, "target_id"), A04, "data"), "IGDirectDismissMessageSuggestionMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGDirectDismissMessageSuggestionMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_async_message_suggestion_dismiss", AnonymousClass7TE.A1C());
            A01.ATL(C71566On1.A00, C71578OnF.A00, pandoGraphQLRequest);
            C66736Mbh A0U = C66581MXm.A0U(ma2);
            C67141Miz miz = A0U.A0E;
            ArrayList A0U2 = 00k.A0U(miz.A0N);
            A0U2.removeIf(new C73453Pcv(new C73934PmE(user, 34), 2));
            miz.A0N = A0U2;
            C66736Mbh.A03(A0U);
        }
    }

    public final void Dk6(C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        String str2 = str;
        DirectSearchResult directSearchResult2 = directSearchResult;
        AnonymousClass7TG.A1R(directSearchResult, str);
        if (directSearchResult instanceof DirectShareTarget) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult2;
            DirectThreadKey A002 = directShareTarget.A00();
            C66633Ma2 ma2 = this.A00;
            if (!((C46483Dfm) ma2.A2S.getValue()).A00(ma2.A1J, new PFY(mhZ, ma2, directShareTarget, A002, str2), A002, str)) {
                C66633Ma2.A0F(mhZ, ma2, directShareTarget, A002, str);
            }
        }
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        0qQ.A0B(directShareTarget2, 0);
        RectF rectF2 = rectF;
        String str2 = str;
        List list2 = list;
        C51974G9v.A1L(str2, list2, rectF2);
        View view2 = view;
        C67058MhZ mhZ2 = mhZ;
        AnonymousClass7TF.A1E(mhZ2, 5, view2);
        C254743sy A02 = directShareTarget2.A02();
        if (A02 != null) {
            C66633Ma2 ma2 = this.A00;
            C67484Moe.A00(rectF2, view2, mhZ2, (C67484Moe) ma2.A26.getValue(), (C74396PuC) null, ma2.A0t(), (AnonymousClass2Ep) null, directShareTarget2, A02, str2, (String) null, list2, z, z2);
        }
    }

    public final void DpD(View view) {
    }

    public C67160MjI(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        0wb.A01.Ew0("DirectInboxPresenter", "Story ring should not be accessible here.");
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        AnonymousClass7TG.A1N(directSearchResult, str);
        0qQ.A0B(view, 6);
        if (directSearchResult instanceof DirectShareTarget) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
            String str2 = null;
            if (str.equals("inbox_suggestion")) {
                C66633Ma2 ma2 = this.A00;
                if (ma2.A1Y.add(directShareTarget)) {
                    if (0qQ.A0K(ma2.A0s(), AnonymousClass2EX.A00) || directShareTarget.A01 == 29) {
                        C290645fe r1 = ma2.A0K;
                        if (r1 != null) {
                            str2 = r1.A03("direct_ibc_inbox_discovery");
                        }
                        OPT.A01(ma2).A0A(directShareTarget, str2, str, i3);
                        C66633Ma2.A0D(view, this.A00);
                    }
                    UserSession A0p = ma2.A0p();
                    AnonymousClass4DH r0 = ma2.A1J;
                    0qQ.A0B(A0p, 0);
                    1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, A0p), "direct_suggested_recipient_impression"), 148);
                    r2.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT");
                    r2.A00.A9O("e_counter_channel", "");
                    Long A0j = DbS.A0j(i2);
                    r2.A0Q("relative_position", A0j);
                    r2.A0Q("position", A0j);
                    List A0m = DbW.A0m(directShareTarget);
                    ArrayList A0r = AnonymousClass7TG.A0r(A0m);
                    Iterator it = A0m.iterator();
                    while (it.hasNext()) {
                        A0r.add(C263944Ny.A00(C66580MXl.A0k(it).getId()).A00);
                    }
                    r2.A0S("recipient_ids", A0r);
                    r2.A0R("section_type", "suggested");
                    r2.A0O(C273654mx.A00(784), false);
                    r2.A0R("inventory_source", (String) null);
                    if (DbT.A14(directShareTarget).size() == 1) {
                        r2.A0Q("a_pk", C263944Ny.A00(DbY.A0W(directShareTarget, 0).getId()).A00);
                    }
                    C254783t2 A0c = DbS.A0c(directShareTarget);
                    if (A0c instanceof C254763t0) {
                        r2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((C254763t0) A0c).A00);
                    }
                    r2.Cgf();
                    C66633Ma2.A0D(view, this.A00);
                }
            }
            if (str.equals("inbox_channel_invitation")) {
                C66633Ma2 ma22 = this.A00;
                if (ma22.A1Y.add(directShareTarget)) {
                    OPT.A01(ma22).A0A(directShareTarget, (String) null, str, i4);
                }
            }
            C66633Ma2.A0D(view, this.A00);
        }
    }

    public final void DpC(RectF rectF, 28D r4, DirectShareTarget directShareTarget) {
        AnonymousClass7TG.A1T(directShareTarget, rectF, r4);
        C254743sy A02 = directShareTarget.A02();
        if (A02 != null) {
            C66633Ma2.A09(rectF, r4, this.A00, directShareTarget, A02);
        }
    }
}
