package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ji3  reason: case insensitive filesystem */
public final class C60246Ji3 extends 2YL {
    public N4R A00;
    public MusicAttributionConfig A01;
    public JZC A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final MusicProduct A06;
    public final UserSession A07;
    public final List A08;
    public final Set A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C66217MIy(this, 26));
    public final AnonymousClass0r6 A0B;
    public final 05G A0C;

    public C60246Ji3(MusicProduct musicProduct, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, musicProduct);
        this.A07 = userSession;
        this.A06 = musicProduct;
        02z A1J = JTO.A1J();
        this.A0C = A1J;
        this.A0B = A1J;
        this.A08 = AnonymousClass7TE.A1C();
        this.A09 = DbS.A0y();
    }

    public final void A00() {
        Integer num;
        ArrayList A1C = AnonymousClass7TE.A1C();
        List list = this.A08;
        if (AnonymousClass7TE.A1b(list)) {
            A1C.add(new C61994KUr());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.add(new C61996KUt(AnonymousClass7TE.A18(it)));
            }
        }
        JZC jzc = this.A02;
        if (jzc != null) {
            Set set = this.A09;
            Set A0j = 00k.A0j(set);
            set.clear();
            JZC jzc2 = (JZC) 00k.A0A(A0j);
            if (jzc2 != null) {
                num = jzc2.A0G;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A0Y) {
                set.add(jzc2);
                A0j.remove(jzc2);
            }
            set.add(jzc);
            set.addAll(A0j);
        }
        Set set2 = this.A09;
        if (!set2.isEmpty()) {
            A1C.isEmpty();
            N4R n4r = this.A00;
            if (n4r != null) {
                A1C.add(new C61995KUs(n4r));
            }
            A1C.addAll(LJU.A01(00k.A0a(set2)));
        }
        A1C.add(new C61993KUq());
        this.A0C.Epw(A1C);
    }
}
