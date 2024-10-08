package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.7OL  reason: invalid class name */
public final class AnonymousClass7OL implements C2365734g {
    public final /* synthetic */ AnonymousClass7JI A00;

    public AnonymousClass7OL(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view;
        if (igSimpleImageView != null) {
            AnonymousClass7JI r2 = this.A00;
            igSimpleImageView.setBackground(AnonymousClass7JI.A01(r2).A06);
            AnonymousClass7JI.A01(r2);
            if (((Boolean) C62000qj.A02.A0D.invoke()).booleanValue()) {
                03T.A00(igSimpleImageView, new C66039M8y(igSimpleImageView, igSimpleImageView, r2));
            } else {
                igSimpleImageView.getViewTreeObserver().addOnPreDrawListener(new LZ2(igSimpleImageView, r2));
            }
        }
    }
}
