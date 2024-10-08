package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7U1  reason: invalid class name */
public final class AnonymousClass7U1 {
    public ShapeDrawable A00 = null;
    public AnonymousClass9O8 A01 = null;
    public C262424Dq A02;
    public C262364Dk A03;
    public AnonymousClass7L2 A04;
    public C249453jo A05;
    public String A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final AnonymousClass7U7 A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final AnonymousClass0eK A0C;
    public final AnonymousClass0eK A0D;
    public final AnonymousClass0eK A0E;

    public static void A00(Activity activity, Context context, View view, int i, boolean z) {
        View rootView;
        View findViewById;
        if (view != null && (rootView = view.getRootView()) != null && (findViewById = rootView.findViewById(R.id.thread_background_view)) != null) {
            if (!z) {
                int top = findViewById.getTop();
                if (i == -1) {
                    i = 2db.A01(activity);
                }
                int i2 = -i;
                if (top != i2) {
                    findViewById.setTop(i2);
                }
            }
            findViewById.setBottom(0nA.A05(context));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r4 = r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A01(com.instagram.direct.model.DirectThreadThemeInfo r7) {
        /*
            r6 = this;
            X.7L2 r2 = r6.A04
            X.0eK r0 = r6.A0E
            java.lang.Object r1 = r0.get()
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r5 = 0
            if (r7 == 0) goto L_0x0033
            if (r2 == 0) goto L_0x0033
            X.7Kx r4 = r2.A04
            android.graphics.drawable.Drawable r3 = r4.A0Q
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = r7.A0i
            if (r2 == 0) goto L_0x0033
            java.lang.String r1 = r4.A0V
            int r0 = r2.length()
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002a
            return r3
        L_0x002a:
            int r1 = r7.A02
            int r0 = r4.A08
            if (r1 == 0) goto L_0x0033
            if (r1 != r0) goto L_0x0033
            return r3
        L_0x0033:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7U1.A01(com.instagram.direct.model.DirectThreadThemeInfo):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r4 = r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A02(com.instagram.direct.model.DirectThreadThemeInfo r7) {
        /*
            r6 = this;
            X.7L2 r2 = r6.A04
            X.0eK r0 = r6.A0E
            java.lang.Object r1 = r0.get()
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r5 = 0
            if (r7 == 0) goto L_0x0033
            if (r2 == 0) goto L_0x0033
            X.7Kx r4 = r2.A04
            android.graphics.drawable.Drawable r3 = r4.A0R
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = r7.A0l
            if (r2 == 0) goto L_0x0033
            java.lang.String r1 = r4.A0W
            int r0 = r2.length()
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002a
            return r3
        L_0x002a:
            int r1 = r7.A06
            int r0 = r4.A0B
            if (r1 == 0) goto L_0x0033
            if (r1 != r0) goto L_0x0033
            return r3
        L_0x0033:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7U1.A02(com.instagram.direct.model.DirectThreadThemeInfo):android.graphics.drawable.Drawable");
    }

    public final void A04(View view, int i, boolean z) {
        int A0G;
        AnonymousClass4DH r6 = this.A07;
        FragmentActivity activity = r6.getActivity();
        if (activity != null) {
            View view2 = view;
            if (view != null && this.A04 != null) {
                View findViewById = view2.getRootView().findViewById(R.id.thread_background_view);
                if (this.A06.equals("follow_button")) {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                } else if (findViewById != null) {
                    C329967Kx r8 = this.A04.A04;
                    TransitionDrawable transitionDrawable = r8.A0T;
                    transitionDrawable.setCrossFadeEnabled(false);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{transitionDrawable, r8.A0S});
                    layerDrawable.setLayerInset(1, 0, 0, 0, 0nA.A05(activity) - 2db.A01(activity));
                    int i2 = i;
                    if (r8.A0U != null) {
                        if (182.A06(0Tu.A05, this.A08, 36320910629741515L)) {
                            int i3 = r8.A00;
                            int i4 = r8.A05;
                            int A002 = AnonymousClass0nB.A00(activity);
                            2dZ AYJ = this.A05.AYJ();
                            if (AYJ != null) {
                                A0G = AYJ.AYI();
                            } else {
                                A0G = 2Yu.A0G(findViewById.getContext(), R.attr.actionBarHeight);
                            }
                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                            layerDrawable.addLayer(new GradientDrawable(orientation, new int[]{i3, 0}));
                            int i5 = (A0G + i) - 1;
                            int i6 = A002 / 2;
                            layerDrawable.setLayerInset(2, 0, i5, 0, i6);
                            layerDrawable.addLayer(new GradientDrawable(orientation, new int[]{0, i4}));
                            layerDrawable.setLayerInset(3, 0, i6, 0, 0);
                        }
                    }
                    findViewById.setBackground(layerDrawable);
                    this.A09.A00();
                    FragmentActivity requireActivity = r6.requireActivity();
                    Context requireContext = r6.requireContext();
                    boolean z2 = z;
                    A00(requireActivity, requireContext, view2, i2, z2);
                    0nA.A0r(findViewById, new AnonymousClass7OO(view2, findViewById, this, i2, z2));
                    View findViewById2 = activity.findViewById(R.id.layout_container_parent);
                    if (findViewById2 instanceof CoordinatorLayout) {
                        ((CoordinatorLayout) findViewById2).setStatusBarBackground((Drawable) null);
                    }
                }
            }
        }
    }

    public final void A05(AnonymousClass7L2 r3) {
        this.A04 = r3;
        ((C333517Zg) this.A0A.get()).BCh().DrB(r3.A04);
    }

    public final boolean A06() {
        DirectThreadThemeInfo directThreadThemeInfo;
        AnonymousClass7L2 r0 = this.A04;
        if (r0 == null || (directThreadThemeInfo = r0.A08) == null || !(!AnonymousClass3S1.A04(directThreadThemeInfo.A0s)) || !(!AnonymousClass3S1.A04(directThreadThemeInfo.A0q))) {
            return false;
        }
        if (AnonymousClass6BI.A0g.contains(this.A04.A09) || ((Boolean) ((AnonymousClass9HC) this.A0E.get()).A03.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public AnonymousClass7U1(C249453jo r9, AnonymousClass4DH r10, UserSession userSession, String str, AnonymousClass0eK r13, AnonymousClass0eK r14, AnonymousClass0eK r15, AnonymousClass0eK r16, AnonymousClass0eK r17, AnonymousClass0eK r18) {
        this.A08 = userSession;
        this.A07 = r10;
        this.A06 = str;
        this.A0E = r13;
        this.A0C = r15;
        this.A0B = r16;
        this.A0D = r17;
        this.A09 = new AnonymousClass7U7(r10, (AnonymousClass9HC) r13.get(), new AnonymousClass7U2(this), new AnonymousClass7U3(this), new AnonymousClass7U4(this), new AnonymousClass7U5(this), new AnonymousClass7U6(r18));
        this.A0A = r14;
        this.A05 = r9;
    }

    public final Integer A03(AnonymousClass7S7 r3) {
        if (r3.CSK() && r3.CVE()) {
            return AnonymousClass05K.A0N;
        }
        if (C308556Us.A08(this.A08, r3.C6Q())) {
            return AnonymousClass05K.A0Y;
        }
        return AnonymousClass05K.A00;
    }
}
