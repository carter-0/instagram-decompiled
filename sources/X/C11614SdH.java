package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.SdH  reason: case insensitive filesystem */
public final class C11614SdH implements JS4 {
    public final Context A00;

    public final /* synthetic */ Object ALk(Context context, C10648Rvh rvh, AnonymousClass4D7 r13) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        1IW r3 = new 1IW(1, 1Ey.A02(r13));
        r3.A0I();
        CancellationSignal cancellationSignal = new CancellationSignal();
        r3.CO0(new C66310MMt(cancellationSignal, 2));
        C11615SdI sdI = new C11615SdI(r3);
        C265664Vr r8 = new C265664Vr();
        C10648Rvh rvh2 = rvh;
        0qQ.A0B(rvh, 1);
        C13762Tga A01 = new SGa(this.A00).A01();
        if (A01 == null) {
            sdI.DCo(new C8987RKd("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A01.onCreateCredential(context, rvh2, cancellationSignal, r8, sdI);
        }
        return r3.A0E();
    }

    public final /* synthetic */ Object Asl(Context context, C10339Rqc rqc, AnonymousClass4D7 r13) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        1IW r3 = new 1IW(1, 1Ey.A02(r13));
        r3.A0I();
        CancellationSignal cancellationSignal = new CancellationSignal();
        r3.CO0(new C66310MMt(cancellationSignal, 3));
        C11616SdJ sdJ = new C11616SdJ(r3);
        C265664Vr r8 = new C265664Vr();
        C10339Rqc rqc2 = rqc;
        0qQ.A0B(rqc, 1);
        Context context2 = context;
        C13762Tga A01 = new SGa(context).A01();
        if (A01 == null) {
            sdJ.DCo(new C8988RKe("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A01.onGetCredential(context2, rqc2, cancellationSignal, r8, sdJ);
        }
        return r3.A0E();
    }

    public C11614SdH(Context context) {
        this.A00 = context;
    }
}
