package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class NMQ extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new FrameLayout(context);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r7, C276544tV r8, Object obj) {
        int i;
        ViewGroup viewGroup = (ViewGroup) view;
        AnonymousClass7TG.A1T(viewGroup, r7, r8);
        Context context = r7.A00;
        IgImageView igImageView = new IgImageView(context);
        String A0F = r8.A0F();
        if (A0F != null) {
            int hashCode = A0F.hashCode();
            if (hashCode != -451844079) {
                if (hashCode != -14956424) {
                    if (hashCode == 356806606 && A0F.equals("autogen-intro-animation-new-style")) {
                        i = R.drawable.airbender_nux_assets_autogen_intro_animation_new_style;
                    }
                } else if (A0F.equals("autogen-waiting-animation")) {
                    i = R.drawable.airbender_nux_assets_autogen_waiting_animation;
                }
            } else if (A0F.equals("autogen-intro-animation-kf")) {
                i = R.drawable.airbender_nux_assets_autogen_intro_animation_kf;
            }
            C226472gs r0 = (C226472gs) context.getDrawable(i);
            if (r0 != null) {
                r0.EFK();
                r0.E2p();
                igImageView.setImageDrawable(r0);
            }
        }
        viewGroup.addView(igImageView);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        0qQ.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}
