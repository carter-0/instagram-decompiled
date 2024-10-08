package com.instagram.nux.activity;

import X.09i;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass08W;
import X.AnonymousClass0aP;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.C66588MXu;
import X.DbT;
import X.DbU;
import X.DbX;
import X.FGH;
import android.content.Context;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class BloksSignedOutFragmentActivity extends BaseFragmentActivity implements AnonymousClass0iw, AnonymousClass08W {
    public AnonymousClass0aP A00;
    public FGH A01;

    public final String getModuleName() {
        return "bloks_signed_out";
    }

    public final void A0j(Bundle bundle) {
        FGH fgh = this.A01;
        if (fgh == null) {
            0qQ.A0F("maaLoginHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            fgh.A04();
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, X.08W, com.instagram.nux.activity.BloksSignedOutFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1100969292);
        Bundle A003 = C66588MXu.A00(bundle);
        DbX.A0z(this);
        AnonymousClass0aP A03 = 09i.A0A.A03(this);
        this.A00 = A03;
        Context A05 = DbT.A05(this);
        Bundle A06 = DbU.A06(this);
        if (A06 == null) {
            A06 = AnonymousClass7TE.A0a();
        }
        this.A01 = new FGH(A05, A06, this, A03);
        super.onCreate(A003);
        AnonymousClass0fD.A07(-1083771071, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(712332607);
        super.onDestroy();
        FGH fgh = this.A01;
        if (fgh == null) {
            0qQ.A0F("maaLoginHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        fgh.A05();
        AnonymousClass0fD.A07(-791344193, A002);
    }

    public final void onStop() {
        int A002 = AnonymousClass0fD.A00(295205600);
        super.onStop();
        FGH fgh = this.A01;
        if (fgh == null) {
            0qQ.A0F("maaLoginHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        fgh.A0A.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A07(-17853596, A002);
    }
}
