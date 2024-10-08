package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Map;

/* renamed from: X.7Kg  reason: invalid class name and case insensitive filesystem */
public final class C329797Kg implements C332827Wn, AnonymousClass7Ws, AnonymousClass7XA {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public TextView A05;
    public TextView A06;
    public C61037Jvb A07;
    public IgSimpleImageView A08;
    public C70726OHv A09;
    public C329817Ki A0A;
    public boolean A0B = false;
    public ViewStub A0C;
    public C329807Kh A0D;
    public final ViewStub A0E;
    public final UserSession A0F;
    public final C329087Hn A0G;
    public final AnonymousClass0iw A0H;
    public final C332827Wn A0I;

    public final void CJS(RectF rectF, 2FW r2, DirectMessageIdentifier directMessageIdentifier, GradientSpinner gradientSpinner, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
    }

    public final C70762OKi CgK(C74328Pt4 pt4, String str) {
        return null;
    }

    public final boolean isResumed() {
        return true;
    }

    public static void A00(C329797Kg r3) {
        C329807Kh r1 = r3.A0D;
        View view = r1.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        IgSimpleImageView igSimpleImageView = r1.A01;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
        IgSimpleImageView igSimpleImageView2 = r3.A08;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(8);
        }
        C329817Ki r0 = r3.A0A;
        IgProgressImageView igProgressImageView = r0.A01;
        if (igProgressImageView != null) {
            igProgressImageView.removeView(r0.A02);
            igProgressImageView.setVisibility(8);
            igProgressImageView.A06(R.id.listener_id_for_direct_gated_media_item_viewer_image_binding);
            igProgressImageView.getIgImageView().clearColorFilter();
        }
        FrameLayout frameLayout = r3.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final boolean A02() {
        ViewGroup viewGroup = this.A03;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public C329797Kg(ViewStub viewStub, AnonymousClass0iw r8, UserSession userSession, C332827Wn r10, C329087Hn r11) {
        this.A0F = userSession;
        this.A0E = viewStub;
        this.A0G = r11;
        this.A0H = r8;
        ViewStub viewStub2 = new ViewStub(viewStub.getContext());
        this.A0C = viewStub2;
        viewStub2.setLayoutResource(R.layout.quoted_reply_media_share_preview_gated);
        C329807Kh r5 = new C329807Kh(this.A0C);
        this.A0D = r5;
        this.A0I = r10;
        ViewStub viewStub3 = this.A0C;
        this.A0A = new C329817Ki(viewStub3, r8, userSession, r10, r5);
    }

    public final void A01(AnonymousClass7L0 r4) {
        int i;
        int i2;
        if (A02()) {
            if (this.A0B) {
                i = r4.A0C;
                i2 = r4.A0D;
            } else {
                i = r4.A0D;
                i2 = r4.A0C;
            }
            TextView textView = this.A05;
            if (textView != null) {
                textView.setTextColor(i);
            }
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.setTextColor(i2);
            }
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(r4.A02);
            }
            View view = this.A02;
            if (view != null) {
                view.setBackgroundColor(r4.A08);
            }
        }
    }
}
