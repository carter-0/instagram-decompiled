package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public final class JYW extends Fragment {
    public static final Handler A05 = AnonymousClass7TF.A0D();
    public 1DN A00;
    public 1DM A01;
    public boolean A02 = false;
    public boolean A03;
    public String[] A04 = new String[0];

    public final void A01(1DN r6, 1DM r7, String[] strArr) {
        this.A04 = strArr;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (Build.VERSION.SDK_INT < 34 || (!str.equals(Pxd.A00(7)) && !str.equals(Pxd.A00(18)) && !str.equals(C273654mx.A00(38)))) {
                i++;
            }
        }
        this.A02 = true;
        this.A01 = r7;
        this.A00 = r6;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED", this.A03);
    }

    public static void A00(Context context, ArrayList arrayList) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String A002 = Pxd.A00(7);
        boolean z = true;
        boolean A1Q = AnonymousClass7TF.A1Q(02K.A00(context, A002));
        String A003 = Pxd.A00(18);
        boolean A1Q2 = AnonymousClass7TF.A1Q(02K.A00(context, A003));
        String A004 = C273654mx.A00(38);
        if (02K.A00(context, A004) != 0) {
            z = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (02K.A00(context, A18) != 0 && (!A18.equals(A002) || (!A1Q && !z))) {
                if (!A18.equals(A003) || (!A1Q2 && !z)) {
                    if (!A18.equals(A004) || (!A1Q && !A1Q2 && !z)) {
                        A1C.add(A18);
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1722178686);
        JYW.super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED")) {
            String[] strArr = this.A04;
            if (strArr != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(Arrays.asList(strArr));
                if (this.A02) {
                    A00(requireContext(), A1D);
                }
                if (!A1D.isEmpty()) {
                    requestPermissions((String[]) A1D.toArray(new String[0]), 0);
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        A05.post(new C59934Jby(this, 1DL.A02(activity, strArr)));
                    }
                }
                this.A03 = true;
            } else {
                0wb.A03("PermissionRequestFragment", "permission cannot be null");
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    0s1 A0D = DbW.A0D(activity2);
                    A0D.A03(this);
                    A0D.A01();
                }
            }
        }
        AnonymousClass0fD.A09(1929008865, A022);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C346927vz r0;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                r0 = C346927vz.GRANTED;
            } else if (shouldShowRequestPermissionRationale(str)) {
                r0 = C346927vz.DENIED;
            } else {
                r0 = C346927vz.DENIED_DONT_ASK_AGAIN;
            }
            A1E.put(str, r0);
        }
        if (C346927vz.DENIED_DONT_ASK_AGAIN.equals(A1E.get("android.permission.ACCESS_FINE_LOCATION")) && C346927vz.GRANTED.equals(A1E.get("android.permission.ACCESS_COARSE_LOCATION"))) {
            A1E.put("android.permission.ACCESS_FINE_LOCATION", C346927vz.DENIED);
        }
        A05.post(new C59934Jby(this, A1E));
    }
}
