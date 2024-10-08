package X;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;

public final class GL6 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GL6(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A06 = z;
        this.A03 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, X.8gU] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        SpannableStringBuilder spannableStringBuilder;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                Bitmap bitmap = (Bitmap) this.A01;
                C364758lx r3 = (C364758lx) this.A03;
                return C354148Kv.A00(bitmap, (Bitmap) null, (FilterChain) this.A04, r3, (C354148Kv) this.A05, (C352218Cl) this.A02, (String) null, this.A06, false, false);
            case 1:
                UserSession userSession = (UserSession) this.A05;
                Fragment fragment = (Fragment) this.A04;
                C352218Cl r5 = (C352218Cl) this.A01;
                boolean z = this.A06;
                Bitmap bitmap2 = (Bitmap) this.A03;
                ImageUrl imageUrl = ((MusicOverlayStickerModel) this.A02).A04;
                String Aqe = imageUrl.Aqe();
                if (Aqe != null) {
                    C56274Hvi.A00(bitmap2, fragment, userSession, imageUrl, r5, Aqe, z);
                    break;
                }
                break;
            case 2:
                if (this.A06) {
                    boolean A1a = C51972G9s.A1a(this.A02);
                    float f = 0.0f;
                    C51967G9n.A19((2V5) this.A04, C51970G9q.A01(A1a ? 1 : 0));
                    2V5 r0 = (2V5) this.A01;
                    if (A1a) {
                        f = 1.0f;
                    }
                    C51967G9n.A19(r0, f);
                }
                ((2Wa) this.A03).A02(AnonymousClass7TE.A0u());
                break;
            case 3:
                if (C51972G9s.A1a(this.A02)) {
                    spannableStringBuilder = DbS.A0C(C244013aV.A0F((AnonymousClass3Y5) this.A04, DbT.A10(this.A01), 2131976202));
                    num = AnonymousClass05K.A01;
                } else {
                    spannableStringBuilder = (SpannableStringBuilder) this.A01;
                    if (this.A06) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A00;
                    }
                }
                return C263314Kg.A01(C51966G9m.A0Q(this.A04), spannableStringBuilder, ((C52202GIt) this.A05).A03, (AnonymousClass4Ke) this.A03, num);
            case 4:
                boolean z2 = this.A06;
                return new C52121GFp((2Wa) this.A04, (2Wa) this.A01, (2Wa) this.A03, (GFJ) this.A05, (C62320sa) this.A02, z2);
            default:
                ? obj = new Object();
                C52654GaS gaS = (C52654GaS) this.A05;
                0lg r1 = (0lg) this.A04;
                if (this.A06) {
                    str = "midcard_primary_cta_tap";
                } else {
                    str = "midcard_secondary_cta_tap";
                }
                InstagramMidcardType instagramMidcardType = (InstagramMidcardType) this.A02;
                ClipsMidCardSubtype clipsMidCardSubtype = (ClipsMidCardSubtype) this.A01;
                C51979GAc gAc = gaS.A08;
                0Aj A0M = C51972G9s.A0M(gAc, r1);
                if (A0M.isSampled()) {
                    I3w.A02(A0M, clipsMidCardSubtype, instagramMidcardType, C51979GAc.A00(A0M, gAc, str));
                }
                obj.A00(new C58703IwC(this.A03, 39), 4000);
                break;
        }
        return C60340gF.A00;
    }
}
