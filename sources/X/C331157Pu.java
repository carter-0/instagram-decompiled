package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Strings;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Stack;
import kotlin.Deprecated;

/* renamed from: X.7Pu  reason: invalid class name and case insensitive filesystem */
public final class C331157Pu {
    public AnonymousClass37D A00;
    public 1Zn A01;
    public final C331127Pr A02;
    public final BottomSheetFragment A03;

    public static final C331157Pu A00(Context context, Context context2, Fragment fragment, C331157Pu r17, AnonymousClass37D r18) {
        AnonymousClass37D r13;
        int i;
        int i2;
        String simpleName;
        1Zn r4;
        Integer num;
        Context context3 = context;
        AnonymousClass37D r2 = r18;
        if (r18 == null) {
            boolean z = context instanceof Activity;
            AnonymousClass37E r1 = AnonymousClass37D.A00;
            if (z) {
                r13 = r1.A01((Activity) context3);
            } else {
                r13 = r1.A02(context);
            }
        } else {
            r13 = r2;
        }
        C331157Pu r11 = r17;
        r11.A00 = r13;
        Fragment fragment2 = fragment;
        if (r13 == null) {
            simpleName = fragment2.getClass().getSimpleName();
            r4 = r11.A01;
            if (r4 != null) {
                num = AnonymousClass05K.A0A;
            }
            return null;
        }
        AnonymousClass37F r5 = (AnonymousClass37F) r13;
        Context context4 = context2;
        if (r5.A0g) {
            C332277Ui r12 = r5.A0H;
            if (r5.A0f || r5.A0m) {
                r5.A0H = new C50978FmR(context3, context4, fragment2, r11, r12, r13);
                r13.A0B();
                r5.A0e = true;
                C13823Tht tht = r5.A0G;
                if (tht != null) {
                    tht.DVD();
                    return null;
                }
                return null;
            }
            simpleName = fragment2.getClass().getSimpleName();
            r4 = r11.A01;
            if (r4 != null) {
                num = AnonymousClass05K.A09;
            }
            return null;
        }
        if (r18 != null) {
            r11.A03.A04 = new T8K(r2);
        }
        C331127Pr r6 = r11.A02;
        if (r6.A0T == null && (fragment2 instanceof C273494mf)) {
            r6.A0T = (C273494mf) fragment2;
        }
        if (r6.A1B) {
            r5.A0j = true;
        }
        r5.A0e = false;
        boolean z2 = r13 instanceof AnonymousClass37F;
        if (z2) {
            r5.A0J = r6.A0Y;
            r5.A01 = r6.A02;
            r5.A02 = r6.A07;
        }
        r5.A0N = r6.A0k;
        r5.A0X = r6.A10;
        r5.A0R = r6.A0q;
        r5.A0L = r6.A11;
        r5.A0l = r6.A1L;
        r5.A0F = r6.A0V;
        r5.A0T = r6.A0t;
        r5.A0O = r6.A0l;
        r5.A0P = r6.A0n;
        r5.A0G = r6.A0W;
        r5.A0V = r6.A0u;
        r5.A0k = r6.A1K;
        r5.A0o = r6.A1T;
        r5.A0Q = r6.A0o;
        r5.A0M = r6.A0j;
        r5.A07 = (long) r6.A00;
        int i3 = r6.A0B;
        if (i3 != 0) {
            i = context2.getColor(i3);
        } else {
            i = 255;
        }
        int i4 = r6.A0A;
        if (i4 != 0) {
            i2 = context2.getColor(i4);
        } else {
            i2 = r6.A09;
            if (i2 == 0) {
                i2 = 255;
            }
        }
        BottomSheetFragment bottomSheetFragment = r11.A03;
        r13.A0N(bottomSheetFragment, AnonymousClass05K.A00, i, i2, r6.A1O);
        if (z2 && (fragment2 instanceof C273504mg)) {
            C273504mg r14 = (C273504mg) fragment2;
            C7218Pzn pzn = r5.A0D;
            if (pzn != null) {
                pzn.A0D = r14;
            }
        }
        r5.A0H = new C66924MfI(r11);
        if (bottomSheetFragment.mView == null) {
            bottomSheetFragment.registerLifecycleListener(new C71933OtH(fragment2, r11));
            return r11;
        }
        bottomSheetFragment.A0V(fragment2, r6, true, true, false);
        return r11;
        1Zp A002 = r4.A00(num, 817895635, 0, false);
        0qQ.A0A(simpleName);
        A002.A03("class_name", simpleName);
        A002.A00();
        return null;
    }

