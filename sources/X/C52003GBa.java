package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.endtoend.EndToEnd;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.GBa  reason: case insensitive filesystem */
public final class C52003GBa implements C231452rh, C338387hs {
    public 2We A00;
    public boolean A01 = true;
    public final LayoutInflater A02;
    public final C338587iC A03;
    public final ClipsViewerConfig A04;
    public final GBX A05;
    public final UserSession A06;
    public final C52009GBg A07;
    public final AnonymousClass9OA A08;
    public final C52005GBc A09;
    public final C52007GBe A0A;
    public final GDE A0B;
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final Map A0D;
    public final 0sP A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final AnonymousClass2tB A0H;
    public final C52004GBb A0I;

    public C52003GBa(Context context, 2We r6, ClipsViewerConfig clipsViewerConfig, GBX gbx, AnonymousClass2tB r9, UserSession userSession, C52009GBg gBg, GBQ gbq, C52007GBe gBe, GDE gde, Map map, 0sP r16, boolean z) {
        0qQ.A0B(map, 11);
        this.A06 = userSession;
        this.A0B = gde;
        this.A07 = gBg;
        this.A04 = clipsViewerConfig;
        this.A0A = gBe;
        this.A05 = gbx;
        this.A0F = z;
        this.A00 = r6;
        this.A0D = map;
        this.A0E = r16;
        this.A0H = r9;
        this.A02 = LayoutInflater.from(context);
        C52004GBb gBb = new C52004GBb(new 2V1(context), gbq);
        this.A0I = gBb;
        AnonymousClass9OA r1 = new AnonymousClass9OA();
        this.A08 = r1;
        C338587iC r0 = new C338587iC(r1, gBb);
        r0.A05 = true;
        this.A03 = r0;
        this.A09 = new C52005GBc(this);
        this.A0G = 182.A06(0Tu.A05, userSession, 36322916379732642L);
    }

    public final void D1O(int i, int i2, Object obj) {
        C52061GDh gDh = new C52061GDh((Object) this, i, i2, 3);
        if (this.A01) {
            gDh.invoke();
        }
    }

    public final void D7p(boolean z, long j) {
    }

    public final void DKr(int i, int i2) {
        C52061GDh gDh = new C52061GDh(this, i, i2, 4);
        if (this.A01) {
            gDh.invoke();
        }
    }

    public final void DSU(int i, int i2) {
        C52061GDh gDh = new C52061GDh(this, i, i2, 5);
        if (this.A01) {
            gDh.invoke();
        }
    }

