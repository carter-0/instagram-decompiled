package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import java.util.List;

/* renamed from: X.Aew  reason: case insensitive filesystem */
public final class C40608Aew implements C2802350v {
    public StoryTemplateFillableGalleryStickerDict A00 = new StoryTemplateFillableGalleryStickerDictImpl(C48786Ek9.A00(C354668Mx.RECTANGLE), (Float) null, (Float) null, (Float) null, (Float) null, (Float) null, (Integer) null);
    public boolean A01 = true;

    public final C354668Mx A00() {
        StoryTemplateFillableGalleryStickerShapes B8s = this.A00.B8s();
        if (B8s == null) {
            return null;
        }
        switch (B8s.ordinal()) {
            case 2:
                return C354668Mx.CIRCLE;
            case 4:
                return C354668Mx.HEART_FILLABLE;
            case 6:
            case 8:
                return C354668Mx.RECTANGLE;
            case 9:
                return C354668Mx.SQUARE;
            case 11:
                return C354668Mx.STAR_FILLABLE;
            default:
                throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(B8s, "No gallery style type defined for shape: ", AnonymousClass7TE.A1A()));
        }
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A18;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A0m, A0C);
        return A0C;
    }
}
