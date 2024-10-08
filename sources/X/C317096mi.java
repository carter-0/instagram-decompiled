package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.6mi  reason: invalid class name and case insensitive filesystem */
public final class C317096mi {
    public View A00;
    public IgFrameLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public RoundedCornerImageView A09;
    public RoundedCornerImageView A0A;
    public RoundedCornerImageView A0B;
    public final C252063oV A0C;

    public static final View A00(C317096mi r0, int i) {
        View view = r0.A00;
        if (view != null) {
            return view.requireViewById(i);
        }
        0qQ.A0F("rootView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(AnonymousClass3IL r0, AnonymousClass0iw r1, RoundedCornerImageView roundedCornerImageView, int i) {
        1Xj r02;
        ImageUrl A1Q;
        List list = r0.A08;
        if (list != null && (r02 = (1Xj) 00k.A0O(list, i)) != null && (A1Q = r02.A1Q()) != null) {
            roundedCornerImageView.setUrl(A1Q, r1);
        }
    }

    public C317096mi(C252063oV r1) {
        this.A0C = r1;
    }

    public static final String A01(C317096mi r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        View view = r2.A00;
        if (view == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        Resources resources = view.getContext().getResources();
        0qQ.A07(resources);
        return C253673rC.A04(resources, valueOf, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
    }
}
