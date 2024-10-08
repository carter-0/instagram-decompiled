package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreateModeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cy6  reason: case insensitive filesystem */
public abstract class C45532Cy6 {
    public static AnonymousClass5OL parseFromJson(16F r12) {
        String str;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C42040BEs bEs = null;
            BEw bEw = null;
            String str2 = null;
            ArrayList arrayList3 = null;
            C42141BIw bIw = null;
            String str3 = null;
            CreateModeType createModeType = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("cards".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            BE1 parseFromJson = CVN.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fundraiser_sticker_suggestions".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C41846B3n.A1E(r12, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("gifs_info".equals(A17)) {
                    bEs = C45562Cya.parseFromJson(r12);
                } else if ("group_poll_info".equals(A17)) {
                    bEw = CYG.parseFromJson(r12);
                } else if (C41845B3m.A19(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("poll_stickers".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C42061BFo parseFromJson2 = C44239Cba.parseFromJson(r12);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("templates_info".equals(A17)) {
                    bIw = D2L.parseFromJson(r12);
                } else if ("thumbnail_url".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    createModeType = (CreateModeType) CreateModeType.A01.get(str);
                    if (createModeType == null) {
                        createModeType = CreateModeType.UNRECOGNIZED;
                    }
                }
                r12.A0z();
            }
            return new AnonymousClass5OL(createModeType, bEs, bEw, bIw, str2, str3, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r6, AnonymousClass5OL r7) {
        r6.A0c();
        List list = r7.A06;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r6, "cards", list);
            while (A0s.hasNext()) {
                DT8 dt8 = (DT8) A0s.next();
                if (dt8 != null) {
                    BE1 F1D = dt8.F1D();
                    r6.A0c();
                    String str = F1D.A00;
                    if (str != null) {
                        r6.A0R("background_url", str);
                    }
                    C41846B3n.A0z(r6, F1D.A01);
                    String str2 = F1D.A02;
                    if (str2 != null) {
                        r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                    }
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        List list2 = r7.A07;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r6, "fundraiser_sticker_suggestions", list2);
            while (A0s2.hasNext()) {
                C41846B3n.A19(r6, A0s2);
            }
            r6.A0Y();
        }
        C42040BEs bEs = r7.A01;
        if (bEs != null) {
            r6.A0q("gifs_info");
            C45562Cya.A00(r6, bEs);
        }
        C46238DRt dRt = r7.A02;
        if (dRt != null) {
            r6.A0q("group_poll_info");
            BEw F3X = dRt.F3X();
            r6.A0c();
            List list3 = F3X.A00;
            if (list3 != null) {
                Iterator A0s3 = C41845B3m.A0s(r6, "group_poll_prompt_suggestions", list3);
                while (A0s3.hasNext()) {
                    C41846B3n.A18(r6, A0s3);
                }
                r6.A0Y();
            }
            r6.A0Z();
        }
        String str3 = r7.A04;
        if (str3 != null) {
            r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        List list4 = r7.A08;
        if (list4 != null) {
            Iterator A0s4 = C41845B3m.A0s(r6, "poll_stickers", list4);
            while (A0s4.hasNext()) {
                C42061BFo bFo = (C42061BFo) A0s4.next();
                if (bFo != null) {
                    r6.A0c();
                    C41846B3n.A0y(r6, bFo.A00);
                    List list5 = bFo.A02;
                    if (list5 != null) {
                        Iterator A0s5 = C41845B3m.A0s(r6, "tallies", list5);
                        while (A0s5.hasNext()) {
                            DTL dtl = (DTL) A0s5.next();
                            if (dtl != null) {
                                C42062BFp F7Z = dtl.F7Z();
                                r6.A0c();
                                r6.A0P("count", F7Z.A01);
                                r6.A0O("font_size", F7Z.A00);
                                C41846B3n.A0z(r6, F7Z.A02);
                                r6.A0Z();
                            }
                        }
                        r6.A0Y();
                    }
                    C41846B3n.A0z(r6, bFo.A01);
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        C42141BIw bIw = r7.A03;
        if (bIw != null) {
            r6.A0q("templates_info");
            D2L.A00(r6, bIw);
        }
        String str4 = r7.A05;
        if (str4 != null) {
            r6.A0R("thumbnail_url", str4);
        }
        CreateModeType createModeType = r7.A00;
        if (createModeType != null) {
            r6.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, createModeType.A00);
        }
        r6.A0Z();
    }
}
