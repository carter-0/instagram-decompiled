package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.34r  reason: invalid class name and case insensitive filesystem */
public final class C2366834r {
    public static final Object A08 = new Object();
    public String A00;
    public final 2el A01;
    public final C229932oe A02 = new C229932oe();
    public final C228322lL A03;
    public final C2367134u A04;
    public final C2367034t A05;
    public final C2366934s A06;
    public final Set A07;

    public final void A00(View view, Reel reel, AnonymousClass3BN r9, Boolean bool, int i) {
        C228322lL r2;
        C241073Nt r22 = new C241073Nt(r9, bool, i);
        String A0R = 002.A0R(reel.getId(), this.A00);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r5 = new C2354830a(reel, r22, A0R);
        r5.A00(this.A06);
        C229932oe r4 = this.A02;
        if (AnonymousClass30Y.A07 == r4.A00("reel_tray") && (r2 = this.A03) != null) {
            Object obj = A08;
            C2354830a r1 = new C2354830a(obj, obj, "reel_tray");
            r1.A00(new C241083Nu(r2));
            r4.A01(r1.A01(), "reel_tray");
        }
        r5.A00 = r4.A00("reel_tray");
        this.A01.A05(view, r5.A01());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.34t, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.34u, java.lang.Object] */
    public C2366834r(2el r2, C228322lL r3, C230252pH r4, C228102kn r5) {
        this.A01 = r2;
        this.A03 = r3;
        this.A06 = new C2366934s(r4, r5);
        ? obj = new Object();
        obj.A00 = r4;
        this.A05 = obj;
        ? obj2 = new Object();
        obj2.A00 = r4;
        this.A04 = obj2;
        this.A00 = new String();
        this.A07 = new LinkedHashSet();
    }
}
