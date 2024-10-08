package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.List;

public final class PCO implements AnonymousClass7ZA {
    public final UserSession A00;
    public final AnonymousClass7Z9 A01;
    public final PCP A02;
    public final 2Dm A03;

    public PCO(UserSession userSession, AnonymousClass7Z9 r3, PCP pcp, 2Dm r5) {
        0qQ.A0B(r5, 1);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = pcp;
        this.A00 = userSession;
    }

    public final 1aU A9n(Context context, C254793t3 r9, C67350MmR mmR, List list, List list2, int i) {
        return this.A02.A9n(context, r9, mmR, list, list2, i);
    }

    public final 1aU AGN(C254793t3 r2, List list) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU AGo(C254743sy r2, String str) {
        0qQ.A0B(str, 1);
        return this.A02.AGo(r2, str);
    }

    public final void AGp(Context context, C254793t3 r3, String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A02.AGp(context, r3, str, z);
    }

    public final 1aU AOf(C254793t3 r2, User user) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU APP(C254793t3 r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU ARj(C254793t3 r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU Cfq(Context context, C254743sy r3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Clk(C254793t3 r1, String str, String str2, int i) {
    }

    public final void Cll(C254793t3 r1) {
    }

    public final void Cm2(C376509Ig r6, C254793t3 r7, boolean z) {
        AnonymousClass3U9 B33;
        C254763t0 A022 = C300965yF.A02(r7);
        MsysThreadId A032 = C300965yF.A03(r7);
        if (!(A022 == null || (B33 = this.A03.B33(C327647Bq.A00(A022))) == null || !B33.Cdv(this.A00))) {
            this.A01.Cm2(r6, A022, false);
        }
        this.A02.Cm3(A032);
    }

    public final void Cm3(C254793t3 r2) {
        this.A02.Cm3(r2);
    }

    public final void Cm7(C254793t3 r1, String str, boolean z) {
    }

    public final void CmB(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
    }

    public final void Cmn(C254793t3 r1) {
    }

    public final void Cou(AnonymousClass0iw r2, C254743sy r3, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU Cow(AnonymousClass0iw r2, C254793t3 r3, boolean z) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cp3(AnonymousClass0iw r2, C254793t3 r3, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cp4(AnonymousClass0iw r2, C254793t3 r3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU E4f(C254793t3 r2, User user) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU EDT(C254793t3 r2, List list) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU EE7(C254793t3 r2, List list) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU EEQ(C254793t3 r2, List list) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU EEm(C254743sy r2) {
        return this.A02.EEm(r2);
    }

    public final void EGT(C254743sy r2) {
        0qQ.A0B(r2, 0);
    }

    public final void FHH(UserSession userSession, C242373Tu r9, C254793t3 r10, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        this.A02.FHH(userSession, r9, r10, i, z, z2);
    }

    public final void FHN(C254793t3 r3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r3, 0);
        this.A02.FHN(r3, z, z2, false);
    }

    public final void FIg(AnonymousClass0iw r2, C254743sy r3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU FIi(AnonymousClass0iw r2, C254793t3 r3, boolean z) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1aU FIn(AnonymousClass0iw r2, C254793t3 r3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FKs(String str, String str2, String str3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FKt(String str, String str2, String str3) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D8Q(C254783t2 r2) {
        this.A02.A00.A01();
    }

    public final void FHI(UserSession userSession, C254793t3 r3, Integer num, int i, int i2) {
        throw AnonymousClass7TE.A0z("Disappearing Mode isn't supported for msys threads.");
    }

    public final void Clg(C45376CvI cvI) {
        throw C66583MXo.A0Z();
    }

    public final 1aU EJz(C254743sy r3, String str, String str2, boolean z) {
        return this.A02.EJz(r3, str, str2, DbW.A1X(r3));
    }

    public final void Eyu(String str, String str2) {
        throw C66583MXo.A0Z();
    }
}
