package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7vi  reason: invalid class name and case insensitive filesystem */
public final class C346767vi extends 2Ru implements AnonymousClass71P {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final UserSession A02;
    public final C357638Yz A03;
    public final C346787vk A04;
    public final C346777vj A05;
    public final C346797vl A06;
    public final C346597vR A07;
    public final Map A08 = new HashMap();

    public C346767vi(Context context, UserSession userSession, C357638Yz r7, C346597vR r8) {
        super(false);
        this.A01 = context;
        this.A02 = userSession;
        this.A07 = r8;
        this.A03 = r7;
        C346777vj r2 = new C346777vj(userSession, r7, r8, true);
        this.A05 = r2;
        C346787vk r1 = new C346787vk(userSession, r7, r8);
        this.A04 = r1;
        C346797vl r0 = new C346797vl(userSession, r8, true);
        this.A06 = r0;
        init(new C231642s0[]{r2, r1, r0});
    }

    public static final void A00(C231632rz r6, C346767vi r7, List list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * i2;
            C3251571g r3 = new C3251571g(list, i4, i2);
            AnonymousClass6u8 BQA = r7.BQA(String.valueOf(r3.hashCode()));
            boolean z = false;
            if (i3 == i - 1) {
                z = true;
            }
            BQA.A00(i3, z);
            BQA.A01 = i4;
            r7.addModel(r3, BQA, r6);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.9op, java.lang.Object, X.6u8] */
    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A08;
        AnonymousClass6u8 r1 = (AnonymousClass6u8) map.get(str);
        if (r1 != null) {
            return r1;
        }
        ? r12 = new AnonymousClass6u8();
        r12.A01 = true;
        r12.A00 = false;
        map.put(str, r12);
        return r12;
    }
}
