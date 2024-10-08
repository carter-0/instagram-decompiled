package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class NJT extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EncryptedBackupsBaseFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public static void A05(Fragment fragment, FGX fgx, int i) {
        fgx.A05((CharSequence) null, fragment.getString(i), R.drawable.instagram_app_imessage_pano_outline_24);
    }

    public static boolean A08(C66940MfZ mfZ, Object obj, AnonymousClass0YZ[] r3) {
        return !((View) mfZ.A03(obj, r3[0])).canScrollVertically(-1);
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (!C71145Oe2.A08(this)) {
            r2.EVS(true);
            r2.Eu4(true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Dde, X.6rV] */
    public static C319956rV A01(AnonymousClass07Z r2, int i) {
        return new C46362Dde(r2, new C73908Plj(r2, i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Dde, X.6rV] */
    public static C319956rV A02(AnonymousClass07Z r2, int i) {
        return new C46362Dde(r2, new C73663Phc(r2, i));
    }

    public static AnonymousClass0eM A03(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C73663Phc(obj, i));
    }

    public static void A06(C67713MtS mtS, NJT njt, AnonymousClass0eM r11, int i) {
        C73904Plf plf = new C73904Plf(njt, i);
        new OKI(mtS.A01).A00(mtS.A0D(), mtS.A00, mtS.A04, AnonymousClass05K.A0N, new C74193PqZ(plf, 34), false);
        C71099OcZ.A02(njt.A0D(), AnonymousClass05K.A0j, true);
        ((C67713MtS) r11.getValue()).A02.A0B("GDRIVE_SETUP_SUCCESS");
    }

    public static void A07(C3021461u r1, Object obj, int i) {
        r1.setSecondaryActionOnClickListener(new C71407Ok6(obj, i));
    }

    public static boolean A09(C66940MfZ mfZ, Object obj, AnonymousClass0YZ[] r3, int i) {
        View view = (View) mfZ.A03(obj, r3[i]);
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public static AnonymousClass0YZ[] A0A(Class cls) {
        return new AnonymousClass0YZ[]{new 01B(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    }

    public final UserSession A0D() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public void A0E() {
        C68714NUa A002;
        String str;
        String str2;
        if (this instanceof C68733NUt) {
            C66913Mex.A03(((C67709MtO) ((C68733NUt) this).A03.getValue()).A01, "INTRODUCE_NUX_CLOSED");
        } else if (this instanceof C68729NUp) {
        } else {
            if (this instanceof NV1) {
                AnonymousClass0eM r1 = ((NV1) this).A08;
                if (!((C67716MtV) r1.getValue()).A09.A02) {
                    C67716MtV mtV = (C67716MtV) r1.getValue();
                    int ordinal = ((C69261NiN) mtV.A0M.getValue()).ordinal();
                    if (ordinal == 0) {
                        str2 = "CREATE_PIN_CLOSED";
                    } else if (ordinal == 1) {
                        str2 = "CONFIRM_PIN_CLOSED";
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    C66913Mex.A03(mtV.A08, str2);
                }
            } else if (this instanceof C68731NUr) {
                C66913Mex.A03(((C67719MtY) ((C68731NUr) this).A01.getValue()).A00, "SOFT_BLOCK_PIN_LEADING_SCREEN_CLOSED");
            } else if (this instanceof NV0) {
                C68714NUa nUa = ((C67714MtT) ((NV0) this).A0C.getValue()).A08;
                if (nUa.A0G()) {
                    nUa.A0B("PIN_RESTORE_DISMISSED");
                    nUa.A0D("END_REASON", "PIN_RESTORE_CLOSED");
                    nUa.A07();
                }
            } else if (this instanceof C68725NUl) {
                C66913Mex.A03(((C67718MtX) ((C68725NUl) this).A00.getValue()).A00, "SOFT_BLOCK_PIN_LEADING_SCREEN_CLOSED");
            } else if (!(this instanceof C68734NUu) && !(this instanceof C68728NUo)) {
                if (this instanceof C68738NUy) {
                    A002 = ((C67711MtQ) ((C68738NUy) this).A07.getValue()).A07;
                    if (A002.A0G()) {
                        A002.A0D("END_REASON", "OTC_RESTORE_CLOSED");
                        str = "OTC_RESTORE_WAIT_CLOSED";
                    } else {
                        return;
                    }
                } else if (this instanceof C68732NUs) {
                    AnonymousClass0eM r3 = ((C68732NUs) this).A02;
                    if (C66580MXl.A0U(r3).A0G()) {
                        C66580MXl.A0U(r3).A0D("END_REASON", "OTC_LANDING_NUX_CLOSED");
                        C66580MXl.A0U(r3).A0B("OTC_LANDING_NUX_CLOSED");
                        C66580MXl.A0U(r3).A07();
                        return;
                    }
                    return;
                } else if (this instanceof C68730NUq) {
                    AnonymousClass0eM r32 = ((C68730NUq) this).A01;
                    if (C66580MXl.A0U(r32).A0G()) {
                        C66580MXl.A0U(r32).A0D("END_REASON", "OTC_LANDING_NUX_CLOSED");
                        C66580MXl.A0U(r32).A0B("OTC_LANDING_NUX_CLOSED");
                        C66580MXl.A0U(r32).A07();
                        return;
                    }
                    return;
                } else if (this instanceof C68739NUz) {
                    A002 = ((C67712MtR) ((C68739NUz) this).A08.getValue()).A06;
                    if (A002.A0G()) {
                        A002.A0D("END_REASON", "OTC_ENTER_PIN_CLOSED");
                        str = "OTC_ENTER_PIN_DISMISSED";
                    } else {
                        return;
                    }
                } else if (!(this instanceof C68726NUm) && !(this instanceof C68727NUn)) {
                    if (this instanceof C68736NUw) {
                        A002 = C67753Mu7.A00(((C68736NUw) this).A05);
                        if (!A002.A0G()) {
                            return;
                        }
                    } else if (this instanceof C68735NUv) {
                        A002 = C67753Mu7.A00(((C68735NUv) this).A05);
                        if (!A002.A0G()) {
                            return;
                        }
                    } else {
                        C66913Mex.A03(((C67724Mtd) ((C68737NUx) this).A0B.getValue()).A00, "MORE_OPTIONS_CLOSED");
                        return;
                    }
                    A002.A0D("END_REASON", "OTC_ENTER_PIN_CLOSED");
                    str = "OTC_DEVICE_LIST_DISMISSED";
                } else {
                    return;
                }
                A002.A0B(str);
                A002.A07();
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public boolean onBackPressed() {
        C66913Mex A002;
        String str;
        String str2;
        if (this instanceof NV1) {
            NV1 nv1 = (NV1) this;
            C71145Oe2.A02(nv1);
            C67716MtV mtV = (C67716MtV) nv1.A08.getValue();
            C71145Oe2.A02(nv1);
            05G r4 = mtV.A0M;
            int ordinal = ((C69261NiN) r4.getValue()).ordinal();
            if (ordinal == 0) {
                str2 = "CREATE_PIN_NAVIGATE_BACK";
            } else if (ordinal == 1) {
                str2 = "CONFIRM_PIN_NAVIGATE_BACK";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            mtV.A08.A0B(str2);
            int ordinal2 = ((C69261NiN) r4.getValue()).ordinal();
            if (ordinal2 == 0) {
                return false;
            }
            if (ordinal2 == 1) {
                r4.Epw(C69261NiN.InitialScreen);
                mtV.A0K.Epw("");
                return true;
            }
            throw AnonymousClass7TE.A1K();
        }
        if (this instanceof C68731NUr) {
            A002 = ((C67719MtY) ((C68731NUr) this).A01.getValue()).A00;
            str = "SOFT_BLOCK_PIN_LEADING_SCREEN_NAVIGATE_BACK";
        } else if (this instanceof NV0) {
            ((C67714MtT) ((NV0) this).A0C.getValue()).A00 = true;
            return false;
        } else if (this instanceof C68725NUl) {
            A002 = ((C67718MtX) ((C68725NUl) this).A00.getValue()).A00;
            str = "SOFT_BLOCK_PIN_LEADING_SCREEN_NAVIGATE_BACK";
        } else if (this instanceof C68734NUu) {
            C68734NUu nUu = (C68734NUu) this;
            NUN nun = ((C67734Mtn) nUu.A03.getValue()).A03;
            nun.A0D("END_REASON", "HARD_BLOCK_CLOSED");
            nun.A0B("HARD_BLOCK_PIN_LEADING_SCREEN_CLOSED");
            nun.A07();
            nUu.requireActivity().setResult(106183331);
            return false;
        } else if (this instanceof C68738NUy) {
            A002 = ((C67711MtQ) ((C68738NUy) this).A07.getValue()).A07;
            str = "OTC_RESTORE_WAIT_BACK_BUTTON_TAP";
        } else if (this instanceof C68732NUs) {
            C68732NUs nUs = (C68732NUs) this;
            C66580MXl.A0U(nUs.A02).A0B("OTC_LANDING_NUX_BACK_BUTTON_TAP");
            C358248ab A0V = DbW.A0V(nUs);
            A0V.A0j(nUs.requireContext().getDrawable(R.drawable.ig_illustrations_illo_message_warning_refresh));
            A0V.A09(2131961686);
            A0V.A08(2131961683);
            A0V.A0R(C71249OgE.A00(nUs, 21), C358278ae.DEFAULT, 2131961684);
            A0V.A0G(C71249OgE.A00(nUs, 22), 2131961685);
            C71252OgJ.A00(A0V, nUs, 5);
            A0V.A0r(true);
            DbT.A1V(A0V);
            return true;
        } else if (this instanceof C68739NUz) {
            C68739NUz nUz = (C68739NUz) this;
            nUz.getParentFragmentManager().A0z("back_press_key", AnonymousClass7TE.A0a());
            A002 = ((C67712MtR) nUz.A08.getValue()).A06;
            if (!A002.A0G()) {
                return false;
            }
            str = "OTC_ENTER_PIN_VIEW_BACK_BUTTON_TAP";
        } else {
            if (this instanceof C68736NUw) {
                C68736NUw nUw = (C68736NUw) this;
                if (nUw.A00) {
                    return false;
                }
                A002 = C67753Mu7.A00(nUw.A05);
                if (!A002.A0G()) {
                    return false;
                }
            } else if (this instanceof C68735NUv) {
                C68735NUv nUv = (C68735NUv) this;
                if (nUv.A01) {
                    return false;
                }
                A002 = C67753Mu7.A00(nUv.A05);
                if (!A002.A0G()) {
                    return false;
                }
            } else if (!(this instanceof C68737NUx)) {
                return false;
            } else {
                C67724Mtd mtd = (C67724Mtd) ((C68737NUx) this).A0B.getValue();
                NUN nun2 = mtd.A00;
                nun2.A0B("MORE_OPTIONS_NAVIGATE_BACK");
                Integer num = mtd.A02;
                Integer num2 = AnonymousClass05K.A0C;
                if (num != num2) {
                    return false;
                }
                nun2.A0D("END_REASON", "SETTINGS_ONBOARDING_CLOSED");
                nun2.A0A(num2);
                return false;
            }
            str = "OTC_DEVICE_LIST_BACK_BUTTON_TAP";
        }
        A002.A0B(str);
        return false;
    }

    public static void A04(View view, Fragment fragment) {
        View requireViewById = view.requireViewById(R.id.container);
        0qQ.A07(requireViewById);
        C71145Oe2.A04((ViewGroup) requireViewById, fragment);
    }

    public void onResume() {
        AnonymousClass37D A0i;
        int A02 = AnonymousClass0fD.A02(-1179745109);
        super.onResume();
        if (C71145Oe2.A08(this) && (A0i = DbX.A0i(this)) != null) {
            C72964PQw.A00(this, 2, A0i);
        }
        AnonymousClass0fD.A09(462476095, A02);
    }

    public static double A00(UserSession userSession) {
        if (AnonymousClass65A.A02(userSession, 36315949952274243L)) {
            return 0.85d;
        }
        return 0.75d;
    }
}
