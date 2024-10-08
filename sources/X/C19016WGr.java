package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WGr  reason: case insensitive filesystem */
public final class C19016WGr implements X2N {
    public final UIF A00;
    public final C64164LRf A01;

    public final void Cv0(C17973VjA vjA) {
    }

    public C19016WGr(C17846Vgz vgz, LGB lgb, UserSession userSession, C262224Cq r11) {
        C64301LZb lZb = new C64301LZb(lgb, userSession);
        Context context = vgz.A00;
        String str = vgz.A00().A09;
        if (str != null) {
            lZb.A02 = r11;
            C64164LRf lRf = new C64164LRf(context, lgb, new C61042Jvg(3, 0, false), r11);
            lZb.A00 = lRf;
            lRf.A05(userSession, context);
            C64164LRf lRf2 = lZb.A00;
            if (lRf2 != null) {
                AH4 ah4 = lRf2.A04;
                if (ah4 != null) {
                    ah4.A02();
                }
                C64164LRf lRf3 = lZb.A00;
                if (lRf3 != null) {
                    lRf3.A04(context, str);
                    C64164LRf lRf4 = lZb.A00;
                    if (lRf4 != null) {
                        this.A01 = lRf4;
                        C17748VdH vdH = C18609Vv2.A06;
                        0qQ.A0B(userSession, 0);
                        VQO vqo = VQO.A01;
                        if (vqo == null) {
                            vqo = new VQO(userSession);
                            VQO.A01 = vqo;
                        }
                        C19017WGt wGt = new C19017WGt(vdH.A00(vqo));
                        wGt.EBP(this);
                        wGt.CMo(vgz.A00());
                        C17973VjA vjA = wGt.A00;
                        if (vjA != null) {
                            this.A00 = new UIF(context, vjA, lZb, r11);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
