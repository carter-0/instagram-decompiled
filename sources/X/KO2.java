package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

public final class KO2 extends LRK {
    public String A00;
    public final AnonymousClass07Z A01;
    public final UserSession A02;
    public final ClipsSharingDraftViewModel A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KO2(AnonymousClass07Z r5, UserSession userSession, ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        super(userSession);
        Object obj;
        C293505kq A09;
        String str;
        C293505kq A092;
        AnonymousClass7TG.A1U(userSession, clipsSharingDraftViewModel, r5);
        this.A02 = userSession;
        this.A03 = clipsSharingDraftViewModel;
        this.A01 = r5;
        boolean z = clipsSharingDraftViewModel.A0A;
        if (!z || (A092 = clipsSharingDraftViewModel.A07.A09()) == null) {
            obj = C361268fw.A00;
        } else {
            obj = new AnonymousClass8Y4(C64003LIj.A00(A092));
        }
        02z A012 = 106.A01(obj);
        this.A04 = A012;
        this.A05 = 10b.A03(A012);
        String str2 = "";
        if (!(!z || (A09 = clipsSharingDraftViewModel.A07.A09()) == null || (str = A09.A0S) == null)) {
            str2 = str;
        }
        this.A00 = str2;
        ClipsSharingDraftViewModel clipsSharingDraftViewModel2 = this.A03;
        AnonymousClass2Fj r1 = clipsSharingDraftViewModel2.A03;
        AnonymousClass07Z r3 = this.A01;
        C64317LZr.A00(r3, r1, this, 15);
        C64317LZr.A00(r3, clipsSharingDraftViewModel2.A01, this, 16);
        Dba.A15(r3, clipsSharingDraftViewModel2.A00, new MP9(this, 20), 18);
    }
}
