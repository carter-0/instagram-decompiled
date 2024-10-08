package X;

import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAS {
    public static C17738Vd7 parseFromJson(16F r6) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(r6, 0);
        try {
            C17738Vd7 vd7 = new C17738Vd7();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("destination".equals(A17)) {
                    vd7.A06 = C16852V8h.A00(AnonymousClass7TG.A0l(r6));
                } else if ("call_to_action".equals(A17)) {
                    vd7.A05 = XIGIGBoostCallToAction.valueOf(r6.A1Q());
                } else if ("website_url".equals(A17)) {
                    vd7.A0A = AnonymousClass7TG.A0l(r6);
                } else if ("audience".equals(A17)) {
                    vd7.A09 = VAP.parseFromJson(r6);
                } else if ("unified_audience".equals(A17)) {
                    vd7.A03 = C44550Cgk.parseFromJson(r6);
                } else if ("duration_in_days".equals(A17)) {
                    vd7.A01 = r6.A1D();
                } else if (AnonymousClass000.A00(581).equals(A17)) {
                    vd7.A00 = r6.A1D();
                } else if ("authorization_category".equals(A17)) {
                    AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = (AdCreativeAuthorizationCategory) AdCreativeAuthorizationCategory.A01.get(r6.A1Q());
                    if (adCreativeAuthorizationCategory == null) {
                        adCreativeAuthorizationCategory = AdCreativeAuthorizationCategory.A04;
                    }
                    vd7.A07 = adCreativeAuthorizationCategory;
                } else if ("regulated_categories".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            arrayList.add(VAY.A00(r6.A1Q()));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    vd7.A0H = arrayList;
                } else if ("instagram_positions".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (r6.A11() == 16L.A0G) {
                                str3 = null;
                            } else {
                                str3 = r6.A1P();
                            }
                            arrayList2.add(V70.A00(str3));
                        }
                        arrayList = arrayList2;
                    }
                    0qQ.A0B(arrayList, 0);
                    vd7.A0G = arrayList;
                } else if ("reach_estimate".equals(A17)) {
                    vd7.A02 = V7C.parseFromJson(r6);
                } else if ("draft_id".equals(A17)) {
                    vd7.A0B = AnonymousClass7TG.A0l(r6);
                } else if ("lead_gen_form_id".equals(A17)) {
                    vd7.A0C = AnonymousClass7TG.A0l(r6);
                } else if ("lead_gen_form_name".equals(A17)) {
                    vd7.A0D = AnonymousClass7TG.A0l(r6);
                } else if ("additional_publisher_platforms".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        ArrayList arrayList3 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (r6.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r6.A1P();
                            }
                            PublisherPlatform publisherPlatform = (PublisherPlatform) PublisherPlatform.A01.get(str2);
                            if (publisherPlatform == null) {
                                publisherPlatform = PublisherPlatform.UNRECOGNIZED;
                            }
                            arrayList3.add(publisherPlatform);
                        }
                        arrayList = arrayList3;
                    }
                    0qQ.A0B(arrayList, 0);
                    vd7.A0F = arrayList;
                } else if ("messaging_destinations".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        ArrayList arrayList4 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (r6.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r6.A1P();
                            }
                            arrayList4.add(C16852V8h.A00(str));
                        }
                        arrayList = arrayList4;
                    }
                    0qQ.A0B(arrayList, 0);
                    vd7.A0I = arrayList;
                } else if ("ctx_welcome_message_status".equals(A17)) {
                    XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus = (XFBCTXWelcomeMessageStatus) XFBCTXWelcomeMessageStatus.A01.get(AnonymousClass7TG.A0l(r6));
                    if (xFBCTXWelcomeMessageStatus == null) {
                        xFBCTXWelcomeMessageStatus = XFBCTXWelcomeMessageStatus.UNRECOGNIZED;
                    }
                    vd7.A04 = xFBCTXWelcomeMessageStatus;
                } else if ("selected_audio_name".equals(A17)) {
                    vd7.A0E = AnonymousClass7TG.A0l(r6);
                } else if ("boost_packages".equals(A17)) {
                    vd7.A08 = VAO.parseFromJson(r6);
                }
                r6.A0z();
            }
            return vd7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
