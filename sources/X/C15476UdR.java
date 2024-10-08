package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UdR  reason: case insensitive filesystem */
public final class C15476UdR extends 2Ru {
    public final WZL A00;
    public final HashMap A01 = new HashMap();
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C15562Ueq A05;
    public final AnonymousClass726 A06;
    public final AnonymousClass728 A07;
    public final C232542tt A08;
    public final C20962X6p A09;
    public final AnonymousClass71T A0A;
    public final AnonymousClass32Q A0B;
    public final C229122ms A0C;
    public final C231762sK A0D;

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.3Bf] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15476UdR(Context context, AnonymousClass0iw r23, UserSession userSession, AnonymousClass726 r25, AnonymousClass728 r26, WZL wzl, C20962X6p x6p, AnonymousClass32Q r29, C229122ms r30) {
        super(false);
        UserSession userSession2 = userSession;
        AnonymousClass32Q r2 = r29;
        AnonymousClass7TG.A1Q(userSession2, r2);
        AnonymousClass726 r7 = r25;
        AnonymousClass728 r6 = r26;
        AnonymousClass7TF.A1F(r7, 7, r6);
        Context context2 = context;
        this.A02 = context2;
        this.A04 = userSession2;
        this.A0B = r2;
        AnonymousClass0iw r11 = r23;
        this.A03 = r11;
        this.A0C = r30;
        this.A00 = wzl;
        this.A06 = r7;
        this.A07 = r6;
        C20962X6p x6p2 = x6p;
        this.A09 = x6p2;
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36327237116508400L);
        C15562Ueq ueq = new C15562Ueq(r11, userSession2, (C267644bx) null, (AnonymousClass32J) null, x6p2, r2, (String) null, (String) null, true, A062);
        this.A05 = ueq;
        AnonymousClass71T r9 = new AnonymousClass71T(context2);
        this.A0A = r9;
        C231762sK r1 = new C231762sK(context2, (AnonymousClass57M) null);
        this.A0D = r1;
        C232542tt r22 = new C232542tt(context2, userSession2);
        this.A08 = r22;
        ueq.A00 = 1.0f;
        ueq.A04 = false;
        ueq.A01 = r7;
        ueq.A02 = r6;
        init(new C231642s0[]{ueq, r9, r1, r22});
        C238263Be r12 = new C238263Be(AnonymousClass05K.A0j);
        ? obj = new Object();
        obj.A00 = true;
        addModel(r12, obj, r22);
    }

    public final ImmutableList A00() {
        Boolean bool;
        WZL wzl = this.A00;
        C15953UlV ulV = wzl.A04;
        ulV.A08(wzl.A03);
        List list = ulV.A01;
        ArrayList<C17884Vhb> arrayList = new ArrayList<>();
        for (Object next : list) {
            C17884Vhb vhb = (C17884Vhb) next;
            if (vhb.A04) {
                Reel reel = vhb.A03;
                if (reel != null) {
                    bool = Boolean.valueOf(reel.A1M);
                } else {
                    bool = null;
                }
                if (!0qQ.A0K(bool, this.A01.get(vhb.A00()))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        for (C17884Vhb A002 : arrayList) {
            A0r.add(A002.A00());
        }
        return DbU.A0K(A0r);
    }

    public final void A01(boolean z) {
        clear();
        WZL wzl = this.A00;
        C15953UlV ulV = wzl.A04;
        ulV.A08(wzl.A03);
        int A022 = ulV.A02();
        for (int i = 0; i < A022; i++) {
            C3251571g A0e = C13989Tnp.A0e(ulV, i);
            AnonymousClass6u8 r4 = new AnonymousClass6u8();
            boolean z2 = true;
            if (this.A0C.CKB() || i != ulV.A02() - 1) {
                z2 = false;
            }
            r4.A00(i, z2);
            Iterator it = A0e.iterator();
            while (it.hasNext()) {
                C17884Vhb vhb = (C17884Vhb) it.next();
                if (vhb.A04) {
                    HashMap hashMap = this.A01;
                    if (!hashMap.containsKey(vhb.A00())) {
                        String A002 = vhb.A00();
                        Reel reel = vhb.A03;
                        boolean z3 = false;
                        if ((reel != null && reel.A1M) || z) {
                            z3 = true;
                        }
                        DbU.A1Y(A002, hashMap, z3);
                    }
                    vhb.A00 = AnonymousClass7TF.A1Y(hashMap.get(vhb.A00()), true);
                }
            }
            addModel(A0e, r4, this.A05);
        }
        addModel(this.A0C, (Object) null, this.A0D);
        notifyDataSetChangedSmart();
    }
}
