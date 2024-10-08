package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4VC  reason: invalid class name */
public abstract class AnonymousClass4VC {
    public static AnonymousClass4V7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass4V7 r2 = new AnonymousClass4V7();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    AnonymousClass4V8 parseFromJson = AnonymousClass4VD.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    r2.A09 = parseFromJson;
                } else if ("content".equals(A0q)) {
                    r2.A03 = C283835Jn.parseFromJson(r5);
                } else if ("footer".equals(A0q)) {
                    r2.A05 = C283855Jp.parseFromJson(r5);
                } else if ("primary_action".equals(A0q)) {
                    r2.A01 = AnonymousClass4VF.parseFromJson(r5);
                } else if ("secondary_action".equals(A0q)) {
                    r2.A02 = AnonymousClass4VF.parseFromJson(r5);
                } else if ("image".equals(A0q)) {
                    r2.A07 = C283895Jt.parseFromJson(r5);
                } else if ("dark_mode_image".equals(A0q)) {
                    r2.A06 = C283895Jt.parseFromJson(r5);
                } else if ("dismiss_action".equals(A0q)) {
                    r2.A00 = AnonymousClass4VF.parseFromJson(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("bullet_list".equals(A0q)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                C45358Cv0 parseFromJson2 = C44965Cnz.parseFromJson(r5);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r2.A0A = arrayList;
                    } else if ("social_context".equals(A0q)) {
                        r2.A08 = C283875Jr.parseFromJson(r5);
                    } else if ("social_context_images".equals(A0q)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                C283905Ju parseFromJson3 = C283895Jt.parseFromJson(r5);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        r2.A0C = arrayList;
                    } else if ("bloks_payload".equals(A0q)) {
                        r2.A04 = C44966Co0.parseFromJson(r5);
                    } else if ("story_bucket_generated_cards".equals(A0q)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                C45308CuC parseFromJson4 = Co4.parseFromJson(r5);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        r2.A0B = arrayList;
                    } else {
                        1XY.A01(r5, r2, A0q);
                    }
                }
                r5.A0z();
            }
            r2.A01();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, AnonymousClass4V7 r6) {
        r5.A0c();
        r5.A0q(DialogModule.KEY_TITLE);
        AnonymousClass4V8 r0 = r6.A09;
        r5.A0c();
        String str = r0.A00;
        if (str != null) {
            r5.A0R("text", str);
        }
        r5.A0Z();
        if (r6.A03 != null) {
            r5.A0q("content");
            C283845Jo r02 = r6.A03;
            r5.A0c();
            String str2 = r02.A00;
            if (str2 != null) {
                r5.A0R("text", str2);
            }
            r5.A0Z();
        }
        if (r6.A05 != null) {
            r5.A0q("footer");
            C283865Jq r03 = r6.A05;
            r5.A0c();
            String str3 = r03.A00;
            if (str3 != null) {
                r5.A0R("text", str3);
            }
            r5.A0Z();
        }
        if (r6.A01 != null) {
            r5.A0q("primary_action");
            AnonymousClass4VF.A00(r5, r6.A01);
        }
        if (r6.A02 != null) {
            r5.A0q("secondary_action");
            AnonymousClass4VF.A00(r5, r6.A02);
        }
        if (r6.A07 != null) {
            r5.A0q("image");
            C283895Jt.A00(r5, r6.A07);
        }
        if (r6.A06 != null) {
            r5.A0q("dark_mode_image");
            C283895Jt.A00(r5, r6.A06);
        }
        if (r6.A00 != null) {
            r5.A0q("dismiss_action");
            AnonymousClass4VF.A00(r5, r6.A00);
        }
        if (r6.A0A != null) {
            16P.A03(r5, "bullet_list");
            for (C45358Cv0 cv0 : r6.A0A) {
                if (cv0 != null) {
                    r5.A0c();
                    String str4 = cv0.A02;
                    if (str4 != null) {
                        r5.A0R(DialogModule.KEY_TITLE, str4);
                    }
                    String str5 = cv0.A01;
                    if (str5 != null) {
                        r5.A0R("subtitle", str5);
                    }
                    if (cv0.A00 != null) {
                        r5.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                        C283895Jt.A00(r5, cv0.A00);
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        if (r6.A08 != null) {
            r5.A0q("social_context");
            C283885Js r04 = r6.A08;
            r5.A0c();
            String str6 = r04.A00;
            if (str6 != null) {
                r5.A0R("text", str6);
            }
            r5.A0Z();
        }
        if (r6.A0C != null) {
            16P.A03(r5, "social_context_images");
            for (C283905Ju r05 : r6.A0C) {
                if (r05 != null) {
                    C283895Jt.A00(r5, r05);
                }
            }
            r5.A0Y();
        }
        if (r6.A04 != null) {
            r5.A0q("bloks_payload");
            C45306CuA cuA = r6.A04;
            r5.A0c();
            if (cuA.A01 != null) {
                r5.A0q("layout");
                R9S.A01.A01(r5, cuA.A01.A00);
            }
            if (cuA.A00 != null) {
                r5.A0q("bloks_data");
                C61081JwJ jwJ = cuA.A00;
                r5.A0c();
                R9S r9s = (R9S) jwJ.A00;
                if (r9s != null) {
                    r5.A0q("layout");
                    R9S.A01.A01(r5, r9s.A00);
                }
                String str7 = jwJ.A01;
                if (str7 != null) {
                    r5.A0R("payload", str7);
                }
                r5.A0Z();
            }
            r5.A0Z();
        }
        if (r6.A0B != null) {
            16P.A03(r5, "story_bucket_generated_cards");
            for (C45308CuC cuC : r6.A0B) {
                if (cuC != null) {
                    r5.A0c();
                    if (cuC.A00 != null) {
                        r5.A0q("ig_guide");
                        C45239Csu csu = cuC.A00;
                        r5.A0c();
                        String str8 = csu.A00;
                        if (str8 != null) {
                            r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
                        }
                        r5.A0Z();
                    }
                    if (cuC.A01 != null) {
                        r5.A0q("ig_media");
                        C45240Csv csv = cuC.A01;
                        r5.A0c();
                        String str9 = csv.A00;
                        if (str9 != null) {
                            r5.A0R(C273654mx.A00(761), str9);
                        }
                        r5.A0Z();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        1XY.A00(r5, r6);
        r5.A0Z();
    }
}
