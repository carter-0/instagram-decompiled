package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.List;

/* renamed from: X.Nbn  reason: case insensitive filesystem */
public final class C68961Nbn extends AnonymousClass659 {
    public final List A00;
    public final /* synthetic */ AnonymousClass43O A01;

    public final void A07(boolean z) {
        AnonymousClass43O r2 = this.A01;
        AnonymousClass43T r1 = r2.A06;
        String str = this.A05;
        if (z) {
            r1.A00(str, (String) null);
        } else {
            r1.A01(str, (String) null);
        }
        r2.A08.A0D(this.A03, Boolean.valueOf(z), true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68961Nbn(AnonymousClass43O r2, Long l, List list) {
        super(r2, l);
        this.A01 = r2;
        this.A00 = 00k.A0Z(list);
    }

    public final void A01() {
        AnonymousClass43O r0 = this.A01;
        AnonymousClass43S r3 = r0.A08;
        UserSession userSession = r0.A04;
        this.A03 = r3.A0E(userSession, ThreadFetchReason.EAGER_THREAD_RESOLUTION, this.A04, (String) null, "participants", "EagerThreadResolutionSnapshotHttpRequest", this.A05, r0.A05.A00(), 182.A06(0Tu.A05, userSession, 2342161901214702258L), false);
        1OC A0D = DirectThreadApi.A0D(userSession, DbV.A0s(), (String) null, this.A00);
        A0D.A00 = this;
        this.A02 = A0D;
    }

    public final void A02() {
        AnonymousClass43O r2 = this.A01;
        r2.A06.A00(this.A05, (String) null);
        r2.A08.A0D(this.A03, (Boolean) null, false);
        A03();
    }

    public final void A04() {
        C370538wd r8;
        C254703su BKv;
        Long l;
        0wj r1;
        String str;
        C268654dm r0 = this.A01;
        if (!(r0 == null || (r8 = (C370538wd) r0.A00()) == null)) {
            if (r8.isOk()) {
                if (r8.A0Z == null) {
                    DbT.A1Q(0wj.A01, 002.A05(r8.A0I, "Create_group_thread snapshot returns null btv map: threadType = ", " threadId = ", r8.A1D), 817904752);
                }
                AnonymousClass43O r5 = this.A01;
                2Dm r4 = r5.A09;
                String str2 = r8.A1D;
                0qQ.A07(str2);
                AnonymousClass3U9 A0d = C66580MXl.A0d(r4, str2);
                if (!(A0d == null || (BKv = A0d.BKv()) == null)) {
                    long C7c = BKv.C7c();
                    List list = r8.A07;
                    0qQ.A07(list);
                    C254703su r02 = (C254703su) 00k.A0L(list);
                    if (r02 != null) {
                        l = Long.valueOf(r02.C7c());
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        r1 = (0wj) r5.A0D.getValue();
                        str = "ThreadPagedResult doesn't contain any message";
                    } else if (l.longValue() < C7c) {
                        r1 = (0wj) r5.A0D.getValue();
                        str = "last item timestamp regressed";
                    }
                    DbT.A1Q(r1, str, 817896272);
                }
                AnonymousClass43S r2 = r5.A08;
                r2.A04(this.A03);
                r4.FKy(r8, r8.A0o, r8, false);
                r2.A03(this.A03);
            }
            AnonymousClass43O r7 = this.A01;
            AnonymousClass43T r03 = r7.A06;
            String str3 = this.A05;
            r03.A02(str3, (String) null);
            AnonymousClass43O.A01(r7, r8, (String) null, str3, "makeup_for_eager_thread_resolution_due_to_instamadillo_failure", (String) null);
        }
        A03();
        this.A01.A08.A0C(this.A03);
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 1610205903);
        this.A01.A08.A02(r4, this.A03);
        super.onFail(r4);
        AnonymousClass0fD.A0A(-280248420, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1030414179);
        super.onStart();
        if (this.A00 == 1) {
            this.A01.A06.A04(this.A05, (String) null, (String) null);
        }
        AnonymousClass43O r2 = this.A01;
        r2.A06.A03(this.A05, (String) null, (String) null);
        r2.A08.A05(this.A03);
        AnonymousClass0fD.A0A(-189432499, A03);
    }

    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A01(this.A00, "recipients");
        A002.A01(this.A04, "seqId");
        return DbT.A10(A002);
    }
}
