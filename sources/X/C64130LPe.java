package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPe  reason: case insensitive filesystem */
public abstract class C64130LPe {
    public static NewFundraiserInfo parseFromJson(16F r19) {
        16F r3 = r19;
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            String str7 = null;
            String str8 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("charity_user_igid".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("goal_amount".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if ("goal_currency".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("is_test".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("source_name".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("charity_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("selected_users_to_be_invited".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fundraiser_type".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(261).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            if (num == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("goal_amount", r3, "NewFundraiserInfo");
            } else if (bool != null || !(r3 instanceof 0c9)) {
                return new NewFundraiserInfo(str, str2, str3, str4, str5, str6, str7, str8, arrayList, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_test", r3, "NewFundraiserInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(NewFundraiserInfo newFundraiserInfo) {
        StringWriter A0v = JTO.A0v();
        17W A0Q = JTO.A0Q(A0v);
        A01(A0Q, newFundraiserInfo);
        return JTP.A0n(A0Q, A0v);
    }

    public static void A01(17Z r2, NewFundraiserInfo newFundraiserInfo) {
        r2.A0c();
        String str = newFundraiserInfo.A02;
        if (str != null) {
            r2.A0R("charity_user_igid", str);
        }
        r2.A0P("goal_amount", newFundraiserInfo.A00);
        String str2 = newFundraiserInfo.A05;
        if (str2 != null) {
            r2.A0R("goal_currency", str2);
        }
        String str3 = newFundraiserInfo.A07;
        if (str3 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str3);
        }
        r2.A0S("is_test", newFundraiserInfo.A09);
        String str4 = newFundraiserInfo.A03;
        if (str4 != null) {
            r2.A0R(DevServerEntity.COLUMN_DESCRIPTION, str4);
        }
        String str5 = newFundraiserInfo.A06;
        if (str5 != null) {
            r2.A0R("source_name", str5);
        }
        String str6 = newFundraiserInfo.A01;
        if (str6 != null) {
            r2.A0R("charity_id", str6);
        }
        List list = newFundraiserInfo.A08;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "selected_users_to_be_invited", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r2, A0s);
            }
            r2.A0Y();
        }
        String str7 = newFundraiserInfo.A04;
        if (str7 != null) {
            r2.A0R("fundraiser_type", str7);
        }
        String str8 = newFundraiserInfo.A0A;
        if (str8 != null) {
            r2.A0R(AnonymousClass000.A00(261), str8);
        }
        r2.A0Z();
    }
}
