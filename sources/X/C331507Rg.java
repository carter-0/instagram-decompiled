package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Rg  reason: invalid class name and case insensitive filesystem */
public final class C331507Rg implements AnonymousClass7S7 {
    public C254763t0 A00;
    public final AnonymousClass1aS A01;
    public final AnonymousClass1aS A02;
    public final AnonymousClass1aS A03;
    public final AnonymousClass1aS A04;
    public final AnonymousClass1aS A05;
    public final AnonymousClass1aS A06;
    public final AnonymousClass1aS A07;
    public final AnonymousClass1aS A08;
    public final AnonymousClass1aS A09;
    public final 1a8 A0A;
    public final Capabilities A0B;
    public final AnonymousClass7SD A0C;
    public final O98 A0D;
    public final UserSession A0E;
    public final Capabilities A0F;
    public final AnonymousClass9HR A0G;

    public final int AdN() {
        return 0;
    }

    public final List AxI() {
        return null;
    }

    public final AnonymousClass170 BY7() {
        return null;
    }

    public final String BY8() {
        return null;
    }

    public final String BiB() {
        return null;
    }

    public final C242243Te BiC() {
        return null;
    }

    public final AnonymousClass3SZ BrG(boolean z) {
        return null;
    }

    public final int C68(boolean z) {
        return -1;
    }

    public final String C6G() {
        return null;
    }

    public final String C6H() {
        return null;
    }

    public final String C6k() {
        return null;
    }

    public final boolean COR(String str) {
        return false;
    }

    public final boolean COb() {
        return false;
    }

    public final boolean CQm() {
        return false;
    }

    public final boolean CTo() {
        return false;
    }

    public final boolean CWe() {
        return false;
    }

    public final boolean CXj(String str) {
        return false;
    }

    public final boolean CZ1() {
        return false;
    }

    public final boolean CcG() {
        return false;
    }

