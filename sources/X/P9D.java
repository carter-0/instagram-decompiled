package X;

import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

public final /* synthetic */ class P9D implements C74328Pt4 {
    public final /* synthetic */ ViewGroup.LayoutParams A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ CircularImageView A02;
    public final /* synthetic */ IgProgressImageView A03;
    public final /* synthetic */ IgProgressImageView A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ P9D(ViewGroup.LayoutParams layoutParams, AnonymousClass0iw r2, CircularImageView circularImageView, IgProgressImageView igProgressImageView, IgProgressImageView igProgressImageView2, boolean z, boolean z2) {
        this.A05 = z;
        this.A03 = igProgressImageView;
        this.A04 = igProgressImageView2;
        this.A02 = circularImageView;
        this.A01 = r2;
        this.A06 = z2;
        this.A00 = layoutParams;
    }

    public final void D53(Object obj) {
        boolean z = this.A05;
        IgProgressImageView igProgressImageView = this.A03;
        IgProgressImageView igProgressImageView2 = this.A04;
        IgImageView igImageView = this.A02;
        AnonymousClass0iw r4 = this.A01;
        boolean z2 = this.A06;
        ViewGroup.LayoutParams layoutParams = this.A00;
        if (z) {
            igProgressImageView.setVisibility(8);
            igProgressImageView2.setVisibility(8);
            igImageView.setVisibility(0);
            igImageView.setUrl(DbS.A0V((String) obj), r4);
        } else if (z2) {
            igProgressImageView.setVisibility(8);
            igImageView.setVisibility(8);
            igProgressImageView2.setVisibility(0);
            igProgressImageView2.setUrl(DbS.A0V((String) obj), r4);
            I7E.A06(igProgressImageView2, layoutParams.width);
        } else {
            igImageView.setVisibility(8);
            igProgressImageView2.setVisibility(8);
            igProgressImageView.setVisibility(0);
            igProgressImageView.setUrl(DbS.A0V((String) obj), r4);
        }
    }
}
