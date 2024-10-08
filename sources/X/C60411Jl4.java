package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jl4  reason: case insensitive filesystem */
public final class C60411Jl4 extends 2Rw {
    public MSU A00;
    public C46448DfA A01;
    public List A02;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C60514Jml jml = (C60514Jml) r3;
        if (getItemViewType(i) != 0) {
            this.A02.getClass();
            N49 n49 = (N49) this.A02.get(i - (AnonymousClass7TF.A1V(this.A01) ? 1 : 0));
            AnonymousClass7TG.A1N(jml, n49);
            jml.A01 = n49;
            jml.A00.setText(n49.A01);
            return;
        }
        TextView textView = jml.A00;
        C46448DfA dfA = this.A01;
        dfA.getClass();
        dfA.A03(textView);
        textView.post(new M4N(textView));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3kE, X.Jml] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.3kE, java.lang.Object, X.Jml] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            MSU msu = this.A00;
            msu.getClass();
            View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.igtv_series_selection_sheet_row, viewGroup, false);
            2eS.A01(inflate);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0A(inflate);
            0qQ.A0B(inflate, 1);
            ? r3 = new C249703kE(inflate);
            r3.A00 = DbU.A0G(inflate, R.id.selection_sheet_row_text_view);
            LY7.A00(inflate, 13, msu, r3);
            Context A07 = DbS.A07(r3);
            if (A07 != null) {
                r3.A00.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass3JT.A05(A07, R.drawable.chevron_right, 2Yu.A0F(A07, R.attr.glyphColorSecondary)), (Drawable) null);
            }
            return r3;
        }
        View inflate2 = DbX.A0F(viewGroup, 0).inflate(R.layout.selection_sheet_header, viewGroup, false);
        2eS.A04(inflate2, AnonymousClass05K.A00);
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate2);
        0qQ.A0B(inflate2, 1);
        ? r32 = new C249703kE(inflate2);
        r32.A00 = DbU.A0G(inflate2, R.id.selection_sheet_header_text_view);
        return r32;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1753950823);
        boolean A1V = AnonymousClass7TF.A1V(this.A01);
        List list = this.A02;
        if (list == null) {
            AnonymousClass0fD.A0A(-1808033900, A03);
            return A1V;
        }
        int size = list.size() + (A1V ? 1 : 0);
        AnonymousClass0fD.A0A(1262984808, A03);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A01 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 1346429853(0x5040e39d, float:1.29445693E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            if (r5 != 0) goto L_0x0011
            X.DfA r2 = r4.A01
            r1 = 0
            r0 = -1216320737(0xffffffffb7806b1f, float:-1.5308671E-5)
            if (r2 != 0) goto L_0x0015
        L_0x0011:
            r1 = 1
            r0 = 854333702(0x32ec1906, float:2.7485395E-8)
        L_0x0015:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60411Jl4.getItemViewType(int):int");
    }
}
