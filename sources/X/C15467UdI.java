package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UdI  reason: case insensitive filesystem */
public final class C15467UdI extends C331047Ph implements C2366034j {
    public int A00;
    public AnonymousClass71T A01;
    public final UYI A02 = new AnonymousClass2rW();
    public final C15494Udj A03;
    public final C15493Udi A04;
    public final AnonymousClass2s2 A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public final Object Bkf(int i) {
        return null;
    }

    public final int CMH(Reel reel, C255773uh r3) {
        return 0;
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
    }

    public final int CMG(Reel reel) {
        C270194gL r2 = reel.A0H;
        if (r2 == null) {
            return -1;
        }
        Map map = this.A07;
        String str = r2.A0X;
        str.getClass();
        if (!map.containsKey(str)) {
            return -1;
        }
        String str2 = r2.A0X;
        str2.getClass();
        return Pxg.A06(str2, map);
    }

    public final boolean isEmpty() {
        return !AnonymousClass7TE.A1b(this.A02.A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.UYI, X.2rW] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.2s0, java.lang.Object, X.Udi] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s0, java.lang.Object, X.Udj] */
    public C15467UdI(Context context, C15384Ubj ubj, AnonymousClass0iw r7) {
        ? obj = new Object();
        this.A05 = obj;
        ? obj2 = new Object();
        obj2.A01 = context;
        obj2.A00 = 3;
        obj2.A02 = ubj;
        obj2.A03 = r7;
        this.A04 = obj2;
        ? obj3 = new Object();
        this.A03 = obj3;
        AnonymousClass71T r0 = new AnonymousClass71T(context);
        this.A01 = r0;
        A0B(obj, obj2, obj3, r0);
    }
}
