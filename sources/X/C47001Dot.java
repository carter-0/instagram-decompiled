package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Dot  reason: case insensitive filesystem */
public final class C47001Dot extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final AnonymousClass0iw A02;
    public final IgImageView A03;
    public final C49332Etn A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47001Dot(View view, AnonymousClass0iw r3, C49332Etn etn) {
        super(view);
        AnonymousClass7TG.A1U(view, etn, r3);
        this.A04 = etn;
        this.A02 = r3;
        this.A03 = view.findViewById(R.id.row_target_image);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.row_target_title);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.row_target_subtitle);
    }
}
