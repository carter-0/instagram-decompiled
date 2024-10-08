package X;

import android.os.Bundle;
import java.io.File;

/* renamed from: X.9rQ  reason: invalid class name and case insensitive filesystem */
public final class C390529rQ extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelMemoriesShareFragment";
    public 1Xj A00;
    public File A01;
    public String A02;
    public String A03;
    public final C41837B2s A04 = new WUP(this, 23);

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        throw X.AnonymousClass7TE.A0w("Memories reshare entrypoint not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        if (r10.equals(r9) != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r0 = r10.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        if (r0 == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0149, code lost:
        r4.A2e = r9;
        X.AnonymousClass80D.A02(r7, (android.graphics.RectF) null, r4);
        r4.A3y = true;
        X.AnonymousClass80D.A0A(r4);
        r4.A0P = r12;
        r4.A0w = null;
        r0 = r2.A00;
        r4.A1D = r0;
        r4.A2H = r0.getId();
        r4.A1T = r5;
        r4.A3Q = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r3.CeS() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass80D A02(android.view.ViewGroup r24) {
        /*
            r23 = this;
            r15 = 0
            r0 = r24
            X.0qQ.A0B(r0, r15)
            r2 = r23
            X.1Xj r3 = r2.A00
            r1 = 0
            if (r3 != 0) goto L_0x000e
            return r1
        L_0x000e:
            boolean r3 = r3.A5v()
            if (r3 == 0) goto L_0x0021
            X.1Xj r3 = r2.A00
            X.0qQ.A0A(r3)
            boolean r3 = r3.CeS()
            r16 = 3
            if (r3 != 0) goto L_0x0023
        L_0x0021:
            r16 = 1
        L_0x0023:
            java.io.File r3 = r2.A01
            java.lang.String r6 = "file"
            if (r3 == 0) goto L_0x00a7
            java.lang.String r14 = r3.getAbsolutePath()
            X.0qQ.A07(r14)
            X.1Xj r3 = r2.A00
            X.0qQ.A0A(r3)
            long r19 = r3.A1A()
            X.1Xj r3 = r2.A00
            X.0qQ.A0A(r3)
            long r21 = r3.A1A()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r3
            java.io.File r3 = r2.A01
            if (r3 == 0) goto L_0x00a7
            android.net.Uri r13 = android.net.Uri.fromFile(r3)
            com.instagram.common.gallery.Medium r12 = new com.instagram.common.gallery.Medium
            r17 = r15
            r18 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            X.1Xj r3 = r2.A00
            X.0qQ.A0A(r3)
            boolean r3 = r3.A5v()
            if (r3 == 0) goto L_0x0074
            boolean r5 = r12.CeS()
            if (r5 != 0) goto L_0x0074
            java.io.File r4 = r2.A01
            if (r4 == 0) goto L_0x00a7
            com.instagram.common.session.UserSession r3 = r2.A00
            com.instagram.common.util.gradient.BackgroundGradientColors r3 = X.C39581A0x.A00(r3, r4, r5)
            r12.A0H = r3
        L_0x0074:
            android.graphics.RectF r7 = X.AnonymousClass7TH.A04(r2)
            java.lang.String r3 = r2.A02
            if (r3 == 0) goto L_0x00a5
            X.8D6 r5 = new X.8D6
            r5.<init>(r3)
        L_0x0081:
            X.80D r4 = X.AnonymousClass80D.A00()
            X.B2s r3 = r2.A04
            X.AnonymousClass80D.A0D(r4, r3, r2)
            X.80I r8 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0qQ.A06(r6)
            r3 = 1
            X.AnonymousClass80D.A09(r6, r8, r4, r2)
            r4.A09 = r0
            java.lang.String r10 = r2.A03
            java.lang.String r0 = "entryPoint"
            if (r10 != 0) goto L_0x00ab
            X.0qQ.A0F(r0)
        L_0x00a0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a5:
            r5 = 0
            goto L_0x0081
        L_0x00a7:
            X.0qQ.A0F(r6)
            goto L_0x00a0
        L_0x00ab:
            int r11 = r10.hashCode()
            switch(r11) {
                case -1860333474: goto L_0x00f4;
                case -1658366172: goto L_0x00e9;
                case -75963178: goto L_0x00da;
                case 408643638: goto L_0x00d3;
                case 1355928532: goto L_0x00c4;
                case 1629143653: goto L_0x00b9;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.String r0 = "Memories reshare entrypoint not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00b9:
            java.lang.String r0 = "activity_tab"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.28D r0 = X.28D.A07
            goto L_0x00fe
        L_0x00c4:
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.28D r0 = X.28D.A3P
            goto L_0x00fe
        L_0x00d3:
            r0 = 793(0x319, float:1.111E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00f6
        L_0x00da:
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.28D r0 = X.28D.A0O
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r0 = "achievements"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.28D r0 = X.28D.A0k
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r0 = "stories_creation_gallery"
        L_0x00f6:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00b2
            X.28D r0 = X.28D.A0N
        L_0x00fe:
            r4.A0B = r0
            r4.A0O = r2
            java.lang.String r9 = "activity_tab"
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r8 = X.C273654mx.A00(r0)
            java.lang.String r6 = "achievements"
            switch(r11) {
                case -1860333474: goto L_0x0140;
                case -1658366172: goto L_0x0138;
                case -75963178: goto L_0x0133;
                case 408643638: goto L_0x012c;
                case 1355928532: goto L_0x011d;
                case 1629143653: goto L_0x0116;
                default: goto L_0x010f;
            }
        L_0x010f:
            java.lang.String r0 = "Memories reshare entrypoint not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0116:
            boolean r0 = r10.equals(r9)
            if (r0 == 0) goto L_0x010f
            goto L_0x0149
        L_0x011d:
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x010f
            java.lang.String r9 = "memory_pog"
            goto L_0x0149
        L_0x012c:
            r0 = 793(0x319, float:1.111E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0142
        L_0x0133:
            boolean r0 = r10.equals(r8)
            goto L_0x0146
        L_0x0138:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L_0x010f
            r9 = r6
            goto L_0x0149
        L_0x0140:
            java.lang.String r0 = "stories_creation_gallery"
        L_0x0142:
            boolean r0 = r10.equals(r0)
        L_0x0146:
            if (r0 == 0) goto L_0x010f
            r9 = r8
        L_0x0149:
            r4.A2e = r9
            X.AnonymousClass80D.A02(r7, r1, r4)
            r4.A3y = r3
            X.AnonymousClass80D.A0A(r4)
            r4.A0P = r12
            r4.A0w = r1
            X.1Xj r0 = r2.A00
            r4.A1D = r0
            java.lang.String r0 = r0.getId()
            r4.A2H = r0
            r4.A1T = r5
            r4.A3Q = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390529rQ.A02(android.view.ViewGroup):X.80D");
    }

    public final String getModuleName() {
        return "reel_memories_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-738301696);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AnonymousClass000.A00(2450));
        if (string == null) {
            string = "";
        }
        this.A03 = string;
        this.A00 = AnonymousClass7TH.A0B(this, requireArguments.getString(AnonymousClass000.A00(2452)));
        String string2 = requireArguments.getString(AnonymousClass000.A00(2451));
        if (string2 != null) {
            this.A01 = AnonymousClass7TE.A0t(string2);
            this.A02 = requireArguments.getString(AnonymousClass000.A00(2449));
            AnonymousClass0fD.A09(1177841379, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1109485229, A022);
        throw A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.exists() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r2 = this;
            r0 = -741622666(0xffffffffd3cbbc76, float:-1.75008042E12)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.1Xj r0 = r2.A00
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r2.A01
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "file"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            X.VJ3.A00(r2)
        L_0x0025:
            r0 = -1931449506(0xffffffff8ce06b5e, float:-3.4577284E-31)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390529rQ.onResume():void");
    }
}
