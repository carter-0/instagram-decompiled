package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class NQ0 extends C232232tF {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final DirectThreadKey A02;
    public final C62320sa A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67906Mwo(DbU.A09(layoutInflater, viewGroup, R.layout.magic_media_remix_item_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C71978Ou3 ou3 = (C71978Ou3) r4;
        C67906Mwo mwo = (C67906Mwo) r5;
        AnonymousClass7TG.A1N(ou3, mwo);
        ImageView imageView = mwo.A00;
        imageView.setImageBitmap(ou3.A01);
        imageView.setVisibility(0);
        C71399Ojy.A00(mwo.itemView, ou3, this, mwo, 18);
    }

    public final Class modelClass() {
        return C71978Ou3.class;
    }

    public NQ0(FragmentActivity fragmentActivity, UserSession userSession, DirectThreadKey directThreadKey, C62320sa r4) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = directThreadKey;
        this.A03 = r4;
    }
}
