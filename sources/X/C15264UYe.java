package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.UYe  reason: case insensitive filesystem */
public final class C15264UYe extends C240373Kq implements AnonymousClass4DR, G9A {
    public static final String __redex_internal_original_name = "IgNativeCdsBottomSheetFragment";
    public C14556TyL A00;
    public C46471DfZ A01;
    public C49726F3q A02;
    public C49720F3h A03;
    public Integer A04 = AnonymousClass05K.A0C;
    public final AnonymousClass0eM A05 = C227642jf.A01(this);
    public final C14580Tyk A06 = new Object();

    public final View AVH(String str) {
        0qQ.A0B(str, 0);
        C14556TyL tyL = this.A00;
        if (tyL != null) {
            return tyL.A06(str);
        }
        0qQ.A0F("bottomSheetDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return C3253772d.A01(this, i2, z, true);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            bundle.putBoolean("from_changing_configuration)", true);
        }
        C46471DfZ dfZ = this.A01;
        if (dfZ == null) {
            0qQ.A0F("openScreenConfig");
            throw AnonymousClass00P.createAndThrow();
        }
        bundle.putBundle("cds_open_screen_config", dfZ.A00());
        C49726F3q f3q = this.A02;
        if (f3q != null) {
            bundle.putInt("container", C14615TzM.A00(f3q));
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C49720F3h f3h = this.A03;
        if (f3h != null) {
            C49726F3q f3q = this.A02;
            if (f3q != null) {
                C49719F3f f3f = f3h.A02;
                0qQ.A0C(f3f, AnonymousClass000.A00(3674));
                f3q.A01(f3h.A01, f3f, f3h.A04, f3h.A00);
            }
            this.A03 = null;
        }
        C14580Tyk tyk = this.A06;
        C46471DfZ dfZ = this.A01;
        if (dfZ == null) {
            0qQ.A0F("openScreenConfig");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyk.A01(view, this, dfZ);
        }
    }

    public final Dialog A0F(Bundle bundle) {
        Context A022;
        C46471DfZ dfZ = this.A01;
        String str = "openScreenConfig";
        if (dfZ != null) {
            if (dfZ.A0E != C46626Di6.FULL_SCREEN) {
                C14556TyL tyL = this.A00;
                if (tyL == null) {
                    str = "bottomSheetDelegate";
                } else {
                    Context requireContext = requireContext();
                    C46471DfZ dfZ2 = this.A01;
                    if (dfZ2 != null) {
                        2Tb A09 = tyL.A09(requireContext, this, dfZ2);
                        0qQ.A07(A09);
                        Integer num = this.A04;
                        if (num != AnonymousClass05K.A0C) {
                            Integer num2 = AnonymousClass05K.A00;
                            Context requireContext2 = requireContext();
                            if (num == num2) {
                                A022 = 2Yn.A01(requireContext2);
                            } else {
                                A022 = 2Yn.A02(requireContext2);
                            }
                            Window window = A09.getWindow();
                            if (window != null) {
                                window.setNavigationBarColor(A022.getColor(2Yu.A0C(A022)));
                            }
                        }
                        return A09;
                    }
                }
            } else {
                throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0J() {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C14559TyO tyO = (C14559TyO) tyL.A0G.peek();
        if (tyO != null) {
            tyO.A03.pause();
        }
    }

    public final 0lg A0M() {
        return DbT.A0X(this.A05);
    }

    public final boolean AJd(String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        for (C14559TyO A002 : tyL.A0G) {
            if (C21043XAw.A00(A002, str)) {
                return true;
            }
        }
        return false;
    }

    public final void APb(C48059EUd eUd, Runnable runnable) {
        String str;
        C46471DfZ dfZ = this.A01;
        if (dfZ == null) {
            str = "openScreenConfig";
        } else {
            if (dfZ.A0E == C46626Di6.FULL_SCREEN) {
                0hq parentFragmentManager = getParentFragmentManager();
                if (parentFragmentManager.A0M() <= 0 || parentFragmentManager.A0G) {
                    DbX.A1I(this);
                } else {
                    parentFragmentManager.A0c();
                }
            }
            C14556TyL tyL = this.A00;
            if (tyL == null) {
                str = "bottomSheetDelegate";
            } else {
                tyL.A0L(eUd, runnable);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C46626Di6 BTV() {
        C46471DfZ dfZ = this.A01;
        if (dfZ != null) {
            return dfZ.A0E;
        }
        0qQ.A0F("openScreenConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final X5M Bcw(C16501Uvx uvx) {
        throw new UnsupportedOperationException("Native fragment should not be used with platform behaviors");
    }

    public final Window CGd() {
        C14556TyL tyL = this.A00;
        if (tyL != null) {
            return tyL.A07(requireContext());
        }
        0qQ.A0F("bottomSheetDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CNT(C21043XAw xAw, C16400UuI uuI, String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0K(xAw, uuI, str);
        }
    }

    public final void E0j(C21043XAw xAw, C14578Tyi tyi) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = requireContext();
        Integer num = AnonymousClass05K.A00;
        int i = tyi.A00;
        C21043XAw xAw2 = xAw;
        C14556TyL.A00(requireContext, tyL, xAw2, tyi.A00(), tyi.A01, num, i, tyi.A02);
    }

    public final void E30(C16399UuH uuH) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0G(requireContext(), uuH, (String) null);
        }
    }

    public final void E31(String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0G(requireContext(), new C16399UuH((Integer) null), str);
        }
    }

    public final void E5D(C21043XAw xAw, C46619Dhz dhz) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0E(requireContext(), xAw, dhz);
        }
    }

    public final void ED4(String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0O(str);
        }
    }

