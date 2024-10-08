package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class UE0 extends C249703kE {
    public C19476WaO A00;
    public final Context A01;
    public final ImageView A02;
    public final UserSession A03;
    public final WWM A04;
    public final View A05;

    public UE0(View view, UserSession userSession, WWM wwm) {
        super(view);
        this.A03 = userSession;
        this.A01 = view.getContext();
        this.A04 = wwm;
        ImageView A0F = DbU.A0F(view, R.id.countdown_sticker);
        this.A02 = A0F;
        View requireViewById = view.requireViewById(R.id.countdown_sticker_option_view);
        this.A05 = requireViewById;
        AnonymousClass3NG r1 = new AnonymousClass3NG(A0F);
        r1.A07 = true;
        C15848UjY.A00(r1, this, 24);
        AnonymousClass3NG r12 = new AnonymousClass3NG(requireViewById);
        r12.A01(A0F);
        r12.A07 = true;
        C15848UjY.A00(r12, this, 25);
    }
}
