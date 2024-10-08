package com.instagram.contentprovider.users.impl;

import X.0qQ;
import X.C66590MXw;
import X.MYM;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public final class IgLoggedInUsersContentProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        public static final String[] A00 = {CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "authorization_token", MYM.A00(61, 8, 3), "profile_pic_url", "is_active_user"};

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [com.instagram.contentprovider.users.impl.IgLoggedInUsersContentProvider$Impl, java.lang.Object, X.4Zn] */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if (r3.getPackageManager().checkSignatures(r1, r2) == 0) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.Cursor A0Q(android.net.Uri r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19) {
            /*
                r14 = this;
                X.MXw r0 = r14.A00
                android.content.Context r3 = r0.getContext()
                X.0qQ.A07(r3)
                int r2 = android.os.Binder.getCallingUid()
                android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
                int r1 = r0.uid
                if (r2 == r1) goto L_0x0020
                android.content.pm.PackageManager r0 = r3.getPackageManager()
                int r1 = r0.checkSignatures(r1, r2)
                r0 = 0
                if (r1 != 0) goto L_0x0021
            L_0x0020:
                r0 = 1
            L_0x0021:
                r9 = 0
                if (r0 != 0) goto L_0x0025
                return r9
            L_0x0025:
                X.2VO r0 = X.AnonymousClass2VO.A01
                r0.A01()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                X.08y r0 = X.09i.A0A
                X.0wW r10 = r0.A05(r14)
                boolean r0 = r10 instanceof com.instagram.common.session.UserSession
                if (r0 == 0) goto L_0x0046
                X.0BQ r0 = X.AnonymousClass0BO.A00(r10)
                java.util.List r11 = r0.BO0()
                r0 = r10
                com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
                java.lang.String r9 = r0.A06
            L_0x0046:
                java.lang.String[] r0 = A00
                android.database.MatrixCursor r8 = new android.database.MatrixCursor
                r8.<init>(r0)
                int r7 = r11.size()
                r6 = 0
                r5 = 0
            L_0x0053:
                if (r5 >= r7) goto L_0x0095
                java.lang.Object r13 = r11.get(r5)
                com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
                java.lang.String r12 = r13.getId()
                X.0qQ.A0B(r10, r6)
                X.1CU r0 = X.AnonymousClass1CT.A00(r10)
                X.0xa r1 = r0.A00
                java.lang.String r0 = ""
                java.lang.String r4 = r1.getString(r12, r0)
                if (r9 == 0) goto L_0x0077
                boolean r0 = r9.equals(r12)
                r3 = 1
                if (r0 != 0) goto L_0x0078
            L_0x0077:
                r3 = 0
            L_0x0078:
                java.lang.String r2 = r13.getUsername()
                com.instagram.common.typedurl.ImageUrl r0 = r13.Bh3()
                java.lang.String r1 = r0.getUrl()
                X.0qQ.A07(r1)
                java.lang.String r0 = java.lang.Boolean.toString(r3)
                java.lang.String[] r0 = new java.lang.String[]{r12, r4, r2, r1, r0}
                r8.addRow(r0)
                int r5 = r5 + 1
                goto L_0x0053
            L_0x0095:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.users.impl.IgLoggedInUsersContentProvider.Impl.A0Q(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }
    }

    public final void A07() {
    }
}
