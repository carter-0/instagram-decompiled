package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Mh1  reason: case insensitive filesystem */
public final class C67028Mh1 implements AnonymousClass0lh {
    public final AnonymousClass1aS A00;
    public final UserSession A01;
    public final C66594MYg A02;
    public final MutedWordsFilterManager A03;
    public final Object A04;
    public final Set A05;
    public final Set A06;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AtomicInteger A09 = new AtomicInteger(0);
    public final AtomicInteger A0A = new AtomicInteger(0);
    public final 1a8 A0B;
    public final AnonymousClass9V6 A0C;

    public C67028Mh1(UserSession userSession, AnonymousClass61K r7, MutedWordsFilterManager mutedWordsFilterManager) {
        DbZ.A0t(1, userSession, mutedWordsFilterManager, r7);
        this.A01 = userSession;
        this.A03 = mutedWordsFilterManager;
        1a8 A0P = C66581MXm.A0P();
        this.A0B = A0P;
        this.A00 = 1aF.A00();
        C66594MYg A012 = MYc.A01(userSession, r7.A00);
        this.A02 = A012;
        this.A04 = new Object();
        this.A05 = DbS.A0y();
        this.A06 = DbS.A0y();
        AnonymousClass9V6 r1 = new AnonymousClass9V6(this);
        this.A0C = r1;
        mutedWordsFilterManager.A0C.add(r1);
        PU7.A00(this.A02.A01.A09.A0M(new C67500Mou()).A0L(C67461MoG.A00), A0P, this, 17);
        PU7.A00(C66789Mca.A00(MYb.A00(A012.A01), C66639Ma8.A00, 17).A0M(new C72018Ous(new C73933PmD(this, 27), 2)), A0P, this, 18);
    }

    public final void A00(String str) {
        int i;
        synchronized (this.A04) {
            Set set = this.A05;
            set.remove(str);
            Set set2 = this.A06;
            set2.remove(str);
            AtomicInteger atomicInteger = this.A09;
            int size = set.size();
            Integer num = (Integer) this.A00.A0X();
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            atomicInteger.set(size + i);
            this.A0A.set(set2.size());
        }
    }

    public final void A01(boolean z) {
        AtomicBoolean atomicBoolean = this.A07;
        atomicBoolean.compareAndSet(false, z);
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        if (!mutedWordsFilterManager.A09()) {
            if (this.A08.getAndSet(false)) {
                AnonymousClass1Nd.A00(this.A01).A00(new 2Kc((2EM) null, false, false, false));
            }
        } else if (atomicBoolean.getAndSet(false)) {
            UserSession userSession = this.A01;
            int A042 = DbS.A04(0Tu.A05, userSession, 36593400535909622L);
            int i = 1;
            if (mutedWordsFilterManager.A08()) {
                i = 20;
            }
            02m r3 = 02m.A0p;
            UUID A002 = AnonymousClass0HM.A00();
            0qQ.A07(A002);
            AnonymousClass43I r8 = AnonymousClass43I.A00;
            Integer valueOf = Integer.valueOf(A042);
            Integer valueOf2 = Integer.valueOf(i);
            Set<C69415Nkv> set = C2612048r.A00(userSession).A00;
            ArrayList A0r = AnonymousClass7TG.A0r(set);
            for (C69415Nkv nkv : set) {
                A0r.add(Integer.valueOf(nkv.A00));
            }
            C66716MbN A003 = C67314Mlo.A00(userSession, r8, (AnonymousClass7BV) null, true, (Integer) null, valueOf, valueOf2, (String) null, (String) null, (String) null, (String) null, (String) null, A002.toString(), 00k.A0a(A0r), -1);
            A003.A00(new NMH(15, r3, this));
            1ES.A06(A003, 501110836, true);
        }
    }

    public final void onSessionWillEnd() {
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        AnonymousClass9V6 r1 = this.A0C;
        0qQ.A0B(r1, 0);
        mutedWordsFilterManager.A0C.remove(r1);
        this.A0B.A01();
    }
}
