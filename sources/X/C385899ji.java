package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ji  reason: invalid class name and case insensitive filesystem */
public final class C385899ji extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C385899ji(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onFail(Exception exc) {
        if (1 - this.A00 != 0) {
            C385899ji.super.onFail(exc);
            return;
        }
        C308276Tl r1 = new C308276Tl();
        r1.A01(6);
        C299275ur.A00((C307896Rx) this.A02, r1.A00(), (C277014uI) this.A03);
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            C385899ji.super.onFinish();
        } else {
            ((C48260Ebf) this.A02).A00();
        }
    }

    public final void onStart() {
        switch (this.A00) {
            case 0:
                ((C48260Ebf) this.A02).A01();
                return;
            case 3:
                C387509mK r4 = (C387509mK) this.A01;
                Context context = r4.A07;
                int height = ((NineSixteenLayoutConfigImpl) r4.A09).A0K.getHeight();
                1Xj r0 = r4.A05;
                r0.getClass();
                AnonymousClass9WU r3 = new AnonymousClass9WU(context, r0.A0l(), height);
                r4.A01 = r3;
                r4.A0A.A0C(r3, new C310416b1(r4.A0B), false);
                return;
            default:
                C385899ji.super.onStart();
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImageInfoImpl imageInfoImpl;
        SpritesheetInfoImpl spritesheetInfoImpl;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                File file = (File) obj2;
                0qQ.A0B(file, 0);
                C50349FZg fZg = (C50349FZg) this.A03;
                fZg.A04 = file;
                Intent intent = (Intent) this.A01;
                Uri fromFile = Uri.fromFile(file);
                if (fromFile == null && (fromFile = intent.getData()) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                C50349FZg.A00(fromFile, fZg);
                return;
            case 1:
                File file2 = (File) obj2;
                0qQ.A0B(file2, 0);
                C59730JVo.A08((Context) this.A01, file2);
                C308276Tl r1 = new C308276Tl();
                r1.A03(0, 0);
                C299275ur.A00((C307896Rx) this.A02, r1.A00(), (C277014uI) this.A03);
                return;
            case 2:
                C347987xh r0 = (C347987xh) obj2;
                0qQ.A0B(r0, 0);
                ((C59996Jd5) this.A03).A08.clear();
                for (Medium A04 : r0.A01) {
                    ((C355608Qq) this.A01).A04(A04, (C348257y9) this.A02);
                }
                return;
            case 3:
                File file3 = (File) obj2;
                1Xj r5 = (1Xj) this.A03;
                int A09 = AnonymousClass7TG.A09(r5);
                0qQ.A0B(file3, 0);
                Medium A032 = C282665Eg.A03(file3, A09, 0);
                C387509mK r3 = (C387509mK) this.A01;
                A032.A0H = C39581A0x.A00(r3.A08, file3, A032.CeS());
                r3.A0C.put(r5.getId(), A032);
                C387509mK.A01((AnonymousClass57C) this.A02, r3, r5);
                return;
            case 4:
                File file4 = (File) obj2;
                1Xj r32 = (1Xj) this.A03;
                int A092 = AnonymousClass7TG.A09(r32);
                0qQ.A0B(file4, 0);
                Medium A033 = C282665Eg.A03(file4, A092, 0);
                ((AbstractMap) this.A02).put(r32.getId(), A033);
                C380609Yv r12 = (C380609Yv) this.A01;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                if (r32.equals(r12.A00)) {
                    C380609Yv.A00(A033, r12);
                    return;
                }
                return;
            default:
                File file5 = (File) obj2;
                try {
                    C17801VgE vgE = (C17801VgE) this.A03;
                    QuestionMediaResponseModel questionMediaResponseModel = (QuestionMediaResponseModel) this.A02;
                    Boolean bool = questionMediaResponseModel.A02;
                    String str = questionMediaResponseModel.A07;
                    ImageInfo imageInfo = questionMediaResponseModel.A00;
                    Integer num = questionMediaResponseModel.A03;
                    Integer num2 = questionMediaResponseModel.A04;
                    Integer num3 = questionMediaResponseModel.A05;
                    Integer num4 = questionMediaResponseModel.A06;
                    SpritesheetInfo spritesheetInfo = questionMediaResponseModel.A01;
                    String str2 = questionMediaResponseModel.A08;
                    String str3 = questionMediaResponseModel.A09;
                    List<VideoVersionIntf> list = questionMediaResponseModel.A0B;
                    String canonicalPath = file5.getCanonicalPath();
                    ArrayList arrayList = null;
                    if (imageInfo != null) {
                        imageInfoImpl = imageInfo.FEa();
                    } else {
                        imageInfoImpl = null;
                    }
                    if (spritesheetInfo != null) {
                        spritesheetInfoImpl = spritesheetInfo.FEc();
                    } else {
                        spritesheetInfoImpl = null;
                    }
                    if (list != null) {
                        arrayList = AnonymousClass7TG.A0r(list);
                        for (VideoVersionIntf FEd : list) {
                            arrayList.add(FEd.FEd());
                        }
                    }
                    Integer num5 = num;
                    Integer num6 = num2;
                    Boolean bool2 = bool;
                    QuestionMediaResponseModel questionMediaResponseModel2 = new QuestionMediaResponseModel(imageInfoImpl, spritesheetInfoImpl, bool2, num5, num6, num3, num4, str, str2, str3, canonicalPath, arrayList);
                    QuestionResponseModel questionResponseModel = vgE.A00;
                    0qQ.A0B(questionResponseModel, 1);
                    boolean z = questionResponseModel.A09;
                    String str4 = questionResponseModel.A07;
                    MusicQuestionResponseModel musicQuestionResponseModel = questionResponseModel.A01;
                    String str5 = questionResponseModel.A08;
                    QuestionResponseType questionResponseType = questionResponseModel.A02;
                    Boolean bool3 = questionResponseModel.A05;
                    Boolean bool4 = questionResponseModel.A06;
                    int i2 = questionResponseModel.A00;
                    User user = questionResponseModel.A04;
                    MusicQuestionResponseModel musicQuestionResponseModel2 = null;
                    1E9 r02 = new 1E9(new 1hu((UserSession) null), 6, false);
                    QuestionMediaResponseModel FGS = questionMediaResponseModel2.FGS();
                    if (musicQuestionResponseModel != null) {
                        musicQuestionResponseModel2 = musicQuestionResponseModel.FGO(r02);
                    }
                    boolean z2 = z;
                    QuestionResponseType questionResponseType2 = questionResponseType;
                    MusicQuestionResponseModel musicQuestionResponseModel3 = musicQuestionResponseModel2;
                    vgE.A00 = new QuestionResponseModel(musicQuestionResponseModel3, questionResponseType2, FGS, user, bool3, bool4, str4, str5, i2, z2);
                } catch (IOException e) {
                    0wb.A06("QuestionResponseBottomSheetViewBinder", "Unable to get canonical path: ", e);
                }
                ((C15353Ub4) this.A01).A04.A03((C17801VgE) this.A03);
                return;
        }
    }
}
