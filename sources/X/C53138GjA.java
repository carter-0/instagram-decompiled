package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GjA  reason: case insensitive filesystem */
public final class C53138GjA extends C249703kE {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgImageButton A02;
    public final /* synthetic */ C53071Gi4 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53138GjA(View view, C53071Gi4 gi4) {
        super(view);
        0qQ.A0B(view, 2);
        this.A03 = gi4;
        this.A02 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.preview_clip_thumbnail);
        this.A01 = Dba.A0E(view, R.id.preview_clip_play_count);
        this.A00 = (IgLinearLayout) AnonymousClass7TE.A0b(view, R.id.play_count_container);
    }
}
