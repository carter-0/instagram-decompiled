package X;

import com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* renamed from: X.Omk  reason: case insensitive filesystem */
public final class C71549Omk implements C66498MUb {
    public final UserSession A00;
    public final AnonymousClass3Q2 A01;
    public final AnonymousClass12V A02;

    public C71549Omk(AnonymousClass12V r2, UserSession userSession, AnonymousClass3Q2 r4) {
        0qQ.A0B(r2, 3);
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r2;
    }

    public final void AGB(C66373MPe mPe) {
        0qQ.A0B(mPe, 0);
        if (mPe instanceof C71548Omj) {
            C262204Co r1 = ((C71548Omj) mPe).A01;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            } else {
                0qQ.A0F("job");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw AnonymousClass7TE.A0w("handle is not a MemFbUploadJobHandle");
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MPe, X.Omj, java.lang.Object] */
    public final C66373MPe Ewf(C11224SFy sFy, C11420SSw sSw, C13816Thj thj) {
        0qQ.A0B(sSw, 0);
        ? obj = new Object();
        obj.A01 = C51966G9m.A1L(new MemFbUploader$startAsyncUploadJob$job$1(sSw, thj, obj, this, (AnonymousClass4D7) null), 19E.A02(this.A02.AOJ(319, 2)));
        return obj;
    }

    public final C11286SJe FNE(C66373MPe mPe) {
        0qQ.A0B(mPe, 0);
        if (mPe instanceof C71548Omj) {
            C67351tA.A00(19B.A00, new C59676JTh((Object) mPe, (AnonymousClass4D7) null, 35));
            C11286SJe sJe = ((C71548Omj) mPe).A00;
            if (sJe != null) {
                return sJe;
            }
            throw new C8989RKf((Exception) null, "Upload result is null", Collections.emptyMap(), 0, 0, false);
        }
        throw AnonymousClass7TE.A0w("handle is not a MemFbUploadJobHandle");
    }
}
