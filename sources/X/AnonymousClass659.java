package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.659  reason: invalid class name */
public abstract class AnonymousClass659 extends 1P0 {
    public int A00;
    public C268654dm A01;
    public AnonymousClass11X A02;
    public AnonymousClass7BV A03;
    public final Long A04;
    public final String A05;
    public final List A06 = new ArrayList();
    public final /* synthetic */ AnonymousClass43O A07;

    public int A00() {
        return -1;
    }

    public void A02() {
        AnonymousClass6BH r4 = (AnonymousClass6BH) this;
        AnonymousClass43O r3 = r4.A07;
        r3.A06.A00(r4.A05, r4.A01);
        r3.A0B(r4);
        r3.A08.A0D(r4.A03, (Boolean) null, false);
        r4.A03();
    }

    public abstract void A04();

    public void A07(boolean z) {
        AnonymousClass6BH r4 = (AnonymousClass6BH) this;
        AnonymousClass43O r3 = r4.A07;
        AnonymousClass43T r2 = r3.A06;
        String str = r4.A05;
        String str2 = r4.A01;
        if (z) {
            r2.A00(str, str2);
            r3.A0B(r4);
        } else {
            r2.A01(str, str2);
        }
        r3.A08.A0D(r4.A03, Boolean.valueOf(z), true);
    }

    public AnonymousClass659(AnonymousClass43O r2, Long l) {
        this.A07 = r2;
        this.A04 = l;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A05 = obj;
    }

    public void A01() {
        String str;
        C66716MbN A0I;
        Integer num;
        AnonymousClass6BH r0 = (AnonymousClass6BH) this;
        String str2 = r0.A02;
        if (str2 != null) {
            str = "thread";
        } else {
            str = "participants";
        }
        ThreadFetchReason threadFetchReason = r0.A00;
        String fetchType = threadFetchReason.getFetchType();
        AnonymousClass43O r1 = r0.A07;
        AnonymousClass43S r4 = r1.A08;
        UserSession userSession = r1.A04;
        Long l = r0.A04;
        boolean A002 = r1.A05.A00();
        boolean A022 = 2Aj.A02(userSession);
        boolean z = r0.A05;
        String str3 = r0.A05;
        r0.A03 = r4.A0E(userSession, threadFetchReason, l, str2, str, "BaseSnapshotRequestManager", str3, A002, A022, z);
        if (str2 != null) {
            String str4 = r0.A01;
            if (str4 != null) {
                num = AnonymousClass05K.A01;
            } else {
                num = null;
            }
            A0I = DirectThreadApi.A0H(userSession, r0.A03, num, Integer.valueOf(DirectThreadApi.A00(userSession, fetchType)), l, str2, str4, r1.A07(), str3);
        } else {
            List list = r0.A04;
            if (list != null) {
                A0I = DirectThreadApi.A0I(userSession, r0.A03, Integer.valueOf(DirectThreadApi.A00(userSession, fetchType)), l, str3, list, z);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A0I.A00(r0);
        r0.A02 = A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r5 = this;
            X.4dm r4 = r5.A01
            if (r4 != 0) goto L_0x0008
            X.4dn r4 = X.AnonymousClass7BQ.A00()
        L_0x0008:
            java.lang.Object r3 = r4.A00()
            r0 = r3
            X.1XR r0 = (X.1XR) r0
            r2 = 1
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isOk()
            if (r0 != r2) goto L_0x002f
            X.4dm r0 = r5.A01
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r0.A00()
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x0037
            int r0 = r0.getStatusCode()
        L_0x0028:
            boolean r1 = X.C370788x4.A00(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0033
            r2 = 0
        L_0x0033:
            r5.A05(r4, r0, r2)
            return
        L_0x0037:
            r0 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass659.A03():void");
    }

    public final void A05(C268654dm r5, boolean z, boolean z2) {
        List<AnonymousClass7BP> list = this.A06;
        if (!list.isEmpty()) {
            for (AnonymousClass7BP r2 : list) {
                this.A07.A02.post(new C370908xG(r5, r2, z, z2));
            }
        }
    }

    public final void A06(AnonymousClass7BP r3) {
        this.A06.remove(r3);
        if (A08()) {
            AnonymousClass11X r1 = this.A02;
            if (r1 instanceof AnonymousClass1OD) {
                ((AnonymousClass1OD) r1).cancel();
            }
            this.A02 = null;
            this.A07.A0B.remove(this);
        }
    }

    public boolean A08() {
        if (!(this instanceof AnonymousClass6BH)) {
            return this.A06.isEmpty();
        }
        AnonymousClass6BH r1 = (AnonymousClass6BH) this;
        if (!r1.A06.isEmpty() || !r1.A03.isEmpty()) {
            return false;
        }
        return true;
    }

    public void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(734502534);
        0qQ.A0B(r4, 0);
        this.A01 = r4;
        this.A07.A03.obtainMessage(2, this).sendToTarget();
        AnonymousClass0fD.A0A(2000931836, A032);
    }

    public void onStart() {
        int A032 = AnonymousClass0fD.A03(1608393867);
        this.A00++;
        AnonymousClass0fD.A0A(1488939936, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(1636231786);
        int A033 = AnonymousClass0fD.A03(-1293103676);
        0qQ.A0B(obj, 0);
        this.A01 = new C268674do(obj);
        this.A07.A03.obtainMessage(2, this).sendToTarget();
        AnonymousClass0fD.A0A(-282096004, A033);
        AnonymousClass0fD.A0A(-989919707, A032);
    }
}
