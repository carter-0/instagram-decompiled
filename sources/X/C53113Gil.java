package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Gil  reason: case insensitive filesystem */
public final class C53113Gil extends C249703kE {
    public final AnonymousClass3O0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53113Gil(View view) {
        super(view);
        0qQ.A0B(view, 1);
        AnonymousClass3O0 r2 = new AnonymousClass3O0();
        C336007du r3 = new C336007du();
        r3.A02(1.0f);
        r3.A03(0.6f);
        Context context = view.getContext();
        r3.A05(AnonymousClass7TF.A03(context, R.attr.igds_color_tag_or_toast_background));
        int A03 = AnonymousClass7TF.A03(context, R.attr.igds_color_media_background);
        AnonymousClass3O5 r1 = r3.A00;
        r1.A09 = A03;
        r1.A06 = 0;
        r1.A03 = 0.0f;
        r1.A0H = true;
        r3.A04(1000);
        r2.A03(r3.A01());
        this.A00 = r2;
        DbU.A0F(view, R.id.acr_browser_item_placeholder).setImageDrawable(r2);
    }
}
