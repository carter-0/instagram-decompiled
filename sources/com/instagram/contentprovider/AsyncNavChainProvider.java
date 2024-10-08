package com.instagram.contentprovider;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass9LM;
import X.C66590MXw;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

public final class AsyncNavChainProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        public final AnonymousClass0eM A00;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
            this.A00 = AnonymousClass0eN.A01(new AnonymousClass9LM(mXw, 38));
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            0qQ.A0B(uri, 0);
            ((ContentProvider) this.A00.getValue()).update(uri, contentValues, str, strArr);
            throw AnonymousClass00P.createAndThrow();
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            0qQ.A0B(uri, 0);
            ((ContentProvider) this.A00.getValue()).delete(uri, str, strArr);
            throw AnonymousClass00P.createAndThrow();
        }

        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            0qQ.A0B(uri, 0);
            return ((ContentProvider) this.A00.getValue()).query(uri, strArr, str, strArr2, str2);
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            0qQ.A0B(uri, 0);
            0qQ.A0B(contentValues, 1);
            ((ContentProvider) this.A00.getValue()).insert(uri, contentValues);
            throw AnonymousClass00P.createAndThrow();
        }

        public final String A0T(Uri uri) {
            0qQ.A0B(uri, 0);
            ((ContentProvider) this.A00.getValue()).getType(uri);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
