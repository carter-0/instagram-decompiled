package androidx.core.content;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51973G9u;
import X.C71487Olc;
import X.C74288PsG;
import X.DbT;
import X.JTO;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static final File A04 = AnonymousClass7TE.A0t("/");
    public static final HashMap A05 = AnonymousClass7TE.A1E();
    public static final String[] A06 = {"_display_name", "_size"};
    public C74288PsG A00;
    public String A01;
    public final int A02;
    public final Object A03;

    public FileProvider() {
        this(0);
    }

    public final String getTypeAnonymous(Uri uri) {
        return AnonymousClass000.A00(251);
    }

    public final boolean onCreate() {
        return true;
    }

    public static Uri A00(Context context, File file) {
        C71487Olc olc = (C71487Olc) A02(context, "com.instagram.fileprovider", 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            Iterator A0s = AnonymousClass7TF.A0s(olc.A01);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                String path = ((File) A1J.getValue()).getPath();
                if (C71487Olc.A00(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = A1J;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(olc.A00).encodedPath(002.A0T(Uri.encode(DbT.A13(entry)), Uri.encode(canonicalPath.substring(length), "/"), '/')).build();
            }
            throw AnonymousClass7TF.A0W("Failed to find configured root that contains ", canonicalPath);
        } catch (IOException unused) {
            throw C51973G9u.A0g(file, "Failed to resolve canonical path for ", AnonymousClass7TE.A1A());
        }
    }

    private C74288PsG A01() {
        C74288PsG psG;
        synchronized (this.A03) {
            if (this.A01 != null) {
                psG = this.A00;
                if (psG == null) {
                    psG = A02(getContext(), this.A01, this.A02);
                    this.A00 = psG;
                }
            } else {
                throw AnonymousClass7TE.A11("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
        }
        return psG;
    }

    public static C74288PsG A02(Context context, String str, int i) {
        C71487Olc olc;
        IllegalArgumentException illegalArgumentException;
        IllegalArgumentException illegalArgumentException2;
        File file;
        File[] externalMediaDirs;
        HashMap hashMap = A05;
        synchronized (hashMap) {
            C74288PsG psG = (C74288PsG) hashMap.get(str);
            olc = psG;
            if (psG == null) {
                try {
                    C71487Olc olc2 = new C71487Olc(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        if (resolveContentProvider.metaData == null && i != 0) {
                            Bundle bundle = new Bundle(1);
                            resolveContentProvider.metaData = bundle;
                            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    hashMap.put(str, olc2);
                                    olc = olc2;
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    String attributeValue = loadXmlMetaData.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                                    if ("root-path".equals(name)) {
                                        file = A04;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else {
                                        if ("external-files-path".equals(name)) {
                                            externalMediaDirs = context.getExternalFilesDirs((String) null);
                                        } else if ("external-cache-path".equals(name)) {
                                            externalMediaDirs = context.getExternalCacheDirs();
                                        } else if ("external-media-path".equals(name)) {
                                            externalMediaDirs = context.getExternalMediaDirs();
                                        } else {
                                            continue;
                                        }
                                        if (externalMediaDirs.length > 0) {
                                            file = externalMediaDirs[0];
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (file != null) {
                                        String str2 = new String[]{attributeValue2}[0];
                                        if (str2 != null) {
                                            file = JTO.A0s(file, str2);
                                        }
                                        if (TextUtils.isEmpty(attributeValue)) {
                                            illegalArgumentException2 = AnonymousClass7TE.A0w("Name must not be empty");
                                            break;
                                        }
                                        try {
                                            olc2.A01.put(attributeValue, file.getCanonicalFile());
                                        } catch (IOException e) {
                                            illegalArgumentException2 = new IllegalArgumentException(AnonymousClass7TG.A0m(file, "Failed to resolve canonical path for ", AnonymousClass7TE.A1A()), e);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            illegalArgumentException2 = AnonymousClass7TE.A0w("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        illegalArgumentException2 = AnonymousClass7TF.A0W("Couldn't find meta-data for provider with authority ", str);
                    }
                    throw illegalArgumentException2;
                } catch (IOException e2) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    throw illegalArgumentException;
                } catch (XmlPullParserException e3) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    throw illegalArgumentException;
                }
            }
        }
        return olc;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw AnonymousClass7TE.A1B("No external inserts");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AnonymousClass7TE.A1B("No external updates");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.A03) {
                this.A01 = str;
            }
            HashMap hashMap = A05;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return A01().B5f(uri).delete() ? 1 : 0;
    }

    public final String getType(Uri uri) {
        String mimeTypeFromExtension;
        File B5f = A01().B5f(uri);
        int lastIndexOf = B5f.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(B5f.getName().substring(lastIndexOf + 1))) == null) {
            return AnonymousClass000.A00(251);
        }
        return mimeTypeFromExtension;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File B5f = A01().B5f(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw AnonymousClass7TF.A0W("Invalid mode: ", str);
        }
        return ParcelFileDescriptor.open(B5f, i);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object valueOf;
        File B5f = A01().B5f(uri);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        if (strArr == null) {
            strArr = A06;
        }
        String[] strArr3 = new String[r7];
        Object[] objArr = new Object[r7];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    valueOf = B5f.getName();
                } else {
                    valueOf = queryParameter;
                }
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                valueOf = Long.valueOf(B5f.length());
            }
            objArr[i2] = valueOf;
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public FileProvider(int i) {
        this.A03 = new Object();
        this.A02 = i;
    }
}
