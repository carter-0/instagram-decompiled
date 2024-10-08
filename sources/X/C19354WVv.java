package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;

/* renamed from: X.WVv  reason: case insensitive filesystem */
public final class C19354WVv implements C20951X6e {
    public MediaMapPin A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final Group A08;
    public final UserSession A09;
    public final CircularImageView A0A;
    public final LocationDetailFragment A0B;
    public final MediaMapFragment A0C;
    public final MediaMapFragment A0D;
    public final C19507Wat A0E;
    public final GradientSpinner A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final ViewGroup A0J;

    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v31, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void ADS() {
        User user;
        int i;
        Reel reel;
        String str;
        ImageUrl imageUrl;
        ImageUrl A072;
        Venue A002 = C18231Vnv.A00(this.A00.A09);
        LocationPageInformation locationPageInformation = this.A00.A06;
        if (locationPageInformation != null) {
            user = locationPageInformation.A00();
        } else {
            user = null;
        }
        Context context = this.A0I;
        UserSession userSession = this.A09;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C18792W1y.A02(context, userSession, A002, "MEDIA_MAP"));
        String address = A002.A00.getAddress();
        if (locationPageInformation == null || user == null) {
            C17896Vhn vhn = this.A0D.A05;
            String A052 = A002.A05();
            i = 0;
            0qQ.A0B(A052, 0);
            reel = (Reel) vhn.A03.get(A052);
            0nA.A0X(this.A0J, this.A0G);
            str = null;
            imageUrl = null;
        } else {
            0Tu r2 = 0Tu.A05;
            182.A06(r2, userSession, 36315039409376203L);
            182.A06(r2, userSession, 36315657884732877L);
            str = user.getUsername();
            String AnQ = user.A03.AnQ();
            imageUrl = user.Bh3();
            LocationDetailFragment locationDetailFragment = this.A0B;
            IgImageView igImageView = this.A0A;
            igImageView.setVisibility(0);
            igImageView.setUrl(imageUrl, locationDetailFragment);
            i = 0;
            this.A01.setVisibility(0);
            this.A02.setVisibility(0);
            WBG.A01(this.A07, 17, user, this);
            WBG.A01(this.A05, 18, user, this);
            WBG.A01(this.A06, 19, user, this);
            if (AnQ != null && !AnQ.equals("")) {
                address = 002.A0g(address, ", ", AnQ);
            }
            reel = 1OP.A05(userSession).A0M(user.getId());
        }
        if (address != null && !address.isEmpty()) {
            if (spannableStringBuilder.length() == 0) {
                spannableStringBuilder.append(address);
            } else {
                spannableStringBuilder.append(002.A0R(" · ", address));
            }
        }
        if (182.A06(0Tu.A06, userSession, 36315713719242228L)) {
            spannableStringBuilder.clear();
        }
        String name = A002.A00.getName();
        String obj = spannableStringBuilder.toString();
        WB8 wb8 = new WB8(this, 52);
        TextView textView = this.A07;
        textView.setText(name);
        Group group = this.A08;
        AnonymousClass0fU.A00(wb8, group);
        textView.setVisibility(i);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.A05;
        if (isEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
            textView2.setVisibility(i);
        }
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        TextView textView3 = this.A06;
        if (isEmpty2) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(obj);
            textView3.setVisibility(i);
        }
        textView.setGravity(8388611);
        ImageView imageView = this.A04;
        if (imageView.getVisibility() == 4) {
            imageView.setVisibility(8);
        }
        if (reel != null) {
            LocationDetailFragment locationDetailFragment2 = this.A0B;
            C17773Vfk vfk = new C17773Vfk(this);
            GradientSpinner gradientSpinner = this.A0F;
            gradientSpinner.setVisibility(i);
            if (imageUrl == null && (A072 = reel.A07()) != null) {
                this.A0A.setUrl(A072, locationDetailFragment2);
            }
            WB4.A00(group, this, reel, vfk, 23);
            WB4.A00(gradientSpinner, this, reel, vfk, 24);
            if (reel.A16(userSession)) {
                gradientSpinner.A04();
            } else {
                gradientSpinner.A02();
            }
            this.A0A.setOnClickListener((View.OnClickListener) null);
        } else if (user == null) {
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            group.setOnClickListener((View.OnClickListener) null);
            int i2 = this.A0H;
            0nA.A0Z(textView, i2);
            0nA.A0Z(textView2, i2);
            0nA.A0Z(textView3, i2);
        } else {
            GradientSpinner gradientSpinner2 = this.A0F;
            gradientSpinner2.setVisibility(4);
            gradientSpinner2.setOnClickListener((View.OnClickListener) null);
            WBG.A01(this.A0A, 20, user, this);
        }
        AnonymousClass0fU.A00(new WB8(this, 53), imageView);
        imageView.setVisibility(i);
        Drawable drawable = context.getDrawable(R.drawable.instagram_more_vertical_pano_outline_24);
        WB8 wb82 = new WB8(this, 51);
        String A0a = JTQ.A0a(context, 2131966723);
        ImageView imageView2 = this.A03;
        imageView2.setImageDrawable(drawable);
        AnonymousClass0fU.A00(wb82, imageView2);
        imageView2.setContentDescription(A0a);
        imageView2.setVisibility(i);
    }

    public final void Ed7(MediaMapPin mediaMapPin) {
        this.A00 = mediaMapPin;
    }

    public C19354WVv(ViewGroup viewGroup, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin) {
        this.A0B = locationDetailFragment;
        this.A0I = locationDetailFragment.requireContext();
        this.A09 = userSession;
        this.A00 = mediaMapPin;
        this.A0D = mediaMapFragment;
        this.A0C = mediaMapFragment2;
        this.A0J = viewGroup;
        Resources resources = viewGroup.getResources();
        this.A0G = AnonymousClass7TE.A0D(resources);
        this.A0H = JTP.A03(resources);
        0nA.A0V(viewGroup, -2);
        this.A08 = (Group) viewGroup.requireViewById(R.id.location_detail_action_bar_title_layout);
        this.A05 = DbU.A0G(viewGroup, R.id.location_detail_action_bar_sub_title);
        this.A06 = DbU.A0G(viewGroup, R.id.location_detail_action_bar_sub_title_2);
        this.A07 = DbU.A0G(viewGroup, R.id.location_detail_action_bar_title);
        this.A01 = viewGroup.requireViewById(R.id.location_detail_story_container);
        this.A02 = viewGroup.requireViewById(R.id.location_detail_story_separator);
        CircularImageView A0X = DbU.A0X(viewGroup, R.id.location_detail_story_image);
        this.A0A = A0X;
        GradientSpinner gradientSpinner = (GradientSpinner) viewGroup.requireViewById(R.id.gradient_spinner);
        this.A0F = gradientSpinner;
        this.A0E = new C19507Wat(A0X, gradientSpinner);
        this.A04 = DbU.A0F(viewGroup, R.id.x_button);
        this.A03 = DbU.A0F(viewGroup, R.id.accessory_button);
    }

    public static void A00(C19354WVv wVv, User user) {
        String id = user.getId();
        UserSession userSession = wVv.A09;
        FragmentActivity requireActivity = wVv.A0B.requireActivity();
        AnonymousClass7TG.A1O(userSession, requireActivity);
        C46474Dfc A012 = C46548Dgp.A01(userSession, id, "discovery_map", "discovery_map_location_detail");
        A012.A0O = null;
        DbY.A0u(requireActivity, C51973G9u.A0A(userSession, A012), userSession, "profile");
        MediaMapFragment mediaMapFragment = wVv.A0D;
        DbZ.A1a(mediaMapFragment.A0E, mediaMapFragment.A0F, wVv.A00, "instagram_map_location_detail_tap_profile");
    }
}
