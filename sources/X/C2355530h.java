package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.30h  reason: invalid class name and case insensitive filesystem */
public final class C2355530h extends C252233om implements C2355630i {
    public ViewStub A00;
    public IgImageView A01;
    public final int A02;
    public final Fragment A03;
    public final AnonymousClass0iw A04;
    public final C70952Zb A05;
    public final C2355830k A06 = new C2355830k();

    public C2355530h(Fragment fragment, AnonymousClass0iw r4, C70952Zb r5) {
        0qQ.A0B(r5, 3);
        this.A03 = fragment;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = fragment.requireContext().getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A00 = (ViewStub) view.findViewById(R.id.save_popout_image_stub);
    }

    public final void ExY(Context context, Uri uri, int i) {
        0qQ.A0B(uri, 0);
        if (i >= 0 && this.A00 != null) {
            if (this.A01 == null) {
                A00();
            }
            A01(i);
            IgImageView igImageView = this.A01;
            if (igImageView != null) {
                igImageView.setImageURI(uri);
            }
            this.A06.A01(i);
        }
    }

    public final void ExZ(Context context, 1Xj r5, int i) {
        0qQ.A0B(r5, 0);
        if (i >= 0) {
            ExtendedImageUrl A1n = r5.A1n(context);
            if (this.A00 != null && A1n != null && !r5.CbC()) {
                if (this.A01 == null) {
                    A00();
                }
                A01(i);
                IgImageView igImageView = this.A01;
                if (igImageView != null) {
                    igImageView.setUrl(A1n, this.A04);
                }
                this.A06.A01(i);
            }
        }
    }

    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    private final void A00() {
        ViewStub viewStub = this.A00;
        if (viewStub != null) {
            IgImageView inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
            IgImageView igImageView = inflate;
            this.A01 = igImageView;
            if (igImageView != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(igImageView.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), SN3.MAX_SIGNED_POWER_OF_TWO);
                igImageView.measure(makeMeasureSpec, makeMeasureSpec);
                igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    private final void A01(int i) {
        int i2;
        Fragment fragment = this.A03;
        View view = fragment.mView;
        if (view != null) {
            if (i >= 5) {
                i = 4;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            IgImageView igImageView = this.A01;
            int i3 = 0;
            if (igImageView != null) {
                i2 = igImageView.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            IgImageView igImageView2 = this.A01;
            if (igImageView2 != null) {
                i3 = igImageView2.getMeasuredHeight();
            }
            int i4 = width / 5;
            int i5 = (i * i4) + ((i4 - i2) / 2);
            if (0mk.A02(fragment.requireContext())) {
                i5 = -i5;
            }
            IgImageView igImageView3 = this.A01;
            if (igImageView3 != null) {
                igImageView3.setX((float) i5);
                igImageView3.setY((float) ((height - i3) - this.A02));
                igImageView3.setScaleX(0.0f);
                igImageView3.setScaleY(0.0f);
            }
        }
    }

    public final void CvR(boolean z, float f) {
        IgImageView igImageView = this.A01;
        if (igImageView == null) {
            return;
        }
        if (z) {
            igImageView.setScaleX(f);
            igImageView.setScaleY(f);
            return;
        }
        float f2 = (f / 2.0f) + 0.5f;
        igImageView.setScaleX(f2);
        igImageView.setScaleY(f2);
        igImageView.setY(igImageView.getY() + ((1.0f - f) * ((float) (this.A02 + igImageView.getWidth()))));
    }

    public final void onPause() {
        if (this.A01 != null) {
            A01(4);
        }
        C2355830k r1 = this.A06;
        r1.A03((C2355730j) null);
        r1.A04.clear();
    }

    public final void onResume() {
        C2355830k r1 = this.A06;
        r1.A03(this);
        r1.A02(this.A05);
    }
}
