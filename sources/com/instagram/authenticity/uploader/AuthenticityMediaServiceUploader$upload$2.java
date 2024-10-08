package com.instagram.authenticity.uploader;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.1iA;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C11002S4w;
import X.C12745T5f;
import X.C60340gF;
import X.C62020KVu;
import X.C62021KVv;
import X.C62846KnM;
import X.C63740L4y;
import X.C64171LRw;
import X.C64386Lb3;
import X.C66498MUb;
import X.KVt;
import X.TDU;
import X.THP;
import X.TKL;
import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2", f = "AuthenticityMediaServiceUploader.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class AuthenticityMediaServiceUploader$upload$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C66498MUb A02;
    public final /* synthetic */ C12745T5f A03;
    public final /* synthetic */ C11002S4w A04;
    public final /* synthetic */ 1iA A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticityMediaServiceUploader$upload$2(C66498MUb mUb, C12745T5f t5f, C11002S4w s4w, 1iA r5, File file, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r12, int i) {
        super(2, r12);
        this.A05 = r5;
        this.A0A = str;
        this.A03 = t5f;
        this.A09 = str2;
        this.A0B = str3;
        this.A02 = mUb;
        this.A06 = file;
        this.A07 = str4;
        this.A04 = s4w;
        this.A08 = str5;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        1iA r4 = this.A05;
        String str = this.A0A;
        C12745T5f t5f = this.A03;
        String str2 = this.A09;
        String str3 = this.A0B;
        return new AuthenticityMediaServiceUploader$upload$2(this.A02, t5f, this.A04, r4, this.A06, str, str2, str3, this.A07, this.A08, r15, this.A01);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        Runnable tkl;
        Runnable thp;
        Object obj2 = obj;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            1iA r4 = this.A05;
            A1H.put("media_type", String.valueOf(r4.A00));
            String str = this.A0A;
            A1H.put("upload_id", str);
            A1H.put("ig_user_id", this.A03.A02.A06);
            A1H.put("product", this.A09);
            String str2 = this.A0B;
            A1H.put("upload_medium", str2);
            if (!0qQ.A0K(str2, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                A1H.put("document_type", "6");
            }
            FbUploaderUtil fbUploaderUtil = FbUploaderUtil.A00;
            C66498MUb mUb = this.A02;
            String canonicalPath = this.A06.getCanonicalPath();
            C64386Lb3 lb3 = new C64386Lb3();
            C63740L4y A022 = C64171LRw.A02(r4, this.A07, A1H);
            this.A00 = 1;
            obj2 = fbUploaderUtil.A05(mUb, lb3, A022, canonicalPath, str, "", this, 0);
            if (obj2 == r2) {
                return r2;
            }
        }
        C62846KnM knM = (C62846KnM) obj2;
        if (knM instanceof KVt) {
            handler = this.A03.A01;
            tkl = new TDU(this.A04);
        } else if (knM instanceof C62020KVu) {
            C12745T5f t5f = this.A03;
            C11002S4w s4w = this.A04;
            handler = t5f.A01;
            thp = new THP(t5f, s4w);
            handler.post(thp);
            return C60340gF.A00;
        } else if (knM instanceof C62021KVv) {
            C12745T5f t5f2 = this.A03;
            handler = t5f2.A01;
            tkl = new TKL(t5f2, this.A04, knM, this.A08, this.A01);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        thp = tkl;
        handler.post(thp);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AuthenticityMediaServiceUploader$upload$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
