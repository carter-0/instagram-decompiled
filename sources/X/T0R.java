package X;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class T0R implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public T0R(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity, android.app.Activity] */
    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(th, 0);
                Intent A0F = Pxj.A0F(DbS.A09(), "result_operation_type", "refresh_access_token", th);
                0qQ.A07(A0F);
                ((00W) this.A01).Cti(new ActivityResult(0, A0F));
                SGW.A00.A00((C58840Ae) this.A02, AnonymousClass05K.A0u, this.A03, th.getMessage(), 2Og.A00(th), (Map) null, 0);
                return;
            case 1:
                0qQ.A0B(th, 0);
                ? r2 = (InstagramConsentFlowHostActivity) this.A02;
                if (!r2.isDestroyed()) {
                    C67628Mr1 mr1 = r2.A00;
                    if (mr1 == null) {
                        0qQ.A0F("loadingDialog");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    mr1.dismiss();
                }
                InstagramConsentFlowHostActivity.A01(r2, this.A03, "Error in InstagramConsentFlowHostActivity.launchBloksAction()", th);
                return;
            case 2:
                C308276Tl A0P = DbS.A0P();
                A0P.A01((Object) null);
                AnonymousClass6Tm A002 = A0P.A00();
                C299275ur.A00((C307896Rx) this.A01, A002, (C277014uI) this.A02);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity, android.app.Activity] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr r2;
        String str;
        Intent putExtra;
        00W r22;
        int i;
        int intValue;
        C250663lr A0U;
        String str2;
        Map map;
        switch (this.A00) {
            case 0:
                AnonymousClass3JD r10 = (AnonymousClass3JD) obj;
                Integer num = null;
                if (r10 == null || (A0U = C41845B3m.A0U(r10)) == null) {
                    r2 = null;
                    str = null;
                } else {
                    r2 = A0U.getOptionalTreeField(0, "xfb_oauth_account_linking_renew_access_token(auth_integration_id:$oauth_integration_id)", QUC.class, -549311167);
                    if (r2 != null) {
                        str = r2.getOptionalStringField(0, "access_token");
                        num = Integer.valueOf(r2.getCoercedIntField(1, "expiry_time"));
                    }
                    str = null;
                }
                if (r2 == null || str == null || num == null || (intValue = num.intValue()) == 0) {
                    putExtra = Pxi.A0B("result_operation_type", "refresh_access_token").putExtra("error", "NULL_ACCESS_TOKEN_OR_EXPIRY");
                    0qQ.A07(putExtra);
                    r22 = (00W) this.A01;
                    i = 0;
                } else {
                    putExtra = Pxi.A0B("result_operation_type", "refresh_access_token").putExtra("access_token", str).putExtra("access_token_expiry_time", intValue);
                    0qQ.A07(putExtra);
                    r22 = (00W) this.A01;
                    i = -1;
                }
                r22.Cti(new ActivityResult(i, putExtra));
                SGW.A00.A00((C58840Ae) this.A02, AnonymousClass05K.A0u, this.A03, (String) null, (String) null, (Map) null, 0);
                return;
            case 1:
                C46620Di0 di0 = (C46620Di0) obj;
                ? r1 = (InstagramConsentFlowHostActivity) this.A02;
                if (!r1.isDestroyed()) {
                    C67628Mr1 mr1 = r1.A00;
                    if (mr1 == null) {
                        str2 = "loadingDialog";
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    mr1.dismiss();
                }
                if (di0 != null) {
                    C48382Edd.A00((C229382nI) this.A01, di0);
                }
                02m r23 = r1.A01;
                if (r23 == null) {
                    str2 = "quickPerformanceLogger";
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                r23.markerEnd(192756491, 2);
                return;
            case 2:
                C277014uI r24 = (C277014uI) this.A02;
                C308276Tl A0P = DbS.A0P();
                if (obj != null) {
                    map = AnonymousClass7TF.A0w(this.A03, obj);
                } else {
                    map = null;
                }
                A0P.A01(map);
                C299275ur.A00((C307896Rx) this.A01, A0P.A00(), r24);
                return;
            default:
                try {
                    AnonymousClass8II.A0H.put(this.A03, ((File) this.A01).getCanonicalPath());
                } catch (IOException unused) {
                }
                ((0sP) this.A02).invoke(obj);
                return;
        }
    }
}
