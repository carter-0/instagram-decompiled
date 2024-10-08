package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U9s  reason: case insensitive filesystem */
public final class C14798U9s extends 2Rw {
    public final List A00;
    public final List A01 = new ArrayList();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.layout_clips_viewer_recommend_clips_item, viewGroup, false);
        return new C14868UCw(inflate, DbX.A0Z(inflate, R.id.clips_viewer_recommend_clips_item_text), (IgdsCheckBox) AnonymousClass7TF.A0F(inflate, R.id.clips_viewer_recommend_clips_item_checkbox));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C14868UCw uCw = (C14868UCw) r5;
        0qQ.A0B(uCw, 0);
        String A19 = AnonymousClass7TE.A19(this.A00, i);
        uCw.A00.setText(A19);
        AnonymousClass0fU.A00(new WB5((Object) uCw, (Object) this, A19, 14), uCw.itemView);
    }

    public C14798U9s(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int i;
        int A03 = AnonymousClass0fD.A03(261918785);
        List list = this.A00;
        if (AnonymousClass7TE.A1b(list)) {
            i = list.size();
        } else {
            i = 0;
        }
        AnonymousClass0fD.A0A(-472654363, A03);
        return i;
    }
}
