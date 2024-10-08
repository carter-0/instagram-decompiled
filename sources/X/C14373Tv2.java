package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Tv2  reason: case insensitive filesystem */
public final class C14373Tv2 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C14075TpP A01;
    public final XBt A02;
    public final X41 A03;
    public final boolean A04;
    public final WW4 A05;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14896UDy(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_item_transition_images, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r19, C249703kE r20) {
        HAT hat = (HAT) r19;
        C14896UDy uDy = (C14896UDy) r20;
        boolean A1U = AnonymousClass7TF.A1U(0, hat, uDy);
        C296905qq r1 = hat.A02;
        C296995qz B9n = this.A02.B9n(hat);
        X41 x41 = this.A03;
        View view = uDy.A00;
        x41.ECL(view, B9n, r1, hat, false);
        AnonymousClass0iw r0 = this.A00;
        Context A0S = AnonymousClass7TE.A0S(view);
        C298755ty r9 = hat.A01;
        C14075TpP tpP = this.A01;
        boolean z = this.A04;
        DbW.A1N(r0, A1U ? 1 : 0, tpP);
        TransitionCarouselImageView transitionCarouselImageView = uDy.A05;
        List list = r9.A03;
        0qQ.A07(list);
        transitionCarouselImageView.setSource(r0.getModuleName());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExtendedImageUrl A1n = C51966G9m.A0t(it).A1n(A0S);
            if (A1n != null) {
                arrayList.add(A1n);
            }
        }
        transitionCarouselImageView.A04(arrayList, z);
        tpP.A00.add(new WeakReference((Object) null));
        String str = r9.A01;
        if (str == null) {
            str = r9.A00.A0A;
        }
        TextView textView = uDy.A04;
        textView.setText(str);
        if (r9.A04) {
            ImageView imageView = uDy.A02;
            imageView.setImageResource(R.drawable.instagram_shopping_bag_pano_filled_24);
            DbU.A14(A0S, imageView, R.color.design_dark_default_color_on_background);
        }
        View view2 = uDy.A01;
        ImageView imageView2 = uDy.A03;
        ImageView imageView3 = uDy.A02;
        0qQ.A0B(imageView2, 2);
        view2.getViewTreeObserver().addOnPreDrawListener(new WCO(view2, view, imageView3, imageView2, textView, str));
        WB4.A00(view, B9n, hat, this, 31);
    }

    public final Class modelClass() {
        return HAT.class;
    }

    public C14373Tv2(AnonymousClass0iw r1, C14075TpP tpP, WW4 ww4, XBt xBt, X41 x41, boolean z) {
        this.A00 = r1;
        this.A05 = ww4;
        this.A03 = x41;
        this.A01 = tpP;
        this.A02 = xBt;
        this.A04 = z;
    }
}
