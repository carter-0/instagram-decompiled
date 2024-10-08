package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.71Z  reason: invalid class name */
public final class AnonymousClass71Z {
    public final Context A00;
    public final AnonymousClass2s2 A01;
    public final UserSession A02;
    public final C3250971a A03;
    public final C267614bu A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final AnonymousClass71Y A08;
    public final C267614bu A09;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2s2, java.lang.Object] */
    public AnonymousClass71Z(Context context, AnonymousClass0iw r6, UserSession userSession, AnonymousClass71Y r8, C267614bu r9) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = r9;
        this.A03 = new C3250971a(context, userSession, r9, 2Yu.A0H(context, R.attr.actionBarBackgroundColor));
        ? obj = new Object();
        obj.A00 = 2Yu.A0H(context, R.attr.actionBarBackgroundColor);
        obj.A04 = false;
        obj.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A01 = obj;
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = r6;
        this.A08 = r8;
        this.A09 = r9;
    }

    public final void A01(C3253572b r3) {
        r3.A02 = 0;
        r3.A0M = true;
        r3.A0N = true;
        r3.A0O = true;
        Context context = this.A05;
        r3.A03 = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        r3.A00 = 2Yu.A0F(context, R.attr.igds_color_primary_background);
    }

    public final C66954Mfn A00(2ZX r7) {
        ArrayList A002 = C52440GSs.A00(r7, this.A07, this.A09);
        String string = this.A05.getString(2131952170);
        0qQ.A07(string);
        return new C66954Mfn(this.A06, string, A002, true, false);
    }

    public final boolean A02(2ZX r6) {
        Integer B6v;
        Integer BPt;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A07;
        User A012 = r0.A01(userSession);
        User E55 = this.A08.E55();
        if (E55 == null || !2R8.A04(userSession, E55) || (B6v = A012.A03.B6v()) == null || B6v.intValue() > 3500 || (BPt = A012.A03.BPt()) == null || BPt.intValue() > 6) {
            return false;
        }
        C267614bu r02 = this.A09;
        Context context = this.A05;
        Iterator it = C52440GSs.A00(r6, userSession, r02).iterator();
        while (it.hasNext()) {
            C74507Pw2 pw2 = (C74507Pw2) it.next();
            if (!pw2.CQM(userSession, (User) null) && pw2.Esw(context, userSession)) {
                return true;
            }
        }
        return false;
    }
}
