package X;

import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D0F {
    public static TrackMetadataImpl parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            Long l = null;
            String str2 = null;
            Boolean bool3 = null;
            Integer num = null;
            Integer num2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("allow_media_creation_with_music".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("display_labels".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            if (r15.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r15.A1P();
                            }
                            arrayList.add(C272264kP.A00(str));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_media_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r15);
                } else if ("formatted_clips_media_count".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("is_bookmarked".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r15);
                } else if ("is_trending_in_clips".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r15);
                } else if ("previous_trend_rank".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else {
                    num2 = C41847B3o.A13(r15, num2, A17, "trend_rank");
                }
                r15.A0z();
            }
            if (bool == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("allow_media_creation_with_music", r15, "TrackMetadataImpl");
            } else if (bool2 != null || !(r15 instanceof 0c9)) {
                return new TrackMetadataImpl(bool3, num, num2, l, str2, arrayList, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_bookmarked", r15, "TrackMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, TrackMetadataImpl trackMetadataImpl) {
        r3.A0c();
        r3.A0S("allow_media_creation_with_music", trackMetadataImpl.A06);
        List list = trackMetadataImpl.A05;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "display_labels", list);
            while (A0s.hasNext()) {
                AudioMetadataLabels audioMetadataLabels = (AudioMetadataLabels) A0s.next();
                if (audioMetadataLabels != null) {
                    r3.A0t(audioMetadataLabels.A00);
                }
            }
            r3.A0Y();
        }
        Long l = trackMetadataImpl.A03;
        if (l != null) {
            r3.A0Q("display_media_id", l.longValue());
        }
        String str = trackMetadataImpl.A04;
        if (str != null) {
            r3.A0R("formatted_clips_media_count", str);
        }
        r3.A0S("is_bookmarked", trackMetadataImpl.A07);
        Boolean bool = trackMetadataImpl.A00;
        if (bool != null) {
            r3.A0S("is_trending_in_clips", bool.booleanValue());
        }
        Integer num = trackMetadataImpl.A01;
        if (num != null) {
            r3.A0P("previous_trend_rank", num.intValue());
        }
        Integer num2 = trackMetadataImpl.A02;
        if (num2 != null) {
            r3.A0P("trend_rank", num2.intValue());
        }
        r3.A0Z();
    }
}
