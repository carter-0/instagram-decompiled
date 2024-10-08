package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.IDw  reason: case insensitive filesystem */
public final class C56825IDw implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AlbumEditFragment A02;

    public C56825IDw(ViewGroup viewGroup, AlbumEditFragment albumEditFragment) {
        this.A02 = albumEditFragment;
        this.A01 = viewGroup;
    }

    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.A01;
        AlbumEditFragment albumEditFragment = this.A02;
        C226112fe.A0B.A04(albumEditFragment.requireActivity(), new C57428IaY(viewGroup, this, albumEditFragment), false);
    }
}
