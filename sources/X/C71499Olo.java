package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Olo  reason: case insensitive filesystem */
public final class C71499Olo implements AnonymousClass07Z, AnonymousClass7D2 {
    public final 0h9 A00 = new 0h9(this);
    public final AnonymousClass7DZ A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C68072Mzd mzd = new C68072Mzd(DbU.A09(layoutInflater, viewGroup, R.layout.direct_file_xma_content, false));
        mzd.A01.post(new C73218PYw(this, mzd));
        return mzd;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        0qQ.A0B(r3, 0);
        this.A01.A01(r3);
        this.A00.A0B(07T.ON_PAUSE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r1 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (r4.length() != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r3 = r9.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r9, X.AnonymousClass7FW r10) {
        /*
            r8 = this;
            X.Mzd r9 = (X.C68072Mzd) r9
            X.NYL r10 = (X.NYL) r10
            r7 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r7, r9, r10)
            java.lang.String r1 = r10.A05
            if (r1 != 0) goto L_0x0015
            android.view.View r1 = r9.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0015:
            com.instagram.common.ui.base.IgTextView r0 = r9.A03
            r0.setText(r1)
            java.lang.String r4 = r10.A03
            if (r4 == 0) goto L_0x008c
            int r1 = r4.length()
            if (r1 == 0) goto L_0x008a
            java.lang.String r2 = r10.A02
            if (r2 == 0) goto L_0x008a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x008a
            com.instagram.common.ui.base.IgTextView r3 = r9.A02
            android.view.View r0 = r9.A01
            android.content.Context r1 = r0.getContext()
            r0 = 2131959514(0x7f131eda, float:1.955567E38)
            java.lang.String r4 = X.DbV.A0u(r1, r4, r2, r0)
        L_0x003d:
            r3.setText(r4)
        L_0x0040:
            android.view.View r5 = r9.A01
            r5.setVisibility(r7)
            android.graphics.drawable.Drawable r4 = X.C328037De.A00()
            X.7L2 r0 = r10.A00
            X.7Ky r3 = r0.A03
            android.content.Context r0 = r5.getContext()
            X.0qQ.A07(r0)
            X.0qQ.A0B(r4, r6)
            X.7Qg r1 = X.C66581MXm.A0F(r4)
            if (r1 == 0) goto L_0x007a
            int r0 = r3.A03
            r1.A01(r0)
            android.graphics.drawable.shapes.Shape r2 = r1.A03
            boolean r0 = r2 instanceof X.C308496Um
            if (r0 == 0) goto L_0x007a
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.6Um r2 = (X.C308496Um) r2
            X.7Fo r1 = X.C328637Fo.NONE
            float r0 = r3.A02
            X.C329977Ky.A01(r2, r1, r3, r0, r0)
        L_0x007a:
            r5.setBackground(r4)
            X.7DZ r0 = r8.A01
            r0.A02(r9, r10)
            X.0h9 r1 = r8.A00
            X.07T r0 = X.07T.ON_RESUME
            r1.A0B(r0)
            return
        L_0x008a:
            if (r1 != 0) goto L_0x0097
        L_0x008c:
            java.lang.String r4 = r10.A02
            if (r4 == 0) goto L_0x0040
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0097
            goto L_0x0040
        L_0x0097:
            com.instagram.common.ui.base.IgTextView r3 = r9.A02
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71499Olo.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public C71499Olo(List list) {
        this.A01 = new AnonymousClass7DZ(list);
    }
}
