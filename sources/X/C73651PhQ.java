package X;

import android.content.Context;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.PhQ  reason: case insensitive filesystem */
public final class C73651PhQ extends 03J implements 0sK {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73651PhQ(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.Nep> r3 = X.C69110Nep.class
            r1 = 3
            java.lang.String r4 = "handleOnRenderViewSizeChanged"
            java.lang.String r5 = "handleOnRenderViewSizeChanged(Ljava/lang/String;II)V"
        L_0x000c:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.ODE> r3 = X.ODE.class
            r1 = 3
            java.lang.String r4 = "createCallClient"
            java.lang.String r5 = "createCallClient(Ljava/lang/String;Lcom/facebook/rsys/callcontext/gen/CallContext;Lcom/facebook/rsys/audio/gen/AudioProxy;)Lcom/facebook/rsys/callmanager/callclient/gen/CallClient;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73651PhQ.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.O27, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        NCS A002;
        Object obj4 = obj3;
        Object obj5 = obj2;
        String str = (String) obj;
        if (this.A00 != 0) {
            ((C69110Nep) C51969G9p.A0t(str, this)).A0A.A03(new PPO(str, AnonymousClass7TE.A0M(obj5), AnonymousClass7TE.A0M(obj4)));
            return C60340gF.A00;
        }
        CallContext callContext = (CallContext) obj5;
        AudioProxy audioProxy = (AudioProxy) obj4;
        boolean A1U = AnonymousClass7TF.A1U(0, str, callContext);
        ODE ode = (ODE) this.receiver;
        C53388GnK gnK = ode.A00;
        String str2 = gnK.A06;
        if (!str.equals(str2)) {
            return null;
        }
        OL3 ol3 = ode.A01;
        if (audioProxy != null) {
            A002 = new NCQ(audioProxy);
        } else {
            Context context = ol3.A00;
            C73691PiE piE = C73691PiE.A00;
            UserSession userSession = ol3.A01;
            0na r12 = new 0na(268542022, 3, false, false);
            ? obj6 = new Object();
            0np r13 = new 0np(1298179585, false);
            C71761OqN oqN = C71761OqN.A00;
            C51972G9s.A1C(piE, str2);
            0qQ.A0B(oqN, 9);
            A002 = C73470PdC.A00(context, oqN, userSession, obj6, str2, r12, r13, piE, A1U);
        }
        return new NCY(A002, callContext, str2, new C58696Iw5(18, ode.A02, gnK, ol3));
    }
}