    public final C331157Pu A02(Activity activity, Fragment fragment) {
        0qQ.A0B(activity, 0);
        0qQ.A0B(fragment, 1);
        return A00(activity, activity, fragment, this, (AnonymousClass37D) null);
    }

    @Deprecated(message = "")
    public final C331157Pu A03(Context context, Fragment fragment) {
        0qQ.A0B(context, 0);
        0qQ.A0B(fragment, 1);
        return A00(context, context, fragment, this, (AnonymousClass37D) null);
    }

    public final void A07() {
        A0L((C332277Ui) null);
    }

    public final void A0D(Context context, Fragment fragment) {
        0qQ.A0B(context, 0);
        C331127Pr r1 = this.A02;
        r1.A0A = 2Yu.A0H(context, R.attr.igds_color_primary_background);
        r1.A0B = R.color.fds_transparent;
        A00(context, context, fragment, this, (AnonymousClass37D) null);
    }

    public final void A0E(Fragment fragment, C331127Pr r3) {
        0qQ.A0B(fragment, 1);
        A0F(fragment, r3);
    }

    public final void A0F(Fragment fragment, C331127Pr r9) {
        A0H(fragment, r9, true, true, false, false);
    }

    public final void A0G(Fragment fragment, C331127Pr r9, boolean z, boolean z2) {
        A0H(fragment, r9, z, z2, false, false);
    }

    public final void A0H(Fragment fragment, C331127Pr r12, boolean z, boolean z2, boolean z3, boolean z4) {
        C331127Pr r6 = r12;
        0qQ.A0B(r12, 0);
        Fragment fragment2 = fragment;
        0qQ.A0B(fragment, 1);
        AnonymousClass37D r3 = this.A00;
        BottomSheetFragment bottomSheetFragment = this.A03;
        Fragment A0M = bottomSheetFragment.A0M();
        if (!(!bottomSheetFragment.isAdded() || r3 == null || A0M == null)) {
            0hq childFragmentManager = bottomSheetFragment.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            r3.A0K(A0M, childFragmentManager, AnonymousClass05K.A0C);
        }
        if (this.A02.A0T == null && (fragment instanceof C273494mf)) {
            r12.A0T = (C273494mf) fragment2;
        }
        if (z4) {
            boolean z5 = r12.A1J;
            boolean z6 = r12.A1N;
            if (r12.A0K == null && r12.A0v) {
                z5 = true;
            }
            if (r12.A0w) {
                z6 = true;
            }
            A0R(z5, z6);
        }
        bottomSheetFragment.A0V(fragment2, r6, z, z2, z3);
    }

