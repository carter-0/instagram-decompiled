package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

/* renamed from: X.Ji2  reason: case insensitive filesystem */
public final class C60245Ji2 extends 2YL {
    public C61220JzD A00;
    public boolean A01;
    public final 1a8 A02 = new 1a8(C318146oT.A01);
    public final UserSession A03;
    public final 2Dm A04;
    public final MXF A05;
    public final MediaKitRepository A06;
    public final C63659L1v A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final 05G A0C;

    public final void onCleared() {
        this.A02.A01();
    }

    public C60245Ji2(UserSession userSession, 2Dm r6, MXF mxf, MediaKitRepository mediaKitRepository) {
        AnonymousClass7TG.A1U(r6, userSession, mediaKitRepository);
        this.A04 = r6;
        this.A03 = userSession;
        this.A06 = mediaKitRepository;
        this.A05 = mxf;
        this.A07 = new C63659L1v(DbS.A04(0Tu.A05, userSession, 36597764222290903L));
        0sn r0 = 0sn.A00;
        02z A012 = 106.A01(r0);
        this.A0B = A012;
        02z A013 = 106.A01(r0);
        this.A0C = A013;
        this.A09 = AnonymousClass10H.A03(new C52574GXz(this, 1), A012, A013);
        1HR A0w = G9w.A0w();
        this.A08 = A0w;
        this.A0A = 0u9.A04(A0w);
    }
}
