package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediatype.ProductType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vo7  reason: case insensitive filesystem */
public abstract class C18240Vo7 {
    public static final AnonymousClass3WR A01(QuestionMediaResponseModel questionMediaResponseModel) {
        String str;
        float f;
        QuestionMediaResponseModel questionMediaResponseModel2 = questionMediaResponseModel;
        Integer num = questionMediaResponseModel2.A04;
        int i = 1iA.A0a.A00;
        C255573uM r7 = null;
        if (num == null || num.intValue() != i) {
            return null;
        }
        Integer num2 = AnonymousClass05K.A01;
        ProductType productType = ProductType.STORY_INTERACTION_RESPONSE;
        List list = questionMediaResponseModel2.A0B;
        if (list != null) {
            SpritesheetInfo spritesheetInfo = questionMediaResponseModel2.A01;
            boolean z = false;
            if (spritesheetInfo != null) {
                int A01 = DbX.A01(spritesheetInfo.BPQ());
                Float C6u = spritesheetInfo.C6u();
                float f2 = 0.0f;
                if (C6u != null) {
                    f = C6u.floatValue();
                } else {
                    f = 0.0f;
                }
                int A0A = AnonymousClass7TG.A0A(spritesheetInfo.C6w());
                int A012 = DbX.A01(spritesheetInfo.C77());
                int A013 = DbX.A01(spritesheetInfo.C79());
                Float CE8 = spritesheetInfo.CE8();
                if (CE8 != null) {
                    f2 = CE8.floatValue();
                }
                AnonymousClass1GB.A01(f2);
                r7 = new C255573uM(spritesheetInfo.ByT(), f, A01, A0A, A012, A013);
            }
            ArrayList A00 = AnonymousClass3WQ.A00(list);
            if ((A00 != null && !A00.isEmpty()) || !((str = questionMediaResponseModel2.A09) == null || str.length() == 0)) {
                z = true;
            }
            String str2 = questionMediaResponseModel2.A07;
            if (str2 != null) {
                String str3 = questionMediaResponseModel2.A09;
                if (str3 != null) {
                    Integer num3 = questionMediaResponseModel2.A03;
                    if (num3 != null) {
                        String str4 = questionMediaResponseModel2.A08;
                        if (str4 != null) {
                            Boolean bool = questionMediaResponseModel2.A02;
                            if (bool != null) {
                                return new AnonymousClass3WR((C2814057m) null, productType, r7, bool, (Double) null, num2, num3, str2, (String) null, (String) null, str3, (String) null, str4, (String) null, (String) null, (String) null, A00, (List) null, (List) null, -1, -1, 0, false, false, false, false, false, false, z, false);
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final ExtendedImageUrl A00(Context context, ImageInfo imageInfo, int i, int i2) {
        Integer num;
        AnonymousClass7TG.A1N(imageInfo, context);
        if (i2 <= 0 || i <= 0 || i != i2) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        return 1iI.A02(context, imageInfo, num);
    }
}
