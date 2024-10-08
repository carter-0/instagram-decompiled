package X;

import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5xS  reason: invalid class name and case insensitive filesystem */
public class C300585xS extends 1XP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = -1;
    public int A09 = 0;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H = 0;
    public int A0I = 0;
    public int A0J;
    public int A0K;
    public long A0L;
    public AnonymousClass9IE A0M;
    public AnonymousClass9IM A0N;
    public AnonymousClass9IV A0O;
    public AnonymousClass9IV A0P;
    public AnonymousClass9IV A0Q;
    public C376579In A0R;
    public AnonymousClass9J6 A0S;
    public C61078JwG A0T;
    public C61081JwJ A0U;
    public N49 A0V;
    public C59832Ja7 A0W;
    public C370688wu A0X;
    public C45275Cte A0Y;
    public C242373Tu A0Z;
    public C300625xW A0a;
    public C242243Te A0b;
    public C280014zr A0c;
    public C242263Tg A0d;
    public DirectThreadThemeInfo A0e;
    public C370838x9 A0f;
    public A5N A0g;
    public AnonymousClass4jH A0h;
    public AnonymousClass914 A0i;
    public ChannelsContextLine A0j;
    public CreatorBroadcastThreadInfo A0k;
    public CreatorSubscriberThreadInfo A0l;
    public C272964li A0m;
    public DiscoverableThreadInfo A0n;
    public 2EN A0o = 2EN.A05;
    public N2U A0p;
    public SmartSuggestion A0q;
    public User A0r;
    public Boolean A0s;
    public Boolean A0t;
    public Boolean A0u;
    public Boolean A0v;
    public Boolean A0w;
    public Boolean A0x;
    public Boolean A0y;
    public Boolean A0z;
    public Boolean A10;
    public Boolean A11;
    public Boolean A12;
    public Boolean A13;
    public Boolean A14;
    public Boolean A15;
    public Boolean A16;
    public Boolean A17;
    public Long A18;
    public Long A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public HashMap A1P;
    public HashMap A1Q;
    public HashMap A1R = new HashMap();
    public List A1S = Collections.emptyList();
    public List A1T;
    public List A1U;
    public List A1V;
    public List A1W = new ArrayList();
    public List A1X = Collections.emptyList();
    public List A1Y = Collections.emptyList();
    public List A1Z;
    public List A1a;
    public List A1b;
    public List A1c = Collections.emptyList();
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if ((r0.A01 & 4) != 4) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long A00() {
        /*
            r5 = this;
            X.3Tu r0 = r5.A0Z
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A01
            r1 = 4
            r0 = r0 & 4
            r3 = 1
            if (r0 == r1) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r5.A0y
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002c
            if (r3 != 0) goto L_0x002c
            boolean r0 = r5.A1d
            if (r0 == 0) goto L_0x0029
            java.lang.Boolean r0 = r5.A14
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002f
        L_0x0029:
            java.lang.Long r0 = X.2Eq.A00
        L_0x002b:
            return r0
        L_0x002c:
            java.lang.Long r0 = r5.A18
            goto L_0x0057
        L_0x002f:
            int r0 = r5.A0I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x0029
            java.util.List r0 = r5.A1c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            if (r0 != r4) goto L_0x0029
            java.util.List r0 = r5.A1c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = r0.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Long r0 = r0.BST()
        L_0x0057:
            if (r0 != 0) goto L_0x002b
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300585xS.A00():java.lang.Long");
    }

    public final void A01() {
        2EN r1;
        2EN r0;
        DirectThreadThemeInfo directThreadThemeInfo;
        HashMap hashMap = this.A1R;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
        }
        C370688wu r12 = this.A0X;
        if (!(r12 == null || (directThreadThemeInfo = this.A0e) == null || !directThreadThemeInfo.A0u)) {
            this.A0e = C370718wx.A00(r12);
        }
        if (this.A0e == null) {
            this.A0e = AnonymousClass6BI.A0D;
        }
        Boolean bool = this.A11;
        if (bool == null || !bool.booleanValue()) {
            Boolean bool2 = this.A10;
            if (bool2 != null && bool2.booleanValue()) {
                r1 = this.A0o;
                r0 = 2EN.A06;
            } else {
                return;
            }
        } else {
            r1 = this.A0o;
            r0 = 2EN.A07;
        }
        if (r1 != r0) {
            this.A0o = r0;
        }
    }
}
