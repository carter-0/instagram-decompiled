package X;

import android.graphics.RectF;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;

/* renamed from: X.UvF  reason: case insensitive filesystem */
public final class C16459UvF extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelQuestionResponseShareFragment";
    public int A00;
    public RectF A01;
    public 28D A02;
    public MusicQuestionResponseModel A03;
    public QuestionResponseType A04;
    public QuestionMediaResponseModel A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final String getModuleName() {
        return "reel_question_response_share_fragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1857988136(0x6ebea628, float:2.9501511E28)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onCreate(r7)
            android.os.Bundle r4 = r6.requireArguments()
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r6.A01 = r0
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ORIGINAL_QUESTION_ID"
            java.lang.String r0 = r4.getString(r0)
            r6.A07 = r0
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_QUESTION_RESPONSE_ID"
            java.lang.String r0 = r4.getString(r0)
            r6.A08 = r0
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ORIGINAL_QUESTION"
            java.lang.String r0 = r4.getString(r0)
            r6.A06 = r0
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_QUESTION_RESPONSE_TYPE"
            java.lang.String r0 = r4.getString(r0)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = X.C369268u8.A00(r0)
            r6.A04 = r0
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x009c
            r0 = 3
            java.lang.String r5 = "Required value was null."
            if (r1 == r0) goto L_0x0071
            r0 = 2
            if (r1 != r0) goto L_0x00ac
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x00a5 }
            com.instagram.common.session.UserSession r1 = r6.A00     // Catch:{ IOException -> 0x00a5 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_MEDIA_RESPONSE_JSON"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ IOException -> 0x00a5 }
            if (r0 == 0) goto L_0x0065
            X.0c9 r0 = r2.A01(r1, r0)     // Catch:{ IOException -> 0x00a5 }
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r0 = X.D2F.parseFromJson(r0)     // Catch:{ IOException -> 0x00a5 }
            r6.A05 = r0     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00ac
        L_0x0065:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a5 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x00a5 }
            r0 = -1346857017(0xffffffffafb897c7, float:-3.357725E-10)
            X.AnonymousClass0fD.A09(r0, r3)     // Catch:{ IOException -> 0x00a5 }
            throw r1     // Catch:{ IOException -> 0x00a5 }
        L_0x0071:
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x0097 }
            com.instagram.common.session.UserSession r1 = r6.A00     // Catch:{ IOException -> 0x0097 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_MUSIC_RESPONSE_JSON"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ IOException -> 0x0097 }
            if (r0 == 0) goto L_0x008b
            X.0c9 r0 = r2.A01(r1, r0)     // Catch:{ IOException -> 0x0097 }
            com.instagram.reels.question.model.MusicQuestionResponseModel r0 = X.D2E.parseFromJson(r0)     // Catch:{ IOException -> 0x0097 }
            r6.A03 = r0     // Catch:{ IOException -> 0x0097 }
            goto L_0x00ac
        L_0x008b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0097 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0097 }
            r0 = 1686533771(0x6486768b, float:1.9843245E22)
            X.AnonymousClass0fD.A09(r0, r3)     // Catch:{ IOException -> 0x0097 }
            throw r1     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            java.lang.String r1 = "QuestionMusicResponse"
            java.lang.String r0 = "Unable to serialize question music response"
            goto L_0x00a9
        L_0x009c:
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_TEXT_RESPONSE"
            java.lang.String r0 = r4.getString(r0)
            r6.A0A = r0
            goto L_0x00ac
        L_0x00a5:
            java.lang.String r1 = "QuestionMediaResponse"
            java.lang.String r0 = "Unable to parse question media response"
        L_0x00a9:
            X.0wb.A03(r1, r0)
        L_0x00ac:
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_BACKGROUND_FILL_COLOR"
            int r0 = r4.getInt(r0)
            r6.A00 = r0
            java.lang.String r1 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT"
            java.lang.Object r0 = r4.get(r1)
            boolean r0 = r0 instanceof X.28D
            if (r0 == 0) goto L_0x00d7
            X.28D r0 = X.C13991Tnr.A0A(r4, r1)
        L_0x00c2:
            r6.A02 = r0
            java.lang.String r0 = "ReelQuestionResponseShareConstants.ARGUMENTS_KEY_RESPONDER_USER_ID"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = ""
        L_0x00ce:
            r6.A09 = r0
            r0 = 628784973(0x257a7f4d, float:2.1727175E-16)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00d7:
            X.28D r0 = X.28D.A49
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16459UvF.onCreate(android.os.Bundle):void");
    }
}
