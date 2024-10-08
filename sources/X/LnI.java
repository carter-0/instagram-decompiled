package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class LnI implements C66544MVy {
    public final /* synthetic */ KMS A00;

    public final /* synthetic */ void DP3(int i) {
    }

    public final /* synthetic */ void DP4(MotionEvent motionEvent, int i) {
    }

    public final /* synthetic */ void DP9(Integer num, int i, int i2) {
    }

    public final /* synthetic */ void DPA(int i, int i2, float f) {
    }

    public final /* synthetic */ void DPB(MotionEvent motionEvent) {
    }

    public final /* synthetic */ void Dqh(MotionEvent motionEvent) {
    }

    public final void DuC(Integer num, int i, int i2) {
        int intValue;
        AnonymousClass51M r0;
        Integer num2 = num;
        0qQ.A0B(num2, 2);
        KMS kms = this.A00;
        C60108Jfo jfo = kms.A0K;
        Integer A0G = jfo.A0G();
        if (A0G != null && (intValue = A0G.intValue()) != -1) {
            UserSession userSession = kms.A0B;
            AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
            A01.A0B = A01.A0K.A03(613293953, 12000);
            boolean z = true;
            int i3 = i;
            int i4 = i2;
            if (num2 == AnonymousClass05K.A01) {
                Integer[] numArr = kms.A0C.A02;
                jfo.A0P(intValue, i3, (JTO.A0A(numArr, 1) + i) - JTO.A0A(numArr, 0), false);
                jfo.A0W(0sn.A00);
            } else {
                if (num2 != AnonymousClass05K.A00) {
                    z = false;
                }
                jfo.A0P(intValue, i3, i4, z);
            }
            AnonymousClass831 A0K = JTQ.A0K(jfo.A0E);
            if (A0K != null) {
                ArrayList A05 = A0K.A05();
                if (intValue < A05.size() && (r0 = (AnonymousClass51M) 00k.A0O(A05, intValue)) != null) {
                    27p.A01(userSession).A0x((C279294yP) null, (double) i3, (double) i4, (long) r0.A0F.A0F.hashCode());
                }
            }
        }
    }

    public final void DuG(Integer num) {
        int intValue;
        int i;
        AnonymousClass8RR r1;
        0qQ.A0B(num, 0);
        KMS kms = this.A00;
        AnonymousClass8RF r2 = kms.A0J;
        AnonymousClass8RH A0E = r2.A0E();
        if ((A0E instanceof AnonymousClass8RR) && (r1 = (AnonymousClass8RR) A0E) != null) {
            JTP.A1N(r2, r1.A00);
        }
        C60108Jfo jfo = kms.A0K;
        Integer A0G = jfo.A0G();
        if (A0G != null && (intValue = A0G.intValue()) != -1) {
            Integer num2 = AnonymousClass05K.A00;
            boolean A1W = AnonymousClass7TF.A1W(num, num2);
            AnonymousClass831 A0K = JTQ.A0K(jfo.A0E);
            if (A0K != null) {
                AnonymousClass51M r0 = (AnonymousClass51M) A0K.A03(intValue);
                if (A1W) {
                    i = r0.A09;
                } else {
                    i = r0.A08;
                }
                jfo.A01 = i;
            }
            jfo.A0c.Epw(new C61052Jvq(num2, 0, 2, A1W));
            jfo.A0V((Integer) null, Integer.valueOf(kms.A06));
            kms.A0C.A02();
        }
    }

    public LnI(KMS kms) {
        this.A00 = kms;
    }

    public final void DlW(int i, int i2) {
        this.A00.A0K.A0e.Epw(new L7v(AnonymousClass05K.A0C, i, i2, 0));
    }

    public final void DlX() {
        AnonymousClass831 A0K;
        AnonymousClass51M A0f;
        C60108Jfo jfo = this.A00.A0K;
        AnonymousClass8RH A0E = jfo.A0F.A0E();
        if ((A0E instanceof AnonymousClass8RV) && (A0K = JTQ.A0K(jfo.A0E)) != null && (A0f = JTO.A0f(A0K, ((AnonymousClass8RV) A0E).A00)) != null) {
            jfo.A0e.Epw(new L7v(AnonymousClass05K.A00, A0f.A09, A0f.A08, 0));
        }
    }

    public final void DlY(int i, int i2, float f) {
        KMS kms = this.A00;
        kms.A0K.A0e.Epw(new L7v(AnonymousClass05K.A01, i, i2, (int) (f / JTS.A01(kms.A07, LQO.A00))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DuE(java.lang.Integer r17, float r18, int r19, int r20) {
        /*
            r16 = this;
            r9 = r20
            r0 = 2
            r4 = r17
            X.0qQ.A0B(r4, r0)
            r0 = r16
            X.KMS r11 = r0.A00
            X.Jfo r2 = r11.A0K
            java.lang.Integer r0 = r2.A0G()
            if (r0 == 0) goto L_0x0064
            int r14 = r0.intValue()
            r0 = -1
            if (r14 == r0) goto L_0x0064
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r8 = 0
            r12 = r19
            if (r4 != r0) goto L_0x0065
            X.LRe r3 = r11.A0C
            X.KMu r0 = r2.A0J
            java.util.ArrayList r1 = r0.A0E()
            X.KMt r0 = r2.A0H
            java.util.ArrayList r0 = r0.A0E()
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            X.KMt r0 = r2.A0I
            java.util.ArrayList r0 = r0.A0E()
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            r0 = 0
            r3.A04(r1, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r11.A0I
            X.2gB r0 = r0.A0F
            X.831 r0 = X.JTO.A0h(r0)
            if (r0 == 0) goto L_0x0050
            int r8 = r0.A01(r14)
        L_0x0050:
            int r9 = r20 + r8
            int r9 = r9 - r19
            X.MKM r5 = X.MKM.A00
            r15 = 4
            X.MJB r6 = new X.MJB
            r10 = r6
            r13 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r10 = 0
            r7 = r18
            r3.A03(r4, r5, r6, r7, r8, r9, r10)
        L_0x0064:
            return
        L_0x0065:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x006a
            r8 = 1
        L_0x006a:
            r2.A0Q(r14, r12, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LnI.DuE(java.lang.Integer, float, int, int):void");
    }

    public final void EKX(int i) {
        View view;
        int i2;
        int i3;
        C249703kE A0W;
        KMS kms = this.A00;
        if (kms.A0E.A1a() != 0 || (A0W = kms.A0A.A0W(0)) == null) {
            view = null;
        } else {
            view = A0W.itemView;
        }
        if (view != null) {
            i2 = view.getWidth() - (kms.A06 / 2);
            i3 = view.getLeft();
        } else {
            i2 = 0;
            i3 = Integer.MAX_VALUE;
        }
        int abs = Math.abs(i3);
        if (i <= 0) {
            i += i2;
            i2 = 0;
            if (i >= 0) {
                i2 = i;
                i = 0;
            }
        } else if (i > abs) {
            i2 += i - abs;
            i = abs;
        }
        C60108Jfo jfo = kms.A0K;
        jfo.A0V(Integer.valueOf((kms.A06 / 2) + i2), (Integer) null);
        int i4 = -i;
        kms.A0A.scrollBy(i4, 0);
        AnonymousClass7TE.A1Z(new MFY(jfo, (AnonymousClass4D7) null, i4, i2, 3), C318116oQ.A00(jfo));
    }

    public final void Cx4(int i) {
        EKX(i);
    }

    public final void DsS(MotionEvent motionEvent, boolean z, boolean z2) {
    }
}
