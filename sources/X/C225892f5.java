package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2f5  reason: invalid class name and case insensitive filesystem */
public final class C225892f5 extends 0px {
    public Map A00 = new C225922f8(this);
    public 1NH A01;
    public final UserSession A02;

    public static C225892f5 A00(UserSession userSession) {
        Class<C225892f5> cls = C225892f5.class;
        0rJ A002 = 0rL.A00(userSession);
        C225892f5 r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        C225892f5 r12 = new C225892f5(new 1NH(C60960kU.A00, new C225902f6(), 257799610), userSession);
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        String str;
        int i;
        C45414Cvu cvu = (C45414Cvu) obj;
        1NY r4 = new 1NY(this.A02);
        r4.A08(AnonymousClass05K.A01);
        Integer num = cvu.A01;
        if (num == null) {
            num = AnonymousClass05K.A00;
        }
        String str2 = cvu.A04;
        String str3 = cvu.A03;
        0qQ.A0B(str2, 0);
        0qQ.A0B(str3, 1);
        switch (num.intValue()) {
            case 1:
                i = 3905;
                break;
            case 2:
                str = "save/location/%s/%s/";
                break;
            case 3:
                str = "creatives/effect/%s/%s/";
                break;
            default:
                i = 695;
                break;
        }
        str = AnonymousClass000.A00(i);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, str2, str3);
        0qQ.A07(formatStrLocaleSafe);
        r4.A0A(formatStrLocaleSafe);
        r4.A0R(1XP.class, 1XY.class);
        String str4 = cvu.A02;
        if (str4 != null) {
            r4.A9m("radio_type", str4);
        }
        HashMap hashMap = cvu.A05;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                r4.A9m((String) entry.getKey(), (String) entry.getValue());
            }
        }
        r4.A0R = true;
        return r4.A0M();
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C45414Cvu> list;
        1NH r6 = this.A01;
        String str = this.A02.A06;
        C253743rL r0 = (C253743rL) r6.A02(002.A0R("pending_saves_", str), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C45414Cvu cvu : list) {
                hashMap.put(cvu.A04, cvu);
            }
            A0E(hashMap);
            A08();
            hashMap.size();
        }
        r6.A04(002.A0R("pending_saves_", str));
    }

    public final void A0J() {
        this.A01.A04(002.A0R("pending_saves_", this.A02.A06));
    }

    public final C243373Ym A0L(C243373Ym r4, AnonymousClass1Xo r5) {
        if (this.A00 == null) {
            A07();
        }
        if (A0F(r5.BpP())) {
            C45414Cvu cvu = (C45414Cvu) A03(r5.BpP());
            cvu.getClass();
            String str = cvu.A03;
            C243373Ym r0 = C243373Ym.SAVED;
            if (!str.equals(r0.toString())) {
                return C243373Ym.NOT_SAVED;
            }
            return r0;
        }
        C243373Ym r02 = (C243373Ym) this.A00.get(r5.BpP());
        if (r02 != null) {
            return r02;
        }
        return r4;
    }

    public final void A0N(C45414Cvu cvu, boolean z) {
        if (cvu == A03(cvu.A04)) {
            A0B(cvu.A04);
            if (z) {
                Map map = this.A00;
                String str = cvu.A04;
                String str2 = cvu.A03;
                C243373Ym r1 = C243373Ym.SAVED;
                if (!str2.equals(r1.toString())) {
                    r1 = C243373Ym.NOT_SAVED;
                }
                map.put(str, r1);
            }
        }
    }

    public C225892f5(1NH r2, UserSession userSession) {
        super(userSession);
        this.A01 = r2;
        this.A02 = userSession;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3rL] */
    public final void A0K() {
        A02();
        ? obj = new Object();
        obj.A00 = A05();
        this.A01.A06(002.A0R("pending_saves_", this.A02.A06), obj);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cvu, java.lang.Object] */
    public final C45414Cvu A0M(C243373Ym r7, AnonymousClass1Xo r8, Map map) {
        String obj = r7.toString();
        r8.BpP();
        String BpP = r8.BpP();
        Integer BpT = r8.BpT();
        ? obj2 = new Object();
        obj2.A00 = RealtimeSinceBootClock.A00.now();
        obj2.A04 = BpP;
        obj2.A03 = obj;
        obj2.A01 = BpT;
        obj2.A05 = (HashMap) map;
        A0D(r8.BpP(), obj2);
        return obj2;
    }

    public final boolean A0O(AnonymousClass1Xo r4) {
        if (A0L(r4.BpO(), r4) == C243373Ym.SAVED) {
            return true;
        }
        return false;
    }
}
