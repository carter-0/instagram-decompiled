package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.HQm  reason: case insensitive filesystem */
public abstract class C54731HQm {
    public static final void A00(C286575Wy r13, C62320sa r14, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        r13.ExV(-361453782);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0Y(r13, z2) | i;
        } else {
            i3 = i;
        }
        C62320sa r8 = r14;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, r14);
        }
        if ((i3 & 19) != 18 || !r13.Bwn()) {
            if (i5 != 0) {
                z2 = true;
            }
            C284945Oz A00 = C287175Zh.A00(r13, r14);
            Object A0f = G9w.A0f(r13, -971159753);
            Object obj = AnonymousClass5XT.A00;
            if (A0f == obj) {
                A0f = new QAH((C270284gU) A00, z2);
                r13.FLL(A0f);
            }
            C286565Wx r5 = (C286565Wx) r13;
            C286565Wx.A0L(r5, false);
            r13.ExT(-971159481);
            boolean A1V = C51966G9m.A1V(r13, z2, r13.AGu(A0f));
            Object ECw = r13.ECw();
            if (A1V || ECw == obj) {
                ECw = GA1.A00(r13, A0f, 0, z2);
            }
            C286645Xf.A05(r13, C51965G9l.A0y(r5, ECw, false));
            r13.ExT(-2068013981);
            AnonymousClass0z4 r1 = (AnonymousClass0z4) r13.AJO(C55287HfG.A00);
            r13.ExT(1680121597);
            if (r1 == null) {
                Object AJO = r13.AJO(AndroidCompositionLocals_androidKt.A03);
                0qQ.A0B(AJO, 0);
                r1 = (AnonymousClass0z4) C242173Sx.A06(C242173Sx.A0B(C58841IyS.A00, 2YX.A02(AJO, C58840IyR.A00)));
            }
            C286565Wx.A0L(r5, false);
            if (r1 == null) {
                Context A0I = C51968G9o.A0I(r13);
                while (true) {
                    if (A0I instanceof ContextWrapper) {
                        if (A0I instanceof AnonymousClass0z4) {
                            break;
                        }
                        A0I = ((ContextWrapper) A0I).getBaseContext();
                    } else {
                        A0I = null;
                        break;
                    }
                }
                r1 = (AnonymousClass0z4) A0I;
            }
            C286565Wx.A0L(r5, false);
            if (r1 != null) {
                00N onBackPressedDispatcher = r1.getOnBackPressedDispatcher();
                Object AJO2 = r13.AJO(AnonymousClass5YV.A00);
                r13.ExT(-971159120);
                boolean A1X = C51972G9s.A1X(r13, AJO2, A0f, r13.AGu(onBackPressedDispatcher));
                Object ECw2 = r13.ECw();
                if (A1X || ECw2 == obj) {
                    ECw2 = new C58751Iwy(0, A0f, AJO2, onBackPressedDispatcher);
                    r13.FLL(ECw2);
                }
                C286645Xf.A01(r13, AJO2, onBackPressedDispatcher, C51965G9l.A0z(r5, ECw2));
            } else {
                throw AnonymousClass7TE.A0z("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59131J7n(r8, i6, i4, 0, z2);
        }
    }
}
