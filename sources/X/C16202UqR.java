package X;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.UqR  reason: case insensitive filesystem */
public final class C16202UqR extends C19555Wbf {
    public final int A00;
    public final Object A01;

    public C16202UqR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D2H(Reel reel, AnonymousClass3N3 r14, C66967Mg0 mg0, C66632Ma1 ma1, boolean z) {
        String str;
        if (this.A00 == 0) {
            Reel reel2 = reel;
            List A1I = AnonymousClass7TE.A1I(reel);
            C15363UbF ubF = (C15363UbF) this.A01;
            AnonymousClass32A r5 = ubF.A01;
            if (r5 == null) {
                str = "reelViewerLauncher";
            } else {
                String str2 = ubF.A08;
                if (str2 == null) {
                    str = "reelTraySessionId";
                } else {
                    r5.A0C = str2;
                    r5.A05 = new C16165Upq((Activity) ubF.getActivity(), r14.AeY(), (C230222pE) new C19489Wab(ubF, 3));
                    r5.A01 = new WNL(1, mg0, ubF);
                    r5.A05(reel2, AnonymousClass3BQ.SEARCH_ITEM_HEADER, r14, A1I, A1I, A1I);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.Vwv, java.lang.Object] */
    public final void Dw5(AnonymousClass0iw r16, C66967Mg0 mg0, C66632Ma1 ma1) {
        String str;
        InputMethodManager inputMethodManager;
        C66967Mg0 mg02 = mg0;
        C66632Ma1 ma12 = ma1;
        if (this.A00 != 0) {
            boolean A1U = AnonymousClass7TF.A1U(0, ma12, mg02);
            C17280VPh vPh = ((C18012Vjo) this.A01).A01;
            User A06 = ma12.A06();
            int i = mg02.A00;
            C15401Uc7 uc7 = vPh.A00;
            if (ORH.A01(uc7.getSession(), A06)) {
                0wc A012 = AnonymousClass0kN.A01(uc7, uc7.getSession());
                C49926FFc.A02(uc7.requireActivity(), uc7, uc7.getSession(), A06, uc7.A0D);
                C17126VIw.A00(A012, uc7.getSession(), A06);
                C14221Ts1 ts1 = uc7.A04;
                if (ts1 == null) {
                    str = "queuedTypeaheadManager";
                } else {
                    ts1.A06.clear();
                    return;
                }
            } else {
                Integer num = AnonymousClass05K.A01;
                if (C45156CrJ.A00(A06, num) != null) {
                    C20311Wp0 wp0 = new C20311Wp0(uc7, A06, i);
                    FragmentActivity requireActivity = uc7.requireActivity();
                    UserSession session = uc7.getSession();
                    GrowthFrictionInterventionDetail A002 = C45156CrJ.A00(A06, num);
                    0qQ.A0B(session, A1U ? 1 : 0);
                    if (A002 != null) {
                        F8S.A00(requireActivity, A002, session, C358278ae.BLUE_BOLD, A06, num, wp0, false);
                        return;
                    }
                    return;
                }
                Integer num2 = uc7.A07;
                Integer num3 = AnonymousClass05K.A0C;
                if (num2 != num3) {
                    Object systemService = uc7.getThemedContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        inputMethodManager = (InputMethodManager) systemService;
                    } else {
                        inputMethodManager = null;
                    }
                    View currentFocus = uc7.requireActivity().getCurrentFocus();
                    if (!(inputMethodManager == null || currentFocus == null || currentFocus.getWindowToken() == null)) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                    ? obj = new Object();
                    ContextThemeWrapper A03 = uc7.getThemedContext();
                    FragmentActivity requireActivity2 = uc7.requireActivity();
                    UserSession session2 = uc7.getSession();
                    VXB vxb = new VXB(uc7, A06, i);
                    String str2 = uc7.A0A;
                    Integer num4 = uc7.A07;
                    DbW.A1O(session2, 2, num4);
                    if (num4 != num3) {
                        0wc A02 = AnonymousClass0kN.A02(session2);
                        C46498Dg1 dg1 = new C46498Dg1(A03, session2);
                        dg1.A0D(A06.getUsername(), DbY.A0b(A03, A06, 2131956223));
                        dg1.A07(A06.Bh3());
                        dg1.A04(new WA3(vxb, obj, A02, str2, 4), 2131956224);
                        dg1.A03 = new C19394WXn(A02, obj, str2);
                        if (num4 == num) {
                            dg1.A04(new WA3(vxb, obj, A02, str2, 3), 2131956225);
                        }
                        C51969G9p.A11(requireActivity2, dg1);
                        return;
                    }
                    return;
                } else if (uc7.A0D) {
                    C15401Uc7.A01(uc7, A06, i);
                    return;
                } else {
                    C15401Uc7.A00(uc7, A06, i);
                    X76 x76 = uc7.A05;
                    if (x76 != null) {
                        x76.AAN(A06, false);
                        return;
                    }
                    return;
                }
            }
        } else {
            AnonymousClass7TG.A1N(ma12, mg02);
            C15363UbF ubF = (C15363UbF) this.A01;
            C15363UbF.A00(ma12, mg02, ubF);
            C14437TwL twL = ubF.A05;
            if (twL == null) {
                str = "searchNavigationController";
            } else {
                twL.A09(ma12.A06(), ubF.A07, mg02.A06, mg02.A00);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DwE(AnonymousClass0iw r2, C66967Mg0 mg0, C66632Ma1 ma1) {
        if (this.A00 == 0) {
            C15363UbF.A00(ma1, mg0, (C15363UbF) this.A01);
        }
    }
}
