package com.instagram.whatsapp.foabackuptoken;

import X.0Pj;
import X.0bY;
import X.0cS;
import X.0qQ;
import X.0sC;
import X.1Uk;
import X.1W3;
import X.AnonymousClass0PZ;
import X.AnonymousClass0cT;
import X.AnonymousClass1UZ;
import X.AnonymousClass2VO;
import X.C49254Erx;
import X.C60020ci;
import X.C60960kU;
import X.C66590MXw;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.secure.content.PublicContentDelegate;
import java.util.ArrayList;
import java.util.Collections;

public final class FoaBackupTokenProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        public final AnonymousClass0cT A00;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
            0cS r2 = new 0cS();
            r2.A01 = new 0Pj(Collections.singletonMap(C60020ci.A1f, AnonymousClass0PZ.A06));
            this.A00 = r2.A00();
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.whatsapp.foabackuptoken.FoaBackupTokenProvider$Impl, X.4Zn] */
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            String asString;
            String str2;
            String str3;
            if (str == null || str.length() == 0) {
                return 0;
            }
            AnonymousClass2VO.A01.A01();
            if (contentValues == null || (asString = contentValues.getAsString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) == null || asString.length() == 0) {
                return 0;
            }
            Context context = this.A00.getContext();
            if (context != null) {
                if (C49254Erx.A00(context)) {
                    str2 = "wa_foa_backup_token_smb";
                } else {
                    str2 = "wa_foa_backup_token";
                }
                Context context2 = C60960kU.A00;
                0qQ.A07(context2);
                1W3 AR0 = AnonymousClass1UZ.A00(context2).A00(str2).AR0();
                if (C49254Erx.A00(context)) {
                    str3 = "wa_foa_backup_token_smb";
                } else {
                    str3 = "wa_foa_backup_token";
                }
                AR0.A09(str3, asString);
                AR0.A0B();
            }
            return 1;
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.whatsapp.foabackuptoken.FoaBackupTokenProvider$Impl, X.4Zn] */
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            String str3;
            String str4;
            String str5;
            if (str == null || str.length() == 0) {
                throw new UnsupportedOperationException("No selection found.");
            }
            AnonymousClass2VO.A01.A01();
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            if (strArr == null) {
                strArr = new String[]{IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
            }
            ArrayList arrayList = new ArrayList();
            0sC r4 = new 0sC(strArr);
            while (r4.hasNext()) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(r4.next())) {
                    Context context = this.A00.getContext();
                    if (context != null) {
                        if (C49254Erx.A00(context)) {
                            str4 = "wa_foa_backup_token_smb";
                        } else {
                            str4 = "wa_foa_backup_token";
                        }
                        Context context2 = C60960kU.A00;
                        0qQ.A07(context2);
                        1Uk A002 = AnonymousClass1UZ.A00(context2).A00(str4);
                        if (C49254Erx.A00(context)) {
                            str5 = "wa_foa_backup_token_smb";
                        } else {
                            str5 = "wa_foa_backup_token";
                        }
                        str3 = A002.getString(str5, (String) null);
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                    }
                    str3 = "";
                    arrayList.add(str3);
                } else {
                    throw new IllegalArgumentException("Only value is supported in the projection map");
                }
            }
            matrixCursor.addRow(arrayList.toArray());
            return matrixCursor;
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.whatsapp.foabackuptoken.FoaBackupTokenProvider$Impl, X.4Zn] */
        public final boolean A0Z() {
            return this.A00.A03(this.A00.getContext(), (Intent) null, (0bY) null);
        }
    }
}
