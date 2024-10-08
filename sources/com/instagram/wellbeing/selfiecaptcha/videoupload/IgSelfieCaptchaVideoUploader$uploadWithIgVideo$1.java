package com.instagram.wellbeing.selfiecaptcha.videoupload;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.1iA;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C11208SFi;
import X.C13015THx;
import X.C60340gF;
import X.C62020KVu;
import X.C62021KVv;
import X.C62846KnM;
import X.C63740L4y;
import X.C64171LRw;
import X.C64386Lb3;
import X.C66498MUb;
import X.KVt;
import X.TEG;
import X.TEH;
import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1", f = "IgSelfieCaptchaVideoUploader.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ C66498MUb A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1iA A03;
    public final /* synthetic */ C11208SFi A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(C66498MUb mUb, UserSession userSession, 1iA r4, C11208SFi sFi, Integer num, String str, String str2, AnonymousClass4D7 r9, boolean z, boolean z2) {
        super(2, r9);
        this.A03 = r4;
        this.A07 = str;
        this.A04 = sFi;
        this.A02 = userSession;
        this.A08 = z;
        this.A01 = mUb;
        this.A06 = str2;
        this.A09 = z2;
        this.A05 = num;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        1iA r3 = this.A03;
        String str = this.A07;
        C11208SFi sFi = this.A04;
        UserSession userSession = this.A02;
        boolean z = this.A08;
        return new IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(this.A01, userSession, r3, sFi, this.A05, str, this.A06, r13, z, this.A09);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.4D7, com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1] */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Handler handler;
        Runnable tHx;
        Runnable teh;
        Object obj2 = obj;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            1iA r3 = this.A03;
            A1H.put("media_type", String.valueOf(r3.A00));
            String str3 = this.A07;
            A1H.put("upload_id", str3);
            C11208SFi sFi = this.A04;
            A1H.put("challenge_id", sFi.A03);
            String str4 = sFi.A05;
            if (str4 != null) {
                A1H.put("entity_id", str4);
            }
            A1H.put("ig_user_id", this.A02.A06);
            String str5 = sFi.A04;
            if (str5 != null) {
                A1H.put("product", str5);
            }
            boolean z = this.A08;
            if (z) {
                str = AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue();
            } else {
                str = "UNKNOWN";
            }
            A1H.put("upload_medium", str);
            if (!z) {
                A1H.put("document_type", "6");
            }
            FbUploaderUtil fbUploaderUtil = FbUploaderUtil.A00;
            C66498MUb mUb = this.A01;
            if (z) {
                str2 = sFi.A07;
            } else {
                str2 = sFi.A06;
            }
            C64386Lb3 lb3 = new C64386Lb3();
            C63740L4y A022 = C64171LRw.A02(r3, this.A06, A1H);
            this.A00 = 1;
            obj2 = fbUploaderUtil.A05(mUb, lb3, A022, str2, str3, "", this, 0);
            if (obj2 == r2) {
                return r2;
            }
        }
        C62846KnM knM = (C62846KnM) obj2;
        if (knM instanceof KVt) {
            C11208SFi sFi2 = this.A04;
            handler = sFi2.A01;
            teh = new TEG(sFi2);
        } else if (knM instanceof C62020KVu) {
            C11208SFi sFi3 = this.A04;
            handler = sFi3.A01;
            teh = new TEH(sFi3);
        } else if (!(knM instanceof C62021KVv)) {
            throw AnonymousClass7TE.A1K();
        } else if (!this.A09 || this.A05 != AnonymousClass05K.A00) {
            C11208SFi sFi4 = this.A04;
            handler = sFi4.A01;
            tHx = new C13015THx(knM, sFi4);
            handler.post(tHx);
            return C60340gF.A00;
        } else {
            C11208SFi.A00(this.A02, this.A04, AnonymousClass05K.A01);
            return C60340gF.A00;
        }
        tHx = teh;
        handler.post(tHx);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
