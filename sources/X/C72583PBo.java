package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PBo  reason: case insensitive filesystem */
public final class C72583PBo implements C74516PwB {
    public static final C70735OIs A0W = new Object();
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final 2FW A03;
    public final MsysThreadId A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final C67256Mkq A0H;
    public final DirectThreadKey A0I;
    public final Long A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public final C242373Tu AiM() {
        return null;
    }

    public final Integer Amj() {
        return null;
    }

    public final ImageUrl AsU() {
        return null;
    }

    public final List AxI() {
        return null;
    }

    public final String B4l() {
        return null;
    }

    public final AnonymousClass170 BIs() {
        return null;
    }

    public final Map BWN() {
        return null;
    }

    public final AnonymousClass9IM BWj() {
        return null;
    }

    public final long Bca() {
        return 0;
    }

    public final N2U C43() {
        return null;
    }

    public final boolean CKs() {
        return false;
    }

    public final boolean CKw() {
        return false;
    }

    public final boolean CMM() {
        return false;
    }

    public final boolean CMN() {
        return false;
    }

    public final boolean COe() {
        return false;
    }

    public final boolean CRe() {
        return true;
    }

    public final boolean CTB() {
        return false;
    }

    public final boolean CTo() {
        return false;
    }

    public final boolean CUb() {
        return false;
    }

    public final boolean CVr() {
        return true;
    }

    public final boolean CWb() {
        return false;
    }

    public final boolean CWe() {
        return false;
    }

    public final boolean CWp() {
        return false;
    }

    public final boolean CZA() {
        return false;
    }

    public final boolean CZE() {
        return false;
    }

    public final boolean Ca9() {
        return false;
    }

    public final boolean CaN() {
        return true;
    }

    public final boolean CdF() {
        return false;
    }

    public final boolean CdG() {
        return false;
    }

    public final boolean Cel() {
        return false;
    }

    public final boolean EtG() {
        return false;
    }

    public final /* synthetic */ List AZs() {
        return 0sn.A00;
    }

    public final boolean AqP() {
        MutedWordsFilterManager A002 = AnonymousClass92E.A00(this.A02);
        if (A002 == null) {
            return false;
        }
        List<C70470O7v> list = this.A09;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C70470O7v o7v : list) {
            A0r.add(o7v.A00);
        }
        Iterator it = 00k.A0U(A0r).iterator();
        while (it.hasNext()) {
            if (A002.A05(AnonymousClass7TE.A18(it), C70093Nx9.A00(this.A01)).A00) {
                if (C66647MaG.A0A(this.A04) != null) {
                    return true;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        if (C66647MaG.A0A(this.A04) != null) {
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ String AsX() {
        return null;
    }

    public final DirectThreadKey AxH() {
        return this.A0I;
    }

    public final int BHS() {
        if (!OPx.A00(this.A01) || CCg(this.A02.A06, (String) null) != null) {
            return 0;
        }
        return 1;
    }

    public final /* synthetic */ List BJk() {
        return 0sn.A00;
    }

    public final /* synthetic */ List BJl() {
        return 0sn.A00;
    }

    public final long BKe() {
        return this.A0G;
    }

    public final String BKx() {
        return this.A06;
    }

    public final Long BLI() {
        Long l = this.A0J;
        if (l != null) {
            return C66582MXn.A0l(l.longValue());
        }
        return null;
    }

    public final Integer BMT() {
        return AnonymousClass05K.A0N;
    }

    public final int BXL() {
        return this.A0F;
    }

    public final List Bal() {
        Collection values;
        Map map = this.A0N;
        if (map == null || (values = map.values()) == null) {
            return 0sn.A00;
        }
        List A0a = 00k.A0a(values);
        ArrayList A0r = AnonymousClass7TG.A0r(A0a);
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            A0r.add(JTO.A1A(it).A00);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0r) {
            DbY.A1T(DbS.A0q(next), this.A02.A06, next, A1C);
        }
        return A1C;
    }

    public final List Bk9() {
        Set keySet;
        Map map = this.A0N;
        if (map == null || (keySet = map.keySet()) == null) {
            return 0sn.A00;
        }
        List A0a = 00k.A0a(keySet);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0a) {
            DbV.A1U(next, A1C, C51966G9m.A1W(this.A02, next) ? 1 : 0);
        }
        return A1C;
    }

    public final List BkC() {
        Collection values;
        Map map = this.A0N;
        if (map == null || (values = map.values()) == null) {
            return 0sn.A00;
        }
        List A0a = 00k.A0a(values);
        ArrayList A0r = AnonymousClass7TG.A0r(A0a);
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            A0r.add(JTO.A1A(it).A00);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0r) {
            DbY.A1T(DbS.A0q(next), this.A02.A06, next, A1C);
        }
        return A1C;
    }

    public final int C66() {
        return this.A0E;
    }

    public final ImageUrl C6B() {
        String str = this.A0L;
        if (str != null) {
            return DbS.A0V(str);
        }
        return null;
    }

    public final DirectShareTarget C6Y() {
        ArrayList arrayList;
        Collection values;
        UserSession userSession = this.A02;
        Map map = this.A0N;
        if (map == null || (values = map.values()) == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TG.A0r(values);
            Iterator it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(JTO.A1A(it).A00);
            }
        }
        return C70118NxY.A00(userSession, this.A04, this.A0K, arrayList);
    }

