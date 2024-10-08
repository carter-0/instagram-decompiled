package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UdJ  reason: case insensitive filesystem */
public final class C15468UdJ extends C331047Ph implements C2366034j, AnonymousClass71P {
    public final C15572Uf0 A00;
    public final C229122ms A01;
    public final C231762sK A02;
    public final UlU A03 = new AnonymousClass2rW();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.UlU, X.2rW] */
    public C15468UdJ(Context context, X6E x6e, AnonymousClass0iw r15, UserSession userSession, C229122ms r17) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        C15572Uf0 uf0 = new C15572Uf0(context, (X3C) null, x6e, r15, userSession2, false, false, false, false);
        this.A00 = uf0;
        C231762sK r1 = new C231762sK(context);
        this.A02 = r1;
        this.A01 = r17;
        A0B(uf0, r1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A04;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        C15976Uls uls = new C15976Uls(this);
        map.put(str, uls);
        return uls;
    }

    public final int CMG(Reel reel) {
        0qQ.A0B(reel, 0);
        Map map = this.A05;
        if (!map.containsKey(reel.getId())) {
            return -1;
        }
        Object obj = map.get(reel.getId());
        0qQ.A0A(obj);
        return AnonymousClass7TE.A0M(obj);
    }

    public final int CMH(Reel reel, C255773uh r3) {
        0qQ.A0B(reel, 0);
        return CMG(reel);
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
    }

    public final Object Bkf(int i) {
        return getItem(i);
    }
}
