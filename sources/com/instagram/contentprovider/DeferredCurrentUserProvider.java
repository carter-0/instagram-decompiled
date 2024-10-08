package com.instagram.contentprovider;

import X.0qQ;
import X.C266594Zs;
import X.C66590MXw;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

public final class DeferredCurrentUserProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        public final C266594Zs A00 = new ContentProvider();

        /* JADX WARNING: type inference failed for: r0v1, types: [X.4Zs, android.content.ContentProvider] */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            0qQ.A0B(uri, 0);
            0qQ.A0B(contentValues, 1);
            0qQ.A0B(str, 2);
            0qQ.A0B(strArr, 3);
            throw new UnsupportedOperationException();
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            0qQ.A0B(uri, 0);
            0qQ.A0B(str, 1);
            0qQ.A0B(strArr, 2);
            throw new UnsupportedOperationException();
        }

        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            0qQ.A0B(uri, 0);
            0qQ.A0B(strArr, 1);
            0qQ.A0B(str, 2);
            0qQ.A0B(strArr2, 3);
            0qQ.A0B(str2, 4);
            C266594Zs r0 = this.A00;
            r0.A01();
            return C266594Zs.A00(r0);
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            0qQ.A0B(uri, 0);
            0qQ.A0B(contentValues, 1);
            throw new UnsupportedOperationException();
        }

        public final String A0T(Uri uri) {
            0qQ.A0B(uri, 0);
            throw new UnsupportedOperationException();
        }
    }
}
