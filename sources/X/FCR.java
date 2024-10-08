package X;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FCR {
    public static ArrayList A00() {
        Object AWX;
        C48165Ea7 ea7;
        C49440Evg A00 = C49440Evg.A00();
        C48067EUl eUl = C48067EUl.A03;
        if (!AnonymousClass7TE.A1a(eUl.A01.A00()) || (AWX = eUl.A00.AWX(A00.A00.getString("cloud_account_user_map", (String) null))) == null || !(AWX instanceof C48165Ea7) || (ea7 = (C48165Ea7) AWX) == null || !(ea7 instanceof DxR)) {
            return AnonymousClass7TE.A1C();
        }
        List list = ((DxR) ea7).A00;
        if (list == null) {
            return AnonymousClass7TE.A1C();
        }
        return AnonymousClass7TE.A1D(list);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.F3D] */
    public static void A01(ImageUrl imageUrl, String str, String str2) {
        ArrayList A00 = A00();
        Iterator it = A00.iterator();
        while (true) {
            if (it.hasNext()) {
                F3D f3d = (F3D) it.next();
                if (f3d.A00() != null && f3d.A00().equals(str)) {
                    String url = imageUrl.getUrl();
                    if (!URLUtil.isValidUrl(url)) {
                        url = null;
                    }
                    f3d.A00 = url;
                    if (f3d.A02 != null) {
                        f3d.A02 = str2;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            } else {
                String url2 = imageUrl.getUrl();
                ? obj = new Object();
                if (TextUtils.isDigitsOnly(str)) {
                    obj.A01 = str;
                    obj.A02 = str2;
                    if (url2 != null && URLUtil.isValidUrl(url2)) {
                        obj.A00 = url2;
                    }
                    A00.add(obj);
                } else {
                    throw DbT.A0m();
                }
            }
        }
        A02(A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.DxR, java.lang.Object] */
    public static void A02(List list) {
        C49440Evg A00 = C49440Evg.A00();
        C48067EUl eUl = C48067EUl.A03;
        ? obj = new Object();
        obj.A00 = list;
        if (eUl.A02.isAssignableFrom(obj.getClass()) && AnonymousClass7TE.A1a(eUl.A01.A00())) {
            0xY AR4 = A00.A00.AR4();
            AR4.E5g("cloud_account_user_map", eUl.A00.FHB(obj));
            AR4.apply();
        }
    }
}
