package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.6zG  reason: invalid class name and case insensitive filesystem */
public final class C324426zG {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final IgSimpleImageView A03;
    public final IgImageView A04;
    public final TouchInterceptorFrameLayout A05;
    public final View A06;

    public C324426zG(View view) {
        0qQ.A0B(view, 1);
        this.A06 = view;
        View requireViewById = view.requireViewById(R.id.expanded_profile_pic_container);
        0qQ.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        IgImageView requireViewById2 = view.requireViewById(R.id.expanded_profile_pic);
        0qQ.A07(requireViewById2);
        this.A04 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.profile_share_card);
        0qQ.A07(requireViewById3);
        this.A01 = (ViewGroup) requireViewById3;
        TouchInterceptorFrameLayout requireViewById4 = view.requireViewById(R.id.touch_interceptor_expanded_profile_pic);
        0qQ.A07(requireViewById4);
        this.A05 = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.expanded_profile_picture_edit_button);
        0qQ.A07(requireViewById5);
        this.A03 = (IgSimpleImageView) requireViewById5;
        this.A02 = (ViewStub) view.requireViewById(R.id.multiple_profile_picture_viewstub);
    }
}
