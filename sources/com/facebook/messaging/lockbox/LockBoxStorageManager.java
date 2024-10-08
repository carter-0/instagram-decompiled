package com.facebook.messaging.lockbox;

import X.00k;
import X.00l;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass15Q;
import X.AnonymousClass63C;
import X.C3024563j;
import X.C3024663k;
import X.C3024763l;
import X.C3024863m;
import X.C3025063o;
import X.C393029vm;
import X.C48302EcL;
import X.C69508Nmq;
import X.C69525Nn7;
import X.C69563No7;
import X.C69564No8;
import X.C69703NqP;
import X.C70551OAz;
import X.C71087ObS;
import X.C71512Om9;
import X.C71514OmB;
import X.C71516OmD;
import X.C71517OmE;
import X.C71522OmJ;
import X.C71523OmK;
import X.N49;
import X.NEC;
import X.NEF;
import X.NEG;
import X.Ni6;
import X.Ni7;
import X.Ni8;
import X.Om8;
import X.XMS;
import X.XT9;
import X.Y8R;
import X.Y8S;
import X.Y8T;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class LockBoxStorageManager {
    public static final LockBoxStorageManager INSTANCE = new Object();
    public static C3024663k backupManager;
    public static volatile boolean blockStoreAvailable;
    public static Y8S keyParser;
    public static Y8R lockBoxEntryLogger;
    public static volatile boolean lockBoxInitializeCalled;
    public static Y8T logger;
    public static C3025063o shareKeyRetrieve;
    public static SharedPreferences sharedPreferences;

    public static final /* synthetic */ void access$markEntrySaveFailed(LockBoxStorageManager lockBoxStorageManager, String str) {
    }

    private final synchronized String getValueFromSharedPreferences(String str) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            0qQ.A0F("sharedPreferences");
        } else if (!sharedPreferences2.contains(str)) {
            return null;
        } else {
            SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 == null) {
                0qQ.A0F("sharedPreferences");
            } else {
                return sharedPreferences3.getString(str, "");
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean lockBoxDeleteDeviceSecret(String str) {
        0qQ.A0B(str, 0);
        return lockBoxDeleteSecret("DU", str);
    }

    public static final boolean lockBoxDeleteSecret(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS lockBoxDeleteSecretAsync = lockBoxDeleteSecretAsync(str, str2);
        try {
            lockBoxDeleteSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxDeleteSecretAsync.A00;
        0qQ.A07(obj);
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public static final C71087ObS lockBoxDeleteSecretAsync(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS obS = new C71087ObS();
        ? obj = new Object();
        obj.A00 = str2;
        Object obj2 = C3024763l.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        if (backupManager == null) {
            obS.A05(false);
            return obS;
        }
        INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new C71516OmD(obS, str, obj));
        return obS;
    }

    public static final String lockBoxGetDeviceSecret(String str) {
        0qQ.A0B(str, 0);
        return lockBoxGetSecret("DU", str);
    }

    public static final String lockBoxGetLocalSecret(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS lockBoxGetLocalSecretAsync = lockBoxGetLocalSecretAsync(str, str2);
        try {
            lockBoxGetLocalSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (String) lockBoxGetLocalSecretAsync.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    public static final C71087ObS lockBoxGetLocalSecretAsync(String str, String str2) {
        int ordinal;
        String valueFromSharedPreferences;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS obS = new C71087ObS();
        ? obj = new Object();
        obj.A00 = str2;
        Object obj2 = C3024763l.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        if (!blockStoreAvailable && lockBoxInitializeCalled) {
            String str3 = (String) obj.A00;
            0qQ.A0B(str3, 0);
            C3024863m A00 = C393029vm.A00(str3);
            if (A00 != null && ((ordinal = A00.ordinal()) == 1 || ordinal == 2)) {
                String str4 = (String) C3024763l.A01.get(C393029vm.A00((String) obj.A00));
                if (!(str4 == null || (valueFromSharedPreferences = INSTANCE.getValueFromSharedPreferences(str4)) == null)) {
                    obS.A05(valueFromSharedPreferences);
                    return obS;
                }
                obS.A03();
                return obS;
            }
        }
        if (backupManager != null) {
            INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new C71522OmJ(obS, str2, str, obj));
            return obS;
        }
        obS.A03();
        return obS;
    }

    public static final String lockBoxGetRemoteSecret(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        return INSTANCE.lockBoxGetRemoteSecret(str, str2, true);
    }

    public static final C69703NqP lockBoxGetRemoteSecretWithSource(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        return INSTANCE.lockBoxGetRemoteSecretWithSource(str, str2, true);
    }

    public static final String lockBoxGetSecret(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        LockBoxStorageManager lockBoxStorageManager = INSTANCE;
        String str3 = (String) C3024763l.A02.get(str2);
        if (str3 != null) {
            str2 = str3;
        }
        String lockBoxGetLocalSecret = lockBoxGetLocalSecret(str, str2);
        if (lockBoxGetLocalSecret != null && lockBoxGetLocalSecret.length() > 0) {
            return lockBoxGetLocalSecret;
        }
        if (C393029vm.A00(str2) != null) {
            return lockBoxStorageManager.lockBoxGetRemoteSecret(str, str2, false);
        }
        return null;
    }

    public static final C69703NqP lockBoxGetSecretWithSource(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS lockBoxGetSecretWithSourceAsync = lockBoxGetSecretWithSourceAsync(str, str2);
        try {
            lockBoxGetSecretWithSourceAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (C69703NqP) lockBoxGetSecretWithSourceAsync.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    public static final C71087ObS lockBoxGetSecretWithSourceAsync(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C71087ObS obS = new C71087ObS();
        ? obj = new Object();
        obj.A00 = str2;
        Object obj2 = C3024763l.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        lockBoxGetLocalSecretAsync(str, (String) obj.A00).A04(new C71517OmE(obS, str, obj));
        return obS;
    }

    public static final int lockBoxSaveDeviceSecret(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        return lockBoxSaveSecret("DU", str, str2);
    }

    public static final int lockBoxSaveSecret(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        C71087ObS lockBoxSaveSecretAsync = lockBoxSaveSecretAsync(str, str2, str3);
        try {
            lockBoxSaveSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxSaveSecretAsync.A00;
        0qQ.A07(obj);
        return ((Number) obj).intValue();
    }

    public static final C71087ObS lockBoxSaveSecretAsync(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        return lockBoxSaveSecretAsync(str, str2, str3, XMS.A00);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.NqP, java.lang.Object] */
    /* access modifiers changed from: private */
    public final C69703NqP parseToLockBoxResult(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            return new Object();
        }
        if (C393029vm.A00(str2) != null) {
            return lockBoxGetRemoteSecretWithSource(str3, str2, false);
        }
        return null;
    }

    public static final void setEntryLogger(Y8R y8r, Y8S y8s) {
        0qQ.A0B(y8r, 0);
        0qQ.A0B(y8s, 1);
        lockBoxEntryLogger = y8r;
        keyParser = y8s;
    }

    private final synchronized void storeEntryIntoSharedPreferences(String str, String str2) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            0qQ.A0F("sharedPreferences");
            throw AnonymousClass00P.createAndThrow();
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        0qQ.A07(edit);
        edit.putString(str, str2);
        edit.apply();
    }

    public static final /* synthetic */ Y8T access$getLogger$p() {
        return null;
    }

    /* access modifiers changed from: private */
    public final C71087ObS getRecoveryCodeFromLegacyLocation(String str) {
        C71087ObS obS = new C71087ObS();
        C3024663k r2 = backupManager;
        if (r2 == null) {
            0qQ.A0F("backupManager");
            throw AnonymousClass00P.createAndThrow();
        }
        C69508Nmq nmq = C69508Nmq.A05;
        0qQ.A0B(str, 0);
        r2.A00.A01(nmq, str).A04(new C71514OmB(obS, str));
        return obS;
    }

    public static final synchronized void initialize(Context context) {
        synchronized (LockBoxStorageManager.class) {
            0qQ.A0B(context, 0);
            LockBoxStorageManager lockBoxStorageManager = INSTANCE;
            lockBoxInitializeCalled = true;
            if (backupManager == null) {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                0qQ.A07(googleApiAvailability);
                try {
                    if (googleApiAvailability.A03(context, 222116045) == 0) {
                        C3024663k r2 = new C3024663k(new C3024563j(AnonymousClass63C.A00(context)));
                        Map map = C3024763l.A00;
                        0qQ.A0B(map, 1);
                        C3025063o r1 = new C3025063o(context, map);
                        sharedPreferences = context.getSharedPreferences("LockBoxStorageManager", 0);
                        lockBoxStorageManager.initialize(r2, r1);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public static final synchronized Set lockBoxGetRemoteSecretsWithSource(String str, String str2) {
        Set lockBoxGetRemoteSecretsWithSource;
        synchronized (LockBoxStorageManager.class) {
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            lockBoxGetRemoteSecretsWithSource = INSTANCE.lockBoxGetRemoteSecretsWithSource(str, str2, true);
        }
        return lockBoxGetRemoteSecretsWithSource;
    }

    private final C71087ObS lockBoxGetSecretsJsonForOwnerAsync(String str) {
        C71087ObS obS = new C71087ObS();
        C3024663k r2 = backupManager;
        if (r2 == null) {
            0qQ.A0F("backupManager");
            throw AnonymousClass00P.createAndThrow();
        }
        C69508Nmq nmq = C69508Nmq.A04;
        0qQ.A0B(str, 0);
        r2.A00.A01(nmq, str).A04(new Om8(obS));
        return obS;
    }

    public static final boolean lockBoxIsAvailable() {
        return blockStoreAvailable;
    }

    private final void markEntrySaveSuccess() {
    }

    /* access modifiers changed from: private */
    public final void moveRecoveryCodeFromLegacyToLockBox(String str, String str2) {
        lockBoxSaveSecretAsync(str, "rc", str2).A04(new C71512Om9(str));
    }

    /* access modifiers changed from: private */
    public final void nullableComplete(C71087ObS obS, Object obj) {
        if (obj == null) {
            obS.A03();
        } else {
            obS.A05(obj);
        }
    }

    /* access modifiers changed from: private */
    public final int parseBackupManagerResultToLockboxResult(C69564No8 no8) {
        if (no8 instanceof NEF) {
            return 1;
        }
        if (no8 instanceof NEG) {
            return parseBlockStoreError(((NEG) no8).A00);
        }
        return 0;
    }

    private final int parseBlockStoreError(Exception exc) {
        if (exc instanceof C69525Nn7) {
            return 8;
        }
        if (exc instanceof Ni6) {
            return 10;
        }
        if (exc instanceof Ni8) {
            return 12;
        }
        if (exc instanceof Ni7) {
            return 11;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final C70551OAz parseToJsonResult(C69563No7 no7) {
        if (no7 instanceof NEC) {
            byte[] bArr = ((NEC) no7).A00;
            0qQ.A0B(bArr, 0);
            List A0R = 00l.A0R(new String(bArr, AnonymousClass15Q.A05), new String[]{";"}, 0);
            if (A0R.size() == 2) {
                String str = (String) A0R.get(1);
                0qQ.A0B(str, 1);
                try {
                    return new C70551OAz((Integer) null, new JSONObject(str));
                } catch (JSONException unused) {
                    return new C70551OAz(7, (JSONObject) null);
                }
            }
        }
        return new C70551OAz((Integer) null, new JSONObject());
    }

    public static final /* synthetic */ void access$markEntrySaveSuccess(LockBoxStorageManager lockBoxStorageManager) {
    }

    private final void checkIsRunningOnMainThread(String str) {
    }

    private final void markEntrySaveFailed(String str) {
    }

    public final void setLockBoxLogger(Y8T y8t) {
        logger = y8t;
    }

    private final String lockBoxGetRemoteSecret(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) C3024763l.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (C393029vm.A00(str2) == null) {
            return null;
        }
        C3025063o r1 = shareKeyRetrieve;
        if (r1 == null) {
            0qQ.A0F("shareKeyRetrieve");
            throw AnonymousClass00P.createAndThrow();
        }
        N49 n49 = (N49) 00k.A0A(r1.A00(str, str2));
        if (n49 != null) {
            return n49.A01;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.NqP, java.lang.Object] */
    private final C69703NqP lockBoxGetRemoteSecretWithSource(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) C3024763l.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (C393029vm.A00(str2) == null) {
            return null;
        }
        C3025063o r0 = shareKeyRetrieve;
        if (r0 == null) {
            0qQ.A0F("shareKeyRetrieve");
            throw AnonymousClass00P.createAndThrow();
        }
        N49 n49 = (N49) 00k.A0A(r0.A00(str, str2));
        if (n49 == null || n49.A01.length() <= 0 || C48302EcL.A00(n49.A00) == null) {
            return null;
        }
        return new Object();
    }

    private final Set lockBoxGetRemoteSecretsWithSource(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) C3024763l.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (C393029vm.A00(str2) == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C3025063o r0 = shareKeyRetrieve;
        if (r0 == null) {
            0qQ.A0F("shareKeyRetrieve");
            throw AnonymousClass00P.createAndThrow();
        }
        for (N49 n49 : r0.A00(str, str2)) {
            if (!(n49 == null || n49.A01.length() <= 0 || C48302EcL.A00(n49.A00) == null)) {
                linkedHashSet.add(new Object());
            }
        }
        return linkedHashSet;
    }

    public static final C71087ObS lockBoxSaveSecretAsync(String str, String str2, String str3, XT9 xt9) {
        int ordinal;
        String str4;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        C71087ObS obS = new C71087ObS();
        if (backupManager != null) {
            INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new C71523OmK(obS, str2, str3, str));
            return obS;
        } else if (!lockBoxInitializeCalled || blockStoreAvailable) {
            obS.A05(5);
            return obS;
        } else {
            obS.A05(6);
            C3024863m A00 = C393029vm.A00(str2);
            if (A00 == null || (((ordinal = A00.ordinal()) != 1 && ordinal != 2) || (str4 = (String) C3024763l.A01.get(C393029vm.A00(str2))) == null)) {
                return obS;
            }
            INSTANCE.storeEntryIntoSharedPreferences(str4, str3);
            return obS;
        }
    }

    public final void initialize(C3024663k r2, C3025063o r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        backupManager = r2;
        shareKeyRetrieve = r3;
        blockStoreAvailable = true;
        lockBoxInitializeCalled = true;
    }
}
