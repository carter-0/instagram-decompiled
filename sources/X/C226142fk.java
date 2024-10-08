package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;

/* renamed from: X.2fk  reason: invalid class name and case insensitive filesystem */
public final class C226142fk implements C226152fl {
    public ToastingBadge A00;
    public View A01;
    public ViewStub A02;
    public final View A03;
    public final View A04;
    public final C70962Ze A05;
    public final 1QK A06;
    public final String A07;
    public final View A08;
    public final View A09;
    public final C226172fn A0A = new C226162fm(this);

    public C226142fk(Context context, ViewGroup viewGroup, AnonymousClass07Z r9, UserSession userSession, C70962Ze r11, C70982Zh r12, 1QK r13, String str) {
        View findViewById;
        View view;
        int i;
        this.A06 = r13;
        this.A05 = r11;
        this.A07 = str;
        boolean A002 = 2aN.A00(userSession).A02().A00();
        1QK r3 = 1QK.A0D;
        if (r13 == r3) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.toasting_badged_tab_button, viewGroup, false);
            this.A04 = inflate;
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge = (ToastingBadge) inflate;
            toastingBadge.A09 = 182.A06(0Tu.A05, userSession, 36324694496129275L);
            toastingBadge.setUseCase(2aD.A09);
            toastingBadge.setLifecycleOwner(r9);
            toastingBadge.A08 = this;
            toastingBadge.A07 = new AnonymousClass2gV(r12, r13);
            this.A00 = toastingBadge;
        } else if (r13 == 1QK.A0E && A002) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.toasting_badged_tab_button, viewGroup, false);
            this.A04 = inflate2;
            0qQ.A0C(inflate2, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge2 = (ToastingBadge) inflate2;
            toastingBadge2.A09 = 182.A06(0Tu.A05, userSession, 36324694496129275L);
            toastingBadge2.setUseCase(2aD.A0b);
            toastingBadge2.setLifecycleOwner(r9);
            toastingBadge2.A07 = new AnonymousClass2h9(r12, r13);
        } else if (r13 == 1QK.A0C) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.badged_tab_button, viewGroup, false);
            this.A04 = inflate3;
            0qQ.A0C(inflate3, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge3 = (ToastingBadge) inflate3;
            toastingBadge3.A09 = 182.A06(0Tu.A05, userSession, 36324694496129275L);
            toastingBadge3.setUseCase(2aD.A0Q);
            toastingBadge3.setLifecycleOwner(r9);
        } else if (str.equals("notification_type_dot")) {
            View inflate4 = LayoutInflater.from(context).inflate(R.layout.tab_button, viewGroup, false);
            this.A04 = inflate4;
            this.A02 = (ViewStub) inflate4.findViewById(R.id.notification_view_stub);
        } else if (str.equals("notification_type_count")) {
            this.A04 = LayoutInflater.from(context).inflate(R.layout.tab_button_count, viewGroup, false);
        } else if (str.equals("notification_type_badge")) {
            View inflate5 = LayoutInflater.from(context).inflate(R.layout.tab_button_badge, viewGroup, false);
            this.A04 = inflate5;
            this.A01 = inflate5.findViewById(R.id.tab_notification_wrapper);
        } else {
            throw new IllegalStateException("Unknown notification tab type passed");
        }
        if (this.A02 != null) {
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36324694496260349L) || 182.A06(r4, userSession, 36324694496653571L)) {
                findViewById = this.A02;
            } else {
                ViewStub viewStub = this.A02;
                if (viewStub != null) {
                    findViewById = viewStub.inflate();
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                } else {
                    findViewById = null;
                }
            }
        } else {
            findViewById = this.A04.findViewById(R.id.notification);
        }
        this.A03 = findViewById;
        View view2 = this.A04;
        this.A08 = view2;
        if (r13 == 1QK.A0E) {
            View view3 = this.A01;
            view3 = view3 == null ? view2 : view3;
            0qQ.A0C(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) view3;
            viewGroup2.addView(LayoutInflater.from(context).inflate(R.layout.tab_profile_button, viewGroup2, false), viewGroup2.indexOfChild(findViewById));
            IgImageView requireViewById = this.A04.requireViewById(R.id.tab_avatar);
            0qQ.A07(requireViewById);
            IgImageView igImageView = requireViewById;
            igImageView.setUrl(userSession, AnonymousClass0t1.A01.A01(userSession).Bh3(), r13, 1Tw.A04);
            this.A09 = igImageView;
            if (!182.A06(0Tu.A05, userSession, 36324694496325886L)) {
                ((ViewStub) this.A04.findViewById(R.id.tab_icon_stub)).inflate();
            }
        } else {
            ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.tab_icon_stub);
            if (viewStub2 != null) {
                view = viewStub2.inflate();
            } else {
                view = this.A04;
            }
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.tab_icon);
            0qQ.A0A(colorFilterAlphaImageView);
            0Tu r42 = 0Tu.A05;
            boolean A062 = 182.A06(r42, userSession, 36315559101205870L);
            if (r13 != 1QK.A0B || !2Iw.A00(userSession)) {
                boolean A063 = 182.A06(r42, userSession, 36315559101271407L);
                if (r13 == r3 && A063) {
                    i = R.drawable.tab_activity_bell_drawable;
                    if (A062) {
                        i = R.drawable.instagram_alert_new_pano_filled_24;
                    }
                } else if (A062) {
                    i = r13.A02;
                } else {
                    i = r13.A00;
                }
            } else {
                i = R.drawable.tab_direct_messenger_drawable;
                if (A062) {
                    i = R.drawable.instagram_app_messenger_pano_filled_24;
                }
            }
            colorFilterAlphaImageView.setImageResource(i);
            if (182.A06(r42, userSession, 36315559101205870L)) {
                colorFilterAlphaImageView.setNormalColor(colorFilterAlphaImageView.getContext().getColor(R.color.direct_dark_mode_composer_hint_text_color));
            }
            this.A09 = colorFilterAlphaImageView;
        }
        this.A04.setId(r13.A03);
        this.A04.setContentDescription(context.getResources().getString(r13.A01));
        2eS.A04(this.A04, AnonymousClass05K.A01);
        this.A04.setTag(r13);
    }
}
