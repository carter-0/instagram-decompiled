package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.user.model.User;

/* renamed from: X.UiD  reason: case insensitive filesystem */
public final class C15768UiD extends C232222tE {
    public final ArchiveReelPeopleFragment A00;
    public final AnonymousClass0iw A01;

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C19259WRs wRs = (C19259WRs) r4;
        C14909UEo uEo = (C14909UEo) r5;
        AnonymousClass0iw r2 = this.A01;
        uEo.A00 = wRs;
        User user = wRs.A00;
        DbU.A1S(r2, uEo.A06, user);
        DbU.A1H(uEo.A04, user);
        uEo.A02.stop();
        uEo.A01.setVisibility(8);
        uEo.A05.setVisibility(8);
    }

    public final Class modelClass() {
        return C19259WRs.class;
    }

    public C15768UiD(ArchiveReelPeopleFragment archiveReelPeopleFragment, AnonymousClass0iw r2) {
        this.A01 = r2;
        this.A00 = archiveReelPeopleFragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14909UEo(DbT.A0C(layoutInflater, viewGroup, R.layout.layout_people_grid_item), this.A00);
    }
}
