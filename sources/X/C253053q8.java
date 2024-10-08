package X;

import android.content.Context;
import android.util.Patterns;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextLinks;
import android.webkit.WebView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3q8  reason: invalid class name and case insensitive filesystem */
public abstract class C253053q8 {
    public static final ArrayList A00(Context context, CountryCodeData countryCodeData, String str) {
        0qQ.A0B(context, 0);
        0qQ.A0B(countryCodeData, 1);
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        String str2 = countryCodeData.A00;
        AnonymousClass7A5 r0 = AnonymousClass7A5.A00;
        ArrayList arrayList = new ArrayList();
        AnonymousClass7A8 r4 = new AnonymousClass7A8(r0, A01, str, str2);
        while (r4.hasNext()) {
            AnonymousClass7AH r02 = (AnonymousClass7AH) r4.next();
            int i = r02.A00;
            String str3 = r02.A01;
            arrayList.add(new C255723uc(i, i + str3.length(), str3));
        }
        return arrayList;
    }

    public static final ArrayList A02(String str) {
        0qQ.A0B(str, 0);
        ArrayList arrayList = new ArrayList();
        String findAddress = WebView.findAddress(str);
        int i = 0;
        while (findAddress != null) {
            int A08 = 00l.A08(str, findAddress, 0, false);
            int i2 = i + A08;
            if (i2 < 0) {
                break;
            }
            int length = findAddress.length();
            int i3 = length + i2;
            arrayList.add(new C255723uc(i2, i3, findAddress));
            str = str.substring(A08 + length);
            0qQ.A07(str);
            findAddress = WebView.findAddress(str);
            i = i3;
        }
        return arrayList;
    }

    public static final ArrayList A03(String str) {
        0qQ.A0B(str, 0);
        Matcher matcher = C253063q9.A01().matcher(str);
        0qQ.A07(matcher);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                arrayList.add(new C255723uc(matcher.start(1), matcher.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A01(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() < 10000) {
            TextLinks.Request.Builder builder = new TextLinks.Request.Builder(str);
            TextClassifier.EntityConfig.Builder builder2 = new TextClassifier.EntityConfig.Builder();
            List singletonList = Collections.singletonList("address");
            0qQ.A07(singletonList);
            TextClassifier.EntityConfig.Builder includedTypes = builder2.setIncludedTypes(singletonList);
            List singletonList2 = Collections.singletonList("datetime");
            0qQ.A07(singletonList2);
            TextLinks.Request build = builder.setEntityConfig(includedTypes.setExcludedTypes(singletonList2).build()).build();
            0qQ.A07(build);
            TextLinks generateLinks = ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier().generateLinks(build);
            0qQ.A07(generateLinks);
            for (TextLinks.TextLink next : generateLinks.getLinks()) {
                int start = next.getStart();
                int end = next.getEnd();
                String substring = str.substring(next.getStart(), next.getEnd());
                0qQ.A07(substring);
                arrayList.add(new C255723uc(start, end, substring));
            }
        }
        return arrayList;
    }

    public static final ArrayList A04(String str) {
        Matcher matcher = 0mp.A05.matcher(str);
        0qQ.A07(matcher);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                arrayList.add(new C255723uc(matcher.start(1), matcher.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A05(String str, boolean z) {
        Matcher A09;
        if (z) {
            A09 = 0mp.A03.matcher(str);
            0qQ.A07(A09);
        } else {
            A09 = 0mp.A09(str);
        }
        ArrayList arrayList = new ArrayList();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                arrayList.add(new C255723uc(A09.start(1), A09.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A06(Matcher matcher) {
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group != null) {
                C255723uc r1 = new C255723uc(matcher.start(0), matcher.end(0), group);
                if (!0mp.A0A(r1.A02)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public static final List A07(String str) {
        if (str == null || str.length() == 0) {
            return 0sn.A00;
        }
        Pattern pattern = 0mp.A03;
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        0qQ.A07(matcher);
        return A06(matcher);
    }
}
