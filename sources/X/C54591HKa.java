package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.HKa  reason: case insensitive filesystem */
public final class C54591HKa extends C53110Gii {
    public final TextView A00;
    public final TextView A01;
    public final AnonymousClass0iw A02;
    public final IgCheckBox A03;
    public final CircularImageView A04;
    public final 0sP A05;
    public final 0sL A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54591HKa(View view, AnonymousClass0iw r3, 0sP r4, 0sL r5) {
        super(view);
        AnonymousClass7TG.A0w(1, view, r4, r5);
        this.A02 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A04 = DbX.A0a(view, R.id.image);
        this.A03 = (IgCheckBox) AnonymousClass7TF.A0F(view, R.id.save_button);
    }
}
