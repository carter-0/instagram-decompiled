package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Acj  reason: case insensitive filesystem */
public final /* synthetic */ class C40474Acj implements C74328Pt4 {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ IgImageView A01;
    public final /* synthetic */ AnonymousClass742 A02;

    public /* synthetic */ C40474Acj(AnonymousClass0iw r1, IgImageView igImageView, AnonymousClass742 r3) {
        this.A02 = r3;
        this.A01 = igImageView;
        this.A00 = r1;
    }

    public final void D53(Object obj) {
        AnonymousClass742 r3 = this.A02;
        IgImageView igImageView = this.A01;
        AnonymousClass0iw r1 = this.A00;
        r3.A00 = null;
        igImageView.setUrl(new SimpleImageUrl((String) obj), r1);
    }
}
