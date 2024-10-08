package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class NMR extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgImageView(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r9, C276544tV r10, Object obj) {
        Context context;
        int i;
        ImageView imageView = (ImageView) view;
        boolean A1b = C51973G9u.A1b(imageView, r9, r10);
        Object A06 = C307476Qg.A06(r9, r10);
        A06.getClass();
        O5N o5n = (O5N) A06;
        C226462gr r1 = o5n.A00;
        String A0D = r10.A0D();
        if (r1 == null) {
            if (A0D != null) {
                int hashCode = A0D.hashCode();
                if (hashCode != 330418449) {
                    if (hashCode != 1752071467) {
                        if (hashCode == 1895067328 && A0D.equals("ig-qp-meta-ai-donut-spin-animation")) {
                            context = r9.A00;
                            i = R.drawable.meta_ai_animations_conversion_kf_mai_100dp_ambientspin;
                        }
                    } else if (A0D.equals("ig-qp-meta-ai-donut-flip-animation")) {
                        context = r9.A00;
                        i = R.drawable.meta_ai_animations_conversion_kf_mai_100p_flip;
                    }
                } else if (A0D.equals("ig-qp-ballot-box-animation-v2")) {
                    context = r9.A00;
                    i = R.drawable.civic_engagement_constituent_nux_ig_qp_ballot_box_animation_v2;
                }
                r1 = (C226462gr) context.getDrawable(i);
                o5n.A00 = r1;
            }
            return null;
        }
        imageView.setImageDrawable(r1);
        if (A0D == null || !A0D.equals("ig-qp-meta-ai-donut-flip-animation")) {
            if (r1 != null) {
                r1.EFK();
            }
            return null;
        }
        if (r1 != null) {
            r1.EFJ(A1b ? 1 : 0);
        }
        return null;
        r1.E2p();
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        AnonymousClass7TG.A1T(imageView, r3, r4);
        Object A06 = C307476Qg.A06(r3, r4);
        A06.getClass();
        C226462gr r0 = ((O5N) A06).A00;
        if (r0 != null) {
            r0.pause();
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
