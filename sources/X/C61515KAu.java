package X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;
import java.util.Set;

/* renamed from: X.KAu  reason: case insensitive filesystem */
public final class C61515KAu extends C18594Vul {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61515KAu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void A03(Exception exc) {
        Exception exc2 = exc;
        switch (this.A00) {
            case 0:
                C60302Jj0 jj0 = (C60302Jj0) this.A02;
                C60302Jj0.A01(jj0, (Set) this.A01);
                jj0.A0D.clear();
                return;
            case 1:
                C60302Jj0.A01((C60302Jj0) this.A02, (Set) this.A01);
                return;
            case 2:
                0qQ.A0B(exc, 0);
                C62423KfY kfY = (C62423KfY) this.A02;
                C64139LPo.A02(kfY, exc);
                String A0l = JTS.A0l(exc);
                0qQ.A07(A0l);
                LiveStreamingError liveStreamingError = new LiveStreamingError("endBroadcastSession", A0l, exc2, C9588RdS.A00(exc), false);
                M0X m0x = kfY.A0a;
                int i = liveStreamingError.errorCode;
                String str = liveStreamingError.domain;
                if (str == null) {
                    str = "";
                }
                m0x.A0C(i, str, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
                return;
            case 3:
                0qQ.A0B(exc, 0);
                C62423KfY kfY2 = (C62423KfY) this.A02;
                C64139LPo.A02(kfY2, exc);
                if (exc instanceof C62683Kkj) {
                    C62683Kkj kkj = (C62683Kkj) exc2;
                    LPE.A0B(kkj.A00, kfY2, kkj.A01, exc.getMessage(), exc);
                    return;
                }
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
                0qQ.A0B("ApiStartBroadcast", 1);
                LPE.A0B(broadcastFailureType, kfY2, "ApiStartBroadcast", (String) null, exc);
                return;
            case 4:
                0qQ.A0B(exc, 0);
                C62423KfY kfY3 = (C62423KfY) this.A02;
                C64139LPo.A02(kfY3, exc);
                kfY3.A0a.A0I("start encoding error", exc);
                break;
            case 5:
                0qQ.A0B(exc, 0);
                ((C62422KfX) this.A02).A0K.A0C("start encoding error", exc);
                break;
            default:
                super.A03(exc);
                return;
        }
        ((C18594Vul) this.A01).A03(exc);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        List list;
        switch (this.A00) {
            case 0:
                C60302Jj0 jj0 = (C60302Jj0) this.A02;
                Set set = jj0.A0D;
                C60302Jj0.A00(jj0, set);
                set.clear();
                return;
            case 2:
                0qQ.A0B(obj, 0);
                C62423KfY kfY = (C62423KfY) this.A02;
                11Z.A02(new M5J(kfY));
                if (((C66537MVr) this.A01).CSg()) {
                    UserSession userSession = kfY.A07;
                    String str = kfY.A0D.A0C;
                    1NY A0a = AnonymousClass7TG.A0a(userSession);
                    A0a.A0K("live/%s/end_broadcast/", new Object[]{str});
                    A0a.A9m("end_after_copyright_warning", "false");
                    1OC A0G = JTU.A0G(A0a);
                    A0G.A00 = new CH5(5);
                    1ES.A00(kfY.A05, kfY.A0V, A0G);
                    return;
                }
                return;
            case 3:
                C62423KfY kfY2 = (C62423KfY) this.A02;
                M0X m0x = kfY2.A0a;
                Integer num = (Integer) this.A01;
                0qQ.A0B(num, 0);
                1Ln A03 = M0X.A03(m0x, AnonymousClass05K.A15);
                JTT.A1B(A03, LKE.A00(num), (String) null);
                A03.Cgf();
                m0x.A0B();
                kfY2.A0L((Integer) null);
                return;
            case 4:
                list = (List) obj;
                0qQ.A0B(list, 0);
                C62423KfY kfY3 = (C62423KfY) this.A02;
                kfY3.A0a.A0F("start encoding");
                C14693U1s u1s = kfY3.A09.A09;
                u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(3, list));
                kfY3.A0L = list;
                kfY3.A0f.invoke(00k.A0J(list));
                if (kfY3.A0T || kfY3.A0U) {
                    kfY3.A0M(true, true);
                    kfY3.A0U = false;
                    break;
                }
            case 5:
                list = JTQ.A0i(obj);
                C62422KfX kfX = (C62422KfX) this.A02;
                kfX.A0A = list;
                kfX.A0K.A0A("start encoding", "");
                boolean z = kfX.A0I;
                if (z) {
                    kfX.A0J(z, true);
                }
                C14693U1s u1s2 = kfX.A09.A09;
                u1s2.sendMessageAtFrontOfQueue(u1s2.obtainMessage(3, list));
                boolean z2 = kfX.A0I;
                if (z2) {
                    kfX.A0J(z2, true);
                    break;
                }
                break;
            default:
                return;
        }
        ((C18594Vul) this.A01).A04(list);
    }
}
