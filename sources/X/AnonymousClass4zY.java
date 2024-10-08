package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.4zY  reason: invalid class name */
public abstract class AnonymousClass4zY {
    public final Class A00;

    public final Object A00(16F r2) {
        Object parseFromJson;
        if (this instanceof C279854zX) {
            parseFromJson = B5T.parseFromJson(r2);
        } else if (this instanceof C279904zd) {
            parseFromJson = C44649CiT.parseFromJson(r2);
        } else {
            parseFromJson = C44652CiW.parseFromJson(r2);
        }
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final String A01(Object obj) {
        if (this instanceof C279854zX) {
            C279864zZ r2 = (C279864zZ) obj;
            0qQ.A0B(r2, 0);
            return r2.A0H;
        } else if (this instanceof C279884zb) {
            C279894zc r22 = (C279894zc) obj;
            0qQ.A0B(r22, 0);
            return r22.A03;
        } else {
            AnonymousClass4AT r23 = (AnonymousClass4AT) obj;
            0qQ.A0B(r23, 0);
            return r23.A0A;
        }
    }

    public final void A02(17Z r4, Object obj) {
        if (this instanceof C279854zX) {
            C279864zZ r5 = (C279864zZ) obj;
            0qQ.A0B(r5, 0);
            B5T.A00(r4, r5);
            return;
        }
        if (this instanceof C279884zb) {
            C279894zc r52 = (C279894zc) obj;
            0qQ.A0B(r52, 0);
            r4.A0c();
            String str = r52.A03;
            if (str != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            }
            String str2 = r52.A04;
            if (str2 != null) {
                r4.A0R("promptText", str2);
            }
            User user = r52.A00;
            if (user != null) {
                r4.A0q("creator");
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(r4, user);
            }
            String str3 = r52.A02;
            if (str3 != null) {
                r4.A0R("eduTest", str3);
            }
            String str4 = r52.A01;
            if (str4 != null) {
                r4.A0R("attributionText", str4);
            }
            List<C279864zZ> list = r52.A05;
            if (list != null) {
                16P.A03(r4, "notes");
                for (C279864zZ r0 : list) {
                    if (r0 != null) {
                        B5T.A00(r4, r0);
                    }
                }
                r4.A0Y();
            }
        } else {
            AnonymousClass4AT r53 = (AnonymousClass4AT) obj;
            0qQ.A0B(r53, 0);
            r4.A0c();
            String str5 = r53.A0A;
            if (str5 != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
            }
            User user2 = r53.A06;
            if (user2 != null) {
                r4.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                Parcelable.Creator creator2 = User.CREATOR;
                1aC.A08(r4, user2);
            }
            r4.A0S("is_self_note", r53.A0G);
            Map map = r53.A0E;
            if (map != null) {
                r4.A0q("thumbnail_urls");
                r4.A0c();
                for (Map.Entry entry : map.entrySet()) {
                    if (!16P.A04(r4, entry)) {
                        16h.A01(r4, (ImageUrl) entry.getValue());
                    }
                }
                r4.A0Z();
            }
            r4.A0P("inventory_count", r53.A02);
            r4.A0S("has_unseen_media", r53.A0F);
            List<User> list2 = r53.A0D;
            if (list2 != null) {
                16P.A03(r4, "users");
                for (User user3 : list2) {
                    if (user3 != null) {
                        Parcelable.Creator creator3 = User.CREATOR;
                        1aC.A08(r4, user3);
                    }
                }
                r4.A0Y();
            }
            r4.A0P("index", r53.A01);
            r4.A0P("last_visible_content_note_timestamp", r53.A03);
            r4.A0P("note_inventory_count", r53.A04);
            String str6 = r53.A0C;
            if (str6 != null) {
                r4.A0R("stack_style", str6);
            }
            String str7 = r53.A0B;
            if (str7 != null) {
                r4.A0R("pog_style", str7);
            }
            String str8 = r53.A08;
            if (str8 != null) {
                r4.A0R("cover_note_id", str8);
            }
            String str9 = r53.A09;
            if (str9 != null) {
                r4.A0R("cover_note_text", str9);
            }
            Boolean bool = r53.A07;
            if (bool != null) {
                r4.A0S("viewer_has_liked", bool.booleanValue());
            }
            NoteCustomThemeImpl noteCustomThemeImpl = r53.A05;
            if (noteCustomThemeImpl != null) {
                r4.A0q("custom_theme");
                C2809154s.A00(r4, noteCustomThemeImpl);
            }
        }
        r4.A0Z();
    }

    public AnonymousClass4zY(Class cls) {
        this.A00 = cls;
    }
}
