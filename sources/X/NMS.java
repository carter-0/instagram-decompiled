package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class NMS extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgImageView(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r5, C276544tV r6, Object obj) {
        ImageView imageView = (ImageView) view;
        AnonymousClass7TG.A1T(imageView, r5, r6);
        Object A06 = C307476Qg.A06(r5, r6);
        A06.getClass();
        O5O o5o = (O5O) A06;
        C226462gr r0 = o5o.A00;
        if (r0 == null) {
            r0 = (C226462gr) r5.A00.getDrawable(R.drawable.civic_engagement_constituent_nux_ig_qp_ballot_box_animation_v2);
            o5o.A00 = r0;
        }
        imageView.setImageDrawable(r0);
        if (r0 == null) {
            return null;
        }
        r0.EFK();
        r0.E2p();
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        AnonymousClass7TG.A1T(imageView, r3, r4);
        Object A06 = C307476Qg.A06(r3, r4);
        A06.getClass();
        C226462gr r0 = ((O5O) A06).A00;
        if (r0 != null) {
            r0.pause();
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
