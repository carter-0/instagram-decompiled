package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class WWy implements C231292rN, C320536sX {
    public int A00;
    public C68583NOf A01;
    public C68584NOg A02;
    public boolean A03;
    public boolean A04;
    public Size A05;
    public final Activity A06;
    public final Context A07;
    public final AnonymousClass0iw A08;
    public final AnonymousClass2t9 A09;
    public final UserSession A0A;
    public final 2el A0B;
    public final C15343Uat A0C;
    public final C230242pG A0D;
    public final List A0E = new ArrayList();
    public final AnonymousClass0eM A0F;
    public final Map A0G = new LinkedHashMap();
    public final boolean A0H;

    /* JADX WARNING: type inference failed for: r0v17, types: [X.2tF, java.lang.Object] */
    public WWy(Activity activity, Context context, AnonymousClass0iw r22, UserSession userSession, 2el r24, C15343Uat uat, C230242pG r26, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        Context context2 = context;
        this.A07 = context2;
        this.A0A = userSession2;
        this.A06 = activity;
        this.A08 = r22;
        this.A0D = r26;
        this.A0C = uat;
        this.A0B = r24;
        this.A0H = 0qQ.A0K(userSession2.A06, str);
        Size A002 = C18533Vtl.A00.A00(context2);
        this.A05 = A002;
        this.A00 = A002.getHeight();
        int width = this.A05.getWidth();
        AnonymousClass0iw r4 = this.A08;
        C230242pG r8 = this.A0D;
        UserSession userSession3 = this.A0A;
        int i = this.A00;
        C15343Uat uat2 = this.A0C;
        this.A02 = new C68584NOg(r4, userSession3, this.A0B, uat2, r8, i, width);
        Activity activity2 = this.A06;
        this.A01 = new C68583NOf(activity2, r4, userSession3, uat2, r8, i, width);
        AnonymousClass2tC A003 = AnonymousClass2t9.A00(this.A07);
        A003.A01(this.A02);
        A003.A01(this.A01);
        A003.A01(new Object());
        this.A09 = DbU.A0U(A003, new C61628KFe(activity2, userSession3));
        this.A0F = AnonymousClass0eN.A01(new C51795G2e(this, 7));
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        Map map = this.A0G;
        Object obj = map.get(r3);
        if (obj == null) {
            obj = G9t.A18(r3);
            map.put(r3, obj);
        }
        return (AnonymousClass3W1) obj;
    }

    public final void A02() {
        AnonymousClass2t9 r2 = this.A09;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A01(this));
        r2.A05(viewModelListUpdate);
    }

    public final void Cs9(1Xj r2) {
        this.A09.notifyDataSetChanged();
    }

    public static final int A00(List list, int i) {
        Object A0O = 00k.A0O(list, i);
        if (A0O == null) {
            0wb.A03("highlights_in_grid_item_access_out_of_bounds", 002.A0n(C273654mx.A00(1400), ", but only ", C273654mx.A00(1028), i, list.size()));
            return 1;
        } else if ((A0O instanceof KGF) || (A0O instanceof C15801Uik)) {
            return 3;
        } else {
            if ((A0O instanceof C19269WSc) || (A0O instanceof C68599NOv)) {
                return 1;
            }
            throw new IllegalStateException(C273654mx.A00(62));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(X.WWy r3) {
        /*
            X.01N r2 = X.0jo.A1H()
            java.util.List r0 = r3.A0E
            r2.addAll(r0)
            boolean r1 = r3.A0H
            if (r1 == 0) goto L_0x0030
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0030
            X.KGF r0 = new X.KGF
            r0.<init>()
        L_0x001c:
            r2.add(r0)
        L_0x001f:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x002b
            X.Uik r0 = new X.Uik
            r0.<init>()
            r2.add(r0)
        L_0x002b:
            X.01N r0 = X.0jo.A1I(r2)
            return r0
        L_0x0030:
            if (r1 == 0) goto L_0x001f
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x001f
            X.NOv r0 = new X.NOv
            r0.<init>()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WWy.A01(X.WWy):java.util.List");
    }

    public final C296915qr B9q(int i) {
        return new C19295WTd(A00(A01(this), i));
    }
}
