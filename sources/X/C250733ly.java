package X;

import android.os.Parcelable;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3ly  reason: invalid class name and case insensitive filesystem */
public abstract class C250733ly {
    public static C250743lz parseFromJson(16F r24) {
        16F r7 = r24;
        0qQ.A0B(r7, 0);
        try {
            16L A11 = r7.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r7.A0z();
                return null;
            }
            C257533xY r12 = null;
            String str = null;
            String str2 = null;
            C269814fj r10 = null;
            String str3 = null;
            String str4 = null;
            C257533xY r13 = null;
            C269814fj r11 = null;
            C269844fm r14 = null;
            HashMap hashMap = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return new C250743lz(r10, r11, r12, r13, r14, bool, num, str, str2, str3, str4, str5, str6, hashMap, arrayList);
                }
                String A0q = r7.A0q();
                r7.A1J();
                if ("ad_disclaimer_info".equals(A0q)) {
                    r12 = C45679D1e.parseFromJson(r7);
                } else if ("background_color".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("background_color_alpha".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("caption_area".equals(A0q)) {
                    r10 = C45678D1d.parseFromJson(r7);
                } else if ("default_caption".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("disclaimer_context".equals(A0q)) {
                    r13 = C45679D1e.parseFromJson(r7);
                } else if ("headline_position".equals(A0q)) {
                    r11 = C45678D1d.parseFromJson(r7);
                } else if ("keyword_highlight_info_list".equals(A0q)) {
                    r14 = C45680D1f.parseFromJson(r7);
                } else if ("mention_user_list".equals(A0q)) {
                    if (r7.A11() == r6) {
                        hashMap = new HashMap();
                        while (r7.A1J() != r4) {
                            String A1P = r7.A1P();
                            r7.A1J();
                            if (r7.A11() == 16L.A0G) {
                                hashMap.put(A1P, (Object) null);
                            } else {
                                Parcelable.Creator creator = User.CREATOR;
                                User A00 = 1aC.A00(r7, false);
                                if (A00 != null) {
                                    hashMap.put(A1P, A00);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("mentioned_users".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A002 = 1aC.A00(r7, false);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("show_headline".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("text".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r7.A1P();
                    }
                } else if ("text_color".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r7.A1P();
                    }
                } else if ("text_size".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
