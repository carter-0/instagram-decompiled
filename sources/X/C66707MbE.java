package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.MbE  reason: case insensitive filesystem */
public final class C66707MbE implements C74514Pw9 {
    public final Context A00;
    public final UserSession A01;
    public final C254703su A02;
    public final AnonymousClass2Ep A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C73920Pm0(this, 28));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C73920Pm0(this, 29));
    public final AnonymousClass48T A06;

    public C66707MbE(Context context, UserSession userSession, C254703su r5, AnonymousClass2Ep r6, AnonymousClass48T r7) {
        0qQ.A0B(r6, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r6;
        this.A02 = r5;
        this.A06 = r7;
    }

    public final 2FW Aqm() {
        2FW r0 = this.A02.A10;
        0qQ.A07(r0);
        return r0;
    }

    public final C282485Dg AxK() {
        C271374ik r0 = this.A02.A0e;
        if (r0 != null) {
            return r0.A03;
        }
        return null;
    }

    public final Integer BMS() {
        return this.A02.A1F;
    }

    public final List BrL() {
        HashSet hashSet;
        AnonymousClass2Ep r5 = this.A03;
        UserSession userSession = this.A01;
        C254703su r3 = this.A02;
        AnonymousClass3U9 r52 = (AnonymousClass3U9) r5;
        if (AnonymousClass7TF.A1Z(r52.A05)) {
            ReentrantReadWriteLock.ReadLock readLock = r52.A03.readLock();
            readLock.lock();
            try {
                String str = r3.A1u;
                0qQ.A07(str);
                hashSet = AnonymousClass3U9.A03(userSession, r52, str, r3.A0g());
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (r52.A01) {
                String str2 = r3.A1u;
                0qQ.A07(str2);
                hashSet = AnonymousClass3U9.A03(userSession, r52, str2, r3.A0g());
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(hashSet);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            A0r.add(((C376659Iv) it.next()).A02);
        }
        return A0r;
    }

    public final String BsG() {
        User user = (User) this.A04.getValue();
        if (user != null) {
            return AnonymousClass50n.A08(user);
        }
        return null;
    }

    public final String BsJ() {
        String str = this.A02.A1u;
        0qQ.A07(str);
        return str;
    }

    public final ImageUrl BsN() {
        User user = (User) this.A04.getValue();
        if (user != null) {
            return user.Bh3();
        }
        return null;
    }

    public final CharSequence BxI() {
        return (CharSequence) this.A05.getValue();
    }

    public final Set CFh() {
        Set unmodifiableSet;
        C271374ik r0 = this.A02.A0e;
        if (r0 == null || (unmodifiableSet = Collections.unmodifiableSet(r0.A0C)) == null) {
            return 0sl.A00;
        }
        return unmodifiableSet;
    }

    public final String CFp() {
        C271374ik r0 = this.A02.A0e;
        if (r0 != null) {
            return r0.A0A;
        }
        return null;
    }

    public final List CGC() {
        String A08;
        ImmutableList A0I = this.A02.A0I();
        if (A0I == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            String str = ((C45278Cth) it.next()).A01;
            User CCf = this.A03.CCf(str);
            if (CCf == null && (CCf = DbV.A0j(this.A01, str)) == null) {
                A08 = null;
            } else {
                A08 = AnonymousClass50n.A08(CCf);
            }
            A0r.add(A08);
        }
        return 00k.A0X(A0r);
    }

    public final boolean CKy() {
        return this.A02.A1P();
    }

    public final boolean COD() {
        C254703su r1 = this.A02;
        if (r1.A0N == null && r1.A0C == null) {
            return false;
        }
        return true;
    }

    public final boolean CRS() {
        return this.A02.A1T();
    }

    public final boolean CRV() {
        String str;
        C2606546n r0 = this.A02.A0N;
        if (r0 == null || (str = r0.A02) == null) {
            return false;
        }
        return O4L.A00.contains(str);
    }

    public final boolean CU0() {
        return this.A02.A1j(AnonymousClass0t1.A01.A01(this.A01));
    }

    public final boolean CU3() {
        User user = (User) this.A04.getValue();
        if (user == null || !user.A1X()) {
            return false;
        }
        return true;
    }

    public final boolean CXc() {
        AnonymousClass55L r3;
        Boolean bool;
        Object obj = this.A02.A1T;
        if (obj instanceof AnonymousClass55L) {
            r3 = (AnonymousClass55L) obj;
        } else {
            r3 = null;
        }
        if (r3 == null || CU0() || r3.A02 != AnonymousClass05K.A0N || (bool = r3.A01) == null || bool.booleanValue() || !r3.A07) {
            return false;
        }
        return true;
    }

    public final boolean CXd() {
        AnonymousClass55L r3;
        Boolean bool;
        Object obj = this.A02.A1T;
        if (obj instanceof AnonymousClass55L) {
            r3 = (AnonymousClass55L) obj;
        } else {
            r3 = null;
        }
        if (r3 == null || CU0() || r3.A02 != AnonymousClass05K.A0N || (bool = r3.A01) == null || bool.booleanValue() || r3.A07) {
            return false;
        }
        return true;
    }

    public final boolean Cbp() {
        return this.A02.A2P;
    }

    public final Boolean Cen() {
        C271434iq r0;
        C271374ik r02 = this.A02.A0e;
        if (r02 == null || (r0 = r02.A04) == null) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass7TF.A1W(r0.A07, 1iA.A0Q));
    }

    public final boolean Cep() {
        C271374ik r0;
        C271434iq r02;
        C254703su r2 = this.A02;
        if (r2.A10 != 2FW.A0q || !(r2.A1T instanceof C271374ik) || (r0 = r2.A0e) == null || (r02 = r0.A04) == null || !r02.A0P) {
            return false;
        }
        return true;
    }

    public final boolean Ceq() {
        C271374ik r0 = this.A02.A0e;
        if (r0 == null || r0.A0A == null) {
            return false;
        }
        return true;
    }

    public final boolean EHm() {
        return !AnonymousClass48T.A00(this.A02, this.A06, false);
    }

    public final String getId() {
        return this.A02.A0g();
    }

    public final long C7a() {
        AnonymousClass9IE BxH;
        C376599Ip r0;
        if (!(CRV() || (BxH = this.A03.BxH()) == null || (r0 = (C376599Ip) BxH.A00) == null)) {
            long j = r0.A01;
            if (Long.valueOf(j) != null) {
                return j;
            }
        }
        return TimeUnit.MICROSECONDS.toMillis(this.A02.C7c());
    }

    public final Collection CFi() {
        Set CFh = CFh();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = CFh.iterator();
        while (it.hasNext()) {
            User CCf = this.A03.CCf(AnonymousClass7TE.A18(it));
            if (CCf != null) {
                A1C.add(CCf.getUsername());
            }
        }
        return A1C;
    }
}
