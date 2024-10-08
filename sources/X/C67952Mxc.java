package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Mxc  reason: case insensitive filesystem */
public final class C67952Mxc extends C249703kE {
    public final RecyclerView A00;
    public final AnonymousClass2t9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67952Mxc(View view, G7A g7a) {
        super(view);
        AnonymousClass7TG.A1O(view, g7a);
        this.A00 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.meta_ai_hcm_prompt_pills);
        this.A01 = DbU.A0U(AnonymousClass2t9.A00(view.getContext()), new C47785EGw(g7a));
    }
}
