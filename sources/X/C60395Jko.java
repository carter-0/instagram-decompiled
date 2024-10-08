package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jko  reason: case insensitive filesystem */
public final class C60395Jko extends 2Rw {
    public final L21 A00;
    public final C63786L6s[] A01;
    public final boolean A02;

    public C60395Jko(L21 l21, C63786L6s[] l6sArr, boolean z) {
        0qQ.A0B(l6sArr, 1);
        this.A01 = l6sArr;
        this.A02 = z;
        this.A00 = l21;
    }

    public final void onBindViewHolder(C249703kE r4, int i) {
        0qQ.A0B(r4, 0);
        C60624JoX joX = (C60624JoX) r4;
        C63786L6s l6s = this.A01[i];
        AnonymousClass7TF.A1H(joX, l6s);
        joX.A01.setImageResource(l6s.A00);
        IgTextView igTextView = joX.A02;
        int i2 = l6s.A01;
        igTextView.setText(i2);
        View view = joX.A00;
        DbU.A12(view.getContext(), view, i2);
        2eS.A01(view);
        AnonymousClass0fU.A00(new LXI(i, 2, this), view);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A0C = JTP.A0C(viewGroup, 0);
        boolean z = this.A02;
        LayoutInflater from = LayoutInflater.from(A0C);
        int i2 = R.layout.music_search_control_bar_item;
        if (z) {
            i2 = R.layout.music_search_control_bar_overflow_scroll_item;
        }
        return new C60624JoX(DbU.A09(from, viewGroup, i2, false));
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-825022729);
        int length = this.A01.length;
        AnonymousClass0fD.A0A(1988259123, A03);
        return length;
    }
}
