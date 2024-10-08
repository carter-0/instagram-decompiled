package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.CancellationException;

/* renamed from: X.ISw  reason: case insensitive filesystem */
public final class C57209ISw implements G73 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ ClipsViewerConfig A02;
    public final /* synthetic */ ClipsViewerSource A03;
    public final /* synthetic */ C267324bN A04;
    public final /* synthetic */ C52058GDe A05;
    public final /* synthetic */ AnonymousClass0iw A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ 1Xj A08;
    public final /* synthetic */ C55684Hlh A09;
    public final /* synthetic */ 0rm A0A;

    public final void DoN(1Xj r30) {
        ClipsMashupType clipsMashupType;
        1Xj r6 = r30;
        0qQ.A0B(r6, 0);
        AnonymousClass4DH r13 = this.A01;
        if (r13.mView != null) {
            0rm r12 = this.A0A;
            if (r12.A00 != null) {
                AnonymousClass0xx A0t = G9t.A0t(r13);
                ClipsViewerSource clipsViewerSource = this.A03;
                AnonymousClass0iw r9 = this.A06;
                UserSession userSession = this.A07;
                C52058GDe gDe = this.A05;
                C55684Hlh hlh = this.A09;
                FragmentActivity fragmentActivity = this.A00;
                C267324bN r2 = this.A04;
                AnonymousClass7TE.A1Z(new C58091Im6(hlh, r13, clipsViewerSource, r6, gDe, userSession, this.A02, r12, r2, this.A08, r9, fragmentActivity, (AnonymousClass4D7) null, 1), A0t);
                return;
            }
            C52345GOp gOp = C52345GOp.A00;
            AnonymousClass0iw r4 = this.A06;
            UserSession userSession2 = this.A07;
            Integer A052 = C52058GDe.A05(this.A05);
            String str = this.A09.A00;
            FragmentActivity fragmentActivity2 = this.A00;
            ClipsViewerSource clipsViewerSource2 = this.A03;
            28D A002 = C55275Hf4.A00(clipsViewerSource2);
            C267324bN r1 = this.A04;
            String A082 = I7J.A08(r1);
            String A092 = I7J.A09(r1);
            String A072 = I7J.A07(r1);
            Boolean A062 = I7J.A06(r1);
            ImageUrl A012 = I7J.A01(r1);
            if (clipsViewerSource2 == ClipsViewerSource.SEQUENCE_ORIGINAL_REEL || clipsViewerSource2 == ClipsViewerSource.SEQUENCE_REEL_CTA) {
                clipsMashupType = ClipsMashupType.A0A;
            } else {
                clipsMashupType = ClipsMashupType.A0B;
            }
            1Xj r14 = r1.A02;
            0qQ.A0B(A002, 7);
            C52345GOp.A04(r13, fragmentActivity2, A002, clipsMashupType, r4, userSession2, A012, r6, r14, gOp, A062, A052, str, A082, A092, A072);
        }
    }

    public C57209ISw(FragmentActivity fragmentActivity, AnonymousClass4DH r2, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C267324bN r5, C52058GDe gDe, AnonymousClass0iw r7, UserSession userSession, 1Xj r9, C55684Hlh hlh, 0rm r11) {
        this.A01 = r2;
        this.A0A = r11;
        this.A06 = r7;
        this.A07 = userSession;
        this.A05 = gDe;
        this.A09 = hlh;
        this.A00 = fragmentActivity;
        this.A03 = clipsViewerSource;
        this.A04 = r5;
        this.A02 = clipsViewerConfig;
        this.A08 = r9;
    }

    public final void onFail(String str) {
        0rm r2 = this.A0A;
        C262204Co r1 = (C262204Co) r2.A00;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        r2.A00 = null;
        C56654I6j.A03(this.A01, this.A03);
        C51969G9p.A1K(0wj.A01.AEf("ClipsOrganicMoreOptionsActionUtil", 817902720), 002.A0R("Failed to fetch original media: ", str));
    }
}
