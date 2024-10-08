package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.ml.remotepresence.RpModelDownloadManager;

/* renamed from: X.LcP  reason: case insensitive filesystem */
public final class C64462LcP implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64462LcP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(th, 0);
                RpModelDownloadManager.A01((C59723JVh) this.A01, th);
                return;
            case 3:
                0qQ.A0B(th, 0);
                ((AnonymousClass4D7) this.A01).resumeWith(new ONX(-1, "", th.getMessage()));
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C262224Cq r5;
        0sL r4;
        AnonymousClass4D7 r42;
        int i;
        ONX onx;
        int i2;
        switch (this.A00) {
            case 0:
                RpModelDownloadManager.A00((C59723JVh) this.A01, (ImmutableMap) obj);
                return;
            case 1:
                C63674L2k l2k = (C63674L2k) obj;
                if (l2k != null) {
                    LA3 la3 = l2k.A00;
                    r5 = (C262224Cq) this.A01;
                    r4 = new C59845JaL((AnonymousClass4D7) null, this.A02, (Object) la3, 33);
                    break;
                } else {
                    return;
                }
            case 2:
                C63673L2j l2j = (C63673L2j) obj;
                if (l2j != null) {
                    L8W l8w = l2j.A00;
                    r5 = (C262224Cq) this.A01;
                    r4 = new MGD(l8w, this.A02, (AnonymousClass4D7) null, 18);
                    break;
                } else {
                    return;
                }
            default:
                C8749R7n r7n = (C8749R7n) obj;
                if (r7n != null) {
                    String str = r7n.A01;
                    if (str.length() != 0 && (i2 = r7n.A00) == 200) {
                        r42 = (AnonymousClass4D7) this.A01;
                        onx = new ONX(i2, str, (String) null);
                        r42.resumeWith(onx);
                        return;
                    }
                }
                r42 = (AnonymousClass4D7) this.A01;
                if (r7n != null) {
                    i = r7n.A00;
                } else {
                    i = -1;
                }
                onx = new ONX(i, "", "bad response");
                r42.resumeWith(onx);
                return;
        }
        AnonymousClass7TE.A1Z(r4, r5);
    }
}
