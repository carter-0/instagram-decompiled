package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

public final class FdT implements C358618bC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FdT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static EQA A00(FdT fdT) {
        return ((C46774Dl1) ((E5U) fdT.A02).A06.getValue()).A00;
    }

    public static AnonymousClass4D7 A01(EQA eqa, User user) {
        UserSession userSession = eqa.A00;
        user.A0d(userSession);
        17h.A00(userSession).A01(user, true, false);
        return null;
    }

    public static void A02(FdT fdT, int i) {
        if (i != 0) {
            E5U e5u = (E5U) fdT.A02;
            e5u.A03.A04(e5u.getContext(), (UserSession) e5u.A05.getValue(), ((User) fdT.A01).getUsername());
        }
    }

    public static void A03(IgdsListCell igdsListCell, Object obj, Object obj2, int i) {
        igdsListCell.A0E(new FdT(i, obj, obj2));
    }

    public final boolean onToggle(boolean z) {
        String str;
        Dc9 dc9;
        EQA eqa;
        C262224Cq r2;
        AnonymousClass4D7 r1;
        int i;
        0sL mgb;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        boolean z2 = z;
        switch (this.A00) {
            case 0:
                E49 e49 = (E49) this.A02;
                e49.A05 = z2;
                C313756gx A0R = DbZ.A0R(e49.A0A);
                int i2 = e49.A00;
                C254793t3 r12 = e49.A01;
                if (r12 == null) {
                    0qQ.A0F("currentThreadId");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str7 = C300965yF.A01(r12).A00;
                String str8 = e49.A04;
                String str9 = e49.A02;
                String A0u = DbU.A0u(e49.A0B);
                AnonymousClass2Ep r0 = (AnonymousClass2Ep) this.A01;
                int C6a = r0.C6a();
                C242243Te r02 = ((AnonymousClass3U9) r0).A01.A0s;
                if (r02 != null) {
                    String A002 = C329997La.A00(r02, A0u, C6a);
                    1Ln A0J = DbT.A0J(A0R);
                    if (!DbT.A1Y(A0J)) {
                        return true;
                    }
                    DbW.A17(A0J, A0R);
                    if (z) {
                        str = "paid_partnership_label_enabled";
                    } else {
                        str = "paid_partnership_label_disabled";
                    }
                    A0J.A0l(str);
                    A0J.A0k("toggle");
                    A0J.A0p("add_label_toggle");
                    A0J.A0i(DbZ.A0b(A0J, "paid_partnership_sheet", str7, str8, i2));
                    A0J.A0v(A0R.A01);
                    A0J.A0w(DbY.A0p("user_type", A002, AnonymousClass7TE.A1L(C66579MXk.A00(357), str9)));
                    A0J.Cgf();
                    return true;
                }
                throw AnonymousClass7TE.A0y();
            case 1:
                ProgressButton progressButton = (ProgressButton) this.A01;
                int i3 = 2131960992;
                if (z) {
                    i3 = 2131968361;
                }
                progressButton.setText(i3);
                ((E4K) this.A02).A07 = z2;
                return true;
            case 2:
                DbU.A1Y(DbS.A0q(this.A01), ((C47409E1b) this.A02).A08, z2);
                return true;
            case 3:
                E5U e5u = (E5U) this.A02;
                Context context = e5u.getContext();
                if (z) {
                    e5u.A03.A04(context, AnonymousClass7TE.A0l(e5u.A05), ((User) this.A01).getUsername());
                }
                if (context == null) {
                    return true;
                }
                if (z) {
                    dc9 = Dc9.ALL;
                } else {
                    dc9 = Dc9.A04;
                }
                AnonymousClass0eM r3 = e5u.A05;
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                User user = (User) this.A01;
                C49807F7u.A00(DbT.A05(context), A0l, dc9, user);
                C313746gw.A00(AnonymousClass7TE.A0l(r3)).A0I(dc9, user.getId(), true);
                return true;
            case 4:
                A02(this, z2 ? 1 : 0);
                eqa = A00(this);
                if (eqa != null) {
                    User user2 = eqa.A02;
                    user2.A03.EW5(Boolean.valueOf(z2));
                    r1 = A01(eqa, user2);
                    if (z) {
                        str2 = "turn_on_clips_notifications";
                    } else {
                        str2 = "turn_off_clips_notifications";
                    }
                    EQA.A01(eqa, str2);
                    EQA.A00(eqa);
                    r2 = eqa.A01;
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 5:
                A02(this, z2);
                eqa = A00(this);
                if (eqa != null) {
                    User user3 = eqa.A02;
                    user3.A03.EW7(Boolean.valueOf(z2));
                    r1 = A01(eqa, user3);
                    if (z) {
                        str3 = "turn_on_igtv_notifications";
                    } else {
                        str3 = "turn_off_igtv_notifications";
                    }
                    EQA.A01(eqa, str3);
                    EQA.A00(eqa);
                    r2 = eqa.A01;
                    i = 6;
                    break;
                } else {
                    return true;
                }
            case 6:
                A02(this, z2);
                eqa = A00(this);
                if (eqa != null) {
                    User user4 = eqa.A02;
                    user4.A03.EW6(Boolean.valueOf(z2));
                    r1 = A01(eqa, user4);
                    if (z) {
                        str4 = "turn_on_exclusive_content_notifications";
                    } else {
                        str4 = "turn_off_exclusive_content_notifications";
                    }
                    EQA.A01(eqa, str4);
                    EQA.A00(eqa);
                    r2 = eqa.A01;
                    i = 5;
                    break;
                } else {
                    return true;
                }
            case 7:
                A02(this, z2);
                eqa = A00(this);
                if (eqa != null) {
                    User user5 = eqa.A02;
                    user5.A03.EW3(Boolean.valueOf(z2));
                    r1 = A01(eqa, user5);
                    if (z) {
                        str5 = "turn_on_post_notifications";
                    } else {
                        str5 = "turn_off_post_notifications";
                    }
                    EQA.A01(eqa, str5);
                    EQA.A00(eqa);
                    r2 = eqa.A01;
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                A02(this, z2);
                eqa = A00(this);
                if (eqa != null) {
                    User user6 = eqa.A02;
                    user6.A03.EW8(Boolean.valueOf(z2));
                    r1 = A01(eqa, user6);
                    if (z) {
                        str6 = "turn_on_story_notifications";
                    } else {
                        str6 = "turn_off_story_notifications";
                    }
                    EQA.A01(eqa, str6);
                    EQA.A00(eqa);
                    r2 = eqa.A01;
                    i = 9;
                    break;
                } else {
                    return true;
                }
            case 9:
                ESI esi = (ESI) this.A02;
                if (esi.A09) {
                    return false;
                }
                User user7 = (User) this.A01;
                if (user7.A0J() == 16V.A05 || user7.A0J() == 16V.A06) {
                    Dialog dialog = esi.A00;
                    if (dialog == null) {
                        C358248ab A0U = DbW.A0U(esi);
                        A0U.A09(2131954370);
                        A0U.A08(2131954371);
                        A0U.A0r(false);
                        A0U.A06();
                        dialog = A0U.A02();
                        esi.A00 = dialog;
                        if (dialog == null) {
                            return false;
                        }
                    }
                    AnonymousClass0fN.A00(dialog);
                    return false;
                }
                esi.A09 = true;
                if (!z) {
                    ESI.A08(esi, user7);
                    return false;
                }
                AnonymousClass0eM r13 = esi.A0E;
                UserSession A0l2 = AnonymousClass7TE.A0l(r13);
                if (user7.A03.B6v() != null && user7.A03.B6v().intValue() >= 10) {
                    1Am A012 = 1Al.A01(A0l2);
                    1An r32 = 1An.A2V;
                    if (((long) A012.A03(r32).getInt("review_followers_prompt_last_time_shown", 0)) + 7776000 <= System.currentTimeMillis() / 1000) {
                        AnonymousClass7TG.A1M(1Al.A01(A0l2).A03(r32), "review_followers_prompt_last_time_shown", (int) (System.currentTimeMillis() / 1000));
                        ESI.A0A(esi, true);
                        ESI.A09(esi, user7, AnonymousClass05K.A0C, true);
                        return false;
                    }
                }
                FPG fpg = new FPG(52, (Object) user7, (Object) esi);
                C331127Pr A0f = DbX.A0f(r13);
                DbZ.A0z(esi.requireActivity(), A0f, 2131973409);
                A0f.A0U = new FmG(esi, 11);
                A0f.A0g = esi.requireActivity().getString(2131973405);
                A0f.A0K = fpg;
                A0f.A16 = false;
                C331157Pu A003 = A0f.A00();
                A003.A0Q(true);
                E1Z e1z = new E1Z();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", true);
                A0a.putBoolean("ARG_IS_REDESIGN", true);
                e1z.setArguments(A0a);
                e1z.A01 = esi.A0B;
                DbU.A1I(esi, e1z, A003);
                return false;
            case 10:
                E22 e22 = (E22) this.A02;
                if (z) {
                    E22.A01(e22, AnonymousClass05K.A01);
                    Context requireContext = e22.requireContext();
                    UserSession A0l3 = AnonymousClass7TE.A0l(e22.A04);
                    User user8 = e22.A00;
                    if (user8 != null) {
                        FCW.A00(requireContext, (1P0) this.A01, A0l3, user8, (String) null, e22.A02, true, false, false);
                        return true;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                E22.A01(e22, AnonymousClass05K.A1F);
                UserSession A0l4 = AnonymousClass7TE.A0l(e22.A04);
                User user9 = e22.A00;
                if (user9 != null) {
                    String str10 = e22.A02;
                    String id = user9.getId();
                    AnonymousClass7TF.A1D(A0l4, 0, str10);
                    1NY A0a2 = AnonymousClass7TG.A0a(A0l4);
                    A0a2.A0A("friendships/unmute_posts_or_story_from_follow/");
                    A0a2.A9m("container_module", str10);
                    A0a2.A9m("target_posts_author_id", id);
                    1OC A0L = DbW.A0L(A0a2, DwR.class, C49810F7x.class, true);
                    A0L.A00 = new C47668ECc((1P0) this.A01, AnonymousClass1Nd.A00(A0l4), A0l4, user9, true, false);
                    1ES.A03(A0L);
                    return true;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 11:
                E22 e222 = (E22) this.A02;
                if (z) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A02;
                }
                E22.A01(e222, num);
                Context requireContext2 = e222.requireContext();
                UserSession A0l5 = AnonymousClass7TE.A0l(e222.A04);
                User user10 = e222.A00;
                if (user10 != null) {
                    FCW.A01(requireContext2, (1P0) this.A01, A0l5, user10, e222.A02, z2);
                    return true;
                }
                throw AnonymousClass7TE.A0y();
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                E22 e223 = (E22) this.A02;
                if (z) {
                    E22.A01(e223, AnonymousClass05K.A0C);
                    Context requireContext3 = e223.requireContext();
                    UserSession A0l6 = AnonymousClass7TE.A0l(e223.A04);
                    User user11 = e223.A00;
                    if (user11 != null) {
                        FCW.A00(requireContext3, (1P0) this.A01, A0l6, user11, (String) null, e223.A02, false, true, false);
                        return true;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                E22.A01(e223, AnonymousClass05K.A1I);
                UserSession A0l7 = AnonymousClass7TE.A0l(e223.A04);
                User user12 = e223.A00;
                if (user12 != null) {
                    FCW.A02((1P0) this.A01, A0l7, user12, e223.A02);
                    return true;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            default:
                Fragment fragment = (Fragment) this.A02;
                Object obj = this.A01;
                07U r8 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
                r2 = AnonymousClass07a.A00(viewLifecycleOwner);
                mgb = new JTY(viewLifecycleOwner, obj, fragment, r8, (AnonymousClass4D7) null, 3, z2);
                break;
        }
        mgb = new MGB(eqa, r1, i, z2);
        AnonymousClass7TE.A1Z(mgb, r2);
        return true;
    }
}
