package X;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.instagram.contentprovider.AndroidXAppInitializer;
import com.instagram.contentprovider.AsyncFamilyAppsUserValuesProvider;
import com.instagram.contentprovider.AsyncNavChainProvider;
import com.instagram.contentprovider.DeferredCurrentUserProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.MXw  reason: case insensitive filesystem */
public abstract class C66590MXw extends ContentProvider {
    public static C74297PsW A03 = new C66591MXx();
    public static String A04;
    public static volatile AnonymousClass2LF A05;
    public C266564Zn A00;
    public boolean A01 = false;
    public volatile ProviderInfo A02;

    public static synchronized C266564Zn A00(C66590MXw mXw) {
        C266564Zn r0;
        Throwable th;
        synchronized (mXw) {
            if (!mXw.A01 || A04 != null) {
                mXw.A01 = true;
            } else {
                A04 = mXw.getClass().getName();
            }
            r0 = mXw.A00;
            if (r0 == null) {
                mXw.A07();
                try {
                    r0 = (C266564Zn) Class.forName(002.A0R(mXw.getClass().getName(), "$Impl")).getDeclaredConstructor(new Class[]{C66590MXw.class}).newInstance(new Object[]{mXw});
                    mXw.A00 = r0;
                } catch (InvocationTargetException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    if (e instanceof RuntimeException) {
                        throw e;
                    }
                    th = new RuntimeException(e);
                    throw th;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e2) {
                    th = new IllegalArgumentException(e2);
                    throw th;
                }
            }
        }
        return r0;
    }

    public boolean A0C() {
        return false;
    }

    public void A0G(Context context, ProviderInfo providerInfo) {
    }

    public void A07() {
        if (!(this instanceof DeferredCurrentUserProvider) && !(this instanceof AsyncNavChainProvider) && !(this instanceof AsyncFamilyAppsUserValuesProvider) && !(this instanceof AndroidXAppInitializer)) {
            C59870bh.A00();
        }
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        String str;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "applyBatch", str);
        return A00(this).A0K(arrayList);
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.A02 = providerInfo;
        super.attachInfo(context, providerInfo);
        A0G(context, providerInfo);
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        String str;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "bulkInsert", str);
        return A00(this).A06(uri, contentValuesArr);
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "call", str3);
        return A00(this).A0C(str, str2, bundle);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        String str2;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "delete", str2);
        return A00(this).A05(uri, str, strArr);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "insert", str);
        return A00(this).A0B(uri, contentValues);
    }

    public final void onLowMemory() {
        if (C59870bh.A00.block(-1)) {
            A00(this).A0F();
        }
    }

    public final void onTrimMemory(int i) {
        if (C59870bh.A00.block(-1)) {
            A00(this).A0H(i);
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        String str2;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "openAssetFile", str2);
        return A00(this).A07(uri, str);
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        String str2;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "openFile", str2);
        return A00(this).A0D(uri, str);
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        String str2;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "openTypedAssetFile", str2);
        return A00(this).A08(uri, str, bundle);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        String str3;
        0RJ A012;
        String A052;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "queryWithCancellationSignal", str3);
        Cursor A0A = A00(this).A0A(uri, strArr, str, strArr2, str2, cancellationSignal);
        if (A05 != null) {
            getContext().getApplicationInfo();
            AnonymousClass2LF r2 = A05;
            ProviderInfo providerInfo = this.A02;
            Context context2 = getContext();
            DbZ.A0t(0, uri, providerInfo, context2);
            if (r2.A02.CQY() && A0A != null) {
                0Aj A0d = C51969G9p.A0d(r2.A00, "mobile_privacy_uii_detection_data_read");
                if (A0d.isSampled()) {
                    Set set = r2.A04;
                    Object A0L = 00k.A0L(DbV.A18(DbT.A10(uri), "."));
                    if (A0L == null) {
                        A0L = "";
                    }
                    if (!set.contains(A0L) && (A012 = C59950cE.A01(context2, (Intent) null, (0bY) null, 86400000, 0)) != null && (A052 = A012.A05()) != null && AnonymousClass2LG.A00.contains(AnonymousClass7TF.A0j(A052))) {
                        0bb r22 = new 0bb();
                        r22.A06("key_value_pairs", O1Y.A00(A0A));
                        r22.A06("storage_url", uri.toString());
                        r22.A06("origin_class_name", providerInfo.name);
                        r22.A06("origin_authority", providerInfo.authority);
                        r22.A06("caller_app_identity", A052);
                        A0d.AAK(r22, "android_shared_storage_payload");
                        A0d.A8M(C69464Nm8.SHAREDSTORAGE, "data_source_common_name");
                        A0d.A8M(C69441Nll.WRITE, "cross_app_data_access_context");
                        0bb r23 = new 0bb();
                        r23.A01(C69464Nm8.CONTENTPROVIDER, "framework_name");
                        A0d.AAK(r23, "data_source_info");
                        A0d.Cgf();
                    }
                }
            }
        }
        return A0A;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "update", str2);
        return A00(this).A04(uri, contentValues, str, strArr);
    }

    public final int A02(Uri uri, ContentValues[] contentValuesArr) {
        return super.bulkInsert(uri, contentValuesArr);
    }

    public final AssetFileDescriptor A03(Uri uri, String str) {
        return super.openAssetFile(uri, str);
    }

    public final AssetFileDescriptor A04(Uri uri, String str, Bundle bundle) {
        return super.openTypedAssetFile(uri, str, bundle);
    }

    public final Bundle A05(String str, String str2, Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    public final ParcelFileDescriptor A06(Uri uri, String str) {
        return super.openFile(uri, str);
    }

    public final void A08() {
        super.onLowMemory();
    }

    public final void A09() {
        super.shutdown();
    }

    public final boolean A0D() {
        return super.isTemporary();
    }

    public final ContentProviderResult[] A0E(ArrayList arrayList) {
        return super.applyBatch(arrayList);
    }

    public final String[] A0F(Uri uri, String str) {
        return super.getStreamTypes(uri, str);
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        return A00(this).A0L(uri, str);
    }

    public final String getType(Uri uri) {
        return A00(this).A0E(uri);
    }

    public final boolean isTemporary() {
        return A00(this).A0J();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        A00(this).A0I(configuration);
    }

    public final boolean onCreate() {
        A0C();
        return true;
    }

    public final void shutdown() {
        A00(this).A0G();
    }

    public final void A0A(int i) {
        super.onTrimMemory(i);
    }

    public final void A0B(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        C74297PsW psW = A03;
        Context context = getContext();
        String A0y = C66581MXm.A0y(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        psW.Cfw(context, A0y, "query", str3);
        return A00(this).A09(uri, strArr, str, strArr2, str2);
    }
}
