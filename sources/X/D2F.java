package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D2F {
    public static QuestionMediaResponseModel parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ImageInfo imageInfo = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            SpritesheetInfo spritesheetInfo = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("has_audio".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if (C41845B3m.A17(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("image_versions2".equals(A17)) {
                    imageInfo = 1dH.parseFromJson(r15);
                } else if ("is_dash_eligible".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if (C41845B3m.A1O(A17)) {
                    num2 = AnonymousClass7TF.A0X(r15);
                } else if ("original_height".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r15);
                } else if ("original_width".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r15);
                } else if ("thumbnails".equals(A17)) {
                    spritesheetInfo = 1rH.parseFromJson(r15);
                } else if ("video_codec".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("video_dash_manifest".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("video_path".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("video_versions".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            VideoVersion parseFromJson = 1rY.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r15.A0z();
            }
            return new QuestionMediaResponseModel(imageInfo, spritesheetInfo, bool, num, num2, num3, num4, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, QuestionMediaResponseModel questionMediaResponseModel) {
        r2.A0c();
        Boolean bool = questionMediaResponseModel.A02;
        if (bool != null) {
            r2.A0S("has_audio", bool.booleanValue());
        }
        C41846B3n.A0y(r2, questionMediaResponseModel.A07);
        C41847B3o.A1J(r2, questionMediaResponseModel.A00);
        Integer num = questionMediaResponseModel.A03;
        if (num != null) {
            r2.A0P("is_dash_eligible", num.intValue());
        }
        Integer num2 = questionMediaResponseModel.A04;
        if (num2 != null) {
            r2.A0P("media_type", num2.intValue());
        }
        Integer num3 = questionMediaResponseModel.A05;
        if (num3 != null) {
            r2.A0P("original_height", num3.intValue());
        }
        Integer num4 = questionMediaResponseModel.A06;
        if (num4 != null) {
            r2.A0P("original_width", num4.intValue());
        }
        SpritesheetInfo spritesheetInfo = questionMediaResponseModel.A01;
        if (spritesheetInfo != null) {
            r2.A0q("thumbnails");
            1rH.A00(r2, spritesheetInfo.FEc());
        }
        String str = questionMediaResponseModel.A08;
        if (str != null) {
            r2.A0R("video_codec", str);
        }
        String str2 = questionMediaResponseModel.A09;
        if (str2 != null) {
            r2.A0R("video_dash_manifest", str2);
        }
        String str3 = questionMediaResponseModel.A0A;
        if (str3 != null) {
            r2.A0R("video_path", str3);
        }
        List list = questionMediaResponseModel.A0B;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "video_versions", list);
            while (A0s.hasNext()) {
                VideoVersion videoVersion = (VideoVersion) A0s.next();
                if (videoVersion != null) {
                    1rY.A00(r2, videoVersion);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
