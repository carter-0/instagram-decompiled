package X;

import com.instagram.direct.capabilities.Capabilities;

public final class NgL extends C47518E6c {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknameSettingsFragment";
    public C74449Pv4 A00;
    public C254793t3 A01;
    public String A02;
    public Capabilities A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            super.onViewCreated(r9, r10)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.3t3 r0 = X.OXL.A00(r1, r0)
            if (r0 == 0) goto L_0x00c4
            r8.A01 = r0
            java.lang.String r0 = "self_setting"
            java.lang.String r0 = r1.getString(r0)
            r8.A02 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            com.instagram.direct.capabilities.Capabilities r3 = (com.instagram.direct.capabilities.Capabilities) r3
            r8.A03 = r3
            if (r3 == 0) goto L_0x0045
            android.content.Context r2 = r8.requireContext()
            X.0eM r0 = r8.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.3t3 r0 = r8.A01
            if (r0 != 0) goto L_0x003f
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            X.Pv4 r0 = X.C330397Mp.A01(r2, r1, r3, r0)
            r8.A00 = r0
        L_0x0045:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131958998(0x7f131cd6, float:1.9554624E38)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r1.A01 = r0
            r5.add(r1)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "EVERYONE"
            r0 = 2131958999(0x7f131cd7, float:1.9554626E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r7, r0, r4)
            java.lang.String r6 = "PEOPLE_YOU_FOLLOW"
            r0 = 2131959000(0x7f131cd8, float:1.9554628E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r6, r0, r4)
            java.lang.String r3 = "ONLY_YOU"
            r0 = 2131959001(0x7f131cd9, float:1.955463E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r3, r0, r4)
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto L_0x00c1
            int r1 = r2.hashCode()
            r0 = -1285166868(0xffffffffb365e8ec, float:-5.353006E-8)
            if (r1 == r0) goto L_0x00b8
            r0 = -1109690463(0xffffffffbddb77a1, float:-0.10716177)
            if (r1 == r0) goto L_0x00c1
            r0 = 1064604011(0x3f74916b, float:0.9553439)
            if (r1 != r0) goto L_0x00c1
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x00a0:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x00b4;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r1 = 4
            X.OlH r0 = new X.OlH
            r0.<init>(r1, r8, r4)
            X.DbU.A1F(r0, r3, r5, r4)
            r8.setItems(r5)
            return
        L_0x00b4:
            r3 = r6
            goto L_0x00a7
        L_0x00b6:
            r3 = r7
            goto L_0x00a7
        L_0x00b8:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00a0
        L_0x00c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00a0
        L_0x00c4:
            java.lang.IllegalArgumentException r0 = X.C66580MXl.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NgL.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }
}