    public C331507Rg(UserSession userSession, Capabilities capabilities, C254763t0 r89, AnonymousClass9HR r90, boolean z) {
        MsysThreadId msysThreadId;
        Capabilities A002;
        AnonymousClass9HR r4 = r90;
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        this.A0G = r4;
        this.A0B = capabilities;
        this.A00 = r89;
        this.A0D = new O98(userSession2);
        if (r4 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) r4;
        } else {
            msysThreadId = null;
        }
        boolean z2 = r89 != null;
        List list = 0sn.A00;
        AnonymousClass7SD r5 = new AnonymousClass7SD((AnonymousClass9IM) null, (C376579In) null, (C61081JwJ) null, (N49) null, (C59832Ja7) null, (ImageUrl) null, (Capabilities) null, (C242373Tu) null, (C280014zr) null, (DirectThreadThemeInfo) null, (AnonymousClass2Ep) null, (A5N) null, (AnonymousClass914) null, new C272964li((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, false), 2EN.A05, msysThreadId, 0, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, list, list, (List) null, (List) null, (Map) null, 0Yt.A0E(), (Map) null, (Map) null, (Map) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, z, false, false, false, true, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A0C = r5;
        this.A08 = 1aF.A01(r5);
        this.A06 = 1aF.A00();
        this.A01 = 1aF.A00();
        this.A07 = 1aF.A00();
        this.A03 = 1aF.A00();
        this.A02 = 1aF.A00();
        this.A05 = 1aF.A00();
        this.A04 = 1aF.A00();
        this.A09 = 1aF.A00();
        this.A0A = new 1a8((C269794fh) null);
        if (this.A0C.A0x) {
            A002 = C376169Gw.A00.createWithAdditionalCapabilities(list, list);
        } else {
            A002 = C395029z5.A00(userSession2);
        }
        this.A0F = A002;
    }

    public final AnonymousClass7LZ AYK(Context context, C329967Kx r3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass7LZ r0 = (AnonymousClass7LZ) this.A01.A0X();
        if (r0 == null) {
            return AnonymousClass7LZ.A0y;
        }
        return r0;
    }

    public final AnonymousClass34S AeX() {
        AnonymousClass34S r2;
        AnonymousClass7LZ r0 = (AnonymousClass7LZ) this.A01.A0X();
        if (r0 == null || (r2 = r0.A09) == null) {
            return new AnonymousClass34S(new SimpleImageUrl(""), new SimpleImageUrl(""));
        }
        return r2;
    }

    public final C254743sy AfV() {
        C254793t3 r0;
        AnonymousClass7SD r02 = (AnonymousClass7SD) this.A08.A0X();
        if (r02 == null || (r0 = r02.A0P) == null) {
            return null;
        }
        return C300965yF.A05(r0);
    }

    public final Capabilities AlE() {
        return this.A0B;
    }

    public final C254793t3 B6E() {
        C254763t0 r0 = this.A00;
        if (r0 == null) {
            return CBU();
        }
        return r0;
    }

    public final C254743sy B6F() {
        C254743sy A052;
        C254763t0 r0 = this.A00;
        if (r0 == null || (A052 = C300965yF.A05(r0)) == null) {
            return B8S();
        }
        return A052;
    }

    public final 1aU BJJ() {
        return this.A04.A0D();
    }

    public final Capabilities BN2() {
        return this.A0F;
    }

    public final C254763t0 BN3() {
        return this.A00;
    }

    public final String C6C() {
        C254793t3 r0;
        AnonymousClass7SD r02 = (AnonymousClass7SD) this.A08.A0X();
        if (r02 == null || (r0 = r02.A0P) == null) {
            return null;
        }
        return String.valueOf(C300965yF.A03(r0).A00);
    }

    public final AnonymousClass7SD C6Q() {
        Object A0X = this.A08.A0X();
        if (A0X != null) {
            return (AnonymousClass7SD) A0X;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final 1aU C6S() {
        return this.A08.A0D();
    }

    public final DirectShareTarget C6Z(Context context) {
        return (DirectShareTarget) this.A05.A0X();
    }

    public final DirectThreadThemeInfo C6d() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0J;
        }
        return null;
    }

    public final String C6f() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0W;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Map C6i() {
        return null;
    }

    public final C254793t3 CBU() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0P;
        }
        return null;
    }

    public final boolean CSK() {
        return this.A0B.A00(C376179Gx.SHH_MODE);
    }

    public final boolean CUO() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0r;
        }
        return false;
    }

    public final boolean CVE() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0x;
        }
        return false;
    }

    public final boolean CVr() {
        AnonymousClass7SD r0 = (AnonymousClass7SD) this.A08.A0X();
        if (r0 != null) {
            return r0.A0y;
        }
        return false;
    }

    public final boolean CWp() {
        C376489Ie r0 = (C376489Ie) this.A07.A0X();
        if (r0 != null) {
            return r0.A01;
        }
        return false;
    }

    public final boolean CdE() {
        Boolean bool = (Boolean) this.A04.A0X();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean Cdt() {
        C376489Ie r0 = (C376489Ie) this.A07.A0X();
        if (r0 != null) {
            return r0.A01;
        }
        return false;
    }

    public final AnonymousClass2Ep Cms() {
        C254763t0 r2 = this.A00;
        if (r2 != null) {
            return 1bJ.A00(this.A0E).B33(C327647Bq.A00(r2));
        }
        return null;
    }

    public final C254743sy B8S() {
        C254743sy AfV = AfV();
        if (AfV != null) {
            return AfV;
        }
        throw new IllegalStateException("No value for threadId");
    }

    public final Integer BA1() {
        return C6Q().A0Q;
    }

    public final int BRT() {
        return BRZ().size();
    }

    public final List BRZ() {
        List list = C6Q().A0b;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!0qQ.A0K(((User) next).getId(), this.A0E.A06)) {
                arrayList.add(next);
            }
        }
        return 00k.A0U(arrayList);
    }

    public final Integer Btd() {
        return C6Q().A0S;
    }

    public final 2EN C3d() {
        return C6Q().A0O;
    }

    public final List C6O() {
        List<User> list = C6Q().A0b;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (User id : list) {
            arrayList.add(id.getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!0qQ.A0K(next, this.A0E.A06)) {
                arrayList2.add(next);
            }
        }
        return 00k.A0U(arrayList2);
    }

    public final C254783t2 C6c() {
        C254783t2 CBU = CBU();
        if (CBU == null) {
            CBU = this.A0G;
        }
        return CBU;
    }

    public final boolean CKz(String str) {
        List<User> list = C6Q().A0b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (User id : list) {
                if (id.getId().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean CRx() {
        return CSK();
    }

    public final boolean CV8() {
        return C6Q().A0w;
    }

    public final boolean CWb() {
        if (AnonymousClass6W3.A03(C6c()) instanceof MsysThreadId) {
            return false;
        }
        return true;
    }

    public final boolean CYS() {
        if (C6Q().A0r || C6Q().A0b.isEmpty()) {
            return false;
        }
        return ((User) C6Q().A0b.get(0)).CXO();
    }

    public final boolean CZ0() {
        return C6Q().A1G;
    }

    public final boolean CdK() {
        return C66640Ma9.A05(C6Q().A0b, C6Q().A0r);
    }

    public final boolean EtG() {
        if (!C6Q().A1G && !C6Q().A0w) {
            if (C66640Ma9.A05(C6Q().A0b, C6Q().A0r)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
