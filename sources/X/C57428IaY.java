package X;

import android.view.ViewGroup;
import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.IaY  reason: case insensitive filesystem */
public final class C57428IaY implements C227182im {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C56825IDw A01;
    public final /* synthetic */ AlbumEditFragment A02;

    public C57428IaY(ViewGroup viewGroup, C56825IDw iDw, AlbumEditFragment albumEditFragment) {
        this.A01 = iDw;
        this.A00 = viewGroup;
        this.A02 = albumEditFragment;
    }

    public final void DmH(int i, int i2) {
        C56825IDw iDw = this.A01;
        if (!iDw.A00) {
            ViewGroup viewGroup = this.A00;
            AlbumEditFragment albumEditFragment = this.A02;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                iDw.A00 = true;
                layoutParams.height = (int) (((double) (viewGroup.getHeight() - i2)) * (1.0d - 182.A00(0Tu.A05, albumEditFragment.A0J(), 37172237572506170L)));
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            throw AnonymousClass7TE.A11(AnonymousClass000.A00(49));
        }
    }
}
