package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;

/* renamed from: X.OhF  reason: case insensitive filesystem */
public final class C71274OhF implements NoCopySpan, TextWatcher {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C71274OhF(UE4 ue4, C17997VjZ vjZ, boolean z) {
        this.A01 = 2;
        this.A03 = vjZ;
        this.A02 = ue4;
        this.A00 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r4.A00 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x002f
            java.lang.String r3 = r5.toString()
            java.lang.Object r0 = r4.A03
            X.VjZ r0 = (X.C17997VjZ) r0
            r0.A00 = r3
            java.lang.Object r1 = r4.A02
            X.UE4 r1 = (X.UE4) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.2eb r0 = r1.A03
            android.view.View r2 = r0.A01()
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002b
            boolean r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            r2.setActivated(r0)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71274OhF.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r13.length() == 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1 == 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r3 = r12.A03
            X.OdL r3 = (X.C71126OdL) r3
            boolean r0 = r3.A0K
            r2 = 1
            if (r0 != 0) goto L_0x001b
            long r0 = X.C66581MXm.A06()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
            r3.A0K = r2
        L_0x001b:
            if (r13 == 0) goto L_0x002a
            java.lang.CharSequence r0 = X.00l.A0B(r13)
            if (r0 == 0) goto L_0x002a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            X.C71126OdL.A03(r3, r0, r2)
            java.lang.Object r0 = r12.A02
            X.NWf r0 = (X.C68770NWf) r0
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r1 = r0.A05
            if (r1 == 0) goto L_0x0005
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x0005
            X.GPJ r4 = X.GPJ.A00
            com.instagram.common.session.UserSession r5 = r3.A0Q
            java.lang.String r7 = r1.A04
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A05
            java.lang.Integer r6 = r1.A02
            java.lang.String r10 = r1.A0A
            long r0 = r3.A00
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r4.A07(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0076
        L_0x0052:
            java.lang.Object r3 = r12.A02
            X.6Uk r3 = (X.C308476Uk) r3
            r2 = 1
            if (r13 == 0) goto L_0x0060
            int r1 = r13.length()
            r0 = 0
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            r1 = r0 ^ 1
            r0 = 0
            r3.A01(r0, r1, r2)
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x0005
            java.lang.Object r0 = r12.A03
            X.NKP r0 = (X.NKP) r0
            X.0sa r0 = r0.A05
            if (r0 == 0) goto L_0x0005
            r0.invoke()
        L_0x0076:
            r12.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71274OhF.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C71274OhF(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A03 = obj;
    }
}
