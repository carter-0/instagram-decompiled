package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.Set;

/* renamed from: X.Wbi  reason: case insensitive filesystem */
public final class C19558Wbi implements C20918X4j {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C19558Wbi(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj;
    }

    public final void EIv() {
        int i = this.A00;
        boolean z = ((C66967Mg0) this.A03).A0F;
        if (i != 0) {
            if (z) {
                Object obj = this.A02;
                C14407Tva tva = C14407Tva.MAP;
                UserSession userSession = ((C14436TwK) this.A04).A01;
                if (obj == tva) {
                    VGC.A00(userSession).A02((C18072Vl0) this.A01);
                } else {
                    C14418Tvn A002 = C14415Tvk.A00(userSession);
                    A002.A00.A04(this.A01);
                }
            }
            Set<C20916X4h> set = ((C14436TwK) this.A04).A07;
            C18072Vl0 vl0 = (C18072Vl0) this.A01;
            for (C20916X4h CLi : set) {
                String A05 = vl0.A00().A05();
                0qQ.A07(A05);
                CLi.CLi(A05);
            }
            return;
        }
        if (z) {
            Object obj2 = this.A02;
            C14407Tva tva2 = C14407Tva.MAP;
            UserSession userSession2 = ((C14436TwK) this.A04).A01;
            if (obj2 == tva2) {
                VGC.A00(userSession2).A01((Hashtag) this.A01);
            } else {
                C14416Tvl.A00(userSession2).A00((Hashtag) this.A01);
            }
        }
        Set<C20914X4f> set2 = ((C14436TwK) this.A04).A04;
        Hashtag hashtag = (Hashtag) this.A01;
        for (C20914X4f CLP : set2) {
            CLP.CLP(String.valueOf(hashtag.getId()));
        }
    }
}
