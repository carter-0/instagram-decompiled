package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.E1y  reason: case insensitive filesystem */
public final class C47429E1y extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ShareProfileFragment";
    public AnonymousClass36O A00;
    public User A01;
    public Integer A02 = AnonymousClass05K.A00;
    public Integer A03;
    public boolean A04;
    public IgTextView A05;
    public CircularImageView A06;
    public CircularImageView A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final int[] A09 = {-160462, -3078039};

    public final String getModuleName() {
        return "lightweight_connections_share_profile";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E1y, java.lang.Object] */
    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C47429E1y.super.onAttach(context);
        AnonymousClass00O.A00(requireActivity().getOnBackPressedDispatcher(), this, new G4U(this, 24)).A04(true);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v25, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v28, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.x_button);
        FPD.A00(requireViewById, 11, this);
        0qQ.A07(requireViewById);
        FPD.A00(view.requireViewById(R.id.share_button), 8, this);
        IgTextView A0a = DbT.A0a(view, R.id.skip_button);
        FPD.A00(A0a, 9, this);
        this.A05 = A0a;
        Integer num = this.A03;
        if (num == null) {
            str = "navControlVariant";
        } else {
            str = "skipButton";
            if (num == AnonymousClass05K.A01) {
                requireViewById.setVisibility(0);
                IgTextView igTextView = this.A05;
                if (igTextView != null) {
                    igTextView.setVisibility(8);
                }
            } else {
                requireViewById.setVisibility(8);
                IgTextView igTextView2 = this.A05;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
            }
            TextView A0G = DbU.A0G(view, R.id.profile_username);
            A0G.setTypeface(AnonymousClass0qo.A00(requireContext()).A02(0qm.A0W));
            A0G.setAllCaps(true);
            0eE r0 = AnonymousClass0t1.A01;
            AnonymousClass0eM r3 = this.A08;
            DbU.A1H(A0G, DbX.A0l(r0, r3));
            A0G.measure(0, 0);
            TextPaint paint = A0G.getPaint();
            float measuredHeight = (float) A0G.getMeasuredHeight();
            float measuredWidth = (float) A0G.getMeasuredWidth();
            int[] iArr = this.A09;
            paint.setShader(new RadialGradient(((float) A0G.getMeasuredWidth()) / 2.0f, measuredHeight, measuredWidth, iArr[0], iArr[1], Shader.TileMode.CLAMP));
            TextView A0G2 = DbU.A0G(view, R.id.profile_name);
            User user = this.A01;
            if (user == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else {
                A0G2.setText(user.getFullName());
                ? A0X = DbU.A0X(view, R.id.profile_avatar_image);
                A0X.measure(0, 0);
                FPD.A00(A0X, 10, this);
                this.A06 = A0X;
                ? A0X2 = DbU.A0X(view, R.id.plus_badge);
                A0X2.measure(0, 0);
                ? r02 = this.A06;
                str = "avatarImageView";
                if (r02 != 0) {
                    double measuredWidth2 = (double) (r02.getMeasuredWidth() / 2);
                    ? r03 = this.A06;
                    if (r03 != 0) {
                        int sqrt = (int) ((measuredWidth2 - Math.sqrt(((double) r03.getMeasuredWidth()) / 2.0d)) + ((double) (A0X2.getMeasuredWidth() / 2)));
                        ViewGroup.LayoutParams layoutParams = A0X2.getLayoutParams();
                        0qQ.A0C(layoutParams, AnonymousClass000.A00(329));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, sqrt, sqrt);
                        A0X2.setLayoutParams(marginLayoutParams);
                        A0X2.setColorFilter(new PorterDuffColorFilter(A0X2.getResources().getColor(R.color.igds_facebook_blue), PorterDuff.Mode.SRC_IN));
                        this.A07 = A0X2;
                        A00(this);
                        C49938FFr.A01(DbT.A0X(r3), "lightweight_connections");
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A00(C47429E1y e1y) {
        int i;
        User user = e1y.A01;
        String str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        if (user != null) {
            boolean A1n = user.A1n();
            ? r1 = e1y.A07;
            if (A1n) {
                if (r1 != 0) {
                    i = 0;
                }
                0qQ.A0F("plusBadge");
                throw AnonymousClass00P.createAndThrow();
            }
            if (r1 != 0) {
                i = 8;
            }
            0qQ.A0F("plusBadge");
            throw AnonymousClass00P.createAndThrow();
            r1.setVisibility(i);
            CircularImageView circularImageView = e1y.A06;
            if (circularImageView == null) {
                str = "avatarImageView";
            } else {
                User user2 = e1y.A01;
                if (user2 != null) {
                    DbU.A1S(e1y, circularImageView, user2);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void afterOnPause() {
        AnonymousClass2ZP r1;
        super.afterOnPause();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(0);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass36O r3 = this.A00;
        if (r3 != null) {
            r3.A08(intent, i, i2, AnonymousClass7TF.A1S(i, 7384567));
        }
        if (i == 7384567) {
            if (!this.A04) {
                IgTextView igTextView = this.A05;
                if (igTextView == null) {
                    0qQ.A0F("skipButton");
                    throw AnonymousClass00P.createAndThrow();
                }
                DbU.A1G(igTextView, this, 2131968361);
                this.A04 = true;
            }
        } else if (i2 == -1 && intent != null && intent.getExtras() != null) {
            0lg A0X = DbT.A0X(this.A08);
            Integer num = this.A02;
            DbY.A1S(A0X, num);
            C49215ErK.A00(A0X, AnonymousClass05K.A0j, num);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 453756890(0x1b0bc7da, float:1.1562386E-22)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r7 = r14
            X.C47429E1y.super.onCreate(r15)
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r5 = r14.A08
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r5)
            r14.A01 = r0
            android.os.Bundle r1 = r14.mArguments
            if (r1 == 0) goto L_0x006c
            java.lang.String r0 = "ShareProfileFragment.NavControlVariant"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x006c
            java.lang.String r0 = "NUX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x002b:
            r14.A03 = r0
            boolean r0 = X.AnonymousClass36O.A0G
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            X.0hq r8 = X.DbV.A0I(r14)
            X.0qQ.A07(r8)
            com.instagram.user.model.User r11 = r14.A01
            if (r11 != 0) goto L_0x0048
            java.lang.String r0 = "user"
        L_0x0040:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0048:
            r4 = 0
            X.FTY r9 = new X.FTY
            r9.<init>(r14, r4)
            java.lang.Integer r12 = X.AnonymousClass05K.A0s
            r13 = 0
            X.36O r6 = new X.36O
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r6
            java.lang.Integer r1 = r14.A03
            if (r1 != 0) goto L_0x006f
            java.lang.String r0 = "navControlVariant"
            goto L_0x0040
        L_0x005f:
            java.lang.String r0 = "TOOLBAR"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006c
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        L_0x006c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x002b
        L_0x006f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = r0
            if (r1 == r0) goto L_0x0076
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0076:
            r14.A02 = r0
            X.0lg r1 = X.DbT.A0X(r5)
            java.lang.Integer r0 = r14.A02
            X.AnonymousClass7TF.A1B(r1, r4, r0)
            X.C49215ErK.A00(r1, r2, r0)
            r0 = 17695981(0x10e04ed, float:2.6084815E-38)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47429E1y.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-269457496);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.nux_share_profile, false);
        AnonymousClass0fD.A09(-1988457642, A022);
        return A0D;
    }

    public final void onResume() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(-2125018114);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(8);
        }
        AnonymousClass0fD.A09(-589684959, A022);
    }
}
