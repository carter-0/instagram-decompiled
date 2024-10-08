package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ie3  reason: case insensitive filesystem */
public final class C57638Ie3 implements JTF {
    public final UserSession A00;
    public final JTB A01;
    public final String A02;

    public final void CJ0(C267324bN r8, GK4 gk4, int i) {
        List list;
        0qQ.A0B(gk4, 1);
        JTB jtb = this.A01;
        JRM C41 = jtb.C41();
        0qQ.A0B(C41, 1);
        GJ2 gj2 = gk4.A02;
        switch (gj2.ordinal()) {
            case 0:
                C41.Duu(gk4.A00, gk4.A01, false, false);
                break;
            case 1:
                C41.Duw(gk4.A00, gk4.A01);
                break;
            case 2:
                C41.Dut(gk4.A00, gk4.A01);
                break;
            case 3:
                C41.Dux(gk4.A00);
                break;
            case 4:
                C41.Dus(gk4.A00, gk4.A01);
                break;
            case 5:
                C41.Duj(gk4.A00);
                break;
            case 6:
                C41.Dum();
                break;
            case 7:
                C41.Dun(gk4.A00);
                break;
            case 8:
                C41.Duq(gk4.A00);
                break;
            case 9:
                C41.Dup(gk4.A00);
                break;
            case 10:
                C41.Dur(gk4.A00);
                break;
            case 11:
                C41.Dui(gk4.A00);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C41.Duh(gk4.A00, gk4.A01, AnonymousClass05K.A01, false);
                break;
            case 13:
                C41.DDk(gk4.A00);
                break;
            case 14:
                1Xj r2 = gk4.A00;
                C67231sQ A0n = C51966G9m.A0n(r2);
                if (A0n != null) {
                    list = A0n.Av2();
                } else {
                    list = null;
                }
                String id = r2.getId();
                if (id != null) {
                    C41.Duo(list, id);
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 15:
                C41.DS3(gk4.A00);
                break;
            case 16:
                C41.DMo();
                break;
            case 17:
                C41.DHc(gk4.A00);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 23:
            case 24:
                break;
            case 19:
                C41.D7C(gk4.A00);
                break;
            case 20:
                C41.DiJ(gk4.A00);
                break;
            case 21:
            case 22:
                C41.Duy(gk4.A00);
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        jtb.EGS(gk4.A00, gk4.A01, gj2, i);
    }

    public final void CJ2(C267324bN r11, GK4 gk4, C59512JMk jMk, int i) {
        C267324bN r5 = r11;
        DbZ.A0t(0, gk4, r11, jMk);
        if (jMk instanceof C57640Ie5) {
            C57640Ie5 ie5 = (C57640Ie5) jMk;
            HWP.A00(C54676HOh.ATTRIBUTE_IMPRESSION, ie5.A00, this.A00, ie5.A01, "reels");
        } else if (!(jMk instanceof GKR)) {
            throw AnonymousClass7TE.A1K();
        }
        this.A01.Di3(r5, gk4.A00, gk4.A01, gk4.A02, i);
    }

    public final void E43(1Xj r6) {
        List B02;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        0qQ.A0B(r6, 0);
        CreativeConfigIntf A0r = C51966G9m.A0r(r6);
        if (A0r != null && (B02 = A0r.B02()) != null && (effectPreviewIntf = (EffectPreviewIntf) 00k.A0O(B02, 0)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
            UserSession userSession = this.A00;
            GGQ.A00(userSession).A00(userSession, "on_touch_down", effectId, this.A02);
        }
    }

    public final void Eb2(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Eb7(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbB(0sL r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbH(0sL r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbI(C62320sa r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbK(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbN(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbO(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbP(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbQ(C62320sa r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbT(C62320sa r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EbU(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebc(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebe(C62320sa r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebh(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebi(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebj(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebl(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebm(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebn(0sK r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebo(0sL r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebp(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebq(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebr(0sI r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebs(0sF r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ebt(0sP r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C57638Ie3(UserSession userSession, JTB jtb, String str) {
        AnonymousClass7TG.A1U(userSession, jtb, str);
        this.A00 = userSession;
        this.A01 = jtb;
        this.A02 = str;
    }
}
