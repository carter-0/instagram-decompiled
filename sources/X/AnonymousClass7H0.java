package X;

import android.app.Activity;
import android.widget.Filter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7H0  reason: invalid class name */
public final class AnonymousClass7H0 extends AnonymousClass7H1 {
    public int A00;
    public C329757Kc A01;
    public 2Er A02;
    public C68136N2a A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public Filter A09;
    public final UserSession A0A;
    public final C328887Gq A0B;
    public final AnonymousClass7H3 A0C;
    public final AnonymousClass7H2 A0D;
    public final AnonymousClass7H4 A0E;
    public final List A0F = new ArrayList();
    public final C62320sa A0G;

    public static final void A00(AnonymousClass7H0 r5) {
        r5.A0E.A00(r5.A01, r5.A02, r5.A0F, r5.A05, r5.A06);
    }

    public final C3260875i A0D(AnonymousClass7JY r5) {
        C3260875i r2;
        AnonymousClass78R r1;
        Iterator it = this.A0E.A00.iterator();
        0qQ.A07(it);
        while (true) {
            r2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            0qQ.A07(next);
            AnonymousClass78N r12 = (AnonymousClass78N) next;
            if (!(!(r12 instanceof AnonymousClass78R) || (r1 = (AnonymousClass78R) r12) == null || (r2 = r1.createCommandData()) == null)) {
                Integer A032 = r2.A03();
                int i = r5.A00;
                if (A032 != null && A032.intValue() == i) {
                    break;
                }
            }
        }
        return r2;
    }

    public final Filter getFilter() {
        Filter filter = this.A09;
        if (filter != null) {
            return filter;
        }
        C3260275c r0 = new C3260275c(this);
        this.A09 = r0;
        return r0;
    }

    public AnonymousClass7H0(Activity activity, AnonymousClass0iw r5, UserSession userSession, C328967Gz r7, C328887Gq r8, C62320sa r9) {
        this.A0A = userSession;
        this.A0B = r8;
        this.A0G = r9;
        AnonymousClass7H2 r2 = new AnonymousClass7H2(activity, r5);
        this.A0D = r2;
        AnonymousClass7H3 r1 = new AnonymousClass7H3(activity);
        this.A0C = r1;
        this.A04 = new ArrayList();
        A0B(r2, r1);
        this.A00 = activity.getColor(2Yu.A0H(activity, R.attr.igds_color_primary_button));
        this.A0E = new AnonymousClass7H4(activity, userSession, r7, r9);
    }
}
