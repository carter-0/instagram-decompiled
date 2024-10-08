package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;
import java.util.ArrayList;

public final class U5n extends C16747V4e implements C20820Wzu {
    public static final Interpolator A0Q = new AccelerateInterpolator();
    public static final Interpolator A0R = new DecelerateInterpolator();
    public int A00 = 0;
    public Context A01;
    public Context A02;
    public View A03;
    public U5r A04;
    public X8B A05;
    public V4T A06;
    public C18004Vjg A07;
    public ActionBarContainer A08;
    public ActionBarContextView A09;
    public ActionBarOverlayLayout A0A;
    public C20939X5h A0B;
    public ArrayList A0C = new ArrayList();
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public Activity A0K;
    public ArrayList A0L = new ArrayList();
    public boolean A0M = true;
    public final AnonymousClass04L A0N = new U7S(this, 2);
    public final AnonymousClass04L A0O = new U7S(this, 3);
    public final AnonymousClass04M A0P = new C18939WDs(this);

    public static void A01(U5n u5n, boolean z) {
        View view;
        View view2;
        View view3;
        boolean z2 = u5n.A0F;
        boolean z3 = true;
        if (!u5n.A0J && z2) {
            z3 = false;
        }
        boolean z4 = u5n.A0M;
        if (z3) {
            if (!z4) {
                u5n.A0M = true;
                C18004Vjg vjg = u5n.A07;
                if (vjg != null) {
                    vjg.A00();
                }
                u5n.A08.setVisibility(0);
                if (u5n.A00 != 0 || (!u5n.A0I && !z)) {
                    u5n.A08.setAlpha(1.0f);
                    u5n.A08.setTranslationY(0.0f);
                    if (u5n.A0D && (view2 = u5n.A03) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    u5n.A0O.CvE((View) null);
                } else {
                    u5n.A08.setTranslationY(0.0f);
                    float f = (float) (-u5n.A08.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        u5n.A08.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    u5n.A08.setTranslationY(f);
                    C18004Vjg vjg2 = new C18004Vjg();
                    04K A032 = 03v.A03(u5n.A08);
                    A032.A03(0.0f);
                    AnonymousClass04M r4 = u5n.A0P;
                    View view4 = (View) A032.A00.get();
                    if (view4 != null) {
                        AnonymousClass04H r1 = null;
                        if (r4 != null) {
                            r1 = new AnonymousClass04H(view4, r4);
                        }
                        view4.animate().setUpdateListener(r1);
                    }
                    if (!vjg2.A03) {
                        vjg2.A04.add(A032);
                    }
                    if (u5n.A0D && (view3 = u5n.A03) != null) {
                        view3.setTranslationY(f);
                        04K A033 = 03v.A03(view3);
                        A033.A03(0.0f);
                        if (!vjg2.A03) {
                            vjg2.A04.add(A033);
                        }
                    }
                    Interpolator interpolator = A0R;
                    boolean z5 = vjg2.A03;
                    if (!z5) {
                        vjg2.A01 = interpolator;
                        vjg2.A00 = 250;
                    }
                    AnonymousClass04L r0 = u5n.A0O;
                    if (!z5) {
                        vjg2.A02 = r0;
                    }
                    u5n.A07 = vjg2;
                    vjg2.A01();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = u5n.A0A;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (z4) {
            u5n.A0M = false;
            C18004Vjg vjg3 = u5n.A07;
            if (vjg3 != null) {
                vjg3.A00();
            }
            if (u5n.A00 != 0 || (!u5n.A0I && !z)) {
                u5n.A0N.CvE((View) null);
                return;
            }
            u5n.A08.setAlpha(1.0f);
            u5n.A08.setTransitioning(true);
            C18004Vjg vjg4 = new C18004Vjg();
            float f2 = (float) (-u5n.A08.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                u5n.A08.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            04K A034 = 03v.A03(u5n.A08);
            A034.A03(f2);
            AnonymousClass04M r2 = u5n.A0P;
            View view5 = (View) A034.A00.get();
            if (view5 != null) {
                AnonymousClass04H r12 = null;
                if (r2 != null) {
                    r12 = new AnonymousClass04H(view5, r2);
                }
                view5.animate().setUpdateListener(r12);
            }
            if (!vjg4.A03) {
                vjg4.A04.add(A034);
            }
            if (u5n.A0D && (view = u5n.A03) != null) {
                04K A035 = 03v.A03(view);
                A035.A03(f2);
                if (!vjg4.A03) {
                    vjg4.A04.add(A035);
                }
            }
            Interpolator interpolator2 = A0Q;
            boolean z6 = vjg4.A03;
            if (!z6) {
                vjg4.A01 = interpolator2;
                vjg4.A00 = 250;
            }
            AnonymousClass04L r02 = u5n.A0N;
            if (!z6) {
                vjg4.A02 = r02;
            }
            u5n.A07 = vjg4;
            vjg4.A01();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0J
            if (r9 == 0) goto L_0x00c6
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r8.A0J = r0
            r0 = 0
        L_0x000a:
            A01(r8, r0)
        L_0x000d:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A08
            boolean r0 = r0.isLaidOut()
            r4 = 8
            r3 = 0
            X.X5h r7 = r8.A0B
            if (r0 == 0) goto L_0x00cd
            if (r9 == 0) goto L_0x008a
            r4 = 4
            r0 = 100
            X.WDZ r7 = (X.WDZ) r7
            androidx.appcompat.widget.Toolbar r2 = r7.A09
            X.04K r6 = X.03v.A03(r2)
            r5 = 0
            r6.A02(r5)
            r6.A04(r0)
            X.U7T r0 = new X.U7T
            r0.<init>(r7, r4)
            r6.A07(r0)
            androidx.appcompat.widget.ActionBarContextView r4 = r8.A09
            r0 = 200(0xc8, double:9.9E-322)
            X.04K r2 = r4.A03
            if (r2 == 0) goto L_0x0041
            r2.A00()
        L_0x0041:
            int r2 = r4.getVisibility()
            if (r2 == 0) goto L_0x004a
            r4.setAlpha(r5)
        L_0x004a:
            X.04K r5 = X.03v.A03(r4)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.A02(r2)
            r5.A04(r0)
            X.WDr r1 = r4.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A03 = r5
            r1.A00 = r3
            r5.A07(r1)
        L_0x0061:
            X.Vjg r3 = new X.Vjg
            r3.<init>()
            java.util.ArrayList r2 = r3.A04
            r2.add(r6)
            java.lang.ref.WeakReference r0 = r6.A00
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0087
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
        L_0x007d:
            r5.A05(r0)
            r2.add(r5)
            r3.A01()
            return
        L_0x0087:
            r0 = 0
            goto L_0x007d
        L_0x008a:
            r1 = 200(0xc8, double:9.9E-322)
            X.WDZ r7 = (X.WDZ) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            X.04K r5 = X.03v.A03(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A02(r0)
            r5.A04(r1)
            X.U7T r0 = new X.U7T
            r0.<init>(r7, r3)
            r5.A07(r0)
            androidx.appcompat.widget.ActionBarContextView r3 = r8.A09
            r1 = 100
            X.04K r0 = r3.A03
            if (r0 == 0) goto L_0x00af
            r0.A00()
        L_0x00af:
            r0 = 0
            X.04K r6 = X.03v.A03(r3)
            r6.A02(r0)
            r6.A04(r1)
            X.WDr r1 = r3.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A03 = r6
            r1.A00 = r4
            r6.A07(r1)
            goto L_0x0061
        L_0x00c6:
            if (r0 == 0) goto L_0x000d
            r0 = 0
            r8.A0J = r0
            goto L_0x000a
        L_0x00cd:
            if (r9 == 0) goto L_0x00dd
            r1 = 4
            X.WDZ r7 = (X.WDZ) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A09
            r0.setVisibility(r3)
            return
        L_0x00dd:
            X.WDZ r7 = (X.WDZ) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A09
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U5n.A0K(boolean):void");
    }

    public U5n(Dialog dialog) {
        A00(dialog.getWindow().getDecorView());
    }

    private void A00(View view) {
        String str;
        C20939X5h wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C20939X5h) {
            wrapper = (C20939X5h) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = C51968G9o.A16(findViewById);
            } else {
                str = "null";
            }
            throw DbW.A0c("Can't make a decor toolbar out of ", str);
        }
        this.A0B = wrapper;
        this.A09 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A08 = actionBarContainer;
        C20939X5h x5h = this.A0B;
        if (x5h == null || this.A09 == null || actionBarContainer == null) {
            throw DbW.A0c(C51968G9o.A16(this), " can only be used with a compatible window decor layout");
        }
        WDZ wdz = (WDZ) x5h;
        Context context = wdz.A09.getContext();
        this.A01 = context;
        if ((wdz.A01 & 4) != 0) {
            this.A0E = true;
        }
        context.getApplicationInfo();
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
        this.A08.setTabContainer((U4u) null);
        ((WDZ) this.A0B).A09.setCollapsible(false);
        this.A0A.A05 = false;
        TypedArray obtainStyledAttributes = this.A01.obtainStyledAttributes((AttributeSet) null, AnonymousClass2Z3.A00, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
            if (actionBarOverlayLayout2.A06) {
                this.A0G = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            this.A08.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public U5n(Activity activity, boolean z) {
        this.A0K = activity;
        View A0A2 = C66581MXm.A0A(activity);
        A00(A0A2);
        if (!z) {
            this.A03 = A0A2.findViewById(16908290);
        }
    }
}
