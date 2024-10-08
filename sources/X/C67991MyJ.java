package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.MyJ  reason: case insensitive filesystem */
public final class C67991MyJ extends C249703kE {
    public final View A00;
    public final ImageView A01 = DbX.A0J(this.itemView, R.id.direct_indicator_animation);
    public final C66799Mcl A02;
    public final /* synthetic */ NQ7 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67991MyJ(View view, NQ7 nq7) {
        super(view);
        this.A03 = nq7;
        this.A00 = view;
        Resources A05 = DbU.A05(this.itemView);
        this.A02 = new C66800Mcm(AnonymousClass7TE.A0D(A05), A05.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A05.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
    }
}
