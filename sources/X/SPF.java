package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.iabbwpextension.IABBwPExtension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class SPF {
    public static int A05;
    public static SPF A06;
    public static String A07;
    public static final C10866RzR A08 = new Object();
    public C61082JwK A00 = new C61082JwK();
    public QP8 A01 = new QP8(AnonymousClass05K.A00, (String) null, (String) null, (String) null, (String) null);
    public boolean A02;
    public final C10533Rtm A03 = new C10533Rtm();
    public final S3V A04;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r3 = A00(r6)
            if (r3 != 0) goto L_0x0008
            return r4
        L_0x0008:
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            X.QP8 r1 = r5.A01
            java.lang.Object r1 = r1.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r1 = 1
            if (r2 == r1) goto L_0x0039
            r1 = 2
            if (r2 != r1) goto L_0x0022
            X.S3V r0 = r5.A04
            java.util.HashSet r0 = r0.A08
        L_0x001e:
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
        L_0x0022:
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r1 = r2.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 == 0) goto L_0x0026
            r0 = 1
        L_0x0038:
            return r0
        L_0x0039:
            X.S3V r0 = r5.A04
            java.util.HashSet r0 = r0.A07
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPF.A04(java.lang.String):boolean");
    }

    public final boolean A01() {
        return AnonymousClass7TF.A1W(this.A01.A00, AnonymousClass05K.A01);
    }

    public final boolean A02() {
        return AnonymousClass7TF.A1W(this.A01.A00, AnonymousClass05K.A0C);
    }

    public final boolean A03() {
        if (!this.A04.A0B) {
            return false;
        }
        if (A01() || A02()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, X.RtI] */
    public SPF(Intent intent) {
        IABBwPExtension iABBwPExtension;
        Integer num;
        String authority;
        String queryParameter;
        this.A04 = new S3V(intent);
        IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT");
        IABBwPContext iABBwPContext = (IABBwPContext) intent.getParcelableExtra("EXTRA_POST_CLICK_CONTEXT");
        if (iABAdsContext != null || iABBwPContext != null) {
            if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_STICKY_UTM_ENABLED", false) && iABAdsContext != null) {
                HashSet A12 = C66580MXl.A12(iABAdsContext.A06);
                Uri data = intent.getData();
                ? obj = new Object();
                Uri uri = null;
                obj.A01 = AnonymousClass7TE.A1C();
                if (!(data == null || (authority = data.getAuthority()) == null)) {
                    boolean contains = C10503RtI.A03.contains(authority);
                    String queryParameter2 = data.getQueryParameter("u");
                    if (queryParameter2 != null) {
                        try {
                            uri = 0cp.A03(queryParameter2);
                        } catch (SecurityException e) {
                            SQO.A01("InitialStickyUTM", "URL parsing throw security exception: %s", e);
                        }
                    }
                    String str = null;
                    if (!contains) {
                        str = data.getAuthority();
                    } else if (uri != null) {
                        str = uri.getAuthority();
                    }
                    obj.A00 = str;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = C10503RtI.A02.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        String queryParameter3 = data.getQueryParameter(A18);
                        if (queryParameter3 != null) {
                            A1C.add(Pxe.A0K(A18, queryParameter3));
                        }
                        if (!(!contains || uri == null || (queryParameter = uri.getQueryParameter(A18)) == null)) {
                            A1C.add(Pxe.A0K(A18, queryParameter));
                        }
                    }
                    obj.A01 = A1C;
                }
                this.A00 = new C61082JwK(0, (Object) obj, A12.contains(RFY.IAB_STICKY_UTM_PARAMS));
            }
            if (this.A04.A0B) {
                if (iABAdsContext != null) {
                    iABBwPExtension = iABAdsContext.A05;
                } else {
                    if (iABBwPContext != null) {
                        this.A02 = true;
                        iABBwPExtension = iABBwPContext.A00;
                    }
                    SQO.A02("BwPContext", "Null BwP Extension!", new Object[0]);
                }
                if (iABBwPExtension != null) {
                    C10533Rtm rtm = this.A03;
                    long j = (long) iABBwPExtension.A00;
                    long longExtra = intent.getLongExtra("BWP_CACHED_ACCESS_TOKEN_TTL", 0);
                    if (longExtra > j) {
                        String stringExtra = intent.getStringExtra("BWP_CACHED_ACCESS_TOKEN_VALUE");
                        rtm.A02 = stringExtra == null ? "" : stringExtra;
                        rtm.A00 = longExtra;
                        num = AnonymousClass05K.A0C;
                    } else {
                        rtm.A02 = iABBwPExtension.A02;
                        rtm.A00 = j;
                        num = AnonymousClass05K.A0N;
                    }
                    rtm.A01 = num;
                    this.A01 = new QP8(iABBwPExtension);
                    return;
                }
                SQO.A02("BwPContext", "Null BwP Extension!", new Object[0]);
            }
        }
    }

    public static final String A00(String str) {
        String str2;
        String A002 = RUB.A00(str);
        if (!AnonymousClass7TF.A1Q(A002.length())) {
            Uri A012 = C11429STt.A01(A002);
            if (A012 == null || (str2 = A012.getAuthority()) == null) {
                str2 = "";
            }
            if (str2.length() != 0) {
                return str2;
            }
            SQO.A02("BwPContext", "Invalid authority", new Object[0]);
        }
        return null;
    }
}
