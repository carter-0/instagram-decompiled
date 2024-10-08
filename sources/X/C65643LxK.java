package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LxK  reason: case insensitive filesystem */
public final class C65643LxK implements C66461MSp {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C368368sV A01;
    public final /* synthetic */ C66461MSp A02;
    public final /* synthetic */ LEO A03;

    public C65643LxK(UserSession userSession, C368368sV r2, C66461MSp mSp, LEO leo) {
        this.A02 = mSp;
        this.A00 = userSession;
        this.A03 = leo;
        this.A01 = r2;
    }

    public final void afterSelection(boolean z) {
        String str;
        C66461MSp mSp = this.A02;
        if (mSp != null) {
            mSp.afterSelection(z);
        }
        if (!z) {
            UserSession userSession = this.A00;
            boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), "NoticeSnoozeUtil");
            LEO leo = this.A03;
            AnonymousClass818 r6 = leo.A0D;
            AnonymousClass819 r7 = AnonymousClass819.BOTTOMSHEET_CROSSPOSTING_UPSELL_SNOOZE;
            AnonymousClass81A A0O = JTO.A0O();
            2DQ optionalEnumField = this.A01.getOptionalEnumField(2, "variant", 2DQ.A0Z);
            if (optionalEnumField != null) {
                str = optionalEnumField.name();
            } else {
                str = null;
            }
            A0O.A06("pre_snooze_variant", str);
            A0O.A0A(AnonymousClass7TE.A0u());
            A0O.A09(Boolean.valueOf(A1Z));
            A0O.A06("waterfall_id", leo.A0A);
            A0O.A06("ig_media_id", leo.A08);
            new AnonymousClass81D(r6, r7, A0O, userSession, true).A02(leo.A0C, (C20986X8c) null);
        }
    }
}
