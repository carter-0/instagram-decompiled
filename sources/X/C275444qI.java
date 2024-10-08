package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4qI  reason: invalid class name and case insensitive filesystem */
public abstract class C275444qI {
    public static C275454qJ parseFromJson(16F r20) {
        String A1P;
        16F r4 = r20;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num = null;
            AnonymousClass5GI r7 = null;
            String str = null;
            Integer num2 = null;
            Boolean bool = null;
            String str2 = null;
            C250533lb r6 = null;
            Boolean bool2 = null;
            AnonymousClass3HX r8 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            String str4 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("client_position".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("end_card_model".equals(A0q)) {
                    r7 = C44373Cdt.parseFromJson(r4);
                } else if ("filtering_tag".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(r4.A1D());
                } else if ("hide_unit_if_seen".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r6 = C250523la.parseFromJson(r4);
                } else if ("netego_unit".equals(A0q)) {
                    bool2 = Boolean.valueOf(r4.A0d());
                } else if ("reel".equals(A0q)) {
                    r8 = AnonymousClass3HR.parseFromJson(r4);
                } else if ("reel_ids".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reels".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num3 = Integer.valueOf(r4.A1D());
                } else if ("view_state_item_type".equals(A0q)) {
                    num4 = Integer.valueOf(r4.A1D());
                }
                r4.A0z();
            }
            return new C275454qJ(r6, r7, r8, bool, bool2, num, num2, num3, num4, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
