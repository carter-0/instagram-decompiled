package com.instagram.barcelona.feed.crossapp.contentprovider;

import X.09i;
import X.0bY;
import X.0cQ;
import X.0cS;
import X.0cp;
import X.0qQ;
import X.1Fn;
import X.AnonymousClass000;
import X.AnonymousClass2VO;
import X.C266604Zx;
import X.C56490HzM;
import X.C60020ci;
import X.C66590MXw;
import X.C8749R7n;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ThreadsContentProvider extends C66590MXw {

    public final class Impl extends PublicContentDelegate {
        public final C266604Zx A00 = new C266604Zx(this);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impl(C66590MXw mXw) {
            super(mXw);
            0qQ.A0B(mXw, 1);
        }

        private final void A00(Context context) {
            List singletonList = Collections.singletonList(C60020ci.A0n);
            0qQ.A07(singletonList);
            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(singletonList));
            0cS r1 = new 0cS();
            r1.A01 = 0cQ.A02(unmodifiableSet);
            r1.A00().A02(context, (Intent) null, (0bY) null);
        }

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.barcelona.feed.crossapp.contentprovider.ThreadsContentProvider$Impl, java.lang.Object, X.4Zn] */
        public final int A0N(Uri uri, String str, String[] strArr) {
            String str2;
            Context context = this.A00.getContext();
            if (context != null) {
                try {
                    A00(context);
                    AnonymousClass2VO.A01.A01();
                    UserSession A05 = 09i.A0A.A05(this);
                    if (strArr == null || 0 >= strArr.length || (str2 = strArr[0]) == null || !(A05 instanceof UserSession) || !str2.equals(A05.A06)) {
                        return 0;
                    }
                    synchronized (C56490HzM.A03) {
                        C56490HzM.A02 = false;
                        C56490HzM.A01 = null;
                    }
                    return 1;
                } catch (SecurityException e) {
                    throw new SecurityException(AnonymousClass000.A00(102), e);
                }
            } else {
                throw new SecurityException("Unable to evaluate component access controls, 'context' is null.");
            }
        }

        /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.barcelona.feed.crossapp.contentprovider.ThreadsContentProvider$Impl, java.lang.Object, X.4Zn] */
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            boolean z;
            C8749R7n r7n;
            boolean z2;
            String[] strArr3;
            String obj;
            String str3;
            C56490HzM hzM = C56490HzM.A03;
            synchronized (hzM) {
                z = C56490HzM.A02;
            }
            if (z) {
                Context context = this.A00.getContext();
                if (context != null) {
                    try {
                        A00(context);
                        AnonymousClass2VO.A01.A01();
                        UserSession A05 = 09i.A0A.A05(this);
                        boolean z3 = false;
                        if (strArr2 != null && 0 < strArr2.length && (str3 = strArr2[0]) != null && (A05 instanceof UserSession) && str3.equals(A05.A06)) {
                            z3 = true;
                        }
                        if (z3) {
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"COL_FEED_RESPONSE_STATE", "COL_FEED_RESPONSE", "COL_FEED_RESPONSE_PHRASE", "COL_FEED_RESPONSE_HEADERS"});
                            synchronized (hzM) {
                                r7n = C56490HzM.A01;
                            }
                            if (r7n != null) {
                                String str4 = r7n.A01;
                                String str5 = r7n.A02;
                                List<1Fn> list = r7n.A03;
                                if (list.isEmpty()) {
                                    obj = "";
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    String property = System.getProperty("line.separator");
                                    if (property == null) {
                                        property = "\n";
                                    }
                                    for (1Fn r2 : list) {
                                        String str6 = r2.A00;
                                        String A002 = AnonymousClass000.A00(1060);
                                        if (str6 == null || !str6.equalsIgnoreCase(A002)) {
                                            sb.append(str6);
                                            sb.append(property);
                                            sb.append(r2.A01);
                                            sb.append(property);
                                        }
                                    }
                                    sb.deleteCharAt(sb.length() - 1);
                                    obj = sb.toString();
                                    0qQ.A07(obj);
                                }
                                strArr3 = new String[]{"COL_FEED_RESPONSE_READY", str4, str5, obj};
                            } else {
                                synchronized (hzM) {
                                    z2 = C56490HzM.A02;
                                }
                                if (z2) {
                                    strArr3 = new String[]{"COL_FEED_RESPONSE_IN_PROGRESS", null, null, null};
                                }
                                return matrixCursor;
                            }
                            matrixCursor.addRow(strArr3);
                            return matrixCursor;
                        }
                    } catch (SecurityException e) {
                        throw new SecurityException(AnonymousClass000.A00(102), e);
                    }
                } else {
                    throw new SecurityException("Unable to evaluate component access controls, 'context' is null.");
                }
            }
            return null;
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.barcelona.feed.crossapp.contentprovider.ThreadsContentProvider$Impl, X.4Zn] */
        public final void A0U() {
            C56490HzM hzM = C56490HzM.A03;
            C266604Zx r1 = this.A00;
            synchronized (hzM) {
                C56490HzM.A00 = r1;
                if (!(C56490HzM.A01 == null || r1 == null)) {
                    r1.A00.A00.getContext().getContentResolver().notifyChange(0cp.A03(AnonymousClass000.A00(2926)), (ContentObserver) null);
                }
            }
        }
    }
}
