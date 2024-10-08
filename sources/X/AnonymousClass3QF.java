package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3QF  reason: invalid class name */
public final class AnonymousClass3QF {
    public int A00;
    public int A01;
    public int A02 = 1;
    public int A03;
    public long A04;
    public long A05;
    public Integer A06;
    public String A07 = "";
    public String A08 = "empty";
    public String A09 = "empty";
    public Map A0A = new ConcurrentHashMap();
    public Map A0B = new ConcurrentHashMap();
    public Set A0C = new CopyOnWriteArraySet();
    public Set A0D = new CopyOnWriteArraySet();
    public Set A0E = new CopyOnWriteArraySet();
    public Set A0F = new LinkedHashSet();
    public boolean A0G;

    public final synchronized int A00() {
        return this.A00;
    }

    public final synchronized int A01(ShareType shareType) {
        int i;
        0qQ.A0B(shareType, 0);
        int i2 = this.A02;
        this.A00 = i2;
        this.A0B.put(String.valueOf(i2), shareType);
        i = this.A02;
        this.A02 = i + 1;
        return i;
    }

    public final synchronized Boolean A02(int i, String str) {
        Boolean bool;
        Set set;
        0qQ.A0B(str, 0);
        AnonymousClass9IE r0 = (AnonymousClass9IE) this.A0A.get(str);
        if (r0 == null || (set = (Set) r0.A00) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(set.contains(Integer.valueOf(i)));
        }
        return bool;
    }

    public final synchronized List A03() {
        01N A1H;
        A1H = 0jo.A1H();
        A1H.addAll(this.A0D);
        A1H.removeAll(this.A0E);
        A1H.removeAll(this.A0C);
        return 0jo.A1I(A1H);
    }

    public final synchronized boolean A04() {
        return !this.A0D.isEmpty();
    }
}
