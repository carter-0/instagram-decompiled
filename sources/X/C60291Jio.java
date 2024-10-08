package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1;

/* renamed from: X.Jio  reason: case insensitive filesystem */
public final class C60291Jio extends 2YL {
    public final Context A00;
    public final 2Fk A01;
    public final 0wc A02;
    public final UserSession A03;
    public final C310016aI A04;
    public final C313666go A05;
    public final LM9 A06;
    public final IgLiveCommentsRepository A07;
    public final C63921LDa A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C313816h4 A0A;
    public final LES A0B;
    public final C59720JVe A0C;
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;
    public final 05G A0F;
    public final boolean A0G;
    public final 05G A0H;

    public static /* synthetic */ void A00(M0V m0v, C60291Jio jio, String str, int i, boolean z, boolean z2, boolean z3) {
        String str2 = str;
        M0V m0v2 = m0v;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = ((C61007Jv6) jio.A0F.getValue()).A03;
        }
        if ((i & 2) != 0) {
            z5 = ((C61007Jv6) jio.A0F.getValue()).A02;
        }
        if ((i & 4) != 0) {
            z4 = ((C61007Jv6) jio.A0F.getValue()).A04;
        }
        if ((i & 8) != 0) {
            m0v2 = (M0V) ((C61007Jv6) jio.A0F.getValue()).A00;
        }
        if ((i & 16) != 0) {
            str2 = ((C61007Jv6) jio.A0F.getValue()).A01;
        }
        AnonymousClass7TF.A1O(jio.A0B.A0E, z4);
        jio.A0F.Epw(new C61007Jv6(m0v2, str2, z6, z5, z4));
    }

    public final void A01(String str, int i, long j, boolean z) {
        AnonymousClass7TE.A1Z(new IgLiveComposerViewModel$onPostButtonTapped$1(this, str, (AnonymousClass4D7) null, i, j, z), JTP.A0J(this, str, 3));
    }

    public C60291Jio(Context context, 0wc r19, UserSession userSession, C310016aI r21, C313666go r22, LM9 lm9, IgLiveCommentsRepository igLiveCommentsRepository, C63921LDa lDa, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r27, LES les, C59720JVe jVe, boolean z) {
        IgLiveCommentsRepository igLiveCommentsRepository2 = igLiveCommentsRepository;
        C313816h4 r6 = r27;
        LES les2 = les;
        C51974G9v.A1M(r6, les2, igLiveCommentsRepository2);
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager2 = igLiveBroadcastInfoManager;
        C59720JVe jVe2 = jVe;
        UserSession userSession2 = userSession;
        C51973G9u.A0s(5, igLiveBroadcastInfoManager2, jVe2, userSession2);
        LM9 lm92 = lm9;
        C313666go r8 = r22;
        C51972G9s.A1F(r8, lm92);
        this.A00 = context;
        this.A0A = r6;
        this.A0B = les2;
        this.A07 = igLiveCommentsRepository2;
        this.A09 = igLiveBroadcastInfoManager2;
        this.A08 = lDa;
        this.A0C = jVe2;
        this.A03 = userSession2;
        this.A02 = r19;
        this.A05 = r8;
        this.A06 = lm92;
        this.A04 = r21;
        this.A0G = z;
        02z A10 = DbS.A10(new C61007Jv6((M0V) null, "", false, false, false));
        this.A0F = A10;
        02z A102 = DbS.A10(Float.valueOf(0.0f));
        this.A0H = A102;
        1HR A1G = JTO.A1G(0);
        this.A0D = A1G;
        this.A0E = 0u9.A04(A1G);
        MCA A002 = MCA.A00(this, JTS.A1b(new AnonymousClass0Ud[]{les2.A0s, les2.A0f, les2.A0p, igLiveBroadcastInfoManager2.A06, igLiveCommentsRepository2.A0J, A10, A102}), 68);
        19B r4 = 19B.A00;
        this.A01 = C226292g8.A00(r4, A002);
        1Eo.A05(r4, new C66184MGv((Object) this, (AnonymousClass4D7) null, 29), C318116oQ.A00(this));
    }

    public final void A02(boolean z, boolean z2) {
        A00((M0V) null, this, (String) null, 28, z, !z2, false);
    }

    public final void onCleared() {
        C313786h0 r1 = C313776gz.A0K;
        UserSession userSession = this.A03;
        r1.A01(userSession, this.A05);
        C313646gm.A0A.A01(userSession, C313666go.VIEWER);
    }
}