    public final void EFL(C21043XAw xAw, C48061EUf eUf, String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0F(requireContext(), xAw, eUf, str);
        }
    }

    public final void ETe(Drawable drawable) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C14554TyJ tyJ = tyL.A03;
        if (tyJ != null) {
            tyJ.setCustomBackgroundDrawable(drawable);
        }
    }

    public final void Eae(boolean z) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        2Tb r0 = tyL.A07;
        if (r0 != null) {
            r0.A09.A0B = z;
        }
    }

    public final void FJH(C48060EUe eUe, String str) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = requireContext();
        if (tyL.A0G.size() != 1) {
            tyL.A0H(requireContext, eUe.A00, str);
        }
    }

    public final void FJi(X5O x5o) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C14559TyO tyO = (C14559TyO) tyL.A0G.peek();
        if (tyO != null) {
            tyO.A01 = x5o;
        }
    }

    public final void FJn(ColorData colorData, C46626Di6 di6) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tyL.A0I(colorData, di6);
        }
    }

    public final void FKq(ColorData colorData, float f) {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        requireContext();
        tyL.A0J(colorData, Float.valueOf(f));
    }

    public final String getModuleName() {
        String A0A;
        C14556TyL tyL = this.A00;
        if (tyL == null || (A0A = tyL.A0A()) == null) {
            return "native_cds_fragment_screen_uninitialized";
        }
        return A0A;
    }

    public final boolean onBackPressed() {
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        tyL.A0C(requireContext());
        return true;
    }

    public final void A0I() {
        super.A0I();
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        C14559TyO tyO = (C14559TyO) tyL.A0G.peek();
        if (tyO != null) {
            tyO.A03.EIx();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int i;
        int A022 = AnonymousClass0fD.A02(-1236519708);
        C15264UYe.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new C14556TyL((VME) null);
        if (bundle == null) {
            bundle2 = requireArguments.getBundle("cds_open_screen_config");
        } else {
            bundle2 = bundle.getBundle("cds_open_screen_config");
        }
        C49668F1a f1a = C46471DfZ.A0P;
        if (bundle2 != null) {
            this.A01 = f1a.A00(bundle2);
            if (bundle != null) {
                A07();
                i = -316401355;
            } else {
                int i2 = requireArguments.getInt(AnonymousClass000.A00(1216), -1);
                C46471DfZ dfZ = this.A01;
                if (dfZ == null) {
                    0qQ.A0F("openScreenConfig");
                    throw AnonymousClass00P.createAndThrow();
                }
                this.A04 = dfZ.A0F;
                Object A023 = C14615TzM.A02(C49720F3h.class, Integer.valueOf(i2));
                0qQ.A0C(A023, AnonymousClass000.A00(3673));
                C49720F3h f3h = (C49720F3h) A023;
                Context requireContext = requireContext();
                FoaUserSession foaUserSession = f3h.A03;
                Context requireContext2 = requireContext();
                int A032 = C51967G9n.A03(this.A04, 1);
                boolean z = true;
                if (A032 != 0) {
                    if (A032 == 1) {
                        z = false;
                    } else if (A032 == 2) {
                        z = AnonymousClass3HA.A00(requireContext2);
                    } else {
                        throw new RuntimeException();
                    }
                }
                C49726F3q f3q = new C49726F3q(requireContext, foaUserSession, z);
                f3q.A00 = this;
                this.A02 = f3q;
                this.A03 = f3h;
                this.A06.A00 = Integer.valueOf(AnonymousClass2uJ.A00(getRootActivity()));
                i = -1331985045;
            }
            AnonymousClass0fD.A09(i, A022);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("openSheetConfig not found in bundle");
        AnonymousClass0fD.A09(-1182909881, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1348649266);
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            str = "bottomSheetDelegate";
        } else {
            Context requireContext = requireContext();
            C46471DfZ dfZ = this.A01;
            if (dfZ == null) {
                str = "openScreenConfig";
            } else {
                C14554TyJ A08 = tyL.A08(requireContext, new C18964WEr(this), dfZ, AnonymousClass2Y8.A01(requireActivity()));
                0qQ.A07(A08);
                AnonymousClass0fD.A09(1114483566, A022);
                return A08;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1563966764);
        C15264UYe.super.onDestroy();
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        tyL.A0D(requireContext());
        C49726F3q f3q = this.A02;
        if (f3q != null) {
            f3q.A00 = null;
        }
        AnonymousClass0fD.A09(-2046352579, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(284712847);
        C15264UYe.super.onDestroyView();
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            0qQ.A0F("bottomSheetDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        tyL.A0B();
        this.A06.A02(this);
        AnonymousClass0fD.A09(1501752648, A022);
    }

    public final void onDetach() {
        String str;
        int A022 = AnonymousClass0fD.A02(-141360730);
        C15264UYe.super.onDetach();
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            str = "bottomSheetDelegate";
        } else {
            C46471DfZ dfZ = this.A01;
            if (dfZ == null) {
                str = "openScreenConfig";
            } else {
                tyL.A0M(dfZ);
                AnonymousClass0fD.A09(-413346698, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1380871513);
        C15264UYe.super.onStart();
        C14556TyL tyL = this.A00;
        if (tyL == null) {
            str = "bottomSheetDelegate";
        } else {
            C46471DfZ dfZ = this.A01;
            if (dfZ == null) {
                str = "openScreenConfig";
            } else {
                tyL.A0N(dfZ);
                AnonymousClass0fD.A09(917778981, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
