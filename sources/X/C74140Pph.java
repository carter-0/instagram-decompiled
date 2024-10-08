package X;

import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;

/* renamed from: X.Pph  reason: case insensitive filesystem */
public final class C74140Pph extends 0Yg implements 0sP {
    public static final C74140Pph A00 = new C74140Pph();

    public C74140Pph() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallEndedApi callEndedApi = C66581MXm.A0j(obj).A01.A01;
        if (callEndedApi != null) {
            callEndedApi.removeCall();
        }
        return C60340gF.A00;
    }
}
