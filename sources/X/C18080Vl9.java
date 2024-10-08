package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;

/* renamed from: X.Vl9  reason: case insensitive filesystem */
public final class C18080Vl9 {
    public final int A00;
    public final C17742VdB A01;

    public C18080Vl9(Context context) {
        int A012 = C14729U5o.A01(context, 0);
        this.A01 = new C17742VdB(new ContextThemeWrapper(context, C14729U5o.A01(context, A012)));
        this.A00 = A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14729U5o A00() {
        /*
            r12 = this;
            X.VdB r8 = r12.A01
            android.content.Context r7 = r8.A0L
            int r0 = r12.A00
            X.U5o r4 = new X.U5o
            r4.<init>(r7, r0)
            X.VzO r3 = r4.A00
            android.view.View r0 = r8.A09
            if (r0 == 0) goto L_0x00dd
            r3.A0B = r0
        L_0x0013:
            java.lang.CharSequence r1 = r8.A0C
            if (r1 == 0) goto L_0x0020
            r3.A0P = r1
            android.widget.TextView r0 = r3.A0J
            if (r0 == 0) goto L_0x0020
            r0.setText(r1)
        L_0x0020:
            java.lang.CharSequence r5 = r8.A0F
            if (r5 == 0) goto L_0x0034
            android.content.DialogInterface$OnClickListener r2 = r8.A04
            r0 = 0
            r1 = -1
            if (r2 == 0) goto L_0x0030
            android.os.Handler r0 = r3.A07
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0030:
            r3.A0O = r5
            r3.A0A = r0
        L_0x0034:
            java.lang.CharSequence r5 = r8.A0D
            if (r5 == 0) goto L_0x0048
            android.content.DialogInterface$OnClickListener r2 = r8.A01
            r0 = 0
            r1 = -2
            if (r2 == 0) goto L_0x0044
            android.os.Handler r0 = r3.A07
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0044:
            r3.A0M = r5
            r3.A08 = r0
        L_0x0048:
            java.lang.CharSequence r5 = r8.A0E
            if (r5 == 0) goto L_0x005c
            android.content.DialogInterface$OnClickListener r2 = r8.A02
            r0 = 0
            r1 = -3
            if (r2 == 0) goto L_0x0058
            android.os.Handler r0 = r3.A07
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0058:
            r3.A0N = r5
            r3.A09 = r0
        L_0x005c:
            java.lang.CharSequence[] r0 = r8.A0J
            if (r0 != 0) goto L_0x0064
            android.widget.ListAdapter r0 = r8.A0B
            if (r0 == 0) goto L_0x009d
        L_0x0064:
            android.view.LayoutInflater r1 = r8.A0M
            int r0 = r3.A03
            android.view.View r9 = X.DbU.A08(r1, r0)
            androidx.appcompat.app.AlertController$RecycleListView r9 = (androidx.appcompat.app.AlertController$RecycleListView) r9
            boolean r0 = r8.A0H
            r5 = 1
            if (r0 == 0) goto L_0x00c5
            int r11 = r3.A04
            java.lang.CharSequence[] r10 = r8.A0J
            X.U44 r6 = new X.U44
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x007c:
            r3.A0H = r6
            int r0 = r8.A00
            r3.A01 = r0
            android.content.DialogInterface$OnClickListener r0 = r8.A03
            if (r0 == 0) goto L_0x00bb
            r1 = 0
            X.Sbr r0 = new X.Sbr
            r0.<init>(r1, r8, r3)
        L_0x008c:
            r9.setOnItemClickListener(r0)
        L_0x008f:
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x0098
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x009b
            r5 = 2
        L_0x0098:
            r9.setChoiceMode(r5)
        L_0x009b:
            r3.A0I = r9
        L_0x009d:
            android.view.View r0 = r8.A0A
            if (r0 == 0) goto L_0x00a3
            r3.A0C = r0
        L_0x00a3:
            r0 = 1
            r4.setCancelable(r0)
            r4.setCanceledOnTouchOutside(r0)
            r0 = 0
            r4.setOnCancelListener(r0)
            android.content.DialogInterface$OnDismissListener r0 = r8.A05
            r4.setOnDismissListener(r0)
            android.content.DialogInterface$OnKeyListener r0 = r8.A06
            if (r0 == 0) goto L_0x00ba
            r4.setOnKeyListener(r0)
        L_0x00ba:
            return r4
        L_0x00bb:
            android.content.DialogInterface$OnMultiChoiceClickListener r0 = r8.A07
            if (r0 == 0) goto L_0x008f
            X.WCg r0 = new X.WCg
            r0.<init>(r8, r9, r3)
            goto L_0x008c
        L_0x00c5:
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x00da
            int r2 = r3.A05
        L_0x00cb:
            android.widget.ListAdapter r6 = r8.A0B
            if (r6 != 0) goto L_0x007c
            java.lang.CharSequence[] r1 = r8.A0J
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            X.U43 r6 = new X.U43
            r6.<init>(r7, r2, r0, r1)
            goto L_0x007c
        L_0x00da:
            int r2 = r3.A02
            goto L_0x00cb
        L_0x00dd:
            java.lang.CharSequence r1 = r8.A0G
            if (r1 == 0) goto L_0x00ea
            r3.A0Q = r1
            android.widget.TextView r0 = r3.A0K
            if (r0 == 0) goto L_0x00ea
            r0.setText(r1)
        L_0x00ea:
            android.graphics.drawable.Drawable r2 = r8.A08
            if (r2 == 0) goto L_0x0013
            r3.A06 = r2
            r1 = 0
            android.widget.ImageView r0 = r3.A0G
            if (r0 == 0) goto L_0x0013
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A0G
            r0.setImageDrawable(r2)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18080Vl9.A00():X.U5o");
    }

    public final void A01(int i) {
        C17742VdB vdB = this.A01;
        vdB.A0C = vdB.A0L.getText(i);
    }

    public final void A02(int i) {
        C17742VdB vdB = this.A01;
        vdB.A0G = vdB.A0L.getText(i);
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, int i) {
        C17742VdB vdB = this.A01;
        vdB.A0D = vdB.A0L.getText(i);
        vdB.A01 = onClickListener;
    }

    public final void A04(DialogInterface.OnClickListener onClickListener, int i) {
        C17742VdB vdB = this.A01;
        vdB.A0F = vdB.A0L.getText(i);
        vdB.A04 = onClickListener;
    }

    public final void A05(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C17742VdB vdB = this.A01;
        vdB.A0D = charSequence;
        vdB.A01 = onClickListener;
    }

    public final void A06(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C17742VdB vdB = this.A01;
        vdB.A0F = charSequence;
        vdB.A04 = onClickListener;
    }

    public final void A07(View view) {
        this.A01.A0A = view;
    }

    public final void A08(CharSequence charSequence) {
        this.A01.A0G = charSequence;
    }
}
