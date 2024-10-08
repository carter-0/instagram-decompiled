package com.facebook.rti.push.service;

import X.0KC;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C12268SqN;
import X.C13720Tfl;
import X.C241803Rg;
import X.C51968G9o;
import X.C51973G9u;
import android.content.Context;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.HashMap;
import java.util.Map;

public final class FbnsAIDLService extends IFbnsAIDLService.Stub {
    public final Context A00;
    public final Map A01;

    public /* synthetic */ FbnsAIDLService(Context context, C13720Tfl tfl, C13720Tfl tfl2) {
        int A03 = AnonymousClass0fD.A03(426944757);
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A01 = A1E;
        C241803Rg r0 = C241803Rg.GET_PREF_BASED_CONFIG;
        C13720Tfl tfl3 = C12268SqN.A02;
        A1E.put(r0, tfl3);
        A1E.put(C241803Rg.SET_PREF_BASED_CONFIG, tfl3);
        C241803Rg r02 = C241803Rg.GET_ANALYTICS_CONFIG;
        C13720Tfl tfl4 = C12268SqN.A01;
        A1E.put(r02, tfl4);
        A1E.put(C241803Rg.SET_ANALYTICS_CONFIG, tfl4);
        C241803Rg r03 = C241803Rg.GET_PREF_IDS;
        C13720Tfl tfl5 = C12268SqN.A03;
        A1E.put(r03, tfl5);
        A1E.put(C241803Rg.SET_PREF_IDS, tfl5);
        this.A00 = context;
        A1E.put(C241803Rg.GET_APPS_STATISTICS, tfl);
        A1E.put(C241803Rg.GET_FLYTRAP_REPORT, tfl2);
        AnonymousClass0fD.A0A(-393220584, A03);
        AnonymousClass0fD.A0A(181612027, AnonymousClass0fD.A03(-450747708));
    }

    private C13720Tfl A00(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int i2;
        int A03 = AnonymousClass0fD.A03(1757836597);
        if (fbnsAIDLRequest == null || (i2 = fbnsAIDLRequest.A00) < 0) {
            0KC.A0C("FbnsAIDLService", "Invalid FbnsAIDLRequest");
            illegalArgumentException = AnonymousClass7TE.A0w("FbnsService received invalid FbnsAIDLRequest");
            i = 47240374;
        } else {
            C241803Rg r3 = (C241803Rg) C51968G9o.A10(C241803Rg.A02, i2);
            if (r3 == null) {
                r3 = C241803Rg.NOT_EXIST;
            }
            if (r3 == C241803Rg.NOT_EXIST) {
                illegalArgumentException = AnonymousClass7TE.A0w("FbnsService operation not found");
                i = -783403537;
            } else if (r3.A01 == z) {
                C13720Tfl tfl = (C13720Tfl) this.A01.get(r3);
                if (tfl != null) {
                    AnonymousClass0fD.A0A(143105443, A03);
                    return tfl;
                }
                illegalArgumentException = C51973G9u.A0g(r3, "FbnsService does not implement operation ", AnonymousClass7TE.A1A());
                i = 1761423386;
            } else {
                0KC.A0C("FbnsAIDLService", "FbnsAIDLOperation incorrect return type");
                illegalArgumentException = AnonymousClass7TE.A0w("FbnsService operation incorrect return type");
                i = -2746196;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
        throw illegalArgumentException;
    }

    public final FbnsAIDLResult E5l(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = AnonymousClass0fD.A03(91810972);
        C13720Tfl A002 = A00(fbnsAIDLRequest, true);
        Context context = this.A00;
        Bundle bundle = fbnsAIDLRequest.A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            0qQ.A08(bundle);
        }
        FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(A002.APv(context, bundle));
        AnonymousClass0fD.A0A(576271924, A03);
        return fbnsAIDLResult;
    }

    public final void FJO(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = AnonymousClass0fD.A03(812821291);
        C13720Tfl A002 = A00(fbnsAIDLRequest, false);
        Context context = this.A00;
        Bundle bundle = fbnsAIDLRequest.A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            0qQ.A08(bundle);
        }
        A002.AQ1(context, bundle);
        AnonymousClass0fD.A0A(283333045, A03);
    }
}
