package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cih  reason: case insensitive filesystem */
public abstract class C44663Cih {
    public static AnonymousClass7AG parseFromJson(16F r19) {
        int i;
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            C61065Jw3 jw3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Integer num2 = null;
            String str9 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("response_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("streaming_state".equals(A17)) {
                    int A1D = r2.A1D();
                    Integer[] A00 = AnonymousClass05K.A00(2);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            num = AnonymousClass05K.A00;
                            break;
                        }
                        num = A00[i2];
                        if (1 - num.intValue() != 0) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        if (i == A1D) {
                            break;
                        }
                        i2++;
                    }
                } else if ("sentiment".equals(A17)) {
                    jw3 = C44662Cig.parseFromJson(r2);
                } else if ("bot_invocation_otid".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (C273654mx.A00(3424).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("message_image_source".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("prompt".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("bot_response_additional_message_otids".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r2, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C273654mx.A00(3425).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if (C273654mx.A00(2104).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("bot_invocation_message_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if (C273654mx.A00(2103).equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if (C273654mx.A00(3028).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("response_id", r2, "DirectBotMessageMetadata");
            } else if (num != null || !(r2 instanceof 0c9)) {
                return new AnonymousClass7AG(jw3, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList);
            } else {
                AnonymousClass7TF.A1L("streaming_state", r2, "DirectBotMessageMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
