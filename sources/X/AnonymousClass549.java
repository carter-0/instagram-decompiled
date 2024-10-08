package X;

import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.IceBreakerMessage;
import com.instagram.api.schemas.OnFeedMessages;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.549  reason: invalid class name */
public abstract class AnonymousClass549 {
    public static OnFeedMessages parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            GreetingAttachment greetingAttachment = null;
            Boolean bool = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("destinationType".equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                } else if ("genericUrl".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("greetingText".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("headerText".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("icebreakerDisclaimerText".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("icebreakerDisclaimerTextFAQsSticker".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("icebreakerMessages".equals(A0q)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r12.A1J() != 16L.A08) {
                            IceBreakerMessage parseFromJson = C2815358e.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("imageAttachment".equals(A0q)) {
                    greetingAttachment = AnonymousClass54A.parseFromJson(r12);
                } else if ("shouldSendAttachment".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                }
                r12.A0z();
            }
            return new OnFeedMessages(greetingAttachment, bool, num, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
