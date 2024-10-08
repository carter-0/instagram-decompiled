package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashMap;
import java.util.Map;

public final class KG6 extends C232222tE {
    public final C63831L8m A00;
    public final UserSession A01;
    public final AnonymousClass7IJ A02;
    public final Map A03;
    public final AnonymousClass0eM A04 = MMP.A00(this, 22);
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.avatar_sticker_grid_item, false));
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        View view;
        ImageView imageView;
        if (r4 != null) {
            view = r4.itemView;
        } else {
            view = null;
        }
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public /* synthetic */ KG6(C63831L8m l8m, UserSession userSession, boolean z, boolean z2) {
        AnonymousClass7IJ r2 = new AnonymousClass7IJ(userSession);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r2;
        this.A05 = z;
        this.A03 = A1H;
        this.A06 = z2;
        this.A00 = l8m;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        Object obj;
        Drawable drawable;
        C61176JyS jyS = (C61176JyS) r14;
        AnonymousClass7TF.A1H(jyS, r15);
        UserSession userSession = this.A01;
        29J r2 = 27p.A01(userSession).A01;
        C317966o8 r9 = jyS.A01;
        String str = r9.A0S;
        0qQ.A07(str);
        C318046oG r10 = jyS.A02;
        r2.A02(str, r10.name());
        View view = r15.itemView;
        0qQ.A0C(view, C273654mx.A00(10));
        ImageView imageView = (ImageView) view;
        Map map = this.A03;
        if (map.get(r9.A0S) != null) {
            obj = map.get(r9.A0S);
            drawable = (Drawable) obj;
        } else if (r9.A04() != AnonymousClass05K.A0N || (!AnonymousClass7TF.A1Z(this.A04) && !182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36315898403098270L))) {
            C369768vI r5 = new C369768vI(imageView.getContext(), (RingSpec) null, userSession, r9, r10, (AnonymousClass3ID) null, r9.A0S);
            r5.A04();
            obj = r5;
            if (this.A05) {
                map.put(r9.A0S, r5);
                obj = r5;
            }
            drawable = (Drawable) obj;
        } else {
            drawable = C320996tP.A00(AnonymousClass7TE.A0S(imageView), userSession, r9, jyS.A04, C63282KuR.A00(userSession));
            if (this.A05) {
                map.put(r9.A0S, drawable);
            }
        }
        imageView.setImageDrawable(drawable);
        String str2 = r9.A0M;
        if (str2 == null) {
            str2 = AnonymousClass7TE.A16(imageView.getContext(), 2131953506);
        }
        imageView.setContentDescription(str2);
        C61686KHu.A00(AnonymousClass7TE.A0m(imageView), this, jyS, 0);
        new C55973Hqe(imageView, new MMX(34, (Object) jyS, (Object) this), this.A06).A00();
    }

    public final Class modelClass() {
        return C61176JyS.class;
    }
}
