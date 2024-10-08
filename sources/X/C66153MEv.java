package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.MEv  reason: case insensitive filesystem */
public final class C66153MEv extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66153MEv(Object obj, Object obj2, Object obj3, String str, String str2, AnonymousClass4D7 r7, int i, boolean z) {
        super(2, r7);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A04 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEv, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        boolean z;
        Object obj4;
        int i;
        AnonymousClass4D7 r6 = r11;
        if (this.A01 != 0) {
            obj4 = this.A04;
            obj3 = this.A03;
            z = this.A07;
            str2 = this.A06;
            str = this.A05;
            obj2 = this.A02;
            i = 1;
        } else {
            obj2 = this.A02;
            obj3 = this.A03;
            str = this.A05;
            str2 = this.A06;
            z = this.A07;
            obj4 = this.A04;
            i = 0;
        }
        return new C66153MEv(obj2, obj3, obj4, str, str2, r6, i, z);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MEv, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        String str;
        AnonymousClass5MM r1;
        if (this.A01 != 0) {
            1Hj r5 = 1Hj.A02;
            int i = this.A00;
            if (i == 0) {
                0eS.A00(obj);
                TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = (TranslatedCaptionsStickerViewBinder$Holder) this.A04;
                UserSession userSession = (UserSession) this.A03;
                if (this.A07) {
                    str = this.A06;
                } else {
                    str = this.A05;
                }
                BFH bfh = ((C255783ui) this.A02).A0J;
                this.A00 = 1;
                obj = TranslatedCaptionsStickerViewBinder$Holder.A03(bfh, userSession, translatedCaptionsStickerViewBinder$Holder, str, this);
                if (obj == r5) {
                    return r5;
                }
            } else if (i == 1) {
                0eS.A00(obj);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            UOC uoc = (UOC) obj;
            IgSimpleImageView A012 = TranslatedCaptionsStickerViewBinder$Holder.A01((TranslatedCaptionsStickerViewBinder$Holder) this.A04);
            if (uoc != null) {
                Drawable drawable = A012.getDrawable();
                if (drawable instanceof AnonymousClass5MH) {
                    drawable = ((AnonymousClass5MH) drawable).A0A;
                }
                if ((drawable instanceof AnonymousClass5MM) && (r1 = (AnonymousClass5MM) drawable) != null) {
                    r1.A08(uoc);
                }
            } else {
                A012.setImageDrawable((Drawable) null);
            }
        } else {
            1Hj r52 = 1Hj.A02;
            int i2 = this.A00;
            if (i2 == 0) {
                0eS.A00(obj);
                Object obj2 = this.A02;
                0lg r2 = (0lg) this.A03;
                Dba.A0j(1, obj2, r2);
                String str2 = this.A05;
                String str3 = this.A06;
                this.A00 = 1;
                obj = ((ClipsRemixOriginalMediaRepository) r2.A01(ClipsRemixOriginalMediaRepository.class, C66291MMa.A00(obj2, r2, 24))).A00(str2, str3, this);
                if (obj == r52) {
                    return r52;
                }
            } else if (i2 != 1) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
            }
            boolean z = this.A07;
            UserSession userSession2 = (UserSession) this.A03;
            C41503Av4 av4 = new C41503Av4((Context) this.A02, userSession2, (AnonymousClass88B) this.A04, z);
            this.A00 = 2;
            if (((AnonymousClass0r6) obj).collect(av4, this) == r52) {
                return r52;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66153MEv) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
