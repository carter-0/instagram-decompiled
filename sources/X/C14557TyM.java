package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.TyM  reason: case insensitive filesystem */
public final class C14557TyM extends C240373Kq implements AnonymousClass4DR, G9A, AnonymousClass3M5, C240433Kw, AnonymousClass08W {
    public static final String __redex_internal_original_name = "IgCdsBottomSheetFragment";
    public C18492Vsn A00;
    public 0lg A01;
    public C46471DfZ A02;
    public C14556TyL A03;
    public final X22 A04 = new C18963WEq(this);
    public final C14580Tyk A05 = new Object();

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return C3253772d.A01(this, i2, z, true);
    }

    public static C14556TyL A01(C14557TyM tyM) {
        C14556TyL tyL = tyM.A03;
        if (tyL != null) {
            return tyL;
        }
        throw new IllegalStateException("Must initialize bottom sheet delegate");
    }

    public static C14557TyM A02(C51946G8p g8p, IgBloksScreenConfig igBloksScreenConfig, 0lg r6, C46471DfZ dfZ) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        bundle.putBundle("cds_open_screen_config", dfZ.A00());
        bundle.putString(AnonymousClass000.A00(1162), "Bloks");
        IgBloksScreenConfig.A04(bundle, igBloksScreenConfig, 1AW.A06(0Tu.A05, 18310098418020472L));
        C49903FCg.A00(bundle, g8p);
        C14557TyM tyM = new C14557TyM();
        tyM.setArguments(bundle);
        return tyM;
    }

    public final Dialog A0F(Bundle bundle) {
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        if (dfZ.A0E != C46626Di6.FULL_SCREEN) {
            C14556TyL A012 = A01(this);
            Context requireContext = requireContext();
            C46471DfZ dfZ2 = this.A02;
            dfZ2.getClass();
            return A012.A09(requireContext, this, dfZ2);
        }
        throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
    }

    public final 0lg A0M() {
        return this.A01;
    }

    public final void APb(C48059EUd eUd, Runnable runnable) {
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        if (dfZ.A0E == C46626Di6.FULL_SCREEN) {
            C14580Tyk.A00(this);
        }
        A01(this).A0L(eUd, runnable);
    }

    public final C46626Di6 BTV() {
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        return dfZ.A0E;
    }

    public final X5M Bcw(C16501Uvx uvx) {
        C18492Vsn vsn = this.A00;
        if (vsn != null) {
            0qQ.A0B(uvx, 0);
            0eP r0 = (0eP) vsn.A04.get(uvx);
            if (r0 == null) {
                r0 = C18492Vsn.A00((Bundle) null, vsn, uvx);
            }
            return (X5M) r0.A00;
        }
        throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
    }

    public final void Eae(boolean z) {
        2Tb r0;
        C14556TyL tyL = this.A03;
        if (tyL != null && (r0 = tyL.A07) != null) {
            r0.A09.A0B = z;
        }
    }

    public final void A0N(ColorData colorData) {
        int i;
        C14556TyL A012 = A01(this);
        requireContext();
        C14554TyJ tyJ = A012.A03;
        if (tyJ != null) {
            C307796Rn r0 = A012.A0A;
            r0.getClass();
            if (r0.CRA()) {
                i = colorData.A00;
            } else {
                i = colorData.A01;
            }
            tyJ.A02 = i;
            tyJ.A01 = Color.alpha(i);
        }
    }

    public final boolean AJd(String str) {
        for (C14559TyO A002 : A01(this).A0G) {
            if (C21043XAw.A00(A002, str)) {
                return true;
            }
        }
        return false;
    }

    public final View AVH(String str) {
        return A01(this).A06(str);
    }

    public final String BTx() {
        String A0A = A01(this).A0A();
        if (A0A != null) {
            return A0A;
        }
        C18492Vsn vsn = this.A00;
        if (vsn != null) {
            X5M x5m = vsn.A01;
            if (x5m == null) {
                0qQ.A0F("behavior");
                throw AnonymousClass00P.createAndThrow();
            }
            F3c AbQ = x5m.AbQ();
            if (AbQ != null) {
                return AbQ.A01;
            }
            return "";
        }
        throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
    }

    public final Window CGd() {
        return A01(this).A07(requireContext());
    }

    public final void CNT(C21043XAw xAw, C16400UuI uuI, String str) {
        A01(this).A0K(xAw, uuI, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r8 != 7) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r8 != 7) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ddp(int r8) {
        /*
            r7 = this;
            X.TyL r5 = A01(r7)
            X.TyJ r2 = r5.A03
            if (r2 == 0) goto L_0x0086
            X.TyP r6 = r2.A06
            if (r6 == 0) goto L_0x0086
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.1Kp r0 = X.1Kq.A00
            X.8gt r0 = r0.C5w()
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.JRA r0 = X.C21115XFf.A00(r0)
            boolean r0 = r0.AVl(r1)
            if (r0 == 0) goto L_0x0086
            X.EX7 r3 = r2.A0I
            X.EX7 r0 = X.EX7.ANIMATED_WHILE_LOADING
            r2 = 7
            r1 = 1
            if (r3 != r0) goto L_0x0074
            if (r8 == 0) goto L_0x0083
            if (r8 == r1) goto L_0x0083
            if (r8 == r2) goto L_0x007f
        L_0x0030:
            r0 = 5
            if (r8 == r0) goto L_0x0045
            r0 = 6
            if (r8 != r0) goto L_0x0044
            X.Tyg r0 = r5.A06
            if (r0 == 0) goto L_0x0044
            android.os.Handler r3 = r0.A02
            X.Tyv r2 = new X.Tyv
            r2.<init>(r0)
        L_0x0041:
            r3.post(r2)
        L_0x0044:
            return
        L_0x0045:
            X.Tyh r0 = r5.A05
            if (r0 == 0) goto L_0x0044
            X.TyJ r0 = r5.A03
            if (r0 == 0) goto L_0x0044
            X.Tyg r2 = r5.A06
            if (r2 == 0) goto L_0x005b
            android.os.Handler r1 = r2.A02
            X.Tyv r0 = new X.Tyv
            r0.<init>(r2)
            r1.post(r0)
        L_0x005b:
            X.Whm r0 = new X.Whm
            r0.<init>(r5)
            X.11Z.A02(r0)
            X.Tyh r4 = r5.A05
            X.TyJ r1 = r5.A03
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            android.os.Handler r3 = r4.A02
            X.WoJ r2 = new X.WoJ
            r2.<init>(r1, r4, r0)
            goto L_0x0041
        L_0x0074:
            X.EX7 r0 = X.EX7.ANIMATED_WHILE_LOADED
            if (r3 != r0) goto L_0x0086
            if (r8 == 0) goto L_0x007f
            if (r8 == r1) goto L_0x007f
            if (r8 == r2) goto L_0x0083
            goto L_0x0030
        L_0x007f:
            r6.setIsSwirlAnimating(r4)
            goto L_0x0086
        L_0x0083:
            r6.setIsSwirlAnimating(r1)
        L_0x0086:
            if (r8 != 0) goto L_0x0030
            X.Tyg r1 = r5.A06
            if (r1 == 0) goto L_0x0044
            X.TyJ r0 = r5.A03
            if (r0 == 0) goto L_0x0044
            android.os.Handler r3 = r1.A02
            X.Wli r2 = new X.Wli
            r2.<init>(r0, r1)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14557TyM.Ddp(int):void");
    }

    public final void E0j(C21043XAw xAw, C14578Tyi tyi) {
        C14556TyL A012 = A01(this);
        Context requireContext = requireContext();
        Integer num = AnonymousClass05K.A00;
        int i = tyi.A00;
        C21043XAw xAw2 = xAw;
        C14556TyL.A00(requireContext, A012, xAw2, tyi.A00(), tyi.A01, num, i, tyi.A02);
    }

    public final void E30(C16399UuH uuH) {
        A01(this).A0G(requireContext(), uuH, (String) null);
    }

    public final void E31(String str) {
        A01(this).A0G(requireContext(), new C16399UuH((Integer) null), str);
    }

    public final void E5D(C21043XAw xAw, C46619Dhz dhz) {
        A01(this).A0E(requireContext(), xAw, dhz);
    }

    public final void ED4(String str) {
        A01(this).A0O(str);
    }

    public final void EFL(C21043XAw xAw, C48061EUf eUf, String str) {
        A01(this).A0F(requireContext(), xAw, eUf, str);
    }

    public final void ETe(Drawable drawable) {
        C14554TyJ tyJ = A01(this).A03;
        if (tyJ != null) {
            tyJ.setCustomBackgroundDrawable(drawable);
        }
    }

    public final void FJH(C48060EUe eUe, String str) {
        C14556TyL A012 = A01(this);
        Context requireContext = requireContext();
        if (A012.A0G.size() != 1) {
            A012.A0H(requireContext, eUe.A00, str);
        }
    }

    public final void FJi(X5O x5o) {
        C14559TyO tyO = (C14559TyO) A01(this).A0G.peek();
        if (tyO != null) {
            tyO.A01 = x5o;
        }
    }

    public final void FJn(ColorData colorData, C46626Di6 di6) {
        A01(this).A0I(colorData, di6);
    }

    public final void FKq(ColorData colorData, float f) {
        C14556TyL A012 = A01(this);
        requireContext();
        A012.A0J(colorData, Float.valueOf(f));
    }

    public final String getModuleName() {
        String A0A = A01(this).A0A();
        if (A0A != null) {
            return A0A;
        }
        C18492Vsn vsn = this.A00;
        if (vsn != null) {
            X5M x5m = vsn.A01;
            if (x5m == null) {
                0qQ.A0F("behavior");
                throw AnonymousClass00P.createAndThrow();
            }
            F3c AbQ = x5m.AbQ();
            if (AbQ != null) {
                return AbQ.A00;
            }
            return "";
        }
        throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
    }

    public final boolean onBackPressed() {
        A01(this).A0C(requireContext());
        return true;
    }

    public final void onCreate(Bundle bundle) {
        0lg r0;
        int i;
        int A022 = AnonymousClass0fD.A02(823043483);
        C14557TyM.super.onCreate(bundle);
        if (bundle != null) {
            A07();
            this.A02 = C46628Di8.A04();
            this.A03 = new C14556TyL((VME) null);
            i = -382951282;
        } else {
            Bundle requireArguments = requireArguments();
            if (!DbU.A0l(requireArguments, "IgSessionManager.SESSION_TOKEN_KEY").equals(AnonymousClass000.A00(962)) || !1AW.A06(0Tu.A05, 18310098417954935L)) {
                r0 = 09i.A0A.A04(requireArguments);
            } else {
                09i A002 = 08y.A00();
                synchronized (A002) {
                    r0 = A002.A08;
                    if (r0 == null) {
                        r0 = 09i.A0A.A03(this);
                    }
                }
            }
            this.A01 = r0;
            Bundle bundle2 = requireArguments.getBundle("cds_open_screen_config");
            bundle2.getClass();
            this.A02 = C46471DfZ.A0P.A00(bundle2);
            this.A00 = new C18492Vsn(this);
            C14556TyL tyL = new C14556TyL(new VME(this.A01));
            this.A03 = tyL;
            tyL.A04 = this.A00;
            this.A05.A00 = Integer.valueOf(AnonymousClass2uJ.A00(getRootActivity()));
            i = 1547893810;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1991702461);
        C14556TyL A012 = A01(this);
        Context requireContext = requireContext();
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        C14554TyJ A08 = A012.A08(requireContext, this.A04, dfZ, AnonymousClass2Y8.A01(requireActivity()));
        AnonymousClass0fD.A09(-922384813, A022);
        return A08;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-595001739);
        C14557TyM.super.onDestroy();
        C14556TyL tyL = this.A03;
        if (tyL != null) {
            tyL.A0D(requireContext());
        }
        AnonymousClass0fD.A09(423787133, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1466469447);
        C14557TyM.super.onDestroyView();
        C14556TyL tyL = this.A03;
        if (tyL != null) {
            tyL.A0B();
        }
        this.A05.A02(this);
        AnonymousClass0fD.A09(-1051793393, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(2035664029);
        C14557TyM.super.onDetach();
        C14556TyL tyL = this.A03;
        if (tyL != null) {
            C46471DfZ dfZ = this.A02;
            dfZ.getClass();
            tyL.A0M(dfZ);
        }
        AnonymousClass0fD.A09(1851769086, A022);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity = getActivity();
        0hq parentFragmentManager = getParentFragmentManager();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !parentFragmentManager.A0G) {
            C14557TyM.super.onDismiss(dialogInterface);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            bundle.putBoolean("from_config_changes", true);
        }
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        bundle.putBundle("cds_open_screen_config", dfZ.A00());
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-150087008);
        C14557TyM.super.onStart();
        C14556TyL tyL = this.A03;
        if (tyL != null) {
            tyL.A0N(this.A02);
        }
        AnonymousClass0fD.A09(-1611245744, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C14580Tyk tyk = this.A05;
        C46471DfZ dfZ = this.A02;
        dfZ.getClass();
        tyk.A01(view, this, dfZ);
    }
}
