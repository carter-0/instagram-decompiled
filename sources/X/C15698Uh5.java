package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;

/* renamed from: X.Uh5  reason: case insensitive filesystem */
public final class C15698Uh5 extends C252233om implements C70952Zb, C2355730j {
    public IgImageView A00;
    public C70952Zb A01;
    public View A02;
    public View A03;
    public AnonymousClass2h7 A04;
    public final Context A05;
    public final Fragment A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C2355830k A09;
    public final AnonymousClass0eM A0A = C20693WxP.A00(this, 27);

    public final void A01(View view, ViewGroup viewGroup, Product product) {
        ExtendedImageUrl A012;
        ViewGroup viewGroup2;
        if (!(!this.A09.A03.A0C())) {
            this.A02 = view;
            View view2 = this.A03;
            if (view2 == null) {
                view2 = LayoutInflater.from(this.A06.requireContext()).inflate(R.layout.product_thumbnail_popout_image, viewGroup, false);
                this.A00 = JTO.A0Y(view2, R.id.save_popout_imageview);
                AnonymousClass0eM r1 = this.A0A;
                0nA.A0f(view2, DbX.A07(r1));
                0nA.A0V(view2, DbX.A07(r1));
            }
            this.A03 = view2;
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                viewGroup2.removeView(view2);
            }
            viewGroup.addView(view2);
            ImageInfo imageInfo = product.A07;
            if (imageInfo != null && (A012 = 1iI.A01(this.A05, imageInfo)) != null) {
                A00(view2);
                IgImageView igImageView = this.A00;
                if (igImageView != null) {
                    igImageView.A0E = new WTJ(this, 4);
                    igImageView.setUrl(A012, this.A07);
                }
            }
        }
    }

    public final void onDestroy() {
        this.A02 = null;
        this.A00 = null;
    }

    public /* synthetic */ C15698Uh5(Context context, Fragment fragment, AnonymousClass0iw r5, UserSession userSession) {
        C2355830k r1 = new C2355830k();
        0qQ.A0B(userSession, 4);
        this.A06 = fragment;
        this.A05 = context;
        this.A07 = r5;
        this.A08 = userSession;
        this.A09 = r1;
    }

    private final void A00(View view) {
        View view2 = this.A02;
        if (view2 != null) {
            view.setX(view2.getX() + C13988Tno.A01(view2.getWidth() - DbX.A07(this.A0A)));
            view.setY(0.0f);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
    }

    public final void CvR(boolean z, float f) {
        if (z) {
            View view = this.A03;
            if (view != null) {
                view.setScaleX(f);
            }
            View view2 = this.A03;
            if (view2 != null) {
                view2.setScaleY(f);
                return;
            }
            return;
        }
        float f2 = (f / 2.0f) + 0.5f;
        View view3 = this.A03;
        if (view3 != null) {
            view3.setScaleX(f2);
        }
        View view4 = this.A03;
        if (view4 != null) {
            view4.setScaleY(f2);
        }
        View view5 = this.A03;
        if (view5 != null) {
            view5.setY(view5.getY() - ((1.0f - f) * ((float) view5.getHeight())));
        }
    }

    public final void DY7(int i) {
        View view = this.A02;
        if (view != null) {
            AnonymousClass2h7 r0 = new AnonymousClass2h7(view);
            r0.A02();
            r0.A00();
            this.A04 = r0;
        }
        C70952Zb r02 = this.A01;
        if (r02 != null) {
            r02.DY7(i);
        }
    }

    public final void onPause() {
        C2355830k r1 = this.A09;
        r1.A03((C2355730j) null);
        r1.A04.clear();
        AnonymousClass2h7 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
        View view = this.A03;
        if (view != null) {
            A00(view);
        }
    }

    public final void onResume() {
        C2355830k r0 = this.A09;
        r0.A03(this);
        r0.A02(this);
        AnonymousClass2h7 r02 = this.A04;
        if (r02 != null) {
            r02.A02();
        }
    }
}
