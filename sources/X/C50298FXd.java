package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FXd  reason: case insensitive filesystem */
public final class C50298FXd implements C252243on {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C50298FXd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        switch (this.A00) {
            case 1:
                if (i2 == -1) {
                    ? r2 = (IgFragmentActivity) this.A01;
                    ((C49877FBb) this.A02).A01(DbT.A05(r2), (C46401DeO) null, i, -1);
                    r2.onBackPressed();
                    return;
                }
                return;
            case 3:
                IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A01;
                igFragmentActivity.unregisterOnActivityResultListener(this);
                Intent intent2 = intent;
                if (intent != null) {
                    SUL sul = (SUL) this.A02;
                    long longExtra = intent2.getLongExtra(AnonymousClass000.A00(878), 0);
                    1Wj r3 = 1Wj.A00;
                    if (r3 != null) {
                        C7572QKn qKn = sul.A1L;
                        Bundle bundle = qKn.A00;
                        String A002 = Pxd.A00(171);
                        if (bundle.getString(A002) != null) {
                            Bundle bundle2 = qKn.A00;
                            String A003 = Pxd.A00(174);
                            if (bundle2.getString(A003) != null) {
                                Bundle bundle3 = qKn.A00;
                                String A004 = Pxd.A00(579);
                                if (bundle3.getString(A004, (String) null) != null && longExtra >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                                    JSONObject A11 = DbS.A11();
                                    try {
                                        A11.put("ad_id", qKn.A00.getString(A002));
                                        A11.put(AnonymousClass000.A00(1080), qKn.A00.getString(A004, (String) null));
                                        HashMap A1E = AnonymousClass7TE.A1E();
                                        A1E.put("ad_id", qKn.A00.getString(A002));
                                        A1E.put("ad_tracking_token", qKn.A00.getString(A003));
                                        A1E.put(AnonymousClass000.A00(3266), String.valueOf(longExtra));
                                        1OC A005 = VC9.A00(sul.A1K, AnonymousClass000.A00(683), A11.toString());
                                        A005.A00 = new C15625Ufr(14, A1E, r3, sul);
                                        igFragmentActivity.schedule(A005);
                                        return;
                                    } catch (JSONException unused) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
        if (2 - this.A00 == 0) {
            ((1Ng) this.A01).A02((1wn) this.A02, 1qJ.class);
        }
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.A00 == 0) {
            0qQ.A0B(view, 0);
            2el r2 = ((RecentAdActivityFragment) this.A02).A03;
            if (r2 == null) {
                0qQ.A0F("viewpointManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A08(view, (C71642eY) this.A01, new AnonymousClass2eo[0]);
            }
        }
    }
}
