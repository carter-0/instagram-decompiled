package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

public final class QEa extends 2Rw {
    public final int A00;
    public final C13680Tep A01;
    public final List A02;
    public final boolean[] A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1[r6] != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r5, int r6) {
        /*
            r4 = this;
            X.QEn r5 = (X.QEn) r5
            android.widget.TextView r3 = r5.A00
            java.util.List r0 = r4.A02
            java.lang.CharSequence r0 = X.Pxe.A0f(r0, r6)
            r3.setText(r0)
            boolean[] r1 = r4.A03
            if (r1 == 0) goto L_0x0019
            int r0 = r1.length
            if (r6 >= r0) goto L_0x0019
            boolean r0 = r1[r6]
            r2 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            r3.setEnabled(r2)
            int r0 = r4.A00
            boolean r1 = X.AnonymousClass7TF.A1S(r6, r0)
            r0 = 0
            r3.setTypeface(r0, r1)
            if (r2 == 0) goto L_0x0032
            r1 = 1
            X.Sb5 r0 = new X.Sb5
            r0.<init>(r4, r6, r1)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QEa.onBindViewHolder(X.3kE, int):void");
    }

    public QEa(C13680Tep tep, List list, boolean[] zArr, int i) {
        this.A01 = tep;
        this.A02 = list;
        this.A03 = zArr;
        this.A00 = i;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-2136979162);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(471179223, A032);
        return size;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3kE, X.QEn] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.picker_list_item);
        ? r0 = new C249703kE(A0C);
        r0.A00 = (TextView) A0C;
        return r0;
    }
}
