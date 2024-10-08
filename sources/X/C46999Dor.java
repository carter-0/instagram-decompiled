package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Dor  reason: case insensitive filesystem */
public final class C46999Dor extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final AnonymousClass0iw A02;
    public final IgImageView A03;
    public final 0sP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46999Dor(View view, AnonymousClass0iw r3, 0sP r4) {
        super(view);
        AnonymousClass7TG.A1U(view, r3, r4);
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = view.findViewById(R.id.ai_agent_picker_item_image);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.ai_agent_picker_item_label);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.ai_agent_picker_item_description);
    }
}
