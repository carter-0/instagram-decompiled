package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.8LG  reason: invalid class name */
public final class AnonymousClass8LG implements AnonymousClass0lh {
    public final 0xa A00;
    public final HashMap A01 = new HashMap();

    public AnonymousClass8LG(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0xa A03 = 1Al.A01(userSession).A03(1An.A2v);
        this.A00 = A03;
        long j = A03.getLong("last_clear_cache_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 604800000) {
            0xY AR4 = this.A00.AR4();
            AR4.AHM();
            AR4.apply();
            0xY AR42 = A03.AR4();
            AR42.E5c("last_clear_cache_time", currentTimeMillis);
            AR42.apply();
        }
    }

    public final C39759A7z A00(String str) {
        0qQ.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(str)) {
            return (C39759A7z) hashMap.get(str);
        }
        try {
            String string = this.A00.getString(str, "not_found");
            if (!"not_found".equals(string)) {
                return A0T.parseFromJson(16P.A00(string));
            }
            return null;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing json parameters ");
            sb.append(e);
            0wb.A03("SmartTrackingDataStore", sb.toString());
            return null;
        }
    }

    public final void A01(C39759A7z a7z) {
        this.A01.put(a7z.A02, a7z);
        try {
            0xY AR4 = this.A00.AR4();
            String str = a7z.A02;
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            String str2 = a7z.A02;
            if (str2 != null) {
                A0A.A0R("file_path", str2);
            }
            A0A.A0P(IgReactMediaPickerNativeModule.WIDTH, a7z.A01);
            A0A.A0P(IgReactMediaPickerNativeModule.HEIGHT, a7z.A00);
            if (a7z.A06 != null) {
                16P.A03(A0A, "time_stamps");
                for (Number number : a7z.A06) {
                    if (number != null) {
                        A0A.A0g(number.intValue());
                    }
                }
                A0A.A0Y();
            }
            if (a7z.A05 != null) {
                16P.A03(A0A, "saliency_list");
                for (C39684A5a a5a : a7z.A05) {
                    if (a5a != null) {
                        AB3.A00(A0A, a5a);
                    }
                }
                A0A.A0Y();
            }
            if (a7z.A03 != null) {
                16P.A03(A0A, "body_tracking_list");
                for (C39684A5a a5a2 : a7z.A03) {
                    if (a5a2 != null) {
                        AB3.A00(A0A, a5a2);
                    }
                }
                A0A.A0Y();
            }
            if (a7z.A04 != null) {
                16P.A03(A0A, "final_tracking_list");
                for (C39684A5a a5a3 : a7z.A04) {
                    if (a5a3 != null) {
                        AB3.A00(A0A, a5a3);
                    }
                }
                A0A.A0Y();
            }
            if (a7z.A07 != null) {
                16P.A03(A0A, "transform_matrices");
                for (A4G a4g : a7z.A07) {
                    if (a4g != null) {
                        A0A.A0c();
                        16P.A03(A0A, "transform_matrices");
                        for (Number number2 : a4g.A00) {
                            if (number2 != null) {
                                A0A.A0f(number2.floatValue());
                            }
                        }
                        A0A.A0Y();
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
            }
            A0A.A0Z();
            A0A.close();
            AR4.E5g(str, stringWriter.toString());
            AR4.apply();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error setting json parameters ");
            sb.append(e);
            0wb.A03("SmartTrackingDataStore", sb.toString());
        }
    }

    public final void onSessionWillEnd() {
        0xY AR4 = this.A00.AR4();
        AR4.AHM();
        AR4.apply();
    }
}
