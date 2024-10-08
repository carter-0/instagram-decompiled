package X;

import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Vy  reason: invalid class name and case insensitive filesystem */
public final class C242793Vy implements C226952iF {
    public final AnonymousClass1OJ A00;
    public final C226952iF A01;
    public final UserSession A02;

    public C242793Vy(AnonymousClass1OJ r2, C226952iF r3, UserSession userSession) {
        0qQ.A0B(userSession, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = userSession;
    }

    public final int BTB() {
        return 0;
    }

    public final boolean CZh() {
        return true;
    }

    public final boolean Cak() {
        return false;
    }

    public final boolean Cal() {
        return true;
    }

    public final void AGE() {
        this.A01.AGE();
    }

    public final C226952iF AI1() {
        return new C242793Vy(this.A00, this.A01.AI1(), this.A02);
    }

    public final boolean ARK() {
        return 182.A06(0Tu.A05, this.A02, 36311272723513827L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000b: MOVE  (r2v1 com.instagram.common.typedurl.ImageUrlBase) = (r2v0 com.instagram.common.typedurl.ImageUrlBase)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.lang.String AjE() {
        /*
            r3 = this;
            X.2iF r0 = r3.A01
            com.instagram.common.typedurl.ImageUrl r2 = r0.BGK()
            boolean r1 = r2 instanceof com.instagram.common.typedurl.ImageUrlBase
            r0 = 0
            if (r1 == 0) goto L_0x0017
            com.instagram.common.typedurl.ImageUrlBase r2 = (com.instagram.common.typedurl.ImageUrlBase) r2
            if (r2 == 0) goto L_0x0017
            X.2hT r0 = r2.AmO()
            java.lang.String r0 = r0.name()
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242793Vy.AjE():java.lang.String");
    }

    public final String AjI() {
        return this.A01.AjI();
    }

    public final AnonymousClass1MK AjZ() {
        return this.A01.AjZ();
    }

    public final C226572hI AvU() {
        return this.A01.AvU();
    }

    public final float Avb() {
        return this.A01.Avb();
    }

    public final ImageUrl BGK() {
        ImageUrl BGK = this.A01.BGK();
        0qQ.A07(BGK);
        return BGK;
    }

    public final int BPJ() {
        return this.A01.BPJ();
    }

    public final ImageUrl BRH() {
        ImageUrl BRH = this.A01.BRH();
        0qQ.A07(BRH);
        return BRH;
    }

    public final int BTJ() {
        return this.A01.BTJ();
    }

    public final AnonymousClass2hC BTK() {
        return this.A01.BTK();
    }

    public final String BTL() {
        return this.A01.BTL();
    }

    public final String BZG() {
        return this.A01.BZG();
    }

    public final AnonymousClass2hE BhZ() {
        return this.A01.BhZ();
    }

    public final C247833gz Bha() {
        return this.A01.Bha();
    }

    public final int Bpa() {
        PPRLoggingData BO8;
        Object value = this.A00.A02.getValue();
        0qQ.A07(value);
        if (!((Boolean) value).booleanValue() || (BO8 = this.A01.BRH().BO8()) == null || !BO8.A05) {
            return this.A01.Bpa();
        }
        return -1;
    }

    public final boolean Bwm() {
        return this.A01.Bwm();
    }

    public final String Bxi() {
        String Bxi = this.A01.Bxi();
        0qQ.A07(Bxi);
        return Bxi;
    }

    public final Object C3s() {
        return this.A01.C3s();
    }

    public final boolean CPK() {
        return this.A01.CPK();
    }

    public final boolean CTf() {
        return this.A01.CTf();
    }

    public final boolean CWj() {
        return this.A01.CWj();
    }

    public final boolean Ce1() {
        return this.A01.Ce1();
    }

    public final boolean CeW() {
        return this.A01.CeW();
    }

    public final String EHW() {
        return this.A01.EHW();
    }

    public final boolean Eru() {
        return this.A01.Eru();
    }

    public final boolean Es0() {
        return this.A01.Es0();
    }

    public final boolean Ess() {
        return this.A01.Ess();
    }

    public final Integer FMf() {
        return this.A01.FMf();
    }

    public final void cancel() {
        this.A01.cancel();
    }

    public final 0lg getSession() {
        return this.A01.getSession();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CacheRequestImpl: Source = ");
        sb.append(Bxi());
        sb.append(AnonymousClass000.A00(849));
        sb.append(BGK());
        return sb.toString();
    }

    public final Boolean COJ() {
        return BGK().BIy();
    }

    public final void E5t() {
        1NK.A00().A0N(this);
    }
}
