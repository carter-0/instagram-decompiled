package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vzh  reason: case insensitive filesystem */
public final class C18747Vzh {
    public final UserSession A00;

    public C18747Vzh(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final String A00(LocationPageInformation locationPageInformation, boolean z) {
        String str;
        if (z) {
            str = locationPageInformation.A08;
        } else {
            str = "";
        }
        List A1P = 0sr.A1P(new String[]{str, locationPageInformation.A05, locationPageInformation.A07, locationPageInformation.A0B});
        ArrayList arrayList = new ArrayList();
        for (Object next : A1P) {
            String str2 = (String) next;
            if (!(str2 == null || str2.length() == 0)) {
                arrayList.add(next);
            }
        }
        return C66581MXm.A0w(" ", arrayList);
    }

    public static final void A01(FragmentActivity fragmentActivity, MediaMapPin mediaMapPin) {
        boolean z;
        StringBuilder A0n;
        String str;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null) {
            String str2 = locationPageInformation.A05;
            String str3 = locationPageInformation.A07;
            String str4 = locationPageInformation.A0B;
            Double d = mediaMapPin.A0A;
            Double d2 = mediaMapPin.A0B;
            if (d == null || d2 == null) {
                FFS.A03(fragmentActivity, str2, str3, str4);
                return;
            }
            double doubleValue = d.doubleValue();
            double doubleValue2 = d2.doubleValue();
            if ((str2 == null || !str2.isEmpty()) && ((str3 == null || !str3.isEmpty()) && (str4 == null || !str4.isEmpty()))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                A0n = new StringBuilder();
            } else {
                A0n = AnonymousClass7TF.A0n(str2);
                String str5 = "";
                if (str3 == null || str3.isEmpty()) {
                    str = str5;
                } else {
                    str = 002.A0R(", ", str3);
                }
                A0n.append(str);
                if (str4 != null && !str4.isEmpty()) {
                    str5 = 002.A0R(", ", str4);
                }
                A0n.append(str5);
                A0n.append("&center=");
            }
            A0n.append(doubleValue);
            A0n.append(",");
            A0n.append(doubleValue2);
            0kR.A0D(fragmentActivity, FFS.A00(fragmentActivity, AnonymousClass05K.A00, A0n.toString()));
        }
    }

    public final void A02(FragmentActivity fragmentActivity, LocationPageInformation locationPageInformation, boolean z) {
        String A002 = A00(locationPageInformation, z);
        Object systemService = fragmentActivity.getSystemService("clipboard");
        0qQ.A0C(systemService, AnonymousClass000.A00(85));
        ClipData newPlainText = ClipData.newPlainText(A002, A002);
        0qQ.A07(newPlainText);
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
        C59689JTv.A07(fragmentActivity, 2131975110);
    }
}
