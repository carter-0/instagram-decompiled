package X;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.Djd  reason: case insensitive filesystem */
public final class C46707Djd extends BaseAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final E6B A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r0 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r3 = 2
            X.0qQ.A0B(r12, r3)
            if (r11 != 0) goto L_0x001c
            android.content.Context r0 = r9.A01
            r2 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629742(0x7f0e16ae, float:1.8886814E38)
            android.view.View r11 = X.DbU.A0A(r1, r12, r0, r2)
            X.Ezl r0 = new X.Ezl
            r0.<init>(r11)
            r11.setTag(r0)
        L_0x001c:
            android.content.Context r7 = r9.A01
            java.lang.Object r6 = r11.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.login.twofac.view.TwoFacTrustedDeviceViewBinder.Holder"
            X.0qQ.A0C(r6, r0)
            X.Ezl r6 = (X.C49628Ezl) r6
            java.util.ArrayList r0 = r9.A00
            java.lang.Object r5 = X.DbZ.A0g(r0, r10)
            com.instagram.login.twofac.model.TrustedDevice r5 = (com.instagram.login.twofac.model.TrustedDevice) r5
            X.E6B r4 = r9.A02
            X.AnonymousClass7TG.A1N(r7, r6)
            X.AnonymousClass7TF.A1C(r5, r3, r4)
            java.lang.String r2 = r5.A06
            int r1 = r2.hashCode()
            r0 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r1 == r0) goto L_0x00ad
            r0 = -599163109(0xffffffffdc497f1b, float:-2.26864897E17)
            if (r1 != r0) goto L_0x0054
            java.lang.String r0 = "computer"
            boolean r0 = r2.equals(r0)
            r8 = 2131238197(0x7f081d35, float:1.8092666E38)
        L_0x0052:
            if (r0 != 0) goto L_0x0057
        L_0x0054:
            r8 = 2131238198(0x7f081d36, float:1.8092668E38)
        L_0x0057:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x00a5
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131975780(0x7f135e64, float:1.9588662E38)
            java.lang.String r2 = r1.getString(r0)
            android.widget.TextView r1 = r6.A04
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r7, r0)
            X.DbT.A17(r7, r1, r0)
        L_0x0072:
            android.widget.ImageView r0 = r6.A00
            X.DbU.A13(r7, r0, r8)
            android.widget.TextView r1 = r6.A03
            java.lang.String r0 = r5.A05
            r1.setText(r0)
            android.widget.TextView r0 = r6.A04
            r0.setText(r2)
            android.widget.TextView r2 = r6.A02
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A07
            r1.append(r0)
            r2.setText(r1)
            android.widget.ImageView r1 = r6.A01
            r0 = 56
            X.FPF.A00(r1, r0, r4, r5)
            return r11
        L_0x00a5:
            long r2 = r5.A02
            double r0 = (double) r2
            java.lang.String r2 = X.1G0.A03(r7, r0)
            goto L_0x0072
        L_0x00ad:
            r0 = 1603(0x643, float:2.246E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            r8 = 2131238199(0x7f081d37, float:1.809267E38)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46707Djd.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Object getItem(int i) {
        return DbZ.A0g(this.A00, i);
    }

    public final long getItemId(int i) {
        return (long) this.A00.get(i).hashCode();
    }

    public C46707Djd(Context context, E6B e6b, ArrayList arrayList) {
        this.A01 = context;
        this.A00 = arrayList;
        this.A02 = e6b;
    }
}
