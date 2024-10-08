package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.IVl  reason: case insensitive filesystem */
public final class C57276IVl implements MVB {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57276IVl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C310336ap r1, Object obj, int i) {
        r1.A0A = new C57276IVl(obj, i);
    }

    public final void onButtonClick(View view) {
        UserSession userSession;
        String str;
        AnonymousClass4DU r4;
        1Xj r1;
        int i;
        String str2;
        switch (this.A00) {
            case 0:
                ((C7580QKv) this.A01).A05();
                return;
            case 2:
                H0G.A00((H0G) this.A01);
                return;
            case 5:
                DbS.A1U(this.A01);
                return;
            case 6:
                C14076TpQ tpQ = (C14076TpQ) this.A01;
                C51975G9x.A18(AnonymousClass7TE.A0e(tpQ.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                tpQ.DkU();
                return;
            case 7:
                C55489HiX hiX = ((AnonymousClass2uE) this.A01).A08;
                if (hiX != null) {
                    AnonymousClass32L r2 = hiX.A00;
                    GX8 gx8 = r2.A08;
                    if (gx8 == null) {
                        str2 = "exploreMultiHideLogger";
                    } else {
                        C51975G9x.A18(AnonymousClass7TE.A0e(gx8.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                        JSr jSr = r2.A0B;
                        if (jSr == null) {
                            str2 = "headerController";
                        } else {
                            jSr.DkU();
                            return;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            case 8:
                1Y8 A002 = C55115HcO.A00();
                C54245H4o h4o = (C54245H4o) this.A01;
                C56561I1p i1p = (C56561I1p) h4o.A02;
                FragmentActivity fragmentActivity = i1p.A00;
                userSession = i1p.A02;
                str = i1p.A04;
                r4 = i1p.A03;
                r4.getClass();
                A002.A07(fragmentActivity, userSession, str, r4.getModuleName());
                r1 = (1Xj) h4o.A03;
                i = h4o.A01;
                break;
            case 9:
                H4V h4v = (H4V) this.A01;
                SavedCollection savedCollection = (SavedCollection) h4v.A02;
                if (savedCollection.A07 == C54665HMw.PRODUCT_AUTO_COLLECTION) {
                    1Y8 A003 = C55115HcO.A00();
                    C56561I1p i1p2 = (C56561I1p) h4v.A01;
                    FragmentActivity fragmentActivity2 = i1p2.A00;
                    userSession = i1p2.A02;
                    str = i1p2.A04;
                    r4 = i1p2.A03;
                    r4.getClass();
                    A003.A07(fragmentActivity2, userSession, str, r4.getModuleName());
                    r1 = (1Xj) h4v.A03;
                    i = AnonymousClass7TE.A0M(h4v.A04);
                    break;
                } else {
                    C56561I1p i1p3 = (C56561I1p) h4v.A01;
                    FragmentActivity fragmentActivity3 = i1p3.A00;
                    UserSession userSession2 = i1p3.A02;
                    C309516Yo A0M = DbS.A0M(fragmentActivity3, userSession2);
                    C55115HcO.A00();
                    String str3 = userSession2.A05;
                    HMH hmh = HMH.COLLECTION_FEED;
                    AnonymousClass4DU r0 = i1p3.A03;
                    r0.getClass();
                    A0M.A0E(C56344Hwv.A00(hmh, savedCollection, (HMV) null, str3, r0.getModuleName()));
                    A0M.A0C = "DELETE_COLLECTION_BACK_STACK_NAME";
                    A0M.A0A = "DELETE_COLLECTION_BACK_STACK_NAME";
                    A0M.A04();
                    return;
                }
            case 10:
                H4U h4u = (H4U) this.A01;
                C56669I6y.A00((Context) h4u.A02, (AnonymousClass0iw) h4u.A01, (UserSession) h4u.A07, (SavedCollection) h4u.A03, (SavedCollection) h4u.A06, (Runnable) h4u.A05, (List) h4u.A04);
                return;
            case 11:
                1Y8 A004 = C55115HcO.A00();
                H0T h0t = (H0T) this.A01;
                A004.A05(h0t.requireActivity(), AnonymousClass7TE.A0l(h0t.A05));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                1Av r42 = ((HJZ) this.A01).A0A;
                AnonymousClass7TF.A1J(r42, r42.A7I, 1Av.A8a, 271, true);
                return;
            case 13:
                C54376HAr.A03((C54376HAr) this.A01, false);
                return;
            default:
                return;
        }
        I7Q.A05(userSession, r1, r4, str, i);
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        String str;
        C56561I1p i1p;
        UserSession userSession;
        AnonymousClass4DU r4;
        1Xj r3;
        int i;
        switch (this.A00) {
            case 0:
                C7580QKv qKv = (C7580QKv) this.A01;
                S5W s5w = qKv.A0a;
                Bundle A02 = qKv.A02();
                Integer num = qKv.A0b.A00.A08.A00;
                RRP A002 = s5w.A00("DISPLAYED_AUTOSAVE_TOAST", false);
                if (num != null) {
                    if (1 - num.intValue() != 0) {
                        str = "Update";
                    } else {
                        str = "Overwrite";
                    }
                    A002.A01("save_type", str);
                }
                SRY.A00().A07(A02, A002.A00().A01());
                return;
            case 1:
                C52369GPq.A01(C54688HOt.A0V, ((CreatorAIAgentCreationRepository) this.A01).A03);
                return;
            case 3:
                C52369GPq gPq = ((C53030GhL) this.A01).A05;
                C52369GPq.A02(C54688HOt.A0G, gPq, gPq.A00);
                return;
            case 4:
                0xY A0p = AnonymousClass7TE.A0p((1Av) ((C54151H0v) this.A01).A08.getValue());
                A0p.E5T("creator_inspiration_hub_toast_impression", true);
                A0p.apply();
                return;
            case 8:
                C54245H4o h4o = (C54245H4o) this.A01;
                i1p = (C56561I1p) h4o.A02;
                userSession = i1p.A02;
                r4 = i1p.A03;
                r4.getClass();
                r3 = (1Xj) h4o.A03;
                i = h4o.A01;
                break;
            case 9:
                H4V h4v = (H4V) this.A01;
                if (((SavedCollection) h4v.A02).A07 == C54665HMw.PRODUCT_AUTO_COLLECTION) {
                    i1p = (C56561I1p) h4v.A01;
                    userSession = i1p.A02;
                    r4 = i1p.A03;
                    r4.getClass();
                    r3 = (1Xj) h4v.A03;
                    i = AnonymousClass7TE.A0M(h4v.A04);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        I7Q.A06(userSession, r3, r4, i1p.A04, i);
    }
}
