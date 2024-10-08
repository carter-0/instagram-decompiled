package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.NPy  reason: case insensitive filesystem */
public final class C68628NPy extends C232232tF {
    public final AnonymousClass0iw A00;
    public final 0sP A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68023Myp(DbT.A0D(layoutInflater, viewGroup, R.layout.notes_mentions_item, false), this.A00, this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C68187N5c n5c = (C68187N5c) r7;
        C68023Myp myp = (C68023Myp) r8;
        AnonymousClass7TG.A1N(n5c, myp);
        myp.A00 = n5c;
        User user = n5c.A00;
        boolean A2G = user.A2G();
        IgTextView igTextView = myp.A02;
        DbU.A1H(igTextView, user);
        Context context = igTextView.getContext();
        boolean z = myp.A05;
        int i = R.attr.igds_color_primary_text;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
        }
        JTS.A0u(context, igTextView, i);
        IgImageView igImageView = myp.A03;
        igImageView.setUrl(user.Bh3(), myp.A01);
        float f = 1.0f;
        float f2 = 0.5f;
        if (A2G) {
            f2 = 1.0f;
        }
        igTextView.setAlpha(f2);
        if (!A2G) {
            f = 0.5f;
        }
        igImageView.setAlpha(f);
    }

    public final Class modelClass() {
        return C68187N5c.class;
    }

    public C68628NPy(AnonymousClass0iw r1, 0sP r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }
}
