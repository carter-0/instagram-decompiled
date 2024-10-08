package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.List;

/* renamed from: X.FxE  reason: case insensitive filesystem */
public final class C51625FxE implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C51625FxE(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r13) {
        MYR myr;
        JXP jxp;
        0sn r0;
        Fragment e2g;
        switch (this.A00) {
            case 0:
                G4w g4w = (G4w) obj;
                if (g4w instanceof C65314LrC) {
                    myr = (MYR) this.A03;
                    jxp = JXP.LOADING;
                    r0 = 0sn.A00;
                } else if (g4w instanceof C47258Dtm) {
                    myr = (MYR) this.A03;
                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) this.A01;
                    C47258Dtm dtm = (C47258Dtm) g4w;
                    boolean z = dtm.A03;
                    boolean z2 = dtm.A01;
                    igdsBottomButtonLayout.setVisibility(DbW.A01(z ? 1 : 0));
                    if (z) {
                        igdsBottomButtonLayout.setPrimaryAction(igdsBottomButtonLayout.getResources().getString(2131957108), FP1.A00(myr, 8));
                        C48895Elv.A00(igdsBottomButtonLayout, z2);
                    }
                    ((View) this.A02).setVisibility(DbW.A01(dtm.A02 ? 1 : 0));
                    jxp = JXP.LOADED;
                    r0 = dtm.A00;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                myr.updateUi(jxp, r0);
                break;
            case 1:
                C48180EaM eaM = (C48180EaM) obj;
                if (eaM instanceof C47875EKv) {
                    C47480E4f e4f = (C47480E4f) this.A03;
                    C47875EKv eKv = (C47875EKv) eaM;
                    UserMonetizationProductType userMonetizationProductType = eKv.A00;
                    String str = eKv.A01;
                    Dba.A12(F6R.A00().A00(userMonetizationProductType, AnonymousClass7TE.A0l(e4f.A0C), str, false), DbY.A0K(e4f));
                } else if (eaM instanceof EL3) {
                    F3F f3f = (F3F) this.A02;
                    String A0t = DbS.A0t(((C47480E4f) this.A03).A05);
                    0qQ.A0B(A0t, 0);
                    FragmentActivity fragmentActivity = f3f.A00;
                    UserSession userSession = f3f.A01;
                    C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
                    if (AnonymousClass2o2.A02(userSession)) {
                        e2g = new H0Q();
                    } else {
                        e2g = new C47434E2g();
                        Bundle A0a = AnonymousClass7TE.A0a();
                        C227642jf.A04(A0a, userSession);
                        A0a.putString("ARGUMENT_ENTRY_POINT", A0t);
                        A0a.putBoolean(AnonymousClass000.A00(3991), false);
                        e2g.setArguments(A0a);
                    }
                    Dba.A12(e2g, A0M);
                } else if (eaM instanceof EL0) {
                    F3F f3f2 = (F3F) this.A02;
                    Dba.A12(new E7J(), DbS.A0M(f3f2.A00, f3f2.A01));
                } else if (eaM instanceof EL1) {
                    F3F f3f3 = (F3F) this.A02;
                    Dba.A0w((Bundle) null, C48892Els.A00(UserMonetizationProductType.FAN_CLUB_CREATOR, EWG.SETTINGS, (String) null, (String) null), DbS.A0M(f3f3.A00, f3f3.A01));
                } else if (eaM instanceof EL5) {
                    Fragment fragment = (Fragment) this.A03;
                    AnonymousClass7TE.A1Z(new MG8(fragment, (AnonymousClass4D7) null, 5), DbV.A0J(fragment));
                } else if (eaM instanceof EL7) {
                    F3F f3f4 = (F3F) this.A02;
                    DbY.A0u(f3f4.A00, DbY.A0B("ARGUMENT_ENTRY_POINT", "SETTINGS"), f3f4.A01, C273654mx.A00(282));
                } else if (eaM instanceof EL4) {
                    F3F f3f5 = (F3F) this.A02;
                    Dba.A12(new E7N(), DbS.A0M(f3f5.A00, f3f5.A01));
                } else if (eaM instanceof EL2) {
                    F3F f3f6 = (F3F) this.A02;
                    Dba.A12(f3f6.A02.A01(true, false, false, false, false), DbS.A0M(f3f6.A00, f3f6.A01));
                } else if (eaM instanceof EL9) {
                    F3F f3f7 = (F3F) this.A02;
                    Dba.A12(f3f7.A02.A01(false, true, false, false, false), DbS.A0M(f3f7.A00, f3f7.A01));
                } else if (eaM instanceof EL8) {
                    ((F3F) this.A02).A00(DbT.A08(this.A03));
                } else if (eaM instanceof C47879EKz) {
                    F3F f3f8 = (F3F) this.A02;
                    Dba.A12(f3f8.A02.A00("preview_picker"), DbS.A0M(f3f8.A00, f3f8.A01));
                } else if (eaM instanceof C47878EKy) {
                    F3F f3f9 = (F3F) this.A02;
                    SUL sul = new SUL(f3f9.A00, f3f9.A01, 2EG.A1m, "https://help.instagram.com/907314980182940", false);
                    sul.A0S = "UserPayFanclubSettingsFragment";
                    sul.A0A();
                } else if (eaM instanceof EL6) {
                    FC8.A01().A01(DbT.A08(this.A03), ((F3F) this.A02).A01, AnonymousClass05K.A01, G3O.A00);
                } else if (eaM instanceof C47876EKw) {
                    ((C49877FBb) this.A01).A02(((C47876EKw) eaM).A00, AnonymousClass05K.A0D);
                } else if (eaM instanceof C47877EKx) {
                    C47877EKx eKx = (C47877EKx) eaM;
                    ((F3F) this.A02).A01(eKx.A00.toString(), eKx.A02, eKx.A01);
                } else if (!0qQ.A0K(eaM, ELA.A00)) {
                    throw AnonymousClass7TE.A1K();
                }
                ((C60273JiU) ((EN2) this.A03).A01.getValue()).A05.Epw(ELA.A00);
                break;
            default:
                C48200Eag eag = (C48200Eag) obj;
                if (eag instanceof EPH) {
                    E1U e1u = (E1U) this.A03;
                    EPH eph = (EPH) eag;
                    List<C51940G8j> list = eph.A00;
                    boolean z3 = eph.A02;
                    boolean z4 = eph.A01;
                    View view = (View) this.A02;
                    View view2 = (View) this.A01;
                    if (!z4) {
                        if (!z3) {
                            view.setVisibility(8);
                            ViewModelListUpdate A0R = DbS.A0R();
                            if (list != null) {
                                for (C51940G8j g8j : list) {
                                    C47215Dt2 dt2 = (C47215Dt2) g8j;
                                    A0R.A00(new FYA(dt2.A00, dt2.A01));
                                }
                            }
                            AnonymousClass2t9 r02 = e1u.A01;
                            if (r02 != null) {
                                r02.A05(A0R);
                                break;
                            } else {
                                DbS.A13();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        } else {
                            view.setVisibility(0);
                            break;
                        }
                    } else {
                        view.setVisibility(8);
                        view2.setVisibility(0);
                        break;
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
        }
        return C60340gF.A00;
    }
}
