package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WXf  reason: case insensitive filesystem */
public final class C19388WXf implements C20953X6g {
    public final int A00;
    public final Object A01;

    public C19388WXf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D2V(Hashtag hashtag) {
        String str;
        Hashtag hashtag2 = hashtag;
        switch (this.A00) {
            case 0:
                0qQ.A0B(hashtag, 0);
                UE7 ue7 = (UE7) this.A01;
                if (ue7.getBindingAdapterPosition() != -1) {
                    VNM vnm = ue7.A05;
                    int bindingAdapterPosition = ue7.getBindingAdapterPosition();
                    C14031ToX toX = vnm.A00;
                    C320216s0 r0 = toX.A03;
                    if (r0 != null) {
                        r0.A00(hashtag, bindingAdapterPosition);
                    }
                    toX.A0C.run();
                    return;
                }
                return;
            case 1:
                C15949UlK ulK = (C15949UlK) this.A01;
                ulK.A0D.A02(C15949UlK.A00(ulK), ulK.A03, ulK.A0C, hashtag, "header_follow_button");
                ulK.A03(hashtag, true);
                C17775Vfm vfm = ulK.A0I;
                if (vfm.A00() != null && vfm.A00().A05) {
                    ulK.A0B.A00();
                    C15949UlK.A01(ulK);
                }
                AnonymousClass1Nd.A00(ulK.A08).A00(new C2370436c(hashtag, false));
                return;
            case 2:
                0qQ.A0B(hashtag, 0);
                E6R e6r = (E6R) this.A01;
                C230132oy r1 = e6r.A03;
                if (r1 == null) {
                    str = "hashtagApi";
                } else {
                    UserSession userSession = e6r.A01;
                    if (userSession == null) {
                        str = "viewerUserSession";
                    } else {
                        r1.A02(E6R.A01(hashtag, e6r), userSession, e6r.A08, hashtag2, "following_list_follow_button");
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            default:
                C15362UbE ubE = (C15362UbE) this.A01;
                ubE.A02.A05(ubE.A01, new C19383WXa(ubE, 5), hashtag, "header_follow_button");
                return;
        }
    }

    public final void D3G(Hashtag hashtag) {
        String str;
        Hashtag hashtag2 = hashtag;
        switch (this.A00) {
            case 0:
                0qQ.A0B(hashtag, 0);
                UE7 ue7 = (UE7) this.A01;
                if (ue7.getBindingAdapterPosition() != -1) {
                    VNM vnm = ue7.A05;
                    int bindingAdapterPosition = ue7.getBindingAdapterPosition();
                    C320216s0 r0 = vnm.A00.A03;
                    if (r0 != null) {
                        r0.A01(hashtag, bindingAdapterPosition);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C15949UlK ulK = (C15949UlK) this.A01;
                ulK.A0D.A03(C15949UlK.A00(ulK), ulK.A03, ulK.A0C, hashtag2, "header_follow_button");
                ulK.A03(hashtag, false);
                C15949UlK.A01(ulK);
                AnonymousClass1Nd.A00(ulK.A08).A00(new C2370436c(hashtag, false));
                return;
            case 2:
                0qQ.A0B(hashtag, 0);
                E6R e6r = (E6R) this.A01;
                C230132oy r1 = e6r.A03;
                if (r1 == null) {
                    str = "hashtagApi";
                } else {
                    UserSession userSession = e6r.A01;
                    if (userSession == null) {
                        str = "viewerUserSession";
                    } else {
                        r1.A03(E6R.A01(hashtag, e6r), userSession, e6r.A08, hashtag2, "following_list_follow_button");
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            default:
                C15362UbE ubE = (C15362UbE) this.A01;
                ubE.A02.A06(ubE.A01, new C19383WXa(ubE, 5), hashtag, "header_follow_button");
                return;
        }
    }
}
