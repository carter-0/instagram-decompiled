package X;

import com.instagram.mediakit.repository.MediaKitRepository;
import java.util.LinkedHashMap;

/* renamed from: X.JjV  reason: case insensitive filesystem */
public final class C60326JjV extends 2YL implements MXF {
    public static final String __redex_internal_original_name = "MediaKitPickerTabsViewModel";
    public C61220JzD A00;
    public boolean A01;
    public final C62533KhP A02;
    public final MediaKitRepository A03;
    public final LAT A04;
    public final 0V2 A05;
    public final C61770pa A06;
    public final C61770pa A07;
    public final AnonymousClass0iw A08;
    public final LDW A09;
    public final 0V2 A0A;

    public static final void A01(C60326JjV jjV, 0sP r2) {
        0V2 r1 = jjV.A0A;
        Object A0I = 00k.A0I(r1.Bm6());
        r2.invoke(A0I);
        r1.FIA(A0I);
    }

    public final LinkedHashMap A02() {
        return (LinkedHashMap) 00k.A0I(this.A0A.Bm6());
    }

    public final boolean A04() {
        int i;
        C62533KhP khP = this.A02;
        int ordinal = khP.ordinal();
        if (ordinal == 0) {
            i = this.A04.A03;
        } else if (ordinal == 1) {
            i = this.A04.A02;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A002 = A00(khP, this);
        int size = A02().size();
        if (i > size || size > A002) {
            return false;
        }
        return true;
    }

    public final LDW BO3() {
        return this.A09;
    }

    public final String getModuleName() {
        return this.A08.getModuleName();
    }

    public C60326JjV(AnonymousClass0iw r7, LDW ldw, C62533KhP khP, MediaKitRepository mediaKitRepository, LAT lat) {
        C51974G9v.A1M(mediaKitRepository, khP, ldw);
        0qQ.A0B(r7, 5);
        this.A04 = lat;
        this.A03 = mediaKitRepository;
        this.A02 = khP;
        this.A08 = r7;
        this.A09 = ldw;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        A012.FIA(AnonymousClass7TE.A1H());
        this.A0A = A012;
        this.A06 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 1, 0);
        this.A05 = A013;
        this.A07 = new 0V1((C262204Co) null, A013);
    }

    public static final int A00(C62533KhP khP, C60326JjV jjV) {
        int ordinal = khP.ordinal();
        if (ordinal == 0) {
            return jjV.A04.A01;
        }
        if (ordinal == 1) {
            return jjV.A04.A00;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void A03(C66405MQl... mQlArr) {
        AnonymousClass7TE.A1Z(new MGW(this, mQlArr, (AnonymousClass4D7) null, 18), C318116oQ.A00(this));
    }
}
