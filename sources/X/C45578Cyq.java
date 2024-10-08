package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionButtonImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cyq  reason: case insensitive filesystem */
public abstract class C45578Cyq {
    public static GrowthFrictionInterventionDetailImpl parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("action".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("buttons".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            GrowthFrictionInterventionButtonImpl parseFromJson = CYI.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("intervention_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action", r15, "GrowthFrictionInterventionDetailImpl");
            } else if (arrayList == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("buttons", r15, "GrowthFrictionInterventionDetailImpl");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r15, "GrowthFrictionInterventionDetailImpl");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("intervention_name", r15, "GrowthFrictionInterventionDetailImpl");
            } else if (str4 != null || !(r15 instanceof 0c9)) {
                return new GrowthFrictionInterventionDetailImpl(str, str2, str3, str4, str5, arrayList);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r15, "GrowthFrictionInterventionDetailImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl) {
        r4.A0c();
        String str = growthFrictionInterventionDetailImpl.A00;
        if (str != null) {
            r4.A0R("action", str);
        }
        List list = growthFrictionInterventionDetailImpl.A05;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "buttons", list);
            while (A0s.hasNext()) {
                GrowthFrictionInterventionButton growthFrictionInterventionButton = (GrowthFrictionInterventionButton) A0s.next();
                if (growthFrictionInterventionButton != null) {
                    GrowthFrictionInterventionButtonImpl F3Z = growthFrictionInterventionButton.F3Z();
                    r4.A0c();
                    String str2 = F3Z.A01;
                    if (str2 != null) {
                        r4.A0R("action", str2);
                    }
                    Boolean bool = F3Z.A00;
                    if (bool != null) {
                        r4.A0S("is_primary", bool.booleanValue());
                    }
                    C41846B3n.A0z(r4, F3Z.A02);
                    String str3 = F3Z.A03;
                    if (str3 != null) {
                        r4.A0R("url", str3);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str4 = growthFrictionInterventionDetailImpl.A01;
        if (str4 != null) {
            r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str4);
        }
        String str5 = growthFrictionInterventionDetailImpl.A02;
        if (str5 != null) {
            r4.A0R("intervention_name", str5);
        }
        C41846B3n.A10(r4, growthFrictionInterventionDetailImpl.A03);
        String str6 = growthFrictionInterventionDetailImpl.A04;
        if (str6 != null) {
            r4.A0R("url", str6);
        }
        r4.A0Z();
    }
}
