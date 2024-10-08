package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uii  reason: case insensitive filesystem */
public final class C15799Uii extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C20848X1a A01;
    public final VPB A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        VPB vpb;
        WSY wsy = (WSY) r12;
        UEF uef = (UEF) r13;
        AnonymousClass7TF.A1H(wsy, uef);
        C18043VkR vkR = wsy.A02;
        AnonymousClass0iw r3 = this.A00;
        C20848X1a x1a = this.A01;
        String str = wsy.A03;
        C53290Glc glc = wsy.A00;
        JZA jza = wsy.A01;
        if (wsy.A04) {
            vpb = this.A02;
        } else {
            vpb = null;
        }
        VGX.A00(glc, jza, r3, x1a, uef, vpb, vkR, str, false, false);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new UEF(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.publishing_product_row, false));
    }

    public final Class modelClass() {
        return WSY.class;
    }

    public C15799Uii(AnonymousClass0iw r1, C20848X1a x1a, VPB vpb) {
        this.A00 = r1;
        this.A01 = x1a;
        this.A02 = vpb;
    }

    public C15799Uii(AnonymousClass0iw r2, C20848X1a x1a) {
        this.A00 = r2;
        this.A01 = x1a;
        this.A02 = null;
    }
}
