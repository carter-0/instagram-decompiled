package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.JoF  reason: case insensitive filesystem */
public final class C60606JoF extends C249703kE {
    public final RecyclerView A00;
    public final IgTextView A01;
    public final SpinnerImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60606JoF(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = JTR.A0c(view, R.id.avatar_mentionable_friends_tray);
        this.A02 = (SpinnerImageView) AnonymousClass7TF.A0F(view, R.id.avatar_mentionable_friends_loading_spinner);
        this.A01 = DbX.A0Z(view, R.id.error_label);
    }
}
