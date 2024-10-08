package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class A0T {
    public static C39759A7z parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("file_path".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else if ("time_stamps".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r11);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("saliency_list".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C39684A5a parseFromJson = AB3.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("body_tracking_list".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C39684A5a parseFromJson2 = AB3.parseFromJson(r11);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("final_tracking_list".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C39684A5a parseFromJson3 = AB3.parseFromJson(r11);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("transform_matrices".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList5 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            A4G parseFromJson4 = A0U.parseFromJson(r11);
                            if (parseFromJson4 != null) {
                                arrayList5.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                }
                r11.A0z();
            }
            C39759A7z a7z = new C39759A7z();
            if (str != null) {
                a7z.A02 = str;
            }
            if (num != null) {
                a7z.A01 = num.intValue();
            }
            if (num2 != null) {
                a7z.A00 = num2.intValue();
            }
            if (arrayList != null) {
                a7z.A06 = arrayList;
            }
            if (arrayList2 != null) {
                a7z.A05 = arrayList2;
            }
            if (arrayList3 != null) {
                a7z.A03 = arrayList3;
            }
            if (arrayList4 != null) {
                a7z.A04 = arrayList4;
            }
            if (arrayList5 != null) {
                a7z.A07 = arrayList5;
            }
            return a7z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
