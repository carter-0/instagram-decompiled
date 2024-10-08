package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.SmartGalleryViewModel$dismissTransitionEvent$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.85O  reason: invalid class name */
public final class AnonymousClass85O extends 2YL {
    public Integer A00;
    public WeakReference A01 = new WeakReference((Object) null);
    public final 2Fk A02;
    public final 2Fk A03;
    public final C249513ju A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final AnonymousClass0Ud A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final UserSession A0G;
    public final AnonymousClass0Ud A0H;

    public AnonymousClass85O(UserSession userSession) {
        this.A0G = userSession;
        02z r0 = new 02z(false);
        this.A07 = r0;
        this.A0D = r0;
        02z r02 = new 02z(0);
        this.A0A = r02;
        this.A0F = 10b.A03(r02);
        02z A012 = 106.A01((Object) null);
        this.A0C = A012;
        1HR r1 = new 1HR(0);
        this.A05 = r1;
        02z r7 = new 02z(true);
        this.A0B = r7;
        1HR r6 = new 1HR(0);
        this.A04 = r6;
        this.A06 = 0u9.A04(r1);
        02z r03 = new 02z(AnonymousClass85P.OPTION_NOT_ALLOWED);
        this.A08 = r03;
        05F A032 = 10b.A03(r03);
        this.A0H = A032;
        19B r4 = 19B.A00;
        this.A03 = C226292g8.A00(r4, A032);
        02z r04 = new 02z(false);
        this.A09 = r04;
        this.A0E = 10b.A03(r04);
        this.A02 = C226292g8.A00(r4, AnonymousClass10H.A03(new SmartGalleryViewModel$dismissTransitionEvent$1(this, (AnonymousClass4D7) null), r7, 0u9.A04(r6)));
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 38), A012));
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 30), A032));
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        05G r5 = this.A0C;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9SZ r0 = (AnonymousClass9SZ) it.next();
            arrayList.add(new C376459Ib(r0.A01, r0.A00));
        }
        r5.Epw(arrayList);
    }

    public final boolean A02(C279284yO r5) {
        0qQ.A0B(r5, 0);
        if (r5 instanceof AnonymousClass80O) {
            if (!182.A06(0Tu.A05, this.A0G, 36328568556371376L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A03(C279284yO r3) {
        0qQ.A0B(r3, 0);
        if (this.A0H.getValue() == AnonymousClass85P.ON || A02(r3)) {
            return true;
        }
        return false;
    }

    public final void A00() {
        Object value;
        AnonymousClass85P r0;
        05G r3 = this.A08;
        do {
            value = r3.getValue();
            int ordinal = ((AnonymousClass85P) value).ordinal();
            if (ordinal == 0) {
                r0 = AnonymousClass85P.OPTION_NOT_ALLOWED;
            } else if (ordinal == 2) {
                r0 = AnonymousClass85P.OFF;
            } else if (ordinal == 1) {
                r0 = AnonymousClass85P.ON;
            } else {
                throw new RuntimeException();
            }
        } while (!r3.AIY(value, r0));
    }
}
