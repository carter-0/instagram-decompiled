package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ih  reason: invalid class name and case insensitive filesystem */
public final class C271344ih implements Runnable {
    public final /* synthetic */ AnonymousClass3JC A00;
    public final /* synthetic */ 2KL A01;

    public C271344ih(AnonymousClass3JC r1, 2KL r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        int size;
        2KL r0 = this.A01;
        C250663lr r2 = (C250663lr) this.A00.A01;
        if (r2 != null && (optionalTreeField = r2.getOptionalTreeField(0, "ig_on_device_app_history_privacy", AnonymousClass5JV.class, 2076880744)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "data", AnonymousClass5JW.class, -2128759826)) != null && optionalTreeField2.hasFieldValue("is_eligible") && optionalTreeField2.getCoercedBooleanField(0, "is_eligible")) {
            2IS r4 = new 2IS();
            2IS r3 = new 2IS();
            AnonymousClass2IY r1 = PandoGraphQLRequest.Companion;
            1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "AndroidAppHistoryPlistQuery", r4.getParamsCopy(), r3.getParamsCopy(), AnonymousClass5JX.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_android_app_history_plist_query", new ArrayList()).setMaxToleratedCacheAgeMs(0);
            AnonymousClass5JY r12 = new AnonymousClass5JY(r0);
            1vn r7 = r0.A07;
            r7.A06(maxToleratedCacheAgeMs, r12);
            if (r2.getCoercedBooleanField(2, "ig_is_full_coverage_enabled")) {
                ArrayList arrayList = new ArrayList();
                PackageManager packageManager = r0.A04.getPackageManager();
                if (packageManager != null) {
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                    0qQ.A07(installedApplications);
                    for (ApplicationInfo next : installedApplications) {
                        if ((next.flags & 1) == 0) {
                            String str = next.packageName;
                            0qQ.A06(str);
                            arrayList.add(str);
                        }
                    }
                    String A04 = 0qv.A02.A04(C60960kU.A00);
                    if (A04 == null) {
                        A04 = "";
                    }
                    2IV r42 = new 2IV();
                    r42.A09(A04, "family_device_id");
                    r42.A05("installed_package_names", arrayList);
                    0jh r32 = r0.A05;
                    0jh r31 = r32;
                    19f r15 = 19f.A29;
                    String A02 = r32.A02(r15);
                    if (A02 == null) {
                        A02 = "";
                    }
                    r42.A09(A02, "real_family_device_id");
                    2IS r5 = new 2IS();
                    2IS r33 = new 2IS();
                    r5.A00(r42, "request");
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "OnDeviceAppHistoryUpdateUninstalledMutation", r5.getParamsCopy(), r33.getParamsCopy(), C43421Bxx.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_update_uninstalled_on_device_app_history", new ArrayList());
                    pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
                    r7.ATL(B41.A00, B42.A00, pandoGraphQLRequest);
                    if (r0.A0A) {
                        size = r0.A02;
                    } else {
                        size = arrayList.size();
                    }
                    2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, arrayList.size()), size);
                    int i = A0B.A00;
                    int i2 = A0B.A01;
                    int i3 = A0B.A02;
                    if (i3 > 0) {
                        if (i > i2) {
                            return;
                        }
                    } else if (i3 >= 0 || i2 > i) {
                        return;
                    }
                    while (true) {
                        List subList = arrayList.subList(i, Math.min(arrayList.size(), i + size));
                        2IV r122 = new 2IV();
                        r122.A09(A04, "family_device_id");
                        r122.A05("installed_package_names", subList);
                        String A022 = r31.A02(r15);
                        if (A022 == null) {
                            A022 = "";
                        }
                        r122.A09(A022, "real_family_device_id");
                        2IS r02 = new 2IS();
                        2IS r13 = new 2IS();
                        r02.A00(r122, "request");
                        PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "OnDeviceAppHistoryUpdateInstalledMutation", r02.getParamsCopy(), r13.getParamsCopy(), C43419Bxv.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_update_installed_on_device_app_history", new ArrayList());
                        pandoGraphQLRequest2.setMaxToleratedCacheAgeMs(0);
                        r7.ATL(B43.A00, B44.A00, pandoGraphQLRequest2);
                        if (i != i2) {
                            i += i3;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
