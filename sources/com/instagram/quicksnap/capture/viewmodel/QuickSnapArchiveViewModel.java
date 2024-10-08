package com.instagram.quicksnap.capture.viewmodel;

import X.02z;
import X.05D;
import X.05G;
import X.0Tu;
import X.0V2;
import X.0qQ;
import X.0s0;
import X.0sn;
import X.10D;
import X.182;
import X.19B;
import X.1Av;
import X.1Eo;
import X.2YL;
import X.AeZ;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0YZ;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.C262204Co;
import X.C318116oQ;
import X.C318136oS;
import X.C359088bz;
import X.C359098c0;
import X.C391569tI;
import X.C41740AzV;
import X.C47177Drs;
import X.C61082JwK;
import X.C65567Lvr;
import X.C66166MGd;
import X.C66185MGw;
import X.G5D;
import X.MG3;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickSnapArchiveViewModel extends 2YL {
    public Long A00;
    public List A01;
    public C262204Co A02;
    public C262204Co A03;
    public final int A04;
    public final UserSession A05;
    public final 1Av A06;
    public final C359098c0 A07;
    public final QuickSnapArchiveRepository A08;
    public final QuickSnapRepository A09;
    public final QuickSnapMediaSaver A0A;
    public final QuickSnapRecapVideoGenerator A0B;
    public final Integer A0C;
    public final AnonymousClass0r6 A0D;
    public final 0V2 A0E;
    public final 05G A0F;
    public final 05G A0G = new 02z(new C61082JwK((LinkedHashSet) null, (DefaultConstructorMarker) null, 3, 38, false));
    public final AnonymousClass0Ud A0H;

    public /* synthetic */ QuickSnapArchiveViewModel(UserSession userSession, 1Av r21, QuickSnapArchiveRepository quickSnapArchiveRepository, QuickSnapRepository quickSnapRepository, QuickSnapMediaSaver quickSnapMediaSaver, QuickSnapRecapVideoGenerator quickSnapRecapVideoGenerator, Integer num, int i) {
        UserSession userSession2 = userSession;
        C359098c0 A002 = C359088bz.A00(userSession2);
        QuickSnapRepository quickSnapRepository2 = quickSnapRepository;
        0qQ.A0B(quickSnapRepository2, 3);
        1Av r6 = r21;
        0qQ.A0B(r6, 6);
        Integer num2 = num;
        0qQ.A0B(num2, 8);
        0qQ.A0B(A002, 9);
        this.A05 = userSession2;
        this.A08 = quickSnapArchiveRepository;
        this.A09 = quickSnapRepository2;
        this.A04 = i;
        this.A0B = quickSnapRecapVideoGenerator;
        this.A06 = r6;
        this.A0A = quickSnapMediaSaver;
        this.A0C = num2;
        this.A07 = A002;
        0sn r7 = 0sn.A00;
        this.A01 = r7;
        02z r0 = new 02z(new C47177Drs(r7, 0, false, false, true, false, false, false, false, false, false, false));
        this.A0F = r0;
        this.A0H = r0;
        Integer num3 = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num3, 0, 0);
        this.A0E = A012;
        this.A0D = A012;
        C318136oS A003 = C318116oQ.A00(this);
        1Eo.A03(num3, 19B.A00, new C66185MGw(this, (AnonymousClass4D7) null, 5), A003);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r6, X.AnonymousClass4D7 r7) {
        /*
            r0 = 41
            boolean r0 = X.ME6.A02(r0, r7)
            if (r0 == 0) goto L_0x005c
            r5 = r7
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r2) goto L_0x0062
            java.lang.Object r6 = r5.A01
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r6 = (com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel) r6
            X.0eS.A00(r4)
        L_0x0028:
            java.lang.String r4 = (java.lang.String) r4
            X.4Co r1 = r6.A03
            if (r1 == 0) goto L_0x0032
            r0 = 0
            r1.AG7(r0)
        L_0x0032:
            r1 = 0
            X.EPs r0 = new X.EPs
            r0.<init>(r1)
            A01(r0, r6)
            if (r4 == 0) goto L_0x0047
            java.lang.Long r1 = r6.A00
            X.FkB r0 = new X.FkB
            r0.<init>(r4, r1)
            A01(r0, r6)
        L_0x0047:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x004a:
            X.0eS.A00(r4)
            com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator r1 = r6.A0B
            java.util.List r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r1.A00(r0, r5)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x005c:
            X.ME6 r5 = new X.ME6
            r5.<init>(r7)
            goto L_0x0016
        L_0x0062:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel.A00(com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel, X.4D7):java.lang.Object");
    }

    public static final void A02(QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        05G r4 = quickSnapArchiveViewModel.A0G;
        do {
        } while (!r4.AIY(r4.getValue(), new C61082JwK(new LinkedHashSet(), false)));
        A01(AeZ.A00, quickSnapArchiveViewModel);
    }

    public static final boolean A03(QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        if (quickSnapArchiveViewModel.A01.size() >= 5) {
            if (!182.A06(0Tu.A05, quickSnapArchiveViewModel.A05, 36325557784687653L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A05() {
        Object value;
        C47177Drs drs;
        boolean z;
        boolean z2;
        List list;
        boolean A032;
        boolean A062;
        boolean z3;
        boolean z4;
        if (this.A0C != AnonymousClass05K.A01) {
            1Av r5 = this.A06;
            0s0 r3 = r5.A6l;
            AnonymousClass0YZ[] r2 = 1Av.A8a;
            if (((Number) r3.CDM(r5, r2[519])).intValue() > 0) {
                r3.Epx(r5, 3, r2[519]);
            }
        }
        05G r32 = this.A0F;
        do {
            value = r32.getValue();
            drs = (C47177Drs) value;
            z = true;
            if (drs.A02 || (drs.A01.isEmpty() && !drs.A04)) {
                z2 = true;
            } else {
                z2 = false;
            }
            list = drs.A01;
            if (!list.isEmpty() || drs.A04) {
                z = false;
            }
            A032 = A03(this);
            A062 = 182.A06(0Tu.A05, this.A05, 2342168566998774827L);
            z3 = drs.A04;
            z4 = drs.A05;
        } while (!r32.AIY(value, new C47177Drs(list, drs.A00, z2, z, z3, A032, true, A062, z4, drs.A0B, drs.A07, drs.A06)));
        A02(this);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.G5D] */
    public final void A06() {
        C359098c0.A01(C391569tI.GENERATE_RECAP_VIDEO, this.A07, (String) null);
        if (this.A01.size() > 20) {
            A01(new Object(), this);
            return;
        }
        A01(new C65567Lvr(true), this);
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C318136oS A002 = C318116oQ.A00(this);
        MG3 mg3 = new MG3((Object) this, (AnonymousClass4D7) null, 17);
        19B r3 = 19B.A00;
        this.A02 = 1Eo.A04(r3, mg3, A002);
        C262204Co r02 = this.A03;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A03 = 1Eo.A04(r3, new C66166MGd((AnonymousClass4D7) null, (Object) this, 27), C318116oQ.A00(this));
    }

    public static final void A01(G5D g5d, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        C318136oS A002 = C318116oQ.A00(quickSnapArchiveViewModel);
        1Eo.A05(19B.A00, new C66166MGd(quickSnapArchiveViewModel, g5d, (AnonymousClass4D7) null, 28), A002);
    }

    public final void A04() {
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MG3((Object) this, (AnonymousClass4D7) null, 16), A002);
        QuickSnapRepository.A00(this.A09, C41740AzV.A00);
    }
}
