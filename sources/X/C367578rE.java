package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.8rE  reason: invalid class name and case insensitive filesystem */
public final class C367578rE extends 2Rw {
    public final Context A00;
    public final C355148Ov A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.context_menu_item_prism, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C380569Yr(context, inflate, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r13, int r14) {
        /*
            r12 = this;
            X.9Yr r13 = (X.C380569Yr) r13
            r4 = 0
            X.0qQ.A0B(r13, r4)
            java.util.List r0 = r12.A02
            java.lang.Object r3 = X.00k.A0O(r0, r14)
            X.8rJ r3 = (X.C367628rJ) r3
            if (r3 == 0) goto L_0x00e8
            android.graphics.drawable.Drawable r0 = r3.A00
            r9 = 8
            android.widget.ImageView r2 = r13.A02
            if (r0 == 0) goto L_0x0127
            r2.setImageDrawable(r0)
            r2.setVisibility(r4)
            java.lang.Integer r0 = r3.A03
            android.content.Context r1 = r12.A00
            if (r0 == 0) goto L_0x011e
            int r0 = r0.intValue()
        L_0x0028:
            int r0 = r1.getColor(r0)
            r2.setColorFilter(r0)
        L_0x002f:
            java.lang.Integer r10 = r3.A04
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            android.widget.TextView r6 = r13.A03
            if (r10 != r5) goto L_0x0119
            boolean r0 = r3.A0A
            r6.setSingleLine(r0)
            java.lang.String r7 = r3.A08
            r6.setText(r7)
            java.lang.Integer r0 = r3.A05
            if (r0 == 0) goto L_0x0114
            android.content.Context r1 = r12.A00
            int r0 = r0.intValue()
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
        L_0x0052:
            X.ULb r11 = r3.A01
            if (r11 == 0) goto L_0x008e
            android.content.Context r1 = r12.A00
            int r0 = r11.A00
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x008e
            int r0 = r6.getCurrentTextColor()
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
            float r0 = r6.getTextSize()
            int r1 = (int) r0
            float r0 = r6.getTextSize()
            int r0 = (int) r0
            r2.setBounds(r4, r4, r1, r0)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r7)
            X.46l r7 = new X.46l
            r7.<init>(r2)
            int r2 = r11.A03
            int r1 = r11.A01
            int r0 = r11.A02
            r8.setSpan(r7, r2, r1, r0)
            r6.setText(r8)
        L_0x008e:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            android.widget.TextView r1 = r13.A05
            if (r10 != r2) goto L_0x0110
            java.lang.String r0 = r3.A08
            r1.setText(r0)
            r1.setVisibility(r4)
            java.lang.Integer r0 = r3.A07
            if (r0 == 0) goto L_0x0100
            int r0 = r0.intValue()
        L_0x00a4:
            r6.setTextColor(r0)
        L_0x00a7:
            java.lang.Integer r0 = r3.A06
            int r7 = r0.intValue()
            r1 = 4
            if (r7 == r4) goto L_0x00fa
            r0 = 1
            boolean r6 = r3.A09
            if (r7 == r0) goto L_0x00e9
            if (r6 == 0) goto L_0x00fa
            android.widget.ImageView r1 = r13.A01
            r1.setVisibility(r4)
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r1.setImageResource(r0)
        L_0x00c2:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x00ce
            android.widget.TextView r0 = r13.A04
            r0.setVisibility(r4)
            X.0oe.A01(r0, r5, r4)
        L_0x00ce:
            android.view.View r1 = r13.A00
            X.ANs r0 = new X.ANs
            r0.<init>(r3, r12)
            X.AnonymousClass0fU.A00(r0, r1)
            X.AP2 r0 = new X.AP2
            r0.<init>(r3)
            r1.setOnTouchListener(r0)
            java.lang.String r0 = r3.A08
            r1.setContentDescription(r0)
            X.2eS.A04(r1, r2)
        L_0x00e8:
            return
        L_0x00e9:
            android.widget.ImageView r1 = r13.A01
            r0 = 2131238101(0x7f081cd5, float:1.8092471E38)
            if (r6 == 0) goto L_0x00f3
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
        L_0x00f3:
            r1.setImageResource(r0)
            r1.setVisibility(r4)
            goto L_0x00c2
        L_0x00fa:
            android.widget.ImageView r0 = r13.A01
            r0.setVisibility(r1)
            goto L_0x00c2
        L_0x0100:
            android.content.Context r1 = r6.getContext()
            r0 = 2130970132(0x7f040614, float:1.7548965E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            goto L_0x00a4
        L_0x0110:
            r1.setVisibility(r9)
            goto L_0x00a7
        L_0x0114:
            X.C48948Emm.A00(r6)
            goto L_0x0052
        L_0x0119:
            r6.setVisibility(r9)
            goto L_0x008e
        L_0x011e:
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0H(r1, r0)
            goto L_0x0028
        L_0x0127:
            r2.setVisibility(r9)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367578rE.onBindViewHolder(X.3kE, int):void");
    }

    public C367578rE(Context context, C355148Ov r2, List list, boolean z) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = z ? 2Yn.A01(context) : context;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-2040203222);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-605925519, A03);
        return size;
    }
}
