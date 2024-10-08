package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.Myz  reason: case insensitive filesystem */
public final class C68033Myz extends C249703kE {
    public final View A00;
    public final IgLinearLayout A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgdsRadioButton A05;
    public final /* synthetic */ C68594NOq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68033Myz(View view, C68594NOq nOq) {
        super(view);
        this.A06 = nOq;
        this.A00 = view;
        this.A01 = (IgLinearLayout) AnonymousClass7TE.A0b(view, R.id.notes_audience_item_root);
        this.A02 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.notes_audience_icon);
        this.A04 = Dba.A0E(view, R.id.notes_audience_title);
        this.A03 = Dba.A0E(view, R.id.notes_audience_subtitle);
        this.A05 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.notes_audience_radio_button);
    }
}
