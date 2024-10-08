package X;

import com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3zc  reason: invalid class name and case insensitive filesystem */
public final class C258773zc {
    public final AnonymousClass0JP A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377179Kv(this, 35));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377179Kv(this, 36));

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.3zt] */
    public final AnonymousClass407 A00(C258833zi r13, C258743zZ r14, List list) {
        C258743zZ r10 = r14;
        0qQ.A0B(r14, 0);
        C258833zi r9 = r13;
        0qQ.A0B(r13, 1);
        0qQ.A0B(list, 2);
        AnonymousClass403 r7 = new AnonymousClass403(this.A00, ((IgRoomExampleDatabase) this.A02.getValue()).A00(), r14);
        02m r1 = 02m.A0p;
        0qQ.A07(r1);
        C258993zy r8 = new C258993zy(r1, r14.Bis());
        0t0 A012 = AnonymousClass0eN.A01(AnonymousClass405.A00);
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(list);
        if (r14.CCa()) {
            arrayList.add(new C258933zs((C258913zq) this.A03.getValue(), r14.CCP()));
        }
        C259003zz r5 = new C259003zz((C258993zy) null, 002.A0R(r14.CCP(), "_source"), arrayList);
        Object value = A012.getValue();
        0qQ.A07(value);
        return new AnonymousClass407(r5, obj, r7, r8, r9, r10, (C258483z9) value);
    }

    public C258773zc(UserSession userSession) {
        this.A01 = userSession;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A00 = r0;
    }
}
