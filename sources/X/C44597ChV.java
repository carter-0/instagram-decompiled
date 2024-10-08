package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ChV  reason: case insensitive filesystem */
public abstract class C44597ChV {
    public static BBL parseFromJson(16F r15) {
        String str;
        String str2;
        0qQ.A0B(r15, 0);
        try {
            Boolean bool = null;
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str3 = null;
            ThreadHeaderStyle threadHeaderStyle = null;
            String str4 = null;
            C42121BHz bHz = null;
            ArrayList arrayList = null;
            ThreadContainerType threadContainerType = null;
            String str5 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("header".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("header_style".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                    threadHeaderStyle = (ThreadHeaderStyle) ThreadHeaderStyle.A01.get(str2);
                    if (threadHeaderStyle == null) {
                        threadHeaderStyle = ThreadHeaderStyle.UNRECOGNIZED;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("show_create_reply_cta".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("thread_header_context".equals(A17)) {
                    bHz = C44537CgX.parseFromJson(r15);
                } else if ("thread_items".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C53467Goz parseFromJson = HU7.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("thread_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    threadContainerType = (ThreadContainerType) ThreadContainerType.A01.get(str);
                    if (threadContainerType == null) {
                        threadContainerType = ThreadContainerType.UNRECOGNIZED;
                    }
                } else if ("view_state_item_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str4 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r15, "Thread");
            } else if (bool == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_create_reply_cta", r15, "Thread");
            } else if (arrayList == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("thread_items", r15, "Thread");
            } else if (threadContainerType != null || !(r15 instanceof 0c9)) {
                return new BBL(threadContainerType, bHz, threadHeaderStyle, str3, str4, str5, arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("thread_type", r15, "Thread");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
