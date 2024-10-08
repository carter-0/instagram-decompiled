package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdV  reason: case insensitive filesystem */
public final class C15480UdV extends 2Ru {
    public C15526UeF A00;
    public C15527UeG A01;
    public C15500Udp A02;
    public C15515Ue4 A03;
    public C15516Ue5 A04;
    public C15534UeN A05;
    public C47588E9a A06;
    public C15517Ue6 A07;
    public NLL A08;
    public C336947fR A09;
    public final C15501Udq A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15480UdV(Context context, X8N x8n, AnonymousClass0iw r7, UserSession userSession) {
        super(false);
        0qQ.A0B(userSession, 1);
        C15534UeN ueN = new C15534UeN(context, x8n, r7, userSession);
        this.A05 = ueN;
        C15501Udq udq = new C15501Udq(context);
        this.A0A = udq;
        C15516Ue5 ue5 = new C15516Ue5(context, r7);
        this.A04 = ue5;
        C336947fR r0 = new C336947fR(context);
        this.A09 = r0;
        init(new C231642s0[]{ueN, udq, ue5, r0});
    }

    public final void A01(List list) {
        C231642s0 r0;
        0qQ.A0B(list, 0);
        clear();
        for (Object next : list) {
            if (next instanceof V42) {
                r0 = this.A00;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C18067Vkt) {
                r0 = this.A07;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C46448DfA) {
                Object obj = new Object();
                C336947fR r02 = this.A09;
                if (r02 != null) {
                    addModel(next, obj, r02);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C71065Oak) {
                r0 = this.A08;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C17566VaK) {
                r0 = this.A04;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C17324VRd) {
                r0 = this.A02;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof FGF) {
                r0 = this.A06;
                if (r0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (next instanceof C21004X9b) {
                r0 = this.A05;
            } else if (next instanceof VAE) {
                r0 = this.A0A;
            } else if (C61071Jw9.A00(4, next)) {
                r0 = this.A01;
            } else if (next instanceof WOP) {
                r0 = this.A03;
            }
            addModel(next, r0);
        }
        notifyDataSetChanged();
    }

    public static void A00(C15480UdV udV) {
        udV.A01(new ArrayList());
    }

    public C15480UdV(Context context, AnonymousClass0iw r5) {
        super(false);
        C15501Udq udq = new C15501Udq(context);
        this.A0A = udq;
        C15515Ue4 ue4 = new C15515Ue4(context, r5);
        this.A03 = ue4;
        C15516Ue5 ue5 = new C15516Ue5(context, r5);
        this.A04 = ue5;
        init(new C231642s0[]{udq, ue4, ue5});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15480UdV(Context context, X8N x8n, C15328Uac uac, AnonymousClass0iw r14, UserSession userSession) {
        super(false);
        0qQ.A0B(userSession, 1);
        C336947fR r0 = new C336947fR(context);
        this.A09 = r0;
        NLL nll = new NLL(context);
        this.A08 = nll;
        C15516Ue5 ue5 = new C15516Ue5(context, r14);
        this.A04 = ue5;
        C15500Udp udp = new C15500Udp(context);
        this.A02 = udp;
        C47588E9a e9a = new C47588E9a(context);
        this.A06 = e9a;
        C15534UeN ueN = new C15534UeN(context, x8n, r14, userSession);
        this.A05 = ueN;
        C15501Udq udq = new C15501Udq(context);
        this.A0A = udq;
        C15526UeF ueF = new C15526UeF(context, uac, r14);
        this.A00 = ueF;
        C15517Ue6 ue6 = new C15517Ue6(userSession, context);
        this.A07 = ue6;
        C15527UeG ueG = new C15527UeG(context, r14, userSession);
        this.A01 = ueG;
        init(new C231642s0[]{r0, nll, ue5, udp, e9a, ueN, udq, ueF, ue6, ueG});
    }
}
