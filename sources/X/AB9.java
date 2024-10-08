package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class AB9 {
    public static AnonymousClass8YF parseFromJson(16F r29) {
        String A00;
        String A002;
        16F r1 = r29;
        0qQ.A0B(r1, 0);
        try {
            Integer num = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C263144Hx r16 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            User user = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r10 = 16L.A09;
                A00 = AnonymousClass000.A00(181);
                A002 = C273654mx.A00(135);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if ("auxiliary_message".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("button_text_color".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if (A002.equals(A17)) {
                    r16 = C263104Ht.parseFromJson(r1);
                } else if ("end_background_color".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("fundraiser_sticker_type".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("ig_charity_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if ("pk".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("source_name".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("start_background_color".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("subtitle_color".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("title_color".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r1, false);
                }
                r1.A0z();
            }
            if (str2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_text_color", r1, "FundraiserStickerDict");
            } else if (r16 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r1, "FundraiserStickerDict");
            } else if (str3 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_background_color", r1, "FundraiserStickerDict");
            } else if (num == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r1, "FundraiserStickerDict");
            } else if (str6 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("pk", r1, "FundraiserStickerDict");
            } else if (str7 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("source_name", r1, "FundraiserStickerDict");
            } else if (str8 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start_background_color", r1, "FundraiserStickerDict");
            } else if (str9 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle_color", r1, "FundraiserStickerDict");
            } else if (str10 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r1, "FundraiserStickerDict");
            } else if (str11 != null || !(r1 instanceof 0c9)) {
                return new AnonymousClass8YF(r16, user, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num.intValue());
            } else {
                AnonymousClass7TF.A1L("title_color", r1, "FundraiserStickerDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass8YF r3, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R("auxiliary_message", str);
        }
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0R("button_text_color", str2);
        }
        AnonymousClass4Hy r1 = r3.A01;
        if (r1 != null) {
            r2.A0q(C273654mx.A00(135));
            C263104Ht.A00(r2, r1.FEU());
        }
        String str3 = r3.A05;
        if (str3 != null) {
            r2.A0R("end_background_color", str3);
        }
        String str4 = r3.A06;
        if (str4 != null) {
            r2.A0R("fundraiser_sticker_type", str4);
        }
        String str5 = r3.A07;
        if (str5 != null) {
            r2.A0R("ig_charity_id", str5);
        }
        r2.A0P(AnonymousClass000.A00(181), r3.A00);
        String str6 = r3.A08;
        if (str6 != null) {
            r2.A0R("pk", str6);
        }
        String str7 = r3.A09;
        if (str7 != null) {
            r2.A0R("source_name", str7);
        }
        String str8 = r3.A0A;
        if (str8 != null) {
            r2.A0R("start_background_color", str8);
        }
        String str9 = r3.A0B;
        if (str9 != null) {
            r2.A0R("subtitle_color", str9);
        }
        String str10 = r3.A0C;
        if (str10 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str10);
        }
        String str11 = r3.A0D;
        if (str11 != null) {
            r2.A0R("title_color", str11);
        }
        User user = r3.A02;
        if (user != null) {
            r2.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
