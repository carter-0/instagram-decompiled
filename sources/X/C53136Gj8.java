package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gj8  reason: case insensitive filesystem */
public final class C53136Gj8 extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53136Gj8(View view) {
        super(view);
        IgImageView findViewById = view.findViewById(R.id.section_icon);
        IgTextView findViewById2 = view.findViewById(R.id.title);
        IgTextView findViewById3 = view.findViewById(R.id.subtitle);
        C51974G9v.A1M(findViewById, findViewById2, findViewById3);
        this.A00 = view;
        this.A03 = findViewById;
        this.A02 = findViewById2;
        this.A01 = findViewById3;
    }
}
