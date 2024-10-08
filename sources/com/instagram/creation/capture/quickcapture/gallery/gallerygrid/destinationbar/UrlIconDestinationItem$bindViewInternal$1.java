package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar;

import X.0eS;
import X.0sP;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass1HX;
import X.AnonymousClass4D7;
import X.C339807kC;
import X.C387729mg;
import X.C59819JZr;
import X.C59985Jcu;
import X.C60340gF;
import X.MHJ;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar.UrlIconDestinationItem$bindViewInternal$1", f = "UrlIconDestinationItem.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class UrlIconDestinationItem$bindViewInternal$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C339807kC A03;
    public final /* synthetic */ C387729mg A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UrlIconDestinationItem$bindViewInternal$1(UserSession userSession, C339807kC r3, C387729mg r4, AnonymousClass4D7 r5, float f) {
        super(1, r5);
        this.A04 = r4;
        this.A02 = userSession;
        this.A01 = f;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar.UrlIconDestinationItem$bindViewInternal$1] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        C387729mg r3 = this.A04;
        return new UrlIconDestinationItem$bindViewInternal$1(this.A02, this.A03, r3, r7, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((UrlIconDestinationItem$bindViewInternal$1) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4D7, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar.UrlIconDestinationItem$bindViewInternal$1] */
    public final Object invokeSuspend(Object obj) {
        C59985Jcu jcu;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C387729mg r4 = this.A04;
            UserSession userSession = this.A02;
            this.A00 = 1;
            obj = 19E.A00(this, new MHJ((Object) r4, (Object) userSession, (AnonymousClass4D7) null, 0, 42));
            if (obj == r2) {
                return r2;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            jcu = new C59985Jcu(bitmap, (Matrix) null, this.A01, 15);
        } else {
            jcu = null;
        }
        return 1Eo.A04(19B.A00, new C59819JZr(jcu, this.A03, this.A04, (AnonymousClass4D7) null, 33), AnonymousClass1HX.A00());
    }
}
