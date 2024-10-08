package androidx.paging;

import X.002;
import X.00k;
import X.0qQ;
import X.0rw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C60332Jjb;
import X.C62448Kfy;
import X.C62942Kou;
import X.C62955Kp7;
import X.DbT;
import X.DbW;
import X.JTT;
import X.LP3;
import X.LRX;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

public final class PageEvent$Insert extends C62942Kou {
    public static final PageEvent$Insert A06;
    public final int A00;
    public final int A01;
    public final LP3 A02;
    public final LP3 A03;
    public final C62448Kfy A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$Insert) {
                PageEvent$Insert pageEvent$Insert = (PageEvent$Insert) obj;
                if (this.A04 != pageEvent$Insert.A04 || !0qQ.A0K(this.A05, pageEvent$Insert.A05) || this.A01 != pageEvent$Insert.A01 || this.A00 != pageEvent$Insert.A00 || !0qQ.A0K(this.A03, pageEvent$Insert.A03) || !0qQ.A0K(this.A02, pageEvent$Insert.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        List A1I = AnonymousClass7TE.A1I(LRX.A04);
        C60332Jjb jjb = C60332Jjb.A01;
        C60332Jjb jjb2 = C60332Jjb.A00;
        A06 = C62955Kp7.A00(new LP3(jjb, jjb2, jjb2), (LP3) null, A1I, 0, 0);
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return AnonymousClass7TF.A07(this.A03, (((AnonymousClass7TF.A07(this.A05, A0K) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A02);
    }

    public final String toString() {
        String str;
        Object obj;
        List<LRX> list = this.A05;
        int i = 0;
        for (LRX lrx : list) {
            i = DbT.A01(lrx.A01, i);
        }
        int i2 = this.A01;
        String str2 = NetInfoModule.CONNECTION_TYPE_NONE;
        if (i2 != -1) {
            str = String.valueOf(i2);
        } else {
            str = str2;
        }
        int i3 = this.A00;
        if (i3 != -1) {
            str2 = String.valueOf(i3);
        }
        LP3 lp3 = this.A02;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PageEvent.Insert for ");
        A1A.append(this.A04);
        A1A.append(", with ");
        A1A.append(i);
        A1A.append(" items (\n                    |   first item: ");
        LRX lrx2 = (LRX) 00k.A0J(list);
        Object obj2 = null;
        if (lrx2 != null) {
            obj = 00k.A0J(lrx2.A01);
        } else {
            obj = null;
        }
        A1A.append(obj);
        A1A.append("\n                    |   last item: ");
        LRX lrx3 = (LRX) 00k.A0L(list);
        if (lrx3 != null) {
            obj2 = 00k.A0L(lrx3.A01);
        }
        A1A.append(obj2);
        A1A.append("\n                    |   placeholdersBefore: ");
        A1A.append(str);
        A1A.append("\n                    |   placeholdersAfter: ");
        A1A.append(str2);
        A1A.append("\n                    |   sourceLoadStates: ");
        A1A.append(this.A03);
        return 0rw.A0u(002.A0R(JTT.A0o(lp3, "\n                    ", A1A), "|)"), "|");
    }

    public PageEvent$Insert(LP3 lp3, LP3 lp32, C62448Kfy kfy, List list, int i, int i2) {
        this.A04 = kfy;
        this.A05 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = lp3;
        this.A02 = lp32;
        if (kfy != C62448Kfy.APPEND && i < 0) {
            throw DbW.A0a("Prepend insert defining placeholdersBefore must be > 0, but was ", i);
        } else if (kfy != C62448Kfy.PREPEND && i2 < 0) {
            throw DbW.A0a("Append insert defining placeholdersAfter must be > 0, but was ", i2);
        } else if (kfy == C62448Kfy.REFRESH && !AnonymousClass7TE.A1b(list)) {
            throw AnonymousClass7TE.A0w("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }
}
