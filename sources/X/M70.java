package X;

import android.view.View;
import com.instagram.creation.fragment.AlbumEditFragment;

public final class M70 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AlbumEditFragment A01;

    public M70(View view, AlbumEditFragment albumEditFragment) {
        this.A01 = albumEditFragment;
        this.A00 = view;
    }

    public final void run() {
        AlbumEditFragment albumEditFragment = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(albumEditFragment.requireActivity(), AnonymousClass7TE.A16(albumEditFragment.requireContext(), 2131962270));
        A0f.A01();
        A0f.A03(this.A00);
        A0f.A04 = new KSO(albumEditFragment, 4);
        A0f.A00().A07(AnonymousClass7TE.A0l(albumEditFragment.A0d));
    }
}
