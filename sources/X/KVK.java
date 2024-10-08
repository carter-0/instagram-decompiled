package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class KVK extends C60518Jmp implements C66453MSh {
    public final Resources A00 = JTS.A07(this);
    public final View A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final GVO A04;
    public final MXX A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVK(View view, MXX mxx) {
        super(view);
        0qQ.A0B(mxx, 2);
        this.A01 = view;
        this.A05 = mxx;
        this.A03 = DbX.A0Y(view, R.id.album_art);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.filter_pill);
        this.A04 = new GVO(AnonymousClass7TG.A0R(view, R.id.track_row_title), AnonymousClass7TF.A03(JTQ.A06(this), R.attr.textColorSecondary));
    }

    public final void FM3(C66569MWx mWx, float f) {
    }
}
