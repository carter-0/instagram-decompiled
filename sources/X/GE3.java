package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.quicklog.EventBuilder;
import com.instagram.common.session.UserSession;

public final class GE3 implements AnonymousClass32U, C270674h7 {
    public Integer A00;
    public C62320sa A01;
    public C52228GJt A02;
    public Integer A03;
    public final Handler A04 = new Handler(C64021Cb.A00());
    public final AnonymousClass0qK A05;
    public final C227232is A06;
    public final Context A07;
    public final UserSession A08;
    public final C55683Hlg A09;
    public final GD9 A0A;

    public GE3(Context context, UserSession userSession, C227232is r5, C55683Hlg hlg, GD9 gd9) {
        0qQ.A0B(hlg, 5);
        this.A06 = r5;
        this.A0A = gd9;
        this.A07 = context;
        this.A08 = userSession;
        this.A09 = hlg;
        Integer num = AnonymousClass05K.A00;
        this.A00 = num;
        this.A03 = num;
        IP4 ip4 = new IP4(this, 1);
        C62670v5.A0B.A03(ip4);
        this.A05 = ip4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3r(X.H3D r11) {
        /*
            r10 = this;
            r8 = 0
            X.0qQ.A0B(r11, r8)
            X.4dm r9 = r11.A01
            java.lang.Throwable r7 = r9.A01()
            boolean r6 = r7 instanceof java.io.IOException
            X.Hlg r1 = r10.A09
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r0 = 880747659(0x347f248b, float:2.376202E-7)
            X.02m r5 = r1.A00
            java.lang.String r3 = "clips_viewer_reliability"
            com.facebook.quicklog.EventBuilder r2 = r5.markEventBuilder(r0, r3)
            X.0qQ.A0A(r2)
            X.IOl r1 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A01 = r0
            if (r7 == 0) goto L_0x002e
            java.lang.String r8 = r7.toString()
            if (r8 != 0) goto L_0x009d
        L_0x002e:
            java.lang.Object r0 = r9.A00()
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x003c
            java.lang.String r8 = r0.getErrorMessage()
            if (r8 != 0) goto L_0x0042
        L_0x003c:
            r0 = 1306(0x51a, float:1.83E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
        L_0x0042:
            if (r7 != 0) goto L_0x009d
            java.lang.String r7 = "empty trace"
        L_0x0046:
            boolean r1 = r11.A02
            java.lang.String r0 = "is_first_page"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            int r1 = r11.A00
            java.lang.String r0 = "chunk_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A04
            java.lang.String r0 = "is_refreshing"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A03
            java.lang.String r0 = "is_prefetch_response"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A06
            java.lang.String r0 = "is_streaming"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A05
            java.lang.String r0 = "is_cached_response"
            com.facebook.quicklog.EventBuilder r1 = r2.annotate(r0, r1)
            java.lang.String r0 = "failure_reason"
            com.facebook.quicklog.EventBuilder r1 = r1.annotate(r0, r8)
            java.lang.String r0 = "trace"
            com.facebook.quicklog.EventBuilder r0 = r1.annotate(r0, r7)
            r0.report()
            if (r6 == 0) goto L_0x00a2
            r0 = 880745295(0x347f1b4f, float:2.375866E-7)
            com.facebook.quicklog.EventBuilder r0 = r5.markEventBuilder(r0, r3)
            X.0qQ.A0A(r0)
            r0.report()
            r0 = 14
            X.IwK r0 = X.C58711IwK.A00(r10, r0)
            r10.A01 = r0
            return
        L_0x009d:
            java.lang.String r7 = X.2Og.A00(r7)
            goto L_0x0046
        L_0x00a2:
            java.lang.Integer r1 = r10.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00af
            r0 = 2131955519(0x7f130f3f, float:1.9547568E38)
            r10.A00(r0)
            return
        L_0x00af:
            r10.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GE3.D3r(X.H3D):void");
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        this.A02 = gJt;
        this.A00 = AnonymousClass05K.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0087, code lost:
        if (r1 != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A00 = r0
            r0 = 0
            r5.A01 = r0
            X.Hlg r4 = r5.A09
            r3 = 1
            r2 = 880742933(0x347f1215, float:2.3755304E-7)
            X.02m r1 = r4.A00
            java.lang.String r0 = "clips_viewer_reliability"
            com.facebook.quicklog.EventBuilder r2 = r1.markEventBuilder(r2, r0)
            X.0qQ.A0A(r2)
            X.IOl r1 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A01 = r0
            boolean r1 = r6.A0D
            java.lang.String r0 = "is_first_page"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0I
            java.lang.String r0 = "is_streaming"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0G
            java.lang.String r0 = "is_refreshing"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0F
            java.lang.String r0 = "is_prefetch_response"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "response_container_module"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "reels_page_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            int r1 = r6.A00
            java.lang.String r0 = "chunk_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.util.List r3 = r6.A09
            int r1 = r3.size()
            java.lang.String r0 = "response_size"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            X.5u7 r4 = r6.A01
            X.4sa r0 = r4.BaP()
            boolean r1 = r0.BU8()
            java.lang.String r0 = "more_available"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            X.4sa r0 = r4.BaP()
            java.lang.String r0 = r0.BP8()
            if (r0 == 0) goto L_0x0089
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x008a
        L_0x0089:
            r0 = 1
        L_0x008a:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_max_id"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r4.CPt()
            java.lang.String r0 = "is_cached_response"
            com.facebook.quicklog.EventBuilder r0 = r2.annotate(r0, r1)
            r0.report()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00ab
            r0 = 2131955520(0x7f130f40, float:1.954757E38)
            r5.A00(r0)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GE3.D3u(X.GLe):void");
    }

    public final void DVz(int i) {
    }

    public final void DW0(int i) {
    }

    public final void DW8(int i, int i2) {
    }

    public final void DWA(int i, int i2) {
    }

    public final void DWY() {
    }

    public final void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        0qQ.A0B(num, 0);
        this.A03 = num;
        if (num == AnonymousClass05K.A00 && this.A00 == AnonymousClass05K.A01) {
            A00(2131955519);
        }
    }

    public final void Dpv() {
    }

    public final void Dpy(C267324bN r1, int i) {
    }

    private final void A00(int i) {
        C267324bN A022;
        GD9 gd9 = this.A0A;
        if (C52012GBj.A01(gd9.A00) > 0 && (A022 = gd9.A02()) != null && A022.A01 == C295365o2.GHOST) {
            C52012GBj gBj = this.A06.A0N;
            if (gBj == null) {
                0qQ.A0F("clipsViewerViewPager");
                throw AnonymousClass00P.createAndThrow();
            }
            int A062 = gBj.A06();
            if (A062 > 0) {
                gBj.A0I(A062 - 1, true);
            }
            C59689JTv.A0F(this.A07, "ghost_clips", i);
        }
    }

    public final void D3s() {
        C52228GJt gJt = this.A02;
        if (gJt != null) {
            EventBuilder markEventBuilder = this.A09.A00.markEventBuilder(880739373, "clips_viewer_reliability");
            0qQ.A0A(markEventBuilder);
            markEventBuilder.annotate("is_first_page", gJt.A02).annotate("is_streaming", gJt.A04).annotate("is_refreshing", gJt.A03).report();
        }
        if (!1KU.A03(this.A08)) {
            this.A00 = AnonymousClass05K.A00;
        }
    }
}
