package X;

import android.view.ViewGroup;
import com.instagram.android.R;

public final class QKH extends QKK {
    public ViewGroup A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a0, code lost:
        if (X.RUP.A00(r1, false) != false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A0F(android.os.Bundle r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            if (r0 != 0) goto L_0x0011
            r12.A07()
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            android.app.Dialog r3 = new android.app.Dialog
            r3.<init>(r0)
        L_0x0010:
            return r3
        L_0x0011:
            android.os.Bundle r2 = r12.requireArguments()
            java.lang.String r1 = "is_payment_enabled"
            r0 = 0
            boolean r11 = r2.getBoolean(r1, r0)
            android.os.Bundle r2 = r12.requireArguments()
            java.lang.String r1 = "is_reconsent_enabled"
            boolean r1 = r2.getBoolean(r1, r0)
            r12.A0D = r1
            android.os.Bundle r2 = r12.requireArguments()
            java.lang.String r1 = "is_consent_accepted"
            boolean r1 = r2.getBoolean(r1, r0)
            r12.A0C = r1
            android.os.Bundle r2 = r12.requireArguments()
            java.lang.String r1 = "should_always_show_ads_disclosure"
            boolean r1 = r2.getBoolean(r1, r0)
            r12.A01 = r1
            boolean r3 = r12.A0D
            r5 = 0
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            if (r3 == 0) goto L_0x016d
            r1 = 2131626356(0x7f0e0974, float:1.8879946E38)
            android.view.View r2 = r2.inflate(r1, r5)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r12.A00 = r2
            r1 = 2131442901(0x7f0b3cd5, float:1.8507855E38)
            android.widget.TextView r4 = X.DbU.A0G(r2, r1)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131440615(0x7f0b33e7, float:1.8503218E38)
            android.widget.TextView r2 = X.DbU.A0G(r2, r1)
            int r1 = r12.A00
            r3 = 1
            if (r1 != r3) goto L_0x020c
            r1 = 2131972559(0x7f1351cf, float:1.958213E38)
            r4.setText(r1)
            r1 = 2131972502(0x7f135196, float:1.9582013E38)
            r2.setText(r1)
            X.QKv r1 = r12.A05
            r1.getClass()
            X.S5W r2 = r12.A0E
            java.lang.String r1 = "CLICKED_LEARN_MORE"
            X.RRP r1 = r2.A00(r1, r0)
            X.SHz r7 = r1.A00()
            boolean r1 = r12.A01
            if (r1 != 0) goto L_0x0149
            boolean r1 = r12.A0C
            if (r1 != 0) goto L_0x00a2
            X.4gR r1 = r12.A04
            if (r1 == 0) goto L_0x0149
            X.1yd r1 = r1.A04
            X.0qQ.A0B(r1, r3)
            boolean r1 = X.RUP.A00(r1, r0)
            if (r1 == 0) goto L_0x0149
        L_0x00a2:
            androidx.fragment.app.FragmentActivity r2 = r12.requireActivity()
            android.view.ViewGroup r4 = r12.A00
            r8 = 2131965846(0x7f133796, float:1.9568513E38)
            r9 = 2131435828(0x7f0b2134, float:1.849351E38)
            r10 = 2131953393(0x7f1306f1, float:1.9543256E38)
            X.QKv r1 = r12.A05
            android.os.Bundle r3 = r1.A02()
            X.4gR r6 = r12.A04
            X.SKI.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00bc:
            boolean r3 = r12.A0D
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131428348(0x7f0b03fc, float:1.8478338E38)
            android.view.View r7 = r2.requireViewById(r1)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131440751(0x7f0b346f, float:1.8503494E38)
            android.view.View r6 = r2.requireViewById(r1)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r5 = r12.A07
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            X.QA2 r4 = X.SB3.A00(r1, r5, r3)
            r2 = 2131432555(0x7f0b146b, float:1.848687E38)
            android.view.View r1 = r4.requireViewById(r2)
            r3 = 8
            if (r11 == 0) goto L_0x0140
            r1.setVisibility(r3)
        L_0x00ea:
            r4.setTag(r5)
            r1 = 2131439198(0x7f0b2e5e, float:1.8500344E38)
            X.DbT.A1F(r4, r1, r3)
            int r1 = r6.indexOfChild(r7)
            r6.addView(r4, r1)
            r6.removeView(r7)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131440615(0x7f0b33e7, float:1.8503218E38)
            android.view.View r2 = r2.requireViewById(r1)
            r1 = 10
            X.C11497SbK.A01(r2, r1, r12)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131437021(0x7f0b25dd, float:1.8495929E38)
            android.view.View r2 = r2.requireViewById(r1)
            r1 = 11
            X.C11497SbK.A01(r2, r1, r12)
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            android.view.ViewGroup r1 = r12.A00
            android.app.AlertDialog$Builder r1 = r2.setView(r1)
            android.app.AlertDialog r3 = r1.create()
            boolean r1 = r12.A00
            if (r1 == 0) goto L_0x0010
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            android.view.View r1 = r2.findViewById(r1)
            X.AnonymousClass7TH.A0R(r1)
            r3.setCanceledOnTouchOutside(r0)
            return r3
        L_0x0140:
            android.view.View r2 = r4.requireViewById(r2)
            r1 = 6
            X.C11499SbM.A01(r2, r1, r12, r5)
            goto L_0x00ea
        L_0x0149:
            androidx.fragment.app.FragmentActivity r2 = r12.requireActivity()
            android.view.ViewGroup r4 = r12.A00
            r8 = 2131972509(0x7f13519d, float:1.9582028E38)
            r9 = 2131428341(0x7f0b03f5, float:1.8478324E38)
            r10 = 2131953393(0x7f1306f1, float:1.9543256E38)
            X.QKv r1 = r12.A05
            android.os.Bundle r3 = r1.A02()
            X.4gR r6 = r12.A04
            X.SKI.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131435828(0x7f0b2134, float:1.849351E38)
            X.JTR.A1C(r2, r1)
            goto L_0x00bc
        L_0x016d:
            r1 = 2131626354(0x7f0e0972, float:1.8879942E38)
            android.view.View r2 = r2.inflate(r1, r5)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r12.A00 = r2
            r1 = 2131440614(0x7f0b33e6, float:1.8503216E38)
            android.view.View r4 = r2.requireViewById(r1)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131440615(0x7f0b33e7, float:1.8503218E38)
            android.widget.TextView r3 = X.DbU.A0G(r2, r1)
            int r2 = r12.A00
            r1 = 1
            if (r2 != r1) goto L_0x0213
            r1 = 2131626355(0x7f0e0973, float:1.8879944E38)
            r4.setLayoutResource(r1)
            r1 = 2131972502(0x7f135196, float:1.9582013E38)
            r3.setText(r1)
            android.view.View r2 = r4.inflate()
            r1 = 2131442901(0x7f0b3cd5, float:1.8507855E38)
            android.widget.TextView r3 = X.DbU.A0G(r2, r1)
            r1 = 2131431439(0x7f0b100f, float:1.8484607E38)
            android.widget.TextView r2 = X.DbU.A0G(r2, r1)
            r1 = 2131971927(0x7f134f57, float:1.9580847E38)
            r3.setText(r1)
            r1 = 2131971928(0x7f134f58, float:1.958085E38)
            r2.setText(r1)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r1 = 2131972967(0x7f135367, float:1.9582957E38)
            java.lang.String r1 = r12.getString(r1)
            android.text.SpannableStringBuilder r1 = r6.append(r1)
            r7 = 32
            r1.append(r7)
            android.view.ViewGroup r1 = r12.A00
            android.content.Context r2 = r1.getContext()
            r1 = 2131100361(0x7f0602c9, float:1.7813101E38)
            java.lang.Integer r1 = X.DbV.A0n(r2, r1)
            X.RBV r5 = new X.RBV
            r5.<init>(r12, r1, r11)
            int r4 = r6.length()
            r1 = 2131953393(0x7f1306f1, float:1.9543256E38)
            java.lang.String r1 = r12.getString(r1)
            r6.append(r1)
            int r3 = r6.length()
            android.text.SpannableStringBuilder r2 = r6.append(r7)
            r1 = 33
            r2.setSpan(r5, r4, r3, r1)
            android.view.ViewGroup r2 = r12.A00
            r1 = 2131440924(0x7f0b351c, float:1.8503845E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r1)
            X.DbX.A1G(r1, r6)
            r1.setHighlightColor(r0)
            goto L_0x00bc
        L_0x020c:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x0213:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKH.A0F(android.os.Bundle):android.app.Dialog");
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1337546517);
        QKH.super.onResume();
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            C11507SbU.A00(viewGroup.requireViewById(R.id.autofill_bottomsheet_drag_handle), 4, this);
        }
        AnonymousClass0fD.A09(-1662867360, A02);
    }
}
