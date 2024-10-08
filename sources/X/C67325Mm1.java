package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Mm1  reason: case insensitive filesystem */
public final class C67325Mm1 extends 2Rw {
    public Number A00;
    public final C74491Pvl A01;
    public final List A02 = AnonymousClass7TE.A1C();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r11 != r0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r10, int r11) {
        /*
            r9 = this;
            r6 = r10
            X.Mm4 r6 = (X.C67328Mm4) r6
            r3 = 0
            X.0qQ.A0B(r6, r3)
            r7 = r9
            java.util.List r0 = r9.A02
            r4 = r11
            java.lang.Object r8 = r0.get(r11)
            X.Mm8 r8 = (X.C67332Mm8) r8
            boolean r0 = r8 instanceof X.C67331Mm7
            if (r0 == 0) goto L_0x004c
            X.Mm7 r8 = (X.C67331Mm7) r8
            java.lang.Number r1 = r9.A00
            if (r1 != 0) goto L_0x0025
            java.lang.String r0 = "currentSelectedPosition"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0025:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0030
            int r0 = r1.intValue()
            r1 = 1
            if (r11 == r0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            r5 = 11
            X.Iw7 r3 = new X.Iw7
            r3.<init>((int) r4, (int) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            r6.A00(r8, r3, r1)
            android.view.View r1 = r6.itemView
            int r0 = r8.A00
            r1.setMinimumWidth(r0)
            X.Pvl r1 = r9.A01
            android.view.View r0 = X.JTO.A0F(r6)
            r1.DGH(r0, r8, r11)
            return
        L_0x004c:
            boolean r0 = r8 instanceof X.NWI
            if (r0 == 0) goto L_0x0087
            r0 = 7
            X.Inz r2 = new X.Inz
            r2.<init>(r0, r6, r9, r8)
            X.0qQ.A0B(r8, r3)
            android.widget.TextView r1 = r6.A00
            java.lang.CharSequence r0 = r8.A01
            r1.setText(r0)
            android.view.View r0 = r6.itemView
            r0.setSelected(r3)
            android.view.View r1 = r6.itemView
            r0 = 66
            X.C71395Oju.A00(r1, r0, r2)
            android.widget.TextView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            boolean r2 = r8.A02
            android.view.View r1 = r6.itemView
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r2 == 0) goto L_0x007e
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x007e:
            r1.setAlpha(r0)
            android.view.View r0 = r6.itemView
            r0.setMinimumWidth(r3)
            return
        L_0x0087:
            java.lang.String r0 = "Unknown pill type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67325Mm1.onBindViewHolder(X.3kE, int):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C67328Mm4(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.direct_inbox_header_pill_item, false));
    }

    public C67325Mm1(C74491Pvl pvl) {
        this.A01 = pvl;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1370842204);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(708212912, A03);
        return size;
    }
}
