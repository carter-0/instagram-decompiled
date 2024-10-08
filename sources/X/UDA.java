package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UDA extends C249703kE {
    public final IgImageView A00;
    public final C252063oV A01;
    public final C14901UEg A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDA(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = new C14901UEg(view, R.layout.question_response_item_media);
        this.A01 = C66581MXm.A0T(view, R.id.question_response_card_media_preview_stub);
        this.A00 = DbX.A0b(view, R.id.question_media_play_button);
    }
}
