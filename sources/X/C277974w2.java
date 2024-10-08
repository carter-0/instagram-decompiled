package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4w2  reason: invalid class name and case insensitive filesystem */
public abstract class C277974w2 {
    public static C277984w3 parseFromJson(16F r20) {
        16F r5 = r20;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C278004w5 r7 = null;
            C257593xe r9 = null;
            C257593xe r10 = null;
            ArrayList arrayList = null;
            String str = null;
            C278024w7 r8 = null;
            Integer num = null;
            Integer num2 = null;
            C257593xe r11 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("banner".equals(A0q)) {
                    r7 = C45516Cxq.parseFromJson(r5);
                } else if ("banner_bloks_data".equals(A0q)) {
                    r9 = C45662D0m.parseFromJson(r5);
                } else if ("bloks_data".equals(A0q)) {
                    r10 = C45662D0m.parseFromJson(r5);
                } else if ("buttons".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C278004w5 parseFromJson = C45516Cxq.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0q)) {
                    r8 = C45582Cyu.parseFromJson(r5);
                } else if ("misinformation_type".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if ("overlay_applied_timestamp".equals(A0q)) {
                    num2 = Integer.valueOf(r5.A1D());
                } else if ("overlay_bloks_data".equals(A0q)) {
                    r11 = C45662D0m.parseFromJson(r5);
                } else if ("overlay_layout".equals(A0q)) {
                    num3 = Integer.valueOf(r5.A1D());
                } else if ("overlay_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if (Dbh.A01(0, 10, 58).equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("sub_category".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C277984w3(r7, r8, r9, r10, r11, num, num2, num3, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C277984w3 r5) {
        r4.A0c();
        C278004w5 r1 = r5.A00;
        if (r1 != null) {
            r4.A0q("banner");
            C45516Cxq.A00(r4, r1);
        }
        C257593xe r12 = r5.A02;
        if (r12 != null) {
            r4.A0q("banner_bloks_data");
            C45662D0m.A00(r4, r12);
        }
        C257593xe r13 = r5.A03;
        if (r13 != null) {
            r4.A0q("bloks_data");
            C45662D0m.A00(r4, r13);
        }
        List<C278004w5> list = r5.A0D;
        if (list != null) {
            16P.A03(r4, "buttons");
            for (C278004w5 r0 : list) {
                if (r0 != null) {
                    C45516Cxq.A00(r4, r0);
                }
            }
            r4.A0Y();
        }
        String str = r5.A08;
        if (str != null) {
            r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        C278024w7 r14 = r5.A01;
        if (r14 != null) {
            r4.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            C45582Cyu.A00(r4, r14);
        }
        Integer num = r5.A05;
        if (num != null) {
            r4.A0P("misinformation_type", num.intValue());
        }
        Integer num2 = r5.A06;
        if (num2 != null) {
            r4.A0P("overlay_applied_timestamp", num2.intValue());
        }
        C257593xe r15 = r5.A04;
        if (r15 != null) {
            r4.A0q("overlay_bloks_data");
            C45662D0m.A00(r4, r15);
        }
        Integer num3 = r5.A07;
        if (num3 != null) {
            r4.A0P("overlay_layout", num3.intValue());
        }
        String str2 = r5.A09;
        if (str2 != null) {
            r4.A0R("overlay_type", str2);
        }
        String str3 = r5.A0A;
        if (str3 != null) {
            r4.A0R(Dbh.A01(0, 10, 58), str3);
        }
        String str4 = r5.A0B;
        if (str4 != null) {
            r4.A0R("sub_category", str4);
        }
        String str5 = r5.A0C;
        if (str5 != null) {
            r4.A0R(DialogModule.KEY_TITLE, str5);
        }
        r4.A0Z();
    }
}
