package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KVC extends C60518Jmp {
    public final Resources A00 = JTS.A07(this);
    public final View A01;
    public final IgImageView A02;
    public final C66450MSe A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVC(View view, C66450MSe mSe) {
        super(view);
        0qQ.A0B(mSe, 2);
        this.A01 = view;
        this.A03 = mSe;
        this.A02 = DbX.A0b(view, R.id.playlist_art);
    }
}
