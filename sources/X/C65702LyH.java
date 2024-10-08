package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

/* renamed from: X.LyH  reason: case insensitive filesystem */
public final class C65702LyH implements C66572MXc {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IgLiveWithGuestFragment A01;

    public C65702LyH(View view, IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A01 = igLiveWithGuestFragment;
        this.A00 = view;
    }

    public final /* bridge */ /* synthetic */ void Dbb(Object obj) {
        C66532MVm mVm = (C66532MVm) obj;
        0qQ.A0B(mVm, 0);
        mVm.CrK((ViewStub) AnonymousClass7TE.A0b(this.A00, R.id.iglive_guest_layout_sup_debug_stub), AnonymousClass7TE.A0l(this.A01.A0G));
    }
}
