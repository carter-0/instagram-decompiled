package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

public final class GFJ extends C251343mx {
    public final 2V5 A00;
    public final 2Wd A01;
    public final C229382nI A02;
    public final JPD A03;
    public final GEG A04;
    public final ClipsViewerConfig A05;
    public final C267324bN A06;
    public final JSx A07;
    public final C52058GDe A08;
    public final JRO A09;
    public final UserSession A0A;
    public final C52673Gal A0B;
    public final AnonymousClass4DU A0C;
    public final C310256ag A0D;
    public final C52672Gak A0E;
    public final GBS A0F;
    public final C234342xi A0G;
    public final JTB A0H;
    public final JP2 A0I;
    public final C51987GAk A0J;
    public final JTG A0K;
    public final H3C A0L;
    public final GF9 A0M;
    public final JTL A0N;
    public final JQX A0O;
    public final C52046GCs A0P;
    public final GF2 A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final HashMap A0U;
    public final HashMap A0V;
    public final List A0W;
    public final boolean A0X;
    public final boolean A0Y;

    private final float A00() {
        1Xj r0;
        C267324bN r4 = this.A06;
        if (r4.CcK() && (r0 = r4.A02) != null && C52453GTf.A00(r0)) {
            return 60.0f;
        }
        UserSession userSession = this.A0A;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36321301471831281L)) {
            return 50.0f;
        }
        if (!r4.CcK() || !182.A06(r2, userSession, 36326721720563656L)) {
            return (float) 182.A01(r2, userSession, 36602776448602875L);
        }
        return C51965G9l.A00(r2, userSession, 37171146650616356L);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v0, types: [X.2T3, java.lang.Object] */
    private final float A04(C251263mp r19, 2V1 r20, C251343mx r21, C251343mx r22, C70832Wc r23, GJ5 gj5, C267324bN r25, GFO gfo, float f, int i, boolean z) {
        int i2;
        C267324bN r2 = r25;
        if (!z && !gfo.A0C() && ((!r2.CcK() || !r2.A0E()) && (!C52076GDw.A04(r2)))) {
            return 0.0f;
        }
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        2V1 r5 = r20;
        try {
            r21.A0M(r5, obj, C51967G9n.A01(i), 0, false);
        } catch (Exception e) {
            0wb.A06("ClipsItemComponent", "Failed to measure clipsMediaInfoComponent", e);
        }
        try {
            r22.A0M(r5, obj2, 0, 0, false);
        } catch (Exception e2) {
            0wb.A06("ClipsItemComponent", "Failed to measure clipsFullWidthFooterComponent", e2);
        }
        if (C52076GDw.A03(r2)) {
            C251263mp r12 = r19;
            if (r19 != null) {
                try {
                    r12.A0M(r5, obj3, 0, 0, false);
                } catch (Exception e3) {
                    0wb.A06("ClipsItemComponent", "Failed to measure carouselSecondaryComponent", e3);
                }
                i2 = obj3.A00;
                return Math.min((float) (((obj.A00 + obj2.A00) + C51970G9q.A0d(r23).A03(A05(gj5, r2, false))) - i2), f);
            }
        }
        i2 = 0;
        return Math.min((float) (((obj.A00 + obj2.A00) + C51970G9q.A0d(r23).A03(A05(gj5, r2, false))) - i2), f);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object[], code=java.lang.Object, for r5v0, types: [java.lang.Object[]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(X.AnonymousClass3Y5 r3, X.C62320sa r4, java.lang.Object r5, boolean r6) {
        /*
            if (r6 != 0) goto L_0x0007
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
        L_0x0007:
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            r1 = 26
            X.IwC r0 = new X.IwC
            r0.<init>(r4, r1)
            java.lang.Object r0 = X.AnonymousClass3Zw.A00(r3, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFJ.A06(X.3Y5, X.0sa, java.lang.Object[], boolean):java.lang.Object");
    }

    public static final boolean A07(MotionEvent motionEvent, View view, AnonymousClass3W1 r5, GG0 gg0, C52129GFx gFx, String str, boolean z) {
        if ((r5.A1q || r5.A1p) && !r5.A2z) {
            return false;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            0f9 AEf = 0wj.A01.AEf("ClipsItemComponent", 817893396);
            AEf.ABQ("Action", String.valueOf(motionEvent.getAction()));
            AEf.ABQ("AdId", str);
            AEf.ABR("IsBloks", z);
            AEf.report();
        }
        if (gg0 != null) {
            gg0.A02(view, motionEvent);
            return false;
        }
        gFx.A02(view, motionEvent);
        return false;
    }

    public static final int A05(GJ5 gj5, C267324bN r3, boolean z) {
        if (r3.A0J() && !z) {
            return R.dimen.asset_picker_static_sticker_last_row_padding;
        }
        if (r3.CcK() && (gj5 == GJ5.AD || gj5 == GJ5.REMINDER_AD)) {
            return R.dimen.abc_button_padding_horizontal_material;
        }
        if (gj5 == GJ5.OVERLAY_AD) {
            return R.dimen.account_discovery_bottom_gap;
        }
        return R.dimen.action_bar_item_spacing_right;
    }

    public GFJ(2V5 r17, 2Wd r18, C229382nI r19, JPD jpd, ClipsViewerConfig clipsViewerConfig, JSx jSx, JRO jro, UserSession userSession, C52673Gal gal, AnonymousClass4DU r26, C310256ag r27, C52672Gak gak, GBS gbs, C234342xi r30, JTB jtb, JP2 jp2, C51987GAk gAk, JTG jtg, H3C h3c, GF9 gf9, JTL jtl, JQX jqx, C52046GCs gCs, GF2 gf2, String str, String str2, String str3, HashMap hashMap, HashMap hashMap2, List list, boolean z, boolean z2) {
        JTL jtl2 = jtl;
        0qQ.A0B(jtl2, 1);
        GF9 gf92 = gf9;
        0qQ.A0B(gf92, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        AnonymousClass4DU r8 = r26;
        0qQ.A0B(r8, 4);
        JRO jro2 = jro;
        0qQ.A0B(jro2, 5);
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        0qQ.A0B(clipsViewerConfig2, 6);
        HashMap hashMap3 = hashMap;
        0qQ.A0B(hashMap3, 10);
        HashMap hashMap4 = hashMap2;
        0qQ.A0B(hashMap4, 11);
        JSx jSx2 = jSx;
        0qQ.A0B(jSx2, 12);
        2V5 r15 = r17;
        0qQ.A0B(r15, 13);
        GBS gbs2 = gbs;
        0qQ.A0B(gbs2, 14);
        String str4 = str;
        0qQ.A0B(str4, 15);
        C229382nI r14 = r19;
        0qQ.A0B(r14, 16);
        C310256ag r7 = r27;
        0qQ.A0B(r7, 18);
        C234342xi r5 = r30;
        0qQ.A0B(r5, 30);
        this.A0N = jtl2;
        this.A0M = gf92;
        this.A0A = userSession2;
        this.A0C = r8;
        this.A09 = jro2;
        this.A05 = clipsViewerConfig2;
        this.A0K = jtg;
        this.A0H = jtb;
        this.A0W = list;
        this.A0V = hashMap3;
        this.A0U = hashMap4;
        this.A07 = jSx2;
        this.A00 = r15;
        this.A0F = gbs2;
        this.A0T = str4;
        this.A02 = r14;
        this.A0O = jqx;
        this.A0D = r7;
        this.A0P = gCs;
        this.A0J = gAk;
        this.A0I = jp2;
        this.A0R = str2;
        this.A03 = jpd;
        this.A0Q = gf2;
        this.A0L = h3c;
        this.A0Y = z;
        this.A0X = z2;
        this.A0E = gak;
        this.A0B = gal;
        this.A0G = r5;
        this.A01 = r18;
        this.A0S = str3;
        this.A06 = jtl2.BML();
        this.A08 = jtl2.BMN();
        this.A04 = jtl2.BMM();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v0, resolved type: X.2WX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v200, resolved type: X.3XV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v1, resolved type: X.GF9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v4, resolved type: X.3XV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: X.3XV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v4, resolved type: X.GKk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v458, resolved type: X.GKk} */
    /* JADX WARNING: type inference failed for: r71v3 */
    /* JADX WARNING: type inference failed for: r1v180, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r0v799, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r128v12, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v203, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r128v16, types: [X.GKl] */
    /* JADX WARNING: type inference failed for: r62v9, types: [X.GKr] */
    /* JADX WARNING: type inference failed for: r116v36, types: [X.GH3] */
    /* JADX WARNING: type inference failed for: r116v37, types: [X.Gun] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x03eb: MOVE  (r0v1067 X.GJ5) = (r107v0 X.GJ5)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1020:0x2132 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:1023:0x21b7 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:1026:0x21cb A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:1033:0x2209 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0408 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x040b A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x041a A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:1191:0x0ef6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x042a A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0449 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x045b A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0b61 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0bcc A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0e7b A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0e97 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ea5 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0ec1 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ed3 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0ed6 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0edb A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0f0c A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0f1a A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0f4e A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0f59 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0f73 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0fd8 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x1129 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x1179 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x118e A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x11da A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x11dc A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x138b A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x13d4 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0363 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:787:0x1983 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:799:0x19f9 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:811:0x1a2c A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0371 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0376 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0379 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0385 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0392 A[Catch:{ all -> 0x26ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03a6 A[Catch:{ all -> 0x26ee }] */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r251) {
        /*
            r250 = this;
            r11 = 0
            r10 = r251
            X.0qQ.A0B(r10, r11)
            r12 = r250
            X.GBS r0 = r12.A0F
            r249 = r0
            X.4bN r0 = r12.A06
            r248 = r0
            X.5o2 r0 = r0.A01
            r247 = r0
            java.lang.String r2 = r247.name()
            X.4DU r0 = r12.A0C
            r246 = r0
            java.lang.String r1 = r246.getModuleName()
            r0 = r249
            r0.A01(r12, r2, r1)
            X.GDe r0 = r12.A08     // Catch:{ all -> 0x26ee }
            r245 = r0
            X.3W1 r0 = r0.A0E     // Catch:{ all -> 0x26ee }
            r112 = r0
            r15 = 0
            if (r0 == 0) goto L_0x26e8
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            r111 = r0
            if (r0 == 0) goto L_0x26e8
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r67 = 14
            X.Iny r2 = new X.Iny     // Catch:{ all -> 0x26ee }
            r1 = r67
            r0 = r112
            r2.<init>(r1, r10, r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object r46 = X.AnonymousClass3Zw.A00(r10, r2, r3)     // Catch:{ all -> 0x26ee }
            r0 = r46
            X.GFO r0 = (X.GFO) r0     // Catch:{ all -> 0x26ee }
            r46 = r0
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r0 = 9
            java.lang.Object r4 = X.C58703IwC.A01(r10, r12, r1, r0)     // Catch:{ all -> 0x26ee }
            X.GFS r4 = (X.GFS) r4     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r105 = 10
            r0 = r105
            java.lang.Object r50 = X.C58703IwC.A01(r10, r12, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r50
            X.GFT r0 = (X.GFT) r0     // Catch:{ all -> 0x26ee }
            r50 = r0
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r106 = 24
            r0 = r106
            X.Iw1 r0 = X.C58692Iw1.A00(r10, r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object r0 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            boolean r102 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ all -> 0x26ee }
            r26 = 8
            r1 = r46
            r0 = r26
            X.2Wa r54 = X.C58703IwC.A00(r10, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r94 = 17
            r2 = r54
            r0 = r94
            java.lang.Object r23 = X.C58703IwC.A01(r10, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r23
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r23 = r0
            r0 = r245
            X.GDa r3 = r0.A0F     // Catch:{ all -> 0x26ee }
            if (r3 == 0) goto L_0x0163
            X.0eM r6 = r3.A05     // Catch:{ all -> 0x26ee }
            java.lang.Object r5 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r5 = (X.GFV) r5     // Catch:{ all -> 0x26ee }
            X.GJU r1 = X.GJU.SHOW_CTA     // Catch:{ all -> 0x26ee }
            com.instagram.common.session.UserSession r2 = r12.A0A     // Catch:{ all -> 0x26ee }
            X.GFW r0 = new X.GFW     // Catch:{ all -> 0x26ee }
            r16 = r0
            r17 = r248
            r18 = r245
            r19 = r2
            r20 = r112
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x26ee }
            X.GIx r0 = r5.A01(r1, r0)     // Catch:{ all -> 0x26ee }
            X.GFX.A00(r0, r3)     // Catch:{ all -> 0x26ee }
            java.lang.Object r5 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r5 = (X.GFV) r5     // Catch:{ all -> 0x26ee }
            X.GJU r1 = X.GJU.HIGHLIGHT_CTA     // Catch:{ all -> 0x26ee }
            X.GFY r0 = new X.GFY     // Catch:{ all -> 0x26ee }
            r16 = r0
            r20 = r246
            r21 = r112
            r22 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x26ee }
            X.GIx r0 = r5.A01(r1, r0)     // Catch:{ all -> 0x26ee }
            X.GFX.A00(r0, r3)     // Catch:{ all -> 0x26ee }
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r7 = (X.GFV) r7     // Catch:{ all -> 0x26ee }
            X.GJU r5 = X.GJU.SHOW_AND_HIDE_PREVIEW_COMMENT     // Catch:{ all -> 0x26ee }
            X.JRO r1 = r12.A09     // Catch:{ all -> 0x26ee }
            X.GFZ r0 = new X.GFZ     // Catch:{ all -> 0x26ee }
            r16 = r0
            r19 = r1
            r20 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x26ee }
            X.GIx r0 = r7.A01(r5, r0)     // Catch:{ all -> 0x26ee }
            X.GFX.A00(r0, r3)     // Catch:{ all -> 0x26ee }
            java.lang.Object r1 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r1 = (X.GFV) r1     // Catch:{ all -> 0x26ee }
            X.GJU r5 = X.GJU.MID_SCENE     // Catch:{ all -> 0x26ee }
            X.GFc r0 = new X.GFc     // Catch:{ all -> 0x26ee }
            r16 = r0
            r19 = r2
            r20 = r112
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x26ee }
            X.GIx r0 = r1.A01(r5, r0)     // Catch:{ all -> 0x26ee }
            X.GFX.A00(r0, r3)     // Catch:{ all -> 0x26ee }
            X.0Tu r7 = X.DbS.A0J(r2, r11)     // Catch:{ all -> 0x26ee }
            r0 = 36318561282824474(0x81078a0004191a, double:3.031342626141639E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x012d
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r0 = (X.GFV) r0     // Catch:{ all -> 0x26ee }
            r0.A00(r5)     // Catch:{ all -> 0x26ee }
        L_0x012d:
            r0 = r112
            boolean r0 = r0.A2N     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0149
            X.0Tu r7 = X.0Tu.A06     // Catch:{ all -> 0x26ee }
            r0 = 36329298700877804(0x81114e00013fec, double:3.038133012554677E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r0 = (X.GFV) r0     // Catch:{ all -> 0x26ee }
            r0.A00(r5)     // Catch:{ all -> 0x26ee }
        L_0x0149:
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x26ee }
            X.GFV r8 = (X.GFV) r8     // Catch:{ all -> 0x26ee }
            X.GJU r7 = X.GJU.ANIMATE_PE_COLLECTION     // Catch:{ all -> 0x26ee }
            X.GFd r6 = new X.GFd     // Catch:{ all -> 0x26ee }
            r5 = r248
            r1 = r245
            r0 = r112
            r6.<init>(r5, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            X.GIx r0 = r8.A01(r7, r6)     // Catch:{ all -> 0x26ee }
            X.GFX.A00(r0, r3)     // Catch:{ all -> 0x26ee }
        L_0x0163:
            r2 = 45
            X.GFe r1 = X.C52110GFe.A00     // Catch:{ all -> 0x26ee }
            r0 = r112
            X.2Wa r32 = X.C243753a2.A01(r10, r0, r1, r2, r11)     // Catch:{ all -> 0x26ee }
            r1 = r106
            X.2Wa r28 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r108 = 19
            r0 = r108
            r2 = r28
            java.lang.Object r22 = X.C58703IwC.A01(r10, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r22
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r22 = r0
            r65 = 25
            r1 = r65
            r0 = r112
            X.2Wa r88 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r1 = 22
            r0 = r88
            java.lang.Object r21 = X.C58703IwC.A01(r10, r0, r2, r1)     // Catch:{ all -> 0x26ee }
            r0 = r21
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r21 = r0
            boolean r0 = r248.A0J()     // Catch:{ all -> 0x26ee }
            r109 = 1
            if (r0 == 0) goto L_0x01d2
            com.instagram.clips.intf.ClipsViewerConfig r0 = r12.A05     // Catch:{ all -> 0x26ee }
            com.instagram.clips.intf.ClipsWatchAndBrowseData r1 = r0.A0K     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x01d2
            boolean r2 = r1.A0E     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r2 != r0) goto L_0x01bb
            r0 = r88
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x26ee }
            X.GJF r0 = X.GJF.COLLAPSED     // Catch:{ all -> 0x26ee }
            if (r2 == r0) goto L_0x01cf
        L_0x01bb:
            boolean r2 = r1.A0D     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r2 != r0) goto L_0x01c9
            r0 = r88
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x26ee }
            X.GJF r0 = X.GJF.CLOSED     // Catch:{ all -> 0x26ee }
            if (r2 == r0) goto L_0x01cf
        L_0x01c9:
            boolean r1 = r1.A0A     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x01d2
        L_0x01cf:
            r158 = 1
            goto L_0x01d4
        L_0x01d2:
            r158 = 0
        L_0x01d4:
            X.GFf r2 = X.C52111GFf.A00     // Catch:{ all -> 0x26ee }
            r1 = 5
            r0 = r112
            X.2Wa r3 = X.C243753a2.A01(r10, r0, r2, r1, r11)     // Catch:{ all -> 0x26ee }
            r2 = 33
            r0 = 36
            X.J6P r1 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            r0 = r112
            X.2Wa r2 = X.C243753a2.A01(r10, r0, r1, r2, r11)     // Catch:{ all -> 0x26ee }
            r101 = 13
            r1 = r101
            X.2Wa r5 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r0 = 20
            java.lang.Object r20 = X.C58703IwC.A01(r10, r5, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r20
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r20 = r0
            com.instagram.common.session.UserSession r6 = r12.A0A     // Catch:{ all -> 0x26ee }
            com.instagram.clips.intf.ClipsViewerConfig r0 = r12.A05     // Catch:{ all -> 0x26ee }
            r244 = r0
            X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            r71 = 5
            X.3de r5 = new X.3de     // Catch:{ all -> 0x26ee }
            r1 = r111
            r0 = r112
            r5.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r110 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x26ee }
            int r40 = r112.getPosition()     // Catch:{ all -> 0x26ee }
            java.util.List r39 = r111.A3b()     // Catch:{ all -> 0x26ee }
            X.GEF r1 = X.GEF.A00     // Catch:{ all -> 0x26ee }
            r0 = r248
            X.GJ5 r0 = r1.A04(r0, r6)     // Catch:{ all -> 0x26ee }
            r42 = 1
            boolean r43 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r111.A5K()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x024c
            X.0Tu r7 = X.DbS.A0J(r6, r11)     // Catch:{ all -> 0x26ee }
            r0 = 36320652937601788(0x810971005b22fc, double:3.0326653970452304E-306)
            boolean r0 = X.182.A06(r7, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x024c
        L_0x0242:
            boolean r0 = r111.A5K()     // Catch:{ all -> 0x26ee }
            r41 = 2131956650(0x7f1313aa, float:1.9549862E38)
            if (r0 == 0) goto L_0x0252
            goto L_0x024f
        L_0x024c:
            r42 = 0
            goto L_0x0242
        L_0x024f:
            r41 = 2131956658(0x7f1313b2, float:1.9549878E38)
        L_0x0252:
            r33 = r15
            r34 = r248
            r35 = r246
            r36 = r6
            r37 = r5
            r38 = r110
            r44 = r109
            X.3ex r33 = X.C245933di.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x027a
            X.0Tu r5 = X.C51965G9l.A0Z(r6, r11)     // Catch:{ all -> 0x26ee }
            r0 = 36328053160557477(0x81102c00043ba5, double:3.037345327840714E-306)
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ all -> 0x26ee }
            r14 = 1
            if (r0 != 0) goto L_0x027b
        L_0x027a:
            r14 = 0
        L_0x027b:
            r100 = 34
            X.GN2 r5 = new X.GN2     // Catch:{ all -> 0x26ee }
            r1 = r100
            r0 = r33
            r5.<init>(r1, r2, r0, r14)     // Catch:{ all -> 0x26ee }
            r1 = 52
            r0 = r112
            X.2Wa r52 = X.C243753a2.A01(r10, r0, r5, r1, r11)     // Catch:{ all -> 0x26ee }
            X.GFj r5 = X.C52115GFj.A00     // Catch:{ all -> 0x26ee }
            X.2Wa r51 = X.C243753a2.A01(r10, r0, r5, r1, r11)     // Catch:{ all -> 0x26ee }
            r95 = 12
            r1 = r95
            X.2Wa r7 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r0 = 18
            java.lang.Object r19 = X.C58703IwC.A01(r10, r7, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r19
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r19 = r0
            r98 = 15
            r1 = r98
            r0 = r112
            X.2Wa r5 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r61 = 21
            r0 = r61
            java.lang.Object r18 = X.C58703IwC.A01(r10, r5, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r18
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r18 = r0
            r5 = 59
            r0 = 37
            X.J6P r1 = X.J6P.A00(r4, r0)     // Catch:{ all -> 0x26ee }
            r0 = r112
            X.2Wa r78 = X.C243753a2.A01(r10, r0, r1, r5, r11)     // Catch:{ all -> 0x26ee }
            r8 = 60
            r25 = 16
            X.Iwx r5 = new X.Iwx     // Catch:{ all -> 0x26ee }
            r1 = r25
            r5.<init>(r1, r0, r12, r4)     // Catch:{ all -> 0x26ee }
            X.2Wa r77 = X.C243753a2.A01(r10, r0, r5, r8, r11)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.GDZ.A01(r247)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x02f2
            X.JTB r4 = r12.A0H     // Catch:{ all -> 0x26ee }
            X.3OA r1 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.GEG r0 = r12.A04     // Catch:{ all -> 0x26ee }
            r4.EO8(r0, r1)     // Catch:{ all -> 0x26ee }
        L_0x02f2:
            java.lang.Object r0 = r3.A03     // Catch:{ all -> 0x26ee }
            r47 = r0
            r0 = r47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x26ee }
            r47 = r0
            boolean r184 = r47.booleanValue()     // Catch:{ all -> 0x26ee }
            if (r184 == 0) goto L_0x0316
            r0 = r112
            boolean r0 = r0.A2I     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0316
            r0 = r244
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J     // Catch:{ all -> 0x26ee }
            r0 = r245
            boolean r0 = X.AnonymousClass71K.A02(r1, r0, r6)     // Catch:{ all -> 0x26ee }
            r151 = 1
            if (r0 == 0) goto L_0x0318
        L_0x0316:
            r151 = 0
        L_0x0318:
            java.lang.Object r0 = r2.A03     // Catch:{ all -> 0x26ee }
            r34 = r0
            r0 = r34
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x26ee }
            r34 = r0
            boolean r185 = r34.booleanValue()     // Catch:{ all -> 0x26ee }
            if (r185 == 0) goto L_0x0330
            r0 = r112
            boolean r0 = r0.A2K     // Catch:{ all -> 0x26ee }
            r150 = 1
            if (r0 == 0) goto L_0x0332
        L_0x0330:
            r150 = 0
        L_0x0332:
            X.GEG r0 = r12.A04     // Catch:{ all -> 0x26ee }
            r173 = r0
            X.GJ5 r0 = r0.A00     // Catch:{ all -> 0x26ee }
            r107 = r0
            X.71K r2 = X.GJ7.A00     // Catch:{ all -> 0x26ee }
            r1 = r248
            r0 = r109
            boolean r0 = r2.A0J(r1, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0359
            X.GJ5 r1 = X.GJ5.AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 != r1) goto L_0x0359
            r188 = 1
            r0 = r248
            boolean r0 = r2.A0K(r0, r6, r11)     // Catch:{ all -> 0x26ee }
            r219 = 1
            if (r0 != 0) goto L_0x035d
            goto L_0x035b
        L_0x0359:
            r188 = 0
        L_0x035b:
            r219 = 0
        L_0x035d:
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0376
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r211 = X.C231122qu.A00(r6, r0)     // Catch:{ all -> 0x26ee }
        L_0x0367:
            java.lang.String r59 = ""
            if (r211 == 0) goto L_0x0379
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r211.BTY()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0379
            java.lang.String r216 = X.AnonymousClass3ZN.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x037b
        L_0x0376:
            r211 = 0
            goto L_0x0367
        L_0x0379:
            r216 = r59
        L_0x037b:
            if (r188 == 0) goto L_0x0392
            r0 = r248
            boolean r0 = r2.A0G(r0, r6)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0392
            r218 = 1
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.A0v     // Catch:{ all -> 0x26ee }
            r207 = 1
            if (r0 != 0) goto L_0x0396
            goto L_0x0394
        L_0x0392:
            r218 = 0
        L_0x0394:
            r207 = 0
        L_0x0396:
            android.content.Context r4 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x040b
            r0 = r248
            X.1Xj r1 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x040b
            r0 = r112
            int r3 = r0.A03     // Catch:{ all -> 0x26ee }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0409
            boolean r0 = r0.A2Q()     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x26ee }
        L_0x03b8:
            boolean r160 = X.AnonymousClass3ZC.A04(r4, r6, r1, r0, r3)     // Catch:{ all -> 0x26ee }
        L_0x03bc:
            X.0Tu r104 = X.C51965G9l.A0Z(r6, r11)     // Catch:{ all -> 0x26ee }
            r3 = 36315769555324426(0x81050000170e0a, double:3.0295771264292245E-306)
            r0 = r104
            boolean r44 = X.182.A06(r0, r6, r3)     // Catch:{ all -> 0x26ee }
            X.0Tu r13 = X.0Tu.A05     // Catch:{ all -> 0x26ee }
            r0 = 36315769555258889(0x81050000160e09, double:3.0295771263877787E-306)
            boolean r153 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r3 = 36315769555389963(0x81050000180e0b, double:3.0295771264706704E-306)
            r0 = r104
            boolean r57 = X.182.A06(r0, r6, r3)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            r16 = 0
            if (r0 == 0) goto L_0x0402
            X.GJ5 r1 = X.GJ5.AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 == r1) goto L_0x03f3
            X.GJ5 r1 = X.GJ5.REMINDER_AD     // Catch:{ all -> 0x26ee }
            if (r0 != r1) goto L_0x0402
        L_0x03f3:
            r1 = r248
            r0 = r245
            long r1 = r2.A0C(r1, r0, r6)     // Catch:{ all -> 0x26ee }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r149 = 1
            if (r0 > 0) goto L_0x0410
            goto L_0x040e
        L_0x0402:
            X.GJ5 r1 = X.GJ5.OVERLAY_AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 != r1) goto L_0x040e
            goto L_0x03f3
        L_0x0409:
            r0 = 0
            goto L_0x03b8
        L_0x040b:
            r160 = 0
            goto L_0x03bc
        L_0x040e:
            r149 = 0
        L_0x0410:
            boolean r2 = r248.CcK()     // Catch:{ all -> 0x26ee }
            X.GJ5 r1 = X.GJ5.CREATOR_INSIGHTS_SELF_VIEW_TIP     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 != r1) goto L_0x0422
            boolean r0 = X.AnonymousClass3YR.A02(r6)     // Catch:{ all -> 0x26ee }
            r155 = 1
            if (r0 != 0) goto L_0x0424
        L_0x0422:
            r155 = 0
        L_0x0424:
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0447
            boolean r0 = r248.A0H()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x043c
            r0 = 36318561282758937(0x81078a00031919, double:3.0313426261001934E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x043c
            goto L_0x0447
        L_0x043c:
            r0 = 36318561282562326(0x81078a00001916, double:3.031342625975856E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0451
        L_0x0447:
            if (r155 != 0) goto L_0x0451
            X.GJ5 r1 = X.GJ5.CREATOR_DIGEST_SIGNAL     // Catch:{ all -> 0x26ee }
            r147 = 0
            r0 = r107
            if (r0 != r1) goto L_0x0453
        L_0x0451:
            r147 = 1
        L_0x0453:
            r148 = 0
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0476
            boolean r0 = r248.A0H()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x046d
            r0 = 36318561282758937(0x81078a00031919, double:3.0313426261001934E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x046d
            goto L_0x0476
        L_0x046d:
            r0 = 36318561282627863(0x81078a00011917, double:3.0313426260173017E-306)
            boolean r148 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
        L_0x0476:
            if (r2 == 0) goto L_0x047e
            if (r147 != 0) goto L_0x047e
            r146 = 1
            if (r148 == 0) goto L_0x0486
        L_0x047e:
            r146 = 0
            if (r147 != 0) goto L_0x0486
            r194 = 0
            if (r148 == 0) goto L_0x0488
        L_0x0486:
            r194 = 1
        L_0x0488:
            r1 = 36315563396042113(0x8104d0000a0d81, double:3.029446750468953E-306)
            r0 = r104
            boolean r204 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36315563396107650(0x8104d0000b0d82, double:3.029446750510399E-306)
            boolean r220 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36315563396238724(0x8104d0000d0d84, double:3.0294467505932906E-306)
            boolean r206 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36315563396566408(0x8104d000120d88, double:3.029446750800519E-306)
            boolean r97 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r0 = 36317543378130223(0x81069d002b152f, double:3.030698899114222E-306)
            boolean r231 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36317543378195760(0x81069d002c1530, double:3.0306988991556676E-306)
            boolean r232 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r1 = 36317543378523445(0x81069d00311535, double:3.030698899362897E-306)
            r0 = r104
            boolean r233 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36317543378588982(0x81069d00321536, double:3.030698899404343E-306)
            boolean r234 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            X.GJ5 r92 = X.GJ5.OVERLAY_AD     // Catch:{ all -> 0x26ee }
            r1 = r92
            r0 = r107
            if (r0 != r1) goto L_0x04fc
            X.3OA r0 = r248.A07()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x04fc
            boolean r1 = X.GCI.A00(r6)     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x04fc
            X.4gF r0 = r0.A0F     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x04fc
            java.lang.Boolean r0 = r0.A07     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x04fc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r109)     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x26ee }
            r198 = 1
            if (r0 != 0) goto L_0x04fe
        L_0x04fc:
            r198 = 0
        L_0x04fe:
            r0 = 36321752443659957(0x810a71000626b5, double:3.033360729103772E-306)
            boolean r161 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r1 = 36321752443725494(0x810a71000726b6, double:3.033360729145218E-306)
            r0 = r104
            boolean r162 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36321752443791031(0x810a71000826b7, double:3.033360729186664E-306)
            boolean r163 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r1 = 36321752443528883(0x810a71000426b3, double:3.03336072902088E-306)
            boolean r164 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r0 = 36321752443856568(0x810a71000926b8, double:3.0333607292281096E-306)
            boolean r165 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36321752443594420(0x810a71000526b4, double:3.033360729062326E-306)
            boolean r166 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r1 = r67
            r0 = r112
            X.2Wa r90 = X.C58703IwC.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            X.GFk r0 = X.C52116GFk.A00     // Catch:{ all -> 0x26ee }
            X.2Wa r89 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.GFl r0 = new X.GFl     // Catch:{ all -> 0x26ee }
            r35 = r0
            r36 = r89
            r37 = r12
            r38 = r90
            r39 = r109
            r40 = r97
            r41 = r188
            r42 = r206
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x26ee }
            java.lang.Object r30 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r30
            X.2xU r0 = (X.AnonymousClass2xU) r0     // Catch:{ all -> 0x26ee }
            r30 = r0
            r0 = r46
            X.2V5 r0 = r0.A0A     // Catch:{ all -> 0x26ee }
            r243 = r0
            r69 = 27
            r1 = r0
            r0 = r69
            X.Iw1 r0 = X.C58692Iw1.A00(r1, r12, r0)     // Catch:{ all -> 0x26ee }
            X.2Wa r63 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            r1 = r65
            r0 = r243
            X.Iw1 r0 = X.C58692Iw1.A00(r0, r12, r1)     // Catch:{ all -> 0x26ee }
            X.2Wa r103 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            r0 = r248
            boolean r60 = X.C52119GFn.A00(r0, r6, r15)     // Catch:{ all -> 0x26ee }
            r3 = 39
            X.GL3 r2 = new X.GL3     // Catch:{ all -> 0x26ee }
            r1 = r103
            r0 = r60
            r2.<init>(r3, r1, r12, r0)     // Catch:{ all -> 0x26ee }
            X.2Wa r225 = X.C243643Zq.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            X.IoA r5 = new X.IoA     // Catch:{ all -> 0x26ee }
            r35 = r5
            r36 = r105
            r37 = r112
            r38 = r1
            r39 = r10
            r40 = r0
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x26ee }
            r0 = 7
            X.2Wa r99 = X.C58703IwC.A00(r10, r5, r0)     // Catch:{ all -> 0x26ee }
            r2 = 57
            r1 = 41
            r0 = r112
            X.J6P r1 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            X.2Wa r1 = X.C243753a2.A01(r10, r0, r1, r2, r11)     // Catch:{ all -> 0x26ee }
            r3 = 66
            X.GFo r2 = X.C52120GFo.A00     // Catch:{ all -> 0x26ee }
            X.2V5 r208 = X.C243753a2.A00(r10, r0, r2, r3, r11)     // Catch:{ all -> 0x26ee }
            r0 = r25
            X.2Wa r4 = X.C58703IwC.A00(r10, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object r3 = r1.A03     // Catch:{ all -> 0x26ee }
            boolean r58 = X.AnonymousClass7TE.A1a(r3)     // Catch:{ all -> 0x26ee }
            boolean r2 = X.C51969G9p.A1V(r4)     // Catch:{ all -> 0x26ee }
            r169 = 0
            r0 = r58
            if (r0 == r2) goto L_0x05dd
            r169 = 1
        L_0x05dd:
            r4.A01(r3)     // Catch:{ all -> 0x26ee }
            boolean r190 = X.C51969G9p.A1V(r7)     // Catch:{ all -> 0x26ee }
            if (r190 == 0) goto L_0x05ef
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3y6 r0 = r0.A0E     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x05f5
            goto L_0x05fd
        L_0x05ef:
            r0 = r173
            boolean r0 = r0.A0G     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x05fd
        L_0x05f5:
            r0 = r173
            boolean r0 = r0.A0B     // Catch:{ all -> 0x26ee }
            r170 = 0
            if (r0 == 0) goto L_0x05ff
        L_0x05fd:
            r170 = 1
        L_0x05ff:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x26ee }
            r91 = 4
            X.GL6 r0 = new X.GL6     // Catch:{ all -> 0x26ee }
            r222 = r0
            r223 = r91
            r224 = r5
            r226 = r99
            r227 = r103
            r228 = r12
            r229 = r60
            r222.<init>(r223, r224, r225, r226, r227, r228, r229)     // Catch:{ all -> 0x26ee }
            java.lang.Object r8 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            X.2xU r8 = (X.AnonymousClass2xU) r8     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.GFq r0 = new X.GFq     // Catch:{ all -> 0x26ee }
            r221 = r0
            r222 = r243
            r223 = r63
            r224 = r103
            r227 = r12
            r228 = r5
            r221.<init>(r222, r223, r224, r225, r226, r227, r228, r229)     // Catch:{ all -> 0x26ee }
            java.lang.Object r7 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            X.2xU r7 = (X.AnonymousClass2xU) r7     // Catch:{ all -> 0x26ee }
            r0 = r111
            X.1Xy r0 = r0.A0C     // Catch:{ all -> 0x26ee }
            X.DU9 r1 = r0.Bl9()     // Catch:{ all -> 0x26ee }
            r0 = r248
            boolean r241 = X.C52124GFs.A01(r1, r0, r6)     // Catch:{ all -> 0x26ee }
            r0 = r111
            X.1Xy r0 = r0.A0C     // Catch:{ all -> 0x26ee }
            X.DU9 r0 = r0.Bl9()     // Catch:{ all -> 0x26ee }
            r201 = 1
            if (r0 == 0) goto L_0x06be
            boolean r1 = r0.CSO()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x06be
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06be
            boolean r0 = r248.A0E()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x06be
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06be
            boolean r0 = r0.A5H()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x06be
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x069b
            boolean r1 = r0.CeS()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x069b
        L_0x067f:
            r1 = 36325119697760881(0x810d8100023271, double:3.03549019415604E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06be
        L_0x068c:
            r0 = r248
            com.instagram.user.model.User r0 = r0.A08(r6)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06c5
            X.1OP r1 = X.1OP.$redex_init_class     // Catch:{ all -> 0x26ee }
            com.instagram.model.reels.Reel r0 = X.AnonymousClass3PQ.A02(r6, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x06c1
        L_0x069b:
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06be
            boolean r1 = r0.A5p()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x06be
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3y4 r0 = r0.A0I     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06b7
            X.XB5 r0 = r0.BUi()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x067f
        L_0x06b7:
            boolean r0 = X.C51968G9o.A1V(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x06be
            goto L_0x067f
        L_0x06be:
            r201 = 0
            goto L_0x068c
        L_0x06c1:
            r154 = 1
            if (r0 != 0) goto L_0x06c7
        L_0x06c5:
            r154 = 0
        L_0x06c7:
            r0 = r111
            boolean r240 = X.C282845Ez.A02(r6, r0)     // Catch:{ all -> 0x26ee }
            r96 = 3
            X.JTB r0 = r12.A0H     // Catch:{ all -> 0x26ee }
            r229 = r0
            java.lang.Boolean r118 = java.lang.Boolean.valueOf(r240)     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r120 = java.lang.Boolean.valueOf(r241)     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r121 = java.lang.Boolean.valueOf(r201)     // Catch:{ all -> 0x26ee }
            X.JPD r0 = r12.A03     // Catch:{ all -> 0x26ee }
            r137 = r0
            r113 = r6
            r114 = r107
            r115 = r248
            r116 = r245
            r117 = r229
            r119 = r111
            r122 = r0
            java.lang.Object[] r1 = new java.lang.Object[]{r113, r114, r115, r116, r117, r118, r119, r120, r121, r122}     // Catch:{ all -> 0x26ee }
            X.GFl r0 = new X.GFl     // Catch:{ all -> 0x26ee }
            r235 = r0
            r236 = r10
            r237 = r12
            r238 = r111
            r239 = r11
            r242 = r201
            r235.<init>(r236, r237, r238, r239, r240, r241, r242)     // Catch:{ all -> 0x26ee }
            java.lang.Object r31 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r31
            X.GPZ r0 = (X.GPZ) r0     // Catch:{ all -> 0x26ee }
            r31 = r0
            r0 = 36321301472027890(0x810a08000524f2, double:3.033075532827736E-306)
            boolean r27 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36321301472683254(0x810a08000f24f6, double:3.0330755332421906E-306)
            boolean r9 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.GFt r2 = new X.GFt     // Catch:{ all -> 0x26ee }
            r1 = r96
            r0 = r27
            r2.<init>(r12, r1, r0, r9)     // Catch:{ all -> 0x26ee }
            X.2Wa r62 = X.C243643Zq.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            r48 = 6
            r0 = r48
            X.2Wa r29 = X.C58703IwC.A00(r10, r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r1 = 26
            r0 = r62
            X.Iw1 r0 = X.C58692Iw1.A00(r0, r12, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object r3 = X.AnonymousClass3Zw.A00(r10, r0, r2)     // Catch:{ all -> 0x26ee }
            X.1wn r3 = (X.1wn) r3     // Catch:{ all -> 0x26ee }
            r0 = r111
            boolean r24 = X.GED.A03(r6, r0)     // Catch:{ all -> 0x26ee }
            if (r24 == 0) goto L_0x075f
            r1 = 36321584941704759(0x810a4a00212637, double:3.0332548001928285E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x075f
            r2 = 1
            if (r149 != 0) goto L_0x0760
        L_0x075f:
            r2 = 0
        L_0x0760:
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r4 = 38
            X.GL3 r1 = new X.GL3     // Catch:{ all -> 0x26ee }
            r0 = r111
            r1.<init>(r4, r0, r12, r2)     // Catch:{ all -> 0x26ee }
            java.lang.Object r1 = X.AnonymousClass3Zw.A00(r10, r1, r5)     // Catch:{ all -> 0x26ee }
            X.2xU r1 = (X.AnonymousClass2xU) r1     // Catch:{ all -> 0x26ee }
            if (r218 == 0) goto L_0x079f
            r4 = 36315155374345261(0x810471000d0c2d, double:3.029188715904892E-306)
            boolean r0 = X.182.A06(r13, r6, r4)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x079f
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3mJ r0 = r0.A0L     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x079f
            X.HbA r2 = X.C55039HbA.$redex_init_class     // Catch:{ all -> 0x26ee }
            int r2 = r0.ordinal()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r2 != r0) goto L_0x079f
            X.Uy6 r0 = X.C16610Uy6.A0A     // Catch:{ all -> 0x26ee }
            X.59A r5 = X.AnonymousClass59A.A00     // Catch:{ all -> 0x26ee }
            java.lang.String r4 = r248.getId()     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "lead_ads_reels_first_question"
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x26ee }
            r5.A09(r4, r2, r0)     // Catch:{ all -> 0x26ee }
        L_0x079f:
            java.lang.Object[] r2 = X.C51970G9q.A1b()     // Catch:{ all -> 0x26ee }
            X.GFv r0 = new X.GFv     // Catch:{ all -> 0x26ee }
            r113 = r0
            r114 = r3
            r115 = r19
            r116 = r30
            r117 = r23
            r118 = r20
            r119 = r1
            r120 = r18
            r121 = r8
            r122 = r7
            r123 = r22
            r124 = r21
            r125 = r112
            r126 = r12
            r127 = r109
            r128 = r27
            r113.<init>(r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128)     // Catch:{ all -> 0x26ee }
            X.C243773a4.A00(r10, r0, r2)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.GKL r2 = new X.GKL     // Catch:{ all -> 0x26ee }
            r1 = r96
            r0 = r24
            r2.<init>(r1, r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object r41 = X.AnonymousClass3Zw.A00(r10, r2, r3)     // Catch:{ all -> 0x26ee }
            r0 = r41
            X.S6e r0 = (X.S6e) r0     // Catch:{ all -> 0x26ee }
            r41 = r0
            java.lang.Object[] r1 = new java.lang.Object[]{r248}     // Catch:{ all -> 0x26ee }
            r87 = 11
            r0 = r87
            java.lang.Object r0 = X.C58703IwC.A01(r10, r12, r1, r0)     // Catch:{ all -> 0x26ee }
            boolean r36 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = r248.getId()     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.GFw r0 = X.C52128GFw.A00     // Catch:{ all -> 0x26ee }
            java.lang.Object r27 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r27
            X.TpD r0 = (X.C14065TpD) r0     // Catch:{ all -> 0x26ee }
            r27 = r0
            r42 = 36326597166380907(0x810ed90000376b, double:3.0364245512606333E-306)
            r0 = r42
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x083c
            android.content.Context r5 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            X.2xi r4 = r12.A0G     // Catch:{ all -> 0x26ee }
            X.HnW r3 = new X.HnW     // Catch:{ all -> 0x26ee }
            r0 = r243
            r3.<init>(r10, r0, r12, r2)     // Catch:{ all -> 0x26ee }
            r0 = r96
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0837
            r0 = r42
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0837
            X.HnY r19 = new X.HnY     // Catch:{ all -> 0x26ee }
            r0 = r19
            r0.<init>(r5, r4, r3)     // Catch:{ all -> 0x26ee }
            goto L_0x0839
        L_0x0837:
            r19 = 0
        L_0x0839:
            r55 = 2
            goto L_0x0840
        L_0x083c:
            r55 = 2
            r19 = 0
        L_0x0840:
            X.3OA r3 = r248.A07()     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r4 = new java.lang.Object[]{r3, r2}     // Catch:{ all -> 0x26ee }
            r0 = r42
            boolean r1 = X.C51965G9l.A1a(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.IoB r0 = new X.IoB     // Catch:{ all -> 0x26ee }
            r70 = r0
            r72 = r10
            r73 = r12
            r74 = r19
            r75 = r27
            r70.<init>(r71, r72, r73, r74, r75)     // Catch:{ all -> 0x26ee }
            java.lang.Object r45 = A06(r10, r0, r4, r1)     // Catch:{ all -> 0x26ee }
            r0 = r45
            X.GFx r0 = (X.C52129GFx) r0     // Catch:{ all -> 0x26ee }
            r45 = r0
            java.lang.Object[] r4 = new java.lang.Object[]{r3, r2}     // Catch:{ all -> 0x26ee }
            r0 = r42
            boolean r3 = X.C51965G9l.A1a(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.Iny r2 = new X.Iny     // Catch:{ all -> 0x26ee }
            r1 = r25
            r0 = r19
            r2.<init>(r1, r0, r12, r10)     // Catch:{ all -> 0x26ee }
            java.lang.Object r18 = A06(r10, r2, r4, r3)     // Catch:{ all -> 0x26ee }
            r0 = r18
            X.HKh r0 = (X.C54598HKh) r0     // Catch:{ all -> 0x26ee }
            r18 = r0
            X.JP2 r0 = r12.A0I     // Catch:{ all -> 0x26ee }
            r30 = r0
            if (r0 == 0) goto L_0x08a8
            android.util.Size r0 = r30.BJW()     // Catch:{ all -> 0x26ee }
            int r20 = r0.getWidth()     // Catch:{ all -> 0x26ee }
        L_0x0892:
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            long r0 = X.C244013aV.A0C(r10, r0)     // Catch:{ all -> 0x26ee }
            int r0 = X.C51969G9p.A07(r10, r0)     // Catch:{ all -> 0x26ee }
            int r20 = r20 - r0
            long r0 = X.C244013aV.A0A(r10)     // Catch:{ all -> 0x26ee }
            int r0 = X.C51969G9p.A07(r10, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x08b1
        L_0x08a8:
            android.content.Context r0 = X.C51967G9n.A09(r10)     // Catch:{ all -> 0x26ee }
            int r20 = X.AnonymousClass0nB.A01(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x0892
        L_0x08b1:
            int r20 = r20 - r0
            if (r30 == 0) goto L_0x08be
            android.util.Size r0 = r30.BJW()     // Catch:{ all -> 0x26ee }
            int r1 = r0.getHeight()     // Catch:{ all -> 0x26ee }
            goto L_0x08d4
        L_0x08be:
            android.content.Context r2 = X.C51967G9n.A09(r10)     // Catch:{ all -> 0x26ee }
            int r1 = X.0nA.A05(r2)     // Catch:{ all -> 0x26ee }
            android.app.Activity r0 = X.C61270mF.A00(r2)     // Catch:{ all -> 0x26ee }
            int r0 = X.0Pn.A00(r0)     // Catch:{ all -> 0x26ee }
            int r1 = r1 - r0
            int r0 = X.0nA.A0A(r2)     // Catch:{ all -> 0x26ee }
            int r1 = r1 - r0
        L_0x08d4:
            X.2V1 r0 = r10.A05     // Catch:{ all -> 0x26ee }
            r224 = r0
            android.content.Context r86 = X.C51965G9l.A0B(r224)     // Catch:{ all -> 0x26ee }
            float r0 = (float) r1     // Catch:{ all -> 0x26ee }
            r38 = r0
            android.content.res.Resources r0 = r86.getResources()     // Catch:{ all -> 0x26ee }
            r0.getDisplayMetrics()     // Catch:{ all -> 0x26ee }
            r0 = 1000(0x3e8, float:1.401E-42)
            X.3Zd r1 = X.2Vi.A04     // Catch:{ all -> 0x26ee }
            X.4Ex r3 = new X.4Ex     // Catch:{ all -> 0x26ee }
            r3.<init>(r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r56 = "end_scene_background"
            X.3Zd r2 = X.2Vi.A04     // Catch:{ all -> 0x26ee }
            r0 = r56
            X.4Ey r1 = X.2Vi.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            X.3du r66 = X.C246033ds.A00     // Catch:{ all -> 0x26ee }
            r0 = r66
            float r84 = X.C51970G9q.A03(r1, r0)     // Catch:{ all -> 0x26ee }
            r1.A02 = r3     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r1)     // Catch:{ all -> 0x26ee }
            java.lang.String r37 = "trans_key_expanded_caption_dimmer_background"
            r0 = r37
            X.4Ey r1 = X.2Vi.A00(r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r66
            r1.A03(r0)     // Catch:{ all -> 0x26ee }
            r0 = r84
            r1.A01(r0)     // Catch:{ all -> 0x26ee }
            r3 = 300(0x12c, float:4.2E-43)
            X.C51966G9m.A1M(r1, r3)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r1)     // Catch:{ all -> 0x26ee }
            r25 = r9 ^ 1
            r70 = 1065353216(0x3f800000, float:1.0)
            if (r25 == 0) goto L_0x094a
            java.lang.String r0 = "overlay_gradient_scene_background_fade_in"
            X.4Ey r1 = X.2Vi.A00(r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r66
            r1.A03(r0)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.C51969G9p.A1V(r29)     // Catch:{ all -> 0x26ee }
            float r0 = X.C51970G9q.A01(r0)
            r1.A01(r0)     // Catch:{ all -> 0x26ee }
            r4 = 36602776449454847(0x820a08001012ff, double:3.2110814419613035E-306)
            int r0 = X.DbS.A04(r13, r6, r4)     // Catch:{ all -> 0x26ee }
            if (r0 > 0) goto L_0x096c
            r0 = 100
            goto L_0x096c
        L_0x094a:
            java.lang.String r0 = "overlay_gradient_scene_background_fade_out"
            X.4Ey r1 = X.2Vi.A00(r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r66
            r1.A03(r0)     // Catch:{ all -> 0x26ee }
            r0 = r70
            r1.A01(r0)     // Catch:{ all -> 0x26ee }
            r0 = r84
            r1.A02(r0)     // Catch:{ all -> 0x26ee }
            r4 = 36602776449520384(0x820a0800111300, double:3.2110814420027494E-306)
            int r0 = X.DbS.A04(r13, r6, r4)     // Catch:{ all -> 0x26ee }
            if (r0 > 0) goto L_0x096c
            r0 = 100
        L_0x096c:
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator     // Catch:{ all -> 0x26ee }
            r4.<init>()     // Catch:{ all -> 0x26ee }
            X.4Ex r2 = new X.4Ex     // Catch:{ all -> 0x26ee }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x26ee }
            r1.A02 = r2     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r1)     // Catch:{ all -> 0x26ee }
            X.3Zd r81 = X.C243533Zd.GLOBAL     // Catch:{ all -> 0x26ee }
            java.lang.String r76 = "trans_key_media_info"
            r1 = r81
            r0 = r76
            X.4Ey r0 = X.2Vi.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            X.3du r4 = X.C246033ds.A01     // Catch:{ all -> 0x26ee }
            r0.A03(r4)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r93 = "trans_key_scrubber"
            r0 = r93
            X.4Ey r2 = X.2Vi.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r84
            X.C51970G9q.A1H(r2, r4, r0)     // Catch:{ all -> 0x26ee }
            r1 = r0
            r0 = r66
            X.C51970G9q.A1H(r2, r0, r1)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            java.lang.String r49 = "trans_key_ufi"
            r1 = r81
            r0 = r49
            X.4Ey r0 = X.2Vi.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            if (r169 == 0) goto L_0x09b3
            r3 = 150(0x96, float:2.1E-43)
        L_0x09b3:
            X.C51966G9m.A1M(r0, r3)     // Catch:{ all -> 0x26ee }
            X.3du r4 = X.C246033ds.A05     // Catch:{ all -> 0x26ee }
            r0.A03(r4)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r80 = "trans_key_ufi_x_and_browse"
            r0 = r80
            X.4Ey r2 = X.2Vi.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            r3 = 300(0x12c, float:4.2E-43)
            X.C51966G9m.A1M(r2, r3)     // Catch:{ all -> 0x26ee }
            r1 = r84
            r0 = r66
            X.C51970G9q.A1H(r2, r0, r1)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "trans_key_full_width_footer_fade"
            r0 = r81
            X.4Ey r2 = X.2Vi.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            X.C51966G9m.A1M(r2, r3)     // Catch:{ all -> 0x26ee }
            r1 = r84
            r0 = r66
            X.C51970G9q.A1H(r2, r0, r1)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "trans_key_full_width_footer"
            r0 = r81
            X.4Ey r0 = X.2Vi.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            r1 = 150(0x96, float:2.1E-43)
            X.C51966G9m.A1M(r0, r1)     // Catch:{ all -> 0x26ee }
            r0.A03(r4)     // Catch:{ all -> 0x26ee }
            X.AnonymousClass4F7.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            boolean r145 = X.C51969G9p.A1V(r90)     // Catch:{ all -> 0x26ee }
            if (r145 == 0) goto L_0x0a83
            java.lang.String r144 = "trans_key_author_info"
        L_0x0a05:
            X.GFy r0 = X.C52130GFy.A00     // Catch:{ all -> 0x26ee }
            X.2Wa r1 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            r0 = 40
            X.J6P r0 = X.J6P.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            X.0sP r126 = X.AnonymousClass3j0.A01(r10, r0)     // Catch:{ all -> 0x26ee }
            boolean r157 = X.C51969G9p.A1V(r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.GFz r0 = X.C52131GFz.A00     // Catch:{ all -> 0x26ee }
            java.lang.Object r22 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r22
            X.Hjr r0 = (X.C55571Hjr) r0     // Catch:{ all -> 0x26ee }
            r22 = r0
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            X.IwA r0 = new X.IwA     // Catch:{ all -> 0x26ee }
            r113 = r0
            r114 = r26
            r115 = r22
            r116 = r41
            r117 = r31
            r118 = r10
            r119 = r112
            r120 = r107
            r121 = r12
            r113.<init>(r114, r115, r116, r117, r118, r119, r120, r121)     // Catch:{ all -> 0x26ee }
            java.lang.Object r29 = X.AnonymousClass3Zw.A00(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r29
            X.GG0 r0 = (X.GG0) r0     // Catch:{ all -> 0x26ee }
            r29 = r0
            X.GED r79 = X.GED.A00     // Catch:{ all -> 0x26ee }
            r1 = 36603059916575592(0x820a4a00051368, double:3.211260707709893E-306)
            r0 = r104
            long r0 = X.182.A01(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0a81
            boolean r7 = X.C51969G9p.A1V(r28)     // Catch:{ all -> 0x26ee }
        L_0x0a5f:
            r83 = 23
            X.IwC r1 = new X.IwC     // Catch:{ all -> 0x26ee }
            r0 = r83
            r1.<init>(r12, r0)     // Catch:{ all -> 0x26ee }
            X.0sa r125 = X.AnonymousClass3j0.A00(r10, r1)     // Catch:{ all -> 0x26ee }
            X.GG1 r0 = X.GG1.A00     // Catch:{ all -> 0x26ee }
            X.2Wa r53 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            X.GG2 r0 = X.GG2.A00     // Catch:{ all -> 0x26ee }
            X.2Wa r115 = X.C243643Zq.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            X.GG3 r0 = X.GG3.A00     // Catch:{ all -> 0x26ee }
            X.3Zt r113 = X.C243633Zp.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            if (r33 == 0) goto L_0x0bd1
            goto L_0x0a8b
        L_0x0a81:
            r7 = 1
            goto L_0x0a5f
        L_0x0a83:
            r144 = 0
            if (r188 == 0) goto L_0x0a05
            r144 = r76
            goto L_0x0a05
        L_0x0a8b:
            if (r14 == 0) goto L_0x0a9a
            r1 = 36328053160360866(0x81102c00013ba2, double:3.0373453277163766E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0bd1
        L_0x0a9a:
            android.content.Context r0 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            boolean r4 = X.C247163fs.A00(r0)     // Catch:{ all -> 0x26ee }
            if (r4 != 0) goto L_0x0b16
            java.lang.String r2 = r246.getModuleName()     // Catch:{ all -> 0x26ee }
            r0 = r55
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r33
            java.lang.Integer r0 = r0.A02     // Catch:{ all -> 0x26ee }
            int r1 = r0.intValue()     // Catch:{ all -> 0x26ee }
            if (r1 == r11) goto L_0x0af7
            r0 = r109
            if (r1 != r0) goto L_0x0af2
            java.lang.Integer r0 = X.GMK.A01(r33)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0ac8
            int r0 = r0.intValue()     // Catch:{ all -> 0x26ee }
            if (r0 != r11) goto L_0x0ac8
            goto L_0x0b16
        L_0x0ac8:
            r0 = r33
            X.4Jg r1 = r0.A01     // Catch:{ all -> 0x26ee }
            boolean r3 = r1 instanceof X.AnonymousClass4Jf     // Catch:{ all -> 0x26ee }
            r0 = 0
            if (r3 == 0) goto L_0x0adf
            X.4Jf r1 = (X.AnonymousClass4Jf) r1     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x0adf
            java.util.List r1 = r1.A00     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x0adf
            java.lang.Object r0 = X.00k.A0J(r1)     // Catch:{ all -> 0x26ee }
            X.4Ji r0 = (X.AnonymousClass4Ji) r0     // Catch:{ all -> 0x26ee }
        L_0x0adf:
            boolean r1 = r0 instanceof com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x0b16
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r0 = (com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState) r0     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0b16
            com.instagram.api.schemas.SocialContextType r3 = r0.A02     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.SocialContextType r1 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY     // Catch:{ all -> 0x26ee }
            if (r3 != r1) goto L_0x0b13
            java.lang.Integer r1 = X.C52306GMw.A00(r6, r0, r2)     // Catch:{ all -> 0x26ee }
            goto L_0x0b0f
        L_0x0af2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x26ee }
            goto L_0x0b35
        L_0x0af7:
            r0 = r33
            boolean r0 = r0.A09     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0b03
            r0 = 36320652932227788(0x810971000922cc, double:3.032665393646691E-306)
            goto L_0x0b08
        L_0x0b03:
            r0 = 36320652932096714(0x810971000722ca, double:3.0326653935637994E-306)
        L_0x0b08:
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0b16
            goto L_0x0b13
        L_0x0b0f:
            r0 = r110
            if (r1 != r0) goto L_0x0b16
        L_0x0b13:
            r129 = 1
            goto L_0x0b1a
        L_0x0b16:
            r129 = 0
            if (r4 != 0) goto L_0x0b50
        L_0x0b1a:
            r0 = r33
            java.lang.Integer r0 = r0.A02     // Catch:{ all -> 0x26ee }
            int r1 = r0.intValue()     // Catch:{ all -> 0x26ee }
            if (r1 == r11) goto L_0x0b36
            r0 = r109
            if (r1 != r0) goto L_0x0b31
            java.lang.Integer r1 = X.GMK.A01(r33)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x26ee }
            if (r1 != r0) goto L_0x0b50
            goto L_0x0b4d
        L_0x0b31:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x26ee }
        L_0x0b35:
            throw r0     // Catch:{ all -> 0x26ee }
        L_0x0b36:
            r0 = r33
            boolean r0 = r0.A09     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0b42
            r0 = 36320652932162251(0x810971000822cb, double:3.032665393605245E-306)
            goto L_0x0b47
        L_0x0b42:
            r0 = 36320652932031177(0x810971000622c9, double:3.0326653935223535E-306)
        L_0x0b47:
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0b50
        L_0x0b4d:
            r128 = 1
            goto L_0x0b52
        L_0x0b50:
            r128 = 0
        L_0x0b52:
            boolean r0 = X.GMK.A04(r33)     // Catch:{ all -> 0x26ee }
            r2 = r0 ^ 1
            r0 = r33
            java.lang.Integer r1 = r0.A02     // Catch:{ all -> 0x26ee }
            r3 = 0
            r0 = r110
            if (r1 == r0) goto L_0x0b6f
            r0 = r33
            java.lang.Integer r1 = r0.A04     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x26ee }
            if (r1 != r0) goto L_0x0b6c
            if (r2 == 0) goto L_0x0b6f
            goto L_0x0b85
        L_0x0b6c:
            if (r2 == 0) goto L_0x0b6f
            goto L_0x0b78
        L_0x0b6f:
            X.3XV r0 = X.2WX.A02     // Catch:{ all -> 0x26ee }
            long r0 = X.C244013aV.A03(r10)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A0A     // Catch:{ all -> 0x26ee }
            goto L_0x0b80
        L_0x0b78:
            X.3XV r0 = X.2WX.A02     // Catch:{ all -> 0x26ee }
            long r0 = X.C51970G9q.A0E()     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A08     // Catch:{ all -> 0x26ee }
        L_0x0b80:
            X.9JR r0 = X.C51965G9l.A0c(r2, r11, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x0b9b
        L_0x0b85:
            X.3XV r0 = X.2WX.A02     // Catch:{ all -> 0x26ee }
            long r0 = X.C51970G9q.A0I()     // Catch:{ all -> 0x26ee }
            long r4 = X.C51969G9p.A0B()     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A08     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.AnonymousClass9JR.A00(r15, r2, r11, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A0A     // Catch:{ all -> 0x26ee }
            X.9JR r0 = X.C51965G9l.A0c(r0, r11, r4)     // Catch:{ all -> 0x26ee }
        L_0x0b9b:
            X.2WX r116 = X.C51965G9l.A0X(r3, r0)     // Catch:{ all -> 0x26ee }
            X.33B r120 = r229.Aqg()     // Catch:{ all -> 0x26ee }
            X.GML r3 = new X.GML     // Catch:{ all -> 0x26ee }
            r2 = r248
            r1 = r245
            r0 = r229
            r3.<init>(r2, r1, r6, r0)     // Catch:{ all -> 0x26ee }
            r114 = r53
            r117 = r6
            r118 = r15
            r119 = r33
            r121 = r3
            r122 = r246
            r123 = r112
            r124 = r15
            r127 = r11
            r130 = r109
            X.GMH r26 = X.GMI.A00(r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.GMK.A04(r33)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0bd3
            r117 = r26
            r26 = 0
            goto L_0x0bd5
        L_0x0bd1:
            r26 = 0
        L_0x0bd3:
            r117 = 0
        L_0x0bd5:
            r0 = r112
            boolean r0 = r0.A1p     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0c0e
            if (r24 == 0) goto L_0x0c0e
            r16 = 1
            if (r7 == 0) goto L_0x0c10
            r159 = 1
            r0 = r112
            boolean r0 = r0.A2z     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0c12
            r1 = 36321584940394027(0x810a4a000d262b, double:3.0332547993639163E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0c12
            r28 = 1
            r0 = r112
            boolean r0 = r0.A1r     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0c14
            r1 = 36321584941049393(0x810a4a00172631, double:3.0332547997783724E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r35 = 1
            if (r0 != 0) goto L_0x0c16
            goto L_0x0c14
        L_0x0c0e:
            r16 = 0
        L_0x0c10:
            r159 = 0
        L_0x0c12:
            r28 = 0
        L_0x0c14:
            r35 = 0
        L_0x0c16:
            X.3Zd r0 = X.GG4.A09     // Catch:{ all -> 0x26ee }
            boolean r167 = X.C51969G9p.A1V(r32)     // Catch:{ all -> 0x26ee }
            if (r167 == 0) goto L_0x0c26
            if (r145 != 0) goto L_0x0c26
            if (r165 != 0) goto L_0x0c26
            r230 = 1
            if (r166 == 0) goto L_0x0c28
        L_0x0c26:
            r230 = 0
        L_0x0c28:
            X.GG4 r85 = new X.GG4     // Catch:{ all -> 0x26ee }
            r226 = r85
            r227 = r248
            r228 = r112
            r226.<init>(r227, r228, r229, r230, r231, r232, r233, r234)     // Catch:{ all -> 0x26ee }
            X.3XV r82 = X.2WX.A02     // Catch:{ all -> 0x26ee }
            r0 = r54
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x26ee }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0c72
            float r1 = r0.floatValue()     // Catch:{ all -> 0x26ee }
        L_0x0c41:
            r0 = r82
            X.2WX r3 = X.C52112GFg.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            X.2V1 r5 = r10.Aqq()     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "trans_key_carousel_indicator"
            X.3Ze r1 = new X.3Ze     // Catch:{ all -> 0x26ee }
            r0 = r81
            r1.<init>(r5, r0, r2)     // Catch:{ all -> 0x26ee }
            r115 = 0
            X.2WX r4 = X.C51965G9l.A0X(r3, r1)     // Catch:{ all -> 0x26ee }
            boolean r0 = r46.A0D()     // Catch:{ all -> 0x26ee }
            r14 = 1090519040(0x41000000, float:8.0)
            if (r0 == 0) goto L_0x0ce4
            java.lang.String r1 = r46.A07()     // Catch:{ all -> 0x26ee }
            java.lang.String r0 = "under_hero"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x26ee }
            r2 = 1098907648(0x41800000, float:16.0)
            r9 = 0
            if (r0 == 0) goto L_0x0c7d
            goto L_0x0c75
        L_0x0c72:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0c41
        L_0x0c75:
            r9 = 1098907648(0x41800000, float:16.0)
            if (r154 == 0) goto L_0x0c7b
            r9 = 1092616192(0x41200000, float:10.0)
        L_0x0c7b:
            r14 = 0
            goto L_0x0c7e
        L_0x0c7d:
            r2 = 0
        L_0x0c7e:
            r0 = 36323169783131090(0x810bbb000a2bd2, double:3.0342570602924844E-306)
            boolean r123 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            long r0 = X.C51965G9l.A06(r2)     // Catch:{ all -> 0x26ee }
            long r7 = X.C51965G9l.A06(r14)     // Catch:{ all -> 0x26ee }
            long r2 = X.C51965G9l.A06(r9)     // Catch:{ all -> 0x26ee }
            X.2WX r1 = X.C51972G9s.A0R(r15, r11, r0)     // Catch:{ all -> 0x26ee }
            X.9JR r0 = X.C51967G9n.A0V(r7)     // Catch:{ all -> 0x26ee }
            X.2WX r2 = X.C51974G9v.A0E(r1, r0, r11, r2)     // Catch:{ all -> 0x26ee }
            if (r123 == 0) goto L_0x0caf
            long r0 = X.C244013aV.A03(r10)     // Catch:{ all -> 0x26ee }
            int r0 = X.C51969G9p.A07(r10, r0)     // Catch:{ all -> 0x26ee }
            int r0 = -r0
            long r0 = X.C51969G9p.A0G(r0)
            goto L_0x0cb3
        L_0x0caf:
            long r0 = X.C51969G9p.A0D()     // Catch:{ all -> 0x26ee }
        L_0x0cb3:
            X.2WX r3 = X.C51972G9s.A0S(r2, r11, r0)     // Catch:{ all -> 0x26ee }
            int r0 = r46.A01()     // Catch:{ all -> 0x26ee }
            float r0 = (float) r0     // Catch:{ all -> 0x26ee }
            float r0 = r0 + r9
            float r0 = r0 + r14
            long r0 = X.C51965G9l.A06(r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x26ee }
            X.2WX r0 = X.AnonymousClass9JR.A00(r3, r2, r11, r0)     // Catch:{ all -> 0x26ee }
            X.2WX r2 = r0.A00(r4)     // Catch:{ all -> 0x26ee }
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r5)     // Catch:{ all -> 0x26ee }
            X.Gab r0 = new X.Gab     // Catch:{ all -> 0x26ee }
            r118 = r0
            r119 = r6
            r120 = r246
            r121 = r229
            r122 = r46
            r118.<init>(r119, r120, r121, r122, r123)     // Catch:{ all -> 0x26ee }
            X.2Tp r115 = X.C51967G9n.A0Q(r0, r1, r10, r2)     // Catch:{ all -> 0x26ee }
            goto L_0x0d36
        L_0x0ce4:
            java.lang.String r0 = r46.A06()     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "dots"
            boolean r1 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x26ee }
            if (r1 != 0) goto L_0x0cf8
            java.lang.String r1 = "progress_dots"
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0d36
        L_0x0cf8:
            boolean r0 = X.C52076GDw.A03(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0d05
            r14 = 1094713344(0x41400000, float:12.0)
            if (r154 == 0) goto L_0x0d09
            r14 = 1086324736(0x40c00000, float:6.0)
            goto L_0x0d09
        L_0x0d05:
            if (r154 != 0) goto L_0x0d09
            r14 = 1096810496(0x41600000, float:14.0)
        L_0x0d09:
            long r0 = X.C51965G9l.A06(r14)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A05     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.AnonymousClass9JR.A00(r15, r2, r11, r0)     // Catch:{ all -> 0x26ee }
            X.3b9 r2 = X.C244413b9.RELATIVE     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x26ee }
            r0 = r96
            X.9JS r1 = X.C51965G9l.A0d(r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r0 = X.C51974G9v.A0K(r3, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2WX r3 = r0.A00(r4)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r5)     // Catch:{ all -> 0x26ee }
            X.GG5 r1 = new X.GG5     // Catch:{ all -> 0x26ee }
            r0 = r46
            r1.<init>(r0)     // Catch:{ all -> 0x26ee }
            X.2Tp r115 = X.C51967G9n.A0Q(r1, r2, r10, r3)     // Catch:{ all -> 0x26ee }
        L_0x0d36:
            X.GGn r3 = X.GJD.A00     // Catch:{ all -> 0x26ee }
            r0 = r244
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J     // Catch:{ all -> 0x26ee }
            r223 = r0
            r2 = r0
            r1 = r248
            r0 = r245
            boolean r39 = r3.A00(r2, r1, r0, r6)     // Catch:{ all -> 0x26ee }
            android.content.Context r1 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r0 = X.0mE.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0de0
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x26ee }
            r1.<init>(r0)     // Catch:{ all -> 0x26ee }
            java.lang.Class<X.GIc> r0 = X.C52186GIc.class
            X.2YL r1 = r1.A00(r0)     // Catch:{ all -> 0x26ee }
            X.GIc r1 = (X.C52186GIc) r1     // Catch:{ all -> 0x26ee }
        L_0x0d62:
            java.lang.Object[] r3 = new java.lang.Object[]{r248}     // Catch:{ all -> 0x26ee }
            X.Iny r2 = new X.Iny     // Catch:{ all -> 0x26ee }
            r0 = r98
            r2.<init>(r0, r10, r12, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Object r21 = X.AnonymousClass3Zw.A00(r10, r2, r3)     // Catch:{ all -> 0x26ee }
            r0 = r21
            X.HJx r0 = (X.C54588HJx) r0     // Catch:{ all -> 0x26ee }
            r21 = r0
            if (r0 == 0) goto L_0x0ddd
            long r0 = X.C51970G9q.A0E()     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A05     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.AnonymousClass9JR.A00(r15, r2, r11, r0)     // Catch:{ all -> 0x26ee }
            X.3b9 r2 = X.C244413b9.RELATIVE     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x26ee }
            r0 = r96
            X.9JS r1 = X.C51965G9l.A0d(r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r3 = X.C51974G9v.A0K(r3, r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = r70
            r0 = r82
            X.2WX r2 = X.C52112GFg.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "trans_ket_clips_spins_indicator"
            r0 = r81
            X.2WX r0 = X.C51971G9r.A0V(r5, r2, r0, r1)     // Catch:{ all -> 0x26ee }
            X.2WX r3 = r3.A00(r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r5)     // Catch:{ all -> 0x26ee }
            X.Gx7 r1 = new X.Gx7     // Catch:{ all -> 0x26ee }
            r0 = r21
            r1.<init>(r6, r0)     // Catch:{ all -> 0x26ee }
            X.2Tp r116 = X.C51967G9n.A0Q(r1, r2, r10, r3)     // Catch:{ all -> 0x26ee }
        L_0x0db6:
            X.JTL r0 = r12.A0N     // Catch:{ all -> 0x26ee }
            r205 = r0
            X.GKJ r9 = r205.BQN()     // Catch:{ all -> 0x26ee }
            X.GF9 r0 = r12.A0M     // Catch:{ all -> 0x26ee }
            r71 = r0
            X.JRO r0 = r12.A09     // Catch:{ all -> 0x26ee }
            r222 = r0
            X.JTG r0 = r12.A0K     // Catch:{ all -> 0x26ee }
            r17 = r0
            X.GCs r0 = r12.A0P     // Catch:{ all -> 0x26ee }
            r183 = r0
            X.JQX r0 = r12.A0O     // Catch:{ all -> 0x26ee }
            r221 = r0
            android.content.Context r8 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0de5
            goto L_0x0de2
        L_0x0ddd:
            r116 = 0
            goto L_0x0db6
        L_0x0de0:
            r1 = 0
            goto L_0x0d62
        L_0x0de2:
            r2 = r15
            goto L_0x0fe7
        L_0x0de5:
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3yA r3 = r0.A0N     // Catch:{ all -> 0x26ee }
            if (r3 != 0) goto L_0x0df8
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0df6
            X.3y9 r3 = r0.A0F     // Catch:{ all -> 0x26ee }
            goto L_0x0df8
        L_0x0df6:
            r3 = r15
            goto L_0x0e33
        L_0x0df8:
            if (r3 == 0) goto L_0x0e33
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0e33
            java.util.List r0 = r3.BGN()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0e33
            int r1 = r0.size()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 <= r0) goto L_0x0e33
            r0 = 36318252045178942(0x8107420004183e, double:3.031147063009405E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0e33
            r0 = 36328972283297482(0x81110200003eca, double:3.0379265847625035E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0e33
            boolean r0 = X.AnonymousClass71K.A04(r248)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0e33
            boolean r0 = X.AnonymousClass71K.A05(r248)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x0e33
            r2 = r15
            goto L_0x0fe7
        L_0x0e33:
            X.0jB r4 = X.C52452GTe.A01(r6, r3, r15)     // Catch:{ all -> 0x26ee }
            r0 = 22
            X.Iw1 r129 = X.C58692Iw1.A00(r4, r12, r0)     // Catch:{ all -> 0x26ee }
            X.Iny r14 = new X.Iny     // Catch:{ all -> 0x26ee }
            r2 = r87
            r0 = r112
            r14.<init>(r2, r0, r12, r4)     // Catch:{ all -> 0x26ee }
            r1 = 2342158134522481654(0x2081046a00010bf6, double:4.0614525555978044E-152)
            r0 = r104
            boolean r4 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r0 = 36596600286546488(0x82046a00110a38, double:3.2071756116686454E-306)
            int r0 = X.DbS.A04(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            int r131 = X.C61380mr.A01(r8, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36315125309901821(0x81046a00120bfd, double:3.029169703029801E-306)
            boolean r135 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36315125310032895(0x81046a00140bff, double:3.029169703112693E-306)
            boolean r136 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36315125310360576(0x81046a00190c00, double:3.0291697033199196E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0e97
            r0 = 37159550240620642(0x84046a001b0062, double:3.5631874294426576E-306)
            java.lang.Double r119 = X.C51968G9o.A0r(r13, r6, r0)     // Catch:{ all -> 0x26ee }
        L_0x0e84:
            r0 = 36596600287267385(0x82046a001c0a39, double:3.2071756121245436E-306)
            java.lang.Integer r122 = X.C51970G9q.A0h(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36596600287332922(0x82046a001d0a3a, double:3.2071756121659895E-306)
            java.lang.Integer r123 = X.C51970G9q.A0h(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x0e9a
        L_0x0e97:
            r119 = 0
            goto L_0x0e84
        L_0x0e9a:
            r2 = 0
            if (r3 == 0) goto L_0x0f6d
            if (r4 == 0) goto L_0x0f6d
            java.lang.String r0 = r3.C7u()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0ed6
            java.lang.String r1 = "caption"
            boolean r134 = X.00p.A0k(r0, r1, r11)     // Catch:{ all -> 0x26ee }
        L_0x0eab:
            java.lang.String r0 = r3.C7u()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0ed3
            java.lang.String r1 = "caption_fallback"
            boolean r1 = X.00p.A0k(r0, r1, r11)     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x0ed3
            java.util.List r1 = r3.C7t()     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x0ed3
            java.lang.String r125 = X.C51966G9m.A1G(r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x0ec5:
            java.lang.String r5 = r3.getFormat()     // Catch:{ all -> 0x26ee }
            X.0qQ.A0B(r5, r11)     // Catch:{ all -> 0x26ee }
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r96)     // Catch:{ all -> 0x26ee }
            int r7 = r4.length     // Catch:{ all -> 0x26ee }
            r0 = 0
            goto L_0x0ed9
        L_0x0ed3:
            r125 = r15
            goto L_0x0ec5
        L_0x0ed6:
            r134 = 0
            goto L_0x0eab
        L_0x0ed9:
            if (r0 >= r7) goto L_0x0ef6
            r120 = r4[r0]     // Catch:{ all -> 0x26ee }
            int r1 = r120.intValue()     // Catch:{ all -> 0x26ee }
            switch(r1) {
                case 1: goto L_0x0eeb;
                case 2: goto L_0x0eee;
                default: goto L_0x0ee4;
            }     // Catch:{ all -> 0x26ee }
        L_0x0ee4:
            java.lang.String r1 = "none"
        L_0x0ee6:
            boolean r1 = r1.equals(r5)     // Catch:{ all -> 0x26ee }
            goto L_0x0ef1
        L_0x0eeb:
            java.lang.String r1 = "embedded_cta"
            goto L_0x0ee6
        L_0x0eee:
            java.lang.String r1 = "attached_module"
            goto L_0x0ee6
        L_0x0ef1:
            if (r1 != 0) goto L_0x0ef8
            int r0 = r0 + 1
            goto L_0x0ed9
        L_0x0ef6:
            r120 = r110
        L_0x0ef8:
            java.util.List r0 = r3.C7t()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0f04
            java.lang.String r124 = X.C51966G9m.A1G(r0, r11)     // Catch:{ all -> 0x26ee }
            if (r124 != 0) goto L_0x0f06
        L_0x0f04:
            r124 = r59
        L_0x0f06:
            java.util.List r0 = r3.C2d()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0f4e
            java.lang.String r126 = X.C51966G9m.A1G(r0, r11)     // Catch:{ all -> 0x26ee }
        L_0x0f10:
            java.lang.Integer r121 = r3.BSy()     // Catch:{ all -> 0x26ee }
            java.util.List r0 = r3.BGN()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0f51
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)     // Catch:{ all -> 0x26ee }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x26ee }
        L_0x0f22:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0f51
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x26ee }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = r3.BGQ()     // Catch:{ all -> 0x26ee }
            r5 = -1
            if (r1 == 0) goto L_0x0f4c
            int r4 = r1.intValue()     // Catch:{ all -> 0x26ee }
        L_0x0f39:
            java.lang.Integer r1 = r3.BG7()     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x0f43
            int r5 = r1.intValue()     // Catch:{ all -> 0x26ee }
        L_0x0f43:
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x26ee }
            r1.<init>(r0, r4, r5)     // Catch:{ all -> 0x26ee }
            r2.add(r1)     // Catch:{ all -> 0x26ee }
            goto L_0x0f22
        L_0x0f4c:
            r4 = -1
            goto L_0x0f39
        L_0x0f4e:
            r126 = r15
            goto L_0x0f10
        L_0x0f51:
            r128 = r2
            java.lang.Integer r0 = r3.Aw5()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fd8
            int r0 = r0.intValue()     // Catch:{ all -> 0x26ee }
            long r0 = (long) r0     // Catch:{ all -> 0x26ee }
        L_0x0f5e:
            java.lang.String r127 = r3.Ald()     // Catch:{ all -> 0x26ee }
            X.GZG r2 = new X.GZG     // Catch:{ all -> 0x26ee }
            r118 = r2
            r130 = r14
            r132 = r0
            r118.<init>(r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r134, r135, r136)     // Catch:{ all -> 0x26ee }
        L_0x0f6d:
            r0 = r248
            X.1Xj r3 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r3 == 0) goto L_0x0fe7
            X.0Pk r0 = X.0Pl.A0n     // Catch:{ all -> 0x26ee }
            X.0Pl r7 = r0.A00(r8, r6)     // Catch:{ all -> 0x26ee }
            r0 = r173
            boolean r0 = r0.A0D     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fe7
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fe7
            r4 = 36321851227842365(0x810a880005273d, double:3.033423200618499E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r4)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fe7
            X.1Xy r0 = r3.A0C     // Catch:{ all -> 0x26ee }
            X.41Z r0 = r0.BUC()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fd0
            X.4hQ r4 = r0.At8()     // Catch:{ all -> 0x26ee }
            if (r4 == 0) goto L_0x0fd0
            com.instagram.api.schemas.MoreInfoType r0 = r4.BUD()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.MoreInfoType r1 = com.instagram.api.schemas.MoreInfoType.ADS_VISIT     // Catch:{ all -> 0x26ee }
            if (r0 == r1) goto L_0x0fb0
            com.instagram.api.schemas.MoreInfoType r0 = r4.BUD()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.MoreInfoType r1 = com.instagram.api.schemas.MoreInfoType.FOLLOWER_COUNT     // Catch:{ all -> 0x26ee }
            if (r0 != r1) goto L_0x0fd0
        L_0x0fb0:
            java.lang.String r4 = r4.AyB()     // Catch:{ all -> 0x26ee }
            X.JwE r0 = new X.JwE     // Catch:{ all -> 0x26ee }
            r0.<init>((com.instagram.api.schemas.MoreInfoType) r1, (java.lang.String) r4)     // Catch:{ all -> 0x26ee }
        L_0x0fb9:
            X.HLG r1 = X.HLG.A02     // Catch:{ all -> 0x26ee }
            java.lang.CharSequence r1 = r7.A0I(r3, r1)     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x26ee }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.MoreInfoType r0 = (com.instagram.api.schemas.MoreInfoType) r0     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.MoreInfoType r3 = com.instagram.api.schemas.MoreInfoType.ADS_VISIT     // Catch:{ all -> 0x26ee }
            if (r0 == r3) goto L_0x0fdb
            com.instagram.api.schemas.MoreInfoType r3 = com.instagram.api.schemas.MoreInfoType.FOLLOWER_COUNT     // Catch:{ all -> 0x26ee }
            if (r0 != r3) goto L_0x0fe7
            goto L_0x0fdb
        L_0x0fd0:
            com.instagram.api.schemas.MoreInfoType r1 = com.instagram.api.schemas.MoreInfoType.UNRECOGNIZED     // Catch:{ all -> 0x26ee }
            X.JwE r0 = new X.JwE     // Catch:{ all -> 0x26ee }
            r0.<init>((com.instagram.api.schemas.MoreInfoType) r1)     // Catch:{ all -> 0x26ee }
            goto L_0x0fb9
        L_0x0fd8:
            r0 = 0
            goto L_0x0f5e
        L_0x0fdb:
            if (r1 == 0) goto L_0x0fe7
            int r0 = r1.length()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x0fe7
            if (r2 == 0) goto L_0x0fe7
            r2.A00 = r1     // Catch:{ all -> 0x26ee }
        L_0x0fe7:
            X.GAk r0 = r12.A0J     // Catch:{ all -> 0x26ee }
            r40 = r0
            r0 = r52
            java.lang.Object r7 = r0.A03     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x26ee }
            boolean r152 = X.C51969G9p.A1V(r51)     // Catch:{ all -> 0x26ee }
            boolean r156 = X.AnonymousClass7TF.A1V(r26)
            X.GF2 r3 = r12.A0Q     // Catch:{ all -> 0x26ee }
            X.H3C r1 = r12.A0L     // Catch:{ all -> 0x26ee }
            X.GEl r68 = r205.CB8()     // Catch:{ all -> 0x26ee }
            r0 = r68
            X.JN6 r0 = r0.A0F     // Catch:{ all -> 0x26ee }
            X.GG6 r64 = new X.GG6     // Catch:{ all -> 0x26ee }
            r113 = r64
            r114 = r9
            r118 = r54
            r119 = r137
            r120 = r244
            r121 = r222
            r122 = r6
            r123 = r246
            r124 = r249
            r125 = r2
            r126 = r41
            r127 = r229
            r128 = r46
            r129 = r21
            r130 = r40
            r131 = r17
            r132 = r1
            r133 = r71
            r134 = r0
            r135 = r71
            r136 = r221
            r137 = r22
            r138 = r183
            r139 = r3
            r140 = r18
            r141 = r47
            r142 = r34
            r143 = r7
            r168 = r58
            r171 = r102
            r113.<init>(r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171)     // Catch:{ all -> 0x26ee }
            java.lang.Object r1 = r9.A04     // Catch:{ all -> 0x26ee }
            X.JMz r1 = (X.C59527JMz) r1     // Catch:{ all -> 0x26ee }
            boolean r186 = r7.booleanValue()     // Catch:{ all -> 0x26ee }
            boolean r0 = X.C52076GDw.A03(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1067
            boolean r191 = X.C51969G9p.A1V(r103)     // Catch:{ all -> 0x26ee }
        L_0x1058:
            r0 = r244
            boolean r0 = r0.A21     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x106a
            r0 = r244
            boolean r0 = r0.A23     // Catch:{ all -> 0x26ee }
            r200 = 0
            if (r0 == 0) goto L_0x106c
            goto L_0x106a
        L_0x1067:
            r191 = r60
            goto L_0x1058
        L_0x106a:
            r200 = 1
        L_0x106c:
            java.lang.String r17 = "trans_key_clips_cta"
            X.GH8 r47 = new X.GH8     // Catch:{ all -> 0x26ee }
            r171 = r47
            r172 = r107
            r174 = r248
            r175 = r245
            r176 = r6
            r177 = r246
            r178 = r229
            r179 = r31
            r180 = r40
            r181 = r71
            r182 = r1
            r187 = r149
            r189 = r145
            r192 = r146
            r193 = r147
            r195 = r150
            r196 = r151
            r197 = r152
            r199 = r102
            r171.<init>(r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200)     // Catch:{ all -> 0x26ee }
            if (r107 == 0) goto L_0x10cc
            if (r198 == 0) goto L_0x10cc
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            long r4 = X.C244013aV.A0C(r10, r0)     // Catch:{ all -> 0x26ee }
            long r2 = X.C244013aV.A0C(r10, r0)     // Catch:{ all -> 0x26ee }
            X.9JR r0 = X.C51967G9n.A0U(r11, r4)     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.C51974G9v.A0H(r15, r0, r11, r2)     // Catch:{ all -> 0x26ee }
            r0 = r15
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r224)     // Catch:{ all -> 0x26ee }
            if (r31 == 0) goto L_0x10c2
            r0 = r31
            java.lang.String r8 = r0.A02     // Catch:{ all -> 0x26ee }
            X.0sa r5 = r0.A03     // Catch:{ all -> 0x26ee }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x26ee }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x26ee }
            goto L_0x10c5
        L_0x10c2:
            r8 = r15
            r5 = r15
            r4 = r15
        L_0x10c5:
            r130 = r15
            if (r188 == 0) goto L_0x10cf
            r130 = r17
            goto L_0x10cf
        L_0x10cc:
            r52 = r15
            goto L_0x1109
        L_0x10cf:
            r116 = r173
            r117 = r248
            r118 = r245
            r119 = r6
            r120 = r246
            r121 = r229
            r122 = r40
            r123 = r71
            r124 = r1
            r125 = r183
            r126 = r7
            r127 = r8
            r128 = r4
            r129 = r0
            r131 = r5
            r132 = r184
            r133 = r185
            r134 = r149
            r135 = r145
            r136 = r146
            r137 = r147
            r138 = r194
            r139 = r150
            r140 = r151
            r141 = r152
            X.3mx r0 = X.GFL.A01(r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141)     // Catch:{ all -> 0x26ee }
            X.2Tp r52 = X.C51967G9n.A0Q(r0, r2, r10, r3)     // Catch:{ all -> 0x26ee }
        L_0x1109:
            r0 = r84
            X.2V5 r51 = X.C51968G9o.A0Z(r10, r0)     // Catch:{ all -> 0x26ee }
            X.GG7 r0 = X.GG7.A00     // Catch:{ all -> 0x26ee }
            X.3Zt r141 = X.C243633Zp.A00(r10, r0)     // Catch:{ all -> 0x26ee }
            X.GG8 r32 = new X.GG8     // Catch:{ all -> 0x26ee }
            r0 = r32
            r1 = r248
            r2 = r246
            r3 = r6
            r4 = r229
            r5 = r221
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x26ee }
            X.1Xj r1 = r1.A02     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x1171
            X.4Nf r0 = r221.Auf()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1152
            boolean r0 = r0.A00     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r118 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x26ee }
        L_0x1135:
            boolean r123 = r1.CcK()     // Catch:{ all -> 0x26ee }
            boolean r124 = r1.CeS()     // Catch:{ all -> 0x26ee }
            boolean r125 = r1.A51()     // Catch:{ all -> 0x26ee }
            boolean r126 = r1.A4L()     // Catch:{ all -> 0x26ee }
            java.util.List r121 = X.C51965G9l.A0w(r1)     // Catch:{ all -> 0x26ee }
            X.3WR r117 = r1.CEL()     // Catch:{ all -> 0x26ee }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)     // Catch:{ all -> 0x26ee }
            goto L_0x1155
        L_0x1152:
            r118 = r15
            goto L_0x1135
        L_0x1155:
            if (r0 == 0) goto L_0x1158
            goto L_0x115b
        L_0x1158:
            r119 = r15
            goto L_0x115f
        L_0x115b:
            java.lang.String r119 = r0.getId()     // Catch:{ all -> 0x26ee }
        L_0x115f:
            java.lang.String r120 = X.C51966G9m.A1D(r1)     // Catch:{ all -> 0x26ee }
            r116 = r6
            r122 = r11
            boolean r1 = X.AnonymousClass3WP.A09(r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126)     // Catch:{ all -> 0x26ee }
            r18 = 1
            r0 = r109
            if (r1 == r0) goto L_0x1173
        L_0x1171:
            r18 = 0
        L_0x1173:
            boolean r0 = r248.A0I()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1188
            r1 = 36326884929189932(0x810f1c0000382c, double:3.0366065336197886E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r200 = 1
            if (r0 != 0) goto L_0x118a
        L_0x1188:
            r200 = 0
        L_0x118a:
            r34 = 1120403456(0x42c80000, float:100.0)
            if (r159 != 0) goto L_0x11a4
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x11a1
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x11a1
            boolean r0 = X.C52453GTf.A00(r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x11a1
            goto L_0x11a4
        L_0x11a1:
            r23 = 1112014848(0x42480000, float:50.0)
            goto L_0x11a6
        L_0x11a4:
            r23 = 1120403456(0x42c80000, float:100.0)
        L_0x11a6:
            float r136 = r23 / r34
            float r136 = r136 * r38
            java.lang.Integer r54 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x26ee }
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            X.3b9 r73 = X.C244413b9.ABSOLUTE     // Catch:{ all -> 0x26ee }
            java.lang.Integer r72 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r144 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r75 = X.C243573Zh.STRETCH     // Catch:{ all -> 0x26ee }
            X.2Wb r74 = X.AnonymousClass7TG.A0S(r224)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x11dc
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.A06()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x11dc
            goto L_0x1386
        L_0x11dc:
            r38 = 0
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x26ee }
            r0 = r109
            X.2WX r2 = X.C51973G9u.A0Y(r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = 2131971514(0x7f134dba, float:1.958001E38)
            r0 = r248
            java.lang.String r0 = r0.AyM(r6)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1207
            r0 = r59
        L_0x1207:
            java.lang.String r1 = X.C244013aV.A0F(r10, r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.C51971G9r.A0Y(r2, r0, r1, r11)     // Catch:{ all -> 0x26ee }
            r199 = 9
            X.Tth r2 = new X.Tth     // Catch:{ all -> 0x26ee }
            r196 = r2
            r197 = r45
            r198 = r29
            r196.<init>(r197, r198, r199, r200, r201)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r14 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r248.A0E()     // Catch:{ all -> 0x26ee }
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r224)     // Catch:{ all -> 0x26ee }
            X.2V1 r0 = r3.A00     // Catch:{ all -> 0x26ee }
            r127 = r12
            r128 = r115
            r129 = r0
            r130 = r64
            r131 = r47
            r132 = r3
            r133 = r107
            r134 = r248
            r135 = r46
            r137 = r20
            r138 = r11
            float r1 = r127.A04(r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138)     // Catch:{ all -> 0x26ee }
            r0 = r51
            X.C51967G9n.A19(r0, r1)     // Catch:{ all -> 0x26ee }
            android.content.Context r1 = X.C243803a8.A00(r3)     // Catch:{ all -> 0x26ee }
            boolean r2 = r46.A0C()     // Catch:{ all -> 0x26ee }
            if (r2 != 0) goto L_0x1264
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x126d
            boolean r0 = r248.A0E()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x126d
        L_0x1264:
            r0 = 2130968586(0x7f04000a, float:1.754583E38)
            int r0 = X.2Yu.A0G(r1, r0)     // Catch:{ all -> 0x26ee }
            float r9 = (float) r0     // Catch:{ all -> 0x26ee }
            goto L_0x1276
        L_0x126d:
            boolean r0 = X.C52076GDw.A04(r248)     // Catch:{ all -> 0x26ee }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1264
            r9 = 0
        L_0x1276:
            if (r2 == 0) goto L_0x12aa
            X.5Oz r0 = X.C53917GwN.A0E     // Catch:{ all -> 0x26ee }
            r2 = r46
            X.HK1 r2 = (X.HK1) r2     // Catch:{ all -> 0x26ee }
            float r127 = X.C51970G9q.A02(r51)     // Catch:{ all -> 0x26ee }
            boolean r1 = r12.A0X     // Catch:{ all -> 0x26ee }
            X.GwN r0 = new X.GwN     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r173
            r118 = r244
            r119 = r248
            r120 = r245
            r121 = r6
            r122 = r246
            r123 = r112
            r124 = r4
            r125 = r2
            r126 = r183
            r128 = r9
            r129 = r154
            r130 = r1
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130)     // Catch:{ all -> 0x26ee }
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x132b
        L_0x12aa:
            boolean r0 = r46.A0B()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1335
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r0 = r42
            boolean r1 = X.C51965G9l.A1a(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.Phs r0 = new X.Phs     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r96
            r118 = r41
            r119 = r27
            r120 = r46
            r121 = r3
            r122 = r107
            r123 = r31
            r124 = r12
            r125 = r19
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125)     // Catch:{ all -> 0x26ee }
            java.lang.Object r5 = A06(r10, r0, r2, r1)     // Catch:{ all -> 0x26ee }
            X.GZC r5 = (X.GZC) r5     // Catch:{ all -> 0x26ee }
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x26ee }
            r0 = r42
            boolean r7 = X.C51965G9l.A1a(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.Iny r4 = new X.Iny     // Catch:{ all -> 0x26ee }
            r2 = r105
            r1 = r19
            r0 = r46
            r4.<init>(r2, r1, r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Object r1 = A06(r10, r4, r8, r7)     // Catch:{ all -> 0x26ee }
            X.GZD r1 = (X.GZD) r1     // Catch:{ all -> 0x26ee }
            X.5Oz r0 = X.GZE.A0K     // Catch:{ all -> 0x26ee }
            java.util.HashMap r0 = r12.A0V     // Catch:{ all -> 0x26ee }
            r7 = r0
            java.util.HashMap r4 = r12.A0U     // Catch:{ all -> 0x26ee }
            float r133 = X.C51970G9q.A02(r51)     // Catch:{ all -> 0x26ee }
            boolean r2 = r12.A0Y     // Catch:{ all -> 0x26ee }
            X.GZE r0 = new X.GZE     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r27
            r118 = r248
            r119 = r245
            r120 = r6
            r121 = r246
            r122 = r112
            r123 = r41
            r124 = r229
            r125 = r5
            r126 = r1
            r127 = r46
            r128 = r30
            r129 = r40
            r130 = r45
            r131 = r7
            r132 = r4
            r134 = r9
            r135 = r2
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135)     // Catch:{ all -> 0x26ee }
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x132b:
            X.2Tp r1 = X.C243563Zg.A0E(r3, r10, r14)     // Catch:{ all -> 0x26ee }
            r0 = r74
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
            goto L_0x1388
        L_0x1335:
            if (r200 == 0) goto L_0x1338
            goto L_0x1362
        L_0x1338:
            java.util.HashMap r4 = r12.A0V     // Catch:{ all -> 0x26ee }
            java.util.HashMap r2 = r12.A0U     // Catch:{ all -> 0x26ee }
            float r126 = X.C51970G9q.A02(r51)     // Catch:{ all -> 0x26ee }
            boolean r1 = r12.A0Y     // Catch:{ all -> 0x26ee }
            X.GH3 r0 = new X.GH3     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r27
            r118 = r248
            r119 = r245
            r120 = r246
            r121 = r6
            r122 = r229
            r123 = r30
            r124 = r4
            r125 = r2
            r127 = r9
            r128 = r109
            r129 = r1
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129)     // Catch:{ all -> 0x26ee }
            goto L_0x1382
        L_0x1362:
            r1 = 36326884929255469(0x810f1c0001382d, double:3.0366065336612344E-306)
            r0 = r104
            boolean r122 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            boolean r1 = r12.A0Y     // Catch:{ all -> 0x26ee }
            X.Gun r0 = new X.Gun     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r248
            r118 = r246
            r119 = r6
            r120 = r30
            r121 = r29
            r123 = r1
            r116.<init>(r117, r118, r119, r120, r121, r122, r123)     // Catch:{ all -> 0x26ee }
        L_0x1382:
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x132b
        L_0x1386:
            r38 = 1
        L_0x1388:
            r2 = 0
            if (r241 == 0) goto L_0x1405
            r0 = r111
            X.1Xy r0 = r0.A0C     // Catch:{ all -> 0x26ee }
            X.DU9 r118 = r0.Bl9()     // Catch:{ all -> 0x26ee }
            if (r31 == 0) goto L_0x13a8
            r0 = r31
            java.lang.String r4 = r0.A02     // Catch:{ all -> 0x26ee }
            X.0sa r3 = r0.A03     // Catch:{ all -> 0x26ee }
        L_0x139b:
            X.GJ5 r1 = X.GJ5.AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 == r1) goto L_0x13ab
            X.GJ5 r1 = X.GJ5.REMINDER_AD     // Catch:{ all -> 0x26ee }
            r129 = 0
            if (r0 != r1) goto L_0x13ad
            goto L_0x13ab
        L_0x13a8:
            r4 = r15
            r3 = r15
            goto L_0x139b
        L_0x13ab:
            r129 = 1
        L_0x13ad:
            X.3OA r123 = r248.A06()     // Catch:{ all -> 0x26ee }
            android.app.Activity r117 = X.C51969G9p.A0J(r10)     // Catch:{ all -> 0x26ee }
            r1 = r48
            r0 = r183
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x26ee }
            r1 = r22
            r0 = r105
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = 36325119697760881(0x810d8100023271, double:3.03549019415604E-306)
            r0 = r104
            boolean r130 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x13e3
            r1 = 36325119697695344(0x810d8100013270, double:3.0354901941145944E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            r131 = 1
            if (r0 != 0) goto L_0x13e5
        L_0x13e3:
            r131 = 0
        L_0x13e5:
            X.IKj r1 = new X.IKj     // Catch:{ all -> 0x26ee }
            r116 = r1
            r119 = r248
            r120 = r246
            r121 = r6
            r122 = r112
            r124 = r41
            r125 = r22
            r126 = r183
            r127 = r4
            r128 = r3
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131)     // Catch:{ all -> 0x26ee }
            X.Hk9 r2 = new X.Hk9     // Catch:{ all -> 0x26ee }
            r0 = r54
            r2.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x1405:
            r0 = 18305455558303416(0x4108b700011eb8, double:1.8951001178478475E-307)
            boolean r3 = X.1AW.A06(r13, r0)     // Catch:{ all -> 0x26ee }
            X.6Q5 r4 = new X.6Q5     // Catch:{ all -> 0x26ee }
            r4.<init>(r3)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x143a
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x143a
            boolean r0 = r0.A5H()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x143a
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x143a
            boolean r1 = r0.A5p()     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x143a
            boolean r0 = X.C51968G9o.A1V(r248)     // Catch:{ all -> 0x26ee }
            r9 = 1
            if (r0 != 0) goto L_0x143b
        L_0x143a:
            r9 = 0
        L_0x143b:
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x14d9
            boolean r0 = X.C51968G9o.A1V(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x14d9
            r0 = 36326966533568612(0x810f2f00003864, double:3.03665814055746E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x14d9
            X.3OA r121 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.2nI r7 = r12.A02     // Catch:{ all -> 0x26ee }
            r0 = r245
            java.lang.Integer r0 = r0.A0J     // Catch:{ all -> 0x26ee }
            boolean r125 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r123 = r248.getId()     // Catch:{ all -> 0x26ee }
            java.util.HashMap r4 = r12.A0V     // Catch:{ all -> 0x26ee }
            if (r2 == 0) goto L_0x14a0
            X.JQA r1 = r2.A00     // Catch:{ all -> 0x26ee }
        L_0x146a:
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            X.GvM r5 = new X.GvM     // Catch:{ all -> 0x26ee }
            r116 = r5
            r117 = r1
            r118 = r7
            r119 = r6
            r120 = r0
            r122 = r229
            r124 = r4
            r126 = r3
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126)     // Catch:{ all -> 0x26ee }
            X.GGH r4 = X.GGH.A00     // Catch:{ all -> 0x26ee }
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r1 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r30
            X.2WX r3 = X.C51973G9u.A0O(r10, r1, r6, r0, r4)     // Catch:{ all -> 0x26ee }
            goto L_0x14a2
        L_0x14a0:
            r1 = 0
            goto L_0x146a
        L_0x14a2:
            if (r241 == 0) goto L_0x14c1
            X.Iwx r4 = new X.Iwx     // Catch:{ all -> 0x26ee }
            r2 = r95
            r1 = r45
            r0 = r112
            r4.<init>(r2, r0, r12, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r2 = X.C51971G9r.A0Y(r3, r1, r4, r0)     // Catch:{ all -> 0x26ee }
            r1 = 20
            r0 = r45
            X.J6P r1 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            goto L_0x16a7
        L_0x14c1:
            if (r201 == 0) goto L_0x16af
            if (r9 == 0) goto L_0x14c7
            goto L_0x1686
        L_0x14c7:
            r1 = 22
            r0 = r29
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x16af
        L_0x14d9:
            r0 = 36316937784922831(0x810610000012cf, double:3.030315919531339E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x15bf
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1684
            X.2nI r8 = r12.A02     // Catch:{ all -> 0x26ee }
            X.3OA r122 = r248.A06()     // Catch:{ all -> 0x26ee }
            java.util.HashMap r7 = r12.A0V     // Catch:{ all -> 0x26ee }
            X.GTi r3 = new X.GTi     // Catch:{ all -> 0x26ee }
            r1 = r229
            r0 = r112
            r3.<init>(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.String r124 = r248.getId()     // Catch:{ all -> 0x26ee }
            r0 = 36315769555586574(0x810500001b0e0e, double:3.029577126595008E-306)
            boolean r126 = X.C51965G9l.A1a(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = r245
            java.lang.Integer r0 = r0.A0J     // Catch:{ all -> 0x26ee }
            boolean r127 = X.AnonymousClass7TF.A1V(r0)
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            X.GTj r5 = new X.GTj     // Catch:{ all -> 0x26ee }
            r116 = r5
            r117 = r2
            r118 = r4
            r119 = r8
            r120 = r6
            r121 = r0
            r123 = r3
            r125 = r7
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127)     // Catch:{ all -> 0x26ee }
            X.GGH r4 = X.GGH.A00     // Catch:{ all -> 0x26ee }
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r1 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r30
            X.2WX r3 = X.C51973G9u.A0O(r10, r1, r6, r0, r4)     // Catch:{ all -> 0x26ee }
            if (r241 == 0) goto L_0x1576
            X.Iwx r4 = new X.Iwx     // Catch:{ all -> 0x26ee }
            r2 = r101
            r1 = r45
            r0 = r112
            r4.<init>(r2, r0, r12, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r4, r0)     // Catch:{ all -> 0x26ee }
            r1 = r106
            r0 = r45
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
        L_0x156a:
            r0 = r224
            X.2Wb r0 = X.G9t.A0v(r5, r0)     // Catch:{ all -> 0x26ee }
            X.2Tp r1 = X.C243563Zg.A0E(r0, r10, r3)     // Catch:{ all -> 0x26ee }
            goto L_0x16b9
        L_0x1576:
            if (r201 == 0) goto L_0x156a
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.A06()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x156a
            if (r9 == 0) goto L_0x15ae
            r117 = 45
            X.IxF r2 = new X.IxF     // Catch:{ all -> 0x26ee }
            r116 = r2
            r118 = r45
            r119 = r12
            r120 = r112
            r121 = r29
            r116.<init>(r117, r118, r119, r120, r121)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r65
            r0 = r29
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x156a
        L_0x15ae:
            r1 = 26
            r0 = r29
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x156a
        L_0x15bf:
            if (r38 == 0) goto L_0x1684
            X.2nI r8 = r12.A02     // Catch:{ all -> 0x26ee }
            X.3OA r122 = r248.A06()     // Catch:{ all -> 0x26ee }
            java.util.HashMap r7 = r12.A0V     // Catch:{ all -> 0x26ee }
            X.GTi r3 = new X.GTi     // Catch:{ all -> 0x26ee }
            r1 = r229
            r0 = r112
            r3.<init>(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.String r124 = r248.getId()     // Catch:{ all -> 0x26ee }
            r0 = r245
            java.lang.Integer r0 = r0.A0J     // Catch:{ all -> 0x26ee }
            boolean r127 = X.AnonymousClass7TF.A1V(r0)
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            X.GTj r5 = new X.GTj     // Catch:{ all -> 0x26ee }
            r116 = r5
            r117 = r2
            r118 = r4
            r119 = r8
            r120 = r6
            r121 = r0
            r123 = r3
            r125 = r7
            r126 = r109
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127)     // Catch:{ all -> 0x26ee }
            X.GGH r4 = X.GGH.A00     // Catch:{ all -> 0x26ee }
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r1 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r30
            X.2WX r3 = X.C51973G9u.A0O(r10, r1, r6, r0, r4)     // Catch:{ all -> 0x26ee }
            if (r241 == 0) goto L_0x1645
            X.Iwx r4 = new X.Iwx     // Catch:{ all -> 0x26ee }
            r2 = r67
            r1 = r45
            r0 = r112
            r4.<init>(r2, r0, r12, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r4, r0)     // Catch:{ all -> 0x26ee }
            r1 = r45
            r0 = r69
            X.J6P r2 = X.J6P.A00(r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
        L_0x163a:
            r0 = r224
            X.2Wb r0 = X.G9t.A0v(r5, r0)     // Catch:{ all -> 0x26ee }
            X.2Tp r1 = X.C243563Zg.A0E(r0, r10, r3)     // Catch:{ all -> 0x26ee }
            goto L_0x16b9
        L_0x1645:
            if (r201 == 0) goto L_0x163a
            if (r9 == 0) goto L_0x1673
            r117 = 46
            X.IxF r2 = new X.IxF     // Catch:{ all -> 0x26ee }
            r116 = r2
            r118 = r45
            r119 = r12
            r120 = r112
            r121 = r29
            r116.<init>(r117, r118, r119, r120, r121)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = 28
            r0 = r29
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x163a
        L_0x1673:
            r1 = r83
            r0 = r29
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x163a
        L_0x1684:
            r1 = r15
            goto L_0x16b9
        L_0x1686:
            r117 = 44
            X.IxF r2 = new X.IxF     // Catch:{ all -> 0x26ee }
            r116 = r2
            r118 = r45
            r119 = r12
            r120 = r112
            r121 = r29
            r116.<init>(r117, r118, r119, r120, r121)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r2 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r61
            r0 = r29
            X.J6P r1 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
        L_0x16a7:
            java.lang.Integer r3 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r3 = X.C51971G9r.A0Y(r2, r3, r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x16af:
            r0 = r224
            X.2Wb r0 = X.G9t.A0v(r5, r0)     // Catch:{ all -> 0x26ee }
            X.2Tp r1 = X.C243563Zg.A0E(r0, r10, r3)     // Catch:{ all -> 0x26ee }
        L_0x16b9:
            r0 = r74
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.A0J()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x16c7
            if (r158 != 0) goto L_0x16c7
            goto L_0x16ca
        L_0x16c7:
            X.3Zi r29 = X.C243583Zi.SPACE_BETWEEN     // Catch:{ all -> 0x26ee }
            goto L_0x16d8
        L_0x16ca:
            r0 = r244
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x16c7
            boolean r1 = r0.A0N     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r1 != r0) goto L_0x16c7
            X.3Zi r29 = X.C243583Zi.FLEX_END     // Catch:{ all -> 0x26ee }
        L_0x16d8:
            r2 = r82
            java.lang.String r0 = r12.A0R     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x16e4
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x26ee }
            X.2WX r2 = X.C51971G9r.A0Y(r15, r1, r0, r11)     // Catch:{ all -> 0x26ee }
        L_0x16e4:
            r14 = 31
            X.GN2 r3 = new X.GN2     // Catch:{ all -> 0x26ee }
            r0 = r102
            r3.<init>(r14, r12, r10, r0)     // Catch:{ all -> 0x26ee }
            X.3at r1 = new X.3at     // Catch:{ all -> 0x26ee }
            r0 = r72
            r1.<init>(r0, r3, r15)     // Catch:{ all -> 0x26ee }
            r0 = r82
            if (r2 != r0) goto L_0x16f9
            r2 = 0
        L_0x16f9:
            X.2WX r3 = X.C51965G9l.A0X(r2, r1)     // Catch:{ all -> 0x26ee }
            r0 = 29
            X.J6P r2 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r38 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x26ee }
            r1 = r38
            r0 = r91
            X.2WX r2 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51971G9r.A0X(r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            X.2Wd r0 = r12.A01     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x18fd
            long r1 = r0.A00     // Catch:{ all -> 0x26ee }
            r0 = r54
            X.2WX r0 = X.AnonymousClass9JR.A00(r15, r0, r11, r1)     // Catch:{ all -> 0x26ee }
        L_0x1721:
            X.2WX r3 = r3.A00(r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = r12.A0S     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x18fa
            java.lang.Integer r2 = X.AnonymousClass05K.A0D     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r0 = X.C51971G9r.A0Y(r15, r2, r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x1731:
            X.2WX r3 = r3.A00(r0)     // Catch:{ all -> 0x26ee }
            if (r33 == 0) goto L_0x18f7
            r0 = r33
            java.lang.Integer r1 = r0.A02     // Catch:{ all -> 0x26ee }
            r0 = r54
            if (r1 != r0) goto L_0x18f7
            r1 = 30
            r0 = r53
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            X.3at r1 = new X.3at     // Catch:{ all -> 0x26ee }
            r0 = r54
            r1.<init>(r0, r2, r15)     // Catch:{ all -> 0x26ee }
            X.2WX r0 = X.C51965G9l.A0X(r15, r1)     // Catch:{ all -> 0x26ee }
        L_0x1752:
            X.2WX r4 = r3.A00(r0)     // Catch:{ all -> 0x26ee }
            android.app.Activity r3 = X.C51969G9p.A0J(r74)     // Catch:{ all -> 0x26ee }
            r0 = r63
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x26ee }
            r27 = r0
            r0 = r27
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x26ee }
            r27 = r0
            r0 = 0
            if (r36 == 0) goto L_0x178e
            android.os.Handler r140 = X.AnonymousClass7TF.A0D()     // Catch:{ all -> 0x26ee }
            X.Iin r1 = new X.Iin     // Catch:{ all -> 0x26ee }
            r0 = r27
            r1.<init>(r3, r12, r0)     // Catch:{ all -> 0x26ee }
            r138 = 28
            X.Ixb r2 = new X.Ixb     // Catch:{ all -> 0x26ee }
            r137 = r2
            r139 = r1
            r142 = r3
            r143 = r12
            r137.<init>(r138, r139, r140, r141, r142, r143)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x26ee }
            X.3at r0 = new X.3at     // Catch:{ all -> 0x26ee }
            r0.<init>(r1, r2, r15)     // Catch:{ all -> 0x26ee }
            X.2WX r0 = X.C51965G9l.A0X(r15, r0)     // Catch:{ all -> 0x26ee }
        L_0x178e:
            X.2WX r48 = r4.A00(r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r43 = X.G9t.A0w(r74)     // Catch:{ all -> 0x26ee }
            if (r145 == 0) goto L_0x17d5
            r1 = r70
            r0 = r82
            X.2WX r3 = X.C52112GFg.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r5 = X.C51974G9v.A0O(r3, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r0 = r43
            X.2V1 r4 = r0.A00     // Catch:{ all -> 0x26ee }
            X.3Zd r1 = X.C243533Zd.LOCAL     // Catch:{ all -> 0x26ee }
            X.3Ze r3 = new X.3Ze     // Catch:{ all -> 0x26ee }
            r0 = r56
            r3.<init>(r4, r1, r0)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r3 = X.C51973G9u.A0T(r5, r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r2 = X.C243573Zh.FLEX_END     // Catch:{ all -> 0x26ee }
            r1 = r110
            X.2WX r2 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = 2131239969(0x7f082421, float:1.809626E38)
            r0 = r43
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r0, r1)     // Catch:{ all -> 0x26ee }
            X.C51974G9v.A0h(r1, r4, r0, r2)     // Catch:{ all -> 0x26ee }
        L_0x17d5:
            boolean r0 = X.C51969G9p.A1V(r62)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1879
            r0 = r43
            X.2V1 r4 = r0.A00     // Catch:{ all -> 0x26ee }
            if (r25 == 0) goto L_0x18f3
            java.lang.String r0 = "overlay_gradient_scene_background_fade_in"
        L_0x17e3:
            X.3Zd r1 = X.C243533Zd.LOCAL     // Catch:{ all -> 0x26ee }
            X.2WX r3 = X.C51971G9r.A0V(r4, r15, r1, r0)     // Catch:{ all -> 0x26ee }
            float r1 = r12.A00()     // Catch:{ all -> 0x26ee }
            r0 = r54
            X.9JQ r2 = X.C51965G9l.A0b(r0, r1, r11)     // Catch:{ all -> 0x26ee }
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51973G9u.A0S(r3, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r7 = X.C243573Zh.FLEX_END     // Catch:{ all -> 0x26ee }
            r1 = r110
            X.2WX r9 = X.C51971G9r.A0Y(r2, r1, r7, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r4)     // Catch:{ all -> 0x26ee }
            X.2V5 r1 = r12.A00     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r8 = X.C51971G9r.A0W(r1, r15, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36602776449323774(0x820a08000e12fe, double:3.2110814418784125E-306)
            long r4 = X.182.A01(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            float r1 = (float) r4     // Catch:{ all -> 0x26ee }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x182d
            float r1 = r12.A00()     // Catch:{ all -> 0x26ee }
        L_0x182d:
            r0 = r54
            X.9JQ r2 = X.C51965G9l.A0b(r0, r1, r11)     // Catch:{ all -> 0x26ee }
            r1 = r110
            r0 = r34
            X.2WX r4 = X.C51973G9u.A0S(r8, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r4, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = r110
            X.2WX r7 = X.C51971G9r.A0Y(r2, r1, r7, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36321301471831281(0x810a08000224f1, double:3.0330755327033995E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1868
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1881
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1881
            boolean r0 = X.C52453GTf.A00(r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1881
        L_0x1868:
            r0 = 2131231400(0x7f0802a8, float:1.807888E38)
            android.graphics.drawable.Drawable r0 = X.C244013aV.A0D(r3, r0)     // Catch:{ all -> 0x26ee }
        L_0x186f:
            X.2V1 r1 = r3.A00     // Catch:{ all -> 0x26ee }
            X.C51974G9v.A0h(r0, r1, r3, r7)     // Catch:{ all -> 0x26ee }
            r0 = r43
            X.C51967G9n.A1E(r3, r0, r9)     // Catch:{ all -> 0x26ee }
        L_0x1879:
            boolean r0 = r46.A0B()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1a5f
            goto L_0x1907
        L_0x1881:
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1898
            r0 = 36326721720563656(0x810ef6000237c8, double:3.036503319827343E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1898
            r0 = 37171146650550819(0x840ef600000223, double:3.570521045777496E-306)
            goto L_0x189d
        L_0x1898:
            r0 = 37165726401888651(0x840a080001018b, double:3.567093258697952E-306)
        L_0x189d:
            double r4 = X.182.A00(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Double r0 = java.lang.Double.valueOf(r4)     // Catch:{ all -> 0x26ee }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x26ee }
            r0 = 36321301473076473(0x810a08001524f9, double:3.033075533490864E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x18e7
            if (r30 == 0) goto L_0x18b6
            goto L_0x18bf
        L_0x18b6:
            android.content.Context r0 = X.C51966G9m.A0O(r3)     // Catch:{ all -> 0x26ee }
            int r0 = X.AnonymousClass0nB.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x18c7
        L_0x18bf:
            android.util.Size r0 = r30.BJW()     // Catch:{ all -> 0x26ee }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x26ee }
        L_0x18c7:
            float r0 = (float) r0     // Catch:{ all -> 0x26ee }
            float r1 = r12.A00()     // Catch:{ all -> 0x26ee }
            float r1 = r1 / r34
            float r0 = r0 * r1
            r1 = 37165726403264913(0x840a0800160191, double:3.5670932595683054E-306)
            float r121 = X.C51965G9l.A00(r13, r6, r1)     // Catch:{ all -> 0x26ee }
            android.content.Context r116 = X.C51966G9m.A0O(r3)     // Catch:{ all -> 0x26ee }
            android.graphics.drawable.GradientDrawable$Orientation r117 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP     // Catch:{ all -> 0x26ee }
            r118 = r4
            r120 = r0
            android.graphics.drawable.ShapeDrawable r0 = X.GIZ.A01(r116, r117, r118, r120, r121)     // Catch:{ all -> 0x26ee }
            goto L_0x186f
        L_0x18e7:
            android.content.Context r1 = X.C51966G9m.A0O(r3)     // Catch:{ all -> 0x26ee }
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP     // Catch:{ all -> 0x26ee }
            android.graphics.drawable.GradientDrawable r0 = X.GIZ.A00(r1, r0, r4)     // Catch:{ all -> 0x26ee }
            goto L_0x186f
        L_0x18f3:
            java.lang.String r0 = "overlay_gradient_scene_background_fade_out"
            goto L_0x17e3
        L_0x18f7:
            r0 = r15
            goto L_0x1752
        L_0x18fa:
            r0 = r15
            goto L_0x1731
        L_0x18fd:
            r1 = r54
            r0 = r34
            X.2WX r0 = X.C51971G9r.A0X(r15, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            goto L_0x1721
        L_0x1907:
            if (r241 != 0) goto L_0x190d
            r202 = 0
            if (r200 == 0) goto L_0x190f
        L_0x190d:
            r202 = 1
        L_0x190f:
            r0 = r112
            boolean r0 = r0.A1q     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1925
            r0 = r112
            boolean r0 = r0.A1p     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1922
            r0 = r112
            boolean r0 = r0.A2z     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1922
            goto L_0x1925
        L_0x1922:
            r203 = 0
            goto L_0x1927
        L_0x1925:
            r203 = 1
        L_0x1927:
            r0 = r112
            java.lang.Boolean r1 = r0.A0y     // Catch:{ all -> 0x26ee }
            r199 = 1
            r0 = r109
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1939
            if (r16 != 0) goto L_0x1939
            r199 = 0
        L_0x1939:
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x26ee }
            r3.<init>()     // Catch:{ all -> 0x26ee }
            r2 = 2131432100(0x7f0b12a4, float:1.8485948E38)
            r0 = 36315769555783185(0x810500001e0e11, double:3.0295771267193456E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r3.put(r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r110
            r0 = r34
            X.9JQ r2 = X.C51965G9l.A0b(r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r5 = 0
            r1 = r54
            X.2WX r4 = X.C51973G9u.A0S(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r4, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A0E     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r4 = X.C51971G9r.A0Y(r2, r1, r3, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A0D     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "clips_touchable_background"
            X.9JS r3 = X.C51965G9l.A0d(r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r1 = X.C51973G9u.A0T(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = 0
            if (r203 == 0) goto L_0x1985
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x1985:
            X.2WX r3 = X.C52112GFg.A01(r1, r0)     // Catch:{ all -> 0x26ee }
            X.2V1 r4 = r43.Aqq()     // Catch:{ all -> 0x26ee }
            if (r203 == 0) goto L_0x19fa
            r1 = 36321584942556736(0x810a4a002e2640, double:3.033254800731622E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x19fa
        L_0x199c:
            X.3Zd r1 = X.C243533Zd.LOCAL     // Catch:{ all -> 0x26ee }
            r0 = r37
            X.2WX r3 = X.C51971G9r.A0V(r4, r3, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = 2131430271(0x7f0b0b7f, float:1.8482238E38)
            java.lang.Integer r2 = X.AnonymousClass05K.A0B     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r2 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            if (r203 != 0) goto L_0x19d6
            r0 = 36315769555914259(0x81050000200e13, double:3.029577126802237E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x19d6
            X.3Ds r116 = X.C238863Ds.LIKE_LINK     // Catch:{ all -> 0x26ee }
            r117 = r82
            r118 = r15
            r119 = r248
            r120 = r6
            r121 = r246
            r122 = r15
            r123 = r109
            r124 = r11
            X.2WX r5 = X.GFM.A00(r116, r117, r118, r119, r120, r121, r122, r123, r124)     // Catch:{ all -> 0x26ee }
        L_0x19d6:
            X.2WX r1 = r2.A00(r5)     // Catch:{ all -> 0x26ee }
            X.GH4 r3 = new X.GH4     // Catch:{ all -> 0x26ee }
            r193 = r3
            r194 = r43
            r195 = r111
            r196 = r41
            r197 = r12
            r198 = r45
            r200 = r24
            r193.<init>(r194, r195, r196, r197, r198, r199, r200, r201, r202, r203)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.9JS r2 = X.C51965G9l.A0d(r2, r3, r0)     // Catch:{ all -> 0x26ee }
            r0 = r82
            if (r1 != r0) goto L_0x19fe
            goto L_0x19fd
        L_0x19fa:
            java.lang.String r37 = "caption_bg"
            goto L_0x199c
        L_0x19fd:
            r1 = 0
        L_0x19fe:
            X.2WX r1 = X.C51965G9l.A0X(r1, r2)     // Catch:{ all -> 0x26ee }
            if (r202 != 0) goto L_0x1a09
            if (r24 != 0) goto L_0x1a09
            if (r201 != 0) goto L_0x1a09
            goto L_0x1a0b
        L_0x1a09:
            r0 = 0
            goto L_0x1a22
        L_0x1a0b:
            X.Ixb r0 = new X.Ixb     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r69
            r118 = r6
            r119 = r111
            r120 = r43
            r121 = r41
            r122 = r12
            r116.<init>(r117, r118, r119, r120, r121, r122)     // Catch:{ all -> 0x26ee }
            X.2WX r0 = X.C51972G9s.A0V(r15, r0)     // Catch:{ all -> 0x26ee }
        L_0x1a22:
            X.2WX r5 = r1.A00(r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r4)     // Catch:{ all -> 0x26ee }
            if (r199 == 0) goto L_0x1a5a
            r2 = r110
            r1 = r54
            r0 = r34
            X.2WX r4 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r4, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            if (r16 == 0) goto L_0x1a46
            r0 = 2131231395(0x7f0802a3, float:1.807887E38)
            goto L_0x1a51
        L_0x1a46:
            android.content.Context r1 = X.C243803a8.A00(r3)     // Catch:{ all -> 0x26ee }
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r0 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x1a51:
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r3, r0)     // Catch:{ all -> 0x26ee }
            X.2V1 r0 = r3.A00     // Catch:{ all -> 0x26ee }
            X.C51974G9v.A0h(r1, r0, r3, r2)     // Catch:{ all -> 0x26ee }
        L_0x1a5a:
            r0 = r43
            X.C51967G9n.A1E(r3, r0, r5)     // Catch:{ all -> 0x26ee }
        L_0x1a5f:
            X.GGB r42 = new X.GGB     // Catch:{ all -> 0x26ee }
            r1 = r42
            r0 = r112
            r1.<init>(r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 500(0x1f4, float:7.0E-43)
            X.4Ex r3 = new X.4Ex     // Catch:{ all -> 0x26ee }
            r3.<init>(r0)     // Catch:{ all -> 0x26ee }
            if (r145 == 0) goto L_0x1aae
            r2 = r76
            r1 = r49
            r0 = r17
            java.lang.String[] r1 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x26ee }
            r0 = r81
            X.4Ey r2 = X.2Vi.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r66
            r2.A03(r0)     // Catch:{ all -> 0x26ee }
            r0 = r84
            r2.A02(r0)     // Catch:{ all -> 0x26ee }
            r2.A02 = r3     // Catch:{ all -> 0x26ee }
            java.lang.String r1 = "trans_key_author_info"
            java.lang.String r0 = "trans_key_ufi_end_scene"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x26ee }
            r0 = r81
            X.4Ey r4 = X.2Vi.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            r1 = r84
            r0 = r66
            X.C51969G9p.A1H(r3, r4, r0, r1)     // Catch:{ all -> 0x26ee }
            X.4Ey[] r1 = new X.AnonymousClass4Ey[]{r2, r4}     // Catch:{ all -> 0x26ee }
            r0 = 300(0x12c, float:4.2E-43)
            X.2Vm r2 = new X.2Vm     // Catch:{ all -> 0x26ee }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1acb
        L_0x1aae:
            boolean r0 = X.C51969G9p.A1V(r89)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1b0b
            r2 = r76
            r1 = r49
            r0 = r17
            java.lang.String[] r1 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x26ee }
            r0 = r81
            X.4Ey r2 = X.2Vi.A01(r0, r1)     // Catch:{ all -> 0x26ee }
            r1 = r84
            r0 = r66
            X.C51969G9p.A1H(r3, r2, r0, r1)     // Catch:{ all -> 0x26ee }
        L_0x1acb:
            X.AnonymousClass4F7.A00(r10, r2)     // Catch:{ all -> 0x26ee }
            boolean r5 = X.C51969G9p.A1V(r78)     // Catch:{ all -> 0x26ee }
            boolean r1 = X.C51969G9p.A1V(r77)     // Catch:{ all -> 0x26ee }
            X.GGC r41 = new X.GGC     // Catch:{ all -> 0x26ee }
            r0 = r41
            r0.<init>(r5, r1)     // Catch:{ all -> 0x26ee }
            X.1Av r4 = X.1Au.A00(r6)     // Catch:{ all -> 0x26ee }
            X.0xa r1 = r4.A01     // Catch:{ all -> 0x26ee }
            java.lang.String r0 = "num_times_seen_clips_fullscreen_view_nux"
            int r0 = r1.getInt(r0, r11)     // Catch:{ all -> 0x26ee }
            long r2 = (long) r0     // Catch:{ all -> 0x26ee }
            r0 = 36607337704003121(0x820e2e00051631, double:3.21396599770433E-306)
            long r0 = X.182.A01(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r3 = X.C51970G9q.A1T(r7)
            r0 = 36607337703937584(0x820e2e00041630, double:3.213965997662884E-306)
            long r0 = X.182.A01(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "fullscreen_view_nux_last_impression_timestamp_ms"
            boolean r0 = X.1Av.A07(r4, r2, r0)     // Catch:{ all -> 0x26ee }
            if (r3 == 0) goto L_0x1b11
            goto L_0x1b0d
        L_0x1b0b:
            r2 = 0
            goto L_0x1acb
        L_0x1b0d:
            r133 = 1
            if (r0 != 0) goto L_0x1b13
        L_0x1b11:
            r133 = 0
        L_0x1b13:
            r0 = 36607337703740975(0x820e2e0001162f, double:3.213965997538548E-306)
            long r131 = X.182.A01(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.GGD r127 = new X.GGD     // Catch:{ all -> 0x26ee }
            r128 = r245
            r129 = r4
            r130 = r50
            r127.<init>(r128, r129, r130, r131, r133)     // Catch:{ all -> 0x26ee }
            r0 = 36325862727103785(0x810e2e00023529, double:3.035960088904432E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1b70
            X.5o2 r1 = X.C295365o2.ORGANIC     // Catch:{ all -> 0x26ee }
            r0 = r247
            if (r0 != r1) goto L_0x1b70
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1b6d
            boolean r119 = r0.A5y()     // Catch:{ all -> 0x26ee }
        L_0x1b42:
            r0 = 36325862727431467(0x810e2e0007352b, double:3.035960089111659E-306)
            boolean r120 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r0 = 36325862727365930(0x810e2e0006352a, double:3.0359600890702133E-306)
            boolean r121 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            X.GCk r1 = new X.GCk     // Catch:{ all -> 0x26ee }
            r1.<init>(r6)     // Catch:{ all -> 0x26ee }
            r0 = r248
            X.1Xj r0 = r0.A02     // Catch:{ all -> 0x26ee }
            boolean r122 = com.instagram.save.api.SaveApiUtil.A09(r6, r0)     // Catch:{ all -> 0x26ee }
            X.GNs r125 = new X.GNs     // Catch:{ all -> 0x26ee }
            r116 = r125
            r117 = r245
            r118 = r1
            r116.<init>(r117, r118, r119, r120, r121, r122)     // Catch:{ all -> 0x26ee }
            goto L_0x1b72
        L_0x1b6d:
            r119 = 0
            goto L_0x1b42
        L_0x1b70:
            r125 = 0
        L_0x1b72:
            if (r39 != 0) goto L_0x1ba4
            boolean r133 = X.2Y9.A00     // Catch:{ all -> 0x26ee }
            java.util.List r3 = r12.A0W     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = r12.A0T     // Catch:{ all -> 0x26ee }
            X.6ag r0 = r12.A0D     // Catch:{ all -> 0x26ee }
            X.GGE r1 = new X.GGE     // Catch:{ all -> 0x26ee }
            r116 = r1
            r117 = r244
            r118 = r248
            r119 = r245
            r120 = r222
            r121 = r6
            r122 = r246
            r123 = r0
            r124 = r229
            r126 = r41
            r128 = r42
            r129 = r30
            r130 = r221
            r131 = r2
            r132 = r3
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133)     // Catch:{ all -> 0x26ee }
            r0 = r43
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
        L_0x1ba4:
            X.5o2 r24 = X.C295365o2.ORGANIC     // Catch:{ all -> 0x26ee }
            r1 = r247
            r0 = r24
            if (r1 != r0) goto L_0x1c11
            r0 = r248
            com.instagram.user.model.User r0 = r0.A08(r6)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1c11
            X.GIW r1 = new X.GIW     // Catch:{ all -> 0x26ee }
            r0 = r248
            r1.<init>(r0)     // Catch:{ all -> 0x26ee }
            r0 = r43
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
        L_0x1bc0:
            boolean r0 = X.C51969G9p.A1V(r225)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2680
            r0 = r110
            r1 = r34
            X.9JQ r3 = X.C51965G9l.A0b(r0, r1, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r3 = X.C51973G9u.A0T(r15, r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r2 = X.C243573Zh.FLEX_END     // Catch:{ all -> 0x26ee }
            r1 = r110
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r43
            X.2V1 r2 = r0.A00     // Catch:{ all -> 0x26ee }
            X.3Zd r1 = X.C243533Zd.LOCAL     // Catch:{ all -> 0x26ee }
            r0 = r93
            X.2WX r4 = X.C51971G9r.A0V(r2, r3, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r2)     // Catch:{ all -> 0x26ee }
            java.lang.ref.WeakReference r213 = X.C51965G9l.A0v(r229)     // Catch:{ all -> 0x26ee }
            int r214 = X.C51970G9q.A09(r243)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.C52076GDw.A03(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1c0e
            boolean r216 = X.C51969G9p.A1V(r103)     // Catch:{ all -> 0x26ee }
        L_0x1c02:
            boolean r0 = X.C52076GDw.A03(r248)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x265a
            boolean r60 = X.C51969G9p.A1V(r103)     // Catch:{ all -> 0x26ee }
            goto L_0x265a
        L_0x1c0e:
            r216 = r60
            goto L_0x1c02
        L_0x1c11:
            r0 = r112
            boolean r0 = r0.A1q     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1c41
            r2 = r110
            r1 = r54
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r3 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            android.content.Context r1 = X.C243803a8.A00(r43)     // Catch:{ all -> 0x26ee }
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r1 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r43
            android.graphics.drawable.Drawable r2 = X.C244013aV.A0D(r0, r1)     // Catch:{ all -> 0x26ee }
            X.2V1 r1 = r0.A00     // Catch:{ all -> 0x26ee }
            X.C51974G9v.A0h(r2, r1, r0, r3)     // Catch:{ all -> 0x26ee }
        L_0x1c41:
            r0 = 36322959329667788(0x810b8a00092acc, double:3.034123968674864E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r16 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            if (r0 == 0) goto L_0x1cf6
            if (r5 == 0) goto L_0x1c51
            goto L_0x1c54
        L_0x1c51:
            X.2V5 r1 = r12.A00     // Catch:{ all -> 0x26ee }
            goto L_0x1c5d
        L_0x1c54:
            java.lang.Float r0 = java.lang.Float.valueOf(r70)     // Catch:{ all -> 0x26ee }
            X.2V5 r1 = new X.2V5     // Catch:{ all -> 0x26ee }
            r1.<init>(r0)     // Catch:{ all -> 0x26ee }
        L_0x1c5d:
            X.9JS r2 = new X.9JS     // Catch:{ all -> 0x26ee }
            r0 = r110
            r2.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = r54
            r0 = r34
            X.2WX r3 = X.C51973G9u.A0S(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r8 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.G9t.A0w(r43)     // Catch:{ all -> 0x26ee }
            X.2V1 r9 = r2.A00     // Catch:{ all -> 0x26ee }
            r113 = r12
            r114 = r115
            r115 = r9
            r116 = r64
            r117 = r47
            r118 = r2
            r119 = r107
            r120 = r248
            r121 = r46
            r123 = r20
            r124 = r109
            r122 = r136
            float r1 = r113.A04(r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124)     // Catch:{ all -> 0x26ee }
            r0 = r51
            X.C51967G9n.A19(r0, r1)     // Catch:{ all -> 0x26ee }
            float r1 = X.C51970G9q.A02(r51)     // Catch:{ all -> 0x26ee }
            r0 = r99
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x26ee }
            X.2Wd r0 = (X.2Wd) r0     // Catch:{ all -> 0x26ee }
            long r3 = r0.A00     // Catch:{ all -> 0x26ee }
            int r0 = X.C51968G9o.A09(r2, r3)     // Catch:{ all -> 0x26ee }
            float r0 = (float) r0     // Catch:{ all -> 0x26ee }
            float r1 = r1 + r0
            int r0 = (int) r1     // Catch:{ all -> 0x26ee }
            long r0 = (long) r0     // Catch:{ all -> 0x26ee }
            long r0 = r0 | r16
            long r3 = X.C244013aV.A03(r2)     // Catch:{ all -> 0x26ee }
            X.9JR r3 = X.C51967G9n.A0U(r11, r3)     // Catch:{ all -> 0x26ee }
            X.2WX r7 = X.C51974G9v.A0F(r15, r3, r11, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r5 = X.C243573Zh.FLEX_START     // Catch:{ all -> 0x26ee }
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r9)     // Catch:{ all -> 0x26ee }
            if (r26 == 0) goto L_0x1ce1
            if (r18 == 0) goto L_0x1ce1
            r3 = 4632515166703976448(0x404a000000000000, double:52.0)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x26ee }
            X.2WX r4 = X.AnonymousClass9JR.A00(r15, r0, r11, r3)     // Catch:{ all -> 0x26ee }
            X.2V1 r3 = r1.A00     // Catch:{ all -> 0x26ee }
            r0 = r32
            X.2Wb r0 = X.G9t.A0v(r0, r3)     // Catch:{ all -> 0x26ee }
            X.2Tl r32 = X.C243563Zg.A02(r0, r1, r4)     // Catch:{ all -> 0x26ee }
        L_0x1ce1:
            r0 = r32
            r1.A00(r0)     // Catch:{ all -> 0x26ee }
            X.2Tl r0 = X.C243563Zg.A07(r1, r2, r7, r5, r15)     // Catch:{ all -> 0x26ee }
            r2.A00(r0)     // Catch:{ all -> 0x26ee }
            r0 = r43
            X.2Tl r1 = X.C243563Zg.A02(r2, r0, r8)     // Catch:{ all -> 0x26ee }
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
        L_0x1cf6:
            if (r21 == 0) goto L_0x1d4d
            r0 = 36326996598405232(0x810f3600013870, double:3.0366771536812E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1d4d
            if (r30 == 0) goto L_0x1d06
            goto L_0x1d0f
        L_0x1d06:
            android.content.Context r0 = X.C51966G9m.A0O(r43)     // Catch:{ all -> 0x26ee }
            int r4 = X.AnonymousClass0nB.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1d17
        L_0x1d0f:
            android.util.Size r0 = r30.BJW()     // Catch:{ all -> 0x26ee }
            int r4 = r0.getHeight()     // Catch:{ all -> 0x26ee }
        L_0x1d17:
            r2 = r54
            r1 = r110
            r0 = r34
            X.2WX r3 = X.C51974G9v.A0O(r15, r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r3 = X.C51971G9r.A0Y(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.G9t.A0w(r43)     // Catch:{ all -> 0x26ee }
            java.lang.String r120 = r246.getModuleName()     // Catch:{ all -> 0x26ee }
            java.lang.Integer r119 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x26ee }
            X.Gx0 r1 = new X.Gx0     // Catch:{ all -> 0x26ee }
            r113 = r1
            r114 = r248
            r115 = r245
            r116 = r6
            r117 = r21
            r118 = r45
            r113.<init>(r114, r115, r116, r117, r118, r119, r120)     // Catch:{ all -> 0x26ee }
            r0 = r43
            X.C51971G9r.A1C(r1, r2, r0, r3)     // Catch:{ all -> 0x26ee }
        L_0x1d4d:
            X.GEn r2 = r205.Bau()     // Catch:{ all -> 0x26ee }
            if (r2 == 0) goto L_0x1d68
            X.Iny r3 = new X.Iny     // Catch:{ all -> 0x26ee }
            r1 = r95
            r0 = r46
            r3.<init>(r1, r2, r12, r0)     // Catch:{ all -> 0x26ee }
            X.GGG r1 = new X.GGG     // Catch:{ all -> 0x26ee }
            r0 = r71
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x26ee }
            r0 = r43
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
        L_0x1d68:
            X.Gaj r1 = r205.AtN()     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x1d83
            if (r30 == 0) goto L_0x1d71
            goto L_0x1d73
        L_0x1d71:
            r3 = r15
            goto L_0x1d77
        L_0x1d73:
            android.util.Size r3 = r30.BJW()     // Catch:{ all -> 0x26ee }
        L_0x1d77:
            X.GTg r2 = new X.GTg     // Catch:{ all -> 0x26ee }
            r0 = r71
            r2.<init>(r3, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r43
            r0.A00(r2)     // Catch:{ all -> 0x26ee }
        L_0x1d83:
            r0 = 36322959329667788(0x810b8a00092acc, double:3.034123968674864E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1d97
            if (r18 == 0) goto L_0x1d97
            r0 = 4632515166703976448(0x404a000000000000, double:52.0)
            long r7 = java.lang.Double.doubleToRawLongBits(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1d9b
        L_0x1d97:
            long r7 = X.C51969G9p.A0D()     // Catch:{ all -> 0x26ee }
        L_0x1d9b:
            boolean r0 = r248.A0J()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1db1
            if (r158 != 0) goto L_0x1db1
            r0 = r244
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1db1
            boolean r1 = r0.A0M     // Catch:{ all -> 0x26ee }
            r53 = 1
            r0 = r109
            if (r1 == r0) goto L_0x1db3
        L_0x1db1:
            r53 = 0
        L_0x1db3:
            X.2V5 r0 = r12.A00     // Catch:{ all -> 0x26ee }
            r25 = r0
            r1 = r0
            r0 = r110
            X.2WX r3 = X.C51971G9r.A0W(r1, r15, r0)     // Catch:{ all -> 0x26ee }
            X.J6P r2 = X.J6P.A00(r12, r14)     // Catch:{ all -> 0x26ee }
            r1 = r38
            r0 = r91
            X.2WX r36 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r32 = X.G9t.A0w(r43)     // Catch:{ all -> 0x26ee }
            r1 = r54
            r0 = r34
            X.2WX r19 = X.C51971G9r.A0X(r15, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            X.3Zh r37 = X.C243573Zh.FLEX_END     // Catch:{ all -> 0x26ee }
            r0 = r32
            X.2V1 r0 = r0.A00     // Catch:{ all -> 0x26ee }
            r77 = r0
            X.2Wb r18 = X.AnonymousClass7TG.A0S(r77)     // Catch:{ all -> 0x26ee }
            r0 = r34
            X.2WX r45 = X.C51971G9r.A0X(r15, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r0 = r18
            X.2V1 r0 = r0.A00     // Catch:{ all -> 0x26ee }
            r65 = r0
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r65)     // Catch:{ all -> 0x26ee }
            r2 = r110
            r1 = r75
            r0 = r96
            X.2WX r4 = X.C51971G9r.A0Y(r15, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r22 = X.AnonymousClass05K.A0A     // Catch:{ all -> 0x26ee }
            r0 = r22
            X.9JR r3 = X.C51965G9l.A0c(r0, r11, r7)     // Catch:{ all -> 0x26ee }
            r2 = r70
            r1 = r54
            r0 = r109
            X.2WX r3 = X.C51973G9u.A0S(r4, r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x26ee }
            r2 = r21
            r1 = r84
            X.2WX r56 = X.C51971G9r.A0X(r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2V1 r0 = r14.A00     // Catch:{ all -> 0x26ee }
            r63 = r0
            X.2Wb r7 = X.AnonymousClass7TG.A0S(r63)     // Catch:{ all -> 0x26ee }
            if (r33 == 0) goto L_0x1e45
            r0 = r33
            boolean r1 = r0.A08     // Catch:{ all -> 0x26ee }
            r3 = 1
            if (r1 != r3) goto L_0x1e46
        L_0x1e29:
            r0 = r26
            r7.A00(r0)     // Catch:{ all -> 0x26ee }
            r0 = r56
            X.2Tl r0 = X.C243563Zg.A02(r7, r14, r0)     // Catch:{ all -> 0x26ee }
            r14.A00(r0)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1f39
            X.GJ5 r1 = X.GJ5.AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 != r1) goto L_0x1f39
            goto L_0x1f30
        L_0x1e45:
            r3 = 0
        L_0x1e46:
            r0 = r248
            X.1Xj r1 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x1ea5
            X.3gp r0 = r1.A1W()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1eb3
            X.4Nf r0 = r221.Auf()     // Catch:{ all -> 0x26ee }
            r116 = 0
            if (r0 == 0) goto L_0x1e7d
            boolean r0 = r0.A00     // Catch:{ all -> 0x26ee }
            java.lang.Boolean r115 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x26ee }
        L_0x1e60:
            boolean r120 = r1.CcK()     // Catch:{ all -> 0x26ee }
            boolean r121 = r1.CeS()     // Catch:{ all -> 0x26ee }
            boolean r122 = r1.A51()     // Catch:{ all -> 0x26ee }
            boolean r123 = r1.A4L()     // Catch:{ all -> 0x26ee }
            java.util.List r118 = X.C51965G9l.A0w(r1)     // Catch:{ all -> 0x26ee }
            X.3WR r114 = r1.CEL()     // Catch:{ all -> 0x26ee }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)     // Catch:{ all -> 0x26ee }
            goto L_0x1e80
        L_0x1e7d:
            r115 = r15
            goto L_0x1e60
        L_0x1e80:
            if (r0 == 0) goto L_0x1e86
            java.lang.String r116 = r0.getId()     // Catch:{ all -> 0x26ee }
        L_0x1e86:
            java.lang.String r117 = X.C51966G9m.A1D(r1)     // Catch:{ all -> 0x26ee }
            r113 = r6
            r119 = r11
            boolean r2 = X.AnonymousClass3WP.A09(r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123)     // Catch:{ all -> 0x26ee }
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)     // Catch:{ all -> 0x26ee }
            r1 = 0
            if (r0 == 0) goto L_0x1e9f
            boolean r0 = X.2R8.A04(r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1ea2
        L_0x1e9f:
            if (r2 != 0) goto L_0x1ea2
            r1 = 1
        L_0x1ea2:
            if (r1 == 0) goto L_0x1ea5
            goto L_0x1ea8
        L_0x1ea5:
            r0 = 0
            goto L_0x1f29
        L_0x1ea8:
            r0 = 36323663703715181(0x810c2e00002d6d, double:3.034569417658722E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1ea5
        L_0x1eb3:
            long r0 = X.C244013aV.A03(r7)     // Catch:{ all -> 0x26ee }
            int r5 = X.C51968G9o.A09(r7, r0)     // Catch:{ all -> 0x26ee }
            long r50 = X.C51969G9p.A0B()     // Catch:{ all -> 0x26ee }
            r0 = r50
            int r0 = X.C51968G9o.A09(r7, r0)     // Catch:{ all -> 0x26ee }
            int r5 = r5 - r0
            if (r3 == 0) goto L_0x1f2e
            r0 = 4634274385308418048(0x4050400000000000, double:65.0)
            int r3 = X.C51972G9s.A0C(r7, r0)     // Catch:{ all -> 0x26ee }
        L_0x1ed1:
            int r3 = r3 + r5
            r2 = r72
            r1 = r73
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r15, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            long r0 = (long) r5     // Catch:{ all -> 0x26ee }
            long r61 = r0 | r16
            long r8 = (long) r3     // Catch:{ all -> 0x26ee }
            long r8 = r8 | r16
            r4 = r2
            r3 = r21
            r0 = r61
            r2 = r109
            X.2WX r0 = X.AnonymousClass9JR.A00(r4, r3, r2, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r2 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x26ee }
            r1 = r0
            r0 = r109
            X.2WX r3 = X.AnonymousClass9JR.A00(r1, r2, r0, r8)     // Catch:{ all -> 0x26ee }
            int r0 = r20 - r5
            long r1 = (long) r0     // Catch:{ all -> 0x26ee }
            long r1 = r1 | r16
            r0 = r110
            X.2WX r2 = X.AnonymousClass9JR.A00(r3, r0, r11, r1)     // Catch:{ all -> 0x26ee }
            X.2V1 r0 = r7.Aqq()     // Catch:{ all -> 0x26ee }
            r3 = r15
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r0)     // Catch:{ all -> 0x26ee }
            if (r40 == 0) goto L_0x1f10
            r0 = r40
            X.GB6 r3 = r0.A0A     // Catch:{ all -> 0x26ee }
        L_0x1f10:
            X.Gus r0 = new X.Gus     // Catch:{ all -> 0x26ee }
            r113 = r0
            r114 = r3
            r115 = r248
            r116 = r245
            r117 = r246
            r118 = r6
            r119 = r229
            r120 = r50
            r113.<init>(r114, r115, r116, r117, r118, r119, r120)     // Catch:{ all -> 0x26ee }
            X.2Tp r0 = X.C51967G9n.A0Q(r0, r1, r7, r2)     // Catch:{ all -> 0x26ee }
        L_0x1f29:
            r7.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1e29
        L_0x1f2e:
            r3 = 0
            goto L_0x1ed1
        L_0x1f30:
            if (r234 != 0) goto L_0x1f34
            if (r233 == 0) goto L_0x1f39
        L_0x1f34:
            r0 = r85
            r14.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x1f39:
            java.lang.Integer r8 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x26ee }
            r0 = r23
            X.2WX r33 = X.C51971G9r.A0X(r15, r8, r0, r11)     // Catch:{ all -> 0x26ee }
            X.2Wb r26 = X.AnonymousClass7TG.A0S(r63)     // Catch:{ all -> 0x26ee }
            X.2Wb r3 = X.G9t.A0w(r26)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.A0J()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1f58
            r0 = r88
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x26ee }
            X.GJF r0 = X.GJF.CLOSED     // Catch:{ all -> 0x26ee }
            r4 = 1
            if (r1 == r0) goto L_0x1f59
        L_0x1f58:
            r4 = 0
        L_0x1f59:
            r2 = r37
            r1 = r110
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r15, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r25
            r0 = r110
            X.2WX r5 = X.C51971G9r.A0W(r1, r2, r0)     // Catch:{ all -> 0x26ee }
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1fa6
            X.1Xj r0 = X.C51966G9m.A0s(r248)     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.A5o()     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x1f85
            X.1Xj r0 = X.C51966G9m.A0s(r248)     // Catch:{ all -> 0x26ee }
            boolean r0 = r0.A5n()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1fa6
        L_0x1f85:
            r1 = r107
            r0 = r248
            int r0 = A05(r1, r0, r4)     // Catch:{ all -> 0x26ee }
            long r1 = X.C244013aV.A0C(r3, r0)     // Catch:{ all -> 0x26ee }
        L_0x1f91:
            java.lang.Integer r4 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x26ee }
            X.2WX r4 = X.AnonymousClass9JR.A00(r5, r4, r11, r1)     // Catch:{ all -> 0x26ee }
            r0 = r108
            X.J6P r2 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            r1 = r38
            r0 = r91
            X.2WX r2 = X.C51971G9r.A0Y(r4, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1fbf
        L_0x1fa6:
            r0 = 36328860614540942(0x8110e800063e8e, double:3.0378559649912136E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x1f85
            r0 = 36610335591307252(0x8210e8000717f4, double:3.2158618737069856E-306)
            int r0 = X.DbS.A04(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            long r1 = X.C51965G9l.A07(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x1f91
        L_0x1fbf:
            if (r159 == 0) goto L_0x1fd3
            r1 = r110
            r0 = r34
            X.2WX r2 = X.C51971G9r.A0X(r2, r1, r0, r11)     // Catch:{ all -> 0x26ee }
            r1 = r54
            X.9JQ r0 = X.C51965G9l.A0b(r1, r0, r11)     // Catch:{ all -> 0x26ee }
            X.2WX r2 = X.C51965G9l.A0X(r2, r0)     // Catch:{ all -> 0x26ee }
        L_0x1fd3:
            X.Ixk r1 = new X.Ixk     // Catch:{ all -> 0x26ee }
            r113 = r1
            r114 = r94
            r115 = r99
            r116 = r12
            r117 = r52
            r118 = r3
            r119 = r107
            r120 = r47
            r113.<init>(r114, r115, r116, r117, r118, r119, r120)     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r2 = X.C51971G9r.A0Z(r2, r0, r1, r15)     // Catch:{ all -> 0x26ee }
            X.2V1 r5 = r3.A00     // Catch:{ all -> 0x26ee }
            X.3Zd r23 = X.C243533Zd.LOCAL     // Catch:{ all -> 0x26ee }
            r1 = r23
            r0 = r76
            X.2WX r4 = X.C51971G9r.A0V(r5, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r9 = X.AnonymousClass05K.A0D     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "clips_media_info_component"
            r0 = r91
            X.2WX r4 = X.C51971G9r.A0Y(r4, r9, r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = 2131430135(0x7f0b0af7, float:1.8481962E38)
            java.lang.Integer r2 = X.AnonymousClass05K.A0B     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x26ee }
            r0 = r91
            X.2WX r7 = X.C51971G9r.A0Y(r4, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r5)     // Catch:{ all -> 0x26ee }
            r0 = r46
            boolean r0 = r0 instanceof X.C52142GGk     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x203a
            r0 = r46
            boolean r0 = r0 instanceof X.C52670Gai     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x203a
            r0 = r46
            boolean r0 = r0 instanceof X.HK0     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x203a
            r0 = r46
            com.instagram.common.session.UserSession r0 = r0.A0H     // Catch:{ all -> 0x26ee }
            boolean r1 = X.C56375HxT.A00(r0)     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x203a
            boolean r1 = X.C56375HxT.A01(r0)     // Catch:{ all -> 0x26ee }
            r0 = 1
            if (r1 == 0) goto L_0x203b
        L_0x203a:
            r0 = 0
        L_0x203b:
            if (r0 != 0) goto L_0x2069
            if (r53 != 0) goto L_0x2069
            X.2V1 r4 = r2.A00     // Catch:{ all -> 0x26ee }
            X.2Uc r0 = new X.2Uc     // Catch:{ all -> 0x26ee }
            r0.<init>()     // Catch:{ all -> 0x26ee }
            X.GGF r1 = new X.GGF     // Catch:{ all -> 0x26ee }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x26ee }
            r0 = r64
            r1.A0A(r0)     // Catch:{ all -> 0x26ee }
            X.3mo r0 = r1.A00     // Catch:{ all -> 0x26ee }
            X.2TC r4 = r0.A0Z()     // Catch:{ all -> 0x26ee }
            r0 = r20
            r4.A0L(r0)     // Catch:{ all -> 0x26ee }
            java.util.BitSet r5 = r1.A01     // Catch:{ all -> 0x26ee }
            java.lang.String[] r4 = X.GGF.A02     // Catch:{ all -> 0x26ee }
            r0 = r109
            X.C244113af.A00(r5, r4, r0)     // Catch:{ all -> 0x26ee }
            X.2Uc r0 = r1.A00     // Catch:{ all -> 0x26ee }
            r2.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x2069:
            X.2Tp r0 = X.C243563Zg.A0D(r2, r3, r7)     // Catch:{ all -> 0x26ee }
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
            r0 = r52
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
            r0 = r173
            boolean r0 = r0.A0A     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x20a7
            if (r40 == 0) goto L_0x207e
            goto L_0x2080
        L_0x207e:
            r1 = 0
            goto L_0x208f
        L_0x2080:
            r0 = r40
            com.instagram.common.session.UserSession r5 = r0.A03     // Catch:{ all -> 0x26ee }
            X.4DU r4 = r0.A06     // Catch:{ all -> 0x26ee }
            X.2el r2 = r0.A04     // Catch:{ all -> 0x26ee }
            X.GNw r1 = new X.GNw     // Catch:{ all -> 0x26ee }
            r0 = r111
            r1.<init>(r4, r5, r2, r0)     // Catch:{ all -> 0x26ee }
        L_0x208f:
            X.Guq r0 = new X.Guq     // Catch:{ all -> 0x26ee }
            r113 = r0
            r114 = r1
            r115 = r248
            r116 = r245
            r117 = r6
            r118 = r229
            r119 = r11
            r120 = r11
            r113.<init>(r114, r115, r116, r117, r118, r119, r120)     // Catch:{ all -> 0x26ee }
            r3.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x20a7:
            X.2Tl r2 = X.C243563Zg.A00(r3)     // Catch:{ all -> 0x26ee }
            r1 = r26
            r0 = r33
            X.C51971G9r.A1C(r2, r1, r14, r0)     // Catch:{ all -> 0x26ee }
            r1 = r45
            r0 = r18
            X.2Tl r1 = X.C243563Zg.A02(r14, r0, r1)     // Catch:{ all -> 0x26ee }
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.AdFormatType r1 = com.instagram.api.schemas.AdFormatType.GRID     // Catch:{ all -> 0x26ee }
            r0 = r248
            com.instagram.api.schemas.AdFormatType r0 = r0.A0E     // Catch:{ all -> 0x26ee }
            if (r1 != r0) goto L_0x20d1
            r0 = 36321761034184393(0x810a73000f26c9, double:3.0333661617860166E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            r1 = 1
            if (r0 == 0) goto L_0x20d2
        L_0x20d1:
            r1 = 0
        L_0x20d2:
            r0 = r173
            boolean r0 = r0.A0J     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x21eb
            if (r145 == 0) goto L_0x20dc
            if (r44 == 0) goto L_0x21eb
        L_0x20dc:
            if (r159 == 0) goto L_0x20e0
            if (r35 == 0) goto L_0x21eb
        L_0x20e0:
            if (r1 != 0) goto L_0x21eb
            boolean r0 = r248.A0J()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x20ea
            if (r158 == 0) goto L_0x21eb
        L_0x20ea:
            if (r145 == 0) goto L_0x20f1
            if (r44 == 0) goto L_0x20f1
            java.lang.String r49 = "trans_key_ufi_end_scene"
            goto L_0x20ff
        L_0x20f1:
            if (r28 != 0) goto L_0x20fd
            r0 = r112
            X.GJF r1 = r0.A0n     // Catch:{ all -> 0x26ee }
            X.GJF r0 = X.GJF.EXPANDED     // Catch:{ all -> 0x26ee }
            if (r1 == r0) goto L_0x20fd
            if (r158 == 0) goto L_0x2119
        L_0x20fd:
            r49 = r80
        L_0x20ff:
            if (r28 == 0) goto L_0x2102
            goto L_0x211c
        L_0x2102:
            if (r158 == 0) goto L_0x2119
            r0 = r112
            boolean r0 = r0.A2z     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2119
            android.content.Context r1 = X.C243803a8.A00(r18)     // Catch:{ all -> 0x26ee }
            r0 = 2130968787(0x7f0400d3, float:1.7546238E38)
            int r0 = X.2Yu.A0G(r1, r0)     // Catch:{ all -> 0x26ee }
            long r3 = (long) r0     // Catch:{ all -> 0x26ee }
            long r3 = r3 | r16
            goto L_0x212c
        L_0x2119:
            r3 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            goto L_0x212c
        L_0x211c:
            android.content.Context r2 = X.C243803a8.A00(r18)     // Catch:{ all -> 0x26ee }
            r1 = r79
            r0 = r112
            float r0 = r1.A04(r2, r6, r0)     // Catch:{ all -> 0x26ee }
            int r0 = (int) r0     // Catch:{ all -> 0x26ee }
            long r3 = (long) r0     // Catch:{ all -> 0x26ee }
            long r3 = r3 | r16
        L_0x212c:
            r0 = r112
            boolean r0 = r0.A1r     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2141
            float r0 = X.GED.A00(r245)     // Catch:{ all -> 0x26ee }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x26ee }
            X.2V5 r25 = new X.2V5     // Catch:{ all -> 0x26ee }
            r0 = r25
            r0.<init>(r1)     // Catch:{ all -> 0x26ee }
        L_0x2141:
            r2 = r37
            r1 = r110
            r0 = r96
            X.2WX r2 = X.C51971G9r.A0Y(r15, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r1 = r25
            r0 = r110
            X.2WX r1 = X.C51971G9r.A0W(r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r0 = r21
            X.2WX r5 = X.C51973G9u.A0Y(r1, r0, r11)     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "clips_ufi_component"
            r0 = r91
            X.2WX r5 = X.C51971G9r.A0Y(r5, r9, r2, r0)     // Catch:{ all -> 0x26ee }
            r2 = 49
            X.GL4 r1 = new X.GL4     // Catch:{ all -> 0x26ee }
            r0 = r102
            r1.<init>(r0, r2)     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r2 = X.C51971G9r.A0Z(r5, r0, r1, r15)     // Catch:{ all -> 0x26ee }
            r0 = r109
            X.2WX r3 = X.AnonymousClass9JR.A00(r2, r8, r0, r3)     // Catch:{ all -> 0x26ee }
            r0 = 32
            X.J6P r2 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            r1 = r38
            r0 = r91
            X.2WX r4 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r3 = r21
            r2 = r84
            r1 = r54
            r0 = r109
            X.2WX r3 = X.C51974G9v.A0O(r4, r1, r3, r2, r0)     // Catch:{ all -> 0x26ee }
            r2 = r65
            r1 = r81
            r0 = r49
            X.2WX r3 = X.C51971G9r.A0V(r2, r3, r1, r0)     // Catch:{ all -> 0x26ee }
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r65)     // Catch:{ all -> 0x26ee }
            r1 = r71
            r0 = r91
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x26ee }
            r1 = r95
            r0 = r229
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = 36326129015797276(0x810e6c000d361c, double:3.036128490946454E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x21c0
            X.GKk r71 = new X.GKk     // Catch:{ all -> 0x26ee }
            r1 = r71
            r0 = r229
            r1.<init>(r0)     // Catch:{ all -> 0x26ee }
        L_0x21c0:
            r0 = 36326129015731739(0x810e6c000c361b, double:3.036128490905008E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2209
            android.app.Activity r0 = X.C51969G9p.A0J(r2)     // Catch:{ all -> 0x26ee }
            java.lang.ref.WeakReference r69 = X.C51965G9l.A0v(r0)     // Catch:{ all -> 0x26ee }
            X.GKr r1 = new X.GKr     // Catch:{ all -> 0x26ee }
            r62 = r1
            r63 = r6
            r64 = r246
            r65 = r229
            r66 = r46
            r67 = r71
            r70 = r157
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ all -> 0x26ee }
        L_0x21e6:
            r0 = r18
            X.C51971G9r.A1C(r1, r2, r0, r3)     // Catch:{ all -> 0x26ee }
        L_0x21eb:
            r2 = r19
            r1 = r18
            r0 = r32
            X.2Tp r1 = X.C243563Zg.A0D(r1, r0, r2)     // Catch:{ all -> 0x26ee }
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.GDZ.A01(r247)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2245
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2245
            X.3OA r8 = r248.A06()     // Catch:{ all -> 0x26ee }
            goto L_0x2246
        L_0x2209:
            android.app.Activity r0 = X.C51969G9p.A0J(r2)     // Catch:{ all -> 0x26ee }
            java.lang.ref.WeakReference r139 = X.C51965G9l.A0v(r0)     // Catch:{ all -> 0x26ee }
            r0 = r68
            X.4bN r0 = r0.A03     // Catch:{ all -> 0x26ee }
            X.5o2 r1 = r0.A01     // Catch:{ all -> 0x26ee }
            r142 = 0
            r0 = r24
            boolean r140 = X.AnonymousClass7TF.A1W(r1, r0)
            r1 = r92
            r0 = r107
            if (r0 != r1) goto L_0x2227
            r142 = 1
        L_0x2227:
            X.GKl r1 = new X.GKl     // Catch:{ all -> 0x26ee }
            r128 = r1
            r129 = r173
            r130 = r244
            r131 = r248
            r132 = r245
            r133 = r6
            r134 = r246
            r135 = r229
            r136 = r46
            r137 = r71
            r138 = r68
            r141 = r157
            r128.<init>(r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142)     // Catch:{ all -> 0x26ee }
            goto L_0x21e6
        L_0x2245:
            r8 = 0
        L_0x2246:
            if (r145 == 0) goto L_0x2619
            if (r8 == 0) goto L_0x2619
            java.lang.String r20 = "end_scene_dismissal"
            r14 = r6
            r16 = r246
            r17 = r8
            r18 = r15
            r19 = r15
            X.3sc r210 = X.C254513sb.A01(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x26ee }
            r0 = r246
            X.0wc r213 = X.AnonymousClass0kN.A01(r0, r6)     // Catch:{ all -> 0x26ee }
            X.Iny r7 = new X.Iny     // Catch:{ all -> 0x26ee }
            r3 = r101
            r2 = r89
            r1 = r90
            r0 = r112
            r7.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r245
            boolean r0 = r0.A06     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2278
            r0 = r245
            r0.A06 = r11     // Catch:{ all -> 0x26ee }
            r0.A03 = r15     // Catch:{ all -> 0x26ee }
        L_0x2278:
            r0 = r83
            X.Iw1 r212 = X.C58692Iw1.A00(r7, r12, r0)     // Catch:{ all -> 0x26ee }
            X.GVB r194 = new X.GVB     // Catch:{ all -> 0x26ee }
            r61 = r194
            r62 = r105
            r63 = r212
            r64 = r210
            r65 = r213
            r66 = r7
            r67 = r220
            r61.<init>(r62, r63, r64, r65, r66, r67)     // Catch:{ all -> 0x26ee }
            android.content.Context r1 = X.C243803a8.A00(r32)     // Catch:{ all -> 0x26ee }
            X.GdP r0 = new X.GdP     // Catch:{ all -> 0x26ee }
            r0.<init>()     // Catch:{ all -> 0x26ee }
            X.2Vt r2 = new X.2Vt     // Catch:{ all -> 0x26ee }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
            X.Iy0 r196 = new X.Iy0     // Catch:{ all -> 0x26ee }
            r197 = r2
            r198 = r213
            r199 = r210
            r200 = r12
            r201 = r212
            r202 = r7
            r203 = r218
            r205 = r220
            r196.<init>(r197, r198, r199, r200, r201, r202, r203, r204, r205)     // Catch:{ all -> 0x26ee }
            r0 = 35
            X.J6P r197 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            X.Iwx r17 = new X.Iwx     // Catch:{ all -> 0x26ee }
            r3 = r98
            r2 = r17
            r1 = r111
            r0 = r112
            r2.<init>(r3, r0, r12, r1)     // Catch:{ all -> 0x26ee }
            X.3Ds r3 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON     // Catch:{ all -> 0x26ee }
            r1 = r100
            r0 = r31
            X.J6P r2 = X.J6P.A00(r0, r1)     // Catch:{ all -> 0x26ee }
            r0 = r183
            com.instagram.common.session.UserSession r1 = r0.A00     // Catch:{ all -> 0x26ee }
            r0 = 67
            X.ICy r0 = X.C56801ICy.A00(r2, r0)     // Catch:{ all -> 0x26ee }
            X.3aW r16 = X.GHY.A00(r0, r3, r1, r15)     // Catch:{ all -> 0x26ee }
            X.JG0 r14 = new X.JG0     // Catch:{ all -> 0x26ee }
            r2 = r106
            r0 = r16
            r14.<init>(r2, r0, r12)     // Catch:{ all -> 0x26ee }
            X.JAa r201 = new X.JAa     // Catch:{ all -> 0x26ee }
            r61 = r201
            r62 = r0
            r63 = r32
            r64 = r211
            r65 = r111
            r66 = r12
            r67 = r216
            r68 = r7
            r69 = r218
            r70 = r219
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ all -> 0x26ee }
            X.JAb r202 = new X.JAb     // Catch:{ all -> 0x26ee }
            r61 = r202
            r63 = r211
            r64 = r8
            r65 = r12
            r66 = r216
            r67 = r7
            r68 = r218
            r69 = r207
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ all -> 0x26ee }
            if (r218 == 0) goto L_0x2330
            r0 = 36327662318271075(0x810fd100003a63, double:3.037098157604998E-306)
            boolean r0 = X.182.A06(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x232d
            r0 = 36609137295103783(0x820fd100021727, double:3.21510406636276E-306)
            int r204 = X.DbS.A04(r13, r6, r0)     // Catch:{ all -> 0x26ee }
            goto L_0x2335
        L_0x232d:
            r204 = 0
            goto L_0x2335
        L_0x2330:
            r204 = 0
            r1 = 0
            if (r219 == 0) goto L_0x2336
        L_0x2335:
            r1 = 1
        L_0x2336:
            r0 = r248
            com.instagram.user.model.User r13 = r0.A08(r6)     // Catch:{ all -> 0x26ee }
            if (r13 != 0) goto L_0x2342
            r175 = r15
            goto L_0x23c4
        L_0x2342:
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            if (r1 == 0) goto L_0x234a
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
        L_0x234a:
            long r1 = X.C244013aV.A0C(r10, r0)     // Catch:{ all -> 0x26ee }
            r0 = r110
            X.2WX r3 = X.AnonymousClass9JR.A00(r15, r0, r11, r1)     // Catch:{ all -> 0x26ee }
            r0 = r54
            X.2WX r0 = X.AnonymousClass9JR.A00(r3, r0, r11, r1)     // Catch:{ all -> 0x26ee }
            long r2 = X.C244013aV.A0A(r10)     // Catch:{ all -> 0x26ee }
            long r4 = X.C244013aV.A06(r10)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r1 = X.AnonymousClass05K.A08     // Catch:{ all -> 0x26ee }
            X.2WX r2 = X.AnonymousClass9JR.A00(r0, r1, r11, r2)     // Catch:{ all -> 0x26ee }
            r0 = r22
            X.2WX r3 = X.AnonymousClass9JR.A00(r2, r0, r11, r4)     // Catch:{ all -> 0x26ee }
            r2 = 2131970055(0x7f134807, float:1.957705E38)
            java.lang.String r0 = r13.getUsername()     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = X.C244013aV.A0F(r10, r0, r2)     // Catch:{ all -> 0x26ee }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x26ee }
            X.2WX r4 = X.C51971G9r.A0Y(r3, r0, r2, r11)     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "profile_picture"
            r0 = r91
            X.9JS r3 = X.C51965G9l.A0d(r1, r2, r0)     // Catch:{ all -> 0x26ee }
            r2 = r21
            r1 = r84
            r0 = r109
            X.2WX r3 = X.C51973G9u.A0S(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x26ee }
            X.3Zh r2 = X.C243573Zh.CENTER     // Catch:{ all -> 0x26ee }
            r1 = r110
            r0 = r96
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r2, r0)     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = "clips_profile_pic_component"
            r0 = r91
            X.2WX r62 = X.C51971G9r.A0Y(r3, r9, r2, r0)     // Catch:{ all -> 0x26ee }
            com.instagram.common.typedurl.ImageUrl r64 = r13.Bh3()     // Catch:{ all -> 0x26ee }
            int r0 = X.2Yu.A04(r86)     // Catch:{ all -> 0x26ee }
            int r66 = X.C51969G9p.A08(r10, r0)     // Catch:{ all -> 0x26ee }
            r68 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.3bC r175 = new X.3bC     // Catch:{ all -> 0x26ee }
            r61 = r175
            r63 = r246
            r65 = r15
            r67 = r11
            r69 = r11
            r70 = r109
            r71 = r11
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x26ee }
        L_0x23c4:
            r0 = r248
            com.instagram.user.model.User r64 = r0.A08(r6)     // Catch:{ all -> 0x26ee }
            if (r64 == 0) goto L_0x23f9
            X.IxD r66 = new X.IxD     // Catch:{ all -> 0x26ee }
            r0 = r66
            r1 = r83
            r2 = r229
            r3 = r248
            r4 = r245
            r5 = r160
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x26ee }
            X.H7m r3 = new X.H7m     // Catch:{ all -> 0x26ee }
            r61 = r3
            r62 = r244
            r63 = r248
            r65 = r12
            r67 = r218
            r68 = r219
            r61.<init>(r62, r63, r64, r65, r66, r67, r68)     // Catch:{ all -> 0x26ee }
            r2 = 40
            r1 = r183
            r0 = r248
            X.JG3 r203 = X.JG3.A00(r1, r0, r3, r2)     // Catch:{ all -> 0x26ee }
            goto L_0x23fb
        L_0x23f9:
            r203 = r15
        L_0x23fb:
            if (r57 == 0) goto L_0x23fe
            goto L_0x2401
        L_0x23fe:
            r188 = r15
            goto L_0x240a
        L_0x2401:
            r1 = 2131974149(0x7f135805, float:1.9585354E38)
            r0 = r32
            java.lang.String r188 = X.C244013aV.A0E(r0, r1)     // Catch:{ all -> 0x26ee }
        L_0x240a:
            X.IoW r192 = new X.IoW     // Catch:{ all -> 0x26ee }
            r61 = r192
            r62 = r211
            r63 = r213
            r64 = r8
            r65 = r12
            r66 = r216
            r67 = r206
            r68 = r218
            r69 = r219
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69)     // Catch:{ all -> 0x26ee }
            X.GKL r9 = new X.GKL     // Catch:{ all -> 0x26ee }
            r1 = r55
            r0 = r97
            r9.<init>(r1, r12, r0)     // Catch:{ all -> 0x26ee }
            X.Iof r195 = new X.Iof     // Catch:{ all -> 0x26ee }
            r209 = r195
            r214 = r12
            r215 = r7
            r217 = r109
            r209.<init>(r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220)     // Catch:{ all -> 0x26ee }
            r0 = 33
            X.J6P r199 = X.J6P.A00(r12, r0)     // Catch:{ all -> 0x26ee }
            if (r218 == 0) goto L_0x245a
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3y0 r0 = r0.A0B     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x245a
            X.4zK r0 = r0.B68()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x245a
            java.lang.String r1 = r0.BKL()     // Catch:{ all -> 0x26ee }
            java.util.List r0 = r0.BYc()     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x24e2
            if (r0 == 0) goto L_0x24e2
            goto L_0x24bc
        L_0x245a:
            r7 = r15
            if (r218 != 0) goto L_0x24c9
            if (r219 == 0) goto L_0x24f8
            r0 = r111
            com.instagram.user.model.User r0 = X.C247643gg.A00(r6, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2474
            java.lang.String r2 = r0.getUsername()     // Catch:{ all -> 0x26ee }
            r1 = 2131974143(0x7f1357ff, float:1.9585342E38)
            r0 = r32
            java.lang.String r59 = X.C244013aV.A0F(r0, r2, r1)     // Catch:{ all -> 0x26ee }
        L_0x2474:
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r0.A09     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24ae
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24ae
            java.util.List r1 = r0.BE6()     // Catch:{ all -> 0x26ee }
            if (r1 == 0) goto L_0x24ae
            r0 = r96
            java.util.List r0 = X.00k.A0d(r1, r0)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24ae
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x26ee }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x26ee }
        L_0x2498:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24b2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0     // Catch:{ all -> 0x26ee }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2498
            r2.add(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x2498
        L_0x24ae:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x26ee }
        L_0x24b2:
            X.JwJ r4 = new X.JwJ     // Catch:{ all -> 0x26ee }
            r1 = r108
            r0 = r59
            r4.<init>((java.util.List) r2, (int) r1, (java.lang.String) r0)     // Catch:{ all -> 0x26ee }
            goto L_0x24fe
        L_0x24bc:
            boolean r0 = X.AnonymousClass7TE.A1b(r0)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x24e2
            X.BBV r7 = new X.BBV     // Catch:{ all -> 0x26ee }
            r0 = r87
            r7.<init>(r1, r0)     // Catch:{ all -> 0x26ee }
        L_0x24c9:
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3y0 r0 = r0.A0B     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24f8
            X.4zK r0 = r0.B68()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x24f8
            java.lang.String r2 = r0.BKL()     // Catch:{ all -> 0x26ee }
            java.util.List r1 = r0.BYc()     // Catch:{ all -> 0x26ee }
            if (r2 == 0) goto L_0x24f6
            goto L_0x24e4
        L_0x24e2:
            r7 = r15
            goto L_0x24c9
        L_0x24e4:
            if (r1 == 0) goto L_0x24f6
            boolean r3 = X.AnonymousClass7TE.A1b(r1)     // Catch:{ all -> 0x26ee }
            r0 = r109
            if (r3 != r0) goto L_0x24f6
            X.JwJ r4 = new X.JwJ     // Catch:{ all -> 0x26ee }
            r0 = r108
            r4.<init>((java.util.List) r1, (int) r0, (java.lang.String) r2)     // Catch:{ all -> 0x26ee }
            goto L_0x24f9
        L_0x24f6:
            r4 = r15
            goto L_0x24f9
        L_0x24f8:
            r4 = r15
        L_0x24f9:
            r1 = 2131974144(0x7f135800, float:1.9585344E38)
            if (r219 == 0) goto L_0x2501
        L_0x24fe:
            r1 = 2131974147(0x7f135803, float:1.958535E38)
        L_0x2501:
            r0 = r32
            java.lang.String r184 = X.C244013aV.A0E(r0, r1)     // Catch:{ all -> 0x26ee }
            if (r219 == 0) goto L_0x2583
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r0.A09     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2583
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2583
            java.lang.String r185 = r0.BE5()     // Catch:{ all -> 0x26ee }
        L_0x251b:
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r0.A09     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2580
            com.instagram.api.schemas.PrivacyDisclosureInfo r0 = r0.Bfm()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2580
            java.lang.String r186 = r0.Bfo()     // Catch:{ all -> 0x26ee }
        L_0x252d:
            r0 = r248
            java.lang.String r187 = r0.AyM(r6)     // Catch:{ all -> 0x26ee }
            if (r31 == 0) goto L_0x257e
            r0 = r31
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x26ee }
            r13 = r0
        L_0x253a:
            java.lang.String r8 = r8.A0b     // Catch:{ all -> 0x26ee }
            boolean r0 = X.GDZ.A01(r247)     // Catch:{ all -> 0x26ee }
            r191 = 0
            if (r0 == 0) goto L_0x255a
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x255a
            X.3OA r0 = r248.A06()     // Catch:{ all -> 0x26ee }
            X.3xd r0 = r0.A02     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2556
            java.util.List r191 = r0.B1b()     // Catch:{ all -> 0x26ee }
        L_0x2556:
            java.util.List r191 = X.C14502TxO.A03(r191)     // Catch:{ all -> 0x26ee }
        L_0x255a:
            r0 = r248
            X.1Xj r1 = r0.A02     // Catch:{ all -> 0x26ee }
            r177 = 0
            if (r1 == 0) goto L_0x25c4
            X.GHM r5 = X.GHM.A00     // Catch:{ all -> 0x26ee }
            r0 = r244
            java.lang.String r2 = r0.A0m     // Catch:{ all -> 0x26ee }
            r0 = r112
            X.GHN r116 = r5.A00(r6, r1, r0, r2)     // Catch:{ all -> 0x26ee }
            r2 = 36315563396304261(0x8104d0000e0d85, double:3.0294467506347365E-306)
            r0 = r104
            boolean r0 = X.182.A06(r0, r6, r2)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x25c4
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.BLEND     // Catch:{ all -> 0x26ee }
            goto L_0x2586
        L_0x257e:
            r13 = r15
            goto L_0x253a
        L_0x2580:
            r186 = r15
            goto L_0x252d
        L_0x2583:
            r185 = r15
            goto L_0x251b
        L_0x2586:
            r0 = r223
            boolean r68 = X.AnonymousClass7TF.A1W(r0, r2)
            r61 = r5
            r62 = r173
            r63 = r248
            r64 = r116
            r65 = r245
            r66 = r6
            r67 = r1
            boolean r0 = r61.A01(r62, r63, r64, r65, r66, r67, r68)     // Catch:{ all -> 0x26ee }
            if (r0 != 0) goto L_0x25c4
            java.lang.String r123 = r246.getModuleName()     // Catch:{ all -> 0x26ee }
            X.0Pk r2 = X.0Pl.A0n     // Catch:{ all -> 0x26ee }
            android.content.Context r0 = X.C243803a8.A00(r10)     // Catch:{ all -> 0x26ee }
            X.0Pl r121 = r2.A00(r0, r6)     // Catch:{ all -> 0x26ee }
            r113 = r224
            r114 = r244
            r115 = r248
            r117 = r245
            r118 = r6
            r119 = r1
            r120 = r112
            r122 = r229
            r124 = r109
            X.GKc r177 = X.GKb.A00(r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124)     // Catch:{ all -> 0x26ee }
        L_0x25c4:
            r1 = 36315563396173187(0x8104d0000c0d83, double:3.029446750551845E-306)
            r0 = r104
            boolean r205 = X.182.A06(r0, r6, r1)     // Catch:{ all -> 0x26ee }
            X.3Ds r61 = X.C238863Ds.STORY_HEADER     // Catch:{ all -> 0x26ee }
            r62 = r82
            r63 = r248
            r64 = r6
            r65 = r246
            r66 = r160
            X.2WX r178 = X.GFM.A02(r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x26ee }
            X.3Ds r3 = X.C238863Ds.ATTACHMENT     // Catch:{ all -> 0x26ee }
            r2 = r82
            r1 = r248
            r0 = r246
            X.2WX r179 = X.GFM.A01(r3, r2, r1, r6, r0)     // Catch:{ all -> 0x26ee }
            if (r219 == 0) goto L_0x2616
            java.lang.Integer r183 = java.lang.Integer.valueOf(r55)     // Catch:{ all -> 0x26ee }
        L_0x25f1:
            X.Gvi r0 = new X.Gvi     // Catch:{ all -> 0x26ee }
            r171 = r0
            r172 = r16
            r173 = r7
            r174 = r4
            r176 = r42
            r180 = r246
            r181 = r6
            r182 = r112
            r189 = r13
            r190 = r8
            r193 = r9
            r198 = r17
            r200 = r14
            r171.<init>(r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207)     // Catch:{ all -> 0x26ee }
            r1 = r32
            r1.A00(r0)     // Catch:{ all -> 0x26ee }
            goto L_0x2619
        L_0x2616:
            r183 = r15
            goto L_0x25f1
        L_0x2619:
            if (r58 == 0) goto L_0x261d
            if (r170 != 0) goto L_0x261f
        L_0x261d:
            if (r159 == 0) goto L_0x2621
        L_0x261f:
            r47 = 0
        L_0x2621:
            r1 = r32
            r0 = r47
            r1.A00(r0)     // Catch:{ all -> 0x26ee }
            boolean r0 = X.C51969G9p.A1V(r225)     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x264f
            r0 = r99
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x26ee }
            X.2Wd r0 = (X.2Wd) r0     // Catch:{ all -> 0x26ee }
            long r0 = r0.A00     // Catch:{ all -> 0x26ee }
            r2 = r54
            X.2WX r3 = X.AnonymousClass9JR.A00(r15, r2, r11, r0)     // Catch:{ all -> 0x26ee }
            r2 = r77
            r1 = r23
            r0 = r93
            X.2WX r1 = X.C51971G9r.A0V(r2, r3, r1, r0)     // Catch:{ all -> 0x26ee }
            r0 = r32
            X.2Tp r1 = X.C243563Zg.A0L(r0, r1)     // Catch:{ all -> 0x26ee }
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
        L_0x264f:
            r2 = r36
            r1 = r32
            r0 = r43
            X.C51967G9n.A1F(r1, r0, r2)     // Catch:{ all -> 0x26ee }
            goto L_0x1bc0
        L_0x265a:
            if (r27 == 0) goto L_0x265d
            goto L_0x265f
        L_0x265d:
            r2 = 0
            goto L_0x2664
        L_0x265f:
            long r0 = r27.longValue()     // Catch:{ all -> 0x26ee }
            int r2 = (int) r0     // Catch:{ all -> 0x26ee }
        L_0x2664:
            X.GJk r0 = new X.GJk     // Catch:{ all -> 0x26ee }
            r207 = r0
            r209 = r248
            r210 = r245
            r211 = r6
            r212 = r221
            r215 = r2
            r217 = r58
            r218 = r170
            r219 = r60
            r207.<init>(r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219)     // Catch:{ all -> 0x26ee }
            r1 = r43
            X.C51971G9r.A1C(r0, r3, r1, r4)     // Catch:{ all -> 0x26ee }
        L_0x2680:
            boolean r0 = r248.CcK()     // Catch:{ all -> 0x26ee }
            if (r0 == 0) goto L_0x2697
            X.GJ5 r1 = X.GJ5.AD     // Catch:{ all -> 0x26ee }
            r0 = r107
            if (r0 != r1) goto L_0x2697
            if (r234 != 0) goto L_0x2697
            if (r233 != 0) goto L_0x2697
            r1 = r43
            r0 = r85
            r1.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x2697:
            if (r39 == 0) goto L_0x26c9
            boolean r133 = X.2Y9.A00     // Catch:{ all -> 0x26ee }
            java.util.List r3 = r12.A0W     // Catch:{ all -> 0x26ee }
            java.lang.String r2 = r12.A0T     // Catch:{ all -> 0x26ee }
            X.6ag r1 = r12.A0D     // Catch:{ all -> 0x26ee }
            X.GGE r0 = new X.GGE     // Catch:{ all -> 0x26ee }
            r116 = r0
            r117 = r244
            r118 = r248
            r119 = r245
            r120 = r222
            r121 = r6
            r122 = r246
            r123 = r1
            r124 = r229
            r126 = r41
            r128 = r42
            r129 = r30
            r130 = r221
            r131 = r2
            r132 = r3
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133)     // Catch:{ all -> 0x26ee }
            r1 = r43
            r1.A00(r0)     // Catch:{ all -> 0x26ee }
        L_0x26c9:
            r3 = r48
            r2 = r29
            r1 = r43
            r0 = r74
            X.2Tp r1 = X.C243563Zg.A0J(r1, r0, r3, r2)     // Catch:{ all -> 0x26ee }
            r0.A00(r1)     // Catch:{ all -> 0x26ee }
            r142 = r0
            r143 = r10
            r145 = r75
            r146 = r15
            r147 = r15
            r148 = r11
            X.2Tl r15 = X.C243563Zg.A06(r142, r143, r144, r145, r146, r147, r148)     // Catch:{ all -> 0x26ee }
        L_0x26e8:
            r0 = r249
            r0.A00(r12)
            return r15
        L_0x26ee:
            r1 = move-exception
            r0 = r249
            r0.A00(r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFJ.A0X(X.3Y5):X.3mp");
    }
}
