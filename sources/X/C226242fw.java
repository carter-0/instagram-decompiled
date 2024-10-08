package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2fw  reason: invalid class name and case insensitive filesystem */
public abstract class C226242fw extends ProxyFrameLayout {
    public int A00;
    public AnonymousClass07Z A01;
    public AnonymousClass5Gv A02;
    public C226252fx A03;
    public C226252fx A04;
    public C226252fx A05;
    public C226252fx A06;
    public AnonymousClass2gW A07;
    public C226152fl A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public C22537Y8i A0F;
    public String A0G;
    public final AnonymousClass0hF A0H;
    public final TypedArray A0I;
    public final C226262fy A0J;
    public final Map A0K;
    public final Map A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 42));
    public final AnonymousClass0eM A0O = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 43));
    public final AnonymousClass0eM A0P = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 44));
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 45));
    public final AnonymousClass0eM A0R = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 46));
    public final AnonymousClass0eM A0S = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 47));
    public final AnonymousClass0eM A0T = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 48));
    public final AnonymousClass0eM A0U = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 49));

    public C226242fw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0eP r11 = new 0eP(0, C226252fx.TOAST);
        C226252fx r9 = C226252fx.DOT;
        LinkedHashMap A062 = 0Yt.A06(new 0eP[]{r11, new 0eP(1, r9), new 0eP(2, C226252fx.SMALL_DOT), new 0eP(3, C226252fx.NUMBERED)});
        this.A0K = A062;
        C226262fy r4 = C226262fy.ABOVE_ANCHOR;
        LinkedHashMap A063 = 0Yt.A06(new 0eP[]{new 0eP(0, r4), new 0eP(1, C226262fy.BELOW_ANCHOR)});
        this.A0L = A063;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A2J, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        this.A0I = obtainStyledAttributes;
        C226252fx r0 = (C226252fx) A062.get(Integer.valueOf(obtainStyledAttributes.getInt(1, -1)));
        this.A03 = r0 == null ? r9 : r0;
        this.A04 = (C226252fx) A062.get(Integer.valueOf(obtainStyledAttributes.getInt(4, -1)));
        C226252fx r02 = (C226252fx) A062.get(Integer.valueOf(obtainStyledAttributes.getInt(8, -1)));
        this.A06 = r02 == null ? this.A03 : r02;
        C226252fx r03 = (C226252fx) A062.get(Integer.valueOf(obtainStyledAttributes.getInt(7, -1)));
        this.A05 = r03 == null ? this.A06 : r03;
        this.A0D = obtainStyledAttributes.getBoolean(6, false);
        this.A0E = obtainStyledAttributes.getBoolean(9, true);
        C226262fy r04 = (C226262fy) A063.get(Integer.valueOf(obtainStyledAttributes.getInt(10, -1)));
        this.A0J = r04 == null ? r4 : r04;
        this.A0C = obtainStyledAttributes.getBoolean(5, false);
        this.A00 = obtainStyledAttributes.getInt(3, 0);
        this.A0G = "0";
        this.A0M = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 41));
        View.inflate(context, R.layout.dot_badge, this);
        setClipChildren(false);
        setClipToPadding(false);
        this.A02.add(new C226272fz(this));
        obtainStyledAttributes.recycle();
        this.A0H = new AnonymousClass2g0(this);
    }

    public abstract AnonymousClass2aq getViewModelFactory();

    public final void setBadgeDisplayStyle(C226252fx r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void setBadgeValue(String str) {
        0qQ.A0B(str, 0);
        if (!this.A09 || !str.equals(this.A0G)) {
            IgTextView numberBadgeTextView = getNumberBadgeTextView();
            if (numberBadgeTextView != null) {
                numberBadgeTextView.setText(str);
            }
            this.A0G = str;
        }
    }

    public final void setLifecycleOwner(AnonymousClass07Z r6) {
        0qQ.A0B(r6, 0);
        this.A01 = r6;
        2Fk r2 = getViewModel().A06;
        AnonymousClass07Z r1 = this.A01;
        if (r1 != null) {
            r2.A06(r1, new AnonymousClass2gN(this));
            2Fk r22 = getViewModel().A07;
            AnonymousClass07Z r12 = this.A01;
            if (r12 != null) {
                r22.A06(r12, new AnonymousClass2gR(this));
                2Fk r3 = getViewModel().A05;
                AnonymousClass07Z r23 = this.A01;
                if (r23 != null) {
                    r3.A06(r23, new AnonymousClass2gT(new AnonymousClass2gS(this)));
                    if (this.A03 == C226252fx.TOAST || this.A0C) {
                        2Fk r24 = getViewModel().A08;
                        AnonymousClass07Z r13 = this.A01;
                        if (r13 != null) {
                            r24.A06(r13, new AnonymousClass2gU(this));
                        }
                    }
                    AnonymousClass07Z r0 = this.A01;
                    if (r0 != null) {
                        r0.getLifecycle().A09(this.A0H);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("lifecycleOwner");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setToastCappedFallbackDisplayStyle(C226252fx r2) {
        0qQ.A0B(r2, 0);
        this.A05 = r2;
    }

    public final void setToastFallbackDisplayStyle(C226252fx r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
    }

    private final ViewGroup getContainer() {
        return (ViewGroup) this.A0M.getValue();
    }

    private final Map getDisplayStyleToViewMap() {
        return (Map) this.A0N.getValue();
    }

    /* access modifiers changed from: private */
    public final IgView getLedBadgeIgView() {
        return (IgView) this.A0O.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewStub getLedBadgeViewStub() {
        Object value = this.A0P.getValue();
        0qQ.A07(value);
        return (ViewStub) value;
    }

    /* access modifiers changed from: private */
    public final IgTextView getNumberBadgeTextView() {
        return (IgTextView) this.A0Q.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewStub getNumberBadgeViewStub() {
        Object value = this.A0R.getValue();
        0qQ.A07(value);
        return (ViewStub) value;
    }

    /* access modifiers changed from: private */
    public final IgView getToastBadgeIgView() {
        return (IgView) this.A0S.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewStub getToastBadgeViewStub() {
        Object value = this.A0T.getValue();
        0qQ.A07(value);
        return (ViewStub) value;
    }

    public static /* synthetic */ void setLedBadgeOffsetsInDPs$default(C226242fw r1, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            r1.A0B(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLedBadgeOffsetsInDPs");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == null || view.getId() != R.id.wrapper) {
            ViewGroup container = getContainer();
            if (container != null) {
                container.addView(view, i, layoutParams);
                return;
            }
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final C226252fx getBadgeDisplayStyle() {
        return this.A03;
    }

    public final C22537Y8i getCappedBadgeValueProvider() {
        return null;
    }

    public final boolean getCheckAnchorVisibilityWhenShowingTooltip() {
        return this.A0A;
    }

    public final boolean getEnablePrismCircularDesign() {
        return this.A0B;
    }

    public final int getNumberCap() {
        return this.A00;
    }

    public final C226252fx getSelectedDisplayStyle() {
        return this.A04;
    }

    public final boolean getShouldToast() {
        return this.A0C;
    }

    public final boolean getShowBadgeWhenSelected() {
        return this.A0D;
    }

    public final C226252fx getToastCappedFallbackDisplayStyle() {
        return this.A05;
    }

    public final C226252fx getToastFallbackDisplayStyle() {
        return this.A06;
    }

    public final boolean getToastWhenSelected() {
        return this.A0E;
    }

    public final AnonymousClass2gW getTooltipClickListener() {
        return this.A07;
    }

    public final C226152fl getTooltipStateChangeListener() {
        return this.A08;
    }

    public final AnonymousClass2g3 getViewModel() {
        return (AnonymousClass2g3) this.A0U.getValue();
    }

    public final void setPrismLedBadgeEnabled(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (z) {
            IgView ledBadgeIgView = getLedBadgeIgView();
            if (ledBadgeIgView != null) {
                ledBadgeIgView.setBackground(getContext().getDrawable(R.drawable.prism_red_pill_with_border));
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            IgView ledBadgeIgView2 = getLedBadgeIgView();
            if (!(ledBadgeIgView2 == null || (layoutParams2 = ledBadgeIgView2.getLayoutParams()) == null)) {
                layoutParams2.height = dimensionPixelSize;
            }
            IgView ledBadgeIgView3 = getLedBadgeIgView();
            if (!(ledBadgeIgView3 == null || (layoutParams = ledBadgeIgView3.getLayoutParams()) == null)) {
                layoutParams.width = dimensionPixelSize;
            }
            A0B(-3, -2);
        }
    }

    public static final void A06(AnonymousClass9IR r6, C226242fw r7) {
        Activity activity;
        AnonymousClass5Gv r0;
        Context context = r7.getContext();
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !r6.A03) {
            C284335Mc r3 = new C284335Mc(r6, r7);
            C284345Md r2 = new C284345Md((List) r6.A02);
            ViewGroup container = r7.getContainer();
            if (container != null) {
                AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, r2);
                r1.A03(container);
                r1.A06(r7.A0J);
                r1.A0F = true;
                C283255Gu r02 = C283255Gu.A08;
                r1.A08 = r02;
                r1.A07 = r02;
                r1.A00 = r6.A01;
                r1.A0A = false;
                r1.A0E = r7.A0B;
                r1.A04 = r3;
                r1.A0D = r7.A0A;
                r0 = r1.A00();
            } else {
                r0 = null;
            }
            r7.A02 = r0;
            if (r0 != null) {
                r0.A07((UserSession) null);
            }
        }
    }

    public static final void A07(C226252fx r5, C226242fw r6) {
        int i;
        View view;
        View badge = r6.getBadge();
        if (badge != null) {
            i = badge.getVisibility();
        } else {
            i = 8;
        }
        r6.A03 = r5;
        for (Map.Entry entry : r6.getDisplayStyleToViewMap().entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof View) && (view = (View) value) != null) {
                int i2 = 8;
                if (entry.getKey() == r5) {
                    i2 = i;
                }
                view.setVisibility(i2);
            }
        }
    }

    public static final void A08(C226242fw r5, boolean z) {
        Integer num;
        View badge = r5.getBadge();
        View view = null;
        if (badge != null) {
            num = Integer.valueOf(badge.getVisibility());
        } else {
            num = null;
        }
        int i = 8;
        if (z) {
            i = 0;
        }
        View badge2 = r5.getBadge();
        if (badge2 != null) {
            if (!(badge2 instanceof ViewStub) || !z) {
                view = badge2;
            } else {
                ViewStub viewStub = (ViewStub) badge2;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    view = r5.findViewById(viewStub.getInflatedId());
                }
                0qQ.A0A(view);
            }
        }
        if ((num == null || i != num.intValue()) && view != null) {
            view.setVisibility(i);
        }
    }

    private final View getBadge() {
        Object obj = getDisplayStyleToViewMap().get(this.A03);
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public final void A09() {
        2aX r6;
        AnonymousClass2g2 r1 = (AnonymousClass2g2) getViewModel();
        if ((!((Boolean) r1.A0I.getValue()).booleanValue() || r1.A03) && (r6 = r1.A01) != null) {
            2aT r0 = r1.A00;
            AnonymousClass2g1 r5 = r1.A02;
            C226252fx r4 = C226252fx.DOT;
            r0.A05(r4, r5, r6, (Map) null);
            2aV r2 = r1.A01;
            0qQ.A0B(r5, 0);
            r2.A03(new C239993Jd(r4, r5, (C71062aE) null, (Set) null), r6, true);
        }
    }

    public final void A0A() {
        getViewModel().A0J.Epw(false);
    }

    public final void A0B(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IgView ledBadgeIgView = getLedBadgeIgView();
        ViewGroup.LayoutParams layoutParams = null;
        if (ledBadgeIgView != null) {
            layoutParams = ledBadgeIgView.getLayoutParams();
        }
        if ((layoutParams instanceof C71492dQ) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Context context = getContext();
            0qQ.A07(context);
            marginLayoutParams.setMarginEnd((int) 0nA.A04(context, i));
            marginLayoutParams.topMargin = (int) 0nA.A04(context, i2);
            IgView ledBadgeIgView2 = getLedBadgeIgView();
            if (ledBadgeIgView2 != null) {
                ledBadgeIgView2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final boolean A0C() {
        View badge = getBadge();
        if (badge == null || badge.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getViewModel().A0I.Epw(Boolean.valueOf(isSelected()));
    }

    public final String getBadgeValue() {
        CharSequence charSequence;
        IgTextView numberBadgeTextView = getNumberBadgeTextView();
        if (numberBadgeTextView != null) {
            charSequence = numberBadgeTextView.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final boolean getTooltipVisible() {
        if (getViewModel().A0H.getValue() == AnonymousClass2g6.VISIBLE) {
            return true;
        }
        return false;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-261424511);
        super.onDetachedFromWindow();
        2Fk r1 = getViewModel().A06;
        AnonymousClass07Z r0 = this.A01;
        if (r0 != null) {
            r1.A05(r0);
            2Fk r12 = getViewModel().A07;
            AnonymousClass07Z r02 = this.A01;
            if (r02 != null) {
                r12.A05(r02);
                2Fk r13 = getViewModel().A05;
                AnonymousClass07Z r03 = this.A01;
                if (r03 != null) {
                    r13.A05(r03);
                    2Fk r14 = getViewModel().A08;
                    AnonymousClass07Z r04 = this.A01;
                    if (r04 != null) {
                        r14.A05(r04);
                        AnonymousClass07Z r05 = this.A01;
                        if (r05 != null) {
                            r05.getLifecycle().A0A(this.A0H);
                            AnonymousClass0fD.A0D(-931718746, A062);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F("lifecycleOwner");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setBugFixLazyLoad(boolean z) {
        this.A09 = z;
    }

    public final void setCappedBadgeValueProvider(C22537Y8i y8i) {
        this.A0F = y8i;
    }

    public final void setCheckAnchorVisibilityWhenShowingTooltip(boolean z) {
        this.A0A = z;
    }

    public final void setEnablePrismCircularDesign(boolean z) {
        this.A0B = z;
    }

    public final void setNumberCap(int i) {
        this.A00 = i;
    }

    public final void setSelectedDisplayStyle(C226252fx r1) {
        this.A04 = r1;
    }

    public final void setShouldToast(boolean z) {
        this.A0C = z;
    }

    public final void setShowBadgeWhenSelected(boolean z) {
        this.A0D = z;
    }

    public final void setToastWhenSelected(boolean z) {
        this.A0E = z;
    }

    public final void setTooltipClickListener(AnonymousClass2gW r1) {
        this.A07 = r1;
    }

    public final void setTooltipStateChangeListener(C226152fl r1) {
        this.A08 = r1;
    }
}
