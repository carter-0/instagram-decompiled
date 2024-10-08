package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.DmB  reason: case insensitive filesystem */
public final class C46835DmB extends 2Rw {
    public C51876G5o A00;
    public final List A01 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Dmz, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.action_sheet_row, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(inflate, 1);
        ? r1 = new C249703kE(inflate);
        r1.A00 = AnonymousClass7TG.A0R(inflate, R.id.action_sheet_row_text_view);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        int i2;
        C46883Dmz dmz = (C46883Dmz) r6;
        0qQ.A0B(dmz, 0);
        Context A07 = DbS.A07(dmz);
        getItemViewType(i);
        List list = this.A01;
        C67293MlS mlS = (C67293MlS) list.get(i);
        int i3 = mlS.A02;
        TextView textView = dmz.A00;
        if (i3 != 0) {
            textView.setText(i3);
        } else {
            textView.setText(mlS.A04);
        }
        DbT.A17(A07, textView, ((C67293MlS) list.get(i)).A08);
        if (i == getItemCount() - 1) {
            i2 = AnonymousClass7TH.A01(A07);
        } else {
            i2 = 0;
        }
        0nA.A0T(textView, i2);
        textView.setMaxLines(mlS.A01);
        textView.setAlpha(mlS.A07);
        if (this.A00 != null) {
            2eS.A01(textView);
            AnonymousClass0fU.A00(new FNH(this, i, 2), textView);
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1182979538);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1397289239, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-2128965550, AnonymousClass0fD.A03(-490792699));
        return 0;
    }
}
