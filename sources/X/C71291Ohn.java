package X;

import android.view.View;
import com.instagram.api.schemas.InstagramMediaProductType;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Ohn  reason: case insensitive filesystem */
public final class C71291Ohn implements View.OnClickListener {
    public final /* synthetic */ C66762Mc7 A00;

    public C71291Ohn(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1748209791);
        C66762Mc7 mc7 = this.A00;
        N3P n3p = mc7.A08;
        if (n3p != null) {
            ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(n3p.A0E, 100, 100);
            N3P n3p2 = mc7.A08;
            if (n3p2 != null) {
                boolean A1W = AnonymousClass7TF.A1W(n3p2.A0A, InstagramMediaProductType.STORY);
                W3M.A03(mc7.A0E, C71249OgE.A00(mc7, 40), mc7.A0F, extendedImageUrl, A1W);
                AnonymousClass0fD.A0C(521153074, A05);
                return;
            }
        }
        0qQ.A0F("activeAdModel");
        throw AnonymousClass00P.createAndThrow();
    }
}
