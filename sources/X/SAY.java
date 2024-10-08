package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.LinkedHashMap;

public abstract class SAY {
    public static ESU A01(String str, String str2, String str3) {
        ESU esu = new ESU();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("page_title", str3);
        A0a.putString(TraceFieldType.ContentType, str2);
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        esu.setArguments(A0a);
        return esu;
    }

    public static Fragment A00(Bundle bundle) {
        String A01;
        String string = bundle.getString("page");
        if (bundle.getParcelable("logger_data") == null) {
            C11249SHj sHj = new C11249SHj();
            String A00 = C46325Dbt.A00(9, 10, 79);
            if (bundle.getString(A00) != null) {
                A01 = bundle.getString(A00);
            } else {
                A01 = C2818159r.A01();
            }
            sHj.A01(A01);
            sHj.A01 = "fbpay_hub";
            bundle.putParcelable("logger_data", new FBPayLoggerData(sHj));
        }
        LinkedHashMap A06 = C2818159r.A06(Pxi.A0J(bundle));
        A06.put("referrer", bundle.getString("referrer"));
        SRV.A02("view_name", "fbpay_hub", A06).Cgl("client_load_fbpayhub_init", A06);
        if (string != null) {
            switch (string.hashCode()) {
                case -1847017863:
                    if (string.equals("payment_methods")) {
                        return AnonymousClass2E0.A0E().A03(bundle, "payment_methods");
                    }
                    break;
                case -105689780:
                    if (string.equals("welcome_page")) {
                        bundle.putBoolean("show_branding_page", true);
                        break;
                    }
                    break;
                case 3198785:
                    if (string.equals("help")) {
                        bundle.putInt("title_res", 2131962197);
                        bundle.putString("web_fragment_load_url", "https://help.instagram.com/357872324807367");
                        return AnonymousClass2E0.A0E().A03(bundle, "web_view");
                    }
                    break;
                case 949122880:
                    if (string.equals("security")) {
                        return AnonymousClass2E0.A03().A04.A00(bundle, "PIN_BIO_SETTINGS");
                    }
                    break;
                case 1082290744:
                    if (string.equals("receipt")) {
                        return AnonymousClass2E0.A0E().A03(bundle, "receipt");
                    }
                    break;
                case 1434631203:
                    if (string.equals("settings")) {
                        AnonymousClass2E0.A0D();
                        break;
                    }
                    break;
            }
        }
        return AnonymousClass2E0.A0E().A03(bundle, "home");
    }
}
