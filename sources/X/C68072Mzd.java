package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mzd  reason: case insensitive filesystem */
public final class C68072Mzd extends C249703kE implements C328007Db, C328017Dc, C3263976p, C328027Dd {
    public C328087Dj A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68072Mzd(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A03 = Dba.A0E(view, R.id.direct_inbox_file_xma_title);
        this.A02 = Dba.A0E(view, R.id.direct_inbox_file_xma_subtitle);
    }

    public final void FHQ(int i) {
    }

    public final ImageView Afl() {
        return null;
    }

    public final View BJd() {
        return this.A01;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
