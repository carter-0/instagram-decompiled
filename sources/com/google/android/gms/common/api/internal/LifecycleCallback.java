package com.google.android.gms.common.api.internal;

import X.AnonymousClass63b;
import X.C10465Rsg;
import X.C13806ThV;
import X.C3023963c;
import X.XTR;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

public class LifecycleCallback {
    public final C13806ThV A00;

    public LifecycleCallback(C13806ThV thV) {
        this.A00 = thV;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C13806ThV A00(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0048
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.String r4 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.QCZ.A03
            java.lang.Object r0 = r3.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r0.get()
            X.QCZ r2 = (X.QCZ) r2
            if (r2 != 0) goto L_0x0090
        L_0x001a:
            X.0hq r0 = r5.getSupportFragmentManager()     // Catch:{ ClassCastException -> 0x003f }
            androidx.fragment.app.Fragment r2 = r0.A0R(r4)     // Catch:{ ClassCastException -> 0x003f }
            X.QCZ r2 = (X.QCZ) r2     // Catch:{ ClassCastException -> 0x003f }
            if (r2 == 0) goto L_0x002a
            boolean r0 = r2.mRemoving
            if (r0 == 0) goto L_0x0088
        L_0x002a:
            X.QCZ r2 = new X.QCZ
            r2.<init>()
            X.0hq r1 = r5.getSupportFragmentManager()
            X.0s1 r0 = new X.0s1
            r0.<init>(r1)
            r0.A0B(r2, r4)
            r0.A01()
            goto L_0x0088
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0048:
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L_0x009a
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r1 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.Q5M.A03
            java.lang.Object r0 = r3.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0062
            java.lang.Object r2 = r0.get()
            X.Q5M r2 = (X.Q5M) r2
            if (r2 != 0) goto L_0x0090
        L_0x0062:
            android.app.FragmentManager r0 = r5.getFragmentManager()     // Catch:{ ClassCastException -> 0x0091 }
            android.app.Fragment r2 = r0.findFragmentByTag(r1)     // Catch:{ ClassCastException -> 0x0091 }
            X.Q5M r2 = (X.Q5M) r2     // Catch:{ ClassCastException -> 0x0091 }
            if (r2 == 0) goto L_0x0074
            boolean r0 = r2.isRemoving()
            if (r0 == 0) goto L_0x0088
        L_0x0074:
            X.Q5M r2 = new X.Q5M
            r2.<init>()
            android.app.FragmentManager r0 = r5.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r2, r1)
            r0.commitAllowingStateLoss()
        L_0x0088:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.put(r5, r0)
        L_0x0090:
            return r2
        L_0x0091:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x009a:
            java.lang.String r1 = "Can't get fragment for unexpected activity."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A00(java.lang.Object):X.ThV");
    }

    public void A06() {
    }

    public void A07() {
    }

    public void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public static C13806ThV getChimeraLifecycleFragmentImpl(XTR xtr) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final void A02() {
        if (this instanceof AnonymousClass63b) {
            AnonymousClass63b r1 = (AnonymousClass63b) this;
            if (!r1.A00.isEmpty()) {
                r1.A01.A07(r1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C3023963c
            if (r0 == 0) goto L_0x0035
            r4 = r8
            X.63c r4 = (X.C3023963c) r4
            java.util.concurrent.atomic.AtomicReference r3 = r4.A01
            java.lang.Object r5 = r3.get()
            X.Rsg r5 = (X.C10465Rsg) r5
            r7 = 1
            if (r9 == r7) goto L_0x0036
            r0 = 2
            if (r9 != r0) goto L_0x005d
            com.google.android.gms.common.GoogleApiAvailability r2 = r4.A00
            X.ThV r0 = r4.A00
            android.app.Activity r1 = r0.BMU()
            X.AnonymousClass3Qk.A02(r1)
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A03(r1, r0)
            if (r2 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0035
            com.google.android.gms.common.ConnectionResult r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L_0x005f
            if (r2 != r0) goto L_0x005f
        L_0x0035:
            return
        L_0x0036:
            r0 = -1
            if (r10 == r0) goto L_0x0062
            if (r10 != 0) goto L_0x005d
            if (r5 == 0) goto L_0x0035
            r2 = 13
            if (r11 == 0) goto L_0x0047
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r2 = r11.getIntExtra(r0, r2)
        L_0x0047:
            r1 = 0
            com.google.android.gms.common.ConnectionResult r0 = r5.A01
            java.lang.String r0 = r0.toString()
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r6.<init>(r1, r0, r7, r2)
        L_0x0053:
            int r1 = r5.A00
            r0 = 0
            r3.set(r0)
            r4.A0A(r6, r1)
            return
        L_0x005d:
            if (r5 == 0) goto L_0x0035
        L_0x005f:
            com.google.android.gms.common.ConnectionResult r6 = r5.A01
            goto L_0x0053
        L_0x0062:
            r0 = 0
            r3.set(r0)
            r4.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A03(int, int, android.content.Intent):void");
    }

    public final void A04(Bundle bundle) {
        C10465Rsg rsg;
        if (this instanceof C3023963c) {
            C3023963c r0 = (C3023963c) this;
            if (bundle != null) {
                AtomicReference atomicReference = r0.A01;
                if (bundle.getBoolean("resolving_error", false)) {
                    rsg = new C10465Rsg(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
                } else {
                    rsg = null;
                }
                atomicReference.set(rsg);
            }
        }
    }

    public final void A05(Bundle bundle) {
        C10465Rsg rsg;
        if ((this instanceof C3023963c) && (rsg = (C10465Rsg) ((C3023963c) this).A01.get()) != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", rsg.A00);
            ConnectionResult connectionResult = rsg.A01;
            bundle.putInt("failed_status", connectionResult.A01);
            bundle.putParcelable("failed_resolution", connectionResult.A02);
        }
    }
}
