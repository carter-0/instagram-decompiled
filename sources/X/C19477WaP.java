package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.WaP  reason: case insensitive filesystem */
public final class C19477WaP implements C2802350v {
    public static final int[] A02 = {-4652876, -720896};
    public UNR A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C19477WaP waP = (C19477WaP) obj;
            if (!2Ob.A00(this.A00, waP.A00)) {
                return false;
            }
            List A06 = A06();
            List A062 = waP.A06();
            QuestionResponseType questionResponseType = QuestionResponseType.TEXT;
            if (A06.contains(questionResponseType) != A062.contains(questionResponseType)) {
                return false;
            }
            QuestionResponseType questionResponseType2 = QuestionResponseType.MEDIA;
            return A06.contains(questionResponseType2) == A062.contains(questionResponseType2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, this.A00});
    }

    public final int A02() {
        Long l = this.A00.A03;
        if (l == null) {
            return 0;
        }
        return l.intValue();
    }

    public final int A03(Context context) {
        return 0nH.A0C(this.A00.A04, A00(context));
    }

    public final int A04(Context context) {
        return 0nH.A0C(this.A00.A09, A01(context));
    }

    public final String A05() {
        String str = this.A00.A07;
        if (str == null || str.length() > 1000) {
            return null;
        }
        return str;
    }

    public final List A06() {
        List list = this.A00.A0A;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final void A07(String str) {
        UNR unr = this.A00;
        0qQ.A0B(unr, 1);
        String str2 = unr.A04;
        Boolean bool = unr.A01;
        String str3 = unr.A05;
        String str4 = unr.A06;
        String str5 = unr.A08;
        Long l = unr.A03;
        QuestionStickerType questionStickerType = unr.A00;
        List list = unr.A0A;
        this.A00 = new UNR(questionStickerType, bool, unr.A02, l, str2, str3, str4, str, str5, unr.A09, list);
    }

    public final boolean A08() {
        Boolean bool = this.A00.A01;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public C19477WaP(ImageUrl imageUrl, QuestionStickerType questionStickerType, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        String url;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(QuestionResponseType.TEXT);
        }
        if (z3) {
            arrayList.add(QuestionResponseType.MEDIA);
        }
        String A0F = 0nH.A0F(i);
        Boolean valueOf = Boolean.valueOf(z);
        if (imageUrl == null) {
            url = null;
        } else {
            url = imageUrl.getUrl();
        }
        QuestionStickerType questionStickerType2 = questionStickerType;
        this.A00 = new UNR(questionStickerType2, valueOf, AnonymousClass7TE.A0u(), C51971G9r.A0m(), A0F, (String) null, url, str2, (String) null, 0nH.A0F(i2), arrayList);
        this.A01 = str;
    }

    public static int A00(Context context) {
        if (C61670oa.A0H()) {
            return context.getColor(R.color.abc_decor_view_status_guard_light);
        }
        return -1;
    }

    public static int A01(Context context) {
        if (C61670oa.A0H()) {
            return context.getColor(R.color.igds_primary_text);
        }
        return -16777216;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        if (!A06().isEmpty()) {
            ((C317966o8) AnonymousClass7TE.A13(C317876nz.A1I.A0O)).A0S = "expressive_question_sticker";
        }
        AnonymousClass7TG.A1J(C317876nz.A1I, A0C);
        return A0C;
    }

    public final Integer CAk() {
        if (A08()) {
            return AnonymousClass05K.A0Q;
        }
        return AnonymousClass05K.A0P;
    }

    public C19477WaP(ImageUrl imageUrl, QuestionStickerType questionStickerType, String str, int i, int i2, boolean z, boolean z2) {
        String url;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(QuestionResponseType.MEDIA);
        }
        String A0F = 0nH.A0F(i);
        Boolean valueOf = Boolean.valueOf(z);
        if (imageUrl == null) {
            url = null;
        } else {
            url = imageUrl.getUrl();
        }
        QuestionStickerType questionStickerType2 = questionStickerType;
        this.A00 = new UNR(questionStickerType2, valueOf, AnonymousClass7TE.A0u(), C51971G9r.A0m(), A0F, (String) null, url, str, (String) null, 0nH.A0F(i2), arrayList);
        this.A01 = null;
    }
}
