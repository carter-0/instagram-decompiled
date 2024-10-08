package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView;
import java.util.List;

public final class KKL extends C60381Jka {
    public C59948JcE A00;
    public C361518gM A01;
    public final C53368Gms A02;
    public final UserSession A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public KKL(C53368Gms gms, UserSession userSession, C59948JcE jcE, C361518gM r5) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = r5;
        this.A02 = gms;
        this.A00 = jcE;
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A04;
        C232362ta A002 = C232332tX.A00(new C60357Jk5(this, list2, list));
        list2.clear();
        list2.addAll(list);
        A002.A03(this);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.album_thumbnail_view_layout, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A03;
        0qQ.A0A(inflate);
        return new C60588Jnx(inflate, userSession, this.A01);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C60588Jnx jnx = (C60588Jnx) r6;
        0qQ.A0B(jnx, 0);
        C61080JwI jwI = (C61080JwI) this.A04.get(i);
        C53368Gms gms = this.A02;
        0qQ.A0B(jwI, 0);
        AlbumThumbnailView albumThumbnailView = jnx.A01;
        ViewGroup.LayoutParams layoutParams = albumThumbnailView.getLayoutParams();
        layoutParams.width = gms.A01;
        albumThumbnailView.setLayoutParams(layoutParams);
        albumThumbnailView.A00(gms, jwI, jnx.A00);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1185655666);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(325300488, A032);
        return size;
    }
}