    public final /* synthetic */ int C6a() {
        return 0;
    }

    public final String C6f() {
        return this.A0K;
    }

    public final C254923tH C9i() {
        if (C70093Nx9.A00(this.A01)) {
            return C254923tH.ACT;
        }
        return C254923tH.MI;
    }

    public final C254743sy CBV() {
        return this.A04;
    }

    public final User CCg(String str, String str2) {
        0eP r0;
        Map map = this.A0N;
        if (map == null || (r0 = (0eP) map.get(str)) == null) {
            return null;
        }
        return (User) r0.A00;
    }

    public final LinkedHashMap CCp() {
        List<C70625ODw> list = this.A0M;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(list));
        for (C70625ODw oDw : list) {
            A0x.put(oDw.A01, new C66709MbG((C241973Sc) null, TimeUnit.MILLISECONDS.toMicros(oDw.A00)));
        }
        return A0x;
    }

    public final boolean CJW() {
        int i = this.A0D;
        if (i == 4 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean CJY() {
        int i = this.A0D;
        if (i == 3 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean CK8() {
        return this.A0O;
    }

    public final boolean CKt() {
        return this.A0P;
    }

    public final boolean CKu() {
        return this.A0C;
    }

    public final boolean CKv() {
        return this.A0P;
    }

    public final boolean CR6() {
        return this.A0Q;
    }

    public final boolean CSK() {
        return this.A0B;
    }

    public final boolean CUG() {
        return OPx.A00(this.A01);
    }

    public final boolean CUK() {
        return this.A0R;
    }

    public final boolean CV3() {
        return false;
    }

    public final boolean CVE() {
        return this.A0B;
    }

    public final boolean CW6() {
        if (this.A03 == 2FW.A0q) {
            if (C51966G9m.A1W(this.A02, this.A07)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean CXF() {
        return this.A0S;
    }

    public final boolean CY7() {
        return AnonymousClass7TF.A1V(this.A0K);
    }

    public final /* synthetic */ boolean CaM() {
        return false;
    }

    public final boolean CcG() {
        return AnonymousClass7TF.A1W(this.A0H, C67256Mkq.OTHER);
    }

    public final /* synthetic */ boolean Cck() {
        return false;
    }

    public final boolean Cdt() {
        return this.A0C;
    }

    public final /* synthetic */ boolean Cdy() {
        return false;
    }

    public final boolean CeB() {
        return this.A0B;
    }

    public final boolean CeT() {
        if (!AnonymousClass9HV.A00(this.A02).A00(this.A04, 26) || !AnonymousClass7TE.A1b(BkC())) {
            return false;
        }
        return true;
    }

    public final boolean CeU() {
        return this.A0U;
    }

    public final boolean EtA() {
        return this.A0V;
    }

    public final boolean isMuted() {
        return this.A0T;
    }

    public final boolean isPending() {
        return AnonymousClass7TF.A1W(this.A0H, C67256Mkq.PENDING);
    }

    public C72583PBo(UserSession userSession, C67256Mkq mkq, DirectThreadKey directThreadKey, 2FW r6, MsysThreadId msysThreadId, Long l, Long l2, String str, String str2, String str3, String str4, String str5, List list, List list2, Map map, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A02 = userSession;
        this.A0N = map;
        this.A0M = list;
        this.A09 = list2;
        this.A0I = directThreadKey;
        this.A04 = msysThreadId;
        this.A0D = i;
        this.A0K = str;
        this.A01 = i2;
        this.A0B = z;
        this.A0G = j;
        this.A0L = str2;
        this.A0F = i3;
        this.A0C = z2;
        this.A0P = z3;
        this.A0T = z4;
        this.A0S = z5;
        this.A0U = z6;
        this.A0H = mkq;
        this.A0E = i4;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = i5;
        this.A05 = l;
        this.A03 = r6;
        this.A0V = z7;
        this.A0R = z8;
        this.A0J = l2;
        this.A0Q = z9;
        this.A0A = z10;
        this.A0O = z11;
    }

    public final int BSK() {
        return isPending() ? 1 : 0;
    }
}
