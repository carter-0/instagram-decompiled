package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GgQ  reason: case insensitive filesystem */
public final class C52973GgQ extends C361478gI {
    public C55718HmF A00;
    public I12 A01;
    public C55616Hkb A02;
    public YCQ A03;
    public final C284945Oz A04;
    public final UserSession A05;
    public final C56040Hrn A06;
    public final C56605I4e A07;
    public final C55615Hka A08;
    public final MagicModLaunchParams A09;
    public final C55935Hpz A0A;
    public final String A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final C249513ju A0G;
    public final AnonymousClass0r6 A0H;
    public final 05G A0I;
    public final AnonymousClass0Ud A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final void A07(C52973GgQ ggQ, C55509Hir hir, boolean z) {
        String str;
        Object value;
        C53395GnS gnS;
        HMG hmg;
        I12 i12;
        Integer num;
        C52973GgQ ggQ2 = ggQ;
        C55509Hir hir2 = hir;
        Application A0D2 = ggQ.A0D();
        0qQ.A0B(hir2, 1);
        if (!(hir2 instanceof HBQ) || (str = ((HBQ) hir2).A01) == null) {
            str = AnonymousClass7TE.A16(A0D2, 2131965768);
        }
        C56278Hvm.A01(A0D2, str, (String) null);
        05G r2 = ggQ.A0I;
        do {
            value = r2.getValue();
            gnS = (C53395GnS) value;
            if (!z) {
                hmg = HMG.ENTER_PROMPT;
            } else if (ggQ2.A0L) {
                hmg = HMG.GENERATED_IMAGE_SELECTION_4UP;
            } else {
                hmg = HMG.GENERATED_IMAGE_SELECTION;
            }
            i12 = ggQ2.A01;
            if (i12 == null) {
                i12 = gnS.A04;
            }
            if (!ggQ2.A0L) {
                num = G9w.A0X(r2).A07;
            } else {
                num = AnonymousClass05K.A0C;
            }
        } while (!r2.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, i12, (L82) null, hmg, gnS, num, (AnonymousClass62P) null, 0, 120828, false, false, false)));
    }

    public static final void A09(C52973GgQ ggQ, List list, int i, boolean z) {
        C55509Hir hir;
        C61076JwE jwE;
        I12 i12;
        C61076JwE jwE2;
        Object value;
        C52973GgQ ggQ2 = ggQ;
        String A0q = C51971G9r.A0q(ggQ.A04);
        boolean z2 = false;
        if (A0q.length() != 0) {
            I12 A022 = A00(ggQ).A02();
            boolean z3 = z;
            if (A022 == null || (jwE = A022.A01) == null) {
                hir = HBW.A00;
            } else {
                05G r3 = ggQ2.A0I;
                C61084JwM jwM = G9w.A0X(r3).A01;
                if (jwM == null || (i12 = (I12) jwM.A00) == null || (jwE2 = i12.A01) == null) {
                    hir = HBX.A00;
                } else {
                    boolean z4 = ggQ2.A0L;
                    boolean z5 = !z4;
                    if (z4 && !z) {
                        z2 = true;
                    }
                    if (z5 || z2) {
                        do {
                            value = r3.getValue();
                        } while (!r3.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, HMG.GENERATING, (C53395GnS) value, (Integer) null, (AnonymousClass62P) null, 0, 131070, false, false, false)));
                        ggQ2.A02 = new C55616Hkb(C51966G9m.A1L(new MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(jwE, jwE2, ggQ2, A0q, list, (AnonymousClass4D7) null, i, z3), C318116oQ.A00(ggQ2)), z);
                        return;
                    }
                    ggQ2.A02 = new C55616Hkb(C51966G9m.A1L(new MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(jwE, jwE2, ggQ2, A0q, list, (AnonymousClass4D7) null, i, z3), C318116oQ.A00(ggQ2)), z);
                    return;
                }
            }
            A07(ggQ2, hir, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0115, code lost:
        if (X.182.A06(r6, r5, 36319918495571716L) != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x012c, code lost:
        if (X.182.A06(r6, r5, 36319918496292619L) == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if ((r0 = (r0 = r11.A03).A03).length() <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C52973GgQ(android.app.Application r38, com.instagram.common.session.UserSession r39, X.C56605I4e r40, X.C55615Hka r41, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r42, java.lang.String r43, boolean r44) {
        /*
            r37 = this;
            r13 = r43
            X.8Ao r10 = new X.8Ao
            r1 = r38
            r5 = r39
            r10.<init>(r5, r1)
            X.8Ap r9 = new X.8Ap
            r9.<init>(r5)
            X.8Aq r8 = new X.8Aq
            r8.<init>(r1, r5)
            X.HDu r7 = new X.HDu
            r7.<init>(r5)
            r36 = r40
            r0 = r36
            X.AnonymousClass7TG.A1U(r1, r5, r0)
            r0 = 5
            r11 = r42
            X.0qQ.A0B(r11, r0)
            r3 = r37
            r3.<init>(r1)
            r3.A05 = r5
            r0 = r36
            r3.A07 = r0
            r15 = r41
            r3.A08 = r15
            r3.A09 = r11
            r3.A0B = r13
            if (r44 == 0) goto L_0x004c
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r0 = r11.A03
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x004c
            int r0 = r0.length()
            r18 = 1
            if (r0 > 0) goto L_0x006a
        L_0x004c:
            r18 = 0
            if (r43 == 0) goto L_0x005d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918495375105(0x8108c600301f01, double:3.0322009328237146E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x02a1
        L_0x005d:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918494392053(0x8108c600211ef5, double:3.0322009322020285E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x02a1
        L_0x006a:
            r12 = 1
        L_0x006b:
            r3.A0K = r12
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319918496227082(0x8108c6003d1f0a, double:3.032200933362508E-306)
            boolean r17 = X.182.A06(r6, r5, r0)
            r0 = r17
            r3.A0L = r0
            r4 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r14 = 0
            X.1HR r0 = new X.1HR
            r0.<init>(r14)
            r3.A0G = r0
            X.05Y r0 = X.0u9.A04(r0)
            r3.A0H = r0
            com.instagram.common.session.UserSession r0 = r10.A00
            X.8ZA r1 = new X.8ZA
            r1.<init>(r0)
            r0 = 19
            X.0t0 r0 = X.C58717IwQ.A00(r10, r1, r0)
            r3.A0C = r0
            com.instagram.common.session.UserSession r0 = r9.A00
            X.8ZA r1 = new X.8ZA
            r1.<init>(r0)
            r0 = 20
            X.0t0 r0 = X.C58717IwQ.A00(r9, r1, r0)
            r3.A0D = r0
            X.XDv r0 = X.C21082XDv.A03
            r3.A03 = r0
            com.instagram.common.session.UserSession r0 = r8.A00
            X.8ZA r1 = new X.8ZA
            r1.<init>(r0)
            r0 = 21
            X.0t0 r0 = X.C58717IwQ.A00(r8, r1, r0)
            r3.A0E = r0
            com.instagram.common.session.UserSession r0 = r7.A00
            X.8ZA r1 = new X.8ZA
            r1.<init>(r0)
            r0 = 22
            X.0t0 r0 = X.C58717IwQ.A00(r7, r1, r0)
            r3.A0F = r0
            X.8hK r16 = X.C55326Hft.A00
            r0 = 36319918495833864(0x8108c600371f08, double:3.0322009331138356E-306)
            boolean r26 = X.182.A06(r6, r5, r0)
            X.0eM r0 = r3.A0E
            java.lang.Object r1 = r0.getValue()
            X.HDk r1 = (X.C54435HDk) r1
            X.HDl r21 = A00(r3)
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r0 = r11.A03
            X.Hrn r8 = new X.Hrn
            r19 = r8
            r20 = r5
            r22 = r1
            r23 = r36
            r24 = r16
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3.A06 = r8
            X.Hpz r7 = new X.Hpz
            r7.<init>(r5, r8)
            r3.A0A = r7
            X.62M r26 = X.AnonymousClass62M.A01
            X.HMG r24 = X.HMG.EDIT_MASK
            X.HLB r21 = X.C56278Hvm.A00(r5)
            if (r18 != 0) goto L_0x0117
            r0 = 36319918495571716(0x8108c600331f04, double:3.032200932948052E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            r30 = 0
            if (r0 == 0) goto L_0x0119
        L_0x0117:
            r30 = 1
        L_0x0119:
            r34 = 0
            if (r43 == 0) goto L_0x012e
            r34 = 1
            if (r12 == 0) goto L_0x012e
            r0 = 36319918496292619(0x8108c6003e1f0b, double:3.032200933403954E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            r35 = 1
            if (r0 != 0) goto L_0x0130
        L_0x012e:
            r35 = 0
        L_0x0130:
            X.GnS r18 = new X.GnS
            r20 = r4
            r22 = r4
            r23 = r4
            r27 = r14
            r28 = r14
            r29 = r14
            r31 = r17
            r32 = r14
            r33 = r12
            r19 = r4
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.02z r10 = X.DbS.A10(r18)
            r3.A0I = r10
            X.0eM r0 = r3.A0F
            java.lang.Object r0 = r0.getValue()
            X.HDW r0 = (X.HDW) r0
            X.0Ud r11 = r0.A01
            X.0eM r0 = r3.A0E
            java.lang.Object r9 = r0.getValue()
            X.HDk r9 = (X.C54435HDk) r9
            X.05G r6 = r9.A05
            X.05G r5 = r9.A06
            r1 = 18
            X.MHj r0 = new X.MHj
            r0.<init>(r1, r4)
            X.0pm r1 = X.AnonymousClass10H.A03(r0, r6, r5)
            X.4Cq r0 = r9.A03
            X.109 r6 = X.AnonymousClass10A.A01
            X.0sn r9 = X.0sn.A00
            X.05F r5 = X.10b.A02(r9, r0, r1, r6)
            X.0eM r0 = r3.A0E
            java.lang.Object r0 = r0.getValue()
            X.HDk r0 = (X.C54435HDk) r0
            X.0Ud r1 = r0.A07
            X.Imq r0 = new X.Imq
            r0.<init>(r7, r14)
            X.0pq r5 = X.AnonymousClass10H.A01(r0, r10, r11, r5, r1)
            X.6oS r1 = X.C318116oQ.A00(r3)
            java.lang.Object r0 = r10.getValue()
            X.GnS r0 = (X.C53395GnS) r0
            X.Gn8 r0 = r7.A00(r4, r0, r4, r9)
            X.05F r0 = X.10b.A02(r0, r1, r5, r6)
            r3.A0J = r0
            java.lang.String r5 = ""
            if (r43 != 0) goto L_0x01a8
            r13 = r5
        L_0x01a8:
            X.5Tl r0 = X.C51967G9n.A0L(r13)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C51970G9q.A0S(r0)
            r3.A04 = r0
            X.HDl r1 = A00(r3)
            r0 = r16
            r1.A00 = r0
            X.Hzi r0 = X.C54436HDl.A00(r1)
            X.I12 r0 = r0.A01
            if (r0 == 0) goto L_0x01c5
            r1.A05(r0)
        L_0x01c5:
            r8.A01()
            X.HDl r0 = A00(r3)
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x025b
            X.HDl r1 = A00(r3)
            X.Hzi r0 = X.C54436HDl.A00(r1)
            X.I12 r0 = r0.A01
            if (r0 != 0) goto L_0x01e2
            X.I12 r0 = r1.A02()
        L_0x01e2:
            if (r0 == 0) goto L_0x01e8
            java.lang.String r1 = r0.A05
            if (r1 != 0) goto L_0x01e9
        L_0x01e8:
            r1 = r5
        L_0x01e9:
            X.5Oz r0 = r3.A04
            X.5Tl r1 = X.C51973G9u.A0H(r0, r1)
            X.5Oz r0 = r3.A04
            r0.Epw(r1)
            X.HDl r0 = A00(r3)
            X.Hzi r0 = X.C54436HDl.A00(r0)
            X.JVf r6 = r0.A00
            r0 = 41
            boolean r0 = X.C59721JVf.A00(r0, r6)
            if (r0 == 0) goto L_0x0253
            if (r6 == 0) goto L_0x0253
            X.6oS r5 = X.C318116oQ.A00(r3)
            r0 = 11
            X.MGX r1 = new X.MGX
            r1.<init>(r6, r3, r4, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r2, r0, r1, r5)
        L_0x0218:
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 28
            X.MG6 r0 = new X.MG6
            r0.<init>(r3, r4, r1)
            X.19B r6 = X.19B.A00
            X.1Eo.A03(r2, r6, r0, r5)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 29
            X.MG6 r0 = new X.MG6
            r0.<init>(r3, r4, r1)
            X.1Eo.A03(r2, r6, r0, r5)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 30
            X.MG6 r0 = new X.MG6
            r0.<init>(r3, r4, r1)
            X.1Eo.A03(r2, r6, r0, r5)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 31
            X.MG6 r0 = new X.MG6
            r0.<init>(r3, r4, r1)
            X.1Eo.A03(r2, r6, r0, r5)
            return
        L_0x0253:
            java.lang.String r1 = "MagicModBackdropScreenViewModel"
            java.lang.String r0 = "No segmented generation metadata found"
            X.0KC.A0D(r1, r0)
            goto L_0x0218
        L_0x025b:
            r0 = r36
            X.GnY r0 = r0.A00
            java.lang.String r9 = r0.A03
            java.lang.Object r8 = r0.A00
            java.lang.Integer r8 = (java.lang.Integer) r8
            X.AnonymousClass7TF.A1H(r8, r9)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            int r7 = r0.hashCode()
            java.util.concurrent.atomic.AtomicReference r1 = r15.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.set(r0)
            X.02m r6 = r15.A00
            r5 = 792330241(0x2f3a0001, float:1.6916603E-10)
            r6.markerStart(r5, r7)
            int r1 = X.HYP.A00(r8)
            java.lang.String r0 = "entry_point"
            r6.markerAnnotate(r5, r7, r0, r1)
            java.lang.String r0 = "magic_mod_session_id"
            r6.markerAnnotate(r5, r7, r0, r9)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r0 = 40
            X.MG0 r1 = new X.MG0
            r1.<init>(r3, r4, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r2, r0, r1, r5)
            goto L_0x0218
        L_0x02a1:
            r12 = 0
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52973GgQ.<init>(android.app.Application, com.instagram.common.session.UserSession, X.I4e, X.Hka, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, java.lang.String, boolean):void");
    }

    public static C54436HDl A00(C52973GgQ ggQ) {
        return (C54436HDl) ggQ.A0D.getValue();
    }

    public static C53395GnS A02(C52973GgQ ggQ) {
        return (C53395GnS) ggQ.A0I.getValue();
    }

    public static final void A03(C52973GgQ ggQ) {
        Object value;
        String str;
        05G r4 = ggQ.A0I;
        if (!G9w.A0X(r4).A0F || (str = ggQ.A0B) == null) {
            if (!182.A06(0Tu.A05, ggQ.A05, 36319918496816908L)) {
                A04(ggQ);
            }
            do {
                value = r4.getValue();
            } while (!r4.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, HMG.ENTER_PROMPT, (C53395GnS) value, (Integer) null, (AnonymousClass62P) null, 0, 131070, false, false, false)));
            return;
        }
        Integer num = AnonymousClass05K.A00;
        0sn r2 = 0sn.A00;
        C284945Oz r1 = ggQ.A04;
        r1.Epw(C51973G9u.A0H(r1, str));
        A08(ggQ, num, r2);
    }

    public static final void A06(C52973GgQ ggQ, C55509Hir hir) {
        String str;
        Object value;
        C55615Hka hka = ggQ.A08;
        0qQ.A0B(hir, 0);
        if (hir instanceof HBQ) {
            str = ((HBQ) hir).A00;
            if (str == null) {
                str = "";
            }
        } else if (hir.equals(C54386HBb.A00)) {
            str = "Upload Error: Unable to upload image.";
        } else if (hir.equals(HBZ.A00)) {
            str = "Saliency Model Error: Saliency detection failed.";
        } else if (hir.equals(HBT.A00)) {
            str = "GraphQL Error: Request did not complete successfully.";
        } else if (hir.equals(HBV.A00)) {
            str = "GraphQL Error: No generated images returned.";
        } else if (hir.equals(HBR.A00)) {
            str = "Download Error: Unable to download generated image(s).";
        } else if (hir.equals(HBU.A00)) {
            str = "Download Error: Malformed output from client download service.";
        } else if (hir.equals(HBS.A00)) {
            str = "Unknown error: No images generated.";
        } else if (hir.equals(HBY.A00)) {
            str = "Timeout: Request timed out.";
        } else if (hir.equals(C54385HBa.A00)) {
            str = "Single Flight error: Request skipped";
        } else if (hir.equals(HBW.A00)) {
            str = "Client Error: Missing input image.";
        } else if (hir.equals(HBX.A00)) {
            str = "Client Error: Missing input mask.";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        String A042 = 002.A04(hir.A00, ": ", str);
        Number number = (Number) hka.A01.getAndSet((Object) null);
        if (number != null) {
            int intValue = number.intValue();
            02m r3 = hka.A00;
            r3.markerAnnotate(792330241, intValue, "error", "segmentation_failed");
            if (A042 != null) {
                r3.markerAnnotate(792330241, intValue, AnonymousClass000.A00(1311), 00R.A03(A042, 200));
            }
            r3.markerEnd(792330241, intValue, 3);
        }
        05G r32 = ggQ.A0I;
        do {
            value = r32.getValue();
        } while (!r32.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, HMG.SEGMENTATION_ERROR, (C53395GnS) value, (Integer) null, (AnonymousClass62P) null, 0, 131070, false, false, false)));
        Application A0D2 = ggQ.A0D();
        C56278Hvm.A01(A0D2, AnonymousClass7TE.A16(A0D2, 2131965798), A0D2.getString(2131965797));
    }

    public static final void A08(C52973GgQ ggQ, Integer num, List list) {
        int A042;
        ggQ.A07.A08((C55718HmF) null, num, C51971G9r.A0q(ggQ.A04));
        if (A02(ggQ).A0D) {
            A042 = 1;
        } else {
            boolean z = ggQ.A0L;
            A042 = DbS.A04(0Tu.A05, ggQ.A05, 36601393472868513L);
            if (z) {
                A042 -= list.size();
            }
        }
        A09(ggQ, list, A042, false);
    }

    public static final void A0A(C52973GgQ ggQ, List list, boolean z) {
        Object value;
        C53395GnS gnS;
        HMG hmg;
        Integer num;
        if (!z) {
            A00(ggQ).A03();
        }
        C54436HDl A002 = A00(ggQ);
        05G r6 = ggQ.A0I;
        A002.A04(new C59721JVf(41, (Object) G9w.A0X(r6).A01, (Object) G9w.A0X(r6).A05), list);
        do {
            value = r6.getValue();
            gnS = (C53395GnS) value;
            boolean z2 = ggQ.A0L;
            if (z2) {
                hmg = HMG.GENERATED_IMAGE_SELECTION_4UP;
            } else {
                hmg = HMG.GENERATED_IMAGE_SELECTION;
            }
            if (!z2) {
                num = G9w.A0X(r6).A07;
            } else {
                if (!z) {
                    if (182.A06(0Tu.A05, ggQ.A05, 36319918497144592L)) {
                        num = AnonymousClass05K.A01;
                    }
                }
                num = AnonymousClass05K.A0N;
            }
        } while (!r6.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, hmg, gnS, num, (AnonymousClass62P) null, 0, 116734, false, false, false)));
    }

    public final void A0E() {
        Integer num;
        05G r4 = this.A0I;
        if (G9w.A0X(r4).A06 == HMG.GENERATED_IMAGE_SELECTION || G9w.A0X(r4).A06 == HMG.GENERATED_IMAGE_SELECTION_4UP) {
            if (G9w.A0X(r4).A06 == HMG.GENERATED_IMAGE_SELECTION_4UP) {
                int i = 0;
                Iterator it = G9w.A0X(r4).A08.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(it.next(), G9w.A0X(r4).A04)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            this.A07.A07(A01(this), num);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (X.0qQ.A0K(r1, r8.A03) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
            r8 = this;
            X.YCQ r0 = r8.A03
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            X.GnS r0 = A02(r8)
            X.JwM r0 = r0.A01
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r0.A02
        L_0x0015:
            X.YCQ r0 = r8.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0034
        L_0x001d:
            X.I4e r0 = r8.A07
            X.HmF r1 = r8.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r6 = "MAGIC_MOD_BACKDROP_NEXT"
            r3 = 0
            r4 = r3
            r5 = r3
            r7 = r3
            X.C56605I4e.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            A03(r8)
            return
        L_0x0032:
            r1 = 0
            goto L_0x0015
        L_0x0034:
            r2 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52973GgQ.A0F():void");
    }

    public static final C55718HmF A01(C52973GgQ ggQ) {
        I12 i12 = A02(ggQ).A04;
        if (i12 != null) {
            return i12.A03;
        }
        return null;
    }

    public static final void A04(C52973GgQ ggQ) {
        I12 i12;
        C61076JwE jwE;
        C61084JwM jwM = A02(ggQ).A01;
        if (jwM != null && (i12 = (I12) jwM.A00) != null && (jwE = i12.A01) != null) {
            AnonymousClass7TE.A1Z(new MHN((Object) jwE, (Object) ggQ, (AnonymousClass4D7) null, 27), C318116oQ.A00(ggQ));
        }
    }

    public static final void A05(C52973GgQ ggQ) {
        C61076JwE jwE;
        Object value;
        I12 A022 = A00(ggQ).A02();
        if (A022 == null || (jwE = A022.A01) == null) {
            A06(ggQ, HBW.A00);
            return;
        }
        05G r3 = ggQ.A0I;
        do {
            value = r3.getValue();
        } while (!r3.AIY(value, C53395GnS.A00((C61084JwM) null, (C61084JwM) null, (I12) null, (L82) null, HMG.LOADING_MASK, (C53395GnS) value, (Integer) null, (AnonymousClass62P) null, 0, 131070, false, false, false)));
        ggQ.A02 = new C55616Hkb(1Eo.A04(AnonymousClass12T.A00.AOJ(1242107527, 3), new MHN((Object) jwE, (Object) ggQ, (AnonymousClass4D7) null, 28), C318116oQ.A00(ggQ)), false);
    }
}
