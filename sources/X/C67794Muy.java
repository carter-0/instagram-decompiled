package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import java.util.List;

/* renamed from: X.Muy  reason: case insensitive filesystem */
public final class C67794Muy extends 2Rw {
    public final AnonymousClass0iw A00;
    public final DirectVisualMessageActionLogPriorityFragment A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68002MyU(DbX.A0F(viewGroup, 0).inflate(R.layout.direct_action_row, viewGroup, false));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C68002MyU myU = (C68002MyU) r5;
        0qQ.A0B(myU, 0);
        OF4 of4 = (OF4) this.A02.get(i);
        myU.A00.setText(of4.A03);
        myU.A02.setText(of4.A02);
        TextView textView = myU.A01;
        textView.setText(AnonymousClass7TE.A16(AnonymousClass7TE.A0S(textView), of4.A01.A00));
        ImageUrl imageUrl = of4.A00;
        if (imageUrl != null) {
            myU.A03.setUrl(imageUrl, this.A00);
        } else {
            ? r2 = myU.A03;
            DbU.A13(r2.getContext(), r2, R.drawable.profile_anonymous_user);
        }
        C71408Ok7.A00(myU.itemView, 57, this, of4);
    }

    public C67794Muy(AnonymousClass0iw r2, DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A01 = directVisualMessageActionLogPriorityFragment;
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-49798719);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-55883803, A03);
        return size;
    }
}
