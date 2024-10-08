package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButtonBase;

/* renamed from: X.3rl  reason: invalid class name and case insensitive filesystem */
public final class C253993rl extends C254003rm implements AnonymousClass3N3, AnonymousClass2xU {
    public View A00;
    public View A01;
    public ImageView A02;
    public TextView A03;
    public ColorFilterAlphaImageView A04;
    public AnonymousClass3YB A05;
    public C243503Za A06;
    public AnonymousClass2xU A07;
    public AnonymousClass3W1 A08;
    public C70582OCf A09;
    public FollowButtonBase A0A;
    public IgdsButton A0B;
    public final int A0C;
    public final View A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final CircularImageView A0I;
    public final C252063oV A0J;
    public final C252063oV A0K;
    public final C252063oV A0L;
    public final C252063oV A0M;
    public final C252063oV A0N;
    public final C252063oV A0O;
    public final C252063oV A0P;
    public final C252063oV A0Q;
    public final C252063oV A0R;
    public final C252063oV A0S;
    public final C252063oV A0T;
    public final C252063oV A0U;
    public final C252063oV A0V;
    public final C252063oV A0W = 2b1.A01(this.A00.findViewById(R.id.profile_feed_ad_preview_disclaimer_stub), false, false);
    public final C252063oV A0X;
    public final C252063oV A0Y;
    public final C252063oV A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d;
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final C252063oV A0i;
    public final AnonymousClass0eM A0j = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LN(this, 22));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C253993rl(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A0E = viewGroup;
        View requireViewById = viewGroup.requireViewById(R.id.row_feed_photo_profile_imageview);
        0qQ.A07(requireViewById);
        this.A0I = (CircularImageView) requireViewById;
        this.A0V = 2b1.A01(viewGroup.findViewById(R.id.row_feed_photo_profile_badge_stub), false, false);
        View requireViewById2 = viewGroup.requireViewById(R.id.row_feed_photo_profile_name);
        0qQ.A07(requireViewById2);
        this.A0F = (TextView) requireViewById2;
        View requireViewById3 = viewGroup.requireViewById(R.id.secondary_label);
        0qQ.A07(requireViewById3);
        this.A0G = (TextView) requireViewById3;
        View requireViewById4 = viewGroup.requireViewById(R.id.tertiary_label);
        0qQ.A07(requireViewById4);
        this.A0H = (TextView) requireViewById4;
        this.A0L = 2b1.A01(viewGroup.requireViewById(R.id.cyclic_subtitle_layout_stub), false, false);
        this.A0b = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 16));
        C252063oV A012 = 2b1.A01(viewGroup.findViewById(R.id.row_right_aligned_follow_button_stub), false, false);
        A012.EeU(AnonymousClass477.A00);
        this.A0X = A012;
        C252063oV A013 = 2b1.A01(viewGroup.findViewById(R.id.row_right_aligned_follow_button_base_stub), false, false);
        A013.EeU(AnonymousClass478.A00);
        this.A0Y = A013;
        this.A0N = 2b1.A01(viewGroup.findViewById(R.id.row_feed_collaborative_profile_facepile_stub), false, false);
        View requireViewById5 = viewGroup.requireViewById(R.id.divider);
        0qQ.A07(requireViewById5);
        this.A0D = requireViewById5;
        this.A0Z = 2b1.A01(viewGroup.findViewById(R.id.row_feed_view_shop_button_stub), false, false);
        this.A0P = 2b1.A01(viewGroup.findViewById(R.id.row_feed_favorites_badge_stub), false, false);
        this.A0O = 2b1.A01(viewGroup.findViewById(R.id.row_feed_fan_club_badge_stub), false, false);
        this.A0K = 2b1.A01(viewGroup.findViewById(R.id.row_feed_close_friends_badge_stub), false, false);
        this.A0S = 2b1.A01(viewGroup.findViewById(R.id.row_feed_opal_badge_stub), false, false);
        this.A0C = viewGroup.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A0i = 2b1.A01(viewGroup.findViewById(R.id.subscribe_button_stub), false, false);
        this.A0M = 2b1.A01(viewGroup.findViewById(R.id.feed_more_button_stub), false, false);
        this.A0T = 2b1.A01(viewGroup.findViewById(R.id.post_dismiss_button_stub), false, false);
        this.A0U = 2b1.A01(viewGroup.findViewById(R.id.post_dismiss_small_button_stub), false, false);
        this.A0Q = 2b1.A01(viewGroup.findViewById(R.id.live_badge_stub), false, false);
        this.A0R = 2b1.A01(viewGroup.findViewById(R.id.media_timestamp_stub), false, false);
        this.A0J = 2b1.A01(viewGroup.findViewById(R.id.add_post_button_stub), false, false);
        this.A0f = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 20));
        this.A0g = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 21));
        this.A0c = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 17));
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 15));
        this.A0e = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 19));
        this.A0h = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 23));
        this.A0d = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 18));
    }

    public final void DQp(AnonymousClass3W1 r6, int i) {
        int i2 = 0;
        0qQ.A0B(r6, 0);
        AnonymousClass2xU r0 = this.A07;
        if (r0 != null) {
            r0.DQp(r6, i);
        }
        AnonymousClass3YB r02 = this.A05;
        if ((r02 == null || r02.A08) && i == 51) {
            boolean z = r6.A1v;
            ViewGroup viewGroup = this.A00;
            if (!z) {
                i2 = 8;
            }
            C61210lx.A02(viewGroup, C59250Ng.A00, i2, 75);
        }
    }

    public final boolean EtJ() {
        return true;
    }

    public final IgdsButton A00() {
        IgdsButton igdsButton = this.A0B;
        if (igdsButton == null) {
            igdsButton = (IgdsButton) this.A0i.getView();
            this.A0B = igdsButton;
            if (igdsButton == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return igdsButton;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A0I);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A0I;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A0I);
    }

    public final GradientSpinner Bkt() {
        return (GradientSpinner) this.A0j.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A0I.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A0I.setVisibility(0);
    }
}
