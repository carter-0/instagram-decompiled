package X;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

public final class KFJ extends C232222tE {
    public C63584KzX A00 = null;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        return new C60560JnV(new IgdsBanner(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C64814LiZ liZ = (C64814LiZ) r6;
        C60560JnV jnV = (C60560JnV) r7;
        boolean A1U = AnonymousClass7TF.A1U(0, liZ, jnV);
        IgdsBanner igdsBanner = jnV.A00;
        Integer num = liZ.A05;
        if (num != null) {
            igdsBanner.setIcon(num.intValue());
        } else {
            igdsBanner.setIcon((Drawable) null);
        }
        Integer num2 = liZ.A03;
        if (num2 != null) {
            igdsBanner.setBody(num2.intValue());
        } else {
            igdsBanner.setBody(liZ.A01, false);
        }
        Integer num3 = liZ.A02;
        if (num3 != null) {
            igdsBanner.setAction(num3.intValue());
        } else {
            igdsBanner.setAction((CharSequence) null);
        }
        igdsBanner.setDismissible(liZ.A07);
        igdsBanner.setDividerVisibility(liZ.A00);
        Integer num4 = liZ.A04;
        if (num4 != null) {
            igdsBanner.setDividerColor(num4.intValue());
        }
        igdsBanner.A00 = new C65346Lrm(A1U ? 1 : 0, this, liZ);
    }

    public final Class modelClass() {
        return C64814LiZ.class;
    }
}
