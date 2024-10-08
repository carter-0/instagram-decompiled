package X;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.OlL  reason: case insensitive filesystem */
public final class C71477OlL implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;

    public C71477OlL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r0 = ((X.PMI) r7.A01).A03.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProgressChanged(android.widget.SeekBar r8, int r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            if (r10 == 0) goto L_0x0018
            java.lang.Object r1 = r7.A01
            androidx.preference.SeekBarPreference r1 = (androidx.preference.SeekBarPreference) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0018
        L_0x0014:
            r1.A0N(r8)
            return
        L_0x0018:
            java.lang.Object r1 = r7.A01
            androidx.preference.SeekBarPreference r1 = (androidx.preference.SeekBarPreference) r1
            int r0 = r1.A01
            int r9 = r9 + r0
            android.widget.TextView r1 = r1.A05
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r1.setText(r0)
            return
        L_0x002b:
            if (r10 == 0) goto L_0x0005
            java.lang.Object r0 = r7.A01
            X.PMI r0 = (X.PMI) r0
            X.O9s r0 = r0.A03
            X.Mzl r0 = r0.A00
            X.OK5 r1 = r0.A01
            if (r1 == 0) goto L_0x0005
            X.PRo r0 = r0.A08
            X.Tol r0 = r0.A01
            if (r0 == 0) goto L_0x009e
            boolean r6 = r0.A0E()
        L_0x0043:
            X.Neo r5 = r1.A00
            X.OSp r4 = r5.A0R
            double r0 = (double) r9
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            X.1wD r2 = X.1w8.A00()
            int r2 = r2.A00
            double r2 = (double) r2
            double r0 = r0 * r2
            android.media.AudioManager r3 = r4.A00
            int r2 = (int) r0
            r1 = 3
            r0 = 0
            r3.setStreamVolume(r1, r2, r0)
            r1 = 0
            if (r9 <= 0) goto L_0x0080
            if (r6 != 0) goto L_0x0005
            X.PxR r0 = r5.A0U
            r0.FHE()
            X.Pry r4 = r5.A01
            X.N9i r4 = (X.C68295N9i) r4
            if (r4 == 0) goto L_0x007c
            r3 = 1
            int r0 = X.C70942OSp.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = -5121(0xffffffffffffebff, float:NaN)
            r0 = 2047(0x7ff, float:2.868E-42)
            X.N9i r1 = X.C68295N9i.A00((X.C74438Put) null, (com.instagram.common.typedurl.ImageUrl) null, r4, (X.AnonymousClass3TO) null, r2, (java.lang.Integer) null, (java.util.List) null, 0.0f, 0, r1, r0, false, r3, false, false, false, false, false, false)
        L_0x007c:
            r5.A0J(r1)
            return
        L_0x0080:
            if (r9 != 0) goto L_0x0005
            if (r6 == 0) goto L_0x0005
            X.PxR r0 = r5.A0U
            r0.FHE()
            X.Pry r2 = r5.A01
            X.N9i r2 = (X.C68295N9i) r2
            if (r2 == 0) goto L_0x007c
            int r0 = X.C70942OSp.A00()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = -5121(0xffffffffffffebff, float:NaN)
            X.N9i r1 = X.C68295N9i.A00((X.C74438Put) null, (com.instagram.common.typedurl.ImageUrl) null, r2, (X.AnonymousClass3TO) null, r1, (java.lang.Integer) null, (java.util.List) null, 0.0f, 0, r0, 2047, false, false, false, false, false, false, false, false)
            goto L_0x007c
        L_0x009e:
            r6 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71477OlL.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r1 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStartTrackingTouch(android.widget.SeekBar r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0006;
                case 2: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r7.A01
            X.Nhg r1 = (X.C69226Nhg) r1
            r0 = 1
            r1.A04 = r0
            X.Tol r1 = r1.A01
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = "seek"
            r1.A0A(r0)
            return
        L_0x0017:
            java.lang.Object r0 = r7.A01
            X.PMI r0 = (X.PMI) r0
            X.O9s r0 = r0.A03
            X.Mzl r1 = r0.A00
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.PRo r0 = r1.A08
            X.Tol r0 = r0.A01
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0005
        L_0x002b:
            r0 = 1
            r1.A04 = r0
            X.OK5 r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            X.Neo r1 = r0.A00
            X.N93 r0 = r1.A00
            if (r0 == 0) goto L_0x0005
            X.N36 r0 = r0.A00
            if (r0 == 0) goto L_0x0005
            X.OZx r6 = r1.A0W
            X.Put r0 = r0.A00
            java.lang.String r5 = r0.Aqe()
            boolean r0 = r1.A08
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.OKY r2 = r6.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.PKA r0 = new X.PKA
            r0.<init>(r5, r1)
            r2.A00(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r4, r3)
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = "control_action"
            java.lang.String r0 = "scrub"
            java.util.HashMap r3 = X.DbY.A0m(r1, r0)
            X.Oax r2 = r6.A03
            X.Nmk r1 = X.C69502Nmk.A0B
            r0 = 0
            r2.A03(r1, r0, r3)
        L_0x0070:
            r6.A03()
            return
        L_0x0074:
            java.lang.Object r1 = r7.A01
            androidx.preference.SeekBarPreference r1 = (androidx.preference.SeekBarPreference) r1
            r0 = 1
            r1.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71477OlL.onStartTrackingTouch(android.widget.SeekBar):void");
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        boolean z;
        int i;
        int i2;
        N36 n36;
        C74438Put put;
        C74268Prw pp4;
        C68295N9i n9i;
        switch (this.A00) {
            case 0:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.A01;
                seekBarPreference.A08 = false;
                if (seekBar.getProgress() + seekBarPreference.A01 != seekBarPreference.A03) {
                    seekBarPreference.A0N(seekBar);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(seekBar, 0);
                C69226Nhg nhg = (C69226Nhg) this.A01;
                nhg.A04 = false;
                C14044Tol tol = nhg.A01;
                if (tol != null) {
                    tol.A05(seekBar.getProgress(), true);
                }
                C14044Tol tol2 = nhg.A01;
                if (tol2 != null) {
                    tol2.A0C("seek", false);
                    return;
                }
                return;
            case 2:
                0qQ.A0B(seekBar, 0);
                long progress = (long) seekBar.getProgress();
                C68080Mzl mzl = ((PMI) this.A01).A03.A00;
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                mzl.A04 = false;
                OK5 ok5 = mzl.A01;
                if (ok5 != null) {
                    C72981PRo pRo = mzl.A08;
                    C14044Tol tol3 = pRo.A01;
                    if (tol3 != null) {
                        z = tol3.A01;
                    } else {
                        z = false;
                    }
                    if (tol3 != null) {
                        i = tol3.A06.getCurrentPositionMs();
                    } else {
                        i = 0;
                    }
                    long j = (long) i;
                    C14044Tol tol4 = pRo.A01;
                    if (tol4 != null) {
                        i2 = tol4.A06.AzN();
                    } else {
                        i2 = 0;
                    }
                    C69109Neo neo = ok5.A00;
                    N93 n93 = neo.A00;
                    if (n93 != null && (n36 = n93.A00) != null && (put = n36.A00) != null && put.CeS() && progress <= ((long) i2) && progress >= 0) {
                        C71111Ocu ocu = neo.A0Q;
                        if (z) {
                            pp4 = new PP2(progress);
                        } else if (!z) {
                            pp4 = new PP4(progress, j, (Integer) null);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        ocu.A03(pp4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                OK5 ok52 = ((PMI) this.A01).A00;
                if (ok52 != null) {
                    C69109Neo neo2 = ok52.A00;
                    C68295N9i n9i2 = (C68295N9i) neo2.A01;
                    if (n9i2 != null) {
                        n9i = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i2, (AnonymousClass3TO) null, Integer.valueOf(C70942OSp.A00()), (Integer) null, (List) null, 0.0f, 0, -4097, 2047, false, false, false, false, false, false, false, false);
                    } else {
                        n9i = null;
                    }
                    neo2.A0J(n9i);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
