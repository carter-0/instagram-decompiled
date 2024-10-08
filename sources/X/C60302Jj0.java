package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.viewmodel.cobroadcast.IgLiveHostCobroadcastViewModel$4;
import java.util.Set;

/* renamed from: X.Jj0  reason: case insensitive filesystem */
public final class C60302Jj0 extends 2YL {
    public final 1Ng A00;
    public final 1wn A01 = new C64683LgB(this, 2);
    public final UserSession A02;
    public final M0X A03;
    public final LRP A04;
    public final IgLiveCobroadcastRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final C313816h4 A07;
    public final L9O A08;
    public final LES A09;
    public final C59720JVe A0A;
    public final C62423KfY A0B;
    public final Set A0C = DbS.A0y();
    public final Set A0D = DbS.A0y();
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final void A00(C60302Jj0 jj0, Set set) {
        Set set2 = set;
        if (!set.isEmpty()) {
            C60302Jj0 jj02 = jj0;
            Object value = jj0.A06.A06.getValue();
            if (value != null) {
                M0X m0x = jj0.A03;
                m0x.A0h.incrementAndGet();
                M0X.A0A(m0x, AnonymousClass05K.A0a);
                AnonymousClass7TE.A1Z(new MHK((Object) set2, value, (Object) jj02, (AnonymousClass4D7) null, 4), C318116oQ.A00(jj0));
            }
        }
    }

    public final void onCleared() {
        UserSession userSession = this.A02;
        C313786h0 r0 = C313776gz.A0K;
        C313666go r1 = C313666go.BROADCASTER;
        r0.A01(userSession, r1);
        C313646gm.A0A.A01(userSession, r1);
        this.A00.A02(this.A01, 2Cy.class);
    }

    public /* synthetic */ C60302Jj0(UserSession userSession, M0X m0x, LRP lrp, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r11, L9O l9o, LES les, C59720JVe jVe, C62423KfY kfY, long j, long j2, boolean z, boolean z2) {
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass7TF.A1C(les, 2, jVe);
        C51974G9v.A1N(l9o, igLiveBroadcastInfoManager, r11);
        0qQ.A0B(kfY, 10);
        0qQ.A0B(A002, 15);
        this.A02 = userSession;
        this.A09 = les;
        this.A0A = jVe;
        this.A05 = igLiveCobroadcastRepository;
        this.A08 = l9o;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = r11;
        this.A03 = m0x;
        this.A04 = lrp;
        this.A0B = kfY;
        this.A0H = z;
        this.A0G = z2;
        this.A00 = A002;
        1HR A0o = JTQ.A0o();
        this.A0E = A0o;
        this.A0F = 0u9.A04(A0o);
        JTS.A13(this, MHB.A01(this, (AnonymousClass4D7) null, 23), les.A0s);
        JTS.A13(this, new MHL(this, (AnonymousClass4D7) null), jVe.A00);
        JTS.A13(this, new MHK(this, (AnonymousClass4D7) null, 2), l9o.A04);
        if (z2) {
            JTR.A1H(this, new IgLiveHostCobroadcastViewModel$4(this, (AnonymousClass4D7) null), les.A0h, AnonymousClass11F.A00(igLiveCobroadcastRepository.A02, j2), l9o.A01);
            JTR.A1G(this, new C66194MHk((Object) this, (AnonymousClass4D7) null, 36), l9o.A02, AnonymousClass11F.A00(igLiveCobroadcastRepository.A01, j));
        }
    }

    public static final void A01(C60302Jj0 jj0, Set set) {
        AnonymousClass7TE.A1Z(new MHL((Object) jj0, (Object) set, (AnonymousClass4D7) null, 44), C318116oQ.A00(jj0));
        if (!jj0.A0G) {
            jj0.A0C.removeAll(set);
        }
    }
}
