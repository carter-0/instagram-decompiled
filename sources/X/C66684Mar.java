package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Mar  reason: case insensitive filesystem */
public final class C66684Mar implements C74516PwB {
    public final UserSession A00;
    public final AnonymousClass2Ep A01;
    public final C254703su A02;
    public final C66649MaI A03;

    public C66684Mar(UserSession userSession, C254703su r3, AnonymousClass2Ep r4, C66649MaI maI) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(maI, 4);
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = maI;
    }

    public final boolean CK8() {
        return false;
    }

    public final boolean CUK() {
        return false;
    }

    public final boolean CZE() {
        return true;
    }

    public final boolean CeB() {
        return false;
    }

    public final List AZs() {
        return this.A01.AZs();
    }

    public final C242373Tu AiM() {
        return this.A01.AiM();
    }

    public final Integer Amj() {
        C242243Te A0b = C66580MXl.A0b(this.A01);
        if (A0b != null) {
            return A0b.A05;
        }
        return null;
    }

    public final boolean AqP() {
        return this.A01.AqP();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2 != 61) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.common.typedurl.ImageUrl AsU() {
        /*
            r4 = this;
            X.2Ep r3 = r4.A01
            int r2 = r3.C6a()
            r0 = 28
            r1 = 0
            if (r2 == r0) goto L_0x001f
            r0 = 29
            if (r2 == r0) goto L_0x0014
            r0 = 61
            if (r2 == r0) goto L_0x001f
        L_0x0013:
            return r1
        L_0x0014:
            X.3U9 r3 = (X.AnonymousClass3U9) r3
            X.3S9 r0 = r3.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0013
            com.instagram.common.typedurl.ImageUrl r1 = r0.A04
            return r1
        L_0x001f:
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r3.Asg()
            if (r0 == 0) goto L_0x0013
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66684Mar.AsU():com.instagram.common.typedurl.ImageUrl");
    }

    public final String AsX() {
        C242243Te r0 = ((AnonymousClass3U9) this.A01).A01.A0s;
        if (r0 != null) {
            return r0.A07;
        }
        return null;
    }

    public final DirectThreadKey AxH() {
        return this.A01.BJy();
    }

    public final List AxI() {
        UserSession userSession = this.A00;
        if (C66700Mb7.A02(userSession)) {
            return C66700Mb7.A00(userSession, this.A01.AxI());
        }
        return null;
    }

    public final String B4l() {
        return this.A01.C6k();
    }

    public final int BHS() {
        return this.A01.BHS();
    }

    public final AnonymousClass170 BIs() {
        return this.A01.BIt();
    }

    public final List BJk() {
        List list;
        C242243Te A0b = C66580MXl.A0b(this.A01);
        if (A0b == null || (list = A0b.A0D) == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final List BJl() {
        List list;
        C242243Te A0b = C66580MXl.A0b(this.A01);
        if (A0b == null || (list = A0b.A0E) == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final long BKe() {
        return TimeUnit.MICROSECONDS.toMillis(this.A01.BKd());
    }

    public final String BKx() {
        C254703su BKv = this.A01.BKv();
        if (BKv != null) {
            return BKv.A0g();
        }
        return null;
    }

    public final Long BLI() {
        C254703su BLG = this.A01.BLG();
        if (BLG != null) {
            return Long.valueOf(BLG.C7c());
        }
        return null;
    }

    public final Integer BMT() {
        return this.A01.BMT();
    }

    public final int BSK() {
        return this.A01.BSK();
    }

    public final Map BWN() {
        return ((AnonymousClass3U9) this.A01).A01.A2D;
    }

    public final AnonymousClass9IM BWj() {
        return this.A01.BWj();
    }

    public final int BXL() {
        AnonymousClass2Ep r4 = this.A01;
        UserSession userSession = this.A00;
        AnonymousClass3SZ Aue = r4.Aue(userSession.A06);
        if (Aue == null) {
            return 0;
        }
        AnonymousClass48S A0P = 1bJ.A00(userSession).A0P(r4.BJy());
        if (A0P != null) {
            return A0P.A0F(Aue, Integer.MAX_VALUE);
        }
        return -1;
    }

    public final List Bal() {
        return this.A01.BRZ();
    }

    public final long Bca() {
        return this.A01.Bca();
    }

    public final List Bk9() {
        return this.A01.BRV();
    }

    public final List BkC() {
        return this.A01.BRZ();
    }

    public final N2U C43() {
        return this.A01.C43();
    }

    public final int C66() {
        return this.A01.B6d();
    }

    public final ImageUrl C6B() {
        AnonymousClass4jH C6F = this.A01.C6F();
        if (C6F != null) {
            return 1iI.A04(C6F.A00, AnonymousClass05K.A01);
        }
        return null;
    }

    public final DirectShareTarget C6Y() {
        AnonymousClass2Ep r1 = this.A01;
        ArrayList A012 = AnonymousClass48M.A01(r1.BRZ());
        return new DirectShareTarget(C66662MaV.A00(r1.C6C(), A012), r1.C6f(), A012, r1.CQ2());
    }

    public final int C6a() {
        return this.A01.C6a();
    }

    public final String C6f() {
        return this.A01.C6f();
    }

    public final C254923tH C9i() {
        return C254923tH.DJANGO;
    }

    public final C254743sy CBV() {
        return this.A01.BJy();
    }

    public final User CCg(String str, String str2) {
        return this.A01.CCg(str, str2);
    }

    public final LinkedHashMap CCp() {
        HashMap CCo = this.A01.CCo();
        LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(CCo.size()));
        for (Map.Entry entry : CCo.entrySet()) {
            Object key = entry.getKey();
            AnonymousClass3SZ r0 = (AnonymousClass3SZ) entry.getValue();
            linkedHashMap.put(key, new C66709MbG(r0.A02, r0.A00));
        }
        return linkedHashMap;
    }

    public final boolean CJW() {
        C66649MaI maI = this.A03;
        AnonymousClass2Ep r1 = this.A01;
        if (!maI.A09(r1) || !maI.A03(r1)) {
            return false;
        }
        return true;
    }

    public final boolean CJY() {
        C66649MaI maI = this.A03;
        AnonymousClass2Ep r1 = this.A01;
        if (!maI.A09(r1) || !maI.A04(r1)) {
            return false;
        }
        return true;
    }

    public final boolean CKs() {
        AnonymousClass2Ep r4 = this.A01;
        if (r4.BKu() != null) {
            UserSession userSession = this.A00;
            C254703su BRz = 1bJ.A00(userSession).BRz(r4.BJy(), r4.BKu());
            if (BRz == null || r4.CbQ(userSession.A06, BRz.A0g(), BRz.A1u)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean CKt() {
        return this.A01.CKt();
    }

    public final boolean CKu() {
        return this.A01.CKu();
    }

    public final boolean CKv() {
        return this.A01.CKv();
    }

    public final boolean CKw() {
        C2606546n r0;
        C241973Sc r02;
        String str;
        String str2;
        C254703su r3 = this.A02;
        if (r3 == null) {
            return false;
        }
        AnonymousClass2Ep r4 = this.A01;
        if (r4.isPending() || r3.A2P) {
            return false;
        }
        if (r4.Axj() || ((r0 = r3.A0N) != null && (str2 = r0.A02) != null && O4L.A00.contains(str2))) {
            return r4.CKx();
        }
        0eE r03 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        if (!r3.A1l(r03.A01(userSession))) {
            return false;
        }
        AnonymousClass3SZ Aue = r4.Aue(userSession.A06);
        if (Aue == null || (r02 = Aue.A02) == null || (str = r02.A01) == null || r3.A1o(str)) {
            return true;
        }
        return false;
    }

    public final boolean CMM() {
        return this.A01.CKr(this.A00);
    }

    public final boolean CMN() {
        return this.A01.CMN();
    }

    public final boolean COe() {
        return this.A01.COb();
    }

    public final boolean CR6() {
        return this.A01.CR4();
    }

    public final boolean CRe() {
        return this.A01.CVb();
    }

    public final boolean CSK() {
        AnonymousClass2Ep r3 = this.A01;
        UserSession userSession = this.A00;
        C376169Gw r1 = C376169Gw.A00;
        0sn r0 = 0sn.A00;
        return C66642MaB.A00(userSession, r1.createWithAdditionalCapabilities(r0, r0), r3);
    }

    public final boolean CTB() {
        return this.A01.CTB();
    }

    public final boolean CTo() {
        if (this.A01.C6M() != 1) {
            return false;
        }
        return true;
    }

    public final boolean CUG() {
        return this.A01.CUG();
    }

    public final boolean CUb() {
        C242243Te A0b = C66580MXl.A0b(this.A01);
        if (A0b != null) {
            return A0b.A0L;
        }
        return false;
    }

    public final boolean CV3() {
        return C308556Us.A0M(this.A00, this.A01);
    }

    public final boolean CVE() {
        return this.A01.CVE();
    }

    public final boolean CVr() {
        return this.A01.CVr();
    }

    public final boolean CW6() {
        C254703su BKv = this.A01.BKv();
        if (BKv == null || BKv.A10 != 2FW.A0q || AnonymousClass7F3.A01(BKv, this.A00.A06)) {
            return false;
        }
        return true;
    }

    public final boolean CWb() {
        AnonymousClass2Ep r0 = this.A01;
        r0.BJy();
        if (r0.C6C() == null) {
            return true;
        }
        return false;
    }

    public final boolean CWe() {
        if (this.A01.BNq() != 1) {
            return false;
        }
        return true;
    }

    public final boolean CWp() {
        return this.A01.CWp();
    }

    public final boolean CXF() {
        return this.A01.CXF();
    }

    public final boolean CY7() {
        return this.A01.CY7();
    }

    public final boolean CZA() {
        return this.A01.CZA();
    }

    public final boolean Ca9() {
        return this.A01.Ca9();
    }

    public final boolean CaM() {
        return this.A01.CaM();
    }

    public final boolean CaN() {
        int Bjw = this.A01.Bjw();
        UserSession userSession = this.A00;
        boolean z = false;
        if (Bjw == 0) {
            Boolean bool = (Boolean) DcK.A00(userSession).A02.getValue();
            if (bool != null) {
                z = bool.booleanValue();
            }
            return !z;
        } else if (Bjw != 2) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean CcG() {
        return this.A01.CcG();
    }

    public final boolean Cck() {
        return C66651MaK.A04(this.A01);
    }

    public final boolean CdF() {
        boolean z;
        AnonymousClass3U9 r2 = (AnonymousClass3U9) this.A01;
        if (((Boolean) r2.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = r2.A03.readLock();
            readLock.lock();
            try {
                return r2.A01.A2e;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = r2.A01;
            synchronized (r1) {
                z = r1.A2e;
            }
            return z;
        }
    }

    public final boolean CdG() {
        C61078JwG jwG;
        Number number;
        AnonymousClass3U9 r2 = (AnonymousClass3U9) this.A01;
        if (((Boolean) r2.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = r2.A03.readLock();
            readLock.lock();
            try {
                jwG = r2.A01.A0X;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = r2.A01;
            synchronized (r1) {
                jwG = r1.A0X;
            }
        }
        if (jwG == null || (number = (Number) jwG.A00) == null) {
            return false;
        }
        return new Date(number.longValue()).after(new Date());
    }

    public final boolean Cdt() {
        return this.A01.Cdv(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r5 = X.1bJ.A00(r1);
        r0 = r2.BJy();
        r5 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cdy() {
        /*
            r6 = this;
            X.2Ep r2 = r6.A01
            com.instagram.common.session.UserSession r1 = r6.A00
            java.lang.String r0 = r1.A06
            X.3SZ r0 = r2.Aue(r0)
            if (r0 == 0) goto L_0x003e
            X.2Dm r5 = X.1bJ.A00(r1)
            com.instagram.model.direct.DirectThreadKey r0 = r2.BJy()
            X.2Dr r5 = (X.2Dr) r5
            X.48S r4 = r5.A0P(r0)
            r3 = 0
            if (r4 == 0) goto L_0x003e
            java.util.ArrayList r0 = r5.CBx(r0)
            int r2 = r0.size()
            if (r2 == 0) goto L_0x003e
            X.3U9 r1 = r4.A0I
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A0A
            java.lang.String r0 = r0.A06
            X.3SZ r1 = r1.Aue(r0)
            r0 = 20
            int r0 = r4.A0F(r1, r0)
            if (r0 != r2) goto L_0x003d
            r3 = 1
        L_0x003d:
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66684Mar.Cdy():boolean");
    }

    public final boolean CeT() {
        return this.A03.A09(this.A01);
    }

    public final boolean CeU() {
        return this.A01.CeU();
    }

    public final boolean Cel() {
        User BZK = this.A01.BZK();
        if (BZK == null || !BZK.A2R()) {
            return false;
        }
        return true;
    }

    public final boolean EtA() {
        AnonymousClass3U9 r5 = (AnonymousClass3U9) this.A01;
        boolean z = true;
        if (((Boolean) r5.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = r5.A03.readLock();
            readLock.lock();
            try {
                if (!r5.CUG()) {
                    AnonymousClass3S9 r1 = r5.A01;
                    if (r1.A28.size() == 1) {
                        Object obj = r1.A28.get(0);
                        0qQ.A07(obj);
                        if (C308436Ug.A02((User) obj)) {
                            return z;
                        }
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r12 = r5.A01;
            synchronized (r12) {
                if (!r5.CUG() && r12.A28.size() == 1) {
                    Object obj2 = r12.A28.get(0);
                    0qQ.A07(obj2);
                    if (C308436Ug.A02((User) obj2)) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public final boolean EtG() {
        AnonymousClass2Ep r0 = this.A01;
        boolean isPending = r0.isPending();
        boolean CUG = r0.CUG();
        return C66640Ma9.A04(r0.BRZ(), r0.BSK(), isPending, CUG);
    }

    public final boolean isMuted() {
        return this.A01.isMuted();
    }

    public final boolean isPending() {
        return this.A01.isPending();
    }
}
