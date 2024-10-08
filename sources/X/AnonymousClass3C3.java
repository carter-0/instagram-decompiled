package X;

import android.text.TextUtils;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3C3  reason: invalid class name */
public final class AnonymousClass3C3 implements C228812mN {
    public final UserSession A00;

    public AnonymousClass3C3(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ boolean ACJ(Object obj, Object obj2) {
        C239613Hd r3;
        String str;
        C250973mM r6 = (C250973mM) obj;
        C255773uh r7 = (C255773uh) obj2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        C239613Hd r4 = r6.A0H.A0X;
        Reel A0M = ReelStore.A03(this.A00).A0M(r7.A0j);
        if (A0M != null) {
            r3 = A0M.A0X;
        } else {
            r3 = null;
        }
        if (r4 == null || r3 == null || (str = r4.A02) == null || str.length() == 0 || !str.equals(r3.A02)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean ACN(Object obj, Object obj2) {
        String str;
        C250973mM r5 = (C250973mM) obj;
        C250973mM r6 = (C250973mM) obj2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        C239613Hd r1 = r5.A0H.A0X;
        C239613Hd r3 = r6.A0H.A0X;
        if (r1 == null || r3 == null || (str = r1.A02) == null || str.length() == 0 || !str.equals(r3.A02)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C271744jW AMS(Object obj) {
        String str;
        String str2;
        C250973mM r10 = (C250973mM) obj;
        0qQ.A0B(r10, 0);
        Reel reel = r10.A0H;
        AnonymousClass3IB r1 = reel.A0I;
        if (r1 != null) {
            str = r1.A04;
        } else {
            str = null;
        }
        if (reel.CcK()) {
            if (r1 == null) {
                UserSession userSession = this.A00;
                C255773uh A0A = reel.A0A(userSession, 0);
                0qQ.A07(A0A);
                String A0U = A0A.A0U(userSession);
                if (A0U != null) {
                    LinkedList linkedList = null;
                    if (C297785sK.A0U(reel)) {
                        linkedList = new LinkedList();
                        for (C255773uh A0U2 : reel.A0O(userSession)) {
                            String A0U3 = A0U2.A0U(userSession);
                            if (A0U3 != null) {
                                linkedList.add(new C271824je(reel, AnonymousClass05K.A0C, A0U3, (List) null));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    return new C271824je(reel, AnonymousClass05K.A0C, A0U, linkedList);
                }
                throw new IllegalStateException("Required value was null.");
            } else if (str != null) {
                return new C271824je(reel, AnonymousClass05K.A0C, str, (List) null);
            }
        }
        if (reel.A0m()) {
            String A0G = reel.A0G();
            0qQ.A07(A0G);
            return new C271824je(reel, AnonymousClass05K.A0N, A0G, (List) null);
        }
        String id = reel.getId();
        0qQ.A07(id);
        ReelType reelType = reel.A0P;
        if (reelType == null || (str2 = reelType.toString()) == null) {
            str2 = "";
        }
        throw new IllegalArgumentException(002.A14("Unsupported reel for injection, id = [", id, "], reelType = [", str2, "], mediaIds = [", TextUtils.join(", ", reel.A0K()), ']'));
    }

    public final /* bridge */ /* synthetic */ int AZD(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        C239613Hd r0 = r2.A0H.A0X;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AZx(Object obj) {
        C250973mM r4 = (C250973mM) obj;
        if (r4 == null) {
            return 0;
        }
        if (C297785sK.A0l(r4)) {
            return r4.A0H.A0O(this.A00).size();
        }
        if (!r4.A0H.CcK()) {
            return 0;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ String BEZ(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        String id = r2.A0H.getId();
        0qQ.A07(id);
        return id;
    }

    public final /* bridge */ /* synthetic */ String BEb(Object obj) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        String str = r2.A0k;
        0qQ.A07(str);
        return str;
    }

    public final /* bridge */ /* synthetic */ String BJS(Object obj) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        String str = r2.A0j;
        0qQ.A07(str);
        return str;
    }

    public final /* bridge */ /* synthetic */ List BUO(Object obj) {
        return new LinkedList();
    }

    public final /* bridge */ /* synthetic */ Integer BUT(Object obj) {
        IntentAwareAdsInfo intentAwareAdsInfo;
        String str;
        C250973mM r2 = (C250973mM) obj;
        if (r2 == null || (intentAwareAdsInfo = r2.A0H.A0B) == null || (str = intentAwareAdsInfo.A04) == null) {
            return null;
        }
        return C55033Hb4.A00(str);
    }

    public final /* bridge */ /* synthetic */ 1Pi BXm(Object obj) {
        Integer num;
        C250973mM r4 = (C250973mM) obj;
        0qQ.A0B(r4, 0);
        Reel reel = r4.A0H;
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo != null) {
            num = intentAwareAdsInfo.A02;
        } else {
            num = null;
        }
        Integer A002 = AnonymousClass4I5.A00(num);
        if (A002 != null && (A002 == AnonymousClass05K.A0u || A002 == AnonymousClass05K.A02)) {
            return 1Pi.A02;
        }
        if (reel.CcK() || reel.A0m()) {
            return 1Pi.A04;
        }
        return 1Pi.A03;
    }

    public final /* bridge */ /* synthetic */ boolean CVx(Object obj) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return r2.A1P();
    }

    public final /* bridge */ /* synthetic */ boolean CVy(Object obj) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return r2.CcK();
    }

    public final /* bridge */ /* synthetic */ boolean CXm(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        if (r2 != null) {
            return C297785sK.A0l(r2);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CYA(Object obj) {
        C250973mM r3 = (C250973mM) obj;
        if (r3 == null || !r3.A0H.A0m()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean CcL(Object obj) {
        C250973mM r3 = (C250973mM) obj;
        if (r3 == null || !r3.A0H.CcK()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean CcM(Object obj) {
        C250973mM r4 = (C250973mM) obj;
        if (r4 != null && r4.A0N && r4.A0H.A13(this.A00)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Integer Ahi(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Integer Ahl(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CVw(Object obj) {
        return false;
    }
}
