package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.Doo  reason: case insensitive filesystem */
public final class C46996Doo extends C249703kE {
    public FYG A00;
    public final IgTextView A01;
    public final IgdsRadioButton A02;
    public final 0sP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46996Doo(View view, 0sP r4) {
        super(view);
        AnonymousClass7TG.A1O(view, r4);
        this.A03 = r4;
        IgTextView findViewById = view.findViewById(R.id.closed_caption_option_item);
        FP2.A00(findViewById, 42, this);
        this.A01 = findViewById;
        IgdsRadioButton igdsRadioButton = (IgdsRadioButton) view.findViewById(R.id.closed_caption_item_radio);
        FP2.A00(igdsRadioButton, 41, this);
        this.A02 = igdsRadioButton;
    }
}
