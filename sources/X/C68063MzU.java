package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.MzU  reason: case insensitive filesystem */
public final class C68063MzU extends C249703kE implements C328007Db {
    public C68065MzW A00;
    public final TextView A01;
    public final C252063oV A02;
    public final IgLinearLayout A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68063MzU(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.message_action_log);
        this.A02 = DbU.A0Z(view, R.id.standard_dxma_stub);
        this.A03 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.standard_dxma_message_container);
    }

    public final View BJd() {
        return JTO.A0F(this);
    }
}