    public final void Ddf(int i, int i2) {
        C52061GDh gDh = new C52061GDh(this, i, i2, 6);
        if (this.A01) {
            gDh.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.Ieo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: X.GrJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: X.GrJ} */
    /* JADX WARNING: type inference failed for: r0v80 */
    /* JADX WARNING: type inference failed for: r0v87, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r3v92, types: [java.lang.Object, X.7hM] */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r0v102 */
    /* JADX WARNING: type inference failed for: r0v103 */
    /* JADX WARNING: type inference failed for: r19v20, types: [X.GvU] */
    /* JADX WARNING: type inference failed for: r19v21, types: [X.GYw] */
    /* JADX WARNING: type inference failed for: r0v104 */
    /* JADX WARNING: type inference failed for: r0v105 */
    /* JADX WARNING: type inference failed for: r19v22, types: [X.GFJ] */
    /* JADX WARNING: type inference failed for: r0v106 */
    /* JADX WARNING: type inference failed for: r19v23, types: [X.GFJ] */
    /* JADX WARNING: type inference failed for: r19v24, types: [X.GuA] */
    /* JADX WARNING: type inference failed for: r0v107 */
    /* JADX WARNING: type inference failed for: r0v108 */
    /* JADX WARNING: type inference failed for: r0v109 */
    /* JADX WARNING: type inference failed for: r19v25, types: [X.GFJ] */
    /* JADX WARNING: type inference failed for: r19v26, types: [X.GwK] */
    /* JADX WARNING: type inference failed for: r19v27, types: [X.GFJ] */
    /* JADX WARNING: type inference failed for: r42v9, types: [X.Gqr] */
    /* JADX WARNING: type inference failed for: r24v24, types: [X.GFK] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f3, code lost:
        if (X.182.A06(r1, r2, 36318591347726647L) != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f5, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f7, code lost:
        if (r17 == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f9, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fb, code lost:
        if (r7 == null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fd, code lost:
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0203, code lost:
        if (r7.isVerified() == true) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0205, code lost:
        r26 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0207, code lost:
        if (r21 == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0209, code lost:
        if (r20 != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020b, code lost:
        if (r19 == false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020f, code lost:
        if (r9 != com.instagram.clips.intf.ClipsViewerSource.DIRECT) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0211, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0217, code lost:
        if (r4.A0F() == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0219, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021b, code lost:
        if (r8 == null) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0221, code lost:
        if (r8.A4z() != true) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0227, code lost:
        if (r8.A5l() != true) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0229, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022b, code lost:
        if (r31 == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x022d, code lost:
        r30 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0235, code lost:
        if (r4.A06().A0Z == null) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0237, code lost:
        r7 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0239, code lost:
        if (r7 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023b, code lost:
        r7 = r7.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0241, code lost:
        if (r7 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0243, code lost:
        r7 = r7.AZ1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0247, code lost:
        if (r7 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0249, code lost:
        r7 = r7.getTitle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024d, code lost:
        if (r7 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0253, code lost:
        if (r7.length() <= 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0256, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0259, code lost:
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025b, code lost:
        r7 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025d, code lost:
        if (r7 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025f, code lost:
        r37 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0267, code lost:
        if (r7.A0C.Aok() != null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0269, code lost:
        r37 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026b, code lost:
        X.0qQ.A0B(r2, 0);
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0279, code lost:
        if (X.182.A06(r1, r2, 36324037365935820L) == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x027b, code lost:
        r1 = X.C247573gZ.A00(com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE, X.C231122qu.A02(r2, r4.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0287, code lost:
        if (r1 == null) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0289, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x028e, code lost:
        if (r1.length() > 0) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0290, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0291, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0293, code lost:
        if (r1 == null) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0295, code lost:
        r1 = r1.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x029b, code lost:
        if (r1 == null) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029d, code lost:
        r1 = r1.BdU();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a1, code lost:
        if (r1 == null) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a3, code lost:
        r1 = r1.AjA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02a7, code lost:
        if (r1 == null) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ad, code lost:
        if (r1.length() <= 0) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02af, code lost:
        r1 = r4.A02;
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b3, code lost:
        if (r1 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02b5, code lost:
        r1 = r1.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02bb, code lost:
        if (r1 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02bd, code lost:
        r1 = r1.AZ1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c1, code lost:
        if (r1 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c3, code lost:
        r1 = r1.getTitle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c7, code lost:
        if (r1 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02cd, code lost:
        if (r1.length() <= 0) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cf, code lost:
        r1 = r4.A02;
        r41 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02d3, code lost:
        if (r1 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02d5, code lost:
        r10 = r1.A0C.BUC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02db, code lost:
        if (r10 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02e1, code lost:
        if (r10.B7C() == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02e3, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02ef, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 36321851227776828L) != false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02f2, code lost:
        r39 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f5, code lost:
        if (r7 != false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02f7, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02fa, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02ff, code lost:
        if (r10.At8() == null) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0301, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x030d, code lost:
        if (X.182.A06(X.0Tu.A06, r2, 36321851227842365L) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x030f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0310, code lost:
        if (r9 != false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0312, code lost:
        if (r1 == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0314, code lost:
        r41 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0316, code lost:
        r22 = new X.GEG(r23, r24, r25, r26, r27, false, false, r30, r31, r32, true, false, false, false, r37, r38, r39, true, r41, !X.GEF.A03(r4, r2, r18), false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0470, code lost:
        r6 = new X.C52067GDn(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05c9, code lost:
        r6 = new X.C52067GDn(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05eb, code lost:
        r1 = r5.A09.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05f1, code lost:
        if (r1 == null) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05f3, code lost:
        r2 = r1.getItemCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05fb, code lost:
        if (com.facebook.endtoend.EndToEnd.isRunningEndToEndTest() != false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05fe, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0600, code lost:
        r45 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0603, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0607, code lost:
        if (r1 != (r2 - 1)) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x060a, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x060d, code lost:
        r3 = "_page_last_item";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x060f, code lost:
        r45 = X.002.A0c("scrollable_view_child_", r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0615, code lost:
        r2 = r0.A0N;
        r1 = r0.A0Z;
        r3 = new X.C52046GCs(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0627, code lost:
        if (X.C52067GDn.A00(7, r6) == false) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0629, code lost:
        r8 = (X.GFK) r6.A01;
        r39 = X.C52007GBe.A00(r0);
        r26 = r0.A0M;
        r52 = r0.A0K;
        r7 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x063b, code lost:
        if (r7 == null) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x063d, code lost:
        r34 = r0.A06();
        r49 = r0.A06;
        r47 = r0.A0i;
        r48 = r0.A0e;
        r24 = r0.A0L;
        r23 = r0.A0H;
        r21 = r0.A0Q;
        r20 = r0.A0d;
        r22 = r0.A0I;
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0663, code lost:
        if (r6 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0665, code lost:
        r19 = r0.A0P;
        r15 = r0.A0V;
        r4 = new X.C52172GHo(r0);
        r14 = r0.A0J;
        r20 = r23;
        r23 = r14;
        r24 = r52;
        r19 = new X.GFJ(r20, (X.2Wd) null, r22, r23, r24, r24, r26, r2, (X.C52673Gal) null, r1, r19, (X.C52672Gak) null, r21, r0.A0R, r34, r4, r15, r7, r0.A0X, r39, r8, r6, r3, r0.A0a, r20, r45, "clips_lithoview_parent_component", r47, r48, r49, r0.A0m, false);
        r1 = X.C295365o2.ORGANIC;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06b3, code lost:
        r4 = new X.C52068GDo(r0, r1, r2);
        r3 = new java.lang.Object();
        r3.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06c6, code lost:
        if (X.C52067GDn.A00(5, r6) == false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06c8, code lost:
        r27 = r0.A06();
        r10 = (X.C267324bN) r6.A01;
        r3 = r0.A0L;
        r22 = r3.BzC(r10);
        r31 = r3.BzD(r10);
        r9 = r0.A0f;
        r8 = r0.A0V;
        r19 = new X.C53914GwK(r0.A0K, r10, r22, r2, r1, r0.A0O, r0.A0S, r27, r8, r0.A0c, r9, r31, r0.A0l);
        r1 = X.C295365o2.MULTI_ADS;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x070c, code lost:
        if (X.C52067GDn.A00(0, r6) == false) goto L_0x07c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x070e, code lost:
        r10 = (X.GFK) r6.A01;
        r39 = X.C52007GBe.A00(r0);
        r26 = r0.A0M;
        r53 = r0.A0K;
        r9 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0720, code lost:
        if (r9 == null) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0722, code lost:
        r34 = r0.A06();
        r49 = r0.A06;
        r47 = r0.A0i;
        r48 = r0.A0e;
        r25 = r0.A0L;
        r52 = r0.A0H;
        r24 = r0.A0Q;
        r21 = r0.A0d;
        r22 = r0.A0I;
        r8 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0748, code lost:
        if (r8 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x074a, code lost:
        r20 = r0.A0P;
        r19 = r0.A0V;
        r7 = new X.GTV(r0);
        r23 = r0.A0J;
        r15 = r0.A0a;
        r14 = r0.A0m;
        r12 = r0.A0l;
        r6 = (X.C267324bN) r10.A02;
        r3 = r6.A06().A0K.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0771, code lost:
        if (r3 == null) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0773, code lost:
        r11 = r3.BM9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0777, code lost:
        r20 = r52;
        r24 = r53;
        r19 = new X.GFJ(r20, (X.2Wd) null, r22, r23, r24, r25, r26, r2, new X.C52673Gal(X.XSH.PAGE_INSTAGRAM_REELS_TAB, r1, r2), r1, r20, new X.C52672Gak(r1, r2, r11, r6.A06().A0S), r24, r0.A0R, r34, r7, r19, r9, (X.H3C) null, r39, r10, r8, r3, r15, r21, r45, "clips_lithoview_parent_component", r47, r48, r49, r14, r12);
        r1 = r6.A01;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010d, code lost:
        if (X.C231122qu.A0P((com.instagram.common.session.UserSession) null, r8) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07c2, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07c9, code lost:
        if (X.C52067GDn.A00(6, r6) == false) goto L_0x08df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07cb, code lost:
        r8 = (X.C53576Gqr) r6.A01;
        r9 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07d3, code lost:
        if (r9.A0T == null) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07d5, code lost:
        r6 = r0.A0W.A00.A0Q;
        ((X.C55679Hlc) ((X.H2O) r6.getValue()).A05.getValue()).A00 = new X.JGB(r0, 27);
        r0 = new X.C53762Gtr(r0.A0F, r2, (X.C55679Hlc) ((X.H2O) r6.getValue()).A05.getValue(), r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0809, code lost:
        r1 = X.C295365o2.NETEGO;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x080d, code lost:
        r3 = r9.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0811, code lost:
        if (r3 == null) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0813, code lost:
        r4 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x081b, code lost:
        if (X.0qQ.A0K(r4, "reels_megaphone") == false) goto L_0x0825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x081d, code lost:
        r0 = new X.C53674GsR(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0823, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x082b, code lost:
        if (X.0qQ.A0K(r4, "ad4ad_in_reels") == false) goto L_0x0862;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x082d, code lost:
        r7 = (X.C55678Hlb) ((X.H2O) r0.A0W.A00.A0Q.getValue()).A04.getValue();
        r6 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0843, code lost:
        if (r6 == null) goto L_0x0a9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0845, code lost:
        r7.A00 = new X.C58161InR(r6, 22);
        r19 = new X.C53781GuA(r9, r1, r2, r7, r0.A0g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0862, code lost:
        r39 = X.C52007GBe.A00(r0);
        r26 = r0.A0M;
        r52 = r0.A0K;
        r7 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0111, code lost:
        if (r8 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0870, code lost:
        if (r7 == null) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0872, code lost:
        r34 = r0.A06();
        r24 = r0.A06;
        r23 = r0.A0i;
        r22 = r0.A0e;
        r21 = r0.A0L;
        r20 = r0.A0H;
        r19 = r0.A0Q;
        r15 = r0.A0d;
        r14 = r0.A0I;
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0894, code lost:
        if (r6 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0896, code lost:
        r12 = r0.A0P;
        r11 = r0.A0V;
        r19 = new X.GFJ(r20, (X.2Wd) null, r14, r0.A0J, r52, r21, r26, r2, (X.C52673Gal) null, r1, r12, (X.C52672Gak) null, r19, r0.A0R, r34, (X.JP2) null, r11, r7, (X.H3C) null, r39, r8, r6, r3, r0.A0a, r15, r45, "clips_lithoview_parent_component", r23, r22, r24, r0.A0m, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x08e4, code lost:
        if (X.C52067GDn.A00(2, r6) == false) goto L_0x08f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e6, code lost:
        r0 = new X.C53918GwO((X.C267324bN) r6.A01, r2, r1);
        r1 = X.C295365o2.BRAND_SURVEY;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x08f9, code lost:
        if (X.C52067GDn.A00(10, r6) == false) goto L_0x097e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x08fb, code lost:
        r8 = (X.GFK) r6.A01;
        r39 = X.C52007GBe.A00(r0);
        r26 = r0.A0M;
        r52 = r0.A0K;
        r7 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0113, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x090d, code lost:
        if (r7 == null) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x090f, code lost:
        r34 = r0.A06();
        r24 = r0.A06;
        r23 = r0.A0i;
        r22 = r0.A0e;
        r21 = r0.A0L;
        r20 = r0.A0H;
        r19 = r0.A0Q;
        r15 = r0.A0d;
        r14 = r0.A0I;
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0931, code lost:
        if (r6 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0933, code lost:
        r12 = r0.A0P;
        r11 = r0.A0V;
        r19 = new X.GFJ(r20, (X.2Wd) null, r14, r0.A0J, r52, r21, r26, r2, (X.C52673Gal) null, r1, r12, (X.C52672Gak) null, r19, r0.A0R, r34, (X.JP2) null, r11, r7, (X.H3C) null, r39, r8, r6, r3, r0.A0a, r15, r45, "clips_lithoview_parent_component", r23, r22, r24, r0.A0m, false);
        r1 = X.C295365o2.QP;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0983, code lost:
        if (X.C52067GDn.A00(3, r6) == false) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0985, code lost:
        r0 = new X.C52144GGm((X.C267324bN) r6.A01);
        r1 = X.C295365o2.GHOST;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0998, code lost:
        if (X.C52067GDn.A00(8, r6) == false) goto L_0x09a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x099a, code lost:
        r0 = new X.C53715Gt6((X.C267324bN) r6.A01, r1, r0.A0m);
        r1 = X.C295365o2.PREVIEW;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0119, code lost:
        if (r8.A5n() == true) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x09ae, code lost:
        if (X.C52067GDn.A00(4, r6) == false) goto L_0x09e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x09b0, code lost:
        r19 = new X.C52597GYw((X.GZ2) r6.A01, r2, (X.C52071GDr) r0.A0W.A00.A0O.getValue(), r0.A0Y, r1, r0.A0b, r0.A0g, r0.A0h, r0.A0l);
        r1 = X.C295365o2.MIDCARD;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09ed, code lost:
        if (X.C52067GDn.A00(9, r6) == false) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09ef, code lost:
        r10 = (X.C267324bN) r6.A01;
        r9 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x09f5, code lost:
        if (r9 == null) goto L_0x0a9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09f7, code lost:
        r25 = r0.A06();
        r8 = r0.A0i;
        r7 = r0.A0e;
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0a01, code lost:
        if (r6 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a03, code lost:
        r19 = new X.C53863GvU(r0.A0H, r10, r0.A0L.BzC(r10), r1, r2, r25, r9, r6, r8, r7, r0.A0m);
        r1 = X.C295365o2.QPMIDCARD;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011b, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a30, code lost:
        if (X.C52067GDn.A00(11, r6) == false) goto L_0x0a3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a32, code lost:
        r0 = new X.C53643Grw((X.C267324bN) r6.A01);
        r1 = X.C295365o2.UNAVAILABLE;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0a44, code lost:
        if (X.C52067GDn.A00(1, r6) == false) goto L_0x0aa8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0a46, code lost:
        r0 = new X.C251343mx();
        r1 = X.C295365o2.BLEND_END_OF_FEED;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a4f, code lost:
        if (r16 != 0) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0a55, code lost:
        if (r13.A01 != X.C295365o2.ORGANIC) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0a57, code lost:
        r3.A01 = new X.C244173al((java.lang.String) null, new X.J6R(16, r5, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011d, code lost:
        if (r8 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0a67, code lost:
        r2 = new X.C338347ho(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0a6e, code lost:
        if (r5.A0F == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0a72, code lost:
        if (r5.A00 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a74, code lost:
        r4 = r5.A03;
        r3 = r13.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a7a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r0 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a7e, code lost:
        if (r0 != false) goto L_0x0b9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a80, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a83, code lost:
        if (r4.A02 != null) goto L_0x0b8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a85, code lost:
        r4.A02 = new java.util.concurrent.LinkedBlockingQueue(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0a90, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        if (r8.A5o() == true) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a94, code lost:
        r0 = "mvvmDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0a97, code lost:
        r0 = "clipsVideoPlayerLithoHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a9a, code lost:
        r0 = "qpMidcardDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a9d, code lost:
        r0 = "netegoNavigator";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a9f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0aa2, code lost:
        r1 = X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        r1 = new java.lang.IllegalStateException("Item type not supported in Litho.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        if (X.C243213Xw.A00(r4, r2) == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012f, code lost:
        r23 = X.GJ5.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0b8c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0b8d, code lost:
        r2.A8B(X.AnonymousClass000.A00(4630), r3);
        r4.A02.offer(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0b9b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0132, code lost:
        r1 = r4.A06().A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0b9c, code lost:
        X.C338587iC.A00(r2, r4, (X.AnonymousClass2Ss) null, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0ba2, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        if (r1 == null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0140, code lost:
        if (r1.isEmpty() != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0c6f, code lost:
        if (r1 == null) goto L_0x0c04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0142, code lost:
        r23 = X.GJ5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0147, code lost:
        if (r8 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014d, code lost:
        if (r8.A4z() == true) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (r8.A5l() != true) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015a, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
        if (r4.CcK() == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0168, code lost:
        if (r4.CcK() == false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (r17 != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        if (r22 != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        if (r18 != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0170, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36326137604945443L) != false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        if (r4.CcK() == false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        if (r17 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
        if (r22 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        if (r18 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019a, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36326137605404202L) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019c, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019e, code lost:
        r18 = X.GEF.A00;
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        if (r1 == null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a4, code lost:
        r7 = r1.A2A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a8, code lost:
        r1 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b3, code lost:
        if (X.182.A06(r1, r2, 36323285746592818L) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b5, code lost:
        r10 = r4.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b7, code lost:
        if (r10 == null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
        if (r10.AxN() != true) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if (r31 != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c2, code lost:
        if (r22 != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c4, code lost:
        if (r7 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ca, code lost:
        if (r7.A2Q() != true) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cd, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d0, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d2, code lost:
        if (r8 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d4, code lost:
        r10 = r8.A0C.getClipsMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01da, code lost:
        if (r10 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dc, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        if (r10.AZY() != null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e4, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e8, code lost:
        if (r9 != com.instagram.clips.intf.ClipsViewerSource.PROMOTE_FLOW_ADS_PREVIEW) goto L_0x01f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x036b A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b9 A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0515 A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x059d A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0ad6 A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0af1 A[Catch:{ Exception -> 0x0ba4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0b0c A[Catch:{ Exception -> 0x0ba4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C338357hp A00(X.C52003GBa r52, int r53) {
        /*
            r5 = r52
            r16 = r53
            X.GBg r6 = r5.A07     // Catch:{ Exception -> 0x0ba4 }
            r0 = r16
            X.4bN r13 = r6.A0E(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.GBX r0 = r5.A05     // Catch:{ Exception -> 0x0ba4 }
            boolean r0 = r0.A00(r13)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0ab1
            X.GBe r0 = r5.A0A     // Catch:{ Exception -> 0x0ba4 }
            X.GDE r2 = r5.A0B     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.clips.intf.ClipsViewerConfig r15 = r5.A04     // Catch:{ Exception -> 0x0ba4 }
            r12 = 0
            r3 = 1
            r1 = r16
            X.4bN r4 = r6.A0E(r1)     // Catch:{ Exception -> 0x0ba4 }
            X.GDe r14 = r6.BzC(r4)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = r4.A01     // Catch:{ Exception -> 0x0ba4 }
            r47 = r1
            int r1 = r47.ordinal()     // Catch:{ Exception -> 0x0ba4 }
            switch(r1) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0051;
                case 2: goto L_0x0051;
                case 3: goto L_0x03bb;
                case 4: goto L_0x05cf;
                case 5: goto L_0x03be;
                case 6: goto L_0x0031;
                case 7: goto L_0x046e;
                case 8: goto L_0x0469;
                case 9: goto L_0x0477;
                case 10: goto L_0x0031;
                case 11: goto L_0x0031;
                case 12: goto L_0x0031;
                case 13: goto L_0x0031;
                case 14: goto L_0x046b;
                case 15: goto L_0x03c5;
                case 16: goto L_0x03c2;
                case 17: goto L_0x0031;
                case 18: goto L_0x0031;
                case 19: goto L_0x0470;
                default: goto L_0x0031;
            }     // Catch:{ Exception -> 0x0ba4 }
        L_0x0031:
            java.lang.String r0 = "Unsupported conversion to ClipsUiState"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0038:
            throw r1     // Catch:{ Exception -> 0x0ba4 }
        L_0x0039:
            X.GBH r1 = r2.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A0R     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.GEo r2 = (X.C52094GEo) r2     // Catch:{ Exception -> 0x0ba4 }
            r1 = r16
            X.GFK r2 = r2.A05(r15, r4, r14, r1)     // Catch:{ Exception -> 0x0ba4 }
            r1 = 7
            X.GDn r6 = new X.GDn     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>((java.lang.Object) r2, (int) r1)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x05eb
        L_0x0051:
            X.GBH r1 = r2.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A0A     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r6 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2M r6 = (X.H2M) r6     // Catch:{ Exception -> 0x0ba4 }
            X.0qQ.A0B(r14, r3)     // Catch:{ Exception -> 0x0ba4 }
            boolean r1 = r15.A00()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x00f8
            boolean r1 = r4.A0J()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x00f8
            r46 = 1
            X.GJ5 r18 = X.GJ5.AD     // Catch:{ Exception -> 0x0ba4 }
            X.GEG r7 = new X.GEG     // Catch:{ Exception -> 0x0ba4 }
            r17 = r7
            r19 = r3
            r20 = r3
            r21 = r3
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r37 = r3
            r38 = r12
            r39 = r12
            r40 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0ba4 }
        L_0x00a1:
            X.Hjn r3 = r6.A04     // Catch:{ Exception -> 0x0ba4 }
            boolean r1 = r4.CcK()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x033b
            X.5o2 r2 = X.C295365o2.AD     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.AD_PREVIEW     // Catch:{ Exception -> 0x0ba4 }
            X.5o2[] r1 = new X.C295365o2[]{r2, r1}     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r2 = X.0sr.A1P(r1)     // Catch:{ Exception -> 0x0ba4 }
            r1 = r47
            boolean r1 = r2.contains(r1)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x033b
            X.1iA r2 = X.1iA.A0Q     // Catch:{ Exception -> 0x0ba4 }
            X.1iA r1 = X.1iA.A0a     // Catch:{ Exception -> 0x0ba4 }
            X.1iA[] r1 = new X.1iA[]{r2, r1}     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r2 = X.0sr.A1P(r1)     // Catch:{ Exception -> 0x0ba4 }
            X.1iA r1 = r4.A0J     // Catch:{ Exception -> 0x0ba4 }
            boolean r1 = X.00k.A0u(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x033b
            X.GJ5 r2 = X.GJ5.AD     // Catch:{ Exception -> 0x0ba4 }
            X.GJ5 r1 = X.GJ5.REMINDER_AD     // Catch:{ Exception -> 0x0ba4 }
            X.GJ5[] r1 = new X.GJ5[]{r2, r1}     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r2 = X.0sr.A1P(r1)     // Catch:{ Exception -> 0x0ba4 }
            X.GJ5 r1 = r7.A00     // Catch:{ Exception -> 0x0ba4 }
            boolean r1 = X.00k.A0u(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x033b
            com.instagram.common.session.UserSession r9 = r3.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ Exception -> 0x0ba4 }
            r1 = 36327486224611801(0x810fa8000039d9, double:3.036986795265801E-306)
            boolean r1 = X.182.A06(r8, r9, r1)     // Catch:{ Exception -> 0x0ba4 }
            r23 = 1
            if (r1 != 0) goto L_0x033d
            goto L_0x033b
        L_0x00f8:
            r46 = 0
            com.instagram.common.session.UserSession r2 = r6.A00     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.clips.intf.ClipsViewerSource r9 = r15.A0J     // Catch:{ Exception -> 0x0ba4 }
            r1 = 2
            X.0qQ.A0B(r9, r1)     // Catch:{ Exception -> 0x0ba4 }
            X.1Xj r8 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            r7 = 0
            if (r8 == 0) goto L_0x010f
            boolean r1 = X.C231122qu.A0P(r7, r8)     // Catch:{ Exception -> 0x0ba4 }
            r31 = 1
            if (r1 != 0) goto L_0x0113
        L_0x010f:
            r31 = 0
            if (r8 == 0) goto L_0x011b
        L_0x0113:
            boolean r1 = r8.A5n()     // Catch:{ Exception -> 0x0ba4 }
            r22 = 1
            if (r1 == r3) goto L_0x011f
        L_0x011b:
            r22 = 0
            if (r8 == 0) goto L_0x0127
        L_0x011f:
            boolean r1 = r8.A5o()     // Catch:{ Exception -> 0x0ba4 }
            r18 = 1
            if (r1 == r3) goto L_0x0129
        L_0x0127:
            r18 = 0
        L_0x0129:
            boolean r1 = X.C243213Xw.A00(r4, r2)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0132
            X.GJ5 r23 = X.GJ5.REMINDER_AD     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0147
        L_0x0132:
            X.3OA r1 = r4.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r1 = r1.A04()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0145
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 != 0) goto L_0x0145
            X.GJ5 r23 = X.GJ5.AD     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0147
        L_0x0145:
            r23 = r7
        L_0x0147:
            if (r8 == 0) goto L_0x0158
            boolean r1 = r8.A4z()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == r3) goto L_0x0155
            boolean r1 = r8.A5l()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 != r3) goto L_0x0158
        L_0x0155:
            r17 = 1
            goto L_0x015a
        L_0x0158:
            r17 = 0
        L_0x015a:
            r21 = 0
            boolean r1 = r4.CcK()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0164
            r21 = 1
        L_0x0164:
            boolean r1 = r4.CcK()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x017f
            if (r17 != 0) goto L_0x017f
            if (r22 != 0) goto L_0x017f
            if (r18 != 0) goto L_0x017f
            X.0Tu r1 = X.0Tu.A05     // Catch:{ Exception -> 0x0ba4 }
            r10 = 36326137604945443(0x810e6e00013623, double:3.0361339227583405E-306)
            boolean r1 = X.182.A06(r1, r2, r10)     // Catch:{ Exception -> 0x0ba4 }
            r20 = 1
            if (r1 != 0) goto L_0x0181
        L_0x017f:
            r20 = 0
        L_0x0181:
            boolean r1 = r4.CcK()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x019c
            if (r17 != 0) goto L_0x019c
            if (r22 != 0) goto L_0x019c
            if (r18 != 0) goto L_0x019c
            X.0Tu r1 = X.0Tu.A05     // Catch:{ Exception -> 0x0ba4 }
            r10 = 36326137605404202(0x810e6e0008362a, double:3.0361339230484616E-306)
            boolean r1 = X.182.A06(r1, r2, r10)     // Catch:{ Exception -> 0x0ba4 }
            r19 = 1
            if (r1 != 0) goto L_0x019e
        L_0x019c:
            r19 = 0
        L_0x019e:
            X.GEF r18 = X.GEF.A00     // Catch:{ Exception -> 0x0ba4 }
            X.1Xj r1 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x01a8
            com.instagram.user.model.User r7 = r1.A2A(r2)     // Catch:{ Exception -> 0x0ba4 }
        L_0x01a8:
            X.0Tu r1 = X.0Tu.A05     // Catch:{ Exception -> 0x0ba4 }
            r10 = 36323285746592818(0x810bd600002c32, double:3.0343303960526286E-306)
            boolean r10 = X.182.A06(r1, r2, r10)     // Catch:{ Exception -> 0x0ba4 }
            if (r10 == 0) goto L_0x01d0
            X.4gy r10 = r4.A0H     // Catch:{ Exception -> 0x0ba4 }
            if (r10 == 0) goto L_0x01c0
            boolean r10 = r10.AxN()     // Catch:{ Exception -> 0x0ba4 }
            if (r10 != r3) goto L_0x01c0
            goto L_0x01d0
        L_0x01c0:
            if (r31 != 0) goto L_0x01d0
            if (r22 != 0) goto L_0x01d0
            if (r7 == 0) goto L_0x01cd
            boolean r10 = r7.A2Q()     // Catch:{ Exception -> 0x0ba4 }
            if (r10 != r3) goto L_0x01cd
            goto L_0x01d0
        L_0x01cd:
            r24 = 1
            goto L_0x01d2
        L_0x01d0:
            r24 = 0
        L_0x01d2:
            if (r8 == 0) goto L_0x01e4
            X.1Xy r10 = r8.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.1sQ r10 = r10.getClipsMetadata()     // Catch:{ Exception -> 0x0ba4 }
            if (r10 == 0) goto L_0x01e4
            X.1rp r10 = r10.AZY()     // Catch:{ Exception -> 0x0ba4 }
            r17 = 1
            if (r10 != 0) goto L_0x01e6
        L_0x01e4:
            r17 = 0
        L_0x01e6:
            com.instagram.clips.intf.ClipsViewerSource r10 = com.instagram.clips.intf.ClipsViewerSource.PROMOTE_FLOW_ADS_PREVIEW     // Catch:{ Exception -> 0x0ba4 }
            if (r9 != r10) goto L_0x01f5
            r10 = 36318591347726647(0x81079100061937, double:3.031361639306835E-306)
            boolean r10 = X.182.A06(r1, r2, r10)     // Catch:{ Exception -> 0x0ba4 }
            if (r10 != 0) goto L_0x01f9
        L_0x01f5:
            r25 = 0
            if (r17 == 0) goto L_0x01fb
        L_0x01f9:
            r25 = 1
        L_0x01fb:
            if (r7 == 0) goto L_0x0205
            boolean r7 = r7.isVerified()     // Catch:{ Exception -> 0x0ba4 }
            r26 = 1
            if (r7 == r3) goto L_0x0207
        L_0x0205:
            r26 = 0
        L_0x0207:
            if (r21 == 0) goto L_0x020d
            if (r20 != 0) goto L_0x020d
            if (r19 == 0) goto L_0x0211
        L_0x020d:
            com.instagram.clips.intf.ClipsViewerSource r7 = com.instagram.clips.intf.ClipsViewerSource.DIRECT     // Catch:{ Exception -> 0x0ba4 }
            if (r9 != r7) goto L_0x0219
        L_0x0211:
            boolean r7 = r4.A0F()     // Catch:{ Exception -> 0x0ba4 }
            r27 = 0
            if (r7 == 0) goto L_0x021b
        L_0x0219:
            r27 = 1
        L_0x021b:
            if (r8 == 0) goto L_0x022d
            boolean r7 = r8.A4z()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 != r3) goto L_0x022d
            boolean r7 = r8.A5l()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 != r3) goto L_0x022d
            r30 = 1
            if (r31 == 0) goto L_0x022f
        L_0x022d:
            r30 = 0
        L_0x022f:
            X.3OA r7 = r4.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r7 = r7.A0Z     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0259
            X.1Xj r7 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0256
            X.1Xy r7 = r7.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.3lZ r7 = r7.getInjected()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0256
            X.3xZ r7 = r7.AZ1()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0256
            java.lang.String r7 = r7.getTitle()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0256
            int r7 = r7.length()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 <= 0) goto L_0x0256
            goto L_0x0259
        L_0x0256:
            r32 = 1
            goto L_0x025b
        L_0x0259:
            r32 = 0
        L_0x025b:
            X.1Xj r7 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0269
            X.1Xy r7 = r7.A0C     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r7 = r7.Aok()     // Catch:{ Exception -> 0x0ba4 }
            r37 = 1
            if (r7 != 0) goto L_0x026b
        L_0x0269:
            r37 = 0
        L_0x026b:
            X.0qQ.A0B(r2, r12)     // Catch:{ Exception -> 0x0ba4 }
            r7 = 36324037365935820(0x810c8500012ecc, double:3.034805723151671E-306)
            boolean r1 = X.182.A06(r1, r2, r7)     // Catch:{ Exception -> 0x0ba4 }
            r38 = 1
            if (r1 == 0) goto L_0x0290
            X.1Xj r1 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            X.3xx r7 = X.C231122qu.A02(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r1 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r1 = X.C247573gZ.A00(r1, r7)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0290
            int r1 = r1.length()     // Catch:{ Exception -> 0x0ba4 }
            r7 = 1
            if (r1 > 0) goto L_0x0291
        L_0x0290:
            r7 = 0
        L_0x0291:
            X.1Xj r1 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f5
            X.1Xy r1 = r1.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.3lZ r1 = r1.getInjected()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f5
            X.3y7 r1 = r1.BdU()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f5
            java.lang.String r1 = r1.AjA()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f5
            int r1 = r1.length()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 <= 0) goto L_0x02f5
        L_0x02af:
            X.1Xj r1 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            r39 = 1
            if (r1 == 0) goto L_0x02f2
            X.1Xy r1 = r1.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.3lZ r1 = r1.getInjected()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f2
            X.3xZ r1 = r1.AZ1()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f2
            java.lang.String r1 = r1.getTitle()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02f2
            int r1 = r1.length()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 <= 0) goto L_0x02f2
        L_0x02cf:
            X.1Xj r1 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            r41 = 0
            if (r1 == 0) goto L_0x0316
            X.1Xy r1 = r1.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.41Z r10 = r1.BUC()     // Catch:{ Exception -> 0x0ba4 }
            if (r10 == 0) goto L_0x0316
            X.4hQ r1 = r10.B7C()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x02fa
            X.0Tu r1 = X.0Tu.A06     // Catch:{ Exception -> 0x0ba4 }
            r7 = 36321851227776828(0x810a880004273c, double:3.033423200577053E-306)
            boolean r1 = X.182.A06(r1, r2, r7)     // Catch:{ Exception -> 0x0ba4 }
            r9 = 1
            if (r1 != 0) goto L_0x02fb
            goto L_0x02fa
        L_0x02f2:
            r39 = 0
            goto L_0x02cf
        L_0x02f5:
            if (r7 != 0) goto L_0x02af
            r38 = 0
            goto L_0x02af
        L_0x02fa:
            r9 = 0
        L_0x02fb:
            X.4hQ r1 = r10.At8()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x030f
            X.0Tu r1 = X.0Tu.A06     // Catch:{ Exception -> 0x0ba4 }
            r7 = 36321851227842365(0x810a880005273d, double:3.033423200618499E-306)
            boolean r7 = X.182.A06(r1, r2, r7)     // Catch:{ Exception -> 0x0ba4 }
            r1 = 1
            if (r7 != 0) goto L_0x0310
        L_0x030f:
            r1 = 0
        L_0x0310:
            if (r9 != 0) goto L_0x0314
            if (r1 == 0) goto L_0x0316
        L_0x0314:
            r41 = 1
        L_0x0316:
            r1 = r18
            boolean r1 = X.GEF.A03(r4, r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            r42 = r1 ^ 1
            X.GEG r7 = new X.GEG     // Catch:{ Exception -> 0x0ba4 }
            r22 = r7
            r28 = r12
            r29 = r12
            r33 = r3
            r34 = r12
            r35 = r12
            r36 = r12
            r40 = r3
            r43 = r12
            r44 = r12
            r45 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x00a1
        L_0x033b:
            r23 = 0
        L_0x033d:
            com.instagram.common.session.UserSession r8 = r3.A00     // Catch:{ Exception -> 0x0ba4 }
            X.3OA r1 = r4.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r3 = r1.A0d     // Catch:{ Exception -> 0x0ba4 }
            X.3OA r1 = r4.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r2 = r1.A0b     // Catch:{ Exception -> 0x0ba4 }
            X.Gaj r1 = new X.Gaj     // Catch:{ Exception -> 0x0ba4 }
            r17 = r1
            r18 = r4
            r19 = r14
            r20 = r8
            r21 = r3
            r22 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0ba4 }
            r3 = 21
            X.JTb r2 = new X.JTb     // Catch:{ Exception -> 0x0ba4 }
            r2.<init>(r12, r3)     // Catch:{ Exception -> 0x0ba4 }
            X.GEH r9 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            r47 = r46 ^ 1
            com.instagram.music.common.model.AudioOverlayTrack r3 = r15.A0Q     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x03b9
            com.instagram.music.common.model.MusicAssetModel r8 = r3.A08     // Catch:{ Exception -> 0x0ba4 }
        L_0x036d:
            boolean r3 = r1.A06     // Catch:{ Exception -> 0x0ba4 }
            r39 = r9
            r40 = r7
            r41 = r15
            r42 = r4
            r43 = r14
            r44 = r8
            r45 = r16
            r48 = r3
            X.GKJ r19 = r39.A05(r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ Exception -> 0x0ba4 }
            X.GEb r3 = r6.A03     // Catch:{ Exception -> 0x0ba4 }
            r20 = r3
            r21 = r7
            r22 = r15
            r23 = r4
            r24 = r14
            r25 = r16
            r26 = r12
            X.GEl r24 = r20.A05(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0ba4 }
            X.GEm r8 = r6.A02     // Catch:{ Exception -> 0x0ba4 }
            X.3W1 r6 = r14.A0E     // Catch:{ Exception -> 0x0ba4 }
            r3 = r16
            X.GEn r23 = r8.A05(r4, r6, r3)     // Catch:{ Exception -> 0x0ba4 }
            X.GFK r3 = new X.GFK     // Catch:{ Exception -> 0x0ba4 }
            r17 = r3
            r18 = r2
            r20 = r7
            r21 = r4
            r22 = r14
            r25 = r1
            r17.<init>((X.C59671JTb) r18, (X.GKJ) r19, (X.GEG) r20, (X.C267324bN) r21, (X.C52058GDe) r22, (X.C52093GEn) r23, (X.C52091GEl) r24, (X.C52671Gaj) r25, (int) r26)     // Catch:{ Exception -> 0x0ba4 }
            X.GDn r6 = new X.GDn     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>((java.lang.Object) r3, (int) r12)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x05eb
        L_0x03b9:
            r8 = 0
            goto L_0x036d
        L_0x03bb:
            r3 = 5
            goto L_0x0470
        L_0x03be:
            r3 = 9
            goto L_0x0470
        L_0x03c2:
            r3 = 2
            goto L_0x0470
        L_0x03c5:
            X.GBH r1 = r2.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A0T     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2L r1 = (X.H2L) r1     // Catch:{ Exception -> 0x0ba4 }
            X.0qQ.A0B(r14, r3)     // Catch:{ Exception -> 0x0ba4 }
            X.1Xj r2 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r2 == 0) goto L_0x0429
            X.1Xy r2 = r2.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.DSo r2 = r2.BiR()     // Catch:{ Exception -> 0x0ba4 }
            if (r2 == 0) goto L_0x0429
            X.GJ5 r18 = X.GJ5.QP     // Catch:{ Exception -> 0x0ba4 }
        L_0x03e0:
            X.GEG r17 = new X.GEG     // Catch:{ Exception -> 0x0ba4 }
            r19 = r12
            r20 = r3
            r21 = r3
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r3
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r35 = r3
            r36 = r12
            r37 = r3
            r38 = r12
            r39 = r12
            r40 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0ba4 }
            r6 = 21
            X.JTb r2 = new X.JTb     // Catch:{ Exception -> 0x0ba4 }
            r2.<init>(r12, r6)     // Catch:{ Exception -> 0x0ba4 }
            X.GEH r7 = r1.A00     // Catch:{ Exception -> 0x0ba4 }
            boolean r6 = r15.A00()     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x042c
            boolean r6 = r4.A0J()     // Catch:{ Exception -> 0x0ba4 }
            r25 = 1
            if (r6 != 0) goto L_0x042e
            goto L_0x042c
        L_0x0429:
            r18 = 0
            goto L_0x03e0
        L_0x042c:
            r25 = 0
        L_0x042e:
            r23 = 0
            r18 = r7
            r19 = r17
            r20 = r15
            r21 = r4
            r22 = r14
            r24 = r16
            r26 = r3
            X.GKJ r26 = r18.A05(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0ba4 }
            X.GEb r1 = r1.A01     // Catch:{ Exception -> 0x0ba4 }
            r6 = r1
            r7 = r17
            r8 = r15
            r9 = r4
            r10 = r14
            r11 = r16
            X.GEl r31 = r6.A05(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0ba4 }
            r32 = 192(0xc0, float:2.69E-43)
            r33 = 2
            X.GFK r1 = new X.GFK     // Catch:{ Exception -> 0x0ba4 }
            r24 = r1
            r25 = r2
            r27 = r7
            r28 = r4
            r29 = r14
            r30 = r23
            r24.<init>((X.C59671JTb) r25, (X.GKJ) r26, (X.GEG) r27, (X.C267324bN) r28, (X.C52058GDe) r29, (X.C52093GEn) r30, (X.C52091GEl) r31, (int) r32, (int) r33)     // Catch:{ Exception -> 0x0ba4 }
            r2 = 10
            goto L_0x05c9
        L_0x0469:
            r3 = 3
            goto L_0x0470
        L_0x046b:
            r3 = 8
            goto L_0x0470
        L_0x046e:
            r3 = 11
        L_0x0470:
            X.GDn r6 = new X.GDn     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>((X.C267324bN) r4, (int) r3)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x05eb
        L_0x0477:
            X.GBH r1 = r2.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A0Q     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r6 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2O r6 = (X.H2O) r6     // Catch:{ Exception -> 0x0ba4 }
            X.0qQ.A0B(r14, r3)     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.common.session.UserSession r8 = r6.A00     // Catch:{ Exception -> 0x0ba4 }
            r43 = 0
            X.0Tu r7 = X.0Tu.A06     // Catch:{ Exception -> 0x0ba4 }
            r1 = 36313725150431444(0x810324001008d4, double:3.028284236542745E-306)
            boolean r1 = X.182.A06(r7, r8, r1)     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x04e0
            X.GJ5 r20 = X.GJ5.NETEGO     // Catch:{ Exception -> 0x0ba4 }
        L_0x0497:
            X.GEG r19 = new X.GEG     // Catch:{ Exception -> 0x0ba4 }
            r21 = r12
            r22 = r12
            r23 = r3
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r3
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r37 = r3
            r38 = r12
            r39 = r3
            r40 = r12
            r41 = r12
            r42 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0ba4 }
            r1 = 21
            X.JTb r10 = new X.JTb     // Catch:{ Exception -> 0x0ba4 }
            r10.<init>(r12, r1)     // Catch:{ Exception -> 0x0ba4 }
            X.GEH r1 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            boolean r2 = r15.A00()     // Catch:{ Exception -> 0x0ba4 }
            if (r2 == 0) goto L_0x04e3
            boolean r2 = r4.A0J()     // Catch:{ Exception -> 0x0ba4 }
            r25 = 1
            if (r2 != 0) goto L_0x04e5
            goto L_0x04e3
        L_0x04e0:
            r20 = 0
            goto L_0x0497
        L_0x04e3:
            r25 = 0
        L_0x04e5:
            r23 = 0
            r18 = r1
            r20 = r15
            r21 = r4
            r22 = r14
            r24 = r16
            X.GKJ r44 = r18.A05(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0ba4 }
            X.GEb r1 = r6.A02     // Catch:{ Exception -> 0x0ba4 }
            r24 = r1
            r25 = r19
            r26 = r15
            r27 = r4
            r28 = r14
            r29 = r16
            r30 = r12
            X.GEl r48 = r24.A05(r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0ba4 }
            X.H2K r8 = r6.A03     // Catch:{ Exception -> 0x0ba4 }
            X.GmE r7 = r4.A02()     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x059d
            java.util.List r2 = r7.A0G     // Catch:{ Exception -> 0x0ba4 }
            if (r2 == 0) goto L_0x059d
            java.lang.String r1 = r7.A07     // Catch:{ Exception -> 0x0ba4 }
            r35 = r1
            java.lang.String r1 = r7.A0D     // Catch:{ Exception -> 0x0ba4 }
            r36 = r1
            java.lang.String r1 = r7.A09     // Catch:{ Exception -> 0x0ba4 }
            r37 = r1
            java.lang.String r1 = r7.A0C     // Catch:{ Exception -> 0x0ba4 }
            r38 = r1
            java.lang.String r1 = r7.A0E     // Catch:{ Exception -> 0x0ba4 }
            r39 = r1
            java.lang.String r15 = r7.A0B     // Catch:{ Exception -> 0x0ba4 }
            int r42 = r2.size()     // Catch:{ Exception -> 0x0ba4 }
            r1 = 10
            int r1 = X.0Yv.A1E(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0ba4 }
            java.util.Iterator r18 = r2.iterator()     // Catch:{ Exception -> 0x0ba4 }
            r25 = 0
        L_0x0540:
            boolean r1 = r18.hasNext()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x05a0
            java.lang.Object r2 = r18.next()     // Catch:{ Exception -> 0x0ba4 }
            int r17 = r25 + 1
            if (r25 >= 0) goto L_0x0553
            X.0sr.A1T()     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0aa2
        L_0x0553:
            X.BBL r2 = (X.BBL) r2     // Catch:{ Exception -> 0x0ba4 }
            X.5vG r11 = r8.A00     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.common.session.UserSession r9 = r8.A01     // Catch:{ Exception -> 0x0ba4 }
            r1 = 2
            X.0qQ.A0B(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r1 = r2.A05     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r2 = r1.get(r12)     // Catch:{ Exception -> 0x0ba4 }
            X.Goz r2 = (X.C53467Goz) r2     // Catch:{ Exception -> 0x0ba4 }
            X.1Xj r2 = r2.A02     // Catch:{ Exception -> 0x0ba4 }
            r24 = r23
            r26 = r12
            r27 = r3
            r28 = r12
            r29 = r12
            r32 = r3
            r20 = r11
            r21 = r9
            r22 = r2
            X.62P r9 = r20.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r1 = X.00k.A0O(r1, r12)     // Catch:{ Exception -> 0x0ba4 }
            X.Goz r1 = (X.C53467Goz) r1     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0598
            X.1Xj r1 = r1.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x0598
            X.1Xy r1 = r1.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.4oX r2 = r1.C7C()     // Catch:{ Exception -> 0x0ba4 }
        L_0x058f:
            X.JwL r1 = new X.JwL     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>((X.C274544oX) r2, (X.AnonymousClass62P) r9)     // Catch:{ Exception -> 0x0ba4 }
            r6.add(r1)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x059a
        L_0x0598:
            r2 = 0
            goto L_0x058f
        L_0x059a:
            r25 = r17
            goto L_0x0540
        L_0x059d:
            X.Ieo r2 = X.C57685Ieo.A00     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x05b5
        L_0x05a0:
            X.62P r41 = X.AnonymousClass62Q.A00(r6)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Integer r1 = r7.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x05ac
            int r43 = r1.intValue()     // Catch:{ Exception -> 0x0ba4 }
        L_0x05ac:
            X.GrJ r2 = new X.GrJ     // Catch:{ Exception -> 0x0ba4 }
            r34 = r2
            r40 = r15
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0ba4 }
        L_0x05b5:
            X.JNJ r2 = (X.JNJ) r2     // Catch:{ Exception -> 0x0ba4 }
            X.Gqr r1 = new X.Gqr     // Catch:{ Exception -> 0x0ba4 }
            r42 = r1
            r43 = r10
            r45 = r19
            r46 = r4
            r47 = r14
            r49 = r2
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x0ba4 }
            r2 = 6
        L_0x05c9:
            X.GDn r6 = new X.GDn     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>((java.lang.Object) r1, (int) r2)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x05eb
        L_0x05cf:
            X.GBH r1 = r2.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A0O     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.GDr r3 = (X.C52071GDr) r3     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r2 = r4.getId()     // Catch:{ Exception -> 0x0ba4 }
            X.GmI r1 = r4.A01()     // Catch:{ Exception -> 0x0ba4 }
            X.GZ2 r2 = r3.A05(r1, r2)     // Catch:{ Exception -> 0x0ba4 }
            r1 = 4
            X.GDn r6 = new X.GDn     // Catch:{ Exception -> 0x0ba4 }
            r6.<init>((java.lang.Object) r2, (int) r1)     // Catch:{ Exception -> 0x0ba4 }
        L_0x05eb:
            X.GBc r1 = r5.A09     // Catch:{ Exception -> 0x0ba4 }
            X.GBa r1 = r1.A00     // Catch:{ Exception -> 0x0ba4 }
            X.2We r1 = r1.A00     // Catch:{ Exception -> 0x0ba4 }
            if (r1 == 0) goto L_0x05fe
            int r2 = r1.getItemCount()     // Catch:{ Exception -> 0x0ba4 }
        L_0x05f7:
            boolean r1 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()     // Catch:{ Exception -> 0x0ba4 }
            if (r1 != 0) goto L_0x0603
            goto L_0x0600
        L_0x05fe:
            r2 = 0
            goto L_0x05f7
        L_0x0600:
            r45 = 0
            goto L_0x0615
        L_0x0603:
            int r2 = r2 + -1
            r1 = r16
            if (r1 != r2) goto L_0x060a
            goto L_0x060d
        L_0x060a:
            java.lang.String r3 = ""
            goto L_0x060f
        L_0x060d:
            java.lang.String r3 = "_page_last_item"
        L_0x060f:
            java.lang.String r2 = "scrollable_view_child_"
            java.lang.String r45 = X.002.A0c(r2, r3, r1)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0615:
            com.instagram.common.session.UserSession r2 = r0.A0N     // Catch:{ Exception -> 0x0ba4 }
            X.GAc r1 = r0.A0Z     // Catch:{ Exception -> 0x0ba4 }
            r18 = 0
            X.GCs r17 = new X.GCs     // Catch:{ Exception -> 0x0ba4 }
            r3 = r17
            r3.<init>(r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            r3 = 7
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x06c1
            java.lang.Object r8 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.GFK r8 = (X.GFK) r8     // Catch:{ Exception -> 0x0ba4 }
            X.GF9 r39 = X.C52007GBe.A00(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JRO r3 = r0.A0M     // Catch:{ Exception -> 0x0ba4 }
            r26 = r3
            com.instagram.clips.intf.ClipsViewerConfig r3 = r0.A0K     // Catch:{ Exception -> 0x0ba4 }
            r52 = r3
            X.JTG r7 = r0.A03     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0a94
            X.JTB r34 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r3 = r0.A06     // Catch:{ Exception -> 0x0ba4 }
            r49 = r3
            java.util.HashMap r3 = r0.A0i     // Catch:{ Exception -> 0x0ba4 }
            r47 = r3
            java.util.HashMap r3 = r0.A0e     // Catch:{ Exception -> 0x0ba4 }
            r48 = r3
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            r24 = r3
            X.2V5 r3 = r0.A0H     // Catch:{ Exception -> 0x0ba4 }
            r23 = r3
            X.GBS r3 = r0.A0Q     // Catch:{ Exception -> 0x0ba4 }
            r21 = r3
            java.lang.String r3 = r0.A0d     // Catch:{ Exception -> 0x0ba4 }
            r20 = r3
            X.2nI r3 = r0.A0I     // Catch:{ Exception -> 0x0ba4 }
            r22 = r3
            X.JQX r6 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x0a97
            X.6ag r3 = r0.A0P     // Catch:{ Exception -> 0x0ba4 }
            r19 = r3
            X.GAk r15 = r0.A0V     // Catch:{ Exception -> 0x0ba4 }
            X.GHo r4 = new X.GHo     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JPD r14 = r0.A0J     // Catch:{ Exception -> 0x0ba4 }
            X.GF2 r11 = r0.A0a     // Catch:{ Exception -> 0x0ba4 }
            X.H3C r10 = r0.A0X     // Catch:{ Exception -> 0x0ba4 }
            boolean r3 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            X.2xi r9 = r0.A0R     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r46 = "clips_lithoview_parent_component"
            X.GFJ r0 = new X.GFJ     // Catch:{ Exception -> 0x0ba4 }
            r25 = r24
            r27 = r2
            r28 = r18
            r29 = r1
            r30 = r19
            r31 = r18
            r32 = r21
            r33 = r9
            r35 = r4
            r36 = r15
            r37 = r7
            r38 = r10
            r40 = r8
            r41 = r6
            r42 = r17
            r43 = r11
            r44 = r20
            r50 = r3
            r51 = r12
            r19 = r0
            r20 = r23
            r21 = r18
            r23 = r14
            r24 = r52
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.ORGANIC     // Catch:{ Exception -> 0x0ba4 }
        L_0x06b3:
            X.GDo r4 = new X.GDo     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r0, r1, r2)     // Catch:{ Exception -> 0x0ba4 }
            X.7hM r3 = new X.7hM     // Catch:{ Exception -> 0x0ba4 }
            r3.<init>()     // Catch:{ Exception -> 0x0ba4 }
            r3.A00 = r4     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0a4f
        L_0x06c1:
            r3 = 5
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0706
            X.JTB r27 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r10 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r10 = (X.C267324bN) r10     // Catch:{ Exception -> 0x0ba4 }
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            X.GDe r22 = r3.BzC(r10)     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r31 = r3.BzD(r10)     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r9 = r0.A0f     // Catch:{ Exception -> 0x0ba4 }
            X.GAk r8 = r0.A0V     // Catch:{ Exception -> 0x0ba4 }
            X.GAh r7 = r0.A0S     // Catch:{ Exception -> 0x0ba4 }
            boolean r6 = r0.A0l     // Catch:{ Exception -> 0x0ba4 }
            com.instagram.clips.intf.ClipsViewerConfig r4 = r0.A0K     // Catch:{ Exception -> 0x0ba4 }
            X.2pL r3 = r0.A0O     // Catch:{ Exception -> 0x0ba4 }
            X.JT5 r11 = r0.A0c     // Catch:{ Exception -> 0x0ba4 }
            X.GwK r0 = new X.GwK     // Catch:{ Exception -> 0x0ba4 }
            r19 = r0
            r20 = r4
            r21 = r10
            r23 = r2
            r24 = r1
            r25 = r3
            r26 = r7
            r28 = r8
            r29 = r11
            r30 = r9
            r32 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.MULTI_ADS     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x0706:
            r51 = 0
            boolean r3 = X.C52067GDn.A00(r12, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x07c4
            java.lang.Object r10 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.GFK r10 = (X.GFK) r10     // Catch:{ Exception -> 0x0ba4 }
            X.GF9 r39 = X.C52007GBe.A00(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JRO r3 = r0.A0M     // Catch:{ Exception -> 0x0ba4 }
            r26 = r3
            com.instagram.clips.intf.ClipsViewerConfig r3 = r0.A0K     // Catch:{ Exception -> 0x0ba4 }
            r53 = r3
            X.JTG r9 = r0.A03     // Catch:{ Exception -> 0x0ba4 }
            if (r9 == 0) goto L_0x0a94
            X.JTB r34 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r3 = r0.A06     // Catch:{ Exception -> 0x0ba4 }
            r49 = r3
            java.util.HashMap r3 = r0.A0i     // Catch:{ Exception -> 0x0ba4 }
            r47 = r3
            java.util.HashMap r3 = r0.A0e     // Catch:{ Exception -> 0x0ba4 }
            r48 = r3
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            r25 = r3
            X.2V5 r3 = r0.A0H     // Catch:{ Exception -> 0x0ba4 }
            r52 = r3
            X.GBS r3 = r0.A0Q     // Catch:{ Exception -> 0x0ba4 }
            r24 = r3
            java.lang.String r3 = r0.A0d     // Catch:{ Exception -> 0x0ba4 }
            r21 = r3
            X.2nI r3 = r0.A0I     // Catch:{ Exception -> 0x0ba4 }
            r22 = r3
            X.JQX r8 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            if (r8 == 0) goto L_0x0a97
            X.6ag r3 = r0.A0P     // Catch:{ Exception -> 0x0ba4 }
            r20 = r3
            X.GAk r3 = r0.A0V     // Catch:{ Exception -> 0x0ba4 }
            r19 = r3
            X.GTV r7 = new X.GTV     // Catch:{ Exception -> 0x0ba4 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JPD r3 = r0.A0J     // Catch:{ Exception -> 0x0ba4 }
            r23 = r3
            X.GF2 r15 = r0.A0a     // Catch:{ Exception -> 0x0ba4 }
            boolean r14 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            boolean r12 = r0.A0l     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r6 = r10.A02     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r6 = (X.C267324bN) r6     // Catch:{ Exception -> 0x0ba4 }
            X.3OA r3 = r6.A06()     // Catch:{ Exception -> 0x0ba4 }
            X.1Xj r3 = r3.A0K     // Catch:{ Exception -> 0x0ba4 }
            X.1Xy r3 = r3.A0C     // Catch:{ Exception -> 0x0ba4 }
            X.3lZ r3 = r3.getInjected()     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x07c2
            java.lang.String r11 = r3.BM9()     // Catch:{ Exception -> 0x0ba4 }
        L_0x0777:
            X.3OA r3 = r6.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r3 = r3.A0S     // Catch:{ Exception -> 0x0ba4 }
            X.Gak r4 = new X.Gak     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r1, r2, r11, r3)     // Catch:{ Exception -> 0x0ba4 }
            X.XSH r11 = X.XSH.PAGE_INSTAGRAM_REELS_TAB     // Catch:{ Exception -> 0x0ba4 }
            X.Gal r3 = new X.Gal     // Catch:{ Exception -> 0x0ba4 }
            r3.<init>(r11, r1, r2)     // Catch:{ Exception -> 0x0ba4 }
            X.2xi r11 = r0.A0R     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r46 = "clips_lithoview_parent_component"
            X.GFJ r0 = new X.GFJ     // Catch:{ Exception -> 0x0ba4 }
            r27 = r2
            r28 = r3
            r29 = r1
            r30 = r20
            r31 = r4
            r32 = r24
            r33 = r11
            r35 = r7
            r36 = r19
            r37 = r9
            r38 = r18
            r40 = r10
            r41 = r8
            r42 = r17
            r43 = r15
            r44 = r21
            r50 = r14
            r51 = r12
            r19 = r0
            r20 = r52
            r21 = r18
            r24 = r53
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x07c2:
            r11 = 0
            goto L_0x0777
        L_0x07c4:
            r3 = 6
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x08df
            java.lang.Object r8 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.Gqr r8 = (X.C53576Gqr) r8     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r9 = r8.A00     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r3 = r9.A0T     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x080d
            X.GDE r1 = r0.A0W     // Catch:{ Exception -> 0x0ba4 }
            X.GBH r1 = r1.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r6 = r1.A0Q     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r1 = r6.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2O r1 = (X.H2O) r1     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r1 = r1.A05     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.Hlc r4 = (X.C55679Hlc) r4     // Catch:{ Exception -> 0x0ba4 }
            r3 = 27
            X.JGB r1 = new X.JGB     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x0ba4 }
            r4.A00 = r1     // Catch:{ Exception -> 0x0ba4 }
            android.app.Activity r4 = r0.A0F     // Catch:{ Exception -> 0x0ba4 }
            X.JNJ r3 = r8.A01     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2O r0 = (X.H2O) r0     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r0 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.Hlc r1 = (X.C55679Hlc) r1     // Catch:{ Exception -> 0x0ba4 }
            X.Gtr r0 = new X.Gtr     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r4, r2, r1, r3)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0809:
            X.5o2 r1 = X.C295365o2.NETEGO     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x080d:
            X.GmE r3 = r9.A02()     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0823
            java.lang.String r4 = r3.A0B     // Catch:{ Exception -> 0x0ba4 }
        L_0x0815:
            java.lang.String r3 = "reels_megaphone"
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0825
            X.GsR r0 = new X.GsR     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r9, r1)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0809
        L_0x0823:
            r4 = 0
            goto L_0x0815
        L_0x0825:
            java.lang.String r3 = "ad4ad_in_reels"
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0862
            X.GDE r3 = r0.A0W     // Catch:{ Exception -> 0x0ba4 }
            X.GBH r3 = r3.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r3 = r3.A0Q     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.H2O r3 = (X.H2O) r3     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r3 = r3.A04     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r7 = r3.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.Hlb r7 = (X.C55678Hlb) r7     // Catch:{ Exception -> 0x0ba4 }
            X.GCo r6 = r0.A04     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x0a9d
            r4 = 22
            X.InR r3 = new X.InR     // Catch:{ Exception -> 0x0ba4 }
            r3.<init>(r6, r4)     // Catch:{ Exception -> 0x0ba4 }
            r7.A00 = r3     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r3 = r0.A0g     // Catch:{ Exception -> 0x0ba4 }
            X.GuA r0 = new X.GuA     // Catch:{ Exception -> 0x0ba4 }
            r19 = r0
            r20 = r9
            r21 = r1
            r22 = r2
            r23 = r7
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0809
        L_0x0862:
            X.GF9 r39 = X.C52007GBe.A00(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JRO r3 = r0.A0M     // Catch:{ Exception -> 0x0ba4 }
            r26 = r3
            com.instagram.clips.intf.ClipsViewerConfig r3 = r0.A0K     // Catch:{ Exception -> 0x0ba4 }
            r52 = r3
            X.JTG r7 = r0.A03     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0a94
            X.JTB r34 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r3 = r0.A06     // Catch:{ Exception -> 0x0ba4 }
            r24 = r3
            java.util.HashMap r3 = r0.A0i     // Catch:{ Exception -> 0x0ba4 }
            r23 = r3
            java.util.HashMap r3 = r0.A0e     // Catch:{ Exception -> 0x0ba4 }
            r22 = r3
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            r21 = r3
            X.2V5 r3 = r0.A0H     // Catch:{ Exception -> 0x0ba4 }
            r20 = r3
            X.GBS r3 = r0.A0Q     // Catch:{ Exception -> 0x0ba4 }
            r19 = r3
            java.lang.String r15 = r0.A0d     // Catch:{ Exception -> 0x0ba4 }
            X.2nI r14 = r0.A0I     // Catch:{ Exception -> 0x0ba4 }
            X.JQX r6 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x0a97
            X.6ag r12 = r0.A0P     // Catch:{ Exception -> 0x0ba4 }
            X.GAk r11 = r0.A0V     // Catch:{ Exception -> 0x0ba4 }
            X.JPD r10 = r0.A0J     // Catch:{ Exception -> 0x0ba4 }
            X.GF2 r4 = r0.A0a     // Catch:{ Exception -> 0x0ba4 }
            boolean r3 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            X.2xi r9 = r0.A0R     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r46 = "clips_lithoview_parent_component"
            X.GFJ r0 = new X.GFJ     // Catch:{ Exception -> 0x0ba4 }
            r25 = r21
            r27 = r2
            r28 = r18
            r29 = r1
            r30 = r12
            r31 = r18
            r32 = r19
            r33 = r9
            r35 = r18
            r36 = r11
            r37 = r7
            r38 = r18
            r40 = r8
            r41 = r6
            r42 = r17
            r43 = r4
            r44 = r15
            r47 = r23
            r48 = r22
            r49 = r24
            r50 = r3
            r19 = r0
            r21 = r18
            r22 = r14
            r23 = r10
            r24 = r52
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0809
        L_0x08df:
            r3 = 2
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x08f3
            java.lang.Object r3 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r3 = (X.C267324bN) r3     // Catch:{ Exception -> 0x0ba4 }
            X.GwO r0 = new X.GwO     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.BRAND_SURVEY     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x08f3:
            r3 = 10
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x097e
            java.lang.Object r8 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.GFK r8 = (X.GFK) r8     // Catch:{ Exception -> 0x0ba4 }
            X.GF9 r39 = X.C52007GBe.A00(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.JRO r3 = r0.A0M     // Catch:{ Exception -> 0x0ba4 }
            r26 = r3
            com.instagram.clips.intf.ClipsViewerConfig r3 = r0.A0K     // Catch:{ Exception -> 0x0ba4 }
            r52 = r3
            X.JTG r7 = r0.A03     // Catch:{ Exception -> 0x0ba4 }
            if (r7 == 0) goto L_0x0a94
            X.JTB r34 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.List r3 = r0.A06     // Catch:{ Exception -> 0x0ba4 }
            r24 = r3
            java.util.HashMap r3 = r0.A0i     // Catch:{ Exception -> 0x0ba4 }
            r23 = r3
            java.util.HashMap r3 = r0.A0e     // Catch:{ Exception -> 0x0ba4 }
            r22 = r3
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            r21 = r3
            X.2V5 r3 = r0.A0H     // Catch:{ Exception -> 0x0ba4 }
            r20 = r3
            X.GBS r3 = r0.A0Q     // Catch:{ Exception -> 0x0ba4 }
            r19 = r3
            java.lang.String r15 = r0.A0d     // Catch:{ Exception -> 0x0ba4 }
            X.2nI r14 = r0.A0I     // Catch:{ Exception -> 0x0ba4 }
            X.JQX r6 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x0a97
            X.6ag r12 = r0.A0P     // Catch:{ Exception -> 0x0ba4 }
            X.GAk r11 = r0.A0V     // Catch:{ Exception -> 0x0ba4 }
            X.JPD r10 = r0.A0J     // Catch:{ Exception -> 0x0ba4 }
            X.GF2 r4 = r0.A0a     // Catch:{ Exception -> 0x0ba4 }
            boolean r3 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            X.2xi r9 = r0.A0R     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r46 = "clips_lithoview_parent_component"
            X.GFJ r0 = new X.GFJ     // Catch:{ Exception -> 0x0ba4 }
            r25 = r21
            r27 = r2
            r28 = r18
            r29 = r1
            r30 = r12
            r31 = r18
            r32 = r19
            r33 = r9
            r35 = r18
            r36 = r11
            r37 = r7
            r38 = r18
            r40 = r8
            r41 = r6
            r42 = r17
            r43 = r4
            r44 = r15
            r47 = r23
            r48 = r22
            r49 = r24
            r50 = r3
            r19 = r0
            r21 = r18
            r22 = r14
            r23 = r10
            r24 = r52
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.QP     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x097e:
            r3 = 3
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0992
            java.lang.Object r1 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r1 = (X.C267324bN) r1     // Catch:{ Exception -> 0x0ba4 }
            X.GGm r0 = new X.GGm     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.GHOST     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x0992:
            r3 = 8
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x09a9
            java.lang.Object r4 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r4 = (X.C267324bN) r4     // Catch:{ Exception -> 0x0ba4 }
            boolean r3 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            X.Gt6 r0 = new X.Gt6     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r4, r1, r3)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.PREVIEW     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x09a9:
            r3 = 4
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x09e7
            X.GDE r3 = r0.A0W     // Catch:{ Exception -> 0x0ba4 }
            X.GBH r3 = r3.A00     // Catch:{ Exception -> 0x0ba4 }
            X.0eM r3 = r3.A0O     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r10 = r3.getValue()     // Catch:{ Exception -> 0x0ba4 }
            X.GDr r10 = (X.C52071GDr) r10     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r9 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.GZ2 r9 = (X.GZ2) r9     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r8 = r0.A0g     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r7 = r0.A0h     // Catch:{ Exception -> 0x0ba4 }
            X.I4A r6 = r0.A0Y     // Catch:{ Exception -> 0x0ba4 }
            boolean r4 = r0.A0l     // Catch:{ Exception -> 0x0ba4 }
            X.JT5 r3 = r0.A0b     // Catch:{ Exception -> 0x0ba4 }
            X.GYw r0 = new X.GYw     // Catch:{ Exception -> 0x0ba4 }
            r19 = r0
            r20 = r9
            r21 = r2
            r22 = r10
            r23 = r6
            r24 = r1
            r25 = r3
            r26 = r8
            r27 = r7
            r28 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.MIDCARD     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x09e7:
            r3 = 9
            boolean r3 = X.C52067GDn.A00(r3, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r3 == 0) goto L_0x0a2a
            java.lang.Object r10 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r10 = (X.C267324bN) r10     // Catch:{ Exception -> 0x0ba4 }
            X.GC5 r9 = r0.A02     // Catch:{ Exception -> 0x0ba4 }
            if (r9 == 0) goto L_0x0a9a
            X.JTB r25 = r0.A06()     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r8 = r0.A0i     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r7 = r0.A0e     // Catch:{ Exception -> 0x0ba4 }
            X.JQX r6 = r0.A05     // Catch:{ Exception -> 0x0ba4 }
            if (r6 == 0) goto L_0x0a97
            X.JSx r3 = r0.A0L     // Catch:{ Exception -> 0x0ba4 }
            X.GDe r22 = r3.BzC(r10)     // Catch:{ Exception -> 0x0ba4 }
            X.2V5 r4 = r0.A0H     // Catch:{ Exception -> 0x0ba4 }
            boolean r3 = r0.A0m     // Catch:{ Exception -> 0x0ba4 }
            X.GvU r0 = new X.GvU     // Catch:{ Exception -> 0x0ba4 }
            r19 = r0
            r20 = r4
            r21 = r10
            r23 = r1
            r24 = r2
            r26 = r9
            r27 = r6
            r28 = r8
            r29 = r7
            r30 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.QPMIDCARD     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x0a2a:
            r0 = 11
            boolean r0 = X.C52067GDn.A00(r0, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0a3f
            java.lang.Object r1 = r6.A01     // Catch:{ Exception -> 0x0ba4 }
            X.4bN r1 = (X.C267324bN) r1     // Catch:{ Exception -> 0x0ba4 }
            X.Grw r0 = new X.Grw     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.UNAVAILABLE     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x0a3f:
            r0 = 1
            boolean r0 = X.C52067GDn.A00(r0, r6)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0aa8
            X.Gre r0 = new X.Gre     // Catch:{ Exception -> 0x0ba4 }
            r0.<init>()     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r1 = X.C295365o2.BLEND_END_OF_FEED     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x06b3
        L_0x0a4f:
            if (r16 != 0) goto L_0x0a67
            X.5o2 r1 = r13.A01     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r0 = X.C295365o2.ORGANIC     // Catch:{ Exception -> 0x0ba4 }
            if (r1 != r0) goto L_0x0a67
            r0 = 16
            X.J6R r2 = new X.J6R     // Catch:{ Exception -> 0x0ba4 }
            r2.<init>(r0, r5, r13)     // Catch:{ Exception -> 0x0ba4 }
            X.3al r1 = new X.3al     // Catch:{ Exception -> 0x0ba4 }
            r0 = r18
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0ba4 }
            r3.A01 = r1     // Catch:{ Exception -> 0x0ba4 }
        L_0x0a67:
            X.7ho r2 = new X.7ho     // Catch:{ Exception -> 0x0ba4 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0ba4 }
            boolean r0 = r5.A0F     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0c2f
            X.2We r0 = r5.A00     // Catch:{ Exception -> 0x0ba4 }
            if (r0 != 0) goto L_0x0c2f
            X.7iC r4 = r5.A03     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r3 = r13.getId()     // Catch:{ Exception -> 0x0ba4 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0ba4 }
            boolean r0 = r4.A03     // Catch:{ all -> 0x0a90 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 != 0) goto L_0x0b9c
            monitor-enter(r4)     // Catch:{ Exception -> 0x0ba4 }
            java.util.concurrent.BlockingQueue r0 = r4.A02     // Catch:{ all -> 0x0a90 }
            if (r0 != 0) goto L_0x0b8c
            r1 = 10
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x0a90 }
            r0.<init>(r1)     // Catch:{ all -> 0x0a90 }
            r4.A02 = r0     // Catch:{ all -> 0x0a90 }
            goto L_0x0b8c
        L_0x0a90:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0038
        L_0x0a94:
            java.lang.String r0 = "mvvmDelegate"
            goto L_0x0a9f
        L_0x0a97:
            java.lang.String r0 = "clipsVideoPlayerLithoHelper"
            goto L_0x0a9f
        L_0x0a9a:
            java.lang.String r0 = "qpMidcardDelegate"
            goto L_0x0a9f
        L_0x0a9d:
            java.lang.String r0 = "netegoNavigator"
        L_0x0a9f:
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0aa2:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0038
        L_0x0aa8:
            java.lang.String r0 = "Item type not supported in Litho."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0038
        L_0x0ab1:
            X.5o2 r2 = r13.A01     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r0 = X.C295365o2.NETEGO     // Catch:{ Exception -> 0x0ba4 }
            r1 = 0
            if (r2 != r0) goto L_0x0b48
            X.GmE r4 = r13.A02()     // Catch:{ Exception -> 0x0ba4 }
            if (r4 == 0) goto L_0x0b45
            java.lang.String r3 = r4.A0B     // Catch:{ Exception -> 0x0ba4 }
        L_0x0ac0:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b34
            java.util.Map r1 = r5.A0D     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r0 = X.C295365o2.NETEGO_SUGGESTED_CREATORS     // Catch:{ Exception -> 0x0ba4 }
        L_0x0acc:
            java.lang.Object r7 = r1.get(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.GBR r7 = (X.GBR) r7     // Catch:{ Exception -> 0x0ba4 }
        L_0x0ad2:
            boolean r0 = r7 instanceof X.GBT     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b0c
            X.HJo r4 = new X.HJo     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0adb:
            com.instagram.common.session.UserSession r8 = r5.A06     // Catch:{ Exception -> 0x0ba4 }
            X.GBc r9 = r5.A09     // Catch:{ Exception -> 0x0ba4 }
            X.A7K r6 = new X.A7K     // Catch:{ Exception -> 0x0ba4 }
            r10 = r4
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0ba4 }
            java.util.HashMap r3 = r5.A0C     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r1 = r3.get(r7)     // Catch:{ Exception -> 0x0ba4 }
            X.7i8 r1 = (X.C338547i8) r1     // Catch:{ Exception -> 0x0ba4 }
            if (r1 != 0) goto L_0x0afe
            android.view.LayoutInflater r0 = r5.A02     // Catch:{ Exception -> 0x0ba4 }
            X.0qQ.A06(r0)     // Catch:{ Exception -> 0x0ba4 }
            X.7i8 r1 = new X.7i8     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0, r7, r4)     // Catch:{ Exception -> 0x0ba4 }
            r3.put(r7, r1)     // Catch:{ Exception -> 0x0ba4 }
        L_0x0afe:
            int r0 = r2.ordinal()     // Catch:{ Exception -> 0x0ba4 }
            X.7hr r2 = new X.7hr     // Catch:{ Exception -> 0x0ba4 }
            r2.<init>(r6, r1, r0)     // Catch:{ Exception -> 0x0ba4 }
            X.0qQ.A0A(r2)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0ba3
        L_0x0b0c:
            boolean r0 = r7 instanceof X.GBU     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b16
            X.HJn r4 = new X.HJn     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0adb
        L_0x0b16:
            boolean r0 = r7 instanceof X.GBV     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b20
            X.GZ7 r4 = new X.GZ7     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0adb
        L_0x0b20:
            boolean r0 = r7 instanceof X.C14049Tot     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b2a
            X.HJm r4 = new X.HJm     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0adb
        L_0x0b2a:
            boolean r0 = r7 instanceof X.GBW     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b6f
            X.HJl r4 = new X.HJl     // Catch:{ Exception -> 0x0ba4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0adb
        L_0x0b34:
            if (r4 == 0) goto L_0x0b38
            java.lang.String r1 = r4.A0B     // Catch:{ Exception -> 0x0ba4 }
        L_0x0b38:
            java.lang.String r0 = "friend_su_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x0ba4 }
            if (r0 == 0) goto L_0x0b48
            java.util.Map r1 = r5.A0D     // Catch:{ Exception -> 0x0ba4 }
            X.5o2 r0 = X.C295365o2.NETEGO_SUGGESTED_USERS     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0acc
        L_0x0b45:
            r3 = r1
            goto L_0x0ac0
        L_0x0b48:
            java.util.Map r0 = r5.A0D     // Catch:{ Exception -> 0x0ba4 }
            java.lang.Object r7 = r0.get(r2)     // Catch:{ Exception -> 0x0ba4 }
            X.GBR r7 = (X.GBR) r7     // Catch:{ Exception -> 0x0ba4 }
            if (r7 != 0) goto L_0x0ad2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = "Definition for type "
            r1.append(r0)     // Catch:{ Exception -> 0x0ba4 }
            r1.append(r2)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = " is null"
            r1.append(r0)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0038
        L_0x0b6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = "Item type ["
            r1.append(r0)     // Catch:{ Exception -> 0x0ba4 }
            r1.append(r2)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = "] is not supported by RecyclerBinder or the corresponding definition is Null."
            r1.append(r0)     // Catch:{ Exception -> 0x0ba4 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0ba4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0ba4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ba4 }
            goto L_0x0038
        L_0x0b8c:
            monitor-exit(r4)     // Catch:{ Exception -> 0x0ba4 }
            r0 = 4630(0x1216, float:6.488E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0ba4 }
            r2.A8B(r0, r3)     // Catch:{ Exception -> 0x0ba4 }
            java.util.concurrent.BlockingQueue r0 = r4.A02     // Catch:{ Exception -> 0x0ba4 }
            r0.offer(r2)     // Catch:{ Exception -> 0x0ba4 }
            return r2
        L_0x0b9c:
            r1 = 1
            r0 = r18
            X.C338587iC.A00(r2, r4, r0, r3, r1)     // Catch:{ Exception -> 0x0ba4 }
            return r2
        L_0x0ba3:
            return r2
        L_0x0ba4:
            com.instagram.common.session.UserSession r3 = r5.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328847729245825(0x8110e500003e81, double:3.037847816278697E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0c2b
            X.GBg r2 = r5.A07
            java.util.List r0 = r2.A0I()
            java.lang.Object r9 = X.00k.A0L(r0)
            X.4bN r9 = (X.C267324bN) r9
            r7 = 817895045(0x30c01685, float:1.3976239E-9)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "indexOutOfBoundsPosition"
            X.0eP r8 = new X.0eP
            r8.<init>(r0, r1)
            int r0 = r2.A0A()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dataSourceSize"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r1)
            if (r9 == 0) goto L_0x0c90
            X.5o2 r0 = r9.A01
            if (r0 == 0) goto L_0x0c90
            int r0 = r0.ordinal()
        L_0x0beb:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "lastClipsItemType"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            java.lang.String r2 = "invalid_definition"
            if (r9 == 0) goto L_0x0c04
            X.GBX r0 = r5.A05
            boolean r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x0c30
            java.lang.String r2 = "LithoClipsItemDefinition"
        L_0x0c04:
            java.lang.String r0 = "lastClipsItemDefinition"
            X.0eP r5 = new X.0eP
            r5.<init>(r0, r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "currentThreadStackTrace"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r8, r4, r3, r5, r0}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            java.lang.String r0 = "LITHO_RENDER_EMPTY_INFO_CLIPS_PAGE_ON_IOB"
            X.0kD.A0J(r0, r6, r1, r7)
        L_0x0c2b:
            X.7ho r2 = X.C338347ho.A00()
        L_0x0c2f:
            return r2
        L_0x0c30:
            X.5o2 r11 = r9.A01
            X.5o2 r0 = X.C295365o2.NETEGO
            r1 = 0
            if (r11 != r0) goto L_0x0c69
            X.GmE r10 = r9.A02()
            if (r10 == 0) goto L_0x0c67
            java.lang.String r9 = r10.A0B
        L_0x0c3f:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x0c56
            java.util.Map r1 = r5.A0D
            X.5o2 r0 = X.C295365o2.NETEGO_SUGGESTED_CREATORS
        L_0x0c4b:
            java.lang.Object r1 = r1.get(r0)
        L_0x0c4f:
            boolean r0 = r1 instanceof X.GBT
            if (r0 == 0) goto L_0x0c72
            java.lang.String r2 = "ClipsSurveyItemDefinition"
            goto L_0x0c04
        L_0x0c56:
            if (r10 == 0) goto L_0x0c5a
            java.lang.String r1 = r10.A0B
        L_0x0c5a:
            java.lang.String r0 = "friend_su_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0c69
            java.util.Map r1 = r5.A0D
            X.5o2 r0 = X.C295365o2.NETEGO_SUGGESTED_USERS
            goto L_0x0c4b
        L_0x0c67:
            r9 = r1
            goto L_0x0c3f
        L_0x0c69:
            java.util.Map r0 = r5.A0D
            java.lang.Object r1 = r0.get(r11)
            if (r1 != 0) goto L_0x0c4f
            goto L_0x0c04
        L_0x0c72:
            boolean r0 = r1 instanceof X.GBU
            if (r0 == 0) goto L_0x0c79
            java.lang.String r2 = "ClipsSuggestedCreatorsItemDefinition"
            goto L_0x0c04
        L_0x0c79:
            boolean r0 = r1 instanceof X.GBV
            if (r0 == 0) goto L_0x0c80
            java.lang.String r2 = "ClipsSuggestedUsersItemDefinition"
            goto L_0x0c04
        L_0x0c80:
            boolean r0 = r1 instanceof X.C14049Tot
            if (r0 == 0) goto L_0x0c88
            java.lang.String r2 = "CatchUpSummaryItemDefinition"
            goto L_0x0c04
        L_0x0c88:
            boolean r0 = r1 instanceof X.GBW
            if (r0 == 0) goto L_0x0c04
            java.lang.String r2 = "CatchUpCompletedItemDefinition"
            goto L_0x0c04
        L_0x0c90:
            r0 = -1
            goto L_0x0beb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52003GBa.A00(X.GBa, int):X.7hp");
    }

    public final void D7k() {
        this.A0H.DvY();
    }

    public static final void A01(C52003GBa gBa) {
        2We r1;
        if (EndToEnd.isRunningEndToEndTest() && (r1 = gBa.A00) != null && r1.getItemCount() > 0) {
            gBa.D1O(r1.getItemCount() - 1, 1, (Object) null);
        }
    }
}
