package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Dlq  reason: case insensitive filesystem */
public final class C46814Dlq extends 2Rw {
    public final List A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        C46961DoF doF = (C46961DoF) r4;
        C49543Exe exe = (C49543Exe) this.A00.get(i);
        doF.A00.setImageResource(exe.A01);
        doF.A02.setText(exe.A02);
        doF.A01.setText(exe.A00);
    }

    public C46814Dlq(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1533006938);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-2028998632, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = DbV.A0D(viewGroup);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46961DoF(DbT.A0C(A0D, viewGroup, R.layout.wellbeing_interstitial_list_item));
    }
}
