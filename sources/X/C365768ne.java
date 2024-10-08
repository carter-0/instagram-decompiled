package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8ne  reason: invalid class name and case insensitive filesystem */
public final class C365768ne {
    public static final C365778nf A0A = new Object();
    public static volatile C365768ne A0B;
    public int A00;
    public int A01;
    public C61058Jvw A02;
    public Medium A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public HashMap A08;
    public final List A09 = new ArrayList();

    public final Medium A00(Context context, Uri uri, 0lg r15, String str, String str2) {
        String str3;
        String str4;
        String str5;
        boolean z;
        MediaUploadMetadata mediaUploadMetadata;
        Boolean bool;
        String str6 = null;
        if (uri == null || uri == Uri.EMPTY) {
            return null;
        }
        Uri A032 = 0cp.A03(uri.toString());
        0qQ.A07(A032);
        C61058Jvw jvw = this.A02;
        if (jvw != null) {
            str3 = jvw.A04;
            str4 = jvw.A05;
        } else {
            str3 = null;
            str4 = null;
        }
        Medium A002 = new MB4(context, A032, r15, str, str3, str4, str2).call();
        int i = A002.A08;
        if (i != 1 && i != 3) {
            return null;
        }
        C61058Jvw jvw2 = this.A02;
        if (jvw2 != null) {
            str5 = jvw2.A02;
        } else {
            str5 = null;
        }
        A002.A0N = str5;
        if (jvw2 == null || (bool = (Boolean) jvw2.A00) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        A002.A0g = z;
        MediaUploadMetadata mediaUploadMetadata2 = A002.A0G;
        if (jvw2 != null) {
            mediaUploadMetadata = (MediaUploadMetadata) jvw2.A01;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A00(mediaUploadMetadata);
        MediaUploadMetadata mediaUploadMetadata3 = A002.A0G;
        C61058Jvw jvw3 = this.A02;
        if (jvw3 != null) {
            str6 = jvw3.A04;
        }
        mediaUploadMetadata3.A06 = str6;
        return A002;
    }

    public final void A01(Activity activity, Uri uri, C61058Jvw jvw, 0lg r16, B2G b2g, Integer num, String str, String str2, HashMap hashMap, List list) {
        int i;
        0lg r5 = r16;
        0qQ.A0B(r5, 1);
        this.A09.clear();
        this.A03 = null;
        this.A02 = jvw;
        this.A08 = hashMap;
        this.A05 = str2;
        C61480nO A002 = 0nY.A00();
        Integer num2 = num;
        switch (num2.intValue()) {
            case 1:
                i = 359166618;
                break;
            case 2:
                i = 1921439977;
                break;
            default:
                i = 553124390;
                break;
        }
        A002.ATE(new C386969lS(activity, uri, r5, b2g, this, num2, str, list, i));
    }
}
