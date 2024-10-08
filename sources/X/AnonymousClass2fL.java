package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2fL  reason: invalid class name */
public final class AnonymousClass2fL extends 0px {
    public int A00 = 0;
    public AnonymousClass2fN A01;
    public final Map A02 = new ConcurrentHashMap();
    public final Set A03 = new HashSet();
    public final 1NH A04;

    public static synchronized AnonymousClass2fL A00(UserSession userSession) {
        AnonymousClass2fL r1;
        Class<AnonymousClass2fL> cls = AnonymousClass2fL.class;
        synchronized (cls) {
            0rJ A002 = 0rL.A00(userSession);
            r1 = (0px) A002.A04.get(cls);
            if (r1 == null) {
                r1 = new AnonymousClass2fL(new 1NH(C60960kU.A00, new AnonymousClass2fM(), 1000143069), userSession);
                A002.A03(r1, cls);
            }
        }
        return r1;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        return ((AnonymousClass2fN) obj).A01(this.A02);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A0C;
    }

    public final void A0I() {
        HashMap hashMap;
        1NH r6 = this.A04;
        String str = this.A02.A06;
        AnonymousClass47H r0 = (AnonymousClass47H) r6.A01(002.A0R("pending_clips_seen_states_", str), 1000, true);
        if (!(r0 == null || (hashMap = r0.A00) == null)) {
            for (Map.Entry entry : hashMap.entrySet()) {
                AnonymousClass2fN r2 = this.A01;
                r2.A02.addAll(((AnonymousClass2fN) entry.getValue()).A02);
                AnonymousClass2fN r22 = this.A01;
                r22.A01.putAll(((AnonymousClass2fN) entry.getValue()).A01);
            }
        }
        r6.A04(002.A0R("pending_clips_seen_states_", str));
    }

    public final void A0J() {
        this.A04.A04(002.A0R("pending_clips_seen_states_", this.A02.A06));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.47H, java.lang.Object] */
    public final void A0K() {
        ? obj = new Object();
        obj.A00 = A06();
        AnonymousClass2fN r2 = new AnonymousClass2fN();
        r2.A02.addAll(A0L());
        r2.A01.putAll(A0M());
        obj.A00.put("cache", r2);
        this.A00 = r2.A00();
        this.A04.A05(002.A0R("pending_clips_seen_states_", this.A02.A06), obj);
    }

    public final ArrayList A0L() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2fN r0 : this.A02.values()) {
            arrayList.addAll(r0.A02);
        }
        arrayList.addAll(this.A01.A02);
        return arrayList;
    }

    public final HashMap A0M() {
        HashMap hashMap = new HashMap();
        for (AnonymousClass2fN r0 : this.A02.values()) {
            hashMap.putAll(r0.A01);
        }
        hashMap.putAll(this.A01.A01);
        return hashMap;
    }

    public final void A0N() {
        AnonymousClass2fN r0 = this.A01;
        UserSession userSession = this.A02;
        1OC A012 = r0.A01(userSession);
        if (this.A01.A00() != 0) {
            AnonymousClass2fN r2 = this.A01;
            String str = r2.A00;
            A012.A00 = new AnonymousClass9O6(this, str);
            this.A02.put(str, r2);
            this.A01 = new AnonymousClass2fN();
            0rL.A00(userSession).A02(A012);
        }
    }

    public final void A0O(String str, String str2) {
        boolean contains = this.A03.contains(str);
        boolean contains2 = A0L().contains(str);
        if (!contains && !contains2) {
            AnonymousClass2fN r1 = this.A01;
            if (str2 != null) {
                HashSet hashSet = new HashSet();
                if (r1.A01.containsKey(str2)) {
                    hashSet.addAll(Arrays.asList(((String) r1.A01.get(str2)).split(",")));
                }
                hashSet.add(str);
                r1.A01.put(str2, C2612548w.A00(",", hashSet));
            } else {
                r1.A02.add(str);
            }
            if (((long) this.A01.A00()) >= 182.A01(0Tu.A05, this.A02, 36612118002276657L)) {
                A0N();
            }
        }
        if (this.A00 != A0L().size()) {
            A0K();
        }
    }

    public AnonymousClass2fL(1NH r2, UserSession userSession) {
        super(userSession);
        this.A04 = r2;
        this.A01 = new AnonymousClass2fN();
    }

    public final boolean A0P(String str) {
        if (A0L().contains(str) || this.A03.contains(str)) {
            return true;
        }
        return false;
    }
}
