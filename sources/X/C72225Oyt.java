package X;

import android.util.Pair;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oyt  reason: case insensitive filesystem */
public final class C72225Oyt implements AnonymousClass11X {
    public final boolean A00;
    public final AnonymousClass7SD A01;
    public final DirectThreadKey A02;
    public final boolean A03;
    public volatile List A04;
    public final /* synthetic */ C330287Me A05;

    public final String getName() {
        return "ResnapshotTask";
    }

    public final int getRunnableId() {
        return 302;
    }

    public C72225Oyt(C330287Me r1, AnonymousClass7SD r2, DirectThreadKey directThreadKey, boolean z, boolean z2) {
        this.A05 = r1;
        this.A01 = r2;
        this.A02 = directThreadKey;
        this.A03 = z;
        this.A00 = z2;
    }

    public final void onCancel() {
        if (!this.A00) {
            this.A05.A0B.AUb();
        }
    }

    public final void onFinish() {
        C330287Me r5 = this.A05;
        r5.A00--;
        if (!r5.A03 && this.A04 != null) {
            r5.A09.DRu(this.A01, this.A04, r5.A01);
        }
        if (!this.A00) {
            r5.A0B.Eyv((String) null);
        }
        r5.A02 = null;
    }

    public final void onStart() {
        if (!this.A00) {
            this.A05.A0B.EwO((String) null);
        }
    }

    public final void run() {
        Pair pair;
        int i;
        String str;
        0fh.A01("IgRunnableId.RESNAPSHOT", 1942936115);
        try {
            C330287Me r5 = this.A05;
            AnonymousClass3SZ r2 = r5.A0A;
            if (r2 != null && !r5.A0D) {
                r5.A01 = 1bJ.A00(r5.A06).B6G(r2, this.A02);
                r5.A0D = true;
            }
            if (this.A00 || (pair = r5.A02) == null) {
                AnonymousClass7SD r3 = this.A01;
                ArrayList Aax = 1bJ.A00(r5.A06).Aax(this.A02, false);
                pair = new Pair(Aax, r5.A08.F03(r3, Aax));
            }
            List list = (List) pair.first;
            this.A04 = (List) pair.second;
            if (this.A01.A08 == 29) {
                if (182.A06(0Tu.A05, r5.A06, 36319407397870964L)) {
                    i = 591633841;
                    0fh.A00(i);
                }
            }
            if (this.A03 && (str = this.A02.A00) != null) {
                r5.A07.schedule(new C72223Oyr(r5.A06, str, list), 839614350, 4, false, false);
            }
            i = -95151762;
            0fh.A00(i);
        } catch (Throwable th) {
            0fh.A00(1418272586);
            throw th;
        }
    }
}
