package com.facebook.secure.fileprovider;

import X.002;
import X.0bY;
import X.AnonymousClass7TE;
import X.C266564Zn;
import X.C66579MXk;
import X.C66582MXn;
import X.C66590MXw;
import X.MY3;
import X.OWX;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class SecureFileProvider extends C66590MXw {
    public MY3 A00;

    public class Impl extends C266564Zn {
        public static final 0bY A01 = new Object();
        public static final String[] A02 = {"_display_name", "_size"};
        public final SecureFileProvider A00;

        public Impl(C66590MXw mXw) {
            super(mXw);
            this.A00 = (SecureFileProvider) mXw;
        }

        public final ParcelFileDescriptor A0D(Uri uri, String str) {
            int i;
            OWX A002 = OWX.A00(uri);
            C66590MXw mXw = this.A00;
            if (A002.A04(mXw.getContext()).booleanValue()) {
                try {
                    File A022 = A002.A02(mXw.getContext(), uri);
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
                        throw new IllegalArgumentException(002.A0R(C66579MXk.A00(242), str));
                    }
                    return ParcelFileDescriptor.open(A022, i);
                } catch (FileNotFoundException e) {
                    throw e;
                } catch (IOException e2) {
                    A01.EFT("SecureFileProvider.Impl", "IOException during file opening.", e2);
                    throw new FileNotFoundException("Could not open file");
                }
            } else {
                throw new SecurityException("Access denied");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0bY] */
    public final void A0G(Context context, ProviderInfo providerInfo) {
        if (!providerInfo.exported) {
            HashMap hashMap = MY3.A06;
            this.A00 = MY3.A01(context, providerInfo, new Object());
            return;
        }
        throw new SecurityException("Provider must not be exported.");
    }

    public static boolean A01(Context context, Uri uri) {
        MY3 A0J = C66582MXn.A0J(context);
        try {
            if (!A0J.A02.equals(uri.getAuthority()) || !uri.getScheme().equals("content")) {
                return false;
            }
            A0J.A05(uri, AnonymousClass7TE.A0u());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
