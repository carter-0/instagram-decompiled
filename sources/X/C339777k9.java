package X;

import com.instagram.api.schemas.AudienceGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7k9  reason: invalid class name and case insensitive filesystem */
public final class C339777k9 {
    public static C339767k8 parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("audience_enabled".equals(A0q)) {
                    r1.A04 = Boolean.valueOf(r11.A0d());
                } else {
                    ArrayList arrayList = null;
                    if ("available_audience_groups".equals(A0q)) {
                        if (r11.A11() == 16L.A0C) {
                            ArrayList arrayList2 = new ArrayList();
                            while (r11.A1J() != 16L.A08) {
                                if (r11.A11() == 16L.A0G) {
                                    str = null;
                                } else {
                                    str = r11.A1P();
                                }
                                AudienceGroup audienceGroup = (AudienceGroup) AudienceGroup.A01.get(str);
                                if (audienceGroup == null) {
                                    audienceGroup = AudienceGroup.UNRECOGNIZED;
                                }
                                arrayList2.add(audienceGroup);
                            }
                            arrayList = arrayList2;
                        }
                        r1.A08 = arrayList;
                    } else if ("fundraiser_enabled".equals(A0q)) {
                        r1.A05 = Boolean.valueOf(r11.A0d());
                    } else if ("prompts".equals(A0q)) {
                        if (r11.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r11.A1J() != 16L.A08) {
                                N49 parseFromJson = C393469wU.parseFromJson(r11);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A09 = arrayList;
                    } else if ("scheduled_live_config".equals(A0q)) {
                        r1.A03 = C342417oZ.parseFromJson(r11);
                    } else if ("shopping_sheet_config".equals(A0q)) {
                        r1.A00 = C393449wS.parseFromJson(r11);
                    } else if ("title_enabled".equals(A0q)) {
                        r1.A06 = Boolean.valueOf(r11.A0d());
                    } else if ("user_pay_sheet_config".equals(A0q)) {
                        r1.A02 = C393459wT.parseFromJson(r11);
                    } else if ("video_toggle_enabled".equals(A0q)) {
                        r1.A07 = Boolean.valueOf(r11.A0d());
                    } else {
                        1XY.A01(r11, r1, A0q);
                    }
                }
                r11.A0z();
            }
            Boolean bool = r1.A04;
            0qQ.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            List list = r1.A08;
            0qQ.A0A(list);
            Boolean bool2 = r1.A05;
            0qQ.A0A(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            List list2 = r1.A09;
            C342427oa r5 = r1.A03;
            C342477of r3 = r1.A00;
            Boolean bool3 = r1.A06;
            0qQ.A0A(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            C342487og r4 = r1.A02;
            Boolean bool4 = r1.A07;
            0qQ.A0A(bool4);
            r1.A01 = new C342457od(r3, r4, r5, list, list2, booleanValue, booleanValue2, booleanValue3, bool4.booleanValue());
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
