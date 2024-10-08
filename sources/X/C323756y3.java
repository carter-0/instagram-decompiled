package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.adapterlayout.AdapterLinearLayout;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import com.instagram.ui.animation.pushlayout.PushDynamicCoordinatorLayout;
import com.instagram.ui.widget.nestablescrollingview.NestableViewPager;

/* renamed from: X.6y3  reason: invalid class name and case insensitive filesystem */
public final class C323756y3 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final ViewGroup A08;
    public final LinearLayout A09;
    public final TextView A0A;
    public final AppBarLayout A0B;
    public final TabLayout A0C;
    public final IgTextView A0D;
    public final C323716xz A0E;
    public final AdapterLinearLayout A0F;
    public final RefreshableAppBarLayoutBehavior A0G;
    public final PushDynamicCoordinatorLayout A0H;
    public final NestableViewPager A0I;
    public final AnonymousClass3AD A0J;

    public C323756y3(CoordinatorLayout coordinatorLayout, C323716xz r3, RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior, AnonymousClass3AD r5) {
        this.A0H = (PushDynamicCoordinatorLayout) coordinatorLayout;
        this.A0J = r5;
        this.A0G = refreshableAppBarLayoutBehavior;
        this.A0E = r3;
        this.A00 = coordinatorLayout.requireViewById(R.id.profile_header_container);
        this.A0F = (AdapterLinearLayout) coordinatorLayout.requireViewById(R.id.profile_header_fixed_list);
        this.A0I = (NestableViewPager) coordinatorLayout.requireViewById(R.id.profile_viewpager);
        this.A01 = coordinatorLayout.requireViewById(R.id.profile_tabs_container);
        this.A09 = (LinearLayout) coordinatorLayout.requireViewById(R.id.tab_selector);
        this.A0D = coordinatorLayout.requireViewById(R.id.tab_name_text);
        this.A0C = (TabLayout) coordinatorLayout.requireViewById(R.id.profile_tab_layout);
        this.A02 = coordinatorLayout.requireViewById(R.id.swipe_refresh_animated_progressbar_container);
        this.A03 = coordinatorLayout.requireViewById(R.id.swipe_refresh_animated_progressbar_container_background);
        this.A0B = (AppBarLayout) coordinatorLayout.requireViewById(R.id.tab_appbar);
        this.A08 = (ViewGroup) coordinatorLayout.requireViewById(R.id.use_in_camera_button_scene_root);
        this.A0A = (TextView) coordinatorLayout.requireViewById(R.id.use_in_camera_label);
        this.A05 = coordinatorLayout.requireViewById(R.id.use_in_camera_button);
        this.A04 = coordinatorLayout.requireViewById(R.id.use_in_camera_icon);
        this.A07 = (ViewGroup) coordinatorLayout.requireViewById(R.id.opal_tease_container);
        this.A06 = (ViewGroup) coordinatorLayout.requireViewById(R.id.opal_switch_container);
    }
}
