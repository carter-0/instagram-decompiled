package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EHE extends C232232tF {
    public View A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final E7Y A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        HallPassViewModel hallPassViewModel = (HallPassViewModel) r10;
        C47015Dp7 dp7 = (C47015Dp7) r11;
        AnonymousClass7TF.A1H(hallPassViewModel, dp7);
        Context context = this.A01;
        E7Y e7y = this.A03;
        AnonymousClass0iw r5 = this.A02;
        AnonymousClass7TG.A0w(0, context, e7y, r5);
        int A012 = AnonymousClass0nB.A01(context) / 2;
        IgTextView igTextView = dp7.A03;
        igTextView.setText(hallPassViewModel.A05);
        igTextView.setMaxWidth(A012);
        dp7.A04.setChecked(hallPassViewModel.A00);
        dp7.A02.setText(DbY.A0d(context.getResources(), hallPassViewModel.A02, R.plurals.campfire_members_count_label));
        FPF.A00(dp7.A01, 28, e7y, hallPassViewModel);
        IgdsFaceSwarm igdsFaceSwarm = dp7.A05;
        FPF.A00(igdsFaceSwarm, 29, e7y, hallPassViewModel);
        FPF.A00(igTextView, 30, e7y, hallPassViewModel);
        FPF.A00(dp7.A00, 31, e7y, hallPassViewModel);
        List list = hallPassViewModel.A06;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(new C376699Iz((Drawable) null, DbT.A0k(it).Bh3(), (String) null, 6));
        }
        if (A1C.size() < 2) {
            A1C.add(new C376699Iz(igdsFaceSwarm.getContext().getDrawable(R.drawable.campfire_group_icon_drawable), (ImageUrl) null, (String) null, 5));
        }
        igdsFaceSwarm.setCustomSizeDp(45);
        igdsFaceSwarm.A08 = false;
        igdsFaceSwarm.setFaceSwarmItems(A1C, r5);
    }

    public final Class modelClass() {
        return HallPassViewModel.class;
    }

    public EHE(Context context, AnonymousClass0iw r2, E7Y e7y) {
        this.A01 = context;
        this.A03 = e7y;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_campfire_list_row_item, false);
        this.A00 = A0D;
        return new C47015Dp7(A0D);
    }
}
