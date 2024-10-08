package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.Jfh  reason: case insensitive filesystem */
public final class C60101Jfh extends C361478gI {
    public static final 0xG A0B = DbS.A0O("FanClubContentPreviewPickerViewModel");
    public final UserSession A00;
    public final C64829Lip A01;
    public final PendingMediaStore A02;
    public final String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C58176Ing(this, 15));
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60101Jfh(Application application, UserSession userSession, C64829Lip lip, PendingMediaStore pendingMediaStore, String str) {
        super(application);
        PendingMediaStore pendingMediaStore2 = pendingMediaStore;
        C51974G9v.A1P(application, userSession, pendingMediaStore2, lip);
        String str2 = str;
        0qQ.A0B(str2, 5);
        this.A00 = userSession;
        this.A02 = pendingMediaStore2;
        this.A01 = lip;
        this.A03 = str2;
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        02z A013 = 106.A01((Object) null);
        this.A09 = A013;
        02z A10 = DbS.A10(false);
        this.A07 = A10;
        02z A102 = DbS.A10(false);
        this.A06 = A102;
        02z A103 = DbS.A10(false);
        this.A05 = A103;
        MCA A002 = MCA.A00(this, new AnonymousClass0r6[]{A012, lip.A04, A013, A10, A102, A103}, 49);
        this.A0A = 10b.A02(new C61915KRk(0sn.A00, false), C318116oQ.A00(this), A002, AnonymousClass10A.A00);
    }
}
