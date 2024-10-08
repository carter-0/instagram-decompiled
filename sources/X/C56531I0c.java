package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.I0c  reason: case insensitive filesystem */
public final class C56531I0c {
    public final C59610JQe A00;
    public final UserSession A01;

    public C56531I0c(UserSession userSession, C59610JQe jQe) {
        0qQ.A0B(jQe, 2);
        this.A01 = userSession;
        this.A00 = jQe;
    }

    public static final int A00(1Xj r6) {
        Integer num;
        List list;
        Long l;
        Integer num2;
        0qQ.A0B(r6, 0);
        C46314DUr BeN = r6.A0C.BeN();
        Integer num3 = null;
        if (BeN != null) {
            num = Integer.valueOf(BeN.BPs());
        } else {
            num = null;
        }
        C46314DUr BeN2 = r6.A0C.BeN();
        if (BeN2 != null) {
            list = BeN2.Bf5();
        } else {
            list = null;
        }
        C46314DUr BeN3 = r6.A0C.BeN();
        if (BeN3 != null) {
            l = BeN3.B2n();
        } else {
            l = null;
        }
        C46314DUr BeN4 = r6.A0C.BeN();
        if (BeN4 != null) {
            num2 = Integer.valueOf(BeN4.C1Y());
        } else {
            num2 = null;
        }
        C46314DUr BeN5 = r6.A0C.BeN();
        if (BeN5 != null) {
            num3 = Integer.valueOf(BeN5.AdF());
        }
        return Arrays.hashCode(new Object[]{num, list, l, num2, num3});
    }

    public final C53296Gli A01(Context context, 1Xj r21) {
        ArrayList arrayList;
        int i;
        1Xj r2 = r21;
        0qQ.A0B(r2, 0);
        C46314DUr BeN = r2.A0C.BeN();
        if (BeN != null) {
            List AqJ = BeN.AqJ();
            int i2 = 0;
            if (AqJ != null) {
                arrayList = AnonymousClass7TF.A0p(AqJ);
                Iterator it = AqJ.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    try {
                        I0g i0g = I0g.A04;
                        C56544I0y i0y = C56544I0y.A03;
                        if (00l.A0X("#", 10) || 00l.A0X("#", 13)) {
                            throw AnonymousClass7TF.A0W("LF and CR characters are prohibited in prefix, but was ", "#");
                        }
                        i = I5S.A00(A18, new I0g(C56543I0u.A00, new C56544I0y("#"), false)) | -16777216;
                        AnonymousClass7TF.A1M(arrayList, i);
                    } catch (IllegalArgumentException unused) {
                        i = 0;
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            List Bf5 = BeN.Bf5();
            ArrayList A0p = AnonymousClass7TF.A0p(Bf5);
            Iterator it2 = Bf5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    1Xj r7 = (1Xj) next;
                    ExtendedImageUrl A1n = r7.A1n(context);
                    String id = r7.getId();
                    A0p.add(new C61050Jvo(new C61078JwG((Object) new C58187Inr(41, this, r7), 19), (ImageUrl) A1n, C51966G9m.A11(r7), (Integer) 00k.A0O(arrayList, i2), (Integer) 00k.A0J(arrayList), id));
                    i2 = i3;
                } else {
                    DUO Bhn = BeN.Bhn();
                    int BPs = BeN.BPs();
                    int C1Y = BeN.C1Y();
                    Long B2n = BeN.B2n();
                    C59610JQe jQe = this.A00;
                    return new C53296Gli(new C61084JwM((C62320sa) new C58187Inr(39, r2, jQe), (C62320sa) new C58187Inr(40, r2, jQe), (0sL) JGK.A01(jQe, 37)), Bhn, B2n, A0p, arrayList, BPs, C1Y);
                }
            }
        } else {
            List list = 0sn.A00;
            return new C53296Gli(new C61084JwM((C62320sa) C58416IrZ.A00, (C62320sa) C58417Ira.A00, (0sL) JFP.A00), (DUO) null, C51971G9r.A0m(), list, list, 0, 0);
        }
    }
}
