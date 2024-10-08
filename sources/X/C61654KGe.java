package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.KGe  reason: case insensitive filesystem */
public final class C61654KGe extends C232232tF {
    public final AnonymousClass0iw A00;
    public final L13 A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60613JoM(DbU.A09(layoutInflater, viewGroup, R.layout.add_highlight_row_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64763Lhf lhf = (C64763Lhf) r5;
        C60613JoM joM = (C60613JoM) r6;
        AnonymousClass7TG.A1N(lhf, joM);
        Reel reel = lhf.A00;
        ImageUrl A07 = reel.A07();
        if (A07 != null) {
            joM.A02.setUrl(A07, this.A00);
        }
        joM.A01.setText(reel.A0r);
        View view = joM.A00;
        LYG.A02(view, 34, this, lhf);
        2eS.A01(view);
    }

    public final Class modelClass() {
        return C64763Lhf.class;
    }

    public C61654KGe(AnonymousClass0iw r1, L13 l13) {
        this.A00 = r1;
        this.A01 = l13;
    }
}
