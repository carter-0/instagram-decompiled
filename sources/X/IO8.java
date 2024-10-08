package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public final class IO8 implements C252243on {
    public long A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public TextView A05;
    public 2cs A06;
    public C324246ys A07;
    public AppBarLayout A08;
    public OriginalAudioSubtype A09;
    public IgLinearLayout A0A;
    public ColorFilterAlphaImageView A0B;
    public final long A0C;
    public final AnonymousClass8ZN A0D;
    public final AnonymousClass4DH A0E;
    public final C54191H2l A0F;
    public final C320506sU A0G;
    public final UserSession A0H;
    public final ImageUrl A0I;
    public final HM8 A0J;
    public final C53044Ghc A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final boolean A0W;

    public IO8(AnonymousClass8ZN r3, AnonymousClass4DH r4, C54191H2l h2l, C320506sU r6, UserSession userSession, ImageUrl imageUrl, HM8 hm8, C53044Ghc ghc, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, boolean z) {
        0qQ.A0B(userSession, 3);
        this.A0K = ghc;
        this.A0E = r4;
        this.A0H = userSession;
        this.A0W = z;
        this.A0M = str;
        this.A0C = j;
        this.A0D = r3;
        this.A0P = str2;
        this.A0O = str3;
        this.A0V = str4;
        this.A0U = str5;
        this.A0N = str6;
        this.A0Q = str7;
        this.A0S = str8;
        this.A0R = str9;
        this.A0L = bool;
        this.A0T = str10;
        this.A0I = imageUrl;
        this.A0G = r6;
        this.A0F = h2l;
        this.A0J = hm8;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A03 = DbX.A0I(view, R.id.use_in_camera_button_scene_root);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.use_in_camera_label);
        this.A05 = A0R2;
        if (A0R2 == null) {
            0qQ.A0F("useInCameraLabel");
            throw AnonymousClass00P.createAndThrow();
        }
        A0R2.setText(2131976201);
        this.A0A = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.action_button_container);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.use_in_camera_button);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.use_in_camera_label);
        this.A0B = (ColorFilterAlphaImageView) AnonymousClass7TF.A0F(view, R.id.use_in_camera_icon);
        this.A08 = (AppBarLayout) AnonymousClass7TF.A0F(view, R.id.app_bar_layout);
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
