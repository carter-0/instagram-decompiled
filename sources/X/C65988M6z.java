package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.M6z  reason: case insensitive filesystem */
public final class C65988M6z implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AlbumEditFragment A01;

    public C65988M6z(View view, AlbumEditFragment albumEditFragment) {
        this.A01 = albumEditFragment;
        this.A00 = view;
    }

    public final void run() {
        AlbumEditFragment albumEditFragment = this.A01;
        FragmentActivity activity = albumEditFragment.getActivity();
        if (activity != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, AnonymousClass7TE.A16(albumEditFragment.requireContext(), 2131962268));
            A0f.A02();
            A0f.A03(this.A00);
            A0f.A04 = new KSO(albumEditFragment, 3);
            A0f.A00().A07(AnonymousClass7TE.A0l(albumEditFragment.A0d));
        }
    }
}
