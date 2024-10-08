package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FXb  reason: case insensitive filesystem */
public final class C50296FXb implements C252243on {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C50296FXb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.Fde} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.Fdf} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.F2p] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0138, code lost:
        if (r10.A00.A03 == null) goto L_0x013a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r8 = r17
            int r0 = r8.A00
            r6 = r18
            r5 = r19
            r7 = r20
            switch(r0) {
                case 0: goto L_0x026a;
                case 1: goto L_0x009b;
                case 2: goto L_0x0262;
                case 3: goto L_0x000d;
                case 4: goto L_0x00d1;
                case 5: goto L_0x000e;
                case 6: goto L_0x0262;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r2 = r8.A01
            X.EO2 r2 = (X.EO2) r2
            r0 = -1
            switch(r18) {
                case 68681: goto L_0x0081;
                case 68682: goto L_0x0029;
                case 68683: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            return
        L_0x0017:
            if (r5 != r0) goto L_0x000d
            if (r20 == 0) goto L_0x000d
            java.lang.String r1 = r7.getAction()
            if (r1 == 0) goto L_0x000d
            X.DlJ r0 = X.EO2.A00(r2)
            r0.A05(r1)
            return
        L_0x0029:
            r13 = 0
            if (r5 != r0) goto L_0x0077
            if (r20 == 0) goto L_0x0056
            java.lang.String r0 = "argument_opal_selected_audience_count"
            int r11 = r7.getIntExtra(r0, r13)
            java.lang.String r0 = "argument_opal_selected_audience_facepile_list"
            android.os.Parcelable[] r6 = r7.getParcelableArrayExtra(r0)
            if (r6 == 0) goto L_0x0057
            int r5 = r6.length
            java.util.ArrayList r4 = X.DbS.A0v(r5)
            r3 = 0
        L_0x0042:
            if (r3 >= r5) goto L_0x0051
            r1 = r6[r3]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.data.OpalAudienceSelectorRepository.OpalAudience"
            X.0qQ.A0C(r1, r0)
            r4.add(r1)
            int r3 = r3 + 1
            goto L_0x0042
        L_0x0051:
            java.util.List r10 = X.00k.A0a(r4)
            goto L_0x0059
        L_0x0056:
            r11 = 0
        L_0x0057:
            X.0sn r10 = X.0sn.A00
        L_0x0059:
            X.DlJ r1 = X.EO2.A00(r2)
            X.0Ud r0 = r1.A06
            java.lang.Object r0 = r0.getValue()
            X.Dry r0 = (X.C47183Dry) r0
            com.instagram.opal.impl.data.OpalProfileData r3 = r0.A05
            r4 = 0
            r12 = 5119(0x13ff, float:7.173E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r14 = r13
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A04(r0)
        L_0x0077:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x000d
            r2.A0A = r13
            X.EO2.A02(r2)
            return
        L_0x0081:
            if (r5 != r0) goto L_0x000d
            if (r20 == 0) goto L_0x000d
            java.lang.String r0 = "argument_update_profile_data"
            android.os.Parcelable r1 = r7.getParcelableExtra(r0)
            com.instagram.opal.impl.data.OpalProfileData r1 = (com.instagram.opal.impl.data.OpalProfileData) r1
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x000d
            X.DlJ r0 = X.EO2.A00(r2)
            r0.A04(r1)
            return
        L_0x009b:
            java.lang.Object r2 = r8.A01
            X.OsH r2 = (X.C71874OsH) r2
            r0 = 15739(0x3d7b, float:2.2055E-41)
            if (r6 != r0) goto L_0x00c2
            if (r20 == 0) goto L_0x00c2
            r1 = 0
            r0 = 2577(0xa11, float:3.611E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00c2
            X.4DH r0 = r2.A0A
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x000d
            X.00N r0 = r0.getOnBackPressedDispatcher()
            r0.A04()
            return
        L_0x00c2:
            X.OyY r0 = r2.A0F
            X.OO3 r0 = r0.A01
            if (r0 == 0) goto L_0x000d
            java.util.concurrent.ScheduledFuture r1 = r0.A09
            if (r1 == 0) goto L_0x000d
            r0 = 1
            r1.cancel(r0)
            return
        L_0x00d1:
            java.lang.Object r0 = r8.A01
            X.FEn r0 = (X.C49914FEn) r0
            java.util.List r3 = r0.A04
            monitor-enter(r3)
            r10 = 0
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x025f }
        L_0x00dd:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x025a
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x025f }
            X.EuC r4 = (X.C49348EuC) r4     // Catch:{ all -> 0x025f }
            int r0 = r4.A00     // Catch:{ all -> 0x025f }
            if (r6 != r0) goto L_0x00dd
            boolean r0 = r4 instanceof X.C47910EMe     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x0167
            r2 = r4
            X.EMe r2 = (X.C47910EMe) r2     // Catch:{ all -> 0x025f }
            r0 = 0
            if (r20 == 0) goto L_0x011a
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ all -> 0x025f }
            if (r1 == 0) goto L_0x011a
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ all -> 0x025f }
            java.lang.String r6 = "com.google.android.gms.credentials.Credential"
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x025f }
            if (r1 == 0) goto L_0x011a
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ all -> 0x025f }
            android.os.Parcelable r1 = r1.getParcelable(r6)     // Catch:{ all -> 0x025f }
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1     // Catch:{ all -> 0x025f }
            if (r1 == 0) goto L_0x011a
            X.Fde r10 = new X.Fde     // Catch:{ all -> 0x025f }
            r10.<init>(r1)     // Catch:{ all -> 0x025f }
        L_0x011a:
            boolean r1 = r2.A04     // Catch:{ all -> 0x025f }
            if (r1 != 0) goto L_0x012e
            X.0lg r6 = r2.A00     // Catch:{ all -> 0x025f }
            X.DiE r1 = r2.A03     // Catch:{ all -> 0x025f }
            if (r10 == 0) goto L_0x012b
            com.google.android.gms.auth.api.credentials.Credential r0 = r10.A00     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x025f }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x025f }
        L_0x012b:
            X.C49914FEn.A00(r6, r1, r0, r5)     // Catch:{ all -> 0x025f }
        L_0x012e:
            r1 = 0
            if (r10 == 0) goto L_0x013a
            r10.getUsername()     // Catch:{ all -> 0x025f }
            com.google.android.gms.auth.api.credentials.Credential r0 = r10.A00     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x025f }
            if (r0 != 0) goto L_0x0148
        L_0x013a:
            X.1WP r0 = X.1WP.getInstance()     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x0148
            X.1WP r0 = X.1WP.getInstance()     // Catch:{ all -> 0x025f }
            com.instagram.login.smartlock.impl.SmartLockPluginImpl r0 = (com.instagram.login.smartlock.impl.SmartLockPluginImpl) r0     // Catch:{ all -> 0x025f }
            r0.A00 = r1     // Catch:{ all -> 0x025f }
        L_0x0148:
            X.Fdf r12 = new X.Fdf     // Catch:{ all -> 0x025f }
            r12.<init>(r10)     // Catch:{ all -> 0x025f }
            X.G85 r0 = r2.A02     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x0163
            if (r19 != 0) goto L_0x0158
            r0.Cok()     // Catch:{ all -> 0x025f }
            goto L_0x0259
        L_0x0158:
            if (r10 == 0) goto L_0x015b
            goto L_0x0160
        L_0x015b:
            r0.Crh()     // Catch:{ all -> 0x025f }
            goto L_0x0259
        L_0x0160:
            r10.getUsername()     // Catch:{ all -> 0x025f }
        L_0x0163:
            X.Tek r0 = r2.A01     // Catch:{ all -> 0x025f }
            goto L_0x0256
        L_0x0167:
            boolean r0 = r4 instanceof X.C47909EMd     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x01e0
            r9 = r4
            X.EMd r9 = (X.C47909EMd) r9     // Catch:{ all -> 0x025f }
            X.1WP r0 = X.1WP.getInstance()     // Catch:{ all -> 0x025f }
            r8 = 1
            if (r0 == 0) goto L_0x017d
            X.1WP r0 = X.1WP.getInstance()     // Catch:{ all -> 0x025f }
            com.instagram.login.smartlock.impl.SmartLockPluginImpl r0 = (com.instagram.login.smartlock.impl.SmartLockPluginImpl) r0     // Catch:{ all -> 0x025f }
            r0.A00 = r8     // Catch:{ all -> 0x025f }
        L_0x017d:
            r7 = -1
            if (r5 != r7) goto L_0x0190
            X.0xa r0 = X.DbV.A0d()     // Catch:{ all -> 0x025f }
            X.0xY r1 = r0.AR4()     // Catch:{ all -> 0x025f }
            java.lang.String r0 = "preference_smartlock_credential_have_been_saved"
            r1.E5T(r0, r8)     // Catch:{ all -> 0x025f }
            r1.apply()     // Catch:{ all -> 0x025f }
        L_0x0190:
            boolean r0 = r9.A03     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x01ae
            if (r5 != r7) goto L_0x01ab
            X.0lg r6 = r9.A00     // Catch:{ all -> 0x025f }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x025f }
            java.lang.String r0 = "login_smartlock_save_impression_save_clicked"
            java.lang.String r2 = "login_smart_lock"
            java.lang.String r1 = "smartlock"
            X.C319616qu.A01(r6, r0, r2, r1, r10)     // Catch:{ all -> 0x025f }
            java.lang.String r0 = "login_smartlock_save_success"
            X.C319616qu.A01(r6, r0, r2, r1, r10)     // Catch:{ all -> 0x025f }
            goto L_0x01d3
        L_0x01ab:
            if (r19 != 0) goto L_0x01d3
            goto L_0x01c4
        L_0x01ae:
            X.0lg r6 = r9.A00     // Catch:{ all -> 0x025f }
            X.DiE r0 = r9.A02     // Catch:{ all -> 0x025f }
            if (r0 != 0) goto L_0x01b6
            r2 = 0
            goto L_0x01b8
        L_0x01b6:
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x025f }
        L_0x01b8:
            boolean r1 = X.AnonymousClass7TF.A1S(r5, r7)     // Catch:{ all -> 0x025f }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x025f }
            X.C49956FGl.A05(r6, r2, r10, r1, r8)     // Catch:{ all -> 0x025f }
            goto L_0x01d3
        L_0x01c4:
            X.0lg r6 = r9.A00     // Catch:{ all -> 0x025f }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x025f }
            java.lang.String r2 = "login_smartlock_save_impression_save_cancelled"
            java.lang.String r1 = "login_smart_lock"
            java.lang.String r0 = "smartlock"
            X.C319616qu.A01(r6, r2, r1, r0, r10)     // Catch:{ all -> 0x025f }
        L_0x01d3:
            X.Tek r1 = r9.A01     // Catch:{ all -> 0x025f }
            if (r5 == r7) goto L_0x01d8
            r8 = 0
        L_0x01d8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x025f }
            r1.D5D(r0)     // Catch:{ all -> 0x025f }
            goto L_0x0259
        L_0x01e0:
            r2 = r4
            X.EMc r2 = (X.C47908EMc) r2     // Catch:{ all -> 0x025f }
            r12 = 0
            r6 = -1
            if (r5 != r6) goto L_0x024d
            if (r20 == 0) goto L_0x024d
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ all -> 0x025f }
            r1.getClass()     // Catch:{ all -> 0x025f }
            java.lang.String r0 = "com.google.android.gms.credentials.Credential"
            android.os.Parcelable r7 = r1.getParcelable(r0)     // Catch:{ all -> 0x025f }
            com.google.android.gms.auth.api.credentials.Credential r7 = (com.google.android.gms.auth.api.credentials.Credential) r7     // Catch:{ all -> 0x025f }
            r7.getClass()     // Catch:{ all -> 0x025f }
            java.lang.String r5 = r7.A01     // Catch:{ all -> 0x025f }
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ all -> 0x025f }
            boolean r0 = X.DbV.A1b(r5, r0)     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x0207
            r9 = r5
            goto L_0x0211
        L_0x0207:
            java.util.regex.Pattern r0 = android.util.Patterns.PHONE     // Catch:{ all -> 0x025f }
            boolean r0 = X.DbV.A1b(r5, r0)     // Catch:{ all -> 0x025f }
            r9 = r10
            if (r0 == 0) goto L_0x0211
            r10 = r5
        L_0x0211:
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x025f }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x025f }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x025f }
        L_0x021b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x025f }
            com.google.android.gms.auth.api.credentials.IdToken r0 = (com.google.android.gms.auth.api.credentials.IdToken) r0     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x025f }
            r1.add(r0)     // Catch:{ all -> 0x025f }
            goto L_0x021b
        L_0x022d:
            java.lang.String r11 = r7.A02     // Catch:{ all -> 0x025f }
            android.net.Uri r0 = r7.A00     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x0237
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x025f }
        L_0x0237:
            java.lang.String r13 = r7.A04     // Catch:{ all -> 0x025f }
            java.lang.String r14 = r7.A05     // Catch:{ all -> 0x025f }
            java.lang.String r15 = r7.A06     // Catch:{ all -> 0x025f }
            X.F2p r8 = new X.F2p     // Catch:{ all -> 0x025f }
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x025f }
            X.0lg r1 = r2.A00     // Catch:{ all -> 0x025f }
            X.DiE r0 = r2.A02     // Catch:{ all -> 0x025f }
            X.C49914FEn.A00(r1, r0, r5, r6)     // Catch:{ all -> 0x025f }
            r12 = r8
            goto L_0x0254
        L_0x024d:
            X.0lg r1 = r2.A00     // Catch:{ all -> 0x025f }
            X.DiE r0 = r2.A02     // Catch:{ all -> 0x025f }
            X.C49914FEn.A00(r1, r0, r10, r5)     // Catch:{ all -> 0x025f }
        L_0x0254:
            X.Tek r0 = r2.A01     // Catch:{ all -> 0x025f }
        L_0x0256:
            r0.D5D(r12)     // Catch:{ all -> 0x025f }
        L_0x0259:
            r10 = r4
        L_0x025a:
            r3.remove(r10)     // Catch:{ all -> 0x025f }
            monitor-exit(r3)     // Catch:{ all -> 0x025f }
            return
        L_0x025f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x025f }
            throw r0
        L_0x0262:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r0.onActivityResult(r6, r5, r7)
            return
        L_0x026a:
            r0 = 9
            if (r6 != r0) goto L_0x0287
            java.lang.Object r4 = r8.A01
            X.FXh r4 = (X.C50302FXh) r4
            X.4tV r3 = r4.A08
            r1 = 48
            X.4uI r0 = r3.A0A(r1)
            if (r0 == 0) goto L_0x0287
            X.4uI r2 = r3.A0A(r1)
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            X.6Rm r0 = r4.A07
            X.C307886Rw.A03(r0, r3, r1, r2)
        L_0x0287:
            java.lang.Object r0 = r8.A01
            X.FXh r0 = (X.C50302FXh) r0
            X.6Rm r0 = r0.A07
            X.C308206Td.A0J(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50296FXb.onActivityResult(int, int, android.content.Intent):void");
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
        if (3 - this.A00 == 0) {
            Dd4 dd4 = (Dd4) this.A01;
            UserSession userSession = dd4.A0A;
            AnonymousClass1Nd.A00(userSession).A02(dd4.A01, FW3.class);
            AnonymousClass1Nd.A00(userSession).A02(dd4.A02, FW4.class);
            dd4.A07.unregisterLifecycleListener(this);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        if (7 - this.A00 == 0) {
            C49915FEp fEp = (C49915FEp) this.A01;
            UserSession userSession = fEp.A07;
            AnonymousClass1Nd.A00(userSession).A02(fEp.A06, C50265FVw.class);
            AnonymousClass1Nd.A00(userSession).A02(fEp.A05, FW6.class);
        }
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }
}
