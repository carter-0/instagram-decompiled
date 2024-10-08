package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.FpA  reason: case insensitive filesystem */
public final class C51138FpA implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C51138FpA(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Runnable fvM;
        switch (this.A00) {
            case 0:
                0qQ.A0B(((N4P) this.A03).A0L, 0);
                ((JPL) this.A02).Cfo();
                return;
            case 1:
                if (!((C8918RFl) obj).A01) {
                    C252683pV r2 = (C252683pV) this.A03;
                    ((T7R) ((FEX) this.A04).A05.getValue()).A02((Activity) this.A01, (C7610QOs) this.A02, new C50180FSm(r2), new C10300Rpy(r2));
                    return;
                }
                C249523jv r1 = (C249523jv) this.A03;
                r1.FIG(C47863EKj.A00);
                r1.AI3((Throwable) null);
                return;
            case 2:
                Fe1 fe1 = (Fe1) this.A01;
                Bundle bundle = (Bundle) this.A02;
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) this.A03;
                UserSession userSession = (UserSession) this.A04;
                C257443xP r7 = (C257443xP) obj;
                if (r7.A06()) {
                    bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(((MsysThreadId) r7.A03()).A00));
                    bundle.putString(TraceFieldType.TransportType, C254923tH.ACT.A00);
                    fvM = new C51514FvM(bundle, fe1, baseFragmentActivity, userSession);
                    break;
                } else {
                    return;
                }
            default:
                Fe1 fe12 = (Fe1) this.A01;
                Bundle bundle2 = (Bundle) this.A02;
                BaseFragmentActivity baseFragmentActivity2 = (BaseFragmentActivity) this.A03;
                UserSession userSession2 = (UserSession) this.A04;
                C257443xP r72 = (C257443xP) obj;
                if (r72.A06()) {
                    bundle2.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(((MsysThreadId) r72.A03()).A00));
                    bundle2.putString("mid", "-1");
                    fvM = new C51515FvN(bundle2, fe12, baseFragmentActivity2, userSession2);
                    break;
                } else {
                    return;
                }
        }
        11Z.A02(fvM);
    }
}
