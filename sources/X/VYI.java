package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class VYI {
    public C255773uh A00;
    public boolean A01;
    public final Context A02;
    public final IgdsInlineSearchBox A03;

    public VYI(View view, ViewGroup viewGroup, G77 g77, IgdsInlineSearchBox igdsInlineSearchBox, ReelDashboardFragment reelDashboardFragment) {
        int i;
        ReelDashboardFragment reelDashboardFragment2 = reelDashboardFragment;
        C51973G9u.A0r(2, igdsInlineSearchBox, g77, reelDashboardFragment);
        this.A03 = igdsInlineSearchBox;
        ViewGroup viewGroup2 = viewGroup;
        this.A02 = AnonymousClass7TE.A0S(viewGroup);
        igdsInlineSearchBox.A02 = g77;
        C238133Ar A002 = C238103Ao.A00(viewGroup);
        0qQ.A07(A002);
        A002.AAD(new C16082Uo9(this, 0));
        if (viewGroup instanceof ListView) {
            i = 1;
        } else if (viewGroup instanceof RecyclerView) {
            i = 2;
        } else {
            return;
        }
        igdsInlineSearchBox.A00 = new WBK(view, viewGroup2, this, reelDashboardFragment2, i);
    }
}