    private final void A01() {
        AnonymousClass37D r2;
        Object[] objArr = new Object[0];
        if (this.A00 != null) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            Fragment A0M = bottomSheetFragment.A0M();
            if (A0M != null && (r2 = this.A00) != null) {
                0hq childFragmentManager = bottomSheetFragment.getChildFragmentManager();
                0qQ.A07(childFragmentManager);
                r2.A0K(A0M, childFragmentManager, AnonymousClass05K.A0N);
                return;
            }
            return;
        }
        throw new NullPointerException(Strings.A00("mBottomSheetNavigator cannot be null", objArr));
    }

    public final void A04() {
        if (A0S()) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            C252063oV r1 = bottomSheetFragment.subtitleTextView;
            if (bottomSheetFragment.isAdded() && r1 != null && r1.getView() != null) {
                ((TextView) r1.getView()).setTextSize(14.0f);
                r1.getView().setTranslationY(-20.0f);
            }
        }
    }

    public final void A06() {
        TextView textView;
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0d = null;
        C252063oV r0 = bottomSheetFragment.titleTextView;
        if (!(r0 == null || (textView = (TextView) r0.getView()) == null)) {
            textView.setText("");
        }
        C252063oV r1 = bottomSheetFragment.titleTextView;
        if (r1 != null) {
            r1.setVisibility(8);
        }
        BottomSheetFragment.A0E(bottomSheetFragment, (CharSequence) null, (CharSequence) null);
        BottomSheetFragment.A0C(bottomSheetFragment);
        BottomSheetFragment.A05(bottomSheetFragment.requireContext(), bottomSheetFragment);
    }

    public final void A0A(int i, int i2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        ImageView imageView = bottomSheetFragment.dragHandleView;
        if (imageView != null) {
            0nA.A0c(imageView, i);
            ImageView imageView2 = bottomSheetFragment.dragHandleView;
            if (imageView2 != null) {
                0nA.A0X(imageView2, i2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0B(int i, int i2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (!bottomSheetFragment.isAdded() || bottomSheetFragment.mView == null) {
            bottomSheetFragment.registerLifecycleListener(new C50299FXe(this, i, i2));
        } else {
            A0C(i, i2);
        }
    }

    public final void A0C(int i, int i2) {
        Drawable background;
        Drawable mutate;
        BottomSheetFragment bottomSheetFragment = this.A03;
        C331127Pr r0 = bottomSheetFragment.A03;
        if (r0 != null) {
            r0.A06 = i;
        }
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (!(viewGroup == null || (background = viewGroup.getBackground()) == null || (mutate = background.mutate()) == null)) {
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        ImageView imageView = bottomSheetFragment.dragHandleView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        }
    }

    public final void A0I(C331147Pt r3) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0S = r3;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        this.A02.A0S = r3;
    }

    public final void A0J(C331147Pt r3, boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0Q = r3;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A0Q = r3;
        }
    }

    public final void A0K(C331147Pt r3, boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0R = r3;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A0R = r3;
        }
    }

    @Deprecated(message = "")
    public final void A0L(C332277Ui r3) {
        AnonymousClass37D r1 = this.A00;
        if (r1 != null) {
            if (r3 != null) {
                ((AnonymousClass37F) r1).A0H = r3;
            }
            r1.A0B();
        }
    }

    public final void A0M(String str) {
        TextView textView;
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0d = str;
        if (str != null && str.length() != 0) {
            C252063oV r0 = bottomSheetFragment.titleTextView;
            if (!(r0 == null || (textView = (TextView) r0.getView()) == null)) {
                textView.setText(str);
            }
            C252063oV r02 = bottomSheetFragment.titleTextView;
            if (r02 != null) {
                r02.setVisibility(0);
            }
            BottomSheetFragment.A0E(bottomSheetFragment, str, (CharSequence) null);
            BottomSheetFragment.A0C(bottomSheetFragment);
            BottomSheetFragment.A05(bottomSheetFragment.requireContext(), bottomSheetFragment);
        }
    }

    public final void A0O(boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A02();
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A02();
        }
    }

    public final void A0P(boolean z) {
        View view;
        C252063oV r2 = this.A03.rightLoadingSpinnerIcon;
        if (z) {
            if (r2 != null && (view = r2.getView()) != null) {
                view.setVisibility(0);
            }
        } else if (r2 != null && r2.CVM()) {
            r2.setVisibility(8);
        }
    }

    public final void A0Q(boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        bottomSheetFragment.A06 = z;
        bottomSheetFragment.A0Q();
    }

    public final void A0R(boolean z, boolean z2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        bottomSheetFragment.A06 = z;
        bottomSheetFragment.A07 = z2;
        bottomSheetFragment.A0Q();
    }

    public final boolean A0S() {
        Fragment A0M;
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (!bottomSheetFragment.isAdded() || (A0M = bottomSheetFragment.A0M()) == null) {
            return false;
        }
        return A0M.isVisible();
    }

    public final boolean A0T() {
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (!bottomSheetFragment.isAdded()) {
            return false;
        }
        return bottomSheetFragment.onBackPressed();
    }

    public C331157Pu(0lg r5, C331127Pr r6) {
        this.A02 = r6;
        Bundle bundle = new Bundle();
        AnonymousClass0Dg.A00(bundle, r5);
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        bottomSheetFragment.setArguments(bundle);
        this.A03 = bottomSheetFragment;
        bottomSheetFragment.A03 = r6;
        boolean z = r6.A1J;
        boolean z2 = r6.A1N;
        if (r6.A0K == null && r6.A0v) {
            z = true;
        }
        A0R(z, r6.A0w ? true : z2);
        bottomSheetFragment.A02 = this;
        UserSession A012 = 0Gl.A01(r5);
        if (A012 != null) {
            this.A01 = 1Zm.A00(A012);
        }
    }

    public final void A05() {
        A01();
        this.A03.A0N();
    }

    public final void A08() {
        A01();
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (bottomSheetFragment.A0D.size() > 1) {
            bottomSheetFragment.A0P();
        } else {
            0wb.A03("BottomSheet", "Can't pop bottom sheet with empty back stack");
        }
    }

    public final void A09(int i) {
        View view;
        if (A0S()) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            ViewGroup viewGroup = bottomSheetFragment.titleAndNavContainer;
            if (bottomSheetFragment.isAdded() && viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = i;
                viewGroup.setLayoutParams(layoutParams);
                ImageView imageView = bottomSheetFragment.dragHandleView;
                if (imageView != null) {
                    imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), 0);
                }
            }
            C252063oV r0 = bottomSheetFragment.navBarDivider;
            if (r0 != null && (view = r0.getView()) != null) {
                view.setBackgroundColor(bottomSheetFragment.requireContext().getColor(2Yu.A0H(bottomSheetFragment.requireContext(), R.attr.igds_color_creation_tools_grey_08)));
            }
        }
    }

    public final void A0N(String str, boolean z) {
        A01();
        BottomSheetFragment bottomSheetFragment = this.A03;
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null) {
            0nA.A0N(viewGroup);
            bottomSheetFragment.DMt();
        }
        if (bottomSheetFragment.getChildFragmentManager().A0M() > 0) {
            0hq childFragmentManager = bottomSheetFragment.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            int A0M = childFragmentManager.A0M();
            int i = 0;
            while (i < A0M) {
                String str2 = childFragmentManager.A0T(i).A09;
                if (str2 == null || !str2.equals(str)) {
                    i++;
                } else {
                    if (BottomSheetFragment.A0I(bottomSheetFragment)) {
                        boolean A0H = BottomSheetFragment.A0H(bottomSheetFragment);
                        Stack stack = bottomSheetFragment.A0D;
                        Object peek = stack.peek();
                        if (peek == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (!str.equals(((C331127Pr) peek).A0f)) {
                            17k.A0J(bottomSheetFragment.getChildFragmentManager().A19(str, 0), "fragmentId not in ChildFragmentManager stack", new Object[0]);
                            while (true) {
                                Object peek2 = stack.peek();
                                if (peek2 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                } else if (!str.equals(((C331127Pr) peek2).A0f)) {
                                    C262944Gp r1 = BottomSheetFragment.A00(bottomSheetFragment).A0X;
                                    if (r1 != null) {
                                        AnonymousClass37D bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
                                        if (bottomSheetNavigator != null) {
                                            bottomSheetNavigator.A0R(r1);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                    if (A0H) {
                                        stack.pop();
                                    }
                                } else if (BottomSheetFragment.A0H(bottomSheetFragment)) {
                                    bottomSheetFragment.A03 = (C331127Pr) stack.peek();
                                }
                            }
                        }
                    }
                    if (z) {
                        bottomSheetFragment.A0P();
                        return;
                    }
                    BottomSheetFragment.A09(bottomSheetFragment);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
                    if (touchInterceptorFrameLayout != null) {
                        touchInterceptorFrameLayout.post(new C12926TDp(bottomSheetFragment));
                        return;
                    }
                    return;
                }
            }
        }
    }
}
