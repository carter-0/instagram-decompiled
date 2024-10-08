package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.FBc  reason: case insensitive filesystem */
public abstract class C49878FBc {
    public Activity A00;
    public Context A01;
    public SparseArray A02;
    public Window A03;
    public Fragment A04;
    public String A05;
    public List A06;
    public final 0lg A07;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0217, code lost:
        if (r1 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cf, code lost:
        if (r10.equals("Facebook") != false) goto L_0x01d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A02() {
        /*
            r16 = this;
            r7 = r16
            boolean r0 = r7 instanceof X.ELT
            if (r0 == 0) goto L_0x006b
            r2 = r7
            X.ELT r2 = (X.ELT) r2
            X.4fB r4 = X.C269474fB.A00
            X.4cw r3 = new X.4cw
            r3.<init>(r4)
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "PHOTO_MEDIA_PREVIEW_PICKER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "PHOTO_SETTINGS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "TOGGLE_CENTRAL_IDENTITY_SYNC"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "USERNAME_SETTINGS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "opt_in_flow_type"
            r3.A0E(r0, r1)
        L_0x0037:
            int r1 = r2.A00
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "requested_screen_component_type"
            r3.A0C(r0, r1)
        L_0x0040:
            r1 = 0
            java.lang.String r0 = "entry_point"
            r3.A0E(r0, r1)
            java.lang.String r0 = "origin"
            r3.A0E(r0, r1)
            java.lang.String r0 = "extra_string"
            r3.A0E(r0, r1)
            X.4cw r1 = X.DbX.A0L(r3, r4)
            X.FxW r0 = new X.FxW
            r0.<init>((X.C268194cw) r1, (X.ELT) r2)
            return r0
        L_0x005a:
            java.lang.String r0 = "flow"
            r3.A0E(r0, r1)
            X.0lg r0 = r2.A07
            int r1 = X.F5u.A00(r0)
            java.lang.String r0 = "cds_client_value"
            r3.A0C(r0, r1)
            goto L_0x0037
        L_0x006b:
            X.4fB r4 = X.C269474fB.A00
            X.4cw r3 = new X.4cw
            r3.<init>(r4)
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "flow"
            r3.A0E(r0, r1)
            java.lang.String r1 = "logging_event"
            java.lang.String r0 = "linking_flow_initiated"
            r3.A0E(r1, r0)
            X.0lg r8 = r7.A07
            int r1 = X.F5u.A00(r8)
            java.lang.String r0 = "cds_client_value"
            r3.A0C(r0, r1)
            java.util.List r1 = r7.A06
            if (r1 == 0) goto L_0x00b7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b7
            X.5E9 r5 = new X.5E9
            r5.<init>(r4)
            java.util.Iterator r2 = r1.iterator()
        L_0x009e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            if (r0 != 0) goto L_0x00b2
            X.9gL r1 = X.C383839gL.A00
        L_0x00ac:
            java.util.List r0 = r5.A00
            r0.add(r1)
            goto L_0x009e
        L_0x00b2:
            X.5Dv r1 = X.C282585Dv.A00(r0)
            goto L_0x00ac
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            java.lang.String r0 = "opaque_verified_native_auth_data"
            r3.A0B(r5, r0)
            java.util.List r6 = r7.A06
            java.lang.String r2 = r7.A05
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            r5 = 0
            if (r0 == 0) goto L_0x00e0
            if (r8 == 0) goto L_0x00e0
            androidx.fragment.app.Fragment r0 = r7.A04
            if (r0 == 0) goto L_0x020d
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
        L_0x00d0:
            X.02m r11 = X.02m.A0p
            r15 = 0
            java.lang.String r12 = "native_auth_token_experiment_group"
            r9 = 444800256(0x1a831d00, float:5.422718E-23)
            if (r6 == 0) goto L_0x00fc
            java.lang.String r0 = "targeted_upsell"
        L_0x00dc:
            r11.markerAnnotate(r9, r12, r0)
        L_0x00df:
            r5 = r15
        L_0x00e0:
            java.lang.String r0 = "native_auth_data"
            r3.A0B(r5, r0)
            if (r5 == 0) goto L_0x00ed
            r1 = 0
            java.lang.String r0 = "account_type"
            r3.A0C(r0, r1)
        L_0x00ed:
            X.4cw r0 = X.DbX.A0L(r3, r4)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "params"
            java.util.HashMap r0 = X.DbY.A0m(r0, r1)
            return r0
        L_0x00fc:
            java.util.List r0 = X.C49281EsQ.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00df
            X.0Tu r0 = X.0Tu.A05
            r6 = 36322134695421915(0x810aca000127db, double:3.0336024666572385E-306)
            boolean r0 = X.182.A06(r0, r8, r6)
            if (r0 == 0) goto L_0x0209
            r0 = 808(0x328, float:1.132E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r11.markerPoint(r9, r0)
            X.FG9.A01(r8, r0, r2, r5)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "Facebook"
            java.util.List r0 = X.FHC.A07(r1, r1, r8, r6)
            r10.addAll(r0)
            java.lang.String r7 = "FxNativeAuthDataHelper"
            java.lang.String r0 = "ig_android_access_library_fx_fetch_active_msgr_token"
            java.util.ArrayList r0 = X.FHC.A00(r1, r8, r0, r7)
            r10.addAll(r0)
            java.lang.String r0 = "evergreen_entry_point"
            r11.markerAnnotate(r9, r12, r0)
            r0 = 810(0x32a, float:1.135E-42)
            java.lang.String r1 = X.Pxd.A00(r0)
            r11.markerPoint(r9, r1)
            boolean r0 = X.DbT.A1b(r10)
            if (r0 == 0) goto L_0x01fb
            X.FG9.A01(r8, r1, r2, r5)
        L_0x014c:
            java.lang.String r9 = "app_source"
            java.lang.String r8 = "account_type"
            java.lang.String r7 = "account_source"
            X.5E9 r2 = new X.5E9
            r2.<init>(r4)
            java.util.Iterator r14 = r10.iterator()
        L_0x015b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0206
            java.lang.Object r10 = r14.next()
            boolean r0 = r10 instanceof java.util.Map
            if (r0 == 0) goto L_0x01f8
            java.util.Map r10 = (java.util.Map) r10
        L_0x016b:
            X.4cw r1 = new X.4cw
            r1.<init>(r4)
            if (r10 == 0) goto L_0x01f3
            java.util.Iterator r13 = X.AnonymousClass7TF.A0u(r10)     // Catch:{ JSONException -> 0x00df }
        L_0x0176:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x01f3
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r13)     // Catch:{ JSONException -> 0x00df }
            java.lang.String r11 = X.DbT.A13(r0)     // Catch:{ JSONException -> 0x00df }
            java.lang.String r10 = X.DbS.A0s(r0)     // Catch:{ JSONException -> 0x00df }
            int r0 = r11.hashCode()     // Catch:{ JSONException -> 0x00df }
            switch(r0) {
                case -1956766558: goto L_0x01e5;
                case 865238637: goto L_0x01db;
                case 1091441164: goto L_0x019a;
                case 1279816697: goto L_0x0190;
                default: goto L_0x018f;
            }     // Catch:{ JSONException -> 0x00df }
        L_0x018f:
            goto L_0x0176
        L_0x0190:
            boolean r0 = r11.equals(r9)     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x0176
            r1.A0E(r9, r10)     // Catch:{ JSONException -> 0x00df }
            goto L_0x0176
        L_0x019a:
            boolean r0 = r11.equals(r8)     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x0176
            r0 = 0
            X.0qQ.A0B(r10, r0)     // Catch:{ JSONException -> 0x00df }
            int r12 = r10.hashCode()     // Catch:{ JSONException -> 0x00df }
            r0 = 561774310(0x217bfee6, float:8.5379463E-19)
            r11 = 0
            if (r12 == r0) goto L_0x01cb
            r0 = 567859955(0x21d8daf3, float:1.4694685E-18)
            if (r12 == r0) goto L_0x01c2
            r0 = 2032871314(0x792b2792, float:5.5542834E34)
            if (r12 != r0) goto L_0x01d9
            java.lang.String r0 = "Instagram"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x00df }
            r11 = 1
            if (r0 != 0) goto L_0x01d1
            goto L_0x01d9
        L_0x01c2:
            java.lang.String r0 = "Messenger"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x00df }
            if (r0 != 0) goto L_0x01d1
            goto L_0x01d9
        L_0x01cb:
            boolean r0 = r10.equals(r6)     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x01d9
        L_0x01d1:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ JSONException -> 0x00df }
            r1.A0E(r8, r0)     // Catch:{ JSONException -> 0x00df }
            goto L_0x0176
        L_0x01d9:
            r11 = -1
            goto L_0x01d1
        L_0x01db:
            boolean r0 = r11.equals(r7)     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x0176
            r1.A0E(r7, r10)     // Catch:{ JSONException -> 0x00df }
            goto L_0x0176
        L_0x01e5:
            java.lang.String r0 = "auth_token"
            boolean r0 = r11.equals(r0)     // Catch:{ JSONException -> 0x00df }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = "access_token"
            r1.A0E(r0, r10)     // Catch:{ JSONException -> 0x00df }
            goto L_0x0176
        L_0x01f3:
            r2.A0B(r1)
            goto L_0x015b
        L_0x01f8:
            r10 = r5
            goto L_0x016b
        L_0x01fb:
            r0 = 809(0x329, float:1.134E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.FG9.A01(r8, r0, r2, r5)
            goto L_0x014c
        L_0x0206:
            r15 = r2
            goto L_0x00df
        L_0x0209:
            java.lang.String r0 = "control"
            goto L_0x00dc
        L_0x020d:
            android.app.Activity r1 = r7.A00
            if (r1 == 0) goto L_0x00e0
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x00e0
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            if (r1 != 0) goto L_0x00d0
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49878FBc.A02():java.util.Map");
    }

    public C49878FBc(Fragment fragment, 0lg r4) {
        Window window;
        this.A07 = r4;
        this.A04 = fragment;
        this.A01 = fragment.getContext();
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        this.A03 = window;
        this.A05 = "ig_default";
        this.A00 = null;
    }

    public void A03() {
        C48916EmG.A00().A01(this.A03);
    }

    public C49878FBc(Activity activity, 0lg r3) {
        this.A07 = r3;
        this.A03 = activity.getWindow();
        this.A05 = "ig_default";
        this.A00 = activity;
        this.A01 = activity.getApplicationContext();
        this.A04 = null;
    }
}
