package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88V  reason: invalid class name */
public final class AnonymousClass88V extends 2YL {
    public Integer A00 = AnonymousClass05K.A01;
    public boolean A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final AnonymousClass2Fj A06;
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final C249513ju A0C;
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;

    public final void A02(Integer num, List list, boolean z, boolean z2, boolean z3) {
        C249513ju r4;
        this.A00 = num;
        A00(this);
        List list2 = this.A07;
        list2.addAll(list);
        this.A01 = z;
        this.A02 = z2;
        if (!z3) {
            r4 = this.A0D;
        } else {
            r4 = this.A0C;
        }
        r4.FIG(new AnonymousClass88W(new AnonymousClass9IZ((Medium) list2.get(0), this.A00, this.A01)));
    }

    public AnonymousClass88V() {
        1HR r3 = new 1HR(0);
        this.A0C = r3;
        1HR r0 = new 1HR(0);
        this.A0D = r0;
        055 A042 = 10q.A04(new AnonymousClass0r6[]{new AnonymousClass05E(new MGF((Object) 0u9.A04(r0), (AnonymousClass4D7) null, 17, 1500)), 0u9.A04(r3)});
        this.A0E = A042;
        19B r32 = 19B.A00;
        this.A05 = C226292g8.A00(r32, A042);
        0sn r7 = 0sn.A00;
        02z r02 = new 02z(new AnonymousClass88W(r7));
        this.A0B = r02;
        this.A03 = C226292g8.A00(r32, r02);
        2Fk r03 = new 2Fk(new AnonymousClass88W(new AnonymousClass88X((ACRType) null, (AudioOverlayTrack) null, (String) null, r7, (List) null, 1020, false, false, false)));
        this.A06 = r03;
        this.A04 = r03;
        1HR r04 = new 1HR(Integer.MAX_VALUE);
        this.A09 = r04;
        this.A0A = 0u9.A04(r04);
    }

    public static final void A00(AnonymousClass88V r4) {
        List list = r4.A07;
        if (!list.isEmpty()) {
            list.clear();
            C318136oS A002 = C318116oQ.A00(r4);
            1Eo.A05(19B.A00, new C66183MGu(r4, (AnonymousClass4D7) null, 47), A002);
        }
        r4.A08.clear();
    }

    public final void A01() {
        List list = this.A07;
        018.A13(list);
        if (!list.isEmpty()) {
            this.A0C.FIG(new AnonymousClass88W(new AnonymousClass9IZ((Medium) list.get(0), this.A00, this.A01)));
            return;
        }
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 48);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }
}
