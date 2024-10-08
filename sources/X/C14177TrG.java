package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.TrG  reason: case insensitive filesystem */
public final class C14177TrG implements C252243on {
    public C331157Pu A00;
    public C17801VgE A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final AnonymousClass07i A07;
    public final AnonymousClass0iw A08;
    public final 1Ng A09;
    public final UserSession A0A;
    public final X9G A0B;
    public final 1wn A0C = new C19221WQb(this, 33);

    public C14177TrG(Activity activity, AnonymousClass07i r4, AnonymousClass0iw r5, UserSession userSession, X9G x9g) {
        0qQ.A0B(userSession, 5);
        this.A06 = activity;
        this.A08 = r5;
        this.A07 = r4;
        this.A0A = userSession;
        this.A0B = x9g;
        this.A09 = AnonymousClass1Nd.A00(userSession);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void A00(int i) {
        this.A0B.CHw(i);
        Bundle bundle = new Bundle();
        bundle.putInt("starting_position", i);
        UserSession userSession = this.A0A;
        DbU.A1D(bundle, userSession);
        Fragment r4 = new AnonymousClass4DH();
        r4.setArguments(bundle);
        r4.A04 = this;
        C331127Pr r3 = new C331127Pr(userSession);
        r3.A0a = AnonymousClass7TE.A0u();
        Activity activity = this.A06;
        r3.A0F = ViewConfiguration.get(activity).getScaledPagingTouchSlop();
        r3.A0X = new C16291Us3(this, 2);
        this.A00 = r3.A00().A02(activity, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C17801VgE r7) {
        /*
            r6 = this;
            r6.A01 = r7
            X.7Pu r1 = r6.A00
            if (r1 == 0) goto L_0x000e
            r0 = 1
            r6.A05 = r0
            r0 = 0
            r1.A0L(r0)
        L_0x000d:
            return
        L_0x000e:
            r5 = 0
            if (r7 == 0) goto L_0x000d
            com.instagram.reels.question.model.QuestionResponseModel r2 = r7.A00
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = r2.A02
            if (r0 == 0) goto L_0x000d
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 != r0) goto L_0x000d
            X.UzD r4 = X.C16677UzD.STORY_QUESTION_RESPONSE
            java.lang.String r5 = r2.A07
        L_0x0025:
            com.instagram.common.session.UserSession r2 = r6.A0A
            android.app.Activity r0 = r6.A06
            X.0iw r1 = r6.A08
            if (r5 != 0) goto L_0x002f
            java.lang.String r5 = ""
        L_0x002f:
            X.TpH r3 = X.C14068TpH.STORY
            X.OcF r2 = X.ORV.A01(r0, r1, r2, r3, r4, r5)
            com.instagram.reels.question.model.QuestionResponseModel r0 = r7.A00
            com.instagram.user.model.User r0 = r0.A04
            r2.A01 = r0
            r1 = 1
            X.Uu7 r0 = new X.Uu7
            r0.<init>(r1)
            r2.A07(r0)
            r0 = 0
            X.C71093OcF.A00(r0, r2)
            return
        L_0x0049:
            X.UzD r4 = X.C16677UzD.MEDIA
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r0 = r2.A03
            if (r0 == 0) goto L_0x0025
            java.lang.String r5 = r0.A07
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14177TrG.A01(X.VgE):void");
    }

    public final void A02(C17801VgE vgE) {
        String str;
        String str2;
        String str3;
        QuestionResponseType questionResponseType;
        String str4;
        String str5;
        QuestionResponseModel questionResponseModel;
        QuestionResponseModel questionResponseModel2;
        User user;
        this.A01 = vgE;
        C331157Pu r1 = this.A00;
        if (r1 != null) {
            this.A03 = true;
            r1.A0L((C332277Ui) null);
            return;
        }
        1ap r2 = 1as.A04.A02;
        UserSession userSession = this.A0A;
        OOA A062 = r2.A06(this.A08, userSession, "reel_dashboard_viewer");
        X9G x9g = this.A0B;
        C255773uh AuN = x9g.AuN();
        String str6 = null;
        if (AuN != null) {
            str = AuN.A0k;
        } else {
            str = null;
        }
        if (str != null) {
            A062.A03(str);
            C255773uh AuN2 = x9g.AuN();
            if (AuN2 == null || (str2 = AuN2.A0j) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            A062.A04(str2);
            if (vgE == null || (user = vgE.A00.A04) == null) {
                str3 = null;
            } else {
                str3 = user.getId();
            }
            A062.A06(str3);
            if (vgE == null || (questionResponseModel2 = vgE.A00) == null) {
                questionResponseType = null;
            } else {
                questionResponseType = questionResponseModel2.A02;
            }
            if (questionResponseType != QuestionResponseType.MUSIC && 182.A06(0Tu.A05, userSession, 36314816071076662L)) {
                if (vgE == null || (questionResponseModel = vgE.A00) == null || (str4 = questionResponseModel.A08) == null) {
                    str4 = "";
                }
                Bundle bundle = A062.A01;
                bundle.putString(C66579MXk.A00(92), str4);
                A062.A05(DbW.A0h(this.A06, str4, 2131971060));
                if (vgE != null) {
                    str5 = vgE.A00.A07;
                } else {
                    str5 = null;
                }
                A062.A07(str5, AnonymousClass3WT.QUESTION.A00);
                if (questionResponseType != null) {
                    str6 = questionResponseType.A00;
                }
                0qQ.A0B(str6, 0);
                bundle.putString(C66579MXk.A00(528), str6);
                A062.A01(C66579MXk.A00(1150));
            }
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A06);
            if (A012 != null) {
                A012.A0J(A062.A00());
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A03(C17801VgE vgE) {
        QuestionStickerType questionStickerType;
        String str;
        String str2;
        QuestionMediaResponseModel questionMediaResponseModel;
        MusicQuestionResponseModel musicQuestionResponseModel;
        boolean z;
        ExtendedImageUrl A002;
        String str3;
        this.A01 = vgE;
        C331157Pu r1 = this.A00;
        if (r1 != null) {
            this.A04 = true;
            r1.A0L((C332277Ui) null);
            return;
        }
        Activity activity = this.A06;
        RectF A0C2 = AnonymousClass7TF.A0C((float) 0nA.A09(activity), (float) 0nA.A08(activity));
        C17801VgE vgE2 = this.A01;
        if (vgE2 != null) {
            questionStickerType = vgE2.A01.A02;
        } else {
            questionStickerType = null;
        }
        QuestionStickerType questionStickerType2 = QuestionStickerType.PICS_PLEASE;
        UserSession userSession = this.A0A;
        if (questionStickerType == questionStickerType2) {
            if (vgE2 != null) {
                QuestionMediaResponseModel questionMediaResponseModel2 = vgE2.A00.A03;
                if (questionMediaResponseModel2 != null && questionMediaResponseModel2.A07 != null) {
                    if ((questionMediaResponseModel2.A00 != null || questionMediaResponseModel2.A0B != null) && questionMediaResponseModel2.A06 != null && questionMediaResponseModel2.A05 != null) {
                        Bundle bundle = new Bundle();
                        Integer num = questionMediaResponseModel2.A04;
                        if (num == null || num.intValue() == 1) {
                            z = false;
                            ImageInfo imageInfo = questionMediaResponseModel2.A00;
                            if (imageInfo != null && (A002 = C18240Vo7.A00(activity, imageInfo, questionMediaResponseModel2.A06.intValue(), questionMediaResponseModel2.A05.intValue())) != null) {
                                str3 = A002.A0A;
                            } else {
                                return;
                            }
                        } else {
                            z = true;
                            ArrayList A003 = AnonymousClass3WQ.A00(questionMediaResponseModel2.A0B);
                            if (A003 != null) {
                                String str4 = questionMediaResponseModel2.A07;
                                0qQ.A0B(str4, 0);
                                VideoUrlImpl A012 = C255583uN.A01(str4, A003);
                                if (A012 != null) {
                                    str3 = A012.A06;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (str3 != null) {
                            C290815g0 A032 = C59730JVo.A03(activity, userSession, new C11211SFl(str3, C273654mx.A00(880), z, false, false));
                            A032.A00 = new C15826Uj9(1, activity, bundle, userSession, vgE2, z);
                            1ES.A05(A032, -5, 3, false, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (vgE2 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", A0C2);
            QuestionResponsesModel questionResponsesModel = vgE2.A01;
            bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ORIGINAL_QUESTION", questionResponsesModel.A07);
            bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_QUESTION_RESPONSE_TYPE", vgE2.A00.A02.A00);
            QuestionResponseModel questionResponseModel = vgE2.A00;
            QuestionResponseType questionResponseType = questionResponseModel.A02;
            if (questionResponseType == QuestionResponseType.MUSIC && (musicQuestionResponseModel = questionResponseModel.A01) != null) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                    D2E.A00(A0A2, musicQuestionResponseModel);
                    A0A2.close();
                    bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_MUSIC_RESPONSE_JSON", stringWriter.toString());
                } catch (IOException unused) {
                    str = "QuestionMusicResponse";
                    str2 = "Unable to serialize question music response";
                }
            } else if (questionResponseType != QuestionResponseType.MEDIA || (questionMediaResponseModel = questionResponseModel.A03) == null) {
                String str5 = questionResponseModel.A08;
                if (str5 == null) {
                    str5 = "";
                }
                bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_TEXT_RESPONSE", str5);
            } else {
                try {
                    StringWriter stringWriter2 = new StringWriter();
                    17W A0A3 = AnonymousClass15o.A00.A0A(stringWriter2);
                    D2F.A00(A0A3, questionMediaResponseModel);
                    A0A3.close();
                    bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_MEDIA_RESPONSE_JSON", stringWriter2.toString());
                } catch (IOException unused2) {
                    str = "QuestionMediaResponse";
                    str2 = "Unable to serialize question media response";
                }
            }
            bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_ORIGINAL_QUESTION_ID", questionResponsesModel.A08);
            bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_QUESTION_RESPONSE_ID", vgE2.A00.A07);
            bundle2.putInt("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_BACKGROUND_FILL_COLOR", vgE2.A00());
            bundle2.putSerializable("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", 28D.A49);
            bundle2.putString("ReelQuestionResponseShareConstants.ARGUMENTS_KEY_RESPONDER_USER_ID", vgE2.A00.A04.getId());
            DbU.A0x(activity, bundle2, userSession, TransparentModalActivity.class, C273654mx.A00(3238));
            return;
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        0wb.A03(str, str2);
    }

    public final void onCreate() {
        this.A09.A01(this.A0C, WQ2.class);
    }

    public final void onDestroy() {
        this.A09.A02(this.A0C, WQ2.class);
    }
}
