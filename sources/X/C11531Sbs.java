package X;

import android.widget.CompoundButton;

/* renamed from: X.Sbs  reason: case insensitive filesystem */
public final class C11531Sbs implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C11531Sbs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.R9j, X.11X] */
    /* JADX WARNING: type inference failed for: r0v66, types: [X.R9j, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        X.1ES.A03(new X.C8782R9j(r4, r3, r2, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d8, code lost:
        X.C51968G9o.A1O(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r15, boolean r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            r2 = r16
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00c0;
                case 2: goto L_0x01dc;
                case 3: goto L_0x00a7;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01bd;
                case 7: goto L_0x01a9;
                case 8: goto L_0x011a;
                case 9: goto L_0x003c;
                case 10: goto L_0x00fe;
                case 11: goto L_0x0020;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r14.A01
            X.ESF r4 = (X.ESF) r4
            X.1Av r0 = r4.A01
            r0.A1f(r2)
            X.SFf r0 = r4.A00
            r0.A04 = r2
            X.PR9 r3 = r4.A03
        L_0x0016:
            r1 = 1
            X.R9j r0 = new X.R9j
            r0.<init>(r4, r3, r2, r1)
            X.1ES.A03(r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r4 = r14.A01
            X.ESF r4 = (X.ESF) r4
            X.1Av r0 = r4.A01
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "oxp_show_app_update_installed_notifications"
            r1.E5T(r0, r2)
            r1.apply()
            X.SFf r0 = r4.A00
            r0.A05 = r2
            X.PR9 r3 = r4.A04
            goto L_0x0016
        L_0x003c:
            java.lang.Object r5 = r14.A01
            X.R8N r5 = (X.R8N) r5
            if (r16 != 0) goto L_0x007f
            android.content.Context r0 = r5.requireContext()
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r0)
            r0 = 2131954315(0x7f130a8b, float:1.9545126E38)
            r2.A09(r0)
            r0 = 2131954314(0x7f130a8a, float:1.9545124E38)
            r2.A08(r0)
            r1 = 2131975563(0x7f135d8b, float:1.9588222E38)
            r0 = 41
            X.SVE r0 = X.SVE.A00(r5, r0)
            r2.A0K(r0, r1)
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r0 = 42
            X.SVE r0 = X.SVE.A00(r5, r0)
            r2.A0G(r0, r1)
            r2.A05()
            r1 = 7
            X.SVF r0 = new X.SVF
            r0.<init>(r5, r1)
            r2.A0f(r0)
            X.DbT.A1V(r2)
            return
        L_0x007f:
            X.0eM r0 = r5.A0D
            java.lang.Object r4 = r0.getValue()
            X.1Av r4 = (X.1Av) r4
            X.0s0 r3 = r4.A7C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 168(0xa8, float:2.35E-43)
            X.AnonymousClass7TF.A1J(r4, r3, r1, r0, r2)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x001f
            X.S3Q r1 = X.R8N.A00(r5)
            java.lang.String r2 = r5.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.SHc r1 = r1.A03
            java.lang.String r0 = "warning_settings_toggle_on"
            r1.A01(r2, r0)
            return
        L_0x00a7:
            java.lang.Object r0 = r14.A01
            X.QKG r0 = (X.QKG) r0
            X.4gR r0 = r0.A00
            if (r0 == 0) goto L_0x001f
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "autofill_passkey_opt_in_cache_key"
            r1.E5T(r0, r2)
            r1.apply()
            return
        L_0x00c0:
            java.lang.Object r3 = r14.A01
            X.QKJ r3 = (X.QKJ) r3
            X.4gR r0 = r3.A00
            if (r0 == 0) goto L_0x001f
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "autofill_passkey_opt_in_cache_key"
            r1.E5T(r0, r2)
            r1.apply()
            if (r16 != 0) goto L_0x001f
            X.4gR r0 = r3.A00
            X.SJq r2 = r0.A01
            X.STY r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x00e9
            X.QKv r0 = r0.A04
            android.os.Bundle r1 = r0.A02()
        L_0x00e9:
            java.lang.String r0 = "UNCHECK_PASSKEY_CREATION_CHECKBOX"
            r2.A06(r0, r1)
            return
        L_0x00ef:
            java.lang.Object r0 = r14.A01
            X.QKC r0 = (X.QKC) r0
            X.4gR r0 = r0.A02
            if (r0 == 0) goto L_0x001f
            X.RzL r0 = r0.A00
            X.QP4 r0 = r0.A00
            r0.A01 = r2
            return
        L_0x00fe:
            java.lang.Object r4 = r14.A01
            X.ESF r4 = (X.ESF) r4
            X.1Av r0 = r4.A01
            r0.A1E(r2)
            X.SFf r0 = r4.A00
            r0.A02 = r2
            X.PR9 r3 = r4.A05
            r1 = 1
            X.R9j r0 = new X.R9j
            r0.<init>(r4, r3, r2, r1)
            X.1ES.A03(r0)
            X.ESF.A06(r4)
            return
        L_0x011a:
            java.lang.Object r3 = r14.A01
            X.R8N r3 = (X.R8N) r3
            if (r16 == 0) goto L_0x01a0
            java.lang.String r1 = "settings_link_history_switch_toggled_off_clicked"
        L_0x0123:
            X.0eM r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            X.SHc r0 = (X.C11242SHc) r0
            r4 = 0
            X.C11242SHc.A00(r0, r1, r4)
            X.S3Q r11 = X.R8N.A00(r3)
            android.content.Context r9 = r11.A00
            androidx.fragment.app.FragmentActivity r3 = r11.A01
            com.instagram.common.session.UserSession r10 = r11.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r12 = r11.A04
            X.T5x r0 = new X.T5x
            r0.<init>()
            X.2nI r4 = X.C229382nI.A01(r4, r3, r0, r10)
            X.RvO r2 = new X.RvO
            r2.<init>()
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x019d
            java.lang.String r1 = "SETTINGS_PAGE_OPT_IN"
        L_0x0155:
            java.util.Map r5 = r2.A02
            java.lang.String r0 = "entry_source"
            r5.put(r0, r1)
            java.util.BitSet r7 = r2.A00
            r6 = 0
            r7.set(r6)
            java.lang.String r0 = "iab_session_id"
            r5.put(r0, r12)
            r13 = 1
            r7.set(r13)
            X.TPL r8 = new X.TPL
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 15
            X.Q3B r1 = X.Q3B.A01(r8, r2, r0)
            java.util.Map r3 = r2.A01
            java.lang.String r0 = "callback"
            r3.put(r0, r1)
            r1 = 2
            X.T6n r2 = new X.T6n
            r2.<init>(r1)
            int r0 = r7.nextClearBit(r6)
            if (r0 < r1) goto L_0x01a4
            java.lang.String r0 = "com.bloks.www.bloks.link_history.settings_page.open_opt_in_screen"
            X.FBO r1 = X.HX9.A00(r0)
            java.util.HashMap r0 = X.C359608dC.A01(r5)
            r1.A04 = r0
            r1.A03 = r3
            r1.A02 = r2
            r1.A01(r9, r4)
            return
        L_0x019d:
            java.lang.String r1 = "SETTINGS_PAGE_OPT_OUT"
            goto L_0x0155
        L_0x01a0:
            java.lang.String r1 = "settings_link_history_switch_toggled_on_clicked"
            goto L_0x0123
        L_0x01a4:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x01a9:
            java.lang.Object r3 = r14.A01
            X.R8N r3 = (X.R8N) r3
            X.S3Q r1 = X.R8N.A00(r3)
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r1.A00(r0, r2)
            X.R8N.A06(r3, r2)
            X.R8N.A05(r3)
            return
        L_0x01bd:
            java.lang.Object r0 = r14.A01
            com.facebookpay.widget.otc.AnonCheckoutToggleButton r0 = (com.facebookpay.widget.otc.AnonCheckoutToggleButton) r0
            X.0sP r0 = r0.A00
            goto L_0x01d8
        L_0x01c4:
            java.lang.Object r1 = r14.A01
            X.QAR r1 = (X.QAR) r1
            android.util.Property r0 = androidx.appcompat.widget.SwitchCompat.A0i
            X.Qfc r0 = r1.A00
            X.2gB r0 = r0.A05
            X.JTP.A1B(r0, r2)
            return
        L_0x01d2:
            java.lang.Object r0 = r14.A01
            X.Qen r0 = (X.C8000Qen) r0
            X.0sP r0 = r0.A04
        L_0x01d8:
            X.C51968G9o.A1O(r0, r2)
            return
        L_0x01dc:
            java.lang.Object r0 = r14.A01
            X.QKG r0 = (X.QKG) r0
            r0.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11531Sbs.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
