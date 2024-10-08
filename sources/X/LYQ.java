package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;

public final class LYQ implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ AnonymousClass6V6 A03;
    public final /* synthetic */ User A04;

    public LYQ(View view, IgImageView igImageView, AnonymousClass6V6 r3, User user, int i) {
        this.A02 = igImageView;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = view;
        this.A04 = user;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        IgImageView igImageView = this.A02;
        float A032 = AnonymousClass7TE.A03(igImageView) / ((float) igImageView.getDrawable().getIntrinsicHeight());
        AnonymousClass6V6 r4 = this.A03;
        r4.A00.add(new SuperlativeMentionSticker(C63412KwY.A00(r4.A04(), igImageView, this.A00, AnonymousClass7TE.A0c(r4.A02).getTop() + this.A01.getTop()), this.A04, 0.0f, A032, 16));
    }
}
