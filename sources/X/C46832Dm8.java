package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Dm8  reason: case insensitive filesystem */
public final class C46832Dm8 extends 2Rw {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final LayoutInflater A01;
    public final LinearLayoutManager A02;
    public final Runnable A03;
    public final Set A04;
    public final boolean A05;
    public final C49459Ew0[] A06;
    public final /* synthetic */ C384869i1 A07;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        boolean z = this.A05;
        int i2 = R.layout.spinner_dropdown_switch_row;
        if (z) {
            i2 = R.layout.spinner_dropdown_radio_row;
        }
        View inflate = this.A01.inflate(i2, viewGroup, false);
        int i3 = R.id.row_switch;
        if (z) {
            i3 = R.id.row_radio_button;
        }
        View findViewById = inflate.findViewById(i3);
        0qQ.A0A(findViewById);
        return new C46933Dnn(inflate, (CompoundButton) findViewById);
    }

    public C46832Dm8(LinearLayoutManager linearLayoutManager, C384869i1 r4, Set set, C49459Ew0[] ew0Arr, boolean z) {
        this.A07 = r4;
        this.A06 = ew0Arr;
        this.A05 = z;
        this.A02 = linearLayoutManager;
        LayoutInflater A0E = DbV.A0E(r4);
        0qQ.A07(A0E);
        this.A01 = A0E;
        LinkedHashSet A0y = DbS.A0y();
        this.A04 = A0y;
        this.A03 = new C41064Anm(this, r4);
        A0y.addAll(set);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C46933Dnn dnn = (C46933Dnn) r7;
        0qQ.A0B(dnn, 0);
        C49459Ew0 ew0 = this.A06[i];
        TextView textView = dnn.A01;
        textView.setText(ew0.A00);
        View view = dnn.itemView;
        boolean z = ew0.A01;
        view.setEnabled(z);
        Context context = textView.getContext();
        Context context2 = this.A07.getContext();
        int i2 = R.attr.igds_color_secondary_text;
        if (z) {
            i2 = R.attr.igds_color_primary_text;
        }
        DbT.A17(context, textView, 2Yu.A0H(context2, i2));
        FPA.A00(dnn.itemView, dnn, this, i, 0);
        CompoundButton compoundButton = dnn.A00;
        compoundButton.setChecked(this.A04.contains(Integer.valueOf(i)));
        compoundButton.setEnabled(z);
        compoundButton.setOnCheckedChangeListener(new C50127FPz(i, 0, this));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-652934322);
        int length = this.A06.length;
        AnonymousClass0fD.A0A(-110269666, A032);
        return length;
    }
}
