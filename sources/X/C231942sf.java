package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.2sf  reason: invalid class name and case insensitive filesystem */
public final class C231942sf implements C231932se {
    public boolean A00;
    public final AnonymousClass0iw A01;

    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r5.length() == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r6.length() == 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0124, code lost:
        if (r0 != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        if (r10 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013d, code lost:
        r0 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013f, code lost:
        if (r0 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0141, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0144, code lost:
        if (r12 == null) goto L_?;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADo(X.2bv r12, X.AnonymousClass4UC r13, X.C254103rw r14) {
        /*
            r11 = this;
            r4 = 0
            X.0qQ.A0B(r14, r4)
            r0 = 2
            X.0qQ.A0B(r13, r0)
            X.4V7 r6 = r13.A08
            android.widget.TextView r1 = r14.A07
            X.4V8 r0 = r6.A09
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = ""
        L_0x0014:
            r1.setText(r0)
            r1.setVisibility(r4)
            X.5Jo r0 = r6.A03
            r3 = 8
            android.widget.TextView r1 = r14.A05
            if (r0 == 0) goto L_0x0167
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = ""
        L_0x0028:
            r1.setText(r0)
            r1.setVisibility(r4)
        L_0x002e:
            X.5Js r0 = r6.A08
            if (r0 == 0) goto L_0x0164
            java.lang.String r1 = r0.A00
        L_0x0034:
            r5 = 1
            if (r1 == 0) goto L_0x015d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x015d
            android.widget.TextView r0 = r14.A06
            r0.setText(r1)
            r0.setVisibility(r4)
        L_0x0045:
            android.view.View r0 = r14.itemView
            r0.setVisibility(r4)
            X.5Ju r1 = r6.A06
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r14.A08
            android.content.Context r0 = r2.getContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            if (r0 == 0) goto L_0x0154
            if (r1 == 0) goto L_0x0154
        L_0x005a:
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            X.0iw r0 = r11.A01
            r2.setUrl(r1, r0)
            r2.setVisibility(r4)
        L_0x0064:
            X.4VG r0 = r6.A00
            android.widget.ImageView r1 = r14.A04
            if (r0 == 0) goto L_0x014d
            r1.setVisibility(r4)
            X.Oio r0 = new X.Oio
            r0.<init>(r12, r13, r14)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0075:
            X.4VG r2 = r6.A01
            if (r2 == 0) goto L_0x014a
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x014a
            X.4V8 r0 = r2.A00
            java.lang.String r5 = r0.A00
            if (r5 != 0) goto L_0x0087
            java.lang.String r5 = ""
        L_0x0087:
            X.4VG r2 = r6.A02
            if (r2 == 0) goto L_0x0147
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0147
            X.4V8 r0 = r2.A00
            java.lang.String r6 = r0.A00
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = ""
        L_0x0099:
            if (r5 == 0) goto L_0x00a2
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            r10 = r0 ^ 1
            if (r6 == 0) goto L_0x00ae
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x00af
        L_0x00ae:
            r0 = 1
        L_0x00af:
            r0 = r0 ^ 1
            java.lang.String r2 = "Required value was null."
            if (r10 == 0) goto L_0x0124
            if (r0 != 0) goto L_0x00dc
            X.Uxe r0 = X.C16584Uxe.ONE_BUTTON_PRIMARY_CONDENSED
            r14.A00(r0)
        L_0x00bc:
            android.widget.TextView r0 = r14.A00
            if (r0 == 0) goto L_0x0184
            r0.setVisibility(r4)
            android.widget.TextView r0 = r14.A00
            if (r0 == 0) goto L_0x0184
            r0.setText(r5)
            if (r12 == 0) goto L_0x00db
            android.widget.TextView r1 = r14.A00
            if (r1 == 0) goto L_0x0184
            X.FND r0 = new X.FND
            r0.<init>(r12, r13)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00d8:
            r12.DbK(r13)
        L_0x00db:
            return
        L_0x00dc:
            android.widget.TextView r0 = r14.A00
            if (r0 == 0) goto L_0x0184
            android.text.TextPaint r0 = r0.getPaint()
            if (r5 == 0) goto L_0x0178
            float r8 = r0.measureText(r5)
            android.widget.TextView r0 = r14.A01
            if (r0 == 0) goto L_0x0172
            android.text.TextPaint r0 = r0.getPaint()
            if (r6 == 0) goto L_0x016c
            float r7 = r0.measureText(r6)
            android.widget.TextView r0 = r14.A00
            if (r0 == 0) goto L_0x0184
            android.content.res.Resources r9 = r0.getResources()
            android.util.DisplayMetrics r0 = r9.getDisplayMetrics()
            int r1 = r0.widthPixels
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = r9.getDimensionPixelSize(r0)
            int r1 = r1 - r0
            float r0 = (float) r1
            float r1 = java.lang.Math.max(r8, r7)
            float r1 = r1 / r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0121
            X.Uxe r0 = X.C16584Uxe.TWO_BUTTON_VERTICAL_WITH_SECONDARY
        L_0x011d:
            r14.A00(r0)
            goto L_0x0126
        L_0x0121:
            X.Uxe r0 = X.C16584Uxe.TWO_BUTTON_HORIZONTAL
            goto L_0x011d
        L_0x0124:
            if (r0 == 0) goto L_0x013d
        L_0x0126:
            android.widget.TextView r1 = r14.A01
            if (r1 == 0) goto L_0x017e
            r1.setText(r6)
            r1.setVisibility(r4)
            if (r12 == 0) goto L_0x013a
            X.FNR r0 = new X.FNR
            r0.<init>(r12, r13, r11)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x013a:
            if (r10 == 0) goto L_0x013d
            goto L_0x00bc
        L_0x013d:
            android.widget.TextView r0 = r14.A00
            if (r0 == 0) goto L_0x0184
            r0.setVisibility(r3)
            if (r12 == 0) goto L_0x00db
            goto L_0x00d8
        L_0x0147:
            r6 = 0
            goto L_0x0099
        L_0x014a:
            r5 = 0
            goto L_0x0087
        L_0x014d:
            r1.setVisibility(r3)
            r11.A00 = r5
            goto L_0x0075
        L_0x0154:
            X.5Ju r1 = r6.A07
            if (r1 != 0) goto L_0x005a
            r2.setVisibility(r3)
            goto L_0x0064
        L_0x015d:
            android.widget.TextView r0 = r14.A06
            r0.setVisibility(r3)
            goto L_0x0045
        L_0x0164:
            r1 = 0
            goto L_0x0034
        L_0x0167:
            r1.setVisibility(r3)
            goto L_0x002e
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0184:
            java.lang.String r0 = "primaryButton"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231942sf.ADo(X.2bv, X.4UC, X.3rw):void");
    }

    public final View CrT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.condensed_generic_v3_megaphone, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C254103rw(inflate));
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void ADr(C249703kE r2, 2bv r3, AnonymousClass4UC r4, Map map) {
        C254103rw r22 = (C254103rw) r2;
        0qQ.A0B(r22, 0);
        ADo(r3, r4, r22);
    }

    public C231942sf(AnonymousClass0iw r1) {
        this.A01 = r1;
    }
}
