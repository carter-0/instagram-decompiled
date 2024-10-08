package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.DEx  reason: case insensitive filesystem */
public final class C45917DEx implements 2Kw {
    public final int A00;
    public final Object A01;

    public C45917DEx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void invoke(Throwable th) {
        INA ina;
        String str;
        switch (this.A00) {
            case 0:
                XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback = (XplatRemoteModelVersionFetchCompletionCallback) this.A01;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                xplatRemoteModelVersionFetchCompletionCallback.onFailure(message);
                return;
            case 1:
                0qQ.A0A(th);
                ((C45948DGc) this.A01).onFailure(th);
                return;
            case 2:
                ((DQZ) this.A01).DfV((String) null);
                return;
            case 3:
                ((C46204DQh) this.A01).DED();
                return;
            case 4:
                ((0sP) this.A01).invoke(th.toString());
                return;
            case 5:
                C45369CvB cvB = (C45369CvB) this.A01;
                0qQ.A0A(th);
                InAppPurchaseControllerCoro.A0B(cvB.A00, cvB.A01, 0Yt.A0E());
                return;
            case 6:
                SchoolSettingsRepository schoolSettingsRepository = (SchoolSettingsRepository) this.A01;
                SchoolSettingsRepository.A01(schoolSettingsRepository, AnonymousClass05K.A0N);
                ina = (INA) schoolSettingsRepository.A02.getValue();
                str = "failed to update school banner visibility";
                break;
            case 7:
                SchoolSettingsRepository schoolSettingsRepository2 = (SchoolSettingsRepository) this.A01;
                SchoolSettingsRepository.A01(schoolSettingsRepository2, AnonymousClass05K.A0N);
                ina = (INA) schoolSettingsRepository2.A02.getValue();
                str = "failed to update school banner name";
                break;
            case 8:
                ((C19850WgV) this.A01).A01.A00();
                return;
            case 9:
                0qQ.A0A(th);
                0qQ.A0B(th, 0);
                1IX r2 = ((C45949DGd) this.A01).A01;
                C297815sO A0c = C41845B3m.A0c(new CTf(th));
                if (r2 != null && r2.isActive()) {
                    r2.resumeWith(A0c);
                    return;
                }
                return;
            default:
                C249523jv r1 = (C249523jv) this.A01;
                r1.FIG(C41845B3m.A0c(new CTf(th)));
                r1.AI3((Throwable) null);
                return;
        }
        ina.A07(str);
    }
}
