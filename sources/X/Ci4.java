package X;

import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.Range;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Ci4 {
    public static TextWithEntities parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            LinkAction linkAction = null;
            ArrayList arrayList3 = null;
            String str2 = null;
            Long l = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("color_ranges".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            ColorAtTextRangeDict parseFromJson = CW1.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("inline_style_ranges".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            InlineStyleAtRangeDict parseFromJson2 = C44193CZg.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("link_action".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    linkAction = (LinkAction) LinkAction.A01.get(str);
                    if (linkAction == null) {
                        linkAction = LinkAction.UNRECOGNIZED;
                    }
                } else if ("ranges".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Range parseFromJson3 = C44300Cci.parseFromJson(r9);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (!C41845B3m.A1A(A17)) {
                    l = C41847B3o.A14(r9, l, A17, "timestamp");
                } else if (r9.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r9.A1P();
                }
                r9.A0z();
            }
            return new TextWithEntities(linkAction, l, str2, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
