package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8XG  reason: invalid class name */
public final class AnonymousClass8XG {
    public Medium A00;
    public C369988ve A01;
    public WeakReference A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Activity A06;
    public final Drawable A07;
    public final C355608Qq A08;
    public final UserSession A09;
    public final C3498081w A0A;
    public final AnonymousClass8XJ A0B;
    public final AnonymousClass8XD A0C;
    public final AnonymousClass8XH A0D;
    public final Map A0E = new HashMap();
    public final boolean A0F;
    public final View A0G;
    public final AnonymousClass846 A0H;
    public final C41777B0g galleryButtonDraftThumbnailLoaderListener;
    public C348257y9 galleryButtonMediumThumbnailLoaderListener;
    public B2Y storyDraftThumbnailLoaderListener;

    public AnonymousClass8XG(Activity activity, View view, ViewGroup viewGroup, C355608Qq r7, UserSession userSession, C3498081w r9, AnonymousClass8XD r10, AnonymousClass846 r11) {
        0qQ.A0B(viewGroup, 4);
        this.A06 = activity;
        this.A09 = userSession;
        this.A0C = r10;
        this.A0A = r9;
        this.A08 = r7;
        this.A0H = r11;
        this.A0G = view;
        int A042 = (int) 0nA.A04(activity, 34);
        this.A05 = A042;
        this.A03 = (int) 0nA.A04(activity, 2);
        this.A04 = activity.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0F = 2Yu.A0L(activity, R.attr.quickCaptureControllerGalleryButtonCircular, false);
        this.A07 = activity.getDrawable(R.drawable.instagram_photo_filled_44);
        this.A0D = new AnonymousClass8XH(userSession, A042, A042);
        this.A0B = new AnonymousClass8XJ(viewGroup, r9, this);
    }

    public final void A01(List list) {
        if (list.isEmpty()) {
            this.A0A.EZd(this.A07);
            this.A00 = null;
            return;
        }
        Medium medium = (Medium) list.get(0);
        this.A00 = medium;
        C348247y8 r1 = new C348247y8(this);
        this.galleryButtonMediumThumbnailLoaderListener = r1;
        C355608Qq r0 = this.A08;
        if (medium != null) {
            r0.A04(medium, r1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00() {
        C3497981v r4 = (C3497981v) this.A0A;
        View view = r4.getView();
        if (view.getVisibility() == 0) {
            Activity activity = this.A06;
            String string = activity.getString(2131961036);
            0qQ.A07(string);
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
            r1.A06(C226262fy.ABOVE_ANCHOR);
            view.post(new C41019An3(r4, r1));
        }
    }
}
