package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ml  reason: invalid class name and case insensitive filesystem */
public final class C377599Ml extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377599Ml(String str, Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass3QS r1;
        AnonymousClass51I A002;
        if (this.A00 != 0) {
            C370018vh r9 = (C370018vh) obj;
            List<C2802350v> list = (List) obj2;
            0qQ.A0B(r9, 0);
            0qQ.A0B(list, 1);
            UserSession userSession = (UserSession) this.A01;
            String str = this.A02;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(str, 1);
            AnonymousClass5JS r3 = new AnonymousClass5JS(userSession.A06, str);
            AnonymousClass454 A003 = AnonymousClass454.A00(userSession.A03.A06());
            0qQ.A07(A003);
            HashSet hashSet = new HashSet();
            for (C2802350v r12 : list) {
                if (r12 != null) {
                    HashSet hashSet2 = new HashSet();
                    if (r12 instanceof C19473WaL) {
                        hashSet2.add(((C19473WaL) r12).A05);
                    } else if (r12 instanceof C387329m2) {
                        for (C317966o8 A03 : ((C387329m2) r12).A00().A0O) {
                            ImmutableList A032 = A03.A03();
                            if (A032 != null && !A032.isEmpty()) {
                                hashSet2.addAll(A032);
                            }
                        }
                    }
                    hashSet.addAll(hashSet2);
                }
            }
            C366688pV r0 = r9.A01;
            if (!(r0 == null || (r1 = r0.A07) == null || (A002 = r1.A00(AnonymousClass51J.AUDIO_TRACK)) == null)) {
                hashSet.add(A002.A05);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                A003.A02(r3, (String) it.next());
            }
        } else {
            String str2 = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            0qQ.A0B(str2, 0);
            ((C299665vd) this.A01).DRC(str2, booleanValue, this.A02);
        }
        return C60340gF.A00;
    }
}
