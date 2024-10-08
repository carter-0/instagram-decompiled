package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.75T  reason: invalid class name */
public final class AnonymousClass75T implements AnonymousClass7D2 {
    public final AnonymousClass7DZ A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_expired_placeholder, viewGroup, false);
        0qQ.A07(inflate);
        C66825MdH mdH = new C66825MdH(inflate);
        AnonymousClass7PV.A01(inflate);
        this.A00.A00(mdH);
        return mdH;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A00.A01(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r3.length() == 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r9, X.AnonymousClass7FW r10) {
        /*
            r8 = this;
            X.MdH r9 = (X.C66825MdH) r9
            X.MdW r10 = (X.C66838MdW) r10
            r5 = 0
            X.0qQ.A0B(r9, r5)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.3oV r7 = r9.A03
            r0 = 8
            r7.setVisibility(r0)
            X.3oV r6 = r9.A02
            r6.setVisibility(r0)
            android.widget.LinearLayout r1 = r9.A01
            X.7FU r0 = r10.A00
            boolean r4 = r0.CU2()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == 0) goto L_0x0028
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x0028:
            r1.setGravity(r0)
            java.lang.CharSequence r3 = r10.A02
            if (r3 == 0) goto L_0x0036
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            r2 = 6
            if (r0 != 0) goto L_0x004d
            android.view.View r1 = r7.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r3)
            r1.setVisibility(r5)
            r0 = 5
            if (r4 == 0) goto L_0x004a
            r0 = 6
        L_0x004a:
            r1.setTextAlignment(r0)
        L_0x004d:
            android.view.View r1 = r6.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r0 = r10.A01
            r1.setText(r0)
            r1.setVisibility(r5)
            int r0 = r10.A00
            r1.setTextColor(r0)
            if (r4 != 0) goto L_0x0063
            r2 = 5
        L_0x0063:
            r1.setTextAlignment(r2)
            X.7DZ r0 = r8.A00
            r0.A02(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75T.ADp(X.7Db, X.7FW):void");
    }

    public AnonymousClass75T(AnonymousClass7XR r10, AnonymousClass9HC r11) {
        List singletonList = Collections.singletonList(new C3266077l((AnonymousClass7DX) null, new AnonymousClass75U((C332927Wz) r10), new AnonymousClass7DT(r10), new AnonymousClass7DV((AnonymousClass7XX) r10, r11.A1X), (C333107Xr) r10, r11, (C3266177m) null, false));
        0qQ.A07(singletonList);
        this.A00 = new AnonymousClass7DZ(singletonList);
    }
}
