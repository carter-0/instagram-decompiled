package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.5M3  reason: invalid class name */
public final class AnonymousClass5M3 extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass9JG A01;
    public final /* synthetic */ C270694h9 A02;
    public final /* synthetic */ ClipsViewerConfig A03;
    public final /* synthetic */ ClipsViewerSource A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C54575HJk A06;
    public final /* synthetic */ C52185GIb A07;
    public final /* synthetic */ C270654h5 A08;
    public final /* synthetic */ GF2 A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ C62320sa A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5M3(Context context, AnonymousClass9JG r3, C270694h9 r4, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, UserSession userSession, C54575HJk hJk, C52185GIb gIb, C270654h5 r10, GF2 gf2, String str, String str2, C62320sa r14) {
        super(0);
        this.A05 = userSession;
        this.A0A = str;
        this.A04 = clipsViewerSource;
        this.A03 = clipsViewerConfig;
        this.A09 = gf2;
        this.A08 = r10;
        this.A0B = str2;
        this.A02 = r4;
        this.A06 = hJk;
        this.A00 = context;
        this.A01 = r3;
        this.A0C = r14;
        this.A07 = gIb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r9.A01 != com.instagram.api.schemas.RIXUCoverChainingType.UNIFIED_CHAINING) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r8.A0D() != true) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (X.182.A06(r2, r6, 36325703813575835L) != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r29 = this;
            r1 = r29
            com.instagram.common.session.UserSession r6 = r1.A05
            java.lang.String r4 = r1.A0A
            com.instagram.clips.intf.ClipsViewerSource r14 = r1.A04
            com.instagram.clips.intf.ClipsViewerConfig r5 = r1.A03
            X.GF2 r0 = r1.A09
            r23 = r0
            X.4h5 r0 = r1.A08
            r22 = r0
            java.lang.String r15 = r1.A0B
            X.4h9 r13 = r1.A02
            X.HJk r3 = r1.A06
            android.content.Context r12 = r1.A00
            X.9JG r11 = r1.A01
            X.0sa r10 = r1.A0C
            X.GIb r8 = r1.A07
            int r9 = r14.ordinal()
            r0 = 11
            r7 = 1
            if (r9 == r0) goto L_0x00d8
            switch(r9) {
                case 50: goto L_0x00d8;
                case 56: goto L_0x00d8;
                case 64: goto L_0x00d8;
                case 67: goto L_0x00d8;
                case 81: goto L_0x00d8;
                case 109: goto L_0x00d8;
                default: goto L_0x002c;
            }
        L_0x002c:
            r27 = 0
        L_0x002e:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509746821323(0x81077e003b18cb, double:3.031310034565728E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00ca
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r14 != r0) goto L_0x00ca
        L_0x003f:
            r28 = 0
        L_0x0041:
            X.4hB r16 = new X.4hB
            r25 = r15
            r26 = r10
            r24 = r4
            r19 = r5
            r20 = r6
            r21 = r3
            r17 = r12
            r18 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.0t0 r10 = X.AnonymousClass0eN.A01(r16)
            r0 = 68
            if (r9 == r0) goto L_0x0079
            r0 = 87
            if (r9 == r0) goto L_0x0079
            r0 = 44
            if (r9 == r0) goto L_0x00dc
            r0 = 41
            if (r9 == r0) goto L_0x00dc
            r0 = 42
            if (r9 == r0) goto L_0x00dc
            switch(r9) {
                case 36: goto L_0x00dc;
                case 45: goto L_0x00dc;
                case 93: goto L_0x00dc;
                case 95: goto L_0x00dc;
                case 147: goto L_0x00ad;
                default: goto L_0x0071;
            }
        L_0x0071:
            switch(r9) {
                case 13: goto L_0x00dc;
                case 14: goto L_0x00dc;
                case 38: goto L_0x00dc;
                case 40: goto L_0x00dc;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.Object r5 = r10.getValue()
            return r5
        L_0x0079:
            if (r4 == 0) goto L_0x0074
            com.instagram.model.rixu.RIXUChainingBehaviorDefinition r9 = r5.A0P
            if (r9 == 0) goto L_0x0074
            com.instagram.api.schemas.RIXUChainingSourceType r1 = r9.A00
            if (r1 == 0) goto L_0x0074
            com.instagram.api.schemas.RIXUChainingSourceType r0 = com.instagram.api.schemas.RIXUChainingSourceType.UNCONNECTED
            if (r1 != r0) goto L_0x008e
            com.instagram.api.schemas.RIXUCoverChainingType r1 = r9.A01
            com.instagram.api.schemas.RIXUCoverChainingType r0 = com.instagram.api.schemas.RIXUCoverChainingType.UNIFIED_CHAINING
            if (r1 != r0) goto L_0x008e
            goto L_0x0074
        L_0x008e:
            r0 = 36328250729184390(0x81105a00063c86, double:3.037470271035919E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0074
            r0 = 36318509746952397(0x81077e003d18cd, double:3.0313100346486194E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00b8
            if (r8 == 0) goto L_0x00b8
            boolean r0 = r8.A0D()
            if (r0 != r7) goto L_0x00b8
            goto L_0x0074
        L_0x00ad:
            r0 = 36325703813575835(0x810e090006349b, double:3.035859591349463E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0074
        L_0x00b8:
            java.lang.Integer r0 = r5.A0b
            r6 = 0
            X.GNI r5 = new X.GNI
            r7 = r13
            r8 = r3
            r9 = r22
            r10 = r23
            r11 = r0
            r12 = r4
            r13 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x00ca:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.THIRD_PARTY_URL
            if (r14 == r0) goto L_0x00d4
            if (r27 == 0) goto L_0x003f
            boolean r0 = r5.A1j
            if (r0 != 0) goto L_0x003f
        L_0x00d4:
            r28 = 1
            goto L_0x0041
        L_0x00d8:
            r27 = 1
            goto L_0x002e
        L_0x00dc:
            java.lang.Integer r0 = r5.A0b
            X.GNI r5 = new X.GNI
            r6 = r11
            r7 = r13
            r8 = r3
            r9 = r22
            r10 = r23
            r11 = r0
            r12 = r4
            r13 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5M3.invoke():java.lang.Object");
    }
}
