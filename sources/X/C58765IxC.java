package X;

import android.text.Layout;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.IxC  reason: case insensitive filesystem */
public final class C58765IxC extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58765IxC(long j, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5kr] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A002;
        float A003;
        C243673Zt r4;
        long j;
        Timer A0c;
        TimerTask ikj;
        C46275DTe dTe;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass5Q4 r9 = (AnonymousClass5Q4) obj2;
                r9.AQW();
                AnonymousClass5VN r1 = (AnonymousClass5VN) this.A04;
                float f = r1.A01;
                float f2 = r1.A03;
                0rm r6 = (0rm) this.A02;
                long j2 = this.A01;
                C288195bW r10 = (C288195bW) this.A03;
                AnonymousClass5QF r3 = ((AnonymousClass5QC) r9.Ayw()).A01;
                r3.FHv(f, f2);
                try {
                    r9.AQb(r10, (C3018260f) r6.A00, C289635dw.A00, 1.0f, 3, 1, 0, j2, 0, j2);
                    break;
                } finally {
                    r3.FHv(-f, -f2);
                }
            case 1:
                C3022362e r92 = (C3022362e) obj2;
                long j3 = this.A01;
                float[] fArr = (float[]) this.A02;
                0rk r62 = (0rk) this.A03;
                0rh r5 = (0rh) this.A04;
                int i = r92.A05;
                int i2 = i;
                int A012 = C285965Tk.A01(j3);
                if (i <= A012) {
                    i2 = A012;
                }
                int i3 = r92.A04;
                int A004 = C285965Tk.A00(j3);
                if (i3 < A004) {
                    A004 = i3;
                }
                long A005 = C3026964x.A00(C229632nm.A03(i2, i, i3) - i, C229632nm.A03(A004, i, i3) - i);
                C292055iK r23 = r92.A06;
                int i4 = r62.A00;
                C292075iM r13 = ((C292045iJ) r23).A01;
                int A013 = C285965Tk.A01(A005);
                int A006 = C285965Tk.A00(A005);
                Layout layout = r13.A09;
                int length = layout.getText().length();
                if (A013 < 0) {
                    throw AnonymousClass7TE.A0w("startOffset must be > 0");
                } else if (A013 >= length) {
                    throw AnonymousClass7TE.A0w("startOffset must be less than text length");
                } else if (A006 <= A013) {
                    throw AnonymousClass7TE.A0w("endOffset must be greater than startOffset");
                } else if (A006 <= length) {
                    int i5 = (A006 - A013) * 4;
                    if (fArr.length - i4 >= i5) {
                        int lineForOffset = layout.getLineForOffset(A013);
                        int lineForOffset2 = layout.getLineForOffset(A006 - 1);
                        C18454Vs2 vs2 = new C18454Vs2(r13);
                        if (lineForOffset <= lineForOffset2) {
                            while (true) {
                                int lineStart = layout.getLineStart(lineForOffset);
                                int A05 = r13.A05(lineForOffset);
                                int min = Math.min(A006, A05);
                                float A022 = r13.A02(lineForOffset);
                                float A014 = r13.A01(lineForOffset);
                                boolean A1S = AnonymousClass7TF.A1S(layout.getParagraphDirection(lineForOffset), 1);
                                boolean z = !A1S;
                                for (int max = Math.max(A013, lineStart); max < min; max++) {
                                    boolean isRtlCharAt = layout.isRtlCharAt(max);
                                    if (A1S) {
                                        if (!isRtlCharAt) {
                                            A002 = C18454Vs2.A00(vs2, max, false, false, true);
                                            A003 = C18454Vs2.A00(vs2, max + 1, true, true, true);
                                        } else {
                                            A003 = C18454Vs2.A00(vs2, max, false, false, false);
                                            A002 = C18454Vs2.A00(vs2, max + 1, true, true, false);
                                        }
                                    } else if (!z || !isRtlCharAt) {
                                        A002 = C18454Vs2.A00(vs2, max, false, false, false);
                                        A003 = C18454Vs2.A00(vs2, max + 1, true, true, false);
                                    } else {
                                        A003 = C18454Vs2.A00(vs2, max, false, false, true);
                                        A002 = C18454Vs2.A00(vs2, max + 1, true, true, true);
                                    }
                                    fArr[i4] = A002;
                                    fArr[i4 + 1] = A022;
                                    fArr[i4 + 2] = A003;
                                    fArr[i4 + 3] = A014;
                                    i4 += 4;
                                }
                                if (lineForOffset != lineForOffset2) {
                                    lineForOffset++;
                                }
                            }
                        }
                        int i6 = r62.A00;
                        int i7 = i6 + i5;
                        while (i6 < i7) {
                            int i8 = i6 + 1;
                            float f3 = fArr[i8];
                            float f4 = r5.A00;
                            fArr[i8] = f3 + f4;
                            int i9 = i6 + 3;
                            fArr[i9] = fArr[i9] + f4;
                            i6 += 4;
                        }
                        r62.A00 = i7;
                        r5.A00 += r23.BCs();
                        break;
                    } else {
                        throw AnonymousClass7TE.A0w("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                    }
                } else {
                    throw AnonymousClass7TE.A0w("endOffset must be smaller or equal to text length");
                }
            case 2:
                ? obj3 = new Object();
                AnonymousClass6AW r32 = (AnonymousClass6AW) this.A03;
                long j4 = this.A01;
                int i10 = ((AnonymousClass6AT) this.A02).A00;
                UserSession userSession = ((C70571OBt) this.A04).A01;
                0qQ.A0B(r32, 0);
                Object obj4 = new Object();
                obj3.A00(r32, userSession, new C377089Km(obj4, 36), i10, j4);
                return obj4;
            case 3:
                r4 = (C243673Zt) this.A03;
                C53909GwF gwF = (C53909GwF) this.A04;
                AnonymousClass4Ew r12 = C53909GwF.A09;
                String A0R = 002.A0R("CyclicSubtitleComponent_", gwF.A04.getId());
                j = this.A01;
                A0c = C51974G9v.A0c(A0R);
                ikj = new C58051Ikj((2Wa) this.A02, gwF);
                break;
            default:
                C53926GwW gwW = (C53926GwW) this.A04;
                AnonymousClass4Ew r14 = C53926GwW.A0B;
                1Xj r93 = gwW.A06;
                List Asj = r93.A0C.Asj();
                if (!(Asj == null || 00k.A0J(Asj) == null)) {
                    JTB jtb = gwW.A09;
                    C267324bN r7 = gwW.A02;
                    C52058GDe gDe = gwW.A04;
                    List Asj2 = r93.A0C.Asj();
                    C46307DUk dUk = null;
                    if (Asj2 != null) {
                        dTe = (C46275DTe) 00k.A0O(Asj2, 0);
                    } else {
                        dTe = null;
                    }
                    List Bk8 = r93.A0C.Bk8();
                    if (Bk8 != null) {
                        dUk = (C46307DUk) 00k.A0O(Bk8, 0);
                    }
                    jtb.EFm(dTe, dUk, r7, gDe, r93);
                }
                r4 = (C243673Zt) this.A03;
                String A0R2 = 002.A0R("ClipsCyclicContextLineComponent_", r93.getId());
                j = this.A01;
                A0c = C51974G9v.A0c(A0R2);
                ikj = new C58052Ikk((2Wa) this.A02, gwW);
                break;
        }
        A0c.scheduleAtFixedRate(ikj, j, j);
        r4.A00(A0c);
        return C60340gF.A00;
    }
}
