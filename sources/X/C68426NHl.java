package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.DirectRealtimePayload;

/* renamed from: X.NHl  reason: case insensitive filesystem */
public final class C68426NHl extends C272124k8 {
    public final 1P0 A00;
    public final C74551Pwk A01;

    public C68426NHl(1P0 r1, UserSession userSession, C74551Pwk pwk) {
        super(userSession);
        this.A01 = pwk;
        this.A00 = r1;
    }

    public final void A05(C268654dm r4, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(173697489);
        C74551Pwk pwk = this.A01;
        C74551Pwk.A01(pwk);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFail(r4);
        }
        C74551Pwk.A00(r4, pwk);
        AnonymousClass0fD.A0A(-1896066468, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        String str;
        DirectRealtimePayload directRealtimePayload;
        int A03 = AnonymousClass0fD.A03(244621642);
        AnonymousClass1XT r9 = (AnonymousClass1XT) obj;
        int A032 = AnonymousClass0fD.A03(1299273244);
        C74551Pwk pwk = this.A01;
        C3265677h.A0a(pwk.BsS(), AnonymousClass05K.A00);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess(r9);
        }
        try {
            if (r9 instanceof C74353PtT) {
                str = ((C74353PtT) r9).BJR();
            } else {
                if ((r9 instanceof C43849CFp) && (directRealtimePayload = ((C43849CFp) r9).A00) != null) {
                    str = directRealtimePayload.itemId;
                }
                str = null;
            }
        } catch (Exception unused) {
            0wj.A00("Item ID doesn't exist in session scoped API callback.", 20134884, true).report();
        }
        pwk.DTM((C270214gN) null, str);
        AnonymousClass0fD.A0A(-1348546799, A032);
        AnonymousClass0fD.A0A(-439936160, A03);
    }
}
