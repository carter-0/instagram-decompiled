package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.KFd  reason: case insensitive filesystem */
public final class C61627KFd extends C232222tE {
    public final C355608Qq A00;
    public final K5B A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60621JoU(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_selected_media_item, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C54408HBz hBz = (C54408HBz) r5;
        boolean A1Z = AnonymousClass7TG.A1Z(hBz, r6);
        Medium medium = hBz.A00.A00.A00;
        if (medium != null) {
            this.A00.A04(medium, new IOC(A1Z ? 1 : 0, r6, hBz));
        }
    }

    public final Class modelClass() {
        return C54408HBz.class;
    }

    public C61627KFd(C355608Qq r1, K5B k5b) {
        this.A00 = r1;
        this.A01 = k5b;
    }
}
