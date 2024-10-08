package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.83d  reason: invalid class name and case insensitive filesystem */
public final class C3500783d {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final 0V2 A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final 0V2 A06;
    public final 0V2 A07;
    public final 0V2 A08;
    public final 0V2 A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final AnonymousClass0Ud A0D;
    public final AnonymousClass0Ud A0E;
    public final UserSession A0F;
    public final AnonymousClass0Ud A0G;

    public C3500783d(UserSession userSession) {
        this.A0F = userSession;
        02z r0 = new 02z(new ArrayList());
        this.A0C = r0;
        this.A0E = r0;
        0sn r1 = 0sn.A00;
        02z A012 = 106.A01(r1);
        this.A0B = A012;
        this.A0D = A012;
        02z A013 = 106.A01(r1);
        this.A0A = A013;
        this.A0G = A013;
        Integer num = AnonymousClass05K.A01;
        this.A05 = 10D.A01(num, 0, 1);
        this.A06 = 10D.A01(num, 0, 1);
        this.A03 = 10D.A01(num, 0, 1);
        this.A04 = 10D.A01(num, 0, 1);
        this.A07 = 10D.A01(num, 0, 1);
        this.A08 = 10D.A01(num, 0, 1);
        this.A09 = 10D.A01(num, 0, 1);
    }

    public static final void A00(C3500783d r1, Object obj, Object obj2) {
        boolean z;
        if (obj instanceof AnonymousClass5MI) {
            z = obj2 instanceof AnonymousClass5MI;
        } else if (obj instanceof C268714ds) {
            z = obj2 instanceof C268714ds;
        } else {
            return;
        }
        if (z) {
            r1.A07.FIA(new 0eP(obj, obj2));
        }
    }

    public final void A01(AnonymousClass5MI r4) {
        AnonymousClass8A1.A01(this.A0F).A09("ClipsTimedStickerStore#addTimedSticker");
        List list = this.A02;
        list.add(r4);
        this.A0C.Epw(new ArrayList(list));
        if (r4 instanceof Drawable) {
            this.A05.FIA(r4);
        }
    }
}
