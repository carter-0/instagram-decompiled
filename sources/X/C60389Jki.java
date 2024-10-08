package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Jki  reason: case insensitive filesystem */
public final class C60389Jki extends 2Rw {
    public final C355568Qm A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();

    public C60389Jki(C355568Qm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60623JoW(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.media_kit_reorder_item, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        C60623JoW joW = (C60623JoW) r4;
        0qQ.A0B(joW, 0);
        TextView textView = joW.A00;
        String str = ((C61220JzD) this.A01.get(i)).A04;
        if (str.length() <= 0) {
            str = 002.A0O("New section ", i);
        }
        textView.setText(str);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1411357661);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(1690282837, A03);
        return size;
    }
}
