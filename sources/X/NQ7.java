package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;

public final class NQ7 extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67991MyJ(DbT.A0D(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        FrameLayout.LayoutParams layoutParams;
        N5N n5n = (N5N) r7;
        C67991MyJ myJ = (C67991MyJ) r8;
        AnonymousClass7TG.A1N(n5n, myJ);
        View view = myJ.A00;
        view.findViewById(R.id.sender_avatar).setVisibility(8);
        AnonymousClass7L2 r2 = n5n.A00;
        LayerDrawable A02 = AnonymousClass7FB.A02(r2);
        ImageView imageView = myJ.A01;
        Context A0S = AnonymousClass7TE.A0S(view);
        AnonymousClass7FB.A05(A0S, A02, r2, false);
        imageView.setBackground(A02);
        C66799Mcl mcl = myJ.A02;
        AnonymousClass4Ed.A02(A0S, mcl, R.attr.igds_color_secondary_text);
        imageView.setImageDrawable(mcl);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 8388613;
        }
        mcl.start();
    }

    public final Class modelClass() {
        return N5N.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        C67991MyJ myJ = (C67991MyJ) r2;
        0qQ.A0B(myJ, 0);
        myJ.A02.stop();
    }
}
