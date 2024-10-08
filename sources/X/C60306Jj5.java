package X;

import android.content.Context;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Jj5  reason: case insensitive filesystem */
public final class C60306Jj5 extends 2YL {
    public Integer A00;
    public boolean A01;
    public final C59725JVj A02;
    public final C352328Cx A03;
    public final L45 A04;
    public final Integer A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final 05G A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = (java.lang.Integer) r0.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60306Jj5(X.C59725JVj r6, com.instagram.common.session.UserSession r7, X.C352328Cx r8) {
        /*
            r5 = this;
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r5.<init>()
            r5.A03 = r8
            r5.A02 = r6
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r5.A05 = r1
            X.JVH r0 = r8.A00
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            r5.A00 = r0
            X.8fw r0 = X.C361268fw.A00
            X.02z r0 = X.106.A01(r0)
            r5.A06 = r0
            X.05F r0 = X.10b.A03(r0)
            r5.A08 = r0
            X.02z r0 = X.JTO.A1J()
            r5.A0B = r0
            r5.A0A = r0
            X.8Cx r0 = r5.A03
            X.JVH r0 = r0.A00
            if (r0 == 0) goto L_0x006b
            java.lang.String r4 = r0.A05
            java.lang.Object r3 = r0.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r0 = r0.A04
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            r0 = 5
            X.JwF r2 = new X.JwF
            r2.<init>((java.lang.String) r4, (java.lang.Integer) r3, (boolean) r1, (int) r0)
        L_0x004a:
            X.02z r0 = X.106.A01(r2)
            r5.A07 = r0
            r5.A09 = r0
            X.L45 r0 = new X.L45
            r0.<init>(r7)
            r5.A04 = r0
            X.8Cx r0 = r5.A03
            X.JVH r0 = r0.A00
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0067
        L_0x0065:
            java.lang.Integer r0 = r5.A05
        L_0x0067:
            A00(r5, r0)
            return
        L_0x006b:
            java.lang.Integer r0 = r5.A05
            java.lang.String r1 = X.LIJ.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.JwF r2 = new X.JwF
            r2.<init>((java.lang.Integer) r0, (java.lang.String) r1)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60306Jj5.<init>(X.JVj, com.instagram.common.session.UserSession, X.8Cx):void");
    }

    public final void A03(Context context, UserSession userSession, C60956JuE juE, 0sP r11) {
        String str;
        A6L a6l;
        A6L a6l2;
        A6L a6l3;
        boolean A1Y = DbW.A1Y(userSession);
        C39723A6o a6o = juE.A03;
        A6L a6l4 = a6o.A00;
        if ((a6l4 != null && (str = a6l4.A02) != null) || (((a6l = a6o.A03) != null && (str = a6l.A02) != null) || (((a6l2 = a6o.A02) != null && (str = a6l2.A02) != null) || ((a6l3 = a6o.A01) != null && (str = a6l3.A02) != null)))) {
            C290815g0 A032 = C59730JVo.A03(context, userSession, new C11211SFl(str, AnonymousClass000.A00(2289), A1Y, false, false));
            KH1.A01(A032, r11, 11);
            1ES.A03(A032);
        }
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        L45 l45 = this.A04;
        List list = (List) l45.A00.get(str);
        if (list != null) {
            A05(str, list);
            return;
        }
        UserSession userSession = l45.A01;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(AnonymousClass000.A00(618));
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        JTS.A1K(A0b, jSONArray, str);
        A0b.A9m("request_surface", String.valueOf(GiphyRequestSurface.CLIPS_V2));
        1OC A0S = DbU.A0S(A0b, CFD.class, C45663D0n.class);
        A0S.A00 = new C15620Ufm(this, l45, str, 2);
        1ES.A03(A0S);
    }

    public static void A01(Integer num, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C61082JwK(num, 14, z));
    }

    public final void A02() {
        Object obj;
        05G r2 = this.A06;
        Collection collection = (Collection) ((C361278fx) r2.getValue()).A01;
        if (collection != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(collection);
            ArrayList A0r = AnonymousClass7TG.A0r(A1D);
            Iterator it = A1D.iterator();
            while (it.hasNext()) {
                C60956JuE juE = (C60956JuE) it.next();
                Integer num = AnonymousClass05K.A01;
                String str = juE.A05;
                String str2 = juE.A07;
                String str3 = juE.A06;
                int i = juE.A00;
                C63879LAi lAi = juE.A01;
                C63879LAi lAi2 = juE.A02;
                C39723A6o a6o = juE.A03;
                AnonymousClass7TF.A1H(str, str2);
                C51974G9v.A0d(2, str3, lAi, lAi2, a6o);
                A0r.add(new C60956JuE(lAi, lAi2, a6o, num, str, str2, str3, i));
            }
            obj = new AnonymousClass8RJ(A0r);
        } else {
            obj = C361338g4.A00;
        }
        r2.Epw(obj);
    }

    public final void A05(String str, List list) {
        Object r0;
        if (str.equals(((C61077JwF) this.A07.getValue()).A01)) {
            05G r1 = this.A06;
            if (list.isEmpty()) {
                r0 = C361268fw.A00;
            } else {
                r0 = new AnonymousClass8Y4(list);
            }
            r1.Epw(r0);
        }
    }

    public static final void A00(C60306Jj5 jj5, Integer num) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Integer num2 = AnonymousClass05K.A01;
        boolean z = true;
        A01(num2, A1C, AnonymousClass7TF.A1W(num, num2));
        Integer num3 = AnonymousClass05K.A0C;
        A01(num3, A1C, AnonymousClass7TF.A1W(num, num3));
        Integer num4 = AnonymousClass05K.A0N;
        A01(num4, A1C, AnonymousClass7TF.A1W(num, num4));
        Integer num5 = AnonymousClass05K.A0Y;
        A01(num5, A1C, AnonymousClass7TF.A1W(num, num5));
        Integer num6 = AnonymousClass05K.A0j;
        A01(num6, A1C, AnonymousClass7TF.A1W(num, num6));
        Integer num7 = AnonymousClass05K.A0u;
        A01(num7, A1C, AnonymousClass7TF.A1W(num, num7));
        Integer num8 = AnonymousClass05K.A00;
        if (num != num8) {
            z = false;
        }
        A01(num8, A1C, z);
        jj5.A0B.Epw(A1C);
    }
}
