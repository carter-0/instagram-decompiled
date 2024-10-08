package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.WWx  reason: case insensitive filesystem */
public final class C19381WWx implements C231292rN, C320536sX {
    public C68584NOg A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final AnonymousClass2t9 A05;
    public final UserSession A06;
    public final 2el A07;
    public final C74357PtX A08;
    public final C230242pG A09;
    public final List A0A = new ArrayList();
    public final AnonymousClass0eM A0B;
    public final Size A0C;
    public final Map A0D = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r0v8, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    public C19381WWx(Context context, AnonymousClass0iw r10, UserSession userSession, 2el r12, C74357PtX ptX, C230242pG r14) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A06 = userSession;
        this.A04 = r10;
        this.A09 = r14;
        this.A08 = ptX;
        this.A07 = r12;
        Size A002 = C18533Vtl.A00.A00(context);
        this.A0C = A002;
        this.A02 = A002.getHeight();
        int width = A002.getWidth();
        AnonymousClass0iw r1 = this.A04;
        C230242pG r5 = this.A09;
        UserSession userSession2 = this.A06;
        int i = this.A02;
        this.A00 = new C68584NOg(r1, userSession2, this.A07, this.A08, r5, i, width);
        AnonymousClass2tC A003 = AnonymousClass2t9.A00(this.A03);
        A003.A01(this.A00);
        A003.A01(new Object());
        A003.A01(new Object());
        this.A05 = DbU.A0U(A003, new Object());
        this.A0B = AnonymousClass0eN.A01(new MMI(this, 44));
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        Map map = this.A0D;
        Object obj = map.get(r3);
        if (obj == null) {
            obj = G9t.A18(r3);
            map.put(r3, obj);
        }
        return (AnonymousClass3W1) obj;
    }

    public final void Cs9(1Xj r1) {
    }

    public final void A02() {
        AnonymousClass2t9 r2 = this.A05;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A01(this));
        r2.A05(viewModelListUpdate);
        r2.notifyDataSetChanged();
    }

    public static final int A00(List list, int i) {
        Object A0O = 00k.A0O(list, i);
        if (A0O == null) {
            return 1;
        }
        if ((A0O instanceof C15800Uij) || (A0O instanceof C68595NOr) || (A0O instanceof C15801Uik)) {
            return 3;
        }
        if (A0O instanceof C19269WSc) {
            return 1;
        }
        throw new IllegalStateException(C273654mx.A00(62));
    }

    public static final List A01(C19381WWx wWx) {
        Object obj;
        01N A1H = 0jo.A1H();
        List list = wWx.A0A;
        if (AnonymousClass7TE.A1b(list)) {
            A1H.add(new Object());
        }
        A1H.addAll(list);
        if (!list.isEmpty() || wWx.A01) {
            if (wWx.A01) {
                obj = new Object();
            }
            return 0jo.A1I(A1H);
        }
        obj = new Object();
        A1H.add(obj);
        return 0jo.A1I(A1H);
    }

    public final C296915qr B9q(int i) {
        return new C19295WTd(A00(A01(this), i));
    }
}
