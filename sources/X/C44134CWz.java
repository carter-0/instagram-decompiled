package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CWz  reason: case insensitive filesystem */
public abstract class C44134CWz {
    public static CreatorViewerSignalWithInsightsInfoImpl parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            CreatorViewerSignalInfoImpl creatorViewerSignalInfoImpl = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("image".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("insights".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            CreatorViewerInsightInfoImpl parseFromJson = C44117CWi.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("signal".equals(A17)) {
                    creatorViewerSignalInfoImpl = C44126CWr.parseFromJson(r9);
                }
                r9.A0z();
            }
            if (creatorViewerSignalInfoImpl != null || !(r9 instanceof 0c9)) {
                return new CreatorViewerSignalWithInsightsInfoImpl(creatorViewerSignalInfoImpl, str, str2, arrayList);
            }
            AnonymousClass7TF.A1L("signal", r9, "CreatorViewerSignalWithInsightsInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
