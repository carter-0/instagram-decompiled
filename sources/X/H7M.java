package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H7M extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53112Gik(DbT.A0D(layoutInflater, viewGroup, R.layout.content_notes_group_reply_recipient_pill, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        IOU iou = (IOU) r3;
        C53112Gik gik = (C53112Gik) r4;
        AnonymousClass7TG.A1N(iou, gik);
        gik.A00.setText(iou.A01);
    }

    public final Class modelClass() {
        return IOU.class;
    }
}
