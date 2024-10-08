package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KEy  reason: case insensitive filesystem */
public final class C61622KEy extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60712Jpx(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_fundraiser_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        LBA lba = (LBA) r2;
        C60712Jpx jpx = (C60712Jpx) r3;
        AnonymousClass7TG.A1N(lba, jpx);
        new LCR(jpx).A00(lba);
    }

    public final Class modelClass() {
        return C62426Kfb.class;
    }
}
