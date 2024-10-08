package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.GjJ  reason: case insensitive filesystem */
public final class C53147GjJ extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final View A04;
    public final View A05;
    public final /* synthetic */ H74 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53147GjJ(View view, H74 h74) {
        super(view);
        this.A06 = h74;
        View A0G = AnonymousClass7TF.A0G(view, R.id.original_text);
        this.A04 = A0G;
        this.A00 = AnonymousClass7TG.A0R(A0G, R.id.translation_title);
        this.A01 = AnonymousClass7TG.A0R(A0G, R.id.translation_subtitle);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.translated_text);
        this.A05 = A0G2;
        this.A03 = AnonymousClass7TG.A0R(A0G2, R.id.translation_title);
        this.A02 = AnonymousClass7TG.A0R(A0G2, R.id.translation_subtitle);
    }
}
