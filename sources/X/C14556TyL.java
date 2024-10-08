package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TyL  reason: case insensitive filesystem */
public final class C14556TyL implements X0I {
    public int A00;
    public X22 A01;
    public C14551TyG A02;
    public C14554TyJ A03;
    public C18492Vsn A04;
    public C14577Tyh A05;
    public C14576Tyg A06;
    public 2Tb A07;
    public C14557TyM A08;
    public C46626Di6 A09;
    public C307796Rn A0A;
    public Integer A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Deque A0G;
    public final List A0H;
    public final VME A0I;

    public final void A0E(Context context, C21043XAw xAw, C14568TyX tyX) {
        String str;
        C14559TyO tyO = (C14559TyO) this.A0G.peek();
        if (tyO == null) {
            str = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
        } else if (this.A0F) {
            str = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
        } else {
            tyO.A03.stop();
            Integer A032 = tyX.A03();
            int A0D2 = C13988Tno.A0D(tyX.A04());
            X5O A012 = tyX.A01();
            Boolean A022 = tyX.A02();
            A022.getClass();
            Context context2 = context;
            C21043XAw xAw2 = xAw;
            A00(context2, this, xAw2, tyX.A00(), A012, A032, A0D2, A022.booleanValue());
            return;
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str);
    }

    public static void A00(Context context, C14556TyL tyL, C21043XAw xAw, C46626Di6 di6, X5O x5o, Integer num, int i, boolean z) {
        int i2;
        if (tyL.A02 != null) {
            C21043XAw xAw2 = xAw;
            tyL.A04(xAw);
            View Aqo = xAw.Aqo(context);
            C14551TyG tyG = tyL.A02;
            if (tyG != null) {
                C14558TyN.A02(Aqo, tyG.getContentPager(), num, true);
                A02(tyL, xAw);
                xAw.Dyl();
                C14555TyK tyK = new C14555TyK(tyL, di6);
                if (Aqo != null) {
                    if (Aqo.isLaidOut()) {
                        tyK.run();
                    } else {
                        ViewTreeObserver viewTreeObserver = Aqo.getViewTreeObserver();
                        viewTreeObserver.addOnGlobalLayoutListener(new WCC(1, Aqo, viewTreeObserver, tyK));
                    }
                    Deque deque = tyL.A0G;
                    if (!deque.isEmpty()) {
                        tyL.A03(xAw);
                    }
                    boolean z2 = z;
                    deque.push(new C14559TyO(Aqo, xAw2, x5o, i, z2));
                    tyL.A05(z2);
                    C14559TyO tyO = (C14559TyO) deque.peek();
                    if (tyO == null) {
                        1Kn.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
                        i2 = 32;
                    } else {
                        i2 = tyO.A02;
                    }
                    Window A072 = tyL.A07(context);
                    if (A072 != null) {
                        A072.setSoftInputMode(i2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Given null view.");
            }
            throw new IllegalStateException("Cannot show Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
        throw new IllegalStateException("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    private void A01(Context context, Integer num) {
        boolean z;
        int i;
        Deque deque = this.A0G;
        C14559TyO tyO = (C14559TyO) deque.pop();
        C14559TyO tyO2 = (C14559TyO) deque.peek();
        if (tyO2 == null) {
            1Kn.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current limited theme setting but found null.");
            z = false;
        } else {
            z = tyO2.A04;
        }
        A05(z);
        C14559TyO tyO3 = (C14559TyO) deque.peek();
        if (tyO3 == null) {
            1Kn.A02("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
            i = 32;
        } else {
            i = tyO3.A02;
        }
        Window A072 = A07(context);
        if (A072 != null) {
            A072.setSoftInputMode(i);
        }
        if (this.A02 != null) {
            tyO.A03.stop();
            this.A0H.add(tyO);
            C14559TyO tyO4 = (C14559TyO) deque.peek();
            if (tyO4 == null) {
                throw new IllegalStateException("Cannot pop Screen content with an empty CDS bottom sheet or full screen.");
            } else if (this.A02 != null) {
                C14576Tyg tyg = this.A06;
                if (tyg != null) {
                    tyg.A02.post(new C14591Tyv(tyg));
                }
                C14577Tyh tyh = this.A05;
                if (tyh != null) {
                    tyh.A02.post(new C19918Whn(tyh));
                }
                C21043XAw xAw = tyO4.A03;
                A04(xAw);
                View view = tyO4.A00;
                if (view == null) {
                    view = xAw.Aqo(context);
                }
                tyO4.A00 = view;
                C14558TyN.A02(view, this.A02.getContentPager(), num, false);
                A02(this, xAw);
                xAw.Dyl();
                A03(xAw);
            } else {
                throw new IllegalStateException("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
            }
        } else {
            throw new IllegalStateException("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
    }

    private void A03(C21043XAw xAw) {
        String AbU;
        VME vme = this.A0I;
        if (vme != null && (AbU = xAw.AbU()) != null && !AbU.isEmpty()) {
            vme.A00.A0E("not_activity_or_fragment", new C14596Tz0(AbU));
        }
    }

    private void A04(C21043XAw xAw) {
        String str;
        C18492Vsn vsn = this.A04;
        if (vsn != null) {
            C16501Uvx Bcz = xAw.Bcz();
            0qQ.A0B(Bcz, 0);
            C16501Uvx uvx = vsn.A02;
            if (uvx == null) {
                str = "currentType";
            } else if (uvx != Bcz) {
                vsn.A02 = Bcz;
                07U A072 = vsn.A03.mLifecycleRegistry.A07();
                07U r2 = 07U.A04;
                if (A072.compareTo(r2) >= 0) {
                    0h9 r1 = vsn.A00;
                    str = "lifecycle";
                    if (r1 != null) {
                        r1.A0C(07U.A05);
                        0eP r0 = (0eP) vsn.A04.get(Bcz);
                        if (r0 == null) {
                            r0 = C18492Vsn.A00((Bundle) null, vsn, Bcz);
                        }
                        0h9 r02 = ((WE8) r0.A01).A00;
                        vsn.A00 = r02;
                        vsn.A01 = (X5M) r0.A00;
                        if (r02 != null) {
                            r02.A0C(r2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private void A05(boolean z) {
        boolean z2;
        boolean z3 = this.A0E;
        Float valueOf = Float.valueOf(0.0f);
        if (!z3) {
            if (z) {
                C21255XRa xRa = C21255XRa.A2M;
                C361838gt C5w = 1Kq.A00.C5w();
                0qQ.A0B(C5w, 0);
                A0J(C21115XFf.A00(C5w).AIK(xRa), valueOf);
                z2 = true;
            } else {
                return;
            }
        } else if (!z) {
            C14554TyJ tyJ = this.A03;
            if (tyJ != null) {
                ColorData colorData = new ColorData(16777215, 16777215);
                C307796Rn r0 = this.A0A;
                r0.getClass();
                tyJ.A01(colorData, r0, 0.0f);
            }
            z2 = false;
        } else {
            return;
        }
        this.A0E = z2;
    }

    public final View A06(String str) {
        for (C14559TyO tyO : this.A0G) {
            C21043XAw xAw = tyO.A03;
            if (xAw.AgM().equals(str)) {
                return xAw.BCk();
            }
        }
        return null;
    }

    public final Window A07(Context context) {
        Context context2;
        Activity activity;
        C14559TyO tyO = (C14559TyO) this.A0G.peek();
        Window window = null;
        if (tyO != null) {
            context2 = tyO.A03.getContext();
            window = null;
        } else {
            context2 = null;
        }
        2Tb r0 = this.A07;
        if (r0 != null) {
            return r0.getWindow();
        }
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        } else if (!(context instanceof Activity)) {
            return window;
        } else {
            activity = (Activity) context;
        }
        return activity.getWindow();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.TyG, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public final C14554TyJ A08(Context context, X22 x22, C46471DfZ dfZ, boolean z) {
        Activity A002;
        this.A01 = x22;
        C46471DfZ dfZ2 = dfZ;
        Context context2 = context;
        this.A0A = new C46606Dhm(context2, dfZ2.A0F);
        C14574Tye tye = new C14574Tye(this);
        C14575Tyf tyf = new C14575Tyf(this);
        C361838gt C5w = 1Kq.A00.C5w();
        Context context3 = context2;
        this.A06 = new C14576Tyg(context3, dfZ2.A04, tye, this.A0A, dfZ2.A0J);
        this.A05 = new C14577Tyh(context2, tyf, C5w, tye, this.A0A);
        this.A09 = dfZ2.A0E;
        if (!z && (A002 = C46604Dhk.A00(context2)) != null) {
            this.A0B = Integer.valueOf(A002.getRequestedOrientation());
            C2594141p.A00(A002, 1);
        }
        C46626Di6 di6 = this.A09;
        0qQ.A0B(di6, 2);
        ? frameLayout = new FrameLayout(context2);
        frameLayout.A02 = di6;
        Context context4 = frameLayout.getContext();
        frameLayout.A00 = new FrameLayout(context4);
        frameLayout.A01 = new C14558TyN(context4);
        frameLayout.getContentPager().A01 = frameLayout.A02.A01;
        frameLayout.getContentPager().setImportantForAccessibility(1);
        frameLayout.addView(frameLayout.getContentPager());
        frameLayout.addView(frameLayout.getHeaderContainer());
        this.A02 = frameLayout;
        frameLayout.getContentPager().A00 = this;
        C307796Rn r10 = this.A0A;
        C14551TyG tyG = this.A02;
        boolean z2 = this.A0D;
        0qQ.A0B(r10, 1);
        AnonymousClass7TF.A1D(tyG, 2, C5w);
        this.A03 = new C14554TyJ(context2, tyG, C5w, dfZ2, r10, z2);
        C14559TyO tyO = (C14559TyO) this.A0G.peek();
        if (tyO != null) {
            C21043XAw xAw = tyO.A03;
            A04(xAw);
            if (tyO.A00 == null) {
                View Aqo = xAw.Aqo(context2);
                tyO.A00 = Aqo;
                C14558TyN.A02(Aqo, this.A02.getContentPager(), AnonymousClass05K.A00, false);
                A02(this, xAw);
                xAw.Dyl();
            } else {
                throw new IllegalStateException("NavStack entry should have no view associated at Fragment's view creation");
            }
        }
        return this.A03;
    }

    public final 2Tb A09(Context context, Fragment fragment, C46471DfZ dfZ) {
        float f;
        Q3M q3m;
        C307796Rn r0;
        int i;
        C46626Di6 BTV;
        C46626Di6 di6;
        C46626Di6 di62;
        Fragment fragment2;
        C46626Di6 di63 = dfZ.A0E;
        this.A09 = di63;
        Integer num = dfZ.A0F;
        this.A0A = new C46606Dhm(context, num);
        C46626Di6 di64 = C46626Di6.FULL_SCREEN;
        if (di63 != di64) {
            this.A09 = di63;
            2Tb r2 = new 2Tb(context);
            EX6 ex6 = dfZ.A0C;
            C48272Ebr ebr = C48272Ebr.$redex_init_class;
            int ordinal = ex6.ordinal();
            if (ordinal == -1) {
                1Kn.A02("CDSBloksBottomSheetDialogHelper", AnonymousClass7TG.A0m(ex6, "Invalid enum value for DimmedBackgroundTapToDismiss: ", new StringBuilder()));
            } else if (ordinal != 0) {
                if (ordinal == 1) {
                    r2.setCanceledOnTouchOutside(true);
                } else if (ordinal == 2) {
                    r2.setCanceledOnTouchOutside(false);
                } else {
                    throw new RuntimeException();
                }
            }
            Integer num2 = dfZ.A02;
            Integer num3 = AnonymousClass05K.A0C;
            if (num2 == num3) {
                r2.A0E = true;
            }
            if (dfZ.A01 == num3) {
                r2.A0G = true;
            }
            CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = dfZ.A0A;
            if (cdsOpenScreenConfig$BottomSheetMargins != null) {
                r2.A04.setPadding(cdsOpenScreenConfig$BottomSheetMargins.A01, cdsOpenScreenConfig$BottomSheetMargins.A03, cdsOpenScreenConfig$BottomSheetMargins.A02, cdsOpenScreenConfig$BottomSheetMargins.A00);
            } else if (dfZ.A0B != EX5.TOP_ROUNDED || !VJ0.A00()) {
                int A002 = (int) C14573Tyc.A00(context, 4.0f);
                r2.A04.setPadding(A002, A002, A002, A002);
            } else {
                if (C250563lf.A0j()) {
                    f = (float) 1AW.A00(0Tu.A05, 19159230632165981L);
                } else {
                    f = 0.0f;
                }
                r2.A04.setPadding(0, (int) C14573Tyc.A00(context, f), 0, 0);
            }
            CdsBottomSheetTopSpan cdsBottomSheetTopSpan = dfZ.A08;
            float A003 = V52.A00(di63);
            if (!di63.A01) {
                q3m = new Q3M(context, cdsBottomSheetTopSpan, A003);
                r2.A05(q3m);
            } else {
                r2.A05(new C11845ShX(cdsBottomSheetTopSpan, A003, dfZ.A0I));
                q3m = null;
            }
            r2.A07 = q3m;
            C14597Tz1 tz1 = r2.A09;
            tz1.A03(2Tb.A02(r2.A08, q3m), r2.isShowing());
            if (r2.A0H) {
                r2.A0H = false;
            }
            if (!r2.A0B) {
                r2.A0B = true;
                2Tb.A01(r2, r2.A00);
            }
            tz1.A09 = true;
            C46627Di7 di7 = dfZ.A0D;
            if (di7 != C46627Di7.AUTO ? di7 == C46627Di7.DISABLED : di63 == C46626Di6.FULL_SHEET) {
                C18286Vp9 vp9 = C18286Vp9.A00;
                tz1.A06 = Collections.singletonList(2Tb.A0M);
                tz1.A02 = vp9;
            }
            C46606Dhm dhm = new C46606Dhm(context, num);
            CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = dfZ.A07;
            int A004 = C16770V5d.A00(context, C21259XRe.A0p, dhm);
            if (r2.A02 != A004) {
                r2.A02 = A004;
                2Tb.A01(r2, r2.A00);
            }
            r2.A04(((float) Color.alpha(A004)) / 255.0f);
            if (!0qQ.A0K(cdsBottomSheetDimmingBehaviour, CdsBottomSheetDimmingBehaviour.Default.A00)) {
                if (cdsBottomSheetDimmingBehaviour instanceof CdsBottomSheetDimmingBehaviour.FixedAlpha) {
                    float f2 = ((CdsBottomSheetDimmingBehaviour.FixedAlpha) cdsBottomSheetDimmingBehaviour).A00;
                    Float f3 = r2.A0A;
                    if (f3 == null || f3.floatValue() != f2) {
                        r2.A0A = Float.valueOf(f2);
                        2Tb.A01(r2, r2.A00);
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            Window window = r2.getWindow();
            if (window != null) {
                window.setStatusBarColor(0);
            }
            this.A07 = r2;
            r2.A06 = new C18965WEs(context, this);
            if (di63 == C46626Di6.HALF_SHEET_WITH_UNDERLAY) {
                N09 n09 = new N09(context);
                this.A0A.getClass();
                this.A07.setOnShowListener(new C71252OgJ(n09, 0));
            }
            2Tb r3 = this.A07;
            Activity A005 = C46604Dhk.A00(context);
            if (A005 != null) {
                List A032 = C46604Dhk.A03(A005);
                C14557TyM tyM = null;
                if (A032 != null && !A032.isEmpty()) {
                    Iterator it = A032.iterator();
                    while (it.hasNext() && (fragment2 = (Fragment) it.next()) != fragment) {
                        tyM = fragment2;
                    }
                }
                boolean z = true;
                if (1Kq.A00.Ez3() && (tyM instanceof G9A) && ((BTV = tyM.BTV()) == (di6 = C46626Di6.FULL_SHEET) || BTV == di64 || !((di62 = this.A09) == di6 || di62 == di64))) {
                    z = false;
                }
                this.A0D = z;
                if (tyM instanceof C14557TyM) {
                    C14557TyM tyM2 = tyM;
                    this.A08 = tyM2;
                    ColorData colorData = dfZ.A06;
                    if (colorData != null) {
                        tyM2.A0N(colorData);
                    }
                    r3.A04(0.0f);
                    r3.A05 = new VL4(this);
                } else {
                    ColorData colorData2 = dfZ.A06;
                    if (!(colorData2 == null || (r0 = this.A0A) == null)) {
                        if (r0.CRA()) {
                            i = colorData2.A00;
                        } else {
                            i = colorData2.A01;
                        }
                        if (i == 0) {
                            r3.A04(0.0f);
                            return r3;
                        }
                    }
                }
                return r3;
            }
            throw new IllegalStateException(AnonymousClass000.A00(421));
        }
        throw new UnsupportedOperationException("onFragmentCreateDialog() is not supported for CDS full screen.");
    }

    public final String A0A() {
        C14559TyO tyO;
        Deque deque = this.A0G;
        if (deque.isEmpty() || (tyO = (C14559TyO) deque.peek()) == null) {
            return null;
        }
        return tyO.A03.AbU();
    }

    public final void A0B() {
        C14554TyJ tyJ;
        C14557TyM tyM = this.A08;
        if (!(tyM == null || (tyJ = C14557TyM.A01(tyM).A03) == null || tyJ.A08 == null)) {
            tyJ.setForeground((Drawable) null);
        }
        C14551TyG tyG = this.A02;
        if (tyG != null) {
            tyG.getHeaderContainer().removeAllViews();
        }
        Deque<C14559TyO> deque = this.A0G;
        for (C14559TyO tyO : deque) {
            if (tyO.A00 != null) {
                if (tyO == deque.peek()) {
                    tyO.A03.stop();
                }
                tyO.A03.AOx();
                tyO.A00 = null;
            }
        }
        C14576Tyg tyg = this.A06;
        if (tyg != null) {
            tyg.A00 = null;
            this.A06 = null;
        }
        C14577Tyh tyh = this.A05;
        if (tyh != null) {
            tyh.A00 = null;
            this.A05 = null;
        }
    }

    public final void A0C(Context context) {
        X22 x22;
        X5O x5o;
        C14551TyG tyG = this.A02;
        if (!(tyG == null || tyG.getVisibility() == 0)) {
            this.A02.setVisibility(0);
        }
        Deque deque = this.A0G;
        C14559TyO tyO = (C14559TyO) deque.peek();
        if (tyO != null && (x5o = tyO.A01) != null && x5o.CxY()) {
            return;
        }
        if (deque.size() > 1) {
            A01(context, (Integer) null);
        } else if (this.A09 != C46626Di6.FULL_SCREEN || (x22 = this.A01) == null) {
            2Tb r0 = this.A07;
            if (r0 != null) {
                r0.dismiss();
            }
        } else {
            x22.D9W();
        }
    }

    public final void A0D(Context context) {
        Activity A002;
        Deque<C14559TyO> deque = this.A0G;
        for (C14559TyO tyO : deque) {
            tyO.A03.destroy();
        }
        deque.clear();
        if (!(this.A0B == null || (A002 = C46604Dhk.A00(context)) == null)) {
            C2594141p.A00(A002, this.A0B.intValue());
            this.A0B = null;
        }
        this.A08 = null;
    }

    public final void A0F(Context context, C21043XAw xAw, C48061EUf eUf, String str) {
        String str2;
        Deque<C14559TyO> deque = this.A0G;
        if (deque.isEmpty() || this.A02 == null) {
            str2 = "Cannot replace from an empty bottom sheet.";
        } else {
            C14559TyO tyO = (C14559TyO) deque.peekFirst();
            if (tyO == null) {
                str2 = "Invalid screen state. Cannot have a null screen.";
            } else {
                C21043XAw xAw2 = xAw;
                if (str == null || C21043XAw.A00(tyO, str)) {
                    A0E(context, xAw, eUf);
                    A0O(tyO.A03.AgM());
                    return;
                } else if (deque.isEmpty()) {
                    str2 = "Attempting to replace a Screen when the stack is empty. The new screen was not added.";
                } else {
                    A04(xAw);
                    int i = 0;
                    for (C14559TyO A002 : deque) {
                        if (C21043XAw.A00(A002, str)) {
                            ArrayList arrayList = new ArrayList(deque);
                            arrayList.set(i, new C14559TyO((View) null, xAw2, (X5O) null, 32, false));
                            deque.clear();
                            deque.addAll(arrayList);
                            return;
                        }
                        i++;
                    }
                    str2 = "Attempting to replace a Screen with an invalid screen ID. The new screen was not added.";
                }
            }
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0G(Context context, C16399UuH uuH, String str) {
        String str2;
        Deque deque = this.A0G;
        if (deque.isEmpty() || this.A02 == null) {
            str2 = "Cannot pop from an empty bottom sheet.";
        } else if (deque.size() == 1) {
            str2 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
        } else if (str == null) {
            A01(context, uuH.A00);
            return;
        } else {
            A0H(context, (Integer) null, str);
            return;
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0H(Context context, Integer num, String str) {
        String str2;
        Deque<C14559TyO> deque = this.A0G;
        C14559TyO tyO = (C14559TyO) deque.peekFirst();
        if (tyO == null || C21043XAw.A00(tyO, str)) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            int i = 0;
            for (C14559TyO A002 : deque) {
                if (!C21043XAw.A00(A002, str)) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A01(context, num);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r6 == r1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r11 == r1) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r2 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        if (r0 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        r5 = X.C46626Di6.FULL_SCREEN;
        r0 = X.AnonymousClass7TF.A1W(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r11 == r5) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r3 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        r7 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        if (r7 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0030, code lost:
        r0 = "Bottom sheet should not be null when we try to update it";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        X.1Kn.A02("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        if (r11 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        if (r6 == r11) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        if (r9.A03 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
        r6.getClass();
        r3 = r9.A03;
        r8 = X.DbW.A1Z(r3);
        r0 = r6.A01;
        r2 = r11.A01;
        r1 = X.AnonymousClass7TF.A1S(r0 ? 1 : 0, r2 ? 1 : 0);
        r0 = X.V52.A00(r6);
        r6 = X.V52.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r1 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r0 != r6) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        r9.A09 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        if (r10 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        r0 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        if (r0 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        r0 = "Overlaying bottom sheet drag listener should not be null when we try to override the background color";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        if (r2 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        r1 = new X.C11845ShX((com.meta.foa.cds.CdsBottomSheetTopSpan) null, r6, r8);
        r7.A08 = r1;
        r7.A07 = null;
        r6 = r7.A09;
        r1 = new X.C70652Tj[]{X.2Tb.A0M, r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        r6.A03(r1, r7.isShowing());
        r7.A09.A0H.add(new X.C18971WEy(r3, r7));
        r3.A0A = r11;
        r0 = r3.A0H;
        r0.A02 = r11;
        r0.getContentPager().A01 = r2;
        r0 = X.C46471DfZ.A0P;
        r2 = r3.A0J.A0D;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r2 != X.C46627Di7.AUTO) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r11 == X.C46626Di6.FULL_SHEET) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        if (r11 != r5) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        r3.A0B = !r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r2 != X.C46627Di7.DISABLED) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r1 = new X.C18968WEv(r6);
        r7.A08 = r1;
        r7.A07 = r1;
        r6 = r7.A09;
        r1 = new X.C70652Tj[]{X.2Tb.A0M, r1, r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r0 = "Invalid operation - it is not possible to update the bottom sheet from full screen to one of the sheet variants";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        r0.A0N(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r11 == r0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r6 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r1 = X.C46626Di6.FULL_SCREEN;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(com.facebook.dsp.core.ColorData r10, X.C46626Di6 r11) {
        /*
            r9 = this;
            X.Di6 r6 = r9.A09
            r3 = 1
            if (r6 == 0) goto L_0x000e
            X.Di6 r0 = X.C46626Di6.FULL_SCREEN
            if (r6 != r0) goto L_0x000e
            if (r11 == 0) goto L_0x000e
            r2 = 1
            if (r11 != r0) goto L_0x0011
        L_0x000e:
            r2 = 0
            if (r6 == 0) goto L_0x0018
        L_0x0011:
            X.Di6 r1 = X.C46626Di6.FULL_SCREEN
            if (r6 == r1) goto L_0x0018
            r0 = 1
            if (r11 == r1) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r4 = "CDSBloksBottomSheetDelegate"
            if (r2 != 0) goto L_0x00ca
            if (r0 != 0) goto L_0x00ca
            X.Di6 r5 = X.C46626Di6.FULL_SCREEN
            boolean r0 = X.AnonymousClass7TF.A1W(r6, r5)
            if (r11 == r5) goto L_0x0028
            r3 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x0035
            X.2Tb r7 = r9.A07
            if (r7 != 0) goto L_0x0036
            java.lang.String r0 = "Bottom sheet should not be null when we try to update it"
        L_0x0032:
            X.1Kn.A02(r4, r0)
        L_0x0035:
            return
        L_0x0036:
            if (r11 == 0) goto L_0x005f
            if (r6 == r11) goto L_0x005f
            X.TyJ r0 = r9.A03
            if (r0 == 0) goto L_0x005f
            r6.getClass()
            X.TyJ r3 = r9.A03
            boolean r8 = X.DbW.A1Z(r3)
            boolean r0 = r6.A01
            boolean r2 = r11.A01
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r2)
            float r0 = X.V52.A00(r6)
            float r6 = X.V52.A00(r11)
            if (r1 == 0) goto L_0x0068
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0068
        L_0x005d:
            r9.A09 = r11
        L_0x005f:
            if (r10 == 0) goto L_0x0035
            X.TyM r0 = r9.A08
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "Overlaying bottom sheet drag listener should not be null when we try to override the background color"
            goto L_0x0032
        L_0x0068:
            if (r2 == 0) goto L_0x00b8
            r0 = 0
            X.ShX r1 = new X.ShX
            r1.<init>(r0, r6, r8)
            r7.A08 = r1
            r7.A07 = r0
            X.Tz1 r6 = r7.A09
            X.2Tj r0 = X.2Tb.A0M
            X.2Tj[] r1 = new X.C70652Tj[]{r0, r1}
        L_0x007c:
            boolean r0 = r7.isShowing()
            r6.A03(r1, r0)
            X.WEy r1 = new X.WEy
            r1.<init>(r3, r7)
            X.Tz1 r0 = r7.A09
            java.util.List r0 = r0.A0H
            r0.add(r1)
            r3.A0A = r11
            X.TyG r0 = r3.A0H
            r0.A02 = r11
            X.TyN r0 = r0.getContentPager()
            r0.A01 = r2
            X.F1a r0 = X.C46471DfZ.A0P
            X.DfZ r0 = r3.A0J
            X.Di7 r2 = r0.A0D
            X.Di7 r0 = X.C46627Di7.AUTO
            r1 = 1
            if (r2 != r0) goto L_0x00b1
            X.Di6 r0 = X.C46626Di6.FULL_SHEET
            if (r11 == r0) goto L_0x00ac
            if (r11 != r5) goto L_0x00b6
        L_0x00ac:
            r0 = r1 ^ 1
            r3.A0B = r0
            goto L_0x005d
        L_0x00b1:
            X.Di7 r0 = X.C46627Di7.DISABLED
            if (r2 != r0) goto L_0x00b6
            goto L_0x00ac
        L_0x00b6:
            r1 = 0
            goto L_0x00ac
        L_0x00b8:
            X.WEv r1 = new X.WEv
            r1.<init>(r6)
            r7.A08 = r1
            r7.A07 = r1
            X.Tz1 r6 = r7.A09
            X.2Tj r0 = X.2Tb.A0M
            X.2Tj[] r1 = new X.C70652Tj[]{r0, r1, r1}
            goto L_0x007c
        L_0x00ca:
            java.lang.String r0 = "Invalid operation - it is not possible to update the bottom sheet from full screen to one of the sheet variants"
            goto L_0x0032
        L_0x00ce:
            r0.A0N(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14556TyL.A0I(com.facebook.dsp.core.ColorData, X.Di6):void");
    }

    public final void A0J(ColorData colorData, Float f) {
        C14554TyJ tyJ = this.A03;
        if (tyJ != null) {
            float floatValue = f.floatValue();
            C307796Rn r0 = this.A0A;
            r0.getClass();
            tyJ.A01(colorData, r0, floatValue);
        }
    }

    public final void A0K(C21043XAw xAw, C16400UuI uuI, String str) {
        String str2;
        Deque<C14559TyO> deque = this.A0G;
        if (deque.isEmpty()) {
            str2 = "Attempting to insert a new Screen when the stack is empty. The new screen was not added.";
        } else {
            C14559TyO tyO = (C14559TyO) deque.peekLast();
            if (tyO == null || !C21043XAw.A00(tyO, str)) {
                int i = 0;
                for (C14559TyO tyO2 : deque) {
                    i++;
                    if (str.equals(tyO2.A03.AgM())) {
                        ArrayList arrayList = new ArrayList(deque);
                        C21043XAw xAw2 = xAw;
                        arrayList.add(i, new C14559TyO((View) null, xAw2, uuI.A01, uuI.A00, uuI.A02));
                        deque.clear();
                        deque.addAll(arrayList);
                        return;
                    }
                }
                str2 = "Attempting to insert a new Screen insert before with an invalid screen ID. The new screen was not added.";
            } else {
                str2 = "Attempting to insert a new Screen insert before the root screen in the stack. The new screen was not added.";
            }
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public final void A0L(C48059EUd eUd, Runnable runnable) {
        this.A0C = runnable;
        if (this.A09 == C46626Di6.FULL_SCREEN) {
            this.A0F = true;
            this.A00 = 1;
            return;
        }
        2Tb r2 = this.A07;
        if (r2 != null) {
            this.A0F = true;
            this.A00 = 1;
            if (eUd.A00 == AnonymousClass05K.A0C) {
                r2.A03();
            } else {
                r2.dismiss();
            }
        }
    }

    public final void A0M(C46471DfZ dfZ) {
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = dfZ.A00;
        if (cdsOpenScreenDismissCallback != null) {
            cdsOpenScreenDismissCallback.D9E(this.A00);
        }
        Runnable runnable = this.A0C;
        if (runnable != null) {
            runnable.run();
        }
        this.A03 = null;
        this.A02 = null;
        this.A07 = null;
        this.A0C = null;
        this.A01 = null;
    }

    public final void A0N(C46471DfZ dfZ) {
        C14554TyJ tyJ;
        C14560TyP tyP;
        if (dfZ != null && !dfZ.A0K && (tyJ = this.A03) != null && 1Kq.A00.Ez3() && tyJ.A04 == null && (tyP = tyJ.A06) != null && tyP.getAlpha() != 0.0f) {
            if (tyP.getVisibility() == 0 || tyP.getAlpha() == 0.0f) {
                ViewPropertyAnimator animate = tyP.animate();
                animate.setDuration(600);
                animate.setStartDelay(500);
                animate.setInterpolator(new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f));
                animate.alpha(0.0f);
                animate.withEndAction(new C14607TzD(tyP, tyJ));
                animate.start();
                tyJ.A04 = animate;
                return;
            }
            tyP.setAlpha(0.0f);
        }
    }

    public final void A0O(String str) {
        String str2;
        Deque deque = this.A0G;
        C14559TyO tyO = (C14559TyO) deque.peekFirst();
        if (tyO == null || C21043XAw.A00(tyO, str)) {
            str2 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
        } else {
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                C14559TyO tyO2 = (C14559TyO) it.next();
                C21043XAw xAw = tyO2.A03;
                if (str.equals(xAw.AgM())) {
                    if (tyO2.A00 != null) {
                        xAw.AOx();
                        tyO2.A00 = null;
                    }
                    xAw.destroy();
                    it.remove();
                    return;
                }
            }
            str2 = "No screen found with target ID, so the screen was not removed.";
        }
        1Kn.A02("CDSBloksBottomSheetDelegate", str2);
    }

    public C14556TyL(VME vme) {
        this.A0G = new ArrayDeque();
        this.A0H = new ArrayList();
        this.A0E = false;
        this.A0F = false;
        this.A0D = true;
        this.A0I = vme;
    }

    public static void A02(C14556TyL tyL, C21043XAw xAw) {
        View BCk = xAw.BCk();
        C14551TyG tyG = tyL.A02;
        if (tyG != null) {
            ViewGroup headerContainer = tyG.getHeaderContainer();
            headerContainer.removeAllViews();
            headerContainer.addView(BCk);
        }
    }

    public C14556TyL() {
        this((VME) null);
    }
}
