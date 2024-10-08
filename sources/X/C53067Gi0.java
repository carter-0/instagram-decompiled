package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Gi0  reason: case insensitive filesystem */
public final class C53067Gi0 extends 2Rw {
    public int A00;
    public List A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53142GjE(DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.clips_viewer_debug_overlay_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        String str;
        C53142GjE gjE = (C53142GjE) r5;
        0qQ.A0B(gjE, 0);
        C267324bN r2 = (C267324bN) this.A01.get(i);
        int i2 = this.A00;
        0qQ.A0B(r2, 0);
        gjE.A04.setText(String.valueOf(i));
        gjE.A03.setText(r2.A01.toString());
        gjE.A02.setText(AnonymousClass9OK.A00(r2.A03));
        TextView textView = gjE.A01;
        1Xj r0 = r2.A02;
        if (r0 == null || (str = r0.A2n()) == null) {
            str = "";
        }
        textView.setText(str);
        View view = gjE.A00;
        Context context = view.getContext();
        int i3 = R.color.fds_transparent;
        if (i2 == i) {
            i3 = R.color.green_9;
        }
        DbT.A16(context, view, i3);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(453529201);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-755767441, A03);
        return size;
    }
}
