package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class LCg {
    public final C60386Jkf A00;
    public final MV2 A01;

    public final void A00(View view) {
        0qQ.A0B(view, 0);
        RecyclerView A0c = JTR.A0c(view, R.id.caption_add_on_recyclerview);
        DbV.A1A(A0c.getContext(), A0c);
        A0c.setAdapter(this.A00);
        Resources resources = A0c.getResources();
        JTP.A1D(A0c, AnonymousClass7TE.A0B(resources), AnonymousClass7TE.A0D(resources));
    }

    public LCg(MV2 mv2) {
        this.A01 = mv2;
        this.A00 = new C60386Jkf(mv2);
    }
}
