package com.instagram.contentprovider;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C66590MXw;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.secure.content.PublicContentDelegate;
import java.lang.reflect.Method;

public final class AndroidXAppInitializer extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new IllegalStateException("Not allowed.");
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new IllegalStateException("Not allowed.");
        }

        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            throw new IllegalStateException("Not allowed.");
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new IllegalStateException("Not allowed.");
        }

        public final String A0T(Uri uri) {
            throw new IllegalStateException("Not allowed.");
        }
    }

    public final boolean A0C() {
        try {
            Context context = getContext();
            Class<?> cls = Class.forName("androidx.startup.InitializationProvider");
            0qQ.A0A(context);
            ComponentName componentName = new ComponentName(context, cls);
            Bundle A0a = AnonymousClass7TE.A0a();
            if (context.getPackageManager() != null) {
                ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(componentName, 128);
                0qQ.A07(providerInfo);
                A0a = providerInfo.metaData;
                if (A0a != null) {
                    A0a.remove("androidx.work.WorkManagerInitializer");
                }
            }
            Class<?> cls2 = Class.forName("androidx.startup.AppInitializer");
            Object invoke = cls2.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Method declaredMethod = cls2.getDeclaredMethod("discoverAndInitialize", new Class[]{Bundle.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(invoke, new Object[]{A0a});
            return false;
        } catch (Throwable th) {
            throw C41845B3m.A0j(th);
        }
    }
}
