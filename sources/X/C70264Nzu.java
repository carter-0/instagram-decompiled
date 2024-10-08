package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.Nzu  reason: case insensitive filesystem */
public abstract class C70264Nzu {
    /* JADX WARNING: type inference failed for: r0v8, types: [X.N2G, java.lang.Object] */
    public static N2G parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ExtendedImageUrl extendedImageUrl = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("note_igid".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("profile_pic_url".equals(A17)) {
                    extendedImageUrl = 16W.parseFromJson(r15);
                } else if ("attachment_idx".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if (AnonymousClass000.A00(1932).equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("sampling_frequency_hz".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if ("message_item_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("note_igid", r15, "NoteAudioReply");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r15, "NoteAudioReply");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r15, "NoteAudioReply");
            } else if (str7 != null || !(r15 instanceof 0c9)) {
                AnonymousClass7TG.A1U(str, str2, str3);
                0qQ.A0B(str7, 8);
                ? obj = new Object();
                obj.A03 = str;
                obj.A06 = str2;
                obj.A05 = str3;
                obj.A00 = extendedImageUrl;
                obj.A01 = str4;
                obj.A07 = str5;
                obj.A04 = str6;
                obj.A02 = str7;
                return obj;
            } else {
                AnonymousClass7TF.A1L("message_item_type", r15, "NoteAudioReply");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
