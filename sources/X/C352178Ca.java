package X;

import com.instagram.creation.capture.quickcapture.ourstory.viewmodel.OurStoryPostCaptureViewModel$viewState$1;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Ca  reason: invalid class name and case insensitive filesystem */
public final class C352178Ca extends 2YL {
    public final 0V2 A00 = 10D.A01(AnonymousClass05K.A00, 0, 0);
    public final 05G A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public final void A00() {
        05G r4 = this.A02;
        List<DirectShareTarget> list = (List) r4.getValue();
        05G r6 = this.A03;
        05G r5 = this.A01;
        String str = (String) r5.getValue();
        ArrayList arrayList = new ArrayList();
        for (DirectShareTarget A0B : list) {
            018.A16(A0B.A0B(), arrayList);
        }
        r6.Epw(new C376669Iw((List) arrayList, list.size(), str));
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new C66183MGu(this, (AnonymousClass4D7) null, 13), A002);
        r5.Epw("");
        r4.Epw(0sn.A00);
    }

    public C352178Ca() {
        02z r3 = new 02z("");
        this.A01 = r3;
        0sn r6 = 0sn.A00;
        02z A012 = 106.A01(r6);
        this.A02 = A012;
        02z A013 = 106.A01((Object) null);
        this.A03 = A013;
        0pt A002 = AnonymousClass10H.A00(new OurStoryPostCaptureViewModel$viewState$1((AnonymousClass4D7) null), r3, A012, A013);
        this.A04 = 10b.A02(new AnonymousClass8ZE((C376669Iw) null, "", r6, 0, false), C318116oQ.A00(this), A002, AnonymousClass10A.A00);
    }
}
