package X;

import android.graphics.Rect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Llj  reason: case insensitive filesystem */
public final class C65006Llj implements MXQ {
    public FilterChain A00;
    public final C364848m7 A01;
    public final float A02;
    public final UserSession A03;
    public final AnonymousClass80G A04;
    public final C3499682q A05;
    public final AnonymousClass8KS A06;
    public final boolean A07;

    public C65006Llj(UserSession userSession, AnonymousClass80G r10, C3499582p r11, C364848m7 r12) {
        float f;
        this.A03 = userSession;
        this.A01 = r12;
        this.A04 = r10;
        AnonymousClass8KS r1 = new AnonymousClass8KS(r10);
        r1.A00 = C365468nA.FIT;
        boolean z = true;
        r1.A01 = true;
        this.A06 = r1;
        C3499682q A002 = r11.A00();
        this.A05 = A002;
        AnonymousClass514 ANP = A002.ANP();
        if (ANP == AnonymousClass514.ORIGINAL) {
            CreationSession creationSession = ((JWE) A002).A01;
            if (creationSession.A00() == 0) {
                f = 1.0f;
            } else {
                int A012 = creationSession.A01();
                float A003 = (float) creationSession.A00();
                float f2 = A003;
                float f3 = (float) A012;
                if (A002.ATT() % 180 == 0) {
                    A003 = f3;
                    f3 = f2;
                }
                f = C63471Kxa.A00(userSession, (Float) null, A003 / f3);
            }
        } else if (A002.COf()) {
            f = A002.AAx();
        } else {
            f = ANP.A00;
        }
        this.A02 = f;
        if (!A002.COf()) {
            z = A002.ANP().A03;
        } else if (A002.ATT() % 180 == 0 || !A002.ANP().A03) {
            z = false;
        }
        this.A07 = z;
        if (r12.CUZ()) {
            C64931LkW lkW = new C64931LkW(this);
            r10.A09 = lkW;
            lkW.DIo(r10.A01);
        }
        if (r10.A0B()) {
            CropInfo Asr = r12.Asr();
            if (!A002.COf() && Asr != null) {
                Rect rect = Asr.A02;
                f = ((float) rect.width()) / ((float) rect.height());
            }
            r10.A07(f);
        }
    }

    public final void AOu() {
        this.A01.AOu();
    }

    public final void APz(FilterGroupModel filterGroupModel) {
        FilterChain filterChain;
        this.A01.EoR(this.A04.A05(), this.A06, C395019z4.A00(filterGroupModel, "FeedOneCameraImageRenderControllerManager"));
        if (filterGroupModel != null) {
            filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
        } else {
            filterChain = null;
        }
        this.A00 = filterChain;
        EEp();
    }

    public final void CMq(int i, int i2) {
        int i3 = i;
        if (this.A04.A0B()) {
            this.A01.Ef6(i, i2);
            return;
        }
        C3499682q r2 = this.A05;
        if (r2.ANP() == AnonymousClass514.SQUARE) {
            Ef6(i, i);
            return;
        }
        int ATT = r2.ATT();
        CreationSession creationSession = ((JWE) r2).A01;
        AnonymousClass34S A09 = JW0.A09(this.A02, creationSession.A01(), creationSession.A00(), ATT, i3, this.A07, false);
        Object obj = A09.A00;
        0qQ.A06(obj);
        int A0M = AnonymousClass7TE.A0M(obj);
        Object obj2 = A09.A01;
        0qQ.A06(obj2);
        Ef6(A0M, AnonymousClass7TE.A0M(obj2));
    }

    public final void EEp() {
        FilterGroupModel filterGroupModel;
        C364848m7 r1 = this.A01;
        FilterChain filterChain = this.A00;
        if (filterChain == null) {
            PhotoSession A022 = JWE.A02(this.A05);
            if (A022 == null || (filterGroupModel = A022.A07) == null) {
                filterChain = null;
            } else {
                filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            }
        }
        r1.EWo(filterChain);
        r1.EEp();
    }

    public final void ETK(CropInfo cropInfo) {
        this.A01.ETK(cropInfo);
    }

    public final void Ef6(int i, int i2) {
        AnonymousClass80G r2 = this.A04;
        if (r2.A0B()) {
            r2.A07(((float) i) / ((float) i2));
        } else {
            this.A01.Ef6(i, i2);
        }
    }

    public final void Ekd() {
        this.A01.Ekd();
    }

    public final void EoQ(FilterGroupModel filterGroupModel) {
        this.A01.EoR(this.A04.A05(), this.A06, C395019z4.A00(filterGroupModel, "FeedOneCameraImageRenderControllerManager"));
    }
}
